/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends hf {
    int field_J;
    static int[] field_R;
    int field_O;
    static String field_K;
    int field_S;
    int field_I;
    int field_N;
    static nh field_L;
    static boolean field_Q;
    static int field_M;
    int field_T;
    static vh field_P;

    public static void b(boolean param0) {
        field_L = null;
        if (param0) {
          field_R = null;
          field_P = null;
          field_K = null;
          return;
        }
        field_Q = true;
        field_R = null;
        field_P = null;
        field_K = null;
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (!super.a(param0, param1, param2, (byte) 117, param4, param5, param6)) {
            if (param3 >= 113) {
              return false;
            }
            this.field_J = 25;
            return false;
          }
          var8_int = param4 - param5 + (-this.field_o - this.field_O);
          var9 = param0 - param6 - this.field_m - this.field_S;
          if (this.field_J * this.field_J > var9 * var9 + var8_int * var8_int) {
            var10 = Math.atan2((double)var9, (double)var8_int) - pd.field_a;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)this.field_T;
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_T;
              }
            }
            this.field_N = (int)(var10 * (double)this.field_T / 6.283185307179586);
            while (this.field_N >= this.field_T) {
              this.field_N = this.field_N - this.field_T;
            }
            while (this.field_N < 0) {
              this.field_N = this.field_N + this.field_T;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("nd.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          pi.field_J = param1;
          if (param0 != -1) {
            String var3 = (String) null;
            nd.a(100, (String) null);
          }
          sf.a(12, 11649);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "nd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private nd() throws Throwable {
        throw new Error();
    }

    static {
        field_R = new int[]{0, 0, 0, 0, 100, 1000, 5000, 0};
        field_M = 128;
        field_P = new vh();
    }
}
