/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oja {
    private static int[] field_g;
    static String field_d;
    static int field_c;
    static String field_b;
    static int[] field_a;
    static kv[] field_f;
    static String field_e;

    public static void a(int param0) {
        String discarded$2 = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_g = null;
        field_f = null;
        if (param0 != -32341) {
          discarded$2 = oja.a((byte) 92, 'R');
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static String a(byte param0, char param1) {
        int var2 = 31 % ((-50 - param0) / 44);
        return String.valueOf(param1);
    }

    static {
        int var1 = 0;
        field_d = "Clan";
        field_g = new int[]{75, 75, 75, 75, 75};
        field_b = "Suggested names: ";
        field_a = new int[7];
        field_a[0] = 50;
        int var0 = 590;
        field_a[6] = var0;
        for (var1 = 5; (var1 ^ -1) < -1; var1--) {
            var0 = var0 - field_g[-1 + var1];
            field_a[var1] = var0;
        }
        field_e = "Unfortunately we are unable to create an account for you at this time.";
    }
}
