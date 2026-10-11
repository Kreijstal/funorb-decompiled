/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt extends ie {
    private int field_A;
    private vn field_D;
    private int field_z;
    private int field_F;
    private boolean field_H;
    static mp field_C;
    static String[] field_G;
    private String field_B;
    static ri field_E;

    final String c(int param0) {
        int var2 = this.field_y.field_k ? 1 : 0;
        this.field_y.field_k = this.field_k;
        String var3 = this.field_y.c(param0);
        this.field_y.field_k = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var5 = this.field_r + param0;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param2 > -35) {
          this.field_D = (vn) null;
          var6 = param1 + this.field_v;
          super.a(param0, param1, (byte) -40, param3);
          if (0 == param3) {
            var7 = this.field_H ? -this.field_A + this.field_q - 2 * this.field_F : 0;
            this.field_D.a(this.field_B, var5 + (var7 + this.field_F), var6 + this.field_F, this.field_A - this.field_F, -(this.field_F * 2) + this.field_p, this.field_z, -1, this.field_H ? 0 : 2, 1, this.field_D.field_s);
            return;
          }
          return;
        }
        var6Lifetime1 = param1 + this.field_v;
        super.a(param0, param1, (byte) -40, param3);
        if (0 == param3) {
          var7Lifetime1 = this.field_H ? -this.field_A + this.field_q - 2 * this.field_F : 0;
          this.field_D.a(this.field_B, var5 + (var7Lifetime1 + this.field_F), var6Lifetime1 + this.field_F, this.field_A - this.field_F, -(this.field_F * 2) + this.field_p, this.field_z, -1, this.field_H ? 0 : 2, 1, this.field_D.field_s);
          return;
        }
    }

    rt(int param0, int param1, int param2, int param3, pk param4, boolean param5, int param6, int param7, vn param8, int param9, String param10) {
        super(param0, param1, param2, param3, (mh) null, (qm) null);
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
          stackIn_4_1 = (param5);
          this.field_H = stackIn_4_1;
          this.field_z = param9;
          this.field_F = param7;
          this.field_A = param6;
          this.field_y = param4;
          this.field_D = param8;
          this.field_B = param10;
          var12_int = this.field_A - this.field_F;
          var13 = this.field_D.a(param10, var12_int, this.field_D.field_s) + 2 * this.field_F;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(118, param0, param1, var13, param2);
          }
          if (this.field_H) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 2 * this.field_F + this.field_A;
          }
          var14 = stackIn_10_0;
          this.field_y.a(117, var14, this.field_F + (-param3 + var13 >> 1), -(this.field_F * 2) + param3, -(this.field_F * 3) - this.field_A + param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("rt.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_G = null;
        field_E = null;
        field_C = null;
        int var1 = 48 % ((-8 - param0) / 55);
    }

    static {
        field_G = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_C = new mp();
    }
}
