/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uw extends DualLinkNode {
    static MusicTrack field_o;
    byte[] field_n;

    final static void e(int param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        try {
          var1 = new Sprite(540, 140);
          bu.a(0, var1);
          TriangleRasterizer.d();
          SoftwareRasterizer.clear();
          ur.field_d = 0;
          tc.b(-8144);
          var2 = var1.copy();
          if (param0 != 65536) {
            field_o = (MusicTrack) null;
          }
          for (var3 = 0; 15 > var3; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.a(4, 4, 0, 0, 540, 140);
          }
          rg.field_j.b();
          var1.drawHalfSize(0, 0);
          db.b(78);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uw.B(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != 6144) {
          field_o = (MusicTrack) null;
        }
    }

    final static void g(int param0) {
        TriangleRasterizer.field_d = false;
        TriangleRasterizer.b(1.0f);
        if (param0 > -127) {
          field_o = (MusicTrack) null;
        } else {
          TriangleRasterizer.d();
          mu.field_j = new int[]{0, 0, -270, 65536, 0, 0, 0, 69632, 0, 0, 0, 65536};
          lka.field_G = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          via.a(6144, (byte) 71);
          ft.a(6144, (byte) -128);
          ft.a(6144, (byte) -128);
          via.a(6144, (byte) 66);
          TriangleRasterizer.setProjectionCenter(320, 240);
          return;
        }
        TriangleRasterizer.d();
        mu.field_j = new int[]{0, 0, -270, 65536, 0, 0, 0, 69632, 0, 0, 0, 65536};
        lka.field_G = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        via.a(6144, (byte) 71);
        ft.a(6144, (byte) -128);
        ft.a(6144, (byte) -128);
        via.a(6144, (byte) 66);
        TriangleRasterizer.setProjectionCenter(320, 240);
    }

    uw(byte[] param0) {
        try {
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
