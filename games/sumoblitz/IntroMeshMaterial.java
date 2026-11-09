/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroMeshMaterial {
    static int[] bytePoolCounts;
    int baseColor;
    static String[] enemyVariantNames;

    public static void releaseStatics(int param0) {
        if (param0 >= -54) {
          enemyVariantNames = (String[]) null;
          bytePoolCounts = null;
          enemyVariantNames = null;
          return;
        }
        bytePoolCounts = null;
        enemyVariantNames = null;
    }

    final static int hashCp1252(CharSequence text, int guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = text.length();
          var3 = 0;
          var4 = 0;
          if (guard >= -18) {
            stackIn_3_0 = -6;
            return stackIn_3_0;
          }
          while (var2_int > var4) {
            var3 = -var3 + ((var3 << 5) + HardwareReflectionEffect.encodeCp1252Character(true, text.charAt(var4)));
            var4++;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("l.A(");
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        enemyVariantNames = new String[]{"None", "Armoured", "Spiked", "Bomb", "Small", "Big", "Boss"};
    }
}
