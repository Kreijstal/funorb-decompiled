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
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = wizardrun.field_H;
        try {
          cj.c();
          rl.field_b = 11;
          qk.field_f = new int[260];
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            qk.field_f[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = param0;
          var1_intLifetime1 = var5;
          while (qk.field_f.length > var5) {
            qk.field_f[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "vf.A(" + param0 + ')');
        }
    }

    private vf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
