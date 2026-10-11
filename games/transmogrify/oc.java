/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends fi {
    private String field_z;
    static int field_y;
    static String field_E;
    private kg field_D;
    private boolean field_B;
    static qj field_G;
    private int field_A;
    private int field_C;
    private int field_F;
    static String field_H;

    oc(int param0, int param1, int param2, int param3, qg param4, boolean param5, int param6, int param7, kg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ui) null, (ma) null);
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
          this.field_v = param4;
          this.field_C = param9;
          this.field_D = param8;
          this.field_A = param6;
          stackIn_4_1 = (param5);
          this.field_B = stackIn_4_1;
          this.field_z = param10;
          this.field_F = param7;
          var12_int = this.field_A - this.field_F;
          var13 = this.field_D.a(param10, var12_int, this.field_D.field_y) + this.field_F * 2;
          if (param3 < var13) {
            this.a(-124, param1, param0, param2, var13);
          } else {
            var13 = param3;
          }
          if (this.field_B) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 2 * this.field_F + this.field_A;
          }
          var14 = stackIn_10_0;
          this.field_v.a(-109, this.field_F + (-param3 + var13 >> 1), var14, -this.field_A + (param2 - this.field_F * 3), param3 - 2 * this.field_F);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("oc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String f(int param0) {
        int var2 = this.field_v.field_g ? 1 : 0;
        this.field_v.field_g = this.field_g;
        String var3 = this.field_v.f(param0);
        this.field_v.field_g = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var7 = 0;
        int var5 = param0 + this.field_p;
        int var6 = this.field_n + param1;
        super.a(param0, param1, param2, (byte) -125);
        if (0 == param2) {
          var7 = this.field_B ? this.field_l - this.field_A - 2 * this.field_F : 0;
          this.field_D.a(this.field_z, var7 + var5 + this.field_F, this.field_F + var6, -this.field_F + this.field_A, -(this.field_F * 2) + this.field_h, this.field_C, -1, this.field_B ? 0 : 2, 1, this.field_D.field_y);
          int var8 = -104 / ((param3 - 77) / 34);
          return;
        }
    }

    final static td j(int param0) {
        if (param0 != 0) {
          field_G = (qj) null;
          return (td) ((Object) new kf());
        }
        return (td) ((Object) new kf());
    }

    public static void i(int param0) {
        field_G = null;
        field_E = null;
        if (param0 <= 115) {
          oc.i(77);
          field_H = null;
          return;
        }
        field_H = null;
    }

    static {
        field_E = "Connection lost - attempting to reconnect";
        field_y = 0;
        field_G = new qj();
        field_H = "Waiting for sound effects";
    }
}
