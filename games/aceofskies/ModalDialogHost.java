/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static int field_u;
    private IntrusiveDeque field_w;
    static SpriteData woodenTileSpriteData;

    public static void clearStaticReferences(int param0) {
        int var1 = -1 / ((param0 - 25) / 48);
        woodenTileSpriteData = null;
    }

    public ModalDialogHost() {
        super(0, 0, fj.field_c, nc.field_d, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_w = new IntrusiveDeque();
    }

    final ModalDialog getTopOpenDialog(byte param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != -112) {
          return (ModalDialog) null;
        }
        an var2 = new an(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.c(-1372));
        while (var3 != null) {
          if (var3.field_z) {
            return var3;
          }
          var3 = (ModalDialog) (var2.a(-122));
        }
        return null;
    }

    final void snapAndPruneDialogs(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param0 != 0) {
          this.getFocusedChild(92);
        }
        an var2 = new an(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.c(-1372));
        while (var3 != null) {
          if (var3.snapDialogAnimation(param0 - 72)) {
            var3.unlink(-125);
          }
          var3 = (ModalDialog) (var2.a(param0 + 59));
        }
    }

    final void closeAllDialogs(byte param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.c(-1372));
        while (var3 != null) {
          var3.field_z = false;
          var3 = (ModalDialog) (var2.a(67));
        }
        if (param0 < 19) {
          return;
        }
        this.field_s = null;
    }

    final void showDialog(UiWidget param0, int param1) {
        try {
          if (param1 != 0) {
            this.field_w = (IntrusiveDeque) null;
          }
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          ModalDialog var3 = (ModalDialog) (param0);
          this.field_w.addFirst(var3, 25611);
          var3.field_z = true;
          var3.takeFocus((UiWidget) (this), (byte) -42);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "lt.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final UiWidget getFocusedChild(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        an var2 = new an(this.field_w);
        ModalDialog var3 = (ModalDialog) (var2.c(-1372));
        while (var3 != null) {
          if (var3.field_z) {
            return var3.getFocusedChild(0);
          }
          var3 = (ModalDialog) (var2.a(107));
        }
        if (param0 == 0) {
          return null;
        }
        ModalDialogHost.clearStaticReferences(30);
        return null;
    }

    final void advanceDialogs(byte param0) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var3 = 96 % ((-31 - param0) / 58);
        an var2 = new an(this.field_w);
        ModalDialog var4 = (ModalDialog) (var2.c(-1372));
        while (var4 != null) {
          if (var4.advanceDialogAnimation(11)) {
            var4.unlink(-127);
          }
          var4 = (ModalDialog) (var2.a(-127));
        }
        this.field_s = (UiWidget) ((Object) this.getTopOpenDialog((byte) -112));
    }

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (this.field_e != null) {
          this.field_e.paintWidget(true, -7592, param3, (UiWidget) (this), param2);
        }
        an var5 = new an(this.field_w);
        if (param0 < 64) {
          field_u = 45;
        }
        UiWidget var6 = (UiWidget) (var5.b(true));
        while (var6 != null) {
          var6.drawWidget((byte) 112, param1, this.field_h + param2, this.field_p + param3);
          var6 = (UiWidget) (var5.a((byte) 120));
        }
    }

    static {
        field_u = 0;
    }
}
