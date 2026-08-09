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
          field_z = (String) null;
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
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == 500) {
                break L1;
              } else {
                cf.a((byte) -8);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  L4: {
                    if (param3 != 2) {
                      break L4;
                    } else {
                      if (!qp.a(true, param0, param2)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("cf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static int a(boolean param0, int param1) {
        double var2;
        int var4;
        if (param0) {
          L0: {
            field_z = (String) null;
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
        field_H = "<%0> is already on your ignore list.";
        field_w = "<%0> has joined your game.";
        field_x = "Please select options in the following rows:  ";
        field_z = "No players";
        field_v = "You have <%0> unread messages!";
        field_I = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
