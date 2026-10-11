/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends pa {
    static String[] field_G;
    private int field_D;
    private int field_J;
    private String field_F;
    private rb field_E;
    private boolean field_K;
    static rb field_H;
    private int field_I;

    final String d(int param0) {
        int var3 = 50 % ((10 - param0) / 58);
        int var2 = this.field_z.field_l ? 1 : 0;
        this.field_z.field_l = this.field_l;
        String var4 = this.field_z.d(-71);
        this.field_z.field_l = var2 != 0 ? true : false;
        return var4;
    }

    public static void c(boolean param0) {
        field_H = null;
        if (param0) {
          field_H = (rb) null;
          field_G = null;
          return;
        }
        field_G = null;
    }

    q(int param0, int param1, int param2, int param3, ga param4, boolean param5, int param6, int param7, rb param8, int param9, String param10) {
        super(param0, param1, param2, param3, (io) null, (sk) null);
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
          this.field_I = param7;
          this.field_D = param6;
          this.field_F = param10;
          this.field_z = param4;
          this.field_J = param9;
          stackIn_4_1 = (param5);
          this.field_K = stackIn_4_1;
          this.field_E = param8;
          var12_int = this.field_D - this.field_I;
          var13 = this.field_E.b(param10, var12_int, this.field_E.field_I) + this.field_I * 2;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(-109, param1, param0, param2, var13);
          }
          if (!this.field_K) {
            stackIn_10_0 = this.field_D + 2 * this.field_I;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_z.a(118, this.field_I + (var13 - param3 >> 1), var14, param2 - this.field_D - this.field_I * 3, param3 - 2 * this.field_I);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("q.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_k;
        int var6 = param0 + this.field_j;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        }
        int var7 = this.field_K ? -(2 * this.field_I) + (-this.field_D + this.field_i) : 0;
        this.field_E.a(this.field_F, this.field_I + (var5 + var7), this.field_I + var6, this.field_D - this.field_I, -(this.field_I * 2) + this.field_n, this.field_J, -1, !this.field_K ? 2 : 0, 1, this.field_E.field_I);
    }

    static {
        field_G = new String[]{"Washington D.C.", "London"};
    }
}
