/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends rm {
    int field_G;
    static uf field_Q;
    static ng field_H;
    int field_O;
    static String field_M;
    int field_K;
    static String field_N;
    int field_J;
    int field_P;
    int field_L;
    static int field_I;

    public static void a(boolean param0) {
        field_N = null;
        field_M = null;
        field_Q = null;
        if (param0) {
          field_Q = (uf) null;
          field_H = null;
          return;
        }
        field_H = null;
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param5 - (param0 + (this.field_k + this.field_G));
          var9 = param1 - this.field_o + (-param2 - this.field_J);
          if (this.field_P * this.field_P > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - sj.field_L;
            if (!(var10 < 0.0)) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)this.field_O;
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)this.field_O;
            }
            this.field_K = (int)((double)this.field_O * var10 / 6.283185307179586);
            while (this.field_O <= this.field_K) {
              this.field_K = this.field_K - this.field_O;
            }
            while (this.field_K < 0) {
              this.field_K = this.field_K + this.field_O;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_17_0 = var8;
          stackIn_17_1 = new StringBuilder().append("hg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private hg() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0) {
        if (param0 <= 36) {
          field_H = (ng) null;
          return -mk.field_d + vf.field_t;
        }
        return -mk.field_d + vf.field_t;
    }

    static {
        field_N = "Checking";
    }
}
