/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginUiSupport {
    static int receivedRecordIdHigh16;
    static String lastGeobloxOfLevelText;

    final static void writeIntRecordSubmission(int packetOpcode, int methodGuard, KeyedIntRecordSubmission submission) {
        PacketBuffer outputPacket = null;
        int payloadStart = 0;
        try {
            outputPacket = CacheReference.outgoingSessionBuffer;
            outputPacket.writeCipherByte(packetOpcode, (byte) -63);
            outputPacket.position = outputPacket.position + 1;
            if (methodGuard != 86) {
                KeyedIntRecordSubmission guardedNullSubmissionSnapshot = (KeyedIntRecordSubmission) null;
                LoginUiSupport.writeIntRecordSubmission(-12, 107, (KeyedIntRecordSubmission) null);
            }
            payloadStart = outputPacket.position;
            outputPacket.writeByte((byte) 127, 1);
            outputPacket.writeByte((byte) 124, submission.byteKey);
            outputPacket.writeSignedSmart(submission.signedSmartKey, methodGuard - 6048);
            outputPacket.writeIntBE((byte) 95, submission.firstValue);
            outputPacket.writeIntBE((byte) 95, submission.secondValue);
            outputPacket.writeIntBE((byte) 95, submission.thirdValue);
            outputPacket.writeIntBE((byte) 95, submission.fourthValue);
            outputPacket.appendCrc32(104, payloadStart);
            outputPacket.backpatchLengthByte(11700, -payloadStart + outputPacket.position);
        } catch (RuntimeException submissionFailureForContext) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) submissionFailureForContext), "tj.B(" + packetOpcode + ',' + methodGuard + ',' + (submission != null ? "{...}" : "null") + ')');
        }
    }

    final static void showLoginPanel(byte methodGuard) {
        String loginIdentifierAfterGuardClear = null;
        String loginIdentifierAfterDismissal = null;
        String loginIdentifierWithoutDismissal = null;
        if (!AgeValidator.reconnectingLoginMode) {
            throw new IllegalStateException();
        }
        if (Geoblox.activeMessageDialog != null) {
            Geoblox.activeMessageDialog.dismissDialog((byte) -104);
            if (methodGuard >= -47) {
                lastGeobloxOfLevelText = (String) null;
                loginIdentifierAfterGuardClear = SpriteButtonRenderer.c(7789);
                SpriteButtonRenderer.activeLoginPanel = new LoginPanel(loginIdentifierAfterGuardClear, (String) null, true, false, false);
                ClientFlowState.accountDialogLayer.showDialog(false, ButtonWidget.accountContentDialog);
                ButtonWidget.accountContentDialog.replaceContent(SpriteButtonRenderer.activeLoginPanel, -85);
                ButtonWidget.accountContentDialog.finishTransition(true);
                return;
            }
            loginIdentifierAfterDismissal = SpriteButtonRenderer.c(7789);
            SpriteButtonRenderer.activeLoginPanel = new LoginPanel(loginIdentifierAfterDismissal, (String) null, true, false, false);
            ClientFlowState.accountDialogLayer.showDialog(false, ButtonWidget.accountContentDialog);
            ButtonWidget.accountContentDialog.replaceContent(SpriteButtonRenderer.activeLoginPanel, -85);
            ButtonWidget.accountContentDialog.finishTransition(true);
            return;
        }
        if (methodGuard < -47) {
            loginIdentifierWithoutDismissal = SpriteButtonRenderer.c(7789);
            SpriteButtonRenderer.activeLoginPanel = new LoginPanel(loginIdentifierWithoutDismissal, (String) null, true, false, false);
            ClientFlowState.accountDialogLayer.showDialog(false, ButtonWidget.accountContentDialog);
            ButtonWidget.accountContentDialog.replaceContent(SpriteButtonRenderer.activeLoginPanel, -85);
            ButtonWidget.accountContentDialog.finishTransition(true);
            return;
        }
        lastGeobloxOfLevelText = (String) null;
        String loginIdentifierAfterLateClear = SpriteButtonRenderer.c(7789);
        SpriteButtonRenderer.activeLoginPanel = new LoginPanel(loginIdentifierAfterLateClear, (String) null, true, false, false);
        ClientFlowState.accountDialogLayer.showDialog(false, ButtonWidget.accountContentDialog);
        ButtonWidget.accountContentDialog.replaceContent(SpriteButtonRenderer.activeLoginPanel, -85);
        ButtonWidget.accountContentDialog.finishTransition(true);
    }

    public static void clearLoginUiText(int methodGuard) {
        if (methodGuard < 1) {
            lastGeobloxOfLevelText = (String) null;
            lastGeobloxOfLevelText = null;
            return;
        }
        lastGeobloxOfLevelText = null;
    }

    final static void releaseAwtLoadingFonts(byte methodGuard) {
        TextWidgetRenderer.loadingProgressImage = null;
        int guardResidue = 59 % ((methodGuard + 30) / 37);
        UiFontResources.awtLoadingFont = null;
    }

    final static int pollLoginUiArchiveProgress(byte methodGuard) {
        if (methodGuard != 73) {
          LoginUiSupport.clearLoginUiText(-5);
        }
        if (VisualPropertyOverrides.clientBootstrapStage < 2) {
          return 0;
        }
        if (MeshPrioritySupport.bootstrapLanguageId == 0) {
          if (!DirectByteStorage.field_h.ensureIndexLoaded(0)) {
            return 20;
          }
          if (!DirectByteStorage.field_h.loadGroupByName("commonui", (byte) -127)) {
            return 40;
          }
          if (!AttachedEntityRenderer.field_c.ensureIndexLoaded(0)) {
            return 50;
          }
          if (!AttachedEntityRenderer.field_c.loadGroupByName("commonui", (byte) -127)) {
            return 60;
          }
          if (!DialRenderer.field_n.ensureIndexLoaded(0)) {
            return 70;
          }
          if (DialRenderer.field_n.loadAllGroups(true)) {
            return 100;
          }
          return 80;
        }
        if (FadingDialog.interfaceTextArchive != null) {
          if (!FadingDialog.interfaceTextArchive.ensureIndexLoaded(0)) {
            return 14;
          }
          if (!FadingDialog.interfaceTextArchive.hasGroupName((byte) -115, "")) {
            return 29;
          }
          if (!FadingDialog.interfaceTextArchive.loadGroupByName("", (byte) -124)) {
            return 29;
          }
        }
        if (!DirectByteStorage.field_h.ensureIndexLoaded(methodGuard ^ 73)) {
          return 43;
        }
        if (!DirectByteStorage.field_h.loadGroupByName("commonui", (byte) -125)) {
          return 57;
        }
        if (!AttachedEntityRenderer.field_c.ensureIndexLoaded(0)) {
          return 71;
        }
        if (!AttachedEntityRenderer.field_c.loadGroupByName("commonui", (byte) -128)) {
          return 80;
        }
        if (!DialRenderer.field_n.ensureIndexLoaded(methodGuard - 73)) {
          return 82;
        }
        if (!DialRenderer.field_n.loadAllGroups(true)) {
          return 86;
        }
        return 100;
    }

    static {
        lastGeobloxOfLevelText = "Level's<br>last geoblox";
    }
}
