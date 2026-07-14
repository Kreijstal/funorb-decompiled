/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends hk {
    private sj field_F;
    int field_H;
    int field_G;
    private int field_E;
    static String field_I;

    final static void a(int param0, p param1, int param2) {
        pk var5 = fj.field_q;
        var5.a(param0, (byte) -88);
        var5.field_f = var5.field_f + 1;
        int var4 = var5.field_f;
        var5.d((byte) -55, 1);
        var5.d((byte) -31, param1.field_l);
        var5.d((byte) -104, param1.field_h);
        var5.c((byte) 95, param1.field_f);
        var5.c((byte) 95, param1.field_g);
        var5.c((byte) 95, param1.field_j);
        var5.c((byte) 95, param1.field_n);
        int discarded$53 = var5.d(127, var4);
        if (param2 != 30175) {
            return;
        }
        var5.f(11700, -var4 + var5.field_f);
    }

    public static void f(int param0) {
        field_I = null;
        if (param0 != 0) {
            field_I = null;
        }
    }

    final int c(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (((ol) this).field_F.a((byte) 101) > param1) {
              var3 = 34 / ((param0 - 88) / 32);
              return ((ol) this).field_F.a(param1, (byte) 94);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final static int a(boolean param0, CharSequence param1) {
        if (param0) {
            field_I = null;
        }
        return eg.a(param1, (byte) 39, 10, true);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Geoblox.field_C;
        var8 = -89 % ((-3 - param1) / 38);
        if (!super.a(param0, 93, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var9 = -param2 + param4 + -((ol) this).field_H;
            var10 = ((ol) this).field_r - 2 * ((ol) this).field_H;
            if (var10 < var9) {
              var9 = var10;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 > var9) {
              var9 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var9 = ((ol) this).field_E * var9 / var10;
            if (param3 != 1) {
              if (param3 != 2) {
                break L2;
              } else {
                var11 = 2147483647;
                var12 = -1;
                var13 = 0;
                L3: while (true) {
                  if (var13 >= ((ol) this).field_F.a((byte) 48)) {
                    if (0 > var12) {
                      break L2;
                    } else {
                      ((ol) this).field_F.a(0, var12);
                      break L2;
                    }
                  } else {
                    var14 = ((ol) this).field_F.a(var13, (byte) 94) + -var9;
                    var14 = var14 * var14;
                    if (var11 > var14) {
                      var11 = var14;
                      var12 = var13;
                      var13++;
                      continue L3;
                    } else {
                      var13++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              ((ol) this).field_F.b(var9, (byte) -93);
              break L2;
            }
          }
          return true;
        }
    }

    final int a(byte param0) {
        int var2 = -85 / ((36 - param0) / 49);
        return ((ol) this).field_F.a((byte) 76);
    }

    final int g(int param0) {
        if (param0 >= -121) {
            return -39;
        }
        return ((ol) this).field_E;
    }

    private ol() throws Throwable {
        throw new Error();
    }

    static {
    }
}
