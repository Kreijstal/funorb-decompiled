/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_c;
    static boolean field_d;
    static int field_a;
    static String field_b;
    private static String field_z;

    final static String a(String param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    if (param3 != -66) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = param1.indexOf(param0);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 == (var4 ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    param1 = param1.substring(0, var4) + param2 + param1.substring(var4 + param0.length());
                    stackIn_6_0 = (String) (param1);
                    stackIn_4_0 = stackIn_6_0;
                    if (var5 != 0) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4 = ((String) (Object) stackIn_4_0).indexOf(param0, var4 - -param2.length());
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_6_0 = (String) (param1);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    return (String) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
    }

    static {
        field_z = "tj.A(";
        field_d = false;
        field_b = "Waiting for music";
    }
}
