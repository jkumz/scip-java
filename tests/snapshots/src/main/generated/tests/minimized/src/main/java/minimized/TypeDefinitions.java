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
//⌄ enclosing_range_start semanticdb maven jdk 11 java/io/IOException#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/io/
  import java.io.IOException;
//       ^^^^ import semanticdb maven . . java/
//            ^^ import semanticdb maven . . java/io/
//               ^^^^^^^^^^^ import semanticdb maven jdk 11 java/io/IOException#
//             ⌃ enclosing_range_end semanticdb maven . . java/
//                         ⌃ enclosing_range_end semanticdb maven . . java/io/
//                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/IOException#
  
  /**
   * Test cases for SCIP Relationship.is_type_definition emission.
   *
   * Covers:
   * - Field with declared class type → is_type_definition
   * - Local variable → is_type_definition
   * - Method parameter → is_type_definition
   * - Exception parameter in catch → is_type_definition
   * - Method return type (non-void, non-primitive) → is_type_definition
   * - Primitive field → NO is_type_definition
   * - Primitive return method → NO is_type_definition
   * - Void method → NO is_type_definition
   * - Generic type (List<String>) → is_type_definition to raw type (List)
   * - Nested generic (Map<String, Integer>) → is_type_definition to raw type (Map)
   * - Enum constant → is_type_definition to enum type
   * - Array of objects (String[]) → behavior check
   * - Class definition itself → NO is_type_definition (it IS a type)
   * - Constructor → NO is_type_definition
   * - Self-referencing field → is_type_definition to own class
   */
//⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#
  public class TypeDefinitions {
//             ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#
//                             display_name TypeDefinitions
//                             signature_documentation java public class TypeDefinitions
//                             kind Class
//                             documentation  Test cases for SCIP Relationship.is_type_definition emission.\n\n Covers:\n - Field with declared class type → is_type_definition\n - Local variable → is_type_definition\n - Method parameter → is_type_definition\n - Exception parameter in catch → is_type_definition\n - Method return type (non-void, non-primitive) → is_type_definition\n - Primitive field → NO is_type_definition\n - Primitive return method → NO is_type_definition\n - Void method → NO is_type_definition\n - Generic type (List<String>) → is_type_definition to raw type (List)\n - Nested generic (Map<String, Integer>) → is_type_definition to raw type (Map)\n - Enum constant → is_type_definition to enum type\n - Array of objects (String[]) → behavior check\n - Class definition itself → NO is_type_definition (it IS a type)\n - Constructor → NO is_type_definition\n - Self-referencing field → is_type_definition to own class\n
//             ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#`<init>`().
//                             display_name <init>
//                             signature_documentation java public TypeDefinitions()
//                             kind Constructor
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#stringField.
    String stringField;
//  ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//         ^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#stringField.
//                     display_name stringField
//                     signature_documentation java String stringField
//                     kind Field
//                     relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                    ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#stringField.
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#primitiveField.
    int primitiveField;
//      ^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#primitiveField.
//                     display_name primitiveField
//                     signature_documentation java int primitiveField
//                     kind Field
//                    ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#primitiveField.
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#booleanPrimitive.
    boolean booleanPrimitive;
//          ^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#booleanPrimitive.
//                           display_name booleanPrimitive
//                           signature_documentation java boolean booleanPrimitive
//                           kind Field
//                          ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#booleanPrimitive.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#genericField.
    List<String> genericField;
//  ^^^^ reference read_access semanticdb maven jdk 11 java/util/List#
//       ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//               ^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#genericField.
//                            display_name genericField
//                            signature_documentation java List<String> genericField
//                            kind Field
//                            relationship is_type_definition semanticdb maven jdk 11 java/util/List#
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                           ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#genericField.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Map#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Integer#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#nestedGenericField.
    Map<String, Integer> nestedGenericField;
//  ^^^ reference read_access semanticdb maven jdk 11 java/util/Map#
//      ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//              ^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Integer#
//                       ^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#nestedGenericField.
//                                          display_name nestedGenericField
//                                          signature_documentation java Map<String, Integer> nestedGenericField
//                                          kind Field
//                                          relationship is_type_definition semanticdb maven jdk 11 java/util/Map#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Map#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Integer#
//                                         ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#nestedGenericField.
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#selfReference.
    TypeDefinitions selfReference;
//  ^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeDefinitions#
//                  ^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#selfReference.
//                                display_name selfReference
//                                signature_documentation java TypeDefinitions selfReference
//                                kind Field
//                                relationship is_type_definition semanticdb maven . . minimized/TypeDefinitions#
//                               ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#
//                               ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#selfReference.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#stringArray.
    String[] stringArray;
//  ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//           ^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#stringArray.
//                       display_name stringArray
//                       signature_documentation java String[] stringArray
//                       kind Field
//         ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                      ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#stringArray.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#objectField.
    Object objectField;
//  ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#
//         ^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#objectField.
//                     display_name objectField
//                     signature_documentation java Object objectField
//                     kind Field
//                     relationship is_type_definition semanticdb maven jdk 11 java/lang/Object#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#
//                    ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#objectField.
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#methodReturningString().
    public String methodReturningString() {
//         ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                ^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#methodReturningString().
//                                      display_name methodReturningString
//                                      signature_documentation java public String methodReturningString()
//                                      kind Method
//                                      relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#stringField.
      return stringField;
//           ^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeDefinitions#stringField.
//                      ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#stringField.
    }
//  ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#methodReturningString().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#voidMethod().
    public void voidMethod() {}
//              ^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#voidMethod().
//                         display_name voidMethod
//                         signature_documentation java public void voidMethod()
//                         kind Method
//                            ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#voidMethod().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#primitiveReturnMethod().
    public int primitiveReturnMethod() {
//             ^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#primitiveReturnMethod().
//                                   display_name primitiveReturnMethod
//                                   signature_documentation java public int primitiveReturnMethod()
//                                   kind Method
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#primitiveField.
      return primitiveField;
//           ^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeDefinitions#primitiveField.
//                         ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#primitiveField.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#primitiveReturnMethod().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#methodReturningGeneric().
//         ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/List#
//         ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
    public List<String> methodReturningGeneric() {
//         ^^^^ reference read_access semanticdb maven jdk 11 java/util/List#
//              ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                      ^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#methodReturningGeneric().
//                                             display_name methodReturningGeneric
//                                             signature_documentation java public List<String> methodReturningGeneric()
//                                             kind Method
//                                             relationship is_type_definition semanticdb maven jdk 11 java/util/List#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/List#
//                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#genericField.
      return genericField;
//           ^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeDefinitions#genericField.
//                       ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#genericField.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#methodReturningGeneric().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#methodReturningSelf().
    public TypeDefinitions methodReturningSelf() {
//         ^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeDefinitions#
//                         ^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#methodReturningSelf().
//                                             display_name methodReturningSelf
//                                             signature_documentation java public TypeDefinitions methodReturningSelf()
//                                             kind Method
//                                             relationship is_type_definition semanticdb maven . . minimized/TypeDefinitions#
      return this;
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#methodReturningSelf().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                             ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//                             ⌄ enclosing_range_start local 0
//                                              ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/Map#
//                                              ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//                                              ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Integer#
//                                              ⌄ enclosing_range_start local 1
    public void parameterTypes(String strParam, Map<String, Integer> mapParam) {
//              ^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                             display_name parameterTypes
//                             signature_documentation java public void parameterTypes(String strParam, Map<String, Integer> mapParam)
//                             kind Method
//                             ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                                    ^^^^^^^^ definition local 0
//                                             display_name strParam
//                                             signature_documentation java String strParam
//                                             enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                                             relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//                                              ^^^ reference read_access semanticdb maven jdk 11 java/util/Map#
//                                                  ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//                                                          ^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Integer#
//                                                                   ^^^^^^^^ definition local 1
//                                                                            display_name mapParam
//                                                                            signature_documentation java Map<String, Integer> mapParam
//                                                                            enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                                                                            relationship is_type_definition semanticdb maven jdk 11 java/util/Map#
//                                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                           ⌃ enclosing_range_end local 0
//                                                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/Map#
//                                                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                                                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Integer#
//                                                                          ⌃ enclosing_range_end local 1
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/String#
//    ⌄ enclosing_range_start local 2
//    ⌄ enclosing_range_start local 0
      String localVar = strParam;
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/String#
//           ^^^^^^^^ definition local 2
//                    display_name localVar
//                    signature_documentation java String localVar
//                    enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                    kind Variable
//                    relationship is_type_definition semanticdb maven jdk 11 java/lang/String#
//                      ^^^^^^^^ reference read_access local 0
//                              ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/String#
//                              ⌃ enclosing_range_end local 2
//                              ⌃ enclosing_range_end local 0
//    ⌄ enclosing_range_start local 3
      int localPrimitive = 42;
//        ^^^^^^^^^^^^^^ definition local 3
//                       display_name localPrimitive
//                       signature_documentation java int localPrimitive
//                       enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                       kind Variable
//                           ⌃ enclosing_range_end local 3
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Object#
//    ⌄ enclosing_range_start local 4
//    ⌄ enclosing_range_start local 2
      Object localObject = localVar;
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Object#
//           ^^^^^^^^^^^ definition local 4
//                       display_name localObject
//                       signature_documentation java Object localObject
//                       enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
//                       kind Variable
//                       relationship is_type_definition semanticdb maven jdk 11 java/lang/Object#
//                         ^^^^^^^^ reference read_access local 2
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Object#
//                                 ⌃ enclosing_range_end local 4
//                                 ⌃ enclosing_range_end local 2
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#parameterTypes().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#exceptionParameter().
    public void exceptionParameter() {
//              ^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#exceptionParameter().
//                                 display_name exceptionParameter
//                                 signature_documentation java public void exceptionParameter()
//                                 kind Method
      try {
//      ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#voidMethod().
        voidMethod();
//      ^^^^^^^^^^ reference read_access semanticdb maven . . minimized/TypeDefinitions#voidMethod().
//                 ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#voidMethod().
//             ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/RuntimeException#
//             ⌄ enclosing_range_start local 5
      } catch (RuntimeException e) {
//             ^^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/RuntimeException#
//                              ^ definition local 5
//                                display_name e
//                                signature_documentation java RuntimeException e
//                                enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#exceptionParameter().
//                                relationship is_type_definition semanticdb maven jdk 11 java/lang/RuntimeException#
//                              ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/RuntimeException#
//                              ⌃ enclosing_range_end local 5
        // e should have is_type_definition → RuntimeException
      }
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#exceptionParameter().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#checkedExceptionParameter().
    public void checkedExceptionParameter() {
//              ^^^^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#checkedExceptionParameter().
//                                        display_name checkedExceptionParameter
//                                        signature_documentation java public void checkedExceptionParameter()
//                                        kind Method
      try {
//      ⌄ enclosing_range_start semanticdb maven jdk 11 java/io/IOException#`<init>`(+1).
        throw new IOException("test");
//                ^^^^^^^^^^^ reference semanticdb maven jdk 11 java/io/IOException#`<init>`(+1).
//                                   ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/IOException#`<init>`(+1).
//             ⌄ enclosing_range_start semanticdb maven jdk 11 java/io/IOException#
//             ⌄ enclosing_range_start local 6
      } catch (IOException e) {
//             ^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/io/IOException#
//                         ^ definition local 6
//                           display_name e
//                           signature_documentation java IOException e
//                           enclosing_symbol semanticdb maven . . minimized/TypeDefinitions#checkedExceptionParameter().
//                           relationship is_type_definition semanticdb maven jdk 11 java/io/IOException#
//                         ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/IOException#
//                         ⌃ enclosing_range_end local 6
        // e should have is_type_definition → IOException
      }
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#checkedExceptionParameter().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#Color#
    enum Color {
//       ^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#Color#
//             display_name Color
//             signature_documentation java enum Color
//             kind Enum
//             relationship is_implementation semanticdb maven jdk 11 java/io/Serializable#
//             relationship is_implementation semanticdb maven jdk 11 java/lang/Comparable#
//             relationship is_implementation semanticdb maven jdk 11 java/lang/Enum#
//       ^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#Color#`<init>`().
//             display_name <init>
//             signature_documentation java private Color()
//             kind Constructor
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#Color#RED.
      RED,
//    ^^^ definition semanticdb maven . . minimized/TypeDefinitions#Color#RED.
//        display_name RED
//        signature_documentation java Color.RED /* ordinal 0 */
//        relationship is_type_definition semanticdb maven . . minimized/TypeDefinitions#Color#
//    ^^^ reference semanticdb maven . . minimized/TypeDefinitions#Color#`<init>`().
//      ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#Color#RED.
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#Color#GREEN.
      GREEN,
//    ^^^^^ definition semanticdb maven . . minimized/TypeDefinitions#Color#GREEN.
//          display_name GREEN
//          signature_documentation java Color.GREEN /* ordinal 1 */
//          relationship is_type_definition semanticdb maven . . minimized/TypeDefinitions#Color#
//    ^^^^^ reference semanticdb maven . . minimized/TypeDefinitions#Color#`<init>`().
//        ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#Color#GREEN.
//    ⌄ enclosing_range_start semanticdb maven . . minimized/TypeDefinitions#Color#BLUE.
      BLUE;
//    ^^^^ definition semanticdb maven . . minimized/TypeDefinitions#Color#BLUE.
//         display_name BLUE
//         signature_documentation java Color.BLUE /* ordinal 2 */
//         relationship is_type_definition semanticdb maven . . minimized/TypeDefinitions#Color#
//    ^^^^ reference semanticdb maven . . minimized/TypeDefinitions#Color#`<init>`().
//       ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#Color#BLUE.
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#Color#
  }//⌃ enclosing_range_end semanticdb maven . . minimized/TypeDefinitions#
