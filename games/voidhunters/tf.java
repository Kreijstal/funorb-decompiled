/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    final static int a(int param0, int param1, int[] param2) {
        int var6_int = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        var12 = VoidHunters.field_G;
        try {
          var3_int = 0;
          var4 = 0;
          var5 = 0;
          if (param1 > -25) {
            var13 = (int[]) null;
            tf.a(-23, -46, (int[]) null);
          }
          for (var6_int = 0; param2.length > var6_int; var6_int += 2) {
            var7 = param2[var6_int];
            var4 = var4 + var7;
            var8 = param2[1 + var6_int];
            var5 = var5 + var8;
          }
          var5 = var5 / (param2.length >> 1);
          var4 = var4 / (param2.length >> 1);
          var15 = new int[param2.length];
          var14 = var15;
          var6 = var14;
          for (var7Lifetime1 = 0; param2.length > var7Lifetime1; var7Lifetime1 += 2) {
            var6[var7Lifetime1] = -var4 + param2[var7Lifetime1];
            var6[var7Lifetime1 + 1] = param2[1 + var7Lifetime1] - var5;
          }
          for (var7Lifetime2 = 0; var7Lifetime2 < var15.length - 2; var7Lifetime2 += 2) {
            var8Lifetime1 = var15[var7Lifetime2] >> param0;
            var9 = var6[1 + var7Lifetime2] >> param0;
            var10 = var6[2 + var7Lifetime2] >> param0;
            var11 = var6[var7Lifetime2 + 3] >> param0;
            var3_int = var3_int + (var8Lifetime1 * var11 - var10 * var9);
          }
          var3_int = var3_int / 2;
          stackIn_13_0 = var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
    }
}
