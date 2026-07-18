/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static nh field_e;
    private cn field_a;
    private dd field_c;
    private cn field_d;
    static int[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 44) {
            nc.a(-93);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final br a(byte param0, int param1) {
        br var3 = null;
        byte[] var4 = null;
        int var5 = 0;
        br var6 = null;
        var3 = (br) ((nc) this).field_c.a((byte) 114, (long)param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 < 32768) {
              var4 = ((nc) this).field_a.a(false, 0, param1);
              break L0;
            } else {
              var4 = ((nc) this).field_d.a(false, 0, 32767 & param1);
              break L0;
            }
          }
          var6 = new br();
          if (var4 != null) {
            L1: {
              var6.a(new uia(var4), -26706);
              if (param1 >= 32768) {
                var6.a(10211);
                break L1;
              } else {
                break L1;
              }
            }
            var5 = -55 / ((param0 - -25) / 35);
            ((nc) this).field_c.a(29166, (Object) (Object) var6, (long)param1);
            return var6;
          } else {
            L2: {
              if (param1 >= 32768) {
                var6.a(10211);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = -55 / ((param0 - -25) / 35);
            ((nc) this).field_c.a(29166, (Object) (Object) var6, (long)param1);
            return var6;
          }
        }
    }

    nc(int param0, cn param1, cn param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((nc) this).field_c = new dd(64);
        try {
          L0: {
            L1: {
              ((nc) this).field_a = param1;
              ((nc) this).field_d = param2;
              if (((nc) this).field_a == null) {
                break L1;
              } else {
                int discarded$4 = ((nc) this).field_a.a((byte) -88, 0);
                break L1;
              }
            }
            if (null == ((nc) this).field_d) {
              break L0;
            } else {
              int discarded$5 = ((nc) this).field_d.a((byte) -91, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("nc.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
