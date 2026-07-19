/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj implements com.ms.directX.IEnumModesCallback {
    private static int field_a;
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_b;

    final void a(int param0, java.awt.Frame param1) {
        this.field_c.restoreDisplayMode();
        this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
        if (param0 != -16) {
            java.awt.Frame var4 = (java.awt.Frame) null;
            this.a(93, (java.awt.Frame) null, 118, -106, 56, 127);
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

    final int[] a(byte param0) {
        int[] var2 = null;
        int[] var3 = null;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_b = new int[field_a];
        field_a = 0;
        this.field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        var3 = field_b;
        var2 = var3;
        field_a = 0;
        if (param0 != -63) {
          return (int[]) null;
        } else {
          field_b = null;
          return var3;
        }
    }

    final void a(int param0, java.awt.Frame param1, int param2, int param3, int param4, int param5) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        com.ms.com.IUnknown var9 = null;
        if (param3 >= -9) {
          var9 = (com.ms.com.IUnknown) null;
          this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          param1.setVisible(true);
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
          this.field_c.setDisplayMode(param2, param5, param4, param0, 0);
          param1.setBounds(0, 0, param2, param5);
          param1.toFront();
          param1.requestFocus();
          return;
        } else {
          param1.setVisible(true);
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_c.setCooperativeLevel((java.awt.Component) ((Object) param1), 17);
          this.field_c.setDisplayMode(param2, param5, param4, param0, 0);
          param1.setBounds(0, 0, param2, param5);
          param1.toFront();
          param1.requestFocus();
          return;
        }
    }

    public vj() {
        this.field_c = new com.ms.directX.DirectDraw();
        this.field_c.initialize((com.ms.com._Guid) null);
    }
}
