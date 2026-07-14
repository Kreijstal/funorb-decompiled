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
            aq discarded$0 = kg.a((String) null, 109, true, (wl) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ll[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = AceOfSkies.field_G ? 1 : 0;
        if (param5 != null) {
            if (!(param4 > 0)) {
                return;
            }
            var6 = param5[0].field_v;
            var7 = param5[2].field_v;
            var8 = param5[1].field_v;
            param5[0].b(param1, param3, param2);
            param5[2].b(param4 + (param1 + -var7), param3, param2);
            vp.b(rl.field_a);
            vp.a(var6 + param1, param3, param4 + (param1 + -var7), param5[1].field_q + param3);
            var9 = param1 - -var6;
            var10 = -var7 + (param1 + param4);
            param1 = var9;
            while (param1 < var10) {
                param5[1].b(param1, param3, param2);
                param1 = param1 + var8;
            }
            int var11 = -92 / ((param0 - -40) / 54);
            vp.a(rl.field_a);
            return;
        }
    }

    final static void a(int param0, gk param1, gk param2, gk param3) {
        int var8 = 0;
        int var9 = 0;
        wp[] var14 = null;
        int var11_int = 0;
        int var13 = AceOfSkies.field_G ? 1 : 0;
        ip.field_c = qg.a((byte) 3, param1, "commonui", "frame_top");
        uc.field_k = qg.a((byte) 3, param1, "commonui", "frame_bottom");
        eo.field_b = ij.a(param1, "jagex_logo_grey", "commonui", 1);
        u.field_i = qg.a((byte) 3, param1, "commonui", "button");
        gu.field_c = tj.a("validation", "commonui", 1, param1);
        oi.field_c = (hc) (Object) as.a(param3, -119, param1, "arezzo12", "commonui");
        qo.field_b = (hc) (Object) as.a(param3, -104, param1, "arezzo14", "commonui");
        b.field_c = (hc) (Object) as.a(param3, param0 ^ -112, param1, "arezzo14bold", "commonui");
        ll var17 = new ll(param2.a("button.gif", (byte) -71, ""), (java.awt.Component) (Object) ci.field_f);
        wp discarded$0 = cd.a(param1, "commonui", "dropdown", param0 + -116);
        wp[] var5 = iu.a(param1, "commonui", (byte) -86, "screen_options");
        gr.field_i = new wp[param0];
        dk.field_e = new wp[4];
        sl.field_o = new wp[4];
        wp[][] var6 = new wp[][]{sl.field_o, dk.field_e, gr.field_i};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_i;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) (int[]) var21[0].clone();
        }
        var8 = var5[0].field_j[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; (var9 ^ -1) > -4; var9++) {
            var14 = var6[var9];
            wp[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = ak.a(15810, var5[var9], var21[var11_int]);
            }
        }
        var9 = ((ll) var17).field_n;
        qk.a((byte) -92);
        var17.b();
        vp.c(0, 0, vp.field_i, vp.field_c);
        ll var15 = new ll(var9, var9);
        ll var18 = var15;
        var18.b();
        var17.c(0, 0);
        ll var11 = new ll(var9, var9);
        var11.b();
        var17.c(var9 - ((ll) var17).field_r, 0);
        ll var12 = new ll(-(var9 * 2) + ((ll) var17).field_r, var9);
        var12.b();
        var17.c(-var9, 0);
        sl.c(param0 + 2761);
        u.field_i = new ll[]{var15, var12, var11};
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          var2 = param0;
          var3 = it.field_c;
          if (var3 >= 5) {
            if (-106 < var3) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (-121 > var3) {
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
          if (param1 != -2) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (-5 == param1) {
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
          if (-12 != param1) {
            break L8;
          } else {
            var4 = -1;
            break L8;
          }
        }
        L9: {
          if (-13 != param1) {
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
        byte[] var8 = null;
        if (!param2) {
            field_a = 32;
        }
        long var4 = jaggl.OpenGL.glCreateShaderObjectARB(param1);
        jaggl.OpenGL.glShaderSourceARB(var4, param0);
        jaggl.OpenGL.glCompileShaderARB(var4);
        jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, wl.field_m, 0);
        if (!(0 != wl.field_m[0])) {
            if (!(0 != wl.field_m[0])) {
                System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, wl.field_m, 1);
            if (!(wl.field_m[1] <= 1)) {
                var8 = new byte[wl.field_m[1]];
                jaggl.OpenGL.glGetInfoLogARB(var4, wl.field_m[1], wl.field_m, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (wl.field_m[0] == 0) {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new aq(param3, var4, param1);
    }

    final static cl a(String param0, byte param1) {
        String var2 = null;
        cl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (null != pj.field_a) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var6 = (CharSequence) param0;
              var2 = vu.a(param1 ^ 64, var6);
              if (var2 != null) {
                var3 = (cl) pj.field_a.a(124, (long)var2.hashCode());
                if (param1 == 61) {
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) ((cl) var3).field_I;
                      var4 = vu.a(param1 + 63, var7);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (cl) pj.field_a.a(false);
                        continue L0;
                      } else {
                        return var3;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return (cl) null;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = "GAME PAUSED";
        field_b = -1;
    }
}
