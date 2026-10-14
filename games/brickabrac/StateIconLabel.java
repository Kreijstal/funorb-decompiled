/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StateIconLabel extends UiComponent {
    static String field_Pb;
    private UiComponent label;
    static UsernameAvailabilityResult field_Rb;
    static String field_Tb;
    static RgbSprite halloweenMidSprite;
    static boolean field_Sb;
    static TextFont field_Wb;
    private UiComponent icon;

    final int measureIconLabelWidth(byte obfuscationGuard, int gap) {
        if (obfuscationGuard != 11) {
          field_Tb = (String) null;
        }
        return this.icon.getContentWidth(obfuscationGuard + 90) + (gap + this.label.getContentWidth(91));
    }

    final static int hashArchiveName(int obfuscationGuard, CharSequence name) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = name.length();
          var3 = 0;
          if (obfuscationGuard > -103) {
            halloweenMidSprite = (RgbSprite) null;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = (var3 << 5) - var3 + DateFieldsWidget.a(-8250, name.charAt(var4));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ni.A(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean isAsciiLetter(boolean obfuscationGuard, char character) {
        boolean stackIn_10_0 = false;
        if (!obfuscationGuard) {
          field_Pb = (String) null;
        }
        stackIn_10_0 = ((!(character < 65) &&
          !(90 < character)) ||
          (!(character < 97) &&
          !(122 < character)));
        return stackIn_10_0;
    }

    StateIconLabel(long id, RgbSprite selectedSprite, RgbSprite normalSprite, int iconVerticalAlignment, UiComponent labelStyle, String text) {
        this(id, (UiComponent) null, labelStyle, text);
        try {
          this.icon.selectedSprite = selectedSprite;
          this.icon.verticalAlignment = iconVerticalAlignment;
          this.icon.sprite = normalSprite;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ni.<init>(" + id + ',' + (selectedSprite != null ? "{...}" : "null") + ',' + (normalSprite != null ? "{...}" : "null") + ',' + iconVerticalAlignment + ',' + (labelStyle != null ? "{...}" : "null") + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    private StateIconLabel(long id, UiComponent iconStyle, UiComponent labelStyle, String text) {
        super(id, (UiComponent) null);
        try {
          this.icon = new UiComponent(0L, iconStyle);
          this.label = new UiComponent(0L, labelStyle);
          this.label.text = text;
          this.addChild(this.icon, 0);
          this.addChild(this.label, 0);
          this.markDescendantsToInheritVisualState(true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ni.<init>(" + id + ',' + (iconStyle != null ? "{...}" : "null") + ',' + (labelStyle != null ? "{...}" : "null") + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final static AudioMixer h(int param0) {
        if (param0 < 91) {
          field_Pb = (String) null;
        }
        return PasswordFieldRenderer.soundMixer;
    }

    public static void d(boolean param0) {
        halloweenMidSprite = null;
        field_Pb = null;
        field_Tb = null;
        field_Wb = null;
        field_Rb = null;
        if (!param0) {
          field_Rb = (UsernameAvailabilityResult) null;
        }
    }

    final void setIconLabelBounds(int width, int gap, int height, int y, boolean obfuscationGuard, int x) {
        this.setBounds(height, y, x, width, (byte) 64);
        this.layoutIconLabel(-32434, gap);
        if (!obfuscationGuard) {
          StateIconLabel.d(false);
        }
    }

    StateIconLabel(long id, StateIconLabel styleTemplate, String text) {
        this(id, styleTemplate.icon, styleTemplate.label, text);
    }

    private final void layoutIconLabel(int obfuscationGuard, int gap) {
        this.icon.setBounds(this.height, 0, 0, this.icon.getContentWidth(118), (byte) 64);
        int labelX = this.icon.width + gap;
        if (obfuscationGuard != -32434) {
          halloweenMidSprite = (RgbSprite) null;
        }
        this.label.setBounds(this.height, 0, labelX, this.width - labelX, (byte) 64);
    }

    static {
        field_Pb = "Don't mind";
        field_Tb = "This password contains your email address, and would be easy to guess";
    }
}
