/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    static String field_kb;
    private int field_Y;
    static int[] field_ib;
    static long field_jb;
    static String field_fb;
    private int field_X;
    private UiWidget field_eb;
    static String field_cb;
    private int field_gb;
    static int[] field_mb;
    static String field_hb;
    private TransitionPhase field_lb;
    static int field_ab;
    private int field_db;
    private int field_Z;
    private OpacityWidget field_bb;

    final void onResizeComplete(int param0) {
        if (this.field_lb == ViewportController.field_a) {
          return;
        }
        this.field_lb = ModelMergeHelpers.field_f;
        this.field_X = 0;
        this.installContent((byte) -94, this.field_eb);
        this.field_bb.field_N = 0;
        if (param0 == -7718) {
          this.field_eb = null;
          return;
        }
    }

    boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_bb == null) {
            return false;
          }
          if (98 == param0) {
            this.field_bb.focusNext(param3, -384169950);
          }
          if (param0 == 99) {
            this.field_bb.focusNext(param3, -384169950);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ml.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean tickLayerAndCheckHidden(int param0) {
        int fieldTemp$0 = 0;
        int var3 = TetraLink.field_J;
        if (param0 != -1) {
          return false;
        }
        if (this.field_lb == null) {
          return super.tickLayerAndCheckHidden(-1);
        }
        if (this.field_lb == ViewportController.field_a) {
          fieldTemp$0 = this.field_X + 1;
          this.field_X = this.field_X + 1;
          if (this.field_Y != fieldTemp$0) {
            this.field_bb.field_N = 256 - (this.field_X << 8) / this.field_Y;
            return super.tickLayerAndCheckHidden(-1);
          }
          this.field_lb = ScreenDrawHelpers.field_d;
          this.resizeDialog(true, this.field_gb, 12 + this.field_eb.field_F, this.field_Z + (12 + this.field_eb.field_u));
          this.field_X = 0;
          this.field_bb.field_N = 0;
          return super.tickLayerAndCheckHidden(-1);
        }
        if (this.field_lb != ModelMergeHelpers.field_f) {
          return super.tickLayerAndCheckHidden(-1);
        }
        int fieldTemp$1 = this.field_X + 1;
        this.field_X = this.field_X + 1;
        if (this.field_db != fieldTemp$1) {
          this.field_bb.field_N = (this.field_X << 8) / this.field_db;
          return super.tickLayerAndCheckHidden(-1);
        }
        this.field_bb.field_N = 256;
        this.field_lb = null;
        return super.tickLayerAndCheckHidden(-1);
    }

    ContentTransitionDialog(WidgetContainer param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, param1.field_F + 12, param1.field_u + (param2 + 12));
        try {
          this.field_Z = param2;
          this.field_db = param3;
          this.field_Y = param3;
          this.field_gb = param4;
          this.installContent((byte) 90, param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void resetJs5Errors(int param0) {
        Renderable.field_e.field_h = param0;
        Renderable.field_e.field_d = 0;
    }

    private final void installContent(byte param0, UiWidget param1) {
        try {
          if (this.field_bb != null) {
            this.field_bb.unlink(false);
          }
          int var3_int = -11 % ((-4 - param0) / 48);
          if (param1 == null) {
            this.field_bb = new OpacityWidget();
          } else {
            param1.setBounds(param1.field_u, this.field_Z + 6, 65, 6, param1.field_F);
            this.field_bb = new OpacityWidget(param1);
          }
          this.addChild(this.field_bb, 10);
          this.field_eb = null;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ml.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isFullyFadedOut(int param0) {
        if (param0 == 652390224) {
          this.finishTransition(true);
          return super.isFullyFadedOut(652390224);
        }
        ContentTransitionDialog.resetJs5Errors(-30);
        this.finishTransition(true);
        return super.isFullyFadedOut(652390224);
    }

    public static void releaseStatics(byte param0) {
        field_ib = null;
        field_hb = null;
        if (param0 == -38) {
          field_fb = null;
          field_mb = null;
          field_kb = null;
          field_cb = null;
          return;
        }
        field_ab = -32;
        field_fb = null;
        field_mb = null;
        field_kb = null;
        field_cb = null;
    }

    void transitionToContent(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_eb = param0;
          if (ScreenDrawHelpers.field_d != this.field_lb) {
            if (this.field_lb != ViewportController.field_a) {
              this.field_lb = ViewportController.field_a;
              this.field_X = 0;
            }
          } else {
            this.resizeDialog(true, this.field_gb, this.field_eb.field_F + 12, 12 + this.field_Z + this.field_eb.field_u);
            this.field_X = 0;
          }
          if (param1 == -27667) {
            return;
          }
          ContentTransitionDialog.releaseStatics((byte) -4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ml.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void finishTransition(boolean param0) {
        if (this.field_lb != null) {
          if (this.field_lb != ModelMergeHelpers.field_f) {
            this.centerOnScreen(12 + this.field_eb.field_F, (byte) 96, 12 - (-this.field_Z - this.field_eb.field_u));
            this.installContent((byte) -127, this.field_eb);
          }
          this.field_bb.field_N = 256;
          this.field_lb = null;
        }
        super.finishTransition(param0);
    }

    static {
        field_cb = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_kb = "Loading animations";
        field_ib = new int[4];
        field_hb = "Reload game";
    }
}
