/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 != 8192) {
                field_b = null;
            }
            ph.a("", param1, (byte) 43);
            lg.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "fl.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static fb a(byte param0, String param1) {
        Object var2 = null;
        fb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fb stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        fb stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Bounce.field_N;
        try {
          if (tk.field_b != null) {
            L0: {
              if (param0 <= -124) {
                break L0;
              } else {
                field_b = null;
                break L0;
              }
            }
            L1: {
              var6 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) ce.a(var6, 0);
              if (var2 != null) {
                break L1;
              } else {
                var2 = (Object) (Object) var6;
                break L1;
              }
            }
            var3 = (fb) (Object) tk.field_b.a((long)((String) var2).hashCode(), 0);
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var7 = (CharSequence) (Object) var3.field_ob;
                  var4 = ce.a(var7, 0);
                  if (var4 != null) {
                    break L3;
                  } else {
                    var4 = var3.field_ob;
                    break L3;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_15_0 = (fb) var3;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  var3 = (fb) (Object) tk.field_b.b(0);
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (fb) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var2;
            stackOut_19_1 = new StringBuilder().append("fl.C(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static tg[] a(int param0, int param1, gk param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
          var4_int = 19 / ((65 - param0) / 57);
          if (c.a(param2, false, param1, param3)) {
            return kc.a(true);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("fl.A(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = 500;
    }
}
