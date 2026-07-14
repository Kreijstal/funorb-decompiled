/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cf extends lm {
    int field_B;
    static tf field_t;
    static kk field_C;
    static String field_H;
    static String field_z;
    static String field_w;
    static String field_v;
    static kf field_u;
    int field_D;
    int field_y;
    int field_F;
    static String field_x;
    static String[] field_I;
    int field_E;
    int field_A;

    public static void a(byte param0) {
        field_z = null;
        field_u = null;
        field_H = null;
        field_v = null;
        field_I = null;
        field_w = null;
        if (param0 > -73) {
          field_z = null;
          field_t = null;
          field_C = null;
          field_x = null;
          return;
        } else {
          field_t = null;
          field_C = null;
          field_x = null;
          return;
        }
    }

    final static boolean a(long param0, int[] param1, String param2, int param3, int param4) {
        if (param4 == 500) {
          if (param1 != null) {
            if (param3 == 2) {
              if (!qp.a(true, param0, param2)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          cf.a((byte) -8);
          if (param1 != null) {
            if (param3 == 2) {
              if (!qp.a(true, param0, param2)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(boolean param0, int param1) {
        double var2 = 0.0;
        int var4 = 0;
        if (param0) {
          L0: {
            field_z = null;
            var2 = (double)(param1 - 10) / 10.0;
            var4 = (int)(Math.exp(Math.log(2.0) * var2) * 50.0);
            if (500 >= var4) {
              break L0;
            } else {
              var4 = 500;
              break L0;
            }
          }
          return var4;
        } else {
          L1: {
            var2 = (double)(param1 - 10) / 10.0;
            var4 = (int)(Math.exp(Math.log(2.0) * var2) * 50.0);
            if (500 >= var4) {
              break L1;
            } else {
              var4 = 500;
              break L1;
            }
          }
          return var4;
        }
    }

    cf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "<%0> is already on your ignore list.";
        field_w = "<%0> has joined your game.";
        field_x = "Please select options in the following rows:  ";
        field_z = "No players";
        field_v = "You have <%0> unread messages!";
        field_I = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
