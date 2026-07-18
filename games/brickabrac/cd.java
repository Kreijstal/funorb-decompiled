/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static ta field_c;
    static mh field_d;
    static vm field_g;
    static String field_f;
    static tp[] field_b;
    int field_a;
    static int field_e;
    static jp[] field_h;

    final static boolean a(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var1 = ue.a(false);
        var3 = -ob.field_G + var1;
        if (var3 <= 30000L) {
          var5 = 3000;
          if (7 > qj.field_h) {
            L0: {
              if (5 <= qj.field_h) {
                var5 = 9000;
                break L0;
              } else {
                if (qj.field_h < 3) {
                  break L0;
                } else {
                  var5 = 6000;
                  if (~var3 < ~(long)var5) {
                    ob.field_G = var1;
                    qj.field_h = qj.field_h + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
            if (~var3 < ~(long)var5) {
              ob.field_G = var1;
              qj.field_h = qj.field_h + 1;
              return true;
            } else {
              return false;
            }
          } else {
            var5 = 12000;
            if (~var3 < ~(long)var5) {
              ob.field_G = var1;
              qj.field_h = qj.field_h + 1;
              return true;
            } else {
              return false;
            }
          }
        } else {
          qj.field_h = 0;
          ob.field_G = var1;
          return true;
        }
    }

    final static oh a(boolean param0, boolean param1) {
        oh var2 = new oh(true);
        var2.field_a = param1 ? true : false;
        return var2;
    }

    public static void a() {
        field_c = null;
        field_h = null;
        field_d = null;
        int var1 = 61;
        field_f = null;
        field_b = null;
        field_g = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(ta param0, ta param1, int param2, int param3, int param4, int param5) {
        dj.field_g = param2;
        try {
            uc.field_l = param1;
            ag.field_F = param0;
            wg.field_f = param4;
            ek.field_lb = param5;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "cd.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 7 + ',' + param4 + ',' + param5 + ')');
        }
    }

    cd(int param0) {
        ((cd) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Connecting to<br>friend server...";
    }
}
