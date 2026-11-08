/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    private int field_d;
    static int field_g;
    private int field_a;
    static boolean field_p;
    static int field_n;
    int field_m;
    boolean field_c;
    private int field_b;
    private int field_k;
    static String[] field_o;
    static SceneWidget field_j;
    static boolean field_f;
    static String field_i;
    int field_e;
    static int[] field_h;
    private boolean field_l;

    final void selectIfButtonHeld(int param0, int param1) {
        if (this.field_d == param0) {
          this.field_e = param1;
          this.field_l = false;
          this.field_c = true;
        }
    }

    final boolean isPointerHeld(int param0) {
        if (param0 == 0) {
          return 0 != this.field_d ? true : false;
        }
        this.handleHorizontalKey(false, -82);
        return 0 != this.field_d ? true : false;
    }

    final void initializeSelection(boolean param0, int param1, int param2, int param3) {
        this.field_l = param0 ? true : false;
        this.field_d = param2;
        if (this.field_l) {
          this.field_e = param3;
          return;
        }
        this.field_e = param1;
    }

    final void handleHorizontalKey(boolean param0, int param1) {
        this.field_c = false;
        if (!param0) {
          this.isForwardAction(-28);
        }
        this.field_b = 0;
        this.field_k = 0;
        if (this.field_d == 0 &&
          NameAvailabilityValidator.field_q == 96) {
          if (this.field_e <= 0) {
            this.field_e = this.field_m;
          }
          this.field_c = true;
          this.field_l = false;
          this.field_e = this.field_e - 1;
        }
        if (0 == this.field_d) {
          this.field_b = NameAvailabilityValidator.field_q;
        }
        if (this.field_d == 0 &&
          NameAvailabilityValidator.field_q == 97) {
          this.field_e = this.field_e + 1;
          if (this.field_e >= this.field_m) {
            this.field_e = 0;
          }
          this.field_c = true;
          this.field_l = false;
        }
        if (this.field_d != 0) {
          return;
        }
        if (NameAvailabilityValidator.field_q != 98 &&
          NameAvailabilityValidator.field_q != 99) {
          return;
        }
        if (this.field_e < 0) {
          this.field_e = param1;
        }
        this.field_l = false;
        this.field_c = true;
    }

    final boolean isLeftPressed(int param0) {
        int var2 = -101 / ((50 - param0) / 62);
        return this.field_b == 102 ? true : false;
    }

    final boolean isForwardAction(int param0) {
        if (param0 != 0) {
          return true;
        }
        if (this.field_k != 0) {
          return true;
        }
        if (this.field_b == 84) {
          return true;
        }
        if (this.field_b != 83) {
          return false;
        }
        return true;
    }

    final boolean isHomePressed(int param0) {
        if (param0 == -97) {
          return this.field_b == 96 ? true : false;
        }
        this.isPointerHeld(2);
        return this.field_b == 96 ? true : false;
    }

    final static void initializeReportReasonLabels(byte param0) {
        if (param0 <= -79) {
          LoginActionHelpers.field_g = new String[SoundAndUrlHelpers.field_d];
          LoginActionHelpers.field_g[21] = am.field_a;
          LoginActionHelpers.field_g[6] = LobbySetupHelpers.field_d;
          LoginActionHelpers.field_g[4] = dj.field_a;
          LoginActionHelpers.field_g[19] = ImageProducerRasterBuffer.field_q;
          LoginActionHelpers.field_g[15] = MusicPatchNode.field_u;
          LoginActionHelpers.field_g[20] = LoadingScreenHelpers.field_c;
          LoginActionHelpers.field_g[11] = TutorialStep.field_b;
          LoginActionHelpers.field_g[18] = HighscoreSubmission.field_v;
          LoginActionHelpers.field_g[7] = rb.field_e;
          LoginActionHelpers.field_g[5] = MusicPatchEnvelope.field_f;
          LoginActionHelpers.field_g[16] = SentinelCommandSimulator.field_i;
          LoginActionHelpers.field_g[17] = nf.field_d;
          LoginActionHelpers.field_g[9] = LoginActionHelpers.field_e;
          LoginActionHelpers.field_g[13] = GameKeyHandler.field_c;
          return;
        }
    }

    final void handleVerticalKey(boolean param0) {
        this.field_b = 0;
        if (param0) {
          this.field_c = false;
          this.field_k = 0;
          if (this.field_d == 0) {
            this.field_b = NameAvailabilityValidator.field_q;
          }
          if (0 == this.field_d &&
            NameAvailabilityValidator.field_q == 98) {
            if (0 >= this.field_e) {
              this.field_e = this.field_m;
            }
            this.field_e = this.field_e - 1;
            this.field_l = false;
            this.field_c = true;
          }
          if (0 != this.field_d) {
            return;
          }
          if (99 != NameAvailabilityValidator.field_q) {
            return;
          }
          this.field_e = this.field_e + 1;
          if (this.field_m <= this.field_e) {
            this.field_e = 0;
          }
          this.field_l = false;
          this.field_c = true;
          return;
        }
        this.selectIfButtonHeld(104, 84);
        this.field_c = false;
        this.field_k = 0;
        if (this.field_d == 0) {
          this.field_b = NameAvailabilityValidator.field_q;
        }
        if (0 != this.field_d) {
          if (0 != this.field_d) {
            return;
          }
          if (99 != NameAvailabilityValidator.field_q) {
            return;
          }
          this.field_e = this.field_e + 1;
          if (this.field_m <= this.field_e) {
            this.field_e = 0;
          }
          this.field_l = false;
          this.field_c = true;
          return;
        }
        if (NameAvailabilityValidator.field_q == 98) {
          if (0 >= this.field_e) {
            this.field_e = this.field_m;
          }
          this.field_e = this.field_e - 1;
          this.field_l = false;
          this.field_c = true;
        }
        if (0 != this.field_d) {
          return;
        }
        if (99 == NameAvailabilityValidator.field_q) {
          this.field_e = this.field_e + 1;
          if (this.field_m <= this.field_e) {
            this.field_e = 0;
          }
          this.field_l = false;
          this.field_c = true;
        }
    }

    final boolean isRightPressed(byte param0) {
        if (param0 == 51) {
          return this.field_b == 97 ? true : false;
        }
        MenuInputState.initializeReportReasonLabels((byte) 74);
        return this.field_b == 97 ? true : false;
    }

    final void updatePointer(int param0, int param1, int param2) {
        if (this.field_m <= param1) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_m) {
          throw new IllegalArgumentException();
        }
        this.field_c = false;
        this.field_b = 0;
        this.field_k = 0;
        if (VerticalScrollbar.field_gc != 0) {
          this.field_d = VerticalScrollbar.field_gc;
          this.field_e = param2;
          this.field_k = VerticalScrollbar.field_gc;
          this.field_a = HighscoreSubmission.field_x;
          this.field_l = true;
        }
        if (this.field_d == 0) {
          if (0 == VerticalScrollbar.field_gc) {
            if (WeightedLruCache.field_d != 0) {
              if (param0 <= 123) {
                this.isHomePressed(-13);
              }
              if (0 == this.field_d) {
                if (!this.field_l &&
                  !ConditionalTextValue.field_a) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_l) {
                    this.field_e = -1;
                  }
                } else {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_l = true;
                  } else {
                    this.field_c = true;
                    this.field_e = param1;
                    this.field_l = true;
                  }
                }
              }
              return;
            }
            this.field_d = 0;
          }
          if (param0 <= 123) {
            this.isHomePressed(-13);
            if (0 == this.field_d) {
              if (!this.field_l &&
                !ConditionalTextValue.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_l) {
                  this.field_e = -1;
                }
              } else {
                if (this.field_e == param1) {
                  this.field_e = param1;
                  this.field_l = true;
                } else {
                  this.field_c = true;
                  this.field_e = param1;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          if (0 != this.field_d) {
            return;
          }
          if (this.field_l) {
            if (0 > param1) {
              if (!this.field_l) {
                return;
              }
              this.field_e = -1;
              return;
            }
            if (this.field_e != param1) {
              this.field_c = true;
            }
            this.field_e = param1;
            this.field_l = true;
            return;
          }
          if (!ConditionalTextValue.field_a) {
            return;
          }
          if (0 > param1) {
            if (this.field_l) {
              this.field_e = -1;
            }
          } else {
            if (this.field_e != param1) {
              this.field_c = true;
            }
            this.field_e = param1;
            this.field_l = true;
          }
          return;
        }
        if (0 != WeightedLruCache.field_d) {
          if (this.field_a <= 0) {
            this.field_a = AlternateUsernameCredentials.field_B;
          }
          this.field_a = this.field_a - 1;
        }
        if (0 == VerticalScrollbar.field_gc) {
          if (WeightedLruCache.field_d != 0) {
            if (param0 > 123) {
              if (0 == this.field_d) {
                if (!this.field_l &&
                  !ConditionalTextValue.field_a) {
                  return;
                }
                if (0 > param1) {
                  if (this.field_l) {
                    this.field_e = -1;
                  }
                } else {
                  if (this.field_e == param1) {
                    this.field_e = param1;
                    this.field_l = true;
                  } else {
                    this.field_c = true;
                    this.field_e = param1;
                    this.field_l = true;
                  }
                }
              }
              return;
            }
            this.isHomePressed(-13);
            if (0 == this.field_d) {
              if (!this.field_l &&
                !ConditionalTextValue.field_a) {
                return;
              }
              if (0 > param1) {
                if (this.field_l) {
                  this.field_e = -1;
                }
              } else {
                if (this.field_e == param1) {
                  this.field_e = param1;
                  this.field_l = true;
                } else {
                  this.field_c = true;
                  this.field_e = param1;
                  this.field_l = true;
                }
              }
            }
            return;
          }
          this.field_d = 0;
        }
        if (param0 <= 123) {
          this.isHomePressed(-13);
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_l &&
            !ConditionalTextValue.field_a) {
            return;
          }
        } else {
          if (0 != this.field_d) {
            return;
          }
          if (!this.field_l &&
            !ConditionalTextValue.field_a) {
            return;
          }
        }
        if (0 > param1) {
          if (!this.field_l) {
            return;
          }
          this.field_e = -1;
          return;
        }
        if (this.field_e != param1) {
          this.field_c = true;
        }
        this.field_e = param1;
        this.field_l = true;
    }

    final void handleKeyWithoutNavigation(byte param0) {
        this.field_k = 0;
        if (param0 != 22) {
          this.isHomePressed(51);
          this.field_b = 0;
          this.field_c = false;
          if (this.field_d == 0) {
            this.field_b = NameAvailabilityValidator.field_q;
            return;
          }
          return;
        }
        this.field_b = 0;
        this.field_c = false;
        if (this.field_d != 0) {
          return;
        }
        this.field_b = NameAvailabilityValidator.field_q;
    }

    final boolean isEndPressed(byte param0) {
        int var2 = 22 % ((param0 + 5) / 55);
        return 103 == this.field_b ? true : false;
    }

    public static void releaseStatics(byte param0) {
        field_j = null;
        field_h = null;
        if (param0 != -18) {
          return;
        }
        field_i = null;
        field_o = null;
    }

    MenuInputState(int param0) {
        this.field_e = 0;
        this.field_l = false;
        this.field_m = param0;
    }

    static {
        int var0 = 0;
        field_p = true;
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = 2048;
        field_i = "Location";
        field_h = new int[129];
        field_h[0] = 0;
        for (var0 = 0; var0 < 64; var0++) {
          field_h[var0 + 1] = 257 * (var0 * 255 / 64);
          field_h[var0 + 65] = 65793 * (var0 * 255 / 64);
        }
    }
}
