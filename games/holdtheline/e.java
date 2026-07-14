/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int field_c;
    static e field_a;
    int field_f;
    static int[] field_d;
    static float[] field_e;
    static String field_b;

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 >= -35) {
            field_b = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    e(int param0, int param1, int param2, int param3) {
        ((e) this).field_c = param3;
        ((e) this).field_f = param0;
    }

    final static String[] a(String[] args, int param1, String param2) {
        int var6 = HoldTheLine.field_D;
        tn var7 = ta.a((byte) 72);
        int var4 = param1;
        String var5 = fk.a(25, '[') + param2 + 93;
        while (var4 < args.length) {
            // ifne L74
            var4++;
        }
        var4++;
        if (!(var4 < args.length)) {
            return new String[]{};
        }
        while (args.length > var4) {
            // if_icmpeq L135
            var7.a((byte) 112, args[var4].trim());
            var4++;
        }
        return var7.c(param1 ^ 3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new e(7, 0, 1, 1);
        field_e = new float[]{1.5f, 1.375f, 1.25f, 1.125f, 1.0f};
        field_d = new int[]{0, 1, 2, 4, 3, 5, 6, 7, 14, 13, 8, 10, 9, 11, 12, 15};
        field_b = "Friends can be added in multiplayer<nbsp>games";
    }
}
