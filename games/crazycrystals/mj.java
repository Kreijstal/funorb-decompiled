/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static String field_d;
    private int field_e;
    static dl[] field_f;
    int field_c;
    private int field_g;
    ma field_a;
    int field_b;

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        if (param0 != -64) {
          mj.a((byte) -53, false);
        }
    }

    final static void a(byte param0, boolean param1) {
        gk.field_e.a(-33, param1);
        if (param0 != -34) {
          mj.a((byte) -72);
        }
    }

    final dl b(byte param0) {
        if (param0 != 84) {
          field_f = (dl[]) null;
          if (this.field_e != 0) {
            return qn.field_e;
          }
          return ac.field_j;
        }
        if (this.field_e != 0) {
          return qn.field_e;
        }
        return ac.field_j;
    }

    final void a(int param0) {
        this.field_b = this.field_b + this.field_g;
        int var2 = 60 % ((param0 - 46) / 46);
        this.field_c = this.field_c + this.field_e;
    }

    final dl a(int param0, int param1) {
        int var4 = 0;
        int var3 = 0;
        dl var5 = null;
        int var6 = CrazyCrystals.field_B;
        dl var5Lifetime1;
        dl var5Lifetime2;
        dl var5Lifetime3;
        dl var5Lifetime4;
        dl var5Lifetime5;
        dl var5Lifetime1Lifetime1;
        if (1 == param1) {
          var4 = this.field_g;
          var3 = this.field_e;
        } else {
          var4 = -this.field_g;
          var3 = -this.field_e;
        }
        if (param0 != 13214) {
          field_f = (dl[]) null;
          if ((var4 | -this.field_e) < 0) {
            if ((-this.field_g | var3) >= 0) {
              var5 = jl.field_b;
              this.field_g = var3;
              this.field_e = var4;
              return var5;
            }
            var5 = en.field_M;
            this.field_g = var3;
            this.field_e = var4;
            return var5;
          }
          if ((var3 | -this.field_g) < 0) {
            var5Lifetime4 = ce.field_eb;
            this.field_g = var3;
            this.field_e = var4;
            return var5Lifetime4;
          }
          var5Lifetime5 = ai.field_b;
          this.field_g = var3;
          this.field_e = var4;
          return var5Lifetime5;
        }
        if ((var4 | -this.field_e) < 0) {
          if ((-this.field_g | var3) >= 0) {
            var5Lifetime1 = jl.field_b;
            this.field_g = var3;
            this.field_e = var4;
            return var5Lifetime1;
          }
          var5Lifetime1Lifetime1 = en.field_M;
          this.field_g = var3;
          this.field_e = var4;
          return var5Lifetime1Lifetime1;
        }
        if ((var3 | -this.field_g) < 0) {
          var5Lifetime2 = ce.field_eb;
          this.field_g = var3;
          this.field_e = var4;
          return var5Lifetime2;
        }
        var5Lifetime3 = ai.field_b;
        this.field_g = var3;
        this.field_e = var4;
        return var5Lifetime3;
    }

    mj(int param0, int param1, int param2, int param3) {
        this.field_a = null;
        this.field_e = param3;
        this.field_g = param2;
        this.field_b = param0;
        this.field_c = param1;
    }

    static {
        field_d = "Create a free Account";
    }
}
