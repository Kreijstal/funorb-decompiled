/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;

    final static void a(int param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param1 % 10L == (long)param0) {
            ji.a(-1L + param1, (byte) -33);
            ji.a(1L, (byte) -33);
        } else {
            ji.a(param1, (byte) -33);
        }
    }

    final static String a(int param0, byte[] param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            var11 = new char[param3];
            var10 = var11;
            var9 = var10;
            var4 = var9;
            if (param0 > 0) {
              field_a = 49;
            }
            var5 = 0;
            for (var6 = 0; param3 > var6; var6++) {
              var7 = param1[param2 + var6] & 255;
              if (var7 != 0) {
                if (var7 >= 128) {
                  if (var7 < 160) {
                    var8 = lf.field_e[-128 + var7];
                    if (var8 == 0) {
                      var8 = 63;
                    }
                    var7 = var8;
                  }
                }
                incrementValue$1 = var5;
                var5++;
                var9[incrementValue$1] = (char)var7;
              }
            }
            stackIn_14_0 = new String(var11, 0, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var4_ref);

          stackIn_17_1 = new StringBuilder().append("bc.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
        return stackIn_14_0;
    }

    static {
        field_a = -1;
    }
}
