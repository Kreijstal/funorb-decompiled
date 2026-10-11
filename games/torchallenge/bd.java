/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends jl {
    private int field_o;
    private long field_p;
    private int field_s;
    private long field_r;
    static ka field_t;
    private long field_i;
    private long[] field_q;
    static int[] field_m;
    static String field_j;
    static boolean field_l;
    static Boolean field_k;
    static String field_n;

    final static void a(int param0, int param1) {
        int var2 = -81 % ((param0 - 24) / 63);
        mg.field_b = param1 >> 4 & 3;
        if (!(2 >= mg.field_b)) {
          mg.field_b = 2;
        }
        wb.field_j = param1 >> 2 & 3;
        o.field_i = param1 & 3;
        if (wb.field_j <= 2) {
          if (!(o.field_i <= 2)) {
            o.field_i = 2;
          }
          return;
        }
        wb.field_j = 2;
        if (!(o.field_i <= 2)) {
          o.field_i = 2;
        }
    }

    final long c(int param0) {
        int var2 = 24 / ((55 - param0) / 61);
        this.field_i = this.field_i + this.f(122);
        if (this.field_p <= this.field_i) {
          return 0L;
        }
        return (this.field_p - this.field_i) / 1000000L;
    }

    public static void b(byte param0) {
        field_k = null;
        field_j = null;
        field_n = null;
        if (param0 != 126) {
          return;
        }
        field_t = null;
        field_m = null;
    }

    final static void d(int param0) {
        qa.a(param0 ^ 120, (ej) null);
        if (param0 != 1) {
          field_k = (Boolean) null;
        }
    }

    private final long f(int param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        long var6Lifetime1;
        long var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        if (param0 <= 108) {
          return 3L;
        }
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_r;
        this.field_r = var2;
        if (var4 <= -5000000000L) {
          var6 = 0L;
          for (var8 = 1; this.field_s >= var8; var8++) {
            var6 = var6 + this.field_q[(this.field_o - var8 + 10) % 10];
          }
          return var6 / (long)this.field_s;
        }
        if (5000000000L > var4) {
          this.field_q[this.field_o] = var4;
          if (1 > this.field_s) {
            this.field_s = this.field_s + 1;
          }
          this.field_o = (1 + this.field_o) % 10;
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = 1; this.field_s >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_q[(this.field_o - var8Lifetime1 + 10) % 10];
          }
          return var6Lifetime1 / (long)this.field_s;
        }
        var6Lifetime2 = 0L;
        for (var8Lifetime2 = 1; this.field_s >= var8Lifetime2; var8Lifetime2++) {
          var6Lifetime2 = var6Lifetime2 + this.field_q[(this.field_o - var8Lifetime2 + 10) % 10];
        }
        return var6Lifetime2 / (long)this.field_s;
    }

    final int a(long param0, int param1) {
        int var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param1 != 28) {
          return 101;
        }
        if (this.field_i < this.field_p) {
          this.field_r = this.field_r + (this.field_p - this.field_i);
          this.field_i = this.field_i + (-this.field_i + this.field_p);
          this.field_p = this.field_p + param0;
          return 1;
        }
        var4 = 0;
        do {
          var4++;
          this.field_p = this.field_p + param0;
        } while (var4 < 10 &&
          this.field_p < this.field_i);
        if (this.field_i > this.field_p) {
          this.field_p = this.field_i;
        }
        return var4;
    }

    final static int e(int param0) {
        if (param0 != 0) {
          bd.e(0);
          wf.field_i.a((byte) -120);
          if (!gb.field_d.b(-59)) {
            return df.c((byte) 35);
          }
          return 0;
        }
        wf.field_i.a((byte) -120);
        if (!gb.field_d.b(-59)) {
          return df.c((byte) 35);
        }
        return 0;
    }

    final void a(int param0) {
        if (param0 != 65280) {
          bd.a(-25, -91);
          if (this.field_i < this.field_p) {
            this.field_i = this.field_i + (this.field_p - this.field_i);
            this.field_r = 0L;
            return;
          }
          this.field_r = 0L;
          return;
        }
        if (this.field_i >= this.field_p) {
          this.field_r = 0L;
          return;
        }
        this.field_i = this.field_i + (this.field_p - this.field_i);
        this.field_r = 0L;
    }

    bd() {
        this.field_p = 0L;
        this.field_r = 0L;
        this.field_s = 1;
        this.field_o = 0;
        this.field_i = 0L;
        this.field_q = new long[10];
        this.field_i = System.nanoTime();
        this.field_p = System.nanoTime();
    }

    static {
        field_m = new int[16];
        field_t = new ka(540, 140);
        field_j = "Visit the Account Management section on the main site to view.";
        field_l = false;
        field_n = "Password: ";
    }
}
