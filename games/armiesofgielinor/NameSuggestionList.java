/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionList extends DequeWidgetContainer implements WidgetActivationListener {
    private String[] names;
    static String field_J;
    private InteractiveWidget[] buttons;
    private NameSuggestionListener listener;
    static String field_I;
    static int field_F;

    final void setSuggestions(int obfuscationGuard, String[] suggestions) {
        int nameIndex = 0;
        int buttonIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String suggestionDescription = null;
        RuntimeException caughtFailure = null;
        int nameCount = 0;
        RuntimeException failure = null;
        LinkButtonPainter buttonPainter = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.children.clear(obfuscationGuard - 11);
          if (suggestions != null &&
            suggestions.length != 0) {
            nameCount = suggestions.length;
            this.names = new String[nameCount];
            for (nameIndex = 0; nameIndex < nameCount; nameIndex++) {
              this.names[nameIndex] = ug.a(GrowthEvent.bitwiseXor(obfuscationGuard, 116), (CharSequence) ((Object) suggestions[nameIndex])).replace(' ', ' ');
            }
            buttonPainter = new LinkButtonPainter(ArmiesOfGielinor.field_J, 0, 1);
            this.buttons = new InteractiveWidget[nameCount + 1];
            for (buttonIndex = 0; buttonIndex < nameCount; buttonIndex++) {
              this.buttons[buttonIndex] = new InteractiveWidget(this.names[buttonIndex], (WidgetListener) (this));
              this.buttons[buttonIndex].painter = (WidgetPainter) ((Object) buttonPainter);
              this.buttons[buttonIndex].tooltipText = ModalDialog.field_J;
              this.buttons[buttonIndex].setBounds(0, 80, 20 + 16 * buttonIndex, 8192, 15);
              this.addChild((byte) 10, (Widget) (this.buttons[buttonIndex]));
            }
            this.buttons[nameCount] = new InteractiveWidget(h.field_h, (WidgetListener) (this));
            this.buttons[nameCount].painter = (WidgetPainter) ((Object) buttonPainter);
            this.buttons[nameCount].setBounds(0, obfuscationGuard, nameCount * 16 + 16 + 20, obfuscationGuard ^ 8292, 15);
            this.addChild((byte) 10, (Widget) (this.buttons[nameCount]));
            return;
          }
          this.names = null;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("kv.A(").append(obfuscationGuard).append(',');
          if (suggestions == null) {
            suggestionDescription = "null";
          } else {
            suggestionDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(suggestionDescription).append(')').toString());
        }
    }

    final static void a(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[0] = 1;
        var2[2] = 16777215;
        var2[1] = 14737632;
        VerticalScrollbar.field_Rb = new CombatSandbox(ChannelBaseVolumeConsoleCommand.field_J, IsaacRandom.field_k, rs.field_n, var2, 0, 0);
        if (param0 != -28541) {
          field_F = 18;
        }
        le.field_b = new cg();
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.b(0.75f);
    }

    final static fl k(int param0) {
        if (param0 != 5) {
          field_J = (String) null;
        }
        if (iv.field_b == null) {
          iv.field_b = new fl();
          iv.field_b.a(13421772, ArmiesOfGielinor.field_J);
          iv.field_b.field_s = 7697781;
          iv.field_b.field_o = 14;
          iv.field_b.field_h = 0;
          iv.field_b.field_c = 2763306;
          iv.field_b.field_m = gl.field_e;
          iv.field_b.field_d = 4;
          iv.field_b.field_x = 6;
          iv.field_b.field_r = 5;
        }
        return iv.field_b;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        super.drawWidget(originX, originY, (byte) -95, renderLayer);
        if (0 != renderLayer) {
          return;
        }
        BitmapFont var5 = ArmiesOfGielinor.field_J;
        if (obfuscationGuard > -82) {
          NameSuggestionList.b(true);
        }
        if (this.names != null) {
          var5.drawParagraph(we.field_i, originX + this.x, originY + this.y, this.width, 20, 16777215, -1, 0, 0, var5.maxDescent + var5.maxAscent);
        }
    }

    final static boolean canAppendAccountNameCharacter(boolean obfuscationGuard, CharSequence text, char character) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ph.isAccountNameCharacter(-19, character)) {
            return false;
          }
          if (text == null) {
            return false;
          }
          var3_int = text.length();
          if (obfuscationGuard) {
            field_F = 103;
          }
          if (var3_int >= 12) {
            return false;
          }
          if (!rs.isAccountNameSeparator(character, (byte) -87)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kv.D(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(character).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -12215) {
            return false;
          }
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard ^ 0)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_8_0 = this.focusPreviousChild(false, rootWidget);
            return stackIn_8_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_12_0 = this.focusNextChild((byte) -125, rootWidget);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("kv.F(");
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    NameSuggestionList(NameSuggestionListener listener) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.listener = listener;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kv.<init>(" + (listener != null ? "{...}" : "null") + ')');
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        int nameIndex = 0;
        int obfuscationControl = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 11) {
            NameSuggestionList.canAppendAccountNameCharacter(false, (CharSequence) null, 'ﾪ');
          }
          for (nameIndex = 0; this.names.length > nameIndex; nameIndex++) {
            if (widget == this.buttons[nameIndex]) {
              this.listener.nameSelected(-1, this.names[nameIndex]);
            }
          }
          if (this.buttons[this.names.length] == widget) {
            this.listener.refreshNamesRequested((byte) -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_15_0 = failure;
          stackIn_15_1 = new StringBuilder().append("kv.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
          return;
        }
        field_J = null;
    }

    static {
        field_J = "No special action";
        field_I = "You cannot use this equipment until turn <%0>.";
    }
}
