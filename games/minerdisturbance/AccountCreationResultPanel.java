/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends rg implements WidgetActivationListener {
    private boolean field_yb;
    private AccountRegistrationPanel field_Ab;
    static ResourceArchive field_xb;
    private boolean field_zb;

    final boolean advanceDialogAnimation(int param0) {
        if (param0 != -4) {
          return true;
        }
        if (!this.field_K) {
          return super.advanceDialogAnimation(-4);
        }
        if (this.field_yb) {
          return super.advanceDialogAnimation(-4);
        }
        AccountServiceResult var2 = pa.pollAccountCreationResult((byte) -107);
        if (var2 == null) {
          return super.advanceDialogAnimation(-4);
        }
        this.showAccountCreationResult(var2, 11, false);
        return super.advanceDialogAnimation(-4);
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, Bzip2State.field_g, vh.field_e, false, false);
        try {
          this.field_Ab = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onWidgetActivated(int param0, byte param1, InteractiveWidget param2, int param3, int param4) {
        if (param1 != 6) {
          field_xb = (ResourceArchive) null;
        }
        if (this.field_zb) {
          ie.a(false, true, -84);
          return;
        }
        try {
          pb.d(25);
          this.s(param1 ^ 2121798);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "uk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void discardDeclaredStaticReferences(byte param0) {
        field_xb = null;
        if (param0 != -42) {
          AccountCreationResultPanel.discardDeclaredStaticReferences((byte) -31);
        }
    }

    private final void showAccountCreationResult(AccountServiceResult param0, int param1, boolean param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        fm var5 = null;
        int var6 = 0;
        AccountServiceResult var7 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          this.field_yb = true;
          if (!param0.success) {
            if (param0.suggestions != null) {
              var4 = ModalDialogHost.field_L;
              if (this.field_Ab != null) {
                this.field_Ab.onNameSuggestionsRefreshRequested((byte) 47);
              }
            } else {
              var4 = param0.message;
              if (param0.statusCode == 248) {
                if (!param2) {
                  h.a(false);
                }
                var4 = gn.field_c;
                this.field_zb = true;
              }
            }
          } else {
            var4 = he.field_d;
          }
          var5 = new fm((rg) (this), Bzip2State.field_g, var4);
          if (param0.success) {
            if (param0.field_i) {
              this.a((byte) -53, (UiWidget) (new ba(this)));
              return;
            }
            var5.a(oh.field_A, 53, (WidgetEventListener) (this));
          } else {
            if (!this.field_zb) {
              if (5 == param0.statusCode) {
                var5.a(11, pc.field_i, -56);
                var5.a(17, o.field_b, -117);
              } else {
                var5.a(-1, hk.field_d, param1 ^ -107);
              }
            } else {
              var5.a(oh.field_A, 82, (WidgetEventListener) (this));
            }
            if (param0.statusCode != 3) {
              if (param0.statusCode == 6) {
                var5.a(9, gj.field_b, param1 ^ -115);
              }
            } else {
              var5.a(7, wb.field_q, -77);
            }
          }
          this.a((byte) -99, (UiWidget) (var5));
          if (param1 == 11) {
            return;
          }
          var7 = (AccountServiceResult) null;
          this.showAccountCreationResult((AccountServiceResult) null, -124, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("uk.G(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void t(int param0) {
        this.showAccountCreationResult(ij.createAccountErrorResult(248, gn.field_c, true), 11, true);
        if (param0 != 23101) {
          this.field_yb = true;
        }
    }

    static {
    }
}
