/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_a;

    public static void releaseStatics(int guard) {
        if (guard != 16558) {
          return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param1 == 0) {
          return true;
        }
        if (param0 >= 95) {
          return param1 != 1 ? false : true;
        }
        field_a = (String) null;
        if (param1 == 1) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Shield recharged";
    }
}
