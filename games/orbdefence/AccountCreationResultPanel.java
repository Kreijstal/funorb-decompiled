/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    private boolean field_lb;
    private boolean field_kb;
    private AccountRegistrationPanel field_jb;
    static int field_fb;
    static ResourceArchive field_hb;
    static String field_gb;
    static LoginPanel field_ib;

    final boolean advanceDialogAnimation(boolean param0) {
        AccountServiceResult var2 = null;
        AccountServiceResult var2Lifetime1;
        if (param0) {
          field_ib = (LoginPanel) null;
          if (!this.field_A) {
            return super.advanceDialogAnimation(false);
          }
          if (this.field_lb) {
            return super.advanceDialogAnimation(false);
          }
          var2 = l.pollAccountCreationResult((byte) -20);
          if (var2 != null) {
            this.showAccountCreationResult(false, (byte) 126, var2);
            return super.advanceDialogAnimation(false);
          }
          return super.advanceDialogAnimation(false);
        }
        if (!this.field_A) {
          return super.advanceDialogAnimation(false);
        }
        if (this.field_lb) {
          return super.advanceDialogAnimation(false);
        }
        var2Lifetime1 = l.pollAccountCreationResult((byte) -20);
        if (var2Lifetime1 != null) {
          this.showAccountCreationResult(false, (byte) 126, var2Lifetime1);
          return super.advanceDialogAnimation(false);
        }
        return super.advanceDialogAnimation(false);
    }

    public final void onWidgetActivated(byte param0, int param1, int param2, InteractiveWidget param3, int param4) {
        if (this.field_kb) {
          ArchiveRequest.a(-108, false, true);
          return;
        }
        try {
          int var6_int = -48 % ((-3 - param0) / 62);
          mh.b((byte) -57);
          this.closeDialog(4210752);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "ig.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void resetDeclaredStaticReferences(int param0) {
        field_ib = null;
        field_gb = null;
        field_hb = null;
        if (param0 != 11285) {
          AccountCreationResultPanel.resetDeclaredStaticReferences(29);
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          this.field_lb = true;
          if (param2.success) {
            var4 = RichTextLayout.field_m;
          } else {
            if (param2.suggestions != null) {
              var4 = j.field_c;
              if (null != this.field_jb) {
                this.field_jb.onNameSuggestionsRefreshRequested((byte) -8);
              }
            } else {
              var4 = param2.message;
              if (param2.statusCode == 248) {
                if (param0) {
                  var4 = tb.field_a;
                  this.field_kb = true;
                } else {
                  km.a(16711935);
                  var4 = tb.field_a;
                  this.field_kb = true;
                }
              }
            }
          }
          if (param1 < 115) {
            return;
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), qc.field_b, var4);
          if (param2.success) {
            if (param2.field_d) {
              this.replaceContent(false, new RegistrationAgreementPane(this));
              return;
            }
            var5.addListenerButton(ModalDialogHost.field_C, -34, (WidgetEventListener) (this));
          } else {
            if (this.field_kb) {
              var5.addListenerButton(ModalDialogHost.field_C, -34, (WidgetEventListener) (this));
            } else {
              if (param2.statusCode == 5) {
                var5.addActionButton(vc.field_n, 11, -15858);
                var5.addActionButton(ld.field_d, 17, -15858);
              } else {
                var5.addActionButton(vc.field_i, -1, -15858);
              }
            }
            if (3 != param2.statusCode) {
              if (6 == param2.statusCode) {
                var5.addActionButton(qf.field_k, 9, -15858);
              }
            } else {
              var5.addActionButton(vk.field_y, 7, -15858);
            }
          }
          this.replaceContent(false, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("ig.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, qc.field_b, bh.field_f, false, false);
        try {
          this.field_jb = param1;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void showAccountCreationConnectionFailure(byte param0) {
        int var2 = -19 % ((-21 - param0) / 42);
        this.showAccountCreationResult(true, (byte) 122, oe.createAccountErrorResult(248, tb.field_a, -3));
    }

    static {
        field_gb = "NORMO";
        field_fb = 0;
    }
}
