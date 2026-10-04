/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayer extends SingleChildWidget {
    static boolean[] decodedSpriteHasNonOpaqueAlpha;
    private IntrusiveDeque dialogs;
    static int rotatedEntityScreenX;
    static BitmapFont sharedUiFont;

    final void hideAllDialogs(int methodGuard) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        DequeCursor dialogCursor = new DequeCursor(this.dialogs);
        FadingDialog dialog = (FadingDialog) ((Object) dialogCursor.beginForward((byte) 88));
        while (dialog != null) {
            dialog.dialogVisible = false;
            dialog = (FadingDialog) ((Object) dialogCursor.nextForward((byte) 125));
        }
        if (methodGuard != 10936) {
            return;
        }
        this.child = null;
    }

    final void showDialog(boolean dequeGuard, UiWidget widget) {
        FadingDialog dialog = null;
        try {
            if (!(widget instanceof FadingDialog)) {
                throw new IllegalArgumentException();
            }
            dialog = (FadingDialog) ((Object) widget);
            this.dialogs.addFirst(dialog, dequeGuard);
            dialog.dialogVisible = true;
            dialog.requestKeyboardFocus((byte) -37, (UiWidget) (this));
        } catch (RuntimeException dialogInsertionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogInsertionFailure), "ng.N(" + dequeGuard + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (null != this.renderer) {
            this.renderer.drawWidget(parentX, -70, parentY, true, (UiWidget) (this));
        }
        int guardResidue = 75 / ((1 - methodGuard) / 43);
        DequeCursor dialogCursor = new DequeCursor(this.dialogs);
        UiWidget dialogWidget = (UiWidget) ((Object) dialogCursor.beginReverse(1));
        while (dialogWidget != null) {
            dialogWidget.renderWidget(parentX + this.widgetX, parentY + this.widgetY, (byte) -106, renderPass);
            dialogWidget = (UiWidget) ((Object) dialogCursor.nextReverse(26));
        }
    }

    final static void initializeReflectionCheckQueue(int methodGuard) {
        if (methodGuard != -13912) {
            return;
        }
        UsernameAvailabilityQuery.reflectionCheckRequests = new IntrusiveDeque();
    }

    final static void serviceGameAudioOutputs(int methodGuard) {
        CacheReference.gameMusicOutput.serviceOutput();
        ClientScreenExitSupport.gameSoundOutput.serviceOutput();
        if (methodGuard <= 9) {
            rotatedEntityScreenX = -2;
        }
    }

    final void settleDialogAnimations(int methodGuard) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        DequeCursor dialogCursor = new DequeCursor(this.dialogs);
        if (methodGuard != 0) {
            return;
        }
        FadingDialog dialog = (FadingDialog) ((Object) dialogCursor.beginForward((byte) 88));
        while (dialog != null) {
            if (dialog.settleDialogAnimation(229)) {
                dialog.unlinkNode(false);
            }
            dialog = (FadingDialog) ((Object) dialogCursor.nextForward((byte) 112));
        }
    }

    public DialogLayer() {
        super(0, 0, UsernameResponseSupport.accountUiViewportWidth, MessageDialogSupport.accountUiViewportHeight, (WidgetRenderer) null, (WidgetListener) null);
        this.dialogs = new IntrusiveDeque();
    }

    final UiWidget findFocusTarget(int methodGuard) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        DequeCursor dialogCursor = new DequeCursor(this.dialogs);
        FadingDialog dialog = (FadingDialog) ((Object) dialogCursor.beginForward((byte) 88));
        while (dialog != null) {
            if (!(!dialog.dialogVisible)) {
                return dialog.findFocusTarget((byte) -79);
            }
            dialog = (FadingDialog) ((Object) dialogCursor.nextForward((byte) 119));
        }
        if (methodGuard == -4863) {
            return null;
        }
        rotatedEntityScreenX = 111;
        return null;
    }

    final void advanceDialogAnimations(int methodGuard) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        DequeCursor dialogCursor = new DequeCursor(this.dialogs);
        FadingDialog dialog = (FadingDialog) ((Object) dialogCursor.beginForward((byte) 88));
        while (dialog != null) {
            if (dialog.advanceDialogAnimation(-1)) {
                dialog.unlinkNode(false);
            }
            dialog = (FadingDialog) ((Object) dialogCursor.nextForward((byte) 115));
        }
        this.child = (UiWidget) ((Object) this.getTopVisibleDialog(100));
        if (methodGuard >= -14) {
            sharedUiFont = (BitmapFont) null;
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        sharedUiFont = null;
        decodedSpriteHasNonOpaqueAlpha = null;
        if (methodGuard >= -53) {
            decodedSpriteHasNonOpaqueAlpha = (boolean[]) null;
        }
    }

    final FadingDialog getTopVisibleDialog(int methodGuard) {
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        DequeCursor dialogCursor = new DequeCursor(this.dialogs);
        FadingDialog dialog = (FadingDialog) ((Object) dialogCursor.beginForward((byte) 88));
        while (dialog != null) {
            if (dialog.dialogVisible) {
                return dialog;
            }
            dialog = (FadingDialog) ((Object) dialogCursor.nextForward((byte) 111));
        }
        if (methodGuard >= 57) {
            return null;
        }
        this.findFocusTarget(89);
        return null;
    }

    static {
    }
}
