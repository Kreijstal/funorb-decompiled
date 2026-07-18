/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends vg {
    static jea field_g;
    private int field_i;
    private int field_h;
    private int field_f;

    private final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 96) {
          L0: {
            this.d(-115);
            if (-7 >= ((wf) this).field_f) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-7 <= ((wf) this).field_f) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_g = null;
    }

    final void a(int param0, kh param1) {
        try {
            param1.a((byte) 2, ((wf) this).field_f, 4);
            if (param0 != -29928) {
                boolean discarded$0 = this.b(-112);
            }
            param1.a((byte) -5, ((wf) this).field_h / 50, 6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wf.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        if (param0 != 100) {
            return;
        }
        ((wf) this).field_i = ((wf) this).field_h;
    }

    final int a(byte param0) {
        if (param0 != 91) {
            ((wf) this).field_f = -58;
            return ((wf) this).field_f;
        }
        return ((wf) this).field_f;
    }

    final boolean b(byte param0) {
        int var2 = 0;
        var2 = -122 % ((7 - param0) / 52);
        if (-1 > ((wf) this).field_h) {
          if (-1 < ((wf) this).field_i) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void c(int param0) {
        ((wf) this).field_i = ((wf) this).field_i - 1;
        if (param0 != -9) {
            field_g = null;
        }
    }

    final wf e(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((wf) this).a((byte) -15, (hca) null);
          return new wf(((wf) this).field_f, ((wf) this).field_h);
        } else {
          return new wf(((wf) this).field_f, ((wf) this).field_h);
        }
    }

    private wf(int param0, int param1) {
        ((wf) this).field_h = 100;
        ((wf) this).field_f = param0;
        ((wf) this).field_h = param1;
        this.d(100);
    }

    final boolean a(byte param0, hca param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (this.b(97)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                var3_int = ((wf) this).field_f;
                if (6 == var3_int) {
                  break L1;
                } else {
                  break L1;
                }
              }
              var3_int = -41 % ((param0 - 43) / 44);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("wf.E(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    wf(la param0, kh param1) {
        ((wf) this).field_h = 100;
        try {
            ((wf) this).field_f = param1.b((byte) 44, 4);
            if (param0.field_E > 8) {
                ((wf) this).field_h = 50 * param1.b((byte) 44, 6);
            } else {
                ((wf) this).field_h = 100;
            }
            this.d(100);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
