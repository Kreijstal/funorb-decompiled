/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bu {
    static dn field_a;
    static wk[] field_c;
    static sl field_b;

    final static void a(int param0, jd param1, int param2, vh param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param1.h((byte) 117);
        param3.b(param2 + -1, param1.field_A & 31 | param1.field_O << 1308667173);
        param3.b(true, var4);
        param3.b(1, param0 + param1.field_t);
        param3.b(1, param1.field_Y + param0);
        param3.b(1, param1.field_o << 1539734436 | param1.field_P);
        param3.b(1, param1.field_ab);
        param3.b(1, param1.field_r);
        param3.b(param2 + -1, param1.field_cb);
        param3.b(1, param1.field_V);
        if ((4 & param1.field_V) != 0) {
          L0: {
            param3.a(param1.field_K, 413740432);
            var5 = 0;
            if (0 == param1.field_E) {
              break L0;
            } else {
              var5 = var5 | 2;
              break L0;
            }
          }
          L1: {
            if (param1.field_H != 0) {
              var5 = var5 | 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            param3.b(1, var5);
            if (0 != (var5 & param2)) {
              param3.b(1, param1.field_E);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((var5 & 1) != 0) {
              param3.b(1, param1.field_H);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var5 = 0;
            if (0 == param1.field_E) {
              break L4;
            } else {
              var5 = var5 | 2;
              break L4;
            }
          }
          L5: {
            if (param1.field_H != 0) {
              var5 = var5 | 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            param3.b(1, var5);
            if (0 != (var5 & param2)) {
              param3.b(1, param1.field_E);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if ((var5 & 1) != 0) {
              param3.b(1, param1.field_H);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 >= -76) {
            field_a = null;
        }
    }

    static {
    }
}
