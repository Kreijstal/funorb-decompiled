/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk implements com.ms.directX.IEnumModesCallback {
    private static int field_a;
    private com.ms.directX.DirectDraw field_b;
    private static int[] field_c;

    final int[] a(byte param0) {
        int[] var2 = null;
        Object var3 = null;
        int[] var4 = null;
        ((pk) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_a];
        field_a = 0;
        if (param0 != 88) {
          var3 = null;
          ((pk) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          ((pk) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var4 = field_c;
          var2 = var4;
          field_c = null;
          field_a = 0;
          return var4;
        } else {
          ((pk) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var4 = field_c;
          var2 = var4;
          field_c = null;
          field_a = 0;
          return var4;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null != field_c) {
            field_a = field_a + 1;
            field_c[field_a] = param0.width;
            field_a = field_a + 1;
            field_c[field_a] = param0.height;
            field_a = field_a + 1;
            field_c[field_a] = param0.rgbBitCount;
            field_a = field_a + 1;
            field_c[field_a] = param0.refreshRate;
        } else {
            field_a = field_a + 4;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        ((pk) this).field_b.restoreDisplayMode();
        if (param0 < 101) {
          ((pk) this).field_b = null;
          ((pk) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        } else {
          ((pk) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        }
    }

    public pk() {
        ((pk) this).field_b = new com.ms.directX.DirectDraw();
        ((pk) this).field_b.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Frame param5) {
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, param4, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((pk) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param5, 17);
        ((pk) this).field_b.setDisplayMode(param3, param1, param2, param0, 0);
        param5.setBounds(0, 0, param3, param1);
        param5.toFront();
        param5.requestFocus();
    }
}
