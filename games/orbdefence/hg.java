/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends sf {
    static int field_Z;
    static hj field_ab;

    public static void c(boolean param0) {
        field_ab = null;
        if (param0) {
            String var2 = (String) null;
            hg.a((String) null, (String) null, (String) null, (byte) 69);
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
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
              if (param2 == 0) {
                break L1;
              } else {
                var4 = (String) null;
                hg.a((String) null, (byte) 106);
                break L1;
              }
            }
            if (!param0) {
              stackIn_6_0 = jd.field_a.a(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = ck.field_g.a(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hg.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static mi a(String param0, byte param1) {
        RuntimeException var2 = null;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 113) {
              stackIn_4_0 = new mi(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("hg.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        int var4;
        int var5;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param3 < -2) {
          var4 = param0.indexOf(param2);
          L0: while (true) {
            if ((var4 ^ -1) == 0) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param2.length());
              var4 = param0.indexOf(param2, param1.length() + var4);
              continue L0;
            }
          }
        } else {
          field_Z = -35;
          var4 = param0.indexOf(param2);
          L1: while (true) {
            if ((var4 ^ -1) == 0) {
              return param0;
            } else {
              param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param2.length());
              var4 = param0.indexOf(param2, param1.length() + var4);
              continue L1;
            }
          }
        }
    }

    private hg() throws Throwable {
        super(0L, (sf) null);
        throw new Error();
    }

    static {
    }
}
