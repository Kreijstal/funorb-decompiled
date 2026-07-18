/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class voa {
    static int field_d;
    static int field_b;
    private pfb field_c;
    private asb field_e;
    private asb field_a;

    final pi a(int param0, int param1) {
        pi var3 = null;
        byte[] var4 = null;
        pi var5 = null;
        pi var6 = null;
        var3 = (pi) ((voa) this).field_c.b(0, (long)param0);
        if (var3 == null) {
          if (param1 < -99) {
            L0: {
              if (32768 > param0) {
                var4 = ((voa) this).field_a.a(1, param0, (byte) 13);
                break L0;
              } else {
                var4 = ((voa) this).field_e.a(1, param0 & 32767, (byte) 13);
                break L0;
              }
            }
            var6 = new pi();
            if (var4 != null) {
              L1: {
                var6.a(new ds(var4), -1);
                if (param0 >= 32768) {
                  var6.e((byte) 97);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var6, (long)param0, (byte) -117);
              return var6;
            } else {
              L2: {
                if (param0 >= 32768) {
                  var6.e((byte) 97);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var6, (long)param0, (byte) -117);
              return var6;
            }
          } else {
            L3: {
              ((voa) this).field_c = null;
              if (32768 > param0) {
                var4 = ((voa) this).field_a.a(1, param0, (byte) 13);
                break L3;
              } else {
                var4 = ((voa) this).field_e.a(1, param0 & 32767, (byte) 13);
                break L3;
              }
            }
            var5 = new pi();
            if (var4 == null) {
              L4: {
                if (param0 >= 32768) {
                  var5.e((byte) 97);
                  break L4;
                } else {
                  break L4;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var5, (long)param0, (byte) -117);
              return var5;
            } else {
              L5: {
                var5.a(new ds(var4), -1);
                if (param0 >= 32768) {
                  var5.e((byte) 97);
                  break L5;
                } else {
                  break L5;
                }
              }
              ((voa) this).field_c.a((Object) (Object) var5, (long)param0, (byte) -117);
              return var5;
            }
          }
        } else {
          return var3;
        }
    }

    voa(int param0, asb param1, asb param2, rs param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        ((voa) this).field_c = new pfb(64);
        try {
          L0: {
            L1: {
              ((voa) this).field_a = param1;
              ((voa) this).field_e = param2;
              if (((voa) this).field_a == null) {
                break L1;
              } else {
                int discarded$4 = ((voa) this).field_a.b(1, -6942);
                break L1;
              }
            }
            if (null != ((voa) this).field_e) {
              int discarded$5 = ((voa) this).field_e.b(1, -6942);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("voa.<init>(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1280;
        field_d = 0;
    }
}
