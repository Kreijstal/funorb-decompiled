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
        this.field_c.a(ln.field_F, (byte) -110, iw.field_c);
        if (param1 != 5744) {
            field_g = (String) null;
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            this.a(false, 60);
            return true;
        }
        return true;
    }

    final void a(int param0) {
        if (param0 < -4) {
          if (!this.field_f) {
            this.field_c.a(0, false, ej.field_c);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            return;
          } else {
            this.field_c.e(1, false);
            this.field_c.a(kga.field_o, (byte) 0);
            this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
            this.field_c.a(pea.field_c, 2, -21);
            this.field_c.a(0, false, ej.field_c);
            this.field_c.p((byte) -87);
            this.field_c.a(true, (iva) null);
            this.field_c.e(0, false);
            this.field_f = false;
            if (!TombRacer.field_G) {
              this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
              return;
            } else {
              this.field_c.a(0, false, ej.field_c);
              this.field_c.a(iw.field_c, (byte) -110, iw.field_c);
              return;
            }
          }
        } else {
          return;
        }
    }

    sl(eo param0) {
        super(param0);
        this.field_f = false;
    }

    final void a(int param0, boolean param1) {
        na var3 = null;
        int var4 = 0;
        asa var4_ref_asa = null;
        var3 = this.field_c.n(-79);
        if (var3 != null) {
          if (param1) {
            this.field_c.e(1, false);
            this.field_c.a(true, var3);
            this.field_c.a(gq.field_u, (byte) 0);
            this.field_c.e(1, false);
            this.field_c.a(ln.field_F, (byte) -110, r.field_m);
            this.field_c.a(lja.field_j, 2, -6219, true, false);
            this.field_c.a(0, false, tla.field_c);
            var4_ref_asa = this.field_c.C(0);
            var4_ref_asa.a(1217, this.field_c.c(true));
            this.field_c.a(cva.field_b, false);
            this.field_c.e(0, false);
            this.field_f = true;
            if (TombRacer.field_G) {
              this.field_c.a(0, false, tla.field_c);
              var4 = 19 % ((param0 - 41) / 62);
              return;
            } else {
              var4 = 19 % ((param0 - 41) / 62);
              return;
            }
          } else {
            this.field_c.a(0, false, tla.field_c);
            var4 = 19 % ((param0 - 41) / 62);
            return;
          }
        } else {
          this.field_c.a(0, false, tla.field_c);
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
        try {
            this.field_c.a(true, param1);
            if (param2 != 24595) {
                this.a(false, -34);
            }
            this.field_c.a((byte) -48, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
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
