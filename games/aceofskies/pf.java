/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends mi {
    int field_B;
    static int[] field_A;
    int field_x;
    private int field_y;
    static int field_z;
    private ot field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = AceOfSkies.field_G ? 1 : 0;
        if (this.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((pf) this).field_B + (param2 - param1);
            var9 = ((pf) this).field_q + -(2 * ((pf) this).field_B);
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) <= -1) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          var8 = var8 * ((pf) this).field_y / var9;
          if (param3 != -2) {
            if (-3 == param3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((pf) this).field_w.a((byte) 123) <= var12) {
                  if (-1 >= (var11 ^ -1)) {
                    ((pf) this).field_w.a(var11, (byte) -58);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  var13 = -var8 + ((pf) this).field_w.b(var12, 1);
                  var13 = var13 * var13;
                  if (var13 < var10) {
                    var11 = var12;
                    var10 = var13;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((pf) this).field_w.a((byte) -50, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    final int c(boolean param0) {
        if (!param0) {
            return 16;
        }
        return ((pf) this).field_w.a((byte) -114);
    }

    final int a(int param0) {
        if (param0 != -3) {
            return -123;
        }
        return ((pf) this).field_y;
    }

    final int a(boolean param0, int param1) {
        if (-1 >= (param1 ^ -1)) {
          if (((pf) this).field_w.a((byte) -32) > param1) {
            if (param0) {
              return -3;
            } else {
              return ((pf) this).field_w.b(param1, 1);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private pf() throws Throwable {
        throw new Error();
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_A = (int[]) null;
            field_A = null;
            return;
        }
        field_A = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[8192];
    }
}
