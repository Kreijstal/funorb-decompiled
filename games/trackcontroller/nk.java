/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends IntrusiveNode {
    boolean field_k;
    static int field_l;
    int[] field_m;
    int field_i;
    static String field_j;

    final static void b(boolean param0) {
        vg var1 = (vg) (gd.field_q.removeLast((byte) -123));
        if (!param0) {
          if (var1 == null) {
            var1 = new vg();
          }
          var1.a(SoftwareRasterizer.field_g, SoftwareRasterizer.field_d, 11033, SoftwareRasterizer.field_i, SoftwareRasterizer.field_a, SoftwareRasterizer.field_e, SoftwareRasterizer.field_k, SoftwareRasterizer.field_b);
          cj.field_j.addLast((byte) -97, var1);
          return;
        }
        nk.d(-35);
        if (var1 == null) {
          var1 = new vg();
        }
        var1.a(SoftwareRasterizer.field_g, SoftwareRasterizer.field_d, 11033, SoftwareRasterizer.field_i, SoftwareRasterizer.field_a, SoftwareRasterizer.field_e, SoftwareRasterizer.field_k, SoftwareRasterizer.field_b);
        cj.field_j.addLast((byte) -97, var1);
    }

    final static void a(int param0, int param1) {
        la var2 = ra.field_C;
        var2.c(param0, 7);
        var2.writeByte(1, (byte) -70);
        var2.writeByte(2, (byte) -65);
        if (param1 < -85) {
          return;
        }
        field_j = (String) null;
    }

    public static void d(int param0) {
        if (param0 != 23985) {
          return;
        }
        field_j = null;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        String var4 = (String) null;
        jb.a((String) null, param0, param2, 0);
        int var3 = 88 % ((-51 - param1) / 44);
    }

    nk() {
    }

    static {
        field_l = -1;
        field_j = "Connection timed out. Please try using a different server.";
    }
}
