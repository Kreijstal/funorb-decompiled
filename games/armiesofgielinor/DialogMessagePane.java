/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogMessagePane extends DequeWidgetContainer implements WidgetActivationListener {
    private ProgressMessageDialog dialog;
    private BitmapFont font;
    static ValidationState validationWaiting;
    private String message;
    private int actionCount;
    private int[] actionIds;
    private InteractiveWidget[] actionButtons;
    static String field_I;

    final InteractiveWidget addListenerButton(String text, WidgetListener listener, byte obfuscationGuard) {
        InteractiveWidget button = null;
        RuntimeException failure = null;
        int buttonY = 0;
        int guardQuotient = 0;
        InteractiveWidget buttonResult = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          button = new InteractiveWidget(text, listener);
          button.painter = (WidgetPainter) ((Object) new SpriteButtonPainter());
          buttonY = this.height - 2;
          guardQuotient = -98 / ((24 - obfuscationGuard) / 44);
          this.setBounds(0, this.width, 0, 8192, this.height + 34);
          button.setBounds(7, this.width - 14, buttonY, 8192, 30);
          this.addChild((byte) 10, (Widget) (button));
          buttonResult = button;
          return buttonResult;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_4_0 = failure;
          stackIn_4_1 = new StringBuilder().append("ad.D(");
          if (text == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (listener == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void growActions(int count, int obfuscationGuard) {
        int actionIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.actionCount >= count) {
          return;
        }
        int guardRemainder = -57 % ((44 - obfuscationGuard) / 34);
        InteractiveWidget[] newButtons = new InteractiveWidget[count];
        InteractiveWidget[] buttonArrayAlias = newButtons;
        int[] newActionIds = new int[count];
        for (actionIndex = 0; actionIndex < this.actionCount; actionIndex++) {
          newButtons[actionIndex] = this.actionButtons[actionIndex];
          newActionIds[actionIndex] = this.actionIds[actionIndex];
        }
        this.actionButtons = buttonArrayAlias;
        this.actionCount = count;
        this.actionIds = newActionIds;
    }

    public static void a(byte param0) {
        validationWaiting = null;
        if (param0 != 63) {
          field_I = (String) null;
        }
        field_I = null;
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var6_int = 0; this.actionCount > var6_int; var6_int++) {
            if (this.actionButtons[var6_int] == widget) {
              var7 = this.actionIds[var6_int];
              if (var7 != -1) {
                gl.a(123, this.actionIds[var6_int]);
                break;
              }
              this.dialog.closeDialog(true);
              break;
            }
          }
          if (obfuscationGuard != 11) {
            this.actionIds = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ad.N(" + pointerX + ',' + obfuscationGuard + ',' + button + ',' + pointerY + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    DialogMessagePane(ProgressMessageDialog dialog, BitmapFont font, String message) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int messageHeight = 0;
        this.actionCount = 0;
        try {
          this.message = message;
          this.dialog = dialog;
          this.font = font;
          messageHeight = this.message != null ? this.font.getParagraphHeight(this.message, 260, this.font.maxAscent) : 0;
          this.setBounds(0, 288, 0, 8192, 22 + messageHeight);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ad.<init>(" + (dialog != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + (message != null ? "{...}" : "null") + ')');
        }
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        super.drawWidget(originX, originY, (byte) -123, renderLayer);
        this.font.drawParagraph(this.message, 14 + originX + this.x, this.y + originY + 10, -28 + this.width, this.height, 16777215, -1, 0, 0, this.font.maxAscent);
        if (obfuscationGuard > -82) {
          DialogMessagePane.a((byte) 73);
        }
    }

    final static void advanceLobbyNotifications(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        LobbyPlayer var1 = null;
        LobbyRoom var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        LobbyPlayer var1Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.first((byte) 97));
          while (var1 != null) {
            if (0 < var1.notificationTicks) {
              var1.notificationTicks = var1.notificationTicks - 1;
              if (var1.notificationTicks == 0) {
                var1.notificationCode = 0;
                if (var1.isRemovedFromIndex(0)) {
                  var1.unlink(-126);
                }
              }
            }
            var1 = (LobbyPlayer) (SummonAction.lobbyPlayerOrder.next((byte) 123));
          }
          var1_ref = (LobbyRoom) (qc.lobbyRoomOrder.first((byte) 89));
          while (var1_ref != null) {
            if (0 < var1_ref.notificationTicks) {
              var1_ref.notificationTicks = var1_ref.notificationTicks - 1;
              if (var1_ref.notificationTicks == 0) {
                var1_ref.notificationCode = 0;
                if (var1_ref.isRemovedFromIndex(-7)) {
                  var1_ref.unlink(106);
                }
              }
            }
            var1_ref = (LobbyRoom) (qc.lobbyRoomOrder.next((byte) 123));
          }
          var2 = -62 % ((obfuscationGuard + 41) / 60);
          var1Lifetime1 = (LobbyPlayer) (ModalDialog.currentRoomPlayers.first((byte) 115));
          while (var1Lifetime1 != null) {
            if (0 < var1Lifetime1.notificationTicks) {
              var1Lifetime1.notificationTicks = var1Lifetime1.notificationTicks - 1;
              if (var1Lifetime1.notificationTicks != 0) {
                var1Lifetime1 = (LobbyPlayer) (ModalDialog.currentRoomPlayers.next((byte) 123));
                continue;
              }
              var1Lifetime1.notificationCode = 0;
              if (var1Lifetime1.isRemovedFromIndex(0)) {
                var1Lifetime1.unlink(-123);
              }
            }
            var1Lifetime1 = (LobbyPlayer) (ModalDialog.currentRoomPlayers.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1_ref2), "ad.E(" + obfuscationGuard + ')');
        }
    }

    final void addActionButton(String text, int actionId, int increment) {
        int actionIndex = 0;
        try {
          actionIndex = this.actionCount;
          this.growActions(actionIndex + increment, -104);
          this.actionButtons[actionIndex] = this.addListenerButton(text, (WidgetListener) (this), (byte) 104);
          this.actionIds[actionIndex] = actionId;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ad.B(" + (text != null ? "{...}" : "null") + ',' + actionId + ',' + increment + ')');
        }
    }

    static {
        validationWaiting = new ValidationState();
    }
}
