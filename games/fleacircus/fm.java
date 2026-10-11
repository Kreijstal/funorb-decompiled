/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (rh.field_f != null) {
          var1 = rh.field_f;
          synchronized (var1) {
            rh.field_f = null;
          }
        }
        if (param0 != 0) {
          fm.a(14);
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < param1.length(); var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ak.a((char) var3, (byte) 67) &&
              !em.a((byte) -65, (char) var3)) {
              return true;
            }
          }
          if (param0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
