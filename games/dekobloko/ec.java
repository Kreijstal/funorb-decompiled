/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String field_c;
    String field_o;
    static String field_j;
    static int[] field_f;
    int field_l;
    int field_r;
    int field_n;
    static String[] field_e;
    static nm field_k;
    static int field_g;
    int field_m;
    static String field_b;
    static mm field_p;
    static String field_a;
    int field_d;
    static String field_q;
    static w field_i;
    static int field_h;

    public static void a(byte param0) {
        field_k = null;
        field_p = null;
        field_i = null;
        if (param0 < 78) {
          return;
        } else {
          field_c = null;
          field_f = null;
          field_j = null;
          field_a = null;
          field_q = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        int fieldTemp$1 = 0;
        uf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = we.field_b;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!sc.c((byte) -104)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1.f(8, -4);
                        fieldTemp$1 = var1.field_n + 1;
                        var1.field_n = var1.field_n + 1;
                        var2 = fieldTemp$1;
                        ba.a(-32141, var1);
                        we.field_b.b(var1.field_n - var2, true);
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 <= -91) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ec.a(-123);
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var1_ref), "ec.A(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ec(int param0, String param1, mm param2) {
        try {
            this.field_d = param0;
            this.field_o = param1;
            this.field_n = param2.a(this.field_o) + 46;
            this.field_r = 30;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ec.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ec(int param0) {
        this.field_r = 30;
        this.field_d = param0;
    }

    static {
        field_c = "(1 player wants to join)";
        field_j = "Only show private chat from my friends and opponents";
        field_f = new int[8192];
        field_e = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_a = "Spectate <%0>'s game";
        field_b = "You cannot join this game - it is in progress";
        field_q = "Go Back";
    }
}
