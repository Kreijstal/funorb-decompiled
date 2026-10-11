/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends ie {
    static String field_N;
    private int field_R;
    private boolean field_O;
    static int[] field_Q;
    static int[] field_P;
    private int field_K;
    private int field_M;
    private String field_I;
    static String field_L;
    private jl field_J;

    final String b(byte param0) {
        int var2 = 0;
        String var3 = null;
        String var3Lifetime1;
        int var2Lifetime1;
        if (param0 >= 16) {
          var2 = this.field_H.field_D ? 1 : 0;
          this.field_H.field_D = this.field_D;
          var3 = this.field_H.b((byte) 70);
          this.field_H.field_D = var2 != 0 ? true : false;
          return var3;
        }
        this.field_O = false;
        var2Lifetime1 = this.field_H.field_D ? 1 : 0;
        this.field_H.field_D = this.field_D;
        var3Lifetime1 = this.field_H.b((byte) 70);
        this.field_H.field_D = var2Lifetime1 != 0 ? true : false;
        return var3Lifetime1;
    }

    public static void a(byte param0) {
        field_N = null;
        if (param0 == -84) {
          field_Q = null;
          field_P = null;
          field_L = null;
          return;
        }
        String var2 = (String) null;
        qp.a(true, 1L, (String) null);
        field_Q = null;
        field_P = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = param2 + this.field_z;
        int var6 = param0 + this.field_p;
        super.a(param0, param1, param2, (byte) 125);
        if (param1 != 0) {
          return;
        }
        int var7 = !this.field_O ? 0 : -this.field_M + (this.field_E - this.field_R * 2);
        this.field_J.a(this.field_I, var7 + (var5 + this.field_R), var6 + this.field_R, this.field_M - this.field_R, this.field_C - 2 * this.field_R, this.field_K, -1, !this.field_O ? 2 : 0, 1, this.field_J.field_w);
        int var8 = -35 % ((70 - param3) / 49);
    }

    final static boolean a(boolean param0, long param1, String param2) {
        im var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = re.a(param2, -1);
          if (!param0) {
            qp.a((byte) 102);
          }
          if (var4 != null &&
            null != var4.field_Nb) {
            return true;
          }
          stackIn_10_0 = (null != io.field_c) && (null != ll.a(param1, 14428));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("qp.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    qp(int param0, int param1, int param2, int param3, ng param4, boolean param5, int param6, int param7, jl param8, int param9, String param10) {
        super(param0, param1, param2, param3, (eb) null, (fn) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_H = param4;
          this.field_I = param10;
          stackIn_4_1 = (param5);
          this.field_O = stackIn_4_1;
          this.field_M = param6;
          this.field_R = param7;
          this.field_J = param8;
          this.field_K = param9;
          var12_int = -this.field_R + this.field_M;
          var13 = this.field_J.a(param10, var12_int, this.field_J.field_w) + 2 * this.field_R;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(param2, (byte) 20, param1, param0, var13);
          }
          if (!this.field_O) {
            stackIn_10_0 = this.field_M + 2 * this.field_R;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_H.a(-this.field_M + (param2 - 3 * this.field_R), (byte) 110, (var13 - param3 >> 1) + this.field_R, var14, -(this.field_R * 2) + param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("qp.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        boolean stackIn_13_0 = false;
        if (null == eg.field_n) {
          if (null == hc.field_M) {
            if (param0) {
              if (jg.k(1)) {
                return true;
              }
              stackIn_13_0 = (fl.a(param3, param1, param2, 0));
              return stackIn_13_0;
            }
            qp.a((byte) 0);
            if (jg.k(1)) {
              return true;
            }
            if (!fl.a(param3, param1, param2, 0)) {
              return false;
            }
            return true;
          }
          if (hc.field_M.j(-1)) {
            hc.field_M = null;
            jp.a(62);
            return true;
          }
        } else {
          if (eg.field_n.a(-105)) {
            jp.a(-99);
            return true;
          }
          if (null != hc.field_M &&
            hc.field_M.j(-1)) {
            hc.field_M = null;
            jp.a(62);
            return true;
          }
        }
        if (!param0) {
          qp.a((byte) 0);
        }
        if (jg.k(1)) {
          return true;
        }
        if (fl.a(param3, param1, param2, 0)) {
          return true;
        }
        return false;
    }

    static {
        field_N = "Your email address is used to identify this account";
        field_P = new int[5];
        field_Q = new int[128];
    }
}
