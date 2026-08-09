/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends rl {
    static String field_x;
    static int field_q;
    static String[] field_u;
    static String field_s;
    static gi field_w;
    static String field_z;
    static String field_v;
    static kc field_y;
    static kc field_r;
    static String field_t;

    final static boolean e(boolean param0) {
        if (param0) {
            return false;
        }
        if (null == tc.field_A) {
            return false;
        }
        if (!tc.field_A.e(81)) {
            return false;
        }
        return true;
    }

    lo(rn param0) {
        super(param0);
    }

    final eh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        eh stackIn_2_0 = null;
        eh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (fi.a(var5, 10)) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var3_int = dc.a(var6, 127);
                var4 = 27 / ((-50 - param1) / 36);
                if (-1 <= (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    return nn.field_s;
                  }
                }
              }
              stackIn_7_0 = ra.field_k;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = ra.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lo.E(");

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
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void d(int param0) {
        field_t = null;
        field_r = null;
        field_y = null;
        field_s = null;
        field_z = null;
        if (param0 != 15672) {
          lo.e(false);
          field_x = null;
          field_w = null;
          field_v = null;
          field_u = null;
          return;
        } else {
          field_x = null;
          field_w = null;
          field_v = null;
          field_u = null;
          return;
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -114) {
              if (this.a(param0, -93) == ra.field_k) {
                stackIn_6_0 = gf.field_V;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("lo.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_s = "Reading Book of Seas";
        field_z = "Full";
        field_x = "Orb points: <%0>";
        field_v = "MOST DAMAGE - ";
        field_t = "Gameplay tips:";
    }
}
