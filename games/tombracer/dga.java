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
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        byte[] var10 = null;
        cua stackIn_3_0 = null;
        Object stackIn_33_0 = null;
        cua stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_32_0 = null;
        cua stackOut_34_0 = null;
        cua stackOut_2_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 21885) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (param2.length <= var3_int) {
                    break L2;
                  } else {
                    if (null != param2[var3_int]) {
                      if (-1L > (param2[var3_int].field_a ^ -1L)) {
                        var3_int++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  }
                }
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L3: while (true) {
                  L4: {
                    L5: {
                      if (param2.length <= var5) {
                        break L5;
                      } else {
                        jaggl.OpenGL.glAttachObjectARB(var3_long, param2[var5].field_a);
                        var5++;
                        if (var6 != 0) {
                          break L4;
                        } else {
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    jaggl.OpenGL.glLinkProgramARB(var3_long);
                    jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, mg.field_g, 0);
                    break L4;
                  }
                  L6: {
                    if (-1 != (mg.field_g[0] ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        if (mg.field_g[0] != 0) {
                          break L7;
                        } else {
                          System.out.println("Shader linking failed:");
                          break L7;
                        }
                      }
                      L8: {
                        jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, mg.field_g, 1);
                        if ((mg.field_g[1] ^ -1) < -2) {
                          var10 = new byte[mg.field_g[1]];
                          jaggl.OpenGL.glGetInfoLogARB(var3_long, mg.field_g[1], mg.field_g, 0, var10, 0);
                          System.out.println(new String(var10));
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (0 == mg.field_g[0]) {
                        var5 = 0;
                        L9: while (true) {
                          if (param2.length <= var5) {
                            jaggl.OpenGL.glDeleteObjectARB(var3_long);
                            stackOut_32_0 = null;
                            stackIn_33_0 = stackOut_32_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            jaggl.OpenGL.glDetachObjectARB(var3_long, param2[var5].field_a);
                            var5++;
                            if (var6 == 0) {
                              continue L9;
                            } else {
                              return null;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_34_0 = new cua(param1, var3_long, param2);
                  stackIn_35_0 = stackOut_34_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = (cua) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var3);
            stackOut_36_1 = new StringBuilder().append("dga.D(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L10;
            }
          }
          L11: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (cua) ((Object) stackIn_33_0);
          } else {
            return stackIn_35_0;
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
