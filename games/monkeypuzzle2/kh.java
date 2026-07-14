/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static ib field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 85) {
            Object var2 = null;
            boolean discarded$0 = kh.a((String) null, 30, true, (String) null, 125, (bg) null, (String) null);
        }
    }

    final static int a(byte param0) {
        Object var2 = null;
        if (param0 <= -39) {
          c.field_h.b(true);
          if (!lg.field_n.a((byte) -122)) {
            return lf.a(3);
          } else {
            return 0;
          }
        } else {
          var2 = null;
          boolean discarded$4 = kh.a((String) null, -3, false, (String) null, 109, (bg) null, (String) null);
          c.field_h.b(true);
          if (!lg.field_n.a((byte) -122)) {
            return lf.a(3);
          } else {
            return 0;
          }
        }
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, int param4, bg param5, String param6) {
        jg var8 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (di.field_a == ch.field_d) {
          var8 = new jg(wg.field_j, param5);
          wg.field_j.b((byte) -33, (we) (Object) var8);
          if (!ad.c(false)) {
            L0: {
              cg.field_a = null;
              ac.field_c = param0;
              v.field_b = param6;
              if (!param2) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            v.field_c = stackIn_10_0 != 0;
            dd.field_d = param4;
            ch.field_d = cf.field_b;
            mh.field_F = param3;
            if (param1 > 69) {
              return true;
            } else {
              kh.a(53);
              return true;
            }
          } else {
            var8.h((byte) 114);
            if (param1 <= 69) {
              kh.a(53);
              return true;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ib();
    }
}
