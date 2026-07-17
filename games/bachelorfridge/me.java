/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends bca {
    int field_r;
    static js field_t;
    int field_u;
    static String field_q;
    static String field_s;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                me.d((byte) 14);
                break L1;
              }
            }
            stackOut_2_0 = new od(param1, (me) this, ((me) this).field_p);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("me.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (at) (Object) stackIn_3_0;
    }

    me(int param0, nq param1) {
        super(param0, param1);
    }

    final void a(op param0, int param1) {
        try {
            aga discarded$12 = ((me) this).field_l.a(107, param0);
            ((me) this).field_p = !param0.e(((me) this).field_r, ((me) this).field_u, -11066) ? true : false;
            if (null != param0.field_a[((me) this).field_r][((me) this).field_u].field_l) {
                ((me) this).field_p = true;
            }
            if (!(((me) this).field_p)) {
                param0.b((byte) 91, 36, ((me) this).field_r, ((me) this).field_u);
            }
            int var3_int = -2 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "me.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_t = null;
        field_q = null;
        if (param0 < 63) {
            field_s = null;
        }
    }

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -38, param1);
            param1.d(((me) this).field_r, 0);
            param1.d(((me) this).field_u, 0);
            if (param0 > -12) {
                me.d(94);
            }
            param1.d(!((me) this).field_p ? 0 : 1, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "me.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void d(byte param0) {
        if (bp.e(-29919)) {
          return;
        } else {
          if (param0 > -112) {
            me.d((byte) 87);
            sja.field_fb.c(64, (byte) 123);
            return;
          } else {
            sja.field_fb.c(64, (byte) 123);
            return;
          }
        }
    }

    me(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((me) this).field_k = param0.e((byte) 55);
            ((me) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                ((me) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((me) this).field_r = param0.b(16711935);
            ((me) this).field_u = param0.b(16711935);
            ((me) this).field_p = param0.b(16711935) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "This password contains your Player Name, and would be easy to guess";
        field_q = "Macroing or use of bots";
    }
}
