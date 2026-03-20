package com.sourcegraph.scip_semanticdb;

import com.sourcegraph.Scip;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/** Configuration options to tweak the scip-semanticdb command. */
public class ScipSemanticdbOptions {

  public final List<Path> targetroots;
  public final Path output;
  public final Path sourceroot;
  public final ScipSemanticdbReporter reporter;
  public final Scip.ToolInfo toolInfo;
  public final ScipOutputFormat format;
  public final boolean parallel;
  public final List<MavenPackage> packages;
  public final boolean emitInverseRelationships;
  public final boolean allowEmptyIndex;
  public final boolean allowExportingGlobalSymbolsFromDirectoryEntries;

  /**
   * When non-null, only .semanticdb files whose source path matches this set are
   * processed. Used for incremental indexing — the output index.scip will contain
   * only the documents for these files (a delta index).
   *
   * Paths should be relative source paths matching the .semanticdb file structure,
   * e.g. "com/example/Foo.java".
   */
  public final @Nullable Set<String> allowFiles;

  public ScipSemanticdbOptions(
      List<Path> targetroots,
      Path output,
      Path sourceroot,
      ScipSemanticdbReporter reporter,
      Scip.ToolInfo toolInfo,
      ScipOutputFormat format,
      boolean parallel,
      List<MavenPackage> packages,
      boolean emitInverseRelationships,
      boolean allowEmptyIndex,
      boolean allowExportingGlobalSymbolsFromDirectoryEntries,
      @Nullable Set<String> allowFiles) {
    this.targetroots = targetroots;
    this.output = output;
    this.sourceroot = sourceroot;
    this.reporter = reporter;
    this.toolInfo = toolInfo;
    this.format = format;
    this.parallel = parallel;
    this.packages = packages;
    this.emitInverseRelationships = emitInverseRelationships;
    this.allowEmptyIndex = allowEmptyIndex;
    this.allowExportingGlobalSymbolsFromDirectoryEntries =
        allowExportingGlobalSymbolsFromDirectoryEntries;
    this.allowFiles = allowFiles;
  }
}
