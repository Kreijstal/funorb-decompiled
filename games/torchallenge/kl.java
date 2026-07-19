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

    public static void a(int param0) {
        field_b = null;
        int var1 = -83 % ((param0 - -25) / 51);
        field_f = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          var4 = param0.indexOf(param3);
          if (param2 == 0) {
            break L0;
          } else {
            field_d = (String[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if ((var4 ^ -1) != 0) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param3.length());
            stackOut_4_0 = (String) (param0);
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_6_0).indexOf(param3, var4 + param1.length());
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return param0;
          }
        }
    }

    abstract tf b(int param0);

    abstract int a(int param0, int param1);

    static {
        field_z = "kl.J(";
        field_f = "Great wisdom can be found here.";
        field_c = "Click";
        field_d = new String[]{"Bonus crystal", "Health potion", "Extra life", "Help post"};
        field_b = new int[8192];
    }
}
