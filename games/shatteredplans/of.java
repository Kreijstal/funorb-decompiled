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
        if (param0 != 64) {
          field_f = 72;
          field_g = null;
          field_d = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_d = null;
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static String a(byte param0) {
        if (ee.field_l != ue.field_a) {
          if (param0 == 42) {
            if (wh.field_a.b(14)) {
              if (ue.field_a == fj.field_s) {
                return wh.field_a.a(-45);
              } else {
                return qh.field_B;
              }
            } else {
              return wh.field_a.a(98);
            }
          } else {
            String discarded$5 = of.a((byte) 108);
            if (wh.field_a.b(14)) {
              if (ue.field_a == fj.field_s) {
                return wh.field_a.a(-45);
              } else {
                return qh.field_B;
              }
            } else {
              return wh.field_a.a(98);
            }
          }
        } else {
          return ae.field_g;
        }
    }

    final static e a(int param0) {
        String var1 = null;
        var1 = bh.d(-77);
        if (param0 != 64) {
          return null;
        } else {
          L0: {
            if (var1 == null) {
              break L0;
            } else {
              if (-1 < (var1.indexOf('@') ^ -1)) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new e(bh.d(-98), ta.a(33));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unable to add friend - system busy";
        field_g = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_a = "Combat in progress<br>(<col=FF0000>Red</col>, <col=2F5FBF>Blue</col> and <col=808080>Neutral</col> involved)";
        field_e = 0;
        field_d = "Defeated";
    }
}
