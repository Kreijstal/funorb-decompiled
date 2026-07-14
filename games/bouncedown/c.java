/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static volatile int field_c;
    static String field_d;
    static String field_b;
    static String field_a;

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 != 56) {
            field_a = null;
        }
    }

    final static boolean a(gk param0, boolean param1, int param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param0.b(-108, param3, param2);
        var4 = var5;
        if (!param1) {
          if (var5 == null) {
            return false;
          } else {
            qi.a(var5, 11906);
            return true;
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, byte[] param1) {
        if (param0 != 0) {
            return null;
        }
        return lh.a(0, -3789, param1.length, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_d = "Email (Login):";
        field_a = "Player 2";
        field_b = "One Player Challenge";
    }
}
