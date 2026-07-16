/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static String field_c;
    static jf field_f;
    static boolean field_e;
    static ea[] field_g;
    private int field_h;
    private int field_b;
    private int[][] field_a;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -7) {
            wm.a(false);
        }
        field_d = null;
    }

    final byte[] a(boolean param0, byte[] param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var11 = MinerDisturbance.field_ab;
          if (param0) {
            break L0;
          } else {
            ((wm) this).field_h = -34;
            break L0;
          }
        }
        L1: {
          if (((wm) this).field_a != null) {
            var3 = 14 + (int)((long)((wm) this).field_h * (long)param1.length / (long)((wm) this).field_b);
            var20 = new int[var3];
            var18 = var20;
            var16 = var18;
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (param1.length <= var7) {
                param1 = new byte[var3];
                var12 = 0;
                var7 = var12;
                L3: while (true) {
                  if ((var12 ^ -1) <= (var3 ^ -1)) {
                    break L1;
                  } else {
                    L4: {
                      var8 = 32768 + var20[var12] >> 1456988656;
                      if (-128 > var8) {
                        param1[var12] = (byte)-128;
                        break L4;
                      } else {
                        if (-128 > (var8 ^ -1)) {
                          param1[var12] = (byte)127;
                          break L4;
                        } else {
                          param1[var12] = (byte)var8;
                          break L4;
                        }
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              } else {
                var8 = param1[var7];
                var19 = ((wm) this).field_a[var6];
                var10 = 0;
                L5: while (true) {
                  if (-15 >= (var10 ^ -1)) {
                    var6 = var6 + ((wm) this).field_h;
                    var10 = var6 / ((wm) this).field_b;
                    var6 = var6 - ((wm) this).field_b * var10;
                    var5 = var5 + var10;
                    var7++;
                    continue L2;
                  } else {
                    var4[var5 + var10] = var4[var5 + var10] + var8 * var19[var10];
                    var10++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return param1;
    }

    final int b(int param0, byte param1) {
        if (((wm) this).field_a != null) {
            param0 = (int)((long)param0 * (long)((wm) this).field_h / (long)((wm) this).field_b);
        }
        if (param1 < 4) {
            return -99;
        }
        return param0;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = MinerDisturbance.field_ab;
        for (var1 = -1 + ke.field_X.length; var1 >= 0; var1--) {
            ke.field_X[var1] = false;
        }
        if (param0) {
            wm.a(false);
        }
    }

    final int a(int param0, byte param1) {
        if (null != ((wm) this).field_a) {
            param0 = 6 + (int)((long)param0 * (long)((wm) this).field_h / (long)((wm) this).field_b);
        }
        if (param1 > -98) {
            int discarded$0 = ((wm) this).b(96, (byte) -119);
        }
        return param0;
    }

    wm(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = sa.a(param1, param0, 0);
          param0 = param0 / var3;
          param1 = param1 / var3;
          ((wm) this).field_b = param0;
          ((wm) this).field_h = param1;
          ((wm) this).field_a = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = ((wm) this).field_a[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (-1 >= (var8 ^ -1)) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = 3.141592653589793 * (-var6 + (double)var8);
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player Name: ";
    }
}
