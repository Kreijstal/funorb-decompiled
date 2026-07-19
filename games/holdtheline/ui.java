/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends hl {
    static ll field_l;
    private int field_n;
    hl field_k;
    db field_j;
    static String field_m;
    static int[] field_i;

    final void a(byte param0, int param1) {
        param1 = param1 << 6;
        this.field_n = param1;
        if (param0 > -53) {
          return;
        } else {
          this.field_j.e(128 + ol.field_d * param1 >> 1615699048);
          return;
        }
    }

    final void a(int param0, boolean param1) {
        this.field_j.h(param0);
        if (param1) {
            this.a(117, false);
        }
    }

    final void b(int param0, boolean param1) {
        this.field_n = param0;
        if (!param1) {
            return;
        }
        this.field_j.e(ol.field_d * param0 - -128 >> -761648152);
    }

    final void a(int param0, int param1) {
        this.field_j.j(param0);
        if (param1 >= -59) {
            th var4 = (th) null;
            ui.a(65, (byte) -18, (th) null, 106, -96);
        }
    }

    ui(db param0, hl param1) {
        try {
            this.field_j = param0;
            this.field_n = param0.j();
            this.field_k = param1;
            this.field_j.e(this.field_n * ol.field_d + 128 >> 152052328);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, th param2, int param3, int param4) {
        param2.f(111, 12);
        param2.b(param1 + -652561689, 17);
        param2.b(-652561784, param0);
        if (param1 != -95) {
            return;
        }
        try {
            param2.b(-652561784, param3);
            param2.f(111, param4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ui.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        if (param0 != 128) {
            field_m = (String) null;
        }
    }

    static {
        field_l = new ll();
        field_m = "Select Vehicle";
        field_i = fc.a(-109, 15, 4);
    }
}
