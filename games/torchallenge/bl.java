/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ng {
    int field_Y;
    private m field_R;
    static rj field_S;
    int field_W;
    private int field_Z;
    static int[] field_T;
    static int[][] field_O;
    static int field_P;
    static boolean field_U;
    static int field_X;
    static wb field_V;
    static String field_Q;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = TorChallenge.field_F ? 1 : 0;
          if (param2 == -81) {
            break L0;
          } else {
            int discarded$1 = ((bl) this).a(58, 19);
            break L0;
          }
        }
        if (super.a(param0, param1, param2 ^ 0, param3, param4, param5, param6)) {
          L1: {
            var8 = -param4 + param1 - ((bl) this).field_W;
            var9 = -(2 * ((bl) this).field_W) + ((bl) this).field_p;
            if (var8 <= var9) {
              break L1;
            } else {
              var8 = var9;
              break L1;
            }
          }
          L2: {
            if ((var8 ^ -1) <= -1) {
              break L2;
            } else {
              var8 = 0;
              break L2;
            }
          }
          var8 = var8 * ((bl) this).field_Z / var9;
          if (1 != param5) {
            if ((param5 ^ -1) == -3) {
              L3: {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                if (((bl) this).field_R.a(false) <= var12) {
                  break L3;
                } else {
                  L4: {
                    var13 = -var8 + ((bl) this).field_R.c(var12, 7);
                    var13 = var13 * var13;
                    if (var10 <= var13) {
                      var12++;
                      break L4;
                    } else {
                      var11 = var12;
                      var10 = var13;
                      break L4;
                    }
                  }
                  var12++;
                  var12++;
                  var12++;
                  break L3;
                }
              }
              if ((var11 ^ -1) > -1) {
                return true;
              } else {
                ((bl) this).field_R.b(var11, (byte) -116);
                return true;
              }
            } else {
              return true;
            }
          } else {
            ((bl) this).field_R.a(var8, (byte) 46);
            return true;
          }
        } else {
          return false;
        }
    }

    final static ka[] a(int param0, int param1, lj param2, int param3) {
        if (!lk.a(160, param2, param1, param0)) {
            return null;
        }
        if (param3 != 2147483647) {
            return null;
        }
        return de.a(true);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        if (-1 >= (param1 ^ -1)) {
          if (param1 >= ((bl) this).field_R.a(false)) {
            return -1;
          } else {
            var3 = 127 / ((param0 - 59) / 38);
            return ((bl) this).field_R.c(param1, 7);
          }
        } else {
          return -1;
        }
    }

    final int d(boolean param0) {
        if (!param0) {
            return 97;
        }
        return ((bl) this).field_R.a(!param0 ? true : false);
    }

    private bl() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 > -47) {
            field_X = 3;
            var3 = 1;
            while (param0 > 1) {
                if (-1 != (1 & param0 ^ -1)) {
                    var3 = var3 * param2;
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
            }
            if (!(1 != param0)) {
                return var3 * param2;
            }
            return var3;
        }
        var3 = 1;
        while (param0 > 1) {
            if (-1 != (1 & param0 ^ -1)) {
                var3 = var3 * param2;
            }
            param0 = param0 >> 1;
            param2 = param2 * param2;
        }
        if (!(1 != param0)) {
            return var3 * param2;
        }
        return var3;
    }

    final int a(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((bl) this).d(false);
            return ((bl) this).field_Z;
        }
        return ((bl) this).field_Z;
    }

    public static void e(boolean param0) {
        field_T = null;
        field_O = null;
        field_V = null;
        field_S = null;
        field_Q = null;
        if (param0) {
            int discarded$0 = bl.a(-63, (byte) 27, -118);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[2][5];
        field_P = 0;
        field_S = new rj();
        field_U = true;
        field_Q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
