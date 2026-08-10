/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends rj {
    private long field_j;
    static byte[] field_l;
    private long[] field_k;
    private int field_e;
    private long field_g;
    static kb field_h;
    private long field_f;
    static int field_i;
    private int field_d;

    final long a(int param0) {
        this.field_f = this.field_f + this.d(-5378);
        if (param0 <= 114) {
            return 98L;
        }
        if ((this.field_g ^ -1L) < (this.field_f ^ -1L)) {
            return (this.field_g - this.field_f) / 1000000L;
        }
        return 0L;
    }

    public static void e(int param0) {
        if (param0 > -17) {
            field_h = (kb) null;
        }
        field_l = null;
        field_h = null;
    }

    final void c(int param0) {
        if (!((this.field_f ^ -1L) <= (this.field_g ^ -1L))) {
            this.field_f = this.field_f + (-this.field_f + this.field_g);
        }
        if (param0 != -10158) {
            field_i = 31;
        }
        this.field_j = 0L;
    }

    final int a(long param0, boolean param1) {
        int var4;
        int var5;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            field_l = (byte[]) null;
            break L0;
          }
        }
        if ((this.field_f ^ -1L) <= (this.field_g ^ -1L)) {
          var4 = 0;
          L1: while (true) {
            L2: {
              var4++;
              this.field_g = this.field_g + param0;
              if (-11 >= (var4 ^ -1)) {
                break L2;
              } else {
                if ((this.field_f ^ -1L) < (this.field_g ^ -1L)) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (this.field_g >= this.field_f) {
                break L3;
              } else {
                this.field_g = this.field_f;
                break L3;
              }
            }
            return var4;
          }
        } else {
          this.field_j = this.field_j + (this.field_g - this.field_f);
          this.field_f = this.field_f + (this.field_g - this.field_f);
          this.field_g = this.field_g + param0;
          return 1;
        }
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        if (param0 != -5378) {
            return 76L;
        }
        long var2 = System.nanoTime();
        long var4 = -this.field_j + var2;
        this.field_j = var2;
        if (var4 > -5000000000L && -5000000001L < (var4 ^ -1L)) {
            this.field_k[this.field_e] = var4;
            if (!(this.field_d >= 1)) {
                this.field_d = this.field_d + 1;
            }
            this.field_e = (1 + this.field_e) % 10;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_d; var8++) {
            var6 = var6 + this.field_k[(-var8 + (this.field_e + 10)) % 10];
        }
        return var6 / (long)this.field_d;
    }

    dk() {
        this.field_f = 0L;
        this.field_e = 0;
        this.field_k = new long[10];
        this.field_j = 0L;
        this.field_d = 1;
        this.field_g = 0L;
        this.field_f = System.nanoTime();
        this.field_g = System.nanoTime();
    }

    static {
        field_h = new kb();
    }
}
