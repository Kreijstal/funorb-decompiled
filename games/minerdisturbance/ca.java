/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends ek {
    private long field_i;
    private int field_m;
    static String field_f;
    private long[] field_d;
    static int field_k;
    private int field_l;
    static int field_g;
    static String field_j;
    private long field_h;
    private long field_e;

    final static void a(int param0, int param1) {
        ld var2 = sn.field_c;
        var2.d((byte) -112, param0);
        var2.c(param1, 25564);
        var2.c(0, 25564);
    }

    final long a(int param0) {
        if (param0 != 0) {
          return 38L;
        }
        this.field_h = this.field_h + this.b(false);
        if (this.field_e > this.field_h) {
          return (this.field_e - this.field_h) / 1000000L;
        }
        return 0L;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 10) {
          ca.b((byte) 102);
        }
        field_f = null;
    }

    final void a(boolean param0) {
        if (this.field_e > this.field_h) {
          this.field_h = this.field_h + (this.field_e - this.field_h);
        }
        if (!param0) {
          field_k = -85;
        }
        this.field_i = 0L;
    }

    private final long b(boolean param0) {
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        long var2 = System.nanoTime();
        long var4 = -this.field_i + var2;
        this.field_i = var2;
        if (var4 > -5000000000L &&
          5000000000L > var4) {
          this.field_d[this.field_l] = var4;
          this.field_l = (1 + this.field_l) % 10;
          if (this.field_m < 1) {
            this.field_m = this.field_m + 1;
          }
        }
        if (param0) {
          field_k = -30;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_m; var8++) {
          var6 = var6 + this.field_d[(10 + (this.field_l - var8)) % 10];
        }
        return var6 / (long)this.field_m;
    }

    final static String b(byte param0) {
        int var1 = -47 % ((-77 - param0) / 39);
        return kj.field_a.a(false);
    }

    final static boolean c(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -2302) {
          field_g = 123;
        }
        stackIn_7_0 = (rj.field_f == 12) || (rj.field_f == 13);
        return stackIn_7_0;
    }

    ca() {
        this.field_d = new long[10];
        this.field_l = 0;
        this.field_i = 0L;
        this.field_h = 0L;
        this.field_e = 0L;
        this.field_m = 1;
        this.field_h = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        var5 = MinerDisturbance.field_ab;
        if (param0 != -1374) {
          this.field_l = -50;
        }
        if (this.field_h < this.field_e) {
          this.field_i = this.field_i + (this.field_e - this.field_h);
          this.field_h = this.field_h + (-this.field_h + this.field_e);
          this.field_e = this.field_e + param1;
          return 1;
        }
        var4 = 0;
        do {
          this.field_e = this.field_e + param1;
          var4++;
        } while (var4 < 10 &&
          this.field_e < this.field_h);
        if (this.field_e < this.field_h) {
          this.field_e = this.field_h;
        }
        return var4;
    }

    static {
        field_g = 0;
        field_f = "Click";
        field_j = "Ranking: Determined Diver";
    }
}
