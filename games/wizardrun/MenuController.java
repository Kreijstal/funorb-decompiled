/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuController {
    private int field_l;
    private int field_e;
    static int field_j;
    int field_a;
    private int field_c;
    static int[] keyCodeQueue;
    static int field_f;
    static int field_b;
    private int field_h;
    private boolean field_g;
    private boolean field_m;
    static String field_k;
    static String field_i;
    private int field_d;

    private final void handleMenuKey(int param0, byte param1) {
        int var4 = wizardrun.field_H;
        if (param1 != 81) {
          this.activateMenuItem(-42, -78);
          if (MidiNote.field_r == 96) {
            this.decreaseMenuVolume(param1 - 87, param0);
            return;
          }
          if (97 == MidiNote.field_r) {
            this.increaseMenuVolume(param0, false);
            return;
          }
          if (MidiNote.field_r == 84) {
            this.activateMenuItem(-128, param0);
            return;
          }
          if (MidiNote.field_r == 83) {
            this.activateMenuItem(-128, param0);
            return;
          }
          return;
        }
        if (MidiNote.field_r == 96) {
          this.decreaseMenuVolume(param1 - 87, param0);
          return;
        }
        if (97 == MidiNote.field_r) {
          this.increaseMenuVolume(param0, false);
          return;
        }
        if (MidiNote.field_r == 84) {
          this.activateMenuItem(-128, param0);
          return;
        }
        if (MidiNote.field_r != 83) {
          return;
        }
        this.activateMenuItem(-128, param0);
    }

    void drawMenuItems(int param0) {
        int var4 = wizardrun.field_H;
        int var2 = 0;
        int var3 = this.field_d;
        while (this.field_e > var2) {
          this.drawMenuItem(var3, this.field_a == var2 ? true : false, var2, (byte) -120);
          var3 = var3 + this.field_c;
          var2++;
        }
        if (param0 > 12) {
          return;
        }
        field_j = 114;
    }

    abstract void activateMenuItem(int param0, int param1);

    abstract void increaseMenuVolume(int param0, boolean param1);

    final void updateKeyboardSelection(int param0) {
        int var3;
        var3 = wizardrun.field_H;
        if (param0 != 0) {
          this.handleMenuKey(123, (byte) -33);
        }
        if (this.field_m) {
          return;
        }
        if (MidiNote.field_r == 98) {
          if (this.field_a <= 0) {
            this.field_a = this.field_e;
          }
          this.field_a = this.field_a - 1;
        } else {
          if (MidiNote.field_r != 99) {
            if (this.field_a < 0) {
              return;
            }
            this.handleMenuKey(this.field_a, (byte) 81);
            return;
          }
          this.field_a = this.field_a + 1;
          if (this.field_a >= this.field_e) {
            this.field_a = 0;
          }
        }
        this.field_g = true;
    }

    abstract void decreaseMenuVolume(int param0, int param1);

    final void updatePointerSelection(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        if (param0 != -2) {
          return;
        }
        if (UiThemeSetupHelpers.field_c == 0) {
          if (BrowserUrlLauncher.field_c == 0) {
            this.field_m = false;
            if (!NameCheckHelpers.field_a) {
              return;
            }
            var2 = this.hitTestOption(AchievementSubmission.field_n, -77, NetworkArchiveRequest.field_B);
            if (-1 != var2) {
              this.field_g = false;
              this.field_a = var2;
              return;
            }
            if (this.field_g) {
              return;
            }
            this.field_g = false;
            this.field_a = var2;
            return;
          }
          if (!this.field_m) {
            this.field_m = false;
            if (!NameCheckHelpers.field_a) {
              return;
            }
            var2Lifetime2 = this.hitTestOption(AchievementSubmission.field_n, -77, NetworkArchiveRequest.field_B);
            if (-1 != var2Lifetime2) {
              this.field_g = false;
              this.field_a = var2Lifetime2;
              return;
            }
            if (!this.field_g) {
              this.field_g = false;
              this.field_a = var2Lifetime2;
              return;
            }
            return;
          }
          var2Lifetime3 = this.field_a;
          if (var2Lifetime3 == -1) {
            return;
          }
          this.handleMenuPointer(AchievementSubmission.field_n, var2Lifetime3, -this.field_d + (NetworkArchiveRequest.field_B - this.field_c * var2Lifetime3), BrowserUrlLauncher.field_c, true, false);
          return;
        }
        var2Lifetime1 = this.hitTestOption(MouseInputHandler.field_e, param0 - 57, EmailDomainHelpers.field_b);
        this.field_a = var2Lifetime1;
        if (var2Lifetime1 != -1) {
          this.field_m = true;
          this.handleMenuPointer(MouseInputHandler.field_e, var2Lifetime1, -(this.field_c * var2Lifetime1) + EmailDomainHelpers.field_b - this.field_d, UiThemeSetupHelpers.field_c, false, false);
          return;
        }
        this.field_m = false;
    }

    void handleMenuPointer(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        int var8;
        var8 = wizardrun.field_H;
        if (!param4) {
          if (param3 == 1) {
            this.activateMenuItem(-125, param1);
          } else {
            this.decreaseMenuVolume(-6, param1);
          }
          SavedDataSubmission.field_j = SpriteButtonPainter.field_r;
        } else {
          SavedDataSubmission.field_j = SavedDataSubmission.field_j - 1;
          if (0 >= SavedDataSubmission.field_j) {
            if (param3 == 1) {
              this.activateMenuItem(-127, param1);
            } else {
              this.decreaseMenuVolume(-6, param1);
            }
            SavedDataSubmission.field_j = AccountValidationHelpers.field_b;
          }
        }
        if (!param5) {
          return;
        }
        this.handleMenuPointer(-72, -13, 38, -1, true, true);
    }

    abstract void drawMenuItem(int param0, boolean param1, int param2, byte param3);

    public static void releaseStatics(boolean param0) {
        field_i = null;
        field_k = null;
        keyCodeQueue = null;
        if (!param0) {
          MenuController.releaseStatics(false);
        }
    }

    MenuController(int param0, int param1, int param2, int param3, int param4) {
        this.field_a = 0;
        this.field_g = true;
        this.field_d = param3;
        this.field_e = param0;
        this.field_h = param2;
        this.field_c = param4;
        this.field_l = param1;
    }

    private final int hitTestOption(int param0, int param1, int param2) {
        if (param0 < this.field_l) {
          return -1;
        }
        if (param0 >= this.field_h) {
          return -1;
        }
        if (this.field_d > param2) {
          return -1;
        }
        int var4 = (-this.field_d + param2) / this.field_c;
        if (var4 >= this.field_e) {
          return -1;
        }
        if (param1 <= -52) {
          return var4;
        }
        keyCodeQueue = (int[]) null;
        return var4;
    }

    static {
        field_j = 0;
        keyCodeQueue = new int[128];
        field_i = "Loading sound effects";
        field_k = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
