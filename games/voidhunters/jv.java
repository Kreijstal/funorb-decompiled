/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static dja field_d;
    private asb field_e;
    private asb field_a;
    private pfb field_c;
    static int field_b;
    static String field_f;

    final rn a(byte param0, int param1) {
        rn var3 = null;
        byte[] var4 = null;
        rn var5 = null;
        var3 = (rn) ((jv) this).field_c.b(0, (long)param1);
        if (var3 == null) {
          if (param0 == -72) {
            L0: {
              if (param1 < 32768) {
                var4 = ((jv) this).field_a.a(0, param1, (byte) 13);
                break L0;
              } else {
                var4 = ((jv) this).field_e.a(0, 32767 & param1, (byte) 13);
                break L0;
              }
            }
            var5 = new rn();
            if (var4 == null) {
              if (32768 <= param1) {
                var5.a(0);
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              } else {
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              }
            } else {
              var5.a(new ds(var4), param0 + 8524);
              if (32768 > param1) {
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              } else {
                var5.a(0);
                ((jv) this).field_c.a((Object) (Object) var5, (long)param1, (byte) -117);
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return var3;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (!(dma.field_g < param3 + param1)) {
            return param1;
        }
        if (param0 != -109) {
            jv.a((byte) 16);
            if (!(0 > param2 + param1 - param3)) {
                return param2 + (param1 - param3);
            }
            return -param3 + dma.field_g;
        }
        if (!(0 > param2 + param1 - param3)) {
            return param2 + (param1 - param3);
        }
        return -param3 + dma.field_g;
    }

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != -33) {
            field_b = -56;
        }
    }

    jv(int param0, asb param1, asb param2) {
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
        ((jv) this).field_c = new pfb(64);
        try {
          L0: {
            L1: {
              ((jv) this).field_a = param1;
              ((jv) this).field_e = param2;
              if (((jv) this).field_a == null) {
                break L1;
              } else {
                int discarded$4 = ((jv) this).field_a.b(0, -6942);
                break L1;
              }
            }
            if (null == ((jv) this).field_e) {
              break L0;
            } else {
              int discarded$5 = ((jv) this).field_e.b(0, -6942);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("jv.<init>(").append(param0).append(44);
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = (dja) (Object) new efb();
        field_f = "Updates will sent to the email address you've given";
    }
}
