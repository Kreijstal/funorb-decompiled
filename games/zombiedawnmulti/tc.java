/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;

    final void a(java.awt.Frame param0, byte param1) {
        ((tc) this).field_a.restoreDisplayMode();
        if (param1 != 3) {
            return;
        }
        ((tc) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
    }

    final void a(int param0, int param1, int param2, java.awt.Frame param3, int param4, int param5) {
        param3.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((tc) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
        ((tc) this).field_a.setDisplayMode(param1, param2, param5, param0, 0);
        param3.setBounds(0, param4, param1, param2);
        param3.toFront();
        param3.requestFocus();
    }

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((tc) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        if (param0 < 58) {
          return null;
        } else {
          ((tc) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_c;
          var2 = var3;
          field_b = 0;
          field_c = null;
          return var3;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_c != null) {
            field_b = field_b + 1;
            field_c[field_b] = param0.width;
            field_b = field_b + 1;
            field_c[field_b] = param0.height;
            field_b = field_b + 1;
            field_c[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_c[field_b] = param0.refreshRate;
        } else {
            field_b = field_b + 4;
        }
    }

    public tc() {
        ((tc) this).field_a = new com.ms.directX.DirectDraw();
        ((tc) this).field_a.initialize((com.ms.com._Guid) null);
    }
}
