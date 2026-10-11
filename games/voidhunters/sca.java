/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sca extends mc {
    private String field_A;
    private int field_z;
    private no field_v;
    private int field_w;
    private boolean field_y;
    private int field_x;

    sca(int param0, int param1, int param2, int param3, shb param4, boolean param5, int param6, int param7, no param8, int param9, String param10) {
        super(param0, param1, param2, param3, (wwa) null, (sba) null);
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
          this.field_z = param9;
          this.field_t = param4;
          this.field_v = param8;
          this.field_w = param6;
          stackIn_4_1 = (param5);
          this.field_y = stackIn_4_1;
          this.field_A = param10;
          this.field_x = param7;
          var12_int = this.field_w - this.field_x;
          var13 = this.field_v.b(param10, var12_int, this.field_v.field_k) + this.field_x * 2;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(param0, param2, var13, 1, param1);
          }
          if (!this.field_y) {
            stackIn_10_0 = this.field_w + this.field_x * 2;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_t.a(var14, -this.field_w + (param2 - 3 * this.field_x), param3 - this.field_x * 2, 1, this.field_x + (var13 - param3 >> 1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("sca.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = this.field_g + param0;
        if (param2 <= 47) {
          return;
        }
        int var6 = this.field_r + param3;
        super.b(param0, param1, 121, param3);
        if (param1 != 0) {
          return;
        }
        int var7 = this.field_y ? this.field_h - this.field_w - this.field_x * 2 : 0;
        this.field_v.a(this.field_A, this.field_x + (var7 + var5), var6 + this.field_x, this.field_w - this.field_x, -(this.field_x * 2) + this.field_f, this.field_z, -1, this.field_y ? 0 : 2, 1, this.field_v.field_k);
    }

    final String d(byte param0) {
        int var2 = this.field_t.field_e ? 1 : 0;
        this.field_t.field_e = this.field_e;
        String var3 = this.field_t.d(param0);
        this.field_t.field_e = var2 != 0 ? true : false;
        return var3;
    }

    static {
    }
}
