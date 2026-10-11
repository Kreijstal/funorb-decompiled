/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_a;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == field_a) {
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

    final void a(byte param0, java.awt.Frame param1) {
        this.field_c.restoreDisplayMode();
        if (param0 == -54) {
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        }
        field_b = -8;
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        com.ms.awt.WComponentPeer var7Lifetime1;
        int var8Lifetime1;
        param2.setVisible(true);
        if (param0 <= -37) {
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param2), 17);
          this.field_c.setDisplayMode(param3, param4, param5, param1, 0);
          param2.setBounds(0, 0, param3, param4);
          param2.toFront();
          param2.requestFocus();
          return;
        }
        field_b = 37;
        var7Lifetime1 = (com.ms.awt.WComponentPeer) null;
        var8Lifetime1 = var7Lifetime1.getHwnd();
        com.ms.win32.User32.SetWindowLong(var8Lifetime1, -16, -2147483648);
        com.ms.win32.User32.SetWindowLong(var8Lifetime1, -20, 8);
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param2), 17);
        this.field_c.setDisplayMode(param3, param4, param5, param1, 0);
        param2.setBounds(0, 0, param3, param4);
        param2.toFront();
        param2.requestFocus();
    }

    public om() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }

    final int[] a(int param0) {
        int[] var4 = null;
        int[] var2 = null;
        int[] var4Lifetime1;
        int[] var2Lifetime1;
        if (param0 >= 116) {
          this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          field_a = new int[field_b];
          field_b = 0;
          this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          var4 = field_a;
          var2 = var4;
          field_a = null;
          field_b = 0;
          return var4;
        }
        java.awt.Frame var3 = (java.awt.Frame) null;
        this.a(-63, 90, (java.awt.Frame) null, 92, 19, -84);
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_a = new int[field_b];
        field_b = 0;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        var4Lifetime1 = field_a;
        var2Lifetime1 = var4Lifetime1;
        field_a = null;
        field_b = 0;
        return var4Lifetime1;
    }
}
