/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends mc {
    private int field_m;
    private long field_u;
    private long[] field_w;
    static la[] field_t;
    private int field_r;
    private long field_v;
    private long field_p;
    static int[] field_q;
    static String field_o;
    static boolean field_n;
    static int field_s;

    final static boolean c(int param0) {
        if (param0 != 2915) {
          vi.c((byte) 16);
        }
        return tf.field_f;
    }

    final static kk a(byte param0, ml param1) {
        int var7 = 0;
        kk stackIn_26_0 = null;
        kk stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        kk var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          var2_int = param1.l(8, 59);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = mu.a(param1, (byte) -39) ? 1 : 0;
          var4 = mu.a(param1, (byte) -39) ? 1 : 0;
          var5 = new kk();
          var5.field_b = (short)param1.l(16, 59);
          var5.field_f = nq.a(var5.field_f, param1, 16, -72);
          var5.field_r = nq.a(var5.field_r, param1, 16, -61);
          var5.field_P = nq.a(var5.field_P, param1, 16, -92);
          var5.field_g = (short)param1.l(16, 59);
          var5.field_n = nq.a(var5.field_n, param1, 16, 105);
          var5.field_z = nq.a(var5.field_z, param1, 16, 48);
          var5.field_T = nq.a(var5.field_T, param1, 16, 109);
          if (var3 != 0) {
            var5.field_k = (short)param1.l(16, 59);
            var5.field_F = nq.a(var5.field_F, param1, 16, -66);
            var5.field_I = nq.a(var5.field_I, param1, 16, 109);
            var5.field_v = nq.a(var5.field_v, param1, 16, -79);
            var5.field_M = nq.a(var5.field_M, param1, 16, 116);
            var5.field_U = nq.a(var5.field_U, param1, 16, -73);
            var5.field_l = nq.a(var5.field_l, param1, 16, -106);
          }
          if (var4 != 0) {
            param1.l(16, 59);
            var5.field_p = nq.a(var5.field_p, param1, 16, 116);
            var5.field_E = nq.a(var5.field_E, param1, 16, -104);
            var5.field_N = nq.a(var5.field_N, param1, 16, -76);
            var5.field_i = nq.a(var5.field_i, param1, 16, -65);
            var5.field_K = nq.a(var5.field_K, param1, 16, -87);
          }
          if (mu.a(param1, (byte) -39)) {
            var5.field_o = nq.a(var5.field_o, param1, 16, 106);
          }
          if (mu.a(param1, (byte) -39)) {
            var5.field_G = bp.a(2280703, param1, var5.field_G, 16);
            var6 = 0;
            for (var7 = 0; var5.field_G.length > var7; var7++) {
              if (var6 < (var5.field_G[var7] & 255)) {
                var6 = 255 & var5.field_G[var7];
              }
            }
            if (var6 != 0) {
              var5.field_u = (byte)(1 + var6);
            } else {
              var5.field_G = null;
            }
          }
          if (param0 > 54) {
            stackIn_28_0 = var5;
            return stackIn_28_0;
          }
          stackIn_26_0 = (kk) null;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("vi.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int[][] param2, byte[] param3) {
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = Kickabout.field_G;
        try {
          if (param1 < 123) {
            vi.c((byte) 59);
          }
          if (param2 == null) {
            return false;
          }
          var4_int = 0;
          L1: while (true) {
            if (var4_int >= param2.length) {
              return false;
            }
            var5 = param2[var4_int];
            var6 = 0;
            while (var6 < var5.length) {
              boolean decompiledFrameRemainder0 = true;
              var7 = var5[var6];
              var8 = var5[1 + var6];
              if (var7 == -1) {
                decompiledFrameRemainder0 = (var8 != param0);
              } else {
                decompiledFrameRemainder0 = (var8 != (255 & param3[var7]));
              }
              if (decompiledFrameRemainder0) {
                var4_int++;
                continue L1;
              }
              var6 += 2;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("vi.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        int var1;
        var1 = -1;
        if (param0 != -59) {
          field_t = (la[]) null;
        }
        if (null != um.field_e &&
          um.field_e.field_A) {
          var1 = um.field_e.field_B;
        } else {
          if (null != sr.field_l) {
            var1 = sr.field_l.f(123);
          }
        }
        if (-1 == var1) {
          return;
        }
        or.field_d.b(88, (byte) -46);
        or.field_d.a(127, var1);
        an.field_d = true;
    }

    final long b(byte param0) {
        this.field_p = this.field_p + this.a(false);
        if (param0 != -36) {
          field_n = true;
        }
        if (this.field_p < this.field_v) {
          return (-this.field_p + this.field_v) / 1000000L;
        }
        return 0L;
    }

    final void b(int param0) {
        this.field_u = 0L;
        if (param0 != -1) {
          field_s = -62;
        }
        if (this.field_v > this.field_p) {
          this.field_p = this.field_p + (-this.field_p + this.field_v);
        }
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        long var2 = System.nanoTime();
        long var4 = -this.field_u + var2;
        this.field_u = var2;
        if (var4 > -5000000000L &&
          5000000000L > var4) {
          this.field_w[this.field_m] = var4;
          this.field_m = (this.field_m + 1) % 10;
          if (this.field_r < 1) {
            this.field_r = this.field_r + 1;
          }
        }
        long var6 = 0L;
        if (param0) {
          return -97L;
        }
        for (var8 = 1; this.field_r >= var8; var8++) {
          var6 = var6 + this.field_w[(10 + this.field_m - var8) % 10];
        }
        return var6 / (long)this.field_r;
    }

    public static void d(int param0) {
        if (param0 < 4) {
          return;
        }
        field_t = null;
        field_q = null;
        field_o = null;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var4 = 78 % ((param0 - 45) / 63);
        if (this.field_p < this.field_v) {
          this.field_u = this.field_u + (this.field_v - this.field_p);
          this.field_p = this.field_p + (-this.field_p + this.field_v);
          this.field_v = this.field_v + param1;
          return 1;
        }
        var5 = 0;
        do {
          this.field_v = this.field_v + param1;
          var5++;
        } while (var5 < 10 &&
          this.field_v < this.field_p);
        if (this.field_p > this.field_v) {
          this.field_v = this.field_p;
        }
        return var5;
    }

    vi() {
        this.field_u = 0L;
        this.field_m = 0;
        this.field_r = 1;
        this.field_p = 0L;
        this.field_v = 0L;
        this.field_w = new long[10];
        this.field_p = System.nanoTime();
        this.field_v = System.nanoTime();
    }

    static {
        field_q = new int[4];
        field_t = new la[]{new la(0, 0, 896, 1344), new la(370, -45, 525, 1389, 0, 45)};
        field_n = false;
        field_o = "<%0>: Unread Chat";
    }
}
