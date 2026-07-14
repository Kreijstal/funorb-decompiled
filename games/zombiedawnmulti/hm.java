/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends un {
    static String[] field_q;

    final static String a(int param0, char param1) {
        int var2 = -82 / ((param0 - 2) / 53);
        return String.valueOf(param1);
    }

    final String a(String param0, int param1) {
        if (((hm) this).a(false, param0) == jq.field_b) {
            return dd.field_a;
        }
        if (param1 != -1276425040) {
            return null;
        }
        return gi.field_h;
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
            String discarded$0 = hm.a(-45, '');
        }
    }

    hm(pm param0) {
        super(param0);
    }

    final re a(boolean param0, String param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            if (null != gi.a(4, param1)) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          var3 = stackIn_11_0;
          if (var3 == 0) {
            return jq.field_b;
          } else {
            return db.field_b;
          }
        } else {
          L1: {
            hm.b(true);
            if (null != gi.a(4, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          if (var3 == 0) {
            return jq.field_b;
          } else {
            return db.field_b;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
