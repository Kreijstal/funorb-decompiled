/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    private IntrusiveDeque field_B;
    static String field_E;
    static String[] field_D;
    static String[] field_C;

    public static void clearStaticReferences(boolean param0) {
        field_D = null;
        field_C = null;
        field_E = null;
        if (param0) {
          ModalDialogHost.clearStaticReferences(true);
        }
    }

    final ModalDialog getTopOpenDialog(int param0) {
        fl var2;
        ModalDialog var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = new fl(this.field_B);
        if (param0 != 0) {
          this.closeAllDialogs((byte) 57);
        }
        var3 = (ModalDialog) (var2.b(param0 ^ 1));
        while (var3 != null) {
          if (var3.field_F) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(0));
        }
        return null;
    }

    final UiWidget getFocusedChild(byte param0) {
        fl var2;
        ModalDialog var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = new fl(this.field_B);
        if (param0 != -83) {
          this.advanceDialogs((byte) 9);
        }
        var3 = (ModalDialog) (var2.b(1));
        while (var3 != null) {
          if (var3.field_F) {
            return var3.getFocusedChild(19011);
          }
          var3 = (ModalDialog) (var2.c(0));
        }
        return null;
    }

    final void snapAndPruneDialogs(int param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        fl var2 = new fl(this.field_B);
        if (param0 > -65) {
          this.getTopOpenDialog(-75);
        }
        ModalDialog var3 = (ModalDialog) (var2.b(1));
        while (var3 != null) {
          if (var3.snapDialogAnimation(-15953)) {
            var3.unlink(121);
          }
          var3 = (ModalDialog) (var2.c(0));
        }
    }

    final void showDialog(UiWidget param0, int param1) {
        ModalDialog var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param0 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param0);
          this.field_B.addFirst((byte) -102, var3);
          var3.field_F = true;
          var3.takeFocus((byte) -90, (UiWidget) (this));
          if (param1 < 78) {
            this.advanceDialogs((byte) 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gg.R(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void advanceDialogs(byte param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 114) {
          UiWidget var5 = (UiWidget) null;
          this.showDialog((UiWidget) null, 99);
        }
        fl var2 = new fl(this.field_B);
        ModalDialog var3 = (ModalDialog) (var2.b(param0 - 113));
        while (var3 != null) {
          if (var3.advanceDialogAnimation(param0 + 65279)) {
            var3.unlink(127);
          }
          var3 = (ModalDialog) (var2.c(0));
        }
        this.field_A = (UiWidget) ((Object) this.getTopOpenDialog(0));
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (null != this.field_h) {
          this.field_h.paintWidget(param0, param1, 15430, (UiWidget) (this), true);
        }
        fl var5 = new fl(this.field_B);
        if (param2 <= 42) {
          return;
        }
        UiWidget var6 = (UiWidget) (var5.a(0));
        while (var6 != null) {
          var6.drawWidget(param0 + this.field_m, this.field_v + param1, (byte) 120, param3);
          var6 = (UiWidget) (var5.a(false));
        }
    }

    public ModalDialogHost() {
        super(0, 0, TextHotspotBounds.field_q, fb.field_f, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_B = new IntrusiveDeque();
    }

    final void closeAllDialogs(byte param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != 32) {
          return;
        }
        fl var2 = new fl(this.field_B);
        ModalDialog var3 = (ModalDialog) (var2.b(1));
        while (var3 != null) {
          var3.field_F = false;
          var3 = (ModalDialog) (var2.c(param0 - 32));
        }
        this.field_A = null;
    }

    static {
        field_E = "Age:";
        field_C = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
