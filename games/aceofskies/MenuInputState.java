/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    private int heldButton;
    int selectedIndex;
    private int keyCode;
    private int repeatCountdown;
    private boolean pointerSelection;
    static en field_b;
    static int field_h;
    static wp[] field_i;
    private int pressedButton;
    int itemCount;

    final void handleVerticalKey(boolean obfuscationGuard) {
        this.keyCode = 0;
        if (obfuscationGuard) {
          this.pressedButton = 0;
          if (this.heldButton == 0 &&
            98 == bk.lastKeyCode) {
            if (this.selectedIndex <= 0) {
              this.selectedIndex = this.itemCount;
            }
            this.selectedIndex = this.selectedIndex - 1;
            this.pointerSelection = false;
          }
          if (this.heldButton == 0) {
            this.keyCode = bk.lastKeyCode;
          }
          if (0 == this.heldButton) {
            if (99 != bk.lastKeyCode) {
              return;
            }
            this.selectedIndex = this.selectedIndex + 1;
            this.pointerSelection = false;
            if (this.itemCount > this.selectedIndex) {
              return;
            }
            this.selectedIndex = 0;
          }
          return;
        }
        this.handleVerticalKey(true);
        this.pressedButton = 0;
        if (this.heldButton != 0) {
          if (this.heldButton == 0) {
            this.keyCode = bk.lastKeyCode;
          }
        } else {
          if (98 == bk.lastKeyCode) {
            if (this.selectedIndex <= 0) {
              this.selectedIndex = this.itemCount;
            }
            this.selectedIndex = this.selectedIndex - 1;
            this.pointerSelection = false;
          }
          if (this.heldButton == 0) {
            this.keyCode = bk.lastKeyCode;
            if (0 != this.heldButton) {
              return;
            }
            if (99 == bk.lastKeyCode) {
              this.selectedIndex = this.selectedIndex + 1;
              this.pointerSelection = false;
              if (this.itemCount > this.selectedIndex) {
                return;
              }
              this.selectedIndex = 0;
            }
            return;
          }
        }
        if (0 != this.heldButton) {
          return;
        }
        if (99 != bk.lastKeyCode) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        this.pointerSelection = false;
        if (this.itemCount > this.selectedIndex) {
          return;
        }
        this.selectedIndex = 0;
    }

    final boolean isHomePressed(int obfuscationGuard) {
        if (obfuscationGuard > 50) {
          return 102 == this.keyCode ? true : false;
        }
        this.isLeftPressed(-96);
        return 102 == this.keyCode ? true : false;
    }

    final boolean isActivated(byte obfuscationGuard) {
        if (obfuscationGuard <= 80) {
          this.itemCount = -21;
          if (this.pressedButton != 0) {
            return true;
          }
          if (this.keyCode != 84) {
            return this.keyCode == 83 ? true : false;
          }
          return true;
        }
        if (this.pressedButton != 0) {
          return true;
        }
        if (this.keyCode == 84) {
          return true;
        }
        if (this.keyCode != 83) {
          return false;
        }
        return true;
    }

    final void setSelectedIndex(byte obfuscationGuard, int itemIndex) {
        if (0 == this.heldButton) {
          this.pointerSelection = false;
          this.selectedIndex = itemIndex;
          if (obfuscationGuard >= -98) {
            field_h = 4;
            return;
          }
          return;
        }
        if (obfuscationGuard < -98) {
          return;
        }
        field_h = 4;
    }

    final boolean isLeftPressed(int obfuscationGuard) {
        int var2 = 39 / ((71 - obfuscationGuard) / 37);
        return this.keyCode == 96 ? true : false;
    }

    final void captureKey(byte obfuscationGuard) {
        this.pressedButton = 0;
        this.keyCode = 0;
        if (this.heldButton == 0) {
          this.keyCode = bk.lastKeyCode;
          if (obfuscationGuard <= 122) {
            field_b = (en) null;
            return;
          }
          return;
        }
        if (obfuscationGuard > 122) {
          return;
        }
        field_b = (en) null;
    }

    final void handleHorizontalKey(byte obfuscationGuard) {
        this.keyCode = 0;
        if (obfuscationGuard > -47) {
          this.keyCode = 73;
        }
        this.pressedButton = 0;
        if (this.heldButton == 0) {
          this.keyCode = bk.lastKeyCode;
        }
        if (0 == this.heldButton &&
          bk.lastKeyCode == 96) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.pointerSelection = false;
        }
        if (this.heldButton != 0) {
          return;
        }
        if (bk.lastKeyCode != 97) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        if (this.itemCount <= this.selectedIndex) {
          this.selectedIndex = 0;
        }
        this.pointerSelection = false;
    }

    final boolean isPointerHeld(byte obfuscationGuard) {
        if (obfuscationGuard >= 22) {
          return this.heldButton != 0 ? true : false;
        }
        this.isHomePressed(-16);
        return this.heldButton != 0 ? true : false;
    }

    final void resetSelection(boolean pointerSelection, int pointerItemIndex, int heldButton, int keyboardItemIndex) {
        this.pointerSelection = pointerSelection ? true : false;
        this.heldButton = heldButton;
        if (this.pointerSelection) {
          this.selectedIndex = pointerItemIndex;
          return;
        }
        this.selectedIndex = keyboardItemIndex;
    }

    public static void c(int param0) {
        field_i = null;
        field_b = null;
        if (param0 >= -117) {
          field_b = (en) null;
        }
    }

    final void updatePointer(int pressedItemIndex, int hoveredItemIndex, int obfuscationGuard) {
        if (this.itemCount <= hoveredItemIndex) {
          throw new IllegalArgumentException();
        }
        if (this.itemCount <= pressedItemIndex) {
          throw new IllegalArgumentException();
        }
        this.pressedButton = 0;
        this.keyCode = 0;
        if (0 != vj.pressedMouseButton) {
          this.repeatCountdown = pn.menuInitialRepeatDelay;
          this.pressedButton = vj.pressedMouseButton;
          this.pointerSelection = true;
          this.heldButton = vj.pressedMouseButton;
          this.selectedIndex = pressedItemIndex;
        }
        if (obfuscationGuard != -24702) {
          return;
        }
        if (this.heldButton == 0) {
          if (0 == vj.pressedMouseButton) {
            if (vu.heldMouseButton != 0) {
              if (0 == this.heldButton) {
                if (!this.pointerSelection &&
                  !uu.pointerMoved) {
                  return;
                }
                if (0 > hoveredItemIndex) {
                  if (this.pointerSelection) {
                    this.selectedIndex = -1;
                  }
                } else {
                  if (this.selectedIndex == hoveredItemIndex) {
                    this.selectedIndex = hoveredItemIndex;
                    this.pointerSelection = true;
                  } else {
                    this.selectedIndex = hoveredItemIndex;
                    this.pointerSelection = true;
                  }
                }
              }
              return;
            }
            this.heldButton = 0;
          }
          if (0 != this.heldButton) {
            return;
          }
          if (!this.pointerSelection &&
            !uu.pointerMoved) {
            return;
          }
          if (0 > hoveredItemIndex) {
            if (!this.pointerSelection) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex == hoveredItemIndex) {
          }
          this.selectedIndex = hoveredItemIndex;
          this.pointerSelection = true;
          return;
        }
        if (0 == vu.heldMouseButton) {
          if (0 == vj.pressedMouseButton &&
            vu.heldMouseButton == 0) {
            this.heldButton = 0;
          }
          if (0 != this.heldButton) {
            return;
          }
          if (!this.pointerSelection &&
            !uu.pointerMoved) {
            return;
          }
          if (0 > hoveredItemIndex) {
            if (!this.pointerSelection) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex == hoveredItemIndex) {
          }
          this.selectedIndex = hoveredItemIndex;
          this.pointerSelection = true;
          return;
        }
        if (this.repeatCountdown > 0) {
          this.repeatCountdown = this.repeatCountdown - 1;
          if (0 == vj.pressedMouseButton &&
            vu.heldMouseButton == 0) {
            this.heldButton = 0;
          }
          if (0 != this.heldButton) {
            return;
          }
          if (!this.pointerSelection &&
            !uu.pointerMoved) {
            return;
          }
          if (0 > hoveredItemIndex) {
            if (!this.pointerSelection) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex == hoveredItemIndex) {
          }
          this.selectedIndex = hoveredItemIndex;
          this.pointerSelection = true;
          return;
        }
        this.repeatCountdown = Pickup.menuRepeatDelay;
        this.repeatCountdown = this.repeatCountdown - 1;
        if (0 != vj.pressedMouseButton) {
          if (0 != this.heldButton) {
            return;
          }
          if (!this.pointerSelection &&
            !uu.pointerMoved) {
            return;
          }
          if (0 > hoveredItemIndex) {
            if (!this.pointerSelection) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex == hoveredItemIndex) {
          }
          this.selectedIndex = hoveredItemIndex;
          this.pointerSelection = true;
          return;
        }
        if (vu.heldMouseButton == 0) {
          this.heldButton = 0;
        }
        if (0 == this.heldButton) {
          if (!this.pointerSelection &&
            !uu.pointerMoved) {
            return;
          }
          if (0 <= hoveredItemIndex) {
            if (this.selectedIndex == hoveredItemIndex) {
            }
            this.selectedIndex = hoveredItemIndex;
            this.pointerSelection = true;
            return;
          }
          if (this.pointerSelection) {
            this.selectedIndex = -1;
            return;
          }
        }
    }

    final boolean isEndPressed(int obfuscationGuard) {
        if (obfuscationGuard > -9) {
          return false;
        }
        return this.keyCode == 103 ? true : false;
    }

    MenuInputState(int itemCount) {
        this.selectedIndex = 0;
        this.pointerSelection = false;
        this.itemCount = itemCount;
    }

    final boolean isRightPressed(byte obfuscationGuard) {
        if (obfuscationGuard == -102) {
          return this.keyCode == 97 ? true : false;
        }
        this.pointerSelection = true;
        return this.keyCode == 97 ? true : false;
    }

    static {
        field_h = 0;
    }
}
