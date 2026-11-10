/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationDialog extends MessageDialog implements ButtonActivationListener {
    static Sprite[] field_Hb;
    private boolean field_Ib;
    static int field_Eb;
    static int field_Db;
    static String field_Cb;
    private AccountCreationForm field_Gb;
    private boolean field_Fb;

    public final void onButtonActivated(int param0, int param1, ButtonWidget param2, int param3, int param4) {
        if (param3 >= -83) {
          return;
        }
        if (this.field_Ib) {
          WeightedLruCache.openLoginDialog(-21113, true, false);
          return;
        }
        try {
          UrlLaunchHelpers.beginStoredLogin((byte) 62);
          this.dismissDialog(-7435);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tf.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        AccountServerResult var2 = null;
        AccountServerResult var2Lifetime1;
        if (param0 != -27388) {
          PcmSampleStream var3 = (PcmSampleStream) null;
          AccountCreationDialog.playStream((PcmSampleStream) null, (byte) -100);
          if (!this.field_R) {
            return super.advanceDialogAnimation(-27388);
          }
          if (this.field_Fb) {
            return super.advanceDialogAnimation(-27388);
          }
          var2 = BufferedFile.takeRegistrationResponse(param0 ^ -27388);
          if (var2 != null) {
            this.handleRegistrationResult(-6, false, var2);
            return super.advanceDialogAnimation(-27388);
          }
          return super.advanceDialogAnimation(-27388);
        }
        if (!this.field_R) {
          return super.advanceDialogAnimation(-27388);
        }
        if (this.field_Fb) {
          return super.advanceDialogAnimation(-27388);
        }
        var2Lifetime1 = BufferedFile.takeRegistrationResponse(param0 ^ -27388);
        if (var2Lifetime1 != null) {
          this.handleRegistrationResult(-6, false, var2Lifetime1);
          return super.advanceDialogAnimation(-27388);
        }
        return super.advanceDialogAnimation(-27388);
    }

    private final void handleRegistrationResult(int param0, boolean param1, AccountServerResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        MessageDialogContent var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_Fb = true;
          if (param0 != -6) {
            field_Eb = 69;
          }
          if (!param2.field_d) {
            if (param2.field_b != null) {
              var4 = SettingsCookieHelpers.field_d;
              if (this.field_Gb != null) {
                this.field_Gb.onMoreSuggestionsRequested(496);
              }
            } else {
              var4 = param2.field_h;
              if (param2.field_c == 248) {
                if (!param1) {
                  SpriteState.clearAppletStatusCookie(-42);
                }
                var4 = MusicPatchPcmStream.field_p;
                this.field_Ib = true;
              }
            }
          } else {
            var4 = DualLinkNode.field_g;
          }
          var5 = new MessageDialogContent((MessageDialog) (this), LevelFileList.field_d, var4);
          if (!param2.field_d) {
            if (!this.field_Ib) {
              if (param2.field_c != 5) {
                var5.addActionButton(ContextMenu.field_Zb, -1, true);
              } else {
                var5.addActionButton(PulseEffect.field_g, 11, true);
                var5.addActionButton(TextDecodeHelpers.field_b, 17, true);
              }
            } else {
              var5.addButton(LoginDialog.field_xb, param0 ^ 58, (WidgetListener) (this));
            }
            if (param2.field_c == 3) {
              var5.addActionButton(SimArmedHuman.field_zb, 7, true);
            } else {
              if (param2.field_c == 6) {
                var5.addActionButton(MarkerSliderWidget.field_S, 9, true);
              }
            }
          } else {
            if (param2.field_e) {
              this.transitionToContent((UiWidget) (new Under13NoticePanel(this)), (byte) 122);
              return;
            }
            var5.addButton(LoginDialog.field_xb, -112, (WidgetListener) (this));
          }
          this.transitionToContent((UiWidget) (var5), (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("tf.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static PlayingSound playStream(PcmSampleStream param0, byte param1) {
        PlayingSound var2 = null;
        RuntimeException var2_ref = null;
        PcmSampleStream var3 = null;
        PlayingSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -62) {
            var3 = (PcmSampleStream) null;
            AccountCreationDialog.playStream((PcmSampleStream) null, (byte) 86);
          }
          var2 = new PlayingSound(param0, param0);
          GameKeyHandler.field_e.addFirst(var2, false);
          ChatAndOptionHelpers.field_a.addSubStream(param0);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("tf.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    AccountCreationDialog(DialogLayer param0, AccountCreationForm param1) {
        super(param0, LevelFileList.field_d, ZombieDrop.field_M, false, false);
        try {
          this.field_Gb = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void showIneligibleResult(int param0) {
        this.handleRegistrationResult(-6, true, ObjectFactoryHelpers.createRequestResult(-97, MusicPatchPcmStream.field_p, param0));
    }

    public static void releaseStatics(int param0) {
        field_Cb = null;
        field_Hb = null;
        int var1 = -24 / ((10 - param0) / 37);
    }

    static {
        field_Db = -1;
        field_Eb = 0;
        field_Cb = "Members' Benefits";
    }
}
