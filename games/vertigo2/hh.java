/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static fe field_a;
    static String field_d;
    static ed field_b;
    static boolean field_c;

    final static void a(int param0, aa param1) {
        if (param1 == null) {
            return;
        }
        try {
            ji.field_n = param1;
            ql.field_L.field_M.c(0);
            if (param0 >= -17) {
                int[] discarded$0 = hh.a(76, 115, true);
            }
            ql.field_L.b((cr) (Object) ji.field_n, 121);
            pm.field_a = true;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "hh.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static String a(byte param0, int param1, ed param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        Object var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          try {
            L0: {
              if (param0 < -63) {
                break L0;
              } else {
                var6 = null;
                String discarded$2 = hh.a((byte) 33, -101, (ed) null);
                break L0;
              }
            }
            L1: {
              var3_int = param2.l(-1317721944);
              if (var3_int <= param1) {
                break L1;
              } else {
                var3_int = param1;
                break L1;
              }
            }
            var4 = new byte[var3_int];
            param2.field_u = param2.field_u + ko.field_M.a(25330, var4, var3_int, param2.field_u, 0, param2.field_p);
            var5 = mj.a(-125, var4, 0, var3_int);
            stackOut_4_0 = (String) var5;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_6_0 = "Cabbage";
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("hh.C(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = nf.a((byte) -28, param1);
        var4 = fk.a((byte) -118, param1);
        var5 = nf.a((byte) -28, param0);
        var6 = fk.a((byte) -118, param0);
        if (param2) {
          field_c = true;
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var3 * (long)var6 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var7 = (int)((long)var5 * (long)var3 >> 16);
          var8 = (int)((long)var3 * (long)var6 >> 16);
          var9 = (int)((long)var4 * (long)var5 >> 16);
          var10 = (int)((long)var4 * (long)var6 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Send private Quick Chat to <%0>";
    }
}
