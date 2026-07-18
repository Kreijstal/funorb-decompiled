/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private kp field_c;
    static kp field_b;
    private wf field_a;

    final static sn[] a() {
        if (vs.field_c == null) {
          vs.field_c = mq.a((byte) 122, new int[2]);
          return null;
        } else {
          return null;
        }
    }

    final wf a(byte param0) {
        wf var2 = null;
        var2 = ((an) this).field_a;
        if (((an) this).field_c.field_e == var2) {
          ((an) this).field_a = null;
          return null;
        } else {
          ((an) this).field_a = var2.field_c;
          if (param0 != 120) {
            wf discarded$2 = ((an) this).a((byte) -65);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final wf a(int param0) {
        wf var2 = ((an) this).field_a;
        if (!(((an) this).field_c.field_e != var2)) {
            ((an) this).field_a = null;
            return null;
        }
        int var3 = -30 % ((param0 - -74) / 43);
        ((an) this).field_a = var2.field_a;
        return var2;
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        wf stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((an) this).field_c.field_e.field_c;
                break L1;
              }
            }
            if (((an) this).field_c.field_e != var3) {
              if (param1 == 0) {
                ((an) this).field_a = var3.field_c;
                stackOut_9_0 = (wf) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (wf) (Object) stackIn_8_0;
              }
            } else {
              ((an) this).field_a = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (wf) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("an.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final wf c(int param0) {
        wf var2 = null;
        var2 = ((an) this).field_c.field_e.field_a;
        if (((an) this).field_c.field_e != var2) {
          ((an) this).field_a = var2.field_a;
          if (param0 != -1372) {
            ((an) this).field_c = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((an) this).field_a = null;
          return null;
        }
    }

    public static void b() {
        field_b = null;
    }

    final wf a(int param0, wf param1) {
        wf var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        wf stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        wf stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 40) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                var3 = param1;
                break L2;
              } else {
                var3 = ((an) this).field_c.field_e.field_a;
                break L2;
              }
            }
            if (var3 == ((an) this).field_c.field_e) {
              ((an) this).field_a = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (wf) (Object) stackIn_8_0;
            } else {
              ((an) this).field_a = var3.field_a;
              stackOut_9_0 = (wf) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("an.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final wf b(boolean param0) {
        if (!param0) {
            return null;
        }
        wf var2 = ((an) this).field_c.field_e.field_c;
        if (!(((an) this).field_c.field_e != var2)) {
            ((an) this).field_a = null;
            return null;
        }
        ((an) this).field_a = var2.field_c;
        return var2;
    }

    an(kp param0) {
        try {
            ((an) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "an.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kp();
    }
}
