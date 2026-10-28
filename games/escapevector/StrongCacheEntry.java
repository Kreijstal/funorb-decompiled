/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheEntry extends WeightedCacheEntry {
    static String field_v;
    static int field_t;
    private Object value;

    final Object getValue(byte guard) {
        if (guard != 97) {
          StrongCacheEntry.releaseStatics(24);
        }
        return this.value;
    }

    public static void releaseStatics(int guard) {
        int var1 = 93 % ((guard + 35) / 38);
        field_v = null;
    }

    final static char widestAllowedGlyph(byte guard, int firstCharacter, BinaryBitmapFont font, int lastCharacter) {
        String stackIn_15_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 119;
          int var5 = font.charAdvance((char) var4_int);
          int var6 = firstCharacter;
          if (guard > -47) {
            StrongCacheEntry.releaseStatics(-66);
          }
          while (lastCharacter >= var6) {
            if (ml.a((char)var6, 21654)) {
              int var7 = font.charAdvance((char)var6);
              if (var5 < var7) {
                var4_int = (char)var6;
                var5 = var7;
              }
            }
            var6++;
          }
          int stackIn_11_0 = var4_int;
          return (char) stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var4;
          StringBuilder stackIn_14_1 = new StringBuilder().append("vk.F(").append(guard).append(',').append(firstCharacter).append(',');
          if (font == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(lastCharacter).append(')').toString());
        }
    }

    StrongCacheEntry(Object value, int weight) {
        super(weight);
        try {
          this.value = value;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (value != null ? "{...}" : "null") + ',' + weight + ')');
        }
    }

    final static EmailValidationError validateDomainLabel(String label, int guard) {
        String stackIn_28_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2_int = label.length();
          if (var2_int == 0) {
            EmailValidationError stackIn_4_0 = ResourceArchive.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            EmailValidationError stackIn_7_0 = EmailAvailabilityRequest.field_c;
            return stackIn_7_0;
          }
          if (guard >= -8) {
            EmailValidationError stackIn_10_0 = (EmailValidationError) null;
            return stackIn_10_0;
          }
          for (int var3 = 0; var3 < var2_int; var3++) {
            int var4 = label.charAt(var3);
            if (45 == var4) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                EmailValidationError stackIn_19_0 = CachedTextLayout.field_p;
                return stackIn_19_0;
              }
            } else if (jd.field_b.indexOf(var4) == -1) {
              EmailValidationError stackIn_22_0 = CachedTextLayout.field_p;
              return stackIn_22_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var2;
          StringBuilder stackIn_27_1 = new StringBuilder().append("vk.G(");
          if (label == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean isSoft(byte guard) {
        if (guard != 120) {
          field_v = (String) null;
          return false;
        }
        return false;
    }

    static {
    }
}
