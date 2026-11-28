/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ProgressMessageDialog extends ContentTransitionDialog implements WidgetActivationListener {
    private BitmapFont field_db;
    private StripedProgressWidget field_ab;
    static tl field_bb;
    static RgbSprite field_X;
    static int field_Z;
    private boolean field_cb;
    private boolean field_eb;
    private boolean field_W;
    private boolean field_Y;

    final boolean handleKey(char param0, int param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            return true;
          }
          if (param1 != 13) {
            stackIn_8_0 = super.handleKey(param0, param1, param2, 0);
            return stackIn_8_0;
          }
          this.closeDialog(4210752);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("dh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void resetStaticState(byte param0) {
        if (param0 != -94) {
          field_Z = 63;
        }
        field_bb = null;
        field_X = null;
    }

    final static String a(int param0, long param1) {
        qc.field_c.setTime(new Date(param1));
        int var3 = qc.field_c.get(7);
        int var4 = qc.field_c.get(5);
        int var5 = qc.field_c.get(2);
        int var6 = qc.field_c.get(1);
        int var7 = qc.field_c.get(11);
        int var8 = qc.field_c.get(12);
        int var9 = qc.field_c.get(13);
        if (param0 != -15591) {
          field_bb = (tl) null;
        }
        return RichTextWidget.field_N[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + ProxySocketConnector.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void showConnectionFailure(byte param0) {
        this.field_ab.setColours(16711422, 2121792, 4210752);
        int var2 = 96 % ((param0 - 8) / 44);
        DialogMessagePane var3 = new DialogMessagePane(this, this.field_db, PcmOutputWorker.field_e);
        var3.addActionButton(il.field_d, 15, -15858);
        this.replaceContent(false, var3);
    }

    final void closeDialog(int param0) {
        if (param0 != 4210752) {
          InteractiveWidget var3 = (InteractiveWidget) null;
          this.onWidgetActivated((byte) 120, -34, 27, (InteractiveWidget) null, 96);
        }
        if (!this.field_A) {
          return;
        }
        this.field_A = false;
        if (this.field_W) {
          jk.a(121);
        } else {
          if (this.field_cb) {
            AccountRegistrationPanel.d(false);
          }
        }
    }

    final static e a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        e stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        e stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 < 63) {
            stackIn_3_0 = (e) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              stackIn_13_0 = ba.field_a;
              return stackIn_13_0;
            }
            var4 = param0.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (57 >= var4) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_10_0 = null;
          return (e) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("dh.MA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void showResult(int param0, int param1, String param2) {
        boolean stackIn_7_1 = false;
        DialogMessagePane stackIn_12_0 = null;
        String stackIn_13_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        DialogMessagePane var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        DialogMessagePane var7 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_Y) {
            return;
          }
          this.field_Y = true;
          stackIn_7_1 = (param1 == 256);
          this.field_eb = stackIn_7_1;
          this.field_ab.setColours(16711422, 8405024, 4210752);
          var7 = new DialogMessagePane(this, this.field_db, param2);
          var4 = var7;
          var5 = -74 % ((param0 - 43) / 46);
          if (param1 == 5) {
            var7.addActionButton(vc.field_n, 11, -15858);
            var7.addActionButton(ld.field_d, 17, -15858);
          } else {
            if (param1 != 256) {
              stackIn_12_0 = var7;
              if (this.field_W) {
                stackIn_13_1 = SpriteGeometry.field_l;
              } else {
                stackIn_13_1 = vc.field_i;
              }
              ((DialogMessagePane) (Object) stackIn_12_0).addActionButton(stackIn_13_1, -1, -15858);
            } else {
              var7.addListenerButton(SpriteGeometry.field_l, -34, (WidgetEventListener) (this));
            }
          }
          if (param1 != 3) {
            if (param1 == 4) {
              var7.addActionButton(l.field_a, 8, -15858);
            } else {
              if (param1 != 6) {
                if (param1 == 9) {
                  var7.addListenerButton(fk.field_d, -34, (WidgetEventListener) (this));
                }
              } else {
                var7.addActionButton(qf.field_k, 9, -15858);
              }
            }
          } else {
            var7.addActionButton(vk.field_y, 7, -15858);
          }
          this.replaceContent(false, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_27_0 = var4_ref;
          stackIn_27_1 = new StringBuilder().append("dh.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    ProgressMessageDialog(ModalDialogHost param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new DialogMessagePane((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_eb = false;
          this.field_Y = false;
          this.field_db = param1;
          this.field_W = param3 ? true : false;
          this.field_cb = param4 ? true : false;
          this.field_ab = new StripedProgressWidget(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ab.field_z = true;
          this.addChild(this.field_ab, (byte) 74);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void onWidgetActivated(byte param0, int param1, int param2, InteractiveWidget param3, int param4) {
        try {
          if (!this.field_eb) {
            AlphaWidgetContainer.a("tochangedisplayname.ws", (byte) -93, uj.b((byte) -120));
          } else {
            il.a(3, 0);
            this.closeDialog(4210752);
          }
          int var6_int = -39 % ((-3 - param0) / 62);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "dh.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_Z = 0;
    }
}
