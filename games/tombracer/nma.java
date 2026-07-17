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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var4 = ((nma) this).field_j * param0 >> 12;
        var5 = param1 * ((nma) this).field_g >> 12;
        if (!param2) {
          ((nma) this).field_n = 80;
          var6 = ((nma) this).field_i * param0 >> 12;
          var7 = param1 * ((nma) this).field_k >> 12;
          var8 = ((nma) this).field_h * param0 >> 12;
          var9 = ((nma) this).field_f * param1 >> 12;
          var10 = param0 * ((nma) this).field_n >> 12;
          var11 = param1 * ((nma) this).field_o >> 12;
          fm.a(var10, var6, var4, var9, ((nma) this).field_b, var5, var11, var8, (byte) -110, var7);
          return;
        } else {
          var6 = ((nma) this).field_i * param0 >> 12;
          var7 = param1 * ((nma) this).field_k >> 12;
          var8 = ((nma) this).field_h * param0 >> 12;
          var9 = ((nma) this).field_f * param1 >> 12;
          var10 = param0 * ((nma) this).field_n >> 12;
          var11 = param1 * ((nma) this).field_o >> 12;
          fm.a(var10, var6, var4, var9, ((nma) this).field_b, var5, var11, var8, (byte) -110, var7);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = -95 / ((55 - param1) / 37);
    }

    nma(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        ((nma) this).field_j = param0;
        ((nma) this).field_n = param6;
        ((nma) this).field_i = param2;
        ((nma) this).field_g = param1;
        ((nma) this).field_o = param7;
        ((nma) this).field_h = param4;
        ((nma) this).field_f = param5;
        ((nma) this).field_k = param3;
    }

    public static void b() {
        field_l = null;
        field_m = null;
    }

    final static int b(boolean param0, int param1) {
        int var2 = 0;
        if (!(param1 != 0)) {
            return 0;
        }
        if (param1 > 0) {
            var2 = 1;
            if (param1 > 65535) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (!(param1 <= 255)) {
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
            if (!(1 >= param1)) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        field_m = null;
        var2 = 2;
        if (!(param1 >= -65536)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (!(param1 >= -256)) {
            param1 = param1 >> 8;
            var2 += 8;
        }
        if (!(param1 >= -16)) {
            var2 += 4;
            param1 = param1 >> 4;
        }
        if (!(param1 >= -4)) {
            var2 += 2;
            param1 = param1 >> 2;
        }
        if (!(param1 >= -2)) {
            param1 = param1 >> 1;
            var2++;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -117) {
            ((nma) this).field_k = 96;
        }
    }

    static {
    }
}
