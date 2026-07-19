/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_b;
    private static int field_a;

    final void a(int param0, java.awt.Frame param1, int param2, int param3, int param4, int param5) {
        param1.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, param5);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
        this.field_c.setDisplayMode(param0, param4, param3, param2, 0);
        param1.setBounds(0, 0, param0, param4);
        param1.toFront();
        param1.requestFocus();
    }

    final int[] a(int param0) {
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_b = new int[field_a];
        field_a = param0;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_b;
        int[] var2 = var3;
        field_a = 0;
        field_b = null;
        return var3;
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (field_b != null) {
            fieldTemp$1 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$1] = param0.width;
            fieldTemp$2 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$2] = param0.height;
            fieldTemp$3 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$3] = param0.rgbBitCount;
            fieldTemp$4 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$4] = param0.refreshRate;
        } else {
            field_a = field_a + 4;
        }
    }

    final void a(byte param0, java.awt.Frame param1) {
        this.field_c.restoreDisplayMode();
        int var3 = -5 % ((3 - param0) / 32);
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
    }

    public mj() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }
}
