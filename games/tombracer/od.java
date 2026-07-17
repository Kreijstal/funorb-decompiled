/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends vg {
    static ura field_h;
    static int field_i;
    od field_f;
    od field_g;
    long field_j;

    public static void b(int param0) {
        if (param0 != 0) {
            field_i = 103;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final boolean d(int param0) {
        if (((od) this).field_f == null) {
            return false;
        }
        if (param0 != 0) {
            Object var3 = null;
            hc discarded$0 = od.a(-117, (uia) null);
            return true;
        }
        return true;
    }

    final void a(boolean param0, long param1) {
        if (!param0) {
          if (((od) this).field_f != null) {
            throw new RuntimeException();
          } else {
            ((od) this).field_j = param1;
            return;
          }
        } else {
          od.b(-57);
          if (((od) this).field_f != null) {
            throw new RuntimeException();
          } else {
            ((od) this).field_j = param1;
            return;
          }
        }
    }

    final void c(int param0) {
        if (((od) this).field_f != null) {
          if (param0 != -7975) {
            return;
          } else {
            ((od) this).field_f.field_g = ((od) this).field_g;
            ((od) this).field_g.field_f = ((od) this).field_f;
            ((od) this).field_f = null;
            ((od) this).field_g = null;
            return;
          }
        } else {
          return;
        }
    }

    final static hc a(int param0, uia param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        hc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        hc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = new hc(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(-32768), param1.h(255));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (hc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("od.VA(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    protected od() {
    }

    final long e(int param0) {
        if (param0 != 0) {
            return -21L;
        }
        return ((od) this).field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ura();
        field_i = 0;
    }
}
