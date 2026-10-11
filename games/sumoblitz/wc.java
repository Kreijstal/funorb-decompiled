/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    int field_a;
    ah[] field_b;

    final int a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0;
        for (var3 = 0; var3 < this.field_b.length; var3++) {
          if (this.field_b[var3] != null) {
            var2++;
          }
        }
        return var2;
    }

    final static boolean a(ki param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 25) {
            stackIn_4_0 = param0.a(true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wc.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    wc(ah[] param0, int param1, boolean param2) {
        try {
          this.field_a = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
