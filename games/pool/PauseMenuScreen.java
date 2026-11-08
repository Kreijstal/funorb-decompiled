/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PauseMenuScreen extends MenuScreen {
    static boolean field_H;
    static String messageLobby;
    static int field_J;
    private Sprite field_K;
    static String[] playerNs;

    final void drawScreen(int param0) {
        super.drawScreen(92);
        if (this.field_K != null) {
          this.field_K.draw(SoftwareRasterizer.width - this.field_K.field_z >> 1, 80);
        }
        if (param0 > 36) {
          return;
        }
        field_J = 74;
    }

    final void navigateBack(byte param0) {
        if (param0 < -11) {
          AccountCreationDialog.a(-3405, -1, LobbyPlayerLookupSupport.a(true) ? 21 : 0, false);
          return;
        }
        this.field_K = (Sprite) null;
        AccountCreationDialog.a(-3405, -1, LobbyPlayerLookupSupport.a(true) ? 21 : 0, false);
    }

    final static LoginResponse a(String[] args, int param1) {
        LoginResponse var2 = null;
        RuntimeException var2_ref = null;
        LoginResponse stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 57) {
            PauseMenuScreen.g(-2, 69);
          }
          var2 = new LoginResponse(false);
          var2.field_c = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("jo.EA(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void applyScreenLayouts(byte param0) {
        MenuScreen var1 = DisplayModeSupport.field_c[0];
        var1.buttonSpacing = 26;
        var1.buttonTop = 153;
        var1.drawsBackground = true;
        var1.hasButtonBackdrop = false;
        MenuScreen var4 = DisplayModeSupport.field_c[13];
        var4.enableFramedPanel(20, 100, -10);
        var4.hasButtonBackdrop = true;
        var4.buttonTop = 370;
        var4.framedPanel = true;
        MenuScreen var5 = DisplayModeSupport.field_c[1];
        var5.enableFramedPanel(120, 100, -10);
        var5.hasButtonBackdrop = true;
        var5.buttonSpacing = 60;
        var1 = DisplayModeSupport.field_c[6];
        var1.hasButtonBackdrop = true;
        var1.framedPanel = true;
        var1.buttonTop = 365;
        int var2 = 240;
        var1.buttonRight = -20 + (SoftwareRasterizer.width >> 1);
        var1.buttonLeft = (SoftwareRasterizer.width >> 1) - var2 - 20;
        MenuScreen var6 = DisplayModeSupport.field_c[7];
        var6.enableFramedPanel(40, 85, -10);
        var6.hasButtonBackdrop = true;
        MenuScreen var7 = DisplayModeSupport.field_c[18];
        var7.enableFramedPanel(20, 80, -10);
        var7.buttonLeft = 80;
        var7.hasButtonBackdrop = true;
        var7.buttonTop = 390;
        MenuScreen var8 = DisplayModeSupport.field_c[17];
        var8.enableFramedPanel(20, 80, -10);
        var8.buttonTop = 390;
        var8.buttonLeft = 80;
        var8.hasButtonBackdrop = true;
        MenuScreen var9 = DisplayModeSupport.field_c[15];
        var9.enableFramedPanel(20, 85, -10);
        var9.hasButtonBackdrop = true;
        var9.buttonTop = 120;
        var9.buttonSpacing = 45;
        MenuScreen var10 = DisplayModeSupport.field_c[16];
        var10.enableFramedPanel(20, 85, -10);
        var10.hasButtonBackdrop = true;
        var10.buttonSpacing = 45;
        var10.buttonTop = 120;
        MenuScreen var11 = DisplayModeSupport.field_c[14];
        var11.framedPanel = true;
        var11.setPanelBounds(-320 + SoftwareRasterizer.width, 140, 160, 300, 0);
        var11.buttonSpacing = 30;
        var11.buttonRight = 240 + SoftwareRasterizer.width >> 1;
        var11.buttonTop = 200;
        var11.buttonLeft = -240 + SoftwareRasterizer.width >> 1;
        var11.hasButtonBackdrop = false;
        MenuScreen var12 = DisplayModeSupport.field_c[2];
        var12.setPanelBounds(-320 + SoftwareRasterizer.width, 140, 160, 280, 0);
        var12.buttonRight = SoftwareRasterizer.width + 240 >> 1;
        var12.buttonLeft = SoftwareRasterizer.width - 240 >> 1;
        var12.framedPanel = true;
        var12.hasButtonBackdrop = true;
        var12.buttonSpacing = 50;
        var12.buttonTop = 205;
        var1 = DisplayModeSupport.field_c[9];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[10];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[11];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[12];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[8];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[9];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[3];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[22];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[24];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[23];
        var1.drawsBackground = false;
        var1 = DisplayModeSupport.field_c[21];
        int var3 = 122 / ((param0 + 66) / 32);
        var1.drawsBackground = true;
        MenuScreen var13 = DisplayModeSupport.field_c[19];
        var13.hasButtonBackdrop = true;
        var13.buttonSpacing = 40;
        var13.buttonTop = 260;
        var13.enableFramedPanel(80, 80, -10);
    }

    final static void a(float param0, float param1, float param2, float param3, int param4) {
        if (param4 == -31792) {
          Ball.a(param3, param0, 1.0f, 1.0f, param2, param1, -1);
          return;
        }
        PauseMenuScreen.a(0.2009153664112091f, 0.45015275478363037f, 2.6406524181365967f, -0.13969022035598755f, 60);
        Ball.a(param3, param0, 1.0f, 1.0f, param2, param1, -1);
    }

    final static int c(int param0, int param1, int param2) {
        if (param1 != -54264319) {
          playerNs = (String[]) null;
          return param2 << param0;
        }
        return param2 << param0;
    }

    final static void g(int param0, int param1) {
        int stackIn_52_0 = 0;
        int stackIn_128_0 = 0;
        int var2;
        int var2Lifetime1;
        PackedColorSupport.field_a = PackedColorSupport.field_a + 1;
        if (param0 != 0) {
          playerNs = (String[]) null;
          if (KillerBallSkin.field_m == param1) {
            if (!ClientException.field_j &&
              PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
              LoginPayload.field_c) {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              PackedColorSupport.field_a = 0;
            }
          } else {
            if (ClientException.field_j) {
              var2 = 0;
              if (param1 != -1) {
                if (!ClientException.field_j &&
                  var2 == 0) {
                  PackedColorSupport.field_a = 0;
                } else {
                  PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
                }
              } else {
                PackedColorSupport.field_a = 0;
              }
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              if (param1 == -1) {
                if (var2 != 0) {
                  ClientException.field_j = true;
                }
              } else {
                ClientException.field_j = false;
              }
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            } else {
              if (PackedColorSupport.field_a < LongAndTextLoginPayload.field_l) {
                var2 = 0;
                if (param1 != -1) {
                  if (ClientException.field_j) {
                    PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
                  } else {
                    if (var2 != 0) {
                      PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
                    } else {
                      PackedColorSupport.field_a = 0;
                    }
                  }
                } else {
                  PackedColorSupport.field_a = 0;
                }
                TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
                if (param1 == -1) {
                  if (var2 != 0) {
                    ClientException.field_j = true;
                  }
                } else {
                  ClientException.field_j = false;
                }
                SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              } else {
                stackIn_52_0 = (FadingDialog.field_Q + LongAndTextLoginPayload.field_l <= PackedColorSupport.field_a) ? 0 : 1;
                boolean decompiledFrameRemainder1 = true;
                var2 = stackIn_52_0;
                if (param1 != -1) {
                  if (ClientException.field_j) {
                    PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var2 != 0) {
                      PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  PackedColorSupport.field_a = 0;
                }
                boolean decompiledFrameRemainder0 = true;
                TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
                if (param1 == -1) {
                  if (var2 != 0) {
                    ClientException.field_j = true;
                    SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
                    decompiledFrameRemainder0 = false;
                  }
                } else {
                  ClientException.field_j = false;
                }
                if (decompiledFrameRemainder0) {
                  SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
                }
              }
            }
            if (!ClientException.field_j &&
              PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
              LoginPayload.field_c) {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              PackedColorSupport.field_a = 0;
            }
          }
          KillerBallSkin.field_m = param1;
          if (ClientException.field_j &&
            SocialListEntry.field_Vb == PackedColorSupport.field_a) {
            PackedColorSupport.field_a = 0;
            ClientException.field_j = false;
          }
          return;
        }
        if (KillerBallSkin.field_m == param1) {
          if (!ClientException.field_j &&
            PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
            LoginPayload.field_c) {
            SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
            PackedColorSupport.field_a = 0;
          }
          KillerBallSkin.field_m = param1;
          if (ClientException.field_j &&
            SocialListEntry.field_Vb == PackedColorSupport.field_a) {
            PackedColorSupport.field_a = 0;
            ClientException.field_j = false;
            return;
          }
          return;
        }
        if (!ClientException.field_j) {
          if (PackedColorSupport.field_a >= LongAndTextLoginPayload.field_l) {
            stackIn_128_0 = (FadingDialog.field_Q + LongAndTextLoginPayload.field_l > PackedColorSupport.field_a) ? 1 : 0;
          } else {
            stackIn_128_0 = 0;
          }
        } else {
          stackIn_128_0 = 0;
        }
        var2Lifetime1 = stackIn_128_0;
        if (param1 == -1) {
          PackedColorSupport.field_a = 0;
          TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
          if (param1 != -1) {
            ClientException.field_j = false;
            SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            if (!ClientException.field_j &&
              PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
              LoginPayload.field_c) {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              PackedColorSupport.field_a = 0;
              KillerBallSkin.field_m = param1;
              if (ClientException.field_j &&
                SocialListEntry.field_Vb == PackedColorSupport.field_a) {
                PackedColorSupport.field_a = 0;
                ClientException.field_j = false;
              }
              return;
            }
          } else {
            if (var2Lifetime1 != 0) {
              ClientException.field_j = true;
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              if (!ClientException.field_j &&
                PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
                LoginPayload.field_c) {
                SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
                TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
                PackedColorSupport.field_a = 0;
                KillerBallSkin.field_m = param1;
                if (ClientException.field_j &&
                  SocialListEntry.field_Vb == PackedColorSupport.field_a) {
                  PackedColorSupport.field_a = 0;
                  ClientException.field_j = false;
                }
                return;
              }
            } else {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              if (!ClientException.field_j &&
                PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
                LoginPayload.field_c) {
                SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
                TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
                PackedColorSupport.field_a = 0;
              }
            }
          }
        } else {
          if (ClientException.field_j) {
            PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
            TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
            if (param1 == -1) {
              if (var2Lifetime1 != 0) {
                ClientException.field_j = true;
              }
            } else {
              ClientException.field_j = false;
            }
            SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            if (!ClientException.field_j &&
              PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
              LoginPayload.field_c) {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              PackedColorSupport.field_a = 0;
            }
            KillerBallSkin.field_m = param1;
            if (ClientException.field_j &&
              SocialListEntry.field_Vb == PackedColorSupport.field_a) {
              PackedColorSupport.field_a = 0;
              ClientException.field_j = false;
            }
            return;
          }
          if (var2Lifetime1 != 0) {
            PackedColorSupport.field_a = LongAndTextLoginPayload.field_l;
            TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
            if (param1 == -1) {
              ClientException.field_j = true;
            } else {
              ClientException.field_j = false;
            }
            SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            if (!ClientException.field_j &&
              PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
              LoginPayload.field_c) {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              PackedColorSupport.field_a = 0;
            }
            KillerBallSkin.field_m = param1;
            if (ClientException.field_j &&
              SocialListEntry.field_Vb == PackedColorSupport.field_a) {
              PackedColorSupport.field_a = 0;
              ClientException.field_j = false;
              return;
            }
            return;
          }
          PackedColorSupport.field_a = 0;
          TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
          if (param1 != -1) {
            ClientException.field_j = false;
          } else {
            SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            if (!ClientException.field_j &&
              PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
              LoginPayload.field_c) {
              SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
              TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
              PackedColorSupport.field_a = 0;
            }
            KillerBallSkin.field_m = param1;
            if (ClientException.field_j &&
              SocialListEntry.field_Vb == PackedColorSupport.field_a) {
              PackedColorSupport.field_a = 0;
              ClientException.field_j = false;
              return;
            }
            return;
          }
          SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
          if (!ClientException.field_j &&
            PackedColorSupport.field_a < LongAndTextLoginPayload.field_l &&
            LoginPayload.field_c) {
            SceneNodeEntry.field_p = DebouncedValidationProvider.field_f;
            TimeTrialSelectScreen.field_H = ReflectionReplySupport.field_i;
            PackedColorSupport.field_a = 0;
            KillerBallSkin.field_m = param1;
            if (ClientException.field_j &&
              SocialListEntry.field_Vb == PackedColorSupport.field_a) {
              PackedColorSupport.field_a = 0;
              ClientException.field_j = false;
            }
            return;
          }
        }
        KillerBallSkin.field_m = param1;
        if (!ClientException.field_j) {
          return;
        }
        if (SocialListEntry.field_Vb != PackedColorSupport.field_a) {
          return;
        }
        PackedColorSupport.field_a = 0;
        ClientException.field_j = false;
        return;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 8) {
          return;
        }
        playerNs = null;
        messageLobby = null;
    }

    PauseMenuScreen(Sprite param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
          this.field_n = false;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void handleMenuAction(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.itemIds[param2];
        if (var4 == 54) {
          if (this.selection.isPressActivated((byte) 54)) {
            KillerBallSkin.playMusicTrack(param0 ^ -16726, true, true, BrowserCookieWriter.field_b[0].field_b);
          }
        } else {
          if (var4 == 55) {
            if (this.selection.isPressActivated((byte) 115)) {
              KillerBallSkin.playMusicTrack(256, true, true, BrowserCookieWriter.field_b[1].field_b);
            }
          } else {
            if (56 == var4) {
              if (this.selection.isPressActivated((byte) 54)) {
                KillerBallSkin.playMusicTrack(param0 ^ -16726, true, true, BrowserCookieWriter.field_b[2].field_b);
              }
            } else {
              if (var4 == 57) {
                if (this.selection.isPressActivated((byte) 56)) {
                  KillerBallSkin.playMusicTrack(param0 ^ -16726, true, true, BrowserCookieWriter.field_b[3].field_b);
                }
              } else {
                if (58 == var4) {
                  if (this.selection.isPressActivated((byte) 62)) {
                    KillerBallSkin.playMusicTrack(param0 + 16726, true, true, BrowserCookieWriter.field_b[4].field_b);
                  }
                } else {
                  if (59 != var4) {
                    if (var4 != 60) {
                      super.handleMenuAction(-16470, param1, param2);
                    } else {
                      if (this.selection.isPressActivated((byte) 125)) {
                        KillerBallSkin.playMusicTrack(256, true, true, MenuScreenBase.field_d);
                      }
                    }
                  } else {
                    if (this.selection.isPressActivated((byte) 73)) {
                      KillerBallSkin.playMusicTrack(256, true, true, HalloweenBallSkin.field_m);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 == -16470) {
          return;
        }
        PauseMenuScreen.g(-10, -105);
    }

    static {
        messageLobby = "Message lobby";
        field_J = 0;
        playerNs = new String[]{"Player 1", "Player 2", "Player 3", "Player 4", "Player 5", "Player 6", "Player 7", "Player 8"};
    }
}
