/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_e;
    static String field_d;
    static boolean field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0, hj param1, byte param2, int param3, int param4) {
        hj var5 = null;
        try {
          var5 = new hj(param1.field_o, param1.field_v);
          ok.a(32381);
          var5.f();
          param1.e(0, 0, 1);
          if (param2 > -41) {
            hj var6 = (hj) null;
            hc.a(20, (hj) null, (byte) -34, 96, -42);
          }
          ug.b(-1);
          var5.d(param3 - (param1.field_o >> 1), param4 - (param1.field_v >> 1), param0);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "hc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 == 24816) {
          field_a = null;
          return;
        }
        hj var2 = (hj) null;
        hc.a(21, (hj) null, (byte) 110, 27, -87);
        field_a = null;
    }

    final static bm a(String param0, gn param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj var6 = null;
        bm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.c(param3, 3);
          var5 = param1.a(var4_int, param0, false);
          if (param2 > -105) {
            var6 = (hj) null;
            hc.a(-78, (hj) null, (byte) -62, 68, 71);
          }
          stackIn_3_0 = de.a(var4_int, var5, param1, 25);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hc.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String a(String param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          var4 = -54 / ((-39 - param1) / 50);
          for (var5 = 0; var2_int > var5; var5++) {
            var3[-var5 - 1 + var2_int] = param0.charAt(var5);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("hc.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0 == 0) {
          param1 = param1 & 8191;
          if (param1 < 4096) {
            if (param1 >= 2048) {
              stackIn_19_0 = -qd.field_f[param1 - 2048];
            } else {
              stackIn_19_0 = qd.field_f[-param1 + 2048];
            }
            return stackIn_19_0;
          }
          if (param1 < 6144) {
            stackIn_15_0 = -qd.field_f[-param1 + 6144];
          } else {
            stackIn_15_0 = qd.field_f[param1 - 6144];
          }
          return stackIn_15_0;
        }
        field_c = (String) null;
        param1 = param1 & 8191;
        if (param1 < 4096) {
          if (param1 >= 2048) {
            stackIn_9_0 = -qd.field_f[param1 - 2048];
          } else {
            stackIn_9_0 = qd.field_f[-param1 + 2048];
          }
          return stackIn_9_0;
        }
        if (param1 < 6144) {
          stackIn_5_0 = -qd.field_f[-param1 + 6144];
        } else {
          stackIn_5_0 = qd.field_f[param1 - 6144];
        }
        return stackIn_5_0;
    }

    static {
        field_c = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = "Player 1";
        field_e = -1;
        field_d = "Final Lap";
    }
}
