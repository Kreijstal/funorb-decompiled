/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kl {
    static String field_f;
    static dk field_e;
    static String[] field_d;
    static String field_c;
    static int[] field_b;
    static boolean field_a;
    private static String field_z;

    abstract byte[] a(int param0, byte param1);

    public static void a() {
        field_b = null;
        int var1 = 0;
        field_f = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        var4 = param0.indexOf(param3);
        L0: while (true) {
          if (var4 == -1) {
            return param0;
          } else {
            param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param3.length());
            var4 = param0.indexOf(param3, var4 + param1.length());
            continue L0;
          }
        }
    }

    abstract tf b(int param0);

    abstract int a(int param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "kl.J(";
        field_f = "Great wisdom can be found here.";
        field_c = "Click";
        field_d = new String[]{"Bonus crystal", "Health potion", "Extra life", "Help post"};
        field_b = new int[8192];
    }
}
