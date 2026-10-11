/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_c;
    static volatile int field_d;
    static long field_a;
    static String field_b;

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    final static String a(int param0, int param1, jc param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.c(false);
            if (var3_int > param1) {
              var3_int = param1;
            }
            if (param0 != 128) {
              field_b = (String) null;
            }
            var4 = new byte[var3_int];
            param2.field_l = param2.field_l + ph.field_k.a(var4, param2.field_l, 0, var3_int, param2.field_g, true);
            var5 = nf.a(var3_int, (byte) -128, 0, var4);
            stackIn_6_0 = var5;
            return stackIn_6_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_8_0 = "Cabbage";
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("hc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          if (~param0 < param1 &&
            128 > param0) {
            return true;
          }
          if (param0 >= 160 &&
            param0 <= 255) {
            return true;
          }
          if (param0 != 0) {
            var6 = cg.field_f;
            var2 = var6;
            var3 = 0;
            while (var6.length > var3) {
              var4 = var6[var3];
              if (param0 != var4) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2_ref), "hc.A(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (pm.field_o > var1) {
          b.field_Gb = b.field_Gb + (pm.field_o - var1);
          if (param0 == -9986) {
            pm.field_o = var1;
            return var1 + b.field_Gb;
          }
          return -66L;
        }
        if (param0 == -9986) {
          pm.field_o = var1;
          return var1 + b.field_Gb;
        }
        return -66L;
    }

    static {
        field_c = 4;
        field_d = 0;
        field_b = "<%0>'s turn (<%1>)";
    }
}
