/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    int port;
    static int field_c;
    static FontMetrics field_a;
    String host;

    public static void releaseStatics(int param0) {
        int var1 = 58 % ((param0 - 20) / 45);
        field_a = null;
    }

    final static boolean isAccountNameValid(boolean allowConsecutiveSeparators, int startIndex, CharSequence text) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (text == null) {
            return false;
          }
          var3_int = text.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = AccountCreationProgressDialog.normalizeAccountName(-1, text);
          if (var4 != null &&
            1 <= var4.length()) {
            if (!AccountNameSupport.isNameSeparator((byte) -124, var4.charAt(0)) &&
              !AccountNameSupport.isNameSeparator((byte) -84, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              for (var6 = startIndex; text.length() > var6; var6++) {
                var7 = text.charAt(var6);
                if (AccountNameSupport.isNameSeparator((byte) -85, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !allowConsecutiveSeparators) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("g.J(").append(allowConsecutiveSeparators).append(',').append(startIndex).append(',');
          if (text == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static EmailValidationError validateEmailLocalPart(byte guard, String localPart) {
        EmailValidationError stackIn_3_0 = null;
        EmailValidationError stackIn_7_0 = null;
        EmailValidationError stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        EmailValidationError stackIn_24_0 = null;
        EmailValidationError stackIn_38_0 = null;
        EmailValidationError stackIn_43_0 = null;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = localPart.length();
          if (var2_int == 0) {
            stackIn_3_0 = ClientExceptionSupport.MISSING_EMAIL_COMPONENT;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = SocialContact.EMAIL_COMPONENT_TOO_LONG;
            return stackIn_7_0;
          }
          if (34 == localPart.charAt(0)) {
            if (34 != localPart.charAt(-1 + var2_int)) {
              stackIn_11_0 = MouseInputRegistration.INVALID_EMAIL_SYNTAX;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = localPart.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = MouseInputRegistration.INVALID_EMAIL_SYNTAX;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = localPart.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_38_0 = MouseInputRegistration.INVALID_EMAIL_SYNTAX;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (LoginCredentials.abcdefghijklmnopqrstuvwxyzabcdefghijText.indexOf(var5Lifetime1) == -1) {
                stackIn_43_0 = MouseInputRegistration.INVALID_EMAIL_SYNTAX;
                return stackIn_43_0;
              }
              var3Lifetime1 = 0;
            }
          }
          if (guard <= -118) {
            return null;
          }
          field_c = -60;
          stackIn_49_0 = null;
          return (EmailValidationError) (stackIn_49_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("g.I(").append(guard).append(',');
          if (localPart == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    abstract java.net.Socket connect(byte guard) throws IOException;

    final java.net.Socket openDirectSocket(byte guard) throws IOException {
        if (guard <= 94) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.host, this.port);
    }

    static {
    }
}
