/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    static Sprite field_b;
    static String field_e;
    private int field_a;
    static int[] field_l;
    private int field_k;
    static int field_i;
    private int field_c;
    int field_d;
    private int field_n;
    private boolean field_m;
    int field_o;
    static String field_j;
    static int field_h;
    static float field_g;
    private int field_f;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_l = null;
        field_b = null;
        if (param0 != 31) {
          return;
        }
        field_j = null;
    }

    final boolean isForwardAction(int param0) {
        if (param0 != 83) {
          return true;
        }
        if (this.field_k != 0) {
          return true;
        }
        if (this.field_f == 84) {
          return true;
        }
        if (this.field_f != 83) {
          return false;
        }
        return true;
    }

    final boolean isActivated(boolean param0) {
        if (param0) {
          this.isPointerHeld((byte) 58);
          if (0 != this.field_a) {
            return true;
          }
          if (this.field_f != 84) {
            return this.field_f == 83 ? true : false;
          }
          return true;
        }
        if (0 != this.field_a) {
          return true;
        }
        if (this.field_f == 84) {
          return true;
        }
        if (this.field_f != 83) {
          return false;
        }
        return true;
    }

    final boolean isRightPressed(byte param0) {
        if (param0 < -121) {
          return this.field_f == 97 ? true : false;
        }
        this.isHomePressed((byte) 1);
        return this.field_f == 97 ? true : false;
    }

    final boolean isHomePressed(byte param0) {
        if (param0 > 42) {
          return this.field_f == 102 ? true : false;
        }
        field_l = (int[]) null;
        return this.field_f == 102 ? true : false;
    }

    final void captureKeyCode(byte param0) {
        this.field_f = 0;
        if (param0 == 32) {
          this.field_a = 0;
          this.field_k = 0;
          if (this.field_n == 0) {
            this.field_f = ScrollPane.field_Gb;
          }
          return;
        }
        field_h = -27;
        this.field_a = 0;
        this.field_k = 0;
        if (this.field_n == 0) {
          this.field_f = ScrollPane.field_Gb;
        }
    }

    final void updatePointer(int param0, boolean param1, int param2) {
        if (param0 >= this.field_o) {
          throw new IllegalArgumentException();
        }
        if (param1) {
          this.field_a = 15;
          if (param2 >= this.field_o) {
            throw new IllegalArgumentException();
          }
          this.field_k = 0;
          this.field_f = 0;
          this.field_a = 0;
          if (MenuScreen.field_g != 0) {
            this.field_k = MenuScreen.field_g;
            this.field_a = MenuScreen.field_g;
            this.field_c = ClientEnvironmentHelpers.field_d;
            this.field_m = true;
            this.field_n = MenuScreen.field_g;
            this.field_d = param2;
          }
          if (0 != this.field_n &&
            NodeHashTableIterator.field_e != 0) {
            if (0 >= this.field_c) {
              this.field_k = this.field_n;
              this.field_c = FrameSkin.field_e;
            }
            this.field_c = this.field_c - 1;
          }
          if (MenuScreen.field_g == 0 &&
            NodeHashTableIterator.field_e == 0) {
            this.field_n = 0;
          }
          if (this.field_n != 0) {
            return;
          }
          if (!this.field_m &&
            !ValidationIndicator.field_J) {
            return;
          }
        } else {
          if (param2 >= this.field_o) {
            throw new IllegalArgumentException();
          }
          this.field_k = 0;
          this.field_f = 0;
          this.field_a = 0;
          if (MenuScreen.field_g != 0) {
            this.field_k = MenuScreen.field_g;
            this.field_a = MenuScreen.field_g;
            this.field_c = ClientEnvironmentHelpers.field_d;
            this.field_m = true;
            this.field_n = MenuScreen.field_g;
            this.field_d = param2;
          }
          if (0 != this.field_n) {
            if (NodeHashTableIterator.field_e == 0) {
              if (MenuScreen.field_g == 0 &&
                NodeHashTableIterator.field_e == 0) {
                this.field_n = 0;
                if (this.field_n != 0) {
                  return;
                }
                if (!this.field_m &&
                  !ValidationIndicator.field_J) {
                  return;
                }
              } else {
                if (this.field_n != 0) {
                  return;
                }
                if (!this.field_m &&
                  !ValidationIndicator.field_J) {
                  return;
                }
              }
              if (param0 < 0) {
                if (!this.field_m) {
                  return;
                }
                this.field_d = -1;
                return;
              }
              if (param0 != this.field_d) {
              }
              this.field_d = param0;
              this.field_m = true;
              return;
            }
            if (0 >= this.field_c) {
              this.field_k = this.field_n;
              this.field_c = FrameSkin.field_e;
            }
            this.field_c = this.field_c - 1;
          }
          if (MenuScreen.field_g == 0 &&
            NodeHashTableIterator.field_e == 0) {
            this.field_n = 0;
            if (this.field_n != 0) {
              return;
            }
            if (!this.field_m &&
              !ValidationIndicator.field_J) {
              return;
            }
            if (param0 < 0) {
              if (!this.field_m) {
                return;
              }
              this.field_d = -1;
              return;
            }
            if (param0 != this.field_d) {
            }
            this.field_d = param0;
            this.field_m = true;
            return;
          }
          if (this.field_n != 0) {
            return;
          }
          if (!this.field_m &&
            !ValidationIndicator.field_J) {
            return;
          }
        }
        if (param0 < 0) {
          if (!this.field_m) {
            return;
          }
          this.field_d = -1;
          return;
        }
        if (param0 != this.field_d) {
        }
        this.field_d = param0;
        this.field_m = true;
    }

    final void selectIndex(int param0, int param1) {
        if (param0 <= -26) {
          if (this.field_n == 0) {
            this.field_m = false;
            this.field_d = param1;
          }
          return;
        }
        this.initializeSelection(true, -3, 38, -40);
        if (this.field_n == 0) {
          this.field_m = false;
          this.field_d = param1;
        }
    }

    final boolean isNextAction(int param0) {
        if (param0 != -1) {
          field_j = (String) null;
          if (1 == this.field_k) {
            return true;
          }
          if (this.field_f == 97) {
            return true;
          }
          if (this.field_f == 84) {
            return true;
          }
          if (this.field_f != 83) {
            return false;
          }
          return true;
        }
        if (1 == this.field_k) {
          return true;
        }
        if (this.field_f == 97) {
          return true;
        }
        if (this.field_f == 84) {
          return true;
        }
        if (this.field_f != 83) {
          return false;
        }
        return true;
    }

    final boolean isPointerHeld(byte param0) {
        if (param0 <= 118) {
          return false;
        }
        return this.field_n != 0 ? true : false;
    }

    final boolean isBackAction(int param0) {
        if (param0 != 26505) {
          return false;
        }
        if (2 == this.field_k) {
          return true;
        }
        if (this.field_f != 96) {
          return false;
        }
        return true;
    }

    final void handleVerticalNavigation(int param0) {
        int var2;
        int var2Lifetime1;
        this.field_a = 0;
        this.field_f = 0;
        this.field_k = 0;
        if (this.field_n == 0) {
          this.field_f = ScrollPane.field_Gb;
        }
        if (this.field_n == 0 &&
          ScrollPane.field_Gb == 98) {
          if (this.field_d > 0) {
            this.field_m = false;
            this.field_d = this.field_d - 1;
            var2 = 70 / ((-6 - param0) / 32);
            if (0 != this.field_n) {
              return;
            }
            if (ScrollPane.field_Gb != 99) {
              return;
            }
            this.field_d = this.field_d + 1;
            this.field_m = false;
            if (this.field_d < this.field_o) {
              return;
            }
            this.field_d = 0;
            return;
          }
          this.field_d = this.field_o;
          this.field_m = false;
          this.field_d = this.field_d - 1;
        }
        var2Lifetime1 = 70 / ((-6 - param0) / 32);
        if (0 != this.field_n) {
          return;
        }
        if (ScrollPane.field_Gb != 99) {
          return;
        }
        this.field_d = this.field_d + 1;
        this.field_m = false;
        if (this.field_d < this.field_o) {
          return;
        }
        this.field_d = 0;
    }

    final boolean isEndPressed(byte param0) {
        if (param0 >= 7) {
          return this.field_f == 103 ? true : false;
        }
        field_i = -73;
        return this.field_f == 103 ? true : false;
    }

    final static void closeGameConnection(boolean param0) {
        if (!param0) {
          if (null != QuickChatMenu.field_Ub) {
            QuickChatMenu.field_Ub.close(4155);
            QuickChatMenu.field_Ub = null;
          }
          return;
        }
        field_e = (String) null;
        if (null != QuickChatMenu.field_Ub) {
          QuickChatMenu.field_Ub.close(4155);
          QuickChatMenu.field_Ub = null;
        }
    }

    final static void updateLobbySlide(int param0) {
        int var1 = -34 % ((param0 + 22) / 38);
        if (IntrusiveDeque.field_h != LoginPanel.field_M.field_b) {
          EmailDomainValidationHelpers.field_c = EmailDomainValidationHelpers.field_c + (LoginPanel.field_M.field_b - IntrusiveDeque.field_h);
          IntrusiveDeque.field_h = LoginPanel.field_M.field_b;
          if (!(0 >= Bzip2State.field_D)) {
            Bzip2State.field_D = Bzip2State.field_D - 1;
          }
          if (Bzip2State.field_D > 0) {
            MusicVolumeAndOverlayHelpers.animateLobbyOverlayBounds(-81);
            return;
          }
          return;
        }
        if (!(0 >= Bzip2State.field_D)) {
          Bzip2State.field_D = Bzip2State.field_D - 1;
        }
        if (Bzip2State.field_D <= 0) {
          return;
        }
        MusicVolumeAndOverlayHelpers.animateLobbyOverlayBounds(-81);
    }

    final boolean isLeftPressed(int param0) {
        if (param0 == 31) {
          return 96 == this.field_f ? true : false;
        }
        this.captureKeyCode((byte) 48);
        return 96 == this.field_f ? true : false;
    }

    MenuInputState(int param0) {
        this.field_d = 0;
        this.field_m = false;
        this.field_o = param0;
    }

    final void initializeSelection(boolean param0, int param1, int param2, int param3) {
        this.field_n = 0;
        if (param2 != -563) {
          return;
        }
        this.field_m = param0 ? true : false;
        if (!this.field_m) {
          this.field_d = param3;
          return;
        }
        this.field_d = param1;
    }

    static {
        field_l = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_j = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_g = 481.0f;
        field_e = "Retry";
    }
}
