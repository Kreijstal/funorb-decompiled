/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends nm {
    byte[][][] field_m;
    int field_s;
    static java.security.SecureRandom field_p;
    ql[] field_j;
    int[] field_q;
    static int[] field_u;
    static int field_r;
    int[] field_t;
    static String field_o;
    static int[][] field_n;
    int[] field_k;
    ql[] field_l;
    int field_i;

    final static int a(int param0, int param1, int param2) {
        if (param1 == 29) {
          if (param2 == 1) {
            if (!gq.b(param0, -1)) {
              return rh.field_b[param2];
            } else {
              return 29;
            }
          } else {
            return rh.field_b[param2];
          }
        } else {
          bg.a(6);
          if (param2 == 1) {
            if (gq.b(param0, -1)) {
              return 29;
            } else {
              return rh.field_b[param2];
            }
          } else {
            return rh.field_b[param2];
          }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        field_u = null;
        field_p = null;
    }

    final static boolean a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        if (param3 > 32) {
          if (param5 >= param0) {
            if (param0 + param2 > param5) {
              if (param6 <= param4) {
                if (param1 + param6 <= param4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_r = -47;
          if (param5 >= param0) {
            if (param0 + param2 > param5) {
              if (param6 <= param4) {
                if (param1 + param6 <= param4) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    bg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Awesome!";
        field_n = new int[9][];
        field_u = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_n[3] = new int[3];
        field_n[5] = new int[3];
        field_n[4] = new int[3];
        field_n[8] = new int[3];
        field_n[1] = new int[3];
        field_n[7] = new int[3];
        field_n[6] = new int[3];
        field_n[0] = new int[3];
        field_n[2] = new int[3];
    }
}
