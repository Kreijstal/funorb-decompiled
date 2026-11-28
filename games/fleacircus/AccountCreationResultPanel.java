/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends ProgressMessageDialog implements WidgetActivationListener {
    static RgbSprite[] field_tb;
    static String field_xb;
    static long field_sb;
    private boolean field_wb;
    private AccountRegistrationPanel field_ub;
    private boolean field_vb;

    public static void releaseDeclaredStaticReferences(byte param0) {
        if (param0 <= 119) {
          AccountCreationResultPanel.releaseDeclaredStaticReferences((byte) -36);
          field_xb = null;
          field_tb = null;
          return;
        }
        field_xb = null;
        field_tb = null;
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          this.field_wb = true;
          if (param0 != 58) {
            return;
          }
          if (param1.success) {
            var4 = lc.field_q;
          } else {
            if (param1.suggestions == null) {
              var4 = param1.message;
              if (param1.statusCode == 248) {
                if (param2) {
                  this.field_vb = true;
                  var4 = al.field_a;
                } else {
                  ii.b(116);
                  this.field_vb = true;
                  var4 = al.field_a;
                }
              }
            } else {
              var4 = de.field_o;
              if (null != this.field_ub) {
                this.field_ub.onNameSuggestionsRefreshRequested(-72);
              }
            }
          }
          var5 = new DialogMessagePane((ProgressMessageDialog) (this), rg.field_o, var4);
          if (!param1.success) {
            if (!this.field_vb) {
              if (param1.statusCode != 5) {
                var5.addActionButton(TextHotspotBounds.field_k, param0 - 23551, -1);
              } else {
                var5.addActionButton(DelegatingCanvas.field_c, -23493, 11);
                var5.addActionButton(vk.field_K, -23493, 17);
              }
            } else {
              var5.addListenerButton((WidgetEventListener) (this), true, ee.field_k);
            }
            if (param1.statusCode == 3) {
              var5.addActionButton(DialogMessagePane.field_N, -23493, 7);
            } else {
              if (param1.statusCode == 6) {
                var5.addActionButton(cb.field_s, param0 ^ -23551, 9);
              }
            }
          } else {
            if (param1.field_g) {
              this.replaceContent(new RegistrationAgreementPane(this), 26034);
              return;
            }
            var5.addListenerButton((WidgetEventListener) (this), true, ee.field_k);
          }
          this.replaceContent(var5, param0 + 25976);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("ua.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final void showAccountCreationConnectionFailure(byte param0) {
        if (param0 >= -3) {
          return;
        }
        this.showAccountCreationResult((byte) 58, DiskCacheWorker.createAccountErrorResult((byte) 36, 248, al.field_a), true);
    }

    final boolean advanceDialogAnimation(int param0) {
        int var2 = -66 / ((38 - param0) / 49);
        if (!this.field_G) {
          return super.advanceDialogAnimation(100);
        }
        if (this.field_wb) {
          return super.advanceDialogAnimation(100);
        }
        AccountServiceResult var3 = bg.pollAccountCreationResult((byte) 56);
        if (var3 == null) {
          return super.advanceDialogAnimation(100);
        }
        this.showAccountCreationResult((byte) 58, var3, false);
        return super.advanceDialogAnimation(100);
    }

    public final void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        if (this.field_vb) {
          wa.a(false, true, param3 - 370);
          return;
        }
        try {
          ih.l(255);
          this.closeDialog(param3 ^ -22669);
          if (param3 != 248) {
            field_xb = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ua.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, rg.field_o, pb.field_b, false, false);
        try {
          this.field_ub = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_xb = "</shad>";
    }
}
