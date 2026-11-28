/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    static int field_wb;
    private boolean field_xb;
    static String field_ub;
    private boolean field_vb;
    static int field_sb;
    private AccountRegistrationPanel field_tb;

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 9) {
            var3 = (CharSequence) null;
            AccountCreationResultPanel.a((CharSequence) null, 66);
          }
          var2 = FullscreenStatusDialog.a(MusicPatch.a(-113, param0), -12382);
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("tj.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, be.field_x, mm.field_d, false, false);
        try {
          this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void p(int param0) {
        field_ub = null;
        if (param0 <= 29) {
          CharSequence var2 = (CharSequence) null;
          AccountCreationResultPanel.a((CharSequence) null, 112);
        }
    }

    final void showAccountCreationConnectionFailure(int param0) {
        if (param0 >= 66) {
          this.showAccountCreationResult(aj.createAccountErrorResult(248, (byte) -47, ValidatedTextField.field_ab), (byte) -110, true);
          return;
        }
        CharSequence var3 = (CharSequence) null;
        AccountCreationResultPanel.a((CharSequence) null, -117);
        this.showAccountCreationResult(aj.createAccountErrorResult(248, (byte) -47, ValidatedTextField.field_ab), (byte) -110, true);
    }

    private final void showAccountCreationResult(AccountServiceResult param0, byte param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          this.field_vb = true;
          if (param0.success) {
            var4 = MusicPatchNode.field_q;
          } else {
            if (null == param0.suggestions) {
              var4 = param0.message;
              if (248 == param0.statusCode) {
                if (param2) {
                  var4 = ValidatedTextField.field_ab;
                  this.field_xb = true;
                } else {
                  dm.a((byte) -119);
                  var4 = ValidatedTextField.field_ab;
                  this.field_xb = true;
                }
              }
            } else {
              var4 = MatchingFieldValidator.field_m;
              if (null != this.field_tb) {
                this.field_tb.onNameSuggestionsRefreshRequested(50);
              }
            }
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), be.field_x, var4);
          if (param1 != -110) {
            this.showAccountCreationConnectionFailure(102);
          }
          if (param0.success) {
            if (param0.field_a) {
              this.replaceContent(new RegistrationAgreementPane(this), -86);
              return;
            }
            var5.addListenerButton((byte) 23, (WidgetEventListener) (this), rj.field_e);
          } else {
            if (!this.field_xb) {
              if (param0.statusCode == 5) {
                var5.addActionButton(11, hf.field_u, (byte) -65);
                var5.addActionButton(17, ed.field_c, (byte) 54);
              } else {
                var5.addActionButton(-1, gd.field_b, (byte) -120);
              }
            } else {
              var5.addListenerButton((byte) 23, (WidgetEventListener) (this), rj.field_e);
            }
            if (3 == param0.statusCode) {
              var5.addActionButton(7, mi.field_i, (byte) 118);
            } else {
              if (param0.statusCode == 6) {
                var5.addActionButton(9, GrowableIntArray.field_b, (byte) -117);
              }
            }
          }
          this.replaceContent(var5, -31);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("tj.S(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        if (this.field_xb) {
          qc.a(false, true, 123);
          return;
        }
        try {
          jh.c((byte) 30);
          this.closeDialog((byte) -126);
          int var6_int = 75 / ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "tj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean advanceDialogAnimation(byte param0) {
        AccountServiceResult var2 = null;
        if (this.field_J) {
          if (this.field_vb) {
            if (param0 != -121) {
              field_sb = 5;
              return super.advanceDialogAnimation((byte) -121);
            }
            return super.advanceDialogAnimation((byte) -121);
          }
          var2 = AccountServiceResult.pollAccountCreationResult(-352);
          if (var2 == null) {
            if (param0 != -121) {
              field_sb = 5;
              return super.advanceDialogAnimation((byte) -121);
            }
            return super.advanceDialogAnimation((byte) -121);
          }
          this.showAccountCreationResult(var2, (byte) -110, false);
        }
        if (param0 == -121) {
          return super.advanceDialogAnimation((byte) -121);
        }
        field_sb = 5;
        return super.advanceDialogAnimation((byte) -121);
    }

    static {
        field_sb = 128;
        field_ub = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
