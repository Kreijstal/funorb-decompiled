/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends lq implements lja {
    private hf field_C;
    static String field_D;
    static sna field_H;
    private uma field_G;
    static String field_E;

    final void h(int param0) {
        int var2 = 0;
        var2 = 250;
        if (param0 != -11409) {
          field_E = (String) null;
          this.field_G.a(-var2 + this.field_p >> -518864767, 25, (byte) 59, 140, -25 + (this.field_q - -20) >> -962915647);
          this.field_C.a(140 + ((this.field_p - var2 >> 124867841) + 10), 30, (byte) 59, 100, 2 + (20 + this.field_q + -30 >> -1624959039));
          return;
        } else {
          this.field_G.a(-var2 + this.field_p >> -518864767, 25, (byte) 59, 140, -25 + (this.field_q - -20) >> -962915647);
          this.field_C.a(140 + ((this.field_p - var2 >> 124867841) + 10), 30, (byte) 59, 100, 2 + (20 + this.field_q + -30 >> -1624959039));
          return;
        }
    }

    d(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (qda) null);
        this.field_G = new uma(new oka(10000536), hk.field_d, 0, 0, 140, 25);
        this.field_G.a(new gl(), (byte) 112);
        this.field_C = new hf(tj.field_a, (pl) (this));
        this.field_B = new wj[]{(wj) ((Object) this.field_G), (wj) ((Object) this.field_C)};
        this.field_C.field_f = (qda) ((Object) new ff());
        this.d(6);
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_C.field_z = this.field_G.a(16728128).b(-19704) == cm.field_u ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "d.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        if (!(this.field_G.a(16728128).b(-19704) == cm.field_u)) {
            return;
        }
        if (param3 <= 50) {
            return;
        }
        try {
            tba.a((byte) 103, this.field_G.j(-1), this.field_G.f((byte) 31), this.field_G.d((byte) 47));
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "d.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a((byte) 121, param1, param2, param3);
        oc.field_l.c(gp.field_y, this.field_s + (param3 + 4), param1 - (-this.field_v + (-oc.field_l.field_u + -4)), 16777215, -1);
        int var5 = -15 % ((-20 - param0) / 54);
    }

    public static void d(byte param0) {
        field_E = null;
        field_H = null;
        field_D = null;
        if (param0 != 7) {
            field_E = (String) null;
        }
    }

    static {
        field_D = "Hide lobby chat";
        field_E = "Create a free account to start using this feature";
    }
}
