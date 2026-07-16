/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends hm {
    private long[] field_k;
    static int field_h;
    static String field_d;
    private int field_e;
    private long field_g;
    private long field_n;
    private long field_l;
    static km field_j;
    static String field_f;
    private int field_m;
    static String field_i;

    public static void f(int param0) {
        field_i = null;
        int var1 = 62 / ((param0 - -15) / 37);
        field_j = null;
        field_f = null;
        field_d = null;
    }

    final void d(int param0) {
        if (param0 != 110) {
          return;
        } else {
          L0: {
            ((mf) this).field_l = 0L;
            if ((((mf) this).field_n ^ -1L) >= (((mf) this).field_g ^ -1L)) {
              break L0;
            } else {
              ((mf) this).field_g = ((mf) this).field_g + (-((mf) this).field_g + ((mf) this).field_n);
              break L0;
            }
          }
          return;
        }
    }

    final static void e(int param0) {
        if (param0 != 1) {
            return;
        }
        tn.a(111);
        co.a(0);
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    private final long b(byte param0) {
        long var2 = 0L;
        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        var4 = 51 % ((0 - param0) / 51);
        var2 = System.nanoTime();
        var5 = -((mf) this).field_l + var2;
        ((mf) this).field_l = var2;
        if (-5000000000L < var5) {
          if (-5000000001L < (var5 ^ -1L)) {
            ((mf) this).field_k[((mf) this).field_e] = var5;
            ((mf) this).field_e = (1 + ((mf) this).field_e) % 10;
            if ((((mf) this).field_m ^ -1) <= -2) {
              var7 = 0L;
              var9 = 1;
              L0: while (true) {
                if (((mf) this).field_m < var9) {
                  return var7 / (long)((mf) this).field_m;
                } else {
                  var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
                  var9++;
                  continue L0;
                }
              }
            } else {
              ((mf) this).field_m = ((mf) this).field_m + 1;
              var7 = 0L;
              var9 = 1;
              L1: while (true) {
                if (((mf) this).field_m < var9) {
                  return var7 / (long)((mf) this).field_m;
                } else {
                  var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            var7 = 0L;
            var9 = 1;
            L2: while (true) {
              if (((mf) this).field_m < var9) {
                return var7 / (long)((mf) this).field_m;
              } else {
                var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
                var9++;
                continue L2;
              }
            }
          }
        } else {
          var7 = 0L;
          var9 = 1;
          L3: while (true) {
            if (((mf) this).field_m < var9) {
              return var7 / (long)((mf) this).field_m;
            } else {
              var7 = var7 + ((mf) this).field_k[(-var9 + (((mf) this).field_e - -10)) % 10];
              var9++;
              continue L3;
            }
          }
        }
    }

    final long a(byte param0) {
        ((mf) this).field_g = ((mf) this).field_g + this.b((byte) 106);
        if (param0 != -84) {
            return -57L;
        }
        if (!(((mf) this).field_n <= ((mf) this).field_g)) {
            return (-((mf) this).field_g + ((mf) this).field_n) / 1000000L;
        }
        return 0L;
    }

    final static boolean a(int param0, int param1) {
        if (param0 <= 82) {
            field_h = -97;
            return -1 >= (param1 ^ -1) ? true : false;
        }
        return -1 >= (param1 ^ -1) ? true : false;
    }

    final int a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param0 == -103) {
          if ((((mf) this).field_n ^ -1L) >= (((mf) this).field_g ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((mf) this).field_n = ((mf) this).field_n + param1;
                var4++;
                if (10 <= var4) {
                  break L1;
                } else {
                  if (((mf) this).field_g > ((mf) this).field_n) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((((mf) this).field_g ^ -1L) < (((mf) this).field_n ^ -1L)) {
                  ((mf) this).field_n = ((mf) this).field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((mf) this).field_l = ((mf) this).field_l + (((mf) this).field_n - ((mf) this).field_g);
            ((mf) this).field_g = ((mf) this).field_g + (-((mf) this).field_g + ((mf) this).field_n);
            ((mf) this).field_n = ((mf) this).field_n + param1;
            return 1;
          }
        } else {
          field_d = null;
          if ((((mf) this).field_n ^ -1L) >= (((mf) this).field_g ^ -1L)) {
            var4 = 0;
            L3: while (true) {
              L4: {
                ((mf) this).field_n = ((mf) this).field_n + param1;
                var4++;
                if (10 <= var4) {
                  break L4;
                } else {
                  if (((mf) this).field_g > ((mf) this).field_n) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((((mf) this).field_g ^ -1L) < (((mf) this).field_n ^ -1L)) {
                  ((mf) this).field_n = ((mf) this).field_g;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var4;
            }
          } else {
            ((mf) this).field_l = ((mf) this).field_l + (((mf) this).field_n - ((mf) this).field_g);
            ((mf) this).field_g = ((mf) this).field_g + (-((mf) this).field_g + ((mf) this).field_n);
            ((mf) this).field_n = ((mf) this).field_n + param1;
            return 1;
          }
        }
    }

    mf() {
        ((mf) this).field_k = new long[10];
        ((mf) this).field_e = 0;
        ((mf) this).field_l = 0L;
        ((mf) this).field_g = 0L;
        ((mf) this).field_n = 0L;
        ((mf) this).field_m = 1;
        ((mf) this).field_g = System.nanoTime();
        ((mf) this).field_n = System.nanoTime();
    }

    final static boolean a(CharSequence param0, char param1, int param2) {
        int var3 = 0;
        if (!bn.a(param2 + 87, param1)) {
          return false;
        } else {
          if (param0 == null) {
            return false;
          } else {
            var3 = param0.length();
            if ((var3 ^ -1) > param2) {
              if (ck.a(param1, -46)) {
                if (var3 == 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "From <%0>: ";
        field_i = "Return to lobby";
    }
}
