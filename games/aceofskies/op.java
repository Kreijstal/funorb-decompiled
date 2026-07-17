/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op {
    static ej field_b;
    static int field_a;

    final static fn a(String param0, boolean param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        fn stackIn_6_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        fn stackOut_5_0 = null;
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
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var7 = null;
                fn discarded$2 = op.a((String) null, true, (String) null, false);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_long = 0L;
                var6 = null;
                if (param2.indexOf('@') != -1) {
                  break L3;
                } else {
                  var8 = (CharSequence) (Object) param2;
                  var4_long = AceOfSkies.a(var8, -47);
                  if (!AceOfSkies.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = (Object) (Object) param2;
              break L2;
            }
            stackOut_5_0 = wb.a(false, (String) var6, param0, var4_long, true);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("op.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 41);
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 6337) {
          var2 = null;
          fn discarded$2 = op.a((String) null, true, (String) null, false);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(int param0, gk param1) {
        t var2 = null;
        t.a(param1.a("headers.packvorbis", (byte) -71, ""));
        if (param0 != 20786) {
            return;
        }
        try {
            var2 = t.a(param1, "jagex logo2.packvorbis", "");
            al discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "op.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ej(10, 2, 2, 0);
    }
}
