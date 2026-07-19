/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private static int[] field_c;
    private com.ms.directX.DirectDraw field_a;

    final void a(java.awt.Frame param0, int param1) {
        this.field_a.restoreDisplayMode();
        this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param0), param1);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (field_c != null) {
            fieldTemp$1 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$1] = param0.width;
            fieldTemp$2 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$2] = param0.height;
            fieldTemp$3 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$3] = param0.rgbBitCount;
            fieldTemp$4 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$4] = param0.refreshRate;
        } else {
            field_b = field_b + 4;
        }
    }

    final void a(int param0, java.awt.Frame param1, int param2, int param3, int param4, int param5) {
        param1.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
        this.field_a.setDisplayMode(param0, param4, param3, param5, param2);
        param1.setBounds(0, 0, param0, param4);
        param1.toFront();
        param1.requestFocus();
    }

    final int[] a(int param0) {
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_c = new int[field_b];
        field_b = param0;
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_c;
        int[] var2 = var3;
        field_b = 0;
        field_c = null;
        return var3;
    }

    public ff() {
        this.field_a = new com.ms.directX.DirectDraw();
        this.field_a.initialize((com.ms.com._Guid) null);
    }
}
