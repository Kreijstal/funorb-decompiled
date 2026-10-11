/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    private String field_b;
    static ih field_f;
    static bi field_a;
    static boolean field_g;
    static String[] field_d;
    static int[] field_c;
    static int[] field_e;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
          lg.a(31536000L, param0, 52, "jagex-last-login-method", this.field_b);
          if (!param1) {
            this.field_b = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "bg.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 == 16928) {
          field_f = null;
          field_a = null;
          field_e = null;
          return;
        }
        field_d = (String[]) null;
        field_f = null;
        field_a = null;
        field_e = null;
    }

    final static int a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equalsIgnoreCase("auto")) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param1 <= 97) {
            field_c = (int[]) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_6_0 = ma.a(var3, 2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("bg.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (182 - pf.field_a[0].field_z) / (param1 - 1);
        dc.field_F = new bi(var2, 2);
        pf.field_d = new bi(var2 + pf.field_a[0].field_z / 4, 2);
        ra.a(param0 + 2499);
        dc.field_F.e();
        gf.f(0, 0, dc.field_F.field_z, 10790052);
        gf.f(0, 1, dc.field_F.field_z, 16777215);
        dc.field_F.field_B[0] = ui.a(0, dc.field_F.field_B[0], -90, 185);
        dc.field_F.field_B[1] = ui.a(0, dc.field_F.field_B[1], -94, 220);
        dc.field_F.field_B[var2] = ui.a(0, dc.field_F.field_B[var2], -118, 185);
        dc.field_F.field_B[1 + var2] = ui.a(0, dc.field_F.field_B[var2 + 1], -96, 220);
        pf.field_d.e();
        gf.f(0, 0, pf.field_d.field_z, 10790052);
        gf.f(0, 1, pf.field_d.field_z, 16777215);
        cg.i(0);
        if (param0 == -2612) {
          return;
        }
        field_f = (ih) null;
    }

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 106 / ((param0 - 33) / 39);
          stackIn_1_0 = this.field_b.equals(param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    bg(String param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = true;
        field_d = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_f = new ih();
        field_e = new int[]{4153215, 6258463, 16768768, 8323199};
        field_c = new int[]{9};
    }
}
