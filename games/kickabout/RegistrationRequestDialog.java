/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationRequestDialog extends AccountRequestDialog implements ButtonListener {
    static UiLayoutNode field_lb;
    static Sprite field_qb;
    private boolean field_nb;
    private boolean field_pb;
    static int field_ob;
    static ClientProtocolStage field_rb;
    static int field_kb;
    private AccountRegistrationPanel field_mb;

    public static void releaseStatics(int param0) {
        field_lb = null;
        field_rb = null;
        if (param0 != 248) {
          RegistrationRequestDialog.releaseStatics(-37);
          field_qb = null;
          return;
        }
        field_qb = null;
    }

    final static boolean hasTuhstatbutSetting(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.applet.Applet var8 = null;
          boolean stackIn_20_0 = false;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          var7 = Kickabout.field_G;
          try {
            if (TextHotspotWidget.field_F) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (AppletJavaScriptBridge.callJavaScript(30858, "getcookies", param1));
              var4 = FormationAgent.a(var3, 2, ';');
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
              if (param0 != 17) {
                var8 = (java.applet.Applet) null;
                RegistrationRequestDialog.hasTuhstatbutSetting(100, (java.applet.Applet) null);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
            }
            stackIn_20_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_20_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var2_ref;
            stackIn_23_1 = new StringBuilder().append("jn.BB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    RegistrationRequestDialog(ModalStack param0, AccountRegistrationPanel param1) {
        super(param0, ConsoleLexer.field_b, TriangleMesh.field_L, false, false);
        try {
          this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void showRegistrationFailure(int param0) {
        this.a(true, TeamSelectionView.createRegistrationFailure(param0 ^ -105, GameSoundEffect.field_g, 248), (byte) -71);
        if (param0 != 17) {
          field_qb = (Sprite) null;
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        AccountRegistrationResponse var2 = null;
        AccountRegistrationResponse var2Lifetime1;
        if (param0 != -1) {
          RegistrationRequestDialog.releaseStatics(-114);
          if (!this.field_C) {
            return super.advanceDialogAnimation(-1);
          }
          if (this.field_pb) {
            return super.advanceDialogAnimation(-1);
          }
          var2 = RegistrationUiSupport.pollRegistrationResponse(param0 - 1459);
          if (var2 == null) {
            return super.advanceDialogAnimation(-1);
          }
          this.a(false, var2, (byte) -71);
          return super.advanceDialogAnimation(-1);
        }
        if (!this.field_C) {
          return super.advanceDialogAnimation(-1);
        }
        if (this.field_pb) {
          return super.advanceDialogAnimation(-1);
        }
        var2Lifetime1 = RegistrationUiSupport.pollRegistrationResponse(param0 - 1459);
        if (var2Lifetime1 == null) {
          return super.advanceDialogAnimation(-1);
        }
        this.a(false, var2Lifetime1, (byte) -71);
        return super.advanceDialogAnimation(-1);
    }

    public final void onAction(int param0, TextButton param1, int param2, byte param3, int param4) {
        if (this.field_nb) {
          LobbyMatchPreview.showLoginDialog(false, true, (byte) -121);
          return;
        }
        try {
          WorldSpriteDecoration.a(-87);
          this.closeDialog(-96);
          if (param3 <= 64) {
            field_rb = (ClientProtocolStage) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, AccountRegistrationResponse param1, byte param2) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        AccountMessagePanel var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          this.field_pb = true;
          if (!param1.success) {
            if (param1.nameSuggestions != null) {
              var4 = ModalStack.field_B;
              if (null != this.field_mb) {
                this.field_mb.onRefreshSuggestions(-1);
              }
            } else {
              var4 = param1.message;
              if (param1.responseCode == 248) {
                if (param0) {
                  var4 = GameSoundEffect.field_g;
                  this.field_nb = true;
                } else {
                  DisplayNameUiSupport.a(536870912);
                  var4 = GameSoundEffect.field_g;
                  this.field_nb = true;
                }
              }
            }
          } else {
            var4 = PitchPurchaseSupport.field_e;
          }
          if (param2 != -71) {
            return;
          }
          var5 = new AccountMessagePanel((AccountRequestDialog) (this), ConsoleLexer.field_b, var4);
          if (param1.success) {
            if (param1.needsTerms) {
              this.transitionToContent((byte) -126, (UiWidget) (new AccountTermsPanel(this)));
              return;
            }
            var5.appendButton(RowRangeRequest.field_g, (UiListener) (this), (byte) 79);
          } else {
            if (!this.field_nb) {
              if (param1.responseCode != 5) {
                var5.addActionButton((byte) 55, -1, TextLineLayoutSupport.field_f);
              } else {
                var5.addActionButton((byte) 75, 11, MatchHudRoutingSupport.field_d);
                var5.addActionButton((byte) 66, 17, AccountNameAvailabilityValidator.field_o);
              }
            } else {
              var5.appendButton(RowRangeRequest.field_g, (UiListener) (this), (byte) 79);
            }
            if (param1.responseCode != 3) {
              if (param1.responseCode != 6) {
                this.transitionToContent((byte) -122, (UiWidget) (var5));
                return;
              }
              var5.addActionButton((byte) 114, 9, AccountNameAvailabilityValidator.field_p);
            } else {
              var5.addActionButton((byte) 94, 7, WelcomeDialog.field_J);
            }
          }
          this.transitionToContent((byte) -122, (UiWidget) (var5));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_35_0 = var4_ref;
          stackIn_35_1 = new StringBuilder().append("jn.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_rb = new ClientProtocolStage();
    }
}
