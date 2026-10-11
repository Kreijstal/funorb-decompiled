/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int[] field_c;
    private static long[] field_a;
    static pb field_b;

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = 73 / ((59 - param1) / 59);
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (nd.a(var4, (byte) -35) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("aa.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 < 6) {
          return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var3 = null;
        long var4 = 0L;
        sl.field_c = true;
        String var2 = "tuhstatbut";
        if (param1) {
          return;
        }
        try {
          var3 = "rvnadlm";
          var4 = -1L;
          b.a(var3, (byte) 38, var4, var2, param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "aa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_c = new int[8192];
        field_a = new long[256];
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_a[var2] = var0;
        }
    }
}
