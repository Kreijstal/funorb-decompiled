/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayer extends SingleChildWidget {
    private static int[] field_B;
    private IntrusiveDeque dialogs;

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        int var7 = Sumoblitz.field_L ? 1 : 0;
        if (this.renderer != null) {
          this.renderer.renderWidget((UiWidget) (this), parentY, 5592405, true, parentX);
        }
        if (guard >= -35) {
          this.dialogs = (IntrusiveDeque) null;
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.dialogs);
        UiWidget var6 = (UiWidget) (var5.last((byte) -119));
        while (var6 != null) {
          var6.renderLayer(this.x + parentX, parentY + this.y, (byte) -105, layer);
          var6 = (UiWidget) (var5.previous((byte) 87));
        }
    }

    final void advanceDialogAnimations(int guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard >= -63) {
          this.advanceDialogAnimations(45);
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        ModalDialog var3 = (ModalDialog) (var2.first((byte) -80));
        while (var3 != null) {
          if (var3.advanceAnimation(-28778)) {
            var3.unlink(false);
          }
          var3 = (ModalDialog) (var2.next(0));
        }
        this.child = (UiWidget) ((Object) this.topOpenDialog((byte) 54));
    }

    final void finishDialogAnimations(boolean guard) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        ModalDialog var3 = (ModalDialog) (var2.first((byte) -80));
        while (var3 != null) {
          if (var3.finishAnimation(0)) {
            var3.unlink(false);
          }
          var3 = (ModalDialog) (var2.next(0));
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 128) {
          DialogLayer.releaseStatics(-75);
        }
        field_B = null;
    }

    final ModalDialog topOpenDialog(byte guard) {
        IntrusiveDequeCursor var2;
        ModalDialog var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.dialogs);
        var3 = (ModalDialog) (var2.first((byte) -80));
        if (guard != 54) {
          this.dialogs = (IntrusiveDeque) null;
        }
        while (var3 != null) {
          if (var3.open) {
            return var3;
          }
          var3 = (ModalDialog) (var2.next(guard - 54));
        }
        return null;
    }

    public DialogLayer() {
        super(0, 0, lj.field_b, LoginForm.field_O, (WidgetRenderer) null, (WidgetListener) null);
        this.dialogs = new IntrusiveDeque();
    }

    final UiWidget focusedChild(int guard) {
        IntrusiveDequeCursor var2;
        ModalDialog var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 16777216) {
          field_B = (int[]) null;
        }
        var2 = new IntrusiveDequeCursor(this.dialogs);
        var3 = (ModalDialog) (var2.first((byte) -80));
        while (var3 != null) {
          if (var3.open) {
            return var3.focusedChild(36);
          }
          var3 = (ModalDialog) (var2.next(0));
        }
        return null;
    }

    final void pushDialog(byte guard, UiWidget dialog) {
        ModalDialog var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(dialog instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (dialog);
          this.dialogs.addFirst(var3, -10295);
          var3.open = true;
          var3.requestFocus((UiWidget) (this), (byte) 61);
          if (guard <= 90) {
            this.dialogs = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("dg.F(").append(guard).append(',');
          if (dialog == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void closeAllDialogs(byte guard) {
        int var5 = Sumoblitz.field_L ? 1 : 0;
        int var4 = 67 / ((35 - guard) / 49);
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.dialogs);
        ModalDialog var3 = (ModalDialog) (var2.first((byte) -80));
        while (var3 != null) {
          var3.open = false;
          var3 = (ModalDialog) (var2.next(0));
        }
        this.child = null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var0Lifetime1;
        int var0Lifetime2;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime2Lifetime1;
        field_B = new int[128];
        for (var0 = 0; 64 > var0; var0++) {
          var1 = 192 * var0 * var0 / 4096;
          var2 = var0 * var0 * (var0 * var0) * 128 / 16777216;
          var3 = var0 * var0 * var0 * 255 / 262144;
          field_B[var0] = var3 + ((var2 << 8) + (var1 << 16));
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 64; var0Lifetime1++) {
          var1Lifetime1 = 96 * var0Lifetime1 * var0Lifetime1 / 4096;
          var2Lifetime1 = 32 * var0Lifetime1 * var0Lifetime1 * var0Lifetime1 / 262144;
          var3Lifetime1 = var0Lifetime1 * var0Lifetime1 * 128 / 4096;
          field_B[-var0Lifetime1 + 127] = (var2Lifetime1 << 8) + (var1Lifetime1 << 16) + var3Lifetime1;
        }
        var0Lifetime2 = 16711935 & field_B[63];
        var1Lifetime2 = field_B[63] & 65280;
        for (var2Lifetime2 = 0; var2Lifetime2 < 2; var2Lifetime2++) {
          var3Lifetime2 = field_B[64 + var2Lifetime2];
          var4 = -(256 * var2Lifetime2 / 2) + 256;
          var5 = 16711935 & var3Lifetime2;
          var6 = 65280 & var3Lifetime2;
          var5 = var5 * (256 - var4);
          var6 = var6 * (256 - var4);
          var5 = var5 + var0Lifetime2 * var4;
          var6 = var6 + var1Lifetime2 * var4;
          var3Lifetime2Lifetime1 = (16711680 & var6 | -16711936 & var5) >>> 8;
          field_B[64 + var2Lifetime2] = var3Lifetime2Lifetime1;
        }
    }
}
