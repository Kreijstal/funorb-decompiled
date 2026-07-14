/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements dh {
    static hj field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 != 4) {
            gm.a(4);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        hj var9 = null;
        hj var10 = null;
        if (param2 < -48) {
          var6 = param3.field_k + param1;
          var7 = param3.field_o + param4;
          tn.a(var6, param3.field_x, 152, var7, param3.field_u);
          var10 = ef.field_i[1];
          if (param3 instanceof rm) {
            if (!((rm) (Object) param3).field_B) {
              L0: {
                if (param3.c((byte) -20)) {
                  ei.a(param3.field_u - 4, param3.field_x + -4, 2 + var6, var7 - -2, (byte) 19);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.b((-var10.field_o + param3.field_x >> 167244897) + 1 + var6, (-var10.field_v + param3.field_u >> -496680703) + (var7 + 1), 256);
                if (param3.c((byte) -20)) {
                  ei.a(param3.field_u - 4, param3.field_x + -4, 2 + var6, var7 - -2, (byte) 19);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param3.c((byte) -20)) {
                ei.a(param3.field_u - 4, param3.field_x + -4, 2 + var6, var7 - -2, (byte) 19);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          gm.a(36);
          var6 = param3.field_k + param1;
          var7 = param3.field_o + param4;
          tn.a(var6, param3.field_x, 152, var7, param3.field_u);
          var9 = ef.field_i[1];
          if (!(param3 instanceof rm)) {
            L3: {
              if (param3.c((byte) -20)) {
                ei.a(param3.field_u - 4, param3.field_x + -4, 2 + var6, var7 - -2, (byte) 19);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (((rm) (Object) param3).field_B) {
                var9.b((-var9.field_o + param3.field_x >> 167244897) + 1 + var6, (-var9.field_v + param3.field_u >> -496680703) + (var7 + 1), 256);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3.c((byte) -20)) {
                ei.a(param3.field_u - 4, param3.field_x + -4, 2 + var6, var7 - -2, (byte) 19);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "(red)";
    }
}
