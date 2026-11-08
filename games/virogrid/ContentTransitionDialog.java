/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableDialog {
    private int field_lb;
    static int[][] field_db;
    static int[] field_bb;
    private int field_jb;
    static String playernameHotseat1;
    static String field_mb;
    private int field_cb;
    private int field_hb;
    private int field_nb;
    private UiWidget field_ib;
    private LoginRsaKey field_fb;
    static String field_gb;
    private FadeLayer field_kb;

    boolean tickLayerAndCheckHidden(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (param0 == 3) {
          if (null == this.field_fb) {
            return super.tickLayerAndCheckHidden(3);
          }
          if (Js5Transport.field_e == this.field_fb) {
            fieldTemp$0 = this.field_jb + 1;
            this.field_jb = this.field_jb + 1;
            if (fieldTemp$0 != this.field_cb) {
              this.field_kb.field_H = 256 - (this.field_jb << 8) / this.field_cb;
              return super.tickLayerAndCheckHidden(3);
            }
            this.field_fb = AudioPumpThread.field_e;
            this.startResize(this.field_lb + (12 + this.field_ib.field_m), param0 ^ 3, this.field_nb, 12 + this.field_ib.field_g);
            this.field_kb.field_H = 0;
            this.field_jb = 0;
            return super.tickLayerAndCheckHidden(3);
          }
          if (EmailDomainValidationHelpers.field_b != this.field_fb) {
            return super.tickLayerAndCheckHidden(3);
          }
          fieldTemp$1 = this.field_jb + 1;
          this.field_jb = this.field_jb + 1;
          if (this.field_hb == fieldTemp$1) {
            this.field_fb = null;
            this.field_kb.field_H = 256;
            return super.tickLayerAndCheckHidden(3);
          }
          this.field_kb.field_H = (this.field_jb << 8) / this.field_hb;
          return super.tickLayerAndCheckHidden(3);
        }
        this.field_lb = -93;
        if (null == this.field_fb) {
          return super.tickLayerAndCheckHidden(3);
        }
        if (Js5Transport.field_e == this.field_fb) {
          fieldTemp$2 = this.field_jb + 1;
          this.field_jb = this.field_jb + 1;
          if (fieldTemp$2 != this.field_cb) {
            this.field_kb.field_H = 256 - (this.field_jb << 8) / this.field_cb;
            return super.tickLayerAndCheckHidden(3);
          }
          this.field_fb = AudioPumpThread.field_e;
          this.startResize(this.field_lb + (12 + this.field_ib.field_m), param0 ^ 3, this.field_nb, 12 + this.field_ib.field_g);
          this.field_kb.field_H = 0;
          this.field_jb = 0;
          return super.tickLayerAndCheckHidden(3);
        }
        if (EmailDomainValidationHelpers.field_b != this.field_fb) {
          return super.tickLayerAndCheckHidden(3);
        }
        int fieldTemp$3 = this.field_jb + 1;
        this.field_jb = this.field_jb + 1;
        if (this.field_hb == fieldTemp$3) {
          this.field_fb = null;
          this.field_kb.field_H = 256;
          return super.tickLayerAndCheckHidden(3);
        }
        this.field_kb.field_H = (this.field_jb << 8) / this.field_hb;
        return super.tickLayerAndCheckHidden(3);
    }

    void transitionToContent(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ib = param0;
          if (this.field_fb != AudioPumpThread.field_e) {
            if (this.field_fb != Js5Transport.field_e) {
              this.field_jb = 0;
              this.field_fb = Js5Transport.field_e;
            }
          } else {
            this.startResize(this.field_ib.field_m + (12 + this.field_lb), param1 ^ -53, this.field_nb, this.field_ib.field_g + 12);
            this.field_jb = 0;
          }
          if (param1 == -53) {
            return;
          }
          var4 = (UiWidget) null;
          this.handleKeyInput((UiWidget) null, '￈', 62, -58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mb.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String charToString(boolean param0, char param1) {
        if (!param0) {
          ContentTransitionDialog.getApplet((byte) -40);
          return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final void finishTransition(int param0) {
        if (null == this.field_fb) {
          super.finishTransition(param0);
          return;
        }
        if (this.field_fb != EmailDomainValidationHelpers.field_b) {
          this.setCenteredSize(this.field_ib.field_m + 12 + this.field_lb, 120, 12 + this.field_ib.field_g);
          this.installContent(6, this.field_ib);
        } else {
          this.field_kb.field_H = 256;
          this.field_fb = null;
          super.finishTransition(param0);
          return;
        }
        this.field_kb.field_H = 256;
        this.field_fb = null;
        super.finishTransition(param0);
    }

    final void onResizeComplete(int param0) {
        if (this.field_fb == Js5Transport.field_e) {
          return;
        }
        this.field_jb = 0;
        this.field_fb = EmailDomainValidationHelpers.field_b;
        this.installContent(6, this.field_ib);
        if (param0 > 43) {
          this.field_kb.field_H = 0;
          this.field_ib = null;
          return;
        }
    }

    private final void installContent(int param0, UiWidget param1) {
        if (param0 != 6) {
          return;
        }
        try {
          if (this.field_kb != null) {
            this.field_kb.unlink(false);
          }
          if (param1 != null) {
            param1.setBounds(param1.field_m, true, 6 + this.field_lb, 6, param1.field_g);
            this.field_kb = new FadeLayer(param1);
          } else {
            this.field_kb = new FadeLayer();
          }
          this.addChild((UiWidget) (this.field_kb), (byte) -78);
          this.field_ib = null;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "mb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ContentTransitionDialog(WidgetLayerStack param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param2 + (12 + param1.field_m));
        try {
          this.field_hb = param3;
          this.field_cb = param3;
          this.field_lb = param2;
          this.field_nb = param4;
          this.installContent(6, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "mb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_bb = null;
        field_gb = null;
        field_mb = null;
        if (param0 >= 118) {
          playernameHotseat1 = null;
          field_db = (int[][]) null;
          return;
        }
        field_db = (int[][]) null;
        playernameHotseat1 = null;
        field_db = (int[][]) null;
    }

    final static void drawThreeSliceStrip(int param0, byte param1, Sprite[] param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          if (param2 != null &&
            0 < param0) {
            var5_int = param2[0].field_u;
            var6 = param2[2].field_u;
            var7 = param2[1].field_u;
            param2[0].drawTransparent(param3, param4);
            param2[2].drawTransparent(-var6 + param0 + param3, param4);
            Rasterizer.saveClip(NetworkGameClient.field_m);
            Rasterizer.intersectClip(param3 + var5_int, param4, -var6 + param0 + param3, param2[1].field_z + param4);
            if (param1 != -117) {
              return;
            }
            var8 = param3 + var5_int;
            var9 = param0 + (param3 - var6);
            for (param3 = var8; var9 > param3; param3 = param3 + var7) {
              param2[1].drawTransparent(param3, param4);
            }
            Rasterizer.restoreClip(NetworkGameClient.field_m);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mb.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void readLocalPlayerName(byte param0) {
        DebouncedValidator.field_d = ProgressMessageDialog.field_qb.readString(-118);
        if (param0 < 42) {
          return;
        }
        CharSequence var2 = (CharSequence) ((Object) DebouncedValidator.field_d);
        MidiNote.field_n = DisplayNameHelpers.normalizeDisplayName(var2, true);
    }

    final static java.applet.Applet getApplet(byte param0) {
        int var1 = 114 / ((param0 + 37) / 43);
        if (ContextMenuHelpers.field_a != null) {
          return ContextMenuHelpers.field_a;
        }
        return (java.applet.Applet) ((Object) WidgetStyleLayer.field_n);
    }

    boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 32 % ((-75 - param3) / 36);
          if (super.handleKeyInput(param0, param1, param2, -117)) {
            return true;
          }
          if (this.field_kb == null) {
            return false;
          }
          if (param2 == 98) {
            this.field_kb.focusNext(param0, -8515);
          }
          if (param2 == 99) {
            this.field_kb.focusNext(param0, -8515);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("mb.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean finishFadeAndCheckHidden(byte param0) {
        this.finishTransition(-4236);
        int var2 = 32 % ((param0 - 50) / 33);
        return super.finishFadeAndCheckHidden((byte) -71);
    }

    static {
        playernameHotseat1 = "Blue";
        field_gb = "Please enter your age in years";
        field_mb = "Create a free account to start using this feature";
    }
}
