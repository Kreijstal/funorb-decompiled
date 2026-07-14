/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static int field_d;
    static ga field_a;
    static mo[][] field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 64) {
            ma.a(-89);
        }
    }

    final static void a(cj param0, cj param1, boolean param2) {
        L0: {
          if (param0.field_Cb == null) {
            param0.field_Cb = new th();
            break L0;
          } else {
            break L0;
          }
        }
        if (null != param1.field_Cb) {
          L1: {
            if (ol.field_o == null) {
              ol.field_o = new sc(64);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (null == bh.field_f) {
              bh.field_f = new sc(64);
              break L2;
            } else {
              break L2;
            }
          }
          if (!param2) {
            return;
          } else {
            jf.field_d = param1.field_Cb;
            ro.field_M = param0.field_Cb;
            cf.d(-8328);
            return;
          }
        } else {
          L3: {
            param1.field_Cb = new th();
            if (ol.field_o == null) {
              ol.field_o = new sc(64);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == bh.field_f) {
              bh.field_f = new sc(64);
              break L4;
            } else {
              break L4;
            }
          }
          if (!param2) {
            return;
          } else {
            jf.field_d = param1.field_Cb;
            ro.field_M = param0.field_Cb;
            cf.d(-8328);
            return;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Show chat (1 unread message)";
    }
}
