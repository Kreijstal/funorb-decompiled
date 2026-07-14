/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements bf {
    static kl field_a;
    static String field_b;

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        Object var9 = null;
        o var10 = null;
        o var11 = null;
        var6 = param2.field_o + param0;
        var7 = param1 - -param2.field_l;
        pe.a(param2.field_n, (byte) -14, var7, param2.field_r, var6);
        if (param3) {
          L0: {
            var11 = te.field_k[1];
            if (!(param2 instanceof pl)) {
              break L0;
            } else {
              if (((pl) (Object) param2).field_z) {
                var11.a(1 + var6 + (param2.field_r + -var11.field_x >> -754482847), (param2.field_n - var11.field_s >> 1819292129) + (var7 - -1), 256);
                break L0;
              } else {
                if (param2.d((byte) 53)) {
                  nh.a((byte) 69, param2.field_r - 4, var7 - -2, param2.field_n - 4, 2 + var6);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          if (param2.d((byte) 53)) {
            nh.a((byte) 69, param2.field_r - 4, var7 - -2, param2.field_n - 4, 2 + var6);
            return;
          } else {
            return;
          }
        } else {
          var9 = null;
          ((cc) this).a(0, 116, (ub) null, true, true);
          var10 = te.field_k[1];
          if (param2 instanceof pl) {
            L1: {
              if (((pl) (Object) param2).field_z) {
                var10.a(1 + var6 + (param2.field_r + -var10.field_x >> -754482847), (param2.field_n - var10.field_s >> 1819292129) + (var7 - -1), 256);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param2.d((byte) 53)) {
              return;
            } else {
              nh.a((byte) 69, param2.field_r - 4, var7 - -2, param2.field_n - 4, 2 + var6);
              return;
            }
          } else {
            if (param2.d((byte) 53)) {
              nh.a((byte) 69, param2.field_r - 4, var7 - -2, param2.field_n - 4, 2 + var6);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 38 / ((param0 - 13) / 57);
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "World:<col=ffff00>1</col> Stage:<col=ffff00>1";
    }
}
