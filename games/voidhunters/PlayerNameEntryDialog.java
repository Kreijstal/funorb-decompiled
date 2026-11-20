/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerNameEntryDialog extends Widget {
    private StringBuilder inputBuffer;
    private Widget inputWidget;
    private int result;
    private Widget promptWidget;

    final boolean handleNameKeyEvent(boolean param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var2;
        int var2Lifetime1;
        if (this.result != 0) {
          return false;
        }
        if (SetBombletSprayProjectileDamage.field_o != 85) {
          if (this.inputBuffer.length() < 12) {
            var2 = Character.toLowerCase(SetClientSideDragging.field_r);
            if (var2 == 32) {
              var2 = 95;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var2 == 95) {
              if (0 >= this.inputBuffer.length()) {
                if (SoftwareFaceAttachmentState.isAsciiLetter((char) var2, 0)) {
                  discarded$6 = this.inputBuffer.append((char) var2);
                } else {
                  if (GetRepairModeCooldown.isAsciiDigit((char) var2, true)) {
                    discarded$7 = this.inputBuffer.append((char) var2);
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                discarded$5 = this.inputBuffer.append((char) var2);
              }
            }
            if (decompiledFrameRemainder0) {
              if (SoftwareFaceAttachmentState.isAsciiLetter((char) var2, 0)) {
                discarded$8 = this.inputBuffer.append((char) var2);
                if (SetBombletSprayProjectileDamage.field_o == 84) {
                  if (this.inputBuffer.length() <= 0) {
                    this.result = 1;
                  } else {
                    this.text = this.inputBuffer.toString();
                    this.result = 2;
                  }
                }
                if (SetBombletSprayProjectileDamage.field_o == 13) {
                  this.result = 1;
                }
                if (param0) {
                  return false;
                }
                return true;
              }
              if (GetRepairModeCooldown.isAsciiDigit((char) var2, true)) {
                discarded$9 = this.inputBuffer.append((char) var2);
                if (SetBombletSprayProjectileDamage.field_o == 84) {
                  if (this.inputBuffer.length() <= 0) {
                    this.result = 1;
                  } else {
                    this.text = this.inputBuffer.toString();
                    this.result = 2;
                  }
                }
                if (SetBombletSprayProjectileDamage.field_o == 13) {
                  this.result = 1;
                }
                if (param0) {
                  return false;
                }
                return true;
              }
            }
          }
          if (SetBombletSprayProjectileDamage.field_o == 84) {
            if (this.inputBuffer.length() <= 0) {
              this.result = 1;
            } else {
              this.text = this.inputBuffer.toString();
              this.result = 2;
            }
          }
          if (SetBombletSprayProjectileDamage.field_o == 13) {
            this.result = 1;
          }
          if (param0) {
            return false;
          }
          return true;
        }
        if (this.inputBuffer.length() > 0) {
          ServerTickFactory.resizeStringBuilder(this.inputBuffer.length() - 1, param0, this.inputBuffer, ' ');
        }
        if (this.inputBuffer.length() >= 12) {
          if (SetBombletSprayProjectileDamage.field_o == 84) {
            if (this.inputBuffer.length() <= 0) {
              this.result = 1;
            } else {
              this.text = this.inputBuffer.toString();
              this.result = 2;
            }
          }
          if (SetBombletSprayProjectileDamage.field_o == 13) {
            this.result = 1;
          }
          if (!param0) {
            return true;
          }
          return false;
        }
        var2Lifetime1 = Character.toLowerCase(SetClientSideDragging.field_r);
        if (var2Lifetime1 == 32) {
          var2Lifetime1 = 95;
        }
        if (var2Lifetime1 == 95) {
          if (0 >= this.inputBuffer.length()) {
            if (SoftwareFaceAttachmentState.isAsciiLetter((char) var2Lifetime1, 0)) {
              discarded$1 = this.inputBuffer.append((char) var2Lifetime1);
            } else {
              if (GetRepairModeCooldown.isAsciiDigit((char) var2Lifetime1, true)) {
                discarded$2 = this.inputBuffer.append((char) var2Lifetime1);
              }
            }
            if (SetBombletSprayProjectileDamage.field_o == 84) {
              if (this.inputBuffer.length() <= 0) {
                this.result = 1;
              } else {
                this.text = this.inputBuffer.toString();
                this.result = 2;
              }
            }
            if (SetBombletSprayProjectileDamage.field_o == 13) {
              this.result = 1;
            }
            if (param0) {
              return false;
            }
            return true;
          }
          discarded$0 = this.inputBuffer.append((char) var2Lifetime1);
        }
        if (SoftwareFaceAttachmentState.isAsciiLetter((char) var2Lifetime1, 0)) {
          discarded$3 = this.inputBuffer.append((char) var2Lifetime1);
          if (SetBombletSprayProjectileDamage.field_o == 84) {
            if (this.inputBuffer.length() <= 0) {
              this.result = 1;
            } else {
              this.text = this.inputBuffer.toString();
              this.result = 2;
            }
          }
          if (SetBombletSprayProjectileDamage.field_o == 13) {
            this.result = 1;
          }
          if (!param0) {
            return true;
          }
          return false;
        }
        if (!GetRepairModeCooldown.isAsciiDigit((char) var2Lifetime1, true)) {
          if (SetBombletSprayProjectileDamage.field_o == 84) {
            if (this.inputBuffer.length() <= 0) {
              this.result = 1;
            } else {
              this.text = this.inputBuffer.toString();
              this.result = 2;
            }
          }
          if (SetBombletSprayProjectileDamage.field_o == 13) {
            this.result = 1;
          }
          if (!param0) {
            return true;
          }
          return false;
        }
        discarded$4 = this.inputBuffer.append((char) var2Lifetime1);
        if (SetBombletSprayProjectileDamage.field_o == 84) {
          if (this.inputBuffer.length() <= 0) {
            this.result = 1;
          } else {
            this.text = this.inputBuffer.toString();
            this.result = 2;
          }
        }
        if (SetBombletSprayProjectileDamage.field_o == 13) {
          this.result = 1;
        }
        if (!param0) {
          return true;
        }
        return false;
    }

    final int updateAndGetResult(int param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != 0) {
          this.inputWidget = (Widget) null;
        }
        this.updateInput(param1, 1332);
        if (!param1) {
          this.inputWidget.text = this.inputBuffer.toString();
          if (param1 &&
            SetDebrisPartitioned.field_o != 0 &&
            this.field_o == 0) {
            this.result = 1;
          }
          return this.result;
        }
        while (true) {
          if (!UiAngleDial.pollKeyEvent(127)) {
            this.inputWidget.text = this.inputBuffer.toString();
            if (!param1) {
              return this.result;
            }
            if (SetDebrisPartitioned.field_o == 0) {
              return this.result;
            }
            if (this.field_o != 0) {
              return this.result;
            }
            this.result = 1;
            return this.result;
          }
          if (SetBombletSprayProjectileDamage.field_o == 85 &&
            this.inputBuffer.length() > 0) {
            ServerTickFactory.resizeStringBuilder(-1 + this.inputBuffer.length(), false, this.inputBuffer, ' ');
          }
          if (MissionBuilderFactory.canAppendPlayerNameCharacter(SetClientSideDragging.field_r, 109, (CharSequence) ((Object) this.inputBuffer))) {
            discarded$0 = this.inputBuffer.append(SetClientSideDragging.field_r);
          } else {
            if (this.inputBuffer.length() == 0 &&
              SetClientSideDragging.field_r == 91) {
              discarded$1 = this.inputBuffer.append(SetClientSideDragging.field_r);
            } else {
              if (this.inputBuffer.length() == 1 &&
                35 == SetClientSideDragging.field_r) {
                discarded$2 = this.inputBuffer.append(SetClientSideDragging.field_r);
              } else {
                if (93 == SetClientSideDragging.field_r) {
                  discarded$3 = this.inputBuffer.append(SetClientSideDragging.field_r);
                }
              }
            }
          }
          if (SetBombletSprayProjectileDamage.field_o != 84) {
            if (SetBombletSprayProjectileDamage.field_o == 13) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (0 >= this.inputBuffer.length()) {
          return 1;
        }
        this.text = this.inputBuffer.toString();
        return 2;
    }

    PlayerNameEntryDialog(int param0, int param1, int param2, int param3, String param4, Widget param5, Widget param6, Widget param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.result = 0;
        try {
          this.promptWidget = new Widget(0L, param6, param4);
          this.addChild(-561, this.promptWidget);
          this.inputWidget = new Widget(0L, param7);
          this.inputWidget.field_Y = 16764006;
          this.addChild(-561, this.inputWidget);
          this.inputWidget.field_s = "|";
          this.inputBuffer = new StringBuilder(12);
          var9_int = this.promptWidget.getPreferredWidth(57);
          this.promptWidget.setBounds(5, 119, var9_int, 3, DialogMessagePanel.field_w);
          this.inputWidget.setBounds(5, 43, var9_int, 3 + DialogMessagePanel.field_w, DialogMessagePanel.field_w);
          var10 = 10 + var9_int;
          var11 = 3 + 2 * DialogMessagePanel.field_w + 3;
          var12 = QuickChatCategoryLoader.adjustPopupX((byte) -109, param0, param2, var10);
          var13 = PopupPositioning.adjustPopupY(param3, param1, var11, (byte) -16);
          this.setBounds(var12, 122, var10, var13, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("qka.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
