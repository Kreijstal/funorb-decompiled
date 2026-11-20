/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    private int pressedMouseButton;
    private int heldMouseButton;
    int itemCount;
    static QuickChatDynamicCommand field_g;
    private int keyCode;
    private int mouseButtonEvent;
    private boolean pointerSelection;
    private int repeatCountdown;
    static pr field_f;
    int selectedIndex;

    final boolean isDecreaseRequested(int param0) {
        if (param0 <= 0) {
          this.setKeyboardSelection((byte) 66, -23);
          if (this.mouseButtonEvent != 2) {
            return this.keyCode == 96 ? true : false;
          }
          return true;
        }
        if (this.mouseButtonEvent == 2) {
          return true;
        }
        if (this.keyCode != 96) {
          return false;
        }
        return true;
    }

    final void captureKey(int param0) {
        this.pressedMouseButton = 0;
        this.mouseButtonEvent = 0;
        this.keyCode = 0;
        if (param0 == -19255) {
          if (this.heldMouseButton == 0) {
            this.keyCode = SetBombletSprayProjectileDamage.field_o;
          }
          return;
        }
        this.updateHorizontalSelection(false, 6);
        if (this.heldMouseButton == 0) {
          this.keyCode = SetBombletSprayProjectileDamage.field_o;
        }
    }

    final void updatePointerSelection(int param0, int param1, int param2) {
        if (this.itemCount <= param2) {
          throw new IllegalArgumentException();
        }
        if (param1 == 5620) {
          if (param0 >= this.itemCount) {
            throw new IllegalArgumentException();
          }
          this.keyCode = 0;
          this.pressedMouseButton = 0;
          this.mouseButtonEvent = 0;
          if (SetDebrisPartitioned.field_o != 0) {
            this.repeatCountdown = SetNebulaFadesOutWhenClose.field_p;
            this.pointerSelection = true;
            this.mouseButtonEvent = SetDebrisPartitioned.field_o;
            this.pressedMouseButton = SetDebrisPartitioned.field_o;
            this.selectedIndex = param0;
            this.heldMouseButton = SetDebrisPartitioned.field_o;
          }
          if (this.heldMouseButton != 0 &&
            GpuVertexNormal.field_b != 0) {
            if (this.repeatCountdown > 0) {
              this.repeatCountdown = this.repeatCountdown - 1;
              if (SetDebrisPartitioned.field_o == 0 &&
                0 == GpuVertexNormal.field_b) {
                this.heldMouseButton = 0;
              }
              if (0 != this.heldMouseButton) {
                return;
              }
              if (!this.pointerSelection &&
                !VariableConditionFactory.field_c) {
                return;
              }
              if (0 <= param2) {
                if (this.selectedIndex != param2) {
                  this.pointerSelection = true;
                  this.selectedIndex = param2;
                  return;
                }
                this.pointerSelection = true;
                this.selectedIndex = param2;
                return;
              }
              if (this.pointerSelection) {
                this.selectedIndex = -1;
              }
              return;
            }
            this.repeatCountdown = GetDebrisGroupColour.field_q;
            this.mouseButtonEvent = this.heldMouseButton;
            this.repeatCountdown = this.repeatCountdown - 1;
            if (SetDebrisPartitioned.field_o == 0 &&
              0 == GpuVertexNormal.field_b) {
              this.heldMouseButton = 0;
            }
            if (0 != this.heldMouseButton) {
              return;
            }
            if (!this.pointerSelection &&
              !VariableConditionFactory.field_c) {
              return;
            }
            if (0 <= param2) {
              if (this.selectedIndex != param2) {
                this.pointerSelection = true;
                this.selectedIndex = param2;
                return;
              }
              this.pointerSelection = true;
              this.selectedIndex = param2;
              return;
            }
            if (this.pointerSelection) {
              this.selectedIndex = -1;
            }
            return;
          }
          if (SetDebrisPartitioned.field_o == 0 &&
            0 == GpuVertexNormal.field_b) {
            this.heldMouseButton = 0;
            if (0 != this.heldMouseButton) {
              return;
            }
            if (!this.pointerSelection &&
              !VariableConditionFactory.field_c) {
              return;
            }
            if (0 <= param2) {
              if (this.selectedIndex != param2) {
                this.pointerSelection = true;
                this.selectedIndex = param2;
                return;
              }
              this.pointerSelection = true;
              this.selectedIndex = param2;
              return;
            }
            if (this.pointerSelection) {
              this.selectedIndex = -1;
            }
            return;
          }
        } else {
          this.keyCode = -16;
          if (param0 >= this.itemCount) {
            throw new IllegalArgumentException();
          }
          this.keyCode = 0;
          this.pressedMouseButton = 0;
          this.mouseButtonEvent = 0;
          if (SetDebrisPartitioned.field_o == 0) {
            if (this.heldMouseButton != 0 &&
              GpuVertexNormal.field_b != 0) {
              if (this.repeatCountdown > 0) {
                this.repeatCountdown = this.repeatCountdown - 1;
                if (SetDebrisPartitioned.field_o == 0 &&
                  0 == GpuVertexNormal.field_b) {
                  this.heldMouseButton = 0;
                }
                if (0 != this.heldMouseButton) {
                  return;
                }
                if (!this.pointerSelection &&
                  !VariableConditionFactory.field_c) {
                  return;
                }
                if (0 <= param2) {
                  if (this.selectedIndex != param2) {
                    this.pointerSelection = true;
                    this.selectedIndex = param2;
                    return;
                  }
                  this.pointerSelection = true;
                  this.selectedIndex = param2;
                  return;
                }
                if (this.pointerSelection) {
                  this.selectedIndex = -1;
                }
                return;
              }
              this.repeatCountdown = GetDebrisGroupColour.field_q;
              this.mouseButtonEvent = this.heldMouseButton;
              this.repeatCountdown = this.repeatCountdown - 1;
              if (SetDebrisPartitioned.field_o == 0 &&
                0 == GpuVertexNormal.field_b) {
                this.heldMouseButton = 0;
              }
              if (0 != this.heldMouseButton) {
                return;
              }
              if (!this.pointerSelection &&
                !VariableConditionFactory.field_c) {
                return;
              }
              if (0 <= param2) {
                if (this.selectedIndex != param2) {
                  this.pointerSelection = true;
                  this.selectedIndex = param2;
                  return;
                }
                this.pointerSelection = true;
                this.selectedIndex = param2;
                return;
              }
              if (this.pointerSelection) {
                this.selectedIndex = -1;
              }
              return;
            }
            if (SetDebrisPartitioned.field_o == 0 &&
              0 == GpuVertexNormal.field_b) {
              this.heldMouseButton = 0;
              if (0 != this.heldMouseButton) {
                return;
              }
              if (!this.pointerSelection &&
                !VariableConditionFactory.field_c) {
                return;
              }
              if (0 <= param2) {
                if (this.selectedIndex != param2) {
                  this.pointerSelection = true;
                  this.selectedIndex = param2;
                  return;
                }
                this.pointerSelection = true;
                this.selectedIndex = param2;
                return;
              }
              if (this.pointerSelection) {
                this.selectedIndex = -1;
              }
              return;
            }
          } else {
            this.repeatCountdown = SetNebulaFadesOutWhenClose.field_p;
            this.pointerSelection = true;
            this.mouseButtonEvent = SetDebrisPartitioned.field_o;
            this.pressedMouseButton = SetDebrisPartitioned.field_o;
            this.selectedIndex = param0;
            this.heldMouseButton = SetDebrisPartitioned.field_o;
            if (this.heldMouseButton != 0 &&
              GpuVertexNormal.field_b != 0) {
              if (this.repeatCountdown > 0) {
                this.repeatCountdown = this.repeatCountdown - 1;
                if (SetDebrisPartitioned.field_o == 0 &&
                  0 == GpuVertexNormal.field_b) {
                  this.heldMouseButton = 0;
                }
                if (0 != this.heldMouseButton) {
                  return;
                }
                if (!this.pointerSelection &&
                  !VariableConditionFactory.field_c) {
                  return;
                }
                if (0 <= param2) {
                  if (this.selectedIndex != param2) {
                    this.pointerSelection = true;
                    this.selectedIndex = param2;
                    return;
                  }
                  this.pointerSelection = true;
                  this.selectedIndex = param2;
                  return;
                }
                if (this.pointerSelection) {
                  this.selectedIndex = -1;
                }
                return;
              }
              this.repeatCountdown = GetDebrisGroupColour.field_q;
              this.mouseButtonEvent = this.heldMouseButton;
              this.repeatCountdown = this.repeatCountdown - 1;
            }
            if (SetDebrisPartitioned.field_o == 0 &&
              0 == GpuVertexNormal.field_b) {
              this.heldMouseButton = 0;
            }
          }
        }
        if (0 != this.heldMouseButton) {
          return;
        }
        if (!this.pointerSelection &&
          !VariableConditionFactory.field_c) {
          return;
        }
        if (0 > param2) {
          if (!this.pointerSelection) {
            return;
          }
          this.selectedIndex = -1;
          return;
        }
        if (this.selectedIndex != param2) {
        }
        this.pointerSelection = true;
        this.selectedIndex = param2;
    }

    final void setKeyboardSelection(byte param0, int param1) {
        if (param0 != -17) {
          this.isHomePressed(true);
          if (this.heldMouseButton == 0) {
            this.pointerSelection = false;
            this.selectedIndex = param1;
            return;
          }
          return;
        }
        if (this.heldMouseButton != 0) {
          return;
        }
        this.pointerSelection = false;
        this.selectedIndex = param1;
    }

    final boolean isMouseButtonHeld(byte param0) {
        int var2 = 41 / ((param0 - 43) / 61);
        return this.heldMouseButton != 0 ? true : false;
    }

    final boolean isActivationRequested(byte param0) {
        if (param0 >= -74) {
          this.isEndPressed(-86);
          if (this.pressedMouseButton != 0) {
            return true;
          }
          if (84 != this.keyCode) {
            return this.keyCode == 83 ? true : false;
          }
          return true;
        }
        if (this.pressedMouseButton != 0) {
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

    final boolean isIncreaseOrActivateRequested(byte param0) {
        if (param0 != -45) {
          return false;
        }
        if (this.mouseButtonEvent == 1) {
          return true;
        }
        if (this.keyCode == 97) {
          return true;
        }
        if (this.keyCode == 84) {
          return true;
        }
        if (83 != this.keyCode) {
          return false;
        }
        return true;
    }

    final void updateHorizontalSelection(boolean param0, int param1) {
        this.pressedMouseButton = 0;
        this.keyCode = 0;
        if (param0) {
          this.pressedMouseButton = 19;
          this.mouseButtonEvent = 0;
          if (0 == this.heldMouseButton) {
            this.keyCode = SetBombletSprayProjectileDamage.field_o;
          }
          if (this.heldMouseButton != 0) {
            if (this.heldMouseButton == 0 &&
              97 == SetBombletSprayProjectileDamage.field_o) {
              this.selectedIndex = this.selectedIndex + 1;
              if (this.itemCount <= this.selectedIndex) {
                this.selectedIndex = 0;
              }
              this.pointerSelection = false;
            }
            if (this.heldMouseButton == 0) {
              if (SetBombletSprayProjectileDamage.field_o != 98 &&
                SetBombletSprayProjectileDamage.field_o != 99) {
                return;
              }
              this.pointerSelection = false;
              if (0 > this.selectedIndex) {
                this.selectedIndex = param1;
              }
            }
            return;
          }
          if (SetBombletSprayProjectileDamage.field_o == 96) {
            if (0 >= this.selectedIndex) {
              this.selectedIndex = this.itemCount;
            }
            this.pointerSelection = false;
            this.selectedIndex = this.selectedIndex - 1;
          }
          if (this.heldMouseButton != 0) {
            if (this.heldMouseButton == 0) {
              if (SetBombletSprayProjectileDamage.field_o != 98 &&
                SetBombletSprayProjectileDamage.field_o != 99) {
                return;
              }
              this.pointerSelection = false;
              if (0 > this.selectedIndex) {
                this.selectedIndex = param1;
              }
            }
            return;
          }
          if (97 == SetBombletSprayProjectileDamage.field_o) {
            this.selectedIndex = this.selectedIndex + 1;
            if (this.itemCount <= this.selectedIndex) {
              this.selectedIndex = 0;
            }
            this.pointerSelection = false;
          }
          if (this.heldMouseButton == 0) {
            if (SetBombletSprayProjectileDamage.field_o != 98 &&
              SetBombletSprayProjectileDamage.field_o != 99) {
              return;
            }
            this.pointerSelection = false;
            if (0 > this.selectedIndex) {
              this.selectedIndex = param1;
            }
          }
          return;
        }
        this.mouseButtonEvent = 0;
        if (0 == this.heldMouseButton) {
          this.keyCode = SetBombletSprayProjectileDamage.field_o;
        }
        if (this.heldMouseButton == 0 &&
          SetBombletSprayProjectileDamage.field_o == 96) {
          if (0 >= this.selectedIndex) {
            this.selectedIndex = this.itemCount;
          }
          this.pointerSelection = false;
          this.selectedIndex = this.selectedIndex - 1;
        }
        if (this.heldMouseButton == 0 &&
          97 == SetBombletSprayProjectileDamage.field_o) {
          this.selectedIndex = this.selectedIndex + 1;
          if (this.itemCount <= this.selectedIndex) {
            this.selectedIndex = 0;
          }
          this.pointerSelection = false;
        }
        if (this.heldMouseButton != 0) {
          return;
        }
        if (SetBombletSprayProjectileDamage.field_o != 98 &&
          SetBombletSprayProjectileDamage.field_o != 99) {
          return;
        }
        this.pointerSelection = false;
        if (0 <= this.selectedIndex) {
          return;
        }
        this.selectedIndex = param1;
    }

    final boolean isHomePressed(boolean param0) {
        if (param0) {
          return this.keyCode == 102 ? true : false;
        }
        this.setKeyboardSelection((byte) -113, -81);
        return this.keyCode == 102 ? true : false;
    }

    final void updateVerticalSelection(byte param0) {
        this.mouseButtonEvent = 0;
        this.keyCode = 0;
        this.pressedMouseButton = 0;
        if (this.heldMouseButton == 0) {
          this.keyCode = SetBombletSprayProjectileDamage.field_o;
          if (0 != this.heldMouseButton) {
            if (param0 > -37) {
              MenuInputState.clearSharedReferences(15);
            }
            if (this.heldMouseButton == 0 &&
              99 == SetBombletSprayProjectileDamage.field_o) {
              this.selectedIndex = this.selectedIndex + 1;
              if (this.selectedIndex >= this.itemCount) {
                this.selectedIndex = 0;
              }
              this.pointerSelection = false;
            }
            return;
          }
          if (98 != SetBombletSprayProjectileDamage.field_o) {
            if (param0 > -37) {
              MenuInputState.clearSharedReferences(15);
            }
            if (this.heldMouseButton == 0 &&
              99 == SetBombletSprayProjectileDamage.field_o) {
              this.selectedIndex = this.selectedIndex + 1;
              if (this.selectedIndex >= this.itemCount) {
                this.selectedIndex = 0;
              }
              this.pointerSelection = false;
            }
            return;
          }
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.pointerSelection = false;
          this.selectedIndex = this.selectedIndex - 1;
        } else {
          if (0 == this.heldMouseButton &&
            98 == SetBombletSprayProjectileDamage.field_o) {
            if (this.selectedIndex <= 0) {
              this.selectedIndex = this.itemCount;
              this.pointerSelection = false;
              this.selectedIndex = this.selectedIndex - 1;
              if (param0 > -37) {
                MenuInputState.clearSharedReferences(15);
              }
              if (this.heldMouseButton == 0) {
                if (99 != SetBombletSprayProjectileDamage.field_o) {
                  return;
                }
                this.selectedIndex = this.selectedIndex + 1;
                if (this.selectedIndex >= this.itemCount) {
                  this.selectedIndex = 0;
                }
                this.pointerSelection = false;
              }
              return;
            }
            this.pointerSelection = false;
            this.selectedIndex = this.selectedIndex - 1;
          }
        }
        if (param0 > -37) {
          MenuInputState.clearSharedReferences(15);
        }
        if (this.heldMouseButton != 0) {
          return;
        }
        if (99 != SetBombletSprayProjectileDamage.field_o) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        if (this.selectedIndex >= this.itemCount) {
          this.selectedIndex = 0;
        }
        this.pointerSelection = false;
    }

    final void resetSelection(boolean param0, int param1, int param2, int param3) {
        this.pointerSelection = param0 ? true : false;
        this.heldMouseButton = 0;
        if (this.pointerSelection) {
          this.selectedIndex = param3;
          if (param1 != -1) {
            this.selectedIndex = -82;
            return;
          }
          return;
        }
        this.selectedIndex = param2;
        if (param1 != -1) {
          this.selectedIndex = -82;
          return;
        }
    }

    final static Ship createShipFromComponentWords(int[] param0, byte param1) {
        Ship var2 = null;
        RuntimeException var2_ref = null;
        Ship stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new Ship();
          var2.chassis = SetSniperCannonProjectileLife.decodeComponentWords(1, param0);
          var2.recalculateMassProperties((byte) 119);
          var2.chassis.updateWorldTransforms(true, 0, 0, 0, 0, var2.getBoundingbox((byte) -123));
          var2.chassis.configureThrusterBindings((byte) 21, (ShipBody) (var2));
          if (param1 <= 21) {
            field_g = (QuickChatDynamicCommand) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("ae.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 == -1) {
          field_f = null;
          field_g = null;
          return;
        }
        int[] var2 = (int[]) null;
        MenuInputState.createShipFromComponentWords((int[]) null, (byte) -13);
        field_f = null;
        field_g = null;
    }

    final boolean isLeftPressed(byte param0) {
        if (param0 != -7) {
          return true;
        }
        return this.keyCode == 96 ? true : false;
    }

    final boolean isEndPressed(int param0) {
        if (param0 == 12465) {
          return this.keyCode == 103 ? true : false;
        }
        this.setKeyboardSelection((byte) 108, -98);
        return this.keyCode == 103 ? true : false;
    }

    final boolean isRightPressed(int param0) {
        if (param0 <= -79) {
          return 97 == this.keyCode ? true : false;
        }
        this.keyCode = -15;
        return 97 == this.keyCode ? true : false;
    }

    MenuInputState(int param0) {
        this.pointerSelection = false;
        this.selectedIndex = 0;
        this.itemCount = param0;
    }

    static {
        field_g = new QuickChatDynamicCommand(12, 0, 1, 0);
    }
}
