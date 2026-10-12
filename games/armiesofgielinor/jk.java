/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jk {
    static QuickChatCommandDefinition field_b;
    static String field_a;

    final static int[] a(int param0, int[] param1, int param2, int[] param3) {
        int var5 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1.length != param3.length) {
            return null;
          }
          stackIn_6_0 = (param3.length != 0) ? 0 : 1;
          if (param1.length != 0) {
            stackIn_9_1 = 0;
          } else {
            stackIn_9_1 = 1;
          }
          if ((stackIn_6_0 | stackIn_9_1) != 0) {
            stackIn_11_0 = null;
            return (int[]) (stackIn_11_0);
          }
          var4 = new int[param0 * param3.length];
          for (var5 = 0; param3.length > var5; var5++) {
            var6 = 16711680 & param3[var5];
            var7 = param3[var5] & 65280;
            var8 = param3[var5] & 255;
            var9 = param1[var5] & 16711680;
            var10 = 65280 & param1[var5];
            var11 = 255 & param1[var5];
            for (var12 = 0; var12 < param0; var12++) {
              var13 = 16711680 & (-var12 + param0) * var6 / param0 + var12 * var9 / param0;
              var14 = 65280 & var10 * var12 / param0 + (-var12 + param0) * var7 / param0;
              var15 = var12 * var11 / param0 + (-var12 + param0) * var8 / param0 & 255;
              var4[param0 * var5 + var12] = oe.c(oe.c(var15, var13), var14);
            }
          }
          if (param2 < 122) {
            field_a = (String) null;
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 15 % ((48 - param0) / 35);
        field_b = null;
        field_a = null;
    }

    final static el b(int param0) {
        try {
          Throwable var1 = null;
          el stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 <= 64) {
            return (el) null;
          }
          try {
            stackIn_3_0 = (el) (Class.forName("sv").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Hide tutorial";
        field_b = new QuickChatCommandDefinition(0, 2, 2, 1);
    }
}
