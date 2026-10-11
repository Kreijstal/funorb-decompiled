/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationSupport {
    static int pointerPressXSnapshot;

    final static boolean startAccountCreation(String displayName, String email, int ageYears, AccountCreationForm accountForm, int methodGuard, boolean newsOptIn, String password) {
        AccountCreationDialog unusedCreationDialogAlias = null;
        RuntimeException creationFailureForContext = null;
        AccountCreationDialog creationDialog = null;
        RuntimeException creationFailureBeforeContext = null;
        StringBuilder creationMessagePrefix = null;
        String displayNameDescription = null;
        StringBuilder creationMessageBeforeEmail = null;
        String emailDescription = null;
        StringBuilder creationMessageBeforeForm = null;
        String accountFormDescription = null;
        StringBuilder creationMessageBeforePassword = null;
        String passwordDescription = null;
        RuntimeException caughtCreationFailure = null;
        try {
          if (ClientFlowState.accountCreationFlowState != DiskCacheWorker.idleClientFlowToken) {
            return false;
          }
          creationDialog = new AccountCreationDialog(ClientFlowState.accountDialogLayer, accountForm);
          unusedCreationDialogAlias = creationDialog;
          ClientFlowState.accountDialogLayer.showDialog(false, creationDialog);
          if (methodGuard != 0) {
            return false;
          }
          if (AccountEligibilitySupport.isAccountCreationBlocked(122)) {
            creationDialog.showIneligibleResult(12086);
            return true;
          }
          CachedArchiveSource.accountCreationNewsOptIn = newsOptIn;
          StatefulWidgetRenderer.accountCreationAgeYears = ageYears;
          UsernameQueryState.pendingAccountUsernameResult = null;
          ResourceArchive.accountCreationEmail = email;
          ClientFlowState.accountCreationFlowState = IntrusiveDeque.pendingClientFlowToken;
          ByteStorage.accountCreationPassword = password;
          SpriteCheckboxRenderer.accountCreationDisplayName = displayName;
          return true;
        } catch (java.lang.RuntimeException creationFailure) {
          caughtCreationFailure = creationFailure;
          creationFailureForContext = caughtCreationFailure;
          creationFailureBeforeContext = creationFailureForContext;
          creationMessagePrefix = new StringBuilder().append("mc.B(");
          if (displayName == null) {
            displayNameDescription = "null";
          } else {
            displayNameDescription = "{...}";
          }
          creationMessageBeforeEmail = ((StringBuilder) (Object) creationMessagePrefix).append(displayNameDescription).append(',');
          if (email == null) {
            emailDescription = "null";
          } else {
            emailDescription = "{...}";
          }
          creationMessageBeforeForm = ((StringBuilder) (Object) creationMessageBeforeEmail).append(emailDescription).append(',').append(ageYears).append(',');
          if (accountForm == null) {
            accountFormDescription = "null";
          } else {
            accountFormDescription = "{...}";
          }
          creationMessageBeforePassword = ((StringBuilder) (Object) creationMessageBeforeForm).append(accountFormDescription).append(',').append(methodGuard).append(',').append(newsOptIn).append(',');
          if (password == null) {
            passwordDescription = "null";
          } else {
            passwordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) creationFailureBeforeContext), ((StringBuilder) (Object) creationMessageBeforePassword).append(passwordDescription).append(')').toString());
        }
    }

    final static void snapshotPointerInput(byte methodGuard) {
        Throwable unusedPointerSnapshotFailureCarrier = null;
        Object pointerMonitor = null;
        pointerMonitor = GameplaySetupSupport.pointerListener;
        synchronized (pointerMonitor) {
          GameplaySession.pointerIdleTicks = GameplaySession.pointerIdleTicks + 1;
          EntityCollisionSupport.heldPointerButtonSnapshot = Under13TermsPanel.liveHeldPointerButton;
          if (methodGuard >= -126) {
            pointerPressXSnapshot = -77;
          }
          PrefixCodeDecoder.pointerXSnapshot = PointerMenuState.livePointerX;
          PcmResampler.pointerYSnapshot = ReflectionCheckRequest.livePointerY;
          AttachmentPointerState.pointerActivitySnapshot = EndingAnimationSupport.pointerActivityPending;
          EndingAnimationSupport.pointerActivityPending = false;
          CheckboxRenderer.pointerPressButtonSnapshot = ReceivedTextRecord.pendingPointerPressButton;
          pointerPressXSnapshot = TextWidgetSupport.livePointerPressX;
          FullscreenFocusCanvas.pointerPressYSnapshot = DisplayNamePanel.livePointerPressY;
          ReceivedTextRecord.pendingPointerPressButton = 0;
        }
    }

    static {
        pointerPressXSnapshot = 0;
    }
}
