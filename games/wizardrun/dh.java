/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static int field_b;
    static String field_c;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
          field_b = 47;
        }
        field_c = null;
    }

    final static ae a(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        ae var7 = null;
        int var8 = 0;
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_10_0 = null;
        ae stackIn_18_0 = null;
        ae stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = ok.field_f;
            return stackIn_4_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = kj.field_c;
            return stackIn_7_0;
          }
          var3 = tj.a(param1, -22710, '.');
          if (var3.length < 2) {
            stackIn_10_0 = ok.field_f;
            return stackIn_10_0;
          }
          if (param0 != -27602) {
            field_a = -52;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = he.a(param0 ^ -27522, var6);
            if (var7 != null) {
              stackIn_18_0 = var7;
              return stackIn_18_0;
            }
          }
          stackIn_21_0 = u.b(var3[var3.length - 1], (byte) -125);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("dh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static gb a(int param0, int param1, byte param2, kl param3, kl param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        gb stackIn_5_0 = null;
        gb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!h.a(param1, param0, param4, -118)) {
            stackIn_2_0 = null;
            return (gb) (stackIn_2_0);
          }
          if (param2 <= -62) {
            stackIn_7_0 = dc.a(param3.a(param0, param1, 1), 0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (gb) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("dh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
          return true;
        }
        return null == ki.field_E ? jg.field_n : true;
    }

    static {
        field_a = 640;
        field_b = 0;
        field_c = null;
    }
}
