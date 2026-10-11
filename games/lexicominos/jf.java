/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends mg {
    static db field_N;
    private boolean field_J;
    static long field_P;
    private le field_D;
    static String field_G;
    static int field_K;
    private int field_F;
    private int field_E;
    private String field_Q;
    private int field_H;
    static bj field_L;
    static String[] field_C;
    static int field_I;
    static db field_O;
    static bj field_M;

    final String b(int param0) {
        String var3 = null;
        int var2 = this.field_A.field_m ? 1 : 0;
        String var3Lifetime1;
        if (param0 >= 121) {
          this.field_A.field_m = this.field_m;
          var3 = this.field_A.b(122);
          this.field_A.field_m = var2 != 0 ? true : false;
          return var3;
        }
        jf.a((byte) 47, -104);
        this.field_A.field_m = this.field_m;
        var3Lifetime1 = this.field_A.b(122);
        this.field_A.field_m = var2 != 0 ? true : false;
        return var3Lifetime1;
    }

    jf(int param0, int param1, int param2, int param3, w param4, boolean param5, int param6, int param7, le param8, int param9, String param10) {
        super(param0, param1, param2, param3, (rd) null, (vd) null);
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
          this.field_Q = param10;
          this.field_H = param9;
          this.field_A = param4;
          stackIn_4_1 = (param5);
          this.field_J = stackIn_4_1;
          this.field_D = param8;
          this.field_F = param6;
          this.field_E = param7;
          var12_int = this.field_F - this.field_E;
          var13 = this.field_D.a(param10, var12_int, this.field_D.field_E) + 2 * this.field_E;
          if (var13 > param3) {
            this.a(var13, param2, true, param1, param0);
          } else {
            var13 = param3;
          }
          if (this.field_J) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_F + this.field_E * 2;
          }
          var14 = stackIn_10_0;
          this.field_A.a(param3 - 2 * this.field_E, -this.field_F + param2 - this.field_E * 3, true, this.field_E + (var13 - param3 >> 1), var14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("jf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_M = null;
        field_N = null;
        field_G = null;
        field_O = null;
        field_C = null;
        field_L = null;
        if (param0 >= -124) {
          jf.a((byte) -30, 19);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = this.field_t + param2;
        int var6 = param1 + this.field_o;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        int var7 = !this.field_J ? 0 : -(2 * this.field_E) + (-this.field_F + this.field_j);
        this.field_D.a(this.field_Q, var5 - (-var7 - this.field_E), var6 + this.field_E, -this.field_E + this.field_F, this.field_v - 2 * this.field_E, this.field_H, -1, this.field_J ? 0 : 2, 1, this.field_D.field_E);
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) + (param1 >>> 1 & 1431655765);
        param1 = ((-858993457 & param1) >>> 2) + (858993459 & param1);
        param1 = 252645135 & (param1 >>> 4) + param1;
        if (param0 > 80) {
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        jf.a((byte) 29, -19);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    static {
        field_G = "THREE";
        field_L = new bj(0);
        field_C = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_O = new db(311, 450);
        field_M = new bj(3);
    }
}
