/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static int field_c;
    static bk field_e;
    int field_j;
    static qe field_d;
    String field_k;
    static String[] field_f;
    static boolean field_i;
    ue field_b;
    String field_g;
    static fj field_a;
    String field_h;

    public static void a() {
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
    }

    final static int[] a(int param0, byte param1, int param2) {
        int var3 = qf.a(param2, (byte) -57);
        int var4 = ue.b(param2, 123);
        int var5 = qf.a(param0, (byte) -78);
        int var6 = ue.b(param0, 127);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var11 = 0;
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private ah() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = 0;
    }
}
