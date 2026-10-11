/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    private ug field_a;
    static jd field_e;
    static tg field_d;
    static String field_c;
    static int[] field_f;
    private ug field_b;

    final static void e(int param0) {
        ge.field_c = 0;
        mh.field_Z = -1;
        nh.field_P = false;
        if (param0 == 8192) {
          ha.field_b = -1;
          oc.field_b = null;
          return;
        }
        field_f = (int[]) null;
        ha.field_b = -1;
        oc.field_b = null;
    }

    final int a(byte param0) {
        ug var3 = null;
        int var4 = Bounce.field_N;
        int var2 = 0;
        ug var3Lifetime1;
        if (param0 == 12) {
          var3 = this.field_a.field_l;
          while (var3 != this.field_a) {
            var3 = var3.field_l;
            var2++;
          }
          return var2;
        }
        field_e = (jd) null;
        var3Lifetime1 = this.field_a.field_l;
        while (var3Lifetime1 != this.field_a) {
          var3Lifetime1 = var3Lifetime1.field_l;
          var2++;
        }
        return var2;
    }

    final ug d(int param0) {
        ug var2 = this.field_a.field_l;
        if (param0 >= -74) {
          field_c = (String) null;
          if (var2 != this.field_a) {
            this.field_b = var2.field_l;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        if (var2 != this.field_a) {
          this.field_b = var2.field_l;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    final void a(byte param0, ug param1) {
        if (param1.field_i != null) {
          param1.a(92);
        }
        param1.field_l = this.field_a;
        param1.field_i = this.field_a.field_i;
        param1.field_i.field_l = param1;
        if (param0 != -78) {
          return;
        }
        try {
          param1.field_l.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ml.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ug a(int param0) {
        ug var2 = this.field_a.field_l;
        if (param0 != -1) {
          return (ug) null;
        }
        if (this.field_a != var2) {
          var2.a(param0 ^ -7);
          return var2;
        }
        return null;
    }

    public static void c(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        if (param0 != -1) {
          ml.c(53);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final ug b(int param0) {
        ug var2 = this.field_b;
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        }
        if (param0 == 0) {
          this.field_b = var2.field_l;
          return var2;
        }
        this.b(96);
        this.field_b = var2.field_l;
        return var2;
    }

    public ml() {
        this.field_a = new ug();
        this.field_a.field_i = this.field_a;
        this.field_a.field_l = this.field_a;
    }

    static {
        field_c = "Confirm Password: ";
        field_f = new int[8192];
    }
}
