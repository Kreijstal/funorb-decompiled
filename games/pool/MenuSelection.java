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

    final void a(int param0, byte param1) {
        if (this.heldCode == 0) {
          this.pointerDriven = false;
          this.selectedIndex = param0;
          this.field_a = true;
          if (param1 != 1) {
            this.isLeftArrow(107);
            return;
          }
          return;
        }
        if (param1 == 1) {
          return;
        }
        this.isLeftArrow(107);
    }

    final void a(boolean param0) {
        this.pressCode = 0;
        this.field_a = param0 ? true : false;
        this.keyCode = 0;
        if (this.heldCode == 0) {
          this.keyCode = IterableDualLinkDeque.field_a;
        }
    }

    final static void a(byte param0) {
        int var1 = 11 / ((42 - param0) / 35);
    }

    final boolean isPointerHeld(byte param0) {
        if (param0 >= 77) {
          return this.heldCode != 0 ? true : false;
        }
        this.isPointerHeld((byte) -114);
        return this.heldCode != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        if (this.itemCount <= param1) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        this.keyCode = 0;
        this.field_a = false;
        this.pressCode = 0;
        var4 = -36 % ((17 - param2) / 35);
        if (0 != MatchingTextValidator.field_s) {
          this.heldCode = MatchingTextValidator.field_s;
          this.field_i = ValidationIconWidget.field_V;
          this.pointerDriven = true;
          this.pressCode = MatchingTextValidator.field_s;
          this.selectedIndex = param0;
        }
        if (this.heldCode == 0) {
          if (MatchingTextValidator.field_s == 0 &&
            0 == cd.field_b) {
            this.heldCode = 0;
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !LoginPayload.field_c) {
                return;
              }
              if (param1 < 0) {
                if (this.pointerDriven) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex == param1) {
                  this.pointerDriven = true;
                  this.selectedIndex = param1;
                } else {
                  this.field_a = true;
                  this.pointerDriven = true;
                  this.selectedIndex = param1;
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
          if (param1 < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != param1) {
            this.field_a = true;
          }
          this.pointerDriven = true;
          this.selectedIndex = param1;
          return;
        }
        if (cd.field_b == 0) {
          if (MatchingTextValidator.field_s == 0 &&
            0 == cd.field_b) {
            this.heldCode = 0;
            if (this.heldCode == 0) {
              if (!this.pointerDriven &&
                !LoginPayload.field_c) {
                return;
              }
              if (param1 < 0) {
                if (this.pointerDriven) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex == param1) {
                  this.pointerDriven = true;
                  this.selectedIndex = param1;
                } else {
                  this.field_a = true;
                  this.pointerDriven = true;
                  this.selectedIndex = param1;
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
          if (param1 < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != param1) {
            this.field_a = true;
          }
          this.pointerDriven = true;
          this.selectedIndex = param1;
          return;
        }
        if (this.field_i > 0) {
          this.field_i = this.field_i - 1;
          if (MatchingTextValidator.field_s == 0 &&
            0 == cd.field_b) {
            this.heldCode = 0;
          }
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != param1) {
            this.field_a = true;
          }
          this.pointerDriven = true;
          this.selectedIndex = param1;
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
          if (param1 < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != param1) {
            this.field_a = true;
            this.pointerDriven = true;
            this.selectedIndex = param1;
            return;
          }
          this.pointerDriven = true;
          this.selectedIndex = param1;
          return;
        }
        if (0 != cd.field_b) {
          if (this.heldCode != 0) {
            return;
          }
          if (!this.pointerDriven &&
            !LoginPayload.field_c) {
            return;
          }
          if (param1 < 0) {
            if (!this.pointerDriven) {
              return;
            }
            this.selectedIndex = -1;
            return;
          }
          if (this.selectedIndex != param1) {
            this.field_a = true;
            this.pointerDriven = true;
            this.selectedIndex = param1;
            return;
          }
          this.pointerDriven = true;
          this.selectedIndex = param1;
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
        if (param1 < 0) {
          if (!this.pointerDriven) {
            return;
          }
          this.selectedIndex = -1;
          return;
        }
        if (this.selectedIndex != param1) {
          this.field_a = true;
          this.pointerDriven = true;
          this.selectedIndex = param1;
          return;
        }
        this.pointerDriven = true;
        this.selectedIndex = param1;
        return;
    }

    final static void h(int param0) {
        if (NodeHashTableIterator.field_a > 0) {
          NodeHashTableIterator.field_a = NodeHashTableIterator.field_a - 1;
          if (NodeHashTableIterator.field_a <= 0) {
            if (0 < PoolMatchController.field_z) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-42, PoolMatchController.field_z);
            }
            if (nj.field_b > 0) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
            }
            if (param0 != -13953) {
              MenuSelection.releaseStatics(67);
            }
            return;
          }
          IterableDualLinkDeque.a((byte) -80);
          if (0 >= PoolMatchController.field_z) {
            if (nj.field_b > 0) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
            }
            if (param0 != -13953) {
              MenuSelection.releaseStatics(67);
            }
            return;
          }
          fr.$cfr$intArgs$a$e9dea5688aa5(-42, PoolMatchController.field_z);
          if (nj.field_b > 0) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
          }
          if (param0 == -13953) {
            return;
          }
          MenuSelection.releaseStatics(67);
          return;
        }
        if (0 < PoolMatchController.field_z) {
          PoolMatchController.field_z = PoolMatchController.field_z - 1;
          if (NodeHashTableIterator.field_a > 0) {
            IterableDualLinkDeque.a((byte) -80);
          }
          if (0 < PoolMatchController.field_z) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-42, PoolMatchController.field_z);
          }
          if (nj.field_b > 0) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
          }
          if (param0 == -13953) {
            return;
          }
          MenuSelection.releaseStatics(67);
          return;
        }
        if (nj.field_b <= 0) {
          if (NodeHashTableIterator.field_a > 0) {
            IterableDualLinkDeque.a((byte) -80);
          }
          if (0 < PoolMatchController.field_z) {
            fr.$cfr$intArgs$a$e9dea5688aa5(-42, PoolMatchController.field_z);
          }
        } else {
          nj.field_b = nj.field_b - 1;
          if (NodeHashTableIterator.field_a > 0) {
            IterableDualLinkDeque.a((byte) -80);
            if (0 < PoolMatchController.field_z) {
              fr.$cfr$intArgs$a$e9dea5688aa5(-42, PoolMatchController.field_z);
            }
          } else {
            if (0 >= PoolMatchController.field_z) {
              if (nj.field_b > 0) {
                fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
              }
              if (param0 == -13953) {
                return;
              }
              MenuSelection.releaseStatics(67);
              return;
            }
            fr.$cfr$intArgs$a$e9dea5688aa5(-42, PoolMatchController.field_z);
          }
        }
        if (nj.field_b > 0) {
          fr.$cfr$intArgs$a$e9dea5688aa5(-35, nj.field_b);
        }
        if (param0 != -13953) {
          MenuSelection.releaseStatics(67);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        UiComponent var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 24552) {
            var3 = (UiComponent) null;
            MenuSelection.a(false, (UiComponent) null);
          }
          stackIn_5_0 = (null != CheckboxPainter.a(param0, param1 ^ 24553));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ia.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 == -1) {
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

    final static void a(boolean param0, UiComponent param1) {
        try {
          param1.textColor = 16777215;
          param1.horizontalAlignment = 1;
          param1.font = (BitmapFont) ((Object) sa.field_h);
          param1.frameSprites = rm.field_g;
          param1.capturedFrameSprites = null;
          if (!param0) {
            field_d = (BufferedFile[]) null;
          }
          param1.verticalAlignment = 1;
          param1.activeFrameSprites = null;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ia.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        MenuSelection.b(-55);
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
