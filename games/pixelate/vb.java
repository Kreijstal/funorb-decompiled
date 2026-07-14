/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_a;
    private static int field_b;

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((vb) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_b];
        field_b = 0;
        if (param0 != 5003) {
          return null;
        } else {
          ((vb) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_a = null;
          field_b = 0;
          return var3;
        }
    }

    public vb() {
        ((vb) this).field_c = new com.ms.directX.DirectDraw();
        ((vb) this).field_c.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, java.awt.Frame param1) {
        ((vb) this).field_c.restoreDisplayMode();
        ((vb) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param1, param0);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null == field_a) {
            field_b = field_b + 4;
        } else {
            field_b = field_b + 1;
            field_a[field_b] = param0.width;
            field_b = field_b + 1;
            field_a[field_b] = param0.height;
            field_b = field_b + 1;
            field_a[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_a[field_b] = param0.refreshRate;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, java.awt.Frame param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param5.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((vb) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        ((vb) this).field_c.setDisplayMode(param4, param0, param3, param2, 0);
        param5.setBounds(0, 0, param4, param0);
        param5.toFront();
        param5.requestFocus();
        if (param1 != 122) {
          ((vb) this).field_c = null;
          return;
        } else {
          return;
        }
    }
}
