  package minimized;
  
//⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#
//⌄ enclosing_range_start semanticdb maven . . minimized/AbstractClasses#
//⌄ enclosing_range_start semanticdb maven . . minimized/Interfaces#
  public class SubClasses extends AbstractClasses implements Interfaces {
//             ^^^^^^^^^^ definition semanticdb maven . . minimized/SubClasses#
//                        display_name SubClasses
//                        signature_documentation java public class SubClasses
//                        kind Class
//                        relationship is_implementation semanticdb maven . . minimized/AbstractClasses#
//                        relationship is_implementation semanticdb maven . . minimized/Interfaces#
//             ^^^^^^^^^^ definition semanticdb maven . . minimized/SubClasses#`<init>`().
//                        display_name <init>
//                        signature_documentation java public SubClasses()
//                        kind Constructor
//                                ^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AbstractClasses#
//                                                           ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/Interfaces#
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Override#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#abstractImplementation().
    @Override
//   ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Override#
//          ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Override#
    public String abstractImplementation() {
//         ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                ^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/SubClasses#abstractImplementation().
//                                       display_name abstractImplementation
//                                       signature_documentation java @Override\npublic String abstractImplementation()
//                                       kind Method
//                                       relationship is_reference is_implementation semanticdb maven . . minimized/AbstractClasses#abstractImplementation().
//                                       relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
      return "abstract";
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#abstractImplementation().
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Override#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#abstractInterfaceMethod().
    @Override
//   ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Override#
//          ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Override#
    public String abstractInterfaceMethod() {
//         ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                ^^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/SubClasses#abstractInterfaceMethod().
//                                        display_name abstractInterfaceMethod
//                                        signature_documentation java @Override\npublic String abstractInterfaceMethod()
//                                        kind Method
//                                        relationship is_reference is_implementation semanticdb maven . . minimized/Interfaces#abstractInterfaceMethod().
//                                        relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
      return "abstractInterface";
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#abstractInterfaceMethod().
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#app().
    public static String app() {
//                ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                       ^^^ definition semanticdb maven . . minimized/SubClasses#app().
//                           display_name app
//                           signature_documentation java public static String app()
//                           kind StaticMethod
//                           relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#
//    ⌄ enclosing_range_start local 0
//    ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#`<init>`().
      SubClasses s = new SubClasses();
//    ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/SubClasses#
//               ^ definition local 0
//                 display_name s
//                 signature_documentation java SubClasses s
//                 enclosing_symbol semanticdb maven . . minimized/SubClasses#app().
//                 kind Variable
//                 relationship is_type_definition semanticdb maven . . minimized/SubClasses#
//                       ^^^^^^^^^^ reference semanticdb maven . . minimized/SubClasses#`<init>`().
//                                   ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#
//                                   ⌃ enclosing_range_end local 0
//                                   ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#`<init>`().
//           ⌄ enclosing_range_start local 0
//           ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#abstractImplementation().
      return s.abstractImplementation()
//           ^ reference read_access local 0
//             ^^^^^^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/SubClasses#abstractImplementation().
//                                  ⌃ enclosing_range_end local 0
//                                    ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#abstractImplementation().
//          ⌄ enclosing_range_start local 0
//          ⌄ enclosing_range_start semanticdb maven . . minimized/AbstractClasses#defaultImplementation().
          + s.defaultImplementation()
//          ^ reference read_access local 0
//            ^^^^^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AbstractClasses#defaultImplementation().
//                                ⌃ enclosing_range_end local 0
//                                  ⌃ enclosing_range_end semanticdb maven . . minimized/AbstractClasses#defaultImplementation().
//          ⌄ enclosing_range_start local 0
//          ⌄ enclosing_range_start semanticdb maven . . minimized/SubClasses#abstractInterfaceMethod().
          + s.abstractInterfaceMethod()
//          ^ reference read_access local 0
//            ^^^^^^^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/SubClasses#abstractInterfaceMethod().
//                                  ⌃ enclosing_range_end local 0
//                                    ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#abstractInterfaceMethod().
//          ⌄ enclosing_range_start local 0
//          ⌄ enclosing_range_start semanticdb maven . . minimized/Interfaces#defaultInterfaceMethod().
          + s.defaultInterfaceMethod();
//          ^ reference read_access local 0
//            ^^^^^^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/Interfaces#defaultInterfaceMethod().
//                                 ⌃ enclosing_range_end local 0
//                                   ⌃ enclosing_range_end semanticdb maven . . minimized/Interfaces#defaultInterfaceMethod().
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#app().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/SubClasses#
//⌃ enclosing_range_end semanticdb maven . . minimized/AbstractClasses#
//⌃ enclosing_range_end semanticdb maven . . minimized/Interfaces#
