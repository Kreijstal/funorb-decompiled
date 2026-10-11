/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static qb[] field_a;
    static int[] field_b;
    static ne field_c;

    final static short[] a(ab param0, short[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4_int = param0.d(28089, param3);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param0.d(param2 ^ 28073, 4);
          var6 = (short)param0.d(28089, param2);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)(param0.d(28089, var5) + var6);
            }
          }
          stackIn_16_0 = (short[]) (param1);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("eo.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != -14449) {
          field_a = (qb[]) null;
        }
    }

    static {
        field_b = new int[17];
    }
}
