/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends ip {
    private long field_e;
    private long[] field_i;
    static int[] field_h;
    private int field_g;
    private int field_c;
    private long field_f;
    private long field_d;

    final void a(int param0) {
        if (!(~((es) this).field_d <= ~((es) this).field_f)) {
            ((es) this).field_d = ((es) this).field_d + (-((es) this).field_d + ((es) this).field_f);
        }
        ((es) this).field_e = 0L;
        if (param0 <= 100) {
            boolean discarded$0 = es.a(false);
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 == 0) {
          if (((es) this).field_d >= ((es) this).field_f) {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                ((es) this).field_f = ((es) this).field_f + param0;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((es) this).field_f > ~((es) this).field_d) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((es) this).field_f < ((es) this).field_d) {
                  ((es) this).field_f = ((es) this).field_d;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((es) this).field_e = ((es) this).field_e + (((es) this).field_f - ((es) this).field_d);
            ((es) this).field_d = ((es) this).field_d + (-((es) this).field_d + ((es) this).field_f);
            ((es) this).field_f = ((es) this).field_f + param0;
            return 1;
          }
        } else {
          return 57;
        }
    }

    final long a(byte param0) {
        ((es) this).field_d = ((es) this).field_d + this.d(-97);
        if (param0 < 27) {
            boolean discarded$0 = es.a(false);
        }
        if (~((es) this).field_f < ~((es) this).field_d) {
            return (-((es) this).field_d + ((es) this).field_f) / 1000000L;
        }
        return 0L;
    }

    final static boolean a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        var1 = (Object) (Object) nfa.field_n;
        synchronized (var1) {
          L1: {
            if (vha.field_b == nt.field_a) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              fna.field_h = dl.field_o[vha.field_b];
              kda.field_td = uk.field_O[vha.field_b];
              vha.field_b = 1 + vha.field_b & 127;
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
          }
        }
        return stackIn_8_0 != 0;
    }

    private final long d(int param0) {
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 + -((es) this).field_e;
        ((es) this).field_e = var2;
        if (-5000000000L < var4) {
            if (var4 < 5000000000L) {
                ((es) this).field_i[((es) this).field_g] = var4;
                ((es) this).field_g = (((es) this).field_g + 1) % 10;
                if (!(1 <= ((es) this).field_c)) {
                    ((es) this).field_c = ((es) this).field_c + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((es) this).field_c; var8++) {
            var6 = var6 + ((es) this).field_i[(-var8 + ((es) this).field_g + 10) % 10];
        }
        return var6 / (long)((es) this).field_c;
    }

    public static void c(int param0) {
        int var1 = 118 % ((-58 - param0) / 32);
        field_h = null;
    }

    final static jua a(byte param0, boolean param1) {
        int var3 = -49 / ((-41 - param0) / 63);
        jua var2 = new jua(true);
        var2.field_a = false;
        return var2;
    }

    es() {
        ((es) this).field_g = 0;
        ((es) this).field_i = new long[10];
        ((es) this).field_e = 0L;
        ((es) this).field_c = 1;
        ((es) this).field_f = 0L;
        ((es) this).field_d = 0L;
        ((es) this).field_d = System.nanoTime();
        ((es) this).field_f = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{85, 130, 220, 340, 440, 520, 520};
    }
}
