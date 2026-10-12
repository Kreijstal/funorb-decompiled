/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IconTextComponent extends ClientUiComponent {
    static ClientUiComponent field_Kb;
    static QuickChatCommandDefinition field_Ib;
    static String field_Jb;
    private ClientUiComponent iconComponent;
    static int field_Mb;
    ClientUiComponent textComponent;
    static String field_Pb;
    static ResourceArchive field_Nb;

    private final void layoutContent(byte obfuscationGuard, int iconTextGap, int padding) {
        int var4;
        int var5;
        int var6;
        var4 = -iconTextGap;
        var5 = -iconTextGap;
        if (null != this.iconComponent) {
          var4 = this.iconComponent.getPreferredWidth(98);
        }
        if (this.textComponent != null) {
          var5 = this.textComponent.measureContentWidth(true, -var4 - padding + this.width - iconTextGap - padding);
        }
        var6 = padding + (var5 + padding) + var4 + iconTextGap;
        if (this.width < var6) {
          var5 = var5 + (this.width - var6);
          var6 = this.width;
        }
        if (this.horizontalAlignment == 1) {
          padding = padding + (this.width - var6) / 2;
        }
        if (this.horizontalAlignment == 2) {
          padding = padding + (this.width - var6);
        }
        if (null != this.iconComponent) {
          this.iconComponent.setBounds(this.height, -20500, var4, 0, padding);
          this.iconComponent.verticalAlignment = this.verticalAlignment;
        }
        if (obfuscationGuard != -81) {
          IconTextComponent.k(94);
        }
        if (null != this.textComponent) {
          this.textComponent.setBounds(this.height, -20500, var5, 0, var4 + padding + iconTextGap);
          this.textComponent.verticalAlignment = this.verticalAlignment;
          if (this.iconComponent == null) {
            this.textComponent.horizontalAlignment = this.horizontalAlignment;
          } else {
            this.textComponent.horizontalAlignment = 0;
          }
        }
    }

    final static int l(int param0) {
        if (param0 != 26136) {
          IconTextComponent.l(77);
        }
        return ResourceArchive.field_a.currentPosition[0];
    }

    public static void k(int param0) {
        field_Pb = null;
        field_Jb = null;
        field_Ib = null;
        field_Kb = null;
        if (param0 != 0) {
          field_Ib = (QuickChatCommandDefinition) null;
        }
        field_Nb = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 > -32) {
          return 57;
        }
        int var5 = -param1;
        if (null != this.iconComponent) {
          var4 = this.iconComponent.getPreferredWidth(125);
        }
        if (null != this.textComponent) {
          var5 = this.textComponent.getPreferredWidth(102);
        }
        return param2 - (-var4 - param1 - var5) + param2;
    }

    final void setLayout(int height, int padding, int obfuscationGuard, int width, int y, int x, int iconTextGap) {
        if (obfuscationGuard != -30061) {
          this.setLayout(46, -50, -114, 23, 28, -56, -92);
        }
        this.setBounds(height, obfuscationGuard + 9561, width, y, x);
        this.layoutContent((byte) -81, iconTextGap, padding);
    }

    final static String a(boolean param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          if (!param0) {
            field_Ib = (QuickChatCommandDefinition) null;
          }
          var3 = new char[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-var4 + var2_int - 1] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    IconTextComponent(long key, ClientUiComponent style, ClientUiComponent iconStyle, ClientUiComponent textStyle, RgbSprite icon, String text) {
        super(key, style);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (icon != null) {
            this.iconComponent = new ClientUiComponent(0L, iconStyle);
            this.iconComponent.sprite = icon;
            this.addChild(this.iconComponent, 60);
          }
          if (text != null) {
            this.textComponent = new ClientUiComponent(0L, textStyle, text);
            this.addChild(this.textComponent, 41);
            this.inheritVisualStateForDescendants(-10027);
          } else {
            this.inheritVisualStateForDescendants(-10027);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("nf.<init>(").append(key).append(',');
          if (style == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (iconStyle == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (textStyle == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (icon == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (text == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static boolean a(ls param0, ls param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_b < param1.field_b) {
            return true;
          }
          if (param0.field_b == param1.field_b &&
            param0.field_a < param1.field_a) {
            return true;
          }
          if (param2 == 30549) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("nf.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_Jb = "Play free version";
        field_Ib = new QuickChatCommandDefinition(13, 0, 1, 0);
        field_Pb = "Spells to affect the very ground itself.";
    }
}
