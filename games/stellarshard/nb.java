/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ig {
    int field_G;
    private int field_J;
    private ol field_L;
    static di field_K;
    int field_I;
    static int field_H;
    static String field_N;
    static Boolean field_M;
    static int[] field_F;
    static String field_O;

    final static void a(boolean param0, float param1, String param2, byte param3) {
        if (!(qf.field_d != null)) {
            qf.field_d = new ql(na.field_d, ii.field_F);
            na.field_d.a((byte) -104, (rj) (Object) qf.field_d);
        }
        if (param3 > -117) {
            Object var5 = null;
            nb.a(true, 0.3101823627948761f, (String) null, (byte) 81);
        }
        qf.field_d.a(param0, param1, true, param2);
        ti.d();
        af.a(true, (byte) -79);
    }

    final int g(int param0) {
        int var2 = 32 / ((param0 - -51) / 48);
        return ((nb) this).field_J;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = stellarshard.field_B;
        if (!super.a(param0, param1, param2, param3, param4, (byte) 65, param6)) {
          L0: {
            if (param5 >= 24) {
              break L0;
            } else {
              nb.a((byte) 61);
              break L0;
            }
          }
          return false;
        } else {
          L1: {
            var8 = -((nb) this).field_G + -param4 + param1;
            var9 = ((nb) this).field_p + -(((nb) this).field_G * 2);
            if (var8 <= var9) {
              break L1;
            } else {
              var8 = var9;
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
            var8 = var8 * ((nb) this).field_J / var9;
            if (1 == param2) {
              ((nb) this).field_L.a(var8, false);
              break L3;
            } else {
              if (2 != param2) {
                break L3;
              } else {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L4: while (true) {
                  if (((nb) this).field_L.a(19692) <= var12) {
                    if (-1 >= (var11 ^ -1)) {
                      ((nb) this).field_L.a(var11, (byte) 111);
                      break L3;
                    } else {
                      return true;
                    }
                  } else {
                    var13 = ((nb) this).field_L.a((byte) -117, var12) - var8;
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var10 = var13;
                      var11 = var12;
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

    final int b(byte param0, int param1) {
        if (param1 >= 0) {
            // if_icmple L21
        } else {
            return -1;
        }
        if (param0 != 95) {
            return -11;
        }
        return ((nb) this).field_L.a((byte) -117, param1);
    }

    final int d(boolean param0) {
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = ((nb) this).a((rj) null, -89, -58, -17, 18, (byte) 87, -5);
        }
        return ((nb) this).field_L.a(19692);
    }

    public static void a(byte param0) {
        if (param0 != 105) {
            field_K = null;
        }
        field_O = null;
        field_M = null;
        field_N = null;
        field_F = null;
        field_K = null;
    }

    private nb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_K = new di();
        field_H = 0;
        field_F = new int[256];
        field_N = "Turn ship - <img=4>+<img=5>     Thrust - <img=0>";
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            field_O = "Flame cannon";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_F[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (1 != (var0 & 1)) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 193173601;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
