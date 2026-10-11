/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends fc {
    int field_n;
    static int[] field_s;
    static int field_r;
    byte[][][] field_p;
    static int[] field_t;
    int[] field_u;
    int field_w;
    ce[] field_v;
    ce[] field_j;
    int[] field_m;
    int[] field_i;
    private static long[] field_q;
    static qj field_l;
    static int field_o;
    static int field_k;

    public static void b(boolean param0) {
        field_l = null;
        field_s = null;
        field_q = null;
        if (param0) {
          return;
        }
        field_t = null;
    }

    final static ng a(byte param0) {
        ng var1 = new ng(ab.field_a, qe.field_p, ka.field_f[0], vb.field_a[0], cf.field_p[0], j.field_f[0], qk.field_M[0], qe.field_z);
        if (param0 < 51) {
          return (ng) null;
        }
        ff.b(60);
        return var1;
    }

    final static void d(int param0) {
        if (-vi.field_c + 0 != fb.field_a &&
          -vi.field_c + 250 == fb.field_a) {
        }
        if (param0 != 250) {
          return;
        }
        fb.field_a = fb.field_a + 1;
    }

    final static nj a(String param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        nj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rk.field_X == oe.field_b) {
            stackIn_2_0 = null;
            return (nj) (stackIn_2_0);
          }
          if (param1 != 63) {
            var3 = (String) null;
            kj.a((String) null, 50);
          }
          if (rk.field_X == cj.field_e &&
            param0.equals(vh.field_p)) {
            rk.field_X = hf.field_f;
            stackIn_11_0 = fh.field_c;
            return stackIn_11_0;
          }
          vh.field_p = param0;
          fh.field_c = null;
          rk.field_X = oe.field_b;
          stackIn_9_0 = null;
          return (nj) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("kj.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (param0 >= -3) {
          kj.a((byte) 117);
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          var2 < 160) {
          var3 = h.field_e[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    kj() {
    }

    static {
        int var0_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var0;
        double var1;
        field_t = new int[104];
        field_r = 250;
        field_s = new int[104];
        for (var0_int = 0; var0_int < 104; var0_int++) {
          var1 = (double)var0_int * 3.141592653589793 / 52.0;
          field_s[var0_int] = (int)(13.0 * Math.sin(var1) + 0.5);
          field_t[var0_int] = (int)(13.0 * Math.cos(var1) + 0.5);
        }
        field_q = new long[256];
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if (1L == (1L & var0)) {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_q[var2] = var0;
        }
        field_o = -1;
        field_l = new qj(540, 140);
    }
}
