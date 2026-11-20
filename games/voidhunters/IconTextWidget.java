/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IconTextWidget extends Widget {
    static String field_wb;
    private Widget iconWidget;
    static String field_xb;
    Widget textWidget;
    static int[] field_zb;

    public static void clearSharedReferences(int param0) {
        field_zb = null;
        if (param0 != 1) {
          field_wb = (String) null;
          field_xb = null;
          field_wb = null;
          return;
        }
        field_xb = null;
        field_wb = null;
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.setBounds(param1, -79, param5, param0, param6);
        this.layoutContents((byte) -98, param3, param4);
        if (param2 >= -114) {
          this.setBoundsAndLayout(14, -14, 125, -124, -11, -99, -44);
        }
    }

    IconTextWidget(long param0, Widget param1, Widget param2, Widget param3, Sprite param4, String param5) {
        super(param0, param1);
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
          if (param4 != null) {
            this.iconWidget = new Widget(0L, param2);
            this.iconWidget.field_tb = param4;
            this.addChild(-561, this.iconWidget);
          }
          if (param5 != null) {
            this.textWidget = new Widget(0L, param3, param5);
            this.addChild(-561, this.textWidget);
            this.inheritInteractionStateInDescendants(109);
          } else {
            this.inheritInteractionStateInDescendants(109);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("cna.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int measurePreferredWidth(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = -param0;
        if (this.iconWidget != null) {
          var4 = this.iconWidget.getPreferredWidth(58);
        }
        if (param2 < -52) {
          var5 = -param0;
          if (null != this.textWidget) {
            var5 = this.textWidget.getPreferredWidth(17);
          }
          return var5 + (param0 + param1 + var4) + param1;
        }
        return 23;
    }

    private final void layoutContents(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var5 = 60 % ((param0 + 53) / 39);
        var4 = -param2;
        var6 = -param2;
        if (null != this.iconWidget) {
          var4 = this.iconWidget.getPreferredWidth(6);
        }
        if (this.textWidget != null) {
          var6 = this.textWidget.getContentWidth(-param1 - param2 + (-var4 - param1 + this.width), (byte) 114);
        }
        var7 = var6 + (param1 + var4) + (param2 + param1);
        if (this.width < var7) {
          var6 = var6 + (this.width - var7);
          var7 = this.width;
        }
        if (this.field_F == 1) {
          param1 = param1 + (this.width - var7) / 2;
        }
        if (2 == this.field_F) {
          param1 = param1 + (this.width - var7);
        }
        if (null != this.iconWidget) {
          this.iconWidget.setBounds(param1, 126, var4, 0, this.height);
          this.iconWidget.field_B = this.field_B;
        }
        if (this.textWidget == null) {
          return;
        }
        this.textWidget.setBounds(param2 + var4 + param1, 34, var6, 0, this.height);
        if (null != this.iconWidget) {
          this.textWidget.field_F = 0;
        } else {
          this.textWidget.field_F = this.field_F;
        }
        this.textWidget.field_B = this.field_B;
    }

    static {
        field_wb = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_xb = "Press TAB to chat or F10 to open Quick Chat.";
        field_zb = new int[]{1, 50, 50, 50, 50, 50, 1, 1, 1, 1, 1, 1};
    }
}
