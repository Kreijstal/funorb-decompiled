/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int field_b;
    static String field_a;

    final static void a(int param0, boolean param1) {
        int discarded$0 = de.a((byte) 92);
    }

    public static void a(byte param0) {
        if (param0 >= -43) {
            Object var2 = null;
            w discarded$0 = ic.a((String) null, true);
        }
        field_a = null;
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (ua.field_d != null) {
            var1 = (Object) (Object) ua.field_d;
            synchronized (var1) {
              L1: {
                ua.field_d = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
        ic.a((byte) -120);
    }

    final static w a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        w stackIn_4_0 = null;
        w stackIn_7_0 = null;
        w stackIn_15_0 = null;
        w stackIn_18_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_3_0 = null;
        Object stackOut_22_0 = null;
        w stackOut_17_0 = null;
        w stackOut_14_0 = null;
        w stackOut_6_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = nh.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (63 >= var2_int) {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param1) {
                      field_a = null;
                      stackOut_22_0 = null;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (ml.field_l.indexOf(var4) != -1) {
                          break L2;
                        } else {
                          stackOut_17_0 = td.field_d;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        }
                      } else {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 == -1 + var2_int) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_14_0 = td.field_d;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              } else {
                stackOut_6_0 = ei.field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("ic.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L4;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 41);
        }
        return (w) (Object) stackIn_23_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "End Game";
    }
}
