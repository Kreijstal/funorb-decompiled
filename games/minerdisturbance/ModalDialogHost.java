/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static String[] field_J;
    static String field_M;
    static String field_L;
    static String field_N;
    private IntrusiveDeque field_K;

    final static void d(byte param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MinerDisturbance.field_ab;
        try {
          if (param0 != 22) {
            field_J = (String[]) null;
          }
          if (tk.b(127)) {
            BufferedSocket.field_a.processPointerInput(true, ql.field_c, LoginPanel.field_T, 0);
            BufferedSocket.field_a.advanceDialogs(-256);
            while (mm.b((byte) 118)) {
              BufferedSocket.field_a.processKeyInput((byte) -65, lj.field_t, ud.field_c);
            }
            return;
          }
          if (null != kf.field_d &&
            kf.field_d.field_b) {
            MusicPatchEnvelope.a((byte) 81);
            BufferedSocket.field_a.showDialog(param0 ^ 23, new FullscreenStatusDialog(BufferedSocket.field_a, ConfirmedEmailAvailabilityValidator.field_k));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.wrapClientException((Throwable) ((Object) var1), "hm.Q(" + param0 + ')');
        }
    }

    final void showDialog(int param0, UiWidget param1) {
        ModalDialog var3 = null;
        try {
          if (!(param1 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          if (param0 != 1) {
            this.closeAllDialogs(31);
          }
          var3 = (ModalDialog) (param1);
          this.field_K.addFirst(var3, 27862);
          var3.field_K = true;
          var3.takeFocus((UiWidget) (this), 127);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "hm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void advanceDialogs(int param0) {
        int var4 = MinerDisturbance.field_ab;
        if (param0 != -256) {
          return;
        }
        hh var2 = new hh(this.field_K);
        ModalDialog var3 = (ModalDialog) (var2.d(param0 - 19608));
        while (var3 != null) {
          if (var3.advanceDialogAnimation(-4)) {
            var3.unlink(34);
          }
          var3 = (ModalDialog) (var2.a(12537));
        }
        this.field_I = (UiWidget) ((Object) this.getTopOpenDialog((byte) 83));
    }

    public ModalDialogHost() {
        super(0, 0, ConfirmedEmailAvailabilityValidator.field_n, ae.field_c, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_K = new IntrusiveDeque();
    }

    public static void clearStaticReferences(byte param0) {
        field_M = null;
        field_N = null;
        if (param0 < 111) {
          field_J = (String[]) null;
        }
        field_L = null;
        field_J = null;
    }

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (null != this.field_A) {
          this.field_A.paintWidget(12088, param1, (UiWidget) (this), param2, true);
        }
        hh var5 = new hh(this.field_K);
        if (param0 != 4) {
          this.snapAndPruneDialogs(false);
        }
        UiWidget var6 = (UiWidget) (var5.a(true));
        while (var6 != null) {
          var6.drawWidget((byte) 4, param1 + this.field_u, this.field_t + param2, param3);
          var6 = (UiWidget) (var5.c(-127));
        }
    }

    final static int f(byte param0) {
        if (param0 != -67) {
          field_N = (String) null;
        }
        return mj.field_p;
    }

    final void closeAllDialogs(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(this.field_K);
        ModalDialog var3 = (ModalDialog) (var2.d(-19864));
        while (var3 != null) {
          var3.field_K = false;
          var3 = (ModalDialog) (var2.a(12537));
        }
        if (param0 != 21974) {
          field_J = (String[]) null;
        }
        this.field_I = null;
    }

    final UiWidget getFocusedChild(int param0) {
        hh var2;
        ModalDialog var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        if (param0 != -21923) {
          field_J = (String[]) null;
        }
        var2 = new hh(this.field_K);
        var3 = (ModalDialog) (var2.d(-19864));
        while (var3 != null) {
          if (var3.field_K) {
            return var3.getFocusedChild(124);
          }
          var3 = (ModalDialog) (var2.a(12537));
        }
        return null;
    }

    final void snapAndPruneDialogs(boolean param0) {
        int var4 = MinerDisturbance.field_ab;
        if (!param0) {
          field_L = (String) null;
        }
        hh var2 = new hh(this.field_K);
        ModalDialog var3 = (ModalDialog) (var2.d(-19864));
        while (var3 != null) {
          if (var3.snapDialogAnimation(false)) {
            var3.unlink(34);
          }
          var3 = (ModalDialog) (var2.a(12537));
        }
    }

    final ModalDialog getTopOpenDialog(byte param0) {
        hh var2;
        ModalDialog var3;
        int var4;
        var4 = MinerDisturbance.field_ab;
        var2 = new hh(this.field_K);
        var3 = (ModalDialog) (var2.d(-19864));
        if (param0 != 83) {
          ModalDialogHost.clearStaticReferences((byte) 111);
        }
        while (var3 != null) {
          if (var3.field_K) {
            return var3;
          }
          var3 = (ModalDialog) (var2.a(12537));
        }
        return null;
    }

    final static gj a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        gj var7 = null;
        int var8 = 0;
        gj stackIn_3_0 = null;
        gj stackIn_6_0 = null;
        gj stackIn_9_0 = null;
        gj stackIn_16_0 = null;
        gj stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = MinerDisturbance.field_ab;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_3_0 = dh.field_d;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_6_0 = ec.field_d;
            return stackIn_6_0;
          }
          var3 = h.a('.', param1, param0);
          if (var3.length < 2) {
            stackIn_9_0 = dh.field_d;
            return stackIn_9_0;
          }
          if (!param1) {
            ModalDialogHost.clearStaticReferences((byte) 7);
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_19_0 = ql.a(param1, var3[var3.length - 1]);
              return stackIn_19_0;
            }
            var6 = var4[var5];
            var7 = ProgressMessageDialog.a(var6, true);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_16_0 = var7;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("hm.L(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static sj a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        sj[] var4 = null;
        int var5 = 0;
        sj var6 = null;
        int var7 = 0;
        sj stackIn_4_0 = null;
        sj stackIn_9_0 = null;
        sj stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MinerDisturbance.field_ab;
        try {
          var2 = DequeWidgetContainer.a("jagex-last-login-method", (byte) 114, param1);
          if (var2 == null) {
            stackIn_4_0 = li.field_d;
            return stackIn_4_0;
          }
          var3 = 121 % ((-63 - param0) / 48);
          var4 = im.b(111);
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_12_0 = li.field_d;
              return stackIn_12_0;
            }
            var6 = var4[var5];
            if (!var6.a(2, var2)) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_15_0 = var2_ref;
          stackIn_15_1 = new StringBuilder().append("hm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_M = "Waiting for sound effects";
        field_J = new String[]{"Throw caution to the wind and take some trusty dynamite into the mine. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater.", "Throw caution to the wind and take some trusty dynamite into the Super Volcano. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater."};
        field_L = "That name is not available";
        field_N = "Ranking: Boreal Brave";
    }
}
