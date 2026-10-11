/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends en {
    private String field_Q;
    static String field_T;
    private int field_V;
    static ah field_U;
    static hl field_S;
    private int field_O;
    private int field_P;
    static long field_N;
    private jb field_R;
    private boolean field_W;

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 10) {
            stackIn_4_0 = qb.a(true, param0, (byte) -126, 10);
            return stackIn_4_0;
          }
          stackIn_2_0 = 80;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("rc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var5 = param1 + this.field_t;
        int var6 = this.field_w + param2;
        super.a(0, param1, param2, param3);
        if (param0 == param3) {
          var7 = !this.field_W ? 0 : -this.field_P + this.field_F - this.field_O * 2;
          this.field_R.a(this.field_Q, this.field_O + var7 + var5, var6 + this.field_O, -this.field_O + this.field_P, -(2 * this.field_O) + this.field_u, this.field_V, -1, !this.field_W ? 2 : 0, 1, this.field_R.field_N);
          return;
        }
    }

    public static void h(int param0) {
        if (param0 != 0) {
          return;
        }
        field_U = null;
        field_S = null;
        field_T = null;
    }

    rc(int param0, int param1, int param2, int param3, na param4, boolean param5, int param6, int param7, jb param8, int param9, String param10) {
        super(param0, param1, param2, param3, (kg) null, (dn) null);
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
          this.field_O = param7;
          stackIn_4_1 = (param5);
          this.field_W = stackIn_4_1;
          this.field_J = param4;
          this.field_Q = param10;
          this.field_R = param8;
          this.field_P = param6;
          this.field_V = param9;
          var12_int = -this.field_O + this.field_P;
          var13 = this.field_R.b(param10, var12_int, this.field_R.field_N) + 2 * this.field_O;
          if (var13 > param3) {
            this.a(var13, param1, -119, param0, param2);
          } else {
            var13 = param3;
          }
          if (!this.field_W) {
            stackIn_10_0 = this.field_O * 2 + this.field_P;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_J.a(-(2 * this.field_O) + param3, (var13 - param3 >> 1) + this.field_O, -124, var14, -(this.field_O * 3) + param2 - this.field_P);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("rc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String e(int param0) {
        int var2 = this.field_J.field_r ? 1 : 0;
        this.field_J.field_r = this.field_r;
        String var3 = this.field_J.e(param0);
        this.field_J.field_r = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_T = "Sorry, you were removed from the game you were in. This happens if you are disconnected for too long or if the server is updated.";
    }
}
