/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextValidationSupport {
    static long loginHandshakeServerSeed;
    static ResourceArchive bootstrapGameTextArchive;

    final static boolean containsTextOrReverse(String text, String needle, int methodGuard) {
        String reversedNeedle = null;
        boolean edgeMatchBeforeReturn = false;
        RuntimeException matchFailureBeforeContext = null;
        StringBuilder matchMessagePrefix = null;
        String textDescription = null;
        StringBuilder matchMessageBeforeNeedle = null;
        String needleDescription = null;
        RuntimeException caughtMatchFailure = null;
        RuntimeException matchFailureForContext = null;
        try {
          if (methodGuard > -67) {
            return true;
          }
          reversedNeedle = CachedArchiveSource.reverseTextCodeUnits(32, needle);
          if (text.indexOf(needle) == -1 &&
              -1 == text.indexOf(reversedNeedle)) {
            edgeMatchBeforeReturn = (text.startsWith(needle)) || (text.startsWith(reversedNeedle)) || (text.endsWith(needle)) || (text.endsWith(reversedNeedle));
            return edgeMatchBeforeReturn;
          }
          return true;
        } catch (java.lang.RuntimeException matchFailure) {
          caughtMatchFailure = matchFailure;
          matchFailureForContext = caughtMatchFailure;
          matchFailureBeforeContext = matchFailureForContext;
          matchMessagePrefix = new StringBuilder().append("ak.A(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          matchMessageBeforeNeedle = ((StringBuilder) (Object) matchMessagePrefix).append(textDescription).append(',');
          if (needle == null) {
            needleDescription = "null";
          } else {
            needleDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) matchFailureBeforeContext), ((StringBuilder) (Object) matchMessageBeforeNeedle).append(needleDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void clearValidationArchive(int methodGuard) {
        if (methodGuard != -30635) {
            bootstrapGameTextArchive = (ResourceArchive) null;
        }
        bootstrapGameTextArchive = null;
    }

    final static boolean containsNonAsciiAlphanumeric(String text, byte methodGuard) {
        int characterIndex = 0;
        RuntimeException validationFailureForContext = null;
        int characterCode = 0;
        int clientControlFlowGuard = 0;
        RuntimeException validationFailureBeforeContext = null;
        StringBuilder validationMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtValidationFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          for (characterIndex = 0; characterIndex < text.length(); characterIndex++) {
            characterCode = text.charAt(characterIndex);
            if (!ArchiveCatalog.isAsciiLetter((char) characterCode, 97) &&
                !DualLinkNode.isAsciiDigit(-58, (char) characterCode)) {
              return true;
            }
          }
          if (methodGuard < -33) {
            return false;
          }
          loginHandshakeServerSeed = -33L;
          return false;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeContext = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("ak.B(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeContext), ((StringBuilder) (Object) validationMessagePrefix).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static LoginMethod[] listLoginMethods(boolean methodGuard) {
        if (methodGuard) {
            TextValidationSupport.listLoginMethods(false);
        }
        return new LoginMethod[]{LoginTextValue.emailLoginMethod, ProgressDialog.usernameLoginMethod, ValidationIconWidget.emptyNameLoginMethod};
    }

    static {
    }
}
