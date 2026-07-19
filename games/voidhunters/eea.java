/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eea implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_b;
    private static int field_c;
    private static int[] field_a;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (field_a != null) {
            fieldTemp$1 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$1] = param0.width;
            fieldTemp$2 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$2] = param0.height;
            fieldTemp$3 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$3] = param0.rgbBitCount;
            fieldTemp$4 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$4] = param0.refreshRate;
        } else {
            field_c = field_c + 4;
        }
    }

    final void a(int param0, java.awt.Frame param1, int param2, int param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param1.setVisible(true);
        var7 = (com.ms.awt.WComponentPeer) null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        if (param0 >= -60) {
          return;
        } else {
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
          this.field_b.setDisplayMode(param3, param5, param2, param4, 0);
          param1.setBounds(0, 0, param3, param5);
          param1.toFront();
          param1.requestFocus();
          return;
        }
    }

    public eea() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, java.awt.Frame param1) {
        java.awt.Frame var4 = null;
        this.field_b.restoreDisplayMode();
        if (param0 > -53) {
          var4 = (java.awt.Frame) null;
          this.a(114, (java.awt.Frame) null);
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        } else {
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        }
    }

    final int[] a(boolean param0) {
        int[] var2 = null;
        int[] var3 = null;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_a = new int[field_c];
        field_c = 0;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        var3 = field_a;
        var2 = var3;
        field_c = 0;
        field_a = null;
        if (param0) {
          this.field_b = (com.ms.directX.DirectDraw) null;
          return var3;
        } else {
          return var3;
        }
    }
}
