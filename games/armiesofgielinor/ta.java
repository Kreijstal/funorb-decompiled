/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends nl {
    static NodeDeque field_O;
    private int field_H;
    private int field_S;
    private String field_K;
    static String field_Q;
    private int field_I;
    static boolean field_L;
    static int field_N;
    static String field_M;
    static je field_R;
    private boolean field_J;
    private BitmapFont field_P;

    final String h(int param0) {
        int var2 = 0;
        String var3 = null;
        String var3Lifetime1;
        int var2Lifetime1;
        if (param0 == 21384) {
          var2 = this.field_E.field_t ? 1 : 0;
          this.field_E.field_t = this.field_t;
          var3 = this.field_E.h(param0 + 0);
          this.field_E.field_t = var2 != 0 ? true : false;
          return var3;
        }
        this.field_J = true;
        var2Lifetime1 = this.field_E.field_t ? 1 : 0;
        this.field_E.field_t = this.field_t;
        var3Lifetime1 = this.field_E.h(param0 + 0);
        this.field_E.field_t = var2Lifetime1 != 0 ? true : false;
        return var3Lifetime1;
    }

    public static void j(int param0) {
        if (param0 != -12819) {
          return;
        }
        field_O = null;
        field_M = null;
        field_Q = null;
        field_R = null;
    }

    final static void a(String param0, int param1, int param2, String param3, String param4, int param5) {
        mo var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new mo(param1, param3, param5, param0, param4);
          SectorCacheStore.a(param2 ^ -19023, var6);
          if (param2 == -18119) {
            return;
          }
          field_N = 8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("ta.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(')').toString());
        }
    }

    ta(int param0, int param1, int param2, int param3, kb param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, String param10) {
        super(param0, param1, param2, param3, (kh) null, (qo) null);
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
          this.field_E = param4;
          this.field_H = param7;
          this.field_I = param9;
          this.field_S = param6;
          this.field_K = param10;
          this.field_P = param8;
          stackIn_4_1 = (param5);
          this.field_J = stackIn_4_1;
          var12_int = this.field_S - this.field_H;
          var13 = this.field_P.a(param10, var12_int, this.field_P.field_H) + 2 * this.field_H;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(param0, param2, param1, 8192, var13);
          }
          if (!this.field_J) {
            stackIn_10_0 = 2 * this.field_H + this.field_S;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_E.a(var14, param2 + (-this.field_S - this.field_H * 3), (var13 - param3 >> 1) + this.field_H, 8192, param3 - 2 * this.field_H);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ta.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = this.field_B + param0;
        int var6 = param1 + this.field_p;
        super.a(param0, param1, (byte) -90, param3);
        if (param3 != 0) {
          return;
        }
        int var7 = this.field_J ? -(2 * this.field_H) + (-this.field_S + this.field_l) : 0;
        this.field_P.a(this.field_K, this.field_H + var7 + var5, this.field_H + var6, this.field_S - this.field_H, -(this.field_H * 2) + this.field_w, this.field_I, -1, !this.field_J ? 2 : 0, 1, this.field_P.field_H);
        if (param2 <= -82) {
          return;
        }
        field_Q = (String) null;
    }

    static {
        field_O = new NodeDeque();
        field_Q = "To <%0>: ";
        field_L = false;
        field_M = "Unpacking music";
    }
}
