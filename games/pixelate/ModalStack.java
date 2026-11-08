/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalStack extends SingleChildContainer {
    static int field_O;
    static boolean field_L;
    static volatile boolean field_K;
    static String field_J;
    static int field_I;
    private IntrusiveDeque field_N;
    static ReportReason field_M;
    static String field_P;

    final void updatePanels(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_N);
        ModalPanel var3 = (ModalPanel) (var2.first(0));
        while (var3 != null) {
          if (var3.tickLayerAndCheckHidden(false)) {
            var3.unlink(2779);
          }
          var3 = (ModalPanel) (var2.next((byte) -104));
        }
        if (param0 < 99) {
          this.drawLayer(-63, 101, 32, (byte) 105);
        }
        this.child = (UiComponent) ((Object) this.getTopOpenPanel(640));
    }

    final void showPanel(int param0, UiComponent param1) {
        ModalPanel var3 = null;
        try {
          if (!(param1 instanceof ModalPanel)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalPanel) (param1);
          if (param0 != -6183) {
            field_L = true;
          }
          this.field_N.addFirst(param0 ^ -1392505192, var3);
          var3.field_N = true;
          var3.focusNext((UiComponent) (this), 27);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "kn.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final UiComponent getFocusedChild(int param0) {
        IntrusiveDequeCursor var2;
        ModalPanel var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 < 48) {
          this.removeDismissedPanels((byte) 24);
        }
        var2 = new IntrusiveDequeCursor(this.field_N);
        var3 = (ModalPanel) (var2.first(0));
        while (var3 != null) {
          if (var3.field_N) {
            return var3.getFocusedChild(97);
          }
          var3 = (ModalPanel) (var2.next((byte) -104));
        }
        return null;
    }

    final void drawLayer(int param0, int param1, int param2, byte param3) {
        int var8 = Pixelate.field_H ? 1 : 0;
        if (this.field_y != null) {
          this.field_y.drawWidget((UiComponent) (this), (byte) -124, param0, param2, true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_N);
        UiComponent var6 = (UiComponent) (var5.last(-1));
        int var7 = 47 / ((param3 - 70) / 49);
        while (var6 != null) {
          var6.drawLayer(param0 + this.field_p, param1, param2 + this.field_z, (byte) 124);
          var6 = (UiComponent) (var5.previous(-105));
        }
    }

    public ModalStack() {
        super(0, 0, field_O, IndexedSpriteState.field_c, (WidgetPainter) null, (UiListener) null);
        this.field_N = new IntrusiveDeque();
    }

    final ModalPanel getTopOpenPanel(int param0) {
        IntrusiveDequeCursor var2;
        ModalPanel var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 640) {
          field_I = 105;
        }
        var2 = new IntrusiveDequeCursor(this.field_N);
        var3 = (ModalPanel) (var2.first(0));
        while (var3 != null) {
          if (var3.field_N) {
            return var3;
          }
          var3 = (ModalPanel) (var2.next((byte) -104));
        }
        return null;
    }

    final static boolean isTwoOrMore(boolean param0, int param1) {
        if (!param0) {
          field_J = (String) null;
        }
        return param1 >= 2 ? true : false;
    }

    final void refreshPanelVisibility(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != 54) {
          this.field_N = (IntrusiveDeque) null;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_N);
        ModalPanel var3 = (ModalPanel) (var2.first(param0 ^ 54));
        while (var3 != null) {
          var3.field_N = false;
          var3 = (ModalPanel) (var2.next((byte) -104));
        }
        this.child = null;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 10504) {
          field_L = true;
        }
        field_M = null;
        field_J = null;
        field_P = null;
    }

    final void removeDismissedPanels(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -22) {
          this.field_N = (IntrusiveDeque) null;
        }
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_N);
        ModalPanel var3 = (ModalPanel) (var2.first(0));
        while (var3 != null) {
          if (var3.isDismissed((byte) 123)) {
            var3.unlink(2779);
          }
          var3 = (ModalPanel) (var2.next((byte) -104));
        }
    }

    static {
        field_K = true;
        field_O = 640;
        field_M = new ReportReason(12, 0, 1, 0);
        field_P = "Next Puzzle";
    }
}
