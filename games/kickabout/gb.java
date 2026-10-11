/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends wi {
    private int field_L;
    static int field_K;
    static String field_I;
    static String field_H;
    static boolean field_F;
    static ut[] field_G;
    private l field_J;

    public static void a(byte param0) {
        int var1 = 84 / ((-83 - param0) / 35);
        field_G = null;
        field_H = null;
        field_I = null;
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
          this.field_L = this.field_L + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String f(int param0) {
        if (param0 != -1) {
          field_G = (ut[]) null;
          if (this.field_m) {
            return this.field_J.b(param0 ^ 79);
          }
          return null;
        }
        if (this.field_m) {
          return this.field_J.b(param0 ^ 79);
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ut var15 = null;
        ut var16 = null;
        ut var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = Kickabout.field_G;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, (int) (char)param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        int var5 = (this.field_n >> 1) + (param2 + this.field_t);
        int var6 = (this.field_i >> 1) + (this.field_g + param3);
        rv var8 = this.field_J.c(param1 - 24472);
        if (var8 == mn.field_c) {
          var15 = jc.field_g[0];
          var9 = var15.field_o << 1;
          var10 = var15.field_v << 1;
          if (null == nq.field_G) {
            nq.field_G = new ut(var9, var10);
            iw.a(-54, nq.field_G);
            var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -this.field_L << 10, 4096);
            ta.e(120);
            nq.field_G.c(var5 - var15.field_o, var6 - var15.field_v, 256);
            return;
          }
          if (nq.field_G.field_q < var9) {
            nq.field_G = new ut(var9, var10);
            iw.a(-54, nq.field_G);
            var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -this.field_L << 10, 4096);
            ta.e(120);
            nq.field_G.c(var5 - var15.field_o, var6 - var15.field_v, 256);
            return;
          }
          if (nq.field_G.field_w < var10) {
            nq.field_G = new ut(var9, var10);
            iw.a(-54, nq.field_G);
            var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -this.field_L << 10, 4096);
            ta.e(120);
            nq.field_G.c(var5 - var15.field_o, var6 - var15.field_v, 256);
            return;
          }
          iw.a(116, nq.field_G);
          on.b();
          var15.b(112, 144, var15.field_o << 4, var15.field_v << 4, -this.field_L << 10, 4096);
          ta.e(120);
          nq.field_G.c(var5 - var15.field_o, var6 - var15.field_v, 256);
          return;
        }
        if (var8 == en.field_p) {
          var16 = jc.field_g[0];
          var9Lifetime1 = var16.field_o << 1;
          var10Lifetime1 = var16.field_v << 1;
          if (null == nq.field_G) {
            nq.field_G = new ut(var9Lifetime1, var10Lifetime1);
            iw.a(-54, nq.field_G);
            var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -this.field_L << 10, 4096);
            ta.e(120);
            nq.field_G.c(var5 - var16.field_o, var6 - var16.field_v, 256);
            return;
          }
          if (nq.field_G.field_q < var9Lifetime1) {
            nq.field_G = new ut(var9Lifetime1, var10Lifetime1);
            iw.a(-54, nq.field_G);
            var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -this.field_L << 10, 4096);
            ta.e(120);
            nq.field_G.c(var5 - var16.field_o, var6 - var16.field_v, 256);
            return;
          }
          if (nq.field_G.field_w < var10Lifetime1) {
            nq.field_G = new ut(var9Lifetime1, var10Lifetime1);
            iw.a(-54, nq.field_G);
            var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -this.field_L << 10, 4096);
            ta.e(120);
            nq.field_G.c(var5 - var16.field_o, var6 - var16.field_v, 256);
            return;
          }
          iw.a(116, nq.field_G);
          on.b();
          var16.b(112, 144, var16.field_o << 4, var16.field_v << 4, -this.field_L << 10, 4096);
          ta.e(120);
          nq.field_G.c(var5 - var16.field_o, var6 - var16.field_v, 256);
          return;
        }
        if (jt.field_Bb == var8) {
          var13 = jc.field_g[2];
          var13.c(-(var13.field_q >> 1) + var5, -(var13.field_w >> 1) + var6, 256);
          return;
        }
        if (var8 != he.field_yb) {
          return;
        }
        ut var12 = jc.field_g[1];
        var12.c(-(var12.field_q >> 1) + var5, var6 - (var12.field_w >> 1), 256);
    }

    final boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          this.field_L = -79;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gb.HA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    gb(l param0) {
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = "Show all private chat";
        field_K = -1;
        field_H = "TEAM SELECTION";
    }
}
