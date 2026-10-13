/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReportAbuseDialog extends UiComponent {
    private UiComponent body;
    long reportTargetId;
    static String field_cc;
    private UiComponent[] reasonButtons;
    private UiComponent title;
    private StateIconLabel muteControl;
    private UiComponent nameInstructions;
    private int keyboardResult;
    static UiComponent field_Qb;
    private UiComponent closeButton;
    private UiComponent nameDisplay;
    static UiComponent field_Zb;
    private StringBuilder reportedName;
    private UiComponent instructions;

    final static boolean i(int param0) {
        if (param0 != 0) {
          ReportAbuseDialog.i(79);
          return true;
        }
        return true;
    }

    private final int appendReasonHeading(int y, UiComponent styleTemplate, int width, String text, UiComponent column, byte obfuscationGuard) {
        UiComponent heading = null;
        RuntimeException var7_ref = null;
        int nextY = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -53) {
            this.updateAndPollReason(true, -62);
          }
          heading = new UiComponent(0L, styleTemplate, 0, y, width, 24, text);
          y += 32;
          column.addChild(heading, 0);
          nextY = y;
          return nextY;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("am.F(").append(y).append(',');
          if (styleTemplate == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(width).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (column == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean handleCancelKey(byte obfuscationGuard) {
        if (this.keyboardResult != -2) {
          return false;
        }
        if (MeshAttributeRecord.currentKeyCode == 13) {
          this.keyboardResult = -1;
        }
        if (obfuscationGuard < 61) {
          ReportAbuseDialog.k(105);
        }
        return true;
    }

    private final int appendReasonButton(UiComponent column, byte obfuscationGuard, int y, UiComponent button, int width) {
        int guardDivision = 0;
        RuntimeException var6 = null;
        int buttonHeight = 0;
        int nextY = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          y += 8;
          guardDivision = -87 / ((obfuscationGuard + 73) / 46);
          buttonHeight = button.font.measureWrappedHeight(button.text, width - button.textInset * 2, button.lineSpacing);
          button.setBounds(buttonHeight, y, 0, width, (byte) 64);
          column.addChild(button, 0);
          y = y + (0 + buttonHeight);
          nextY = y;
          return nextY;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("am.I(");
          if (column == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(obfuscationGuard).append(',').append(y).append(',');
          if (button == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(width).append(')').toString());
        }
    }

    final String getReportedName(int obfuscationGuard) {
        if (obfuscationGuard < 93) {
          this.updateAndPollReason(true, -113);
        }
        return this.reportedName.toString();
    }

    public static void k(int param0) {
        field_Qb = null;
        field_Zb = null;
        field_cc = null;
        if (param0 != 8421504) {
          field_cc = (String) null;
        }
    }

    final boolean isMuteRequested(int obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard != 72) {
          this.reasonButtons = (UiComponent[]) null;
        }
        stackIn_6_0 = (this.muteControl != null) && (this.muteControl.selected);
        return stackIn_6_0;
    }

    ReportAbuseDialog(int anchorX, int anchorY, int anchorWidth, int anchorHeight, int unusedOption, UiComponent styleTemplate, UiComponent titleStyle, UiComponent closeStyle, UiComponent textStyle, StateIconLabel muteStyle, UiComponent reasonStyle, String playerName, long reportTargetId) {
        super(0L, styleTemplate);
        StringBuilder ignoredNameAppend = null;
        int infoContentWidth = 0;
        UiComponent[] unusedColumnAlias = null;
        int reasonId = 0;
        int firstHeadingWidth = 0;
        int reasonWidth = 0;
        int contentWidth = 0;
        int titleWidth = 0;
        int nextY = 0;
        int columnsY = 0;
        int popupWidth = 0;
        int popupHeight = 0;
        int popupX = 0;
        int popupY = 0;
        UiComponent[] reasonColumns = null;
        Object stackIn_8_0;
        StateIconLabel stackIn_8_1;
        StateIconLabel stackIn_8_2;
        long muteControlId;
        StateIconLabel muteStyleTemplate;
        Object stackIn_9_0;
        StateIconLabel stackIn_9_1;
        StateIconLabel stackIn_9_2;
        String muteCaption;
        UiComponent reasonButton = null;
        boolean targetKnown = false;
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
        StateIconLabel stackIn_8_1Lifetime1;
        StateIconLabel stackIn_8_2Lifetime1;
        Object stackIn_9_0Lifetime1;
        StateIconLabel stackIn_9_1Lifetime1;
        StateIconLabel stackIn_9_2Lifetime1;
        int infoNextY;
        int infoLineCount;
        int infoPopupWidth;
        int infoPopupHeight;
        int infoPopupX;
        int infoPopupY;
        int columnWidth;
        int secondHeadingWidth;
        int thirdHeadingWidth;
        int measuredReasonId;
        int columnHeight;
        int unusedColumnY;
        int firstColumnY;
        int secondColumnY;
        int thirdColumnY;
        int muteWidthForDialog;
        int muteWidthForBounds;
        this.keyboardResult = -2;
        try {
          this.reportTargetId = reportTargetId;
          this.title = new UiComponent(0L, titleStyle, r.field_B.toUpperCase());
          this.title.horizontalAlignment = 1;
          this.addChild(this.title, 0);
          this.closeButton = new UiComponent(0L, closeStyle);
          this.title.addChild(this.closeButton, 0);
          this.body = new UiComponent(0L, (UiComponent) null);
          this.addChild(this.body, 0);
          if (playerName != null) {
            this.instructions = new UiComponent(0L, textStyle, om.field_rc);
            this.instructions.horizontalAlignment = 1;
            this.instructions.textColor = 11184810;
            this.body.addChild(this.instructions, 0);
            this.nameInstructions = new UiComponent(0L, textStyle, wd.field_D);
            this.nameInstructions.horizontalAlignment = 1;
            this.nameInstructions.textColor = 11184810;
            this.body.addChild(this.nameInstructions, 0);
            this.nameDisplay = new UiComponent(0L, textStyle);
            this.nameDisplay.textColor = 16764006;
            this.body.addChild(this.nameDisplay, 0);
            this.nameDisplay.textSuffix = "|";
            if (!(gh.field_f < 5) ||
              !(QuickChatHelpDialog.field_Yb < 2)) {
              regionExit1: {
                stackIn_8_0 = this;
                stackIn_8_1 = null;
                stackIn_8_2 = null;
                muteControlId = 0L;
                muteStyleTemplate = (StateIconLabel) (muteStyle);
                if (gh.field_f < 7) {
                  stackIn_8_0Lifetime1 = this;
                  stackIn_8_1Lifetime1 = null;
                  stackIn_8_2Lifetime1 = null;
                  if (2 > QuickChatHelpDialog.field_Yb) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    muteCaption = nk.field_e;
                    break regionExit1;
                  }
                }
                stackIn_9_0Lifetime1 = this;
                stackIn_9_1Lifetime1 = null;
                stackIn_9_2Lifetime1 = null;
                muteCaption = ek.field_gb;
              }
              this.muteControl = new StateIconLabel(muteControlId, muteStyleTemplate, muteCaption);
              this.body.addChild(this.muteControl, 0);
            }
            reasonColumns = new UiComponent[3];
            unusedColumnAlias = reasonColumns;
            reasonColumns[0] = new UiComponent(0L, (UiComponent) null);
            this.body.addChild(reasonColumns[0], 0);
            reasonColumns[1] = new UiComponent(0L, (UiComponent) null);
            this.body.addChild(reasonColumns[1], 0);
            reasonColumns[2] = new UiComponent(0L, (UiComponent) null);
            this.body.addChild(reasonColumns[2], 0);
            this.reasonButtons = new UiComponent[rg.field_a];
            for (reasonId = 0; reasonId < rg.field_a; reasonId++) {
              if (kd.field_d[reasonId] != null) {
                this.reasonButtons[reasonId] = new UiComponent(0L, reasonStyle, kd.field_d[reasonId]);
                this.reasonButtons[reasonId].horizontalAlignment = 0;
                reasonButton = this.reasonButtons[reasonId];
                targetKnown = (playerName != null);
                reasonButton.enabled = targetKnown;
                this.body.addChild(this.reasonButtons[reasonId], 0);
              }
            }
            this.reportedName = new StringBuilder(12);
            if (playerName != null) {
              ignoredNameAppend = this.reportedName.append(playerName);
            }
            columnWidth = 0;
            firstHeadingWidth = titleStyle.font.measureText(DualLinkNode.field_o);
            if (firstHeadingWidth > columnWidth) {
              columnWidth = firstHeadingWidth;
            }
            secondHeadingWidth = titleStyle.font.measureText(SaveResultsPromptScreen.field_r);
            if (columnWidth < secondHeadingWidth) {
              columnWidth = secondHeadingWidth;
            }
            thirdHeadingWidth = titleStyle.font.measureText(nh.field_d);
            if (columnWidth < thirdHeadingWidth) {
              columnWidth = thirdHeadingWidth;
            }
            for (measuredReasonId = 0; measuredReasonId < rg.field_a; measuredReasonId++) {
              if (null != this.reasonButtons[measuredReasonId]) {
                reasonWidth = this.reasonButtons[measuredReasonId].getContentWidth(95);
                if (columnWidth < reasonWidth) {
                  columnWidth = reasonWidth;
                }
              }
            }
            if (columnWidth > 140) {
              columnWidth = 140;
            }
            columnHeight = 0;
            unusedColumnY = 0;
            firstColumnY = 0;
            firstColumnY = this.appendReasonHeading(firstColumnY, titleStyle, columnWidth, DualLinkNode.field_o, reasonColumns[0], (byte) -53);
            firstColumnY = this.appendReasonButton(reasonColumns[0], (byte) -128, firstColumnY, this.reasonButtons[6], columnWidth);
            firstColumnY = this.appendReasonButton(reasonColumns[0], (byte) -21, firstColumnY, this.reasonButtons[9], columnWidth);
            firstColumnY = this.appendReasonButton(reasonColumns[0], (byte) -119, firstColumnY, this.reasonButtons[5], columnWidth);
            firstColumnY = this.appendReasonButton(reasonColumns[0], (byte) 113, firstColumnY, this.reasonButtons[7], columnWidth);
            firstColumnY = this.appendReasonButton(reasonColumns[0], (byte) -126, firstColumnY, this.reasonButtons[15], columnWidth);
            firstColumnY = this.appendReasonButton(reasonColumns[0], (byte) -125, firstColumnY, this.reasonButtons[4], columnWidth);
            if (firstColumnY > columnHeight) {
              columnHeight = firstColumnY;
            }
            secondColumnY = 0;
            secondColumnY = this.appendReasonHeading(secondColumnY, titleStyle, columnWidth, SaveResultsPromptScreen.field_r, reasonColumns[1], (byte) -53);
            secondColumnY = this.appendReasonButton(reasonColumns[1], (byte) 117, secondColumnY, this.reasonButtons[16], columnWidth);
            secondColumnY = this.appendReasonButton(reasonColumns[1], (byte) 36, secondColumnY, this.reasonButtons[17], columnWidth);
            secondColumnY = this.appendReasonButton(reasonColumns[1], (byte) -2, secondColumnY, this.reasonButtons[18], columnWidth);
            secondColumnY = this.appendReasonButton(reasonColumns[1], (byte) 2, secondColumnY, this.reasonButtons[19], columnWidth);
            secondColumnY = this.appendReasonButton(reasonColumns[1], (byte) -120, secondColumnY, this.reasonButtons[20], columnWidth);
            if (secondColumnY > columnHeight) {
              columnHeight = secondColumnY;
            }
            thirdColumnY = 0;
            thirdColumnY = this.appendReasonHeading(thirdColumnY, titleStyle, columnWidth, nh.field_d, reasonColumns[2], (byte) -53);
            thirdColumnY = this.appendReasonButton(reasonColumns[2], (byte) -127, thirdColumnY, this.reasonButtons[13], columnWidth);
            thirdColumnY = this.appendReasonButton(reasonColumns[2], (byte) -119, thirdColumnY, this.reasonButtons[21], columnWidth);
            thirdColumnY = this.appendReasonButton(reasonColumns[2], (byte) -121, thirdColumnY, this.reasonButtons[11], columnWidth);
            if (columnHeight < thirdColumnY) {
              columnHeight = thirdColumnY;
            }
            contentWidth = 26 + columnWidth * 3;
            titleWidth = this.title.getContentWidth(87);
            if (contentWidth < titleWidth) {
              contentWidth = titleWidth;
            }
            if (this.muteControl != null) {
              muteWidthForDialog = this.muteControl.measureIconLabelWidth((byte) 11, 4);
              if (muteWidthForDialog > contentWidth) {
                contentWidth = muteWidthForDialog;
              }
            }
            this.title.setBounds(24, 0, 0, contentWidth + 13 + 13, (byte) 64);
            this.closeButton.setBounds(15, 5, this.title.width - 20, 15, (byte) 64);
            nextY = 10;
            this.instructions.setBounds(np.uiRowHeight * 2, nextY, 13, contentWidth, (byte) 64);
            nextY = nextY + np.uiRowHeight * 2;
            this.nameInstructions.setBounds(2 * np.uiRowHeight, nextY, 13, contentWidth, (byte) 64);
            nextY = nextY + (np.uiRowHeight * 2 + 10);
            this.nameDisplay.setBounds(np.uiRowHeight, nextY, 0, 0, (byte) 64);
            nextY = nextY + (10 + np.uiRowHeight);
            if (this.muteControl != null) {
              muteWidthForBounds = this.muteControl.measureIconLabelWidth((byte) 11, 4);
              this.muteControl.setIconLabelBounds(muteWidthForBounds, 4, np.uiRowHeight, nextY, true, (-muteWidthForBounds + contentWidth) / 2 + 13);
              nextY = nextY + (np.uiRowHeight + 10);
            }
            reasonColumns[0].setBounds(columnHeight, nextY, 13, columnWidth, (byte) 64);
            reasonColumns[1].setBounds(columnHeight, nextY, columnWidth + 13 + 13, columnWidth, (byte) 64);
            reasonColumns[2].setBounds(columnHeight, nextY, 39 + columnWidth * 2, columnWidth, (byte) 64);
            columnsY = nextY;
            this.body.setBounds(columnsY + columnHeight + 10, 24, 0, 13 + (contentWidth + 13), (byte) 64);
            this.body.frameSprites = na.a(false, 8421504, 3, 11579568, this.body.height, 2105376);
            popupWidth = 13 + contentWidth + 13;
            popupHeight = 10 + columnsY + 24 + columnHeight;
            popupX = OptionsScreen.choosePopupX(-1, popupWidth, anchorX, anchorWidth);
            popupY = ContextMenu.choosePopupY(popupHeight, anchorY, anchorHeight, 120);
            this.setBounds(popupHeight, popupY, popupX, popupWidth, (byte) 64);
            return;
          }
          this.instructions = new UiComponent(0L, textStyle, ContextMenu.field_Ub);
          this.instructions.textColor = 11184810;
          this.instructions.horizontalAlignment = 1;
          this.body.addChild(this.instructions, 0);
          infoContentWidth = 226;
          infoNextY = 10;
          infoLineCount = this.instructions.font.countWrappedLines(this.instructions.text, infoContentWidth);
          this.instructions.setBounds(np.uiRowHeight * infoLineCount, infoNextY, 13, infoContentWidth, (byte) 64);
          infoNextY = infoNextY + infoLineCount * np.uiRowHeight;
          this.body.setBounds(10 + infoNextY, 24, 0, 13 + (infoContentWidth + 13), (byte) 64);
          this.body.frameSprites = na.a(false, 8421504, 3, 11579568, this.body.height, 2105376);
          infoPopupWidth = infoContentWidth + 13 + 13;
          infoPopupHeight = infoNextY + 34;
          infoPopupX = OptionsScreen.choosePopupX(-1, infoPopupWidth, anchorX, anchorWidth);
          infoPopupY = ContextMenu.choosePopupY(infoPopupHeight, anchorY, anchorHeight, -93);
          this.setBounds(infoPopupHeight, infoPopupY, infoPopupX, infoPopupWidth, (byte) 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("am.<init>(").append(anchorX).append(',').append(anchorY).append(',').append(anchorWidth).append(',').append(anchorHeight).append(',').append(unusedOption).append(',');
          if (styleTemplate == null) {
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
          if (reasonStyle == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (playerName == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(reportTargetId).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1) {
        try {
          param0[75] = 2;
          param0[79] = -2;
          param0[69] = 4;
          param0[67] = -1;
          param0[77] = 4;
          param0[78] = 5;
          param0[74] = 9;
          param0[70] = param1;
          param0[73] = 5;
          param0[64] = -2;
          param0[71] = 1;
          param0[76] = 6;
          param0[72] = -1;
          param0[65] = -2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "am.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int updateAndPollReason(boolean inputEnabled, int obfuscationGuard) {
        int reasonId = 0;
        StateIconLabel muteControl = null;
        boolean muteSelected = false;
        UiComponent reasonButton = null;
        boolean hasReportedName = false;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 8421504) {
          field_Qb = (UiComponent) null;
        }
        this.updateRoot(inputEnabled, -15211);
        if (this.nameDisplay != null) {
          this.nameDisplay.text = this.reportedName.toString();
          this.nameDisplay.localX = (this.width - this.nameDisplay.font.measureText(this.nameDisplay.text)) / 2;
          this.nameDisplay.width = -this.nameDisplay.localX + this.width;
          if (null != this.muteControl &&
            0 != this.muteControl.pressedButton) {
            muteControl = this.muteControl;
            muteSelected = !(this.muteControl.selected);
            muteControl.selected = muteSelected;
          }
          for (reasonId = 0; reasonId < rg.field_a; reasonId++) {
            if (null != this.reasonButtons[reasonId]) {
              reasonButton = this.reasonButtons[reasonId];
              hasReportedName = !(this.reportedName.length() <= 0);
              reasonButton.enabled = hasReportedName;
              if (this.reasonButtons[reasonId].enabled &&
                this.reasonButtons[reasonId].pressedButton != 0) {
                return reasonId;
              }
            }
          }
        }
        if (this.closeButton.pressedButton != 0) {
          return -1;
        }
        if (inputEnabled &&
          0 != BackgroundScene.pressedButton &&
          this.pressedButton == 0) {
          return -1;
        }
        return this.keyboardResult;
    }

    static {
    }
}
