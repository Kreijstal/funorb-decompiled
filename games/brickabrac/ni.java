/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends UiComponent {
    static String field_Pb;
    private UiComponent field_Qb;
    static oh field_Rb;
    static String field_Tb;
    static RgbSprite halloweenMidSprite;
    static boolean field_Sb;
    static TextFont field_Wb;
    private UiComponent field_Vb;

    final int a(byte param0, int param1) {
        if (param0 != 11) {
          field_Tb = (String) null;
        }
        return this.field_Vb.getContentWidth(param0 + 90) + (param1 + this.field_Qb.getContentWidth(91));
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
            var3 = (var3 << 5) - var3 + na.a(-8250, name.charAt(var4));
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

    final static boolean b(boolean param0, char param1) {
        boolean stackIn_10_0 = false;
        if (!param0) {
          field_Pb = (String) null;
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(90 < param1)) ||
          (!(param1 < 97) &&
          !(122 < param1)));
        return stackIn_10_0;
    }

    ni(long param0, RgbSprite param1, RgbSprite param2, int param3, UiComponent param4, String param5) {
        this(param0, (UiComponent) null, param4, param5);
        try {
          this.field_Vb.selectedSprite = param1;
          this.field_Vb.verticalAlignment = param3;
          this.field_Vb.sprite = param2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private ni(long param0, UiComponent param1, UiComponent param2, String param3) {
        super(param0, (UiComponent) null);
        try {
          this.field_Vb = new UiComponent(0L, param1);
          this.field_Qb = new UiComponent(0L, param2);
          this.field_Qb.text = param3;
          this.addChild(this.field_Vb, 0);
          this.addChild(this.field_Qb, 0);
          this.markDescendantsToInheritVisualState(true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ni.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static AudioMixer h(int param0) {
        if (param0 < 91) {
          field_Pb = (String) null;
        }
        return ob.soundMixer;
    }

    public static void d(boolean param0) {
        halloweenMidSprite = null;
        field_Pb = null;
        field_Tb = null;
        field_Wb = null;
        field_Rb = null;
        if (!param0) {
          field_Rb = (oh) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        this.setBounds(param2, param3, param5, param0, (byte) 64);
        this.b(-32434, param1);
        if (!param4) {
          ni.d(false);
        }
    }

    ni(long param0, ni param1, String param2) {
        this(param0, param1.field_Vb, param1.field_Qb, param2);
    }

    private final void b(int param0, int param1) {
        this.field_Vb.setBounds(this.height, 0, 0, this.field_Vb.getContentWidth(118), (byte) 64);
        int var3 = this.field_Vb.width + param1;
        if (param0 != -32434) {
          halloweenMidSprite = (RgbSprite) null;
        }
        this.field_Qb.setBounds(this.height, 0, var3, this.width - var3, (byte) 64);
    }

    static {
        field_Pb = "Don't mind";
        field_Tb = "This password contains your email address, and would be easy to guess";
    }
}
