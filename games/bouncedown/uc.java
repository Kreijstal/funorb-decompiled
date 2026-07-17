/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends lc implements rc {
    private tj field_F;
    private wd[] field_H;
    private int field_B;
    private int[] field_J;
    private sh field_I;
    static int[] field_D;
    private String field_z;
    static int field_A;
    static lj field_E;
    static int field_C;

    uc(sh param0, tj param1, String param2) {
        super(0, 0, 288, 0, (fc) null);
        int var4_int = 0;
        ((uc) this).field_B = 0;
        try {
            ((uc) this).field_I = param0;
            ((uc) this).field_F = param1;
            ((uc) this).field_z = param2;
            var4_int = null != ((uc) this).field_z ? ((uc) this).field_F.b(((uc) this).field_z, 260, ((uc) this).field_F.field_s) : 0;
            ((uc) this).b(var4_int + 22, 80, 288, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "uc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final wd a(String param0, sk param1, int param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var4 = new wd(param0, param1);
              var4.field_j = (fc) (Object) new jh();
              var5 = -2 + ((uc) this).field_m;
              ((uc) this).b(((uc) this).field_m - -34, 80, ((uc) this).field_k, 0, 0);
              var4.b(30, param2 + 84, -14 + ((uc) this).field_k, 7, var5);
              ((uc) this).b((lk) (Object) var4, true);
              if (param2 == -4) {
                break L1;
              } else {
                boolean discarded$2 = uc.a(-89, 'ﾁ');
                break L1;
              }
            }
            stackOut_2_0 = (wd) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("uc.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 <= 33) {
          this.a(78, 87);
          super.a(param0, param1, 50, param3);
          int discarded$2 = ((uc) this).field_F.a(((uc) this).field_z, 14 + (param3 - -((uc) this).field_r), ((uc) this).field_i + (param1 - -10), -28 + ((uc) this).field_k, ((uc) this).field_m, 16777215, -1, 0, 0, ((uc) this).field_F.field_s);
          return;
        } else {
          super.a(param0, param1, 50, param3);
          int discarded$3 = ((uc) this).field_F.a(((uc) this).field_z, 14 + (param3 - -((uc) this).field_r), ((uc) this).field_i + (param1 - -10), -28 + ((uc) this).field_k, ((uc) this).field_m, 16777215, -1, 0, 0, ((uc) this).field_F.field_s);
          return;
        }
    }

    final void a(String param0, int param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = ((uc) this).field_B;
            this.a(-28, var4_int + 1);
            if (param2 <= 58) {
                ((uc) this).field_I = null;
            }
            ((uc) this).field_H[var4_int] = ((uc) this).a(param0, (sk) this, -4);
            ((uc) this).field_J[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "uc.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void e(byte param0) {
        field_E = null;
        field_D = null;
        if (param0 != 28) {
            uc.e((byte) 127);
        }
    }

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (md.a(param0 + 108, param1)) {
            return true;
          } else {
            if (param1 != 45) {
              if (param1 != 160) {
                if (param1 != 32) {
                  if (param1 != 95) {
                    if (param0 != 2) {
                      field_C = -128;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Bounce.field_N;
        if (!(param1 > ((uc) this).field_B)) {
            return;
        }
        wd[] var7 = new wd[param1];
        wd[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; ((uc) this).field_B > var5; var5++) {
            var7[var5] = ((uc) this).field_H[var5];
            var4[var5] = ((uc) this).field_J[var5];
        }
        ((uc) this).field_J = var4;
        ((uc) this).field_B = param1;
        var5 = -52 % ((-62 - param0) / 34);
        ((uc) this).field_H = var3;
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (((uc) this).field_B <= var6_int) {
                  break L2;
                } else {
                  if (param4 == ((uc) this).field_H[var6_int]) {
                    var7 = ((uc) this).field_J[var6_int];
                    if (var7 == -1) {
                      ((uc) this).field_I.a(true);
                      break L2;
                    } else {
                      oh.a(104, ((uc) this).field_J[var6_int]);
                      break L2;
                    }
                  } else {
                    var6_int++;
                    var6_int++;
                    continue L1;
                  }
                }
              }
              if (param0 >= 6) {
                break L0;
              } else {
                ((uc) this).field_F = null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("uc.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static void a(gk param0, int param1, gk param2, gk param3) {
        RuntimeException var4 = null;
        we[] var5 = null;
        we[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        we[] var10 = null;
        tg var11 = null;
        int var11_int = 0;
        tg var12 = null;
        int var13 = 0;
        we[] var14 = null;
        tg var15 = null;
        int[][] var16 = null;
        tg var17 = null;
        tg var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = Bounce.field_N;
        try {
          L0: {
            ij.field_c = vh.a(param0, "commonui", (byte) -38, "frame_top");
            de.field_d = vh.a(param0, "commonui", (byte) 114, "frame_bottom");
            fd.field_m = nc.a("jagex_logo_grey", param0, "commonui", 0);
            ih.field_T = vh.a(param0, "commonui", (byte) 111, "button");
            la.field_E = ri.a("commonui", param0, false, "validation");
            qj.field_d = (tj) (Object) eg.a(param2, "arezzo12", 127, param0, "commonui");
            sg.field_a = (tj) (Object) eg.a(param2, "arezzo14", 122, param0, "commonui");
            ne.field_v = (tj) (Object) eg.a(param2, "arezzo14bold", 117, param0, "commonui");
            var17 = new tg(param3.b("button.gif", "", 124), (java.awt.Component) (Object) ch.field_h);
            we discarded$2 = s.a(param0, "dropdown", 28576, "commonui");
            var5 = ff.a("screen_options", param0, (byte) 124, "commonui");
            nh.field_R = new we[4];
            ga.field_d = new we[4];
            tc.field_s = new we[4];
            var6 = new we[][]{ga.field_d, tc.field_s, nh.field_R};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_i;
            var8 = 1;
            L1: while (true) {
              if (var21.length <= var8) {
                var8 = var5[0].field_j[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (var9 >= 3) {
                    var9 = var17.field_q;
                    int discarded$3 = 1;
                    wa.a();
                    var17.d();
                    na.f(0, 0, na.field_e, na.field_k);
                    var15 = new tg(var9, var9);
                    var18 = var15;
                    var18.d();
                    var17.b(0, 0);
                    var11 = new tg(var9, var9);
                    var11.d();
                    var17.b(-var17.field_s + var9, 0);
                    var12 = new tg(var17.field_s + -(2 * var9), var9);
                    var12.d();
                    var17.b(-var9, 0);
                    ve.a(-125);
                    ih.field_T = new tg[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = jd.a(-30894, var21[var11_int], var5[var9]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("uc.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(118).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
        field_E = new lj();
        field_C = 0;
    }
}
