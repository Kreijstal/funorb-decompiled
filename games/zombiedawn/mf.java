/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static int field_d;
    static int field_c;
    static String field_a;
    private vn[] field_b;

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = ZombieDawn.field_J;
        try {
          for (var1_int = 0; var1_int < wf.field_P.length; var1_int++) {
            wf.field_P[var1_int] = true;
          }
          if (param0 != -67) {
            field_d = -62;
          }
          if (!fj.a(0, 121)) {
            wf.field_P[12] = false;
          }
          var3 = 14;
          var1_intLifetime1 = var3;
          while (var3 < uc.field_a.length) {
            uc.field_a[var3] = true;
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "mf.D(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_12_0 = false;
        param0 = param0 / 24;
        param1 = param1 / 24;
        if (0 <= param1 &&
          param0 >= 0) {
          if (vm.field_u[param2].length <= param1) {
            return false;
          }
          if (param0 >= vm.field_u.length) {
            return false;
          }
          stackIn_12_0 = (vm.field_u[param0][param1] != -1) && (vm.field_u[param0][param1] < 1);
          return stackIn_12_0;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 > -39) {
          this.a(-21, 11, -116, (byte) 91, 87);
        }
        vf.a(param1, this.field_b, param2, 3, param0, param4);
    }

    public static void a(int param0) {
        if (param0 <= 122) {
          return;
        }
        field_a = null;
    }

    mf(vn[] param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 10;
        field_d = 0;
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
