/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int field_b;
    static int field_f;
    static String field_a;
    static String field_c;
    private rk field_h;
    private long field_g;
    private rk[] field_d;
    private int field_e;

    final void a(rk param0, long param1, int param2) {
        rk var5 = null;
        if (param2 <= 103) {
          return;
        }
        try {
          if (param0.field_l != null) {
            param0.b(false);
          }
          var5 = this.field_d[(int)((long)(this.field_e - 1) & param1)];
          param0.field_i = var5;
          param0.field_l = var5.field_l;
          param0.field_l.field_i = param0;
          param0.field_i.field_l = param0;
          param0.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "jd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final rk a(boolean param0) {
        rk var3 = null;
        int var4 = wizardrun.field_H;
        rk var3Lifetime1;
        if (this.field_h == null) {
          return null;
        }
        rk var2 = this.field_d[(int)((long)(this.field_e - 1) & this.field_g)];
        if (!param0) {
          while (this.field_h != var2) {
            if (~this.field_h.field_o == ~this.field_g) {
              var3 = this.field_h;
              this.field_h = this.field_h.field_i;
              return var3;
            }
            this.field_h = this.field_h.field_i;
          }
          this.field_h = null;
          return null;
        }
        this.field_h = (rk) null;
        while (this.field_h != var2) {
          if (~this.field_h.field_o == ~this.field_g) {
            var3Lifetime1 = this.field_h;
            this.field_h = this.field_h.field_i;
            return var3Lifetime1;
          }
          this.field_h = this.field_h.field_i;
        }
        this.field_h = null;
        return null;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == -1) {
          return;
        }
        field_b = 86;
    }

    final rk a(long param0, byte param1) {
        rk var5 = null;
        int var6 = wizardrun.field_H;
        rk var5Lifetime1;
        this.field_g = param0;
        rk var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_e))];
        this.field_h = var4.field_i;
        if (param1 >= 96) {
          while (var4 != this.field_h) {
            if (~param0 == ~this.field_h.field_o) {
              var5 = this.field_h;
              this.field_h = this.field_h.field_i;
              return var5;
            }
            this.field_h = this.field_h.field_i;
          }
          this.field_h = null;
          return null;
        }
        jd.a(-102);
        while (var4 != this.field_h) {
          if (~param0 == ~this.field_h.field_o) {
            var5Lifetime1 = this.field_h;
            this.field_h = this.field_h.field_i;
            return var5Lifetime1;
          }
          this.field_h = this.field_h.field_i;
        }
        this.field_h = null;
        return null;
    }

    jd(int param0) {
        int var2 = 0;
        rk dupTemp$1 = null;
        rk var3;
        this.field_d = new rk[param0];
        this.field_e = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new rk();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.field_i = var3;
          var3.field_l = var3;
        }
    }

    static {
        field_b = 64;
        field_a = "Music";
        field_c = "To defeat the boss hit";
    }
}
