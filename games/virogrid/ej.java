/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends ec {
    private e field_E;
    static int field_L;
    static int field_P;
    private int field_I;
    private int field_G;
    private int field_B;
    private String field_K;
    static String field_H;
    static String field_O;
    static String field_M;
    private boolean field_J;
    static String field_F;

    ej(int param0, int param1, int param2, int param3, fi param4, boolean param5, int param6, int param7, e param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ol) null, (cd) null);
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
          this.field_K = param10;
          this.field_I = param6;
          this.field_E = param8;
          stackIn_4_1 = (param5);
          this.field_J = stackIn_4_1;
          this.field_x = param4;
          this.field_G = param9;
          this.field_B = param7;
          var12_int = this.field_I - this.field_B;
          var13 = this.field_E.a(param10, var12_int, this.field_E.field_H) + this.field_B * 2;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a(var13, true, param1, param0, param2);
          }
          if (this.field_J) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_B * 2 + this.field_I;
          }
          var14 = stackIn_10_0;
          this.field_x.a(param3 - 2 * this.field_B, true, this.field_B + (var13 - param3 >> 1), var14, param2 + (-this.field_I - 3 * this.field_B));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("ej.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String d(int param0) {
        int var2 = this.field_x.field_p ? 1 : 0;
        this.field_x.field_p = this.field_p;
        String var3 = this.field_x.d(41);
        this.field_x.field_p = var2 != 0 ? true : false;
        if (param0 >= 35) {
          return var3;
        }
        return (String) null;
    }

    public static void f(int param0) {
        field_F = null;
        field_O = null;
        if (param0 == 2) {
          field_H = null;
          field_M = null;
          return;
        }
        ej.a(true, 112);
        field_H = null;
        field_M = null;
    }

    final static void a(boolean param0, int param1) {
        df.c();
        if (param1 != 25680) {
          ej.a(true, 87);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var5 = param1 + this.field_l;
        int var6 = this.field_u + param2;
        super.a(param0, param1, param2, param3);
        if (param3 == 0) {
          var7 = this.field_J ? -(this.field_B * 2) - this.field_I + this.field_g : 0;
          this.field_E.a(this.field_K, this.field_B + var7 + var5, var6 + this.field_B, -this.field_B + this.field_I, -(this.field_B * 2) + this.field_m, this.field_G, -1, this.field_J ? 0 : 2, 1, this.field_E.field_H);
          return;
        }
    }

    static {
        field_H = "Asking for or providing contact information";
        field_O = "Time: <%0>";
        field_F = "Yes";
    }
}
