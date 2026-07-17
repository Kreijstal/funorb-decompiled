/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vj {
    static int field_h;
    int field_e;
    java.awt.Image field_j;
    int field_i;
    static jc field_c;
    int[] field_b;
    static ci field_g;
    static lh field_d;
    static kb field_a;
    static long[] field_f;

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void b(int param0) {
        if (param0 != 48) {
            return;
        }
        wb.a(((vj) this).field_b, ((vj) this).field_e, ((vj) this).field_i);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Chess.field_G;
        try {
          L0: {
            L1: {
              wb.a(param4, param0, 1 + param2, 10000536);
              wb.a(param4, param1 + param0, 1 + param2, 12105912);
              var5_int = 1;
              var6 = param1;
              if (param0 + var5_int < wb.field_a) {
                var5_int = wb.field_a - param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (wb.field_b < var6 + param0) {
                var6 = -param0 + wb.field_b;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                L4: {
                  if (param3 > 115) {
                    break L4;
                  } else {
                    field_f = null;
                    break L4;
                  }
                }
                break L0;
              } else {
                var8 = 48 * var7 / param1 + 152;
                var9 = var8 | (var8 << 8 | var8 << 16);
                wb.field_d[param4 + (var7 + param0) * wb.field_h] = var9;
                wb.field_d[param4 + (param0 - -var7) * wb.field_h - -param2] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var5, "vj.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_g = null;
        field_f = null;
        int var1 = -108;
        field_c = null;
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new jc();
        field_f = new long[32];
    }
}
