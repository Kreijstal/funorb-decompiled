/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static nc field_b;
    private String field_a;
    static String[] field_c;

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var4 = 0;
        String var3 = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = StarCannon.field_A;
        try {
          var3 = md.a(param1, param2, (byte) -81);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (param0 < 31) {
            stackIn_6_0 = (String) null;
            return stackIn_6_0;
          }
          for (var4 = 0; var4 < param2.length(); var4++) {
            if (!sa.a((byte) -121, param2.charAt(var4))) {
              stackIn_13_0 = ok.field_qb;
              return stackIn_13_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("mj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
          if (!param1) {
            field_b = (nc) null;
          }
          wg.a((byte) 100, this.field_a, param0, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
          field_c = (String[]) null;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        if (param1) {
          if (tk.field_f[param3] > tk.field_f[param0]) {
            return true;
          }
          if (tk.field_f[param3] < tk.field_f[param0]) {
            return false;
          }
          if (fg.field_b[param0] < fg.field_b[param3]) {
            return true;
          }
          if (fg.field_b[param3] < fg.field_b[param0]) {
            return false;
          }
        } else {
          if (fg.field_b[param3] > fg.field_b[param0]) {
            return true;
          }
          if (fg.field_b[param0] > fg.field_b[param3]) {
            return false;
          }
          if (tk.field_f[param3] > tk.field_f[param0]) {
            return true;
          }
          if (tk.field_f[param0] > tk.field_f[param3]) {
            return false;
          }
        }
        var4 = ab.field_G[param0] + gj.field_f[param0] + nf.field_b[param0];
        var5 = ab.field_G[param3] + (gj.field_f[param3] + nf.field_b[param3]);
        if (param2 != -24153) {
          mj.a(93, false, 103, -10);
        }
        if (var5 > var4) {
          return true;
        }
        if (var4 > var5) {
          return false;
        }
        return !(param3 <= param0);
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -64) {
            stackIn_4_0 = this.field_a.equals(param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mj.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    mj(String param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == param3) {
          param0 = param0 >> 1;
        }
        if (param3 == 4) {
          param0 = param0 >> 2;
        }
        if (param3 == 6) {
          param0 = param0 >> 2;
        }
        if (param3 == 7) {
          param3 = 8;
          param0 = param0 >> 2;
        }
        int var5 = nb.field_g * param0 / 100;
        if (var5 > 0) {
          if (param2 == 0) {
            jk.field_k.a(gf.field_c[param3], param4, var5);
          } else {
            jk.field_k.a(gf.field_c[param3], param4, var5, param2);
          }
        }
    }

    static {
        field_b = new nc();
    }
}
