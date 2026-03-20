package minimized;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Test that external symbols (JDK stdlib) are emitted as occurrences
 * with correct, fully-qualified symbol strings.
 *
 * This validates that cross-repository symbol linking works: when this
 * index is ingested into a knowledge graph alongside the JDK index,
 * the symbol strings will match and connect automatically.
 *
 * Expected external symbol occurrences:
 * - java/util/List# (import + type references)
 * - java/util/Map# (import + type references)
 * - java/util/ArrayList# (import + constructor call)
 * - java/util/HashMap# (import + constructor call)
 * - java/lang/String# (type references, no explicit import)
 * - java/lang/Integer# (type reference)
 * - java/lang/Object#toString(). (method call)
 * - java/io/Serializable# (implements reference)
 */
public class ExternalSymbols implements java.io.Serializable {
  List<String> list;
  Map<String, Integer> map;

  public List<String> createList() {
    ArrayList<String> result = new ArrayList<>();
    result.add("hello");
    return result;
  }

  public String objectToString(Object obj) {
    return obj.toString();
  }
}
