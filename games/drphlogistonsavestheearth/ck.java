/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private double[] field_m;
    static long field_e;
    static int[] field_b;
    private double[] field_h;
    static td[] field_j;
    static boolean[] field_f;
    private double[] field_g;
    static nh field_l;
    static he[] field_k;
    static int field_c;
    private int[] field_a;
    private int[] field_i;
    static he[] field_d;

    final static void d(int param0) {
        if (!sg.field_a) {
          throw new IllegalStateException();
        }
        if (ol.field_a != null) {
          ol.field_a.d(true);
        }
        String var1 = gk.a(0);
        pi.field_O = new wa(var1, (String) null, true, false, false);
        if (param0 <= 71) {
          field_d = (he[]) null;
        }
        ng.field_c.a((byte) -112, (vg) (fb.field_e));
        fb.field_e.a(33, pi.field_O);
        fb.field_e.g((byte) -125);
    }

    final static boolean b(int param0) {
        int var2 = 0;
        lc var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        lc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4 = (lc) (g.field_t.h(-11151));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_r; var2++) {
            if (var4.field_n[var2] != null &&
              var4.field_n[var2].field_b == 0) {
              return false;
            }
            if (var4.field_o[var2] != null &&
              var4.field_o[var2].field_b == 0) {
              return false;
            }
          }
          if (param0 >= 4) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "ck.D(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var7;
        int var9;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var7 = 98 % ((53 - param3) / 48);
        for (var8 = 0; var8 < 9; var8++) {
          this.field_h[var8] = this.field_h[1 + var8] - (Math.random() + 0.25);
          if (0.0 < this.field_h[var8]) {
            this.field_m[var8] = this.field_m[1 + var8] + (-1.0 + 2.99 * Math.random());
            this.field_g[var8] = this.field_g[1 + var8] - (-3.0 + 2.0 * (Math.random() + Math.random() + Math.random()));
            this.field_i[var8] = this.field_i[var8 + 1];
            this.field_a[var8] = this.field_a[var8 + 1];
          }
        }
        this.field_m[9] = (double)param5;
        this.field_g[9] = (double)param0;
        this.field_i[9] = param2;
        this.field_h[9] = (double)param1;
        this.field_a[9] = param4;
    }

    final static h a(int param0, int param1, int param2, boolean param3) {
        h var4 = new h();
        var4.field_h = param0;
        var4.field_j = new int[param2];
        eg.field_c.a(var4, 255);
        if (!param3) {
          return (h) null;
        }
        bj.a(param1, -59, var4);
        return var4;
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        field_k = null;
        field_f = null;
        field_j = null;
        if (param0 != 7268) {
          field_f = (boolean[]) null;
        }
        field_d = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4;
        int var6;
        int var5;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -1) {
          ck.d(-119);
        }
        for (var2 = 0; var2 < 10; var2++) {
          var4 = this.field_i[var2];
          for (var3 = 0; var3 < 1; var3++) {
            vd.field_b[var3] = var4;
          }
          if (this.field_h[var2] >= 0.0) {
            var5 = this.field_a[var2];
            if (var5 == 0) {
              wj.c((int)this.field_m[var2], (int)this.field_g[var2], (int)this.field_h[var2], this.field_i[var2], 128);
            } else {
              if (var5 == 1) {
                wj.a((int)this.field_m[var2] << 4, (int)this.field_g[var2] << 4, (int)this.field_h[var2] << 4, 0, vd.field_b);
              }
            }
          }
        }
    }

    ck() {
        int var1 = 0;
        this.field_m = new double[10];
        this.field_g = new double[10];
        this.field_h = new double[10];
        this.field_a = new int[10];
        this.field_i = new int[10];
        for (var1 = 0; var1 < 10; var1++) {
          this.field_m[var1] = -1.0;
          this.field_g[var1] = -1.0;
          this.field_h[var1] = -1.0;
          this.field_i[var1] = -1;
          this.field_a[var1] = -1;
        }
    }

    static {
        field_j = new td[3];
        field_f = new boolean[112];
        field_b = new int[8192];
        field_c = 0;
    }
}
