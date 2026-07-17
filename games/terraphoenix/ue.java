/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    int field_b;
    ue field_d;
    int field_a;
    int field_c;

    final int a(boolean param0) {
        int var4 = Terraphoenix.field_V;
        Object var2 = this;
        int var3 = ((ue) var2).field_c;
        while (null != ((ue) var2).field_d) {
            var2 = (Object) (Object) ((ue) var2).field_d;
            var3 = var3 + ((ue) var2).field_c;
        }
        if (!param0) {
            ((ue) this).field_d = null;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        ue var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Terraphoenix.field_V;
          var5 = 5 % ((param3 - -11) / 33);
          if (((ue) this).field_d != null) {
            var6 = ((ue) this).field_d;
            var7 = 0;
            L1: while (true) {
              if (var6.field_d == null) {
                var6.field_d = new ue(param2, param1, param0);
                break L0;
              } else {
                var6 = var6.field_d;
                var7++;
                if (var7 <= 1024) {
                  continue L1;
                } else {
                  System.out.println(var7);
                  continue L1;
                }
              }
            }
          } else {
            ((ue) this).field_d = new ue(param2, param1, param0);
            break L0;
          }
        }
    }

    final void a(int param0, ue param1) {
        ue var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (((ue) this).field_d != null) {
                var3 = ((ue) this).field_d;
                L2: while (true) {
                  if (null == var3.field_d) {
                    var3.field_d = param1;
                    break L1;
                  } else {
                    var3 = var3.field_d;
                    continue L2;
                  }
                }
              } else {
                ((ue) this).field_d = param1;
                break L1;
              }
            }
            L3: {
              if (param0 == -19020) {
                break L3;
              } else {
                ((ue) this).field_a = -12;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ue.B(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          try {
            if (!he.field_o.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param0.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                } else {
                  if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            return stackIn_19_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref2;
            stackOut_20_1 = new StringBuilder().append("ue.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 0 + 41);
        }
    }

    ue(int param0, int param1, int param2) {
        ((ue) this).field_c = param2;
        ((ue) this).field_d = null;
        ((ue) this).field_b = param0;
        ((ue) this).field_a = param1;
    }

    static {
    }
}
