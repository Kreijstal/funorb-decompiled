/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk implements com.ms.directX.IEnumModesCallback {
    private static int[] field_b;
    private static int field_a;
    private com.ms.directX.DirectDraw field_c;

    final int[] a(int param0) {
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_b = new int[field_a];
        field_a = param0;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_b;
        int[] var2 = var3;
        field_b = null;
        field_a = 0;
        return var3;
    }

    final void a(java.awt.Frame param0, byte param1) {
        com.ms.com.IUnknown var4 = null;
        this.field_c.restoreDisplayMode();
        if (param1 < 98) {
          var4 = (com.ms.com.IUnknown) null;
          this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
          return;
        } else {
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
          return;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (field_b == null) {
            field_a = field_a + 4;
        } else {
            fieldTemp$0 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$0] = param0.width;
            fieldTemp$1 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$1] = param0.height;
            fieldTemp$2 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$2] = param0.rgbBitCount;
            fieldTemp$3 = field_a;
            field_a = field_a + 1;
            field_b[fieldTemp$3] = param0.refreshRate;
        }
    }

    final void a(int param0, java.awt.Frame param1, int param2, int param3, byte param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        param1.setVisible(true);
        var7 = (com.ms.awt.WComponentPeer) null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
        this.field_c.setDisplayMode(param5, param2, param3, param0, 0);
        param1.setBounds(0, 0, param5, param2);
        param1.toFront();
        param1.requestFocus();
        if (param4 > -70) {
          var9 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, (byte) 13);
          return;
        } else {
          return;
        }
    }

    public pk() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }
}
