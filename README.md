# Java, Scala, and Kotlin indexer for [SCIP](https://github.com/sourcegraph/scip) ![](https://img.shields.io/badge/status-development-green?style=flat)

| Documentation        | Link                                                                   |
| -------------------- | ---------------------------------------------------------------------- |
| Landing page         | https://sourcegraph.github.io/scip-java                                |
| Getting started      | https://sourcegraph.github.io/scip-java/docs/getting-started.html      |
| Manual configuration | https://sourcegraph.github.io/scip-java/docs/manual-configuration.html |
| Contributing         | https://sourcegraph.github.io/scip-java/docs/contributing.html         |
| Design               | https://sourcegraph.github.io/scip-java/docs/design.html               |

## Incremental Indexing

The `index-semanticdb` command supports incremental indexing via `--changed-files` or `--changed-files-path`. When either is set, only the specified source files are included in the output `index.scip`, producing a **delta index** rather than a full index. Inverse relationships are automatically disabled for incremental runs to skip the expensive all-files scan.

### Usage

**Option 1: Inline comma-separated list**

```bash
scip-java index-semanticdb \
  --changed-files=src/main/java/com/example/Foo.java,src/main/java/com/example/Bar.java \
  --output=delta.scip \
  my/targetroot
```

**Option 2: File containing paths (newline-delimited)**

```bash
git diff --name-only HEAD~1 > changed.txt
scip-java index-semanticdb \
  --changed-files-path=changed.txt \
  --output=delta.scip \
  my/targetroot
```

Paths should be relative source paths matching the `.semanticdb` file structure under `META-INF/semanticdb/` (e.g., `src/main/java/com/example/Foo.java`).

### Intended Use

The delta `index.scip` contains only the SCIP documents for the changed files. The consumer (e.g., a knowledge graph or code intelligence backend) is responsible for upserting these documents, replacing stale entries. This is designed for CI pipelines where the build tool already handles incremental compilation — only changed files produce new `.semanticdb` files, and the indexer filters to just those.
