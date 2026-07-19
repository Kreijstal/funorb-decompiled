/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pda {
    static byte[] field_b;
    static iu[][] field_d;
    static int field_c;
    static String field_a;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param3 != 256) {
            return true;
        }
        if (param7 > param0) {
            if (param4 > param2) {
                if (param5 > param6) {
                    if (param8 < param1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    pda(boolean param0) {
        vt discarded$0 = new vt();
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 42 % ((param0 - -68) / 42);
        field_d = (iu[][]) null;
        field_b = null;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int incrementValue$0 = 0;
        field_b = new byte[32896];
        int var0 = 0;
        for (var1 = 0; var1 < 256; var1++) {
            for (var2 = 0; var1 >= var2; var2++) {
                incrementValue$0 = var0;
                var0++;
                field_b[incrementValue$0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + var1 * var1 + var2 * var2) / 65535.0f)));
            }
        }
        field_a = "Show all game chat";
    }
}
