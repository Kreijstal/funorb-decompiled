/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends ek {
    private long field_i;
    private int field_m;
    static String field_f;
    private long[] field_d;
    static int field_k;
    private int field_l;
    static int field_g;
    static String field_j;
    private long field_h;
    private long field_e;

    final static void a(int param0, int param1) {
        ld var2 = sn.field_c;
        var2.d((byte) -112, param0);
        var2.c(1, 25564);
        var2.c(0, 25564);
    }

    final long a(int param0) {
        if (param0 != 0) {
            return 38L;
        }
        ((ca) this).field_h = ((ca) this).field_h + this.b(false);
        if (((ca) this).field_e > ((ca) this).field_h) {
            return (((ca) this).field_e - ((ca) this).field_h) / 1000000L;
        }
        return 0L;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 10) {
            String discarded$0 = ca.b((byte) 102);
        }
        field_f = null;
    }

    final void a(boolean param0) {
        if (((ca) this).field_e > ((ca) this).field_h) {
            ((ca) this).field_h = ((ca) this).field_h + (((ca) this).field_e - ((ca) this).field_h);
        }
        if (!param0) {
            field_k = -85;
        }
        ((ca) this).field_i = 0L;
    }

    private final long b(boolean param0) {
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        long var2 = System.nanoTime();
        long var4 = -((ca) this).field_i + var2;
        ((ca) this).field_i = var2;
        if (var4 > -5000000000L) {
            if (5000000000L > var4) {
                ((ca) this).field_d[((ca) this).field_l] = var4;
                ((ca) this).field_l = (1 + ((ca) this).field_l) % 10;
                if (!(((ca) this).field_m >= 1)) {
                    ((ca) this).field_m = ((ca) this).field_m + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; ~var8 >= ~((ca) this).field_m; var8++) {
            var6 = var6 + ((ca) this).field_d[(10 + (((ca) this).field_l - var8)) % 10];
        }
        return var6 / (long)((ca) this).field_m;
    }

    final static String b(byte param0) {
        int var1 = -47 % ((-77 - param0) / 39);
        return kj.field_a.a(false);
    }

    final static boolean c(int param0) {
        return rj.field_f == 12 || rj.field_f == 13;
    }

    ca() {
        ((ca) this).field_d = new long[10];
        ((ca) this).field_l = 0;
        ((ca) this).field_i = 0L;
        ((ca) this).field_h = 0L;
        ((ca) this).field_e = 0L;
        ((ca) this).field_m = 1;
        ((ca) this).field_h = System.nanoTime();
        ((ca) this).field_e = System.nanoTime();
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (param0 == -1374) {
            break L0;
          } else {
            ((ca) this).field_l = -50;
            break L0;
          }
        }
        if (~((ca) this).field_h > ~((ca) this).field_e) {
          ((ca) this).field_i = ((ca) this).field_i + (((ca) this).field_e - ((ca) this).field_h);
          ((ca) this).field_h = ((ca) this).field_h + (-((ca) this).field_h + ((ca) this).field_e);
          ((ca) this).field_e = ((ca) this).field_e + param1;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            L2: {
              ((ca) this).field_e = ((ca) this).field_e + param1;
              var4++;
              if (var4 >= 10) {
                break L2;
              } else {
                if (~((ca) this).field_e > ~((ca) this).field_h) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((ca) this).field_e < ((ca) this).field_h) {
                ((ca) this).field_e = ((ca) this).field_h;
                break L3;
              } else {
                break L3;
              }
            }
            return var4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_f = "Click";
        field_j = "Ranking: Determined Diver";
    }
}
