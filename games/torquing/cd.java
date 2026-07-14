/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static String field_a;
    static String field_b;

    final static void a(rm param0, int param1, int param2) {
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        if (param1 != -19729) {
          return;
        } else {
          L0: {
            if (param2 + param0.field_f >= param0.field_M.length) {
              var3 = (param0.field_f - -param2) * 3 / 2;
              var10 = new int[var3];
              var7 = var10;
              var4 = var7;
              var11 = new int[var3];
              var8 = var11;
              var5 = var8;
              var12 = new int[var3];
              var9 = var12;
              var6 = var9;
              dk.a(param0.field_M, 0, var10, 0, param0.field_f);
              dk.a(param0.field_B, 0, var11, 0, param0.field_f);
              dk.a(param0.field_E, 0, var12, 0, param0.field_f);
              param0.field_E = var6;
              param0.field_B = var5;
              param0.field_M = var4;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -11) {
            field_a = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3 = 0;
        if (!hk.a(true, param0)) {
          if (!fm.a((byte) -111, param0)) {
            if (va.b(param0, 25326)) {
              return false;
            } else {
              if (param2.length() == 0) {
                return true;
              } else {
                var3 = 89 / ((param1 - 59) / 33);
                if (tm.a(true, param0, param2)) {
                  return false;
                } else {
                  if (!rh.a(true, param2, param0)) {
                    if (!vk.a(param2, 4096, param0)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 > -100) {
            cd.a((byte) 111);
            return be.field_l[param1 & 2047];
        }
        return be.field_l[param1 & 2047];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play free version";
        field_b = "Fullscreen";
    }
}
