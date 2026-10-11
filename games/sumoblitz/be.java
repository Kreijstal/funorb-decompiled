/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends nt {
    static ki field_s;
    private boolean field_u;
    private static long[] field_v;
    static da field_t;

    final void a(ha param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var4Lifetime1;
        try {
          var3_int = (int)((double)this.field_p / 100.0 * 255.0);
          if (param1 > -121) {
            ha var5 = (ha) null;
            this.a((ha) null, 95);
          }
          var3_int += 20;
          var4 = 0;
          if (this.field_u) {
            var4Lifetime1 = (int)((double)(100 - this.field_p) / 100.0 * 4096.0);
          } else {
            var4Lifetime1 = (int)(4096.0 * ((double)this.field_p / 100.0));
          }
          vl.field_c.a((float)this.field_k, (float)this.field_o, var4Lifetime1, 0, 0, (var3_int << 24) + this.field_q, 1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "be.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        if (6407 != param1 &&
          param1 != 34843 &&
          param1 != 34837) {
          if (param0) {
            be.a(true, -56);
          }
          if (6408 != param1 &&
            param1 != 34842 &&
            34836 != param1) {
            if (6406 != param1 &&
              param1 != 34844) {
              if (param1 != 6409 &&
                param1 != 34846) {
                if (6410 != param1 &&
                  34847 != param1) {
                  if (param1 != 6402) {
                    throw new IllegalArgumentException("");
                  }
                  return 6402;
                }
                return 6410;
              }
              return 6409;
            }
            return 6406;
          }
          return 6408;
        }
        return 6407;
    }

    public static void e(int param0) {
        field_t = null;
        field_v = null;
        if (param0 != 6408) {
          field_t = (da) null;
        }
        field_s = null;
    }

    be(int param0, int param1, int param2, boolean param3) {
        super(100, param0, param1, param2);
        this.field_u = param3 ? true : false;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_v = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_v[var2] = var0;
        }
    }
}
