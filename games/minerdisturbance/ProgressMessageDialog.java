/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    static boolean[] field_ub;
    private BitmapFont field_vb;
    private boolean field_ob;
    static Sprite[] field_tb;
    private boolean field_rb;
    static int field_wb;
    private StripedProgressWidget field_pb;
    private boolean field_qb;
    static int field_sb;
    private boolean field_nb;

    final static gj a(String param0, boolean param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        gj stackIn_4_0 = null;
        gj stackIn_7_0 = null;
        gj stackIn_17_0 = null;
        gj stackIn_20_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = dh.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_7_0 = ec.field_d;
            return stackIn_7_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_17_0 = vh.field_f;
                return stackIn_17_0;
              }
            } else {
              if (wd.field_d.indexOf(var4) == -1) {
                stackIn_20_0 = vh.field_f;
                return stackIn_20_0;
              }
            }
          }
          if (param1) {
            return null;
          }
          field_sb = 18;
          stackIn_25_0 = null;
          return (gj) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("rg.C(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    ProgressMessageDialog(ModalDialogHost param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_qb = false;
          this.field_vb = param1;
          this.field_rb = param4 ? true : false;
          this.field_ob = false;
          this.field_nb = param3 ? true : false;
          this.field_pb = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_pb.field_O = true;
          this.addChild(-1, this.field_pb);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void showConnectionFailure(byte param0) {
        this.field_pb.setColours(4210752, 2121792, (byte) -112);
        if (param0 != -97) {
          return;
        }
        DialogMessagePane var2 = new DialogMessagePane(this, this.field_vb, pn.field_f);
        var2.addActionButton(15, NetworkArchiveRequest.field_K, param0 ^ 54);
        this.replaceContent((byte) -56, (UiWidget) (var2));
    }

    public void onWidgetActivated(int param0, byte param1, InteractiveWidget param2, int param3, int param4) {
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_qb) {
            AlphaWidgetContainer.a(3, 3);
            this.closeDialog(2121792);
          } else {
            ContentTransitionDialog.a(RichTextLayout.c(-121), 78, "tochangedisplayname.ws");
          }
          if (param1 != 6) {
            var7 = (String) null;
            this.showResult((String) null, 94, (byte) -118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void showResult(String param0, int param1, byte param2) {
        boolean stackIn_7_1 = false;
        DialogMessagePane stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        DialogMessagePane var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        DialogMessagePane var6 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (this.field_ob) {
            return;
          }
          stackIn_7_1 = (256 == param1);
          this.field_qb = stackIn_7_1;
          this.field_ob = true;
          this.field_pb.setColours(4210752, 8405024, (byte) -128);
          if (param2 > -43) {
            this.field_rb = false;
          }
          var6 = new DialogMessagePane(this, this.field_vb, param0);
          var4 = var6;
          if (5 != param1) {
            if (param1 != 256) {
              stackIn_15_0 = var6;
              stackIn_15_1 = -1;
              if (this.field_nb) {
                stackIn_16_2 = af.field_s;
              } else {
                stackIn_16_2 = hk.field_d;
              }
              ((DialogMessagePane) (Object) stackIn_15_0).addActionButton(stackIn_15_1, stackIn_16_2, -89);
            } else {
              var6.addListenerButton(af.field_s, 95, (WidgetEventListener) (this));
            }
          } else {
            var6.addActionButton(11, pc.field_i, -89);
            var6.addActionButton(17, o.field_b, -68);
          }
          if (param1 == 3) {
            var6.addActionButton(7, wb.field_q, -82);
          } else {
            if (4 == param1) {
              var6.addActionButton(8, kd.field_e, -116);
            } else {
              if (param1 != 6) {
                if (param1 == 9) {
                  var6.addListenerButton(RichTextLayout.field_k, 66, (WidgetEventListener) (this));
                }
              } else {
                var6.addActionButton(9, gj.field_b, -98);
              }
            }
          }
          this.replaceContent((byte) -62, (UiWidget) (var6));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(char param0, UiWidget param1, byte param2, int param3) {
        RuntimeException var5 = null;
        InteractiveWidget var6 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -79) {
            var6 = (InteractiveWidget) null;
            this.onWidgetActivated(3, (byte) 82, (InteractiveWidget) null, -71, 108);
          }
          if (param3 != 13) {
            stackIn_7_0 = super.handleKey(param0, param1, (byte) -79, param3);
            return stackIn_7_0;
          }
          this.closeDialog(2121792);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void closeDialog(int param0) {
        if (!this.field_K) {
          return;
        }
        if (param0 != 2121792) {
          field_wb = -29;
        }
        this.field_K = false;
        if (this.field_nb) {
          fd.a(true);
        } else {
          if (this.field_rb) {
            FullscreenNoticeType.a((byte) -127);
          }
        }
    }

    public static void resetStaticState(int param0) {
        field_ub = null;
        field_tb = null;
        if (param0 != 28776) {
          field_sb = -1;
        }
    }

    static {
    }
}
