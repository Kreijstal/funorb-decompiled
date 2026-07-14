/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends da {
    static String field_F;
    static String field_u;
    private int field_G;
    static int[] field_k;
    static boolean field_y;
    private int field_z;
    static rj field_o;
    static String field_w;
    static boolean field_p;
    private int field_B;
    static gh field_v;
    private int field_q;
    static nb field_A;
    static gk[] field_l;
    private int field_r;
    private String field_n;
    static int field_m;
    private mi field_x;
    static String[] field_D;
    static String[] field_j;
    static String field_C;
    private boolean field_s;
    static String[] field_H;
    static int field_t;
    static wk[] field_E;

    final static void c(int param0) {
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        if (param0 <= 12) {
            return;
        }
        int var1 = 255;
        for (var2 = 0; var2 < 50; var2++) {
            pb.c(0, var2, 640, 1052688, var1);
            var1 -= 5;
        }
    }

    final static int a(gh param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        gh var5 = null;
        String var6 = null;
        gh var7 = null;
        int var8 = 0;
        gh var9 = null;
        int var10 = 0;
        Object var11 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = SteelSentinels.field_G;
          if (1 != fg.field_Ob) {
            stackOut_2_0 = 64;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 78;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if ((1008 & fg.field_Ob) != 0) {
            var3 = 36;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var4 = qa.field_O;
          var5 = new gh(-1L, (gh) null);
          var5.field_Pb = gj.field_a;
          var5.field_Kb = 2;
          var5.a(0, param2, 18, 0, var4);
          param0.a(var5, 118);
          var6 = cm.field_p;
          var7 = new gh(-1L, kh.field_s, var6);
          var7.field_nb = 0;
          var7.field_L = (mi) (Object) pl.field_U;
          if (param1) {
            break L2;
          } else {
            var11 = null;
            int discarded$1 = si.a((gh) null, true, -1);
            break L2;
          }
        }
        var7.a(0, param2, 18, 0, var4);
        var7.field_Fb = 1;
        var7.field_sb = 1;
        var7.field_I = null;
        var7.field_Kb = 1;
        param0.a(var7, 119);
        param2 = param2 + var7.field_Lb;
        var8 = 0;
        L3: while (true) {
          if (var8 >= ue.field_c.length) {
            return param2;
          } else {
            if (ue.field_c[var8] != null) {
              var9 = ff.a(false, 1 + var8, ue.field_c[var8]);
              param2 += 2;
              var9.a(0, param2, var3, 0, var4);
              param2 = param2 + var3;
              param0.a(var9, 126);
              var8++;
              continue L3;
            } else {
              var8++;
              continue L3;
            }
          }
        }
    }

    final static ik b(int param0) {
        String var1 = jj.a(true);
        if (param0 != 64) {
            si.c(-82);
        }
        if (var1 != null) {
            if (!((var1.indexOf('@') ^ -1) > -1)) {
                var1 = "";
            }
        }
        return new ik(jj.a(true), wl.j(param0 ^ 16777151));
    }

    public static void a(int param0) {
        field_u = null;
        field_A = null;
        field_j = null;
        field_k = null;
        field_D = null;
        field_w = null;
        if (param0 != 24) {
            ik discarded$0 = si.b(30);
        }
        field_o = null;
        field_v = null;
        field_E = null;
        field_H = null;
        field_F = null;
        field_C = null;
        field_l = null;
    }

    final void a(String param0, boolean param1, int param2, int param3, mi param4) {
        if (!(param0 != null)) {
            ((si) this).field_h = null;
            return;
        }
        if (param4 == ((si) this).field_x) {
            if (((si) this).field_s) {
                if (((si) this).field_r == 2) {
                    if (((si) this).field_n != null) {
                        if (((si) this).field_n.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((si) this).field_x = param4;
        ((si) this).field_n = param0;
        if (!param1) {
            ((si) this).field_z = -7;
        }
        ((si) this).field_r = 2;
        ((si) this).field_s = true;
        il var8 = this.a(param0, (byte) 118, param4, param3);
        il var9 = var8;
        var9.field_f[0] = param2 + -param4.c(param0);
        var9.field_f[param0.length()] = param2;
        kk.a(var9, 110, 0, param0, param4);
    }

    final void a(int param0, String param1, int param2, int param3, mi param4) {
        if (!(param1 != null)) {
            ((si) this).field_h = null;
            return;
        }
        if (param2 < 19) {
            return;
        }
        if (param4 == ((si) this).field_x) {
            if (((si) this).field_s) {
                if (0 == ((si) this).field_r) {
                    if (((si) this).field_n != null) {
                        if (((si) this).field_n.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((si) this).field_s = true;
        ((si) this).field_n = param1;
        ((si) this).field_r = 0;
        ((si) this).field_x = param4;
        il var7 = this.a(param1, (byte) 117, param4, param3);
        il var8 = var7;
        var7.field_f[0] = param0;
        var8.field_f[param1.length()] = param4.c(param1) + param0;
        kk.a(var8, 95, 0, param1, param4);
    }

    final void b(int param0, String param1, int param2, int param3, mi param4) {
        if (!(param1 != null)) {
            ((si) this).field_h = null;
            return;
        }
        if (param4 == ((si) this).field_x) {
            if (((si) this).field_s) {
                if ((((si) this).field_r ^ -1) == -2) {
                    if (null != ((si) this).field_n) {
                        if (((si) this).field_n.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        if (param3 != -1385548511) {
            si.c(24);
        }
        ((si) this).field_x = param4;
        ((si) this).field_r = 1;
        ((si) this).field_s = true;
        il var8 = this.a(param1, (byte) 117, param4, param2);
        int var7 = param4.c(param1);
        var8.field_f[0] = param0 - (var7 >> -1385548511);
        var8.field_f[param1.length()] = (var7 >> -1822721791) + param0;
        kk.a(var8, param3 ^ -1385548469, 0, param1, param4);
    }

    final void a(int param0, int param1, int param2, String param3, int param4, mi param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        il var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        il stackIn_31_0 = null;
        il stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        il stackIn_32_0 = null;
        il stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        il stackIn_33_0 = null;
        il stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        il stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        il stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        il stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        il stackOut_30_0 = null;
        il stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        il stackOut_32_0 = null;
        il stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        il stackOut_31_0 = null;
        il stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        il stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        il stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        il stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        L0: {
          var15 = SteelSentinels.field_G;
          if (0 != param2) {
            break L0;
          } else {
            param2 = param5.field_W;
            break L0;
          }
        }
        if (param3 == null) {
          ((si) this).field_h = null;
          return;
        } else {
          L1: {
            if (((si) this).field_x != param5) {
              break L1;
            } else {
              if (((si) this).field_s) {
                break L1;
              } else {
                if (param1 != ((si) this).field_r) {
                  break L1;
                } else {
                  if (param4 != ((si) this).field_B) {
                    break L1;
                  } else {
                    if (param2 != ((si) this).field_z) {
                      break L1;
                    } else {
                      if (((si) this).field_q != param6) {
                        break L1;
                      } else {
                        if (((si) this).field_G != param0) {
                          break L1;
                        } else {
                          if (null == ((si) this).field_n) {
                            break L1;
                          } else {
                            if (((si) this).field_n.equals((Object) (Object) param3)) {
                              return;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((si) this).field_s = false;
            ((si) this).field_z = param2;
            ((si) this).field_B = param4;
            ((si) this).field_n = param3;
            ((si) this).field_q = param6;
            ((si) this).field_x = param5;
            ((si) this).field_r = param1;
            ((si) this).field_G = param0;
            var16 = new String[param5.b(param3, param0) + param7];
            var17 = var16;
            var10 = Math.max(1, param5.a(param3, new int[1], var17));
            if (-4 != (((si) this).field_B ^ -1)) {
              break L2;
            } else {
              if (1 != var10) {
                break L2;
              } else {
                ((si) this).field_B = 1;
                break L2;
              }
            }
          }
          L3: {
            if (((si) this).field_B != 0) {
              if (1 != ((si) this).field_B) {
                if (((si) this).field_B == 2) {
                  var11 = -(((si) this).field_z * var10) + (((si) this).field_q - param5.field_F);
                  break L3;
                } else {
                  L4: {
                    var12 = (((si) this).field_q + -(((si) this).field_z * var10)) / (var10 - -1);
                    if (var12 >= 0) {
                      break L4;
                    } else {
                      var12 = 0;
                      break L4;
                    }
                  }
                  ((si) this).field_z = ((si) this).field_z + var12;
                  var11 = var12 + param5.field_G;
                  break L3;
                }
              } else {
                var11 = (-(var10 * ((si) this).field_z) + ((si) this).field_q >> -823008671) + param5.field_G;
                break L3;
              }
            } else {
              var11 = param5.field_G;
              break L3;
            }
          }
          ((si) this).field_h = new il[var10];
          var12 = 0;
          L5: while (true) {
            if (var10 <= var12) {
              return;
            } else {
              L6: {
                var13 = var16[var12];
                stackOut_30_0 = null;
                stackOut_30_1 = null;
                stackOut_30_2 = -param5.field_G + var11;
                stackOut_30_3 = var11 + param5.field_F;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                if (var13 != null) {
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = var13.length();
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  break L6;
                } else {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = 0;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_33_4 = stackOut_31_4;
                  break L6;
                }
              }
              L7: {
                new il(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                var14 = stackIn_33_0;
                var14.field_f[0] = 0;
                if (var13 == null) {
                  break L7;
                } else {
                  L8: {
                    var14.field_f[var13.length()] = param5.c(var13);
                    stackOut_34_0 = (il) var14;
                    stackOut_34_1 = param7 + -63;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    if (3 == param1) {
                      stackOut_36_0 = (il) (Object) stackIn_36_0;
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = ((si) this).a(var13, param0, param5.c(var13), (byte) 116);
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      break L8;
                    } else {
                      stackOut_35_0 = (il) (Object) stackIn_35_0;
                      stackOut_35_1 = stackIn_35_1;
                      stackOut_35_2 = 0;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      break L8;
                    }
                  }
                  kk.a(stackIn_37_0, stackIn_37_1, stackIn_37_2, var13, param5);
                  break L7;
                }
              }
              ((si) this).field_h[var12] = var14;
              var11 = var11 + param2;
              var12++;
              continue L5;
            }
          }
        }
    }

    private final il a(String param0, byte param1, mi param2, int param3) {
        if (param1 < 116) {
            field_k = null;
        }
        il var6 = new il(-param2.field_G + param3, param2.field_F + param3, param0.length());
        il var5 = var6;
        ((si) this).field_h = new il[]{var6};
        return var5;
    }

    public si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Default head for the <%0>-class sentinel.";
        field_w = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_k = new int[]{92, 106, 48, 24, 24, 24, 95, 24, 24, 24, 24, 93, 37, 37, 37, 52, 9, 14, 27, 20, 31, 4, -1, -1};
        field_p = true;
        field_u = "This game option has not yet been unlocked for use.";
        field_m = 0;
        field_H = new String[]{"WOE TO THE CONQUERED!", "PROCEED ON YOUR WAY TO OBLIVION.", "HAVE YOU NOTHING ELSE?", "THIS WORLD IS MINE."};
        field_D = new String[]{"POWER GENERATION", "ENERGY STORAGE", "ENERGY SHIELDING", "ARMOUR", "TARGETING", "WEAPON ENHANCEMENT", "TRANSPORTATION", "OTHER"};
        field_C = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
