/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalDialog {
    private sq field_cb;
    private int field_eb;
    private int field_Y;
    private AlphaWidgetContainer field_bb;
    private UiWidget field_Z;
    static int field_db;
    private int field_ab;
    private int field_W;
    private int field_X;

    final boolean snapDialogAnimation(int param0) {
        this.finishResize((byte) -23);
        if (param0 != -1) {
          this.finishResize((byte) -90);
          return super.snapDialogAnimation(-1);
        }
        return super.snapDialogAnimation(-1);
    }

    final void resizeCompleted(byte param0) {
        if (this.field_cb == nh.field_m) {
          return;
        }
        if (param0 < -19) {
          this.field_cb = id.field_g;
          this.field_eb = 0;
          this.installContent(13693, this.field_Z);
          this.field_Z = null;
          this.field_bb.field_J = 0;
          return;
        }
        this.field_W = 26;
        this.field_cb = id.field_g;
        this.field_eb = 0;
        this.installContent(13693, this.field_Z);
        this.field_Z = null;
        this.field_bb.field_J = 0;
    }

    final static CoverageBitmapFont a(Archive param0, int param1, Archive param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        CoverageBitmapFont stackIn_2_0 = null;
        CoverageBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param0.getGroupIdByName((byte) 120, param3);
          if (param1 != 12) {
            stackIn_2_0 = (CoverageBitmapFont) null;
            return stackIn_2_0;
          }
          var6 = param0.getFileIdByName(var5_int, param4, 117);
          stackIn_4_0 = vg.a(var5_int, var6, param1 ^ -13, param0, param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rl.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_bb != null) {
            if (param2 == 98) {
              this.field_bb.takeFocus((byte) 116, param3);
            }
            if (99 == param2) {
              this.field_bb.takeFocus((byte) 116, param3);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("rl.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    boolean advanceDialogAnimation(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        UiWidget var4 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        UiWidget var4Lifetime1;
        UiWidget var4Lifetime2;
        UiWidget var4Lifetime3;
        UiWidget var4Lifetime4;
        if (this.field_cb != null) {
          if (nh.field_m == this.field_cb) {
            fieldTemp$0 = this.field_eb + 1;
            this.field_eb = this.field_eb + 1;
            if (fieldTemp$0 != this.field_Y) {
              this.field_bb.field_J = 256 - (this.field_eb << 8) / this.field_Y;
              if (param0 != 17) {
                var4 = (UiWidget) null;
                this.replaceContent(true, (UiWidget) null);
                return super.advanceDialogAnimation(17);
              }
              return super.advanceDialogAnimation(17);
            }
            this.field_cb = NodeHashTableIterator.field_f;
            this.resizeDialog(this.field_X, 12 + this.field_Z.width, this.field_W + 12 + this.field_Z.height, (byte) 118);
            this.field_eb = 0;
            this.field_bb.field_J = 0;
            if (param0 != 17) {
              var4 = (UiWidget) null;
              this.replaceContent(true, (UiWidget) null);
              return super.advanceDialogAnimation(17);
            }
            return super.advanceDialogAnimation(17);
          }
          if (this.field_cb != id.field_g) {
            if (param0 == 17) {
              return super.advanceDialogAnimation(17);
            }
            var4Lifetime2 = (UiWidget) null;
            this.replaceContent(true, (UiWidget) null);
            return super.advanceDialogAnimation(17);
          }
          fieldTemp$1 = this.field_eb + 1;
          this.field_eb = this.field_eb + 1;
          if (this.field_ab != fieldTemp$1) {
            this.field_bb.field_J = (this.field_eb << 8) / this.field_ab;
            if (param0 == 17) {
              return super.advanceDialogAnimation(17);
            }
            var4Lifetime3 = (UiWidget) null;
            this.replaceContent(true, (UiWidget) null);
            return super.advanceDialogAnimation(17);
          }
          this.field_cb = null;
          this.field_bb.field_J = 256;
          if (param0 == 17) {
            return super.advanceDialogAnimation(17);
          }
          var4Lifetime4 = (UiWidget) null;
          this.replaceContent(true, (UiWidget) null);
          return super.advanceDialogAnimation(17);
        }
        if (param0 == 17) {
          return super.advanceDialogAnimation(17);
        }
        var4Lifetime1 = (UiWidget) null;
        this.replaceContent(true, (UiWidget) null);
        return super.advanceDialogAnimation(17);
    }

    ContentTransitionDialog(ModalDialogHost param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.width, param1.height + (param2 + 12));
        try {
          this.field_X = param4;
          this.field_W = param2;
          this.field_ab = param3;
          this.field_Y = param3;
          this.installContent(13693, param1);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void installContent(int param0, UiWidget param1) {
        if (this.field_bb != null) {
          this.field_bb.unlink(2);
        }
        if (param1 == null) {
          this.field_bb = new AlphaWidgetContainer();
        } else {
          param1.setBounds(false, 6, this.field_W + 6, param1.height, param1.width);
          this.field_bb = new AlphaWidgetContainer(param1);
        }
        this.addChild((byte) -61, this.field_bb);
        if (param0 != 13693) {
          return;
        }
        try {
          this.field_Z = null;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "rl.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void replaceContent(boolean param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.finishResize((byte) 75);
          }
          this.field_Z = param1;
          if (NodeHashTableIterator.field_f == this.field_cb) {
            this.resizeDialog(this.field_X, 12 + this.field_Z.width, this.field_W + 12 + this.field_Z.height, (byte) 61);
            this.field_eb = 0;
            return;
          }
          if (nh.field_m == this.field_cb) {
            return;
          }
          this.field_eb = 0;
          this.field_cb = nh.field_m;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void finishResize(byte param0) {
        if (null == this.field_cb) {
          super.finishResize(param0);
          return;
        }
        if (id.field_g != this.field_cb) {
          this.setCenteredSize(-1535749535, this.field_Z.width + 12, 12 + this.field_W + this.field_Z.height);
          this.installContent(param0 + 13716, this.field_Z);
        } else {
          this.field_bb.field_J = 256;
          this.field_cb = null;
          super.finishResize(param0);
          return;
        }
        this.field_bb.field_J = 256;
        this.field_cb = null;
        super.finishResize(param0);
    }

    static {
        field_db = -1;
    }
}
