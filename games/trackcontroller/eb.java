/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends wj {
    private long field_e;
    private long[] field_g;
    static int field_i;
    private int field_f;
    private long field_c;
    private int field_h;
    private long field_d;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != 10) {
          eb.a(74, -120, 53, -42, -35, 107, -25);
          if (param5 < param0) {
            return false;
          }
          if (param0 + param3 <= param5) {
            return false;
          }
          if (param4 > param1) {
            return false;
          }
          if (param6 + param4 > param1) {
            return true;
          }
          return false;
        }
        if (param5 < param0) {
          return false;
        }
        if (param0 + param3 <= param5) {
          return false;
        }
        if (param4 > param1) {
          return false;
        }
        if (param6 + param4 > param1) {
          return true;
        }
        return false;
    }

    final void b(int param0) {
        this.field_c = 0L;
        if (this.field_d > this.field_e) {
          this.field_e = this.field_e + (this.field_d - this.field_e);
        }
        if (param0 == -19635) {
          return;
        }
    }

    private final long d(int param0) {
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = TrackController.field_F ? 1 : 0;
        long var2 = System.nanoTime();
        long var4Lifetime1;
        long var6Lifetime1;
        long var6Lifetime2;
        long var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        long var6Lifetime4;
        int var8Lifetime4;
        if (param0 != -14942) {
          eb.a(-86, 37, 79, 90, 127, -32, 104);
          var4 = var2 - this.field_c;
          this.field_c = var2;
          if (var4 > -5000000000L) {
            if (var4 < 5000000000L) {
              this.field_g[this.field_f] = var4;
              if (this.field_h < 1) {
                this.field_h = this.field_h + 1;
              }
              this.field_f = (this.field_f + 1) % 10;
            }
            var6 = 0L;
            for (var8 = 1; this.field_h >= var8; var8++) {
              var6 = var6 + this.field_g[(this.field_f - var8 + 10) % 10];
            }
            return var6 / (long)this.field_h;
          }
          var6Lifetime4 = 0L;
          for (var8Lifetime4 = 1; this.field_h >= var8Lifetime4; var8Lifetime4++) {
            var6Lifetime4 = var6Lifetime4 + this.field_g[(this.field_f - var8Lifetime4 + 10) % 10];
          }
          return var6Lifetime4 / (long)this.field_h;
        }
        var4Lifetime1 = var2 - this.field_c;
        this.field_c = var2;
        if (var4Lifetime1 <= -5000000000L) {
          var6Lifetime1 = 0L;
          for (var8Lifetime1 = 1; this.field_h >= var8Lifetime1; var8Lifetime1++) {
            var6Lifetime1 = var6Lifetime1 + this.field_g[(this.field_f - var8Lifetime1 + 10) % 10];
          }
          return var6Lifetime1 / (long)this.field_h;
        }
        if (var4Lifetime1 < 5000000000L) {
          this.field_g[this.field_f] = var4Lifetime1;
          if (this.field_h < 1) {
            this.field_h = this.field_h + 1;
          }
          this.field_f = (this.field_f + 1) % 10;
          var6Lifetime2 = 0L;
          for (var8Lifetime2 = 1; this.field_h >= var8Lifetime2; var8Lifetime2++) {
            var6Lifetime2 = var6Lifetime2 + this.field_g[(this.field_f - var8Lifetime2 + 10) % 10];
          }
          return var6Lifetime2 / (long)this.field_h;
        }
        var6Lifetime3 = 0L;
        for (var8Lifetime3 = 1; this.field_h >= var8Lifetime3; var8Lifetime3++) {
          var6Lifetime3 = var6Lifetime3 + this.field_g[(this.field_f - var8Lifetime3 + 10) % 10];
        }
        return var6Lifetime3 / (long)this.field_h;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        var5 = TrackController.field_F ? 1 : 0;
        if (param0 > 103) {
          if (this.field_d > this.field_e) {
            this.field_c = this.field_c + (-this.field_e + this.field_d);
            this.field_e = this.field_e + (-this.field_e + this.field_d);
            this.field_d = this.field_d + param1;
            return 1;
          }
          var4 = 0;
          do {
            this.field_d = this.field_d + param1;
            var4++;
          } while (var4 < 10 &&
            this.field_e > this.field_d);
          if (this.field_e <= this.field_d) {
            return var4;
          }
          this.field_d = this.field_e;
          return var4;
        }
        this.field_h = 85;
        if (this.field_d > this.field_e) {
          this.field_c = this.field_c + (-this.field_e + this.field_d);
          this.field_e = this.field_e + (-this.field_e + this.field_d);
          this.field_d = this.field_d + param1;
          return 1;
        }
        var4 = 0;
        do {
          this.field_d = this.field_d + param1;
          var4++;
        } while (var4 < 10 &&
          this.field_e > this.field_d);
        if (this.field_e <= this.field_d) {
          return var4;
        }
        this.field_d = this.field_e;
        return var4;
    }

    final long a(int param0) {
        if (param0 != -27042) {
          this.b(120);
          this.field_e = this.field_e + this.d(-14942);
          if (this.field_e < this.field_d) {
            return (this.field_d - this.field_e) / 1000000L;
          }
          return 0L;
        }
        this.field_e = this.field_e + this.d(-14942);
        if (this.field_e < this.field_d) {
          return (this.field_d - this.field_e) / 1000000L;
        }
        return 0L;
    }

    eb() {
        this.field_f = 0;
        this.field_c = 0L;
        this.field_e = 0L;
        this.field_h = 1;
        this.field_g = new long[10];
        this.field_d = 0L;
        this.field_e = System.nanoTime();
        this.field_d = System.nanoTime();
    }

    static {
        field_i = 64;
    }
}
