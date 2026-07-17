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
        ((ui) this).field_n = param1;
        if (param0 > -53) {
          return;
        } else {
          ((ui) this).field_j.e(128 + ol.field_d * param1 >> 8);
          return;
        }
    }

    final void a(int param0, boolean param1) {
        ((ui) this).field_j.h(param0);
        if (param1) {
            ((ui) this).a(117, false);
        }
    }

    final void b(int param0, boolean param1) {
        ((ui) this).field_n = param0;
        if (!param1) {
            return;
        }
        ((ui) this).field_j.e(ol.field_d * param0 - -128 >> 8);
    }

    final void a(int param0, int param1) {
        ((ui) this).field_j.j(param0);
        if (param1 >= -59) {
            Object var4 = null;
            ui.a(65, (byte) -18, (th) null, 106, -96);
        }
    }

    ui(db param0, hl param1) {
        try {
            ((ui) this).field_j = param0;
            ((ui) this).field_n = param0.j();
            ((ui) this).field_k = param1;
            ((ui) this).field_j.e(((ui) this).field_n * ol.field_d + 128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ui.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
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
            throw kk.a((Throwable) (Object) runtimeException, "ui.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        if (param0 != 128) {
            field_m = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new ll();
        field_m = "Select Vehicle";
        field_i = fc.a(-109, 15, 4);
    }
}
