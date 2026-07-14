/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wgb extends eca {
    static boolean field_g;
    static String field_h;
    static anb field_i;
    static int field_f;

    final qrb a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (hwa.a(var4, param1 ^ 16394)) {
          var5 = (CharSequence) (Object) param0;
          var3 = lob.a(-73, var5);
          if (var3 > 0) {
            if (-131 <= (var3 ^ -1)) {
              if (param1 != 16384) {
                wgb.a(-0.8688769340515137f, 0.8470385074615479f, 1.5502856969833374f, 23, 0.4921734631061554f, 0.5438073873519897f, -1.1896488666534424f);
                return lea.field_o;
              } else {
                return lea.field_o;
              }
            } else {
              return cca.field_o;
            }
          } else {
            return cca.field_o;
          }
        } else {
          return cca.field_o;
        }
    }

    public static void f(int param0) {
        if (param0 <= 64) {
            wgb.f(53);
            field_i = null;
            field_h = null;
            return;
        }
        field_i = null;
        field_h = null;
    }

    wgb(uf param0) {
        super(param0);
    }

    final String b(String param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        if (!(((wgb) this).a(param0, 16384) != cca.field_o)) {
            return gra.field_p;
        }
        return null;
    }

    final static void a(float param0, float param1, float param2, int param3, float param4, float param5, float param6) {
        if (vjb.field_b != null) {
          vjb.field_b.d(param0);
          vjb.field_b.c(param4);
          vjb.field_b.b(param2);
          if (param3 != -131) {
            field_h = null;
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          } else {
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          }
        } else {
          vjb.field_b = new sfb((f) (Object) kpb.field_q);
          aaa.field_b.a((f) (Object) vjb.field_b);
          vjb.field_b.d(param0);
          vjb.field_b.c(param4);
          vjb.field_b.b(param2);
          if (param3 == -131) {
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          } else {
            field_h = null;
            vjb.field_b.a(param5);
            vjb.field_b.e(param1);
            vjb.field_b.f(param6);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Butterfly chassis";
        field_g = false;
        field_i = null;
    }
}
