/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh implements com.ms.directX.IEnumModesCallback {
    private com.ms.directX.DirectDraw field_a;
    private static int[] field_c;
    private static int field_b;

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        if (field_c == null) {
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

    public hh() {
        ((hh) this).field_a = new com.ms.directX.DirectDraw();
        ((hh) this).field_a.initialize((com.ms.com._Guid) null);
    }

    final void a(byte param0, java.awt.Frame param1) {
        ((hh) this).field_a.restoreDisplayMode();
        ((hh) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param1, 8);
        if (param0 != 54) {
            Object var4 = null;
            ((hh) this).a((byte) -64, (java.awt.Frame) null);
        }
    }

    final int[] a(byte param0) {
        int[] var2 = null;
        int[] var3 = null;
        ((hh) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_c = new int[field_b];
        field_b = 0;
        ((hh) this).field_a.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        if (param0 != 88) {
          field_c = null;
          var3 = field_c;
          var2 = var3;
          field_c = null;
          field_b = 0;
          return var3;
        } else {
          var3 = field_c;
          var2 = var3;
          field_c = null;
          field_b = 0;
          return var3;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, java.awt.Frame param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param4.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        int discarded$2 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$3 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((hh) this).field_a.setCooperativeLevel((java.awt.Component) (Object) param4, 17);
        if (param2 >= -64) {
          ((hh) this).field_a = null;
          ((hh) this).field_a.setDisplayMode(param0, param3, param1, param5, 0);
          param4.setBounds(0, 0, param0, param3);
          param4.toFront();
          param4.requestFocus();
          return;
        } else {
          ((hh) this).field_a.setDisplayMode(param0, param3, param1, param5, 0);
          param4.setBounds(0, 0, param0, param3);
          param4.toFront();
          param4.requestFocus();
          return;
        }
    }
}
