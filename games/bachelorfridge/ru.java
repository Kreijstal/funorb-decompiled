/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ru extends tn {
    private long field_e;
    private long[] field_h;
    static String field_j;
    static int field_c;
    private int field_i;
    static int[] field_d;
    private int field_g;
    private long field_k;
    static String field_l;
    private long field_f;

    final static void a(int param0, byte param1, int param2, boolean param3, boolean param4, int param5) {
        od.field_w[param5] = new hja(param5, param2, param3, param4, param0);
        int var6 = 108 % ((param1 - 55) / 57);
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((ru) this).field_g = 55;
            break L0;
          }
        }
        if (((ru) this).field_k >= ((ru) this).field_f) {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((ru) this).field_f = ((ru) this).field_f + param0;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((ru) this).field_k < ~((ru) this).field_f) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (~((ru) this).field_f > ~((ru) this).field_k) {
                ((ru) this).field_f = ((ru) this).field_k;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        } else {
          ((ru) this).field_e = ((ru) this).field_e + (-((ru) this).field_k + ((ru) this).field_f);
          ((ru) this).field_k = ((ru) this).field_k + (((ru) this).field_f - ((ru) this).field_k);
          ((ru) this).field_f = ((ru) this).field_f + param0;
          return 1;
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_d = null;
        field_l = null;
    }

    final long a(byte param0) {
        ((ru) this).field_k = ((ru) this).field_k + this.c(61);
        if (param0 != 63) {
            field_c = -123;
        }
        if (((ru) this).field_k < ((ru) this).field_f) {
            return (((ru) this).field_f - ((ru) this).field_k) / 1000000L;
        }
        return 0L;
    }

    ru() {
        ((ru) this).field_e = 0L;
        ((ru) this).field_i = 0;
        ((ru) this).field_k = 0L;
        ((ru) this).field_f = 0L;
        ((ru) this).field_g = 1;
        ((ru) this).field_h = new long[10];
        ((ru) this).field_k = System.nanoTime();
        ((ru) this).field_f = System.nanoTime();
    }

    private final long c(int param0) {
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        long var2 = System.nanoTime();
        if (param0 <= 33) {
            return -56L;
        }
        long var4 = var2 + -((ru) this).field_e;
        ((ru) this).field_e = var2;
        if (-5000000000L < var4) {
            if (!(5000000000L <= var4)) {
                ((ru) this).field_h[((ru) this).field_i] = var4;
                if (1 > ((ru) this).field_g) {
                    ((ru) this).field_g = ((ru) this).field_g + 1;
                }
                ((ru) this).field_i = (1 + ((ru) this).field_i) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((ru) this).field_g; var8++) {
            var6 = var6 + ((ru) this).field_h[(10 + -var8 + ((ru) this).field_i) % 10];
        }
        return var6 / (long)((ru) this).field_g;
    }

    final void a(boolean param0) {
        if (((ru) this).field_k < ((ru) this).field_f) {
            ((ru) this).field_k = ((ru) this).field_k + (-((ru) this).field_k + ((ru) this).field_f);
        }
        if (param0) {
        }
        ((ru) this).field_e = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "ESC - cancel private message";
        field_j = "<%0> has declined the invitation.";
        field_d = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
