/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    private IntrusiveDeque field_D;
    static String field_E;
    static String field_F;
    static ResourceArchive field_C;

    final void closeAllDialogs(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_D);
        if (param0 != 0) {
          return;
        }
        ModalDialog var3 = (ModalDialog) (var2.a(param0 ^ 250));
        while (var3 != null) {
          var3.field_D = false;
          var3 = (ModalDialog) (var2.c(param0 - 73));
        }
        this.field_A = null;
    }

    final void advanceDialogs(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          this.getFocusedChild(127);
        }
        ta var2 = new ta(this.field_D);
        ModalDialog var3 = (ModalDialog) (var2.a(250));
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) -77)) {
            var3.unlink((byte) -121);
          }
          var3 = (ModalDialog) (var2.c(-124));
        }
        this.field_A = (UiWidget) ((Object) this.getTopOpenDialog(false));
    }

    final void snapAndPruneDialogs(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_D);
        ModalDialog var3 = (ModalDialog) (var2.a(250));
        if (param0) {
          ModalDialogHost.clearStaticReferences(-88);
        }
        while (var3 != null) {
          if (var3.snapDialogAnimation((byte) 26)) {
            var3.unlink((byte) -122);
          }
          var3 = (ModalDialog) (var2.c(-69));
        }
    }

    public static void clearStaticReferences(int param0) {
        field_C = null;
        field_E = null;
        field_F = null;
        if (param0 > -59) {
          field_F = (String) null;
        }
    }

    final ModalDialog getTopOpenDialog(boolean param0) {
        ta var2;
        ModalDialog var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0) {
          return (ModalDialog) null;
        }
        var2 = new ta(this.field_D);
        var3 = (ModalDialog) (var2.a(250));
        while (var3 != null) {
          if (var3.field_D) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(-53));
        }
        return null;
    }

    final void drawWidget(byte param0, int param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (this.field_i != null) {
          this.field_i.paintWidget(param1, param2, true, (UiWidget) (this), param0 - 3169);
        }
        if (param0 != -115) {
          return;
        }
        ta var5 = new ta(this.field_D);
        UiWidget var6 = (UiWidget) (var5.b(0));
        while (var6 != null) {
          var6.drawWidget((byte) -115, this.field_o + param1, param2 + this.field_t, param3);
          var6 = (UiWidget) (var5.e(31842));
        }
    }

    public ModalDialogHost() {
        super(0, 0, ResizableModalDialog.field_O, RegistrationAgreementPane.field_C, (WidgetRenderer) null, (WidgetEventListener) null);
        this.field_D = new IntrusiveDeque();
    }

    final UiWidget getFocusedChild(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(this.field_D);
        ModalDialog var3 = (ModalDialog) (var2.a(250));
        while (var3 != null) {
          if (var3.field_D) {
            return var3.getFocusedChild(-21374);
          }
          var3 = (ModalDialog) (var2.c(-87));
        }
        if (param0 == 0) {
          return null;
        }
        this.advanceDialogs(true);
        return null;
    }

    final void showDialog(int param0, UiWidget param1) {
        ModalDialog var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param1 instanceof ModalDialog)) {
            throw new IllegalArgumentException();
          }
          var3 = (ModalDialog) (param1);
          this.field_D.addFirst(param0 + 14484, var3);
          var3.field_D = true;
          var3.takeFocus((byte) 44, (UiWidget) (this));
          if (param0 != -14579) {
            this.getFocusedChild(18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("eg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont a(int param0, int param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        CoverageBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DequeWidgetContainer.a(param1, param0, (byte) -122, param2)) {
            stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          if (param4 <= 15) {
            ModalDialogHost.clearStaticReferences(69);
          }
          stackIn_6_0 = lj.a(22076, param3.getFile(param1, -27493, param0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("eg.F(").append(param0).append(',').append(param1).append(',');
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
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_F = "to keep fullscreen or";
        field_E = "4 of 4";
    }
}
