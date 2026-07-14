/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends oq {
    static int field_H;
    static int field_A;
    static int[] field_D;
    static jp field_F;
    static String field_z;
    static String[] field_E;
    static String[] field_B;
    static String field_J;
    static boolean field_C;
    static jp field_I;
    static int[] field_G;

    public static void h(int param0) {
        if (param0 != -257) {
            vq.h(-94);
        }
        field_D = null;
        field_F = null;
        field_G = null;
        field_J = null;
        field_B = null;
        field_z = null;
        field_I = null;
        field_E = null;
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != 1273378209) {
            field_E = null;
        }
        int var3 = 4 - -ip.field_r.a(-37880252, -4 + param0);
        int var4 = ip.field_r.a(-37880252, -8 + param2) + 8;
        ob.field_E.a((nm) (Object) new nj(var3, var4, oq.field_x + ip.field_r.a(-37880252, qb.field_w), fr.field_k - -ip.field_r.a(-37880252, ag.field_E)), (byte) 3);
        dl.field_f = dl.field_f + 1;
    }

    final void b(byte param0) {
        pe.field_o.b((byte) -19);
        if (param0 > -14) {
            field_J = null;
        }
        lb.b(0, 0, 640, 480);
        ((vq) this).g(124);
        pg.d(0);
        ((vq) this).a(0);
    }

    vq() {
        super(18, gb.field_i, gb.field_i);
    }

    final void c(int param0) {
        if (param0 != -1) {
            ((vq) this).b((byte) 35);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_D = new int[256];
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -257) {
            field_E = new String[]{"By rating", "By win percentage"};
            field_z = "Please send me news and updates (I can unsubscribe at any time)";
            field_J = null;
            field_B = new String[255];
            field_G = new int[8192];
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_D[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) == 1) {
                  var0 = var0 >>> 1273378209 ^ -306674912;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
