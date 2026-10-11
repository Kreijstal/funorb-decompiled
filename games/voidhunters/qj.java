/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    final static lkb a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        lkb stackIn_3_0 = null;
        lkb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          if (param0 != -74) {
            stackIn_3_0 = (lkb) null;
            return stackIn_3_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 > 57) {
              return null;
            }
          }
          stackIn_13_0 = ira.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 < 126) {
          return;
        }
        cea.a(-88, 17);
    }

    static {
    }
}
