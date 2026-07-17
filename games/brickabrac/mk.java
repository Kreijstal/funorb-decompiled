/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private tk field_f;
    private int field_k;
    private long field_g;
    private int field_h;
    private tk[] field_e;
    static long field_j;
    private tk field_d;
    static int[] field_b;
    static String[][] field_c;
    static java.applet.Applet field_i;
    static String field_a;

    final tk a(long param0, int param1) {
        tk var4 = null;
        tk var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        ((mk) this).field_g = param0;
        var4 = ((mk) this).field_e[(int)((long)(((mk) this).field_k + param1) & param0)];
        ((mk) this).field_d = var4.field_s;
        L0: while (true) {
          if (((mk) this).field_d != var4) {
            if (param0 == ((mk) this).field_d.field_j) {
              var5 = ((mk) this).field_d;
              ((mk) this).field_d = ((mk) this).field_d.field_s;
              return var5;
            } else {
              ((mk) this).field_d = ((mk) this).field_d.field_s;
              continue L0;
            }
          } else {
            ((mk) this).field_d = null;
            return null;
          }
        }
    }

    final tk a(byte param0) {
        tk var2 = null;
        int var3_int = 0;
        tk var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null != ((mk) this).field_d) {
          var2 = ((mk) this).field_e[(int)((long)(((mk) this).field_k + -1) & ((mk) this).field_g)];
          L0: while (true) {
            if (((mk) this).field_d != var2) {
              if (((mk) this).field_g != ((mk) this).field_d.field_j) {
                ((mk) this).field_d = ((mk) this).field_d.field_s;
                continue L0;
              } else {
                var3 = ((mk) this).field_d;
                ((mk) this).field_d = ((mk) this).field_d.field_s;
                return var3;
              }
            } else {
              var3_int = 61 / ((param0 - 37) / 63);
              ((mk) this).field_d = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final tk a(boolean param0) {
        int var3 = 0;
        tk var4 = null;
        tk var5 = null;
        tk var36 = null;
        tk var37 = null;
        tk var38 = null;
        tk var39 = null;
        tk var42 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (!param0) {
          if (0 < ((mk) this).field_h) {
            if (((mk) this).field_e[-1 + ((mk) this).field_h] == ((mk) this).field_f) {
              L0: while (true) {
                if (((mk) this).field_k > ((mk) this).field_h) {
                  int fieldTemp$5 = ((mk) this).field_h;
                  ((mk) this).field_h = ((mk) this).field_h + 1;
                  var4 = ((mk) this).field_e[fieldTemp$5].field_s;
                  var39 = var4;
                  if (var4 == ((mk) this).field_e[-1 + ((mk) this).field_h]) {
                    continue L0;
                  } else {
                    ((mk) this).field_f = var39.field_s;
                    return var39;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var42 = ((mk) this).field_f;
              ((mk) this).field_f = var42.field_s;
              return var42;
            }
          } else {
            L1: while (true) {
              if (((mk) this).field_k > ((mk) this).field_h) {
                int fieldTemp$6 = ((mk) this).field_h;
                ((mk) this).field_h = ((mk) this).field_h + 1;
                var4 = ((mk) this).field_e[fieldTemp$6].field_s;
                var38 = var4;
                if (var4 == ((mk) this).field_e[-1 + ((mk) this).field_h]) {
                  continue L1;
                } else {
                  ((mk) this).field_f = var38.field_s;
                  return var38;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          tk discarded$7 = ((mk) this).a(31L, -107);
          if (0 < ((mk) this).field_h) {
            if (((mk) this).field_e[-1 + ((mk) this).field_h] != ((mk) this).field_f) {
              var36 = ((mk) this).field_f;
              ((mk) this).field_f = var36.field_s;
              return var36;
            } else {
              L2: while (true) {
                if (((mk) this).field_k > ((mk) this).field_h) {
                  int fieldTemp$8 = ((mk) this).field_h;
                  ((mk) this).field_h = ((mk) this).field_h + 1;
                  var4 = ((mk) this).field_e[fieldTemp$8].field_s;
                  var37 = var4;
                  if (var4 == ((mk) this).field_e[-1 + ((mk) this).field_h]) {
                    continue L2;
                  } else {
                    ((mk) this).field_f = var37.field_s;
                    return var37;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (((mk) this).field_k > ((mk) this).field_h) {
                int fieldTemp$9 = ((mk) this).field_h;
                ((mk) this).field_h = ((mk) this).field_h + 1;
                var4 = ((mk) this).field_e[fieldTemp$9].field_s;
                var5 = var4;
                if (var4 == ((mk) this).field_e[-1 + ((mk) this).field_h]) {
                  continue L3;
                } else {
                  ((mk) this).field_f = var5.field_s;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final tk b(byte param0) {
        ((mk) this).field_h = 0;
        if (param0 <= 57) {
            return null;
        }
        return ((mk) this).a(false);
    }

    final static void a() {
    }

    final void a(long param0, tk param1, int param2) {
        if (!(null == param1.field_n)) {
            param1.d(3);
        }
        tk var5 = ((mk) this).field_e[(int)(param0 & (long)(-1 + ((mk) this).field_k))];
        param1.field_n = var5.field_n;
        param1.field_s = var5;
        param1.field_n.field_s = param1;
        if (param2 <= 38) {
            return;
        }
        try {
            param1.field_s.field_n = param1;
            param1.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "mk.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void c() {
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    mk(int param0) {
        int var2 = 0;
        tk var3 = null;
        ((mk) this).field_h = 0;
        ((mk) this).field_e = new tk[param0];
        ((mk) this).field_k = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            tk dupTemp$2 = new tk();
            var3 = dupTemp$2;
            ((mk) this).field_e[var2] = dupTemp$2;
            var3.field_n = var3;
            var3.field_s = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = vn.d(8);
        field_a = "Wipe out: cancels out any positive power-ups.";
    }
}
