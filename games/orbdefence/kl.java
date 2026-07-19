/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl implements com.ms.directX.IEnumModesCallback {
    private static int field_a;
    private static int[] field_c;
    private com.ms.directX.DirectDraw field_b;

    final int[] a(int param0) {
        int var2 = 89 % ((param0 - 6) / 37);
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        field_c = new int[field_a];
        field_a = 0;
        this.field_b.enumDisplayModes(0, (com.ms.directX.DDSurfaceDesc) null, (com.ms.com.IUnknown) null, (com.ms.directX.IEnumModesCallback) (this));
        int[] var3 = field_c;
        field_a = 0;
        field_c = null;
        return var3;
    }

    final void a(java.awt.Frame param0, byte param1) {
        this.field_b.restoreDisplayMode();
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param0), 8);
        if (param1 != 34) {
            java.awt.Frame var4 = (java.awt.Frame) null;
            this.a(19, -30, 102, 81, -108, (java.awt.Frame) null);
        }
    }

    public final void callbackEnumModes(com.ms.directX.DDSurfaceDesc param0, com.ms.com.IUnknown param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        if (field_c != null) {
            fieldTemp$1 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$1] = param0.width;
            fieldTemp$2 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$2] = param0.height;
            fieldTemp$3 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$3] = param0.rgbBitCount;
            fieldTemp$4 = field_a;
            field_a = field_a + 1;
            field_c[fieldTemp$4] = param0.refreshRate;
        } else {
            field_a = field_a + 4;
        }
    }

    public kl() {
        this.field_b = new com.ms.directX.DirectDraw();
        this.field_b.initialize((com.ms.com._Guid) null);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Frame param5) {
        param5.setVisible(true);
        com.ms.awt.WComponentPeer var7 = (com.ms.awt.WComponentPeer) null;
        int var8 = var7.getHwnd();
        int discarded$0 = com.ms.win32.User32.SetWindowLong(var8, -16, -2147483648);
        int discarded$1 = com.ms.win32.User32.SetWindowLong(var8, -20, 8);
        this.field_b.setCooperativeLevel((java.awt.Component) ((Object) param5), 17);
        this.field_b.setDisplayMode(param0, param4, param3, param1, 0);
        param5.setBounds(0, 0, param0, param4);
        param5.toFront();
        param5.requestFocus();
        int var9 = 32 / ((-72 - param2) / 34);
    }
}
