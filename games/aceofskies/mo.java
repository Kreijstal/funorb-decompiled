/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    private jc field_b;
    int field_d;
    static int[] field_c;
    static w field_a;

    final static io a(int param0, jc param1, vj[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        Object stackIn_24_0 = null;
        io stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        io stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param2.length) {
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (param2.length <= var5) {
                    L3: {
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, ee.field_d, 0);
                      if (ee.field_d[0] == 0) {
                        L4: {
                          if (ee.field_d[0] == 0) {
                            System.out.println("Shader linking failed:");
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, ee.field_d, 1);
                          if (1 >= ee.field_d[1]) {
                            break L5;
                          } else {
                            var11 = new byte[ee.field_d[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, ee.field_d[1], ee.field_d, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L5;
                          }
                        }
                        if (ee.field_d[0] != 0) {
                          break L3;
                        } else {
                          var7 = 0;
                          var5 = var7;
                          L6: while (true) {
                            if (var7 >= param2.length) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackOut_23_0 = null;
                              stackIn_24_0 = stackOut_23_0;
                              return (io) (Object) stackIn_24_0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param2[var7].field_c);
                              var7++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackOut_25_0 = new io(param1, var3_long, param2);
                    stackIn_26_0 = stackOut_25_0;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_c);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (null != param2[var3_int]) {
                  if (param2[var3_int].field_c > 0L) {
                    var3_int++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("mo.C(").append(0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          L8: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_26_0;
    }

    final static void a() {
        if (!ks.field_b) {
            throw new IllegalStateException();
        }
        nq.field_a = true;
        ep.a(false, 0);
        ob.field_d = 0;
    }

    public static void b() {
        field_a = null;
        field_c = null;
        int var1 = -16;
    }

    mo(jc param0, int param1, int param2) {
        try {
            ((mo) this).field_d = param2;
            ((mo) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "mo.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    protected final void finalize() throws Throwable {
        ((mo) this).field_b.c(110, ((mo) this).field_d);
        super.finalize();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new w();
    }
}
