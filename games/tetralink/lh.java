/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends um {
    static dk field_s;
    static pb[] field_v;
    static String field_x;
    static hl field_q;
    static ob field_t;
    static String field_u;
    static String field_r;
    static String field_w;

    final static int[] h(int param0) {
        if (param0 != -7990) {
            field_x = null;
            return new int[8];
        }
        return new int[8];
    }

    final String a(String param0, int param1) {
        Object var4 = null;
        if (((lh) this).a(param1 + -26202, param0) == db.field_h) {
          return wh.field_j;
        } else {
          if (param1 != 26202) {
            var4 = null;
            String discarded$2 = ((lh) this).a((String) null, 55);
            return tb.field_h;
          } else {
            return tb.field_h;
          }
        }
    }

    lh(nn param0) {
        super(param0);
    }

    final jk a(int param0, String param1) {
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 == 0) {
          L0: {
            if (th.a(-115, param1) != null) {
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
            return db.field_h;
          } else {
            return pf.field_a;
          }
        } else {
          L1: {
            field_v = null;
            if (th.a(-115, param1) != null) {
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
            return db.field_h;
          } else {
            return pf.field_a;
          }
        }
    }

    public static void g(int param0) {
        field_x = null;
        field_q = null;
        field_u = null;
        field_v = null;
        if (param0 != 255) {
          return;
        } else {
          field_r = null;
          field_t = null;
          field_w = null;
          field_s = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_s = new dk("email");
        field_v = new pb[255];
        field_x = "You cannot join this game - it is in progress";
        field_r = "Offer unrated rematch";
        field_u = "Rated game";
        for (var0 = 0; field_v.length > var0; var0++) {
            field_v[var0] = new pb();
        }
        field_w = "<%0> is not a member, and cannot play with the current options.";
    }
}
