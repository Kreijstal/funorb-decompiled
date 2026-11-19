/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayer extends SingleChildWidget {
    static String field_J;
    private IntrusiveDeque field_K;
    static long field_H;
    static ge field_M;
    static sh field_F;
    static tk field_G;
    static int[] field_N;
    static int field_I;
    static int field_L;

    final UiWidget a(byte param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = new IntrusiveDequeCursor(this.field_K);
        if (param0 < 120) {
          field_L = 15;
        }
        var3 = (FadingDialog) (var2.c((byte) -120));
        while (var3 != null) {
          if (var3.field_F) {
            return var3.f((byte) 119);
          }
          var3 = (FadingDialog) (var2.next((byte) -104));
        }
        return null;
    }

    final FadingDialog i(byte param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = new IntrusiveDequeCursor(this.field_K);
        var3 = (FadingDialog) (var2.c((byte) 89));
        if (param0 >= -74) {
          this.field_K = (IntrusiveDeque) null;
        }
        while (var3 != null) {
          if (var3.field_F) {
            return var3;
          }
          var3 = (FadingDialog) (var2.next((byte) -104));
        }
        return null;
    }

    final void f(byte param0) {
        int var5 = HoldTheLine.field_D;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_K);
        int var4 = -22 % ((90 - param0) / 36);
        FadingDialog var3 = (FadingDialog) (var2.c((byte) 30));
        while (var3 != null) {
          if (var3.a(true)) {
            var3.unlink(0);
          }
          var3 = (FadingDialog) (var2.next((byte) -104));
        }
    }

    public DialogLayer() {
        super(0, 0, EmailAddressValidator.field_i, pe.field_e, (WidgetRenderer) null, (WidgetListener) null);
        this.field_K = new IntrusiveDeque();
    }

    final static void h(byte param0) {
        TutorialAction.field_b = new AccountCreationForm();
        sm.field_c.a((UiWidget) (TutorialAction.field_b), (byte) -99);
        int var1 = 95 / ((param0 + 54) / 53);
    }

    final void a(boolean param0) {
        int var4 = HoldTheLine.field_D;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_K);
        FadingDialog var3 = (FadingDialog) (var2.c((byte) -2));
        while (var3 != null) {
          var3.field_F = false;
          var3 = (FadingDialog) (var2.next((byte) -104));
        }
        this.child = null;
        if (param0) {
          field_H = -70L;
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param0 != -9532) {
          DialogLayer.clearSharedReferences(true);
        }
        if (null != this.renderer) {
          this.renderer.drawWidget(true, param2, -115, (UiWidget) (this), param1);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_K);
        UiWidget var6 = (UiWidget) (var5.last(8115));
        while (var6 != null) {
          var6.drawLayer(param0 + 0, this.y + param1, param2 + this.x, param3);
          var6 = (UiWidget) (var5.a(false));
        }
    }

    final void a(UiWidget param0, boolean param1) {
        FadingDialog var3 = null;
        try {
          if (!(param0 instanceof FadingDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (FadingDialog) (param0);
          this.field_K.addFirst(var3, param1);
          var3.field_F = true;
          var3.requestFocus((UiWidget) (this), -25823);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "qj.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_N = null;
        field_F = null;
        field_G = null;
        if (!param0) {
          field_H = 58L;
        }
        field_M = null;
        field_J = null;
    }

    final static void h(int param0) {
        pc.field_b = StandardContentTransitionDialog.n(-49);
        ka.field_b = new DialogLayer();
        TutorialAction.a((byte) -109, true, true);
        if (param0 != -1) {
          DialogLayer.clearSharedReferences(true);
        }
    }

    final void g(byte param0) {
        int var4 = HoldTheLine.field_D;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_K);
        if (param0 != -59) {
          UiWidget var5 = (UiWidget) null;
          this.a((UiWidget) null, false);
        }
        FadingDialog var3 = (FadingDialog) (var2.c((byte) 63));
        while (var3 != null) {
          if (var3.g((byte) 39)) {
            var3.unlink(0);
          }
          var3 = (FadingDialog) (var2.next((byte) -104));
        }
        this.child = (UiWidget) ((Object) this.i((byte) -116));
    }

    static {
        field_J = "Retry";
        field_M = new ge();
        field_F = new sh();
        field_N = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_I = -1;
        field_L = 0;
    }
}
