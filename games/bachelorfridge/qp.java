/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp implements com.ms.directX.IEnumModesCallback {
    private static int[] field_a;
    private static int field_c;
    private com.ms.directX.DirectDraw field_b;

    final int[] a(int param0) {
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_a = new int[field_c];
        field_c = 0;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int var2 = 21 % ((43 - param0) / 48);
        int[] var3 = field_a;
        field_c = 0;
        field_a = null;
        return var3;
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

    final void a(byte param0, int param1, int param2, int param3, java.awt.Frame param4, int param5) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param4.setVisible(true);
        var7 = (com.ms.awt.WComponentPeer) null;
        if (param0 > -92) {
          field_c = 97;
          var8 = var7.getHwnd();
          discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param4), 17);
          this.field_b.setDisplayMode(param3, param1, param2, param5, 0);
          param4.setBounds(0, 0, param3, param1);
          param4.toFront();
          param4.requestFocus();
          return;
        } else {
          var8 = var7.getHwnd();
          discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param4), 17);
          this.field_b.setDisplayMode(param3, param1, param2, param5, 0);
          param4.setBounds(0, 0, param3, param1);
          param4.toFront();
          param4.requestFocus();
          return;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        this.field_b.restoreDisplayMode();
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
        if (param0 >= -5) {
            this.field_b = (com.ms.directX.DirectDraw) null;
        }
    }

    public qp() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }
}
