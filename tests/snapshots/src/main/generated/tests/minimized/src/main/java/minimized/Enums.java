  package minimized;
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Arrays#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.Arrays;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^ import semanticdb maven jdk 11 java/util/Arrays#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                      ⌃ enclosing_range_end semanticdb maven . . java/util/
//                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Arrays#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/stream/Collectors#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/stream/
  import java.util.stream.Collectors;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^ import semanticdb maven . . java/util/stream/
//                        ^^^^^^^^^^ import semanticdb maven jdk 11 java/util/stream/Collectors#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                      ⌃ enclosing_range_end semanticdb maven . . java/util/
//                                 ⌃ enclosing_range_end semanticdb maven . . java/util/stream/
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/stream/Collectors#
  
//⌄ enclosing_range_start semanticdb maven . . minimized/Enums#
  enum Enums {
//     ^^^^^ definition semanticdb maven . . minimized/Enums#
//           display_name Enums
//           signature_documentation java enum Enums
//           kind Enum
//           relationship is_implementation semanticdb maven jdk 11 java/io/Serializable#
//           relationship is_implementation semanticdb maven jdk 11 java/lang/Comparable#
//           relationship is_implementation semanticdb maven jdk 11 java/lang/Enum#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#A.
    A("A", 420),
//  ^ definition semanticdb maven . . minimized/Enums#A.
//    display_name A("A", 420)
//    signature_documentation java Enums.A("A", 420) /* ordinal 0 */
//  ^ reference semanticdb maven . . minimized/Enums#`<init>`().
//            ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#A.
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#B.
    B("B", 1),
//  ^ definition semanticdb maven . . minimized/Enums#B.
//    display_name B("B", 1)
//    signature_documentation java Enums.B("B", 1) /* ordinal 1 */
//  ^ reference semanticdb maven . . minimized/Enums#`<init>`().
//          ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#B.
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#C.
    C("C", 5);
//  ^ definition semanticdb maven . . minimized/Enums#C.
//    display_name C("C", 5)
//    signature_documentation java Enums.C("C", 5) /* ordinal 2 */
//  ^ reference semanticdb maven . . minimized/Enums#`<init>`().
//          ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#C.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#value.
    public String value;
//         ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                ^^^^^ definition semanticdb maven . . minimized/Enums#value.
//                      display_name value
//                      signature_documentation java public String value
//                      kind Field
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                     ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#value.
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#`<init>`().
//        ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//        ⌄ enclosing_range_start local 0
//                      ⌄ enclosing_range_start local 1
    Enums(String value, int a) {
//  ^^^^^ definition semanticdb maven . . minimized/Enums#`<init>`().
//        display_name <init>
//        signature_documentation java private Enums(String value, int a)
//        kind Constructor
//        ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//               ^^^^^ definition local 0
//                     display_name value
//                     signature_documentation java String value
//                     enclosing_symbol semanticdb maven . . minimized/Enums#`<init>`().
//                          ^ definition local 1
//                            display_name a
//                            signature_documentation java int a
//                            enclosing_symbol semanticdb maven . . minimized/Enums#`<init>`().
//                   ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                   ⌃ enclosing_range_end local 0
//                          ⌃ enclosing_range_end local 1
//    ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#value.
//    ⌄ enclosing_range_start local 0
      this.value = value;
//         ^^^^^ reference write_access semanticdb maven . . minimized/Enums#value.
//                 ^^^^^ reference read_access local 0
//                     ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#value.
//                     ⌃ enclosing_range_end local 0
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#`<init>`().
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#app().
    public static String app() {
//                ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                       ^^^ definition semanticdb maven . . minimized/Enums#app().
//                           display_name app
//                           signature_documentation java public static String app()
//                           kind StaticMethod
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start local 2
//                 ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Arrays#
//                 ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Arrays#stream().
//                 ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/stream/Stream#map().
//                 ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/stream/Stream#map().
//                 ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#valueOf().
//                 ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/stream/Stream#collect(+1).
//                 ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#toString().
//                               ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#values().
//                                             ⌄ enclosing_range_start local 3
//                                             ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#value.
//                                                  ⌄ enclosing_range_start local 3
//                                                               ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#
//                                                                                       ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/stream/Collectors#
//                                                                                       ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/stream/Collectors#toList().
      String all = Arrays.stream(values()).map(e -> e.value).map(Enums::valueOf).collect(Collectors.toList()).toString();
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//           ^^^ definition local 2
//               display_name all
//               signature_documentation java String all
//               enclosing_symbol semanticdb maven . . minimized/Enums#app().
//               kind Variable
//                 ^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Arrays#
//                        ^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Arrays#stream().
//                               ^^^^^^ reference read_access semanticdb maven . . minimized/Enums#values().
//                                         ^^^ reference read_access semanticdb maven jdk 11 java/util/stream/Stream#map().
//                                             ^ definition local 3
//                                               display_name e
//                                               signature_documentation java Enums e
//                                               enclosing_symbol semanticdb maven . . minimized/Enums#app().
//                                                  ^ reference read_access local 3
//                                                    ^^^^^ reference read_access semanticdb maven . . minimized/Enums#value.
//                                                           ^^^ reference read_access semanticdb maven jdk 11 java/util/stream/Stream#map().
//                                                               ^^^^^ reference read_access semanticdb maven . . minimized/Enums#
//                                                                      ^^^^^^^ reference semanticdb maven . . minimized/Enums#valueOf().
//                                                                               ^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/stream/Stream#collect(+1).
//                                                                                       ^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/stream/Collectors#
//                                                                                                  ^^^^^^ reference read_access semanticdb maven jdk 11 java/util/stream/Collectors#toList().
//                                                                                                            ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#toString().
//                             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Arrays#
//                                      ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#values().
//                                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Arrays#stream().
//                                             ⌃ enclosing_range_end local 3
//                                                        ⌃ enclosing_range_end local 3
//                                                        ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#value.
//                                                         ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/stream/Stream#map().
//                                                                            ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#
//                                                                             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/stream/Stream#map().
//                                                                             ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#valueOf().
//                                                                                                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/stream/Collectors#
//                                                                                                         ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/stream/Collectors#toList().
//                                                                                                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/stream/Stream#collect(+1).
//                                                                                                                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#toString().
//                                                                                                                      ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                                                                                                      ⌃ enclosing_range_end local 2
//           ⌄ enclosing_range_start local 2
//           ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#value.
//           ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#value.
//           ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#value.
//                 ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#A.
//                           ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#B.
//                                     ⌄ enclosing_range_start semanticdb maven . . minimized/Enums#C.
      return all + A.value + B.value + C.value;
//           ^^^ reference read_access local 2
//                 ^ reference read_access semanticdb maven . . minimized/Enums#A.
//                   ^^^^^ reference read_access semanticdb maven . . minimized/Enums#value.
//                           ^ reference read_access semanticdb maven . . minimized/Enums#B.
//                             ^^^^^ reference read_access semanticdb maven . . minimized/Enums#value.
//                                     ^ reference read_access semanticdb maven . . minimized/Enums#C.
//                                       ^^^^^ reference read_access semanticdb maven . . minimized/Enums#value.
//                       ⌃ enclosing_range_end local 2
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#A.
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#value.
//                                 ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#B.
//                                 ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#value.
//                                           ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#C.
//                                           ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#value.
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/Enums#app().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/Enums#
