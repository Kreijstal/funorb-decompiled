/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static volatile int field_a;
    static String field_c;
    static int field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 18567) {
            wl var2 = (wl) null;
            kg.a((String) null, 109, true, (wl) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ll[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (param4 <= 0) {
                  break L1;
                } else {
                  var6_int = param5[0].field_v;
                  var7 = param5[2].field_v;
                  var8 = param5[1].field_v;
                  param5[0].b(param1, param3, param2);
                  param5[2].b(param4 + (param1 + -var7), param3, param2);
                  vp.b(rl.field_a);
                  vp.a(var6_int + param1, param3, param4 + (param1 + -var7), param5[1].field_q + param3);
                  var9 = param1 - -var6_int;
                  var10 = -var7 + (param1 + param4);
                  param1 = var9;
                  L2: while (true) {
                    if (param1 >= var10) {
                      var11 = -92 / ((param0 - -40) / 54);
                      vp.a(rl.field_a);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param5[1].b(param1, param3, param2);
                      param1 = param1 + var8;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("kg.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, gk param1, gk param2, gk param3) {
        ll var17 = null;
        wp[] var5 = null;
        wp[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        wp[] var14 = null;
        int var11_int = 0;
        ll var15 = null;
        ll var18 = null;
        ll var11 = null;
        ll var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = AceOfSkies.field_G ? 1 : 0;
        try {
            ip.field_c = qg.a((byte) 3, param1, "commonui", "frame_top");
            uc.field_k = qg.a((byte) 3, param1, "commonui", "frame_bottom");
            eo.field_b = ij.a(param1, "jagex_logo_grey", "commonui", 1);
            u.field_i = qg.a((byte) 3, param1, "commonui", "button");
            gu.field_c = tj.a("validation", "commonui", 1, param1);
            oi.field_c = (hc) ((Object) as.a(param3, -119, param1, "arezzo12", "commonui"));
            qo.field_b = (hc) ((Object) as.a(param3, -104, param1, "arezzo14", "commonui"));
            b.field_c = (hc) ((Object) as.a(param3, param0 ^ -112, param1, "arezzo14bold", "commonui"));
            var17 = new ll(param2.a("button.gif", (byte) -71, ""), (java.awt.Component) ((Object) ci.field_f));
            cd.a(param1, "commonui", "dropdown", param0 + -116);
            var5 = iu.a(param1, "commonui", (byte) -86, "screen_options");
            gr.field_i = new wp[param0];
            dk.field_e = new wp[4];
            sl.field_o = new wp[4];
            var6 = new wp[][]{sl.field_o, dk.field_e, gr.field_i};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            for (var8 = 1; var8 < var19.length; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_j[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; (var9 ^ -1) > -4; var9++) {
                var14 = var6[var9];
                wp[] var10 = var14;
                for (var11_int = 0; var11_int < var14.length; var11_int++) {
                    var14[var11_int] = ak.a(15810, var5[var9], var19[var11_int]);
                }
            }
            var9 = var17.field_n;
            qk.a((byte) -92);
            var17.b();
            vp.c(0, 0, vp.field_i, vp.field_c);
            var15 = new ll(var9, var9);
            var18 = var15;
            var18.b();
            var17.c(0, 0);
            var11 = new ll(var9, var9);
            var11.b();
            var17.c(var9 - var17.field_r, 0);
            var12 = new ll(-(var9 * 2) + var17.field_r, var9);
            var12.b();
            var17.c(-var9, 0);
            sl.c(param0 + 2761);
            u.field_i = new ll[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "kg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          var2 = param0;
          var3 = it.field_c;
          if (var3 >= 5) {
            if (-106 < (var3 ^ -1)) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (-121 < (var3 ^ -1)) {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = var3 * (var3 * 8192) / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (-4 == (param1 ^ -1)) {
            var4 = -1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((param1 ^ -1) != -2) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (-5 == (param1 ^ -1)) {
            var4 = 1;
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (5 == param1) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((param1 ^ -1) != -7) {
            break L5;
          } else {
            var4 = 1;
            var5 = -1;
            break L5;
          }
        }
        L6: {
          L7: {
            if (7 == param1) {
              break L7;
            } else {
              if (param1 != 8) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (-12 != (param1 ^ -1)) {
            break L8;
          } else {
            var4 = -1;
            break L8;
          }
        }
        L9: {
          if (-13 != (param1 ^ -1)) {
            break L9;
          } else {
            var4 = -1;
            var5 = -1;
            break L9;
          }
        }
        L10: {
          if ((param1 ^ -1) != -14) {
            break L10;
          } else {
            var5 = -1;
            var4 = 1;
            break L10;
          }
        }
        L11: {
          if (14 != param1) {
            break L11;
          } else {
            var5 = 1;
            var4 = -1;
            break L11;
          }
        }
        L12: {
          if (param1 == 15) {
            var5 = 1;
            var4 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        rb.field_k = of.a(var5 * var2, -19, var4 * var2);
    }

    final static aq a(String param0, int param1, boolean param2, wl param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_12_0 = null;
        aq stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_a = 32;
                break L1;
              }
            }
            L2: {
              var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
              jaggl.OpenGL.glShaderSourceARB(var4_long, param0);
              jaggl.OpenGL.glCompileShaderARB(var4_long);
              jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, wl.field_m, 0);
              if (0 == wl.field_m[0]) {
                L3: {
                  if (0 == wl.field_m[0]) {
                    System.out.println("Shader compile failed:");
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, wl.field_m, 1);
                  if (wl.field_m[1] > 1) {
                    var10 = new byte[wl.field_m[1]];
                    jaggl.OpenGL.glGetInfoLogARB(var4_long, wl.field_m[1], wl.field_m, 0, var10, 0);
                    System.out.println(new String(var10));
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (wl.field_m[0] != 0) {
                  break L2;
                } else {
                  jaggl.OpenGL.glDeleteObjectARB(var4_long);
                  stackIn_12_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                break L2;
              }
            }
            stackIn_14_0 = new aq(param3, var4_long, param1);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("kg.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (aq) ((Object) stackIn_12_0);
        } else {
          return stackIn_14_0;
        }
    }

    final static cl a(String param0, byte param1) {
        String var2 = null;
        cl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        cl stackIn_13_0 = null;
        cl stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (null != pj.field_a) {
              if (param0 != null) {
                if (-1 != (param0.length() ^ -1)) {
                  var6 = (CharSequence) ((Object) param0);
                  var2 = vu.a(param1 ^ 64, var6);
                  if (var2 != null) {
                    var3 = (cl) ((Object) pj.field_a.a(124, (long)var2.hashCode()));
                    if (param1 == 61) {
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_I);
                          var4 = vu.a(param1 + 63, var7);
                          if (!var4.equals(var2)) {
                            var3 = (cl) ((Object) pj.field_a.a(false));
                            continue L1;
                          } else {
                            stackIn_18_0 = (cl) (var3);
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = (cl) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("kg.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_18_0;
        }
    }

    static {
        field_a = 0;
        field_c = "GAME PAUSED";
        field_b = -1;
    }
}
