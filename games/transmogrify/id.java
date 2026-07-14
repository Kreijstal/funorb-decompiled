/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String[] field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 11) {
            sg discarded$0 = id.a(true, (byte) -35);
        }
    }

    final static sg a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        hj var8 = null;
        rk var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    var8 = nf.field_l;
                    var3 = var8.d((byte) 95);
                    kd.field_a = 127 & var3;
                    if ((128 & var3) == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    a.field_bb = stackIn_3_0 != 0;
                    sh.field_b = var8.d((byte) 106);
                    sj.field_m = var8.e((byte) -51);
                    if ((kd.field_a ^ -1) != -3) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    u.field_d = var8.a((byte) -108);
                    jd.field_b = var8.g((byte) 124);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    jd.field_b = 0;
                    u.field_d = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 == 9) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    sg discarded$5 = id.a(true, (byte) -86);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if ((var8.d((byte) 92) ^ -1) != -2) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    kb.field_o = var8.g(12248);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    fd.field_i = kb.field_o;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    fd.field_i = var8.g(param1 ^ 12241);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (-2 == kd.field_a) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-5 != kd.field_a) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$6 = var8.a((byte) -90);
                    String discarded$7 = var8.g(12248);
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    int discarded$8 = var8.a((byte) -90);
                    String discarded$9 = var8.g(12248);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (param0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    l.field_c = u.a(false, 80, (oa) (Object) var8);
                    a.field_T = null;
                    return new sg(param0);
                }
                case 21: {
                    var5 = var8.a((byte) -110);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = vl.field_C.b(1, var5);
                        l.field_c = var9.d((byte) -127);
                        if (!fd.field_i.equals((Object) (Object) w.field_a)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_25_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var9.field_m;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        a.field_T = stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return new sg(param0);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    d.a((Throwable) (Object) var6, -120, "CC1");
                    a.field_T = null;
                    l.field_c = null;
                    return new sg(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
