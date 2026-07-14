/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k {
    static String field_e;
    int field_c;
    static String field_a;
    int field_d;
    int field_f;
    int field_b;
    int field_h;
    int field_g;

    public static void a(boolean param0) {
        if (param0) {
            field_e = null;
            field_e = null;
            field_a = null;
            return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static void b(boolean param0) {
        if (!param0) {
            field_e = null;
        }
    }

    final static void a(int param0, boolean param1, int param2, ti[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Transmogrify.field_A ? 1 : 0;
        if (param3 != null) {
          if (param4 > 0) {
            var5 = param3[0].field_r;
            var6 = param3[2].field_r;
            if (!param1) {
              return;
            } else {
              var7 = param3[1].field_r;
              param3[0].c(param2, param0);
              param3[2].c(-var6 + (param2 + param4), param0);
              sb.a(q.field_i);
              sb.g(var5 + param2, param0, param2 - -param4 - var6, param3[1].field_s + param0);
              var8 = param2 - -var5;
              var9 = -var6 + param2 + param4;
              param2 = var8;
              L0: while (true) {
                if (param2 >= var9) {
                  sb.b(q.field_i);
                  return;
                } else {
                  param3[1].c(param2, param0);
                  param2 = param2 + var7;
                  continue L0;
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

    final static boolean a(char param0, int param1) {
        if (param1 <= -11) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (param0 <= 122) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param0) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_e = "Loading sound effects";
    }
}
