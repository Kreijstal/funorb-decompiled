/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kl {
    static String field_f;
    static dk field_e;
    static String[] field_d;
    static String field_c;
    static int[] field_b;
    static boolean field_a;
    private static String field_z;

    abstract byte[] a(int param0, byte param1);

    public static void a(int param0) {
        field_b = null;
        int var1 = -83 % ((param0 - -25) / 51);
        field_f = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TorChallenge.field_F ? 1 : 0;
                    var4 = param0.indexOf(param3);
                    if (param2 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = (String[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((var4 ^ -1) != 0) {
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
                    param0 = param0.substring(0, var4) + param1 + param0.substring(var4 - -param3.length());
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
                    var4 = ((String) (Object) stackIn_6_0).indexOf(param3, var4 + param1.length());
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

    abstract tf b(int param0);

    abstract int a(int param0, int param1);

    static {
        field_z = "kl.J(";
        field_f = "Great wisdom can be found here.";
        field_c = "Click";
        field_d = new String[]{"Bonus crystal", "Health potion", "Extra life", "Help post"};
        field_b = new int[8192];
    }
}
