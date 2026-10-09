/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginTextValue {
    static String[] gmtMonthAbbreviations;
    private String text;
    private boolean includeInLookupRequest;
    static LoginMethod emailLoginMethod;

    LoginTextValue(String text) {
        this(text, false);
    }

    final String getText(int methodGuard) {
        if (methodGuard != 16925) {
            this.isIncludedInLookupRequest((byte) -83);
            return this.text;
        }
        return this.text;
    }

    LoginTextValue(String text, boolean includeInLookupRequest) {
        RuntimeException textInitializationFailureForContext = null;
        boolean lookupInclusionSnapshot = false;
        RuntimeException textInitializationFailureBeforeDescription = null;
        StringBuilder textInitializationMessagePrefix = null;
        String textDescription = null;
        RuntimeException textInitializationFailure = null;
        try {
          this.text = text;
          if (null == this.text) {
            this.text = "";
          }
          lookupInclusionSnapshot = !(!includeInLookupRequest);
          this.includeInLookupRequest = lookupInclusionSnapshot;
          if (this.text.length() != 0) {
            return;
          }
          this.includeInLookupRequest = false;
          return;
        } catch (java.lang.RuntimeException caughtTextInitializationFailure) {
          textInitializationFailure = caughtTextInitializationFailure;
          textInitializationFailureForContext = textInitializationFailure;
          textInitializationFailureBeforeDescription = textInitializationFailureForContext;
          textInitializationMessagePrefix = new StringBuilder().append("mb.<init>(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textInitializationFailureBeforeDescription), ((StringBuilder) (Object) textInitializationMessagePrefix).append(textDescription).append(',').append(includeInLookupRequest).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != -1) {
            return;
        }
        gmtMonthAbbreviations = null;
        emailLoginMethod = null;
    }

    final boolean isIncludedInLookupRequest(byte methodGuard) {
        if (methodGuard <= 74) {
            return false;
        }
        return this.includeInLookupRequest;
    }

    static {
        gmtMonthAbbreviations = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        emailLoginMethod = new LoginMethod("email");
    }
}
