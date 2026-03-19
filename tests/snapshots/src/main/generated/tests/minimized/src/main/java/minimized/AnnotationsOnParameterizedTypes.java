  package minimized;
  
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/Constructor#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/reflect/
  import java.lang.reflect.Constructor;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/lang/
//                 ^^^^^^^ import semanticdb maven . . java/lang/reflect/
//                         ^^^^^^^^^^^ import semanticdb maven jdk 11 java/lang/reflect/Constructor#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                       ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                   ⌃ enclosing_range_end semanticdb maven . . java/lang/reflect/
//                                    ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/Constructor#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/
//       ⌄ enclosing_range_start semanticdb maven . . java/lang/reflect/
  import java.lang.reflect.InvocationHandler;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/lang/
//                 ^^^^^^^ import semanticdb maven . . java/lang/reflect/
//                         ^^^^^^^^^^^^^^^^^ import semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                       ⌃ enclosing_range_end semanticdb maven . . java/lang/
//                                         ⌃ enclosing_range_end semanticdb maven . . java/lang/reflect/
//                                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/concurrent/ConcurrentHashMap#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/concurrent/
  import java.util.concurrent.ConcurrentHashMap;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^^^^^ import semanticdb maven . . java/util/concurrent/
//                            ^^^^^^^^^^^^^^^^^ import semanticdb maven jdk 11 java/util/concurrent/ConcurrentHashMap#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                          ⌃ enclosing_range_end semanticdb maven . . java/util/
//                                            ⌃ enclosing_range_end semanticdb maven . . java/util/concurrent/
//                                             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/concurrent/ConcurrentHashMap#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/concurrent/
  import java.util.concurrent.ConcurrentMap;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^^^^^ import semanticdb maven . . java/util/concurrent/
//                            ^^^^^^^^^^^^^ import semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                          ⌃ enclosing_range_end semanticdb maven . . java/util/
//                                        ⌃ enclosing_range_end semanticdb maven . . java/util/concurrent/
//                                         ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//⌄ enclosing_range_start semanticdb maven jdk 11 java/util/function/Function#
//       ⌄ enclosing_range_start semanticdb maven . . java/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/
//       ⌄ enclosing_range_start semanticdb maven . . java/util/function/
  import java.util.function.Function;
//       ^^^^ import semanticdb maven . . java/
//            ^^^^ import semanticdb maven . . java/util/
//                 ^^^^^^^^ import semanticdb maven . . java/util/function/
//                          ^^^^^^^^ import semanticdb maven jdk 11 java/util/function/Function#
//               ⌃ enclosing_range_end semanticdb maven . . java/
//                        ⌃ enclosing_range_end semanticdb maven . . java/util/
//                                 ⌃ enclosing_range_end semanticdb maven . . java/util/function/
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/function/Function#
  
//⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
  public interface AnnotationsOnParameterizedTypes {
//                 ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//                                                 display_name AnnotationsOnParameterizedTypes
//                                                 signature_documentation java public interface AnnotationsOnParameterizedTypes
//                                                 kind Interface
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#getInstance().
    public static AnnotationsOnParameterizedTypes getInstance() {
//                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//                                                ^^^^^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#getInstance().
//                                                            display_name getInstance
//                                                            signature_documentation java public static AnnotationsOnParameterizedTypes getInstance()
//                                                            kind StaticMethod
//                                                            relationship is_type_definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#`<init>`().
      return new AnnotationsOnParameterizedTypesImpl();
//               ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#`<init>`().
//                                                    ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#`<init>`().
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#getInstance().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().
//         ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/function/Function#
//         ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//         ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                                ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#
//                                ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                                ⌄ enclosing_range_start local 0
//                                                   ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#
//                                                   ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//                                                   ⌄ enclosing_range_start local 1
    <C, W> Function<W, C> adapter(Class<C> contract, Class<W> wrappedClass);
//   ^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//     display_name C
//     signature_documentation java C
//     kind TypeParameter
//      ^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//        display_name W
//        signature_documentation java W
//        kind TypeParameter
//         ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/function/Function#
//                  ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//                     ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                        ^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().
//                                display_name adapter
//                                signature_documentation java public abstract <C, W> Function<W, C> adapter(Class<C> contract, Class<W> wrappedClass)
//                                kind AbstractMethod
//                                relationship is_reference is_implementation semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
//                                relationship is_type_definition semanticdb maven jdk 11 java/util/function/Function#
//                                ^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#
//                                      ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                                         ^^^^^^^^ definition local 0
//                                                  display_name contract
//                                                  signature_documentation java Class<C> contract
//                                                  enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().
//                                                  relationship is_type_definition semanticdb maven jdk 11 java/lang/Class#
//                                                   ^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#
//                                                         ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//                                                            ^^^^^^^^^^^^ definition local 1
//                                                                         display_name wrappedClass
//                                                                         signature_documentation java Class<W> wrappedClass
//                                                                         enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().
//                                                                         relationship is_type_definition semanticdb maven jdk 11 java/lang/Class#
//                      ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/function/Function#
//                      ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//                      ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                                       ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#
//                                       ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                                                ⌃ enclosing_range_end local 0
//                                                          ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#
//                                                          ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//                                                                       ⌃ enclosing_range_end local 1
//                                                                         ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[C]
//                                                                         ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().[W]
//                                                                         ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().
  }
//⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
  
  
//⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#
//⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
  class AnnotationsOnParameterizedTypesImpl implements AnnotationsOnParameterizedTypes {
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#
//                                          display_name AnnotationsOnParameterizedTypesImpl
//                                          signature_documentation java class AnnotationsOnParameterizedTypesImpl
//                                          kind Class
//                                          relationship is_implementation semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#`<init>`().
//                                          display_name <init>
//                                          signature_documentation java AnnotationsOnParameterizedTypesImpl()
//                                          kind Constructor
//                                                     ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#proxyConstructors.
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/concurrent/ConcurrentHashMap#`<init>`().
//          ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//                        ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#
//                                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/Constructor#
    private ConcurrentMap<Class<?>, Constructor<?>> proxyConstructors = new ConcurrentHashMap<>();
//          ^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//                        ^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#
//                                  ^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                                                  ^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#proxyConstructors.
//                                                                    display_name proxyConstructors
//                                                                    signature_documentation java private ConcurrentMap<Class<?>, Constructor<?>> proxyConstructors
//                                                                    kind Field
//                                                                    relationship is_type_definition semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//                                                                          ^^^^^^^^^^^^^^^^^ reference semanticdb maven jdk 11 java/util/concurrent/ConcurrentHashMap#`<init>`().
//                               ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#
//                                               ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                                                ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#
//                                                                                               ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#proxyConstructors.
//                                                                                               ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/concurrent/ConcurrentHashMap#`<init>`().
  
//  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Override#
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
    @Override
//   ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Override#
//          ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Override#
//                ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/function/Function#
//                ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//                ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                       ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#
//                                       ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                       ⌄ enclosing_range_start local 2
//                                                          ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#
//                                                          ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//                                                          ⌄ enclosing_range_start local 3
    public <C, W> Function<W, C> adapter(Class<C> contract, Class<W> wrappedClass) {
//          ^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//            display_name C
//            signature_documentation java C
//            kind TypeParameter
//             ^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//               display_name W
//               signature_documentation java W
//               kind TypeParameter
//                ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/function/Function#
//                         ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//                            ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                               ^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
//                                       display_name adapter
//                                       signature_documentation java @Override\npublic <C, W> Function<W, C> adapter(Class<C> contract, Class<W> wrappedClass)
//                                       kind Method
//                                       relationship is_reference is_implementation semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#adapter().
//                                       relationship is_type_definition semanticdb maven jdk 11 java/util/function/Function#
//                                       ^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#
//                                             ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                                ^^^^^^^^ definition local 2
//                                                         display_name contract
//                                                         signature_documentation java Class<C> contract
//                                                         enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
//                                                         relationship is_type_definition semanticdb maven jdk 11 java/lang/Class#
//                                                          ^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#
//                                                                ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//                                                                   ^^^^^^^^^^^^ definition local 3
//                                                                                display_name wrappedClass
//                                                                                signature_documentation java Class<W> wrappedClass
//                                                                                enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
//                                                                                relationship is_type_definition semanticdb maven jdk 11 java/lang/Class#
//                             ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/function/Function#
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//                             ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                              ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#
//                                              ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                                       ⌃ enclosing_range_end local 2
//                                                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#
//                                                                 ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//                                                                              ⌃ enclosing_range_end local 3
  
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/function/Function#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//    ⌄ enclosing_range_start local 4
//                                                 ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                                                 ⌄ enclosing_range_start local 2
      Function<InvocationHandler, C> constructor = getConstructor(contract);
//    ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/function/Function#
//             ^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//                                ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                   ^^^^^^^^^^^ definition local 4
//                                               display_name constructor
//                                               signature_documentation java Function<InvocationHandler, C> constructor
//                                               enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
//                                               kind Variable
//                                               relationship is_type_definition semanticdb maven jdk 11 java/util/function/Function#
//                                                 ^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                                                                ^^^^^^^^ reference read_access local 2
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/function/Function#
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//                                 ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//                                                                        ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                                                                        ⌃ enclosing_range_end local 2
//                                                                         ⌃ enclosing_range_end local 4
  
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#out.
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//    ⌄ enclosing_range_start local 4
      System.out.println(constructor);
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/System#
//           ^^^ reference read_access semanticdb maven jdk 11 java/lang/System#out.
//               ^^^^^^^ reference read_access semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//                       ^^^^^^^^^^^ reference read_access local 4
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#out.
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//                                  ⌃ enclosing_range_end local 4
  
      return null;
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[C]
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().[W]
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#adapter().
  
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//              ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/function/Function#
//              ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//              ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                            ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/Class#
//                                                            ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                            ⌄ enclosing_range_start local 5
    private <T> Function<InvocationHandler, T> getConstructor(Class<T> contract) {
//           ^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//             display_name T
//             signature_documentation java T
//             kind TypeParameter
//              ^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/function/Function#
//                       ^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//                                          ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                             ^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                                                            display_name getConstructor
//                                                            signature_documentation java private <T> Function<InvocationHandler, T> getConstructor(Class<T> contract)
//                                                            kind Method
//                                                            relationship is_type_definition semanticdb maven jdk 11 java/util/function/Function#
//                                                            ^^^^^ reference read_access semanticdb maven jdk 11 java/lang/Class#
//                                                                  ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                                     ^^^^^^^^ definition local 5
//                                                                              display_name contract
//                                                                              signature_documentation java Class<T> contract
//                                                                              enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                                                                              relationship is_type_definition semanticdb maven jdk 11 java/lang/Class#
//                                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/function/Function#
//                                           ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/InvocationHandler#
//                                           ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                                   ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/Class#
//                                                                   ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                                            ⌃ enclosing_range_end local 5
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/SuppressWarnings#
//    ⌄ enclosing_range_start local 6
      @SuppressWarnings("unchecked")
//     ^^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/SuppressWarnings#
//                                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/SuppressWarnings#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/Constructor#
//    ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                                  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                  ⌄ enclosing_range_start semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#proxyConstructors.
//                                                  ⌄ enclosing_range_start semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#computeIfAbsent().
//                                                  ⌄ enclosing_range_start local 5
//                                                                                              ⌄ enclosing_range_start local 7
      Constructor<T> constructor = (Constructor<T>) proxyConstructors.computeIfAbsent(contract, c -> {
//    ^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                   ^^^^^^^^^^^ definition local 6
//                               display_name constructor
//                               signature_documentation java @SuppressWarnings\nConstructor<T> constructor
//                               enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                               kind Variable
//                               relationship is_type_definition semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                                  ^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                                              ^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                  ^^^^^^^^^^^^^^^^^ reference read_access semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#proxyConstructors.
//                                                                    ^^^^^^^^^^^^^^^ reference read_access semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#computeIfAbsent().
//                                                                                    ^^^^^^^^ reference read_access local 5
//                                                                                              ^ definition local 7
//                                                                                                display_name c
//                                                                                                signature_documentation java Class<?> c
//                                                                                                enclosing_symbol semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
//                                                                                                relationship is_type_definition semanticdb maven jdk 11 java/lang/Class#
//                 ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                 ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                               ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/reflect/Constructor#
//                                               ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//                                                                                  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#proxyConstructors.
//                                                                                              ⌃ enclosing_range_end local 7
        return null;
      });
//     ⌃ enclosing_range_end semanticdb maven jdk 11 java/util/concurrent/ConcurrentMap#computeIfAbsent().
//     ⌃ enclosing_range_end local 5
//      ⌃ enclosing_range_end local 6
  
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/lang/System#out.
//    ⌄ enclosing_range_start semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//    ⌄ enclosing_range_start local 6
      System.out.println(constructor);
//    ^^^^^^ reference read_access semanticdb maven jdk 11 java/lang/System#
//           ^^^ reference read_access semanticdb maven jdk 11 java/lang/System#out.
//               ^^^^^^^ reference read_access semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//                       ^^^^^^^^^^^ reference read_access local 6
//             ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#
//                     ⌃ enclosing_range_end semanticdb maven jdk 11 java/lang/System#out.
//                                  ⌃ enclosing_range_end semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//                                  ⌃ enclosing_range_end local 6
  
      return null;
    }
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().[T]
//  ⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#getConstructor().
  }//⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypesImpl#
//⌃ enclosing_range_end semanticdb maven . . minimized/AnnotationsOnParameterizedTypes#
