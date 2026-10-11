/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fra {
    static String field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 2147483647) {
          fra.a(52);
        }
    }

    final static boolean a(int[] param0, int param1, int param2, int param3) {
        boolean stackIn_40_0 = false;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          var4_int = 2147483647;
          var5 = -2147483648;
          var6 = 2147483647;
          var7 = -2147483648;
          for (var8 = 0; var8 < param0.length; var8 += 2) {
            var9 = param0[var8];
            if (var5 < var9) {
              var5 = var9;
            }
            var10 = param0[1 + var8];
            if (var9 < var4_int) {
              var4_int = var9;
            }
            if (var10 > var7) {
              var7 = var10;
            }
            if (var6 > var10) {
              var6 = var10;
            }
          }
          if (param2 != 2) {
            fra.a(25);
          }
          if (!em.a(5220, var5, param1, var7, param3, var4_int, var6)) {
            return false;
          }
          var8Lifetime1 = param3;
          var9Lifetime1 = param1;
          var10Lifetime1 = param3 - (var4_int + var5 >> 1);
          var11 = -(var6 + var7 >> 1) + param1;
          if (Math.abs(var10Lifetime1) < Math.abs(var11)) {
            if (0 < var10Lifetime1) {
              var8Lifetime1 = var8Lifetime1 + (var5 - var4_int);
            } else {
              var8Lifetime1 = var8Lifetime1 - (var5 - var4_int);
            }
          } else {
            if (var11 > 0) {
              var9Lifetime1 = var9Lifetime1 + (-var6 + var7);
            } else {
              var9Lifetime1 = var9Lifetime1 - (var7 - var6);
            }
          }
          var10Lifetime2 = 0;
          var17 = 0;
          var11Lifetime1 = var17;
          while (var17 < param0.length) {
            var12 = param0[var17];
            var13 = param0[1 + var17];
            var14 = param0[(2 + var17) % param0.length];
            var15 = param0[(var17 + 3) % param0.length];
            if (-1 != ng.a(8, param1, (byte) 93, param3, var14, var8Lifetime1, var13, var12, var15, var9Lifetime1)) {
              var10Lifetime2++;
            }
            var17 += 2;
          }
          stackIn_40_0 = (var10Lifetime2 % 2 == 1);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_43_0 = var4;
          stackIn_43_1 = new StringBuilder().append("fra.C(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(byte param0) {
        int var1 = -17 / ((-44 - param0) / 49);
        return sea.a(-19) - seb.a(27546) / 2;
    }

    static {
        field_a = 1;
        field_b = 50;
        field_c = "This option cannot be combined with the current '<%0>' setting.";
    }
}
