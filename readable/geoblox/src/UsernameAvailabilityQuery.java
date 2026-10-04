/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityQuery {
    String[] suggestedUsernames;
    boolean underThirteenFlag;
    boolean accepted;
    String candidateOrFailureText;
    static IntrusiveDeque reflectionCheckRequests;
    int responseCode;
    static String createInvalidAgeAlertText;
    static String orbPointsText;
    static Sprite[] achievementSprites;
    static String loginEmailText;
    static ResourceArchive instrumentPatchArchive;
    static Sprite germsForegroundSprite;

    final static void attachCanvasInputListeners(java.awt.Canvas canvas, int methodGuard) {
        RuntimeException attachmentFailureForContext = null;
        RuntimeException attachmentFailureBeforeDescription = null;
        StringBuilder attachmentMessagePrefix = null;
        String canvasDescription = null;
        RuntimeException caughtAttachmentFailure = null;
        try {
          SpriteConstructionSupport.attachKeyboardListeners((byte) -85, (java.awt.Component) ((Object) canvas));
          if (methodGuard != 57) {
            return;
          }
          DropTargetWidget.attachPointerInputListeners((java.awt.Component) ((Object) canvas), methodGuard - 56);
          if (null == CachedTextLayout.mouseWheelInput) {
            return;
          }
          CachedTextLayout.mouseWheelInput.attachWheelListener(124, (java.awt.Component) ((Object) canvas));
          return;
        } catch (java.lang.RuntimeException attachmentFailure) {
          caughtAttachmentFailure = attachmentFailure;
          attachmentFailureForContext = caughtAttachmentFailure;
          attachmentFailureBeforeDescription = attachmentFailureForContext;
          attachmentMessagePrefix = new StringBuilder().append("sl.D(");
          if (canvas == null) {
            canvasDescription = "null";
          } else {
            canvasDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) attachmentFailureBeforeDescription), ((StringBuilder) (Object) attachmentMessagePrefix).append(canvasDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static String normalizePasswordForPacket(CharSequence passwordCharacters, int methodGuard) {
        int clampedPasswordLength = 0;
        char[] outputCharactersForWrites = null;
        int characterIndex = 0;
        int sourceCodeUnit = 0;
        java.awt.Canvas unusedNullCanvasBeforeGuardCall = null;
        char[] allocatedCharactersAlias = null;
        char[] allocatedCharacters = null;
        String normalizedPasswordBeforeReturn = null;
        RuntimeException normalizationFailureBeforeDescription = null;
        StringBuilder normalizationMessagePrefix = null;
        String passwordDescription = null;
        RuntimeException caughtNormalizationFailure = null;
        RuntimeException normalizationFailureForContext = null;
        try {
          clampedPasswordLength = passwordCharacters.length();
          if (20 < clampedPasswordLength) {
            clampedPasswordLength = 20;
          }
          allocatedCharacters = new char[clampedPasswordLength];
          allocatedCharactersAlias = allocatedCharacters;
          outputCharactersForWrites = allocatedCharactersAlias;
          characterIndex = 0;
          if (methodGuard != 48) {
            unusedNullCanvasBeforeGuardCall = (java.awt.Canvas) null;
            UsernameAvailabilityQuery.attachCanvasInputListeners((java.awt.Canvas) null, 58);
          }
          while (clampedPasswordLength > characterIndex) {
            sourceCodeUnit = passwordCharacters.charAt(characterIndex);
            if ((sourceCodeUnit >= 65) &&
                (sourceCodeUnit <= 90)) {
              outputCharactersForWrites[characterIndex] = (char)(-65 + (sourceCodeUnit + 97));
            } else if (((!(sourceCodeUnit >= 97)) ||
                  (!(sourceCodeUnit <= 122))) &&
                ((!(sourceCodeUnit >= 48)) ||
                  (!(sourceCodeUnit <= 57)))) {
              outputCharactersForWrites[characterIndex] = (char)95;
            } else {
              outputCharactersForWrites[characterIndex] = (char)sourceCodeUnit;
            }
            characterIndex++;
          }
          normalizedPasswordBeforeReturn = new String(allocatedCharacters);
          return normalizedPasswordBeforeReturn;
        } catch (java.lang.RuntimeException normalizationFailure) {
          caughtNormalizationFailure = normalizationFailure;
          normalizationFailureForContext = caughtNormalizationFailure;
          normalizationFailureBeforeDescription = normalizationFailureForContext;
          normalizationMessagePrefix = new StringBuilder().append("sl.A(");
          if (passwordCharacters == null) {
            passwordDescription = "null";
          } else {
            passwordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) normalizationFailureBeforeDescription), ((StringBuilder) (Object) normalizationMessagePrefix).append(passwordDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseUsernameQuerySharedResources(int methodGuard) {
        createInvalidAgeAlertText = null;
        germsForegroundSprite = null;
        instrumentPatchArchive = null;
        reflectionCheckRequests = null;
        int unusedGuardRemainder = -39 % ((48 - methodGuard) / 43);
        loginEmailText = null;
        orbPointsText = null;
        achievementSprites = null;
    }

    UsernameAvailabilityQuery(boolean accepted) {
        this.accepted = accepted ? true : false;
    }

    final static int processAccountUiActionsWithoutLogin(boolean fullscreenActive, SessionGameApplet applet, boolean clearPatchArchiveGuard) {
        RuntimeException uiActionFailureForContext = null;
        int uiActionResultBeforeReturn = 0;
        RuntimeException uiActionFailureBeforeDescription = null;
        StringBuilder uiActionMessagePrefix = null;
        String appletDescription = null;
        RuntimeException caughtUiActionFailure = null;
        try {
          if (clearPatchArchiveGuard) {
            instrumentPatchArchive = (ResourceArchive) null;
          }
          uiActionResultBeforeReturn = applet.processAccountUiActionsWithoutLogin(fullscreenActive, -17978);
          return uiActionResultBeforeReturn;
        } catch (java.lang.RuntimeException uiActionFailure) {
          caughtUiActionFailure = uiActionFailure;
          uiActionFailureForContext = caughtUiActionFailure;
          uiActionFailureBeforeDescription = uiActionFailureForContext;
          uiActionMessagePrefix = new StringBuilder().append("sl.B(").append(fullscreenActive).append(',');
          if (applet == null) {
            appletDescription = "null";
          } else {
            appletDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) uiActionFailureBeforeDescription), ((StringBuilder) (Object) uiActionMessagePrefix).append(appletDescription).append(',').append(clearPatchArchiveGuard).append(')').toString());
        }
    }

    static {
        reflectionCheckRequests = new IntrusiveDeque();
        createInvalidAgeAlertText = "Please enter your age in years";
        orbPointsText = "Orb points: <%0>";
        loginEmailText = "Email: ";
    }
}
