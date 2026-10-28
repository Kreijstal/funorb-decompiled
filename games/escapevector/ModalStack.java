/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalStack extends SingleChildContainer {
    static String[] field_G;
    private IntrusiveDeque panels;
    static String field_E;
    static boolean field_D;

    final ModalPanel topOpenPanel(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.panels);
        if (guard != 0) {
          field_E = (String) null;
        }
        ModalPanel var3 = (ModalPanel) (var2.first(guard ^ 15));
        while (var3 != null) {
          if (var3.open) {
            return var3;
          }
          var3 = (ModalPanel) (var2.next(59));
        }
        return null;
    }

    final void refreshPanelVisibility(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.panels);
        if (guard != 0) {
          return;
        }
        ModalPanel var3 = (ModalPanel) (var2.first(15));
        while (var3 != null) {
          if (var3.refreshVisibilityAndCheckClosed((byte) -60)) {
            var3.unlink((byte) -47);
          }
          var3 = (ModalPanel) (var2.next(30));
        }
    }

    final void closeAllPanels(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.panels);
        ModalPanel var3 = (ModalPanel) (var2.first(15));
        while (var3 != null) {
          var3.open = false;
          var3 = (ModalPanel) (var2.next(25));
        }
        this.child = null;
        if (guard != 17415) {
          field_D = true;
        }
    }

    final UiComponent focusedChild(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.panels);
        ModalPanel var3 = (ModalPanel) (var2.first(guard ^ 15));
        if (guard != 0) {
          field_G = (String[]) null;
        }
        while (var3 != null) {
          if (var3.open) {
            return var3.findFocusedChild(true);
          }
          var3 = (ModalPanel) (var2.next(guard + 36));
        }
        return null;
    }

    final void pushPanel(UiComponent panel, int guard) {
        try {
          if (!(panel instanceof ModalPanel)) {
            throw new IllegalArgumentException();
          }
          ModalPanel var3 = (ModalPanel) (panel);
          this.panels.addFirst(var3, 8364);
          if (guard < 36) {
            this.drawLayer(-45, (byte) -105, -25, -82);
          }
          var3.open = true;
          var3.focusNext(-4659, (UiComponent) (this));
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "tb.F(" + (panel != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static boolean canResizeViewport(boolean guard) {
        if (guard) {
          return false;
        }
        boolean stackIn_6_0 = (DirectByteStorage.field_n != null) && (DirectByteStorage.field_n.canResizeViewport(124));
        return stackIn_6_0;
    }

    public static void releaseStatics(int guard) {
        field_G = null;
        field_E = null;
        if (guard != 0) {
          ModalStack.releaseStatics(-104);
        }
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.painter != null) {
          this.painter.drawWidget(screenX, screenY, -43, (UiComponent) (this), true);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.panels);
        UiComponent var6 = (UiComponent) (var5.last(-31616));
        if (guard < 85) {
          this.panels = (IntrusiveDeque) null;
        }
        while (var6 != null) {
          var6.drawLayer(this.y + screenY, (byte) 124, layer, this.x + screenX);
          var6 = (UiComponent) (var5.previous((byte) 57));
        }
    }

    final void updatePanels(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.panels);
        ModalPanel var3 = (ModalPanel) (var2.first(15));
        while (var3 != null) {
          if (var3.updateAnimationsAndCheckClosed(-13907)) {
            var3.unlink((byte) -126);
          }
          var3 = (ModalPanel) (var2.next(guard ^ 91));
        }
        this.child = (UiComponent) ((Object) this.topOpenPanel(guard));
    }

    public ModalStack() {
        super(0, 0, DelayedServerPacket.field_h, SingleChildContainer.field_B, (WidgetPainter) null, (UiListener) null);
        this.panels = new IntrusiveDeque();
    }

    static {
        field_E = "Please enter your age in years";
        field_D = false;
    }
}
