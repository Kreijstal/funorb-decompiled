/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class plb extends rqa {
    static String field_o;

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
            return false;
        }
        return 0 != (param0 & 16) ? true : false;
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 16) {
            boolean discarded$0 = plb.a(-34, false, 111);
        }
    }

    final static void a(llb param0, llb param1, boolean param2) {
        L0: {
          if (param1.field_lb == null) {
            param1.field_lb = new ij();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0.field_lb == null) {
            param0.field_lb = new ij();
            break L1;
          } else {
            break L1;
          }
        }
        if (ae.field_f != null) {
          L2: {
            if (null == om.field_c) {
              om.field_c = new pr(64);
              break L2;
            } else {
              break L2;
            }
          }
          mr.field_M = param1.field_lb;
          if (!param2) {
            return;
          } else {
            st.field_o = param0.field_lb;
            ija.a(85);
            return;
          }
        } else {
          L3: {
            ae.field_f = new pr(64);
            if (null == om.field_c) {
              om.field_c = new pr(64);
              break L3;
            } else {
              break L3;
            }
          }
          mr.field_M = param1.field_lb;
          if (!param2) {
            return;
          } else {
            st.field_o = param0.field_lb;
            ija.a(85);
            return;
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(137, 114));
        } else {
          return new nc((Object) (Object) frb.a(137, 114));
        }
    }

    plb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Get the most kills in the time limit";
    }
}
