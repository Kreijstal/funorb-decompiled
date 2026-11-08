/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSelection {
    static long field_k;
    static BufferedFile[] field_d;
    private int keyCode;
    private int pressCode;
    int selectedIndex;
    int itemCount;
    private boolean pointerDriven;
    static String mpOfferrematch;
    private int field_i;
    private int heldCode;
    boolean field_a;
    static int field_l;

    public static void releaseStatics(int param0) {
        mpOfferrematch = null;
        int var1 = 98 / ((param0 + 72) / 33);
        field_d = null;
    }

    final void selectFromKeyboard(int index, byte obfuscationGuard) {
        if (this.heldCode == 0) {
          this.pointerDriven = false;
          this.selectedIndex = index;
          this.field_a = true;
          if (obfuscationGuard != 1) {
            this.isLeftArrow(107);
            return;
          }
          return;
        }
        if (obfuscationGuard == 1) {
          return;
        }
        this.isLeftArrow(107);
    }

    final void beginKeyInput(boolean selectionChanged) {
        this.pressCode = 0;
        this.field_a = selectionChanged ? true : false;
        this.keyCode = 0;
        if (this.heldCode == 0) {
          this.keyCode = IterableDualLinkDeque.field_a;
        }
    }

    final static void validateSelectionGuard(byte param0) {
        int var1 = 11 / ((42 - param0) / 35);
    }

    final boolean isPointerHeld(byte param0) {
        if (param0 >= 77) {
          return this.heldCode != 0 ? true : false;
        }
        this.isPointerHeld((byte) -114);
        return this.heldCode != 0 ? true : false;
    }

    final void updatePointerSelection(int pressedIndex, int hoveredIndex, int obfuscationGuard) {
        int var4;
        if (this.itemCount <= hoveredIndex) {
          throw new IllegalArgumentException();
        }
        if (pressedIndex >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        this.keyCode = 0;
        this.field_a = false;
        this.pressCode = 0;
        var4 = -36 % ((17 - obfuscationGuard) / 35);
        if (0 != MatchingTextValidator.field_s) {
          this.heldCode = MatchingTextValidator.field_s;
          this.field_i = ValidationIconWidget.field_V;
          this.pointerDriven = true;
          this.pressCode = MatchingTextValidator.field_s;
          this.selectedIndex = pressedIndex;
        }
        if (this.heldCode == 0) {
          if (MatchingTextValidator.field_s == 0 &&
            0 == ClientInputResetSupport.field_b) {
            this.heldCode = 0;
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !LoginPayload.field_c) {
                return;
              }
              if (hoveredIndex < 0) {
                if (this.pointerDriven) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex == hoveredIndex) {
                  this.pointerDriven = true;
                  this.selectedIndex = hoveredIndex;
                } else {
                  this.field_a = true;
                  this.pointerDriven = true;
                  this.selectedIndex = hoveredIndex;
                }
              }
            }
            return;
          }
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (hoveredIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != hoveredIndex) {
            this.field_a = true;
          }
          this.pointerDriven = true;
          this.selectedIndex = hoveredIndex;
          return;
        }
        if (ClientInputResetSupport.field_b == 0) {
          if (MatchingTextValidator.field_s == 0 &&
            0 == ClientInputResetSupport.field_b) {
            this.heldCode = 0;
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !LoginPayload.field_c) {
                return;
              }
              if (hoveredIndex < 0) {
                if (this.pointerDriven) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex == hoveredIndex) {
                  this.pointerDriven = true;
                  this.selectedIndex = hoveredIndex;
                } else {
                  this.field_a = true;
                  this.pointerDriven = true;
                  this.selectedIndex = hoveredIndex;
                }
              }
            }
            return;
          }
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (hoveredIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != hoveredIndex) {
            this.field_a = true;
          }
          this.pointerDriven = true;
          this.selectedIndex = hoveredIndex;
          return;
        }
        if (this.field_i > 0) {
          this.field_i = this.field_i - 1;
          if (MatchingTextValidator.field_s == 0 &&
            0 == ClientInputResetSupport.field_b) {
            this.heldCode = 0;
          }
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (hoveredIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != hoveredIndex) {
            this.field_a = true;
          }
          this.pointerDriven = true;
          this.selectedIndex = hoveredIndex;
          return;
        }
        this.field_i = LobbyGame.field_oc;
        this.field_i = this.field_i - 1;
        if (MatchingTextValidator.field_s != 0) {
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (hoveredIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != hoveredIndex) {
            this.field_a = true;
            this.pointerDriven = true;
            this.selectedIndex = hoveredIndex;
            return;
          }
          this.pointerDriven = true;
          this.selectedIndex = hoveredIndex;
          return;
        }
        if (0 != ClientInputResetSupport.field_b) {
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (hoveredIndex < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != hoveredIndex) {
            this.field_a = true;
            this.pointerDriven = true;
            this.selectedIndex = hoveredIndex;
            return;
          }
          this.pointerDriven = true;
          this.selectedIndex = hoveredIndex;
          return;
        }
        this.heldCode = 0;
        if (this.heldCode != 0) {
          return;
        }
        if (!this.pointerDriven &&
          !LoginPayload.field_c) {
          return;
        }
        if (hoveredIndex < 0) {
          if (!this.pointerDriven) {
            return;
          }
          this.selectedIndex = -1;
          return;
        }
        if (this.selectedIndex != hoveredIndex) {
          this.field_a = true;
          this.pointerDriven = true;
          this.selectedIndex = hoveredIndex;
          return;
        }
        this.pointerDriven = true;
        this.selectedIndex = hoveredIndex;
        return;
    }

    final static void advanceSlidingGamePanels(int obfuscationGuard) {
        if (NodeHashTableIterator.field_a > 0) {
          NodeHashTableIterator.field_a = NodeHashTableIterator.field_a - 1;
          if (NodeHashTableIterator.field_a <= 0) {
            if (0 < PoolMatchController.field_z) {
              DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-42, PoolMatchController.field_z);
            }
            if (LogoMaterial.field_b > 0) {
              DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-35, LogoMaterial.field_b);
            }
            if (obfuscationGuard != -13953) {
              MenuSelection.releaseStatics(67);
            }
            return;
          }
          IterableDualLinkDeque.layoutSlidingLobbyPanels((byte) -80);
          if (0 >= PoolMatchController.field_z) {
            if (LogoMaterial.field_b > 0) {
              DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-35, LogoMaterial.field_b);
            }
            if (obfuscationGuard != -13953) {
              MenuSelection.releaseStatics(67);
            }
            return;
          }
          DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-42, PoolMatchController.field_z);
          if (LogoMaterial.field_b > 0) {
            DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-35, LogoMaterial.field_b);
          }
          if (obfuscationGuard == -13953) {
            return;
          }
          MenuSelection.releaseStatics(67);
          return;
        }
        if (0 < PoolMatchController.field_z) {
          PoolMatchController.field_z = PoolMatchController.field_z - 1;
          if (NodeHashTableIterator.field_a > 0) {
            IterableDualLinkDeque.layoutSlidingLobbyPanels((byte) -80);
          }
          if (0 < PoolMatchController.field_z) {
            DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-42, PoolMatchController.field_z);
          }
          if (LogoMaterial.field_b > 0) {
            DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-35, LogoMaterial.field_b);
          }
          if (obfuscationGuard == -13953) {
            return;
          }
          MenuSelection.releaseStatics(67);
          return;
        }
        if (LogoMaterial.field_b <= 0) {
          if (NodeHashTableIterator.field_a > 0) {
            IterableDualLinkDeque.layoutSlidingLobbyPanels((byte) -80);
          }
          if (0 < PoolMatchController.field_z) {
            DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-42, PoolMatchController.field_z);
          }
        } else {
          LogoMaterial.field_b = LogoMaterial.field_b - 1;
          if (NodeHashTableIterator.field_a > 0) {
            IterableDualLinkDeque.layoutSlidingLobbyPanels((byte) -80);
            if (0 < PoolMatchController.field_z) {
              DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-42, PoolMatchController.field_z);
            }
          } else {
            if (0 >= PoolMatchController.field_z) {
              if (LogoMaterial.field_b > 0) {
                DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-35, LogoMaterial.field_b);
              }
              if (obfuscationGuard == -13953) {
                return;
              }
              MenuSelection.releaseStatics(67);
              return;
            }
            DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-42, PoolMatchController.field_z);
          }
        }
        if (LogoMaterial.field_b > 0) {
          DelayedServerPacket.layoutSlidingGamePanelsIntArgs(-35, LogoMaterial.field_b);
        }
        if (obfuscationGuard != -13953) {
          MenuSelection.releaseStatics(67);
        }
    }

    final static boolean isIgnoredName(String name, int obfuscationGuard) {
        RuntimeException var2 = null;
        UiComponent var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 24552) {
            var3 = (UiComponent) null;
            MenuSelection.applyCenteredPanelStyle(false, (UiComponent) null);
          }
          stackIn_5_0 = (null != CheckboxPainter.findIgnoreEntryByName(name, obfuscationGuard ^ 24553));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ia.H(");
          if (name == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean hasPreviousChatContent(int obfuscationGuard) {
        if (obfuscationGuard == -1) {
          return null != CipherPacketBuffer.field_z ? true : false;
        }
        field_l = 96;
        return null != CipherPacketBuffer.field_z ? true : false;
    }

    final boolean isLeftArrow(int param0) {
        if (param0 == -20421) {
          return this.keyCode == 96 ? true : false;
        }
        this.field_a = true;
        return this.keyCode == 96 ? true : false;
    }

    final void initializeSelection(boolean param0, int param1, int param2, boolean param3) {
        this.pointerDriven = param0 ? true : false;
        if (param3) {
          this.heldCode = 0;
          if (!this.pointerDriven) {
            this.selectedIndex = param1;
          } else {
            this.selectedIndex = param2;
          }
          return;
        }
    }

    final void navigateVertical(int param0) {
        this.pressCode = 0;
        this.field_a = false;
        this.keyCode = 0;
        if (this.heldCode != 0) {
          if (this.heldCode == 0 &&
            98 == IterableDualLinkDeque.field_a) {
            if (this.selectedIndex <= 0) {
              this.selectedIndex = this.itemCount;
            }
            this.field_a = true;
            this.pointerDriven = false;
            this.selectedIndex = this.selectedIndex - 1;
          }
        } else {
          this.keyCode = IterableDualLinkDeque.field_a;
          if (this.heldCode != 0) {
            if (param0 != -15525) {
              return;
            }
            if (this.heldCode != 0) {
              return;
            }
            if (IterableDualLinkDeque.field_a != 99) {
              return;
            }
            this.selectedIndex = this.selectedIndex + 1;
            this.pointerDriven = false;
            if (this.itemCount <= this.selectedIndex) {
              this.selectedIndex = 0;
            }
            this.field_a = true;
            return;
          }
          if (98 == IterableDualLinkDeque.field_a) {
            if (this.selectedIndex <= 0) {
              this.selectedIndex = this.itemCount;
            }
            this.field_a = true;
            this.pointerDriven = false;
            this.selectedIndex = this.selectedIndex - 1;
          }
        }
        if (param0 != -15525) {
          return;
        }
        if (this.heldCode == 0 &&
          IterableDualLinkDeque.field_a == 99) {
          this.selectedIndex = this.selectedIndex + 1;
          this.pointerDriven = false;
          if (this.itemCount <= this.selectedIndex) {
            this.selectedIndex = 0;
          }
          this.field_a = true;
        }
    }

    final static void applyCenteredPanelStyle(boolean obfuscationGuard, UiComponent component) {
        try {
          component.textColor = 16777215;
          component.horizontalAlignment = 1;
          component.font = (BitmapFont) ((Object) CollisionContact.field_h);
          component.frameSprites = MeshSymmetrySupport.field_g;
          component.capturedFrameSprites = null;
          if (!obfuscationGuard) {
            field_d = (BufferedFile[]) null;
          }
          component.verticalAlignment = 1;
          component.activeFrameSprites = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ia.O(" + obfuscationGuard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isEndKey(int param0) {
        if (param0 == 103) {
          return 103 == this.keyCode ? true : false;
        }
        this.initializeSelection(false, 98, 79, false);
        return 103 == this.keyCode ? true : false;
    }

    final boolean isRightArrow(int param0) {
        if (param0 == -1) {
          return 97 == this.keyCode ? true : false;
        }
        MenuSelection.releaseStatics(19);
        return 97 == this.keyCode ? true : false;
    }

    final boolean isPressActivated(byte param0) {
        if (param0 < 49) {
          return false;
        }
        if (this.pressCode != 0) {
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

    final void navigateHorizontal(boolean param0, int param1) {
        this.pressCode = 0;
        this.keyCode = 0;
        this.field_a = false;
        if (this.heldCode != 0) {
          if (this.heldCode == 0) {
            this.keyCode = IterableDualLinkDeque.field_a;
          }
          if (!param0) {
            return;
          }
          if (this.heldCode == 0 &&
            97 == IterableDualLinkDeque.field_a) {
            this.selectedIndex = this.selectedIndex + 1;
            if (this.itemCount <= this.selectedIndex) {
              this.selectedIndex = 0;
            }
            this.field_a = true;
            this.pointerDriven = false;
          }
          if (0 != this.heldCode) {
            return;
          }
          if (IterableDualLinkDeque.field_a == 98) {
            this.pointerDriven = false;
            this.field_a = true;
            if (this.selectedIndex >= 0) {
              return;
            }
            this.selectedIndex = param1;
            return;
          }
          if (IterableDualLinkDeque.field_a != 99) {
            return;
          }
          this.pointerDriven = false;
          this.field_a = true;
          if (this.selectedIndex < 0) {
            this.selectedIndex = param1;
          }
          return;
        }
        if (IterableDualLinkDeque.field_a != 96) {
          if (this.heldCode == 0) {
            this.keyCode = IterableDualLinkDeque.field_a;
          }
          if (!param0) {
            return;
          }
          if (this.heldCode == 0 &&
            97 == IterableDualLinkDeque.field_a) {
            this.selectedIndex = this.selectedIndex + 1;
            if (this.itemCount <= this.selectedIndex) {
              this.selectedIndex = 0;
            }
            this.field_a = true;
            this.pointerDriven = false;
          }
          if (0 != this.heldCode) {
            return;
          }
          if (IterableDualLinkDeque.field_a == 98) {
            this.pointerDriven = false;
            this.field_a = true;
            if (this.selectedIndex >= 0) {
              return;
            }
            this.selectedIndex = param1;
            return;
          }
          if (IterableDualLinkDeque.field_a != 99) {
            return;
          }
          this.pointerDriven = false;
          this.field_a = true;
          if (this.selectedIndex < 0) {
            this.selectedIndex = param1;
          }
          return;
        }
        if (this.selectedIndex <= 0) {
          this.selectedIndex = this.itemCount;
        }
        this.selectedIndex = this.selectedIndex - 1;
        this.pointerDriven = false;
        this.field_a = true;
        if (this.heldCode == 0) {
          this.keyCode = IterableDualLinkDeque.field_a;
        }
        if (!param0) {
          return;
        }
        if (this.heldCode == 0 &&
          97 == IterableDualLinkDeque.field_a) {
          this.selectedIndex = this.selectedIndex + 1;
          if (this.itemCount <= this.selectedIndex) {
            this.selectedIndex = 0;
          }
          this.field_a = true;
          this.pointerDriven = false;
        }
        if (0 == this.heldCode) {
          if (IterableDualLinkDeque.field_a == 98) {
            this.pointerDriven = false;
            this.field_a = true;
            if (this.selectedIndex >= 0) {
              return;
            }
            this.selectedIndex = param1;
          } else {
            if (IterableDualLinkDeque.field_a == 99) {
              this.pointerDriven = false;
              this.field_a = true;
              if (this.selectedIndex < 0) {
                this.selectedIndex = param1;
              }
              return;
            }
          }
        }
    }

    final boolean isHomeKey(int param0) {
        if (param0 >= 19) {
          return this.keyCode == 102 ? true : false;
        }
        MenuSelection.hasPreviousChatContent(-55);
        return this.keyCode == 102 ? true : false;
    }

    MenuSelection(int param0) {
        this.pointerDriven = false;
        this.selectedIndex = 0;
        this.itemCount = param0;
    }

    static {
        mpOfferrematch = "Offer rematch";
        field_l = -1;
    }
}
