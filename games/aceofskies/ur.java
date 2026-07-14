/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    static String field_c;
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        gk var2 = null;
        field_b = null;
        if (param0 != 8192) {
          var2 = (gk) null;
          wp[] discarded$2 = ur.a(-26, -63, -63, (gk) null);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 > -10) {
            ur.a(119);
            return true;
        }
        return true;
    }

    final static wp[] a(int param0, int param1, int param2, gk param3) {
        int var4 = 0;
        if (!tn.a(param3, (byte) -127, param2, param1)) {
          return null;
        } else {
          var4 = -91 / ((34 - param0) / 38);
          return kn.a(-125);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_b = new int[8192];
    }
}
