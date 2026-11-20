/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextInputWidget extends Widget {
    private int doubleClickWordEnd;
    private eab clipboardService;
    private Widget caretWidget;
    private boolean doubleClickSelection;
    private StringBuilder textBuffer;
    private boolean dragSelecting;
    private int caretPosition;
    private long lastClickTime;
    private int selectionHeight;
    Widget textWidget;
    private Widget selectionWidget;
    static gj field_xb;
    private int maximumLength;
    static String field_Jb;
    private int selectionAnchor;
    private mob pendingClipboardRequest;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 124) {
          TextInputWidget.clearSharedReferences((byte) 112);
        }
        field_xb = null;
        field_Jb = null;
    }

    final void setText(String param0, int param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        int dupTemp$1 = 0;
        try {
          if (param1 > -85) {
            eab var4 = (eab) null;
            this.setClipboardService(30, (eab) null);
          }
          this.textBuffer.setLength(0);
          var3_int = param0.length();
          if (this.maximumLength != -1 &&
            this.maximumLength < var3_int) {
            var3_int = this.maximumLength;
          }
          discarded$0 = this.textBuffer.append(param0.substring(0, var3_int));
          dupTemp$1 = this.textBuffer.length();
          this.selectionAnchor = dupTemp$1;
          this.caretPosition = dupTemp$1;
          this.textWidget.text = this.textBuffer.toString();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kw.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void collapseSelectionAt(byte param0, int param1) {
        if (param0 > -14) {
          String var4 = (String) null;
          this.setText((String) null, -20);
        }
        this.caretPosition = param1;
        this.selectionAnchor = param1;
    }

    final void setSelection(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int var5 = VoidHunters.field_G;
        int var4 = this.textBuffer.length();
        if (param2 < 0) {
          param2 = 0;
        } else {
          if (param2 > var4) {
            param2 = var4;
          }
        }
        if (param0 < 0) {
          param0 = 0;
        } else {
          if (var4 < param0) {
            param0 = var4;
          }
        }
        this.caretPosition = param0;
        this.selectionAnchor = param2;
        if (param1 != 31401) {
          discarded$0 = this.getCaretIndexAtX(-50, 68);
        }
    }

    private final int getCaretIndexAtX(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        var3 = 0;
        var4 = param1;
        var5 = this.textBuffer.length();
        while (param0 > var4) {
          if (var3 < var5) {
            incrementValue$1 = var3;
            var3++;
            var4 = var4 + this.textWidget.font.getCharacterAdvance(this.textBuffer.charAt(incrementValue$1));
            continue;
          }
          break;
        }
        return var3;
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
          this.lastClickTime = 87L;
        }
        this.setBounds(param1, -119, param0, param3, param2);
        this.textWidget.setBounds(0, -84, param0, 0, param2);
        this.caretWidget.setBounds(0, 123, param0, 0, param2);
        this.selectionHeight = -4 + param2;
    }

    private final void requestPaste(int param0) {
        if (null == this.clipboardService) {
          return;
        }
        this.pendingClipboardRequest = this.clipboardService.c(param0 - 10964);
        if (param0 != 11090) {
          this.dragSelecting = true;
        }
    }

    TextInputWidget(long param0, Widget param1, Widget param2, Widget param3) {
        this(param0, param1, param2, param3, -1);
    }

    final int getCaretPosition(int param0) {
        if (param0 != 0) {
          this.caretPosition = -109;
        }
        return this.caretPosition;
    }

    final void setClipboardService(int param0, eab param1) {
        try {
          if (param0 != -20640) {
            this.deleteSelection(false);
          }
          this.clipboardService = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kw.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void cutSelection(byte param0) {
        if (param0 < 38) {
          return;
        }
        if (this.clipboardService == null) {
          return;
        }
        this.copySelection(31960);
        this.deleteSelection(true);
    }

    final void updateInputAndSelection(byte param0) {
        try {
          int dupTemp$0 = 0;
          boolean stackIn_14_1 = false;
          int stackIn_32_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          long var3_long = 0L;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var5 = 0;
          int var6 = 0;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          var6 = VoidHunters.field_G;
          var2 = this.getCaretIndexAtX(-this.textWidget.field_t + (-this.screenX + PlayerGameData.field_b), param0 + 6);
          if (1 == this.field_o) {
            this.moveCaret(var2, 3047);
            this.dragSelecting = true;
            var3_long = wt.a(false);
            stackIn_14_1 = !(var3_long - this.lastClickTime >= 250L);
            this.doubleClickSelection = stackIn_14_1;
            if (this.doubleClickSelection) {
              this.selectionAnchor = this.getPreviousWordBoundary(-1);
              this.caretPosition = this.getNextWordBoundary(-10001);
              if (this.caretPosition > 0 &&
                32 == this.textBuffer.charAt(this.caretPosition - 1)) {
                this.caretPosition = this.caretPosition - 1;
              }
              this.doubleClickWordEnd = this.caretPosition;
            }
            this.lastClickTime = var3_long;
          } else {
            if (hu.field_b == 1 &&
              this.dragSelecting) {
              if (this.doubleClickSelection &&
                var2 < this.doubleClickWordEnd &&
                this.selectionAnchor < var2) {
                var2 = this.doubleClickWordEnd;
              }
              this.caretPosition = var2;
            } else {
              this.dragSelecting = false;
            }
          }
          if (!this.field_pb) {
            dupTemp$0 = this.textBuffer.length();
            this.selectionAnchor = dupTemp$0;
            this.caretPosition = dupTemp$0;
          }
          this.caretWidget.x = this.textWidget.font.getStringWidth(this.textBuffer.toString().substring(0, this.caretPosition));
          if (param0 != -6) {
            this.doubleClickSelection = true;
          }
          if (this.selectionAnchor != this.caretPosition) {
            var3 = this.textWidget.x + this.textWidget.font.getStringWidth(this.textBuffer.toString().substring(0, this.selectionAnchor));
            if (this.caretWidget.x <= var3) {
              stackIn_32_0 = this.caretWidget.x;
            } else {
              stackIn_32_0 = var3;
            }
            var4_int = stackIn_32_0;
            var5 = Math.abs(-this.caretWidget.x + var3);
            this.selectionWidget.setBounds(this.textWidget.field_t + var4_int, 116, var5, 2, this.selectionHeight);
          } else {
            this.selectionWidget.setBounds(this.caretWidget.x, -30, 0, 2, this.selectionHeight);
          }
          if (this.pendingClipboardRequest != null &&
            this.pendingClipboardRequest.field_f != 0) {
            var7 = (java.awt.datatransfer.Transferable) (this.pendingClipboardRequest.field_d);
            try {
              var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.deleteSelection(true);
              this.insertText(var8, false);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.pendingClipboardRequest = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void insertText(String param0, boolean param1) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        String discarded$8 = null;
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.maximumLength != -1) {
            var3_int = this.maximumLength - this.textBuffer.length();
            if (var3_int == 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.caretPosition != this.textBuffer.length()) {
            var4 = this.textBuffer.toString().substring(this.caretPosition, this.textBuffer.length());
            ServerTickFactory.resizeStringBuilder(this.caretPosition, false, this.textBuffer, ' ');
            discarded$5 = this.textBuffer.append(param0);
            discarded$6 = this.textBuffer.append(var4);
          } else {
            discarded$7 = this.textBuffer.append(param0);
          }
          this.textWidget.text = this.textBuffer.toString();
          this.caretPosition = this.textBuffer.length();
          if (param1) {
            discarded$8 = this.getSelectedText(-87);
          }
          this.selectionAnchor = this.caretPosition;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kw.FA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void clearText(boolean param0) {
        ServerTickFactory.resizeStringBuilder(0, !param0 ? true : false, this.textBuffer, ' ');
        if (!param0) {
          this.setSelection(97, -10, -98);
        }
        this.caretPosition = 0;
        this.selectionAnchor = 0;
        this.textWidget.text = this.textBuffer.toString();
    }

    private final void moveCaret(int param0, int param1) {
        this.caretPosition = param0;
        if (!SetMachineGunEnergyUsed.field_o[81]) {
          this.selectionAnchor = this.caretPosition;
        }
        if (param1 != 3047) {
          TextInputWidget.clearSharedReferences((byte) -20);
        }
    }

    private final int getPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (~this.caretPosition == param0) {
          return this.caretPosition;
        }
        for (var2 = this.caretPosition - 1; var2 > 0; var2--) {
          if (!LaserWeaponDefinition.isWordDelimiter(-126, this.textBuffer.charAt(var2 - 1))) {
            continue;
          }
          break;
        }
        return var2;
    }

    final boolean handleKey(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_22_0 = 0;
        int stackIn_41_0 = 0;
        int var4;
        String var5;
        if (param2 == 60) {
          return false;
        }
        if (62 == param2) {
          return false;
        }
        if (param1 != -1) {
          this.selectionWidget = (Widget) null;
        }
        if (param2 >= 32 &&
          param2 <= 126) {
          if (this.caretPosition != this.selectionAnchor) {
            this.deleteSelection(true);
          }
          if (this.maximumLength == -1 ||
            !(this.textBuffer.length() >= this.maximumLength)) {
            if (this.caretPosition == this.textBuffer.length()) {
              discarded$0 = this.textBuffer.append(param2);
            } else {
              var5 = this.textBuffer.toString().substring(this.caretPosition, this.textBuffer.length());
              ServerTickFactory.resizeStringBuilder(this.caretPosition, false, this.textBuffer, ' ');
              discarded$1 = this.textBuffer.append(param2);
              discarded$2 = this.textBuffer.append(var5);
            }
            this.textWidget.text = this.textBuffer.toString();
            this.caretPosition = this.caretPosition + 1;
            this.selectionAnchor = this.caretPosition;
          }
          return true;
        }
        if (85 != param0) {
          if (param0 == 101) {
            if (this.caretPosition != this.selectionAnchor) {
              this.deleteSelection(true);
              return true;
            }
            if (this.caretPosition < this.textBuffer.length()) {
              this.selectionAnchor = 1 + this.caretPosition;
              this.deleteSelection(true);
              return true;
            }
          } else {
            if (13 == param0) {
              this.clearText(true);
              return true;
            }
            if (96 != param0) {
              if (param0 == 97) {
                if (this.caretPosition < this.textBuffer.length()) {
                  if (SetMachineGunEnergyUsed.field_o[82]) {
                    stackIn_41_0 = this.getNextWordBoundary(-10001);
                  } else {
                    stackIn_41_0 = 1 + this.caretPosition;
                  }
                  var4 = stackIn_41_0;
                  this.moveCaret(var4, param1 + 3048);
                  return true;
                }
              } else {
                if (param0 == 102) {
                  this.moveCaret(0, 3047);
                  return true;
                }
                if (param0 == 103) {
                  this.moveCaret(this.textBuffer.length(), 3047);
                  return true;
                }
                if (SetMachineGunEnergyUsed.field_o[82] &&
                  param0 == 65) {
                  this.cutSelection((byte) 116);
                  return true;
                }
                if (SetMachineGunEnergyUsed.field_o[82] &&
                  param0 == 66) {
                  this.copySelection(param1 + 31961);
                  return true;
                }
                if (SetMachineGunEnergyUsed.field_o[82] &&
                  67 == param0) {
                  this.requestPaste(11090);
                  return true;
                }
              }
            } else {
              if (this.caretPosition > 0) {
                if (!SetMachineGunEnergyUsed.field_o[82]) {
                  stackIn_22_0 = this.caretPosition - 1;
                } else {
                  stackIn_22_0 = this.getPreviousWordBoundary(param1 + 0);
                }
                var4 = stackIn_22_0;
                this.moveCaret(var4, 3047);
                return true;
              }
            }
          }
        } else {
          if (this.caretPosition != this.selectionAnchor) {
            this.deleteSelection(true);
            return true;
          }
          if (this.caretPosition > 0) {
            this.selectionAnchor = -1 + this.caretPosition;
            this.deleteSelection(true);
            return true;
          }
        }
        return false;
    }

    private final String getSelectedText(int param0) {
        if (param0 > -46) {
          this.getCaretPosition(-108);
        }
        String var2 = this.textBuffer.toString();
        int var3 = this.caretPosition > this.selectionAnchor ? this.selectionAnchor : this.caretPosition;
        int var4 = this.caretPosition > this.selectionAnchor ? this.caretPosition : this.selectionAnchor;
        return var2.substring(var3, var4);
    }

    private TextInputWidget(long param0, Widget param1, Widget param2, Widget param3, int param4) {
        super(param0, param1);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.dragSelecting = false;
        this.lastClickTime = 0L;
        this.doubleClickWordEnd = -1;
        this.doubleClickSelection = false;
        try {
          this.maximumLength = param4;
          this.selectionWidget = new Widget(0L, param2);
          this.textWidget = new Widget(0L, param3);
          this.caretWidget = new Widget(0L, param3);
          this.field_T = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.maximumLength == -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.maximumLength;
          }
          this.textBuffer = new StringBuilder(stackIn_4_3);
          this.textWidget.text = this.textBuffer.toString();
          this.caretWidget.field_s = "|";
          this.caretWidget.text = "";
          this.children = new IntrusiveDeque();
          this.addChild(-561, this.selectionWidget);
          this.addChild(-561, this.textWidget);
          this.addChild(-561, this.caretWidget);
          this.field_pb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("kw.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final String getText(int param0) {
        if (param0 != -14453) {
          return (String) null;
        }
        return this.textBuffer.toString();
    }

    private final void copySelection(int param0) {
        if (null == this.clipboardService) {
          return;
        }
        if (param0 != 31960) {
          return;
        }
        String var2 = this.getSelectedText(-51);
        if (var2.length() == 0) {
          return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(this.getSelectedText(-100));
        this.clipboardService.a((byte) -45, (java.awt.datatransfer.Transferable) ((Object) var3));
    }

    private final int getNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != -10001) {
          this.collapseSelectionAt((byte) 4, 75);
        }
        var2 = this.textBuffer.length();
        if (var2 == this.caretPosition) {
          return this.caretPosition;
        }
        for (var3 = 1 + this.caretPosition; var3 < var2; var3++) {
          if (!LaserWeaponDefinition.isWordDelimiter(-113, this.textBuffer.charAt(var3 - 1))) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void deleteSelection(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        StringBuilder discarded$0 = null;
        if (this.selectionAnchor != this.caretPosition) {
          var2 = this.selectionAnchor >= this.caretPosition ? this.caretPosition : this.selectionAnchor;
          var3 = this.caretPosition <= this.selectionAnchor ? this.selectionAnchor : this.caretPosition;
          this.caretPosition = var2;
          this.selectionAnchor = var2;
          var4 = this.textBuffer.toString().substring(var3, this.textBuffer.length());
          ServerTickFactory.resizeStringBuilder(var2, !param0 ? true : false, this.textBuffer, ' ');
          discarded$0 = this.textBuffer.append(var4);
          this.textWidget.text = this.textBuffer.toString();
        }
        if (!param0) {
          this.doubleClickWordEnd = -102;
        }
    }

    static {
        field_Jb = "Shortcut Reference";
        field_xb = new gj();
    }
}
