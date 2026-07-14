/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends md {
    static le[] field_f;
    static o[] field_i;
    private long field_h;
    static String[] field_p;
    static int field_n;
    private int field_l;
    private long field_m;
    static int field_j;
    private int field_o;
    private long[] field_k;
    private long field_g;

    final void a(int param0) {
        ((ia) this).field_g = 0L;
        if (((ia) this).field_m < ((ia) this).field_h) {
            ((ia) this).field_m = ((ia) this).field_m + (-((ia) this).field_m + ((ia) this).field_h);
        }
        if (param0 != 5) {
            ((ia) this).field_k = null;
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_i = null;
        if (param0) {
            field_p = null;
        }
        field_p = null;
    }

    final static void a(int param0, wc param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        var2 = 0;
        L0: while (true) {
          if (3 <= var2) {
            var2 = param0;
            L1: while (true) {
              if (var2 >= ca.field_e) {
                hj.field_b[param1.a((byte) 102)] = hj.field_b[param1.a((byte) 102)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (ca.field_e <= var3) {
                    ca.field_e = var2;
                    ca.field_e = ca.field_e + 1;
                    mi.field_B[ca.field_e] = param1;
                    return;
                  } else {
                    L3: {
                      if (mi.field_B[var3].field_i != param1.field_i) {
                        break L3;
                      } else {
                        var4 = mi.field_B[var3].a((byte) 102);
                        if (qh.field_j < hj.field_b[var4]) {
                          hj.field_b[var4] = hj.field_b[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2++;
                    mi.field_B[var2] = mi.field_B[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param1.field_i == mi.field_B[var2].field_i) {
                  hj.field_b[mi.field_B[var2].a((byte) 102)] = hj.field_b[mi.field_B[var2].a((byte) 102)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            hj.field_b[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final long b(byte param0) {
        ((ia) this).field_m = ((ia) this).field_m + this.a(true);
        if (param0 != 66) {
            return -28L;
        }
        if (!(((ia) this).field_m >= ((ia) this).field_h)) {
            return (-((ia) this).field_m + ((ia) this).field_h) / 1000000L;
        }
        return 0L;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = wizardrun.field_H;
        int var1 = id.field_b[param0];
        for (var2 = 1; var2 < id.field_b.length; var2++) {
            var3 = id.field_b[var2];
            g.a(cb.field_e, var2 << -1914162204, cb.field_e, var1, var3);
            var1 = var1 + var3;
        }
    }

    final int a(long param0, boolean param1) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        if (!param1) {
            ((ia) this).field_l = -1;
        }
        if ((((ia) this).field_h ^ -1L) >= (((ia) this).field_m ^ -1L)) {
            var4 = 0;
            do {
                ((ia) this).field_h = ((ia) this).field_h + param0;
                var4++;
                // if_icmpge L81
            } while ((((ia) this).field_h ^ -1L) > (((ia) this).field_m ^ -1L));
            if (((ia) this).field_h < ((ia) this).field_m) {
                ((ia) this).field_h = ((ia) this).field_m;
            }
            return var4;
        }
        ((ia) this).field_g = ((ia) this).field_g + (((ia) this).field_h + -((ia) this).field_m);
        ((ia) this).field_m = ((ia) this).field_m + (-((ia) this).field_m + ((ia) this).field_h);
        ((ia) this).field_h = ((ia) this).field_h + param0;
        return 1;
    }

    private final long a(boolean param0) {
        int var8 = 0;
        int var9 = wizardrun.field_H;
        if (!param0) {
            field_f = null;
        }
        long var2 = System.nanoTime();
        long var4 = -((ia) this).field_g + var2;
        ((ia) this).field_g = var2;
        if ((var4 ^ -1L) < 4999999999L) {
            if (-5000000001L < (var4 ^ -1L)) {
                ((ia) this).field_k[((ia) this).field_l] = var4;
                ((ia) this).field_l = (1 + ((ia) this).field_l) % 10;
                if (-2 < (((ia) this).field_o ^ -1)) {
                    ((ia) this).field_o = ((ia) this).field_o + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; var8 <= ((ia) this).field_o; var8++) {
            var6 = var6 + ((ia) this).field_k[(((ia) this).field_l + (-var8 + 10)) % 10];
        }
        return var6 / (long)((ia) this).field_o;
    }

    ia() {
        ((ia) this).field_h = 0L;
        ((ia) this).field_m = 0L;
        ((ia) this).field_l = 0;
        ((ia) this).field_o = 1;
        ((ia) this).field_k = new long[10];
        ((ia) this).field_g = 0L;
        ((ia) this).field_m = System.nanoTime();
        ((ia) this).field_h = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
