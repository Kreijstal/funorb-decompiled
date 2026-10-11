/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw {
    static jea field_a;

    public static void a(int param0) {
        if (param0 > -44) {
          field_a = (jea) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(byte param0, int param1, int param2, bo param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kh var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (vpa.a(38)) {
            return;
          }
          var9 = ql.field_k;
          var9.k(param2, -2988);
          if (param0 != -111) {
            return;
          }
          var9.field_h = var9.field_h + param1;
          var5 = var9.field_h;
          param3.a(200, var9);
          var6 = -var5 + var9.field_h;
          var7 = param1;
          if (0 == var7) {
            return;
          }
          if (var7 == 1) {
            var9.d(var6, (byte) -111);
            return;
          }
          if (var7 != 2) {
            return;
          }
          var9.b(var6, (byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("hw.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
    }
}
