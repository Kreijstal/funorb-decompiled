/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModalDialogHost extends SingleChildWidgetContainer {
    static boolean field_H;
    static int field_M;
    static String field_O;
    private IntrusiveDeque field_A;
    static IndexedSprite[] field_N;
    static int[] field_L;
    static PlatformTaskDispatcher field_K;
    static String field_J;
    static PcmPlayerService field_I;

    final void closeAllDialogs(boolean param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(this.field_A);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) -13));
        if (param0) {
          field_N = (IndexedSprite[]) null;
        }
        while (var3 != null) {
          var3.field_J = false;
          var3 = (ModalDialog) (var2.c(55));
        }
        this.field_F = null;
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        int var7 = Terraphoenix.field_V;
        if (null != this.listener) {
          this.listener.paintWidget(param3, (UiWidget) (this), param0, -24381, true);
        }
        k var5 = new k(this.field_A);
        UiWidget var6 = (UiWidget) (var5.b(94));
        while (var6 != null) {
          var6.drawWidget(param0 + this.x, -122, param2, param3 + this.y);
          var6 = (UiWidget) (var5.d(-96));
        }
        if (param1 > -106) {
          field_H = false;
        }
    }

    final void advanceDialogs(byte param0) {
        int var4 = Terraphoenix.field_V;
        k var2 = new k(this.field_A);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) -13));
        if (param0 < 122) {
          field_I = (PcmPlayerService) null;
        }
        while (var3 != null) {
          if (var3.advanceDialogAnimation((byte) -121)) {
            var3.unlink((byte) 12);
          }
          var3 = (ModalDialog) (var2.c(101));
        }
        this.field_F = (UiWidget) ((Object) this.getTopOpenDialog(true));
    }

    final ModalDialog getTopOpenDialog(boolean param0) {
        k var2;
        ModalDialog var3;
        int var4;
        UiWidget var5;
        var4 = Terraphoenix.field_V;
        var2 = new k(this.field_A);
        var3 = (ModalDialog) (var2.a((byte) -13));
        if (!param0) {
          var5 = (UiWidget) null;
          this.showDialog((UiWidget) null, (byte) -108);
        }
        while (var3 != null) {
          if (var3.field_J) {
            return var3;
          }
          var3 = (ModalDialog) (var2.c(42));
        }
        return null;
    }

    public ModalDialogHost() {
        super(0, 0, vk.field_c, be.field_v, (WidgetActionListener) null, (WidgetEventListener) null);
        this.field_A = new IntrusiveDeque();
    }

    final void snapAndPruneDialogs(byte param0) {
        int var5 = Terraphoenix.field_V;
        k var2 = new k(this.field_A);
        int var4 = -99 % ((param0 - 39) / 45);
        ModalDialog var3 = (ModalDialog) (var2.a((byte) -13));
        while (var3 != null) {
          if (var3.snapDialogAnimation(113)) {
            var3.unlink((byte) 12);
          }
          var3 = (ModalDialog) (var2.c(8));
        }
    }

    final UiWidget getFocusedChild(byte param0) {
        k var2;
        ModalDialog var3;
        int var4;
        var4 = Terraphoenix.field_V;
        if (param0 != 82) {
          this.drawWidget(-6, -54, -122, -16);
        }
        var2 = new k(this.field_A);
        var3 = (ModalDialog) (var2.a((byte) -13));
        while (var3 != null) {
          if (var3.field_J) {
            return var3.getFocusedChild((byte) -116);
          }
          var3 = (ModalDialog) (var2.c(74));
        }
        return null;
    }

    public static void clearStaticReferences(byte param0) {
        field_J = null;
        field_I = null;
        field_L = null;
        field_N = null;
        field_K = null;
        field_O = null;
        int var1 = 17 / ((54 - param0) / 56);
    }

    final void showDialog(UiWidget param0, byte param1) {
        ModalDialog var3 = null;
        if (!(param0 instanceof ModalDialog)) {
          throw new IllegalArgumentException();
        }
        if (param1 != -1) {
          return;
        }
        try {
          var3 = (ModalDialog) (param0);
          this.field_A.addLast((IntrusiveNode) (var3), (byte) 0);
          var3.field_J = true;
          var3.takeFocus((byte) 14, (UiWidget) (this));
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "d.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_O = " has fallen unconscious.";
        field_H = false;
        field_J = "FULL ACCESS";
        field_L = new int[]{100, 100, 100, 200, 300, 200, 300, 200, 200, 200, 300, 500, 500, 1000, 1000, 1000, 300};
        field_M = 0;
    }
}
