/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static String field_f;
    static o[] field_d;
    static pc field_a;
    static o field_b;
    static String field_e;
    static String field_c;
    static int field_g;

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 > -49) {
          var2 = null;
          h.a(118, (fj) null, (byte) 50);
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, fj param1, byte param2) {
        jd var3 = null;
        var3 = id.field_c;
        var3.e(param0, -2147483648);
        if (param2 < 76) {
          field_g = -128;
          var3.c(78, 2);
          var3.c(5, 0);
          var3.c(-125, param1.field_k);
          return;
        } else {
          var3.c(78, 2);
          var3.c(5, 0);
          var3.c(-125, param1.field_k);
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        ab.field_s[3] = new int[1];
        vd.field_d[3] = new ie(3);
        fj.a(37, new int[4], 468, (byte) 15, 0, 2, 30);
        vd.field_d[2] = new ie(2);
        var1 = 113 % ((7 - param0) / 60);
        if (-1 > (ob.field_l ^ -1)) {
          if (!md.a((byte) -124, wh.field_c)) {
            return;
          } else {
            fj.a(32, new int[6], 288, (byte) -127, 149, 1, 50);
            vd.field_d[1] = new ie(1);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        if (!param1) {
            field_b = null;
            he.field_b = param0;
            return;
        }
        he.field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Menu";
        field_a = new pc();
        field_c = "Fire: Left mouse button";
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
