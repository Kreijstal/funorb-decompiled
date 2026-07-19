/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_a;
    private static int field_b;
    private static int[] field_c;

    final void a(java.awt.Frame param0, byte param1) {
        java.awt.Frame var4 = null;
        if (param1 != -108) {
          var4 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, (byte) -47);
          this.field_a.restoreDisplayMode();
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
          return;
        } else {
          this.field_a.restoreDisplayMode();
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
          return;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == field_c) {
            field_b = field_b + 4;
        } else {
            fieldTemp$0 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$0] = param0.width;
            fieldTemp$1 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$1] = param0.height;
            fieldTemp$2 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$2] = param0.rgbBitCount;
            fieldTemp$3 = field_b;
            field_b = field_b + 1;
            field_c[fieldTemp$3] = param0.refreshRate;
        }
    }

    final void a(java.awt.Frame param0, int param1, int param2, int param3, int param4, boolean param5) {
        param0.setVisible(param5);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param0), 17);
        this.field_a.setDisplayMode(param1, param4, param2, param3, 0);
        param0.setBounds(0, 0, param1, param4);
        param0.toFront();
        param0.requestFocus();
    }

    public sp() {
        this.field_a = new com.ms.directX.DirectDraw();
        this.field_a.initialize((com.ms.com._Guid) null);
    }

    final int[] a(byte param0) {
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_c = new int[field_b];
        field_b = 0;
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var4 = field_c;
        int[] var2 = var4;
        int var3 = -36 % ((-24 - param0) / 34);
        field_c = null;
        field_b = 0;
        return var4;
    }
}
