/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GuestPlayConfirmationForm extends DequeWidgetContainer implements WidgetActivationListener {
    static RgbSprite[] field_F;
    static int[] field_I;
    static String field_P;
    static String field_H;
    static int field_J;
    private InteractiveWidget backButton;
    static int field_N;
    private InteractiveWidget guestPlayButton;
    static ResourceArchive field_M;
    static int field_Q;
    static QuickChatPhraseRepository quickChatPhrases;
    static int[] turnDurationTicks;
    private InteractiveWidget registerButton;

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException failure = null;
        boolean previousFocused = false;
        boolean nextFocused = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return true;
          }
          if (keyCode == 98) {
            previousFocused = this.focusPreviousChild(false, rootWidget);
            return previousFocused;
          }
          if (keyCode != 99) {
            return false;
          }
          nextFocused = this.focusNextChild((byte) -126, rootWidget);
          return nextFocused;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ce.F(");
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int[] a(int param0) {
        if (param0 > -26) {
          return (int[]) null;
        }
        return new int[8];
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int widgetX = originX + this.x;
        int widgetY = this.y + originY;
        if (obfuscationGuard < -82) {
          ArmiesOfGielinor.field_J.drawParagraph(aq.field_a, 20 + widgetX, widgetY + 20, -40 + this.width, -50 + this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
          super.drawWidget(originX, originY, (byte) -107, renderLayer);
          return;
        }
        field_F = (RgbSprite[]) null;
        ArmiesOfGielinor.field_J.drawParagraph(aq.field_a, 20 + widgetX, widgetY + 20, -40 + this.width, -50 + this.height, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.maxAscent);
        super.drawWidget(originX, originY, (byte) -107, renderLayer);
    }

    public static void k(int param0) {
        field_P = null;
        field_I = null;
        field_M = null;
        if (param0 == 12000) {
          field_H = null;
          quickChatPhrases = null;
          field_F = null;
          turnDurationTicks = null;
          return;
        }
        field_Q = -81;
        field_H = null;
        quickChatPhrases = null;
        field_F = null;
        turnDurationTicks = null;
    }

    public GuestPlayConfirmationForm() {
        super(0, 0, 476, 225, (WidgetPainter) null);
        this.registerButton = new InteractiveWidget(li.field_p, (WidgetListener) null);
        this.backButton = new InteractiveWidget(ContentTransitionDialog.field_Y, (WidgetListener) null);
        this.guestPlayButton = new InteractiveWidget(pi.field_O, (WidgetListener) null);
        SpriteButtonPainter buttonPainter = new SpriteButtonPainter();
        this.registerButton.painter = (WidgetPainter) ((Object) buttonPainter);
        this.backButton.painter = (WidgetPainter) ((Object) buttonPainter);
        this.guestPlayButton.painter = (WidgetPainter) ((Object) buttonPainter);
        int buttonGap = 4;
        int buttonGroupWidth = 326;
        int halfButtonWidth = -buttonGap + buttonGroupWidth >> 1;
        this.backButton.setBounds(this.width - buttonGroupWidth >> 1, halfButtonWidth, this.height - 48 - buttonGap, 8192, 30);
        this.guestPlayButton.setBounds((-buttonGroupWidth + this.width >> 1) + halfButtonWidth + buttonGap, halfButtonWidth, -buttonGap + this.height - 48, 8192, 30);
        this.registerButton.setBounds(-buttonGroupWidth + this.width >> 1, buttonGroupWidth, -(2 * buttonGap) + this.height - 78, 8192, 30);
        this.backButton.listener = (WidgetListener) (this);
        this.registerButton.listener = (WidgetListener) (this);
        this.guestPlayButton.listener = (WidgetListener) (this);
        this.registerButton.tooltipText = hb.field_b;
        this.guestPlayButton.tooltipText = CombatSandbox.field_e;
        this.addChild((byte) 10, (Widget) (this.backButton));
        this.addChild((byte) 10, (Widget) (this.registerButton));
        this.addChild((byte) 10, (Widget) (this.guestPlayButton));
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int obfuscationControl = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        InteractiveWidget guardWidget = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.backButton == widget) {
            MapRepository.showEmptyLogin((byte) 126);
          } else {
            if (this.registerButton != widget) {
              if (this.guestPlayButton == widget) {
                MatchingTextValidator.c((byte) -127);
              }
            } else {
              ConsoleTextNode.showAccountRegistration(false);
            }
          }
          if (obfuscationGuard == 11) {
            return;
          }
          guardWidget = (InteractiveWidget) null;
          this.widgetActivated(47, 86, -42, 41, (InteractiveWidget) null);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ce.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    static {
        field_P = "(Exit)";
        field_Q = 640;
        field_H = "Your turn";
        field_I = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_J = 10;
        turnDurationTicks = new int[]{12000, 9000, 7500, 6000, 4500, 3000, 1500};
    }
}
