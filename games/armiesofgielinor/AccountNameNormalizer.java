/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameNormalizer {
    static String field_c;
    static String[] field_a;
    static String field_b;

    final static String normalize(CharSequence name, boolean obfuscationGuard) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int trimmedStart = 0;
        RuntimeException var2 = null;
        int trimmedEnd = 0;
        int trimmedLength = 0;
        StringBuilder canonicalName = null;
        int characterIndex = 0;
        int character = 0;
        int foldedCharacter = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (name == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          trimmedStart = 0;
          trimmedEnd = name.length();
          while (trimmedStart < trimmedEnd) {
            if (rs.isAccountNameSeparator(name.charAt(trimmedStart), (byte) -52)) {
              trimmedStart++;
              continue;
            }
            break;
          }
          while (trimmedStart < trimmedEnd) {
            if (rs.isAccountNameSeparator(name.charAt(trimmedEnd - 1), (byte) -52)) {
              trimmedEnd--;
              continue;
            }
            break;
          }
          trimmedLength = trimmedEnd - trimmedStart;
          if (trimmedLength < 1) {
            return null;
          }
          if (trimmedLength > 12) {
            return null;
          }
          canonicalName = new StringBuilder(trimmedLength);
          characterIndex = trimmedStart;
          if (obfuscationGuard) {
            field_a = (String[]) null;
          }
          while (trimmedEnd > characterIndex) {
            character = name.charAt(characterIndex);
            if (ph.isAccountNameCharacter(-14, (char) character)) {
              foldedCharacter = pv.foldAccountNameCharacter(124, (char) character);
              if (foldedCharacter != 0) {
                discarded$0 = canonicalName.append((char) foldedCharacter);
              }
            }
            characterIndex++;
          }
          if (canonicalName.length() != 0) {
            stackIn_29_0 = canonicalName.toString();
            return stackIn_29_0;
          }
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("k.B(");
          if (name == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -13) {
          return;
        }
        field_c = null;
    }

    static {
        field_a = new String[]{"N", "E", "S", "W"};
        field_b = "Difficulty: ";
    }
}
