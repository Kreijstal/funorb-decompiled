/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ie {
    private long field_g;
    static int field_r;
    static nm field_l;
    static boolean field_k;
    private long[] field_f;
    private long field_m;
    static String field_s;
    private long field_h;
    static ck[] field_p;
    static String field_j;
    static String field_q;
    static boolean field_i;
    private int field_n;
    private int field_o;

    final int a(byte param0, long param1) {
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (param0 != 109) {
          return -6;
        }
        if (this.field_g < this.field_m) {
          this.field_h = this.field_h + (-this.field_g + this.field_m);
          this.field_g = this.field_g + (this.field_m - this.field_g);
          this.field_m = this.field_m + param1;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_m = this.field_m + param1;
        } while (var4 < 10 &&
          this.field_m < this.field_g);
        if (this.field_m < this.field_g) {
          this.field_m = this.field_g;
        }
        return var4;
    }

    final void b(int param0) {
        if (param0 != -30693) {
          return;
        }
        this.field_h = 0L;
        if (this.field_g < this.field_m) {
          this.field_g = this.field_g + (-this.field_g + this.field_m);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_q = null;
        field_l = null;
        field_s = null;
        field_p = null;
        if (param0 <= 65) {
          dn.b((byte) 101);
        }
    }

    final long a(int param0) {
        this.field_g = this.field_g + this.c(-8325);
        if (param0 != -22962) {
          this.field_o = 53;
        }
        if (this.field_g < this.field_m) {
          return (-this.field_g + this.field_m) / 1000000L;
        }
        return 0L;
    }

    final static ac b(byte param0) {
        int var1_int = 0;
        ac var2 = null;
        int var3 = 0;
        ac stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          if (param0 < 25) {
            field_j = (String) null;
          }
          var1_int = 0;
          while (true) {
            var2 = oi.field_a.a(-39, var1_int);
            if (!var2.field_D) {
              var1_int++;
              continue;
            }
            break;
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = client.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_h;
        if (param0 != -8325) {
          this.a(110);
        }
        this.field_h = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_f[this.field_o] = var4;
          if (this.field_n < 1) {
            this.field_n = this.field_n + 1;
          }
          this.field_o = (1 + this.field_o) % 10;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_n; var8++) {
          var6 = var6 + this.field_f[(10 + (this.field_o - var8)) % 10];
        }
        return var6 / (long)this.field_n;
    }

    dn() {
        this.field_g = 0L;
        this.field_h = 0L;
        this.field_f = new long[10];
        this.field_n = 1;
        this.field_o = 0;
        this.field_m = 0L;
        this.field_g = System.nanoTime();
        this.field_m = System.nanoTime();
    }

    static {
        field_s = "Service unavailable";
        field_j = "Flowers";
        field_r = 20;
        field_q = "Match 4 or more to make them disappear, like this:";
        field_p = new ck[8];
    }
}
