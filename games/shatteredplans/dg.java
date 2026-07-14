/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends qr {
    static int[] field_yb;
    private qr field_xb;

    final static va g(int param0) {
        va var1 = new va();
        var1.field_k = false;
        var1.field_a = param0;
        var1.field_h = 1;
        var1.field_f = true;
        var1.field_c = 1;
        return var1;
    }

    public static void f(byte param0) {
        field_yb = null;
        int var1 = -29 / ((12 - param0) / 44);
    }

    final boolean c(boolean param0, int param1) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        ((dg) this).a(true, -20429);
        if (param1 == -1) {
          L0: {
            L1: {
              L2: {
                if (je.field_d == 0) {
                  break L2;
                } else {
                  if (((dg) this).field_rb == -1) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 == ((dg) this).field_xb.field_rb) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                break L1;
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return true;
        }
    }

    dg(qr param0, qr param1, qr param2, qr param3, qr param4, qr param5) {
        int var12 = 0;
        qr var13 = null;
        qr var14 = null;
        int var15 = 0;
        qr var17 = new qr(0L, param1, qh.field_u.toUpperCase());
        var17.field_y = 1;
        ((dg) this).field_xb = new qr(0L, param2);
        qr var8 = new qr(0L, param3);
        qr var9 = new qr(0L, param3, rn.field_g);
        var9.field_y = 1;
        int var10 = 50;
        int var11 = 0;
        for (var12 = 0; var12 < tf.field_c.length; var12++) {
            var13 = new qr(0L, param3, bg.field_d[var12]);
            var14 = new qr(0L, param3, tf.field_c[var12]);
            var15 = param3.field_nb.c(tf.field_c[var12]);
            var13.a(65, 15, (byte) 69, var10, 20);
            if (var15 > var11) {
                var11 = var15;
            }
            var14.a(640, 15, (byte) 122, var10, 90);
            var8.a(4, var13);
            var8.a(4, var14);
            var10 += 30;
        }
        var10 += 15;
        var17.a(20 + var11 + 90, 24, (byte) 113, 0, 0);
        ((dg) this).a(var17.field_K, var10 + var17.field_mb, (byte) 83, 100, 100);
        ((dg) this).field_xb.a(15, 15, (byte) 126, 5, -20 + var17.field_K);
        var8.a(((dg) this).field_K, -var17.field_mb + ((dg) this).field_mb, (byte) 79, var17.field_mb, 0);
        var9.a(((dg) this).field_K, 15, (byte) 75, 20, 0);
        var8.field_F = cs.a(16, 3, var8.field_mb, 11579568, 8421504, 2105376);
        var17.a(4, ((dg) this).field_xb);
        var8.a(4, var9);
        ((dg) this).a(4, var17);
        ((dg) this).a(4, var8);
        ((dg) this).field_hb = 320 + -(((dg) this).field_K >> -1584323295);
        var10 = -(((dg) this).field_mb >> -1174470335) + 240;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = new int[8192];
    }
}
