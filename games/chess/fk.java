/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fk extends l {
    int field_r;
    int field_v;
    int field_t;
    int field_u;
    int field_w;
    int field_s;
    static vl field_q;

    final static ae a(Throwable param0, String param1) {
        ae var2 = null;
        if (param0 instanceof ae) {
          var2 = (ae) ((Object) param0);
          var2.field_h = var2.field_h + ' ' + param1;
        } else {
          var2 = new ae(param0, param1);
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          while (true) {
            param1--;
            if (0 > param1) {
              if (param0 == 0) {
                return;
              }
              fk.a(true, -123);
              return;
            }
            var9 = param3;
            var5 = var9;
            var6 = param4;
            var7 = param2;
            var9[var6] = var7 + (ce.a(var9[var6], 16711422) >> 1);
            param4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("fk.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        a.field_d = false;
        id.a(240, 320, 2, gh.field_b, param0, (byte) -105, v.field_j, 8, gh.field_b, 8, -4 + (v.field_j.field_t + v.field_j.field_H), v.field_j.field_H);
        if (param1 != 15) {
          field_q = (vl) null;
        }
    }

    public static void d(byte param0) {
        int var1 = 82 % ((param0 + 86) / 36);
        field_q = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    fk() {
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = this.field_v << 3;
        int var7 = this.field_u << 3;
        param2 = (15 & var6) + (param2 << 4);
        param0 = (15 & var7) + (param0 << 4);
        if (param4 >= 49) {
          this.a(var6, var7, param2, param0, param3, param1);
          return;
        }
        this.field_w = -35;
        this.a(var6, var7, param2, param0, param3, param1);
    }

    static {
    }
}
