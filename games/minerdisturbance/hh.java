/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    private ta field_e;
    private pi field_b;
    static String field_c;
    static String[] field_a;
    static String field_d;

    final pi a(boolean param0, pi param1) {
        pi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        pi stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
              if (!param0) {
                break L1;
              } else {
                pi discarded$2 = ((hh) this).a(true);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                var3 = ((hh) this).field_e.field_c.field_c;
                break L2;
              } else {
                var3 = param1;
                break L2;
              }
            }
            if (var3 != ((hh) this).field_e.field_c) {
              ((hh) this).field_b = var3.field_c;
              stackOut_8_0 = (pi) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              ((hh) this).field_b = null;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (pi) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("hh.F(").append(param0).append(44);
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
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final pi c(int param0) {
        pi var2 = ((hh) this).field_b;
        if (param0 > -116) {
            field_a = null;
            if (!(var2 != ((hh) this).field_e.field_c)) {
                ((hh) this).field_b = null;
                return null;
            }
            ((hh) this).field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != ((hh) this).field_e.field_c)) {
            ((hh) this).field_b = null;
            return null;
        }
        ((hh) this).field_b = var2.field_c;
        return var2;
    }

    final pi d(int param0) {
        pi var2 = null;
        var2 = ((hh) this).field_e.field_c.field_f;
        if (((hh) this).field_e.field_c == var2) {
          ((hh) this).field_b = null;
          return null;
        } else {
          ((hh) this).field_b = var2.field_f;
          if (param0 != -19864) {
            field_d = null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    hh(ta param0) {
        try {
            ((hh) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "hh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b() {
        int var1 = 55;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final pi a(int param0) {
        pi var2 = null;
        Object var3 = null;
        if (param0 == 12537) {
          var2 = ((hh) this).field_b;
          if (((hh) this).field_e.field_c == var2) {
            ((hh) this).field_b = null;
            return null;
          } else {
            ((hh) this).field_b = var2.field_f;
            return var2;
          }
        } else {
          var3 = null;
          pi discarded$2 = ((hh) this).a(true, (pi) null);
          var2 = ((hh) this).field_b;
          if (((hh) this).field_e.field_c == var2) {
            ((hh) this).field_b = null;
            return null;
          } else {
            ((hh) this).field_b = var2.field_f;
            return var2;
          }
        }
    }

    final pi a(pi param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pi var4 = null;
        Object stackIn_6_0 = null;
        pi stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        pi stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -127 / ((param1 - -18) / 40);
              if (param0 == null) {
                var4 = ((hh) this).field_e.field_c.field_f;
                break L1;
              } else {
                var4 = param0;
                break L1;
              }
            }
            if (var4 == ((hh) this).field_e.field_c) {
              ((hh) this).field_b = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (pi) (Object) stackIn_6_0;
            } else {
              ((hh) this).field_b = var4.field_f;
              stackOut_7_0 = (pi) var4;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("hh.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    final pi a(boolean param0) {
        pi var2 = ((hh) this).field_e.field_c.field_c;
        if (!param0) {
            Object var3 = null;
            pi discarded$4 = ((hh) this).a(true, (pi) null);
            if (!(var2 != ((hh) this).field_e.field_c)) {
                ((hh) this).field_b = null;
                return null;
            }
            ((hh) this).field_b = var2.field_c;
            return var2;
        }
        if (!(var2 != ((hh) this).field_e.field_c)) {
            ((hh) this).field_b = null;
            return null;
        }
        ((hh) this).field_b = var2.field_c;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_d = "Sought the Quiet Life";
        field_c = "The 2x multiplier gives you double points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
    }
}
