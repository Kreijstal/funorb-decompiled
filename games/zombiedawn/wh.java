/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh implements wa {
    static int field_b;
    static int field_c;
    static vn[][] field_a;
    static fn field_e;
    static int[] field_d;

    public final void a(int param0, int param1, int param2) {
        int var4 = -126 / ((param1 + 83) / 35);
        lf.a(param2, param0, 2);
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        int var2Lifetime1;
        try {
          vm.field_u = dj.field_e.field_H.a(8728);
          for (var1_int = 0; var1_int < vm.field_u.length; var1_int++) {
            for (var2 = 0; var2 < vm.field_u[0].length; var2++) {
              if (vm.field_u[var1_int][var2] != 0) {
                vm.field_u[var1_int][var2] = -1;
              }
            }
          }
          var2Lifetime1 = 3 / ((27 - param0) / 47);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "wh.B(" + param0 + ')');
        }
    }

    final static vk a(String param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        vk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawn.field_J;
        try {
          var2_int = param0.length();
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          if (param1) {
            wh.a(-70);
          }
          stackIn_12_0 = vl.field_m;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("wh.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_a = (vn[][]) null;
        }
        field_a = (vn[][]) null;
        field_d = null;
        field_e = null;
    }

    static {
        field_a = new vn[4][];
        field_e = null;
        field_d = new int[256];
    }
}
