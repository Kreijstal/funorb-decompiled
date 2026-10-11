/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends ae {
    static boolean field_T;
    int field_S;
    static hl field_Q;
    static int field_ab;
    int field_bb;
    int field_V;
    static int[] field_Y;
    int field_U;
    static oh field_X;
    static int[] field_W;
    static oh field_P;
    static kh[] field_cb;
    int field_R;
    int field_Z;

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_V - param1 + (-this.field_t + param6);
          var9 = param5 - param3 - this.field_w - this.field_Z;
          if (var9 * var9 + var8_int * var8_int < this.field_bb * this.field_bb) {
            var10 = Math.atan2((double)var9, (double)var8_int) - ik.field_b;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)this.field_R;
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)this.field_R;
              }
            }
            this.field_S = (int)((double)this.field_R * var10 / 6.283185307179586);
            while (this.field_S >= this.field_R) {
              this.field_S = this.field_S - this.field_R;
            }
            while (this.field_S < 0) {
              this.field_S = this.field_S + this.field_R;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("qd.PA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static el c(int param0, int param1) {
        if (param0 >= 107) {
          return null != db.field_e ? (el) (db.field_e.a((long)param1, 1)) : null;
        }
        field_P = (oh) null;
        return null != db.field_e ? (el) (db.field_e.a((long)param1, 1)) : null;
    }

    public static void d(boolean param0) {
        if (!param0) {
          return;
        }
        field_cb = null;
        field_Y = null;
        field_W = null;
        field_P = null;
        field_Q = null;
        field_X = null;
    }

    private qd() throws Throwable {
        throw new Error();
    }

    static {
        field_Y = new int[4];
        field_T = false;
    }
}
