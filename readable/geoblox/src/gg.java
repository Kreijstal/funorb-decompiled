/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String createRepeatedPasswordAlertText;
    static String createNameLengthAlertText;
    static String createPasswordContainsPartialNameAlertText;
    static int avatarCryPhase;

    final static boolean a(byte param0, char param1) {
        int var2 = 87 / ((param0 - 25) / 53);
        if (param1 == 160) {
            return true;
        }
        if (param1 == 32) {
            return true;
        }
        if (param1 == 95) {
            return true;
        }
        if (param1 != 45) {
            return false;
        }
        return true;
    }

    final static int computePrefixCrc32(byte[] bytes, int methodGuard, int length) {
        RuntimeException checksumFailureForContext = null;
        byte[] unusedNullBytesSnapshot = null;
        int checksumBeforeReturn = 0;
        RuntimeException checksumFailureBeforeContext = null;
        StringBuilder checksumMessagePrefix = null;
        String bytesDescription = null;
        RuntimeException caughtChecksumFailure = null;
        try {
          if (methodGuard < 56) {
            unusedNullBytesSnapshot = (byte[]) null;
            gg.computePrefixCrc32((byte[]) null, -123, -57);
          }
          checksumBeforeReturn = oe.computeCrc32(length, bytes, -40, 0);
          return checksumBeforeReturn;
        } catch (java.lang.RuntimeException checksumFailure) {
          caughtChecksumFailure = checksumFailure;
          checksumFailureForContext = caughtChecksumFailure;
          checksumFailureBeforeContext = (RuntimeException) (checksumFailureForContext);
          checksumMessagePrefix = new StringBuilder().append("gg.C(");
          if (bytes == null) {
            bytesDescription = "null";
          } else {
            bytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checksumFailureBeforeContext), ((StringBuilder) (Object) checksumMessagePrefix).append(bytesDescription).append(',').append(methodGuard).append(',').append(length).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 45) {
            createRepeatedPasswordAlertText = null;
            createNameLengthAlertText = null;
            createPasswordContainsPartialNameAlertText = null;
            return;
        }
        byte[] var2 = (byte[]) null;
        gg.computePrefixCrc32((byte[]) null, 124, 46);
        createRepeatedPasswordAlertText = null;
        createNameLengthAlertText = null;
        createPasswordContainsPartialNameAlertText = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -11455) {
            stackIn_4_0 = mj.a(0, param1.length, param1, (byte) 96);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var2);
          stackIn_7_1 = new StringBuilder().append("gg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        createRepeatedPasswordAlertText = "This password contains repeated characters, and would be easy to guess";
        createPasswordContainsPartialNameAlertText = "This password is part of your Player Name, and would be easy to guess";
        avatarCryPhase = 0;
        createNameLengthAlertText = "Names should contain a maximum of 12 characters";
    }
}
