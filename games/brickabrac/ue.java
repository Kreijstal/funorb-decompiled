/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static int field_d;
    static int[] field_b;
    static String field_f;
    static String field_a;
    static int field_e;
    static boolean field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -114) {
            return;
        }
        field_f = null;
    }

    final synchronized static long a(boolean param0) {
        long var1 = System.currentTimeMillis();
        if (!(jl.field_c <= var1)) {
            gn.field_C = gn.field_C + (jl.field_c + -var1);
        }
        jl.field_c = var1;
        if (param0) {
        }
        return gn.field_C + var1;
    }

    static {
        field_d = 0;
        field_b = new int[29];
        field_f = "Play free version";
        field_e = 50;
        field_b[22] = 23;
        field_b[13] = 0;
        field_b[11] = 0;
        field_b[12] = 0;
        field_b[24] = 0;
        field_b[15] = 0;
        field_b[14] = 0;
        field_b[19] = 0;
        field_b[8] = 0;
        field_b[9] = 0;
        field_b[4] = 0;
        field_b[16] = 0;
        field_b[10] = 0;
        field_b[6] = 0;
        field_b[0] = 0;
        field_b[1] = 1;
        field_b[2] = 0;
        field_b[25] = 25;
        field_b[20] = 0;
        field_b[3] = 0;
        field_b[7] = 0;
        field_b[5] = 0;
        field_b[17] = 0;
        field_b[18] = 0;
        field_b[21] = 22;
        field_b[23] = 0;
        field_b[28] = 28;
        field_b[27] = 0;
        field_b[26] = 26;
        field_a = "Neat!";
    }
}
