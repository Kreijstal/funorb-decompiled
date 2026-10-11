/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends pj {
    static da field_Q;
    static int field_O;
    private oe field_J;
    static wh field_I;
    private int field_N;
    static String field_L;
    static hf[] field_K;
    static long field_P;
    static String field_M;

    final void a(int param0, int param1, int param2, rc param3) {
        try {
          this.field_N = this.field_N + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "kc.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1463) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kc.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_K = null;
        field_Q = null;
        int var1 = -101 % ((param0 - 35) / 57);
        field_I = null;
        field_L = null;
        field_M = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        o var15 = null;
        o var16 = null;
        o var13 = null;
        o var12 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = SolKnight.field_L ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, 0);
        if (param1 != param3) {
          return;
        }
        int var5 = this.field_m + param2 + (this.field_t >> 1);
        int var6 = (this.field_x >> 1) + param0 + this.field_j;
        qf var8 = this.field_J.b(param3 ^ -9362);
        if (hg.field_E == var8) {
          var15 = gb.field_k[0];
          var9 = var15.field_q << 1;
          var10 = var15.field_r << 1;
          if (null == pk.field_Y) {
            pk.field_Y = new o(var9, var10);
            cl.a(-116, pk.field_Y);
            var15.b(112, 144, var15.field_q << 4, var15.field_r << 4, -this.field_N << 10, 4096);
            mf.e(param3 + 4096);
            pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
            return;
          }
          if (var9 > pk.field_Y.field_p) {
            pk.field_Y = new o(var9, var10);
            cl.a(-116, pk.field_Y);
            var15.b(112, 144, var15.field_q << 4, var15.field_r << 4, -this.field_N << 10, 4096);
            mf.e(param3 + 4096);
            pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
            return;
          }
          if (pk.field_Y.field_t >= var10) {
            cl.a(-97, pk.field_Y);
            mi.a();
            var15.b(112, 144, var15.field_q << 4, var15.field_r << 4, -this.field_N << 10, 4096);
            mf.e(param3 + 4096);
            pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
            return;
          }
          pk.field_Y = new o(var9, var10);
          cl.a(-116, pk.field_Y);
          var15.b(112, 144, var15.field_q << 4, var15.field_r << 4, -this.field_N << 10, 4096);
          mf.e(param3 + 4096);
          pk.field_Y.a(-var15.field_q + var5, -var15.field_r + var6, 256);
          return;
        }
        if (db.field_u == var8) {
          var16 = gb.field_k[0];
          var9Lifetime1 = var16.field_q << 1;
          var10Lifetime1 = var16.field_r << 1;
          if (null == pk.field_Y) {
            pk.field_Y = new o(var9Lifetime1, var10Lifetime1);
            cl.a(-116, pk.field_Y);
            var16.b(112, 144, var16.field_q << 4, var16.field_r << 4, -this.field_N << 10, 4096);
            mf.e(param3 + 4096);
            pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
            return;
          }
          if (var9Lifetime1 > pk.field_Y.field_p) {
            pk.field_Y = new o(var9Lifetime1, var10Lifetime1);
            cl.a(-116, pk.field_Y);
            var16.b(112, 144, var16.field_q << 4, var16.field_r << 4, -this.field_N << 10, 4096);
            mf.e(param3 + 4096);
            pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
            return;
          }
          if (pk.field_Y.field_t >= var10Lifetime1) {
            cl.a(-97, pk.field_Y);
            mi.a();
            var16.b(112, 144, var16.field_q << 4, var16.field_r << 4, -this.field_N << 10, 4096);
            mf.e(param3 + 4096);
            pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
            return;
          }
          pk.field_Y = new o(var9Lifetime1, var10Lifetime1);
          cl.a(-116, pk.field_Y);
          var16.b(112, 144, var16.field_q << 4, var16.field_r << 4, -this.field_N << 10, 4096);
          mf.e(param3 + 4096);
          pk.field_Y.a(-var16.field_q + var5, -var16.field_r + var6, 256);
          return;
        }
        if (var8 == rg.field_f) {
          var13 = gb.field_k[2];
          var13.a(var5 - (var13.field_p >> 1), -(var13.field_t >> 1) + var6, 256);
          return;
        }
        if (var8 == ph.field_g) {
          var12 = gb.field_k[1];
          var12.a(-(var12.field_p >> 1) + var5, -(var12.field_t >> 1) + var6, 256);
          return;
        }
    }

    final String c(byte param0) {
        if (this.field_v) {
          return this.field_J.c(-96);
        }
        if (param0 > 14) {
          return null;
        }
        field_M = (String) null;
        return null;
    }

    kc(oe param0) {
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = new wh();
        field_L = "Please try again in a few minutes.";
        field_M = "Combo Power";
    }
}
