/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    final static void a(byte param0, boolean param1, boolean param2) {
        Object var4 = null;
        if (param1) {
          mi.a(0, 0, mi.field_a, mi.field_d, 0, 192);
          if (param0 < -28) {
            uf.a(false, param1);
            return;
          } else {
            var4 = null;
            o[] discarded$4 = nh.a((da) null, (String) null, 2, (String) null);
            uf.a(false, param1);
            return;
          }
        } else {
          mi.a();
          if (param0 < -28) {
            uf.a(false, param1);
            return;
          } else {
            var4 = null;
            o[] discarded$5 = nh.a((da) null, (String) null, 2, (String) null);
            uf.a(false, param1);
            return;
          }
        }
    }

    final static o[] a(da param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.c(param2 ^ 75, param3);
        if (param2 != 0) {
          nh.a((byte) 67);
          var5 = param0.a(param1, param2 + -1, var4);
          return de.a(var4, var5, -17042, param0);
        } else {
          var5 = param0.a(param1, param2 + -1, var4);
          return de.a(var4, var5, -17042, param0);
        }
    }

    final static void a(byte param0) {
        if (!lh.field_l) {
          throw new IllegalStateException();
        } else {
          if (param0 != 3) {
            nh.a((byte) 37, false, true);
            kk.field_c = true;
            qa.a(true, -98);
            fj.field_i = 0;
            return;
          } else {
            kk.field_c = true;
            qa.a(true, -98);
            fj.field_i = 0;
            return;
          }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = -58 / ((0 - param0) / 57);
        if (null != ee.field_j) {
          var2 = (Object) (Object) ee.field_j;
          synchronized (var2) {
            L0: {
              ee.field_j = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
    }
}
