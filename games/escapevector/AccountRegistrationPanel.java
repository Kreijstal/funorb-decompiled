/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AccountRegistrationPanel extends UiContainer implements TextHotspotListener, ButtonListener, NameSuggestionListener {
    private ValidatedTextWidget field_R;
    static ObjectSpriteSet[] field_M;
    private Checkbox field_J;
    private TextHotspotWidget field_H;
    NameSuggestionsPanel field_G;
    static String field_O;
    private TextButton field_P;
    static QuickChatDynamicCommand field_L;
    private ValidatedTextWidget field_I;
    private TextButton field_K;
    private ValidatedTextWidget field_N;
    static Sprite field_T;
    private ValidatedTextWidget field_Q;
    private ValidatedTextWidget field_U;
    private ValidatedTextWidget field_S;

    private final int a(int param0, UiComponent param1, String param2, int param3, int param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          if (param4 != 100) {
            AccountRegistrationPanel.i((byte) -65);
          }
          LabeledField var6 = new LabeledField(20, param3, param0 + 120, 25, param1, false, 120, 3, Js5Transport.field_a, 16777215, param2);
          this.addChild(var6, false);
          int stackIn_3_0 = var6.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_10_2 = null;
        try {
          if (button == this.field_P) {
            AnimatedPathMarker.showAccountChoice(true);
          } else if (this.field_K == button) {
            boolean discarded$1 = this.h((byte) 123);
          }
          if (guard == 1) {
            return;
          }
          this.field_N = (ValidatedTextWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6;
          StringBuilder stackIn_9_1 = new StringBuilder().append("bf.K(");
          if (button == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    private final int a(int param0, String param1, int param2, UiComponent param3, String param4, int param5) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param0 != 170) {
            field_T = (Sprite) null;
          }
          int stackIn_3_0 = this.a(35, param3, param5, param1, param0 - 145, param4, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onNameSelected(byte guard, String name) {
        String stackIn_6_2 = null;
        try {
          ValidatedTextWidget var3 = this.field_S;
          String var4 = name;
          ((EditableTextWidget) ((Object) var3)).setText(var4, false, -33);
          if (guard < -49) {
            return;
          }
          this.field_U = (ValidatedTextWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var3_ref;
          StringBuilder stackIn_5_1 = new StringBuilder().append("bf.J(").append(guard).append(',');
          if (name == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void decodeTerrainQuadrants(int top, int bottom, DataInputStream input, int left, int right, int[] rows, int guard) throws IOException {
        int var7_int = right + left >> 1;
        int var8 = top + bottom >> 1;
        int var9 = input.readUnsignedByte();
        TerrainMaskSupport.decodeTerrainQuadrant(left, 3 & var9, var8, var7_int, input, rows, (byte) -74, top);
        var9 = var9 >>> 2;
        TerrainMaskSupport.decodeTerrainQuadrant(var7_int, var9 & 3, var8, right, input, rows, (byte) -74, top);
        var9 = var9 >>> 2;
        if (guard != 2147483647) {
          return;
        }
        try {
          TerrainMaskSupport.decodeTerrainQuadrant(left, var9 & 3, bottom, var7_int, input, rows, (byte) -74, var8);
          var9 = var9 >>> 2;
          TerrainMaskSupport.decodeTerrainQuadrant(var7_int, var9, bottom, right, input, rows, (byte) -74, var8);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bf.L(" + top + ',' + bottom + ',' + (input != null ? "{...}" : "null") + ',' + left + ',' + right + ',' + (rows != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_T = null;
        field_L = null;
        if (guard >= -118) {
          return;
        }
        field_O = null;
        field_M = null;
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_S = new ValidatedTextWidget("", (UiListener) null, 12);
        this.field_I = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_R = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_Q = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_U = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_N = new ValidatedTextWidget("", (UiListener) null, 3);
        boolean var1 = true;
        this.field_J = new Checkbox("", (UiListener) null, (var1));
        this.field_K = new TextButton(GameKeyHandler.field_c, (UiListener) null);
        this.field_P = new TextButton(CipherPacketBuffer.field_p, (UiListener) null);
        this.field_S.tooltip = ModalPanel.field_K;
        this.field_I.tooltip = AchievementTracker.field_a;
        this.field_R.tooltip = InputGlyphSupport.field_f;
        this.field_Q.tooltip = RepeatedCharacterSupport.field_b;
        this.field_U.tooltip = AlternateUsernameCredentials.field_i;
        this.field_N.tooltip = AchievementsScreen.field_k;
        this.field_J.tooltip = BoundedUrlRequest.field_h;
        this.field_S.setValidator(new NameAvailabilityValidator(this.field_S), (byte) 63);
        this.field_I.setValidator(new EmailSyntaxValidator(this.field_I), (byte) 63);
        this.field_R.setValidator(new EmailAvailabilityValidator(this.field_R, this.field_I), (byte) 63);
        this.field_Q.setValidator(new PasswordValidator(this.field_Q, this.field_S, this.field_I), (byte) 63);
        this.field_U.setValidator(new MatchingTextValidator(this.field_U, this.field_Q), (byte) 63);
        this.field_N.setValidator(new AgeValidator(this.field_N), (byte) 63);
        this.field_K.enabled = false;
        this.field_K.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_P.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.field_S.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        GradientOutlineTextPainter dupTemp$0 = new GradientOutlineTextPainter(10000536);
        this.field_R.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.field_I.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.field_N.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        this.field_J.painter = (WidgetPainter) ((Object) new SpriteCheckboxPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_U.painter = (WidgetPainter) ((Object) dupTemp$1);
        this.field_Q.painter = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = SingleChildContainer.a(AccountSessionSupport.field_b, -63, new String[]{this.j(66), this.k(3674)});
        int var3 = 20;
        var3 = var3 + this.a(170, this.field_I, AccountNoticeDialog.field_Z, var3, 100);
        var3 = var3 + (this.a(20, this.field_R, 170, DisplayAndRatingSupport.field_a, 25, "", var3) + 5);
        var3 = var3 + this.a(170, this.field_Q, RegistrationRequestDialog.field_vb, var3, 100);
        var3 = var3 + (this.a(170, LoginIdentifierSupport.field_d, var3, this.field_U, DualLinkDequeIterator.field_a, 170) + 5);
        var3 = var3 + (5 + this.a(170, ValidationHelpWidget.field_J, var3, this.field_S, LevelSelectScreen.field_i, 170));
        var3 = var3 + this.a(IterableNodeHashTable.field_a, (byte) 123, var3, this.field_N, 170);
        LabeledField var4 = new LabeledField(46, var3, -90 + this.width, 25, this.field_J, true, -120 + this.width, 5, LegacyMenuFontSupport.field_c, 11579568, ChatSettingsSupport.field_b);
        this.addChild(var4, false);
        var3 = var3 + var4.height;
        TextWidgetPainter var5 = new TextWidgetPainter(Js5Transport.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, Js5Transport.field_a.maxAscent, -1, 2147483647, true);
        this.field_H = new TextHotspotWidget(var2, var5);
        this.field_H.tooltip = "";
        this.field_H.setHotspotTooltip(TextFieldValidator.field_m, (byte) 65, 0);
        this.field_H.setHotspotTooltip(TextFieldValidator.field_m, (byte) 97, 1);
        this.field_H.listener = (UiListener) (this);
        this.field_H.setBoundsToTextHeight(2463, 46, this.width - 90, var3);
        var3 = var3 + (15 + this.field_H.height);
        this.addChild(this.field_H, false);
        int var6 = 4;
        int var7 = 200;
        this.field_K.setBounds(var7, var3, -var7 + 496 >> 1, true, 40);
        this.field_P.setBounds(60, 15 + var3, var6 + 3, true, 40);
        this.field_P.listener = (UiListener) (this);
        this.field_K.listener = (UiListener) (this);
        this.addChild(this.field_K, false);
        this.addChild(this.field_P, false);
        this.field_G = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_G.setBounds(-60 - this.field_S.x + (this.width - this.field_S.width), 20 + this.field_S.y, 60 + this.field_S.x + this.field_S.width, true, 150);
        this.addChild(this.field_G, false);
        this.setBounds(496, 0, 0, true, var6 + (var3 + 55));
    }

    private final String k(int param0) {
        if (param0 != 3674) {
          field_L = (QuickChatDynamicCommand) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onMoreSuggestions(byte guard) {
        ((NameAvailabilityValidator) (this.field_S.validator((byte) -89))).clearCachedName(22186);
        if (guard != -61) {
          field_T = (Sprite) null;
        }
    }

    private final boolean a(boolean param0, ValidationProvider param1) {
        String stackIn_21_2 = null;
        try {
          if (param0) {
            return false;
          }
          ValidationSource var3 = param1.validator((byte) -89);
          if (var3 == null) {
            return true;
          }
          ValidationState var4 = var3.validationState(17124);
          if (var4 == ArchiveProvider.field_a) {
            return false;
          }
          if (var4 == SpriteDecodeSupport.field_f) {
            return false;
          }
          if (var4 != GradientOutlineTextPainter.field_s) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("bf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static IndexedSprite a(ResourceArchive param0, int param1, String param2, String param3) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var4_int = param0.findGroupId(-1, param3);
          if (param1 <= 48) {
            field_L = (QuickChatDynamicCommand) null;
          }
          int var5 = param0.findFileId(var4_int, param2, true);
          IndexedSprite stackIn_3_0 = StatefulTextPainter.loadIndexedSprite(param0, -18109, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(String param0, byte param1, int param2, UiComponent param3, int param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          LabeledField var8 = new LabeledField(20, param2, 120 + param4, 25, param3, false, 120, 3, Js5Transport.field_a, 16777215, param0);
          this.addChild(var8, false);
          if (param1 != 123) {
            this.field_J = (Checkbox) null;
          }
          ValidationIndicator var7 = new ValidationIndicator(((ValidationProvider) ((Object) param3)).validator((byte) -89));
          this.addChild(var7, false);
          var7.setBounds(15, (-15 + var8.height >> 1) + var8.y, 3 + var8.width + var8.x, true, 15);
          int stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final static java.awt.Canvas i(byte param0) {
        if (param0 == 10) {
          return null == IsaacRandom.field_d ? SpriteDecodeSupport.field_d : (java.awt.Canvas) ((Object) IsaacRandom.field_d);
        }
        field_M = (ObjectSpriteSet[]) null;
        return null == IsaacRandom.field_d ? SpriteDecodeSupport.field_d : (java.awt.Canvas) ((Object) IsaacRandom.field_d);
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          super.updateHover(guard, offsetY, offsetX, root);
          this.field_K.enabled = this.b(true);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bf.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(boolean param0) {
        if (!param0) {
          return false;
        }
        if (!this.a(false, this.field_S)) {
          return false;
        }
        if (!this.a(false, this.field_I)) {
          return false;
        }
        if (!this.a(false, this.field_R)) {
          return false;
        }
        if (!this.a(!param0 ? true : false, this.field_Q)) {
          return false;
        }
        if (!this.a(false, this.field_U)) {
          return false;
        }
        if (this.a(false, this.field_N)) {
          return true;
        }
        return false;
    }

    private final String j(int param0) {
        int var2 = -12 % ((param0 + 57) / 43);
        return "<u=2164A2><col=2164A2>";
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_18_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 20)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_7_0 = this.focusPreviousChild((byte) 22, root);
            return stackIn_7_0;
          }
          if (guard <= 0) {
            this.field_I = (ValidatedTextWidget) null;
          }
          if (keyCode != 99) {
            return false;
          }
          boolean stackIn_12_0 = this.focusNextChild(root, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("bf.G(");
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    private final int a(int param0, UiComponent param1, int param2, String param3, int param4, String param5, int param6) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          LabeledField var10 = new LabeledField(20, param6, 120 + param2, param4, param1, false, 120, 3, Js5Transport.field_a, 16777215, param3);
          this.addChild(var10, false);
          ValidationHelpWidget var9 = new ValidationHelpWidget(((ValidationProvider) ((Object) param1)).validator((byte) -89), param5, 126, var10.height + param6, param2 + 50, param0);
          var9.listener = (UiListener) (this);
          this.addChild(var9, false);
          int stackIn_1_0 = var9.height + var10.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var8;
          StringBuilder stackIn_4_1 = new StringBuilder().append("bf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean h(byte param0) {
        if (!this.b(true)) {
          return false;
        }
        int var2 = -1;
        int var3 = 38 % ((param0 - 51) / 35);
        try {
          var2 = Integer.parseInt(this.field_N.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return RegistrationFlowSupport.beginRegistration(this, false, this.field_I.text, var2, this.field_Q.text, this.field_J.selected, this.field_S.text);
    }

    public final void onHotspotAction(int guard, TextHotspotWidget widget, int hotspotId, int buttonCode) {
        String stackIn_13_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (guard != -2861) {
            field_M = (ObjectSpriteSet[]) null;
          }
          if (0 == hotspotId) {
            AchievementRecord.a(12, "terms.ws");
            return;
          }
          if (1 == hotspotId) {
            AchievementRecord.a(12, "privacy.ws");
            return;
          }
          if (2 != hotspotId) {
            return;
          }
          AchievementRecord.a(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("bf.A(").append(guard).append(',');
          if (widget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(hotspotId).append(',').append(buttonCode).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -15655) {
          return;
        }
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.addOffset(-1, param0);
        }
    }

    static {
        field_O = "Complete the tutorial by following<br>the instructions at the top of the screen.";
        field_L = new QuickChatDynamicCommand(11, 0, 1, 2);
    }
}
