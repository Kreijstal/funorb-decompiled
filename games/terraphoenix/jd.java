/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends vc {
    private int field_j;
    private long[] field_l;
    private long field_k;
    static String field_i;
    private int field_m;
    private long field_n;
    private long field_h;

    final static void a(int param0, fa param1, fa param2) {
        if (param0 < 106) {
            Object var4 = null;
            jd.a(-74, (fa) null, (fa) null);
        }
        sj.field_f = param1;
        dm.field_d = param2;
    }

    final long a(int param0) {
        ((jd) this).field_n = ((jd) this).field_n + this.a((byte) -82);
        if (param0 <= 39) {
            return 8L;
        }
        if (!(((jd) this).field_n >= ((jd) this).field_k)) {
            return (-((jd) this).field_n + ((jd) this).field_k) / 1000000L;
        }
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        if (param0 != 0) {
            return 3;
        }
        if (((jd) this).field_n >= ((jd) this).field_k) {
            var4 = 0;
            do {
                ((jd) this).field_k = ((jd) this).field_k + param1;
                var4++;
                // if_icmple L66
            } while ((((jd) this).field_n ^ -1L) < (((jd) this).field_k ^ -1L));
            if (((jd) this).field_k < ((jd) this).field_n) {
                ((jd) this).field_k = ((jd) this).field_n;
            }
            return var4;
        }
        ((jd) this).field_h = ((jd) this).field_h + (((jd) this).field_k - ((jd) this).field_n);
        ((jd) this).field_n = ((jd) this).field_n + (((jd) this).field_k + -((jd) this).field_n);
        ((jd) this).field_k = ((jd) this).field_k + param1;
        return 1;
    }

    final static void a(boolean param0, int param1) {
        int var3 = Terraphoenix.field_V;
        cc var4 = (cc) (Object) qb.field_a.d(9272);
        while (var4 != null) {
            ia.a(param1, var4, -118);
            var4 = (cc) (Object) qb.field_a.e((byte) -119);
        }
        if (param0) {
            jd.d(116);
        }
        uf var2 = qc.field_a.d(9272);
        while (var2 != null) {
            da.a(0, param1);
            var2 = qc.field_a.e((byte) -119);
        }
    }

    private final long a(byte param0) {
        int var8 = 0;
        int var9 = Terraphoenix.field_V;
        long var2 = System.nanoTime();
        long var4 = -((jd) this).field_h + var2;
        ((jd) this).field_h = var2;
        if (var4 > -5000000000L) {
            if (!(5000000000L <= var4)) {
                ((jd) this).field_l[((jd) this).field_j] = var4;
                if (!(((jd) this).field_m >= 1)) {
                    ((jd) this).field_m = ((jd) this).field_m + 1;
                }
                ((jd) this).field_j = (1 + ((jd) this).field_j) % 10;
            }
        }
        long var6 = 0L;
        for (var8 = 1; ((jd) this).field_m >= var8; var8++) {
            var6 = var6 + ((jd) this).field_l[(10 + (((jd) this).field_j - var8)) % 10];
        }
        if (param0 >= -29) {
            Object var10 = null;
            jd.a(69, (fa) null, (fa) null);
        }
        return var6 / (long)((jd) this).field_m;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4 = 0;
        if (param1 >= -21) {
            jd.a(false, -74);
        }
        uf.field_f.b(param3, param0);
        if (param2) {
            var4 = 2 * (el.field_e % uf.field_f.field_r);
            if (var4 >= uf.field_f.field_r) {
                var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
            }
            if ((var4 ^ -1) > -11) {
                var4 = 10;
            } else {
                if (!(var4 <= -40 + uf.field_f.field_r)) {
                    var4 = -40 + uf.field_f.field_r;
                }
            }
            lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
        }
    }

    final void b(int param0) {
        ((jd) this).field_h = (long)param0;
        if ((((jd) this).field_k ^ -1L) < (((jd) this).field_n ^ -1L)) {
            ((jd) this).field_n = ((jd) this).field_n + (((jd) this).field_k + -((jd) this).field_n);
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            field_i = null;
        }
        field_i = null;
    }

    final static void a(dc param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        var2 = 0;
        L0: while (true) {
          if (-4 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= am.field_J) {
                L2: {
                  if (param1 <= -93) {
                    break L2;
                  } else {
                    field_i = null;
                    break L2;
                  }
                }
                je.field_a[param0.a(2)] = je.field_a[param0.a(2)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if ((var3 ^ -1) <= (am.field_J ^ -1)) {
                    am.field_J = var2;
                    am.field_J = am.field_J + 1;
                    ra.field_i[am.field_J] = param0;
                    return;
                  } else {
                    L4: {
                      L5: {
                        if ((param0.field_l ^ -1) != (ra.field_i[var3].field_l ^ -1)) {
                          break L5;
                        } else {
                          var4 = ra.field_i[var3].a(2);
                          if ((bl.field_f ^ -1) > (je.field_a[var4] ^ -1)) {
                            je.field_a[var4] = je.field_a[var4] - 1;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2++;
                      ra.field_i[var2] = ra.field_i[var3];
                      break L4;
                    }
                    var3++;
                    continue L3;
                  }
                }
              } else {
                L6: {
                  if (ra.field_i[var2].field_l == param0.field_l) {
                    je.field_a[ra.field_i[var2].a(2)] = je.field_a[ra.field_i[var2].a(2)] + 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var2++;
                continue L1;
              }
            }
          } else {
            je.field_a[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    jd() {
        ((jd) this).field_k = 0L;
        ((jd) this).field_l = new long[10];
        ((jd) this).field_j = 0;
        ((jd) this).field_n = 0L;
        ((jd) this).field_h = 0L;
        ((jd) this).field_m = 1;
        ((jd) this).field_n = System.nanoTime();
        ((jd) this).field_k = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
