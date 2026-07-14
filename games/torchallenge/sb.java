/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_a;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null != field_a) {
            field_b = field_b + 1;
            field_a[field_b] = param0.width;
            field_b = field_b + 1;
            field_a[field_b] = param0.height;
            field_b = field_b + 1;
            field_a[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_a[field_b] = param0.refreshRate;
        } else {
            field_b = field_b + 4;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Frame param5) {
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, param2, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((sb) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        ((sb) this).field_c.setDisplayMode(param3, param4, param1, param0, 0);
        param5.setBounds(0, 0, param3, param4);
        param5.toFront();
        param5.requestFocus();
    }

    final int[] a(int param0) {
        int[] var2 = null;
        Object var3 = null;
        int[] var4 = null;
        ((sb) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_b];
        field_b = 0;
        ((sb) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        var4 = field_a;
        var2 = var4;
        field_b = 0;
        if (param0 != -27469) {
          var3 = null;
          ((sb) this).a(true, (java.awt.Frame) null);
          field_a = null;
          return var4;
        } else {
          field_a = null;
          return var4;
        }
    }

    final void a(boolean param0, java.awt.Frame param1) {
        ((sb) this).field_c.restoreDisplayMode();
        ((sb) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        if (param0) {
            field_b = 38;
        }
    }

    public sb() {
        ((sb) this).field_c = new com.ms.directX.DirectDraw();
        ((sb) this).field_c.initialize((com.ms.com._Guid) null);
    }
}
