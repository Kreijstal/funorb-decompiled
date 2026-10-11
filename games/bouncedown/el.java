/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends sg {
    private long field_d;
    private long[] field_i;
    private int field_h;
    private long field_g;
    static int field_e;
    private int field_f;
    private long field_j;
    static int field_k;

    final int a(int param0, long param1) {
        int var4;
        int var5;
        int var6;
        var6 = Bounce.field_N;
        var4 = -123 % ((-65 - param0) / 37);
        if (this.field_j > this.field_d) {
          this.field_g = this.field_g + (this.field_j - this.field_d);
          this.field_d = this.field_d + (-this.field_d + this.field_j);
          this.field_j = this.field_j + param1;
          return 1;
        }
        var5 = 0;
        do {
          this.field_j = this.field_j + param1;
          var5++;
        } while (var5 < 10 &&
          this.field_j < this.field_d);
        if (this.field_j < this.field_d) {
          this.field_j = this.field_d;
        }
        return var5;
    }

    private final long b(int param0) {
        long var6 = 0L;
        int var8 = 0;
        int var9 = Bounce.field_N;
        long var2 = System.nanoTime();
        long var4 = var2 - this.field_g;
        long var6Lifetime1;
        long var6Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        this.field_g = var2;
        if (var4 <= -5000000000L) {
          var6 = (long)param0;
          for (var8 = 1; this.field_h >= var8; var8++) {
            var6 = var6 + this.field_i[(this.field_f - var8 + 10) % 10];
          }
          return var6 / (long)this.field_h;
        }
        if (var4 < 5000000000L) {
          this.field_i[this.field_f] = var4;
          if (this.field_h < 1) {
            this.field_h = this.field_h + 1;
          }
          this.field_f = (this.field_f + 1) % 10;
          var6Lifetime1 = (long)param0;
          for (var8Lifetime1 = 1; this.field_h >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_i[(this.field_f - var8Lifetime1 + 10) % 10];
          }
          return var6Lifetime1 / (long)this.field_h;
        }
        var6Lifetime2 = (long)param0;
        for (var8Lifetime2 = 1; this.field_h >= var8Lifetime2; var8Lifetime2++) {
          var6Lifetime2 = var6Lifetime2 + this.field_i[(this.field_f - var8Lifetime2 + 10) % 10];
        }
        return var6Lifetime2 / (long)this.field_h;
    }

    final void a(boolean param0) {
        this.field_g = 0L;
        if (this.field_d < this.field_j) {
          this.field_d = this.field_d + (-this.field_d + this.field_j);
        }
        if (!param0) {
          return;
        }
        this.field_g = 111L;
    }

    final long a(int param0) {
        if (param0 != -32578) {
          this.a(20, -52L);
          this.field_d = this.field_d + this.b(0);
          if (this.field_d >= this.field_j) {
            return 0L;
          }
          return (-this.field_d + this.field_j) / 1000000L;
        }
        this.field_d = this.field_d + this.b(0);
        if (this.field_d >= this.field_j) {
          return 0L;
        }
        return (-this.field_d + this.field_j) / 1000000L;
    }

    el() {
        this.field_i = new long[10];
        this.field_g = 0L;
        this.field_f = 0;
        this.field_j = 0L;
        this.field_d = 0L;
        this.field_h = 1;
        this.field_d = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    final static void a(byte param0, String param1) {
        try {
          hh.a(0, param1);
          if (param0 != -95) {
            String var3 = (String) null;
            el.a((byte) -31, (String) null);
          }
          fj.a(false, sh.field_jb, -1);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "el.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
