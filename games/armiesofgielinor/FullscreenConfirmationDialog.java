/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenConfirmationDialog extends ResizableModalDialog implements WidgetActivationListener {
    static String[] field_W;
    private Widget countdownLabel;
    private InteractiveWidget cancelButton;
    private InteractiveWidget acceptButton;
    static ModelMeshBase[] field_db;
    private long startedAtMillis;
    static int field_Y;
    static String field_X;
    static java.awt.Frame field_bb;
    static java.math.BigInteger field_cb;
    static String field_eb;

    FullscreenConfirmationDialog(ModalDialogHost host) {
        super(host, 200, 200);
        Widget var3 = null;
        try {
          this.startedAtMillis = vi.monotonicMillis(-95);
          var3 = new Widget(ProgressMessageDialog.field_vb, (WidgetListener) null);
          var3.y = 50;
          var3.height = 100;
          var3.width = this.width;
          var3.x = 0;
          var3.painter = (WidgetPainter) ((Object) new BitmapTextWidgetPainter(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) 10, var3);
          this.countdownLabel = new Widget(ProgressMessageDialog.field_vb, (WidgetListener) null);
          this.countdownLabel.width = this.width;
          this.countdownLabel.x = 0;
          this.countdownLabel.y = 20 + (var3.y + var3.height);
          this.countdownLabel.height = 80;
          this.countdownLabel.painter = (WidgetPainter) ((Object) new BitmapTextWidgetPainter(CipherPacketBuffer.field_t, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild((byte) 10, this.countdownLabel);
          this.acceptButton = this.createConfirmationButton(DualNodeDeque.field_e, -63, (WidgetListener) (this));
          this.cancelButton = this.createConfirmationButton(WeightedScoreStrategy.field_m, -74, (WidgetListener) (this));
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "cs.<init>(" + (host != null ? "{...}" : "null") + ')');
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        RuntimeException var6 = null;
        InteractiveWidget var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (widget == this.acceptButton) {
            this.closeConfirmation(10);
          } else {
            if (widget == this.cancelButton) {
              ck.b(-65);
              this.closeConfirmation(10);
            }
          }
          if (obfuscationGuard == 11) {
            return;
          }
          var7 = (InteractiveWidget) null;
          this.widgetActivated(-91, -43, 76, 119, (InteractiveWidget) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("cs.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void closeConfirmation(int obfuscationGuard) {
        if (!this.open) {
          return;
        }
        if (obfuscationGuard != 10) {
          field_db = (ModelMeshBase[]) null;
          this.open = false;
          return;
        }
        this.open = false;
    }

    public static void b(boolean param0) {
        field_bb = null;
        if (param0) {
          field_db = null;
          field_X = null;
          field_W = null;
          field_eb = null;
          field_cb = null;
          return;
        }
        FullscreenConfirmationDialog.b(false);
        field_db = null;
        field_X = null;
        field_W = null;
        field_eb = null;
        field_cb = null;
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        long elapsedMillis = 0L;
        RuntimeException var5 = null;
        int remainingSeconds = 0;
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          if (BitmapTextWidgetPainter.pointerChangedSnapshot) {
            rootWidget.blur(obfuscationGuard - 32721);
          }
          elapsedMillis = vi.monotonicMillis(92) - this.startedAtMillis;
          remainingSeconds = (int)((10999L - elapsedMillis) / 1000L);
          if (0 >= remainingSeconds) {
            ck.b(-62);
            this.closeConfirmation(10);
            this.host.showDialog(new FullscreenStatusDialog(this.host, FullscreenMembershipDialog.field_cb), 0);
          } else {
            this.countdownLabel.text = "" + remainingSeconds;
          }
          if (this.open &&
            null == FixedQuaternion.fullscreenCanvas) {
            this.closeConfirmation(obfuscationGuard ^ 32728);
            this.host.showDialog(new FullscreenStatusDialog(this.host, SocialListPanel.field_Mb), 0);
          }
          if (null != FixedQuaternion.fullscreenCanvas &&
            FixedQuaternion.fullscreenCanvas.focusLost) {
            this.closeConfirmation(10);
            this.host.showDialog(new FullscreenStatusDialog(this.host, SocialListPanel.field_Mb), obfuscationGuard ^ 32722);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("cs.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        Widget var7 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = keyCode;
          if (99 == var5_int) {
            this.cancelButton.takeFocus(11, (Widget) (this));
            return true;
          }
          if (var5_int == 98) {
            this.acceptButton.takeFocus(11, (Widget) (this));
            return true;
          }
          if (obfuscationGuard != -12215) {
            var7 = (Widget) null;
            this.handleKey((Widget) null, 104, 'ﾑ', 60);
          }
          stackIn_12_0 = super.handleKey(rootWidget, keyCode, character, -12215);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("cs.F(");
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final InteractiveWidget createConfirmationButton(String text, int obfuscationGuard, WidgetListener listener) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        InteractiveWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(text, listener);
          var4.painter = (WidgetPainter) ((Object) new SpriteButtonPainter());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(15, -30 + this.width, var5, 8192, 30);
          this.addChild((byte) 10, (Widget) (var4));
          this.refreshLayout(0);
          var6 = 121 % ((1 - obfuscationGuard) / 62);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("cs.C(");
          if (text == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(obfuscationGuard).append(',');
          if (listener == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_W = new String[]{"proj_aviansie_axe/aviansie_axe", "proj_arrow/proj_arrow", "proj_cannonball/proj_cannonball", "proj_dart/proj_dart", "proj_grenwall_spikes/proj_grenwall_spikes", "proj_rock/proj_catapultloadimpact", "proj_spear/spear"};
        field_db = new ModelMeshBase[field_W.length];
        field_X = "This item can only be used on a goblin priest.";
        field_cb = new java.math.BigInteger("65537");
        field_eb = "Performance";
    }
}
