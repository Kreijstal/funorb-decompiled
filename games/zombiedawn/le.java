/*
 * Decompiled by CFR-JS 0.4.0.
 */
class le {
    static vn[] field_a;
    static String field_e;
    static int field_g;
    le field_d;
    le field_b;
    static volatile int field_c;
    long field_f;

    public static void b(byte param0) {
        field_e = null;
        if (param0 != 61) {
            field_c = -123;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final void b(int param0) {
        if (((le) this).field_d == null) {
          return;
        } else {
          ((le) this).field_d.field_b = ((le) this).field_b;
          ((le) this).field_b.field_d = ((le) this).field_d;
          if (param0 != -27598) {
            return;
          } else {
            ((le) this).field_b = null;
            ((le) this).field_d = null;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 73) {
          field_c = 68;
          if (((le) this).field_d != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (((le) this).field_d == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Visit the Account Management section on the main site to view.";
        field_c = 0;
    }
}
