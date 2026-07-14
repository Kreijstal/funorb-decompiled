/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac implements com.ms.directX.IEnumModesCallback {
    private static int[] field_a;
    private com.ms.directX.DirectDraw field_b;
    private static int field_c;

    final int[] a(int param0) {
        int[] var2 = null;
        Object var3 = null;
        int[] var4 = null;
        ((ac) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        if (param0 != -7581) {
          var3 = null;
          ((ac) this).a((java.awt.Frame) null, 39);
          field_a = new int[field_c];
          field_c = 0;
          ((ac) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var4 = field_a;
          var2 = var4;
          field_a = null;
          field_c = 0;
          return var4;
        } else {
          field_a = new int[field_c];
          field_c = 0;
          ((ac) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var4 = field_a;
          var2 = var4;
          field_a = null;
          field_c = 0;
          return var4;
        }
    }

    final void a(java.awt.Frame param0, int param1) {
        ((ac) this).field_b.restoreDisplayMode();
        if (param1 <= 94) {
            return;
        }
        ((ac) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
    }

    public ac() {
        ((ac) this).field_b = new com.ms.directX.DirectDraw();
        ((ac) this).field_b.initialize((com.ms.com._Guid) null);
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null == field_a) {
            field_c = field_c + 4;
        } else {
            field_c = field_c + 1;
            field_a[field_c] = param0.width;
            field_c = field_c + 1;
            field_a[field_c] = param0.height;
            field_c = field_c + 1;
            field_a[field_c] = param0.rgbBitCount;
            field_c = field_c + 1;
            field_a[field_c] = param0.refreshRate;
        }
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, boolean param4, int param5) {
        param2.setVisible(param4);
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((ac) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param2, 17);
        ((ac) this).field_b.setDisplayMode(param0, param1, param5, param3, 0);
        param2.setBounds(0, 0, param0, param1);
        param2.toFront();
        param2.requestFocus();
    }
}
