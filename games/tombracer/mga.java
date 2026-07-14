/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mga extends vg {
    static char[] field_j;
    int field_k;
    static String[] field_f;
    dl field_h;
    static long field_i;
    static int[] field_g;

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        if (param0 != 34037) {
            field_i = -35L;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static qk a(int param0, int param1, int[] param2, int param3, boolean param4, int param5, boolean param6, cka param7) {
        if (param4) {
          if (!param7.field_Gb) {
            if (!cla.a(9181, param1)) {
              if (!param7.field_Cc) {
                return new qk(param7, param1, param0, lla.a(false, param1), lla.a(false, param0), param2);
              } else {
                return new qk(param7, 34037, param1, param0, param6, param2, param3, param5);
              }
            } else {
              if (!cla.a(9181, param0)) {
                if (!param7.field_Cc) {
                  return new qk(param7, param1, param0, lla.a(false, param1), lla.a(false, param0), param2);
                } else {
                  return new qk(param7, 34037, param1, param0, param6, param2, param3, param5);
                }
              } else {
                return new qk(param7, 3553, param1, param0, param6, param2, param3, param5);
              }
            }
          } else {
            return new qk(param7, 3553, param1, param0, param6, param2, param3, param5);
          }
        } else {
          return null;
        }
    }

    mga(dl param0, int param1) {
        ((mga) this).field_h = param0;
        ((mga) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new char[]{(char)13, (char)10};
        field_f = new String[]{"Course Length", "Rounds to Win"};
        field_i = 20000000L;
    }
}
