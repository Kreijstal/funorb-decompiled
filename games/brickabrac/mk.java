/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private tk field_f;
    private int field_k;
    private long field_g;
    private int field_h;
    private tk[] field_e;
    static long field_j;
    private tk field_d;
    static int[] field_b;
    static String[][] field_c;
    static java.applet.Applet field_i;
    static String field_a;

    final tk a(long param0, int param1) {
        tk var4;
        tk var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        this.field_g = param0;
        var4 = this.field_e[(int)((long)(this.field_k + param1) & param0)];
        this.field_d = var4.field_s;
        while (true) {
          if (this.field_d == var4) {
            this.field_d = null;
            return null;
          }
          if (param0 != this.field_d.field_j) {
            this.field_d = this.field_d.field_s;
            continue;
          }
          break;
        }
        var5 = this.field_d;
        this.field_d = this.field_d.field_s;
        return var5;
    }

    final tk a(byte param0) {
        tk var2;
        int var3_int;
        tk var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_d) {
          return null;
        }
        var2 = this.field_e[(int)((long)(this.field_k - 1) & this.field_g)];
        while (true) {
          if (this.field_d == var2) {
            var3_int = 61 / ((param0 - 37) / 63);
            this.field_d = null;
            return null;
          }
          if (this.field_g != this.field_d.field_j) {
            this.field_d = this.field_d.field_s;
            continue;
          }
          break;
        }
        var3 = this.field_d;
        this.field_d = this.field_d.field_s;
        return var3;
    }

    final tk a(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        tk var4;
        tk var5;
        tk var36;
        tk var37;
        tk var38;
        tk var39;
        tk var42;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          if (0 >= this.field_h) {
            do {
              if (this.field_k <= this.field_h) {
                return null;
              }
              fieldTemp$1 = this.field_h;
              this.field_h = this.field_h + 1;
              var4 = this.field_e[fieldTemp$1].field_s;
              var38 = var4;
            } while (var4 == this.field_e[-1 + this.field_h]);
            this.field_f = var38.field_s;
            return var38;
          }
          if (this.field_e[-1 + this.field_h] != this.field_f) {
            var42 = this.field_f;
            this.field_f = var42.field_s;
            return var42;
          }
          do {
            if (this.field_k <= this.field_h) {
              return null;
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_e[fieldTemp$0].field_s;
            var39 = var4;
          } while (var4 == this.field_e[-1 + this.field_h]);
          this.field_f = var39.field_s;
          return var39;
        }
        this.a(31L, -107);
        if (0 >= this.field_h) {
          do {
            if (this.field_k <= this.field_h) {
              return null;
            }
            fieldTemp$3 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_e[fieldTemp$3].field_s;
            var5 = var4;
          } while (var4 == this.field_e[-1 + this.field_h]);
          this.field_f = var5.field_s;
          return var5;
        }
        if (this.field_e[-1 + this.field_h] != this.field_f) {
          var36 = this.field_f;
          this.field_f = var36.field_s;
          return var36;
        }
        do {
          if (this.field_k <= this.field_h) {
            return null;
          }
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          var4 = this.field_e[fieldTemp$2].field_s;
          var37 = var4;
        } while (var4 == this.field_e[-1 + this.field_h]);
        this.field_f = var37.field_s;
        return var37;
    }

    final tk b(byte param0) {
        this.field_h = 0;
        if (param0 <= 57) {
          return (tk) null;
        }
        return this.a(false);
    }

    final static void a(int param0) {
        if (param0 == -1) {
          return;
        }
        mk.c((byte) 88);
    }

    final void a(long param0, tk param1, int param2) {
        if (null != param1.field_n) {
          param1.d(3);
        }
        tk var5 = this.field_e[(int)(param0 & (long)(-1 + this.field_k))];
        param1.field_n = var5.field_n;
        param1.field_s = var5;
        param1.field_n.field_s = param1;
        if (param2 <= 38) {
          return;
        }
        try {
          param1.field_s.field_n = param1;
          param1.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "mk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_c = (String[][]) null;
        field_b = null;
        field_a = null;
        if (param0 > 47) {
          return;
        }
        field_i = (java.applet.Applet) null;
    }

    mk(int param0) {
        int var2 = 0;
        tk dupTemp$1 = null;
        tk var3;
        this.field_h = 0;
        this.field_e = new tk[param0];
        this.field_k = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new tk();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.field_n = var3;
          var3.field_s = var3;
        }
    }

    static {
        field_b = Ball.d(8);
        field_a = "Wipe out: cancels out any positive power-ups.";
    }
}
