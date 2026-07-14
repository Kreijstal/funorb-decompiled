/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_b = (int[]) null;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (param2 == 37) {
          L0: {
            if (ms.field_d != param1) {
              ct.field_v = new int[param1];
              var3 = 0;
              L1: while (true) {
                if (param1 <= var3) {
                  ms.field_d = param1;
                  break L0;
                } else {
                  ct.field_v[var3] = (var3 << 86340652) / param1;
                  var3++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          if (df.field_f != param0) {
            if (ms.field_d == param0) {
              mo.field_c = ct.field_v;
              df.field_f = param0;
              return;
            } else {
              mo.field_c = new int[param0];
              var5 = 0;
              var3 = var5;
              L2: while (true) {
                if (param0 <= var5) {
                  df.field_f = param0;
                  return;
                } else {
                  mo.field_c[var5] = (var5 << 1349979692) / param0;
                  var5++;
                  continue L2;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
