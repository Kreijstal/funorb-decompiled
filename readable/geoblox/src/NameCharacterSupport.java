/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameCharacterSupport {
    static String createRepeatedPasswordAlertText;
    static String createNameLengthAlertText;
    static String createPasswordContainsPartialNameAlertText;
    static int avatarCryPhase;

    final static boolean isNameSeparator(byte methodGuard, char character) {
        int sentinelDivision = 87 / ((methodGuard - 25) / 53);
        if (character == 160) {
            return true;
        }
        if (character == 32) {
            return true;
        }
        if (character == 95) {
            return true;
        }
        if (character != 45) {
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
            NameCharacterSupport.computePrefixCrc32((byte[]) null, -123, -57);
          }
          checksumBeforeReturn = ResizableDialog.computeCrc32(length, bytes, -40, 0);
          return checksumBeforeReturn;
        } catch (java.lang.RuntimeException checksumFailure) {
          caughtChecksumFailure = checksumFailure;
          checksumFailureForContext = caughtChecksumFailure;
          checksumFailureBeforeContext = checksumFailureForContext;
          checksumMessagePrefix = new StringBuilder().append("gg.C(");
          if (bytes == null) {
            bytesDescription = "null";
          } else {
            bytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checksumFailureBeforeContext), ((StringBuilder) (Object) checksumMessagePrefix).append(bytesDescription).append(',').append(methodGuard).append(',').append(length).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard == 45) {
            createRepeatedPasswordAlertText = null;
            createNameLengthAlertText = null;
            createPasswordContainsPartialNameAlertText = null;
            return;
        }
        byte[] unusedNullBytesSnapshot = (byte[]) null;
        NameCharacterSupport.computePrefixCrc32((byte[]) null, 124, 46);
        createRepeatedPasswordAlertText = null;
        createNameLengthAlertText = null;
        createPasswordContainsPartialNameAlertText = null;
    }

    final static String joinTextParts(int methodGuard, CharSequence[] parts) {
        RuntimeException joinFailureForContext = null;
        String nullTextBeforeReturn = null;
        String joinedTextBeforeReturn = null;
        RuntimeException joinFailureBeforeDescription = null;
        StringBuilder joinMessagePrefix = null;
        String partsDescription = null;
        RuntimeException caughtJoinFailure = null;
        try {
          if (methodGuard == -11455) {
            joinedTextBeforeReturn = TextConcatenationSupport.joinCharSequenceRange(0, parts.length, parts, (byte) 96);
            return joinedTextBeforeReturn;
          }
          nullTextBeforeReturn = (String) null;
          return nullTextBeforeReturn;
        } catch (java.lang.RuntimeException joinFailure) {
          caughtJoinFailure = joinFailure;
          joinFailureForContext = caughtJoinFailure;
          joinFailureBeforeDescription = joinFailureForContext;
          joinMessagePrefix = new StringBuilder().append("gg.D(").append(methodGuard).append(',');
          if (parts == null) {
            partsDescription = "null";
          } else {
            partsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) joinFailureBeforeDescription), ((StringBuilder) (Object) joinMessagePrefix).append(partsDescription).append(')').toString());
        }
    }

    static {
        createRepeatedPasswordAlertText = "This password contains repeated characters, and would be easy to guess";
        createPasswordContainsPartialNameAlertText = "This password is part of your Player Name, and would be easy to guess";
        avatarCryPhase = 0;
        createNameLengthAlertText = "Names should contain a maximum of 12 characters";
    }
}
