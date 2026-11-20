/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSelectionController {
    private int activationButton;
    private int keyCode;
    private int repeatCountdown;
    int itemCount;
    int selectedIndex;
    private int heldMouseButton;
    private boolean mouseSelection;

    final boolean hasActivationInput(int param0) {
        if (param0 != -1) {
          this.heldMouseButton = 15;
          if (this.activationButton != 0) {
            return true;
          }
          if (this.keyCode != 84) {
            return 83 == this.keyCode ? true : false;
          }
          return true;
        }
        if (this.activationButton != 0) {
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

    final static void a(int param0, NineSlicePanel param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        try {
          WeightedLruCache.field_g = param0;
          AgeValidator.field_j = param2;
          NodeHashTableIterator.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "jn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void handleHorizontalKeys(byte param0, int param1) {
        this.activationButton = 0;
        if (param0 != -21) {
          return;
        }
        this.keyCode = 0;
        if (this.heldMouseButton == 0) {
          this.keyCode = DelayedServerPacket.field_n;
        }
        if (this.heldMouseButton == 0 &&
          DelayedServerPacket.field_n == 96) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.mouseSelection = false;
        }
        if (this.heldMouseButton == 0 &&
          DelayedServerPacket.field_n == 97) {
          this.selectedIndex = this.selectedIndex + 1;
          this.mouseSelection = false;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
        }
        if (this.heldMouseButton != 0) {
          return;
        }
        if (DelayedServerPacket.field_n != 98 &&
          99 != DelayedServerPacket.field_n) {
          return;
        }
        if (0 > this.selectedIndex) {
          this.selectedIndex = param1;
        }
        this.mouseSelection = false;
    }

    final void updateMouseSelection(int param0, int param1, int param2) {
        if (this.itemCount <= param1) {
          throw new IllegalArgumentException();
        }
        if (param0 >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        this.activationButton = 0;
        this.keyCode = 0;
        if (param2 != 4) {
          return;
        }
        if (ValidationIndicator.field_J != 0) {
          this.heldMouseButton = ValidationIndicator.field_J;
          this.repeatCountdown = fc.field_d;
          this.mouseSelection = true;
          this.activationButton = ValidationIndicator.field_J;
          this.selectedIndex = param0;
        }
        if (0 != this.heldMouseButton) {
          if (RoadStripRenderer.field_f == 0) {
            if (ValidationIndicator.field_J != 0) {
              if (this.heldMouseButton == 0) {
                if (!this.mouseSelection &&
                  !na.field_k) {
                  return;
                }
                if (param1 < 0) {
                  if (this.mouseSelection) {
                    this.selectedIndex = -1;
                  }
                } else {
                  if (this.selectedIndex == param1) {
                    this.mouseSelection = true;
                    this.selectedIndex = param1;
                  } else {
                    this.mouseSelection = true;
                    this.selectedIndex = param1;
                  }
                }
              }
              return;
            }
            if (RoadStripRenderer.field_f != 0) {
              if (this.heldMouseButton == 0) {
                if (!this.mouseSelection &&
                  !na.field_k) {
                  return;
                }
                if (param1 < 0) {
                  if (this.mouseSelection) {
                    this.selectedIndex = -1;
                  }
                } else {
                  if (this.selectedIndex == param1) {
                    this.mouseSelection = true;
                    this.selectedIndex = param1;
                  } else {
                    this.mouseSelection = true;
                    this.selectedIndex = param1;
                  }
                }
              }
              return;
            }
            this.heldMouseButton = 0;
            if (this.heldMouseButton != 0) {
              return;
            }
            if (!this.mouseSelection &&
              !na.field_k) {
              return;
            }
            if (param1 < 0) {
              if (!this.mouseSelection) {
                return;
              }
              this.selectedIndex = -1;
              return;
            }
            if (this.selectedIndex != param1) {
              this.mouseSelection = true;
              this.selectedIndex = param1;
              return;
            }
            this.mouseSelection = true;
            this.selectedIndex = param1;
            return;
          }
          if (this.repeatCountdown <= 0) {
            this.repeatCountdown = PasswordFieldRenderer.field_x;
          }
          this.repeatCountdown = this.repeatCountdown - 1;
        }
        if (ValidationIndicator.field_J == 0 &&
          RoadStripRenderer.field_f == 0) {
          this.heldMouseButton = 0;
        }
        if (this.heldMouseButton != 0) {
          return;
        }
        if (!this.mouseSelection &&
          !na.field_k) {
          return;
        }
        if (param1 < 0) {
          if (!this.mouseSelection) {
            return;
          }
          this.selectedIndex = -1;
          return;
        }
        if (this.selectedIndex == param1) {
        }
        this.mouseSelection = true;
        this.selectedIndex = param1;
    }

    final static boolean isAccountUiReady(byte param0) {
        if (param0 != -30) {
          return false;
        }
        if (10 > DiskCacheRequest.field_w) {
          return false;
        }
        if (PolarSortVector.field_d >= 13) {
          return true;
        }
        return false;
    }

    final void handleVerticalKeys(int param0) {
        this.activationButton = 0;
        this.keyCode = 0;
        if (param0 == ~this.heldMouseButton) {
          this.keyCode = DelayedServerPacket.field_n;
        }
        if (this.heldMouseButton == 0) {
          if (DelayedServerPacket.field_n != 98) {
            if (0 != this.heldMouseButton) {
              return;
            }
            if (99 != DelayedServerPacket.field_n) {
              return;
            }
            this.selectedIndex = this.selectedIndex + 1;
            if (this.selectedIndex >= this.itemCount) {
              this.selectedIndex = 0;
            }
            this.mouseSelection = false;
            return;
          }
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.mouseSelection = false;
        }
        if (0 == this.heldMouseButton &&
          99 == DelayedServerPacket.field_n) {
          this.selectedIndex = this.selectedIndex + 1;
          if (this.selectedIndex >= this.itemCount) {
            this.selectedIndex = 0;
          }
          this.mouseSelection = false;
        }
    }

    final static void initializeMusicArchives(ResourceArchive param0, int param1, ResourceArchive param2) {
        try {
          if (param1 > -8) {
            MenuSelectionController.isAccountUiReady((byte) -64);
          }
          ViewportSizingController.field_n = new MusicTrack[7];
          UsernameLoginCredentials.field_f = param2;
          AgeValidator.field_m = new String[7];
          i.field_k = new MusicTrack[7];
          ValidationHelpWidget.field_Q = param0;
          AgeValidator.field_m[0] = "holdtheline_title";
          AgeValidator.field_m[5] = "holdtheline_alpine";
          AgeValidator.field_m[1] = "holdtheline_victory_jingle";
          AccountProgressDialog.field_jb = -1;
          oc.field_a = 7;
          AgeValidator.field_m[4] = "holdtheline_desert";
          WeightedLruCache.field_e = 0;
          AgeValidator.field_m[6] = "holdtheline_urban";
          AgeValidator.field_m[2] = "holdtheline_lose_jingle";
          AgeValidator.field_m[3] = "holdtheline_classic";
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "jn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int readOptionalBits(int param0, byte param1, IsaacPacketBuffer param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param2.readBits(param0, 7);
          if (param1 != -96) {
            stackIn_2_0 = -57;
            return stackIn_2_0;
          }
          if ((1 << param0) - 1 == var3_int) {
            var3_int = -1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void setSelectionState(int param0, int param1, boolean param2, int param3) {
        this.mouseSelection = param2 ? true : false;
        this.heldMouseButton = param1;
        if (this.mouseSelection) {
          this.selectedIndex = param0;
          return;
        }
        this.selectedIndex = param3;
    }

    MenuSelectionController(int param0) {
        this.selectedIndex = 0;
        this.mouseSelection = false;
        this.itemCount = param0;
    }

    static {
    }
}
