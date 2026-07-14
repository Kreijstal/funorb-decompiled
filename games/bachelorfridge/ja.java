/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends td {
    static String field_r;
    static String field_q;
    static eaa field_s;
    static boolean field_p;

    public static void b(int param0) {
        field_s = null;
        field_q = null;
        if (param0 != 0) {
            field_s = null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    ja(int param0, aga param1) {
        super(param0, param1);
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 < -4) {
          L0: {
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param2) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param1) {
            var4++;
            return ql.field_r[var4];
          } else {
            return ql.field_r[var4];
          }
        } else {
          L2: {
            field_q = null;
            var4 = 0;
            if (param3) {
              var4 += 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param2) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param1) {
            return ql.field_r[var4];
          } else {
            var4++;
            return ql.field_r[var4];
          }
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        vba var4 = null;
        var3 = ((ja) this).field_h.a(10, param0);
        var4 = new vba(((ja) this).field_g, new nq(var3));
        if (param1 != 3) {
          field_q = null;
          return (ii) (Object) var4;
        } else {
          return (ii) (Object) var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_q = "Win %";
        field_s = new eaa();
        field_p = true;
    }
}
