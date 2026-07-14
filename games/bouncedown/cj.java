/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements com.ms.directX.IEnumModesCallback {
    private static int field_c;
    private com.ms.directX.DirectDraw field_b;
    private static int[] field_a;

    public cj() {
        ((cj) this).field_b = new com.ms.directX.DirectDraw();
        ((cj) this).field_b.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, boolean param1, int param2, java.awt.Frame param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        Object var9 = null;
        param3.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((cj) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
        ((cj) this).field_b.setDisplayMode(param2, param4, param5, param0, 0);
        param3.setBounds(0, 0, param2, param4);
        if (param1) {
          var9 = null;
          ((cj) this).a(-57, (java.awt.Frame) null);
          param3.toFront();
          param3.requestFocus();
          return;
        } else {
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }

    final int[] a(boolean param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((cj) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_c];
        field_c = 0;
        if (!param0) {
          return null;
        } else {
          ((cj) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
          var3 = field_a;
          var2 = var3;
          field_a = null;
          field_c = 0;
          return var3;
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_a != null) {
            field_c = field_c + 1;
            field_a[field_c] = param0.width;
            field_c = field_c + 1;
            field_a[field_c] = param0.height;
            field_c = field_c + 1;
            field_a[field_c] = param0.rgbBitCount;
            field_c = field_c + 1;
            field_a[field_c] = param0.refreshRate;
        } else {
            field_c = field_c + 4;
        }
    }

    final void a(int param0, java.awt.Frame param1) {
        Object var4 = null;
        ((cj) this).field_b.restoreDisplayMode();
        if (param0 <= 54) {
          var4 = null;
          ((cj) this).callbackEnumModes((com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null);
          ((cj) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        } else {
          ((cj) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
          return;
        }
    }
}
