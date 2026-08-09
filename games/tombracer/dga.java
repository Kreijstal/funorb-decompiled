/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dga {
    static String field_a;
    static String field_b;

    final static void a(uia param0, int param1) {
        kc.field_b = param0.d(123) << -1338331483;
        int var2_int = param0.h(255);
        kc.field_b = kc.field_b + (var2_int >> -847199581);
        vd.field_p = var2_int << 1095837714 & 1835008;
        vd.field_p = vd.field_p + (param0.d(125) << 884932866);
        if (param1 != 0) {
            return;
        }
        try {
            var2_int = param0.h(param1 + 255);
            vd.field_p = vd.field_p + (var2_int >> 556781158);
            ir.field_a = (var2_int & 63) << -1369543441;
            ir.field_a = ir.field_a + (param0.h(255) << 73851527);
            var2_int = param0.h(255);
            ir.field_a = ir.field_a + (var2_int >> 478803233);
            tna.field_f = (1 & var2_int) << -807179600;
            tna.field_f = tna.field_f + param0.d(127);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static cua a(int param0, cka param1, fca[] param2) {
        cua stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        cua stackIn_29_0 = null;
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
                        if (-1 != (mg.field_g[0] ^ -1)) {
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
                            if ((mg.field_g[1] ^ -1) < -2) {
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
                                stackIn_27_0 = null;
                                decompiledRegionSelector0 = 1;
                                break L0;
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
                      stackIn_29_0 = new cua(param1, var3_long, param2);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_a);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (null != param2[var3_int]) {
                    if (-1L > (param2[var3_int].field_a ^ -1L)) {
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
              stackIn_3_0 = (cua) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("dga.D(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (cua) ((Object) stackIn_27_0);
          } else {
            return stackIn_29_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (ob.field_i - 640) / 2;
        int var3 = pna.field_q * pna.field_q;
        int var4 = var3 - param0 * param0;
        nra.field_c.a(param1, -124 + bea.field_a - 90, -23776, 90, -(var4 * 199 / var3) + var2);
        dka.field_b.a(438, -124 + bea.field_a, param1 + -23975, 0, var2 - -202 - -(var4 * 438 / var3));
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -29262) {
            field_b = (String) null;
        }
    }

    static {
        field_b = "Unable to delete friend - system busy";
    }
}
