/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    private boolean field_tb;
    private AccountRegistrationPanel field_vb;
    private boolean field_wb;
    static Archive field_ub;

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, uc.field_g, UiWidget.field_p, false, false);
        try {
          this.field_vb = param1;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void discardDeclaredStaticReferences(int param0) {
        field_ub = null;
        if (param0 != 6) {
          field_ub = (Archive) null;
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, boolean param4) {
        if (this.field_wb) {
          hl.a(true, 24574, false);
          return;
        }
        try {
          NameSuggestionsPanel.a((byte) -110);
          this.closeDialog(param4);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "jk.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final void showAccountCreationResult(boolean param0, byte param1, AccountServiceResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          this.field_tb = true;
          if (param2.success) {
            var4 = lk.field_d;
          } else {
            if (null == param2.suggestions) {
              var4 = param2.message;
              if (param2.statusCode == 248) {
                if (!param0) {
                  ValidationStatusWidget.i(918092705);
                }
                this.field_wb = true;
                var4 = ce.field_a;
              }
            } else {
              var4 = pc.field_d;
              if (null != this.field_vb) {
                this.field_vb.onNameSuggestionsRefreshRequested((byte) 22);
              }
            }
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), uc.field_g, var4);
          if (!param2.success) {
            if (this.field_wb) {
              var5.addListenerButton(0, dd.field_a, (WidgetEventListener) (this));
            } else {
              if (param2.statusCode == 5) {
                var5.addActionButton(11, AgeValidator.field_k, 1);
                var5.addActionButton(17, ph.field_e, 1);
              } else {
                var5.addActionButton(-1, u.field_e, 1);
              }
            }
            if (3 != param2.statusCode) {
              if (6 == param2.statusCode) {
                var5.addActionButton(9, SecondaryNodeDeque.field_d, 1);
              }
            } else {
              var5.addActionButton(7, qd.field_a, 1);
            }
          } else {
            if (param2.field_f) {
              this.replaceContent(-3399, new RegistrationAgreementPane(this));
              return;
            }
            var5.addListenerButton(0, dd.field_a, (WidgetEventListener) (this));
          }
          this.replaceContent(-3399, var5);
          if (param1 > 19) {
            return;
          }
          this.field_tb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("jk.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void showAccountCreationConnectionFailure(byte param0) {
        this.showAccountCreationResult(true, (byte) 58, mh.createAccountErrorResult(248, true, ce.field_a));
        if (param0 != -63) {
          this.field_wb = false;
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        AccountServiceResult var2 = null;
        AccountServiceResult var2Lifetime1;
        if (param0 != 1784) {
          this.field_vb = (AccountRegistrationPanel) null;
          if (!this.field_J) {
            return super.advanceDialogAnimation(1784);
          }
          if (this.field_tb) {
            return super.advanceDialogAnimation(1784);
          }
          var2 = IsaacRandom.pollAccountCreationResult(83);
          if (var2 != null) {
            this.showAccountCreationResult(false, (byte) 97, var2);
            return super.advanceDialogAnimation(1784);
          }
          return super.advanceDialogAnimation(1784);
        }
        if (!this.field_J) {
          return super.advanceDialogAnimation(1784);
        }
        if (this.field_tb) {
          return super.advanceDialogAnimation(1784);
        }
        var2Lifetime1 = IsaacRandom.pollAccountCreationResult(83);
        if (var2Lifetime1 != null) {
          this.showAccountCreationResult(false, (byte) 97, var2Lifetime1);
          return super.advanceDialogAnimation(1784);
        }
        return super.advanceDialogAnimation(1784);
    }

    final static int i(byte param0) {
        if (param0 < 112) {
          field_ub = (Archive) null;
          return ak.field_a;
        }
        return ak.field_a;
    }

    static {
    }
}
