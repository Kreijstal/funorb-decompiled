/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends kd {
    static int[] field_E;
    int[] field_F;
    static int[] field_B;
    static int[] field_A;
    private int[][] field_z;
    static int field_C;
    static ul field_H;
    private String[] field_G;
    private int[] field_D;
    static wk field_y;

    final void c(byte param0) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        int var2 = -79 % ((param0 - -50) / 55);
        if (((ao) this).field_F != null) {
            for (var3 = 0; var3 < ((ao) this).field_F.length; var3++) {
                ((ao) this).field_F[var3] = vn.a(((ao) this).field_F[var3], 32768);
            }
        }
    }

    final static String[] a(mi param0, int[] param1, int param2, String param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    if (jh.field_b != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    jh.field_b = new String[16];
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        var4 = param0.a(param3, param1, jh.field_b);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) caughtException;
                    if ((jh.field_b.length ^ -1) > -1025) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return null;
                }
                case 6: {
                    jh.field_b = new String[jh.field_b.length << -241155903];
                    statePc = 2;
                    continue stateLoop;
                }
                case 7: {
                    var5 = new String[var4];
                    var6 = 0;
                    if (param2 == 18985) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    field_B = null;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var4 <= var6) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5[var6] = jh.field_b[var6];
                    var6++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 11: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String i(int param0) {
        int var3 = 0;
        int var4 = SteelSentinels.field_G;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (!(((ao) this).field_G != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((ao) this).field_G[0]);
        for (var3 = param0; ((ao) this).field_G.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((ao) this).field_G[var3]);
        }
        return var2.toString();
    }

    public static void g(int param0) {
        field_B = null;
        field_H = null;
        field_A = null;
        if (param0 != 0) {
            return;
        }
        field_E = null;
        field_y = null;
    }

    final void a(gi param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        if (param1 < -68) {
          L0: while (true) {
            var3 = param0.f((byte) -85);
            if (var3 != 0) {
              this.a(var3, param0, 100);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void h(int param0) {
        ub.c(param0);
        if (null != sl.field_n) {
            pa.a(sl.field_n, 9174);
        }
        ma.g(0);
        og.b(-115);
        ln.a(param0 ^ -8601);
        if (rn.a((byte) -14)) {
            mm.field_g.a(1, (byte) -117);
            gj.a(0, 0);
        }
        pm.m(param0 + -47);
    }

    ao() {
    }

    private final void a(int param0, gi param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fm var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = SteelSentinels.field_G;
          if (param0 == -2) {
            ((ao) this).field_G = ka.a('<', false, param1.h(1));
            break L0;
          } else {
            if (-3 == param0) {
              var4 = param1.f((byte) -114);
              ((ao) this).field_F = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((ao) this).field_F[var5] = param1.c((byte) -60);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (3 == param0) {
                var4 = param1.f((byte) -99);
                ((ao) this).field_z = new int[var4][];
                ((ao) this).field_D = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param1.c((byte) -60);
                    var7 = wa.b(var6, 99);
                    if (var7 != null) {
                      ((ao) this).field_D[var5] = var6;
                      ((ao) this).field_z[var5] = new int[var7.field_k];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_k > var8) {
                          ((ao) this).field_z[var5][var8] = param1.c((byte) -60);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (4 == param0) {
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var4 = 108 % ((-29 - param2) / 44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        field_A = jg.a(true);
        field_A[0] = -410976256;
        int[] var3 = field_A;
        var3[1] = vn.a(var3[1], 32);
        field_E = jg.a(true);
        int[] var4 = field_E;
        var4[1] = vn.a(var4[1], 8);
        field_E[0] = -1711275968;
        int[] var5 = field_E;
        var5[1] = vn.a(var5[1], 16);
        field_B = jg.a(true);
        field_B[0] = 64712;
        for (var0 = 32; -37 <= (var0 ^ -1); var0++) {
            var1 = field_B;
            var2 = var0;
            var1[var2 >> 1103429125] = vn.a(var1[var2 >> 1103429125], 1 << ec.a(31, var2));
        }
        int[] var6 = field_A;
        var6[1] = vn.a(var6[1], 64);
    }
}
