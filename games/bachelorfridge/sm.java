/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends bca {
    static sna field_s;
    static java.math.BigInteger field_q;
    static int field_r;

    final void a(op param0, int param1) {
        try {
            this.a(param0, (byte) -2);
            int var3_int = -93 % ((12 - param1) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    sm(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            this.field_k = param0.e((byte) 59);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (-1 < (var2_int ^ -1)) {
                break L0;
              } else {
                this.field_o.a(dca.a((byte) 102, param0), true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("sm.<init>(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        vq stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = new vq(param1, (sm) (this));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (at) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("sm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
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
          sm.e(-51);
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
        if (param0 != -1) {
            sm.e(-8);
            field_s = null;
            field_q = null;
            return;
        }
        field_s = null;
        field_q = null;
    }

    static {
        field_r = 33;
        field_q = new java.math.BigInteger("65537");
    }
}
