/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends bca {
    static sna field_s;
    static java.math.BigInteger field_q;
    static int field_r;

    final void a(op param0, int param1) {
        try {
            ((sm) this).a(param0, (byte) -2);
            int var3_int = -93 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sm.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    sm(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            ((sm) this).field_k = param0.e((byte) 59);
            ((sm) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                ((sm) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("sm.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        vq stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        vq stackOut_3_0 = null;
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
            if (param0 == 5) {
              stackOut_3_0 = new vq(param1, (sm) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sm.A(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return (at) (Object) stackIn_4_0;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          if (!bp.e(-29919)) {
            sja.field_fb.c(81, (byte) 126);
            sja.field_fb.d(param1, 0);
            sja.field_fb.d(param2, 0);
            sja.field_fb.d(param3, 0);
            return;
          } else {
            return;
          }
        } else {
          String discarded$5 = sm.e(-51);
          if (bp.e(-29919)) {
            return;
          } else {
            sja.field_fb.c(81, (byte) 126);
            sja.field_fb.d(param1, 0);
            sja.field_fb.d(param2, 0);
            sja.field_fb.d(param3, 0);
            return;
          }
        }
    }

    sm(int param0, nq param1) {
        super(param0, param1);
    }

    final static String e(int param0) {
        int var1 = -30 / ((19 - param0) / 63);
        return ig.field_m.g(-32);
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 33;
        field_q = new java.math.BigInteger("65537");
    }
}
