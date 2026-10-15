/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSelection {
    private int pressCode;
    static RgbSprite constructionSmallSprite;
    static int field_g;
    private int keyCode;
    int itemCount;
    static GameClock gameClock;
    private int activationCode;
    static int[] textChoiceLineActions;
    static String field_f;
    static String field_a;
    static int previewGameId;
    private int field_o;
    static RgbSprite field_k;
    private boolean pointerDriven;
    static String[] field_p;
    static UiComponent field_m;
    private int heldCode;
    int selectedIndex;

    public static void b(byte param0) {
        if (param0 == -60) {
          constructionSmallSprite = null;
          field_m = null;
          field_a = null;
          field_f = null;
          gameClock = null;
          textChoiceLineActions = null;
          field_k = null;
          field_p = null;
          return;
        }
    }

    final void navigateHorizontal(int fallbackIndex, int obfuscationGuard) {
        this.pressCode = 0;
        this.keyCode = 0;
        this.activationCode = 0;
        if (~this.heldCode == obfuscationGuard) {
          this.keyCode = MeshAttributeRecord.currentKeyCode;
        }
        if (0 != this.heldCode) {
          if (this.heldCode == 0 &&
            MeshAttributeRecord.currentKeyCode == 97) {
            this.selectedIndex = this.selectedIndex + 1;
            this.pointerDriven = false;
            if (this.itemCount <= this.selectedIndex) {
              this.selectedIndex = 0;
            }
          }
        } else {
          if (96 != MeshAttributeRecord.currentKeyCode) {
            if (this.heldCode != 0) {
              if (this.heldCode == 0) {
                if (MeshAttributeRecord.currentKeyCode != 98 &&
                  MeshAttributeRecord.currentKeyCode != 99) {
                  return;
                }
                this.pointerDriven = false;
                if (0 > this.selectedIndex) {
                  this.selectedIndex = fallbackIndex;
                }
              }
              return;
            }
            if (MeshAttributeRecord.currentKeyCode != 97) {
              if (this.heldCode == 0) {
                if (MeshAttributeRecord.currentKeyCode != 98 &&
                  MeshAttributeRecord.currentKeyCode != 99) {
                  return;
                }
                this.pointerDriven = false;
                if (0 > this.selectedIndex) {
                  this.selectedIndex = fallbackIndex;
                }
              }
              return;
            }
            this.selectedIndex = this.selectedIndex + 1;
            this.pointerDriven = false;
            if (this.itemCount <= this.selectedIndex) {
              this.selectedIndex = 0;
            }
            if (this.heldCode == 0) {
              if (MeshAttributeRecord.currentKeyCode != 98 &&
                MeshAttributeRecord.currentKeyCode != 99) {
                return;
              }
              this.pointerDriven = false;
              if (0 > this.selectedIndex) {
                this.selectedIndex = fallbackIndex;
              }
            }
            return;
          }
          if (this.selectedIndex > 0) {
            this.selectedIndex = this.selectedIndex - 1;
            this.pointerDriven = false;
            if (this.heldCode == 0 &&
              MeshAttributeRecord.currentKeyCode == 97) {
              this.selectedIndex = this.selectedIndex + 1;
              this.pointerDriven = false;
              if (this.itemCount <= this.selectedIndex) {
                this.selectedIndex = 0;
              }
            }
            if (this.heldCode == 0) {
              if (MeshAttributeRecord.currentKeyCode != 98 &&
                MeshAttributeRecord.currentKeyCode != 99) {
                return;
              }
              this.pointerDriven = false;
              if (0 > this.selectedIndex) {
                this.selectedIndex = fallbackIndex;
              }
            }
            return;
          }
          this.selectedIndex = this.itemCount;
          this.selectedIndex = this.selectedIndex - 1;
          this.pointerDriven = false;
          if (this.heldCode != 0) {
            if (this.heldCode != 0) {
              return;
            }
            if (MeshAttributeRecord.currentKeyCode == 98) {
              this.pointerDriven = false;
              if (0 <= this.selectedIndex) {
                return;
              }
              this.selectedIndex = fallbackIndex;
              return;
            }
            if (MeshAttributeRecord.currentKeyCode != 99) {
              return;
            }
            this.pointerDriven = false;
            if (0 > this.selectedIndex) {
              this.selectedIndex = fallbackIndex;
            }
            return;
          }
          if (MeshAttributeRecord.currentKeyCode != 97) {
            if (this.heldCode != 0) {
              return;
            }
            if (MeshAttributeRecord.currentKeyCode == 98) {
              this.pointerDriven = false;
              if (0 <= this.selectedIndex) {
                return;
              }
              this.selectedIndex = fallbackIndex;
              return;
            }
            if (MeshAttributeRecord.currentKeyCode != 99) {
              return;
            }
            this.pointerDriven = false;
            if (0 > this.selectedIndex) {
              this.selectedIndex = fallbackIndex;
            }
            return;
          }
          this.selectedIndex = this.selectedIndex + 1;
          this.pointerDriven = false;
          if (this.itemCount > this.selectedIndex) {
            if (this.heldCode == 0) {
              if (MeshAttributeRecord.currentKeyCode != 98 &&
                MeshAttributeRecord.currentKeyCode != 99) {
                return;
              }
              this.pointerDriven = false;
              if (0 > this.selectedIndex) {
                this.selectedIndex = fallbackIndex;
              }
            }
            return;
          }
          this.selectedIndex = 0;
        }
        if (this.heldCode != 0) {
          return;
        }
        if (MeshAttributeRecord.currentKeyCode != 98 &&
          MeshAttributeRecord.currentKeyCode != 99) {
          return;
        }
        this.pointerDriven = false;
        if (0 <= this.selectedIndex) {
          return;
        }
        this.selectedIndex = fallbackIndex;
    }

    final void navigateVertical(int obfuscationGuard) {
        this.pressCode = 0;
        this.activationCode = 0;
        this.keyCode = 0;
        if (this.heldCode == 0) {
          this.keyCode = MeshAttributeRecord.currentKeyCode;
        }
        if (obfuscationGuard == ~this.heldCode &&
          MeshAttributeRecord.currentKeyCode == 98) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.pointerDriven = false;
          this.selectedIndex = this.selectedIndex - 1;
        }
        if (this.heldCode != 0) {
          return;
        }
        if (MeshAttributeRecord.currentKeyCode != 99) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        if (this.itemCount <= this.selectedIndex) {
          this.selectedIndex = 0;
        }
        this.pointerDriven = false;
    }

    final void initializeSelection(int pointerIndex, int fallbackIndex, boolean usePointer, byte obfuscationGuard) {
        this.pointerDriven = usePointer ? true : false;
        this.heldCode = 0;
        if (obfuscationGuard >= -126) {
          field_k = (RgbSprite) null;
          if (!this.pointerDriven) {
            this.selectedIndex = fallbackIndex;
            return;
          }
          this.selectedIndex = pointerIndex;
          return;
        }
        if (!this.pointerDriven) {
          this.selectedIndex = fallbackIndex;
          return;
        }
        this.selectedIndex = pointerIndex;
    }

    final static void f(byte param0) {
        RuntimeException runtimeException = null;
        int var2 = 0;
        wj var3_ref_wj = null;
        int var3 = 0;
        int var4_int = 0;
        ln var4 = null;
        Object var5 = null;
        int var6 = 0;
        BitPacketBuffer var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != -71) {
            return;
          }
          var9 = jl.incomingPackets;
          var2 = var9.readUnsignedByte(255);
          if (0 != var2) {
            if (var2 == 1) {
              var3 = var9.readInt(255);
              var4 = (ln) (MidiSynthesizer.field_v.first(-37));
              while (var4 != null) {
                if (var3 != var4.field_m) {
                  var4 = (ln) (MidiSynthesizer.field_v.next((byte) 116));
                  continue;
                }
                break;
              }
              if (var4 == null) {
                hn.a((byte) 104);
                return;
              }
              var4.unlink((byte) 111);
              return;
            }
            AlignedIconLabel.a("A1: " + WhirlpoolHasher.c((byte) -101), (Throwable) null, 123);
            hn.a((byte) 60);
          } else {
            var3_ref_wj = (wj) (EmailConfirmationValidator.field_q.first(-110));
            if (var3_ref_wj == null) {
              hn.a((byte) 76);
              return;
            }
            var4_int = var9.readUnsignedByte(255);
            if (var4_int == 0) {
              var5 = null;
            } else {
              var13 = new byte[var4_int];
              var9.readBytes(0, var13, 116, var4_int);
            }
            var9.position = var9.position + 4;
            if (!var9.verifyCrc32((byte) -27)) {
              hn.a((byte) 86);
              return;
            }
            var3_ref_wj.unlink((byte) 111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "re.P(" + param0 + ')');
        }
    }

    final boolean isRightArrow(int obfuscationGuard) {
        if (obfuscationGuard == -98) {
          return this.keyCode == 97 ? true : false;
        }
        field_k = (RgbSprite) null;
        return this.keyCode == 97 ? true : false;
    }

    final void updatePointer(int heldIndex, int obfuscationGuard, int pressedIndex) {
        if (this.itemCount <= heldIndex) {
          throw new IllegalArgumentException();
        }
        if (pressedIndex >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        this.keyCode = 0;
        this.pressCode = 0;
        if (obfuscationGuard != 27479) {
          this.pressCode = -88;
          this.activationCode = 0;
          if (BackgroundScene.pressedButton != 0) {
            this.field_o = vd.field_c;
            this.selectedIndex = pressedIndex;
            this.pressCode = BackgroundScene.pressedButton;
            this.activationCode = BackgroundScene.pressedButton;
            this.heldCode = BackgroundScene.pressedButton;
            this.pointerDriven = true;
          }
          if (0 == this.heldCode) {
            if (BackgroundScene.pressedButton == 0 &&
              MatchingTextValidator.heldButton == 0) {
              this.heldCode = 0;
            }
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !QuickChatHelpDialog.pointerChanged) {
                return;
              }
              if (heldIndex < 0) {
                if (this.pointerDriven) {
                  this.selectedIndex = -1;
                }
              } else {
                if (heldIndex != this.selectedIndex) {
                  this.pointerDriven = true;
                  this.selectedIndex = heldIndex;
                } else {
                  this.pointerDriven = true;
                  this.selectedIndex = heldIndex;
                }
              }
            }
            return;
          }
          if (MatchingTextValidator.heldButton == 0) {
            if (BackgroundScene.pressedButton == 0 &&
              MatchingTextValidator.heldButton == 0) {
              this.heldCode = 0;
            }
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !QuickChatHelpDialog.pointerChanged) {
                return;
              }
              if (heldIndex < 0) {
                if (this.pointerDriven) {
                  this.selectedIndex = -1;
                }
              } else {
                if (heldIndex != this.selectedIndex) {
                  this.pointerDriven = true;
                  this.selectedIndex = heldIndex;
                } else {
                  this.pointerDriven = true;
                  this.selectedIndex = heldIndex;
                }
              }
            }
            return;
          }
          if (this.field_o <= 0) {
            this.pressCode = this.heldCode;
            this.field_o = IntArrayRequest.field_q;
          }
          this.field_o = this.field_o - 1;
          if (BackgroundScene.pressedButton == 0 &&
            MatchingTextValidator.heldButton == 0) {
            this.heldCode = 0;
          }
          if (this.heldCode == 0) {
            if (!this.pointerDriven &&
              !QuickChatHelpDialog.pointerChanged) {
              return;
            }
            if (heldIndex < 0) {
              if (this.pointerDriven) {
                this.selectedIndex = -1;
              }
            } else {
              if (heldIndex != this.selectedIndex) {
                this.pointerDriven = true;
                this.selectedIndex = heldIndex;
              } else {
                this.pointerDriven = true;
                this.selectedIndex = heldIndex;
              }
            }
          }
          return;
        }
        this.activationCode = 0;
        if (BackgroundScene.pressedButton != 0) {
          this.field_o = vd.field_c;
          this.selectedIndex = pressedIndex;
          this.pressCode = BackgroundScene.pressedButton;
          this.activationCode = BackgroundScene.pressedButton;
          this.heldCode = BackgroundScene.pressedButton;
          this.pointerDriven = true;
        }
        if (0 == this.heldCode) {
          boolean decompiledFrameRemainder1 = true;
          if (BackgroundScene.pressedButton == 0) {
            if (MatchingTextValidator.heldButton != 0) {
              if (this.heldCode != 0) {
                return;
              }
              if (!this.pointerDriven &&
                !QuickChatHelpDialog.pointerChanged) {
                return;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              this.heldCode = 0;
            }
          }
          if (decompiledFrameRemainder1) {
            if (this.heldCode != 0) {
              return;
            }
            if (!this.pointerDriven &&
              !QuickChatHelpDialog.pointerChanged) {
              return;
            }
          }
          if (heldIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (heldIndex != this.selectedIndex) {
          }
          this.pointerDriven = true;
          this.selectedIndex = heldIndex;
          return;
        }
        if (MatchingTextValidator.heldButton == 0) {
          boolean decompiledFrameRemainder0 = true;
          if (BackgroundScene.pressedButton == 0) {
            if (MatchingTextValidator.heldButton != 0) {
              if (this.heldCode != 0) {
                return;
              }
              if (!this.pointerDriven &&
                !QuickChatHelpDialog.pointerChanged) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.heldCode = 0;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.heldCode != 0) {
              return;
            }
            if (!this.pointerDriven &&
              !QuickChatHelpDialog.pointerChanged) {
              return;
            }
          }
          if (heldIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (heldIndex != this.selectedIndex) {
          }
          this.pointerDriven = true;
          this.selectedIndex = heldIndex;
          return;
        }
        if (this.field_o <= 0) {
          this.pressCode = this.heldCode;
          this.field_o = IntArrayRequest.field_q;
        }
        this.field_o = this.field_o - 1;
        if (BackgroundScene.pressedButton == 0) {
          if (MatchingTextValidator.heldButton != 0) {
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !QuickChatHelpDialog.pointerChanged) {
                return;
              }
              if (heldIndex >= 0) {
                if (heldIndex != this.selectedIndex) {
                  this.pointerDriven = true;
                  this.selectedIndex = heldIndex;
                  return;
                }
                this.pointerDriven = true;
                this.selectedIndex = heldIndex;
                return;
              }
              if (!this.pointerDriven) {
                return;
              }
              this.selectedIndex = -1;
            }
            return;
          }
          this.heldCode = 0;
        }
        if (this.heldCode == 0) {
          if (this.pointerDriven) {
            if (heldIndex >= 0) {
              if (heldIndex != this.selectedIndex) {
              }
              this.pointerDriven = true;
              this.selectedIndex = heldIndex;
              return;
            }
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
          } else {
            if (QuickChatHelpDialog.pointerChanged) {
              if (heldIndex < 0) {
                if (!this.pointerDriven) {
                  return;
                }
                this.selectedIndex = -1;
                return;
              }
              if (heldIndex != this.selectedIndex) {
              }
              this.pointerDriven = true;
              this.selectedIndex = heldIndex;
              return;
            }
          }
        }
    }

    final void pollKeyboardCode(byte obfuscationGuard) {
        if (obfuscationGuard != -124) {
          gameClock = (GameClock) null;
          this.keyCode = 0;
          this.pressCode = 0;
          this.activationCode = 0;
          if (this.heldCode == 0) {
            this.keyCode = MeshAttributeRecord.currentKeyCode;
            return;
          }
          return;
        }
        this.keyCode = 0;
        this.pressCode = 0;
        this.activationCode = 0;
        if (this.heldCode != 0) {
          return;
        }
        this.keyCode = MeshAttributeRecord.currentKeyCode;
    }

    final static int e(byte param0) {
        if (param0 <= 28) {
          MenuSelection.b((byte) 56);
          return 256;
        }
        return 256;
    }

    final boolean isPressActivated(byte obfuscationGuard) {
        int var2 = 77 % ((44 - obfuscationGuard) / 51);
        if (this.pressCode != 0) {
          return true;
        }
        if (84 == this.keyCode) {
          return true;
        }
        if (83 != this.keyCode) {
          return false;
        }
        return true;
    }

    final boolean isEndKey(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          return false;
        }
        return this.keyCode == 103 ? true : false;
    }

    final boolean isHeld(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return this.heldCode != 0 ? true : false;
        }
        this.navigateVertical(-91);
        return this.heldCode != 0 ? true : false;
    }

    final boolean isLeftArrow(byte obfuscationGuard) {
        if (obfuscationGuard == -57) {
          return this.keyCode == 96 ? true : false;
        }
        this.selectedIndex = 105;
        return this.keyCode == 96 ? true : false;
    }

    final void setSelectedIndex(boolean obfuscationGuard, int selectedIndex) {
        if (this.heldCode == 0) {
          this.selectedIndex = selectedIndex;
          this.pointerDriven = false;
          if (obfuscationGuard) {
            this.keyCode = -38;
            return;
          }
          return;
        }
        if (!obfuscationGuard) {
          return;
        }
        this.keyCode = -38;
    }

    final boolean isHomeKey(int obfuscationGuard) {
        if (obfuscationGuard == -103) {
          return this.keyCode == 102 ? true : false;
        }
        this.initializeSelection(-49, -52, false, (byte) 110);
        return this.keyCode == 102 ? true : false;
    }

    final boolean isActivated(byte obfuscationGuard) {
        if (obfuscationGuard != 113) {
          return true;
        }
        if (0 != this.activationCode) {
          return true;
        }
        if (84 == this.keyCode) {
          return true;
        }
        if (this.keyCode != 83) {
          return false;
        }
        return true;
    }

    MenuSelection(int itemCount) {
        this.selectedIndex = 0;
        this.pointerDriven = false;
        this.itemCount = itemCount;
    }

    static {
        field_f = "<%0> is not a member, and cannot play with the current options.";
        field_a = "No";
        field_p = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
