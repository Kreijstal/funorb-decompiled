/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends fa {
    static ak field_p;
    ae field_o;
    boolean field_k;
    int field_r;
    static String field_m;
    int field_n;
    int field_t;
    static int field_v;
    int field_y;
    static int field_q;
    int field_l;
    int field_s;
    int field_x;
    int field_u;
    int field_w;

    public static void a(int param0) {
        field_p = null;
        field_m = null;
        if (param0 != 29353) {
            jn.a(-63);
        }
    }

    final static double a(double param0, int param1) {
        if (param1 != 6802) {
          return rl.field_G[65535 & (int)(param0 * 32768.0 / 3.141592653589793)];
        } else {
          return rl.field_G[65535 & (int)(param0 * 32768.0 / 3.141592653589793)];
        }
    }

    jn(int param0, int param1) {
        ((jn) this).field_r = param1;
        ((jn) this).field_u = param0;
        ((jn) this).field_t = od.a((byte) 41, 640, 240);
        ((jn) this).field_y = od.a((byte) 41, 768, 256);
        int discarded$0 = 60;
        ((jn) this).field_o = nh.c();
        ((jn) this).field_l = 0;
        ((jn) this).field_s = od.a((byte) 41, 50, 20);
        ((jn) this).field_w = od.a((byte) 41, 75, 25);
        ((jn) this).field_n = ii.c(6, (byte) -120);
        ((jn) this).field_k = Math.random() < 0.5 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "You need a rating of <%1> to play with the current options.";
    }
}
