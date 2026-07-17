/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends qc {
    static int field_n;
    private int field_m;
    private long field_r;
    static int field_q;
    static ka field_s;
    private int field_o;
    private long field_u;
    private long field_t;
    static String field_l;
    private long[] field_p;
    static String field_k;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
            for (var1_int = 0; var1_int < lk.field_h; var1_int++) {
                an.field_F[var1_int] = null;
            }
            lk.field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "uk.B(" + 22963 + 41);
        }
    }

    final long b(byte param0) {
        ((uk) this).field_r = ((uk) this).field_r + this.c(param0 ^ 28722);
        if (!(((uk) this).field_r >= ((uk) this).field_u)) {
            return (-((uk) this).field_r + ((uk) this).field_u) / 1000000L;
        }
        if (param0 != -103) {
            return 42L;
        }
        return 0L;
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -28757) {
            ((uk) this).a(122);
        }
        long var2 = System.nanoTime();
        long var4 = var2 - ((uk) this).field_t;
        ((uk) this).field_t = var2;
        if (var4 > -5000000000L) {
            if (5000000000L > var4) {
                ((uk) this).field_p[((uk) this).field_o] = var4;
                ((uk) this).field_o = (1 + ((uk) this).field_o) % 10;
                if (!(1 <= ((uk) this).field_m)) {
                    ((uk) this).field_m = ((uk) this).field_m + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((uk) this).field_m; var8++) {
            var6 = var6 + ((uk) this).field_p[(10 + (((uk) this).field_o - var8)) % 10];
        }
        return var6 / (long)((uk) this).field_m;
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            uk.d(98);
            break L0;
          }
        }
        if (((uk) this).field_r >= ((uk) this).field_u) {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((uk) this).field_u = ((uk) this).field_u + param0;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((uk) this).field_u > ~((uk) this).field_r) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((uk) this).field_u < ((uk) this).field_r) {
                ((uk) this).field_u = ((uk) this).field_r;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((uk) this).field_t = ((uk) this).field_t + (((uk) this).field_u - ((uk) this).field_r);
          ((uk) this).field_r = ((uk) this).field_r + (-((uk) this).field_r + ((uk) this).field_u);
          ((uk) this).field_u = ((uk) this).field_u + param0;
          return 1;
        }
    }

    final void a(int param0) {
        if (((uk) this).field_u > ((uk) this).field_r) {
            ((uk) this).field_r = ((uk) this).field_r + (((uk) this).field_u - ((uk) this).field_r);
        }
        ((uk) this).field_t = (long)param0;
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != 0) {
            return;
        }
        field_l = null;
        field_k = null;
    }

    uk() {
        ((uk) this).field_r = 0L;
        ((uk) this).field_t = 0L;
        ((uk) this).field_u = 0L;
        ((uk) this).field_o = 0;
        ((uk) this).field_m = 1;
        ((uk) this).field_p = new long[10];
        ((uk) this).field_r = System.nanoTime();
        ((uk) this).field_u = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = -1;
        field_k = "Low";
    }
}
