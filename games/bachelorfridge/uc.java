/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends pv {
    static sna field_l;
    static rga field_j;
    static int[] field_k;
    static nn field_m;

    private final void d(byte param0) {
        ((uc) this).field_f.field_y = -1;
        if (param0 <= 95) {
            uc.c((byte) -111);
        }
    }

    final static void d(int param0) {
        fj var1 = null;
        fj var1_ref = null;
        L0: {
          var1 = (fj) (Object) ii.field_m.a((byte) -124);
          if (var1 != null) {
            break L0;
          } else {
            var1_ref = new fj();
            break L0;
          }
        }
        if (param0 < 9) {
          uc.c((byte) -24);
          var1_ref.a(dg.field_f, dg.field_c, dg.field_k, dg.field_j, dg.field_h, dg.field_e, (byte) -92, dg.field_i);
          kma.field_o.a((bw) (Object) var1_ref, true);
          return;
        } else {
          var1_ref.a(dg.field_f, dg.field_c, dg.field_k, dg.field_j, dg.field_h, dg.field_e, (byte) -92, dg.field_i);
          kma.field_o.a((bw) (Object) var1_ref, true);
          return;
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          ((uc) this).field_g = ((uc) this).field_g + 1;
          if (((uc) this).field_g + 1 <= this.c(-31460)) {
            if ((((uc) this).field_g ^ -1) == -2) {
              ((uc) this).field_f.field_v.a((byte) 107, ((uc) this).field_f.field_g.field_o.field_b, 2);
              c.a(1220394217, ((uc) this).field_f.field_g.field_o.field_e);
              return false;
            } else {
              return false;
            }
          } else {
            this.d((byte) 100);
            return true;
          }
        } else {
          return true;
        }
    }

    final static void b(int param0) {
        if (param0 >= -4) {
            field_j = null;
        }
    }

    public static void c(byte param0) {
        field_l = null;
        field_j = null;
        int var1 = -100 / ((param0 - -36) / 61);
        field_m = null;
        field_k = null;
    }

    uc(jfa param0) {
        ((uc) this).field_f = param0;
    }

    private final int c(int param0) {
        if (param0 != -31460) {
            return 70;
        }
        return 240;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new rga();
        field_m = new nn();
    }
}
