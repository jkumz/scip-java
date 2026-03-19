  package minimized;
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.List;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^ import semanticdb maven jdk 11 java/util/List#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                    ⌃ enclosing_range_end semanticdb maven . . java/util/
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Map#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.Map;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^ import semanticdb maven jdk 11 java/util/Map#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                   ⌃ enclosing_range_end semanticdb maven . . java/util/
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Map#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/ArrayList#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.ArrayList;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^^^^ import semanticdb maven jdk 11 java/util/ArrayList#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                         ⌃ enclosing_range_end semanticdb maven . . java/util/
//                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/ArrayList#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/HashMap#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.HashMap;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^^ import semanticdb maven jdk 11 java/util/HashMap#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                       ⌃ enclosing_range_end semanticdb maven . . java/util/
//                        ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/HashMap#
  
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
//⌄ enclosing_range_start semanticdb maven . . minimized/ExternalSymbols#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/io/Serializable#
//                                        ⌄ enclosing_range_start semanticdb maven . . java/
//                                        ⌄ enclosing_range_start semanticdb maven . . java/io/
  public class ExternalSymbols implements java.io.Serializable {
//             ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/ExternalSymbols#
//                             display_name ExternalSymbols
//                             signature_documentation java public class ExternalSymbols
//                             kind Class
//                             documentation  Test that external symbols (JDK stdlib) are emitted as occurrences\n with correct, fully-qualified symbol strings.\n\n This validates that cross-repository symbol linking works: when this\n index is ingested into a knowledge graph alongside the JDK index,\n the symbol strings will match and connect automatically.\n\n Expected external symbol occurrences:\n - java/util/List# (import + type references)\n - java/util/Map# (import + type references)\n - java/util/ArrayList# (import + constructor call)\n - java/util/HashMap# (import + constructor call)\n - java/lang/String# (type references, no explicit import)\n - java/lang/Integer# (type reference)\n - java/lang/Object#toString(). (method call)\n - java/io/Serializable# (implements reference)\n
//                             relationship is_implementation semanticdb maven jdk 11 java/io/Serializable#
//             ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/ExternalSymbols#`<init>`().
//                             display_name <init>
//                             signature_documentation java public ExternalSymbols()
//                             kind Constructor
//                                        ^^^^ reference read_access semanticdb maven . . java/
//                                             ^^ reference read_access semanticdb maven . . java/io/
//                                                ^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/io/Serializable#
//                                              ⌃ enclosing_range_end semanticdb maven . . java/
//                                                           ⌃ enclosing_range_end semanticdb maven . . java/io/
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/ExternalSymbols#list.
    List<String> list;
//  ^^^^ reference read_access semanticdb maven jdk 11 java/util/List#
//       ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//               ^^^^ definition semanticdb maven . . minimized/ExternalSymbols#list.
//                    display_name list
//                    signature_documentation java List<String> list
//                    kind Field
//                    relationship is_type_definition semanticdb maven jdk 11 java/util/List#
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                   ⌃ enclosing_range_end semanticdb maven . . minimized/ExternalSymbols#list.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Map#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Integer#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/ExternalSymbols#map.
    Map<String, Integer> map;
//  ^^^ reference read_access semanticdb maven jdk 11 java/util/Map#
//      ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//              ^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Integer#
//                       ^^^ definition semanticdb maven . . minimized/ExternalSymbols#map.
//                           display_name map
//                           signature_documentation java Map<String, Integer> map
//                           kind Field
//                           relationship is_type_definition semanticdb maven jdk 11 java/util/Map#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Map#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Integer#
//                          ⌃ enclosing_range_end semanticdb maven . . minimized/ExternalSymbols#map.
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/ExternalSymbols#createList().
//         ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//         ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
    public List<String> createList() {
//         ^^^^ reference read_access semanticdb maven jdk 11 java/util/List#
//              ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                      ^^^^^^^^^^ definition semanticdb maven . . minimized/ExternalSymbols#createList().
//                                 display_name createList
//                                 signature_documentation java public List<String> createList()
//                                 kind Method
//                                 relationship is_type_definition semanticdb maven jdk 11 java/util/List#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/ArrayList#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start local 0
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/ArrayList#`<init>`(+1).
      ArrayList<String> result = new ArrayList<>();
//    ^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/ArrayList#
//              ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                      ^^^^^^ definition local 0
//                             display_name result
//                             signature_documentation java ArrayList<String> result
//                             enclosing_symbol semanticdb maven . . minimized/ExternalSymbols#createList().
//                             kind Variable
//                             relationship is_type_definition semanticdb maven jdk 11 java/util/ArrayList#
//                                   ^^^^^^^^^ reference semanticdb maven jdk 11 java/util/ArrayList#`<init>`(+1).
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/ArrayList#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                                ⌃ enclosing_range_end local 0
//                                                ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/ArrayList#`<init>`(+1).
//    ⌄ enclosing_range_start local 0
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/ArrayList#add().
      result.add("hello");
//    ^^^^^^ reference read_access local 0
//           ^^^ reference read_access semanticdb maven jdk 11 java/util/ArrayList#add().
//             ⌃ enclosing_range_end local 0
//                      ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/ArrayList#add().
//    ⌄ enclosing_range_start local 0
      return result;
//           ^^^^^^ reference read_access local 0
//                 ⌃ enclosing_range_end local 0
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/ExternalSymbols#createList().
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/ExternalSymbols#objectToString().
//                               ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#
//                               ⌄ enclosing_range_start local 1
    public String objectToString(Object obj) {
//         ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                ^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/ExternalSymbols#objectToString().
//                               display_name objectToString
//                               signature_documentation java public String objectToString(Object obj)
//                               kind Method
//                               relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//                               ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#
//                                      ^^^ definition local 1
//                                          display_name obj
//                                          signature_documentation java Object obj
//                                          enclosing_symbol semanticdb maven . . minimized/ExternalSymbols#objectToString().
//                                          relationship is_type_definition semanticdb maven jdk 11 java/lang/Object#
//                                        ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#
//                                        ⌃ enclosing_range_end local 1
//           ⌄ enclosing_range_start local 1
//           ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#toString().
      return obj.toString();
//           ^^^ reference read_access local 1
//               ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#toString().
//                      ⌃ enclosing_range_end local 1
//                        ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#toString().
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/ExternalSymbols#objectToString().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/ExternalSymbols#
//⌃ enclosing_range_end semanticdb maven jdk 11 java/io/Serializable#
