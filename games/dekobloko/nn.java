/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static um field_c;
    static String field_b;
    static w field_a;

    final static void a(int param0, ui param1, boolean param2) {
        synchronized (km.field_z) {
            if (null == wj.field_Ob) {
            } else {
                sh.field_a.c((rh) (Object) wj.field_Ob);
                wj.field_Ob = null;
            }
            if (param1 == null) {
            } else {
                wj.field_Ob = new ia(param1);
                wj.field_Ob.a(a.field_g * 50 / 128);
                wj.field_Ob.c(param0);
                sh.field_a.a((rh) (Object) wj.field_Ob);
            }
            km.field_z.a();
            rc.field_d = param1;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 14925) {
            nn.a(-43);
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var3 = oa.a(param1, -1);
              if (!param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              if (param2.indexOf(param1) != -1) {
                break L2;
              } else {
                if (-1 != param2.indexOf(var3)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (param2.startsWith(param1)) {
                        break L4;
                      } else {
                        if (param2.startsWith(var3)) {
                          break L4;
                        } else {
                          if (param2.endsWith(param1)) {
                            break L4;
                          } else {
                            if (!param2.endsWith(var3)) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                  break L0;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("nn.C(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new um();
        field_b = "Please remove <%0> from your friend list first.";
    }
}
