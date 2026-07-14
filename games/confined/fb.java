/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static fi field_e;
    static java.awt.Canvas field_b;
    static String[] field_d;
    static vj field_a;
    static String field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0) {
            field_d = null;
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        var4 = param2;
        if (!param0) {
          L0: {
            if (param1) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param3) {
            var4++;
            return qc.field_k[var4];
          } else {
            return qc.field_k[var4];
          }
        } else {
          L1: {
            var4 += 4;
            if (param1) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (!param3) {
            return qc.field_k[var4];
          } else {
            var4++;
            return qc.field_k[var4];
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        c.field_t = param2;
        if (param1 > -5) {
            field_c = null;
            ah.field_Q = param0;
            return;
        }
        ah.field_Q = param0;
    }

    final static n a(int param0, int param1, String param2) {
        og var3 = null;
        var3 = new og();
        if (param0 != 12) {
          field_d = null;
          ((n) (Object) var3).field_b = param2;
          ((n) (Object) var3).field_c = param1;
          return (n) (Object) var3;
        } else {
          ((n) (Object) var3).field_b = param2;
          ((n) (Object) var3).field_c = param1;
          return (n) (Object) var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new fi();
        field_d = new String[10];
    }
}
