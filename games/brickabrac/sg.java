/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends k {
    static ra field_l;
    static String field_m;
    static String field_k;
    static int field_n;

    sg(vb param0) {
        super(param0);
    }

    final static void e(int param0) {
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = lj.field_j;
        synchronized (var1) {
          L0: {
            cb.field_q = kb.field_Pb;
            gr.field_a = gr.field_a + 1;
            pq.field_k = eo.field_i;
            po.field_a = ep.field_g;
            kb.field_Xb = kn.field_C;
            kn.field_C = false;
            ki.field_e = mi.field_c;
            tb.field_fb = l.field_l;
            qo.field_O = va.field_e;
            mi.field_c = 0;
            var2 = 54 / ((param0 - -49) / 63);
            break L0;
          }
        }
    }

    public static void e(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 <= 122) {
            sg.e(23);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final qh a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        qh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 106) {
                break L1;
              } else {
                field_n = 85;
                break L1;
              }
            }
            L2: {
              if (null != cp.a(param0, (byte) -24)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3_int = stackIn_5_0;
            if (var3_int == 0) {
              stackIn_8_0 = lp.field_xb;
              break L0;
            } else {
              return ae.field_c;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("sg.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final String a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, (byte) 106) == lp.field_xb) {
              stackIn_3_0 = wl.field_O;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -38 % ((param0 - -16) / 50);
              stackIn_5_0 = to.field_l;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("sg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    static {
        field_m = "Loading music";
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = field_n | 2;
        field_n = field_n | 524288;
        field_n = field_n | 1048576;
        field_n = field_n | 33554432;
        field_n = field_n | 67108864;
        field_n = field_n | 268435456;
        field_n = field_n | 2097152;
        field_n = field_n | 4194304;
    }
}
