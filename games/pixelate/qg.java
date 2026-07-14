/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_c;
    static String[] field_d;
    static String field_b;
    static hh[] field_a;

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 124) {
            field_d = null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        pc var3 = null;
        if (param2) {
          field_c = null;
          var3 = aa.field_f;
          var3.g(param1, 15514);
          var3.e(160, 3);
          var3.e(160, 9);
          var3.b(1276387944, param0);
          return;
        } else {
          var3 = aa.field_f;
          var3.g(param1, 15514);
          var3.e(160, 3);
          var3.e(160, 9);
          var3.b(1276387944, param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unable to delete friend - system busy";
        field_b = null;
        field_d = new String[]{"Points are awarded for <col=ffff00>pictures completed</col> and <col=ffff00>tiles landed correctly</col>.", "Try to get the best score you can. Good luck!"};
    }
}
