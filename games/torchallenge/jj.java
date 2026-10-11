/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static rk field_b;
    static ka field_e;
    static boolean field_d;
    static int field_c;
    static ka[] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        int var1 = 100 / ((param0 - 57) / 41);
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (0 < param1 &&
            param1 < 128) {
            return true;
          }
          if (160 <= param1 &&
            param1 <= 255) {
            return true;
          }
          if (param1 != 0) {
            var6 = ae.field_p;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (param1 != var4) {
                var3++;
                continue;
              }
              return true;
            }
          }
          if (param0 > 82) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "jj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static ka a(byte param0, lj param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 30) {
            field_a = (ka[]) null;
          }
          if (lk.a(160, param1, param2, param3)) {
            return rl.b(true);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("jj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int[] b(byte param0) {
        if (param0 != -24) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static int a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = 5;
          var2 = 0;
          var3 = 0;
          if (param0 != 255) {
            field_a = (ka[]) null;
          }
          for (var4 = 0; var4 < 6; var4++) {
            var3Lifetime1 = pi.field_d[vj.field_c][var4];
            if (var4 == ea.field_e) {
              var3Lifetime1 = var3Lifetime1 | vi.field_a;
            }
            for (var5 = 0; var1_int > var5; var5++) {
              if ((var3Lifetime1 & 1 << var5) > 0) {
                var2++;
              }
            }
          }
          stackIn_17_0 = var2;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "jj.A(" + param0 + ')');
        }
    }

    static {
        field_e = new ka(96, 96);
        field_d = false;
        field_a = null;
    }
}
