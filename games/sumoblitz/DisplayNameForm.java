/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends WidgetContainer implements NameSuggestionListener, WidgetActionListener {
    private ValidatedTextInputWidget nameInput;
    private InteractiveWidget backButton;
    NameSuggestionsPanel nameSuggestions;
    static String areYouSureYouText;
    private InteractiveWidget submitButton;

    private final boolean canSubmit(byte guard) {
        if (guard != 91) {
          return false;
        }
        if (this.isFieldValid((ValidationProvider) (this.nameInput), (byte) -116)) {
          return true;
        }
        return false;
    }

    private final boolean isFieldValid(ValidationProvider provider, byte guard) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationStatus var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = provider.getValidator(-120);
          if (var3 == null) {
            return true;
          }
          var5 = 12 / ((-67 - guard) / 45);
          var4 = var3.getStatus(35);
          stackIn_7_0 = (qe.VALID == var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vq.F(");
          if (provider == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void submitDisplayName(boolean guard) {
        if (!this.canSubmit((byte) 91)) {
          return;
        }
        if (!guard) {
          return;
        }
        DropDownWidget.a(this.nameInput.text, (byte) -47);
    }

    final static void uploadTextureMipmaps(int target, int guard, byte[] pixels, int width, int internalFormat, int height, int format) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (width > 0 &&
            !rm.a(width, -111)) {
            throw new IllegalArgumentException("");
          }
          if (height > 0 &&
            !rm.a(height, guard - 23259)) {
            throw new IllegalArgumentException("");
          }
          var7_int = pc.a(format, (byte) -83);
          var8 = 0;
          stackIn_11_0 = (width >= height) ? height : width;
          var9 = stackIn_11_0;
          if (guard != 23143) {
            areYouSureYouText = (String) null;
          }
          var10 = width >> 1;
          var11 = height >> 1;
          var12 = pixels;
          var13 = new byte[var7_int * (var11 * var10)];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(target, var8, internalFormat, width, height, 0, format, 5121, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = width * var7_int;
            for (var17 = 0; var7_int > var17; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var19 + var16;
              for (var21 = 0; var11 > var21; var21++) {
                for (var22 = 0; var10 > var22; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var13[var18] = (byte)(var15 >> 2);
                  var20 = var20 + var7_int;
                  var18 = var18 + var7_int;
                }
                var19 = var19 + var16;
                var20 = var20 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            width = var10;
            var12 = var14;
            height = var11;
            var8++;
            var10 = var10 >> 1;
            var11 = var11 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("vq.D(").append(target).append(',').append(guard).append(',');
          if (pixels == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(width).append(',').append(internalFormat).append(',').append(height).append(',').append(format).append(')').toString());
        }
    }

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.nameInput = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
        TextWidgetRenderer var1 = new TextWidgetRenderer(jm.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.ascent, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(MouseInputRegistration.youNeedToChooseText, var1, (WidgetListener) null);
        this.submitButton = new InteractiveWidget(tf.field_a, (WidgetListener) null);
        this.backButton = new InteractiveWidget(IntrusiveNodeHashTable.field_h, (WidgetListener) null);
        this.nameInput.tooltip = ShaderEffect.enterTheNameYouText;
        this.nameInput.setValidator((byte) 127, new ScreenNameValidator(this.nameInput));
        this.submitButton.enabled = false;
        this.submitButton.renderer = (WidgetRenderer) ((Object) new SpriteStripButtonRenderer());
        this.backButton.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
        this.nameInput.renderer = (WidgetRenderer) ((Object) new BeveledTextInputRenderer(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.setBounds(92, 20, var3, 50, 270);
        int var5 = 200;
        this.addChild(var2, 81);
        var3 += 50;
        var3 = var3 + (5 + this.addDefaultValidatedField(var3, 7541, 170, this.nameInput, QuickChatPhrase.playerNamesCanBeText, un.playerNameText));
        this.submitButton.setBounds(126, 496 - var5 >> 1, var3, 40, var5);
        this.backButton.setBounds(-57, 3 + var4, var3 + 15, 40, 60);
        this.backButton.listener = (WidgetListener) (this);
        this.submitButton.listener = (WidgetListener) (this);
        this.addChild(this.submitButton, 123);
        this.addChild(this.backButton, 103);
        this.nameSuggestions = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.nameSuggestions.setBounds(-64, 60 + this.nameInput.x + this.nameInput.width, 20, 150, -this.nameInput.width + (-this.nameInput.x + this.width - 60));
        this.addChild(this.nameSuggestions, 65);
        this.setBounds(116, 0, 0, 55 + (var3 + var4), 496);
    }

    private final int addValidatedField(byte guard, UiWidget field, int y, int fieldWidth, String label, String help, int helpHeight) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        int var10 = 0;
        LabeledWidget var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new LabeledWidget(20, y, 120 + fieldWidth, 25, field, false, 120, 3, kw.field_b, 16777215, label);
          this.addChild(var11, 66);
          var9 = new ValidationMessageWidget(((ValidationProvider) ((Object) field)).getValidator(85), help, 126, var11.height + y, fieldWidth + 25, helpHeight);
          var10 = -54 % ((-13 - guard) / 61);
          var9.listener = (WidgetListener) (this);
          this.addChild(var9, 92);
          stackIn_1_0 = var9.height + var11.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("vq.E(").append(guard).append(',');
          if (field == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(y).append(',').append(fieldWidth).append(',');
          if (label == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (help == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(helpHeight).append(')').toString());
        }
    }

    public final void invalidateNameAvailability(byte guard) {
        int var2 = -18 / ((guard - 55) / 40);
        ((ScreenNameValidator) (this.nameInput.getValidator(24))).invalidateAvailability(-1);
    }

    public final void setSuggestedName(String name, int guard) {
        ValidatedTextInputWidget var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.nameInput;
          var4 = name;
          ((TextInputWidget) ((Object) var3)).setText(false, var4, (byte) 13);
          if (guard == 0) {
            return;
          }
          this.backButton = (InteractiveWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("vq.L(");
          if (name == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard >= 105) {
          areYouSureYouText = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        DisplayNameForm.uploadTextureMipmaps(71, -40, (byte[]) null, -64, 111, 108, -111);
        areYouSureYouText = null;
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onKey(root, character, (byte) 98, keyCode)) {
            return true;
          }
          if (guard <= 9) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_10_0 = this.focusPrevious((byte) 121, root);
            return stackIn_10_0;
          }
          if (99 != keyCode) {
            return false;
          }
          stackIn_13_0 = this.focusNext(root, false);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("vq.KA(");
          if (root == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final int addDefaultValidatedField(int y, int guard, int fieldWidth, UiWidget field, String help, String label) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 7541) {
            areYouSureYouText = (String) null;
          }
          stackIn_3_0 = this.addValidatedField((byte) 107, field, y, fieldWidth, label, help, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("vq.I(").append(y).append(',').append(guard).append(',').append(fieldWidth).append(',');
          if (field == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (help == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (label == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          int var5_int = -111 / ((-25 - guard) / 45);
          super.update(parentX, -86, root, parentY);
          this.submitButton.enabled = this.canSubmit((byte) 91);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "vq.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (source == this.backButton) {
            SpriteState.e(0);
          } else {
            if (this.submitButton == source) {
              this.submitDisplayName(true);
            }
          }
          if (guard == 710) {
            return;
          }
          this.submitButton = (InteractiveWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("vq.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    static {
        areYouSureYouText = "Are you sure you want to reset your stats?";
    }
}
