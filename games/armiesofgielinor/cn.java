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
            field_s = (String) null;
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
        this.field_p = 0;
        if (param0 != -30420) {
            this.a(4, (byte) -104, -20);
            this.field_m = 0;
            return;
        }
        this.field_m = 0;
    }

    final void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if ((this.field_p ^ -1) > 4095) {
            this.field_p = -4096;
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_t[fieldTemp$0] = (byte)((!this.field_n ? this.field_p : 2048 + (this.field_p >> -1563006879)) >> 1541234980);
            if (param0 >= -101) {
                return;
            }
            this.field_p = 0;
            return;
        }
        if (this.field_p > 4096) {
            this.field_p = 4096;
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_t[fieldTemp$1] = (byte)((!this.field_n ? this.field_p : 2048 + (this.field_p >> -1563006879)) >> 1541234980);
            if (param0 >= -101) {
                return;
            }
            this.field_p = 0;
            return;
        }
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_t[fieldTemp$2] = (byte)((!this.field_n ? this.field_p : 2048 + (this.field_p >> -1563006879)) >> 1541234980);
        if (param0 >= -101) {
            return;
        }
        this.field_p = 0;
    }

    cn(int param0, int param1, int param2, int param3, int param4, float param5, boolean param6) {
        super(param0, param1, param2, param3, param4);
        int var8 = 0;
        this.field_n = param6 ? true : false;
        this.field_u = new int[this.field_b];
        for (var8 = 0; var8 < this.field_b; var8++) {
            this.field_u[var8] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var8));
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        this.field_t = new byte[param2 * param0];
        if (param1 < 80) {
            return (byte[]) null;
        }
        this.c(param0, 1, param2);
        return this.field_t;
    }

    final void b(int param0, int param1, int param2) {
        this.field_p = this.field_p + (this.field_u[param0] * param1 >> 488997228);
        if (param2 != 19699) {
            this.field_u = (int[]) null;
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 < 106) {
            cn.e(-21);
            field_s = null;
            return;
        }
        field_s = null;
    }

    static {
        field_r = -1;
        field_s = "Spells to heal groups of units.";
        field_q = "Spells to heal a single unit.";
    }
}
