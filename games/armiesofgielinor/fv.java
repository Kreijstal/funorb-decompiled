/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_c;
    private static int[] field_b;
    private static int field_a;

    final int[] a(int param0) {
        ((fv) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_b = new int[field_a];
        field_a = 0;
        ((fv) this).field_c.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_b;
        int[] var2 = var3;
        field_a = param0;
        field_b = null;
        return var3;
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, int param4, boolean param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        if (param5) {
          return;
        } else {
          param2.setVisible(true);
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$2 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$3 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((fv) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param2, 17);
          ((fv) this).field_c.setDisplayMode(param4, param0, param3, param1, 0);
          param2.setBounds(0, 0, param4, param0);
          param2.toFront();
          param2.requestFocus();
          return;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        ((fv) this).field_c.restoreDisplayMode();
        ((fv) this).field_c.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        int var3 = -66 % ((59 - param0) / 46);
    }

    public fv() {
        ((fv) this).field_c = new com.ms.directX.DirectDraw();
        ((fv) this).field_c.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_b == null) {
            field_a = field_a + 4;
        } else {
            field_a = field_a + 1;
            field_b[field_a] = param0.width;
            field_a = field_a + 1;
            field_b[field_a] = param0.height;
            field_a = field_a + 1;
            field_b[field_a] = param0.rgbBitCount;
            field_a = field_a + 1;
            field_b[field_a] = param0.refreshRate;
        }
    }
}
