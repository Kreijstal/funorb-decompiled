/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends rl {
    static String field_x;
    static int field_q;
    static String field_w;
    static oc field_v;
    static String field_u;
    static String field_t;
    static eg field_s;
    static int[] field_r;

    final eh a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        eh stackIn_6_0 = null;
        eh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != pn.a((byte) 78, param0)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (var3_int == 0) {
              stackIn_6_0 = ra.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = -46 % ((param1 - -50) / 36);
              stackIn_8_0 = nn.field_s;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ki.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    ki(rn param0) {
        super(param0);
    }

    public static void d(byte param0) {
        field_x = null;
        field_s = null;
        field_v = null;
        field_t = null;
        field_w = null;
        field_u = null;
        int var1 = -119 / ((param0 - 43) / 41);
        field_r = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -114) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, -66);
                break L1;
              }
            }
            if (this.a(param0, 68) != ra.field_k) {
              stackIn_6_0 = nh.field_v;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = gl.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ki.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static hg e(byte param0) {
        if (param0 > -51) {
            return (hg) null;
        }
        return (hg) ((Object) new lj());
    }

    static {
        field_x = " turns left";
        field_w = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_v = new oc();
        field_t = "Cancel";
        field_u = "Quit to website";
    }
}
