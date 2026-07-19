/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke implements com.ms.directX.IEnumModesCallback {
    private static int field_c;
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_b;

    public ke() {
        this.field_a = new com.ms.directX.DirectDraw();
        this.field_a.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (field_b == null) {
            field_c = field_c + 4;
        } else {
            fieldTemp$0 = field_c;
            field_c = field_c + 1;
            field_b[fieldTemp$0] = param0.width;
            fieldTemp$1 = field_c;
            field_c = field_c + 1;
            field_b[fieldTemp$1] = param0.height;
            fieldTemp$2 = field_c;
            field_c = field_c + 1;
            field_b[fieldTemp$2] = param0.rgbBitCount;
            fieldTemp$3 = field_c;
            field_c = field_c + 1;
            field_b[fieldTemp$3] = param0.refreshRate;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        if (param0 != -16986) {
            return;
        }
        this.field_a.restoreDisplayMode();
        this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
    }

    final void a(int param0, int param1, int param2, java.awt.Frame param3, int param4, int param5) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        if (param0 < 52) {
          this.field_a = (com.ms.directX.DirectDraw) null;
          param3.setVisible(true);
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$4 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$5 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param3), 17);
          this.field_a.setDisplayMode(param5, param4, param1, param2, 0);
          param3.setBounds(0, 0, param5, param4);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          param3.setVisible(true);
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$6 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$7 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param3), 17);
          this.field_a.setDisplayMode(param5, param4, param1, param2, 0);
          param3.setBounds(0, 0, param5, param4);
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    final int[] a(byte param0) {
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_b = new int[field_c];
        int var2 = -52 % ((43 - param0) / 52);
        field_c = 0;
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_b;
        field_c = 0;
        field_b = null;
        return var3;
    }
}
