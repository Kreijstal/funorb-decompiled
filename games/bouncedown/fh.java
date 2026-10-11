/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends wd {
    static eh field_C;
    int field_I;
    int field_H;
    int field_J;
    static mf field_B;
    int field_F;
    int field_D;
    int field_K;

    public static void a(boolean param0) {
        field_B = null;
        field_C = null;
        if (!param0) {
          return;
        }
        CharSequence var2 = (CharSequence) null;
        fh.a((byte) 84, (CharSequence) null);
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 73) {
            stackIn_4_0 = f.a((byte) 108, param1, false);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("fh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = param3 - (this.field_H + param2 + this.field_r);
          var9 = -param6 - (this.field_i + (this.field_D - param5));
          if (this.field_I * this.field_I > var8_int * var8_int + var9 * var9) {
            var10 = Math.atan2((double)var9, (double)var8_int) - q.field_L;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)this.field_K;
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_K;
              }
            }
            this.field_J = (int)((double)this.field_K * var10 / 6.283185307179586);
            while (this.field_J >= this.field_K) {
              this.field_J = this.field_J - this.field_K;
            }
            while (this.field_J < 0) {
              this.field_J = this.field_J + this.field_K;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("fh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private fh() throws Throwable {
        throw new Error();
    }

    static {
        field_C = new eh(15, 0, 1, 0);
    }
}
