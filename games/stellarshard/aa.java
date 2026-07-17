/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int[] field_c;
    private static long[] field_a;
    static pb field_b;

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = 36;
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var4 = (CharSequence) (Object) var2;
                if (nd.a(var4, (byte) -35) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("aa.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -106 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var3 = null;
        long var4 = 0L;
        sl.field_c = true;
        String var2 = "tuhstatbut";
        try {
            var3 = "rvnadlm";
            var4 = -1L;
            b.a(var3, (byte) 38, var4, var2, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "aa.A(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_c = new int[8192];
        field_a = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_a[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
