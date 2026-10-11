/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    private String field_b;
    static int[] field_d;
    static bg field_a;
    static String field_e;
    static ta field_g;
    static rg field_h;
    static int field_c;
    static int field_f;

    final void a(java.applet.Applet param0, int param1) {
        try {
          if (param1 != 447616545) {
            this.toString();
          }
          eg.a("jagex-last-login-method", param1 - 447616669, this.field_b, 31536000L, param0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            var4 = (String) null;
            sj.a((String) null, 17, (String) null);
          }
          stackIn_3_0 = this.field_b.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_d = null;
        field_g = null;
        field_e = null;
        if (param0 <= 10) {
          field_f = 60;
        }
        field_a = null;
    }

    sj(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = MinerDisturbance.field_ab;
        try {
          var3_int = 0;
          var4 = lj.field_p;
          while (var3_int < ne.field_K.length) {
            var5 = mf.field_m[var3_int];
            if (0 <= var5) {
              var6 = hl.a(ne.field_K[var3_int], true, -15388);
              var7 = -(var6 >> 1) + rj.field_e;
              var4 = var4 + hi.field_z;
              if (hc.a(103, var4, nk.field_u + (sn.field_d << 1), var7 - ka.field_a, param0, (ka.field_a << 1) + var6, param2)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (nk.field_u + (hi.field_z + (sn.field_d << 1)));
            } else {
              var4 = var4 + vd.field_z;
            }
            var3_int++;
          }
          if (param1 <= 123) {
            sj.a(-11, (byte) 112, -37);
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "sj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
          if (param1 != 19260) {
            field_g = (ta) null;
          }
          jg.a(param0, param2, param1 - 19380, false);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new bg(10, 2, 2, 0);
        field_e = "This password contains your email address, and would be easy to guess";
        field_g = new ta();
        field_f = 0;
    }
}
