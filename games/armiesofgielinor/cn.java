/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends vf {
    private int field_p;
    private boolean field_n;
    private byte[] field_t;
    private int[] field_u;
    static int field_r;
    private int field_m;
    static String field_q;
    static String field_s;
    static int field_o;

    final static String e(int param0) {
        if (!(du.field_d != oh.field_L)) {
            return cd.field_e;
        }
        if (param0 != 488997228) {
            field_s = null;
            if (!se.field_g.a((byte) 126)) {
                return se.field_g.b(true);
            }
            if (!(du.field_d != mh.field_b)) {
                return se.field_g.b(true);
            }
            return ga.field_d;
        }
        if (!se.field_g.a((byte) 126)) {
            return se.field_g.b(true);
        }
        if (!(du.field_d != mh.field_b)) {
            return se.field_g.b(true);
        }
        return ga.field_d;
    }

    final void a(int param0) {
        ((cn) this).field_p = 0;
        if (param0 != -30420) {
            byte[] discarded$0 = ((cn) this).a(4, (byte) -104, -20);
            ((cn) this).field_m = 0;
            return;
        }
        ((cn) this).field_m = 0;
    }

    final void a(byte param0) {
        if (((cn) this).field_p < -4096) {
            ((cn) this).field_p = -4096;
            int fieldTemp$0 = ((cn) this).field_m;
            ((cn) this).field_m = ((cn) this).field_m + 1;
            ((cn) this).field_t[fieldTemp$0] = (byte)((!((cn) this).field_n ? ((cn) this).field_p : 2048 + (((cn) this).field_p >> 1)) >> 4);
            if (param0 >= -101) {
                return;
            }
            ((cn) this).field_p = 0;
            return;
        }
        if (((cn) this).field_p > 4096) {
            ((cn) this).field_p = 4096;
            int fieldTemp$1 = ((cn) this).field_m;
            ((cn) this).field_m = ((cn) this).field_m + 1;
            ((cn) this).field_t[fieldTemp$1] = (byte)((!((cn) this).field_n ? ((cn) this).field_p : 2048 + (((cn) this).field_p >> 1)) >> 4);
            if (param0 >= -101) {
                return;
            }
            ((cn) this).field_p = 0;
            return;
        }
        int fieldTemp$2 = ((cn) this).field_m;
        ((cn) this).field_m = ((cn) this).field_m + 1;
        ((cn) this).field_t[fieldTemp$2] = (byte)((!((cn) this).field_n ? ((cn) this).field_p : 2048 + (((cn) this).field_p >> 1)) >> 4);
        if (param0 >= -101) {
            return;
        }
        ((cn) this).field_p = 0;
    }

    cn(int param0, int param1, int param2, int param3, int param4, float param5, boolean param6) {
        super(param0, param1, param2, param3, param4);
        int var8 = 0;
        ((cn) this).field_n = param6 ? true : false;
        ((cn) this).field_u = new int[((cn) this).field_b];
        for (var8 = 0; var8 < ((cn) this).field_b; var8++) {
            ((cn) this).field_u[var8] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var8));
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        ((cn) this).field_t = new byte[param2 * param0];
        if (param1 < 80) {
            return null;
        }
        ((cn) this).c(param0, 1, param2);
        return ((cn) this).field_t;
    }

    final void b(int param0, int param1, int param2) {
        ((cn) this).field_p = ((cn) this).field_p + (((cn) this).field_u[param0] * param1 >> 12);
        if (param2 != 19699) {
            ((cn) this).field_u = null;
        }
    }

    public static void f(int param0) {
        field_q = null;
        field_s = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
        field_s = "Spells to heal groups of units.";
        field_q = "Spells to heal a single unit.";
    }
}
