/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends lg {
    private hq field_G;
    int field_C;
    private int field_D;
    int field_F;
    static int field_E;

    final int b(int param0, int param1) {
        if (param1 == 0) {
          if (-1 >= (param0 ^ -1)) {
            if (param0 >= ((ri) this).field_G.a(true)) {
              return -1;
            } else {
              return ((ri) this).field_G.b(95, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -27;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Torquing.field_u;
        if (param6 > 5) {
          if (super.a(param0, param1, param2, param3, param4, param5, (byte) 89)) {
            L0: {
              var8 = -param1 + (param4 + -((ri) this).field_F);
              var9 = ((ri) this).field_p + -(2 * ((ri) this).field_F);
              if (var9 < var8) {
                var8 = var9;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = var8 * ((ri) this).field_D / var9;
            if (param0 != 1) {
              if (-3 == (param0 ^ -1)) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L2: while (true) {
                  if (((ri) this).field_G.a(true) <= var12) {
                    if (-1 < (var11 ^ -1)) {
                      return true;
                    } else {
                      ((ri) this).field_G.c(var11, 17424);
                      return true;
                    }
                  } else {
                    var13 = -var8 + ((ri) this).field_G.b(46, var12);
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
              ((ri) this).field_G.d(var8, -8673);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            return -1;
        }
        return ((ri) this).field_G.a(true);
    }

    final int a(byte param0) {
        if (param0 != -108) {
            int discarded$0 = ((ri) this).a((byte) -62);
            return ((ri) this).field_D;
        }
        return ((ri) this).field_D;
    }

    private ri() throws Throwable {
        throw new Error();
    }

    static {
    }
}
