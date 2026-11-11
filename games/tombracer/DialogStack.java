/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogStack extends SingleChildWidget {
    static int[] field_z;
    private IntrusiveDeque field_y;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          field_z = (int[]) null;
          field_z = null;
          return;
        }
        field_z = null;
    }

    final void pruneFadedDialogs(byte param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_y);
        var3 = (FadingDialog) (var2.first(true));
        if (param0 < -105) {
          while (var3 != null) {
            if (var3.updateFade(127)) {
              var3.unlink(71);
            }
            var3 = (FadingDialog) (var2.next(-1));
          }
        } else {
          this.pruneFadedDialogs((byte) 58);
          while (var3 != null) {
            if (var3.updateFade(127)) {
              var3.unlink(71);
            }
            var3 = (FadingDialog) (var2.next(-1));
          }
        }
        this.child = (UiWidget) ((Object) this.getTopVisibleDialog((byte) -58));
    }

    final int maxVisibleDialogWidth(int param0) {
        IntrusiveDequeCursor var2;
        int var3;
        FadingDialog var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_y);
        var3 = -2147483648;
        var4 = (FadingDialog) (var2.first(true));
        while (var4 != null) {
          if (var4.field_B) {
            if (var3 >= var4.field_m) {
              var4 = (FadingDialog) (var2.next(-1));
              continue;
            }
            var3 = var4.field_m;
          }
          var4 = (FadingDialog) (var2.next(-1));
        }
        if (param0 < -72) {
          return var3;
        }
        field_z = (int[]) null;
        return var3;
    }

    final static void a(boolean param0, boolean param1) {
        if (null == era.field_d) {
          if (!param1) {
            field_z = (int[]) null;
            return;
          }
          return;
        }
        if (!era.field_d.a(param0, 94)) {
          if (!param1) {
            field_z = (int[]) null;
            return;
          }
          return;
        }
        era.field_d = null;
        if (!param1) {
          field_z = (int[]) null;
          return;
        }
    }

    final void pruneHiddenDialogs(int param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_y);
        var3 = (FadingDialog) (var2.first(true));
        if (param0 == -1) {
          while (var3 != null) {
            if (var3.snapFade((byte) -115)) {
              var3.unlink(param0 ^ -111);
            }
            var3 = (FadingDialog) (var2.next(-1));
          }
        } else {
          this.topDialogHeight(true);
          while (var3 != null) {
            if (var3.snapFade((byte) -115)) {
              var3.unlink(param0 ^ -111);
            }
            var3 = (FadingDialog) (var2.next(-1));
          }
        }
    }

    final FadingDialog getTopVisibleDialog(byte param0) {
        int var2;
        IntrusiveDequeCursor var3;
        FadingDialog var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = -31 % ((6 - param0) / 61);
        var3 = new IntrusiveDequeCursor(this.field_y);
        var4 = (FadingDialog) (var3.first(true));
        while (var4 != null) {
          if (var4.field_B) {
            return var4;
          }
          var4 = (FadingDialog) (var3.next(-1));
        }
        return null;
    }

    final void renderLayer(int param0, int param1, int param2, int param3) {
        int var7 = TombRacer.field_G ? 1 : 0;
        if (this.field_r != null) {
          this.field_r.paintWidget((UiWidget) (this), param0, 16777215, param1, true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_y);
        UiWidget var6 = (UiWidget) (var5.last((byte) 71));
        while (var6 != null) {
          var6.renderLayer(param0 + this.field_i, this.field_n + param1, 0, param3);
          var6 = (UiWidget) (var5.previous(param2 + 42));
        }
        if (param2 == 0) {
          return;
        }
        field_z = (int[]) null;
    }

    final int maxVisibleDialogHeight(int param0) {
        IntrusiveDequeCursor var2;
        int var3;
        FadingDialog var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_y);
        var3 = param0;
        var4 = (FadingDialog) (var2.first(true));
        while (var4 != null) {
          if (var4.field_B) {
            if (var4.field_p <= var3) {
              var4 = (FadingDialog) (var2.next(-1));
              continue;
            }
            var3 = var4.field_p;
          }
          var4 = (FadingDialog) (var2.next(-1));
        }
        return var3;
    }

    final UiWidget getFocusedChild(boolean param0) {
        IntrusiveDequeCursor var2;
        Object var3;
        FadingDialog var3_ref;
        int var4;
        IntrusiveDequeCursor stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        IntrusiveDequeCursor stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        IntrusiveDequeCursor var2Lifetime1;
        FadingDialog var3_refLifetime1;
        var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var2 = new IntrusiveDequeCursor(this.field_y);
          stackIn_13_0 = var2;
          stackIn_14_1 = (param0) ? false : true;
          var3_ref = (FadingDialog) (((IntrusiveDequeCursor) (Object) stackIn_13_0).first(stackIn_14_1));
          while (var3_ref != null) {
            if (var3_ref.field_B) {
              return var3_ref.getFocusedChild((byte) 52);
            }
            var3_ref = (FadingDialog) (var2.next(-1));
          }
          return null;
        }
        this.topDialogHeight(false);
        var2Lifetime1 = new IntrusiveDequeCursor(this.field_y);
        stackIn_3_0 = var2Lifetime1;
        stackIn_4_1 = (param0) ? false : true;
        var3_refLifetime1 = (FadingDialog) (((IntrusiveDequeCursor) (Object) stackIn_3_0).first(stackIn_4_1));
        while (var3_refLifetime1 != null) {
          if (var3_refLifetime1.field_B) {
            return var3_refLifetime1.getFocusedChild((byte) 52);
          }
          var3_refLifetime1 = (FadingDialog) (var2Lifetime1.next(-1));
        }
        return null;
    }

    final static BinaryBitmapFont loadBinaryFont(byte param0, String param1, ResourceArchive param2, String param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.getGroupId(param3, -7768);
          var6 = param2.getFileId(true, param1, var5_int);
          if (param0 < 110) {
            field_z = (int[]) null;
          }
          stackIn_3_0 = aca.a(param4, var5_int, param2, (byte) -110, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("jta.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void pushDialog(UiWidget param0, int param1) {
        FadingDialog var3 = null;
        if (!(param0 instanceof FadingDialog)) {
          throw new IllegalArgumentException();
        }
        if (param1 <= 81) {
          return;
        }
        try {
          var3 = (FadingDialog) (param0);
          this.field_y.addFirst((byte) 125, (IntrusiveNode) (var3));
          var3.field_B = true;
          var3.requestKeyboardFocus((UiWidget) (this), false);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "jta.UA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void hideAllDialogs(boolean param0) {
        int var4 = TombRacer.field_G ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_y);
        FadingDialog var3 = (FadingDialog) (var2.first(param0));
        while (var3 != null) {
          var3.field_B = false;
          var3 = (FadingDialog) (var2.next(-1));
        }
        if (param0) {
          this.child = null;
          return;
        }
    }

    final int topDialogHeight(boolean param0) {
        int var2 = 0;
        FadingDialog var3 = null;
        FadingDialog var3Lifetime1;
        int var2Lifetime1;
        if (param0) {
          var2 = -1;
          var3 = this.getTopVisibleDialog((byte) -87);
          if (var3 != null) {
            var2 = var3.field_p;
          }
          return var2;
        }
        this.field_y = (IntrusiveDeque) null;
        var2Lifetime1 = -1;
        var3Lifetime1 = this.getTopVisibleDialog((byte) -87);
        if (var3Lifetime1 != null) {
          var2Lifetime1 = var3Lifetime1.field_p;
        }
        return var2Lifetime1;
    }

    public DialogStack() {
        super(0, 0, bb.field_m, qba.field_a, (WidgetPainter) null, (WidgetListener) null);
        this.field_y = new IntrusiveDeque();
    }

    final int topDialogWidth(int param0) {
        int var2 = param0;
        FadingDialog var3 = this.getTopVisibleDialog((byte) -79);
        if (var3 != null) {
          var2 = var3.field_m;
        }
        return var2;
    }

    static {
        field_z = new int[]{0, 21};
    }
}
