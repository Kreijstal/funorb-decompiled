/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static im field_d;
    static int field_c;
    static String field_b;
    static String field_a;

    final static boolean a(boolean param0) {
        qf.a(94);
        return rl.b(0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        boolean discarded$0 = qf.a(false);
        field_d = null;
    }

    final static boolean a(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > 52) {
          if (q.field_Jb >= 10) {
            if (ei.field_R) {
              return false;
            } else {
              L0: {
                if (ra.c((byte) 91)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        String stackOut_4_0 = null;
        L0: {
          var5 = Terraphoenix.field_V;
          var4 = param0.indexOf(param2);
          if (param1 == 0) {
            break L0;
          } else {
            field_c = -116;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 != -1) {
            param0 = param0.substring(0, var4) + param3 + param0.substring(var4 - -param2.length());
            stackOut_4_0 = (String) param0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_6_0).indexOf(param2, param3.length() + var4);
              continue L1;
            } else {
              return stackIn_5_0;
            }
          } else {
            return param0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Play the game without logging in just yet";
        field_d = new im();
        field_a = "You are not currently logged in to the<nbsp>game.";
    }
}
