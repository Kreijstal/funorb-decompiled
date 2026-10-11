/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_b;
    static ng field_a;

    final static void a(boolean param0, int param1) {
        kd var2 = null;
        int var3 = 0;
        vb var4 = null;
        ng stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          stackIn_3_0 = jl.field_a;
          stackIn_4_1 = !(param0);
          var4 = (vb) (((ng) (Object) stackIn_3_0).a(stackIn_4_1));
          while (var4 != null) {
            vi.a(param1, var4, 1);
            var4 = (vb) (jl.field_a.f(2));
          }
          if (param0) {
            return;
          }
          var2 = ci.field_f.a(true);
          while (var2 != null) {
            ck.a(param1, 2);
            var2 = ci.field_f.f(2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "vh.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 119) {
          int[] var2 = (int[]) null;
          vh.a((byte) 39, 124, (int[]) null, 22);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          for (var4_int = param1 + param3; var4_int < param2.length; var4_int = var4_int + param1) {
            for (var5 = -param1 + var4_int; var5 >= 0; var5 = var5 - param1) {
              if (param2[param1 + var5] < param2[var5]) {
                var6 = param2[var5];
                param2[var5] = param2[param1 + var5];
                param2[param1 + var5] = var6;
                continue;
              }
              break;
            }
          }
          if (param0 == -42) {
            return;
          }
          vh.a((byte) 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_a = new ng();
    }
}
