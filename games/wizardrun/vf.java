/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends wl {
    int field_i;
    int field_k;
    static o[] field_j;

    final static ne a(byte param0) {
        int var1 = 61 / ((param0 - 19) / 39);
        return new ne(dg.a(-21), wj.g((byte) -115));
    }

    public static void b(boolean param0) {
        if (param0) {
            vf.a(99);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        var4 = wizardrun.field_H;
        cj.c();
        rl.field_b = 11;
        qk.field_f = new int[260];
        var1 = 0;
        L0: while (true) {
          if (-257 >= (var1 ^ -1)) {
            var5 = param0;
            var1 = var5;
            L1: while (true) {
              if (qk.field_f.length > var5) {
                qk.field_f[var5] = 255;
                var5++;
                continue L1;
              } else {
                return;
              }
            }
          } else {
            var2 = 15.0;
            qk.field_f[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
            var1++;
            continue L0;
          }
        }
    }

    private vf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
