/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends ha {
    static String field_m;
    private long field_g;
    private long[] field_f;
    private int field_l;
    static k field_k;
    private long field_i;
    private int field_j;
    private long field_h;

    final void b(int param0) {
        this.field_g = 0L;
        if (this.field_h > this.field_i) {
          this.field_i = this.field_i + (-this.field_i + this.field_h);
        }
        if (param0 != 30752) {
          field_m = (String) null;
        }
    }

    private final long b(byte param0) {
        int var8 = 0;
        int var9 = Torquing.field_u;
        long var2 = System.nanoTime();
        long var4 = -this.field_g + var2;
        if (param0 != 103) {
          return -4L;
        }
        this.field_g = var2;
        if (-5000000000L < var4 &&
          5000000000L > var4) {
          this.field_f[this.field_j] = var4;
          this.field_j = (this.field_j + 1) % 10;
          if (this.field_l < 1) {
            this.field_l = this.field_l + 1;
          }
        }
        long var6 = 0L;
        for (var8 = 1; this.field_l >= var8; var8++) {
          var6 = var6 + this.field_f[(10 + (this.field_j - var8)) % 10];
        }
        return var6 / (long)this.field_l;
    }

    final int a(long param0, boolean param1) {
        int var4;
        int var5;
        var5 = Torquing.field_u;
        if (!param1) {
          return -63;
        }
        if (this.field_i < this.field_h) {
          this.field_g = this.field_g + (this.field_h - this.field_i);
          this.field_i = this.field_i + (-this.field_i + this.field_h);
          this.field_h = this.field_h + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_h = this.field_h + param0;
          var4++;
        } while (var4 < 10 &&
          this.field_h < this.field_i);
        if (this.field_i > this.field_h) {
          this.field_h = this.field_i;
        }
        return var4;
    }

    final static void a(wl param0, boolean param1, int param2) {
        if (param0 == null ||
          param0 == vd.field_c) {
          return;
        }
        try {
          param0.a(of.field_m * 64 / 160);
          if (param1) {
            param0.g();
          }
          if (null != vd.field_c) {
            ti.field_e.c(vd.field_c);
          }
          vd.field_c = param0;
          qd.field_b.e();
          if (param2 <= 117) {
            np.d(61);
          }
          ti.field_e.a(vd.field_c);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "np.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = ha.field_b;
        synchronized (var1) {
          if (param0 != -13) {
            np.d(-95);
          }
          if (q.field_g == mj.field_d) {
            return false;
          }
          e.field_f = ol.field_c[q.field_g];
          m.field_t = pe.field_H[q.field_g];
          q.field_g = 127 & 1 + q.field_g;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        mj var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Torquing.field_u;
        try {
          if (param0 > 0) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
              var8[var5_int] = param1[var5_int + param0];
            }
          } else {
            var4 = param1;
          }
          if (param3 > -68) {
            field_m = (String) null;
          }
          var5 = new mj();
          var5.a((byte) 0);
          var5.a(var4, (long)(param2 * 8), (byte) 95);
          var6 = new byte[64];
          var5.a(0, var6, 128);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("np.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var4;
        var4 = Torquing.field_u;
        if (param0 == -1) {
          if (null != j.field_a) {
            lj.a(j.field_a, (byte) -101);
            j.field_a = null;
          }
        } else {
          if (ig.field_r[param0] == null) {
            ig.field_r[param0] = nj.a(th.field_F[param0], 100, param2);
            ig.field_r[param0].d(-1);
          }
          if (j.field_a != ig.field_r[param0]) {
            if (null != j.field_a) {
              lj.a(j.field_a, (byte) -103);
            }
            ni.a(ig.field_r[param0], true);
            j.field_a = ig.field_r[param0];
          } else {
            ig.field_r[param0].i(param2);
          }
        }
        if (param1 != -32596) {
          field_m = (String) null;
        }
    }

    final long c(int param0) {
        if (param0 != 20520) {
          this.field_j = 53;
        }
        this.field_i = this.field_i + this.b((byte) 103);
        if (this.field_i < this.field_h) {
          return (-this.field_i + this.field_h) / 1000000L;
        }
        return 0L;
    }

    np() {
        this.field_f = new long[10];
        this.field_j = 0;
        this.field_l = 1;
        this.field_g = 0L;
        this.field_i = 0L;
        this.field_h = 0L;
        this.field_i = System.nanoTime();
        this.field_h = System.nanoTime();
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != 0) {
          field_m = (String) null;
        }
        field_m = null;
    }

    static {
        field_k = new k(1, 2, 2, 0);
    }
}
