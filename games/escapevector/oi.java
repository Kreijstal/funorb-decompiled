/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends UiContainer implements NameSuggestionListener, ButtonListener {
    private ValidatedTextWidget field_I;
    static Sprite field_O;
    NameSuggestionsPanel field_K;
    private TextButton field_G;
    static int[] field_M;
    private TextButton field_H;
    static String field_J;
    static int[] field_L;
    static String field_N;

    private final void j(int param0) {
        if (!this.l(84)) {
          return;
        }
        ej.a((byte) -116, this.field_I.text);
        if (param0 >= -118) {
          String var3 = (String) null;
          int discarded$0 = this.a(125, (String) null, 33, 115, (UiComponent) null, (String) null, 107);
        }
    }

    public static void releaseStatics(byte guard) {
        field_N = null;
        field_O = null;
        if (guard > 61) {
          field_J = null;
          field_L = null;
          field_M = null;
          return;
        }
        field_L = (int[]) null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    private final boolean l(int param0) {
        if (!this.a(this.field_I, -95)) {
          return false;
        }
        if (param0 > 47) {
          return true;
        }
        String var3 = (String) null;
        int discarded$0 = this.a(-69, (String) null, (UiComponent) null, -35, (byte) 72, (String) null);
        return true;
    }

    private final int a(int param0, String param1, int param2, int param3, UiComponent param4, String param5, int param6) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param0 != 23273) {
            field_N = (String) null;
          }
          ki var10 = new ki(20, param3, 120 + param6, 25, param4, false, 120, 3, Js5Transport.field_a, 16777215, param1);
          this.b(var10, false);
          lf var9 = new lf(((ValidationProvider) ((Object) param4)).validator((byte) -89), param5, 126, var10.height + param3, 25 + param6, param2);
          var9.listener = (UiListener) (this);
          this.b(var9, false);
          int stackIn_3_0 = var10.height + var9.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var8;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static ih a(int param0, ResourceArchive param1, String param2, String param3, ResourceArchive param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          int var5_int = param4.findGroupId(-1, param2);
          if (param0 != 4) {
            field_N = (String) null;
          }
          int var6 = param4.findFileId(var5_int, param3, true);
          ih stackIn_3_0 = fa.a(param0 - 3, param1, var5_int, param4, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oi.L(").append(param0).append(',');
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
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void onMoreSuggestions(byte guard) {
        if (guard != -61) {
          return;
        }
        ((NameAvailabilityValidator) (this.field_I.validator((byte) -89))).clearCachedName(guard + 22247);
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          super.updateHover(guard, offsetY, offsetX, root);
          this.field_G.enabled = this.l(guard + 14569);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oi.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(ValidationProvider param0, int param1) {
        String stackIn_13_2 = null;
        try {
          ValidationSource var3 = param0.validator((byte) -89);
          if (var3 == null) {
            return true;
          }
          if (param1 > -92) {
            return true;
          }
          ValidationState var4 = var3.validationState(17124);
          boolean stackIn_9_0 = (IsaacRandom.field_h == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oi.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, String param1, UiComponent param2, int param3, byte param4, String param5) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param4 != -5) {
            field_J = (String) null;
          }
          int stackIn_3_0 = this.a(param4 + 23278, param1, 35, param3, param2, param5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oi.N(").append(param0).append(',');
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
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onNameSelected(byte guard, String name) {
        try {
          if (guard >= -49) {
            this.onMoreSuggestions((byte) -79);
          }
          ValidatedTextWidget var3 = this.field_I;
          String var4 = name;
          ((EditableTextWidget) ((Object) var3)).setText(var4, false, -33);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oi.J(" + guard + ',' + (name != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_10_2 = null;
        try {
          if (guard != 1) {
            return;
          }
          if (this.field_H == button) {
            GameAppletShell.b(guard ^ -104);
            return;
          }
          if (button != this.field_G) {
            return;
          }
          this.j(-125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6;
          StringBuilder stackIn_9_1 = new StringBuilder().append("oi.K(");
          if (button == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_16_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 78)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_6_0 = this.a((byte) 22, root);
            return stackIn_6_0;
          }
          if (guard <= 0) {
            field_L = (int[]) null;
          }
          if (keyCode != 99) {
            return false;
          }
          boolean stackIn_12_0 = this.a(root, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("oi.G(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final static int k(int param0) {
        if (param0 != -99) {
          field_M = (int[]) null;
          return gf.field_a;
        }
        return gf.field_a;
    }

    public oi() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_I = new ValidatedTextWidget("", (UiListener) null, 12);
        TextWidgetPainter var1 = new TextWidgetPainter(ke.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, Js5Transport.field_a.field_r, -1, 2147483647, true);
        UiComponent var2 = new UiComponent(DebouncedValidator.field_a, var1, (UiListener) null);
        this.field_G = new TextButton(TextFieldValidator.field_i, (UiListener) null);
        this.field_H = new TextButton(cf.field_b, (UiListener) null);
        this.field_I.tooltip = bb.field_K;
        this.field_I.setValidator(new NameAvailabilityValidator(this.field_I), (byte) 63);
        this.field_G.enabled = false;
        this.field_G.painter = (WidgetPainter) ((Object) new ck());
        this.field_H.painter = (WidgetPainter) ((Object) new ha());
        this.field_I.painter = (WidgetPainter) ((Object) new re(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(270, var3, 20, true, 50);
        var3 += 50;
        this.b(var2, false);
        var3 = var3 + (5 + this.a(170, lf.field_J, this.field_I, var3, (byte) -5, ig.field_i));
        this.field_G.setBounds(var5, var3, 496 - var5 >> 1, true, 40);
        this.field_H.setBounds(60, 15 + var3, 3 + var4, true, 40);
        this.field_H.listener = (UiListener) (this);
        this.field_G.listener = (UiListener) (this);
        this.b(this.field_G, false);
        this.b(this.field_H, false);
        this.field_K = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_K.setBounds(-this.field_I.width + this.width + (-this.field_I.x - 60), 20, this.field_I.x + (this.field_I.width + 60), true, 150);
        this.b(this.field_K, false);
        this.setBounds(496, 0, 0, true, var4 + var3 + 55);
    }

    static {
        field_M = new int[4];
        field_J = "Target eliminated";
        field_N = "Sound: ";
        field_L = new int[8192];
    }
}
