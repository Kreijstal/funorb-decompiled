/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends pv {
    static UiComponent field_l;
    static rga field_j;
    static int[] field_k;
    static MouseInputHandler field_m;

    private final void d(byte param0) {
        this.field_f.field_y = -1;
        if (param0 <= 95) {
          uc.releaseStatics((byte) -111);
        }
    }

    final static void d(int param0) {
        fj var1 = (fj) (CreatureEvent.field_m.a((byte) -124));
        if (var1 == null) {
          var1 = new fj();
        }
        if (param0 >= 9) {
          var1.a(SoftwareRasterizer.field_f, SoftwareRasterizer.field_c, SoftwareRasterizer.field_k, SoftwareRasterizer.field_j, SoftwareRasterizer.field_h, SoftwareRasterizer.field_e, (byte) -92, SoftwareRasterizer.field_i);
          kma.field_o.a(var1, true);
          return;
        }
        uc.releaseStatics((byte) -24);
        var1.a(SoftwareRasterizer.field_f, SoftwareRasterizer.field_c, SoftwareRasterizer.field_k, SoftwareRasterizer.field_j, SoftwareRasterizer.field_h, SoftwareRasterizer.field_e, (byte) -92, SoftwareRasterizer.field_i);
        kma.field_o.a(var1, true);
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        int fieldTemp$0 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$0 > this.c(-31460)) {
          this.d((byte) 100);
          return true;
        }
        if (this.field_g != 1) {
          return false;
        }
        this.field_f.field_v.a((byte) 107, this.field_f.field_g.field_o.field_b, 2);
        c.a(1220394217, this.field_f.field_g.field_o.field_e);
        return false;
    }

    final static void b(int param0) {
        if (param0 >= -4) {
          field_j = (rga) null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_j = null;
        int var1 = -100 / ((param0 + 36) / 61);
        field_m = null;
        field_k = null;
    }

    uc(FridgeCreature param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final int c(int param0) {
        if (param0 != -31460) {
          return 70;
        }
        return 240;
    }

    static {
        field_j = new rga();
        field_m = new MouseInputHandler();
    }
}
