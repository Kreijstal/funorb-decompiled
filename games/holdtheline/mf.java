/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static String field_b;
    private String field_a;

    final static void a(gn param0, int param1) {
        sn var2 = null;
        try {
          sn.b(param0.a("", false, "headers.packvorbis"));
          var2 = sn.a(param0, "jagex logo2.packvorbis", "");
          if (param1 != 0) {
            field_b = (String) null;
          }
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "mf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 < 122) {
          return;
        }
        try {
          he.a(31536000L, param0, this.field_a, -100, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "mf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int[] a(int param0, byte param1, int param2, int[] param3) {
        int var12 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ij var16 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var15 = HoldTheLine.field_D;
        try {
          var4_int = param3.length;
          var5 = new int[var4_int];
          var6 = param0 >> 16 & 255;
          var7 = param2 >> 16 & 255;
          var8 = param0 >> 8 & 255;
          var9 = (65280 & param2) >> 8;
          var10 = param0 & 255;
          if (param1 <= 90) {
            var16 = (ij) null;
            mf.a((ij) null, true);
          }
          var11 = 255 & param2;
          for (var12 = 0; var4_int > var12; var12++) {
            var13 = param3[var12];
            var14 = (var13 >> 8 & 255) * 6 + (((var13 & 16711680) >> 16) * 5 + 5 * (255 & var13));
            var5[var12] = kc.a((int)((float)var14 / 4096.0f * (float)(var11 - var10)) + var10, kc.a((int)((float)var14 / 4096.0f * (float)(var9 - var8)) + var8 << 8, var6 + (int)((float)(var7 - var6) * ((float)var14 / 4096.0f)) << 16));
          }
          stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("mf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(ij param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ij var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0.field_o == null) {
            return;
          }
          if (0 != param0.field_j ||
            param0.field_e != 0) {
            for (var2_int = 0; in.field_e > var2_int; var2_int++) {
              var3 = lj.field_a[var2_int];
              if (2 == var3.field_h &&
                param0.field_j == var3.field_j &&
                var3.field_e == param0.field_e) {
                return;
              }
            }
          }
          if (param0.field_b != null) {
          }
          ic.a(21325, param0);
          if (!param1) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("mf.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -62) {
          mf.a(-12);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1) {
          if (va.field_j[param0] > va.field_j[param2]) {
            return true;
          }
          if (va.field_j[param0] < va.field_j[param2]) {
            return false;
          }
          if (oh.field_s[param0] > oh.field_s[param2]) {
            return true;
          }
          if (oh.field_s[param2] > oh.field_s[param0]) {
            return false;
          }
          var4 = da.field_u[param2] + (ua.field_c[param2] + fj.field_q[param2]);
          var5 = ua.field_c[param0] + da.field_u[param0] + fj.field_q[param0];
          if (var4 < var5) {
            return true;
          }
          if (param3 != 13234) {
            mf.a(-89);
          }
          if (var5 < var4) {
            return false;
          }
          return !(param2 >= param0);
        }
        if (oh.field_s[param2] < oh.field_s[param0]) {
          return true;
        }
        if (oh.field_s[param0] < oh.field_s[param2]) {
          return false;
        }
        if (va.field_j[param2] < va.field_j[param0]) {
          return true;
        }
        if (va.field_j[param0] < va.field_j[param2]) {
          return false;
        }
        var4Lifetime1 = da.field_u[param2] + (ua.field_c[param2] + fj.field_q[param2]);
        var5Lifetime1 = ua.field_c[param0] + da.field_u[param0] + fj.field_q[param0];
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        if (param3 == 13234) {
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param2 >= param0);
        }
        mf.a(-89);
        if (var5Lifetime1 < var4Lifetime1) {
          return false;
        }
        if (param2 >= param0) {
          return false;
        }
        return true;
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 62) {
            stackIn_4_0 = this.field_a.equals(param1);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    mf(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
