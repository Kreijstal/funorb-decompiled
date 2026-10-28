/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends SingleChildContainer {
    static String[] field_G;
    private IntrusiveDeque field_H;
    static String field_E;
    static boolean field_D;

    final bb n(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        if (param0 != 0) {
          field_E = (String) null;
        }
        bb var3 = (bb) (var2.first(param0 ^ 15));
        while (var3 != null) {
          if (var3.field_G) {
            return var3;
          }
          var3 = (bb) (var2.next(59));
        }
        return null;
    }

    final void p(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        if (param0 != 0) {
          return;
        }
        bb var3 = (bb) (var2.first(15));
        while (var3 != null) {
          if (var3.a((byte) -60)) {
            var3.unlink((byte) -47);
          }
          var3 = (bb) (var2.next(30));
        }
    }

    final void l(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        bb var3 = (bb) (var2.first(15));
        while (var3 != null) {
          var3.field_G = false;
          var3 = (bb) (var2.next(25));
        }
        this.child = null;
        if (param0 != 17415) {
          field_D = true;
        }
    }

    final UiComponent focusedChild(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        bb var3 = (bb) (var2.first(guard ^ 15));
        if (guard != 0) {
          field_G = (String[]) null;
        }
        while (var3 != null) {
          if (var3.field_G) {
            return var3.a(true);
          }
          var3 = (bb) (var2.next(guard + 36));
        }
        return null;
    }

    final void b(UiComponent param0, int param1) {
        try {
          if (!(param0 instanceof bb)) {
            throw new IllegalArgumentException();
          }
          bb var3 = (bb) (param0);
          this.field_H.addFirst(var3, 8364);
          if (param1 < 36) {
            this.drawLayer(-45, (byte) -105, -25, -82);
          }
          var3.field_G = true;
          var3.focusNext(-4659, (UiComponent) (this));
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "tb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        boolean stackIn_6_0 = (km.field_n != null) && (km.field_n.c(124));
        return stackIn_6_0;
    }

    public static void releaseStatics(int guard) {
        field_G = null;
        field_E = null;
        if (guard != 0) {
          tb.releaseStatics(-104);
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.painter != null) {
          this.painter.drawWidget(screenX, screenY, -43, (UiComponent) (this), true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_H);
        UiComponent var6 = (UiComponent) (var5.last(-31616));
        if (guard < 85) {
          this.field_H = (IntrusiveDeque) null;
        }
        while (var6 != null) {
          var6.drawLayer(this.y + screenY, (byte) 124, layer, this.x + screenX);
          var6 = (UiComponent) (var5.previous((byte) 57));
        }
    }

    final void m(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        bb var3 = (bb) (var2.first(15));
        while (var3 != null) {
          if (var3.j(-13907)) {
            var3.unlink((byte) -126);
          }
          var3 = (bb) (var2.next(param0 ^ 91));
        }
        this.child = (UiComponent) ((Object) this.n(param0));
    }

    public tb() {
        super(0, 0, DelayedServerPacket.field_h, SingleChildContainer.field_B, (WidgetPainter) null, (UiListener) null);
        this.field_H = new IntrusiveDeque();
    }

    static {
        field_E = "Please enter your age in years";
        field_D = false;
    }
}
