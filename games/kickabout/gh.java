/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_a;
    private static int field_b;

    final int[] a(int param0) {
        this.field_c.enumDisplayModes(param0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_a = new int[field_b];
        field_b = 0;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_a;
        int[] var2 = var3;
        field_a = null;
        field_b = 0;
        return var3;
    }

    final void a(int param0, int param1, int param2, java.awt.Frame param3, int param4, int param5) {
        param3.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, param5);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param3), 17);
        this.field_c.setDisplayMode(param0, param2, param4, param1, 0);
        param3.setBounds(0, 0, param0, param2);
        param3.toFront();
        param3.requestFocus();
    }

    public gh() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, java.awt.Frame param1) {
        this.field_c.restoreDisplayMode();
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
        if (param0 != 0) {
            com.ms.com.IUnknown var4 = (com.ms.com.IUnknown) null;
            this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (field_a == null) {
            field_b = field_b + 4;
        } else {
            fieldTemp$0 = field_b;
            field_b = field_b + 1;
            field_a[fieldTemp$0] = param0.width;
            fieldTemp$1 = field_b;
            field_b = field_b + 1;
            field_a[fieldTemp$1] = param0.height;
            fieldTemp$2 = field_b;
            field_b = field_b + 1;
            field_a[fieldTemp$2] = param0.rgbBitCount;
            fieldTemp$3 = field_b;
            field_b = field_b + 1;
            field_a[fieldTemp$3] = param0.refreshRate;
        }
    }
}
