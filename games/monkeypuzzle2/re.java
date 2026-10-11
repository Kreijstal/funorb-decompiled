/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static String[] field_a;
    private static int[] field_c;
    static int[] field_d;
    static boolean field_f;
    static int field_e;
    static String field_b;

    final static boolean a(int param0, char param1) {
        boolean stackIn_6_0 = false;
        if (param0 != -49) {
          return true;
        }
        stackIn_6_0 = (param1 >= 48) && (param1 <= 57);
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 9050) {
          re.a(-113);
        }
        field_c = null;
        field_b = null;
    }

    final static void b(int param0) {
        int var1 = -105 / ((param0 + 17) / 58);
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_c = new int[65536];
        field_d = new int[65536];
        for (var0 = 0; 65536 > var0; var0++) {
          var1 = 256.0 - Math.sqrt((double)var0);
          field_d[var0] = (int)(var1 * var1 + 0.5);
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 65536; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_c[var0Lifetime1] = (int)Math.floor(-(var1Lifetime1 * 9.0) + 768.5 + (double)var0Lifetime1 * 0.0234375);
        }
        field_f = true;
        field_e = 256;
        field_b = "Service unavailable";
    }
}
