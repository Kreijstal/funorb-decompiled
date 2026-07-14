/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static dh field_c;
    static int[] field_a;
    static String field_b;

    final static String[] a(int param0, String param1, char param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Terraphoenix.field_V;
        var10 = (CharSequence) (Object) param1;
        var3 = ld.a(param2, var10, 124);
        var4 = new String[var3 - -1];
        var5 = 0;
        var6 = 0;
        if (param0 != 14352) {
          return null;
        } else {
          var7 = 0;
          L0: while (true) {
            if (var3 <= var7) {
              var4[var3] = param1.substring(var6);
              return var4;
            } else {
              var8 = var6;
              L1: while (true) {
                if (param2 == param1.charAt(var8)) {
                  var5++;
                  var4[var5] = param1.substring(var6, var8);
                  var6 = var8 + 1;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(int param0) {
        Object var2 = null;
        if (!ei.field_R) {
          throw new IllegalStateException();
        } else {
          wd.field_b = true;
          if (param0 != 0) {
            var2 = null;
            nc.a((ji) null, -19, -66);
            nb.a(false, (byte) -126);
            q.field_Jb = 0;
            return;
          } else {
            nb.a(false, (byte) -126);
            q.field_Jb = 0;
            return;
          }
        }
    }

    final static void a(ji param0, int param1, int param2) {
        uc var3 = null;
        var3 = di.field_l;
        var3.k(-17410, param2);
        var3.i(param0.field_i, 0);
        var3.h(-1564407352, param0.field_h);
        if (param1 < 36) {
          nc.a(78);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dh(256);
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = new int[]{1, 3, 0, 2, 1, 0, 0, 3, 2, 2, 2, 2, 2, 3, 3, 3, 5, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 5, 4, 3, 2, 2, 3, 3, 3, 3, 3, 2, 2, 3, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3};
    }
}
