/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hh {
    String field_mb;
    int field_ob;
    static String field_gb;
    static ob field_ib;
    static String field_nb;
    String field_jb;
    static String field_hb;
    static String field_kb;
    static mh field_lb;

    aa() {
        super(0L, (hh) null);
    }

    final static boolean a(String param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 > -47) {
          L0: {
            field_ib = null;
            if (gj.a((byte) -116, param0) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (gj.a((byte) -116, param0) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void c(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          boolean discarded$2 = aa.a((String) null, (byte) 75);
          field_ib = null;
          field_kb = null;
          field_lb = null;
          field_nb = null;
          field_hb = null;
          field_gb = null;
          return;
        } else {
          field_ib = null;
          field_kb = null;
          field_lb = null;
          field_nb = null;
          field_hb = null;
          field_gb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Waiting for levels";
        field_ib = new ob();
        field_kb = "The Village";
    }
}
