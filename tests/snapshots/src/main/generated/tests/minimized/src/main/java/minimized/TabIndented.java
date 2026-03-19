  package minimized;
  
//⌄ enclosing_range_start semanticdb maven . . minimized/TabIndented#
  public class TabIndented {
//             ^^^^^^^^^^^ definition semanticdb maven . . minimized/TabIndented#
//                         display_name TabIndented
//                         signature_documentation java public class TabIndented
//                         kind Class
//             ^^^^^^^^^^^ definition semanticdb maven . . minimized/TabIndented#`<init>`().
//                         display_name <init>
//                         signature_documentation java public TabIndented()
//                         kind Constructor
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TabIndented#app().
    public void app() {
//              ^^^ definition semanticdb maven . . minimized/TabIndented#app().
//                  display_name app
//                  signature_documentation java public void app()
//                  kind Method
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#
//    ⌄ enclosing_range_start local 0
//                            ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#
      Object o = new Object() {
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#
//           ^ definition local 0
//             display_name o
//             signature_documentation java Object o
//             enclosing_symbol semanticdb maven . . minimized/TabIndented#app().
//             kind Variable
//             relationship is_type_definition semanticdb maven jdk 11 java/lang/Object#
//                   ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#
//      ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Override#
//      ⌄ enclosing_range_start local 2
        @Override
//       ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Override#
//              ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Override#
//                            ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#
//                            ⌄ enclosing_range_start local 3
        public boolean equals(Object other) {
//                     ^^^^^^ definition local 2
//                            display_name equals
//                            signature_documentation java @Override\npublic boolean equals(Object other)
//                            enclosing_symbol local 1
//                            kind Method
//                            relationship is_reference is_implementation semanticdb maven jdk 11 java/lang/Object#equals().
//                            ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#
//                                   ^^^^^ definition local 3
//                                         display_name other
//                                         signature_documentation java Object other
//                                         enclosing_symbol local 2
//                                         relationship is_type_definition semanticdb maven jdk 11 java/lang/Object#
//                                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#
//                                       ⌃ enclosing_range_end local 3
          return false;
        }
//      ⌃ enclosing_range_end local 2
  
//      ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Override#
//      ⌄ enclosing_range_start local 4
        @Override
//       ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Override#
//              ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Override#
        public int hashCode() {
//                 ^^^^^^^^ definition local 4
//                          display_name hashCode
//                          signature_documentation java @Override\npublic int hashCode()
//                          enclosing_symbol local 1
//                          kind Method
//                          relationship is_reference is_implementation semanticdb maven jdk 11 java/lang/Object#hashCode().
//               ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#
//               ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#identityHashCode().
          return System.identityHashCode(this);
//               ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/System#
//                      ^^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/System#identityHashCode().
//                                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#
//                                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#identityHashCode().
        }
//      ⌃ enclosing_range_end local 4
  
//      ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Override#
//      ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//      ⌄ enclosing_range_start local 5
        @Override
//       ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Override#
//              ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Override#
        public String toString() {
//             ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                    ^^^^^^^^ definition local 5
//                             display_name toString
//                             signature_documentation java @Override\npublic String toString()
//                             enclosing_symbol local 1
//                             kind Method
//                             relationship is_reference is_implementation semanticdb maven jdk 11 java/lang/Object#toString().
//                             relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
          return "";
        }
//      ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//      ⌃ enclosing_range_end local 5
      };
//    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#
//     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#
//     ⌃ enclosing_range_end local 0
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TabIndented#app().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/TabIndented#
