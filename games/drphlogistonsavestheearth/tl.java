/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends hf {
    private rb field_M;
    static he field_P;
    static he[] field_I;
    static bb field_O;
    int field_K;
    private int field_N;
    static String field_J;
    static he[] field_Q;
    int field_L;

    final int a(int param0, byte param1) {
        if (param1 == 4) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param0 < ((tl) this).field_M.a(false)) {
                return ((tl) this).field_M.b(param1 + -39, param0);
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return -25;
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!super.a(param0, param1, param2, (byte) 123, param4, param5, param6)) {
          L0: {
            if (param3 > 113) {
              break L0;
            } else {
              ((tl) this).field_K = 36;
              break L0;
            }
          }
          return false;
        } else {
          L1: {
            var8 = -((tl) this).field_L + (param4 - param5);
            var9 = ((tl) this).field_w - 2 * ((tl) this).field_L;
            if (var9 < var8) {
              var8 = var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (0 > var8) {
              var8 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var8 = ((tl) this).field_N * var8 / var9;
            if (param2 == 1) {
              ((tl) this).field_M.c(var8, -106);
              break L3;
            } else {
              if (-3 != (param2 ^ -1)) {
                break L3;
              } else {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L4: while (true) {
                  if (((tl) this).field_M.a(false) <= var12) {
                    if (-1 < (var11 ^ -1)) {
                      return true;
                    } else {
                      ((tl) this).field_M.d(-19, var11);
                      break L3;
                    }
                  } else {
                    var13 = ((tl) this).field_M.b(-126, var12) + -var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L4;
                    } else {
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
          return true;
        }
    }

    public static void a(byte param0) {
        field_O = null;
        if (param0 >= -14) {
            field_J = null;
        }
        field_I = null;
        field_Q = null;
        field_P = null;
        field_J = null;
    }

    final int h(int param0) {
        if (param0 > -19) {
            Object var3 = null;
            boolean discarded$0 = ((tl) this).a(-21, (vg) null, -12, (byte) -12, -64, -54, -43);
        }
        return ((tl) this).field_M.a(false);
    }

    final int i(int param0) {
        if (param0 >= -28) {
            return -25;
        }
        return ((tl) this).field_N;
    }

    final static ja a(lh param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param0.e(8, (byte) -110);
        if (-1 <= (var2 ^ -1)) {
          L0: {
            var3 = ti.a(param0, false) ? 1 : 0;
            var4 = ti.a(param0, false) ? 1 : 0;
            var5 = new ja();
            var5.field_q = (short)param0.e(16, (byte) -99);
            var5.field_J = uj.a(param0, (byte) 45, 16, var5.field_J);
            var5.field_w = uj.a(param0, (byte) -122, 16, var5.field_w);
            var5.field_P = uj.a(param0, (byte) -112, 16, var5.field_P);
            var5.field_m = (short)param0.e(16, (byte) 78);
            var5.field_h = uj.a(param0, (byte) 39, 16, var5.field_h);
            var5.field_a = uj.a(param0, (byte) 70, 16, var5.field_a);
            var5.field_K = uj.a(param0, (byte) 71, 16, var5.field_K);
            if (param1 >= 91) {
              break L0;
            } else {
              tl.a((byte) -124);
              break L0;
            }
          }
          L1: {
            if (var3 == 0) {
              break L1;
            } else {
              var5.field_H = (short)param0.e(16, (byte) -112);
              var5.field_k = uj.a(param0, (byte) 108, 16, var5.field_k);
              var5.field_B = uj.a(param0, (byte) -110, 16, var5.field_B);
              var5.field_E = uj.a(param0, (byte) 24, 16, var5.field_E);
              var5.field_A = uj.a(param0, (byte) 103, 16, var5.field_A);
              var5.field_l = uj.a(param0, (byte) -107, 16, var5.field_l);
              var5.field_e = uj.a(param0, (byte) -100, 16, var5.field_e);
              break L1;
            }
          }
          L2: {
            if (var4 == 0) {
              break L2;
            } else {
              int discarded$1 = param0.e(16, (byte) 82);
              var5.field_z = uj.a(param0, (byte) 44, 16, var5.field_z);
              var5.field_v = uj.a(param0, (byte) -116, 16, var5.field_v);
              var5.field_R = uj.a(param0, (byte) 63, 16, var5.field_R);
              var5.field_D = uj.a(param0, (byte) -113, 16, var5.field_D);
              var5.field_L = uj.a(param0, (byte) 60, 16, var5.field_L);
              break L2;
            }
          }
          L3: {
            if (ti.a(param0, false)) {
              var5.field_M = uj.a(param0, (byte) 13, 16, var5.field_M);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (ti.a(param0, false)) {
              var5.field_O = nl.a((byte) 65, 16, param0, var5.field_O);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_O.length) {
                  if (0 != var6) {
                    var5.field_G = (byte)(1 + var6);
                    break L4;
                  } else {
                    var5.field_O = null;
                    break L4;
                  }
                } else {
                  if ((var5.field_O[var7] & 255) > var6) {
                    var6 = 255 & var5.field_O[var7];
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    private tl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Please wait...";
    }
}
