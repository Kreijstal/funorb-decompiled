/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl implements com.ms.directX.IEnumModesCallback {
    private static int[] field_c;
    private com.ms.directX.DirectDraw field_b;
    private static int field_a;

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_c = new int[field_a];
        field_a = 0;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        if (param0 != -16) {
          return (int[]) null;
        } else {
          var3 = field_c;
          var2 = var3;
          field_a = 0;
          field_c = null;
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Frame param3, int param4, int param5) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param3.setVisible(true);
        if (param1 != 11468) {
          field_a = 30;
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param3), 17);
          this.field_b.setDisplayMode(param2, param5, param0, param4, 0);
          param3.setBounds(0, 0, param2, param5);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param3), 17);
          this.field_b.setDisplayMode(param2, param5, param0, param4, 0);
          param3.setBounds(0, 0, param2, param5);
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        this.field_b.restoreDisplayMode();
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), param0);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == field_c) {
            field_a = field_a + 4;
        } else {
            fieldTemp$0 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$0] = param0.width;
            fieldTemp$1 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$1] = param0.height;
            fieldTemp$2 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$2] = param0.rgbBitCount;
            fieldTemp$3 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$3] = param0.refreshRate;
        }
    }

    public cl() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }
}
