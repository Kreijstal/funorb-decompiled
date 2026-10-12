/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends IntrusiveNode {
    static int[] field_n;
    String field_l;
    static RgbSprite[] field_k;
    static int field_m;
    static String field_o;
    static TutorialController[] field_p;

    public static void a(int param0) {
        field_p = null;
        field_k = null;
        field_o = null;
        if (param0 != -22823) {
          rq.a(53);
          field_n = null;
          return;
        }
        field_n = null;
    }

    final static void a(byte param0) {
        fg var1 = (fg) (EventPresenter.field_q.c((byte) -121));
        if (var1 == null) {
          var1 = new fg();
        }
        if (param0 == -56) {
          var1.a(SoftwareRaster.clipBottom, SoftwareRaster.clipLeft, SoftwareRaster.clipRight, SoftwareRaster.pixels, SoftwareRaster.clipTop, SoftwareRaster.height, SoftwareRaster.width, -89);
          ParasiteEvent.field_y.addLast((byte) -119, (IntrusiveNode) (var1));
          return;
        }
    }

    final static void a(boolean param0) {
        IsaacRandom.field_g = new kd();
        if (param0) {
          rq.a((byte) 79);
          lt.field_g.a(IsaacRandom.field_g, (byte) 78);
          return;
        }
        lt.field_g.a(IsaacRandom.field_g, (byte) 78);
    }

    rq(String param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "rq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = ce.a(-68);
        field_o = "Invalid password.";
        field_p = new TutorialController[29];
    }
}
