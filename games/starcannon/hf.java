/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fi {
    private long field_p;
    private long[] field_k;
    private int field_o;
    static hl field_i;
    private long field_n;
    private long field_m;
    static int field_l;
    private int field_j;

    final int a(byte param0, long param1) {
        int var5 = 0;
        int var6 = StarCannon.field_A;
        int var4 = 99 / ((param0 - -23) / 40);
        if ((((hf) this).field_m ^ -1L) >= (((hf) this).field_p ^ -1L)) {
            var5 = 0;
            do {
                ((hf) this).field_m = ((hf) this).field_m + param1;
                var5++;
                // if_icmpge L82
            } while ((((hf) this).field_p ^ -1L) < (((hf) this).field_m ^ -1L));
            if (!(((hf) this).field_m >= ((hf) this).field_p)) {
                ((hf) this).field_m = ((hf) this).field_p;
            }
            return var5;
        }
        ((hf) this).field_n = ((hf) this).field_n + (((hf) this).field_m + -((hf) this).field_p);
        ((hf) this).field_p = ((hf) this).field_p + (((hf) this).field_m - ((hf) this).field_p);
        ((hf) this).field_m = ((hf) this).field_m + param1;
        return 1;
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = ue.a(ik.a(param0, (byte) -113), 16778);
        if (!(var2 != null)) {
            var2 = "";
        }
        if (param1) {
            field_i = null;
        }
        return var2;
    }

    final void b(byte param0) {
        int var2 = 47 % ((15 - param0) / 35);
        if (!(((hf) this).field_p >= ((hf) this).field_m)) {
            ((hf) this).field_p = ((hf) this).field_p + (((hf) this).field_m - ((hf) this).field_p);
        }
        ((hf) this).field_n = 0L;
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = StarCannon.field_A;
        long var2 = System.nanoTime();
        long var4 = -((hf) this).field_n + var2;
        ((hf) this).field_n = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (!(5000000000L <= var4)) {
                ((hf) this).field_k[((hf) this).field_o] = var4;
                ((hf) this).field_o = (((hf) this).field_o + 1) % 10;
                if (!(-2 >= (((hf) this).field_j ^ -1))) {
                    ((hf) this).field_j = ((hf) this).field_j + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((hf) this).field_j; var8++) {
            var6 = var6 + ((hf) this).field_k[(10 + -var8 + ((hf) this).field_o) % 10];
        }
        if (param0 != 4216) {
            ((hf) this).field_o = 87;
        }
        return var6 / (long)((hf) this).field_j;
    }

    final static void a(int param0, int param1, int param2, hl[] param3, int param4, int param5, hl[] param6, int param7, qe param8, int param9, int param10, boolean param11) {
        qc.a(param3, param4, param2, param6, param4, -109, param2, param7, param11, param5, param0, param8, param10, param1, param8);
        if (param9 != -11) {
            hf.b(-126);
        }
    }

    public static void b(int param0) {
        if (param0 != -22720) {
            Object var2 = null;
            hf.a(91, -55, 77, (hl[]) null, -30, 57, (hl[]) null, 31, (qe) null, 69, -32, false);
        }
        field_i = null;
    }

    final long a(byte param0) {
        if (param0 != -51) {
            return 99L;
        }
        ((hf) this).field_p = ((hf) this).field_p + this.c(4216);
        if ((((hf) this).field_p ^ -1L) > (((hf) this).field_m ^ -1L)) {
            return (((hf) this).field_m + -((hf) this).field_p) / 1000000L;
        }
        return 0L;
    }

    hf() {
        ((hf) this).field_p = 0L;
        ((hf) this).field_k = new long[10];
        ((hf) this).field_n = 0L;
        ((hf) this).field_o = 0;
        ((hf) this).field_m = 0L;
        ((hf) this).field_j = 1;
        ((hf) this).field_p = System.nanoTime();
        ((hf) this).field_m = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 250;
    }
}
