/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    private AccountRegistrationPanel field_mb;
    private boolean field_nb;
    private boolean field_lb;
    static byte[] field_kb;

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        if (this.field_nb) {
          AccountRegistrationPanel.a(true, false, 170);
          return;
        }
        try {
          wj.b(480);
          this.closeDialog(77);
          if (param1 != 17) {
            this.field_lb = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "sf.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void showAccountCreationResult(int param0, boolean param1, AccountServiceResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          this.field_lb = true;
          if (param0 != 0) {
            this.field_lb = false;
          }
          if (param2.success) {
            var4 = PacketBuffer.field_i;
          } else {
            if (param2.suggestions == null) {
              var4 = param2.message;
              if (param2.statusCode == 248) {
                if (!param1) {
                  InteractiveWidget.d((byte) 117);
                }
                this.field_nb = true;
                var4 = wd.field_l;
              }
            } else {
              var4 = gb.field_e;
              if (this.field_mb != null) {
                this.field_mb.onNameSuggestionsRefreshRequested((byte) -69);
              }
            }
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), ArchiveRequest.field_q, var4);
          if (param2.success) {
            if (param2.field_a) {
              this.replaceContent(param0 + 109, new RegistrationAgreementPane(this));
              return;
            }
            var5.addListenerButton((WidgetEventListener) (this), 8283, StripedProgressWidget.field_I);
          } else {
            if (!this.field_nb) {
              if (param2.statusCode != 5) {
                var5.addActionButton(te.field_f, -1, param0 + 1);
              } else {
                var5.addActionButton(qb.field_a, 11, 1);
                var5.addActionButton(ta.field_b, 17, 1);
              }
            } else {
              var5.addListenerButton((WidgetEventListener) (this), 8283, StripedProgressWidget.field_I);
            }
            if (3 != param2.statusCode) {
              if (6 == param2.statusCode) {
                var5.addActionButton(DialogMessagePane.field_C, 9, 1);
              }
            } else {
              var5.addActionButton(WordDictionary.field_f, 7, 1);
            }
          }
          this.replaceContent(-128, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("sf.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void v(int param0) {
        od var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        od var1Lifetime1;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          Bzip2State.field_h.serviceOutput();
          u.field_a.serviceOutput();
          bd.field_q = bd.field_q - 1;
          if (param0 < 106) {
            field_kb = (byte[]) null;
          }
          if (0 == bd.field_q) {
            bd.field_q = 200;
            var1 = (od) (lb.field_f.beginForward((byte) -95));
            while (var1 != null) {
              if (!var1.field_i.isLinked(8)) {
                var1.unlink(5);
              }
              var1 = (od) (lb.field_f.nextForward(true));
            }
            if (nc.field_q != null) {
              var1Lifetime1 = (od) (nc.field_q.beginForward((byte) -95));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_i.isLinked(8)) {
                  var1Lifetime1.unlink(5);
                }
                var1Lifetime1 = (od) (nc.field_q.nextForward(true));
              }
            }
          }
          if (null != GuestPlayConfirmationForm.field_D) {
            stackIn_20_0 = GuestPlayConfirmationForm.field_D.isMidiReady((byte) -54);
            if (stackIn_20_0) {
              return;
            }
            d.field_e = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.wrapClientException((Throwable) ((Object) var1_ref), "sf.IA(" + param0 + ')');
        }
    }

    final void showAccountCreationConnectionFailure(int param0) {
        this.showAccountCreationResult(0, true, ModalDialog.createAccountErrorResult(242763393, wd.field_l, 248));
        int var2 = -109 % ((param0 - 32) / 36);
    }

    final boolean advanceDialogAnimation(int param0) {
        InteractiveWidget var3 = null;
        InteractiveWidget var3Lifetime1;
        InteractiveWidget var3Lifetime2;
        InteractiveWidget var3Lifetime3;
        if (!this.field_A) {
          if (param0 == 0) {
            return super.advanceDialogAnimation(0);
          }
          var3 = (InteractiveWidget) null;
          this.onWidgetActivated((InteractiveWidget) null, -59, -50, 24, 58);
          return super.advanceDialogAnimation(0);
        }
        if (this.field_lb) {
          if (param0 == 0) {
            return super.advanceDialogAnimation(0);
          }
          var3Lifetime1 = (InteractiveWidget) null;
          this.onWidgetActivated((InteractiveWidget) null, -59, -50, 24, 58);
          return super.advanceDialogAnimation(0);
        }
        AccountServiceResult var2 = CrossfadingMidiPcmStream.pollAccountCreationResult((byte) 32);
        if (var2 != null) {
          this.showAccountCreationResult(param0 + 0, false, var2);
          if (param0 == 0) {
            return super.advanceDialogAnimation(0);
          }
          var3Lifetime2 = (InteractiveWidget) null;
          this.onWidgetActivated((InteractiveWidget) null, -59, -50, 24, 58);
          return super.advanceDialogAnimation(0);
        }
        if (param0 == 0) {
          return super.advanceDialogAnimation(0);
        }
        var3Lifetime3 = (InteractiveWidget) null;
        this.onWidgetActivated((InteractiveWidget) null, -59, -50, 24, 58);
        return super.advanceDialogAnimation(0);
    }

    public static void clearStaticReferences(boolean param0) {
        if (!param0) {
          field_kb = (byte[]) null;
          field_kb = null;
          return;
        }
        field_kb = null;
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, ArchiveRequest.field_q, IterableNodeHashTable.field_i, false, false);
        try {
          this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_kb = new byte[520];
    }
}
