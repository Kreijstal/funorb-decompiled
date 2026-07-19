/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    static int field_c;
    private ij field_a;
    static int field_d;
    private ij field_b;
    static int field_e;
    static byte[] field_f;

    final ij a(int param0) {
        ij var2 = null;
        var2 = this.field_b;
        if (var2 != this.field_a) {
          this.field_b = var2.field_j;
          if (param0 <= 82) {
            km.e(44);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_b = null;
          return null;
        }
    }

    final int c(int param0) {
        int var4 = CrazyCrystals.field_B;
        int var2 = param0;
        ij var3 = this.field_a.field_j;
        while (var3 != this.field_a) {
            var3 = var3.field_j;
            var2++;
        }
        return var2;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final void a(byte param0, ij param1) {
        if (param1.field_g != null) {
            param1.a(1);
        }
        param1.field_g = this.field_a.field_g;
        param1.field_j = this.field_a;
        if (param0 < 69) {
            return;
        }
        try {
            param1.field_g.field_j = param1;
            param1.field_j.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "km.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -95) {
            return true;
        }
        return !gk.field_e.b(-45) ? true : false;
    }

    final ij d(int param0) {
        ij var2 = null;
        if (param0 == -4425) {
          var2 = this.field_a.field_j;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.a(1);
            return var2;
          }
        } else {
          this.field_a = (ij) null;
          var2 = this.field_a.field_j;
          if (this.field_a == var2) {
            return null;
          } else {
            var2.a(1);
            return var2;
          }
        }
    }

    final ij b(int param0) {
        ij var2 = null;
        var2 = this.field_a.field_j;
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        } else {
          if (param0 <= 106) {
            this.field_b = (ij) null;
            this.field_b = var2.field_j;
            return var2;
          } else {
            this.field_b = var2.field_j;
            return var2;
          }
        }
    }

    public static void e(int param0) {
        field_f = null;
        if (param0 != 0) {
            field_f = (byte[]) null;
        }
    }

    public km() {
        this.field_a = new ij();
        this.field_a.field_j = this.field_a;
        this.field_a.field_g = this.field_a;
    }

    static {
    }
}
