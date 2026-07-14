/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs extends fp {
    private int field_g;
    static oa field_j;
    private int field_f;
    private long field_l;
    private long field_h;
    static String field_i;
    private long field_n;
    static int field_k;
    static int field_d;
    static String field_m;
    private long[] field_e;

    final void b(int param0) {
        if (param0 == -1432175600) {
          if ((((gs) this).field_n ^ -1L) < (((gs) this).field_l ^ -1L)) {
            ((gs) this).field_l = ((gs) this).field_l + (-((gs) this).field_l + ((gs) this).field_n);
            ((gs) this).field_h = 0L;
            return;
          } else {
            ((gs) this).field_h = 0L;
            return;
          }
        } else {
          ((gs) this).field_n = 67L;
          if ((((gs) this).field_n ^ -1L) >= (((gs) this).field_l ^ -1L)) {
            ((gs) this).field_h = 0L;
            return;
          } else {
            ((gs) this).field_l = ((gs) this).field_l + (-((gs) this).field_l + ((gs) this).field_n);
            ((gs) this).field_h = 0L;
            return;
          }
        }
    }

    final long a(int param0) {
        ((gs) this).field_l = ((gs) this).field_l + this.c(1);
        if (param0 != 0) {
            int discarded$10 = ((gs) this).a(-15, -125L);
            if (!((((gs) this).field_l ^ -1L) <= (((gs) this).field_n ^ -1L))) {
                return (-((gs) this).field_l + ((gs) this).field_n) / 1000000L;
            }
            return 0L;
        }
        if (!((((gs) this).field_l ^ -1L) <= (((gs) this).field_n ^ -1L))) {
            return (-((gs) this).field_l + ((gs) this).field_n) / 1000000L;
        }
        return 0L;
    }

    public static void b(byte param0) {
        field_m = null;
        field_j = null;
        if (param0 < 53) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    private final long c(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = -((gs) this).field_h + var2;
        ((gs) this).field_h = var2;
        if (4999999999L > (var4 ^ -1L)) {
          if (5000000000L > var4) {
            ((gs) this).field_e[((gs) this).field_f] = var4;
            if (1 <= ((gs) this).field_g) {
              ((gs) this).field_f = (1 + ((gs) this).field_f) % 10;
              var6 = 0L;
              var8 = param0;
              L0: while (true) {
                if (((gs) this).field_g < var8) {
                  return var6 / (long)((gs) this).field_g;
                } else {
                  var6 = var6 + ((gs) this).field_e[(10 + -var8 + ((gs) this).field_f) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((gs) this).field_g = ((gs) this).field_g + 1;
              ((gs) this).field_f = (1 + ((gs) this).field_f) % 10;
              var6 = 0L;
              var8 = param0;
              L1: while (true) {
                if (((gs) this).field_g < var8) {
                  return var6 / (long)((gs) this).field_g;
                } else {
                  var6 = var6 + ((gs) this).field_e[(10 + -var8 + ((gs) this).field_f) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = param0;
            L2: while (true) {
              if (((gs) this).field_g < var8) {
                return var6 / (long)((gs) this).field_g;
              } else {
                var6 = var6 + ((gs) this).field_e[(10 + -var8 + ((gs) this).field_f) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = param0;
          L3: while (true) {
            if (((gs) this).field_g < var8) {
              return var6 / (long)((gs) this).field_g;
            } else {
              var6 = var6 + ((gs) this).field_e[(10 + -var8 + ((gs) this).field_f) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final int a(int param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 18907) {
          if (((gs) this).field_l >= ((gs) this).field_n) {
            var4 = 0;
            L0: while (true) {
              L1: {
                var4++;
                ((gs) this).field_n = ((gs) this).field_n + param1;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if (((gs) this).field_n < ((gs) this).field_l) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if ((((gs) this).field_l ^ -1L) < (((gs) this).field_n ^ -1L)) {
                ((gs) this).field_n = ((gs) this).field_l;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((gs) this).field_h = ((gs) this).field_h + (((gs) this).field_n + -((gs) this).field_l);
            ((gs) this).field_l = ((gs) this).field_l + (-((gs) this).field_l + ((gs) this).field_n);
            ((gs) this).field_n = ((gs) this).field_n + param1;
            return 1;
          }
        } else {
          ((gs) this).field_g = -122;
          if (((gs) this).field_l >= ((gs) this).field_n) {
            var4 = 0;
            L2: while (true) {
              L3: {
                var4++;
                ((gs) this).field_n = ((gs) this).field_n + param1;
                if (var4 >= 10) {
                  break L3;
                } else {
                  if (((gs) this).field_n < ((gs) this).field_l) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if ((((gs) this).field_l ^ -1L) >= (((gs) this).field_n ^ -1L)) {
                return var4;
              } else {
                ((gs) this).field_n = ((gs) this).field_l;
                return var4;
              }
            }
          } else {
            ((gs) this).field_h = ((gs) this).field_h + (((gs) this).field_n + -((gs) this).field_l);
            ((gs) this).field_l = ((gs) this).field_l + (-((gs) this).field_l + ((gs) this).field_n);
            ((gs) this).field_n = ((gs) this).field_n + param1;
            return 1;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        String var7 = null;
        Object var8 = null;
        L0: {
          if ((em.field_h ^ -1) != -3) {
            var7 = qk.field_z;
            break L0;
          } else {
            var7 = ad.field_d;
            break L0;
          }
        }
        if (param3 > -56) {
          var8 = null;
          gs.a((tm) null, false);
          er.a(param4, param6, var7, param0, (byte) 122, param1, param2, param5);
          return;
        } else {
          er.a(param4, param6, var7, param0, (byte) 122, param1, param2, param5);
          return;
        }
    }

    final static void a(tm param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = hj.field_l.length + -1;
        if (param1) {
          L0: while (true) {
            if (-2 < (var2 ^ -1)) {
              qd.field_a = 0;
              hj.field_l[0] = param0;
              return;
            } else {
              hj.field_l[var2] = hj.field_l[-1 + var2];
              var2--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    gs() {
        ((gs) this).field_g = 1;
        ((gs) this).field_l = 0L;
        ((gs) this).field_f = 0;
        ((gs) this).field_h = 0L;
        ((gs) this).field_n = 0L;
        ((gs) this).field_e = new long[10];
        ((gs) this).field_l = System.nanoTime();
        ((gs) this).field_n = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = new oa();
        field_k = 0;
        field_d = 2;
        field_m = "WAITING FOR <%0> PLAYERS.";
    }
}
