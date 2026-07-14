/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends kg {
    static int field_P;
    private int field_F;
    static gq field_O;
    int field_M;
    static vr field_K;
    private hn field_J;
    static int field_G;
    static boolean field_L;
    static qr field_N;
    static boolean[][] field_E;
    int field_I;

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        if (super.a(param0, param1, (byte) 101, param3, param4, param5, param6)) {
          L0: {
            var8 = -((td) this).field_M + param1 + -param4;
            var9 = -(2 * ((td) this).field_M) + ((td) this).field_x;
            if (var9 >= var8) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (-1 >= (var8 ^ -1)) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          var8 = ((td) this).field_F * var8 / var9;
          if (param0 != 1) {
            if ((param0 ^ -1) == -3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((td) this).field_J.a((byte) 56) <= var12) {
                  if (0 <= var11) {
                    ((td) this).field_J.a(var11, false);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  var13 = -var8 + ((td) this).field_J.a((byte) -117, var12);
                  var13 = var13 * var13;
                  if (var10 > var13) {
                    var11 = var12;
                    var10 = var13;
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((td) this).field_J.a(13378, var8);
            return true;
          }
        } else {
          if (param2 <= 95) {
            var15 = null;
            boolean discarded$1 = ((td) this).a(83, 56, (byte) 48, -95, 108, -98, (vg) null);
            return false;
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        if (param3 != param0) {
          L0: {
            if (param0 <= param3) {
              break L0;
            } else {
              var7 = param0;
              param0 = param3;
              param3 = var7;
              var7 = param2;
              param2 = param5;
              param5 = var7;
              break L0;
            }
          }
          if (param0 < param6) {
            if (param6 <= param3) {
              if ((-param0 + param6) * (param5 - param2) <= (-param2 + param4) * (-param0 + param3)) {
                if (param1 > -74) {
                  field_P = -5;
                  return false;
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(byte param0) {
        int var2 = -76 / ((param0 - 68) / 51);
        return ((td) this).field_F;
    }

    public static void a(int param0) {
        field_O = null;
        int var1 = 20 % ((param0 - -38) / 60);
        field_N = null;
        field_K = null;
        field_E = null;
    }

    final int g(byte param0) {
        if (param0 != 93) {
            field_K = null;
            return ((td) this).field_J.a((byte) 56);
        }
        return ((td) this).field_J.a((byte) 56);
    }

    final int a(int param0, byte param1) {
        if ((param0 ^ -1) <= -1) {
          if (param0 < ((td) this).field_J.a((byte) 56)) {
            if (param1 != -58) {
              int discarded$2 = ((td) this).a((byte) -8);
              return ((td) this).field_J.a((byte) 124, param0);
            } else {
              return ((td) this).field_J.a((byte) 124, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private td() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0;
        field_O = new gq(2, 4, 4, 0);
    }
}
