/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends rj {
    private long field_j;
    static byte[] field_l;
    private long[] field_k;
    private int field_e;
    private long field_g;
    static kb field_h;
    private long field_f;
    static int field_i;
    private int field_d;

    final long a(int param0) {
        ((dk) this).field_f = ((dk) this).field_f + this.d(-5378);
        if (param0 <= 114) {
            return 98L;
        }
        if ((((dk) this).field_g ^ -1L) < (((dk) this).field_f ^ -1L)) {
            return (((dk) this).field_g - ((dk) this).field_f) / 1000000L;
        }
        return 0L;
    }

    public static void e(int param0) {
        if (param0 > -17) {
            field_h = null;
        }
        field_l = null;
        field_h = null;
    }

    final void c(int param0) {
        if (!((((dk) this).field_f ^ -1L) <= (((dk) this).field_g ^ -1L))) {
            ((dk) this).field_f = ((dk) this).field_f + (-((dk) this).field_f + ((dk) this).field_g);
        }
        if (param0 != -10158) {
            field_i = 31;
        }
        ((dk) this).field_j = 0L;
    }

    final int a(long param0, boolean param1) {
        int var5 = SolKnight.field_L ? 1 : 0;
        if (!param1) {
            field_l = null;
        }
        if ((((dk) this).field_f ^ -1L) > (((dk) this).field_g ^ -1L)) {
            ((dk) this).field_j = ((dk) this).field_j + (((dk) this).field_g - ((dk) this).field_f);
            ((dk) this).field_f = ((dk) this).field_f + (((dk) this).field_g - ((dk) this).field_f);
            ((dk) this).field_g = ((dk) this).field_g + param0;
            return 1;
        }
        int var4 = 0;
        do {
            var4++;
            ((dk) this).field_g = ((dk) this).field_g + param0;
            // if_icmpge L133
        } while ((((dk) this).field_f ^ -1L) < (((dk) this).field_g ^ -1L));
        if (((dk) this).field_g < ((dk) this).field_f) {
            ((dk) this).field_g = ((dk) this).field_f;
        }
        return var4;
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        if (param0 != -5378) {
            return 76L;
        }
        long var2 = System.nanoTime();
        long var4 = -((dk) this).field_j + var2;
        ((dk) this).field_j = var2;
        if (var4 > -5000000000L) {
            if (-5000000001L < (var4 ^ -1L)) {
                ((dk) this).field_k[((dk) this).field_e] = var4;
                if (!(((dk) this).field_d >= 1)) {
                    ((dk) this).field_d = ((dk) this).field_d + 1;
                }
                ((dk) this).field_e = (1 + ((dk) this).field_e) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((dk) this).field_d; var8++) {
            var6 = var6 + ((dk) this).field_k[(-var8 + (((dk) this).field_e + 10)) % 10];
        }
        return var6 / (long)((dk) this).field_d;
    }

    dk() {
        ((dk) this).field_f = 0L;
        ((dk) this).field_e = 0;
        ((dk) this).field_k = new long[10];
        ((dk) this).field_j = 0L;
        ((dk) this).field_d = 1;
        ((dk) this).field_g = 0L;
        ((dk) this).field_f = System.nanoTime();
        ((dk) this).field_g = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new kb();
    }
}
