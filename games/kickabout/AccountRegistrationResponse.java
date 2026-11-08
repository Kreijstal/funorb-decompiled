/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationResponse {
    boolean success;
    int responseCode;
    String message;
    static ic field_b;
    boolean needsTerms;
    String[] nameSuggestions;
    static String field_i;
    static Sprite field_j;
    static String field_h;
    static Sprite[] field_a;

    final static boolean a(byte param0) {
        int var1 = -55 / ((-40 - param0) / 36);
        if (!ConsolePanel.e((byte) 127)) {
          return false;
        }
        if (f.field_c) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_h = null;
        field_a = null;
        field_b = null;
        field_i = null;
        field_j = null;
    }

    final static int countCharacterFrom(char param0, int param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 0;
          var4 = param2.length();
          for (var5 = param1; var4 > var5; var5++) {
            if (param0 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wn.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    AccountRegistrationResponse(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_b = new ic();
        field_h = "Tournament Game";
    }
}
