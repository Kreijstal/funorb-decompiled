/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    static String field_a;
    static int field_b;
    static String field_c;

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == hj.field_c) {
          if (param0 == 98) {
            return;
          }
          field_c = (String) null;
          return;
        }
        var1 = hj.field_c;
        synchronized (var1) {
          hj.field_c = null;
        }
        if (param0 != 98) {
          field_c = (String) null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -1) {
          hl[] var2 = (hl[]) null;
          te.a(-118, (hl[]) null);
        }
    }

    final static void a(int param0, hl[] param1) {
        RuntimeException var2 = null;
        hl[] var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          og.field_d = param1;
          if (null != og.field_d &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          if (param0 >= 123) {
            return;
          }
          var3 = (hl[]) null;
          te.a(117, (hl[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("te.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          var3_int = param2;
          while (param0 > 1) {
            if ((param0 & 1) != 0) {
              var3_int = var3_int * param1;
            }
            param1 = param1 * param1;
            param0 = param0 >> 1;
          }
          if (param0 == 1) {
            stackIn_11_0 = var3_int * param1;
            return stackIn_11_0;
          }
          stackIn_13_0 = var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "te.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = 0;
        field_c = "Names cannot contain consecutive spaces";
    }
}
