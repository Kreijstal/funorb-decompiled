/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationRequestDialog extends AccountRequestDialog implements ButtonListener {
    private boolean field_yb;
    private boolean field_xb;
    static int[] field_zb;
    private AccountRegistrationPanel field_Ab;
    static int field_Cb;
    static int field_Bb;

    final static void showDisplayNameForm(byte param0) {
        if (null != MainMenuScreen.field_r) {
          MainMenuScreen.field_r.close(-108);
        }
        ChatMessage.field_c = new DisplayNameForm();
        ph.field_l.transitionToContent(ChatMessage.field_c, -125);
        if (param0 == -51) {
          return;
        }
        field_zb = (int[]) null;
    }

    RegistrationRequestDialog(ModalStack param0, AccountRegistrationPanel param1) {
        super(param0, FireworkBurst.field_d, hm.field_e, false, false);
        try {
          this.field_Ab = param1;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isLogoAnimationFinished(int param0) {
        if (param0 == 22452) {
          return GameModeCard.field_f > 250 ? true : false;
        }
        RegistrationRequestDialog.releaseStatics(-8);
        return GameModeCard.field_f > 250 ? true : false;
    }

    final boolean tickLayerAndCheckHidden(boolean param0) {
        id var2 = null;
        id var2Lifetime1;
        if (param0) {
          this.completeWithoutServer((byte) -120);
          if (!this.field_N) {
            return super.tickLayerAndCheckHidden(false);
          }
          if (this.field_xb) {
            return super.tickLayerAndCheckHidden(false);
          }
          var2 = CachedArchiveProvider.takeRegistrationResult((byte) 52);
          if (var2 != null) {
            this.handleRegistrationResult(var2, -127, false);
            return super.tickLayerAndCheckHidden(false);
          }
          return super.tickLayerAndCheckHidden(false);
        }
        if (!this.field_N) {
          return super.tickLayerAndCheckHidden(false);
        }
        if (this.field_xb) {
          return super.tickLayerAndCheckHidden(false);
        }
        var2Lifetime1 = CachedArchiveProvider.takeRegistrationResult((byte) 52);
        if (var2Lifetime1 != null) {
          this.handleRegistrationResult(var2Lifetime1, -127, false);
          return super.tickLayerAndCheckHidden(false);
        }
        return super.tickLayerAndCheckHidden(false);
    }

    public static void releaseStatics(int param0) {
        field_zb = null;
        if (param0 > -19) {
          field_zb = (int[]) null;
        }
    }

    private final void handleRegistrationResult(id param0, int param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        AccountMessagePanel var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_xb = true;
          if (param1 >= -121) {
            this.field_yb = true;
          }
          if (!param0.field_g) {
            if (null == param0.field_f) {
              var4 = param0.field_c;
              if (param0.field_a == 248) {
                if (!param2) {
                  fq.markTuhstatbutCookie((byte) -73);
                }
                this.field_yb = true;
                var4 = AudioService.field_b;
              }
            } else {
              var4 = ek.field_e;
              if (this.field_Ab != null) {
                this.field_Ab.onMoreSuggestionsRequested((byte) 103);
              }
            }
          } else {
            var4 = ValidatedTextWidget.field_jb;
          }
          var5 = new AccountMessagePanel((AccountRequestDialog) (this), FireworkBurst.field_d, var4);
          if (!param0.field_g) {
            if (!this.field_yb) {
              if (param0.field_a != 5) {
                var5.addActionButton(-1, -1, bo.field_f);
              } else {
                var5.addActionButton(11, -1, BackgroundScene.field_c);
                var5.addActionButton(17, -1, FullscreenFocusCanvas.field_e);
              }
            } else {
              var5.appendButton(1707, (UiListener) (this), MusicCrossfadeStream.field_J);
            }
            if (3 != param0.field_a) {
              if (param0.field_a == 6) {
                var5.addActionButton(9, -1, TextTableInitializer.field_d);
              }
            } else {
              var5.addActionButton(7, -1, gd.field_d);
            }
          } else {
            if (param0.field_e) {
              this.transitionToContent(new AccountTermsPanel(this), -113);
              return;
            }
            var5.appendButton(1707, (UiListener) (this), MusicCrossfadeStream.field_J);
          }
          this.transitionToContent(var5, -115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("dm.OB(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void drawDimmedAccountLayers(boolean param0, boolean param1, int param2) {
        if (!param0) {
          SoftwareRasterizer.clear();
          if (param2 != 0) {
            RegistrationRequestDialog.drawDimmedAccountLayers(true, false, -123);
            Js5NetworkRequest.drawAccountLayers(param2 ^ 91, param0);
            return;
          }
          Js5NetworkRequest.drawAccountLayers(param2 ^ 91, param0);
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d, 0, 192);
        if (param2 != 0) {
          RegistrationRequestDialog.drawDimmedAccountLayers(true, false, -123);
          Js5NetworkRequest.drawAccountLayers(param2 ^ 91, param0);
          return;
        }
        Js5NetworkRequest.drawAccountLayers(param2 ^ 91, param0);
    }

    public final void onAction(TextButton param0, int param1, int param2, int param3, int param4) {
        if (this.field_yb) {
          QueuedInput.a(false, -17130, true);
          return;
        }
        th.loginWithRegisteredAccount(param2 ^ 8180);
        if (param2 != 11) {
          return;
        }
        try {
          this.close(-119);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "dm.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void completeWithoutServer(byte param0) {
        if (param0 <= -96) {
          this.handleRegistrationResult(pa.createRequestResult(248, AudioService.field_b, (byte) -121), -127, true);
          return;
        }
        RegistrationRequestDialog.drawDimmedAccountLayers(true, false, -97);
        this.handleRegistrationResult(pa.createRequestResult(248, AudioService.field_b, (byte) -121), -127, true);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_zb = new int[256];
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_zb[var1] = var0;
        }
        field_Cb = 300;
    }
}
