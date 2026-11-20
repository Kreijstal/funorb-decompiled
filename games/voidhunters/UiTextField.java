/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiTextField extends UiFocusableComponent {
    private int doubleClickWordEnd;
    private boolean doubleClickSelection;
    private long lastClickTime;
    private long caretBlinkEpoch;
    private boolean keepCaretVisible;
    private int selectionAnchor;
    static java.awt.Frame field_E;
    private int maximumLength;
    static String field_F;
    private int caretPosition;

    private final void notifySubmitted(byte param0) {
        if (this.listener instanceof UiTextFieldListener) {
          ((UiTextFieldListener) (this.listener)).onSubmitted(-12409, this);
          if (param0 < 40) {
            field_E = (java.awt.Frame) null;
            return;
          }
          return;
        }
        if (param0 >= 40) {
          return;
        }
        field_E = (java.awt.Frame) null;
    }

    final static void updateTooltip(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          OpenGlVertexAttribute.field_a = OpenGlVertexAttribute.field_a + 1;
          if (GetBombletSprayProjectileOndamageParticles.pendingTooltipX == -1 &&
            -1 == EmailAvailabilityCheckFactory.pendingTooltipY) {
            EmailAvailabilityCheckFactory.pendingTooltipY = OpenGlFaceAttachment.field_b;
            GetBombletSprayProjectileOndamageParticles.pendingTooltipX = PlayerGameData.field_b;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(GetReadyRoomMutatorTime.field_o));
          } else {
            decompiledFrameRemainder0 = (null == GetReadyRoomMutatorTime.field_o);
          }
          if (decompiledFrameRemainder0) {
            if (!GetMissileLauncherAimarc.field_o) {
              if (PolygonContainment.field_b <= OpenGlVertexAttribute.field_a) {
                stackIn_17_0 = (OpenGlVertexAttribute.field_a < PolygonContainment.field_b + GetMessageMaxage.field_r) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              OpenGlVertexAttribute.field_a = 0;
            } else {
              if (GetMissileLauncherAimarc.field_o) {
                OpenGlVertexAttribute.field_a = PolygonContainment.field_b;
              } else {
                if (var2_int != 0) {
                  OpenGlVertexAttribute.field_a = PolygonContainment.field_b;
                } else {
                  OpenGlVertexAttribute.field_a = 0;
                }
              }
            }
            if (param0 == null) {
              if (var2_int != 0) {
                GetMissileLauncherAimarc.field_o = true;
              }
            } else {
              GetMissileLauncherAimarc.field_o = false;
            }
            GetBombletSprayReload.field_r = GetBombletSprayProjectileOndamageParticles.pendingTooltipX;
            SetTestActionLag.field_o = EmailAvailabilityCheckFactory.pendingTooltipY;
          }
          GetReadyRoomMutatorTime.field_o = param0;
          if (!GetMissileLauncherAimarc.field_o &&
            OpenGlVertexAttribute.field_a < PolygonContainment.field_b &&
            VariableConditionFactory.field_c) {
            OpenGlVertexAttribute.field_a = 0;
            GetBombletSprayReload.field_r = GetBombletSprayProjectileOndamageParticles.pendingTooltipX;
            SetTestActionLag.field_o = EmailAvailabilityCheckFactory.pendingTooltipY;
          }
          if (GetMissileLauncherAimarc.field_o &&
            GetBombletSprayProjectileDamage.field_o == OpenGlVertexAttribute.field_a) {
            GetMissileLauncherAimarc.field_o = false;
            OpenGlVertexAttribute.field_a = 0;
          }
          EmailAvailabilityCheckFactory.pendingTooltipY = -1;
          GetBombletSprayProjectileOndamageParticles.pendingTooltipX = -1;
          if (param1 == 5757) {
            return;
          }
          field_F = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("uf.P(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int getNextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = this.text.length();
        if (var2 == this.caretPosition) {
          return this.caretPosition;
        }
        var3 = this.caretPosition + 1;
        while (true) {
          if (var2 <= var3) {
            if (param0 != 62) {
              return 60;
            }
            return var3;
          }
          if (this.text.charAt(var3 - 1) != 32) {
            var3++;
            continue;
          }
          break;
        }
        if (param0 != 62) {
          return 60;
        }
        return var3;
    }

    private final void deleteSelection(byte param0) {
        int var3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.caretPosition != this.selectionAnchor) {
          var2 = this.selectionAnchor < this.caretPosition ? this.selectionAnchor : this.caretPosition;
          var3 = this.selectionAnchor < this.caretPosition ? this.caretPosition : this.selectionAnchor;
          this.selectionAnchor = var2;
          this.caretPosition = var2;
          this.text = this.text.substring(0, var2) + this.text.substring(var3, this.text.length());
          this.notifyTextChanged((byte) -55);
        }
        var2Lifetime1 = -86 / ((62 - param0) / 48);
    }

    private final void scrollCaretIntoView(int param0) {
        TextLayout var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        UiTextRenderer var9;
        var8 = VoidHunters.field_G;
        if (!this.keepCaretVisible) {
          this.textOffsetX = 0;
          this.textOffsetY = 0;
          return;
        }
        if (!(this.renderer instanceof UiTextRenderer)) {
          return;
        }
        var9 = (UiTextRenderer) ((Object) this.renderer);
        var3 = var9.getTextLayout((UiComponent) (this), 3);
        var4 = var3.getRightEdge(-18877);
        var5 = var9.getContentWidth((UiComponent) (this), (byte) 114);
        var6 = var9.getLineHeight(35) >> 1;
        if (-var6 + var5 > var4) {
          this.textOffsetY = 0;
          this.textOffsetX = 0;
          return;
        }
        if (param0 != 27151) {
          return;
        }
        var7 = this.textOffsetX + var3.getCaretX(this.caretPosition, param0 ^ -27235);
        if (var7 > var5 - var6) {
          this.textOffsetX = var5 - (var6 + (var7 - this.textOffsetX));
        } else {
          if (var6 > var7) {
            this.textOffsetX = this.textOffsetX + var6 - var7;
          }
        }
        if (this.textOffsetX > 0) {
          this.textOffsetX = 0;
          return;
        }
        if (this.textOffsetX >= var6 - var5) {
          return;
        }
        this.textOffsetX = -var5 + var6;
        return;
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.caretBlinkEpoch = MonotonicMillisClock.currentTimeMillis(false);
          if (param0 != -15834) {
            this.selectionAnchor = 81;
          }
          if (param3 != 60 &&
            62 != param3) {
            if (param3 >= 32 &&
              param3 <= 126) {
              if (this.caretPosition != this.selectionAnchor) {
                this.deleteSelection((byte) 120);
              }
              if (-1 == this.maximumLength ||
                !(this.text.length() >= this.maximumLength)) {
                if (this.caretPosition < this.text.length()) {
                  this.text = this.text.substring(0, this.caretPosition) + param3 + this.text.substring(this.caretPosition, this.text.length());
                  this.caretPosition = this.caretPosition + 1;
                  this.selectionAnchor = this.caretPosition;
                } else {
                  this.text = this.text + param3;
                  dupTemp$0 = this.text.length();
                  this.caretPosition = dupTemp$0;
                  this.selectionAnchor = dupTemp$0;
                }
                this.notifyTextChanged((byte) -55);
              }
              return true;
            }
            if (param1 == 85) {
              if (this.caretPosition != this.selectionAnchor) {
                this.deleteSelection((byte) 120);
                return true;
              }
              if (0 < this.caretPosition) {
                this.selectionAnchor = this.caretPosition - 1;
                this.deleteSelection((byte) 110);
                return true;
              }
            } else {
              if (param1 != 101) {
                if (param1 == 13) {
                  this.clearText(82);
                  return true;
                }
                if (param1 == 96) {
                  if (0 < this.caretPosition) {
                    if (SetMachineGunEnergyUsed.field_o[82]) {
                      stackIn_56_1 = this.getPreviousWordBoundary(param0 + 15834);
                    } else {
                      stackIn_56_1 = -1 + this.caretPosition;
                    }
                    this.moveCaret(stackIn_56_1, (byte) -74);
                    return true;
                  }
                } else {
                  if (param1 != 97) {
                    if (param1 == 102) {
                      this.moveCaret(0, (byte) -96);
                      return true;
                    }
                    if (param1 == 103) {
                      this.moveCaret(this.text.length(), (byte) -100);
                      return true;
                    }
                    if (param1 == 84) {
                      this.notifySubmitted((byte) 68);
                      return true;
                    }
                    if (SetMachineGunEnergyUsed.field_o[82] &&
                      param1 == 65) {
                      this.cutSelection(true);
                      return true;
                    }
                    if (SetMachineGunEnergyUsed.field_o[82] &&
                      param1 == 66) {
                      this.copySelection((byte) 24);
                      return true;
                    }
                    if (SetMachineGunEnergyUsed.field_o[82]) {
                      if (param1 != 67) {
                        return false;
                      }
                      this.pasteClipboard(7328);
                      return true;
                    }
                  } else {
                    if (this.caretPosition < this.text.length()) {
                      if (!SetMachineGunEnergyUsed.field_o[82]) {
                        stackIn_27_1 = this.caretPosition + 1;
                      } else {
                        stackIn_27_1 = this.getNextWordBoundary(62);
                      }
                      this.moveCaret(stackIn_27_1, (byte) -58);
                      return true;
                    }
                  }
                }
              } else {
                if (this.selectionAnchor != this.caretPosition) {
                  this.deleteSelection((byte) 112);
                  return true;
                }
                if (this.caretPosition < this.text.length()) {
                  this.selectionAnchor = 1 + this.caretPosition;
                  this.deleteSelection((byte) -38);
                  return true;
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("uf.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setText(boolean param0, int param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.text = param2;
          var4_int = param2.length();
          if (~this.maximumLength != param1 &&
            this.maximumLength < var4_int) {
            this.text = this.text.substring(0, this.maximumLength);
          }
          dupTemp$1 = this.text.length();
          this.selectionAnchor = dupTemp$1;
          this.caretPosition = dupTemp$1;
          if (param0) {
            return;
          }
          this.notifyTextChanged((byte) -55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("uf.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void insertText(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        try {
          if (this.maximumLength != -1) {
            var3_int = this.maximumLength - this.text.length();
            if (0 <= var3_int) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.caretPosition != this.text.length()) {
            this.text = this.text.substring(0, this.caretPosition) + param1 + this.text.substring(this.caretPosition, this.text.length());
          } else {
            this.text = this.text + param1;
          }
          this.caretPosition = this.caretPosition + param1.length();
          var3_intLifetime1 = -69 % ((34 - param0) / 56);
          this.selectionAnchor = this.caretPosition;
          this.notifyTextChanged((byte) -55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uf.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        long var6;
        UiTextRenderer var8;
        UiTextRenderer var10;
        UiTextRenderer var11;
        long var6Lifetime1;
        if (param2 > 47) {
          if (this.renderer == null) {
            return;
          }
          if (param1 != 0) {
            return;
          }
          this.renderer.drawComponent(29, (UiComponent) (this), param0, param3, this.enabled);
          if (!(this.renderer instanceof UiTextRenderer)) {
            return;
          }
          var11 = (UiTextRenderer) ((Object) this.renderer);
          if (this.selectionAnchor != this.caretPosition) {
            var11.drawSelection(this.selectionAnchor, param3, -24184, param0, (UiComponent) (this), this.caretPosition);
          }
          var6 = MonotonicMillisClock.currentTimeMillis(false);
          if ((var6 - this.caretBlinkEpoch) % 1000L >= 500L) {
            return;
          }
          var11.drawCaret((UiComponent) (this), param3, (byte) 99, param0, this.caretPosition);
          return;
        }
        this.deleteSelection((byte) 89);
        if (this.renderer == null) {
          return;
        }
        if (param1 != 0) {
          return;
        }
        this.renderer.drawComponent(29, (UiComponent) (this), param0, param3, this.enabled);
        if (!(this.renderer instanceof UiTextRenderer)) {
          return;
        }
        var10 = (UiTextRenderer) ((Object) this.renderer);
        var8 = var10;
        if (this.selectionAnchor != this.caretPosition) {
          var10.drawSelection(this.selectionAnchor, param3, -24184, param0, (UiComponent) (this), this.caretPosition);
        }
        var6Lifetime1 = MonotonicMillisClock.currentTimeMillis(false);
        if ((var6Lifetime1 - this.caretBlinkEpoch) % 1000L >= 500L) {
          return;
        }
        var10.drawCaret((UiComponent) (this), param3, (byte) 99, param0, this.caretPosition);
        return;
    }

    UiTextField(String param0, UiListener param1, int param2) {
        super(param0, param1);
        this.doubleClickSelection = false;
        this.doubleClickWordEnd = -1;
        this.lastClickTime = 0L;
        try {
          this.maximumLength = param2;
          this.renderer = GetDebrisMax.field_s.field_o;
          this.setText(true, 0, param0);
          this.keepCaretVisible = true;
          this.caretBlinkEpoch = MonotonicMillisClock.currentTimeMillis(false);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.handleMousePress(param0, param1, param2, param3, param4, param5, (byte) -61) &&
            this.renderer instanceof UiTextRenderer) {
            var8_int = ((UiTextRenderer) ((Object) this.renderer)).getCaretIndexAtPoint(PlayerGameData.field_b, OpenGlFaceAttachment.field_b, param5, param1, (UiComponent) (this), -1);
            if (var8_int == -1) {
              stackIn_6_1 = 0;
            } else {
              stackIn_6_1 = var8_int;
            }
            this.moveCaret(stackIn_6_1, (byte) -84);
            var8_long = MonotonicMillisClock.currentTimeMillis(false);
            stackIn_9_1 = !(var8_long - this.lastClickTime >= 250L);
            this.doubleClickSelection = stackIn_9_1;
            if (this.doubleClickSelection) {
              this.selectionAnchor = this.getPreviousWordBoundary(0);
              this.caretPosition = this.getNextWordBoundary(62);
              if (this.caretPosition > 0 &&
                this.text.charAt(this.caretPosition - 1) == 32) {
                this.caretPosition = this.caretPosition - 1;
              }
              this.doubleClickWordEnd = this.caretPosition;
            }
            this.lastClickTime = var8_long;
            return true;
          }
          if (param6 >= -17) {
            this.notifySubmitted((byte) 59);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("uf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final int getPreviousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 == this.caretPosition) {
          return this.caretPosition;
        }
        for (var2 = -1 + this.caretPosition; var2 > 0; var2--) {
          if (this.text.charAt(var2 - 1) == 32) {
            return var2;
          }
        }
        return var2;
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        UiTextRenderer var7 = null;
        int var6 = 0;
        try {
          super.updatePointer(param0, param1, param2 ^ 0, param3);
          this.scrollCaretIntoView(param2 ^ -27100);
          if (param2 != -981) {
            this.caretBlinkEpoch = -63L;
          }
          if (this.pressedButton == 1) {
            if (this.renderer instanceof UiTextRenderer) {
              var7 = (UiTextRenderer) ((Object) this.renderer);
              var6 = var7.getCaretIndexAtPoint(PlayerGameData.field_b, OpenGlFaceAttachment.field_b, param0, param1, (UiComponent) (this), param2 + 980);
              if (var6 != -1) {
                if (this.doubleClickSelection && var6 < this.doubleClickWordEnd &&
                  this.selectionAnchor < var6) {
                  var6 = this.doubleClickWordEnd;
                }
                this.caretPosition = var6;
              }
            }
            this.caretBlinkEpoch = MonotonicMillisClock.currentTimeMillis(false);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "uf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void pasteClipboard(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.deleteSelection((byte) -121);
            if (param0 != 7328) {
              return;
            }
            this.insertText(96, var2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_F = null;
        int var1 = -24 % ((-63 - param0) / 45);
        field_E = null;
    }

    private final void copySelection(byte param0) {
        try {
          String var2 = null;
          String var2Lifetime1;
          if (param0 != 24) {
            this.cutSelection(true);
            var2 = this.getSelectedText((byte) -96);
            if (var2.length() > 0) {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) -96))), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
            return;
          }
          var2Lifetime1 = this.getSelectedText((byte) -96);
          if (var2Lifetime1.length() <= 0) {
            return;
          }
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) -96))), (java.awt.datatransfer.ClipboardOwner) null);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void moveCaret(int param0, byte param1) {
        this.caretPosition = param0;
        if (param1 <= -35) {
          if (!SetMachineGunEnergyUsed.field_o[81]) {
            this.selectionAnchor = this.caretPosition;
          }
          return;
        }
        this.cutSelection(false);
        if (!SetMachineGunEnergyUsed.field_o[81]) {
          this.selectionAnchor = this.caretPosition;
        }
    }

    final void clearText(int param0) {
        this.caretPosition = 0;
        if (param0 == 82) {
          this.selectionAnchor = 0;
          this.text = "";
          this.notifyTextChanged((byte) -55);
          return;
        }
        String var3 = (String) null;
        this.insertText(32, (String) null);
        this.selectionAnchor = 0;
        this.text = "";
        this.notifyTextChanged((byte) -55);
    }

    private final String getSelectedText(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == -96) {
          var2 = this.selectionAnchor < this.caretPosition ? this.selectionAnchor : this.caretPosition;
          var3 = this.selectionAnchor < this.caretPosition ? this.caretPosition : this.selectionAnchor;
          return this.text.substring(var2, var3);
        }
        return (String) null;
    }

    void notifyTextChanged(byte param0) {
        if (this.listener instanceof UiTextFieldListener) {
          ((UiTextFieldListener) (this.listener)).onTextChanged(this, (byte) 100);
        }
        if (param0 == -55) {
          return;
        }
        this.selectionAnchor = -20;
    }

    private final void cutSelection(boolean param0) {
        this.copySelection((byte) 24);
        this.deleteSelection((byte) 116);
        if (!param0) {
          field_F = (String) null;
        }
    }

    static {
        SettingsInstanceFactory discarded$0 = new SettingsInstanceFactory();
        field_F = "Weapon";
    }
}
