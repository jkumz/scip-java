  package minimized;
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
  import java.util.Random;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^ import semanticdb maven jdk 11 java/util/Random#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                      ⌃ enclosing_range_end semanticdb maven . . java/util/
//                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#
  
//⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#
  public class Primitives {
//             ^^^^^^^^^^ definition semanticdb maven . . minimized/Primitives#
//                        display_name Primitives
//                        signature_documentation java public class Primitives
//                        kind Class
//             ^^^^^^^^^^ definition semanticdb maven . . minimized/Primitives#`<init>`().
//                        display_name <init>
//                        signature_documentation java public Primitives()
//                        kind Constructor
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#app().
    public static String app() {
//                ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                       ^^^ definition semanticdb maven . . minimized/Primitives#app().
//                           display_name app
//                           signature_documentation java public static String app()
//                           kind StaticMethod
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#
//    ⌄ enclosing_range_start local 0
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#`<init>`().
      Random random = new Random();
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#
//           ^^^^^^ definition local 0
//                  display_name random
//                  signature_documentation java Random random
//                  enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//                  kind Variable
//                        ^^^^^^ reference semanticdb maven jdk 11 java/util/Random#`<init>`().
//                                ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#
//                                ⌃ enclosing_range_end local 0
//                                ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#`<init>`().
//    ⌄ enclosing_range_start local 1
//                    ⌄ enclosing_range_start local 0
//                    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextInt().
      byte a = (byte) random.nextInt();
//         ^ definition local 1
//           display_name a
//           signature_documentation java byte a
//           enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//           kind Variable
//                    ^^^^^^ reference read_access local 0
//                           ^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextInt().
//                                 ⌃ enclosing_range_end local 0
//                                   ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextInt().
//                                    ⌃ enclosing_range_end local 1
//    ⌄ enclosing_range_start local 2
//                      ⌄ enclosing_range_start local 0
//                      ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextInt().
      short b = (short) random.nextInt();
//          ^ definition local 2
//            display_name b
//            signature_documentation java short b
//            enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//            kind Variable
//                      ^^^^^^ reference read_access local 0
//                             ^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextInt().
//                                   ⌃ enclosing_range_end local 0
//                                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextInt().
//                                      ⌃ enclosing_range_end local 2
//    ⌄ enclosing_range_start local 3
//            ⌄ enclosing_range_start local 0
//            ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextInt().
      int c = random.nextInt();
//        ^ definition local 3
//          display_name c
//          signature_documentation java int c
//          enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//          kind Variable
//            ^^^^^^ reference read_access local 0
//                   ^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextInt().
//                         ⌃ enclosing_range_end local 0
//                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextInt().
//                            ⌃ enclosing_range_end local 3
//    ⌄ enclosing_range_start local 4
//             ⌄ enclosing_range_start local 0
//             ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextLong().
      long d = random.nextLong();
//         ^ definition local 4
//           display_name d
//           signature_documentation java long d
//           enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//           kind Variable
//             ^^^^^^ reference read_access local 0
//                    ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextLong().
//                           ⌃ enclosing_range_end local 0
//                             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextLong().
//                              ⌃ enclosing_range_end local 4
//    ⌄ enclosing_range_start local 5
//                    ⌄ enclosing_range_start local 0
//                    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextInt().
      char e = (char) random.nextInt();
//         ^ definition local 5
//           display_name e
//           signature_documentation java char e
//           enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//           kind Variable
//                    ^^^^^^ reference read_access local 0
//                           ^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextInt().
//                                 ⌃ enclosing_range_end local 0
//                                   ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextInt().
//                                    ⌃ enclosing_range_end local 5
//    ⌄ enclosing_range_start local 6
//                      ⌄ enclosing_range_start local 0
//                      ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextDouble().
      float f = (float) random.nextDouble();
//          ^ definition local 6
//            display_name f
//            signature_documentation java float f
//            enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//            kind Variable
//                      ^^^^^^ reference read_access local 0
//                             ^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextDouble().
//                                      ⌃ enclosing_range_end local 0
//                                        ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextDouble().
//                                         ⌃ enclosing_range_end local 6
//    ⌄ enclosing_range_start local 7
//                        ⌄ enclosing_range_start local 0
//                        ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextDouble().
      double g = (double) random.nextDouble();
//           ^ definition local 7
//             display_name g
//             signature_documentation java double g
//             enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//             kind Variable
//                        ^^^^^^ reference read_access local 0
//                               ^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextDouble().
//                                        ⌃ enclosing_range_end local 0
//                                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextDouble().
//                                           ⌃ enclosing_range_end local 7
//    ⌄ enclosing_range_start local 8
//                ⌄ enclosing_range_start local 0
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Random#nextBoolean().
      boolean h = random.nextBoolean();
//            ^ definition local 8
//              display_name h
//              signature_documentation java boolean h
//              enclosing_symbol semanticdb maven . . minimized/Primitives#app().
//              kind Variable
//                ^^^^^^ reference read_access local 0
//                       ^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/Random#nextBoolean().
//                                 ⌃ enclosing_range_end local 0
//                                   ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Random#nextBoolean().
//                                    ⌃ enclosing_range_end local 8
//           ⌄ enclosing_range_start local 1
//           ⌄ enclosing_range_start local 2
//           ⌄ enclosing_range_start local 3
//           ⌄ enclosing_range_start local 4
//           ⌄ enclosing_range_start local 5
//           ⌄ enclosing_range_start local 6
//           ⌄ enclosing_range_start local 7
//           ⌄ enclosing_range_start local 8
      return "" + a + b + c + d + e + f + g + h;
//                ^ reference read_access local 1
//                    ^ reference read_access local 2
//                        ^ reference read_access local 3
//                            ^ reference read_access local 4
//                                ^ reference read_access local 5
//                                    ^ reference read_access local 6
//                                        ^ reference read_access local 7
//                                            ^ reference read_access local 8
//                ⌃ enclosing_range_end local 1
//                    ⌃ enclosing_range_end local 2
//                        ⌃ enclosing_range_end local 3
//                            ⌃ enclosing_range_end local 4
//                                ⌃ enclosing_range_end local 5
//                                    ⌃ enclosing_range_end local 6
//                                        ⌃ enclosing_range_end local 7
//                                            ⌃ enclosing_range_end local 8
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#app().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/Primitives#test().
    public static void test() {}
//                     ^^^^ definition semanticdb maven . . minimized/Primitives#test().
//                          display_name test
//                          signature_documentation java public static void test()
//                          kind StaticMethod
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#test().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/Primitives#
