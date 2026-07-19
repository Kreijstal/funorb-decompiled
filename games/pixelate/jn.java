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
        this.field_r = param1;
        this.field_u = param0;
        this.field_t = od.a((byte) 41, 640, 240);
        this.field_y = od.a((byte) 41, 768, 256);
        this.field_o = nh.c((byte) 60);
        this.field_l = 0;
        this.field_s = od.a((byte) 41, 50, 20);
        this.field_w = od.a((byte) 41, 75, 25);
        this.field_n = ii.c(6, (byte) -120);
        this.field_k = Math.random() < 0.5 ? true : false;
    }

    static {
        field_m = "You need a rating of <%1> to play with the current options.";
    }
}
