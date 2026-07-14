/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pe {
    int field_d;
    static String field_i;
    int field_h;
    static int field_j;
    int field_f;
    int field_c;
    static int field_b;
    int field_k;
    int field_a;
    static td field_e;
    static int field_g;

    public static void b(int param0) {
        if (param0 != 0) {
            pe.b(96);
            field_i = null;
            field_e = null;
            return;
        }
        field_i = null;
        field_e = null;
    }

    final static l a(int param0) {
        L0: {
          if (null == qc.field_b) {
            qc.field_b = new l(u.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, u.field_d.field_x, -1, 2147483647, true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 2147483647) {
          field_i = null;
          return qc.field_b;
        } else {
          return qc.field_b;
        }
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static void a(nh[] param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == null) {
            break L0;
          } else {
            if (param3 > 0) {
              if (param1 < 25) {
                return;
              } else {
                var5 = param0[0].field_z;
                var6 = param0[2].field_z;
                var7 = param0[1].field_z;
                param0[0].d(param2, param4);
                param0[2].d(param3 + (param2 - var6), param4);
                wj.b(rb.field_e);
                wj.d(var5 + param2, param4, -var6 + param2 + param3, param4 - -param0[1].field_C);
                var8 = var5 + param2;
                var9 = param2 + (param3 - var6);
                param2 = var8;
                L1: while (true) {
                  if (var9 <= param2) {
                    wj.a(rb.field_e);
                    return;
                  } else {
                    param0[1].d(param2, param4);
                    param2 = param2 + var7;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Level not reached";
        field_g = 64;
        field_b = -1;
    }
}
