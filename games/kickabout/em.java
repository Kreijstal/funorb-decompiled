/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static boolean field_e;
    private long field_f;
    private am[] field_b;
    private am field_h;
    private int field_a;
    private am field_i;
    static String field_c;
    static hd field_d;
    private int field_g;

    public static void c(byte param0) {
        field_d = null;
        field_c = null;
    }

    final am a(int param0) {
        int var3 = 0;
        am var4 = null;
        am var5 = null;
        am var9 = null;
        am var12 = null;
        var3 = Kickabout.field_G;
        if (param0 < ((em) this).field_g) {
          if (((em) this).field_i == ((em) this).field_b[-1 + ((em) this).field_g]) {
            L0: while (true) {
              if (((em) this).field_a > ((em) this).field_g) {
                int fieldTemp$2 = ((em) this).field_g;
                ((em) this).field_g = ((em) this).field_g + 1;
                var4 = ((em) this).field_b[fieldTemp$2].field_f;
                var9 = var4;
                if (var4 != ((em) this).field_b[((em) this).field_g + -1]) {
                  ((em) this).field_i = var9.field_f;
                  return var9;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            var12 = ((em) this).field_i;
            ((em) this).field_i = var12.field_f;
            return var12;
          }
        } else {
          L1: while (true) {
            if (((em) this).field_a > ((em) this).field_g) {
              int fieldTemp$3 = ((em) this).field_g;
              ((em) this).field_g = ((em) this).field_g + 1;
              var4 = ((em) this).field_b[fieldTemp$3].field_f;
              var5 = var4;
              if (var4 != ((em) this).field_b[((em) this).field_g + -1]) {
                ((em) this).field_i = var5.field_f;
                return var5;
              } else {
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(am param0, byte param1, long param2) {
        am var5 = null;
        if (!(param0.field_e == null)) {
            param0.f(param1 ^ 74);
        }
        if (param1 != -4) {
            return;
        }
        try {
            var5 = ((em) this).field_b[(int)((long)(-1 + ((em) this).field_a) & param2)];
            param0.field_e = var5.field_e;
            param0.field_f = var5;
            param0.field_e.field_f = param0;
            param0.field_l = param2;
            param0.field_f.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "em.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final am b(byte param0) {
        ((em) this).field_g = 0;
        if (param0 != 72) {
            return null;
        }
        return ((em) this).a(0);
    }

    final am a(byte param0) {
        am var2 = null;
        am var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (null != ((em) this).field_h) {
          if (param0 > 19) {
            var2 = ((em) this).field_b[(int)((long)(-1 + ((em) this).field_a) & ((em) this).field_f)];
            L0: while (true) {
              if (var2 != ((em) this).field_h) {
                if (~((em) this).field_f != ~((em) this).field_h.field_l) {
                  ((em) this).field_h = ((em) this).field_h.field_f;
                  continue L0;
                } else {
                  var3 = ((em) this).field_h;
                  ((em) this).field_h = ((em) this).field_h.field_f;
                  return var3;
                }
              } else {
                ((em) this).field_h = null;
                return null;
              }
            }
          } else {
            field_d = null;
            var2 = ((em) this).field_b[(int)((long)(-1 + ((em) this).field_a) & ((em) this).field_f)];
            L1: while (true) {
              if (var2 != ((em) this).field_h) {
                if (~((em) this).field_f != ~((em) this).field_h.field_l) {
                  ((em) this).field_h = ((em) this).field_h.field_f;
                  continue L1;
                } else {
                  var3 = ((em) this).field_h;
                  ((em) this).field_h = ((em) this).field_h.field_f;
                  return var3;
                }
              } else {
                ((em) this).field_h = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    em(int param0) {
        int var2 = 0;
        am var3 = null;
        ((em) this).field_g = 0;
        ((em) this).field_a = param0;
        ((em) this).field_b = new am[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            am dupTemp$2 = new am();
            var3 = dupTemp$2;
            ((em) this).field_b[var2] = dupTemp$2;
            var3.field_e = var3;
            var3.field_f = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final am a(int param0, long param1) {
        am var4 = null;
        am var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        ((em) this).field_f = param1;
        var4 = ((em) this).field_b[(int)((long)(((em) this).field_a - 1) & param1)];
        if (param0 == -3611) {
          ((em) this).field_h = var4.field_f;
          L0: while (true) {
            if (var4 != ((em) this).field_h) {
              if (~param1 != ~((em) this).field_h.field_l) {
                ((em) this).field_h = ((em) this).field_h.field_f;
                continue L0;
              } else {
                var5 = ((em) this).field_h;
                ((em) this).field_h = ((em) this).field_h.field_f;
                return var5;
              }
            } else {
              ((em) this).field_h = null;
              return null;
            }
          }
        } else {
          ((em) this).field_h = null;
          ((em) this).field_h = var4.field_f;
          L1: while (true) {
            if (var4 != ((em) this).field_h) {
              if (~param1 != ~((em) this).field_h.field_l) {
                ((em) this).field_h = ((em) this).field_h.field_f;
                continue L1;
              } else {
                var5 = ((em) this).field_h;
                ((em) this).field_h = ((em) this).field_h.field_f;
                return var5;
              }
            } else {
              ((em) this).field_h = null;
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = "Quick Chat lobby";
    }
}
