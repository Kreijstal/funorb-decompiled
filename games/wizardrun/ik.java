/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends mi {
    private int field_M;
    private int field_L;
    private String field_I;
    static String field_H;
    static tb field_G;
    private int field_J;
    private vd field_N;
    private boolean field_O;
    static int field_K;

    final static void g(int param0) {
        ki.h((byte) 91);
        wi.field_J = true;
        lc.field_d = true;
        u.field_A.d(false);
        int var1 = -82 / ((param0 - 71) / 54);
        fc.a(uh.field_f, false, -124);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param0 + this.field_o;
        int var6 = param3 + this.field_l;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var7 = !this.field_O ? 0 : -this.field_M + this.field_r - this.field_L * 2;
        this.field_N.a(this.field_I, var5 + var7 + this.field_L, this.field_L + var6, this.field_M - this.field_L, -(2 * this.field_L) + this.field_n, this.field_J, -1, !this.field_O ? 2 : 0, 1, this.field_N.field_M);
    }

    ik(int param0, int param1, int param2, int param3, ub param4, boolean param5, int param6, int param7, vd param8, int param9, String param10) {
        super(param0, param1, param2, param3, (bf) null, (ce) null);
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
          this.field_J = param9;
          this.field_M = param6;
          this.field_I = param10;
          this.field_N = param8;
          this.field_L = param7;
          this.field_F = param4;
          stackIn_4_1 = (param5);
          this.field_O = stackIn_4_1;
          var12_int = -this.field_L + this.field_M;
          var13 = this.field_N.a(param10, var12_int, this.field_N.field_M) + this.field_L * 2;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(118, param1, var13, param2, param0);
          }
          if (this.field_O) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_M + 2 * this.field_L;
          }
          var14 = stackIn_10_0;
          this.field_F.a(118, (var13 - param3 >> 1) + this.field_L, -(this.field_L * 2) + param3, -this.field_M + (param2 - this.field_L * 3), var14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ik.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_G = null;
        field_H = null;
        if (param0 > -85) {
          field_K = 65;
        }
    }

    final String c(boolean param0) {
        int var2 = this.field_F.field_v ? 1 : 0;
        this.field_F.field_v = this.field_v;
        String var3 = this.field_F.c(param0);
        this.field_F.field_v = var2 != 0 ? true : false;
        if (!param0) {
          return var3;
        }
        return (String) null;
    }

    static {
        field_H = "Passwords must be between 5 and 20 letters and numbers";
        field_K = 480;
    }
}
