/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static String field_c;
    static float[][] field_d;
    static int field_a;
    static li[] field_b;

    public static void a(int param0) {
        if (param0 != -6991) {
            return;
        }
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static vk a(ad param0, ad param1, byte param2, int param3, int param4) {
        if (wg.a(param3, param4, param0, -3)) {
          if (param2 <= 114) {
            field_d = null;
            return pj.a((byte) 101, param1.b(255, param4, param3));
          } else {
            return pj.a((byte) 101, param1.b(255, param4, param3));
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ki var5 = null;
        float var6 = 0.0f;
        if (-1 <= (wd.field_h.b(-89) ^ -1)) {
          if (param4 != -301) {
            n.a(54);
            return;
          } else {
            return;
          }
        } else {
          if (jj.b(true)) {
            var5 = (ki) (Object) wd.field_h.d(4011);
            var5.field_q = (float)(-48 + param3);
            var5.field_B = (float)param2;
            var6 = (float)(10.0 / Math.sqrt((double)(param0 * param0 + param1 * param1)));
            var5.field_v = (float)param1 * var6;
            var5.field_u = 0;
            var5.field_D = var6 * (float)param0;
            hd.field_u.a((ug) (Object) var5, (byte) 13);
            sc.field_c = sc.field_c + 1;
            if (-301 < (sc.field_c ^ -1)) {
              ok.field_d = false;
              if (param4 == -301) {
                return;
              } else {
                n.a(54);
                return;
              }
            } else {
              e.a(255, (byte) 40, 0);
              ok.field_d = false;
              if (param4 != -301) {
                n.a(54);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param4 == -301) {
              return;
            } else {
              n.a(54);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Names cannot start or end with space or underscore";
        field_d = new float[20][2];
        field_a = 3;
        field_b = new li[field_a];
    }
}
