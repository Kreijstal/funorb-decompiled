/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends lh {
    static int field_x;
    static mh field_u;
    static int field_z;
    static StringBuilder field_A;
    static String field_w;
    static pe[] field_y;
    static mh field_v;
    static jp field_B;

    final static jp a(int param0, int param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        jp var6 = null;
        jp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          var4 = ma.field_O.c(param2) + 2;
          var5 = ma.field_O.field_N;
          var6 = new jp(var4, var5);
          var6.g();
          ma.field_O.b(param2, var4 / param0, 2 + ma.field_O.field_F, 0, -1);
          kc.field_q.a((byte) 124);
          var7 = new jp(var4 * param1, var5 * param1);
          var7.g();
          var6.a(0, 0, param1 * var4, param1 * var5);
          gp.a(var5 * param1, 0, param1 * var4, param0 ^ 2, 0);
          kc.field_q.a((byte) 126);
          if (param3) {
            var8 = var7.field_D;
            var9 = 2 + ma.field_O.field_B * param1;
            var10 = new int[var8 * var9];
            var11 = 0;
            L1: while (true) {
              if (var9 <= var11) {
                var7.field_G = var10;
                var7.field_F = var7.field_F + var9 / 2;
                var7.field_E = var7.field_E + 0;
                var7.field_D = var8;
                var7.field_C = var9;
                break L0;
              } else {
                var12 = 0;
                L2: while (true) {
                  if (var12 >= var8) {
                    var11++;
                    continue L1;
                  } else {
                    var10[var8 * var11 - -var12] = var7.field_G[(var11 - -var7.field_C - var9) * var7.field_D + (0 + var12)];
                    var12++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var7;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (lb.field_c >= param2 - -param1) {
            return param2;
        }
        if (param0 >= (-param1 + (param2 - -param3) ^ -1)) {
            return param2 + param3 - param1;
        }
        return lb.field_c + -param1;
    }

    fp() {
        super(14, 180, 460, 155, 35, be.field_o);
    }

    final void b(byte param0) {
        super.b((byte) -119);
        if (param0 > -14) {
            return;
        }
        al.a(((fp) this).field_a, 19);
        ((fp) this).g(68);
        ((fp) this).a(0);
    }

    public static void c(boolean param0) {
        field_B = null;
        field_u = null;
        field_y = null;
        field_v = null;
        if (param0) {
            return;
        }
        field_A = null;
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "This game has started.";
        field_y = null;
        field_A = new StringBuilder(80);
    }
}
