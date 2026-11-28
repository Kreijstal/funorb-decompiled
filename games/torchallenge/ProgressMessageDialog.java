/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    static String field_qb;
    private BitmapFont field_yb;
    static boolean[] field_pb;
    static ge field_xb;
    static int[] field_rb;
    static int[] field_sb;
    private boolean field_ub;
    private boolean field_ob;
    private boolean field_wb;
    private StripedProgressWidget field_vb;
    private boolean field_tb;

    final boolean handleKey(int param0, char param1, byte param2, UiComponent param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 9) {
            return false;
          }
          if (param0 != 13) {
            stackIn_8_0 = super.handleKey(param0, param1, (byte) 80, param3);
            return stackIn_8_0;
          }
          this.closeDialog(77);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wa.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void closeDialog(int param0) {
        if (!this.field_K) {
          return;
        }
        this.field_K = false;
        if (param0 != 77) {
          this.field_wb = true;
          if (this.field_tb) {
            ContentTransitionDialog.g((byte) -118);
            return;
          }
          if (this.field_ob) {
            DiskArchiveRequest.c(false);
            return;
          }
          return;
        }
        if (this.field_tb) {
          ContentTransitionDialog.g((byte) -118);
          return;
        }
        if (!this.field_ob) {
          return;
        }
        DiskArchiveRequest.c(false);
    }

    final void showConnectionFailure(int param0) {
        this.field_vb.setColours(23927, 2121792, 4210752);
        DialogMessagePane var2 = new DialogMessagePane(this, this.field_yb, bk.field_n);
        var2.addActionButton(15, param0 + 2070, DequeWidgetContainer.field_E);
        if (param0 == 13) {
          this.replaceContent(0, var2);
          return;
        }
        InteractiveWidget var3 = (InteractiveWidget) null;
        this.onWidgetActivated((InteractiveWidget) null, -19, -53, 4, true);
        this.replaceContent(0, var2);
    }

    public void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        InteractiveWidget var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4) {
            var7 = (InteractiveWidget) null;
            this.onWidgetActivated((InteractiveWidget) null, -14, -19, -46, true);
          }
          if (!this.field_wb) {
            ob.a("tochangedisplayname.ws", gi.b(12476), (byte) 43);
            return;
          }
          fk.a(true, 3);
          this.closeDialog(77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("wa.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void discardDeclaredStaticReferences(int param0) {
        int var1 = -93 / ((param0 + 20) / 44);
        field_pb = null;
        field_qb = null;
        field_xb = null;
        field_sb = null;
        field_rb = null;
    }

    final void showResult(boolean param0, String param1, int param2) {
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        DialogMessagePane stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        String stackIn_15_3;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        DialogMessagePane var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        DialogMessagePane var6 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_ub) {
            return;
          }
          stackIn_6_1 = (param0);
          this.field_ub = stackIn_6_1;
          stackIn_9_1 = (256 == param2);
          this.field_wb = stackIn_9_1;
          this.field_vb.setColours(23927, 8405024, 4210752);
          var6 = new DialogMessagePane(this, this.field_yb, param1);
          var4 = var6;
          if (param2 == 5) {
            var6.addActionButton(11, 2083, te.field_c);
            var6.addActionButton(17, 2083, ph.field_f);
          } else {
            if (param2 != 256) {
              stackIn_14_0 = var6;
              stackIn_14_1 = -1;
              stackIn_14_2 = 2083;
              if (this.field_tb) {
                stackIn_15_3 = qb.field_e;
              } else {
                stackIn_15_3 = ModalDialog.field_R;
              }
              ((DialogMessagePane) (Object) stackIn_14_0).addActionButton(stackIn_14_1, stackIn_14_2, stackIn_15_3);
            } else {
              var6.addListenerButton((byte) 46, (WidgetEventListener) (this), qb.field_e);
            }
          }
          if (param2 != 3) {
            if (param2 != 4) {
              if (param2 == 6) {
                var6.addActionButton(9, 2083, qc.field_b);
              } else {
                if (param2 == 9) {
                  var6.addListenerButton((byte) 46, (WidgetEventListener) (this), vj.field_e);
                }
              }
            } else {
              var6.addActionButton(8, 2083, le.field_d);
            }
          } else {
            var6.addActionButton(7, 2083, aj.field_a);
          }
          this.replaceContent(0, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("wa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    ProgressMessageDialog(ModalDialogHost param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_tb = param3 ? true : false;
          this.field_ob = param4 ? true : false;
          this.field_wb = false;
          this.field_yb = param1;
          this.field_ub = false;
          this.field_vb = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_vb.field_L = true;
          this.addChild(0, this.field_vb);
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_pb = null;
        field_qb = "Waiting for extra data";
        field_sb = new int[6];
        field_rb = new int[4];
    }
}
