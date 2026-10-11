/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends hm {
    private long[] field_k;
    static int field_h;
    static String field_d;
    private int field_e;
    private long field_g;
    private long field_n;
    private long field_l;
    static km field_j;
    static String field_f;
    private int field_m;
    static String field_i;

    public static void f(int param0) {
        field_i = null;
        int var1 = 62 / ((param0 + 15) / 37);
        field_j = null;
        field_f = null;
        field_d = null;
    }

    final void d(int param0) {
        if (param0 == 110) {
          this.field_l = 0L;
          if (this.field_n > this.field_g) {
            this.field_g = this.field_g + (-this.field_g + this.field_n);
          }
          return;
        }
    }

    final static void e(int param0) {
        if (param0 != 1) {
          return;
        }
        tn.a(111);
        co.a(0);
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    private final long b(byte param0) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = Virogrid.field_F ? 1 : 0;
        int var4 = 51 % ((0 - param0) / 51);
        long var2 = System.nanoTime();
        long var5 = -this.field_l + var2;
        long var7Lifetime1;
        long var7Lifetime2;
        long var7Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        this.field_l = var2;
        if (-5000000000L >= var5) {
          var7 = 0L;
          for (var9 = 1; this.field_m >= var9; var9++) {
            var7 = var7 + this.field_k[(-var9 + (this.field_e + 10)) % 10];
          }
          return var7 / (long)this.field_m;
        }
        if (var5 >= 5000000000L) {
          var7Lifetime1 = 0L;
          for (var9Lifetime1 = 1; this.field_m >= var9Lifetime1; var9Lifetime1++) {
            var7Lifetime1 = var7Lifetime1 + this.field_k[(-var9Lifetime1 + (this.field_e + 10)) % 10];
          }
          return var7Lifetime1 / (long)this.field_m;
        }
        this.field_k[this.field_e] = var5;
        this.field_e = (1 + this.field_e) % 10;
        if (this.field_m < 1) {
          this.field_m = this.field_m + 1;
          var7Lifetime2 = 0L;
          for (var9Lifetime2 = 1; this.field_m >= var9Lifetime2; var9Lifetime2++) {
            var7Lifetime2 = var7Lifetime2 + this.field_k[(-var9Lifetime2 + (this.field_e + 10)) % 10];
          }
          return var7Lifetime2 / (long)this.field_m;
        }
        var7Lifetime3 = 0L;
        for (var9Lifetime3 = 1; this.field_m >= var9Lifetime3; var9Lifetime3++) {
          var7Lifetime3 = var7Lifetime3 + this.field_k[(-var9Lifetime3 + (this.field_e + 10)) % 10];
        }
        return var7Lifetime3 / (long)this.field_m;
    }

    final long a(byte param0) {
        this.field_g = this.field_g + this.b((byte) 106);
        if (param0 != -84) {
          return -57L;
        }
        if (this.field_n > this.field_g) {
          return (-this.field_g + this.field_n) / 1000000L;
        }
        return 0L;
    }

    final static boolean a(int param0, int param1) {
        if (param0 > 82) {
          return param1 >= 0 ? true : false;
        }
        field_h = -97;
        return param1 >= 0 ? true : false;
    }

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 == -103) {
          if (this.field_n > this.field_g) {
            this.field_l = this.field_l + (this.field_n - this.field_g);
            this.field_g = this.field_g + (-this.field_g + this.field_n);
            this.field_n = this.field_n + param1;
            return 1;
          }
          var4 = 0;
          do {
            this.field_n = this.field_n + param1;
            var4++;
          } while (10 > var4 &&
            this.field_g > this.field_n);
          if (this.field_g > this.field_n) {
            this.field_n = this.field_g;
          }
          return var4;
        }
        field_d = (String) null;
        if (this.field_n > this.field_g) {
          this.field_l = this.field_l + (this.field_n - this.field_g);
          this.field_g = this.field_g + (-this.field_g + this.field_n);
          this.field_n = this.field_n + param1;
          return 1;
        }
        var4 = 0;
        do {
          this.field_n = this.field_n + param1;
          var4++;
        } while (10 > var4 &&
          this.field_g > this.field_n);
        if (this.field_g > this.field_n) {
          this.field_n = this.field_g;
        }
        return var4;
    }

    mf() {
        this.field_k = new long[10];
        this.field_e = 0;
        this.field_l = 0L;
        this.field_g = 0L;
        this.field_n = 0L;
        this.field_m = 1;
        this.field_g = System.nanoTime();
        this.field_n = System.nanoTime();
    }

    final static boolean a(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!bn.a(param2 + 87, param1)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (~var3_int <= param2) {
            return false;
          }
          if (!ck.a(param1, -46)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("mf.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = "From <%0>: ";
        field_i = "Return to lobby";
    }
}
