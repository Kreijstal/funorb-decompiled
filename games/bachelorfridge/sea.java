/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sea implements qda {
    private int field_l;
    private int field_i;
    private int field_a;
    static boolean field_j;
    private int field_m;
    private int field_b;
    private int field_n;
    private po field_c;
    private int field_h;
    private int field_e;
    private int field_f;
    static sna field_k;
    private int field_d;
    private int field_g;

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        wj stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dia var11 = null;
        try {
          if (param1 instanceof dia) {
            stackIn_3_0 = (wj) (param1);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (dia) (stackIn_3_0);
          if (var11 != null) {
            param4 = param4 & var11.field_z;
          }
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
          }
          dg.c(param1.field_s + param0, param1.field_v + param3, param1.field_p, param1.field_q, this.field_e);
          var8 = param1.field_s + param0 + this.field_h;
          var9 = this.field_a + param1.field_v + param3;
          dg.e(var8, var9, this.field_f, this.field_m, 5592405);
          dg.c(var8, var9, this.field_f, this.field_m, var7);
          if (param2 != 32679) {
            sea.a((byte) 118);
          }
          if (var11.field_B) {
            dg.d(var8, var9, var8 + this.field_f, var9 + this.field_m, 1);
            dg.d(this.field_f + var8, var9, var8, this.field_m + var9, 1);
          }
          if (this.field_c != null) {
            var10 = this.field_n + (this.field_h + this.field_f);
            this.field_c.a(param1.field_w, var10 + param1.field_s + param0, param1.field_v + (param3 + this.field_b), -this.field_n + (-var10 + param1.field_p), param1.field_q - (this.field_n << 1), this.field_l, this.field_d, this.field_i, this.field_g, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("sea.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -12) {
          return;
        }
        field_k = null;
    }

    sea(po param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_i = 1;
        this.field_g = 1;
        try {
          this.field_d = param4;
          this.field_f = param8;
          this.field_h = param5;
          this.field_c = param0;
          this.field_n = param1;
          this.field_l = param3;
          this.field_b = param2;
          this.field_a = param6;
          this.field_m = param7;
          this.field_e = param9;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
    }
}
