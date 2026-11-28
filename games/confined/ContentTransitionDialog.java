/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalDialog {
    private int field_hb;
    static String field_kb;
    private rf field_ib;
    private int field_ob;
    private int field_mb;
    private AlphaWidgetContainer field_lb;
    static String field_pb;
    private int field_qb;
    static int[] field_rb;
    private UiWidget field_nb;
    private int field_jb;

    boolean handleKey(UiWidget param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 28 / ((47 - param1) / 43);
          if (super.handleKey(param0, (byte) 115, param2, param3)) {
            return true;
          }
          if (this.field_lb == null) {
            return false;
          }
          if (param2 == 98) {
            this.field_lb.takeFocus(param0, 418);
          }
          if (param2 == 99) {
            this.field_lb.takeFocus(param0, 418);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("sj.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void installContent(boolean param0, UiWidget param1) {
        try {
          if (null != this.field_lb) {
            this.field_lb.unlink(true);
          }
          if (!param0) {
            this.field_mb = 112;
          }
          if (param1 != null) {
            param1.setBounds(-110, param1.field_F, 6 + this.field_ob, param1.field_z, 6);
            this.field_lb = new AlphaWidgetContainer(param1);
          } else {
            this.field_lb = new AlphaWidgetContainer();
          }
          this.addChild(this.field_lb, 10);
          this.field_nb = null;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "sj.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void finishResize(int param0) {
        if (this.field_ib != null) {
          if (PowerUpPickup.field_S != this.field_ib) {
            this.setCenteredSize(-41, this.field_nb.field_z + this.field_ob + 12, this.field_nb.field_F + 12);
            this.installContent(true, this.field_nb);
          }
          this.field_lb.field_K = 256;
          this.field_ib = null;
        }
        if (param0 > 53) {
          super.finishResize(61);
          return;
        }
        this.snapDialogAnimation(-110);
        super.finishResize(61);
    }

    ContentTransitionDialog(ModalDialogHost param0, UiWidget param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_F, param1.field_z + 12 + param2);
        try {
          this.field_hb = param4;
          this.field_ob = param2;
          this.field_qb = param3;
          this.field_jb = param3;
          this.installContent(true, param1);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean advanceDialogAnimation(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        if (null != this.field_ib) {
          if (this.field_ib == RichTextLayout.field_s) {
            fieldTemp$0 = this.field_mb + 1;
            this.field_mb = this.field_mb + 1;
            if (this.field_jb != fieldTemp$0) {
              this.field_lb.field_K = -((this.field_mb << 8) / this.field_jb) + 256;
              if (param0 != -6) {
                field_rb = (int[]) null;
                return super.advanceDialogAnimation(param0 ^ 0);
              }
              return super.advanceDialogAnimation(param0 ^ 0);
            }
            this.field_ib = TextLayout.field_a;
            this.resizeDialog(this.field_nb.field_z + (this.field_ob + 12), this.field_hb, 6, this.field_nb.field_F + 12);
            this.field_lb.field_K = 0;
            this.field_mb = 0;
            if (param0 != -6) {
              field_rb = (int[]) null;
              return super.advanceDialogAnimation(param0 ^ 0);
            }
            return super.advanceDialogAnimation(param0 ^ 0);
          }
          if (this.field_ib != PowerUpPickup.field_S) {
            if (param0 == -6) {
              return super.advanceDialogAnimation(param0 ^ 0);
            }
            field_rb = (int[]) null;
            return super.advanceDialogAnimation(param0 ^ 0);
          }
          fieldTemp$1 = this.field_mb + 1;
          this.field_mb = this.field_mb + 1;
          if (this.field_qb == fieldTemp$1) {
            this.field_lb.field_K = 256;
            this.field_ib = null;
            if (param0 == -6) {
              return super.advanceDialogAnimation(param0 ^ 0);
            }
            field_rb = (int[]) null;
            return super.advanceDialogAnimation(param0 ^ 0);
          }
          this.field_lb.field_K = (this.field_mb << 8) / this.field_qb;
          if (param0 == -6) {
            return super.advanceDialogAnimation(param0 ^ 0);
          }
          field_rb = (int[]) null;
          return super.advanceDialogAnimation(param0 ^ 0);
        }
        if (param0 == -6) {
          return super.advanceDialogAnimation(param0 ^ 0);
        }
        field_rb = (int[]) null;
        return super.advanceDialogAnimation(param0 ^ 0);
    }

    public static void releaseDeclaredStaticReferences(byte param0) {
        field_kb = null;
        field_pb = null;
        if (param0 <= 6) {
          ContentTransitionDialog.releaseDeclaredStaticReferences((byte) -55);
          field_rb = null;
          return;
        }
        field_rb = null;
    }

    final void resizeCompleted(byte param0) {
        if (this.field_ib == RichTextLayout.field_s) {
          return;
        }
        this.field_ib = PowerUpPickup.field_S;
        this.field_mb = 0;
        this.installContent(true, this.field_nb);
        if (param0 <= -6) {
          this.field_nb = null;
          this.field_lb.field_K = 0;
          return;
        }
        this.resizeCompleted((byte) -58);
        this.field_nb = null;
        this.field_lb.field_K = 0;
    }

    final boolean snapDialogAnimation(int param0) {
        if (param0 <= -35) {
          this.finishResize(107);
          return super.snapDialogAnimation(-97);
        }
        field_rb = (int[]) null;
        this.finishResize(107);
        return super.snapDialogAnimation(-97);
    }

    void replaceContent(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_nb = param0;
          if (this.field_ib != TextLayout.field_a) {
            if (this.field_ib != RichTextLayout.field_s) {
              this.field_ib = RichTextLayout.field_s;
              this.field_mb = 0;
            }
          } else {
            this.resizeDialog(12 - (-this.field_ob - this.field_nb.field_z), this.field_hb, 6, 12 + this.field_nb.field_F);
            this.field_mb = 0;
          }
          if (param1 == -72) {
            return;
          }
          this.finishResize(47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("sj.HA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_kb = "Logging in...";
        field_pb = "HARD";
    }
}
