/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends kn {
    static int field_V;
    private int field_N;
    private int field_W;
    private String field_R;
    static String field_O;
    static int[] field_P;
    static String field_T;
    private boolean field_S;
    private int field_U;
    private lh field_Q;

    public static void c(boolean param0) {
        field_O = null;
        if (param0) {
          kg.b(false);
          field_P = null;
          field_T = null;
          return;
        }
        field_P = null;
        field_T = null;
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = Chess.field_G;
        try {
          var1_int = 0;
          while (kf.d(18954)) {
            nj.field_u.c((byte) 123);
            if (!nj.field_u.d((byte) 66)) {
              continue;
            }
            var1_int = 1;
          }
          nj.field_u.a(qn.a((byte) 107, re.field_m, ag.field_f), 99, qn.a((byte) 107, hn.field_k, rf.field_b));
          if (nj.field_u.d((byte) 55)) {
            var1_int = 1;
          }
          if (!param0) {
            stackIn_11_0 = -38;
            return stackIn_11_0;
          }
          var2 = 0;
          if (var1_int != 0 &&
            nj.field_u.field_h >= 0) {
            var2 = eh.field_L[nj.field_u.field_h];
            if (var2 == 2) {
              um.a(5);
            }
          }
          stackIn_19_0 = var2;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "kg.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var5 = param3 + this.field_u;
        int var6 = param0 + this.field_r;
        int var7Lifetime1;
        super.a(param0, param1, -96, param3);
        if (param2 >= -80) {
          this.field_N = -28;
          if (0 == param1) {
            var7 = !this.field_S ? 0 : this.field_y - (this.field_W + 2 * this.field_N);
            this.field_Q.a(this.field_R, var5 + (var7 + this.field_N), var6 + this.field_N, this.field_W - this.field_N, -(2 * this.field_N) + this.field_C, this.field_U, -1, this.field_S ? 0 : 2, 1, this.field_Q.field_C);
            return;
          }
          return;
        }
        if (0 == param1) {
          var7Lifetime1 = !this.field_S ? 0 : this.field_y - (this.field_W + 2 * this.field_N);
          this.field_Q.a(this.field_R, var5 + (var7Lifetime1 + this.field_N), var6 + this.field_N, this.field_W - this.field_N, -(2 * this.field_N) + this.field_C, this.field_U, -1, this.field_S ? 0 : 2, 1, this.field_Q.field_C);
          return;
        }
    }

    kg(int param0, int param1, int param2, int param3, mf param4, boolean param5, int param6, int param7, lh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (jm) null, (rg) null);
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
          this.field_M = param4;
          this.field_R = param10;
          stackIn_4_1 = (param5);
          this.field_S = stackIn_4_1;
          this.field_N = param7;
          this.field_U = param9;
          this.field_Q = param8;
          this.field_W = param6;
          var12_int = this.field_W - this.field_N;
          var13 = this.field_Q.b(param10, var12_int, this.field_Q.field_C) + 2 * this.field_N;
          if (var13 > param3) {
            this.a(param1, 34, var13, param2, param0);
          } else {
            var13 = param3;
          }
          if (this.field_S) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_N * 2 + this.field_W;
          }
          var14 = stackIn_10_0;
          this.field_M.a(this.field_N + (-param3 + var13 >> 1), 34, param3 - 2 * this.field_N, -this.field_W + (param2 - 3 * this.field_N), var14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("kg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String g(int param0) {
        int var2 = this.field_M.field_w ? 1 : 0;
        this.field_M.field_w = this.field_w;
        String var3 = this.field_M.g(param0);
        this.field_M.field_w = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_T = "Passwords must be between 5 and 20 characters long";
        field_P = new int[5];
    }
}
