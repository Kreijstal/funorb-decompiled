/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends WidgetContainer implements NameSelectionListener, ButtonActionListener {
    static String field_P;
    private ValidatedTextField field_F;
    static boolean field_K;
    static Sprite field_Q;
    private TextButton field_N;
    static int field_G;
    NameSuggestionsPanel field_H;
    private TextButton field_M;
    static Sprite field_O;
    static int field_L;
    static float[] field_J;
    static BitmapFont field_I;

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_F = new ValidatedTextField("", (WidgetListener) null, 12);
        TextWidgetStyle var1 = new TextWidgetStyle(SpriteButtonRenderer.field_w, 0, 0, 0, 0, 16777215, -1, 3, 0, IntrusiveNode.field_g.ascent, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(LoadProgressDialog.field_ib, var1, (WidgetListener) null);
        this.field_M = new TextButton(h.field_d, (WidgetListener) null);
        this.field_N = new TextButton(hh.field_b, (WidgetListener) null);
        this.field_F.tooltip = PolarSortVector.field_f;
        this.field_F.a((byte) 42, new DisplayNameValidator(this.field_F));
        this.field_M.field_D = false;
        this.field_M.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
        this.field_N.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
        this.field_F.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(20, (byte) 122, var3, 50, 270);
        var3 += 50;
        this.addChild(true, var2);
        var3 = var3 + (this.a(var3, (byte) -86, ArchiveLoadStage.field_h, sh.field_a, 170, this.field_F) + 5);
        this.field_M.setBounds(496 - var5 >> 1, (byte) 122, var3, 40, var5);
        this.field_N.setBounds(3 + var4, (byte) 122, 15 + var3, 40, 60);
        this.field_N.listener = (WidgetListener) (this);
        this.field_M.listener = (WidgetListener) (this);
        this.addChild(true, this.field_M);
        this.addChild(true, this.field_N);
        this.field_H = new NameSuggestionsPanel((NameSelectionListener) (this));
        this.field_H.setBounds(60 + this.field_F.x + this.field_F.width, (byte) 122, 20, 150, -60 - this.field_F.width + (this.width - this.field_F.x));
        this.addChild(true, this.field_H);
        this.setBounds(0, (byte) 122, 0, var4 + var3 + 55, 496);
    }

    public final void a(byte param0) {
        ((DisplayNameValidator) (this.field_F.getValidator(1))).invalidateAvailability(true);
        if (param0 <= 124) {
          ResourceArchive var3 = (ResourceArchive) null;
          DisplayNameForm.a(91, -12, (ResourceArchive) null, -35);
        }
    }

    private final boolean a(ValidatorProvider param0, byte param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getValidator(1);
          if (param1 < 52) {
            return false;
          }
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationState(-7447);
          stackIn_10_0 = (PointPath.field_d == var4);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("de.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void g(byte param0) {
        int var1;
        int var2;
        int var3;
        var3 = HoldTheLine.field_D;
        var1 = 1 % ((-31 - param0) / 39);
        DelayedServerPacket.field_k = false;
        FullscreenDisplayMode.field_c = null;
        if (ArchiveCatalog.field_o) {
          sb.field_c.o(-41);
        } else {
          var2 = q.field_c;
          if (var2 > 0) {
            if (var2 == 1) {
              FullscreenDisplayMode.field_c = jc.field_c;
            } else {
              FullscreenDisplayMode.field_c = LoginCredentials.substituteIndexedTokens(h.field_c, new String[]{Integer.toString(var2)}, true);
            }
            FullscreenDisplayMode.field_c = CacheEntry.a((byte) -54, new CharSequence[]{(CharSequence) ((Object) FullscreenDisplayMode.field_c), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) BufferedRandomAccessFile.field_q)});
          }
          sb.field_c.h((byte) -57);
          TutorialPage.a((byte) -124);
        }
    }

    final boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.focusPreviousChild(param0, -1);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param0, 122);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("de.T(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_P = null;
        field_Q = null;
        field_I = null;
        field_O = null;
        field_J = null;
        if (param0 != -1) {
          ResourceArchive var2 = (ResourceArchive) null;
          DisplayNameForm.a(96, 127, (ResourceArchive) null, -13);
        }
    }

    private final int a(int param0, byte param1, String param2, String param3, int param4, UiWidget param5) {
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
          if (param1 >= -25) {
            this.handleKeyPress((UiWidget) null, 59, (byte) 51, 'ￕ');
          }
          stackIn_3_0 = this.a(param4, param3, 35, param0, 10566, param2, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("de.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void i(int param0) {
        if (!this.h(-22485)) {
          return;
        }
        if (param0 == 200) {
          ValidatedTextField.a(this.field_F.text, -115);
          return;
        }
        field_L = 46;
        ValidatedTextField.a(this.field_F.text, -115);
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -4) {
            DisplayNameForm.clearSharedReferences(-28);
          }
          if (this.field_N == param1) {
            TextButton.h(84);
            return;
          }
          if (this.field_M != param1) {
            return;
          }
          this.i(param2 ^ -204);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("de.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        ValidatedTextField var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_F;
          var4 = param0;
          ((EditableTextField) ((Object) var3)).a(false, var4, 1471);
          if (param1 == 25) {
            return;
          }
          DisplayNameForm.g((byte) 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("de.D(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final static IndexedSprite a(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite stackIn_5_0 = null;
        IndexedSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qg.decodeArchivedSpriteSheet(param0, param1, (byte) -27, param2)) {
            stackIn_2_0 = null;
            return (IndexedSprite) (stackIn_2_0);
          }
          if (param3 == 25) {
            stackIn_7_0 = fc.a(true);
            return stackIn_7_0;
          }
          stackIn_5_0 = (IndexedSprite) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("de.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean h(int param0) {
        if (param0 != -22485) {
          return false;
        }
        if (!this.a((ValidatorProvider) (this.field_F), (byte) 104)) {
          return false;
        }
        return true;
    }

    final void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        try {
          super.updateHover(param0, param1, param2, param3);
          this.field_M.field_D = this.h(-22485);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "de.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, String param1, int param2, int param3, int param4, String param5, UiWidget param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        LabeledField var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledField(20, param3, 120 + param0, 25, param6, false, 120, 3, IntrusiveNode.field_g, 16777215, param1);
          if (param4 != 10566) {
            stackIn_2_0 = 49;
            return stackIn_2_0;
          }
          this.addChild(true, var10);
          var9 = new ValidationHelpWidget(((ValidatorProvider) ((Object) param6)).getValidator(param4 ^ 10567), param5, 126, var10.height + param3, 25 + param0, param2);
          var9.listener = (WidgetListener) (this);
          this.addChild(true, var9);
          stackIn_4_0 = var10.height + var9.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("de.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_P = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_J = new float[]{0.6000000238418579f, 0.800000011920929f, 1.0f};
    }
}
