/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements TextHotspotListener, WidgetActionListener, NameSuggestionListener {
    private ValidatedTextInputWidget confirmPasswordInput;
    private InteractiveWidget createButton;
    private ValidatedTextInputWidget confirmEmailInput;
    private CheckboxWidget emailNewsCheckbox;
    private InteractiveWidget backButton;
    private ValidatedTextInputWidget ageInput;
    NameSuggestionsPanel nameSuggestions;
    private ValidatedTextInputWidget screenNameInput;
    private HotspotTextWidget policyLinks;
    static String field_J;
    private ValidatedTextInputWidget passwordInput;
    private ValidatedTextInputWidget emailInput;
    static QuickChatCommand field_G;

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.update(parentX, -91, root, parentY);
          var5_int = 70 % ((guard + 25) / 45);
          this.createButton.enabled = this.canSubmit(97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("js.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(parentY).append(')').toString());
        }
    }

    public final void invalidateNameAvailability(byte guard) {
        try {
          int var2_int = 110 / ((55 - guard) / 40);
          ((ScreenNameValidator) (this.screenNameInput.getValidator(109))).invalidateAvailability(-1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "js.H(" + guard + ')');
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard < 9) {
            this.nameSuggestions = (NameSuggestionsPanel) null;
          }
          if (super.onKey(root, character, (byte) 66, keyCode)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_10_0 = this.focusPrevious((byte) -58, root);
            return stackIn_10_0;
          }
          if (keyCode == 99) {
            stackIn_15_0 = this.focusNext(root, false);
            return stackIn_15_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("js.KA(");
          if (root == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    private final int addFieldWithStatus(int fieldWidth, String label, int y, UiWidget control, int guard) {
        LabeledWidget var6 = null;
        RuntimeException var6_ref = null;
        ValidationStatusWidget var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidget(20, y, fieldWidth + 120, 25, control, false, 120, 3, kw.field_b, 16777215, label);
          this.addChild(var6, 82);
          var7 = new ValidationStatusWidget(((ValidationProvider) ((Object) control)).getValidator(34));
          this.addChild(var7, 63);
          if (guard < 63) {
            stackIn_2_0 = -35;
            return stackIn_2_0;
          }
          var7.setBounds(-57, 3 + var6.x + var6.width, (var6.height - 15 >> 1) + var6.y, 15, 15);
          stackIn_4_0 = var6.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("js.N(").append(fieldWidth).append(',');
          if (label == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(y).append(',');
          if (control == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        boolean discarded$0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (guard != 710) {
            return;
          }
          if (source != this.backButton) {
            if (this.createButton != source) {
              return;
            }
            discarded$0 = this.submitAccount(513);
            if (!Sumoblitz.field_L) {
              return;
            }
          }
          LoginCredentialType.showAccountSignupPrompt(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("js.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    final static void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_63_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_52_0;
        IsaacPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        Object var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        SocialContact var5 = null;
        String var5_ref = null;
        String var6 = null;
        SocialContact var6_ref = null;
        String var7 = null;
        SocialContact var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1 = ig.field_a;
          var2 = var1.readUnsignedByte(-31302);
          if (var2 == 0) {
            if (GpuDataType.field_b == null) {
              GpuDataType.field_b = new SecondaryNodeHashTable(128);
              UsernameCredentials.field_e = 0;
            }
            stackIn_11_0 = (var1.readUnsignedByte(-31302) != 1) ? 0 : 1;
            var3_int = stackIn_11_0;
            var4_ref_String = var1.readCp1252String(-1);
            if (var3_int != 0) {
              var1.readCp1252String(-1);
            }
            var5 = QuickChatPhraseProvider.findIgnoredContact((byte) 123, var4_ref_String);
            var6 = var1.readCp1252String(-1);
            var7 = AccountCreationProgressDialog.normalizeAccountName(-1, (CharSequence) ((Object) var4_ref_String));
            if (var7 == null) {
              var7 = var4_ref_String;
            }
            if (null == var5) {
              var5 = QuickChatPhraseProvider.findIgnoredContact((byte) 122, var6);
              if (var5 != null) {
                GpuDataType.field_b.put((long)var7.hashCode(), -8156, var5);
              }
            }
            if (null == var5) {
              var5 = new SocialContact();
              GpuDataType.field_b.put((long)var7.hashCode(), -8156, var5);
              fieldTemp$0 = UsernameCredentials.field_e;
              UsernameCredentials.field_e = UsernameCredentials.field_e + 1;
              var5.insertionOrder = fieldTemp$0;
              SpriteState.field_t.addLast((IntrusiveNode) (var5), (byte) 39);
            }
            var5.displayName = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (wh.field_s == 1) {
                wh.field_s = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (wh.field_s == 2) {
                wh.field_s = 1;
              }
              return;
            }
            if (var2 != 4) {
              IntrusiveNode.reportClientError("F1: " + VictoryScreen.b((byte) 104), (Throwable) null, 0);
              kk.a((byte) -112);
              if (param0 <= 71) {
                field_G = (QuickChatCommand) null;
              }
              return;
            }
            wh.field_s = 1;
            var3 = var1.readCp1252String(-1);
            jm.field_d = ((String) (var3)).intern();
            var4 = var1.readUnsignedByte(-31302);
            FixedPointPerlinNoise3D.a((byte) 38, var4);
            return;
          }
          if (null == CheckboxWidget.field_G) {
            CheckboxWidget.field_G = new SecondaryNodeHashTable(128);
            SoftwareRenderTarget.field_h = 0;
          }
          var3Lifetime1 = var1.readCp1252String(-1);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.readCp1252String(-1);
          var5_ref = var1.readCp1252String(-1);
          var6_ref = VertexStreamLayout.findFriend(var4_ref_StringLifetime1, (byte) 15);
          if (null == var6_ref) {
            var6_ref = VertexStreamLayout.findFriend(var5_ref, (byte) 71);
            if (var6_ref != null) {
              CheckboxWidget.field_G.put((long)AccountCreationProgressDialog.normalizeAccountName(-1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), -8156, var6_ref);
            }
          }
          if (var6_ref == null) {
            var6_ref = new SocialContact();
            CheckboxWidget.field_G.put((long)AccountCreationProgressDialog.normalizeAccountName(-1, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), -8156, var6_ref);
            fieldTemp$1 = SoftwareRenderTarget.field_h;
            SoftwareRenderTarget.field_h = SoftwareRenderTarget.field_h + 1;
            var6_ref.insertionOrder = fieldTemp$1;
            pc.field_d.addLast((IntrusiveNode) (var6_ref), (byte) 39);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.displayName = var4_ref_StringLifetime1;
          var6_ref.worldName = (String) (var3Lifetime1);
          var6_ref.unlink(false);
          var7_ref = (SocialContact) (pc.field_d.first(-104));
          scanLoop1: while (true) {
            if (null != var7_ref) {
              stackOut_52_0 = GameKeyHandler.contactSortsAfter(var6_ref, 0, var7_ref);
              stackIn_63_0 = stackOut_52_0 ? 1 : 0;
              stackIn_53_0 = stackOut_52_0;
              if (var8 != 0) {
                break scanLoop1;
              }
              if (stackIn_53_0) {
                var7_ref = (SocialContact) (pc.field_d.next((byte) 18));
                continue;
              }
            }
            if (null == var7_ref) {
              pc.field_d.addLast((IntrusiveNode) (var6_ref), (byte) 39);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_63_0 = -2;
            break;
          }
          GraphicsToolkit.insertNodeBefore(stackIn_63_0, var7_ref, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "js.CA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int guard) {
        try {
          field_J = null;
          field_G = null;
          if (guard != 0) {
            AccountCreationForm.releaseStatics(1);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "js.O(" + guard + ')');
        }
    }

    private final boolean submitAccount(int guard) {
        boolean discarded$1 = false;
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_12_0 = false;
        Throwable decompiledCaughtException = null;
        try {
          if (!this.canSubmit(-34)) {
            return false;
          }
          var2_int = -1;
          try {
            var2_int = Integer.parseInt(this.ageInput.text);
            if (guard != 513) {
              discarded$1 = this.submitAccount(8);
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
          }
          stackIn_12_0 = NanoTickClock.startAccountCreation(this, this.screenNameInput.text, this.emailNewsCheckbox.selected, this.emailInput.text, this.passwordInput.text, var2_int, 0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "js.P(" + guard + ')');
        }
    }

    private final String linkStyleEnd(int guard) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 128) {
            stackIn_4_0 = "</col></u>";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "js.J(" + guard + ')');
        }
    }

    final static void h(int param0) {
        try {
          ContentDialog.l(param0 ^ 224);
          if (param0 != 0) {
            AccountCreationForm.f((byte) -20);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "js.E(" + param0 + ')');
        }
    }

    public final void onHotspotAction(int hotspotId, HotspotTextWidget source, int action, int guard) {
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (hotspotId != 0) {
            if (hotspotId != 1) {
              if (hotspotId == 2) {
                LegacyOpenGlVertexBuffer.requestPolicyPage((byte) 93, "conduct.ws");
                if (var6 != 0) {
                  LegacyOpenGlVertexBuffer.requestPolicyPage((byte) 99, "privacy.ws");
                  LegacyOpenGlVertexBuffer.requestPolicyPage((byte) 122, "terms.ws");
                }
              }
            } else {
              LegacyOpenGlVertexBuffer.requestPolicyPage((byte) 99, "privacy.ws");
              if (var6 != 0) {
                LegacyOpenGlVertexBuffer.requestPolicyPage((byte) 122, "terms.ws");
              }
            }
          } else {
            LegacyOpenGlVertexBuffer.requestPolicyPage((byte) 122, "terms.ws");
          }
          if (guard != -20036) {
            field_J = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("js.D(").append(hotspotId).append(',');
          if (source == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(action).append(',').append(guard).append(')').toString());
        }
    }

    private final int addFieldWithMessage(int y, int fieldWidth, byte guard, int messageHeight, String helpText, UiWidget control, String label) {
        LabeledWidget var8 = null;
        RuntimeException var8_ref = null;
        ValidationMessageWidget var9 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledWidget(20, y, fieldWidth + 120, 25, control, false, 120, 3, kw.field_b, 16777215, label);
          this.addChild(var8, 122);
          var9 = new ValidationMessageWidget(((ValidationProvider) ((Object) control)).getValidator(-128), helpText, 126, y + var8.height, fieldWidth + 50, messageHeight);
          var9.listener = (WidgetListener) (this);
          this.addChild(var9, 109);
          if (guard < 31) {
            field_J = (String) null;
          }
          stackIn_4_0 = var9.height + var8.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_8_0 = var8_ref;
          stackIn_8_1 = new StringBuilder().append("js.G(").append(y).append(',').append(fieldWidth).append(',').append(guard).append(',').append(messageHeight).append(',');
          if (helpText == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (control == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (label == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean isFieldAcceptable(int guard, ValidationProvider field) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationStatus var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = field.getValidator(guard ^ -23003);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getStatus(93);
          if (AccountConnectionPhase.INVALID == var4) {
            return false;
          }
          if (GameInstructions.DEBOUNCING == var4) {
            return false;
          }
          if (guard != 22955) {
            return true;
          }
          if (LegacyOpenGlGraphicsHeap.EMPTY == var4) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("js.W(").append(guard).append(',');
          if (field == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final void setSuggestedName(String name, int guard) {
        RuntimeException runtimeException = null;
        ValidatedTextInputWidget var3 = null;
        String var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.screenNameInput;
          var4 = name;
          ((TextInputWidget) ((Object) var3)).setText(false, var4, (byte) 124);
          if (guard != 0) {
            field_G = (QuickChatCommand) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("js.L(");
          if (name == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int addLabeledField(String label, int fieldWidth, int y, int guard, UiWidget control) {
        LabeledWidget var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidget(20, y, 120 + fieldWidth, 25, control, false, 120, 3, kw.field_b, 16777215, label);
          this.addChild(var6, 79);
          if (guard >= 32) {
            stackIn_4_0 = var6.height;
            return stackIn_4_0;
          }
          stackIn_2_0 = -85;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("js.F(");
          if (label == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(fieldWidth).append(',').append(y).append(',').append(guard).append(',');
          if (control == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        int var1_int = 0;
        BeveledTextInputRenderer dupTemp$0 = null;
        PasswordInputRenderer dupTemp$1 = null;
        String var2 = null;
        int var3 = 0;
        LabeledWidget var4 = null;
        TextWidgetRenderer var5 = null;
        int var6 = 0;
        int var7 = 0;
        try {
          this.screenNameInput = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
          this.emailInput = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
          this.confirmEmailInput = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
          this.passwordInput = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
          this.confirmPasswordInput = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
          this.ageInput = new ValidatedTextInputWidget("", (WidgetListener) null, 3);
          var1_int = 1;
          this.emailNewsCheckbox = new CheckboxWidget("", (WidgetListener) null, var1_int != 0);
          this.createButton = new InteractiveWidget(TurbulenceNoise3D.createText, (WidgetListener) null);
          this.backButton = new InteractiveWidget(AgeValidator.goBackText, (WidgetListener) null);
          this.screenNameInput.tooltip = ShaderEffect.enterTheNameYouText;
          this.emailInput.tooltip = pi.yourEmailAddressIsText;
          this.confirmEmailInput.tooltip = SoftwareTransform3D.typeYourEmailAddressText;
          this.passwordInput.tooltip = IsaacPacketBuffer.enterAPasswordForText;
          this.confirmPasswordInput.tooltip = InstrumentNoteMask.typeYourPasswordAgainText;
          this.ageInput.tooltip = ContentDialog.typeYourAgeInText;
          this.emailNewsCheckbox.tooltip = LegacyOpenGlShoreWaveWaterEffect.updatesWillSentToText;
          this.screenNameInput.setValidator((byte) -54, new ScreenNameValidator(this.screenNameInput));
          this.emailInput.setValidator((byte) 118, new EmailSyntaxValidator(this.emailInput));
          this.confirmEmailInput.setValidator((byte) -127, new ConfirmedEmailValidator(this.confirmEmailInput, this.emailInput));
          this.passwordInput.setValidator((byte) 127, new PasswordValidator(this.passwordInput, this.screenNameInput, this.emailInput));
          this.confirmPasswordInput.setValidator((byte) -17, new MatchingTextValidator(this.confirmPasswordInput, this.passwordInput));
          this.ageInput.setValidator((byte) 122, new AgeValidator(this.ageInput));
          this.createButton.enabled = false;
          this.createButton.renderer = (WidgetRenderer) ((Object) new SpriteStripButtonRenderer());
          this.backButton.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
          this.screenNameInput.renderer = (WidgetRenderer) ((Object) new BeveledTextInputRenderer(10000536));
          dupTemp$0 = new BeveledTextInputRenderer(10000536);
          this.confirmEmailInput.renderer = (WidgetRenderer) ((Object) dupTemp$0);
          this.emailInput.renderer = (WidgetRenderer) ((Object) dupTemp$0);
          this.ageInput.renderer = (WidgetRenderer) ((Object) new BeveledTextInputRenderer(10000536));
          this.emailNewsCheckbox.renderer = (WidgetRenderer) ((Object) new BeveledCheckboxRenderer());
          dupTemp$1 = new PasswordInputRenderer(10000536);
          this.confirmPasswordInput.renderer = (WidgetRenderer) ((Object) dupTemp$1);
          this.passwordInput.renderer = (WidgetRenderer) ((Object) dupTemp$1);
          var2 = ic.a(SocialContact.byClickingCreateYouText, new String[]{this.linkStyleStart((byte) 66), this.linkStyleEnd(128)}, (byte) -128);
          var3 = 20;
          var3 = var3 + this.addLabeledField(HardwareTurbulentWaterNoise.emailLoginText, 170, var3, 78, this.emailInput);
          var3 = var3 + (5 + this.addFieldWithMessage(var3, 170, (byte) 125, 20, "", this.confirmEmailInput, pq.confirmEmailText));
          var3 = var3 + this.addLabeledField(pi.passwordText, 170, var3, 55, this.passwordInput);
          var3 = var3 + (5 + this.addValidatedField(LegacyOpenGlTexture.confirmPasswordText, 170, 15632, var3, qw.passwordsMustBeBetweenText, this.confirmPasswordInput));
          var3 = var3 + (this.addValidatedField(un.playerNameText, 170, 15632, var3, QuickChatPhrase.playerNamesCanBeText, this.screenNameInput) + 5);
          var3 = var3 + this.addFieldWithStatus(170, DropDownArrowRenderer.ageText, var3, this.ageInput, 64);
          var4 = new LabeledWidget(46, var3, -90 + this.width, 25, this.emailNewsCheckbox, true, -120 + this.width, 5, jm.field_a, 11579568, LegacyOpenGlEnvironmentWaterEffect.pleaseSendMeNewsText);
          this.addChild(var4, 100);
          var3 = var3 + var4.height;
          var5 = new TextWidgetRenderer(kw.field_b, 0, 0, 0, 0, 16777215, -1, 0, 0, kw.field_b.ascent, -1, 2147483647, true);
          this.policyLinks = new HotspotTextWidget(var2, var5);
          this.policyLinks.tooltip = "";
          this.policyLinks.setHotspotTooltip(-90, sb.openInPopupWindowText, 0);
          this.policyLinks.setHotspotTooltip(-61, sb.openInPopupWindowText, 1);
          this.policyLinks.listener = (WidgetListener) (this);
          this.policyLinks.setBoundsToTextHeight(var3, false, 46, this.width - 90);
          var3 = var3 + (15 + this.policyLinks.height);
          this.addChild(this.policyLinks, 111);
          var6 = 4;
          var7 = 200;
          this.createButton.setBounds(118, -var7 + 496 >> 1, var3, 40, var7);
          this.backButton.setBounds(-122, 3 + var6, 15 + var3, 40, 60);
          this.backButton.listener = (WidgetListener) (this);
          this.createButton.listener = (WidgetListener) (this);
          this.addChild(this.createButton, 109);
          this.addChild(this.backButton, 124);
          this.nameSuggestions = new NameSuggestionsPanel((NameSuggestionListener) (this));
          this.nameSuggestions.setBounds(93, 60 + this.screenNameInput.width + this.screenNameInput.x, this.screenNameInput.y + 20, 150, -this.screenNameInput.width - this.screenNameInput.x + (this.width - 60));
          this.addChild(this.nameSuggestions, 108);
          this.setBounds(-39, 0, 0, var6 + (var3 + 55), 496);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "js.<init>()");
        }
    }

    private final int addValidatedField(String label, int fieldWidth, int guard, int y, String helpText, UiWidget control) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 15632) {
            this.confirmPasswordInput = (ValidatedTextInputWidget) null;
          }
          stackIn_4_0 = this.addFieldWithMessage(y, fieldWidth, (byte) 57, 35, helpText, control, label);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("js.I(");
          if (label == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(fieldWidth).append(',').append(guard).append(',').append(y).append(',');
          if (helpText == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (control == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static LegacyOpenGlSpriteTexture a(int param0, int param1, int param2, boolean param3, LegacyOpenGlGraphicsToolkit param4, byte param5, int param6, int[] param7) {
        RuntimeException var8 = null;
        LegacyOpenGlSpriteTexture stackIn_2_0 = null;
        LegacyOpenGlSpriteTexture stackIn_11_0 = null;
        LegacyOpenGlSpriteTexture stackIn_14_0 = null;
        LegacyOpenGlSpriteTexture stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 >= -6) {
            stackIn_2_0 = (LegacyOpenGlSpriteTexture) null;
            return stackIn_2_0;
          }
          if (!param4.field_Cc && (!rm.a(param6, -116) ||
            !rm.a(param0, -126))) {
            if (param4.field_C) {
              stackIn_16_0 = new LegacyOpenGlSpriteTexture(param4, 34037, param6, param0, param3, param7, param2, param1);
              return stackIn_16_0;
            }
            stackIn_14_0 = new LegacyOpenGlSpriteTexture(param4, param6, param0, LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param6), LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param0), param7);
            return stackIn_14_0;
          }
          stackIn_11_0 = new LegacyOpenGlSpriteTexture(param4, 3553, param6, param0, param3, param7, param2, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_20_0 = var8;
          stackIn_20_1 = new StringBuilder().append("js.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final String linkStyleStart(byte guard) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard <= 2) {
            this.nameSuggestions = (NameSuggestionsPanel) null;
          }
          stackIn_4_0 = "<u=2164A2><col=2164A2>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "js.V(" + guard + ')');
        }
    }

    private final boolean canSubmit(int guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.isFieldAcceptable(22955, this.screenNameInput) &&
            this.isFieldAcceptable(22955, this.emailInput) &&
            this.isFieldAcceptable(22955, this.confirmEmailInput) &&
            this.isFieldAcceptable(22955, this.passwordInput) &&
            this.isFieldAcceptable(22955, this.confirmPasswordInput) &&
            this.isFieldAcceptable(22955, this.ageInput)) {
            var2_int = -125 % ((18 - guard) / 49);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "js.AA(" + guard + ')');
        }
    }

    static {
        field_G = new QuickChatCommand(13, 0, 1, 0);
    }
}
