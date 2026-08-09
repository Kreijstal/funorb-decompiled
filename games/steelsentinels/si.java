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
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 > 12) {
              var1_int = 255;
              var2 = 0;
              L1: while (true) {
                if (var2 >= 50) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  pb.c(0, var2, 640, 1052688, var1_int);
                  var1_int -= 5;
                  var2++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "si.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(gh param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        gh var5 = null;
        String var6 = null;
        gh var7 = null;
        int var8 = 0;
        gh var9 = null;
        int var10 = 0;
        gh var11 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (1 != fg.field_Ob) {
                stackIn_4_0 = 64;
                break L1;
              } else {
                stackIn_4_0 = 78;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if ((1008 & fg.field_Ob) != 0) {
                var3_int = 36;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var4 = qa.field_O;
              var5 = new gh(-1L, (gh) null);
              var5.field_Pb = gj.field_a;
              var5.field_Kb = 2;
              var5.a(0, param2, 18, 0, var4);
              param0.a(var5, 118);
              var6 = cm.field_p;
              var7 = new gh(-1L, kh.field_s, var6);
              var7.field_nb = 0;
              var7.field_L = (mi) ((Object) pl.field_U);
              if (param1) {
                break L3;
              } else {
                var11 = (gh) null;
                si.a((gh) null, true, -1);
                break L3;
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
            L4: while (true) {
              if (var8 >= ue.field_c.length) {
                stackIn_15_0 = param2;
                break L0;
              } else {
                if (ue.field_c[var8] != null) {
                  var9 = ff.a(false, 1 + var8, ue.field_c[var8]);
                  param2 += 2;
                  var9.a(0, param2, var3_int, 0, var4);
                  param2 = param2 + var3_int;
                  param0.a(var9, 126);
                  var8++;
                  continue L4;
                } else {
                  var8++;
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("si.P(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_15_0;
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
            si.b(30);
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
        il var8 = null;
        il var9 = null;
        if (!(param0 != null)) {
            this.field_h = null;
            return;
        }
        if (param4 == this.field_x && this.field_s && this.field_r == 2 && this.field_n != null && this.field_n.equals(param0)) {
            return;
        }
        try {
            this.field_x = param4;
            this.field_n = param0;
            if (!param1) {
                this.field_z = -7;
            }
            this.field_r = 2;
            this.field_s = true;
            var8 = this.a(param0, (byte) 118, param4, param3);
            var9 = var8;
            var9.field_f[0] = param2 + -param4.c(param0);
            var9.field_f[param0.length()] = param2;
            kk.a(var9, 110, 0, param0, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "si.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3, mi param4) {
        il var7 = null;
        il var8 = null;
        if (!(param1 != null)) {
            this.field_h = null;
            return;
        }
        if (param2 < 19) {
            return;
        }
        if (param4 == this.field_x && this.field_s && 0 == this.field_r && this.field_n != null && this.field_n.equals(param1)) {
            return;
        }
        try {
            this.field_s = true;
            this.field_n = param1;
            this.field_r = 0;
            this.field_x = param4;
            var7 = this.a(param1, (byte) 117, param4, param3);
            var8 = var7;
            var7.field_f[0] = param0;
            var8.field_f[param1.length()] = param4.c(param1) + param0;
            kk.a(var8, 95, 0, param1, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "si.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, String param1, int param2, int param3, mi param4) {
        il var8 = null;
        int var7 = 0;
        if (!(param1 != null)) {
            this.field_h = null;
            return;
        }
        if (param4 == this.field_x && this.field_s && (this.field_r ^ -1) == -2 && null != this.field_n && this.field_n.equals(param1)) {
            return;
        }
        try {
            if (param3 != -1385548511) {
                si.c(24);
            }
            this.field_x = param4;
            this.field_r = 1;
            this.field_s = true;
            var8 = this.a(param1, (byte) 117, param4, param2);
            var7 = param4.c(param1);
            var8.field_f[0] = param0 - (var7 >> -1385548511);
            var8.field_f[param1.length()] = (var7 >> -1822721791) + param0;
            kk.a(var8, param3 ^ -1385548469, 0, param1, param4);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "si.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4, mi param5, int param6, int param7) {
        il stackIn_34_0;
        il stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        il stackIn_35_0 = null;
        il stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        il stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        il stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        il var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (0 != param2) {
                break L1;
              } else {
                param2 = param5.field_W;
                break L1;
              }
            }
            if (param3 == null) {
              this.field_h = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_x != param5) {
                  break L2;
                } else {
                  if (this.field_s) {
                    break L2;
                  } else {
                    if (param1 != this.field_r) {
                      break L2;
                    } else {
                      if (param4 != this.field_B) {
                        break L2;
                      } else {
                        if (param2 != this.field_z) {
                          break L2;
                        } else {
                          if (this.field_q != param6) {
                            break L2;
                          } else {
                            if (this.field_G != param0) {
                              break L2;
                            } else {
                              if (null == this.field_n) {
                                break L2;
                              } else {
                                if (this.field_n.equals(param3)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
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
              L3: {
                this.field_s = false;
                this.field_z = param2;
                this.field_B = param4;
                this.field_n = param3;
                this.field_q = param6;
                this.field_x = param5;
                this.field_r = param1;
                this.field_G = param0;
                var16 = new String[param5.b(param3, param0) + param7];
                var17 = var16;
                var10 = Math.max(1, param5.a(param3, new int[]{param0}, var17));
                if (-4 != (this.field_B ^ -1)) {
                  break L3;
                } else {
                  if (1 != var10) {
                    break L3;
                  } else {
                    this.field_B = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_B != 0) {
                  if (1 != this.field_B) {
                    if (this.field_B == 2) {
                      var11 = -(this.field_z * var10) + (this.field_q - param5.field_F);
                      break L4;
                    } else {
                      L5: {
                        var12 = (this.field_q + -(this.field_z * var10)) / (var10 - -1);
                        if (var12 >= 0) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      this.field_z = this.field_z + var12;
                      var11 = var12 + param5.field_G;
                      break L4;
                    }
                  } else {
                    var11 = (-(var10 * this.field_z) + this.field_q >> -823008671) + param5.field_G;
                    break L4;
                  }
                } else {
                  var11 = param5.field_G;
                  break L4;
                }
              }
              this.field_h = new il[var10];
              var12 = 0;
              L6: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackIn_34_0 = null;

                    stackIn_34_1 = null;

                    stackIn_34_2 = -param5.field_G + var11;

                    stackIn_34_3 = var11 + param5.field_F;

                    if (var13 != null) {
                      stackIn_35_0 = null;
                      stackIn_35_1 = null;
                      stackIn_35_2 = stackIn_34_2;
                      stackIn_35_3 = stackIn_34_3;
                      stackIn_35_4 = var13.length();
                      break L7;
                    } else {
                      stackIn_35_0 = null;
                      stackIn_35_1 = null;
                      stackIn_35_2 = stackIn_34_2;
                      stackIn_35_3 = stackIn_34_3;
                      stackIn_35_4 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new il(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                    var14.field_f[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_f[var13.length()] = param5.c(var13);
                        stackIn_38_0 = (il) (var14);

                        stackIn_38_1 = param7 + -63;

                        if (3 == param1) {
                          stackIn_39_0 = (il) ((Object) stackIn_38_0);
                          stackIn_39_1 = stackIn_38_1;
                          stackIn_39_2 = this.a(var13, param0, param5.c(var13), (byte) 116);
                          break L9;
                        } else {
                          stackIn_39_0 = (il) ((Object) stackIn_38_0);
                          stackIn_39_1 = stackIn_38_1;
                          stackIn_39_2 = 0;
                          break L9;
                        }
                      }
                      kk.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, var13, param5);
                      break L8;
                    }
                  }
                  this.field_h[var12] = var14;
                  var11 = var11 + param2;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var9);

            stackIn_44_1 = new StringBuilder().append("si.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L10;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L11;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_45_0), stackIn_48_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final il a(String param0, byte param1, mi param2, int param3) {
        il var5 = null;
        RuntimeException var5_ref = null;
        il var6 = null;
        il stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 116) {
                break L1;
              } else {
                field_k = (int[]) null;
                break L1;
              }
            }
            var6 = new il(-param2.field_G + param3, param2.field_F + param3, param0.length());
            var5 = var6;
            this.field_h = new il[]{var6};
            stackIn_3_0 = (il) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("si.L(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public si() {
    }

    static {
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
