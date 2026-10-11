/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends uh {
    private int field_j;
    static String field_l;
    private long[] field_g;
    static String field_o;
    private long field_h;
    private long field_i;
    private long field_p;
    private int field_m;
    static oh field_k;
    static boolean field_n;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var7Lifetime3;
        int var8Lifetime7;
        int var8Lifetime3Lifetime1;
        var9 = TetraLink.field_J;
        if (en.field_K < 0) {
          return;
        }
        var3 = -135 + param0;
        var4 = -35 + param1;
        var5 = 256;
        if (en.field_K < 75) {
          var5 = (en.field_K << 8) / 75;
        }
        if (en.field_K > 200) {
          var5 = (-en.field_K + 250 << 8) / 50;
        }
        sk.a((byte) 115, cl.field_d);
        vn.b();
        ra.a();
        ni.a((byte) 71);
        if (var5 < 256) {
          ra.d(0, 0, ra.field_f, ra.field_e, 0, -var5 + 256);
        }
        var6 = -23 / ((param2 + 17) / 41);
        dh.a(-581);
        if (en.field_K >= 150) {
          a.field_c.a(var3 + 15, var4 + 10, var5);
          var7 = -125 + en.field_K;
          if (0 < var7 &&
            var7 < 50) {
            if (var7 < 20) {
              var8 = var7 * 256 / 20;
              oi.field_e.b(var3, var4, var8);
            } else {
              if (var7 < 30) {
                oi.field_e.b(var3, var4, 256);
              } else {
                var8 = (12800 - var7 * 256) / 20;
                oi.field_e.b(var3, var4, var8);
              }
            }
          }
          var7Lifetime3 = en.field_K - 140;
          if (var7Lifetime3 > 0) {
            var8Lifetime7 = 256;
            if (var7Lifetime3 < 20) {
              var8Lifetime7 = 256 * var7Lifetime3 / 20;
            }
            h.field_c.a(var3 + 15, var4 + 10, var8Lifetime7 * var5 >> 8);
          }
          return;
        }
        cl.field_d.d(var3, var4);
        var7Lifetime1 = -125 + en.field_K;
        if (0 >= var7Lifetime1) {
          var7Lifetime1 = en.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime1 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime1 = 256 * var7Lifetime1 / 20;
            }
            h.field_c.a(var3 + 15, var4 + 10, var8Lifetime1 * var5 >> 8);
          }
          return;
        }
        if (var7Lifetime1 >= 50) {
          var7Lifetime1 = en.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime2 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime2 = 256 * var7Lifetime1 / 20;
            }
            h.field_c.a(var3 + 15, var4 + 10, var8Lifetime2 * var5 >> 8);
          }
          return;
        }
        if (var7Lifetime1 < 20) {
          var8Lifetime3 = var7Lifetime1 * 256 / 20;
          oi.field_e.b(var3, var4, var8Lifetime3);
          var7Lifetime1 = en.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime3Lifetime1 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime3Lifetime1 = 256 * var7Lifetime1 / 20;
            }
            h.field_c.a(var3 + 15, var4 + 10, var8Lifetime3Lifetime1 * var5 >> 8);
          }
          return;
        }
        if (var7Lifetime1 < 30) {
          oi.field_e.b(var3, var4, 256);
          var7Lifetime1 = en.field_K - 140;
          if (var7Lifetime1 > 0) {
            var8Lifetime4 = 256;
            if (var7Lifetime1 < 20) {
              var8Lifetime4 = 256 * var7Lifetime1 / 20;
            }
            h.field_c.a(var3 + 15, var4 + 10, var8Lifetime4 * var5 >> 8);
          }
          return;
        }
        var8Lifetime5 = (12800 - var7Lifetime1 * 256) / 20;
        oi.field_e.b(var3, var4, var8Lifetime5);
        var7Lifetime2 = en.field_K - 140;
        if (var7Lifetime2 > 0) {
          var8Lifetime6 = 256;
          if (var7Lifetime2 < 20) {
            var8Lifetime6 = 256 * var7Lifetime2 / 20;
          }
          h.field_c.a(var3 + 15, var4 + 10, var8Lifetime6 * var5 >> 8);
        }
        return;
    }

    final static String a(byte param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == param2) {
            stackIn_2_0 = le.field_Lb;
            return stackIn_2_0;
          }
          if (param2 == 6) {
            stackIn_5_0 = al.field_l;
            return stackIn_5_0;
          }
          if (param0 < 54) {
            stackIn_8_0 = (String) null;
            return stackIn_8_0;
          }
          if (param2 == 7) {
            stackIn_11_0 = na.field_q;
            return stackIn_11_0;
          }
          if (8 == param2) {
            stackIn_14_0 = fl.field_h;
            return stackIn_14_0;
          }
          if (param2 == 9) {
            stackIn_18_0 = p.field_c;
            return stackIn_18_0;
          }
          if (param2 == 10) {
            stackIn_22_0 = gd.field_ec;
            return stackIn_22_0;
          }
          if (11 == param2) {
            stackIn_25_0 = lf.field_a;
            return stackIn_25_0;
          }
          if (param2 != 14) {
            return null;
          }
          stackIn_29_0 = sk.a(new String[]{param1}, bk.field_l, 127);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("ef.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(long param0, byte param1) {
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        if (param1 != 52) {
          return -121;
        }
        if (this.field_i > this.field_p) {
          this.field_h = this.field_h + (this.field_i - this.field_p);
          this.field_p = this.field_p + (-this.field_p + this.field_i);
          this.field_i = this.field_i + param0;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_i = this.field_i + param0;
        } while (var4 < 10 &&
          this.field_i < this.field_p);
        if (this.field_p <= this.field_i) {
          return var4;
        }
        this.field_i = this.field_p;
        return var4;
    }

    final long b(byte param0) {
        this.field_p = this.field_p + this.a(true);
        if (param0 >= -13) {
          this.field_m = 57;
          if (this.field_p < this.field_i) {
            return (this.field_i - this.field_p) / 1000000L;
          }
          return 0L;
        }
        if (this.field_p < this.field_i) {
          return (this.field_i - this.field_p) / 1000000L;
        }
        return 0L;
    }

    private final long a(boolean param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = TetraLink.field_J;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param0) {
          return 35L;
        }
        long var2 = System.nanoTime();
        long var4 = -this.field_h + var2;
        this.field_h = var2;
        if (-5000000000L >= var4) {
          var6 = 0L;
          for (var8 = 1; this.field_m >= var8; var8++) {
            var6 = var6 + this.field_g[(10 + this.field_j - var8) % 10];
          }
          return var6 / (long)this.field_m;
        }
        if (5000000000L <= var4) {
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = 1; this.field_m >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_g[(10 + this.field_j - var8Lifetime1) % 10];
          }
          return var6Lifetime1 / (long)this.field_m;
        }
        this.field_g[this.field_j] = var4;
        this.field_j = (1 + this.field_j) % 10;
        if (this.field_m >= 1) {
          var6Lifetime2 = 0L;
          for (var8Lifetime2 = 1; this.field_m >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_g[(10 + this.field_j - var8Lifetime2) % 10];
          }
          return var6Lifetime2 / (long)this.field_m;
        }
        this.field_m = this.field_m + 1;
        var6Lifetime3 = 0L;
        for (var8Lifetime3 = 1; this.field_m >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_g[(10 + this.field_j - var8Lifetime3) % 10];
        }
        return var6Lifetime3 / (long)this.field_m;
    }

    final void a(int param0) {
        if (param0 <= 87) {
          this.b((byte) 107);
          this.field_h = 0L;
          if (this.field_i > this.field_p) {
            this.field_p = this.field_p + (-this.field_p + this.field_i);
            return;
          }
          return;
        }
        this.field_h = 0L;
        if (this.field_i <= this.field_p) {
          return;
        }
        this.field_p = this.field_p + (-this.field_p + this.field_i);
    }

    public static void c(int param0) {
        field_l = null;
        field_o = null;
        if (param0 > -14) {
          return;
        }
        field_k = null;
    }

    ef() {
        this.field_j = 0;
        this.field_g = new long[10];
        this.field_h = 0L;
        this.field_m = 1;
        this.field_i = 0L;
        this.field_p = 0L;
        this.field_p = System.nanoTime();
        this.field_i = System.nanoTime();
    }

    static {
        field_o = "<%0>'s turn (<%1>)";
        field_l = "<%0>'s turn";
    }
}
