/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private ln field_e;
    static uf field_h;
    static int field_f;
    static uf field_i;
    static int field_d;
    static int field_g;
    static ah field_b;
    static String field_a;
    private ln field_c;

    final void a(int param0, ln param1) {
        try {
            if (param1.field_l != null) {
                param1.a((byte) -42);
            }
            param1.field_n = this.field_e;
            param1.field_l = this.field_e.field_l;
            int var3_int = 36 / ((param0 - 35) / 56);
            param1.field_l.field_n = param1;
            param1.field_n.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ol.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        cg.a((byte) -119, false, param0);
        int var2 = 99 % ((param1 - -21) / 62);
    }

    final int a(int param0) {
        int var5 = HoldTheLine.field_D;
        int var3 = -20 % ((param0 - -63) / 42);
        int var2 = 0;
        ln var4 = this.field_e.field_n;
        while (this.field_e != var4) {
            var4 = var4.field_n;
            var2++;
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 6985) {
          field_i = (uf) null;
          field_i = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          return;
        }
    }

    final ln a(byte param0) {
        ln var2;
        int var3;
        var3 = -20 / ((32 - param0) / 51);
        var2 = this.field_e.field_n;
        if (this.field_e == var2) {
          return null;
        } else {
          var2.a((byte) -42);
          return var2;
        }
    }

    final static boolean b(byte param0) {
        if (param0 != 38) {
            field_i = (uf) null;
            return ra.field_Z.a(-42);
        }
        return ra.field_Z.a(-42);
    }

    final ln e(int param0) {
        ln var2;
        int var3;
        var3 = -90 / ((23 - param0) / 32);
        var2 = this.field_c;
        if (this.field_e == var2) {
          this.field_c = null;
          return null;
        } else {
          this.field_c = var2.field_n;
          return var2;
        }
    }

    final ln c(int param0) {
        ln var2 = null;
        if (param0 < 64) {
            ln var3 = (ln) null;
            this.a(-122, (ln) null);
            var2 = this.field_e.field_n;
            if (!(this.field_e != var2)) {
                this.field_c = null;
                return null;
            }
            this.field_c = var2.field_n;
            return var2;
        }
        var2 = this.field_e.field_n;
        if (!(this.field_e != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_n;
        return var2;
    }

    final static void a(int param0, ah param1) {
        try {
            param1.a(-30510, mm.field_e);
            if (param0 != 256) {
                field_d = 120;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ol.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(int param0) {
        if (param0 == 0) {
          if (!pj.b((byte) 87)) {
            if (0 < fc.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_f = 110;
          if (!pj.b((byte) 87)) {
            if (0 < fc.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public ol() {
        this.field_e = new ln();
        this.field_e.field_l = this.field_e;
        this.field_e.field_n = this.field_e;
    }

    static {
        field_d = 256;
        field_f = 0;
        field_b = new ah();
    }
}
