/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai implements com.ms.directX.IEnumModesCallback {
    private static int[] field_b;
    private com.ms.directX.DirectDraw field_c;
    private static int field_a;

    final int[] a(int param0) {
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_b = new int[field_a];
        field_a = 0;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_b;
        int[] var2 = var3;
        field_a = param0;
        field_b = null;
        return var3;
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == field_b) {
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

    final void a(java.awt.Frame param0, int param1) {
        java.awt.Frame var4 = null;
        this.field_c.restoreDisplayMode();
        if (param1 != -20) {
          var4 = (java.awt.Frame) null;
          this.a((java.awt.Frame) null, -107, -37, 23, 78, 45);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
          return;
        } else {
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
          return;
        }
    }

    final void a(java.awt.Frame param0, int param1, int param2, int param3, int param4, int param5) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param0.setVisible(true);
        var7 = (com.ms.awt.WComponentPeer) null;
        var8 = var7.getHwnd();
        if (param2 != 13486) {
          field_b = (int[]) null;
          discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param0), 17);
          this.field_c.setDisplayMode(param3, param4, param1, param5, 0);
          param0.setBounds(0, 0, param3, param4);
          param0.toFront();
          param0.requestFocus();
          return;
        } else {
          discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param0), 17);
          this.field_c.setDisplayMode(param3, param4, param1, param5, 0);
          param0.setBounds(0, 0, param3, param4);
          param0.toFront();
          param0.requestFocus();
          return;
        }
    }

    public ai() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }
}
