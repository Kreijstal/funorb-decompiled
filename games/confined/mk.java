/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ai {
    static char[] field_n;
    static String field_k;
    static boolean field_l;
    static String field_m;
    static boolean field_o;

    mk(long param0, String param1) {
        super(param0, param1);
    }

    final static void a(String param0, boolean param1, float param2, int param3) {
        try {
          if (ui.field_c == null) {
            ui.field_c = new jj(TunnelCamera.field_Z, cb.field_b);
            TunnelCamera.field_Z.showDialog(ui.field_c, 0);
          }
          ui.field_c.a(-67, param1, param2, param0);
          SoftwareRasterizer.clearRaster();
          if (param3 > -34) {
            mk.b(41);
          }
          ProjectileRay.a((byte) 35, true);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "mk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void resetStaticState(int param0) {
        field_n = null;
        if (param0 < 71) {
          field_o = false;
          field_m = null;
          field_k = null;
          return;
        }
        field_m = null;
        field_k = null;
    }

    final si b(byte param0) {
        int var2 = 114 % ((param0 - 51) / 57);
        return BufferedSocket.field_c;
    }

    final static void b(int param0) {
        ud var1 = null;
        ud var1Lifetime1;
        if (param0 == 128) {
          var1 = (ud) (m.field_d.removeLast((byte) 87));
          if (var1 == null) {
            var1 = new ud();
          }
          var1.a(SoftwareRasterizer.field_c, SoftwareRasterizer.field_l, (byte) 90, SoftwareRasterizer.field_b, SoftwareRasterizer.field_g, SoftwareRasterizer.field_i, SoftwareRasterizer.field_j, SoftwareRasterizer.field_h);
          AccountRequestState.field_b.addLast((IntrusiveNode) (var1), (byte) 114);
          return;
        }
        field_m = (String) null;
        var1Lifetime1 = (ud) (m.field_d.removeLast((byte) 87));
        if (var1Lifetime1 == null) {
          var1Lifetime1 = new ud();
        }
        var1Lifetime1.a(SoftwareRasterizer.field_c, SoftwareRasterizer.field_l, (byte) 90, SoftwareRasterizer.field_b, SoftwareRasterizer.field_g, SoftwareRasterizer.field_i, SoftwareRasterizer.field_j, SoftwareRasterizer.field_h);
        AccountRequestState.field_b.addLast((IntrusiveNode) (var1Lifetime1), (byte) 114);
    }

    static {
        field_n = new char[128];
        field_m = "This password contains repeated characters, and would be easy to guess";
        field_k = "Instructions";
        field_l = false;
    }
}
