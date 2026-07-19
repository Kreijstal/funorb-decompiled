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
        if (param0 != -15648) {
            field_R = (vn) null;
            field_R = null;
            field_Q = null;
            return;
        }
        field_R = null;
        field_Q = null;
    }

    final void a(byte param0, v param1) {
        try {
            int var3_int = 2 % ((param0 - 72) / 46);
            this.field_S = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 >= -6) {
            return true;
        }
        return wn.a(param0, param1, -107) & tf.a(param1, -2626, param0);
    }

    public final v a(int param0) {
        int var2 = 124 / ((-52 - param0) / 62);
        return this.field_S;
    }

    final void g(byte param0) {
        super.g((byte) 127);
        if (param0 > 78) {
          if (null != this.field_S) {
            this.field_S.a((byte) -117);
            return;
          } else {
            return;
          }
        } else {
          field_Q = (String) null;
          if (null == this.field_S) {
            return;
          } else {
            this.field_S.a((byte) -117);
            return;
          }
        }
    }

    final static dj a(int param0, mf param1) {
        boolean discarded$2 = false;
        dj var2 = null;
        RuntimeException var2_ref = null;
        dj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dj stackOut_2_0 = null;
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
              if (param0 == 18416) {
                break L1;
              } else {
                discarded$2 = qq.b(-31, 81, 66);
                break L1;
              }
            }
            var2 = new dj(param1, param1);
            jf.field_c.a((ms) (var2), (byte) 39);
            sj.field_c.b(param1);
            stackOut_2_0 = (dj) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("qq.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    qq(String param0, qm param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(int param0) {
        if (this.field_k) {
          if (this.field_t != null) {
            if (param0 != -6696) {
              this.field_S = (v) null;
              gi.a(pi.field_e, this.field_q - (this.field_T - ko.field_p), -95);
              return this.field_t;
            } else {
              gi.a(pi.field_e, this.field_q - (this.field_T - ko.field_p), -95);
              return this.field_t;
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
            this.field_T = ko.field_p - (this.field_r + param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "qq.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_Q = "Names should contain a maximum of 12 characters";
    }
}
