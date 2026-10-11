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
        if (param0 <= 78) {
          field_Q = (String) null;
          if (null != this.field_S) {
            this.field_S.a((byte) -117);
            return;
          }
          return;
        }
        if (null == this.field_S) {
          return;
        }
        this.field_S.a((byte) -117);
    }

    final static dj a(int param0, mf param1) {
        dj var2 = null;
        RuntimeException var2_ref = null;
        dj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18416) {
            qq.b(-31, 81, 66);
          }
          var2 = new dj(param1, param1);
          jf.field_c.a((ms) (var2), (byte) 39);
          sj.field_c.b(param1);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("qq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    qq(String param0, qm param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(int param0) {
        if (!this.field_k) {
          return null;
        }
        if (this.field_t == null) {
          return null;
        }
        if (param0 == -6696) {
          gi.a(pi.field_e, this.field_q - (this.field_T - ko.field_p), -95);
          return this.field_t;
        }
        this.field_S = (v) null;
        gi.a(pi.field_e, this.field_q - (this.field_T - ko.field_p), -95);
        return this.field_t;
    }

    final void a(int param0, int param1, pk param2, int param3) {
        try {
          super.a(param0, -86, param2, param3);
          int var5_int = 126 % ((param1 + 25) / 45);
          this.field_T = ko.field_p - (this.field_r + param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "qq.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_Q = "Names should contain a maximum of 12 characters";
    }
}
