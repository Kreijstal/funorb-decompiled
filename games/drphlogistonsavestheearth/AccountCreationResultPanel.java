/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    static ResourceArchive field_Jb;
    static String field_Fb;
    static String field_Db;
    static java.awt.Frame field_Gb;
    private boolean field_Hb;
    static he[] field_Cb;
    private AccountRegistrationPanel field_Ib;
    private boolean field_Eb;

    public static void releaseDeclaredStaticReferences(int param0) {
        field_Gb = null;
        field_Fb = null;
        field_Cb = null;
        field_Db = null;
        if (param0 != 9791) {
          return;
        }
        field_Jb = null;
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, wi.field_e, mk.field_d, false, false);
        try {
          this.field_Ib = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] copyBytes(byte param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 111) {
            var4 = (byte[]) null;
            AccountCreationResultPanel.copyBytes((byte) 94, (byte[]) null);
          }
          var2_int = param1.length;
          var3 = new byte[var2_int];
          ArrayBlockSupport.copyByteRange(param1, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void showAccountCreationConnectionFailure(int param0) {
        this.showAccountCreationResult((byte) -92, kj.createAccountErrorResult(param0, 4, MusicPatch.field_i), true);
    }

    private final void showAccountCreationResult(byte param0, AccountServiceResult param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          this.field_Eb = true;
          if (param1.success) {
            var4 = SecondaryNodeDequeIterator.field_c;
          } else {
            if (null == param1.suggestions) {
              var4 = param1.message;
              if (248 == param1.statusCode) {
                if (param2) {
                  this.field_Hb = true;
                  var4 = MusicPatch.field_i;
                } else {
                  bg.a(false);
                  this.field_Hb = true;
                  var4 = MusicPatch.field_i;
                }
              }
            } else {
              var4 = FullscreenFocusCanvas.field_g;
              if (this.field_Ib != null) {
                this.field_Ib.onNameSuggestionsRefreshRequested((byte) -82);
              }
            }
          }
          if (param0 != -92) {
            this.advanceDialogAnimation(33);
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), wi.field_e, var4);
          if (!param1.success) {
            if (this.field_Hb) {
              var5.addListenerButton(cd.field_a, false, (WidgetEventListener) (this));
            } else {
              if (5 == param1.statusCode) {
                var5.addActionButton(false, ContentTransitionDialog.field_fb, 11);
                var5.addActionButton(false, ProxyAuthenticationRequiredException.field_d, 17);
              } else {
                var5.addActionButton(false, f.field_m, -1);
              }
            }
            if (param1.statusCode == 3) {
              var5.addActionButton(false, nl.field_o, 7);
            } else {
              if (param1.statusCode != 6) {
                this.replaceContent(33, var5);
                return;
              }
              var5.addActionButton(false, bb.field_d, 9);
            }
          } else {
            if (param1.field_d) {
              this.replaceContent(33, new RegistrationAgreementPane(this));
              return;
            }
            var5.addListenerButton(cd.field_a, false, (WidgetEventListener) (this));
          }
          this.replaceContent(33, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("qd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, int param1, boolean param2, InteractiveWidget param3, int param4) {
        if (this.field_Hb) {
          FullscreenFocusCanvas.a((byte) -115, false, true);
          return;
        }
        try {
          lk.b(1);
          this.closeDialog(param2);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "qd.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        if (!this.field_Q) {
          if (param0 == 2968) {
            return super.advanceDialogAnimation(param0 + 0);
          }
          this.field_Ib = (AccountRegistrationPanel) null;
          return super.advanceDialogAnimation(param0 + 0);
        }
        if (this.field_Eb) {
          if (param0 == 2968) {
            return super.advanceDialogAnimation(param0 + 0);
          }
          this.field_Ib = (AccountRegistrationPanel) null;
          return super.advanceDialogAnimation(param0 + 0);
        }
        AccountServiceResult var2 = ValidatedTextField.pollAccountCreationResult(19860);
        if (var2 == null) {
          if (param0 == 2968) {
            return super.advanceDialogAnimation(param0 + 0);
          }
          this.field_Ib = (AccountRegistrationPanel) null;
          return super.advanceDialogAnimation(param0 + 0);
        }
        this.showAccountCreationResult((byte) -92, var2, false);
        if (param0 == 2968) {
          return super.advanceDialogAnimation(param0 + 0);
        }
        this.field_Ib = (AccountRegistrationPanel) null;
        return super.advanceDialogAnimation(param0 + 0);
    }

    static {
        field_Fb = "Waiting for music";
        field_Db = "Log in / Create account";
    }
}
