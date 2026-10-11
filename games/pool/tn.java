/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends ma {
    static int field_u;
    static String field_p;
    static ba field_n;
    int field_s;
    int field_v;
    static int field_o;
    int field_l;
    static vh field_w;
    int field_t;
    int field_m;
    int field_r;
    int[] field_q;

    final static void a(uf param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        qe var7 = null;
        try {
          var6 = param0.field_I.j(param1 + 16848);
          var7 = var6;
          if (param1 != -16813) {
            field_w = (vh) null;
          }
          var3 = param0.i(-1) ? 1 : 0;
          if ((hq.field_c & param0.field_L) != 0) {
            stackIn_8_0 = (var3 != 0) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var4 = stackIn_8_0;
          if ((hq.field_c & param0.field_L) != 0) {
            stackIn_14_0 = (var3 == 0) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var5 = stackIn_14_0;
          if (var4 != 0 &&
            var7.c(true)) {
            rb.a(nr.a(new String[]{param0.field_I.field_h[var6.field_L]}, -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
            return;
          }
          if (var4 != 0 &&
            var7.a(-110)) {
            rb.a(nr.a(new String[]{param0.field_I.field_h[var6.field_L]}, -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
            return;
          }
          if (var5 != 0) {
            if (!var7.c((byte) 91)) {
              return;
            }
            rb.a(nr.a(new String[]{param0.field_I.field_h[(1 + var7.field_L) % param0.field_I.field_n]}, -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("tn.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        try {
          this.field_t = param2;
          this.field_l = param1;
          this.field_m = param5;
          this.field_v = param0;
          this.field_s = param7;
          this.field_r = param3;
          this.field_q = param6;
          if (param4 > -42) {
            int[] var10 = (int[]) null;
            this.a(-126, -20, -108, -2, -31, -56, (int[]) null, -107);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_w = null;
        if (param0 <= 4) {
          return;
        }
        field_n = null;
    }

    tn() {
    }

    static {
        field_p = "Cannot put the cue there! Try raising it.";
        field_u = 0;
    }
}
