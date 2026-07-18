/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends jl {
    private int field_o;
    private long field_p;
    private int field_s;
    private long field_r;
    static ka field_t;
    private long field_i;
    private long[] field_q;
    static int[] field_m;
    static String field_j;
    static boolean field_l;
    static Boolean field_k;
    static String field_n;

    final static void a(int param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = -81 % ((param0 - 24) / 63);
          mg.field_b = param1 >> 4 & 3;
          if (2 < mg.field_b) {
            mg.field_b = 2;
            break L0;
          } else {
            break L0;
          }
        }
        wb.field_j = param1 >> 2 & 3;
        o.field_i = param1 & 3;
        if (wb.field_j > 2) {
          L1: {
            wb.field_j = 2;
            if (o.field_i > 2) {
              o.field_i = 2;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (o.field_i > 2) {
              o.field_i = 2;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final long c(int param0) {
        int var2 = 0;
        var2 = 24 / ((55 - param0) / 61);
        ((bd) this).field_i = ((bd) this).field_i + this.f(122);
        if (((bd) this).field_p > ((bd) this).field_i) {
          return (((bd) this).field_p - ((bd) this).field_i) / 1000000L;
        } else {
          return 0L;
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_j = null;
        field_n = null;
        field_t = null;
        field_m = null;
    }

    final static void d(int param0) {
        Object var2 = null;
        qa.a(121, (ej) null);
    }

    private final long f(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - ((bd) this).field_r;
        ((bd) this).field_r = var2;
        if (var4 > -5000000000L) {
          if (5000000000L <= var4) {
            var6 = 0L;
            var8 = 1;
            L0: while (true) {
              if (((bd) this).field_s < var8) {
                return var6 / (long)((bd) this).field_s;
              } else {
                var6 = var6 + ((bd) this).field_q[(((bd) this).field_o - var8 - -10) % 10];
                var8++;
                continue L0;
              }
            }
          } else {
            L1: {
              ((bd) this).field_q[((bd) this).field_o] = var4;
              if (1 > ((bd) this).field_s) {
                ((bd) this).field_s = ((bd) this).field_s + 1;
                break L1;
              } else {
                break L1;
              }
            }
            ((bd) this).field_o = (1 + ((bd) this).field_o) % 10;
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((bd) this).field_s < var8) {
                return var6 / (long)((bd) this).field_s;
              } else {
                var6 = var6 + ((bd) this).field_q[(((bd) this).field_o - var8 - -10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((bd) this).field_s < var8) {
              return var6 / (long)((bd) this).field_s;
            } else {
              var6 = var6 + ((bd) this).field_q[(((bd) this).field_o - var8 - -10) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (param1 == 28) {
          if (((bd) this).field_i < ((bd) this).field_p) {
            ((bd) this).field_r = ((bd) this).field_r + (((bd) this).field_p + -((bd) this).field_i);
            ((bd) this).field_i = ((bd) this).field_i + (-((bd) this).field_i + ((bd) this).field_p);
            ((bd) this).field_p = ((bd) this).field_p + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                ((bd) this).field_p = ((bd) this).field_p + param0;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (~((bd) this).field_p > ~((bd) this).field_i) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((bd) this).field_i > ((bd) this).field_p) {
                  ((bd) this).field_p = ((bd) this).field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          }
        } else {
          return 101;
        }
    }

    final static int e(int param0) {
        wf.field_i.a((byte) -120);
        if (gb.field_d.b(-59)) {
            return 0;
        }
        return df.c((byte) 35);
    }

    final void a(int param0) {
        if (param0 == 65280) {
          if (~((bd) this).field_i > ~((bd) this).field_p) {
            ((bd) this).field_i = ((bd) this).field_i + (((bd) this).field_p + -((bd) this).field_i);
            ((bd) this).field_r = 0L;
            return;
          } else {
            ((bd) this).field_r = 0L;
            return;
          }
        } else {
          bd.a(-25, -91);
          if (~((bd) this).field_i <= ~((bd) this).field_p) {
            ((bd) this).field_r = 0L;
            return;
          } else {
            ((bd) this).field_i = ((bd) this).field_i + (((bd) this).field_p + -((bd) this).field_i);
            ((bd) this).field_r = 0L;
            return;
          }
        }
    }

    bd() {
        ((bd) this).field_p = 0L;
        ((bd) this).field_r = 0L;
        ((bd) this).field_s = 1;
        ((bd) this).field_o = 0;
        ((bd) this).field_i = 0L;
        ((bd) this).field_q = new long[10];
        ((bd) this).field_i = System.nanoTime();
        ((bd) this).field_p = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[16];
        field_t = new ka(540, 140);
        field_j = "Visit the Account Management section on the main site to view.";
        field_l = false;
        field_n = "Password: ";
    }
}
