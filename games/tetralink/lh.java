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
            field_x = (String) null;
            return new int[8];
        }
        return new int[8];
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1 + -26202, param0) == db.field_h) {
              stackIn_3_0 = wh.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 26202) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, 55);
                  break L1;
                }
              }
              stackIn_7_0 = tb.field_h;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lh.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    lh(nn param0) {
        super(param0);
    }

    final jk a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        jk stackIn_7_0 = null;
        jk stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_v = (pb[]) null;
                break L1;
              }
            }
            L2: {
              if (th.a(-115, param1) != null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3_int = stackIn_5_0;
            if (var3_int != 0) {
              stackIn_9_0 = pf.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = db.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("lh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
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
