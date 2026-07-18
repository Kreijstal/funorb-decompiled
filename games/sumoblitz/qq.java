/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends dh implements op {
    private int field_T;
    static int field_P;
    private v field_S;
    static String field_Q;
    static vn field_R;

    public static void l(int param0) {
        field_R = null;
        field_Q = null;
    }

    final void a(byte param0, v param1) {
        try {
            int var3_int = 2 % ((param0 - 72) / 46);
            ((qq) this).field_S = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        return wn.a(param0, param1, -107) & tf.a(param1, -2626, param0);
    }

    public final v a(int param0) {
        int var2 = 124 / ((-52 - param0) / 62);
        return ((qq) this).field_S;
    }

    final void g(byte param0) {
        super.g((byte) 127);
        if (param0 > 78) {
          if (null != ((qq) this).field_S) {
            ((qq) this).field_S.a((byte) -117);
            return;
          } else {
            return;
          }
        } else {
          field_Q = null;
          if (null == ((qq) this).field_S) {
            return;
          } else {
            ((qq) this).field_S.a((byte) -117);
            return;
          }
        }
    }

    final static dj a(int param0, mf param1) {
        dj var2 = null;
        RuntimeException var2_ref = null;
        dj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new dj(param1, (ms) (Object) param1);
            jf.field_c.a((ms) (Object) var2, (byte) 39);
            sj.field_c.b((hj) (Object) param1);
            stackOut_0_0 = (dj) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("qq.C(").append(18416).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    qq(String param0, qm param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(int param0) {
        if (((qq) this).field_k) {
          if (((qq) this).field_t != null) {
            if (param0 != -6696) {
              ((qq) this).field_S = null;
              gi.a(pi.field_e, ((qq) this).field_q - (((qq) this).field_T - ko.field_p), -95);
              return ((qq) this).field_t;
            } else {
              gi.a(pi.field_e, ((qq) this).field_q - (((qq) this).field_T - ko.field_p), -95);
              return ((qq) this).field_t;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
            super.a(param0, -86, param2, param3);
            int var5_int = 126 % ((param1 - -25) / 45);
            ((qq) this).field_T = ko.field_p - (((qq) this).field_r + param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "qq.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Names should contain a maximum of 12 characters";
    }
}
