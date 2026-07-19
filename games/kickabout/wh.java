/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends gn {
    static String field_e;
    private int field_t;
    private vm field_m;
    private int field_n;
    private int field_i;
    private int field_f;
    private int field_u;
    private boolean field_r;
    private int field_x;
    private boolean field_j;
    static boolean field_q;
    static ot field_p;
    static int field_w;
    private int field_s;
    static String field_v;
    static String field_h;
    private int field_l;
    private int field_k;
    private boolean field_o;
    private boolean field_g;

    final void a(int param0, boolean param1) {
        this.field_u = param0;
        this.field_o = param1 ? true : false;
        this.field_t = 0;
        this.field_m.f(0);
    }

    final static void a(byte param0, vc[] param1) {
        int var2_int = 0;
        long var3 = 0L;
        cq var5 = null;
        int var6 = Kickabout.field_G;
        if (param0 <= 66) {
            return;
        }
        try {
            for (var2_int = 0; var2_int < param1.length; var2_int++) {
                var3 = param1[var2_int].field_a;
                var5 = (cq) ((Object) ic.field_h.field_O.g(24009));
                while (var5 != null) {
                    if (!((var5.field_i ^ -1L) != (var3 ^ -1L))) {
                        i.field_A[var5.field_l] = param1[var2_int];
                        break;
                    }
                    var5 = (cq) ((Object) ic.field_h.field_O.c(33));
                }
            }
            gb.field_F = true;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "wh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (this.field_r) {
            he.a(this.field_m, true);
        } else {
            mj.a(true, this.field_m);
        }
        if (param0 <= 67) {
            this.f((byte) 6);
        }
    }

    private final void a(byte param0) {
        ag discarded$1 = null;
        ag discarded$2 = null;
        int var2 = this.field_i * mn.field_a >> -341429720;
        if (param0 != 99) {
            this.e(81);
        }
        this.field_m = vm.a(vg.field_Db[this.field_n].field_l, 100, var2, this.field_f);
        if (!(!this.field_j)) {
            this.field_m.i();
        }
        if (!this.field_r) {
            discarded$1 = ga.a(this.field_m, 114);
        } else {
            discarded$2 = w.a(this.field_m, param0 ^ 14);
        }
        this.field_k = this.field_k - 1;
        this.field_o = false;
    }

    private final void g(byte param0) {
        int var2 = 0;
        if (param0 >= -73) {
            this.e(84);
        }
        if (!(this.field_t >= this.field_u)) {
            var2 = this.field_t * (this.field_x / this.field_u);
            var2 = var2 * mn.field_a >> -485024728;
            this.field_m.f(var2 >> 1684914600);
        }
        this.field_t = this.field_t + 1;
    }

    private final void e(int param0) {
        int var3 = 0;
        int var2 = ((to) ((Object) this.field_m.field_h)).field_i.length;
        if (!(this.field_m.g() < -(this.field_s << -1445971351) + var2)) {
            if (this.field_l < this.field_s) {
                var3 = -(this.field_l * (this.field_x / this.field_s)) + this.field_x;
                var3 = var3 * mn.field_a >> 1863914568;
                this.field_m.f(var3 >> -929222904);
            }
            this.field_l = this.field_l + 1;
        }
        if (param0 != 1681431816) {
            this.field_k = -78;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -4) {
            field_e = (String) null;
        }
        this.field_l = 0;
        this.field_s = param0;
        this.field_g = true;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            wh.a(11);
        }
        field_h = null;
        field_p = null;
        field_v = null;
        field_e = null;
    }

    final void f(byte param0) {
        if (this.field_m.f()) {
            if (0 == this.field_k) {
                this.c((byte) -109);
            } else {
                this.a((byte) 99);
            }
        }
        if (param0 >= -124) {
            return;
        }
        if (this.field_o) {
            this.g((byte) -101);
        }
        if (this.field_g) {
            if (!(this.field_k != 0)) {
                this.e(1681431816);
            }
        }
    }

    final void a(int param0, int param1) {
        this.field_k = param0;
        if (param1 != 0) {
            this.e(9);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_h = (String) null;
        }
        return this.field_n;
    }

    wh(int param0, int param1, int param2, boolean param3, boolean param4) {
        this.field_n = param0;
        this.field_i = param1;
        this.field_j = param3 ? true : false;
        this.field_x = this.field_i << 1681431816;
        this.field_r = param4 ? true : false;
        this.field_k = 1;
        this.field_f = param2;
        this.a((byte) 99);
    }

    static {
        field_q = true;
        field_w = 0;
        field_v = "<%0> is not a member, and cannot play with the current options.";
        field_h = "by win %";
        field_e = "auto-assign";
    }
}
