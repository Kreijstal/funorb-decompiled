/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_c;
    static String field_a;
    static volatile int field_e;
    static String field_g;
    static int field_f;
    static vm field_b;
    static String field_d;

    public static void b(int param0) {
        if (param0 == 64) {
          field_g = null;
          field_d = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
        field_f = 72;
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static String a(byte param0) {
        if (ee.field_l == ue.field_a) {
          return ae.field_g;
        }
        if (param0 != 42) {
          of.a((byte) 108);
          if (!wh.field_a.b(14)) {
            return wh.field_a.a(98);
          }
          if (ue.field_a != fj.field_s) {
            return qh.field_B;
          }
          return wh.field_a.a(-45);
        }
        if (!wh.field_a.b(14)) {
          return wh.field_a.a(98);
        }
        if (ue.field_a != fj.field_s) {
          return qh.field_B;
        }
        return wh.field_a.a(-45);
    }

    final static e a(int param0) {
        String var1 = bh.d(-77);
        if (param0 == 64) {
          if (var1 != null &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          return new e(bh.d(-98), ta.a(33));
        }
        return (e) null;
    }

    static {
        field_c = "Unable to add friend - system busy";
        field_g = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_a = "Combat in progress<br>(<col=FF0000>Red</col>, <col=2F5FBF>Blue</col> and <col=808080>Neutral</col> involved)";
        field_e = 0;
        field_d = "Defeated";
    }
}
