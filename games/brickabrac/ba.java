/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ba extends tk {
    static th field_B;
    static String field_x;
    static mh field_v;
    static jp field_A;
    static String field_z;
    static int field_w;
    static String field_y;
    static String field_u;

    ba() {
    }

    final static tp[] a(int param0, int param1, int param2, mf param3) {
        if (param2 >= -58) {
            return null;
        }
        if (!ln.a(-125, param1, param3, param0)) {
            return null;
        }
        return kk.a((byte) -2);
    }

    final static int b(boolean param0) {
        if (!param0) {
            ba.f(-108);
            return bg.field_r;
        }
        return bg.field_r;
    }

    final static void f(int param0) {
        fa var1 = null;
        pi var2 = null;
        var1 = (fa) (Object) wp.field_f.d(-39);
        if (var1 == null) {
          hn.a((byte) 106);
          return;
        } else {
          var2 = jl.field_e;
          int discarded$48 = var2.e(255);
          int discarded$49 = var2.e(255);
          int discarded$50 = var2.e(255);
          int discarded$51 = var2.e(255);
          if (param0 != -1) {
            field_A = null;
            var1.b((byte) 111);
            return;
          } else {
            var1.b((byte) 111);
            return;
          }
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var4 = -1;
        if (param1 != 9) {
          int discarded$1 = ba.b(false);
          var5 = param2;
          L0: while (true) {
            if (param3 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = vq.field_D[(var4 ^ param0[var5]) & 255] ^ var4 >>> 451516040;
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = param2;
          L1: while (true) {
            if (param3 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = vq.field_D[(var4 ^ param0[var5]) & 255] ^ var4 >>> 451516040;
              var5++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_A = null;
        field_B = null;
        field_x = null;
        field_z = null;
        field_v = null;
        field_u = null;
        field_y = null;
        if (param0 > -98) {
            Object var2 = null;
            int discarded$0 = ba.a((byte[]) null, 51, 121, 59);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Your game";
        field_B = new th(9, 0, 4, 1);
        field_u = "To Level";
        field_y = "<%0> might change the options - wait and see.";
    }
}
