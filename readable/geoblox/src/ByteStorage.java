/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static ValidationState emptyInputValidationState;
    static long updatePeriodNanoseconds;
    static String loadingExtraDataText;
    static int retainedTextRecordCount;
    static String accountCreationPassword;

    final static void updatePageNavigationLinks(java.applet.Applet applet, int methodGuard) {
        try {
            RuntimeException linkFailureBeforeDescription = null;
            StringBuilder linkMessagePrefix = null;
            String appletDescription = null;
            Throwable caughtLinkThrowable = null;
            Throwable ignoredLinkUpdateFailure = null;
            RuntimeException linkFailureForContext = null;
            String overriddenBasePath = null;
            java.net.URL codeBaseUrl = null;
            try {
              try {
                codeBaseUrl = applet.getCodeBase();
                if (methodGuard != 20000000) {
                  ByteStorage.releaseStaticReferences(-109);
                }
                overriddenBasePath = SessionGameApplet.applySessionOverridesToUrl(codeBaseUrl, methodGuard - 19999938, applet).getFile();
                AppletJavaScriptBridge.callWithArguments(methodGuard - 20014882, new Object[]{"home", overriddenBasePath + "home.ws"}, applet, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"gamelist", overriddenBasePath + "togamelist.ws"}, applet, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"serverlist", overriddenBasePath + "toserverlist.ws"}, applet, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(methodGuard - 20014882, new Object[]{"options", overriddenBasePath + "options.ws"}, applet, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"terms", overriddenBasePath + "terms.ws"}, applet, "updatelinks");
                AppletJavaScriptBridge.callWithArguments(-14882, new Object[]{"privacy", overriddenBasePath + "privacy.ws"}, applet, "updatelinks");
                return;
              } catch (java.lang.Throwable linkUpdateThrowable) {
                caughtLinkThrowable = linkUpdateThrowable;
                ignoredLinkUpdateFailure = caughtLinkThrowable;
                return;
              }
            } catch (java.lang.RuntimeException linkFailure) {
              caughtLinkThrowable = linkFailure;
              linkFailureForContext = (RuntimeException) (Object) caughtLinkThrowable;
              linkFailureBeforeDescription = linkFailureForContext;
              linkMessagePrefix = new StringBuilder().append("oj.F(");
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) linkFailureBeforeDescription), ((StringBuilder) (Object) linkMessagePrefix).append(appletDescription).append(',').append(methodGuard).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        emptyInputValidationState = null;
        accountCreationPassword = null;
        if (methodGuard > -50) {
            return;
        }
        loadingExtraDataText = null;
    }

    final static void pollAccountDialogUi(int unusedWheelRotation, byte methodGuard) {
        DequeCursor.pollAccountDialogAction(-1);
        if (methodGuard >= -89) {
            ByteStorage.releaseStaticReferences(70);
        }
    }

    abstract byte[] copyToByteArray(byte copyGuard);

    abstract void initializeStorage(byte[] sourceBytes, boolean populateBuffer);

    static {
        emptyInputValidationState = new ValidationState();
        loadingExtraDataText = "Loading extra data";
        updatePeriodNanoseconds = 20000000L;
    }
}
