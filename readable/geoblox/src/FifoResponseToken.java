/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FifoResponseToken extends IntrusiveNode {
    static String unpackingMusicText;
    static HighscoreQuery activeHighscoreQuery;
    static int nextSecondarySocialInsertionIndex;
    static IndexedSprite bakingBackgroundSprite;

    final static TextValidationFailure validateEmailSyntax(String candidateEmail, int domainStartOffsetAfterAt) {
        int atSignIndex = 0;
        RuntimeException validationFailureForContext = null;
        String localPart = null;
        String domainPart = null;
        TextValidationFailure localPartFailure = null;
        TextValidationFailure emptyEmailFailureBeforeReturn = null;
        TextValidationFailure missingAtSignFailureBeforeReturn = null;
        TextValidationFailure localPartFailureBeforeReturn = null;
        TextValidationFailure domainFailureBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String emailDescription = null;
        RuntimeException caughtValidationFailure = null;
        try {
          if (candidateEmail != null &&
              0 != candidateEmail.length()) {
            atSignIndex = candidateEmail.indexOf('@');
            if (atSignIndex == -1) {
              missingAtSignFailureBeforeReturn = InstrumentNoteMask.missingTextComponentFailure;
              return missingAtSignFailureBeforeReturn;
            }
            localPart = candidateEmail.substring(0, atSignIndex);
            domainPart = candidateEmail.substring(domainStartOffsetAfterAt + atSignIndex);
            localPartFailure = AccountCreationDialog.validateEmailLocalPart(localPart, true);
            if (localPartFailure == null) {
              domainFailureBeforeReturn = GzipInflater.validateDomainText(domainPart, false);
              return domainFailureBeforeReturn;
            }
            localPartFailureBeforeReturn = localPartFailure;
            return localPartFailureBeforeReturn;
          }
          emptyEmailFailureBeforeReturn = TextHotspotBounds.emptyEmailFailure;
          return emptyEmailFailureBeforeReturn;
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("ca.B(");
          if (candidateEmail == null) {
            emailDescription = "null";
          } else {
            emailDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(emailDescription).append(',').append(domainStartOffsetAfterAt).append(')').toString());
        }
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        unpackingMusicText = null;
        activeHighscoreQuery = null;
        bakingBackgroundSprite = null;
        if (methodGuard) {
            bakingBackgroundSprite = (IndexedSprite) null;
        }
    }

    private FifoResponseToken() throws Throwable {
        throw new Error();
    }

    static {
        unpackingMusicText = "Unpacking music";
    }
}
