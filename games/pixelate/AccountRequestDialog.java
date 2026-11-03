/*
 * Decompiled by CFR-JS 0.4.0.
 */
class AccountRequestDialog extends ContentTransitionDialog implements ButtonListener {
    private StripedProgressBar field_rb;
    private boolean field_ob;
    private boolean field_vb;
    private boolean field_nb;
    static String field_qb;
    static String field_sb;
    static SceneWidget field_mb;
    static Sprite[] field_tb;
    private BitmapFont field_wb;
    static int[] field_ub;
    private boolean field_pb;

    public void onAction(TextButton param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 11) {
            field_ub = (int[]) null;
          }
          if (!this.field_nb) {
            ae.a((byte) 71, AudioService.a(13867), "tochangedisplayname.ws");
            return;
          }
          QuickChatMenu.a(3, -2671);
          this.p(-83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("vk.Q(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_sb = null;
        field_mb = null;
        field_ub = null;
        field_qb = null;
        if (param0 > 123) {
          field_tb = null;
          return;
        }
        field_qb = (String) null;
        field_tb = null;
    }

    AccountRequestDialog(kn param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new AccountMessagePanel((AccountRequestDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_pb = param3 ? true : false;
          this.field_ob = param4 ? true : false;
          this.field_nb = false;
          this.field_wb = param1;
          this.field_vb = false;
          this.field_rb = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_rb.field_Y = true;
          this.b(this.field_rb, 80);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void p(int param0) {
        if (!this.field_N) {
          return;
        }
        this.field_N = false;
        if (param0 > -80) {
          TextButton var3 = (TextButton) null;
          this.onAction((TextButton) null, -114, -9, 49, 73);
          if (this.field_pb) {
            m.a((byte) -102);
            return;
          }
          if (this.field_ob) {
            NameSuggestionsPanel.l(20700);
            return;
          }
          return;
        }
        if (this.field_pb) {
          m.a((byte) -102);
          return;
        }
        if (this.field_ob) {
          NameSuggestionsPanel.l(20700);
          return;
        }
    }

    final static void n(int param0) {
        int var2;
        var2 = Pixelate.field_H ? 1 : 0;
        if (oo.field_b > 0) {
          oo.field_b = oo.field_b - 1;
        } else {
          if (vn.field_g > 0) {
            vn.field_g = vn.field_g - 1;
          } else {
            if (0 < Checkbox.field_W) {
              Checkbox.field_W = Checkbox.field_W - 1;
            }
          }
        }
        if (oo.field_b > 0) {
          EditableTextWidget.m(124);
        }
        if (param0 <= 76) {
          field_ub = (int[]) null;
        }
        if (0 < vn.field_g) {
          cm.b(vn.field_g, 4740);
        }
        if (Checkbox.field_W <= 0) {
          return;
        }
        cm.b(Checkbox.field_W, 4740);
    }

    final void o(int param0) {
        this.field_rb.a((byte) 125, param0, 4210752);
        AccountMessagePanel var2 = new AccountMessagePanel(this, this.field_wb, hq.field_D);
        var2.a(15, -1, sk.field_b);
        this.transitionToContent(var2, -118);
    }

    final void a(int param0, int param1, String param2) {
        boolean stackIn_7_1 = false;
        AccountMessagePanel stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        String stackIn_15_3;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        AccountMessagePanel var6 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_vb) {
            return;
          }
          this.field_vb = true;
          stackIn_7_1 = (param0 == 256);
          this.field_nb = stackIn_7_1;
          this.field_rb.a((byte) 103, 8405024, 4210752);
          var6 = new AccountMessagePanel(this, this.field_wb, param2);
          if (param1 != 5804) {
            AccountRequestDialog.n(117);
          }
          if (5 == param0) {
            var6.a(11, -1, jj.field_c);
            var6.a(17, -1, FullscreenFocusCanvas.field_e);
          } else {
            if (param0 != 256) {
              stackIn_14_0 = var6;
              stackIn_14_1 = -1;
              stackIn_14_2 = -1;
              if (!this.field_pb) {
                stackIn_15_3 = bo.field_f;
              } else {
                stackIn_15_3 = bo.field_k;
              }
              ((AccountMessagePanel) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_15_3);
            } else {
              var6.a(1707, (UiListener) (this), bo.field_k);
            }
          }
          if (param0 == 3) {
            var6.a(7, param1 - 5805, gd.field_d);
          } else {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(9, -1, ho.field_d);
              } else {
                if (param0 != 9) {
                  this.transitionToContent(var6, -124);
                  return;
                }
                var6.a(1707, (UiListener) (this), ue.field_q);
              }
            } else {
              var6.a(8, -1, StripedProgressBar.field_X);
            }
          }
          this.transitionToContent(var6, -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("vk.SA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 13) {
            this.p(-126);
            return true;
          }
          if (param1 == 3) {
            stackIn_8_0 = super.onFocusedKey(param0, 3, param2, param3);
            return stackIn_8_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("vk.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final static CanvasRasterBuffer a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          CanvasRasterBuffer var5 = null;
          ImageProducerRasterBuffer var5_ref = null;
          int var6 = 0;
          CanvasRasterBuffer stackIn_1_0 = null;
          ImageProducerRasterBuffer stackIn_3_0 = null;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("BufferedImageRasterBuffer");
              var6 = 32 / ((param1 - 70) / 45);
              var5 = (CanvasRasterBuffer) (var4.newInstance());
              var5.a(param3, param2, param0, (byte) -100);
              stackIn_1_0 = var5;
              return stackIn_1_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ImageProducerRasterBuffer();
              ((CanvasRasterBuffer) ((Object) var5_ref)).a(param3, param2, param0, (byte) -78);
              stackIn_3_0 = var5_ref;
              return (CanvasRasterBuffer) ((Object) stackIn_3_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var4_ref2;
            stackIn_6_1 = new StringBuilder().append("vk.UA(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_sb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_qb = "Password: ";
        field_ub = new int[8192];
    }
}
