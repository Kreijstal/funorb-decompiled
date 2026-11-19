/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayer extends SingleChildWidget {
    private IntrusiveDeque field_I;
    static String field_H;
    static boolean field_J;
    static ArchiveCatalog field_L;
    static int field_K;
    static String field_G;

    public DialogLayer() {
        super(0, 0, EmailDomainHelpers.field_a, LabeledField.field_K, (WidgetRenderer) null, (WidgetListener) null);
        this.field_I = new IntrusiveDeque();
    }

    final UiWidget getFocusedChild(byte param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = wizardrun.field_H;
        var2 = new IntrusiveDequeCursor(this.field_I);
        var3 = (FadingDialog) (var2.first((byte) 31));
        if (param0 >= -29) {
          this.getFocusedChild((byte) -88);
        }
        while (var3 != null) {
          if (var3.field_H) {
            return var3.d(-16);
          }
          var3 = (FadingDialog) (var2.next(35));
        }
        return null;
    }

    final void g(int param0) {
        int var4 = wizardrun.field_H;
        if (param0 != -5903) {
          this.drawLayer(86, 9, -39, -76);
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_I);
        FadingDialog var3 = (FadingDialog) (var2.first((byte) 31));
        while (var3 != null) {
          if (var3.a(16)) {
            var3.unlink(false);
          }
          var3 = (FadingDialog) (var2.next(35));
        }
    }

    final void d(boolean param0) {
        int var4 = wizardrun.field_H;
        if (param0) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_I);
        FadingDialog var3 = (FadingDialog) (var2.first((byte) 31));
        while (var3 != null) {
          var3.field_H = false;
          var3 = (FadingDialog) (var2.next(35));
        }
        this.field_F = null;
    }

    final FadingDialog f(int param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = wizardrun.field_H;
        var2 = new IntrusiveDequeCursor(this.field_I);
        if (param0 != 0) {
          return (FadingDialog) null;
        }
        var3 = (FadingDialog) (var2.first((byte) 31));
        while (var3 != null) {
          if (var3.field_H) {
            return var3;
          }
          var3 = (FadingDialog) (var2.next(35));
        }
        return null;
    }

    final void b(UiWidget param0, byte param1) {
        FadingDialog var3 = null;
        try {
          if (!(param0 instanceof FadingDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingDialog) (param0);
          if (param1 < 50) {
            this.f(95);
          }
          this.field_I.addFirst(var3, -5441);
          var3.field_H = true;
          var3.requestFocus((UiWidget) (this), 8);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "wi.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = wizardrun.field_H;
        if (this.renderer != null) {
          this.renderer.drawWidget(param0, param3, (UiWidget) (this), true, true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_I);
        if (param1 != 0) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.last((byte) 69));
        while (var6 != null) {
          var6.drawLayer(this.x + param0, 0, param2, param3 + this.y);
          var6 = (UiWidget) (var5.previous(true));
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 80) {
          return;
        }
        field_H = null;
        field_G = null;
        field_L = null;
    }

    final void g(byte param0) {
        int var4 = wizardrun.field_H;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_I);
        FadingDialog var3 = (FadingDialog) (var2.first((byte) 31));
        while (var3 != null) {
          if (var3.g(1)) {
            var3.unlink(false);
          }
          var3 = (FadingDialog) (var2.next(35));
        }
        if (param0 <= 102) {
          field_L = (ArchiveCatalog) null;
        }
        this.field_F = (UiWidget) ((Object) this.f(0));
    }

    static {
        field_H = "The Ice Mountain";
        field_G = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
