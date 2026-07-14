/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ima {
    int[] field_d;
    int[] field_a;
    int[] field_c;
    float[][] field_b;

    final static String a(String param0, byte param1) {
        int var2 = 0;
        if (param1 != 8) {
          return null;
        } else {
          L0: {
            var2 = bma.d(ld.field_e, -1368, rja.field_e);
            if (1 == var2) {
              param0 = "<img=0>" + param0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-3 != (var2 ^ -1)) {
              break L1;
            } else {
              param0 = "<img=1>" + param0;
              break L1;
            }
          }
          return param0;
        }
    }

    final static void a(float param0, String param1, int param2) {
        Object var4 = null;
        if (param2 > -39) {
          var4 = null;
          ima.a(0.6509141325950623f, (String) null, 54);
          cka.field_jc = param0;
          ura.field_b = param1;
          return;
        } else {
          cka.field_jc = param0;
          ura.field_b = param1;
          return;
        }
    }

    ima(int[] param0, int[] param1, int[] param2, float[][] param3) {
        ((ima) this).field_b = param3;
        ((ima) this).field_d = param2;
        ((ima) this).field_c = param1;
        ((ima) this).field_a = param0;
    }

    static {
    }
}
