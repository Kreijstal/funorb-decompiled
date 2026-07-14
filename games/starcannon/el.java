/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends dk {
    int field_K;
    int field_F;
    int field_G;
    static boolean[] field_D;
    int field_E;
    static String[] field_A;
    static hl[] field_H;
    int field_I;
    static hl field_J;
    int field_B;

    public static void e(byte param0) {
        field_J = null;
        field_H = null;
        field_D = null;
        field_A = null;
        if (param0 > 107) {
            return;
        }
        field_D = null;
    }

    final static void a(gi param0, int param1, int param2, boolean param3) {
        qc.field_g = param1;
        u.field_c = param0;
        if (!param3) {
            field_J = null;
            qf.field_g = param2;
            return;
        }
        qf.field_g = param2;
    }

    final static jk[] a(boolean param0, ka param1) {
        int[] var3 = null;
        jk[] var4 = null;
        int var5 = 0;
        jk var6 = null;
        Object var7 = null;
        bk var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        jk[] var12 = null;
        jk[] var13 = null;
        int[] var14 = null;
        if (!param1.a((byte) -68)) {
          return new jk[]{};
        } else {
          var8 = param1.a(-125);
          L0: while (true) {
            if (-1 != (var8.field_b ^ -1)) {
              if (var8.field_b != 2) {
                var14 = (int[]) var8.field_f;
                var11 = var14;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                if (!param0) {
                  var12 = new jk[var14.length >> 827280002];
                  var4 = var12;
                  var5 = 0;
                  L1: while (true) {
                    if (var12.length <= var5) {
                      return var4;
                    } else {
                      var6 = new jk();
                      var4[var5] = var6;
                      var6.field_d = var3[var5 << 1248969634];
                      var6.field_h = var3[1 + (var5 << -1272785630)];
                      var6.field_e = var3[(var5 << 995543394) + 2];
                      var6.field_i = var3[(var5 << -738708286) + 3];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  var7 = null;
                  el.a((gi) null, 30, 44, true);
                  var13 = new jk[var14.length >> 827280002];
                  var4 = var13;
                  var5 = 0;
                  L2: while (true) {
                    if (var13.length <= var5) {
                      return var4;
                    } else {
                      var6 = new jk();
                      var4[var5] = var6;
                      var6.field_d = var3[var5 << 1248969634];
                      var6.field_h = var3[1 + (var5 << -1272785630)];
                      var6.field_e = var3[(var5 << 995543394) + 2];
                      var6.field_i = var3[(var5 << -738708286) + 3];
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new jk[]{};
              }
            } else {
              uc.a(-108, 10L);
              continue L0;
            }
          }
        }
    }

    final static hl[] b(int param0, int param1, int param2, int param3) {
        if (param1 != 22396) {
            return null;
        }
        return oj.a(-1, param0, 1, param2, param3);
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = StarCannon.field_A;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -param2 + (-((el) this).field_s + -((el) this).field_K) + param5;
          var9 = param1 + (-((el) this).field_G + (-((el) this).field_j + -param3));
          if (var9 * var9 + var8 * var8 < ((el) this).field_I * ((el) this).field_I) {
            var10 = Math.atan2((double)var9, (double)var8) - qd.field_z;
            if (0.0 <= var10) {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)((el) this).field_B;
                ((el) this).field_F = (int)((double)((el) this).field_B * var10 / 6.283185307179586);
                L0: while (true) {
                  if (((el) this).field_B <= ((el) this).field_F) {
                    ((el) this).field_F = ((el) this).field_F - ((el) this).field_B;
                    continue L0;
                  } else {
                    L1: while (true) {
                      if (-1 >= (((el) this).field_F ^ -1)) {
                        return true;
                      } else {
                        ((el) this).field_F = ((el) this).field_F + ((el) this).field_B;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                ((el) this).field_F = (int)((double)((el) this).field_B * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((el) this).field_B <= ((el) this).field_F) {
                    ((el) this).field_F = ((el) this).field_F - ((el) this).field_B;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (-1 >= (((el) this).field_F ^ -1)) {
                        return true;
                      } else {
                        ((el) this).field_F = ((el) this).field_F + ((el) this).field_B;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((el) this).field_B;
              ((el) this).field_F = (int)((double)((el) this).field_B * var10 / 6.283185307179586);
              L4: while (true) {
                if (((el) this).field_B <= ((el) this).field_F) {
                  ((el) this).field_F = ((el) this).field_F - ((el) this).field_B;
                  continue L4;
                } else {
                  L5: while (true) {
                    if (-1 >= (((el) this).field_F ^ -1)) {
                      return true;
                    } else {
                      ((el) this).field_F = ((el) this).field_F + ((el) this).field_B;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private el() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new boolean[64];
        field_A = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
