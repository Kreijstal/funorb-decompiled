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
          if (~((gs) this).field_n < ~((gs) this).field_l) {
            ((gs) this).field_l = ((gs) this).field_l + (-((gs) this).field_l + ((gs) this).field_n);
            ((gs) this).field_h = 0L;
            return;
          } else {
            ((gs) this).field_h = 0L;
            return;
          }
        } else {
          ((gs) this).field_n = 67L;
          if (~((gs) this).field_n >= ~((gs) this).field_l) {
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
        int discarded$0 = 1;
        ((gs) this).field_l = ((gs) this).field_l + this.c();
        if (param0 != 0) {
            int discarded$11 = ((gs) this).a(-15, -125L);
            if (!(~((gs) this).field_l <= ~((gs) this).field_n)) {
                return (-((gs) this).field_l + ((gs) this).field_n) / 1000000L;
            }
            return 0L;
        }
        if (!(~((gs) this).field_l <= ~((gs) this).field_n)) {
            return (-((gs) this).field_l + ((gs) this).field_n) / 1000000L;
        }
        return 0L;
    }

    public static void b() {
        field_m = null;
        field_j = null;
        field_i = null;
    }

    private final long c() {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = -((gs) this).field_h + var2;
        ((gs) this).field_h = var2;
        if (var4 > -5000000000L) {
          if (5000000000L > var4) {
            ((gs) this).field_e[((gs) this).field_f] = var4;
            if (1 <= ((gs) this).field_g) {
              ((gs) this).field_f = (1 + ((gs) this).field_f) % 10;
              var6 = 0L;
              var8 = 1;
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
              var8 = 1;
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
            var8 = 1;
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
          var8 = 1;
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
              if (~((gs) this).field_l < ~((gs) this).field_n) {
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
              if (~((gs) this).field_l >= ~((gs) this).field_n) {
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
        if (em.field_h == 2) {
            var7 = ad.field_d;
        } else {
            var7 = qk.field_z;
        }
        er.a(param4, param6, var7, 320, (byte) 122, param1, 180, param5);
    }

    final static void a(tm param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2_int = hj.field_l.length + -1;
        try {
            while (var2_int >= 1) {
                hj.field_l[var2_int] = hj.field_l[-1 + var2_int];
                var2_int--;
            }
            qd.field_a = 0;
            hj.field_l[0] = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "gs.I(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
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
