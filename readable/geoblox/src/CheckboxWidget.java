/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxWidget extends ButtonWidget {
    static String loginJustPlayTooltipText;
    static long errorReportLoginLongValue;
    static String createNewsOptInTooltipText;
    static int spaceThemeCompletionAchievementId;

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard >= -65) {
            PlatformTaskDispatcher unusedNullDispatcherSnapshot = (PlatformTaskDispatcher) null;
            CheckboxWidget.queryDisplayModesAndWait(98, (PlatformTaskDispatcher) null);
        }
        loginJustPlayTooltipText = null;
        createNewsOptInTooltipText = null;
    }

    private CheckboxWidget(String label, WidgetListener listener) {
        this(label, DialRenderer.accountUiTheme.buttonRenderer, listener);
        try {
            this.renderer = DialRenderer.accountUiTheme.checkboxRenderer;
        } catch (RuntimeException checkboxInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checkboxInitializationFailure), "vi.<init>(" + (label != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    final void activateButton(int buttonY, int methodGuard, int buttonX, int pointerButton) {
        this.active = !this.active ? true : false;
        super.activateButton(buttonY, methodGuard, buttonX, pointerButton);
    }

    private CheckboxWidget(String label, WidgetRenderer initialButtonRenderer, WidgetListener listener) {
        super(label, initialButtonRenderer, listener);
        try {
            this.renderer = DialRenderer.accountUiTheme.checkboxRenderer;
        } catch (RuntimeException checkboxInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checkboxInitializationFailure), "vi.<init>(" + (label != null ? "{...}" : "null") + ',' + (initialButtonRenderer != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    final static DisplayModeInfo[] queryDisplayModesAndWait(int methodGuard, PlatformTaskDispatcher dispatcher) {
        int modeIndex = 0;
        DisplayModeInfo[] unsupportedResult = null;
        DisplayModeInfo[] failedTaskResult = null;
        DisplayModeInfo[] modesBeforeReturn = null;
        RuntimeException queryFailureBeforeDescription = null;
        StringBuilder queryMessagePrefix = null;
        String dispatcherDescription = null;
        RuntimeException caughtQueryFailure = null;
        RuntimeException queryFailureForContext = null;
        int[] workingModeWords = null;
        DisplayModeInfo[] displayModes = null;
        DisplayModeInfo mode = null;
        int unusedClientControlSnapshot = 0;
        PlatformTask displayModeTask = null;
        int[] modeWordsBeforeWorkingAlias = null;
        int[] returnedModeWords = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (!dispatcher.hasFullscreenSupport(-26098)) {
            unsupportedResult = new DisplayModeInfo[]{};
            return unsupportedResult;
          }
          displayModeTask = dispatcher.requestDisplayModes(34);
          while (displayModeTask.status == 0) {
            ByteTextDecodingSupport.sleepMillis(0, 10L);
          }
          if (displayModeTask.status == 2) {
            failedTaskResult = new DisplayModeInfo[]{};
            return failedTaskResult;
          }
          returnedModeWords = (int[]) (displayModeTask.result);
          modeWordsBeforeWorkingAlias = returnedModeWords;
          workingModeWords = modeWordsBeforeWorkingAlias;
          displayModes = new DisplayModeInfo[returnedModeWords.length >> 2];
          if (methodGuard <= 61) {
            errorReportLoginLongValue = 120L;
          }
          for (modeIndex = 0; modeIndex < displayModes.length; modeIndex++) {
            mode = new DisplayModeInfo();
            displayModes[modeIndex] = mode;
            mode.width = workingModeWords[modeIndex << 2];
            mode.height = workingModeWords[1 + (modeIndex << 2)];
            mode.bitDepth = workingModeWords[2 + (modeIndex << 2)];
            mode.refreshRate = workingModeWords[(modeIndex << 2) + 3];
          }
          modesBeforeReturn = displayModes;
          return modesBeforeReturn;
        } catch (java.lang.RuntimeException queryFailure) {
          caughtQueryFailure = queryFailure;
          queryFailureForContext = caughtQueryFailure;
          queryFailureBeforeDescription = queryFailureForContext;
          queryMessagePrefix = new StringBuilder().append("vi.F(").append(methodGuard).append(',');
          if (dispatcher == null) {
            dispatcherDescription = "null";
          } else {
            dispatcherDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryFailureBeforeDescription), ((StringBuilder) (Object) queryMessagePrefix).append(dispatcherDescription).append(')').toString());
        }
    }

    CheckboxWidget(String label, WidgetListener listener, boolean initiallyActive) {
        this(label, listener);
        try {
            this.active = initiallyActive ? true : false;
        } catch (RuntimeException checkboxInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checkboxInitializationFailure), "vi.<init>(" + (label != null ? "{...}" : "null") + ',' + (listener != null ? "{...}" : "null") + ',' + initiallyActive + ')');
        }
    }

    static {
        loginJustPlayTooltipText = "Play the game without logging in just yet";
        createNewsOptInTooltipText = "Updates will sent to the email address you've given";
        spaceThemeCompletionAchievementId = 12;
    }
}
