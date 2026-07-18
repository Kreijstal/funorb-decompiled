/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static byte[] field_a;
    static String field_c;
    static String field_g;
    static int field_d;
    static String field_e;
    static String field_b;
    static int[] field_f;

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        int var1 = 1;
        field_a = null;
        field_g = null;
        field_e = null;
        field_b = null;
    }

    final static cf a(int param0, byte param1) {
        cf var2 = new cf();
        sf.field_a.a((mc) (Object) var2, false);
        int var3 = -10 % ((42 - param1) / 44);
        ei.a((byte) 53, param0);
        return var2;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static ah a(int param0, boolean param1, boolean param2, int param3, byte param4) {
        if (param4 >= -47) {
          cf discarded$2 = pl.a(-52, (byte) 50);
          return ai.a(false, param0, false, 1, (byte) 122, true);
        } else {
          return ai.a(false, param0, false, 1, (byte) 122, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[]{(byte) 7};
        field_c = "Players: <%0>/<%1>";
        field_g = "You have 1 unread message!";
        field_b = "Send private Quick Chat to <%0>";
        field_f = new int[8192];
    }
}
