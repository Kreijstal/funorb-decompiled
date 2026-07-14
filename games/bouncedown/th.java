/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends java.awt.Canvas {
    static int[] field_c;
    private java.awt.Component field_b;
    static volatile int field_a;

    public final void paint(java.awt.Graphics param0) {
        ((th) this).field_b.paint(param0);
    }

    public static void a(byte param0) {
        int var1 = 23 % ((param0 - 3) / 56);
        field_c = null;
    }

    th(java.awt.Component param0) {
        ((th) this).field_b = param0;
    }

    final static void a(int param0, byte param1, int param2, tg[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Bounce.field_N;
        var6 = 120 / ((33 - param1) / 59);
        if (param3 != null) {
          if ((param5 ^ -1) >= -1) {
            return;
          } else {
            var7 = param3[0].field_t;
            var8 = param3[2].field_t;
            var9 = param3[1].field_t;
            param3[0].b(param4, param2, param0);
            param3[2].b(-var8 + param5 + param4, param2, param0);
            na.b(hh.field_h);
            na.c(var7 + param4, param2, param4 + param5 - var8, param3[1].field_o + param2);
            var10 = param4 + var7;
            var11 = param5 + (param4 + -var8);
            param4 = var10;
            L0: while (true) {
              if (var11 <= param4) {
                na.a(hh.field_h);
                return;
              } else {
                param3[1].b(param4, param2, param0);
                param4 = param4 + var9;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((th) this).field_b.update(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
    }
}
