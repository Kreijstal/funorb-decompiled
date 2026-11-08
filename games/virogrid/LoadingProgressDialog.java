/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingProgressDialog extends ResizableDialog {
    private StripedProgressBar field_gb;
    static int[] field_eb;
    static String textEndgameEntrapmentYou;
    static int field_bb;
    private String field_lb;
    static Sprite[][] field_fb;
    static int[] field_jb;
    private String field_kb;
    private boolean field_ib;
    static String field_hb;
    private boolean field_cb;

    final void drawDialogBackground(int param0, int param1, int param2) {
        super.drawDialogBackground(param0, 22, param2);
        LoginRsaKey.arezzo14BoldFont.drawCentered(this.field_lb, param2 + (this.field_g >> 1), 103 + param0, 16777215, -1);
        if (param1 < 8) {
          LoadingProgressDialog.releaseStatics((byte) 3);
          if (this.field_kb != null) {
            Rasterizer.drawHorizontalLine(20 + param2, 113 + param0, 260, 8421504);
            LoginRsaKey.arezzo14BoldFont.drawParagraph(this.field_kb, param2 + 20, param0 + 120 + 8, 260, 100, 16777215, -1, 1, 0, LoginRsaKey.arezzo14BoldFont.field_H);
            return;
          }
          return;
        }
        if (this.field_kb == null) {
          return;
        }
        Rasterizer.drawHorizontalLine(20 + param2, 113 + param0, 260, 8421504);
        LoginRsaKey.arezzo14BoldFont.drawParagraph(this.field_kb, param2 + 20, param0 + 120 + 8, 260, 100, 16777215, -1, 1, 0, LoginRsaKey.arezzo14BoldFont.field_H);
    }

    final static void openLoginScreen(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        DebouncedValidator.openLoginDialog((String) null, param1, param0, true);
        if (param2 != -16113) {
          LoadingProgressDialog.openLoginScreen(true, true, -42);
        }
    }

    public static void releaseStatics(byte param0) {
        textEndgameEntrapmentYou = null;
        field_eb = null;
        field_hb = null;
        if (param0 < 57) {
          return;
        }
        field_fb = (Sprite[][]) null;
        field_jb = null;
    }

    final void setProgress(float param0, boolean param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_cb != param2) {
            stackIn_5_1 = (param2);
            this.field_cb = stackIn_5_1;
            if (!this.field_cb) {
              this.field_gb.setColors(4210752, 2113632, 123);
              if (this.field_ib) {
                this.field_gb.field_z = false;
              }
            } else {
              this.field_gb.setColors(4210752, 8405024, 125);
              this.field_gb.field_z = true;
            }
          }
          this.field_lb = param3;
          this.field_gb.field_C = (int)(param0 / 100.0f * 65536.0f);
          if (!param1) {
            return;
          }
          LoadingProgressDialog.releaseStatics((byte) 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vc.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    LoadingProgressDialog(WidgetLayerStack param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
          this.field_kb = param1;
          if (null != this.field_kb) {
            var3_int = LoginRsaKey.arezzo14BoldFont.paragraphHeight(this.field_kb, 260, LoginRsaKey.arezzo14BoldFont.field_H);
            this.setCenteredSize(150 + var3_int, 120, 300);
          }
          this.field_gb = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_gb.field_z = true;
          this.field_cb = false;
          this.field_ib = false;
          this.addChild((UiWidget) (this.field_gb), (byte) -78);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void stopProgressAnimation(int param0) {
        this.field_ib = true;
        this.field_gb.field_z = false;
        int var2 = -44 / ((param0 + 54) / 59);
    }

    final static void snapshotMouseInput(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = MouseTrailPoint.field_l;
        synchronized (var1) {
          NodeHashTableIterator.field_e = ClockAndTextHelpers.field_d;
          ValidationMessageWidget.field_Q = ValidationMessageWidget.field_Q + 1;
          StatefulWidgetPainter.field_u = PendingRequest.field_i;
          IconTextComponent.field_Jb = LoadingProgressHelpers.field_a;
          if (param0 > -30) {
            field_eb = (int[]) null;
          }
          ValidationIndicator.field_J = FrameSkin.field_a;
          FrameSkin.field_a = false;
          MenuScreen.field_g = ClientEnvironmentHelpers.field_g;
          HuffmanCodec.field_b = MusicPlaybackHelpers.field_f;
          PasswordFieldPainter.field_y = IconTextComponent.field_Mb;
          ClientEnvironmentHelpers.field_g = 0;
        }
    }

    final static IndexedSprite loadIndexedSpriteByName(Js5Archive param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.findGroupId(-1, param2);
          var5 = param0.getFileId(-60, var4_int, param1);
          if (param3 <= 23) {
            field_hb = (String) null;
          }
          stackIn_3_0 = LoginMethodHelpers.loadIndexedSprite(var5, var4_int, -2071, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vc.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_eb = new int[]{1, 1, 1, 3, 2, 1, 1, 2, 5, 1};
        textEndgameEntrapmentYou = "You cannot move";
    }
}
