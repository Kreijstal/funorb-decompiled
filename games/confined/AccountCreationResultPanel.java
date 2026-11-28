/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationResultPanel extends dh implements WidgetActivationListener {
    static ResourceArchive field_Bb;
    private boolean field_Fb;
    private AccountRegistrationPanel field_Hb;
    private boolean field_Gb;
    static String field_Cb;
    static int field_Eb;
    static pb field_Db;

    private final void showAccountCreationResult(byte param0, boolean param1, AccountServiceResult param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        jn var5 = null;
        int var6 = 0;
        InteractiveWidget var7 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          this.field_Fb = true;
          if (param2.success) {
            var4 = gd.field_r;
          } else {
            if (null == param2.suggestions) {
              var4 = param2.message;
              if (param2.statusCode == 248) {
                if (!param1) {
                  om.b(true);
                }
                var4 = ClientException.field_a;
                this.field_Gb = true;
              }
            } else {
              var4 = fh.field_c;
              if (this.field_Hb != null) {
                this.field_Hb.onNameSuggestionsRefreshRequested((byte) -120);
              }
            }
          }
          var5 = new jn((dh) (this), fd.field_k, var4);
          if (!param2.success) {
            if (!this.field_Gb) {
              if (param2.statusCode != 5) {
                var5.a(0, GameAppletShell.field_i, -1);
              } else {
                var5.a(0, ei.field_nb, 11);
                var5.a(param0 + 96, al.field_c, 17);
              }
            } else {
              var5.a(gi.field_fb, (WidgetEventListener) (this), false);
            }
            if (param2.statusCode == 3) {
              var5.a(0, ui.field_d, 7);
            } else {
              if (6 == param2.statusCode) {
                var5.a(0, NetworkArchiveRequest.field_y, 9);
              }
            }
          } else {
            if (param2.field_i) {
              this.a((UiWidget) (new pi(this)), (byte) -72);
              return;
            }
            var5.a(gi.field_fb, (WidgetEventListener) (this), false);
          }
          this.a((UiWidget) (var5), (byte) -72);
          if (param0 == -96) {
            return;
          }
          var7 = (InteractiveWidget) null;
          this.onWidgetActivated(106, -28, -124, (InteractiveWidget) null, -89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("v.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        if (param0 < 68) {
          this.field_Fb = false;
        }
        if (this.field_Gb) {
          wl.a(-66, false, true);
          return;
        }
        try {
          LabeledWidgetContainer.j(31);
          this.n(10);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "v.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        AccountServiceResult var2;
        InteractiveWidget var3;
        AccountServiceResult var2Lifetime1;
        if (param0 == -6) {
          if (!this.field_H) {
            return super.advanceDialogAnimation(-6);
          }
          if (this.field_Fb) {
            return super.advanceDialogAnimation(-6);
          }
          var2 = TunnelMesh.pollAccountCreationResult((byte) -100);
          if (var2 == null) {
            return super.advanceDialogAnimation(-6);
          }
          this.showAccountCreationResult((byte) -96, false, var2);
          return super.advanceDialogAnimation(-6);
        }
        var3 = (InteractiveWidget) null;
        this.onWidgetActivated(-51, -9, 28, (InteractiveWidget) null, -54);
        if (!this.field_H) {
          return super.advanceDialogAnimation(-6);
        }
        if (this.field_Fb) {
          return super.advanceDialogAnimation(-6);
        }
        var2Lifetime1 = TunnelMesh.pollAccountCreationResult((byte) -100);
        if (var2Lifetime1 != null) {
          this.showAccountCreationResult((byte) -96, false, var2Lifetime1);
        }
        return super.advanceDialogAnimation(-6);
    }

    final void o(int param0) {
        this.showAccountCreationResult((byte) -96, true, gd.createAccountErrorResult(4, ClientException.field_a, 248));
        if (param0 < 107) {
          AccountCreationResultPanel.clearStaticReferences((byte) -117);
        }
    }

    AccountCreationResultPanel(ModalDialogHost param0, AccountRegistrationPanel param1) {
        super(param0, fd.field_k, un.field_d, false, false);
        try {
          this.field_Hb = param1;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_Db = null;
        field_Bb = null;
        if (param0 != -39) {
          return;
        }
        field_Cb = null;
    }

    static {
        field_Cb = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
