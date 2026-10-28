/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RepeatedCharacterSupport {
    static String field_b;
    static int field_a;

    final static boolean a(byte param0) {
        int var1 = 116 / ((16 - param0) / 34);
        if (10 > QuickChatPhraseCache.field_e) {
          return false;
        }
        if (fc.field_a >= 13) {
          return true;
        }
        return false;
    }

    final static boolean isRepeatedCharacter(int start, String text) {
        String stackIn_13_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var2_int = text.charAt(0);
          for (int var3 = start; text.length() > var3; var3++) {
            if (text.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("aa.C(").append(start).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        if (guard != -96) {
          String var2 = (String) null;
          RepeatedCharacterSupport.isRepeatedCharacter(-12, (String) null);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
