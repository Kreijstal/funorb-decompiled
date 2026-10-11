/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_b;
    static int field_a;

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        rl var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param3 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; var5_int < param1; var5_int++) {
              var8[var5_int] = param0[param3 + var5_int];
            }
          } else {
            var4 = param0;
          }
          var5 = new rl();
          if (param2 != -5705) {
            n.a(true);
          }
          var5.a(param2 + 21003);
          var5.a(14027, (long)(param1 * 8), var4);
          var10 = new byte[64];
          var9 = var10;
          var6 = var9;
          var5.a(var10, param2 + 5821, 0);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("n.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          n.a(true);
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1) {
        wl.a(param1, param0, 170);
    }

    static {
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
