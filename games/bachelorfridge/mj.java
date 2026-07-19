/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends lg {
    static int field_i;
    static du field_l;
    static sna field_k;
    static String[] field_h;
    static int field_j;

    private final void c(byte param0) {
        if (param0 != -51) {
          return;
        } else {
          this.field_a.field_z = null;
          this.a(hea.field_s, 40, param0 ^ 4571, 72, 334, 366);
          return;
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_h = null;
        if (param0 <= 29) {
            field_l = (du) null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final void a(byte param0) {
        ew.field_r.e(this.field_g, this.field_f);
        int var2 = -107 / ((param0 - -54) / 47);
        dg.a(40 + this.field_g, this.field_f + 20, -110 + this.field_d, -30 + this.field_c, 20, 65793, 64);
        wq.a(1, 14, 300, 16777215, 16 + this.field_f, 300, 65793, true, this.field_b, 0, this.field_g + 54);
        ana.field_r.e(350, 330);
        laa.a(356, (byte) -112, 402, 16777215, hea.field_s, 65793);
    }

    mj(int param0, int param1, int param2, int param3, String param4) {
        super(param0, param1, param2, param3, 0, param4);
        try {
            this.c((byte) -51);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 3;
        field_l = new du(9, 0, 4, 1);
    }
}
