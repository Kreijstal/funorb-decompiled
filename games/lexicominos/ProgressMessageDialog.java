/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    private BitmapFont field_jb;
    static volatile int field_eb;
    private boolean field_ob;
    private StripedProgressWidget field_gb;
    static RgbSprite[] field_hb;
    static String field_nb;
    static int field_fb;
    private boolean field_lb;
    private boolean field_db;
    private boolean field_ib;
    static String field_mb;
    static DefaultTextWidgetRenderer field_kb;

    final boolean handleKey(char param0, int param1, UiWidget param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == param1) {
            this.closeDialog(true);
            return true;
          }
          var5_int = 23 % ((param3 + 13) / 55);
          stackIn_5_0 = super.handleKey(param0, param1, param2, (byte) 114);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uc.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void showResult(int param0, int param1, String param2) {
        boolean stackIn_6_1 = false;
        DialogMessagePane stackIn_11_0 = null;
        String stackIn_12_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        DialogMessagePane var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_lb) {
            return;
          }
          this.field_lb = true;
          var4_int = -97 / ((param0 - 31) / 49);
          stackIn_6_1 = (param1 == 256);
          this.field_ob = stackIn_6_1;
          this.field_gb.setColours(4210752, 8405024, 124);
          var5 = new DialogMessagePane(this, this.field_jb, param2);
          if (param1 == 5) {
            var5.addActionButton(StripedProgressWidget.field_B, 11, 122);
            var5.addActionButton(jd.field_d, 17, -62);
          } else {
            if (param1 != 256) {
              stackIn_11_0 = var5;
              if (!this.field_ib) {
                stackIn_12_1 = a.field_e;
              } else {
                stackIn_12_1 = og.field_j;
              }
              ((DialogMessagePane) (Object) stackIn_11_0).addActionButton(stackIn_12_1, -1, 111);
            } else {
              var5.addListenerButton(-1, og.field_j, (WidgetEventListener) (this));
            }
          }
          if (param1 == 3) {
            var5.addActionButton(pa.field_b, 7, 112);
          } else {
            if (4 != param1) {
              if (6 != param1) {
                if (9 != param1) {
                  this.replaceContent(118, var5);
                  return;
                }
                var5.addListenerButton(-1, StandardContentDialog.field_eb, (WidgetEventListener) (this));
              } else {
                var5.addActionButton(lb.field_b, 9, 105);
              }
            } else {
              var5.addActionButton(dj.field_a, 8, 111);
            }
          }
          this.replaceContent(118, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("uc.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void closeDialog(boolean param0) {
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (!param0) {
          field_hb = (RgbSprite[]) null;
          if (this.field_ib) {
            AccountCreationResultPanel.h(!param0 ? true : false);
            return;
          }
          if (!this.field_db) {
            return;
          }
          TextFieldValidator.c(0);
          return;
        }
        if (this.field_ib) {
          AccountCreationResultPanel.h(!param0 ? true : false);
          return;
        }
        if (!this.field_db) {
          return;
        }
        TextFieldValidator.c(0);
    }

    public void onWidgetActivated(int param0, int param1, int param2, int param3, InteractiveWidget param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_ob) {
            pd.a("tochangedisplayname.ws", -109, RichTextLayout.c(-14047));
          } else {
            ni.a(56, 3);
            this.closeDialog(true);
          }
          if (param2 == 215535458) {
            return;
          }
          this.closeDialog(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("uc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_hb = null;
        if (param0 != 11331) {
          return;
        }
        field_mb = null;
        field_nb = null;
        field_kb = null;
    }

    final void showConnectionFailure(int param0) {
        this.field_gb.setColours(4210752, 2121792, 120);
        DialogMessagePane var2 = new DialogMessagePane(this, this.field_jb, la.field_a);
        var2.addActionButton(e.field_e, param0, 124);
        this.replaceContent(117, var2);
    }

    ProgressMessageDialog(ModalDialogHost param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_ob = false;
          this.field_lb = false;
          this.field_ib = param3 ? true : false;
          this.field_db = param4 ? true : false;
          this.field_jb = param1;
          this.field_gb = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_gb.field_G = true;
          this.addChild((byte) -65, (UiWidget) (this.field_gb));
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_nb = "Passwords must be between 5 and 20 letters and numbers";
        field_eb = 0;
        field_mb = "Not yet achieved";
    }
}
