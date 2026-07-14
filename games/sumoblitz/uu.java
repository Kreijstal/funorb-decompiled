/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu extends ms {
    mf field_z;
    int field_D;
    int field_y;
    static qr field_l;
    int field_q;
    int field_C;
    mq field_w;
    int field_x;
    qp field_B;
    td field_A;
    int field_H;
    static String field_s;
    int field_v;
    int field_m;
    int field_p;
    int field_r;
    int field_t;
    int field_k;
    static ri field_o;
    int field_G;
    int field_u;
    int field_F;
    int field_E;
    int field_n;

    final static String a(int param0, byte[] param1) {
        if (param0 != 0) {
            uu.a((byte) -101);
            return sd.a(param1, 0, param1.length, 26564);
        }
        return sd.a(param1, 0, param1.length, 26564);
    }

    public static void a(byte param0) {
        field_o = null;
        field_l = null;
        field_s = null;
        if (param0 <= 70) {
            uu.a((byte) 17);
        }
    }

    final void a(int param0) {
        if (param0 != 0) {
            return;
        }
        ((uu) this).field_B = null;
        ((uu) this).field_w = null;
        ((uu) this).field_z = null;
        ((uu) this).field_A = null;
    }

    final static void c(boolean param0) {
        pd var1 = null;
        pl var2 = null;
        if (!param0) {
          var1 = (pd) (Object) vu.field_g.b(103);
          if (var1 == null) {
            kk.a((byte) -110);
            return;
          } else {
            var2 = ig.field_a;
            int discarded$8 = var2.c(true);
            int discarded$9 = var2.c(true);
            int discarded$10 = var2.c(true);
            int discarded$11 = var2.c(true);
            var1.b(param0);
            return;
          }
        } else {
          return;
        }
    }

    uu() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new qr();
        field_s = "???";
    }
}
