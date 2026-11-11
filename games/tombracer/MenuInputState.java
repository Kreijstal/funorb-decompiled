/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    private int field_a;
    private boolean pointerSelecting;
    static int field_d;
    private int pointerClick;
    static SpriteData field_j;
    static String field_g;
    int itemCount;
    int selectedIndex;
    private int pointerButton;
    private int keyCode;

    final boolean isHomePressed(int param0) {
        if (param0 == 0) {
          return 102 == this.keyCode ? true : false;
        }
        this.updatePointer(17, 31, 66);
        return 102 == this.keyCode ? true : false;
    }

    final boolean isPointerHeld(byte param0) {
        if (param0 >= -126) {
          return true;
        }
        return this.pointerButton != 0 ? true : false;
    }

    final boolean isRightPressed(int param0) {
        int var2 = 104 / ((param0 - 11) / 57);
        return 97 == this.keyCode ? true : false;
    }

    final void selectIndex(int param0, int param1) {
        int var3 = -96 / ((param1 - 18) / 61);
        if (this.pointerButton == 0) {
          this.selectedIndex = param0;
          this.pointerSelecting = false;
        }
    }

    final void updatePointer(int param0, int param1, int param2) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime2Lifetime1;
        if (this.itemCount <= param2) {
          throw new IllegalArgumentException();
        }
        if (this.itemCount <= param0) {
          throw new IllegalArgumentException();
        }
        this.keyCode = 0;
        this.pointerClick = 0;
        if (PlayerModel.field_b != 0) {
          this.pointerClick = PlayerModel.field_b;
          this.selectedIndex = param0;
          this.pointerButton = PlayerModel.field_b;
          this.pointerSelecting = true;
          this.field_a = gp.field_m;
          if (this.pointerButton != 0 &&
            RangeOperator.field_p != 0) {
            if (0 >= this.field_a) {
              this.field_a = PlainScoringObserverFactory.field_b;
            }
            this.field_a = this.field_a - 1;
          }
          if (PlayerModel.field_b == 0 &&
            0 == RangeOperator.field_p) {
            this.pointerButton = 0;
          }
          var4 = -69 % ((-29 - param1) / 63);
          if (0 != this.pointerButton) {
            return;
          }
          if (!this.pointerSelecting &&
            !ProceduralTextureProvider.field_c) {
            return;
          }
          if (param2 < 0) {
            if (!this.pointerSelecting) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (param2 != this.selectedIndex) {
          }
          this.pointerSelecting = true;
          this.selectedIndex = param2;
          return;
        }
        if (this.pointerButton == 0) {
          if (PlayerModel.field_b == 0 &&
            0 == RangeOperator.field_p) {
            this.pointerButton = 0;
          }
          var4Lifetime1 = -69 % ((-29 - param1) / 63);
          if (0 != this.pointerButton) {
            return;
          }
          if (!this.pointerSelecting &&
            !ProceduralTextureProvider.field_c) {
            return;
          }
          if (param2 < 0) {
            if (!this.pointerSelecting) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (param2 != this.selectedIndex) {
          }
          this.pointerSelecting = true;
          this.selectedIndex = param2;
          return;
        }
        if (RangeOperator.field_p == 0) {
          if (PlayerModel.field_b == 0) {
            if (0 != RangeOperator.field_p) {
              var4Lifetime2 = -69 % ((-29 - param1) / 63);
              if (0 != this.pointerButton) {
                return;
              }
              if (!this.pointerSelecting &&
                !ProceduralTextureProvider.field_c) {
                return;
              }
              if (param2 < 0) {
                if (!this.pointerSelecting) {
                  return;
                }
                this.selectedIndex = -1;
                return;
              }
              if (param2 != this.selectedIndex) {
              }
              this.pointerSelecting = true;
              this.selectedIndex = param2;
              return;
            }
            this.pointerButton = 0;
          }
          var4Lifetime2Lifetime1 = -69 % ((-29 - param1) / 63);
          if (0 != this.pointerButton) {
            return;
          }
          if (this.pointerSelecting) {
            if (param2 >= 0) {
              if (param2 != this.selectedIndex) {
              }
              this.pointerSelecting = true;
              this.selectedIndex = param2;
              return;
            }
            if (this.pointerSelecting) {
              this.selectedIndex = -1;
              return;
            }
          } else {
            if (ProceduralTextureProvider.field_c) {
              if (param2 < 0) {
                if (!this.pointerSelecting) {
                  return;
                }
                this.selectedIndex = -1;
                return;
              }
              if (param2 != this.selectedIndex) {
              }
              this.pointerSelecting = true;
              this.selectedIndex = param2;
              return;
            }
          }
          return;
        }
        if (0 < this.field_a) {
          this.field_a = this.field_a - 1;
          if (PlayerModel.field_b == 0 &&
            0 == RangeOperator.field_p) {
            this.pointerButton = 0;
          }
          var4Lifetime3 = -69 % ((-29 - param1) / 63);
          if (0 == this.pointerButton) {
            if (!this.pointerSelecting &&
              !ProceduralTextureProvider.field_c) {
              return;
            }
            if (param2 >= 0) {
              if (param2 != this.selectedIndex) {
                this.pointerSelecting = true;
                this.selectedIndex = param2;
                return;
              }
              this.pointerSelecting = true;
              this.selectedIndex = param2;
              return;
            }
            if (this.pointerSelecting) {
              this.selectedIndex = -1;
            }
          }
          return;
        }
        this.field_a = PlainScoringObserverFactory.field_b;
        this.field_a = this.field_a - 1;
        if (PlayerModel.field_b == 0) {
          if (0 != RangeOperator.field_p) {
            var4Lifetime4 = -69 % ((-29 - param1) / 63);
            if (0 == this.pointerButton) {
              if (!this.pointerSelecting &&
                !ProceduralTextureProvider.field_c) {
                return;
              }
              if (param2 >= 0) {
                if (param2 != this.selectedIndex) {
                  this.pointerSelecting = true;
                  this.selectedIndex = param2;
                  return;
                }
                this.pointerSelecting = true;
                this.selectedIndex = param2;
                return;
              }
              if (this.pointerSelecting) {
                this.selectedIndex = -1;
              }
            }
            return;
          }
          this.pointerButton = 0;
        }
        var4Lifetime5 = -69 % ((-29 - param1) / 63);
        if (0 == this.pointerButton) {
          if (this.pointerSelecting) {
            if (param2 >= 0) {
              if (param2 != this.selectedIndex) {
              }
              this.pointerSelecting = true;
              this.selectedIndex = param2;
              return;
            }
            if (this.pointerSelecting) {
              this.selectedIndex = -1;
              return;
            }
          } else {
            if (ProceduralTextureProvider.field_c) {
              if (param2 < 0) {
                if (this.pointerSelecting) {
                  this.selectedIndex = -1;
                }
              } else {
                if (param2 != this.selectedIndex) {
                }
                this.pointerSelecting = true;
                this.selectedIndex = param2;
              }
              return;
            }
          }
        }
    }

    final boolean isLeftPressed(int param0) {
        if (param0 == 96) {
          return this.keyCode == 96 ? true : false;
        }
        this.pointerSelecting = false;
        return this.keyCode == 96 ? true : false;
    }

    final boolean isEndPressed(int param0) {
        int var2 = -76 / ((-64 - param0) / 54);
        return this.keyCode == 103 ? true : false;
    }

    final void captureKey(byte param0) {
        this.pointerClick = 0;
        this.keyCode = 0;
        if (0 == this.pointerButton) {
          this.keyCode = MenuEntry.field_h;
        }
        if (param0 == -50) {
          return;
        }
        MenuInputState.releaseStatics(29);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -100) {
          field_d = 50;
          field_g = null;
          field_j = null;
          return;
        }
        field_g = null;
        field_j = null;
    }

    final void initializeSelection(boolean param0, int param1, int param2, int param3) {
        this.pointerSelecting = param0 ? true : false;
        this.pointerButton = 0;
        if (this.pointerSelecting) {
          this.selectedIndex = param3;
          if (param1 != 29954) {
            this.keyCode = 83;
            return;
          }
          return;
        }
        this.selectedIndex = param2;
        if (param1 != 29954) {
          this.keyCode = 83;
          return;
        }
    }

    final static void openDisplaySettings(byte param0) {
        afa.field_c = LegacyOpenGlSpriteTexture.getTooltipStyle(122);
        ModelFactory.field_a = new DialogStack();
        if (param0 < 10) {
          MenuInputState.openDisplaySettings((byte) -39);
          GraphicsQuality.openDisplaySettingsDialog(-114);
          return;
        }
        GraphicsQuality.openDisplaySettingsDialog(-114);
    }

    final void handleVerticalNavigation(int param0) {
        this.pointerClick = 0;
        this.keyCode = 0;
        if (this.pointerButton == 0) {
          this.keyCode = MenuEntry.field_h;
        }
        if (param0 <= 3) {
          this.handleHorizontalNavigation(-50, 52);
        }
        if (this.pointerButton == 0 &&
          MenuEntry.field_h == 98) {
          if (0 >= this.selectedIndex) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.pointerSelecting = false;
        }
        if (0 == this.pointerButton &&
          MenuEntry.field_h == 99) {
          this.selectedIndex = this.selectedIndex + 1;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
          this.pointerSelecting = false;
        }
    }

    final boolean isActivated(boolean param0) {
        if (param0) {
          this.isRightPressed(-107);
          if (this.pointerClick != 0) {
            return true;
          }
          if (this.keyCode != 84) {
            return this.keyCode == 83 ? true : false;
          }
          return true;
        }
        if (this.pointerClick != 0) {
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

    MenuInputState(int param0) {
        this.selectedIndex = 0;
        this.pointerSelecting = false;
        this.itemCount = param0;
    }

    final void handleHorizontalNavigation(int param0, int param1) {
        int var3;
        this.pointerClick = 0;
        var3 = 77 / ((param1 + 33) / 39);
        this.keyCode = 0;
        if (this.pointerButton == 0) {
          this.keyCode = MenuEntry.field_h;
        }
        if (this.pointerButton == 0 &&
          MenuEntry.field_h == 96) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.pointerSelecting = false;
          this.selectedIndex = this.selectedIndex - 1;
        }
        if (0 == this.pointerButton &&
          MenuEntry.field_h == 97) {
          this.selectedIndex = this.selectedIndex + 1;
          this.pointerSelecting = false;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
        }
        if (this.pointerButton != 0) {
          return;
        }
        if (MenuEntry.field_h != 98 &&
          MenuEntry.field_h != 99) {
          return;
        }
        if (this.selectedIndex < 0) {
          this.selectedIndex = param0;
        }
        this.pointerSelecting = false;
    }

    static {
        field_g = "Checking";
    }
}
