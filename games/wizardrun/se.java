/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static int field_a;
    static volatile boolean field_b;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          while (true) {
            param3--;
            if (param3 < 0) {
              if (param1 > 74) {
                return;
              }
              se.a(-78, -67, 96);
              return;
            }
            var9 = param4;
            var5 = var9;
            var6 = param0;
            var7 = param2;
            var9[var6] = var7 + (kl.b(var9[var6], 16711422) >> 1);
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("se.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = wizardrun.field_H;
        try {
          if (param2 != 0) {
            field_a = -111;
          }
          if (param0 <= param1) {
            while (param0 != 0) {
              var3_int = param1 % param0;
              param1 = param0;
              param0 = var3_int;
            }
          } else {
            var3_int = param1;
            param1 = param0;
            param0 = var3_int;
            while (param0 != 0) {
              var3_int = param1 % param0;
              param1 = param0;
              param0 = var3_int;
            }
          }
          stackIn_10_0 = param1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "se.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static o a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        o stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 46) {
            stackIn_2_0 = (o) null;
            return stackIn_2_0;
          }
          if (h.a(param0, param2, param1, -124)) {
            return sl.g(0);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("se.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_b = true;
    }
}
