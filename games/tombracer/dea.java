/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dea {
    static mb field_a;
    private float field_d;
    static boolean field_c;
    private float field_b;
    private boolean field_f;
    private float field_e;

    final void d(int param0) {
        if (param0 != 31990) {
          return;
        }
        this.field_b = this.field_e;
        this.field_d = 0.0f;
    }

    final static String a(int param0, byte param1) {
        String var8 = null;
        String var9 = null;
        String var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var2 = param0 * 20;
        int var3 = var2 / 10;
        int var4 = var2 / 1000;
        int var5 = var4 / 60;
        String var6Lifetime1;
        String var6Lifetime2;
        String var6Lifetime3;
        String var6Lifetime4;
        var3 = var3 % 100;
        if (param1 == -8) {
          var4 = var4 % 60;
          if (10 > var5) {
            var6 = "0" + var5;
          } else {
            var6 = "" + var5;
          }
          var8 = var6 + ":";
          var6Lifetime1 = var8;
          var6Lifetime2 = var8;
          if (var4 < 10) {
            var6Lifetime3 = var8 + "0" + var4;
          } else {
            var6Lifetime3 = var8 + var4;
          }
          var9 = var6Lifetime3 + ".";
          if (10 > var3) {
            var6Lifetime4 = var9 + "0" + var3;
          } else {
            var6Lifetime4 = var9 + var3;
          }
          return var6Lifetime4;
        }
        return (String) null;
    }

    final boolean b(int param0) {
        float var2 = this.field_e - this.field_b;
        if (param0 != 20) {
          field_c = true;
          if (!(this.field_d * this.field_d > var2 * var2)) {
            return false;
          }
          if (0.10000000149011612f > this.field_d * this.field_d) {
            return true;
          }
          return false;
        }
        if (!(this.field_d * this.field_d > var2 * var2)) {
          return false;
        }
        if (0.10000000149011612f > this.field_d * this.field_d) {
          return true;
        }
        return false;
    }

    final void a(byte param0, boolean param1, boolean param2) {
        float var4;
        float var4Lifetime1;
        if (param0 <= -109) {
          var4 = (float)koa.b(0) / 500.0f;
          this.field_d = this.field_d + var4 * var4;
          this.field_b = this.field_b + this.field_d;
          if (param1 &&
            param2) {
            this.field_d = 0.0f;
            this.field_b = this.field_e;
          }
          if (!(this.field_b > this.field_e)) {
            return;
          }
          if (param2) {
            return;
          }
          if (!this.field_f) {
            paa.c(141);
            this.field_f = true;
          }
          this.field_d = -this.field_d / 8.0f;
          this.field_b = this.field_e;
          return;
        }
        this.c(-29);
        var4Lifetime1 = (float)koa.b(0) / 500.0f;
        this.field_d = this.field_d + var4Lifetime1 * var4Lifetime1;
        this.field_b = this.field_b + this.field_d;
        if (param1 &&
          param2) {
          this.field_d = 0.0f;
          this.field_b = this.field_e;
        }
        if (!(this.field_b > this.field_e)) {
          return;
        }
        if (param2) {
          return;
        }
        if (!this.field_f) {
          paa.c(141);
          this.field_f = true;
        }
        this.field_d = -this.field_d / 8.0f;
        this.field_b = this.field_e;
    }

    final void c(int param0) {
        this.field_f = false;
        this.field_d = 0.0f;
        if (param0 <= -47) {
          this.field_b = this.field_e - (float)koa.b(0) - (float)Math.abs((int)(Math.random() * (double)koa.b(0)));
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == 60) {
          if (oba.field_e != null) {
            oba.field_e.a((byte) 105);
            oba.field_e = null;
          }
          return;
        }
        field_a = (mb) null;
        if (oba.field_e != null) {
          oba.field_e.a((byte) 105);
          oba.field_e = null;
        }
    }

    final int e(int param0) {
        int var2 = -25 % ((param0 + 41) / 39);
        return (int)this.field_b;
    }

    public dea() {
        this(0);
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_a = (mb) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    dea(int param0) {
        this.field_e = (float)param0;
        this.c(-125);
    }

    static {
        field_c = true;
    }
}
