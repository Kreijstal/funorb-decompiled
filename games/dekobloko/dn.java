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
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (param0 == 109) {
          if (((dn) this).field_g >= ((dn) this).field_m) {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                ((dn) this).field_m = ((dn) this).field_m + param1;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (((dn) this).field_m < ((dn) this).field_g) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((dn) this).field_m < ((dn) this).field_g) {
                  ((dn) this).field_m = ((dn) this).field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((dn) this).field_h = ((dn) this).field_h + (-((dn) this).field_g + ((dn) this).field_m);
            ((dn) this).field_g = ((dn) this).field_g + (((dn) this).field_m - ((dn) this).field_g);
            ((dn) this).field_m = ((dn) this).field_m + param1;
            return 1;
          }
        } else {
          return -6;
        }
    }

    final void b(int param0) {
        if (param0 != -30693) {
            return;
        }
        ((dn) this).field_h = 0L;
        if (!(((dn) this).field_g >= ((dn) this).field_m)) {
            ((dn) this).field_g = ((dn) this).field_g + (-((dn) this).field_g + ((dn) this).field_m);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_q = null;
        field_l = null;
        field_s = null;
        field_p = null;
    }

    final long a(int param0) {
        ((dn) this).field_g = ((dn) this).field_g + this.c(-8325);
        if (param0 != -22962) {
            ((dn) this).field_o = 53;
        }
        if (!(((dn) this).field_g >= ((dn) this).field_m)) {
            return (-((dn) this).field_g + ((dn) this).field_m) / 1000000L;
        }
        return 0L;
    }

    final static ac b(byte param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        ac var2 = null;
        int var3 = 0;
        ac stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        ac stackOut_3_0 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          var1_int = 0;
          L0: while (true) {
            var2 = oi.field_a.a(-39, var1_int);
            if (!var2.field_D) {
              var1_int++;
              continue L0;
            } else {
              stackOut_3_0 = (ac) var2;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = client.field_A ? 1 : 0;
        long var2 = System.nanoTime();
        long var4 = var2 - ((dn) this).field_h;
        ((dn) this).field_h = var2;
        if (var4 > -5000000000L) {
            if (!(var4 >= 5000000000L)) {
                ((dn) this).field_f[((dn) this).field_o] = var4;
                if (!(((dn) this).field_n >= 1)) {
                    ((dn) this).field_n = ((dn) this).field_n + 1;
                }
                ((dn) this).field_o = (1 + ((dn) this).field_o) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((dn) this).field_n; var8++) {
            var6 = var6 + ((dn) this).field_f[(10 + (((dn) this).field_o - var8)) % 10];
        }
        return var6 / (long)((dn) this).field_n;
    }

    dn() {
        ((dn) this).field_g = 0L;
        ((dn) this).field_h = 0L;
        ((dn) this).field_f = new long[10];
        ((dn) this).field_n = 1;
        ((dn) this).field_o = 0;
        ((dn) this).field_m = 0L;
        ((dn) this).field_g = System.nanoTime();
        ((dn) this).field_m = System.nanoTime();
    }

    static {
        field_s = "Service unavailable";
        field_j = "Flowers";
        field_r = 20;
        field_q = "Match 4 or more to make them disappear, like this:";
        field_p = new ck[8];
    }
}
