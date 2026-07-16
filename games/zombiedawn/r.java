/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends eh {
    private int[] field_E;
    static eo field_G;
    private int field_K;
    private int field_D;
    private int[] field_C;
    static String field_J;
    static String field_I;
    int field_M;
    private int[] field_L;
    static boolean field_F;
    private int field_H;

    private final void c(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        int var4 = null != ((r) this).field_E ? ((r) this).field_E.length : 0;
        ga[] var5 = new ga[param2 * var4];
        if (((r) this).field_B != null) {
            if (-1 > (((r) this).field_B.length ^ -1)) {
                if ((var5.length ^ -1) < -1) {
                    if (0 < param1) {
                        for (var6 = 0; var4 > var6; var6++) {
                            gp.a((Object[]) (Object) ((r) this).field_B, param1 * var6, (Object[]) (Object) var5, var6 * param2, Math.min(param1, param2));
                        }
                    }
                }
            }
        }
        ((r) this).field_B = var5;
        if (param0 != 0) {
            this.e(-38, -87, 127);
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          if (param0 == 6199969) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        var3 = 0;
        var4 = wm.field_d;
        L1: while (true) {
          if (var3 >= cj.field_h.length) {
            return -1;
          } else {
            var5 = hd.field_s[var3];
            if ((var5 ^ -1) > -1) {
              var4 = var4 + vl.field_r;
              var3++;
              continue L1;
            } else {
              var6 = tk.a(cj.field_h[var3], true, true);
              var7 = mo.field_b + -(var6 >> 421652161);
              var4 = var4 + fe.field_H;
              if (bf.a(-lk.field_f + var7, param0 ^ 6199969, param2, var4, (lk.field_f << 6199969) + var6, (cn.field_h << 949770209) + qh.field_f, param1)) {
                return var5;
              } else {
                var4 = var4 + ((cn.field_h << -351328543) + fe.field_H - -qh.field_f);
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        int var4 = null == ((r) this).field_E ? 0 : ((r) this).field_E.length;
        if (param0 != -1) {
            Object var8 = null;
            this.a(115, (int[]) null);
        }
        int[] var10 = new int[var4 * param1];
        int[] var9 = var10;
        int[] var5 = var9;
        if (null != ((r) this).field_L) {
            if (((r) this).field_L.length < -1) {
                if (-1 < var10.length) {
                    if (!(-1 <= (param2 ^ -1))) {
                        for (var6 = 0; var6 < var4; var6++) {
                            gp.a(((r) this).field_L, param2 * var6, var5, var6 * param1, Math.min(param2, param1));
                        }
                    }
                }
            }
        }
        ((r) this).field_L = var5;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ga var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (((r) this).field_B.length <= var2) {
              break L1;
            } else {
              if (var3 >= ((r) this).field_E.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (((r) this).field_B.length > var2) {
                    if (var4 < ((r) this).field_C.length) {
                      int incrementValue$1 = var2;
                      var2++;
                      var5 = ((r) this).field_B[incrementValue$1];
                      if (var5 != null) {
                        this.a(127, var5, var3, var4);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (param0 >= 38) {
              break L3;
            } else {
              ((r) this).field_L = null;
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, ga param1, int param2) {
        int var4 = ((r) this).field_K % ((r) this).field_C.length;
        int var5 = ((r) this).field_K / ((r) this).field_C.length;
        ((r) this).field_L[((r) this).field_K] = param2;
        ((r) this).field_B[((r) this).field_K] = param1;
        if (param0 != 0) {
            int discarded$0 = r.b(-106, 119, -26);
        }
        if (!(param1 == null)) {
            this.a(126, param1, var5, var4);
        }
        ((r) this).field_K = ((r) this).field_K + 1;
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        if (!super.a(-42, param1, param2, param3)) {
          var5 = 96 / ((-83 - param0) / 32);
          var6 = param1;
          if (-99 == (var6 ^ -1)) {
            return ((r) this).a((byte) -102, ((r) this).field_C.length, param2);
          } else {
            if (99 != var6) {
              if (var6 == 96) {
                return ((r) this).a(param2, false);
              } else {
                if (97 != var6) {
                  return false;
                } else {
                  return ((r) this).a(12139, param2);
                }
              }
            } else {
              return ((r) this).a(true, param2, ((r) this).field_C.length);
            }
          }
        } else {
          return true;
        }
    }

    r(int param0, int param1, int param2, int param3, io param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        ((r) this).field_K = 0;
        ((r) this).field_M = 92;
        int[] var10 = new int[param5];
        int[] var8 = var10;
        gp.a(var10, 0, param5, 1);
        int[] var9 = new int[param6];
        gp.a(var9, 0, param6, 1);
        this.a(var10, 0);
        this.a(84, var9);
    }

    private final void e(int param0, int param1, int param2) {
        if (param0 != 0) {
            ((r) this).field_C = null;
        }
        int var4 = ((r) this).field_C == null ? 0 : ((r) this).field_C.length;
        ga[] var5 = new ga[var4 * param1];
        if (((r) this).field_B != null) {
            if (0 < ((r) this).field_B.length) {
                if ((var5.length ^ -1) < -1) {
                    if (!((param2 ^ -1) >= -1)) {
                        gp.a((Object[]) (Object) ((r) this).field_B, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param2, param1));
                    }
                }
            }
        }
        ((r) this).field_B = var5;
    }

    final static void a(String param0, int param1, boolean param2, String param3) {
        lk.field_k = param0;
        m.field_B = param3;
        int var4 = -81 % ((72 - param1) / 47);
        ti.a(md.field_wb, param2, false);
    }

    private final void a(int[] param0, int param1) {
        int var8 = ZombieDawn.field_J;
        int var3 = null != ((r) this).field_C ? ((r) this).field_C.length : 0;
        int var4 = param0.length;
        ((r) this).field_C = param0;
        int[] var5 = param0;
        int var6 = param1;
        int var7 = 0;
        while (var5.length > var6) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.c(0, var3, var4);
        this.d(-1, var4, var3);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        if (param1 != 1) {
            ((r) this).field_H = -86;
        }
        return super.a(param0, 1, param2, param3, param4, param5, param6);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(109, param1, param2, param3, param4);
        int var6 = -60 % ((-23 - param0) / 48);
    }

    private final void a(int param0, ga param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var20 = ZombieDawn.field_J;
          var5 = ((r) this).field_C[-1 + ((r) this).field_C.length];
          var6 = ((r) this).field_E[((r) this).field_E.length + -1];
          stackOut_0_0 = ((r) this).field_i;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param3 > 0) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = ((r) this).field_C[-1 + param3];
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0 * stackIn_3_1 / var5;
          stackOut_3_0 = ((r) this).field_n;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 >= param2) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = ((r) this).field_E[param2 + -1];
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0 * stackIn_6_1 / var6;
          var9 = ((r) this).field_i * ((r) this).field_C[param3] / var5;
          var10 = ((r) this).field_n * ((r) this).field_E[param2] / var6;
          var11 = param3 + ((r) this).field_C.length * param2;
          var12 = 48 & ((r) this).field_L[var11];
          var13 = 192 & ((r) this).field_L[var11];
          var14 = param1.field_k;
          if (param0 > 110) {
            break L2;
          } else {
            ((r) this).field_D = 59;
            break L2;
          }
        }
        L3: {
          L4: {
            var15 = param1.field_j;
            var16 = param1.field_i;
            var17 = param1.field_n;
            if ((var16 ^ -1) <= (-var7 + var9 ^ -1)) {
              break L4;
            } else {
              if (-1 == (1 & ((r) this).field_L[var11] ^ -1)) {
                break L4;
              } else {
                var16 = var9 - var7;
                var14 = var7;
                break L3;
              }
            }
          }
          L5: {
            if ((-var7 + var9 ^ -1) <= (var16 ^ -1)) {
              break L5;
            } else {
              if ((4 & ((r) this).field_L[var11] ^ -1) == -1) {
                break L5;
              } else {
                var14 = var7;
                var16 = var9 + -var7;
                break L3;
              }
            }
          }
          if (var12 == 16) {
            var14 = var9 + var7 - var16 >> 1250577089;
            break L3;
          } else {
            if ((var12 ^ -1) != -33) {
              var14 = var7;
              break L3;
            } else {
              var14 = -var16 + var9;
              break L3;
            }
          }
        }
        L6: {
          L7: {
            if (var10 - var8 <= var17) {
              break L7;
            } else {
              if (-1 != (2 & ((r) this).field_L[var11] ^ -1)) {
                var15 = var8;
                var17 = -var8 + var10;
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (var17 <= -var8 + var10) {
              break L8;
            } else {
              if ((8 & ((r) this).field_L[var11] ^ -1) != -1) {
                var17 = -var8 + var10;
                var15 = var8;
                break L6;
              } else {
                break L8;
              }
            }
          }
          if (-65 != (var13 ^ -1)) {
            if (128 == var13) {
              var15 = var10 - var17;
              break L6;
            } else {
              var15 = var8;
              break L6;
            }
          } else {
            var15 = -var17 + var10 + var8 >> 1858572129;
            break L6;
          }
        }
        var18 = ((r) this).field_H;
        var19 = ((r) this).field_D;
        param1.a(125, var15 + var19, var14 - -var18, var16 + -(var18 * 2), -(2 * var19) + var17);
    }

    private final void a(int param0, int[] param1) {
        int var8 = ZombieDawn.field_J;
        int var3 = ((r) this).field_E != null ? ((r) this).field_E.length : 0;
        int var4 = param1.length;
        ((r) this).field_E = param1;
        int[] var5 = param1;
        int var6 = 0;
        int var7 = 0;
        while (var5.length > var6) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        if (param0 < 74) {
            this.c(-22, -86, 61);
        }
        this.e(0, var4, var3);
        this.b((byte) 9, var4, var3);
    }

    final void a(byte param0, int param1, int param2) {
        ((r) this).field_H = param1;
        int var4 = -47 % ((param0 - -45) / 32);
        ((r) this).field_D = param2;
    }

    public static void a(int param0) {
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            return;
        }
        field_G = null;
    }

    private final void b(byte param0, int param1, int param2) {
        if (param0 < 1) {
            int discarded$0 = r.b(-49, -85, 107);
        }
        int var4 = null == ((r) this).field_C ? 0 : ((r) this).field_C.length;
        int[] var5 = new int[param1 * var4];
        if (null != ((r) this).field_L) {
            if (((r) this).field_L.length > 0) {
                if ((var5.length ^ -1) < -1) {
                    if (!(param2 <= 0)) {
                        gp.a(((r) this).field_L, 0, var5, 0, Math.min(param2, param1) * var4);
                    }
                }
            }
        }
        ((r) this).field_L = var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Change display name";
        field_I = "No highscores";
        field_F = false;
    }
}
