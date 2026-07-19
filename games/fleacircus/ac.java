/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac implements com.ms.directX.IEnumModesCallback {
    private static int[] field_a;
    private com.ms.directX.DirectDraw field_b;
    private static int field_c;

    final int[] a(int param0) {
        int[] var2 = null;
        java.awt.Frame var3 = null;
        int[] var4 = null;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        if (param0 != -7581) {
          var3 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, 39);
          field_a = new int[field_c];
          field_c = 0;
          this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          var4 = field_a;
          var2 = var4;
          field_a = null;
          field_c = 0;
          return var4;
        } else {
          field_a = new int[field_c];
          field_c = 0;
          this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
          var4 = field_a;
          var2 = var4;
          field_a = null;
          field_c = 0;
          return var4;
        }
    }

    final void a(java.awt.Frame param0, int param1) {
        this.field_b.restoreDisplayMode();
        if (param1 <= 94) {
            return;
        }
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
    }

    public ac() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }

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

    final void a(int param0, int param1, java.awt.Frame param2, int param3, boolean param4, int param5) {
        param2.setVisible(param4);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param2), 17);
        this.field_b.setDisplayMode(param0, param1, param5, param3, 0);
        param2.setBounds(0, 0, param0, param1);
        param2.toFront();
        param2.requestFocus();
    }
}
