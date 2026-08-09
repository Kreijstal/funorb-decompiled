/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static im field_d;
    static int field_c;
    static String field_b;
    static String field_a;

    final static boolean a(boolean param0) {
        if (!param0) {
            qf.a(94);
            return rl.b(0);
        }
        return rl.b(0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 126) {
            qf.a(false);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static boolean a(byte param0) {
        int stackIn_8_0 = 0;
        if (param0 > 52) {
          if (q.field_Jb >= 10) {
            if (ei.field_R) {
              return false;
            } else {
              L0: {
                if (ra.c((byte) 91)) {
                  stackIn_8_0 = 0;
                  break L0;
                } else {
                  stackIn_8_0 = 1;
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
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Terraphoenix.field_V;
                    var4 = param0.indexOf(param2);
                    if (param1 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = -116;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 != (var4 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return param0;
                }
                case 4: {
                    param0 = param0.substring(0, var4) + param3 + param0.substring(var4 - -param2.length());
                    stackIn_6_0 = (String) (param0);
                    stackIn_5_0 = stackIn_6_0;
                    if (var5 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var4 = ((String) (Object) stackIn_6_0).indexOf(param2, param3.length() + var4);
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return param0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = "Play the game without logging in just yet";
        field_d = new im();
        field_a = "You are not currently logged in to the<nbsp>game.";
    }
}
