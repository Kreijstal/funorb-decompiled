/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportAbuseDialog extends Widget {
    private Widget rulesHelpText;
    private StringBuilder reportedNameBuilder;
    private Widget header;
    long targetPlayerKey;
    private int result;
    private Widget body;
    private Widget instructions;
    private SelectableIconLabelWidget muteCheckbox;
    private Widget closeButton;
    private Widget[] ruleButtons;
    private Widget reportedNameLabel;

    final boolean isMuteSelected(byte param0) {
        int discarded$1 = 0;
        Widget var3;
        boolean stackIn_6_0 = false;
        if (param0 >= -59) {
          var3 = (Widget) null;
          discarded$1 = this.addCategoryHeading(44, (Widget) null, (String) null, 120, 54, (Widget) null);
        }
        stackIn_6_0 = (null != this.muteCheckbox) && (this.muteCheckbox.field_J);
        return stackIn_6_0;
    }

    final String getReportedName(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.reportedNameBuilder.toString();
    }

    final boolean pollPending(int param0) {
        if (this.result != -2) {
          return false;
        }
        if (13 == SetBombletSprayProjectileDamage.field_o) {
          this.result = -1;
        }
        if (param0 != -15244) {
          this.targetPlayerKey = 44L;
          return true;
        }
        return true;
    }

    private final int addRuleButton(Widget param0, int param1, int param2, Widget param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 += 8;
          var6_int = param3.font.getParagraphHeight(param3.text, -(param3.field_w * 2) + param2, param3.field_D);
          param3.setBounds(0, 125, param2, param1, var6_int);
          param1 = param1 + (var6_int - 0);
          if (param4 != 28488) {
            this.reportedNameLabel = (Widget) null;
          }
          param0.addChild(param4 ^ -28025, param3);
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("bwa.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    ReportAbuseDialog(int param0, int param1, int param2, int param3, int param4, Widget param5, Widget param6, Widget param7, Widget param8, SelectableIconLabelWidget param9, Widget param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        int var15_int = 0;
        Widget[] var15 = null;
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
        Widget[] var28 = null;
        Object stackIn_8_0;
        SelectableIconLabelWidget stackIn_8_1;
        SelectableIconLabelWidget stackIn_8_2;
        long stackIn_8_3;
        SelectableIconLabelWidget stackIn_8_4;
        Object stackIn_9_0;
        SelectableIconLabelWidget stackIn_9_1;
        SelectableIconLabelWidget stackIn_9_2;
        String stackIn_9_5;
        Widget stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
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
        RuntimeException var15_ref = null;
        Object stackIn_8_0Lifetime1;
        SelectableIconLabelWidget stackIn_8_1Lifetime1;
        SelectableIconLabelWidget stackIn_8_2Lifetime1;
        Object stackIn_9_0Lifetime1;
        SelectableIconLabelWidget stackIn_9_1Lifetime1;
        SelectableIconLabelWidget stackIn_9_2Lifetime1;
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
        this.result = -2;
        try {
          this.targetPlayerKey = param12;
          this.header = new Widget(0L, param6, KaleidoscopeTextureOperation.field_j.toUpperCase());
          this.header.field_F = 1;
          this.addChild(-561, this.header);
          this.closeButton = new Widget(0L, param7);
          this.header.addChild(-561, this.closeButton);
          this.body = new Widget(0L, (Widget) null);
          this.addChild(-561, this.body);
          if (param11 != null) {
            this.instructions = new Widget(0L, param8, GetPointDefenceLaserProjectileInterceptDamage.field_p);
            this.instructions.field_Y = 11184810;
            this.instructions.field_F = 1;
            this.body.addChild(-561, this.instructions);
            this.rulesHelpText = new Widget(0L, param8, DualLinkNode.field_j);
            this.rulesHelpText.field_Y = 11184810;
            this.rulesHelpText.field_F = 1;
            this.body.addChild(-561, this.rulesHelpText);
            this.reportedNameLabel = new Widget(0L, param8);
            this.reportedNameLabel.field_Y = 16764006;
            this.body.addChild(-561, this.reportedNameLabel);
            this.reportedNameLabel.field_s = "|";
            if (!(FireGrapplesOrderDefinition.field_d < 5) ||
              !(SetAngularVelocitySustain.field_p < 2)) {
              regionExit1: {
                stackIn_8_0 = this;
                stackIn_8_1 = null;
                stackIn_8_2 = null;
                stackIn_8_3 = 0L;
                stackIn_8_4 = (SelectableIconLabelWidget) (param9);
                if (FireGrapplesOrderDefinition.field_d < 7) {
                  stackIn_8_0Lifetime1 = this;
                  stackIn_8_1Lifetime1 = null;
                  stackIn_8_2Lifetime1 = null;
                  if (SetAngularVelocitySustain.field_p < 2) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_5 = GetFighterBayAimarc.field_p;
                    break regionExit1;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                stackIn_9_5 = GetPointDefenceLaserProjectiles.field_p;
              }
              this.muteCheckbox = new SelectableIconLabelWidget(stackIn_8_3, stackIn_8_4, stackIn_9_5);
              this.body.addChild(-561, this.muteCheckbox);
            }
            var28 = new Widget[3];
            var15 = var28;
            var28[0] = new Widget(0L, (Widget) null);
            this.body.addChild(-561, var28[0]);
            var28[1] = new Widget(0L, (Widget) null);
            this.body.addChild(-561, var28[1]);
            var28[2] = new Widget(0L, (Widget) null);
            this.body.addChild(-561, var28[2]);
            this.ruleButtons = new Widget[SetFightersPerPlayerMaximum.field_o];
            for (var16 = 0; SetFightersPerPlayerMaximum.field_o > var16; var16++) {
              if (GetSniperCannonEnergyUsed.reportReasonLabels[var16] != null) {
                this.ruleButtons[var16] = new Widget(0L, param10, GetSniperCannonEnergyUsed.reportReasonLabels[var16]);
                this.ruleButtons[var16].field_F = 0;
                stackIn_15_0 = this.ruleButtons[var16];
                stackIn_16_1 = (param11 != null);
                stackIn_15_0.enabled = stackIn_16_1;
                this.body.addChild(-561, this.ruleButtons[var16]);
              }
            }
            this.reportedNameBuilder = new StringBuilder(12);
            if (param11 != null) {
              discarded$1 = this.reportedNameBuilder.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.font.getStringWidth(GetGrapplingHookCooldown.field_p);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.font.getStringWidth(CrossedWaveTextureOperation.field_n);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.font.getStringWidth(SetUseOffscreenRendering.field_p);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < SetFightersPerPlayerMaximum.field_o; var17Lifetime4++) {
              if (null != this.ruleButtons[var17Lifetime4]) {
                var18 = this.ruleButtons[var17Lifetime4].getPreferredWidth(80);
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
            var18Lifetime3 = this.addCategoryHeading(6300, var28[0], GetGrapplingHookCooldown.field_p, var16Lifetime2, var18Lifetime3, param6);
            var18Lifetime3 = this.addRuleButton(var28[0], var18Lifetime3, var16Lifetime2, this.ruleButtons[6], 28488);
            var18Lifetime3 = this.addRuleButton(var28[0], var18Lifetime3, var16Lifetime2, this.ruleButtons[9], 28488);
            var18Lifetime3 = this.addRuleButton(var28[0], var18Lifetime3, var16Lifetime2, this.ruleButtons[5], 28488);
            var18Lifetime3 = this.addRuleButton(var28[0], var18Lifetime3, var16Lifetime2, this.ruleButtons[7], 28488);
            var18Lifetime3 = this.addRuleButton(var28[0], var18Lifetime3, var16Lifetime2, this.ruleButtons[15], 28488);
            var18Lifetime3 = this.addRuleButton(var28[0], var18Lifetime3, var16Lifetime2, this.ruleButtons[4], 28488);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.addCategoryHeading(6300, var28[1], CrossedWaveTextureOperation.field_n, var16Lifetime2, var18Lifetime4, param6);
            var18Lifetime4 = this.addRuleButton(var28[1], var18Lifetime4, var16Lifetime2, this.ruleButtons[16], 28488);
            var18Lifetime4 = this.addRuleButton(var28[1], var18Lifetime4, var16Lifetime2, this.ruleButtons[17], 28488);
            var18Lifetime4 = this.addRuleButton(var28[1], var18Lifetime4, var16Lifetime2, this.ruleButtons[18], 28488);
            var18Lifetime4 = this.addRuleButton(var28[1], var18Lifetime4, var16Lifetime2, this.ruleButtons[19], 28488);
            var18Lifetime4 = this.addRuleButton(var28[1], var18Lifetime4, var16Lifetime2, this.ruleButtons[20], 28488);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.addCategoryHeading(6300, var28[2], SetUseOffscreenRendering.field_p, var16Lifetime2, var18Lifetime5, param6);
            var18Lifetime5 = this.addRuleButton(var28[2], var18Lifetime5, var16Lifetime2, this.ruleButtons[13], 28488);
            var18Lifetime5 = this.addRuleButton(var28[2], var18Lifetime5, var16Lifetime2, this.ruleButtons[21], 28488);
            var18Lifetime5 = this.addRuleButton(var28[2], var18Lifetime5, var16Lifetime2, this.ruleButtons[11], 28488);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = var16Lifetime2 * 3 + 26;
            var20 = this.header.getPreferredWidth(112);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.muteCheckbox != null) {
              var20Lifetime2 = this.muteCheckbox.measurePreferredWidth(4, 0);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.header.setBounds(0, 35, 13 + (var19 + 13), 0, 24);
            this.closeButton.setBounds(this.header.width - 20, 119, 15, 5, 15);
            var21 = 10;
            this.instructions.setBounds(13, 118, var19, var21, DialogMessagePanel.field_w * 2);
            var21 = var21 + 2 * DialogMessagePanel.field_w;
            this.rulesHelpText.setBounds(13, 122, var19, var21, DialogMessagePanel.field_w * 2);
            var21 = var21 + (DialogMessagePanel.field_w * 2 + 10);
            this.reportedNameLabel.setBounds(0, -104, 0, var21, DialogMessagePanel.field_w);
            var21 = var21 + (10 + DialogMessagePanel.field_w);
            if (this.muteCheckbox != null) {
              var20Lifetime3 = this.muteCheckbox.measurePreferredWidth(4, 0);
              this.muteCheckbox.setBoundsAndLayout((-var20Lifetime3 + var19) / 2 + 13, DialogMessagePanel.field_w, 4, var21, var20Lifetime3, false);
              var21 = var21 + (DialogMessagePanel.field_w + 10);
            }
            var28[0].setBounds(13, 122, var16Lifetime2, var21, var17Lifetime5);
            var28[1].setBounds(13 + (13 + var16Lifetime2), -106, var16Lifetime2, var21, var17Lifetime5);
            var28[2].setBounds(39 + 2 * var16Lifetime2, -128, var16Lifetime2, var21, var17Lifetime5);
            var22 = var21;
            this.body.setBounds(0, -94, var19 + 13 + 13, 24, 10 + var17Lifetime5 + var22);
            this.body.field_gb = ShieldInfo.createGradientNineSliceSprites(11579568, this.body.height, 2105376, 8421504, 104, 3);
            var23 = 26 + var19;
            var24 = 10 + (24 + (var22 + var17Lifetime5));
            var25 = QuickChatCategoryLoader.adjustPopupX((byte) -109, param0, param2, var23);
            var26 = PopupPositioning.adjustPopupY(param3, param1, var24, (byte) -16);
            this.setBounds(var25, 0, var23, var26, var24);
            return;
          }
          this.instructions = new Widget(0L, param8, GetPhysicsCollisionPhantomForceMultiplier.field_q);
          this.instructions.field_Y = 11184810;
          this.instructions.field_F = 1;
          this.body.addChild(-561, this.instructions);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.instructions.font.getLineCount(this.instructions.text, var15_int);
          this.instructions.setBounds(13, -65, var15_int, var16Lifetime1, DialogMessagePanel.field_w * var17Lifetime1);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * DialogMessagePanel.field_w;
          this.body.setBounds(0, 116, 13 + var15_int + 13, 24, var16Lifetime1 + 10);
          this.body.field_gb = ShieldInfo.createGradientNineSliceSprites(11579568, this.body.height, 2105376, 8421504, 117, 3);
          var18Lifetime1 = 13 + (var15_int + 13);
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = QuickChatCategoryLoader.adjustPopupX((byte) -109, param0, param2, var18Lifetime1);
          var21Lifetime1 = PopupPositioning.adjustPopupY(param3, param1, var19Lifetime1, (byte) -16);
          this.setBounds(var20Lifetime1, -77, var18Lifetime1, var21Lifetime1, var19Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("bwa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static boolean needsVertexGroups(int param0, byte param1, int param2) {
        if (param1 <= 118) {
          return true;
        }
        return (32 & param0) != 0 ? true : false;
    }

    private final int addCategoryHeading(int param0, Widget param1, String param2, int param3, int param4, Widget param5) {
        int discarded$1 = 0;
        Widget var7 = null;
        RuntimeException var7_ref = null;
        Widget var8 = null;
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
          var7 = new Widget(0L, param5, 0, param4, param3, 24, param2);
          if (param0 != 6300) {
            var8 = (Widget) null;
            discarded$1 = this.addCategoryHeading(-27, (Widget) null, (String) null, -91, 109, (Widget) null);
          }
          param1.addChild(-561, var7);
          param4 += 32;
          stackIn_3_0 = param4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("bwa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int updateAndGetReportReason(boolean param0, int param1) {
        int var3 = 0;
        SelectableIconLabelWidget stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        Widget stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = VoidHunters.field_G;
        this.updateInput(param0, 1332);
        if (null != this.reportedNameLabel) {
          this.reportedNameLabel.text = this.reportedNameBuilder.toString();
          this.reportedNameLabel.x = (this.width - this.reportedNameLabel.font.getStringWidth(this.reportedNameLabel.text)) / 2;
          this.reportedNameLabel.width = this.width - this.reportedNameLabel.x;
          if (this.muteCheckbox != null &&
            this.muteCheckbox.field_o != 0) {
            stackIn_7_0 = this.muteCheckbox;
            stackIn_8_1 = !(this.muteCheckbox.field_J);
            stackIn_7_0.field_J = stackIn_8_1;
          }
          for (var3 = 0; var3 < SetFightersPerPlayerMaximum.field_o; var3++) {
            if (null != this.ruleButtons[var3]) {
              stackIn_16_0 = this.ruleButtons[var3];
              stackIn_17_1 = !(0 >= this.reportedNameBuilder.length());
              stackIn_16_0.enabled = stackIn_17_1;
              if (this.ruleButtons[var3].enabled &&
                this.ruleButtons[var3].field_o != 0) {
                return var3;
              }
            }
          }
        }
        if (param1 != -8703) {
          return -41;
        }
        if (this.closeButton.field_o != 0) {
          return -1;
        }
        if (param0 &&
          SetDebrisPartitioned.field_o != 0 &&
          0 == this.field_o) {
          return -1;
        }
        return this.result;
    }

    static {
    }
}
