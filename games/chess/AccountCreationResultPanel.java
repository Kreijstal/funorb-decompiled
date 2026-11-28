/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    private boolean field_Hb;
    private AccountRegistrationPanel field_Ib;
    private boolean field_Jb;
    static String field_Gb;

    final static boolean p(int param0) {
        if (param0 > -36) {
          return true;
        }
        if (10 > StripedProgressWidget.field_Q) {
          return false;
        }
        if (il.field_a >= 13) {
          return true;
        }
        return false;
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        if (param4 != -24221) {
          this.field_Ib = (AccountRegistrationPanel) null;
        }
        if (this.field_Jb) {
          in.a((byte) 95, false, true);
          return;
        }
        try {
          FullscreenNoticeType.a(-128);
          this.closeDialog((byte) -114);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "vd.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void showAccountCreationResult(boolean param0, AccountServiceResult param1, int param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          if (param2 != -1) {
            return;
          }
          this.field_Hb = true;
          if (!param1.success) {
            if (param1.suggestions != null) {
              var4 = BoundedRandomAccessFile.field_g;
              if (null != this.field_Ib) {
                this.field_Ib.onNameSuggestionsRefreshRequested(120);
              }
            } else {
              var4 = param1.message;
              if (param1.statusCode == 248) {
                if (!param0) {
                  ln.f((byte) -74);
                }
                var4 = nj.field_z;
                this.field_Jb = true;
              }
            }
          } else {
            var4 = FullscreenStatusDialog.field_db;
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), tk.field_a, var4);
          if (!param1.success) {
            if (!this.field_Jb) {
              if (5 != param1.statusCode) {
                var5.addActionButton(-1, 114, GameAppletShell.field_k);
              } else {
                var5.addActionButton(11, 67, PcmOutputWorker.field_a);
                var5.addActionButton(17, 39, HuffmanCodec.field_b);
              }
            } else {
              var5.addListenerButton((byte) -114, (WidgetEventListener) (this), sg.field_e);
            }
            if (param1.statusCode != 3) {
              if (param1.statusCode == 6) {
                var5.addActionButton(9, 124, gg.field_e);
              }
            } else {
              var5.addActionButton(7, 30, ki.field_Q);
            }
          } else {
            if (param1.field_f) {
              this.replaceContent(new RegistrationAgreementPane(this), param2 ^ -101);
              return;
            }
            var5.addListenerButton((byte) -114, (WidgetEventListener) (this), sg.field_e);
          }
          this.replaceContent(var5, 108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_34_0 = var4_ref;
          stackIn_34_1 = new StringBuilder().append("vd.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, tk.field_a, ka.field_e, false, false);
        try {
          this.field_Ib = param1;
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean advanceDialogAnimation(byte param0) {
        AccountServiceResult var2 = null;
        AccountServiceResult var2Lifetime1;
        if (param0 > -4) {
          AccountCreationResultPanel.discardDeclaredStaticReferences((byte) -32);
          if (!this.field_P) {
            return super.advanceDialogAnimation((byte) -90);
          }
          if (this.field_Hb) {
            return super.advanceDialogAnimation((byte) -90);
          }
          var2 = NodeHashTableIterator.pollAccountCreationResult(6792);
          if (var2 != null) {
            this.showAccountCreationResult(false, var2, -1);
            return super.advanceDialogAnimation((byte) -90);
          }
          return super.advanceDialogAnimation((byte) -90);
        }
        if (!this.field_P) {
          return super.advanceDialogAnimation((byte) -90);
        }
        if (this.field_Hb) {
          return super.advanceDialogAnimation((byte) -90);
        }
        var2Lifetime1 = NodeHashTableIterator.pollAccountCreationResult(6792);
        if (var2Lifetime1 != null) {
          this.showAccountCreationResult(false, var2Lifetime1, -1);
          return super.advanceDialogAnimation((byte) -90);
        }
        return super.advanceDialogAnimation((byte) -90);
    }

    public static void discardDeclaredStaticReferences(byte param0) {
        int var1 = 57 % ((-49 - param0) / 44);
        field_Gb = null;
    }

    final void showAccountCreationConnectionFailure(int param0) {
        this.showAccountCreationResult(true, sc.createAccountErrorResult(nj.field_z, 248, (byte) -92), -1);
        if (param0 != -10896) {
          this.field_Jb = false;
        }
    }

    static {
        field_Gb = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
