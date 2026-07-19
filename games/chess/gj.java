/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_b;
    private static int field_c;
    private static int[] field_a;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == field_a) {
            field_c = field_c + 4;
        } else {
            fieldTemp$0 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$0] = param0.width;
            fieldTemp$1 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$1] = param0.height;
            fieldTemp$2 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$2] = param0.rgbBitCount;
            fieldTemp$3 = field_c;
            field_c = field_c + 1;
            field_a[fieldTemp$3] = param0.refreshRate;
        }
    }

    final void a(java.awt.Frame param0, int param1, int param2, int param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param0.setVisible(true);
        var7 = (com.ms.awt.WComponentPeer) null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param0), 17);
        this.field_b.setDisplayMode(param4, param1, param5, param2, 0);
        if (param3 < 107) {
          field_a = (int[]) null;
          param0.setBounds(0, 0, param4, param1);
          param0.toFront();
          param0.requestFocus();
          return;
        } else {
          param0.setBounds(0, 0, param4, param1);
          param0.toFront();
          param0.requestFocus();
          return;
        }
    }

    final int[] a(int param0) {
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_a = new int[field_c];
        field_c = param0;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_a;
        int[] var2 = var3;
        field_a = null;
        field_c = 0;
        return var3;
    }

    public gj() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, java.awt.Frame param1) {
        this.field_b.restoreDisplayMode();
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
        if (param0 <= 107) {
            com.ms.com.IUnknown var4 = (com.ms.com.IUnknown) null;
            this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
        }
    }
}
