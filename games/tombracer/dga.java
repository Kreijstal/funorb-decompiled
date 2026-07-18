/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dga {
    static String field_a;
    static String field_b;

    final static void a(uia param0) {
        kc.field_b = param0.d(123) << 5;
        int var2_int = param0.h(255);
        kc.field_b = kc.field_b + (var2_int >> 3);
        vd.field_p = var2_int << 18 & 1835008;
        vd.field_p = vd.field_p + (param0.d(125) << 2);
        try {
            var2_int = param0.h(255);
            vd.field_p = vd.field_p + (var2_int >> 6);
            ir.field_a = (var2_int & 63) << 15;
            ir.field_a = ir.field_a + (param0.h(255) << 7);
            var2_int = param0.h(255);
            ir.field_a = ir.field_a + (var2_int >> 1);
            tna.field_f = (1 & var2_int) << 16;
            tna.field_f = tna.field_f + param0.d(127);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dga.A(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    final static cua a(int param0, cka param1, fca[] param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        cua stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        cua stackOut_28_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 21885) {
              var3_int = 0;
              L1: while (true) {
                if (param2.length <= var3_int) {
                  var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                  var5 = 0;
                  L2: while (true) {
                    if (param2.length <= var5) {
                      L3: {
                        jaggl.OpenGL.glLinkProgramARB(var3_long);
                        jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, mg.field_g, 0);
                        if (mg.field_g[0] != 0) {
                          break L3;
                        } else {
                          L4: {
                            if (mg.field_g[0] != 0) {
                              break L4;
                            } else {
                              System.out.println("Shader linking failed:");
                              break L4;
                            }
                          }
                          L5: {
                            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, mg.field_g, 1);
                            if (mg.field_g[1] > 1) {
                              var11 = new byte[mg.field_g[1]];
                              jaggl.OpenGL.glGetInfoLogARB(var3_long, mg.field_g[1], mg.field_g, 0, var11, 0);
                              System.out.println(new String(var11));
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (0 == mg.field_g[0]) {
                            var7 = 0;
                            var5 = var7;
                            L6: while (true) {
                              if (param2.length <= var7) {
                                jaggl.OpenGL.glDeleteObjectARB(var3_long);
                                stackOut_26_0 = null;
                                stackIn_27_0 = stackOut_26_0;
                                return (cua) (Object) stackIn_27_0;
                              } else {
                                jaggl.OpenGL.glDetachObjectARB(var3_long, param2[var7].field_a);
                                var7++;
                                continue L6;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_28_0 = new cua(param1, var3_long, param2);
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_a);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (null != param2[var3_int]) {
                    if (param2[var3_int].field_a > 0L) {
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
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (cua) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("dga.D(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          L8: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
        return stackIn_29_0;
    }

    final static void a(int param0, int param1) {
        int var2 = (ob.field_i - 640) / 2;
        int var3 = pna.field_q * pna.field_q;
        int var4 = var3 - param0 * param0;
        nra.field_c.a(param1, -124 + bea.field_a - 90, -23776, 90, -(var4 * 199 / var3) + var2);
        dka.field_b.a(438, -124 + bea.field_a, param1 + -23975, 0, var2 - -202 - -(var4 * 438 / var3));
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete friend - system busy";
    }
}
