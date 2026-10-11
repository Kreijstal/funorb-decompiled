/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class joa {
    private static int[] field_b;
    static int field_a;

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = vga.a(agb.a(param0, -49), -128);
          if (param1) {
            field_b = (int[]) null;
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("joa.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int localTemp$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        var8 = param5 * param3 - param1 * param0;
        if (var8 == 0) {
          return -1;
        }
        var9 = param6 * param0 - param2 * param3;
        stackIn_6_0 = (var9 < 0) ? 0 : 1;
        stackIn_9_1 = (param7 >= var8) ? 0 : 1;
        if ((stackIn_6_0 ^ stackIn_9_1) != 0) {
          return -1;
        }
        var10 = -vma.a(124, var9) + 30;
        if (var10 >= param4) {
          var11 = (var9 << param4) / var8;
        } else {
          localTemp$0 = var8 >> -var10 + param4;
          var8 = localTemp$0;
          if (localTemp$0 == 0) {
            return -1;
          }
          var11 = (var9 << var10) / var8;
        }
        if (1 << param4 < var11) {
          return -1;
        }
        if (Math.abs(param0) <= Math.abs(param3)) {
          L3: {
            L4: {
              var12 = param6 + (param1 * var11 >> param4);
              if (0 > param3) {
                if (var12 < param3) {
                  break L4;
                }
                if (var12 > 0) {
                  break L4;
                }
              } else {
                if (0 > var12) {
                  break L4;
                }
                if (var12 > param3) {
                  break L4;
                }
              }
              stackIn_40_0 = var11;
              break L3;
            }
            stackIn_40_0 = -1;
          }
          return stackIn_40_0;
        }
        L6: {
          L7: {
            var12Lifetime1 = param2 + (var11 * param5 >> param4);
            if (param0 >= 0) {
              if (var12Lifetime1 < 0) {
                break L7;
              }
              if (param0 < var12Lifetime1) {
                break L7;
              }
            } else {
              if (param0 > var12Lifetime1) {
                break L7;
              }
              if (var12Lifetime1 > 0) {
                break L7;
              }
            }
            stackIn_30_0 = var11;
            break L6;
          }
          stackIn_30_0 = -1;
        }
        return stackIn_30_0;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 26936) {
          joa.a(-25, -71, 87, 48, 85, 34, -54, 36);
        }
    }

    static {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var4 = (long)((var0 << 1) - 1);
          var6 = (long)(1 + (var0 << 1));
          var3 = (int)((var6 * var6 >> 18) - 32768L);
          var2 = (int)((var4 * var4 >> 18) - 32768L);
          if (!(field_b.length > var3)) {
            var3 = -1 + field_b.length;
          }
          for (var1 = var2 < 0 ? 0 : var2; var1 <= var3; var1++) {
            field_b[var1] = var0;
          }
        }
        field_a = 1600;
    }
}
