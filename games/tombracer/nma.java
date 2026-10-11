/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nma extends rra {
    static kra field_m;
    private int field_g;
    private int field_h;
    private int field_k;
    static java.awt.Canvas field_l;
    private int field_n;
    private int field_j;
    private int field_f;
    private int field_i;
    private int field_o;

    final void a(int param0, int param1, boolean param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var4 = this.field_j * param0 >> 12;
        int var5 = param1 * this.field_g >> 12;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        if (param2) {
          var6 = this.field_i * param0 >> 12;
          var7 = param1 * this.field_k >> 12;
          var8 = this.field_h * param0 >> 12;
          var9 = this.field_f * param1 >> 12;
          var10 = param0 * this.field_n >> 12;
          var11 = param1 * this.field_o >> 12;
          fm.a(var10, var6, var4, var9, this.field_b, var5, var11, var8, (byte) -110, var7);
          return;
        }
        this.field_n = 80;
        var6Lifetime1 = this.field_i * param0 >> 12;
        var7Lifetime1 = param1 * this.field_k >> 12;
        var8Lifetime1 = this.field_h * param0 >> 12;
        var9Lifetime1 = this.field_f * param1 >> 12;
        var10Lifetime1 = param0 * this.field_n >> 12;
        var11Lifetime1 = param1 * this.field_o >> 12;
        fm.a(var10Lifetime1, var6Lifetime1, var4, var9Lifetime1, this.field_b, var5, var11Lifetime1, var8Lifetime1, (byte) -110, var7Lifetime1);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = -95 / ((55 - param1) / 37);
    }

    nma(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        this.field_j = param0;
        this.field_n = param6;
        this.field_i = param2;
        this.field_g = param1;
        this.field_o = param7;
        this.field_h = param4;
        this.field_f = param5;
        this.field_k = param3;
    }

    public static void b(boolean param0) {
        if (param0) {
          field_m = (kra) null;
          field_l = null;
          field_m = null;
          return;
        }
        field_l = null;
        field_m = null;
    }

    final static int b(boolean param0, int param1) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (15 < param1) {
            var2 += 4;
            param1 = param1 >> 4;
          }
          if (param1 > 3) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (1 < param1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        if (!param0) {
          var2Lifetime1 = 2;
          if (param1 < -65536) {
            var2Lifetime1 += 16;
            param1 = param1 >> 16;
          }
          if (param1 < -256) {
            param1 = param1 >> 8;
            var2Lifetime1 += 8;
          }
          if (param1 < -16) {
            var2Lifetime1 += 4;
            param1 = param1 >> 4;
          }
          if (param1 < -4) {
            var2Lifetime1 += 2;
            param1 = param1 >> 2;
          }
          if (param1 < -2) {
            param1 = param1 >> 1;
            var2Lifetime1++;
          }
          return var2Lifetime1;
        }
        field_m = (kra) null;
        var2Lifetime2 = 2;
        if (param1 < -65536) {
          var2Lifetime2 += 16;
          param1 = param1 >> 16;
        }
        if (param1 < -256) {
          param1 = param1 >> 8;
          var2Lifetime2 += 8;
        }
        if (param1 < -16) {
          var2Lifetime2 += 4;
          param1 = param1 >> 4;
        }
        if (param1 < -4) {
          var2Lifetime2 += 2;
          param1 = param1 >> 2;
        }
        if (param1 < -2) {
          param1 = param1 >> 1;
          var2Lifetime2++;
        }
        return var2Lifetime2;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -117) {
          this.field_k = 96;
        }
    }

    static {
    }
}
