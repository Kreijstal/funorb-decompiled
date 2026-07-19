/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;
    private static int field_b;

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

    public an() {
        this.field_a = new com.ms.directX.DirectDraw();
        this.field_a.initialize((com.ms.com._Guid) null);
    }

    final void a(byte param0, java.awt.Frame param1) {
        this.field_a.restoreDisplayMode();
        if (param0 != -102) {
          field_b = -91;
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        } else {
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param1), 8);
          return;
        }
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, int param4, int param5) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param2.setVisible(true);
        if (param4 != -4013) {
          return;
        } else {
          var7 = (com.ms.awt.WComponentPeer) null;
          var8 = var7.getHwnd();
          discarded$2 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          discarded$3 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          this.field_a.setCooperativeLevel((java.awt.Component) ((Object) param2), 17);
          this.field_a.setDisplayMode(param1, param3, param5, param0, 0);
          param2.setBounds(0, 0, param1, param3);
          param2.toFront();
          param2.requestFocus();
          return;
        }
    }

    final int[] a(int param0) {
        int[] var2 = null;
        com.ms.com.IUnknown var3 = null;
        int[] var4 = null;
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_c = new int[field_b];
        field_b = 0;
        this.field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        if (param0 != 3152) {
          var3 = (com.ms.com.IUnknown) null;
          this.callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          var4 = field_c;
          var2 = var4;
          field_c = null;
          field_b = 0;
          return var4;
        } else {
          var4 = field_c;
          var2 = var4;
          field_c = null;
          field_b = 0;
          return var4;
        }
    }
}
