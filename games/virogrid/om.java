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
        if (param0 != -54) {
          field_b = -8;
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        } else {
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        }
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, int param4, int param5) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param2.setVisible(true);
        if (param0 > -37) {
          field_b = 37;
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param2), 17);
          this.field_c.setDisplayMode(param3, param4, param5, param1, 0);
          param2.setBounds(0, 0, param3, param4);
          param2.toFront();
          param2.requestFocus();
          return;
        } else {
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param2), 17);
          this.field_c.setDisplayMode(param3, param4, param5, param1, 0);
          param2.setBounds(0, 0, param3, param4);
          param2.toFront();
          param2.requestFocus();
          return;
        }
    }

    public om() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }

    final int[] a(int param0) {
        int[] var2 = null;
        java.awt.Frame var3 = null;
        int[] var4 = null;
        if (param0 < 116) {
          var3 = (java.awt.Frame) null;
          this.a(-63, 90, (java.awt.Frame) null, 92, 19, -84);
          this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          field_a = new int[field_b];
          field_b = 0;
          this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          var4 = field_a;
          var2 = var4;
          field_a = null;
          field_b = 0;
          return var4;
        } else {
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
    }
}
