/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gn {
    static ka[] field_M;
    private int field_Q;
    static String field_R;
    static int field_S;
    private j field_P;
    static boolean field_O;
    static boolean field_N;

    final static void a(byte param0, vl param1, int param2) {
        ga var3 = null;
        try {
          if (param0 != 127) {
            field_M = (ka[]) null;
          }
          var3 = ma.field_a;
          var3.b((byte) -35, param2);
          var3.a(param0 ^ -41, param1.field_g);
          var3.a(param1.field_i, (byte) -92);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "uk.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ja var15 = null;
        ja var18 = null;
        ja var12 = null;
        ja var21 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = ZombieDawnMulti.field_E ? 1 : 0;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        int var5 = (this.field_n >> 1) + param3 + this.field_y;
        int var6 = param1 - (-this.field_i - (this.field_w >> 1));
        re var8 = this.field_P.d(80);
        if (var8 == h.field_H) {
          var15 = rj.field_I[0];
          var9 = var15.field_z << 1;
          var10 = var15.field_u << 1;
          if (null == bp.field_s) {
            bp.field_s = new ja(var9, var10);
            r.a(0, bp.field_s);
            var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -this.field_Q << 10, 4096);
            ql.a(true);
            bp.field_s.e(var5 - var15.field_z, var6 - var15.field_u, 256);
            return;
          }
          if (var9 > bp.field_s.field_x) {
            bp.field_s = new ja(var9, var10);
            r.a(0, bp.field_s);
            var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -this.field_Q << 10, 4096);
            ql.a(true);
            bp.field_s.e(var5 - var15.field_z, var6 - var15.field_u, 256);
            return;
          }
          if (bp.field_s.field_w < var10) {
            bp.field_s = new ja(var9, var10);
            r.a(0, bp.field_s);
            var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -this.field_Q << 10, 4096);
            ql.a(true);
            bp.field_s.e(var5 - var15.field_z, var6 - var15.field_u, 256);
            return;
          }
          r.a(0, bp.field_s);
          oo.b();
          var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -this.field_Q << 10, 4096);
          ql.a(true);
          bp.field_s.e(var5 - var15.field_z, var6 - var15.field_u, 256);
          return;
        }
        if (ua.field_I == var8) {
          var18 = rj.field_I[0];
          var9Lifetime1 = var18.field_z << 1;
          var10Lifetime1 = var18.field_u << 1;
          if (null == bp.field_s) {
            bp.field_s = new ja(var9Lifetime1, var10Lifetime1);
            r.a(0, bp.field_s);
            var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -this.field_Q << 10, 4096);
            ql.a(true);
            bp.field_s.e(var5 - var18.field_z, var6 - var18.field_u, 256);
            return;
          }
          if (var9Lifetime1 > bp.field_s.field_x) {
            bp.field_s = new ja(var9Lifetime1, var10Lifetime1);
            r.a(0, bp.field_s);
            var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -this.field_Q << 10, 4096);
            ql.a(true);
            bp.field_s.e(var5 - var18.field_z, var6 - var18.field_u, 256);
            return;
          }
          if (bp.field_s.field_w < var10Lifetime1) {
            bp.field_s = new ja(var9Lifetime1, var10Lifetime1);
            r.a(0, bp.field_s);
            var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -this.field_Q << 10, 4096);
            ql.a(true);
            bp.field_s.e(var5 - var18.field_z, var6 - var18.field_u, 256);
            return;
          }
          r.a(0, bp.field_s);
          oo.b();
          var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -this.field_Q << 10, 4096);
          ql.a(true);
          bp.field_s.e(var5 - var18.field_z, var6 - var18.field_u, 256);
          return;
        }
        if (var8 == jq.field_b) {
          var12 = rj.field_I[2];
          var12.e(var5 - (var12.field_x >> 1), -(var12.field_w >> 1) + var6, 256);
          return;
        }
        if (db.field_b == var8) {
          var21 = rj.field_I[1];
          var21.e(var5 - (var21.field_x >> 1), -(var21.field_w >> 1) + var6, 256);
          return;
        }
    }

    final String d(byte param0) {
        if (this.field_l) {
          return this.field_P.c(-117);
        }
        int var2 = -107 % ((param0 - 53) / 57);
        return null;
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
          this.field_Q = this.field_Q + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "uk.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    uk(j param0) {
        try {
          this.field_P = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.a(-69, -75, 99, -52);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uk.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != -1562977759) {
          return;
        }
        field_R = null;
        field_M = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -36) {
          uk.a((byte) 99);
          return !sh.field_L ? true : false;
        }
        return !sh.field_L ? true : false;
    }

    static {
        field_S = 256;
        field_R = "(<%0> players want to join)";
    }
}
