/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static he[] field_f;
    private int field_g;
    static he[] field_b;
    private int field_e;
    private int[][] field_a;
    static k field_c;
    static String[] field_d;

    final byte[] a(byte[] param0, byte param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        L0: {
          var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 == -128) {
            break L0;
          } else {
            var12 = null;
            og discarded$1 = ng.a((String) null, 126);
            break L0;
          }
        }
        L1: {
          if (((ng) this).field_a == null) {
            break L1;
          } else {
            var3 = 14 + (int)((long)param0.length * (long)((ng) this).field_e / (long)((ng) this).field_g);
            var21 = new int[var3];
            var19 = var21;
            var17 = var19;
            var15 = var17;
            var4 = var15;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (param0.length <= var7) {
                param0 = new byte[var3];
                var13 = 0;
                var7 = var13;
                L3: while (true) {
                  if (var13 >= var3) {
                    break L1;
                  } else {
                    var8 = var21[var13] - -32768 >> -2114772624;
                    if ((var8 ^ -1) > 127) {
                      param0[var13] = (byte)-128;
                      var13++;
                      continue L3;
                    } else {
                      if (127 >= var8) {
                        param0[var13] = (byte)var8;
                        var13++;
                        continue L3;
                      } else {
                        param0[var13] = (byte)127;
                        var13++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8 = param0[var7];
                var20 = ((ng) this).field_a[var6];
                var10 = 0;
                L4: while (true) {
                  if (var10 >= 14) {
                    var6 = var6 + ((ng) this).field_e;
                    var10 = var6 / ((ng) this).field_g;
                    var6 = var6 - var10 * ((ng) this).field_g;
                    var5 = var5 + var10;
                    var7++;
                    continue L2;
                  } else {
                    var4[var5 - -var10] = var4[var5 - -var10] + var20[var10] * var8;
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return param0;
    }

    final int a(int param0, byte param1) {
        if (((ng) this).field_a != null) {
            param0 = (int)((long)param0 * (long)((ng) this).field_e / (long)((ng) this).field_g) + 6;
        }
        if (param1 != 101) {
            field_c = null;
        }
        return param0;
    }

    final static og a(String param0, int param1) {
        if (hg.field_ub == lc.field_h) {
            return null;
        }
        if (param1 != 3582) {
            return null;
        }
        if (wg.field_u == lc.field_h) {
            if (param0.equals((Object) (Object) cm.field_I)) {
                lc.field_h = pj.field_D;
                return kf.field_a;
            }
        }
        kf.field_a = null;
        cm.field_I = param0;
        lc.field_h = hg.field_ub;
        return null;
    }

    final int a(byte param0, int param1) {
        if (!(((ng) this).field_a == null)) {
            param1 = (int)((long)param1 * (long)((ng) this).field_e / (long)((ng) this).field_g);
        }
        if (param0 != -128) {
            return 107;
        }
        return param1;
    }

    ng(int param0, int param1) {
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
          var3 = qe.a((byte) 26, param0, param1);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((ng) this).field_a = new int[param0][14];
          ((ng) this).field_g = param0;
          ((ng) this).field_e = param1;
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
            } else {
              L1: {
                var5 = ((ng) this).field_a[var4];
                var6 = 6.0 + (double)var4 / (double)param0;
                var8 = (int)Math.floor(var6 - 7.0 + 1.0);
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (14 >= var9) {
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
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
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
                  var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * ((double)var8 - var6)) + 0.54);
                  var5[var8] = (int)Math.floor(var14 * 65536.0 + 0.5);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            field_c = null;
        }
        field_d = null;
        field_c = null;
        field_f = null;
    }

    static {
    }
}
