/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends WidgetWrapper {
    private IntrusiveDeque field_D;
    static IntrusiveDeque field_C;

    public rp() {
        super(0, 0, InvincibleAnimation.field_v, mi.field_k, (WidgetRenderer) null, (WidgetListener) null);
        this.field_D = new IntrusiveDeque();
    }

    final vf h(int param0) {
        IntrusiveDequeCursor var2;
        vf var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 != 0) {
          return (vf) null;
        }
        var2 = new IntrusiveDequeCursor(this.field_D);
        var3 = (vf) (var2.b((byte) 90));
        while (var3 != null) {
          if (var3.field_C) {
            return var3;
          }
          var3 = (vf) (var2.a((byte) 0));
        }
        return null;
    }

    final void i(int param0) {
        int var4 = BachelorFridge.field_y;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_D);
        vf var3 = (vf) (var2.b((byte) 44));
        while (var3 != null) {
          if (var3.a(param0 ^ -68)) {
            var3.unlink(false);
          }
          var3 = (vf) (var2.a((byte) 0));
        }
        this.child = (UiWidget) ((Object) this.h(param0));
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 104) {
          field_C = (IntrusiveDeque) null;
        }
        field_C = null;
    }

    final UiWidget d(byte param0) {
        IntrusiveDequeCursor var2;
        vf var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 < 38) {
          rp.releaseStatics((byte) -80);
        }
        var2 = new IntrusiveDequeCursor(this.field_D);
        var3 = (vf) (var2.b((byte) 107));
        while (var3 != null) {
          if (var3.field_C) {
            return var3.g(-102);
          }
          var3 = (vf) (var2.a((byte) 0));
        }
        return null;
    }

    final void draw(byte param0, int param1, int param2, int param3) {
        int var8 = BachelorFridge.field_y;
        int var5 = 70 / ((param0 + 20) / 54);
        if (null != this.renderer) {
          this.renderer.a(param3, (UiWidget) (this), 32679, param1, true);
        }
        IntrusiveDequeCursor var6 = new IntrusiveDequeCursor(this.field_D);
        UiWidget var7 = (UiWidget) (var6.c((byte) 126));
        while (var7 != null) {
          var7.draw((byte) -127, this.y + param1, param2, param3 + this.x);
          var7 = (UiWidget) (var6.d((byte) -124));
        }
    }

    final void f(byte param0) {
        int var4 = BachelorFridge.field_y;
        if (param0 != -66) {
          return;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_D);
        vf var3 = (vf) (var2.b((byte) -112));
        while (var3 != null) {
          var3.field_C = false;
          var3 = (vf) (var2.a((byte) 0));
        }
        this.child = null;
    }

    final void g(byte param0) {
        int var4 = BachelorFridge.field_y;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_D);
        if (param0 <= 126) {
          this.field_D = (IntrusiveDeque) null;
        }
        vf var3 = (vf) (var2.b((byte) 69));
        while (var3 != null) {
          if (var3.k(-116)) {
            var3.unlink(false);
          }
          var3 = (vf) (var2.a((byte) 0));
        }
    }

    final static void a(boolean param0, PcmSampleStream param1) {
        try {
          qc.a(param1, -2490);
          if (!param0) {
            field_C = (IntrusiveDeque) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "rp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(UiWidget param0, byte param1) {
        if (!(param0 instanceof vf)) {
          throw new IllegalArgumentException();
        }
        vf var3 = (vf) (param0);
        this.field_D.a(-38, var3);
        var3.field_C = true;
        if (param1 <= 53) {
          return;
        }
        try {
          var3.acquireFocus((UiWidget) (this), -94);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "rp.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_C = new IntrusiveDeque();
    }
}
