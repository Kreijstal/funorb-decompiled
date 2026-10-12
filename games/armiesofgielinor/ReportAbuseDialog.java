/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportAbuseDialog extends ClientUiComponent {
    private IconLabelControl muteControl;
    private ClientUiComponent closeButton;
    long accountId;
    static ResourceArchive field_Lb;
    private ClientUiComponent instructions;
    private StringBuilder targetName;
    static int[] field_Nb;
    private ClientUiComponent content;
    private ClientUiComponent[] offenceButtons;
    private ClientUiComponent title;
    private int pendingResult;
    static String field_Ob;
    private ClientUiComponent targetNameComponent;
    private ClientUiComponent helpText;

    final static void drawNineSlice(RgbSprite[] sprites, int height, int x, byte obfuscationGuard, int y, int width) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (sprites == null) {
            return;
          }
          if (0 < width &&
            0 < height) {
            if (sprites[3] != null) {
              stackIn_9_0 = sprites[3].canvasWidth;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (null != sprites[5]) {
              stackIn_12_0 = sprites[5].canvasWidth;
            } else {
              stackIn_12_0 = 0;
            }
            var7 = stackIn_12_0;
            if (sprites[1] != null) {
              stackIn_15_0 = sprites[1].canvasHeight;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (null != sprites[7]) {
              stackIn_18_0 = sprites[7].canvasHeight;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            if (obfuscationGuard != -47) {
              ReportAbuseDialog.a(true, -79, -40);
            }
            var10 = width + x;
            var11 = height + y;
            var12 = var6_int + x;
            var13 = var10 - var7;
            var14 = y + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = x + var6_int * width / (var6_int + var7);
              var16 = x + var6_int * width / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            if (var19 < var18) {
              var19 = y + var8 * height / (var9 + var8);
              var18 = y + var8 * height / (var9 + var8);
            }
            SoftwareRaster.b(pd.field_g);
            if (null != sprites[0]) {
              SoftwareRaster.b(x, y, var16, var18);
              sprites[0].g(x, y);
              SoftwareRaster.a(pd.field_g);
            }
            if (sprites[2] != null) {
              SoftwareRaster.b(var17, y, var10, var18);
              sprites[2].g(var13, y);
              SoftwareRaster.a(pd.field_g);
            }
            if (sprites[6] != null) {
              SoftwareRaster.b(x, var19, var16, var11);
              sprites[6].g(x, var15);
              SoftwareRaster.a(pd.field_g);
            }
            if (null != sprites[8]) {
              SoftwareRaster.b(var17, var19, var10, var11);
              sprites[8].g(var13, var15);
              SoftwareRaster.a(pd.field_g);
            }
            if (sprites[1] != null &&
              sprites[1].canvasWidth != 0) {
              SoftwareRaster.b(var16, y, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + sprites[1].canvasWidth) {
                sprites[1].g(var20, y);
              }
              SoftwareRaster.a(pd.field_g);
            }
            if (null != sprites[7] &&
              0 != sprites[7].canvasWidth) {
              SoftwareRaster.b(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + sprites[7].canvasWidth) {
                sprites[7].g(var20Lifetime1, var15);
              }
              SoftwareRaster.a(pd.field_g);
            }
            if (null != sprites[3] &&
              0 != sprites[3].canvasHeight) {
              SoftwareRaster.b(x, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + sprites[3].canvasHeight) {
                sprites[3].g(x, var20Lifetime2);
              }
              SoftwareRaster.a(pd.field_g);
            }
            if (null != sprites[5] &&
              sprites[5].canvasHeight != 0) {
              SoftwareRaster.b(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + sprites[5].canvasHeight) {
                sprites[5].g(var13, var20Lifetime3);
              }
              SoftwareRaster.a(pd.field_g);
            }
            if (null != sprites[4] &&
              sprites[4].canvasWidth != 0) {
              if (sprites[4].canvasHeight == 0) {
                return;
              }
              SoftwareRaster.b(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + sprites[4].canvasHeight) {
                for (var21 = var12; var21 < var13; var21 = var21 + sprites[4].canvasWidth) {
                  sprites[4].g(var21, var20Lifetime4);
                }
              }
              SoftwareRaster.a(pd.field_g);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("i.B(");
          if (sprites == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(height).append(',').append(x).append(',').append(obfuscationGuard).append(',').append(y).append(',').append(width).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_Nb = null;
        field_Ob = null;
        if (param0 < 60) {
          field_Lb = (ResourceArchive) null;
        }
        field_Lb = null;
    }

    private final int a(ClientUiComponent param0, int param1, ClientUiComponent param2, int param3, String param4, int param5) {
        ClientUiComponent var7 = null;
        RuntimeException var7_ref = null;
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
          var7 = new ClientUiComponent(0L, param0, 0, param1, param3, param5, param4);
          param2.addChild(var7, 87);
          param1 += 32;
          stackIn_1_0 = param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("i.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean isWaitingForChoice(int obfuscationGuard) {
        int discarded$0 = 0;
        if (this.pendingResult != -2) {
          return false;
        }
        if (rs.keyCode == 13) {
          this.pendingResult = -1;
        }
        if (obfuscationGuard != 18585) {
          String var3 = (String) null;
          discarded$0 = this.a((ClientUiComponent) null, 77, (ClientUiComponent) null, -9, (String) null, 124);
          return true;
        }
        return true;
    }

    final int pollOffence(boolean enableCapture, byte obfuscationGuard) {
        int var4 = 0;
        IconLabelControl stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        ClientUiComponent stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var3;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.updateInput(true, enableCapture);
        var3 = 80 / ((obfuscationGuard + 36) / 58);
        if (this.targetNameComponent != null) {
          this.targetNameComponent.text = this.targetName.toString();
          this.targetNameComponent.x = (this.width - this.targetNameComponent.font.a(this.targetNameComponent.text)) / 2;
          this.targetNameComponent.width = -this.targetNameComponent.x + this.width;
          if (null != this.muteControl &&
            0 != this.muteControl.pressedButton) {
            stackIn_6_0 = this.muteControl;
            stackIn_7_1 = !(this.muteControl.selected);
            stackIn_6_0.selected = stackIn_7_1;
          }
          for (var4 = 0; CampaignMenuEntry.field_F > var4; var4++) {
            if (null != this.offenceButtons[var4]) {
              stackIn_15_0 = this.offenceButtons[var4];
              stackIn_16_1 = !(0 >= this.targetName.length());
              stackIn_15_0.inputEnabled = stackIn_16_1;
              if (this.offenceButtons[var4].inputEnabled &&
                this.offenceButtons[var4].pressedButton != 0) {
                return var4;
              }
            }
          }
        }
        if (this.closeButton.pressedButton != 0) {
          return -1;
        }
        if (enableCapture &&
          0 != DeployEvent.pointerPressButton &&
          this.pressedButton == 0) {
          return -1;
        }
        return this.pendingResult;
    }

    private final int a(int param0, int param1, ClientUiComponent param2, ClientUiComponent param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param4 += 8;
          var6_int = param3.font.getParagraphHeight(param3.text, -(param3.textHorizontalPadding * param1) + param0, param3.textLineSpacing);
          param3.setBounds(var6_int, -20500, param0, param4, 0);
          param4 = param4 + (var6_int - 0);
          param2.addChild(param3, 57);
          stackIn_1_0 = param4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("i.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void n(int param0) {
        int[] var2 = new int[3];
        int[] var1 = var2;
        var2[2] = 16777215;
        var2[0] = 1;
        var2[1] = param0;
        TurnEffectEvent.field_z = new hc(oh.field_J, IsaacRandom.field_k, rs.field_n, var2, 0, 0);
    }

    final boolean isMuteSelected(int obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard != 0) {
          this.offenceButtons = (ClientUiComponent[]) null;
        }
        stackIn_6_0 = (null != this.muteControl) && (this.muteControl.selected);
        return stackIn_6_0;
    }

    final String getTargetName(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return (String) null;
        }
        return this.targetName.toString();
    }

    ReportAbuseDialog(int anchorX, int anchorY, int anchorWidth, int anchorHeight, int unusedReportPacketOpcode, ClientUiComponent style, ClientUiComponent titleStyle, ClientUiComponent closeStyle, ClientUiComponent textStyle, IconLabelControl muteStyle, ClientUiComponent offenceStyle, String targetName, long accountId) {
        super(0L, style);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        IconLabelControl stackIn_6_1;
        IconLabelControl stackIn_6_2;
        long stackIn_6_3;
        IconLabelControl stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        IconLabelControl stackIn_8_1;
        IconLabelControl stackIn_8_2;
        String stackIn_8_5;
        ClientUiComponent stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        ClientUiComponent[] var15 = null;
        RuntimeException var15_ref = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        ClientUiComponent[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        IconLabelControl stackIn_8_1Lifetime1;
        IconLabelControl stackIn_8_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.pendingResult = -2;
        try {
          this.accountId = accountId;
          this.title = new ClientUiComponent(0L, titleStyle, DebugConsole.field_u.toUpperCase());
          this.title.horizontalAlignment = 1;
          this.addChild(this.title, 69);
          this.closeButton = new ClientUiComponent(0L, closeStyle);
          this.title.addChild(this.closeButton, 126);
          this.content = new ClientUiComponent(0L, (ClientUiComponent) null);
          this.addChild(this.content, 106);
          if (targetName != null) {
            this.instructions = new ClientUiComponent(0L, textStyle, ii.field_c);
            this.instructions.horizontalAlignment = 1;
            this.instructions.textColour = 11184810;
            this.content.addChild(this.instructions, 116);
            this.helpText = new ClientUiComponent(0L, textStyle, mk.field_d);
            this.helpText.horizontalAlignment = 1;
            this.helpText.textColour = 11184810;
            this.content.addChild(this.helpText, 119);
            this.targetNameComponent = new ClientUiComponent(0L, textStyle);
            this.targetNameComponent.textColour = 16764006;
            this.content.addChild(this.targetNameComponent, 63);
            this.targetNameComponent.blinkTextSuffix = "|";
            if (!(tf.field_l < 5) ||
              !(BufferedSocket.field_j < 2)) {
              regionExit1: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (IconLabelControl) (muteStyle);
                if (tf.field_l < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (BufferedSocket.field_j < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = jq.field_E;
                    break regionExit1;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = SpellCastAction.field_v;
              }
              this.muteControl = new IconLabelControl(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.content.addChild(this.muteControl, 65);
            }
            var28 = new ClientUiComponent[3];
            var15 = var28;
            var28[0] = new ClientUiComponent(0L, (ClientUiComponent) null);
            this.content.addChild(var28[0], 100);
            var28[1] = new ClientUiComponent(0L, (ClientUiComponent) null);
            this.content.addChild(var28[1], 65);
            var28[2] = new ClientUiComponent(0L, (ClientUiComponent) null);
            this.content.addChild(var28[2], 111);
            this.offenceButtons = new ClientUiComponent[CampaignMenuEntry.field_F];
            for (var16 = 0; var16 < CampaignMenuEntry.field_F; var16++) {
              if (ConsoleParseException.field_d[var16] != null) {
                this.offenceButtons[var16] = new ClientUiComponent(0L, offenceStyle, ConsoleParseException.field_d[var16]);
                this.offenceButtons[var16].horizontalAlignment = 0;
                stackIn_14_0 = this.offenceButtons[var16];
                stackIn_15_1 = (targetName != null);
                stackIn_14_0.inputEnabled = stackIn_15_1;
                this.content.addChild(this.offenceButtons[var16], 75);
              }
            }
            this.targetName = new StringBuilder(12);
            if (targetName != null) {
              discarded$0 = this.targetName.append(targetName);
            }
            var16Lifetime2 = 0;
            var17 = titleStyle.font.a(is.field_g);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = titleStyle.font.a(SpellCastAction.field_y);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = titleStyle.font.a(op.field_d);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; CampaignMenuEntry.field_F > var17Lifetime4; var17Lifetime4++) {
              if (this.offenceButtons[var17Lifetime4] != null) {
                var18 = this.offenceButtons[var17Lifetime4].getPreferredWidth(92);
                if (var16Lifetime2 < var18) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(titleStyle, var18Lifetime3, var28[0], var16Lifetime2, is.field_g, 24);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.offenceButtons[6], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.offenceButtons[9], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.offenceButtons[5], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.offenceButtons[7], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.offenceButtons[15], var18Lifetime3);
            var18Lifetime3 = this.a(var16Lifetime2, 2, var28[0], this.offenceButtons[4], var18Lifetime3);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(titleStyle, var18Lifetime4, var28[1], var16Lifetime2, SpellCastAction.field_y, 24);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.offenceButtons[16], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.offenceButtons[17], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.offenceButtons[18], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.offenceButtons[19], var18Lifetime4);
            var18Lifetime4 = this.a(var16Lifetime2, 2, var28[1], this.offenceButtons[20], var18Lifetime4);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(titleStyle, var18Lifetime5, var28[2], var16Lifetime2, op.field_d, 24);
            var18Lifetime5 = this.a(var16Lifetime2, 2, var28[2], this.offenceButtons[13], var18Lifetime5);
            var18Lifetime5 = this.a(var16Lifetime2, 2, var28[2], this.offenceButtons[21], var18Lifetime5);
            var18Lifetime5 = this.a(var16Lifetime2, 2, var28[2], this.offenceButtons[11], var18Lifetime5);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + var16Lifetime2 * 3;
            var20 = this.title.getPreferredWidth(116);
            if (var19 < var20) {
              var19 = var20;
            }
            if (null != this.muteControl) {
              var20Lifetime2 = this.muteControl.measureRowWidth(79, 4);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.title.setBounds(24, -20500, 13 + (var19 + 13), 0, 0);
            this.closeButton.setBounds(15, -20500, 15, 5, -20 + this.title.width);
            var21 = 10;
            this.instructions.setBounds(jn.field_d * 2, -20500, var19, var21, 13);
            var21 = var21 + jn.field_d * 2;
            this.helpText.setBounds(2 * jn.field_d, -20500, var19, var21, 13);
            var21 = var21 + (10 + 2 * jn.field_d);
            this.targetNameComponent.setBounds(jn.field_d, -20500, 0, var21, 0);
            var21 = var21 + (10 + jn.field_d);
            if (null != this.muteControl) {
              var20Lifetime3 = this.muteControl.measureRowWidth(93, 4);
              this.muteControl.setLayout((byte) 120, var21, 4, jn.field_d, 13 + (-var20Lifetime3 + var19) / 2, var20Lifetime3);
              var21 = var21 + (10 + jn.field_d);
            }
            var28[0].setBounds(var17Lifetime5, -20500, var16Lifetime2, var21, 13);
            var28[1].setBounds(var17Lifetime5, -20500, var16Lifetime2, var21, 26 + var16Lifetime2);
            var28[2].setBounds(var17Lifetime5, -20500, var16Lifetime2, var21, 26 + (2 * var16Lifetime2 + 13));
            var22 = var21;
            this.content.setBounds(10 + var17Lifetime5 + var22, -20500, var19 + 13 + 13, 24, 0);
            this.content.skinSprites = tq.a(11579568, false, this.content.height, 2105376, 3, 8421504);
            var23 = var19 + 26;
            var24 = 10 + (var17Lifetime5 + (var22 + 24));
            var25 = jp.a(anchorX, anchorWidth, var23, -1);
            var26 = pd.a(var24, 0, anchorY, anchorHeight);
            this.setBounds(var24, -20500, var23, var26, var25);
            return;
          }
          this.instructions = new ClientUiComponent(0L, textStyle, ot.field_F);
          this.instructions.horizontalAlignment = 1;
          this.instructions.textColour = 11184810;
          this.content.addChild(this.instructions, 43);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.instructions.font.c(this.instructions.text, var15_int);
          this.instructions.setBounds(jn.field_d * var17Lifetime1, -20500, var15_int, var16Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + jn.field_d * var17Lifetime1;
          this.content.setBounds(var16Lifetime1 + 10, -20500, 13 + (var15_int + 13), 24, 0);
          this.content.skinSprites = tq.a(11579568, false, this.content.height, 2105376, 3, 8421504);
          var18Lifetime1 = 13 + var15_int + 13;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = jp.a(anchorX, anchorWidth, var18Lifetime1, -1);
          var21Lifetime1 = pd.a(var19Lifetime1, 0, anchorY, anchorHeight);
          this.setBounds(var19Lifetime1, -20500, var18Lifetime1, var21Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("i.<init>(").append(anchorX).append(',').append(anchorY).append(',').append(anchorWidth).append(',').append(anchorHeight).append(',').append(unusedReportPacketOpcode).append(',');
          if (style == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (titleStyle == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (closeStyle == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (textStyle == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (muteStyle == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (offenceStyle == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (targetName == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(accountId).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        cd.a(108, param2, param1, 2);
        if (param0) {
          RgbSprite[] var4 = (RgbSprite[]) null;
          ReportAbuseDialog.drawNineSlice((RgbSprite[]) null, -22, 63, (byte) 45, 53, 9);
        }
    }

    static {
        field_Ob = "<%0> is already on your friend list.";
        field_Nb = ce.a(-30);
    }
}
