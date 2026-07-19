/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    static h[] field_b;
    static String field_a;
    static String field_d;
    static cf[] field_c;

    final static void a(int param0, byte param1) {
        wj var2 = null;
        var2 = ac.field_B;
        var2.d((byte) -88, param0);
        if (param1 <= 66) {
          field_a = (String) null;
          var2.a(6, 1);
          var2.a(6, 0);
          return;
        } else {
          var2.a(6, 1);
          var2.a(6, 0);
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 35) {
          field_d = (String) null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        field_d = "Spy";
        field_b = new h[35];
        field_a = "Confirm Email:";
    }
}
