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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Bounce.field_N;
        var4 = -123 % ((-65 - param0) / 37);
        if ((this.field_j ^ -1L) < (this.field_d ^ -1L)) {
          this.field_g = this.field_g + (this.field_j + -this.field_d);
          this.field_d = this.field_d + (-this.field_d + this.field_j);
          this.field_j = this.field_j + param1;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              this.field_j = this.field_j + param1;
              var5++;
              if ((var5 ^ -1) <= -11) {
                break L1;
              } else {
                if ((this.field_j ^ -1L) > (this.field_d ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_j < this.field_d) {
                this.field_j = this.field_d;
                break L2;
              } else {
                break L2;
              }
            }
            return var5;
          }
        }
    }

    private final long b(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = Bounce.field_N;
        var2 = System.nanoTime();
        var4 = var2 - this.field_g;
        this.field_g = var2;
        if (var4 > -5000000000L) {
          if (-5000000001L >= (var4 ^ -1L)) {
            var6 = (long)param0;
            var8 = 1;
            L0: while (true) {
              if (this.field_h < var8) {
                return var6 / (long)this.field_h;
              } else {
                var6 = var6 + this.field_i[(this.field_f + -var8 + 10) % 10];
                var8++;
                continue L0;
              }
            }
          } else {
            L1: {
              this.field_i[this.field_f] = var4;
              if (-2 < (this.field_h ^ -1)) {
                this.field_h = this.field_h + 1;
                break L1;
              } else {
                break L1;
              }
            }
            this.field_f = (this.field_f - -1) % 10;
            var6 = (long)param0;
            var8 = 1;
            L2: while (true) {
              if (this.field_h < var8) {
                return var6 / (long)this.field_h;
              } else {
                var6 = var6 + this.field_i[(this.field_f + -var8 + 10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = (long)param0;
          var8 = 1;
          L3: while (true) {
            if (this.field_h < var8) {
              return var6 / (long)this.field_h;
            } else {
              var6 = var6 + this.field_i[(this.field_f + -var8 + 10) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final void a(boolean param0) {
        L0: {
          this.field_g = 0L;
          if ((this.field_d ^ -1L) > (this.field_j ^ -1L)) {
            this.field_d = this.field_d + (-this.field_d + this.field_j);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          this.field_g = 111L;
          return;
        } else {
          return;
        }
    }

    final long a(int param0) {
        int discarded$2 = 0;
        if (param0 == -32578) {
          this.field_d = this.field_d + this.b(0);
          if ((this.field_d ^ -1L) > (this.field_j ^ -1L)) {
            return (-this.field_d + this.field_j) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          discarded$2 = this.a(20, -52L);
          this.field_d = this.field_d + this.b(0);
          if ((this.field_d ^ -1L) > (this.field_j ^ -1L)) {
            return (-this.field_d + this.field_j) / 1000000L;
          } else {
            return 0L;
          }
        }
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
