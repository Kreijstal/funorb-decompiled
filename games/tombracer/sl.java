/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends vw {
    private boolean field_f;
    static String[] field_h;
    static int[] field_e;
    static String field_d;
    static String field_g;

    public static void d(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_h = null;
        field_g = null;
    }

    final void a(boolean param0, int param1) {
        ((sl) this).field_c.a(ln.field_F, (byte) -110, iw.field_c);
        if (param1 != 5744) {
            field_g = null;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            ((sl) this).a(false, 60);
            return true;
        }
        return true;
    }

    final void a(int param0) {
        if (param0 < -4) {
          if (!((sl) this).field_f) {
            ((sl) this).field_c.a(0, false, ej.field_c);
            ((sl) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
            return;
          } else {
            ((sl) this).field_c.e(1, false);
            ((sl) this).field_c.a(kga.field_o, (byte) 0);
            ((sl) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
            ((sl) this).field_c.a(pea.field_c, 2, -21);
            ((sl) this).field_c.a(0, false, ej.field_c);
            ((sl) this).field_c.p((byte) -87);
            ((sl) this).field_c.a(true, (iva) null);
            ((sl) this).field_c.e(0, false);
            ((sl) this).field_f = false;
            ((sl) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
            return;
          }
        } else {
          return;
        }
    }

    sl(eo param0) {
        super(param0);
        ((sl) this).field_f = false;
    }

    final void a(int param0, boolean param1) {
        na var3 = null;
        int var4 = 0;
        asa var4_ref = null;
        var3 = ((sl) this).field_c.n(-79);
        if (var3 != null) {
          if (param1) {
            ((sl) this).field_c.e(1, false);
            ((sl) this).field_c.a(true, (iva) (Object) var3);
            ((sl) this).field_c.a(gq.field_u, (byte) 0);
            ((sl) this).field_c.e(1, false);
            ((sl) this).field_c.a(ln.field_F, (byte) -110, r.field_m);
            ((sl) this).field_c.a(lja.field_j, 2, -6219, true, false);
            ((sl) this).field_c.a(0, false, tla.field_c);
            var4_ref = ((sl) this).field_c.C(0);
            var4_ref.a(1217, (gda) (Object) ((sl) this).field_c.c(true));
            ((sl) this).field_c.a(cva.field_b, false);
            ((sl) this).field_c.e(0, false);
            ((sl) this).field_f = true;
            var4 = 19 % ((param0 - 41) / 62);
            return;
          } else {
            ((sl) this).field_c.a(0, false, tla.field_c);
            var4 = 19 % ((param0 - 41) / 62);
            return;
          }
        } else {
          ((sl) this).field_c.a(0, false, tla.field_c);
          var4 = 19 % ((param0 - 41) / 62);
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
            sl.d(125);
        }
    }

    final void a(int param0, iva param1, int param2) {
        ((sl) this).field_c.a(true, param1);
        if (param2 != 24595) {
          ((sl) this).a(false, -34);
          ((sl) this).field_c.a((byte) -48, param0);
          return;
        } else {
          ((sl) this).field_c.a((byte) -48, param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_e = new int[64];
        field_d = "Flamethrower";
        field_g = "Set up new game";
        for (var0 = 0; field_e.length > var0; var0++) {
            field_e[var0] = 255 * var0 / 64;
        }
    }
}
