/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends ud {
    static ec[] field_O;
    static int[][] field_N;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        wj var7 = null;
        super.a(param0, param1, param2, param3, (byte) 67, param5);
        if (param4 >= 62) {
          var7 = uh.field_u;
          if (var7 != null) {
            if (((k) this).a(param0, param2, param1, -1, param3)) {
              if (!(((k) this).field_t instanceof jm)) {
                if (!(var7.field_t instanceof jm)) {
                  return;
                } else {
                  ((jm) (Object) var7.field_t).a(-74, (k) this, var7);
                  uh.field_u = null;
                  return;
                }
              } else {
                ((jm) (Object) ((k) this).field_t).a(-110, (k) this, var7);
                uh.field_u = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1, long param2) {
        oq var4 = ej.field_j;
        var4.b(false, param0);
        var4.field_v = var4.field_v + 1;
        int var6 = 84 / ((-74 - param1) / 37);
        int var5 = var4.field_v;
        var4.a(6, false);
        var4.a(param2, (byte) -126);
        var4.b(var4.field_v + -var5, true);
    }

    final static void g(byte param0) {
        if (param0 != 96) {
            field_O = null;
            if (!(bj.c(1))) {
                return;
            }
            kk.a(false, 4, 4);
            return;
        }
        if (!(bj.c(1))) {
            return;
        }
        kk.a(false, 4, 4);
    }

    final static String a(long param0, int param1, boolean param2, int param3) {
        if (!param2) {
          k.h(83);
          return di.a(param0, param3, false, -109, param1, 10);
        } else {
          return di.a(param0, param3, false, -109, param1, 10);
        }
    }

    private k(int param0, int param1, int param2, int param3, fp param4, cc param5, ei param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((k) this).field_L = param6;
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        kf.a(param2.length, (byte) -104, param2, param0, 0);
        if (param1 != -121) {
            field_O = null;
        }
    }

    public static void h(int param0) {
        field_O = null;
        field_N = null;
        if (param0 != 120) {
            field_N = null;
        }
    }

    final static boolean a(di param0, di param1, di param2, boolean param3) {
        if (param0.d(85)) {
          if (param0.a("commonui", 0)) {
            if (param1.d(71)) {
              if (param1.a("commonui", 0)) {
                if (param2.d(122)) {
                  if (param2.a("button.gif", 0)) {
                    if (!param3) {
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[120][2];
    }
}
