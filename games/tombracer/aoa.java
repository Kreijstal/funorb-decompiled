/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aoa implements bo {
    private ufa field_a;
    static apa field_b;

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        try {
            this.field_a.a(-2016804080, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "aoa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 38) {
            return;
        }
        if (!(null != fna.field_j)) {
            return;
        }
        int var2 = (int)(qk.field_w[param1] * 20000.0);
        if (!(var2 != 0)) {
            var2 = 1;
        }
        ((psa) ((Object) ab.field_n.field_n)).c(-30515, 0, var2, param1);
    }

    final static void b(boolean param0) {
        wt.a((byte) 126);
        jsa.a(false, 4);
        if (!param0) {
            aoa.b(false);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 20 % ((-9 - param0) / 59);
    }

    final ufa a(boolean param0) {
        if (param0) {
            this.field_a = (ufa) null;
            return this.field_a;
        }
        return this.field_a;
    }

    public final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_a = new ufa();
              this.field_a.a(param0, (byte) 122);
              if (param1 == -19) {
                break L1;
              } else {
                field_b = (apa) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("aoa.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
