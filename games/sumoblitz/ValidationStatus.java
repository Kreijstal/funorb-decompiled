/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatus {
    static java.security.SecureRandom field_b;
    static java.awt.Image field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 1431655765) {
          field_a = (java.awt.Image) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int quinticSmoothStepQ12(int valueQ12, int guard) {
        int var4 = 0;
        int var2 = valueQ12 * (valueQ12 * valueQ12 >> 12) >> 12;
        int var3 = valueQ12 * 6 - 61440;
        if (guard == -676121812) {
          var4 = 40960 + (var3 * valueQ12 >> 12);
          return var2 * var4 >> 12;
        }
        return 110;
    }

    final static int countSetBits(int value, byte guard) {
        value = (value & 1431655765) + ((-1431655765 & value) >>> 1);
        value = (value & 858993459) + (value >>> 2 & -214748365);
        if (guard == 81) {
          value = value + (value >>> 4) & 252645135;
          value = value + (value >>> 8);
          value = value + (value >>> 16);
          return 255 & value;
        }
        ValidationStatus.releaseStatics(-54);
        value = value + (value >>> 4) & 252645135;
        value = value + (value >>> 8);
        value = value + (value >>> 16);
        return 255 & value;
    }

    final static String replaceCharacter(char character, String text, boolean guard, String replacement) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = text.length();
          if (guard) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var5 = replacement.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = text.indexOf((int) character, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = text.indexOf((int) character, var9);
            if (var10 < 0) {
              discarded$4 = var8.append(text.substring(var9));
              stackIn_14_0 = var8.toString();
              return stackIn_14_0;
            }
            discarded$2 = var8.append(text.substring(var9, var10));
            discarded$3 = var8.append(replacement);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gf.A(").append(character).append(',');
          if (text == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(',');
          if (replacement == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
