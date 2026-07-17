/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static dk field_b;
    static volatile int field_d;
    static int[] field_g;
    static String field_c;
    static String[] field_a;
    static tg field_f;
    static int field_e;

    abstract dj a(byte param0);

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_f = null;
        int var1 = 0;
        field_a = null;
        field_g = null;
    }

    abstract void a(gi param0, boolean param1);

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param0 & 7) == 0)) {
            var2 = 8 - (7 & param0);
        }
        int var3 = 1;
        int var4 = var2 + param0;
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_g = new int[4];
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_e = 0;
        field_c = "Checking";
    }
}
