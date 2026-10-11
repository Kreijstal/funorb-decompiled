/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ql extends od {
    static kh field_k;
    static String[] field_m;
    static float field_l;

    final static vb a(int param0, u param1, byte param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        vb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 28 % ((param2 + 76) / 32);
          stackIn_1_0 = pea.a(qia.b(param1, param0, param3, param4), 1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("ql.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        aca var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -28521) {
            return;
          }
          var4 = (aca) (io.field_d.f(-80));
          while (var4 != null) {
            jea.a(param0, 1325, var4);
            var4 = (aca) (io.field_d.e(113));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "ql.A(" + param0 + ',' + param1 + ')');
        }
    }

    protected ql() {
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_k = null;
        field_m = null;
    }

    final static void a(int param0, pha param1) {
        pha var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = -66 / ((param0 - 45) / 59);
          param1.p(118);
          var2 = (pha) (uma.field_b.f(-80));
          while (var2 != null) {
            if (var2.a((byte) 123, param1)) {
              var2 = (pha) (uma.field_b.e(121));
              continue;
            }
            break;
          }
          if (var2 == null) {
            uma.field_b.b((byte) -108, param1);
            return;
          }
          ln.a(var2, param1, (byte) 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("ql.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_l = 1.0f;
    }
}
