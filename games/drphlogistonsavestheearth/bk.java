/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends m {
    private long field_f;
    private long field_h;
    private int field_i;
    private long field_g;
    private long[] field_l;
    private int field_k;
    static ia field_e;
    static he[] field_j;
    static he[] field_d;

    final long a(int param0) {
        if (param0 != 1) {
          field_d = (he[]) null;
          this.field_h = this.field_h + this.c(false);
          if (this.field_h >= this.field_f) {
            return 0L;
          }
          return (-this.field_h + this.field_f) / 1000000L;
        }
        this.field_h = this.field_h + this.c(false);
        if (this.field_h >= this.field_f) {
          return 0L;
        }
        return (-this.field_h + this.field_f) / 1000000L;
    }

    private final long c(boolean param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = -this.field_g + var2;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime1Lifetime1;
        int var8Lifetime2Lifetime1;
        this.field_g = var2;
        if (var4 <= -5000000000L) {
          var6 = 0L;
          if (!param0) {
            for (var8 = 1; this.field_i >= var8; var8++) {
              var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
            }
            return var6 / (long)this.field_i;
          }
          this.a(-62L, 63);
          for (var8Lifetime5 = 1; this.field_i >= var8Lifetime5; var8Lifetime5++) {
            var6 = var6 + this.field_l[(this.field_k + (-var8Lifetime5 + 10)) % 10];
          }
          return var6 / (long)this.field_i;
        }
        if (var4 >= 5000000000L) {
          var6Lifetime1 = 0L;
          if (param0) {
            this.a(-62L, 63);
            for (var8Lifetime1 = 1; this.field_i >= var8Lifetime1; var8Lifetime1++) {
              var6Lifetime1 = var6Lifetime1 + this.field_l[(this.field_k + (-var8Lifetime1 + 10)) % 10];
            }
            return var6Lifetime1 / (long)this.field_i;
          }
          for (var8Lifetime1Lifetime1 = 1; this.field_i >= var8Lifetime1Lifetime1; var8Lifetime1Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_l[(this.field_k + (-var8Lifetime1Lifetime1 + 10)) % 10];
          }
          return var6Lifetime1 / (long)this.field_i;
        }
        this.field_l[this.field_k] = var4;
        this.field_k = (1 + this.field_k) % 10;
        if (this.field_i < 1) {
          this.field_i = this.field_i + 1;
          var6Lifetime2 = 0L;
          if (!param0) {
            for (var8Lifetime2 = 1; this.field_i >= var8Lifetime2; var8Lifetime2++) {
              var6Lifetime2 = var6Lifetime2 + this.field_l[(this.field_k + (-var8Lifetime2 + 10)) % 10];
            }
            return var6Lifetime2 / (long)this.field_i;
          }
          this.a(-62L, 63);
          for (var8Lifetime2Lifetime1 = 1; this.field_i >= var8Lifetime2Lifetime1; var8Lifetime2Lifetime1++) {
            var6Lifetime2 = var6Lifetime2 + this.field_l[(this.field_k + (-var8Lifetime2Lifetime1 + 10)) % 10];
          }
          return var6Lifetime2 / (long)this.field_i;
        }
        var6Lifetime3 = 0L;
        if (!param0) {
          for (var8Lifetime3 = 1; this.field_i >= var8Lifetime3; var8Lifetime3++) {
            var6Lifetime3 = var6Lifetime3 + this.field_l[(this.field_k + (-var8Lifetime3 + 10)) % 10];
          }
          return var6Lifetime3 / (long)this.field_i;
        }
        this.a(-62L, 63);
        for (var8Lifetime4 = 1; this.field_i >= var8Lifetime4; var8Lifetime4++) {
          var6Lifetime3 = var6Lifetime3 + this.field_l[(this.field_k + (-var8Lifetime4 + 10)) % 10];
        }
        return var6Lifetime3 / (long)this.field_i;
    }

    final void b(boolean param0) {
        if (!param0) {
          this.field_g = 0L;
          if (this.field_f > this.field_h) {
            this.field_h = this.field_h + (-this.field_h + this.field_f);
          }
          return;
        }
        field_j = (he[]) null;
        this.field_g = 0L;
        if (this.field_f > this.field_h) {
          this.field_h = this.field_h + (-this.field_h + this.field_f);
        }
    }

    final int a(long param0, int param1) {
        int var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 < -92) {
          if (this.field_f > this.field_h) {
            this.field_g = this.field_g + (this.field_f - this.field_h);
            this.field_h = this.field_h + (-this.field_h + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
          var4 = 0;
          do {
            this.field_f = this.field_f + param0;
            var4++;
          } while (10 > var4 &&
            this.field_f < this.field_h);
          if (this.field_h <= this.field_f) {
            return var4;
          }
          this.field_f = this.field_h;
          return var4;
        }
        this.field_f = 20L;
        if (this.field_f > this.field_h) {
          this.field_g = this.field_g + (this.field_f - this.field_h);
          this.field_h = this.field_h + (-this.field_h + this.field_f);
          this.field_f = this.field_f + param0;
          return 1;
        }
        var4 = 0;
        do {
          this.field_f = this.field_f + param0;
          var4++;
        } while (10 > var4 &&
          this.field_f < this.field_h);
        if (this.field_h <= this.field_f) {
          return var4;
        }
        this.field_f = this.field_h;
        return var4;
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        int var1 = -77 / ((param0 - 6) / 44);
        field_j = null;
    }

    bk() {
        this.field_f = 0L;
        this.field_i = 1;
        this.field_l = new long[10];
        this.field_g = 0L;
        this.field_k = 0;
        this.field_h = 0L;
        this.field_h = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_e = new ia();
    }
}
