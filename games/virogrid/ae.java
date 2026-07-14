/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements ol {
    static long field_d;
    static int field_a;
    static String[] field_b;
    static String field_f;
    static int[] field_e;
    static int field_c;
    static ua field_g;

    public static void a(byte param0) {
        if (param0 >= -122) {
            return;
        }
        field_f = null;
        field_g = null;
        field_b = null;
        field_e = null;
    }

    public final void a(int param0, fi param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        mg var9 = null;
        mg var10 = null;
        var6 = param1.field_l + param0;
        if (param4 == -23294) {
          var7 = param3 - -param1.field_u;
          bf.a(true, param1.field_g, var6, var7, param1.field_m);
          var10 = bf.field_p[1];
          if (param1 instanceof tg) {
            if (!((tg) (Object) param1).field_z) {
              L0: {
                if (param1.f(true)) {
                  b.a(2 + var7, (byte) 2, var6 - -2, -4 + param1.field_g, -4 + param1.field_m);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.e(1 + var6 - -(param1.field_g + -var10.field_u >> -1142092031), 1 + var7 - -(param1.field_m - var10.field_z >> -1125724223), 256);
                if (param1.f(true)) {
                  b.a(2 + var7, (byte) 2, var6 - -2, -4 + param1.field_g, -4 + param1.field_m);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param1.f(true)) {
                b.a(2 + var7, (byte) 2, var6 - -2, -4 + param1.field_g, -4 + param1.field_m);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          ae.a((byte) -21);
          var7 = param3 - -param1.field_u;
          bf.a(true, param1.field_g, var6, var7, param1.field_m);
          var9 = bf.field_p[1];
          if (param1 instanceof tg) {
            if (!((tg) (Object) param1).field_z) {
              L3: {
                if (param1.f(true)) {
                  b.a(2 + var7, (byte) 2, var6 - -2, -4 + param1.field_g, -4 + param1.field_m);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var9.e(1 + var6 - -(param1.field_g + -var9.field_u >> -1142092031), 1 + var7 - -(param1.field_m - var9.field_z >> -1125724223), 256);
                if (param1.f(true)) {
                  b.a(2 + var7, (byte) 2, var6 - -2, -4 + param1.field_g, -4 + param1.field_m);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param1.f(true)) {
                b.a(2 + var7, (byte) 2, var6 - -2, -4 + param1.field_g, -4 + param1.field_m);
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
        field_f = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
