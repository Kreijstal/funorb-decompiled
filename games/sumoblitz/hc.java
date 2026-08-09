/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static gt field_c;
    static da field_e;
    static int field_f;
    static ri[] field_a;
    static ri field_b;
    static String field_d;

    private hc() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
        int var1 = 80 / ((69 - param0) / 40);
        field_c = null;
    }

    final static sn a(int param0, mk[] param1, fr param2) {
        Object stackIn_7_0 = null;
        sn stackIn_14_0 = null;
        Object stackIn_27_0 = null;
        sn stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param1.length) {
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (param1.length <= var5) {
                    jaggl.OpenGL.glLinkProgramARB(var3_long);
                    if (param0 == -14382) {
                      L3: {
                        jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, sc.field_o, 0);
                        if (0 == sc.field_o[0]) {
                          L4: {
                            if (sc.field_o[0] != 0) {
                              break L4;
                            } else {
                              System.out.println("Shader linking failed:");
                              break L4;
                            }
                          }
                          L5: {
                            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, sc.field_o, 1);
                            if (sc.field_o[1] > 1) {
                              var11 = new byte[sc.field_o[1]];
                              jaggl.OpenGL.glGetInfoLogARB(var3_long, sc.field_o[1], sc.field_o, 0, var11, 0);
                              System.out.println(new String(var11));
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (sc.field_o[0] != 0) {
                            break L3;
                          } else {
                            var7 = 0;
                            var5 = var7;
                            L6: while (true) {
                              if (param1.length <= var7) {
                                jaggl.OpenGL.glDeleteObjectARB(var3_long);
                                stackIn_27_0 = null;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var7].field_b);
                                var7++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      stackIn_29_0 = new sn(param2, var3_long, param1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_14_0 = (sn) null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_b);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (null != param1[var3_int]) {
                  if ((param1[var3_int].field_b ^ -1L) < -1L) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("hc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (sn) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (sn) ((Object) stackIn_27_0);
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    static {
        field_d = "Continue to next level?";
        field_f = 1;
    }
}
