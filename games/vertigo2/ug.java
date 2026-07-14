/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug {
    static int field_b;
    static long field_a;
    static java.awt.Image field_c;

    abstract void b(int param0);

    abstract long a(int param0);

    final static void a(byte param0, int param1, int param2, int param3) {
        if (param0 >= -46) {
          field_c = null;
          vm.field_b = param2;
          t.field_c = param1;
          vg.field_d = param3;
          return;
        } else {
          vm.field_b = param2;
          t.field_c = param1;
          vg.field_d = param3;
          return;
        }
    }

    abstract int a(boolean param0, long param1);

    final static void a(int param0, int param1, int param2, long param3, String param4) {
        nm.field_E = param0;
        qi.field_b = param4;
        if (param1 != -3) {
            return;
        }
        ff.field_m = true;
        ap.field_c = param2;
        ba.field_a = param3;
    }

    final static wp a(String param0, byte param1) {
        int var2 = 0;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        wp var7 = null;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        var2 = param0.length();
        if (-1 == var2) {
          return ab.field_a;
        } else {
          if (-256 >= var2) {
            var3 = jr.a((byte) -9, '.', param0);
            if (-3 >= (var3.length ^ -1)) {
              var4 = var3;
              if (param1 < -45) {
                var5 = 0;
                L0: while (true) {
                  if (var4.length > var5) {
                    var10 = var4[var5];
                    var7 = pe.a(var10, true);
                    if (var7 == null) {
                      var5++;
                      continue L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return cr.b(var3[var3.length + -1], 0);
                  }
                }
              } else {
                field_a = 17L;
                var5 = 0;
                L1: while (true) {
                  if (var4.length > var5) {
                    var9 = var4[var5];
                    var7 = pe.a(var9, true);
                    if (var7 == null) {
                      var5++;
                      continue L1;
                    } else {
                      return var7;
                    }
                  } else {
                    return cr.b(var3[var3.length + -1], 0);
                  }
                }
              }
            } else {
              return ab.field_a;
            }
          } else {
            return cg.field_a;
          }
        }
    }

    final static r a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        Object var6 = null;
        if (param3) {
          var6 = null;
          ug.a(66, -15, -123, 95L, (String) null);
          return vo.a(false, 124, param4, param0, param1, param2);
        } else {
          return vo.a(false, 124, param4, param0, param1, param2);
        }
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 0) {
            ug.c(-10);
        }
    }

    final static gd a(ed param0, int param1) {
        Object var3 = null;
        if (param1 != 46) {
          var3 = null;
          wp discarded$1 = ug.a((String) null, (byte) -93);
          return new gd(param0.n(2), param0.n(2), param0.n(param1 + -44), param0.n(2), param0.n(2), param0.n(2), param0.n(2), param0.n(param1 ^ 44), param0.m(0), param0.h(param1 + -57));
        } else {
          return new gd(param0.n(2), param0.n(2), param0.n(param1 + -44), param0.n(2), param0.n(2), param0.n(2), param0.n(2), param0.n(param1 ^ 44), param0.m(0), param0.h(param1 + -57));
        }
    }

    final int a(long param0, boolean param1) {
        long var4 = 0L;
        var4 = ((ug) this).a(104);
        if (param1) {
          if (0L < var4) {
            um.a(param1, var4);
            return ((ug) this).a(true, param0);
          } else {
            return ((ug) this).a(true, param0);
          }
        } else {
          ((ug) this).b(-10);
          if (0L >= var4) {
            return ((ug) this).a(true, param0);
          } else {
            um.a(param1, var4);
            return ((ug) this).a(true, param0);
          }
        }
    }

    static {
    }
}
