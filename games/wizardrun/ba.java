/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_a;
    private static int field_b;

    final void a(int param0, byte param1, int param2, int param3, int param4, java.awt.Frame param5) {
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((ba) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        int var9 = -82 / ((param1 - -6) / 45);
        ((ba) this).field_c.setDisplayMode(param2, param3, param0, param4, 0);
        param5.setBounds(0, 0, param2, param3);
        param5.toFront();
        param5.requestFocus();
    }

    final int[] a(boolean param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((ba) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_b];
        field_b = 0;
        if (!param0) {
          ((ba) this).field_c = null;
          ((ba) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_b = 0;
          field_a = null;
          return var3;
        } else {
          ((ba) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_b = 0;
          field_a = null;
          return var3;
        }
    }

    public ba() {
        ((ba) this).field_c = new com.ms.directX.DirectDraw();
        ((ba) this).field_c.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, java.awt.Frame param1) {
        ((ba) this).field_c.restoreDisplayMode();
        ((ba) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        if (param0 != -2147483648) {
            ((ba) this).field_c = null;
        }
    }

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
}
