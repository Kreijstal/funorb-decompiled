/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static String field_a;
    static String field_c;
    static int[] field_b;

    final static ol a(da param0, int param1, int param2, boolean param3, da param4) {
        if (l.a(71, param1, param2, param0)) {
          if (!param3) {
            cd.a(75);
            return ua.a(true, param4.b(param2, 12257, param1));
          } else {
            return ua.a(true, param4.b(param2, 12257, param1));
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != 8192) {
            Object var2 = null;
            ol discarded$0 = cd.a((da) null, 73, -128, false, (da) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unable to connect to the data server. Please check any firewall you are using.";
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = new int[8192];
    }
}
