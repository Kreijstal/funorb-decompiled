/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportAbuseDialog extends UiComponent {
    static PcmStreamMixer field_Xb;
    private UiComponent[] reasonButtons;
    static String mbIncludingGamename;
    private StringBuilder reportedName;
    private UiComponent closeButton;
    long reportTargetId;
    static IntegerSyntaxSupport field_Pb;
    private UiComponent nameDisplay;
    private StateIconLabel muteControl;
    private UiComponent instructions;
    private UiComponent title;
    private UiComponent nameInstructions;
    private UiComponent body;
    private int keyboardResult;
    static String loginEmail;
    static char[] field_Wb;
    static String textGameName;
    static int[][] field_ac;
    static int[] field_Ub;
    static int field_Nb;

    private final int appendReasonButton(UiComponent param0, int param1, int param2, UiComponent param3, int param4) {
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
          param2 += 8;
          if (param1 > -125) {
            ReportAbuseDialog.releaseStatics((byte) -116);
          }
          var6_int = param0.font.measureWrappedHeight(param0.text, -(param0.textInset * 2) + param4, param0.lineSpacing);
          param0.setBounds(param2, 2147483647, 0, param4, var6_int);
          param3.addChild(-93, param0);
          param2 = param2 + (var6_int - 0);
          stackIn_3_0 = param2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("wm.G(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean isMuteRequested(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -10459) {
          this.updateAndPollReason(true, 67);
        }
        stackIn_6_0 = (null != this.muteControl) && (this.muteControl.selected);
        return stackIn_6_0;
    }

    final int updateAndPollReason(boolean param0, int param1) {
        int var3 = 0;
        StateIconLabel stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        UiComponent stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var4;
        var4 = Pool.field_O;
        this.updateRoot(param0, false);
        if (this.nameDisplay != null) {
          this.nameDisplay.text = this.reportedName.toString();
          this.nameDisplay.localX = (this.width - this.nameDisplay.font.stringWidth(this.nameDisplay.text)) / 2;
          if (this.muteControl != null &&
            this.muteControl.pressedButton != 0) {
            stackIn_6_0 = this.muteControl;
            stackIn_7_1 = !(this.muteControl.selected);
            stackIn_6_0.selected = stackIn_7_1;
          }
          this.nameDisplay.width = -this.nameDisplay.localX + this.width;
          for (var3 = 0; var3 < ClientInputResetSupport.field_a; var3++) {
            if (this.reasonButtons[var3] != null) {
              stackIn_15_0 = this.reasonButtons[var3];
              stackIn_16_1 = !(this.reportedName.length() <= 0);
              stackIn_15_0.enabled = stackIn_16_1;
              if (this.reasonButtons[var3].enabled &&
                this.reasonButtons[var3].pressedButton != 0) {
                return var3;
              }
            }
          }
        }
        if (this.closeButton.pressedButton != 0) {
          return -1;
        }
        if (param0 &&
          MatchingTextValidator.field_s != 0 &&
          this.pressedButton == 0) {
          return -1;
        }
        if (param1 == -27403) {
          return this.keyboardResult;
        }
        return 85;
    }

    final static ClientException addExceptionContext(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_i = var2.field_i + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    ReportAbuseDialog(int param0, int param1, int param2, int param3, int param4, UiComponent param5, UiComponent param6, UiComponent param7, UiComponent param8, StateIconLabel param9, UiComponent param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        StateIconLabel stackIn_6_1;
        StateIconLabel stackIn_6_2;
        long stackIn_6_3;
        StateIconLabel stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        StateIconLabel stackIn_8_1;
        StateIconLabel stackIn_8_2;
        String stackIn_8_5;
        UiComponent stackIn_14_0 = null;
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
        UiComponent[] var15 = null;
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
        UiComponent[] var27 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        StateIconLabel stackIn_8_1Lifetime1;
        StateIconLabel stackIn_8_2Lifetime1;
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
        this.keyboardResult = -2;
        try {
          this.reportTargetId = param12;
          this.title = new UiComponent(0L, param6, GzipDecoder.raTitle.toUpperCase());
          this.title.horizontalAlignment = 1;
          this.addChild(66, this.title);
          this.closeButton = new UiComponent(0L, param7);
          this.title.addChild(-118, this.closeButton);
          this.body = new UiComponent(0L, (UiComponent) null);
          this.addChild(-107, this.body);
          if (param11 != null) {
            this.instructions = new UiComponent(0L, param8, TransformRotationSupport.raIntro);
            this.instructions.textColor = 11184810;
            this.instructions.horizontalAlignment = 1;
            this.body.addChild(11, this.instructions);
            this.nameInstructions = new UiComponent(0L, param8, Ball.raExplanation);
            this.nameInstructions.textColor = 11184810;
            this.nameInstructions.horizontalAlignment = 1;
            this.body.addChild(-101, this.nameInstructions);
            this.nameDisplay = new UiComponent(0L, param8);
            this.nameDisplay.textColor = 16764006;
            this.body.addChild(112, this.nameDisplay);
            this.nameDisplay.textSuffix = "|";
            if (!(GradientPaletteSupport.field_f < 5) ||
              !(TutorialController.field_i < 2)) {
              regionExit1: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (StateIconLabel) (param9);
                if (GradientPaletteSupport.field_f < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (TutorialController.field_i < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = AccountStateQuery.raSuggestmute;
                    break regionExit1;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = DialWidget.raMutethisplayer;
              }
              this.muteControl = new StateIconLabel(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.body.addChild(-121, this.muteControl);
            }
            var27 = new UiComponent[3];
            var15 = var27;
            var27[0] = new UiComponent(0L, (UiComponent) null);
            this.body.addChild(-101, var27[0]);
            var27[1] = new UiComponent(0L, (UiComponent) null);
            this.body.addChild(-118, var27[1]);
            var27[2] = new UiComponent(0L, (UiComponent) null);
            this.body.addChild(-117, var27[2]);
            this.reasonButtons = new UiComponent[ClientInputResetSupport.field_a];
            for (var16 = 0; var16 < ClientInputResetSupport.field_a; var16++) {
              if (LocalGameSetupScreen.field_L[var16] != null) {
                this.reasonButtons[var16] = new UiComponent(0L, param10, LocalGameSetupScreen.field_L[var16]);
                this.reasonButtons[var16].horizontalAlignment = 0;
                stackIn_14_0 = this.reasonButtons[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.enabled = stackIn_15_1;
                this.body.addChild(-128, this.reasonButtons[var16]);
              }
            }
            this.reportedName = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.reportedName.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.font.stringWidth(ShotRecord.rulePillar0);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.font.stringWidth(HotspotRectangle.rulePillar1);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.font.stringWidth(MembershipBenefitsScreen.rulePillar2);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; ClientInputResetSupport.field_a > var17Lifetime4; var17Lifetime4++) {
              if (this.reasonButtons[var17Lifetime4] != null) {
                var18 = this.reasonButtons[var17Lifetime4].getContentWidth(true);
                if (var18 > var16Lifetime2) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (140 < var16Lifetime2) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.appendReasonHeading(ShotRecord.rulePillar0, var18Lifetime3, var27[0], (byte) -124, param6, var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(this.reasonButtons[6], -126, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(this.reasonButtons[9], -128, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(this.reasonButtons[5], -128, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(this.reasonButtons[7], -128, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(this.reasonButtons[15], -127, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.appendReasonButton(this.reasonButtons[4], -127, var18Lifetime3, var27[0], var16Lifetime2);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.appendReasonHeading(HotspotRectangle.rulePillar1, var18Lifetime4, var27[1], (byte) -114, param6, var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(this.reasonButtons[16], -126, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(this.reasonButtons[17], -126, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(this.reasonButtons[18], -128, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(this.reasonButtons[19], -126, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.appendReasonButton(this.reasonButtons[20], -128, var18Lifetime4, var27[1], var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.appendReasonHeading(MembershipBenefitsScreen.rulePillar2, var18Lifetime5, var27[2], (byte) -124, param6, var16Lifetime2);
            var18Lifetime5 = this.appendReasonButton(this.reasonButtons[13], -128, var18Lifetime5, var27[2], var16Lifetime2);
            var18Lifetime5 = this.appendReasonButton(this.reasonButtons[21], -127, var18Lifetime5, var27[2], var16Lifetime2);
            var18Lifetime5 = this.appendReasonButton(this.reasonButtons[11], -127, var18Lifetime5, var27[2], var16Lifetime2);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 3 * var16Lifetime2 + 26;
            var20 = this.title.getContentWidth(true);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.muteControl != null) {
              var20Lifetime2 = this.muteControl.measureIconLabelWidth(4, 2154);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.title.setBounds(0, 2147483647, 0, 13 + var19 + 13, 24);
            this.closeButton.setBounds(5, 2147483647, -20 + this.title.width, 15, 15);
            var21 = 10;
            this.instructions.setBounds(var21, 2147483647, 13, var19, ArchiveIndex.field_x * 2);
            var21 = var21 + ArchiveIndex.field_x * 2;
            this.nameInstructions.setBounds(var21, 2147483647, 13, var19, ArchiveIndex.field_x * 2);
            var21 = var21 + (ArchiveIndex.field_x * 2 + 10);
            this.nameDisplay.setBounds(var21, 2147483647, 0, 0, ArchiveIndex.field_x);
            var21 = var21 + (10 + ArchiveIndex.field_x);
            if (null != this.muteControl) {
              var20Lifetime3 = this.muteControl.measureIconLabelWidth(4, 2154);
              this.muteControl.setIconLabelBounds(var21, 13 + (-var20Lifetime3 + var19) / 2, ArchiveIndex.field_x, false, var20Lifetime3, 4);
              var21 = var21 + (ArchiveIndex.field_x + 10);
            }
            var27[0].setBounds(var21, 2147483647, 13, var16Lifetime2, var17Lifetime5);
            var27[1].setBounds(var21, 2147483647, 13 + (var16Lifetime2 + 13), var16Lifetime2, var17Lifetime5);
            var27[2].setBounds(var21, 2147483647, 13 - (-(2 * var16Lifetime2) - 26), var16Lifetime2, var17Lifetime5);
            var22 = var21;
            this.body.setBounds(24, 2147483647, 0, 13 + (13 + var19), 10 + var22 + var17Lifetime5);
            this.body.frameSprites = NineSliceFrameSupport.buildNineSliceFrameSprites(32450, 3, 2105376, this.body.height, 11579568, 8421504);
            var23 = 13 + var19 + 13;
            var24 = 10 + var17Lifetime5 + (var22 + 24);
            var25 = DebugTuningSupport.adjustWidthForRightEdge(var23, param2, param0, 0);
            var26 = OpacityWidget.placePopupVertically(var24, param1, -1, param3);
            this.setBounds(var26, 2147483647, var25, var23, var24);
            return;
          }
          this.instructions = new UiComponent(0L, param8, ChatInputSupport.raIntroNoName);
          this.instructions.horizontalAlignment = 1;
          this.instructions.textColor = 11184810;
          this.body.addChild(123, this.instructions);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.instructions.font.countWrappedLines(this.instructions.text, var15_int);
          this.instructions.setBounds(var16Lifetime1, 2147483647, 13, var15_int, ArchiveIndex.field_x * var17Lifetime1);
          var16Lifetime1 = var16Lifetime1 + ArchiveIndex.field_x * var17Lifetime1;
          this.body.setBounds(24, 2147483647, 0, 13 + var15_int + 13, var16Lifetime1 + 10);
          this.body.frameSprites = NineSliceFrameSupport.buildNineSliceFrameSprites(32450, 3, 2105376, this.body.height, 11579568, 8421504);
          var18Lifetime1 = var15_int + 13 + 13;
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = DebugTuningSupport.adjustWidthForRightEdge(var18Lifetime1, param2, param0, 0);
          var21Lifetime1 = OpacityWidget.placePopupVertically(var19Lifetime1, param1, -1, param3);
          this.setBounds(var21Lifetime1, 2147483647, var20Lifetime1, var18Lifetime1, var19Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final boolean handleCancelKey(int param0) {
        if (this.keyboardResult != -2) {
          return false;
        }
        if (param0 == IterableDualLinkDeque.field_a) {
          this.keyboardResult = -1;
          return true;
        }
        return true;
    }

    final static void sendEncryptedBirthDate(int obfuscationGuard, int year, int month, int day) {
        FontPaletteSupport.field_b.position = 0;
        FontPaletteSupport.field_b.writeByte(12, false);
        FontPaletteSupport.field_b.writeInt(true, ValidationIconWidget.field_P.nextInt());
        if (obfuscationGuard >= -116) {
          field_Wb = (char[]) null;
        }
        FontPaletteSupport.field_b.writeInt(true, ValidationIconWidget.field_P.nextInt());
        FontPaletteSupport.field_b.writeByte(day, false);
        FontPaletteSupport.field_b.writeByte(month, false);
        FontPaletteSupport.field_b.writeShort((byte) -81, year);
        FontPaletteSupport.field_b.encryptRsa(ArchiveLoadSequence.field_l, 124, UiWidget.field_q);
        JaggrabDownloader.field_j.writeCipheredOpcode(false, 18);
        int fieldTemp$0 = JaggrabDownloader.field_j.position + 1;
        JaggrabDownloader.field_j.position = JaggrabDownloader.field_j.position + 1;
        int var4 = fieldTemp$0;
        JaggrabDownloader.field_j.writeBytes(FontPaletteSupport.field_b.payload, (byte) 0, 0, FontPaletteSupport.field_b.position);
        JaggrabDownloader.field_j.writeByteLengthPrefix(-var4 + JaggrabDownloader.field_j.position, true);
    }

    public static void releaseStatics(byte param0) {
        mbIncludingGamename = null;
        loginEmail = null;
        field_Wb = null;
        field_Ub = null;
        int var1 = 74 % ((param0 - 12) / 52);
        field_Pb = null;
        textGameName = null;
        field_Xb = null;
        field_ac = (int[][]) null;
    }

    final String getReportedName(int param0) {
        if (param0 != 1) {
          this.keyboardResult = -13;
        }
        return this.reportedName.toString();
    }

    private final int appendReasonHeading(String param0, int param1, UiComponent param2, byte param3, UiComponent param4, int param5) {
        int discarded$1 = 0;
        UiComponent var7 = null;
        RuntimeException var7_ref = null;
        UiComponent var8 = null;
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
          var7 = new UiComponent(0L, param4, 0, param1, param5, 24, param0);
          if (param3 > -98) {
            var8 = (UiComponent) null;
            discarded$1 = this.appendReasonHeading((String) null, -118, (UiComponent) null, (byte) -47, (UiComponent) null, -97);
          }
          param2.addChild(-111, var7);
          param1 += 32;
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("wm.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int measureMenuRowText(boolean selectable, int obfuscationGuard, String text) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 18) {
            ReportAbuseDialog.releaseStatics((byte) 15);
          }
          if (!selectable) {
            stackIn_6_0 = QuickChatMenu.field_ec.stringWidth(text);
            return stackIn_6_0;
          }
          stackIn_4_0 = HotspotRectangle.field_t.stringWidth(text);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wm.A(").append(selectable).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Xb = null;
        mbIncludingGamename = "(Including <%0>)";
        loginEmail = "Email: ";
        field_Pb = new IntegerSyntaxSupport();
        field_Wb = new char[]{(char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122};
        field_ac = new int[64][3];
        textGameName = "Funorb Pool";
    }
}
