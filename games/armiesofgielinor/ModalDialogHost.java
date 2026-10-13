/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static boolean field_H;
    static String field_L;
    static int field_J;
    static int field_K;
    private NodeDeque dialogs;
    static String field_N;
    static String[] field_O;
    static long decodedChatAccountId;
    static String field_P;

    public ModalDialogHost() {
        super(0, 0, SoundPlaybackHandle.dialogViewportWidth, DebugConsole.dialogViewportHeight, (WidgetPainter) null, (WidgetListener) null);
        this.dialogs = new NodeDeque();
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.painter != null) {
          this.painter.paintWidget((Widget) (this), originX, -80, true, originY);
        }
        NodeIterator iterator = new NodeIterator(this.dialogs);
        if (obfuscationGuard > -82) {
          decodedChatAccountId = -21L;
        }
        Widget dialog = (Widget) (iterator.last(50));
        while (dialog != null) {
          dialog.drawWidget(this.x + originX, this.y + originY, (byte) -121, renderLayer);
          dialog = (Widget) (iterator.previous((byte) -112));
        }
    }

    final ModalDialog getTopOpenDialog(byte obfuscationGuard) {
        NodeIterator iterator;
        ModalDialog dialog;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        iterator = new NodeIterator(this.dialogs);
        if (obfuscationGuard != 89) {
          field_N = (String) null;
        }
        dialog = (ModalDialog) (iterator.first(obfuscationGuard - 39));
        while (dialog != null) {
          if (dialog.open) {
            return dialog;
          }
          dialog = (ModalDialog) (iterator.next(50));
        }
        return null;
    }

    final void closeAllDialogs(int obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator iterator = new NodeIterator(this.dialogs);
        ModalDialog dialog = (ModalDialog) (iterator.first(50));
        while (dialog != null) {
          dialog.open = false;
          dialog = (ModalDialog) (iterator.next(50));
        }
        this.child = null;
        if (obfuscationGuard >= -85) {
          this.advanceDialogs((byte) 125);
        }
    }

    final void resizeViewport(int width, int height, byte obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (width == this.width &&
          this.height == height) {
          return;
        }
        int deltaX = (-this.width + width) / 2;
        int deltaY = (-this.height + height) / 2;
        NodeIterator iterator = new NodeIterator(this.dialogs);
        ModalDialog dialog = (ModalDialog) (iterator.first(50));
        if (obfuscationGuard != -14) {
          this.drawWidget(-19, 39, (byte) 87, 16);
        }
        while (dialog != null) {
          dialog.y = dialog.y + deltaY;
          dialog.x = dialog.x + deltaX;
          dialog = (ModalDialog) (iterator.next(50));
        }
        this.width = width;
        this.height = height;
    }

    final static void openPrivateTextChat(int obfuscationGuard, String recipientName, long accountId) {
        CharSequence var5 = null;
        try {
          rs.outgoingChatChannel = 2;
          RegistrationAgreementPane.chatRecipientName = recipientName;
          var5 = (CharSequence) ((Object) recipientName);
          wm.chatRecipientNameKey = AccountNameNormalizer.normalize(var5, false);
          hf.textChatActive = true;
          if (obfuscationGuard != -23503) {
            ModalDialogHost.openPrivateTextChat(120, (String) null, 75L);
          }
          dj.chatRecipientAccountId = accountId;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gk.H(" + obfuscationGuard + ',' + (recipientName != null ? "{...}" : "null") + ',' + accountId + ')');
        }
    }

    public static void l(int param0) {
        field_O = null;
        if (param0 < 14) {
          field_L = (String) null;
        }
        field_P = null;
        field_L = null;
        field_N = null;
    }

    final void advanceDialogs(byte obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator iterator = new NodeIterator(this.dialogs);
        ModalDialog dialog = (ModalDialog) (iterator.first(50));
        while (dialog != null) {
          if (dialog.advanceDialogAnimation((byte) -1)) {
            dialog.unlink(-116);
          }
          dialog = (ModalDialog) (iterator.next(50));
        }
        this.child = (Widget) ((Object) this.getTopOpenDialog((byte) 89));
        int guardQuotient = 94 / ((obfuscationGuard - 30) / 60);
    }

    final void snapAndPruneDialogs(int obfuscationGuard) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator iterator = new NodeIterator(this.dialogs);
        if (obfuscationGuard != 0) {
          this.dialogs = (NodeDeque) null;
        }
        ModalDialog dialog = (ModalDialog) (iterator.first(50));
        while (dialog != null) {
          if (dialog.snapDialogAnimation(122)) {
            dialog.unlink(obfuscationGuard + 37);
          }
          dialog = (ModalDialog) (iterator.next(obfuscationGuard ^ 50));
        }
    }

    final void showDialog(Widget dialog, int obfuscationGuard) {
        ModalDialog var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(dialog instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (dialog);
          this.dialogs.addFirst(750, var3);
          var3.open = true;
          var3.takeFocus(11, (Widget) (this));
          if (obfuscationGuard != 0) {
            this.dialogs = (NodeDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("gk.A(");
          if (dialog == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final Widget getFocusedChild(int obfuscationGuard) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        NodeIterator var2 = new NodeIterator(this.dialogs);
        ModalDialog var3 = (ModalDialog) (var2.first(50));
        while (var3 != null) {
          if (var3.open) {
            return var3.getFocusedChild((byte) 119);
          }
          var3 = (ModalDialog) (var2.next(obfuscationGuard + 1898));
        }
        if (obfuscationGuard == -1848) {
          return null;
        }
        decodedChatAccountId = -68L;
        return null;
    }

    static {
        field_N = "First tower";
        field_L = "<%0> and <%1>";
        field_O = new String[]{"zamorak", "saradomin", "guthix"};
        field_P = "Saradomin Strikes Highscores";
    }
}
