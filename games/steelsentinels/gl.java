/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends al {
    static rf field_j;
    private long field_n;
    private long field_m;
    static ak field_l;
    private long[] field_q;
    private int field_s;
    static boolean[][] field_x;
    static kg field_t;
    private long field_k;
    static gh field_u;
    private int field_o;
    static String field_r;
    static int field_p;
    static gh field_y;
    static char[] field_w;
    static int field_v;

    final void c(byte param0) {
        ((gl) this).field_n = 0L;
        if ((((gl) this).field_k ^ -1L) > (((gl) this).field_m ^ -1L)) {
            ((gl) this).field_k = ((gl) this).field_k + (-((gl) this).field_k + ((gl) this).field_m);
        }
        if (param0 >= -116) {
            Object var3 = null;
            gk discarded$0 = gl.a((cm) null, (byte) 47, (String) null, (String) null);
        }
    }

    final static gk a(cm param0, byte param1, String param2, String param3) {
        int var4 = param0.a(param2, 44);
        if (param1 != 85) {
            return null;
        }
        int var5 = param0.a(var4, -32759, param3);
        return va.a(var4, param0, true, var5);
    }

    final long a(byte param0) {
        ((gl) this).field_k = ((gl) this).field_k + this.d((byte) -84);
        if (!(((gl) this).field_k >= ((gl) this).field_m)) {
            return (-((gl) this).field_k + ((gl) this).field_m) / 1000000L;
        }
        if (param0 <= 98) {
            ((gl) this).field_k = -123L;
        }
        return 0L;
    }

    public static void c(int param0) {
        field_l = null;
        field_j = null;
        if (param0 != 0) {
            java.awt.Canvas discarded$0 = gl.a(false);
        }
        field_y = null;
        field_t = null;
        field_x = null;
        field_u = null;
        field_w = null;
        field_r = null;
    }

    final static java.awt.Canvas a(boolean param0) {
        if (param0) {
            field_w = null;
        }
        return (java.awt.Canvas) (null == wb.field_c ? sl.field_n : wb.field_c);
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = SteelSentinels.field_G;
        if (param1 != -97) {
            return 92;
        }
        if ((((gl) this).field_k ^ -1L) <= (((gl) this).field_m ^ -1L)) {
            var4 = 0;
            do {
                var4++;
                ((gl) this).field_m = ((gl) this).field_m + param0;
                // if_icmpge L77
            } while ((((gl) this).field_k ^ -1L) < (((gl) this).field_m ^ -1L));
            if (!((((gl) this).field_m ^ -1L) <= (((gl) this).field_k ^ -1L))) {
                ((gl) this).field_m = ((gl) this).field_k;
            }
            return var4;
        }
        ((gl) this).field_n = ((gl) this).field_n + (-((gl) this).field_k + ((gl) this).field_m);
        ((gl) this).field_k = ((gl) this).field_k + (-((gl) this).field_k + ((gl) this).field_m);
        ((gl) this).field_m = ((gl) this).field_m + param0;
        return 1;
    }

    private final long d(byte param0) {
        int var9 = SteelSentinels.field_G;
        long var2 = System.nanoTime();
        long var4 = -((gl) this).field_n + var2;
        ((gl) this).field_n = var2;
        if (var4 > -5000000000L) {
            if (!(-5000000001L >= (var4 ^ -1L))) {
                ((gl) this).field_q[((gl) this).field_o] = var4;
                if (!((((gl) this).field_s ^ -1) <= -2)) {
                    ((gl) this).field_s = ((gl) this).field_s + 1;
                }
                ((gl) this).field_o = (1 + ((gl) this).field_o) % 10;
            }
        }
        long var6 = 0L;
        int var8 = 1;
        if (param0 >= -38) {
            return 114L;
        }
        while (var8 <= ((gl) this).field_s) {
            var6 = var6 + ((gl) this).field_q[(10 + ((gl) this).field_o - var8) % 10];
            var8++;
        }
        return var6 / (long)((gl) this).field_s;
    }

    gl() {
        ((gl) this).field_n = 0L;
        ((gl) this).field_m = 0L;
        ((gl) this).field_k = 0L;
        ((gl) this).field_s = 1;
        ((gl) this).field_q = new long[10];
        ((gl) this).field_o = 0;
        ((gl) this).field_k = System.nanoTime();
        ((gl) this).field_m = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new rf();
        field_r = "<%1> was too close to a bomb intercepted by <%0>";
        field_w = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
