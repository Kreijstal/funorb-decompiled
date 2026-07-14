/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl implements com.ms.directX.IEnumModesCallback {
    private static int field_c;
    private com.ms.directX.DirectDraw field_b;
    private static int[] field_a;

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

    public jl() {
        ((jl) this).field_b = new com.ms.directX.DirectDraw();
        ((jl) this).field_b.initialize((com.ms.com._Guid) null);
    }

    final int[] a(int param0) {
        ((jl) this).field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        field_a = new int[field_c];
        field_c = 0;
        ((jl) this).field_b.enumDisplayModes(param0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) this);
        int[] var3 = field_a;
        int[] var2 = var3;
        field_a = null;
        field_c = 0;
        return var3;
    }

    final void a(java.awt.Frame param0, byte param1) {
        ((jl) this).field_b.restoreDisplayMode();
        if (param1 >= -55) {
          field_a = null;
          ((jl) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
          return;
        } else {
          ((jl) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param0, 8);
          return;
        }
    }

    final void a(byte param0, int param1, int param2, java.awt.Frame param3, int param4, int param5) {
        com.ms.awt.WComponentPeer var7 = null;
        int var8 = 0;
        param3.setVisible(true);
        var7 = null;
        var8 = var7.getHwnd();
        int discarded$19 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$20 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        ((jl) this).field_b.setCooperativeLevel((java.awt.Component) (Object) param3, 17);
        ((jl) this).field_b.setDisplayMode(param1, param5, param4, param2, 0);
        param3.setBounds(0, 0, param1, param5);
        if (param0 <= 30) {
          return;
        } else {
          param3.toFront();
          param3.requestFocus();
          return;
        }
    }
}
