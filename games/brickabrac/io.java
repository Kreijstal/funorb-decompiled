/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io implements com.ms.directX.IEnumModesCallback {
    private static int field_b;
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;

    final void a(java.awt.Frame param0, int param1, int param2, int param3, int param4, int param5) {
        param0.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((io) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param0, 17);
        ((io) this).field_a.setDisplayMode(param2, param1, param5, param4, 0);
        param0.setBounds(0, param3, param2, param1);
        param0.toFront();
        param0.requestFocus();
    }

    final int[] a(byte param0) {
        int[] var2 = null;
        Object var3 = null;
        int[] var4 = null;
        ((io) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        ((io) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        var4 = field_c;
        var2 = var4;
        field_b = 0;
        field_c = null;
        if (param0 != -48) {
          var3 = null;
          ((io) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          return var4;
        } else {
          return var4;
        }
    }

    public io() {
        ((io) this).field_a = new com.ms.directX.DirectDraw();
        ((io) this).field_a.initialize((com.ms.com._Guid) null);
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

    final void a(int param0, java.awt.Frame param1) {
        if (param0 != -3887) {
          field_c = null;
          ((io) this).field_a.restoreDisplayMode();
          ((io) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        } else {
          ((io) this).field_a.restoreDisplayMode();
          ((io) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        }
    }
}
