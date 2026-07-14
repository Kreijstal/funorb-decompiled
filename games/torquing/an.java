/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;
    private static int field_b;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (null == field_c) {
            field_b = field_b + 4;
        } else {
            field_b = field_b + 1;
            field_c[field_b] = param0.width;
            field_b = field_b + 1;
            field_c[field_b] = param0.height;
            field_b = field_b + 1;
            field_c[field_b] = param0.rgbBitCount;
            field_b = field_b + 1;
            field_c[field_b] = param0.refreshRate;
        }
    }

    public an() {
        ((an) this).field_a = new com.ms.directX.DirectDraw();
        ((an) this).field_a.initialize((com.ms.com._Guid) null);
    }

    final void a(byte param0, java.awt.Frame param1) {
        ((an) this).field_a.restoreDisplayMode();
        if (param0 != -102) {
          field_b = -91;
          ((an) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        } else {
          ((an) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        }
    }

    final void a(int param0, int param1, java.awt.Frame param2, int param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param2.setVisible(true);
        if (param4 != -4013) {
          return;
        } else {
          var7 = null;
          var8 = var7.getHwnd();
          int discarded$2 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
          int discarded$3 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
          ((an) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param2, 17);
          ((an) this).field_a.setDisplayMode(param1, param3, param5, param0, 0);
          param2.setBounds(0, 0, param1, param3);
          param2.toFront();
          param2.requestFocus();
          return;
        }
    }

    final int[] a(int param0) {
        int[] var2 = null;
        Object var3 = null;
        int[] var4 = null;
        ((an) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        ((an) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        if (param0 != 3152) {
          var3 = null;
          ((an) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
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
