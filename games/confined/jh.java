/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends rg {
    int field_P;
    int field_S;
    static int field_R;
    static String field_U;
    int field_Q;
    int field_W;
    int field_V;
    int field_T;

    public static void b(boolean param0) {
        field_U = null;
        if (param0) {
          return;
        }
        jh.b(false);
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Confined.field_J ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param1 - this.field_q + (-param0 - this.field_P);
          var9 = param5 + (-this.field_S + (-this.field_m - param3));
          if (this.field_W * this.field_W <= var9 * var9 + var8_int * var8_int) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - ne.field_c;
          if (0.0 > var10) {
            var10 = var10 - 3.141592653589793 / (double)this.field_Q;
          } else {
            if (var10 > 0.0) {
              var10 = var10 + 3.141592653589793 / (double)this.field_Q;
            }
          }
          this.field_V = (int)((double)this.field_Q * var10 / 6.283185307179586);
          while (this.field_Q <= this.field_V) {
            this.field_V = this.field_V - this.field_Q;
          }
          while (this.field_V < 0) {
            this.field_V = this.field_V + this.field_Q;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("jh.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private jh() throws Throwable {
        throw new Error();
    }

    static {
        field_R = 0;
        field_U = "Press <%0> to fire cluster missiles";
    }
}
