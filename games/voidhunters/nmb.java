/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nmb extends hrb {
    private long[] field_f;
    private long field_e;
    private long field_d;
    private long field_g;
    private int field_c;
    private int field_h;

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (param0 == 0) {
          if ((this.field_g ^ -1L) > (this.field_e ^ -1L)) {
            this.field_d = this.field_d + (-this.field_g + this.field_e);
            this.field_g = this.field_g + (-this.field_g + this.field_e);
            this.field_e = this.field_e + param1;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                this.field_e = this.field_e + param1;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (this.field_g > this.field_e) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_e >= this.field_g) {
                  break L2;
                } else {
                  this.field_e = this.field_g;
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 1;
        }
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 <= -57) {
          L0: {
            if (gha.field_q == null) {
              break L0;
            } else {
              var1 = gha.field_q;
              synchronized (var1) {
                L1: {
                  gha.field_q = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final long a(byte param0) {
        this.field_g = this.field_g + this.c(-110);
        if (param0 != -81) {
            this.field_h = 67;
        }
        if (this.field_g < this.field_e) {
            return (-this.field_g + this.field_e) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, ana param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            kpb.field_q.a(param1.field_e);
            if (param0 < -73) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("nmb.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean b(int param0) {
        int var1 = 99 / ((param0 - 30) / 45);
        return wqa.field_a == lqa.field_o.field_Nb ? true : false;
    }

    nmb() {
        this.field_f = new long[10];
        this.field_g = 0L;
        this.field_d = 0L;
        this.field_e = 0L;
        this.field_c = 0;
        this.field_h = 1;
        this.field_g = System.nanoTime();
        this.field_e = System.nanoTime();
    }

    final void a(int param0) {
        if (!(this.field_g >= this.field_e)) {
            this.field_g = this.field_g + (-this.field_g + this.field_e);
        }
        this.field_d = 0L;
        if (param0 >= -78) {
            nmb.d(13);
        }
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        long var2 = System.nanoTime();
        long var4 = var2 + -this.field_d;
        this.field_d = var2;
        if (-5000000000L < var4) {
            if (!(-5000000001L >= (var4 ^ -1L))) {
                this.field_f[this.field_c] = var4;
                this.field_c = (this.field_c + 1) % 10;
                if ((this.field_h ^ -1) > -2) {
                    this.field_h = this.field_h + 1;
                }
            }
        }
        if (param0 >= -71) {
            this.field_g = 79L;
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= this.field_h; var8++) {
            var6 = var6 + this.field_f[(10 + this.field_c + -var8) % 10];
        }
        return var6 / (long)this.field_h;
    }

    static {
    }
}
