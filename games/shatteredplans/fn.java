/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn implements com.ms.directX.IEnumModesCallback {
    private static int field_c;
    private static int[] field_b;
    private com.ms.directX.DirectDraw field_a;

    final int[] a(int param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((fn) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        if (param0 != -19750) {
          ((fn) this).field_a = null;
          field_b = new int[field_c];
          field_c = 0;
          ((fn) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_b;
          var2 = var3;
          field_b = null;
          field_c = 0;
          return var3;
        } else {
          field_b = new int[field_c];
          field_c = 0;
          ((fn) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_b;
          var2 = var3;
          field_b = null;
          field_c = 0;
          return var3;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        ((fn) this).field_a.restoreDisplayMode();
        if (param0 != 0) {
            return;
        }
        ((fn) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
    }

    final void a(java.awt.Frame param0, int param1, int param2, int param3, int param4, int param5) {
        param0.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((fn) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 17);
        ((fn) this).field_a.setDisplayMode(param2, param3, param4, param1, param5);
        param0.setBounds(0, 0, param2, param3);
        param0.toFront();
        param0.requestFocus();
    }

    public fn() {
        ((fn) this).field_a = new com.ms.directX.DirectDraw();
        ((fn) this).field_a.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_b == null) {
            field_c = field_c + 4;
        } else {
            field_c = field_c + 1;
            field_b[field_c] = param0.width;
            field_c = field_c + 1;
            field_b[field_c] = param0.height;
            field_c = field_c + 1;
            field_b[field_c] = param0.rgbBitCount;
            field_c = field_c + 1;
            field_b[field_c] = param0.refreshRate;
        }
    }
}
