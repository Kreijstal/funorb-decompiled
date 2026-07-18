/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends am {
    static int field_q;
    int field_o;
    static oj[] field_m;
    static String field_h;
    int field_i;
    int field_r;
    static String field_k;
    int field_l;
    mm field_j;
    static int field_s;
    int field_p;
    static String[] field_n;

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_h = null;
        if (param0 != 10) {
            mm.a((byte) 126);
        }
        field_k = null;
    }

    final static void a(id param0, boolean param1) {
        RuntimeException var2 = null;
        oj[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        oj[] var14 = null;
        qm[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        qm stackIn_11_2 = null;
        qm stackIn_11_3 = null;
        id stackIn_11_4 = null;
        oc stackIn_11_5 = null;
        int stackIn_11_6 = 0;
        int stackIn_11_7 = 0;
        int stackIn_11_8 = 0;
        qm[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qm stackIn_12_2 = null;
        qm stackIn_12_3 = null;
        id stackIn_12_4 = null;
        oc stackIn_12_5 = null;
        int stackIn_12_6 = 0;
        int stackIn_12_7 = 0;
        int stackIn_12_8 = 0;
        qm[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        qm stackIn_13_2 = null;
        qm stackIn_13_3 = null;
        id stackIn_13_4 = null;
        oc stackIn_13_5 = null;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        int stackIn_13_8 = 0;
        int stackIn_13_9 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        qm[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qm stackOut_10_2 = null;
        qm stackOut_10_3 = null;
        id stackOut_10_4 = null;
        oc stackOut_10_5 = null;
        int stackOut_10_6 = 0;
        int stackOut_10_7 = 0;
        int stackOut_10_8 = 0;
        qm[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        qm stackOut_11_2 = null;
        qm stackOut_11_3 = null;
        id stackOut_11_4 = null;
        oc stackOut_11_5 = null;
        int stackOut_11_6 = 0;
        int stackOut_11_7 = 0;
        int stackOut_11_8 = 0;
        int stackOut_11_9 = 0;
        qm[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        qm stackOut_12_2 = null;
        qm stackOut_12_3 = null;
        id stackOut_12_4 = null;
        oc stackOut_12_5 = null;
        int stackOut_12_6 = 0;
        int stackOut_12_7 = 0;
        int stackOut_12_8 = 0;
        int stackOut_12_9 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ll.field_a = 0;
                        ib.field_c = 0;
                        rc.field_e = 0;
                        dk.field_o = 0;
                        el.field_j = 1;
                        var14 = new oj[32];
                        var2_array = var14;
                        var3 = 0;
                        var4 = param0.field_d;
                        var5 = param0.field_a;
                        var6 = new oc();
                        var6.field_e = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (~var6.field_e <= ~var4) {
                            statePc = 19;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6.field_g = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 <= var6.field_g) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = var6.b(-4);
                        var8 = -1;
                        var9 = -1;
                        if (param0.field_y[var7] != 74) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_m[el.field_j] = new oj(var6, 20, rl.field_c);
                        field_m[el.field_j].field_j.field_g = field_m[el.field_j].field_j.field_g + 1;
                        field_m[el.field_j].field_l.field_f = field_m[el.field_j].field_l.field_f + 0.5;
                        field_m[el.field_j].field_l.field_a = field_m[el.field_j].field_l.field_a + 0.5;
                        el.field_j = el.field_j + 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = 0;
                        var11 = param0.field_k[var7];
                        switch (var11) {
                            case 1: statePc = -1; break;
                            case 2: statePc = -1; break;
                            case 3: statePc = -1; break;
                            case 4: statePc = -1; break;
                            case 5: statePc = -1; break;
                            case 6: statePc = -1; break;
                            case 82: statePc = -1; break;
                            case 7: statePc = -1; break;
                            case 8: statePc = -1; break;
                            case 9: statePc = -1; break;
                            case 10: statePc = -1; break;
                            case 84: statePc = -1; break;
                            case 83: statePc = -1; break;
                            case 33: statePc = -1; break;
                            case 133: statePc = -1; break;
                            case 134: statePc = -1; break;
                            case 135: statePc = -1; break;
                            case 136: statePc = -1; break;
                            case 137: statePc = -1; break;
                            case 138: statePc = -1; break;
                            case 139: statePc = -1; break;
                            case 140: statePc = -1; break;
                            case 141: statePc = -1; break;
                            case 13: statePc = -1; break;
                            case 14: statePc = -1; break;
                            case 25: statePc = -1; break;
                            case 26: statePc = -1; break;
                            case 27: statePc = -1; break;
                            case 28: statePc = -1; break;
                            case 15: statePc = -1; break;
                            case 18: statePc = -1; break;
                            case 19: statePc = -1; break;
                            case 20: statePc = -1; break;
                            case 21: statePc = -1; break;
                            case -1: statePc = -1; break;
                            case -2: statePc = -1; break;
                            case -3: statePc = -1; break;
                            case 22: statePc = -1; break;
                            case 29: statePc = -1; break;
                            case 30: statePc = -1; break;
                            case 31: statePc = -1; break;
                            case 32: statePc = -1; break;
                            case 34: statePc = -1; break;
                            case 35: statePc = -1; break;
                            case 36: statePc = -1; break;
                            case 37: statePc = -1; break;
                            case 38: statePc = -1; break;
                            case 39: statePc = -1; break;
                            case 40: statePc = -1; break;
                            case 41: statePc = -1; break;
                            case 42: statePc = -1; break;
                            case 43: statePc = -1; break;
                            case 44: statePc = -1; break;
                            case 45: statePc = -1; break;
                            case 46: statePc = -1; break;
                            case 47: statePc = -1; break;
                            case 48: statePc = -1; break;
                            case 49: statePc = -1; break;
                            case 50: statePc = -1; break;
                            case 51: statePc = -1; break;
                            case 52: statePc = -1; break;
                            case 53: statePc = -1; break;
                            case 54: statePc = -1; break;
                            case 55: statePc = -1; break;
                            case 56: statePc = -1; break;
                            case 57: statePc = -1; break;
                            case 58: statePc = -1; break;
                            case 59: statePc = -1; break;
                            case 60: statePc = -1; break;
                            case 61: statePc = -1; break;
                            case 62: statePc = -1; break;
                            case 63: statePc = -1; break;
                            case 64: statePc = -1; break;
                            case 65: statePc = -1; break;
                            case 66: statePc = -1; break;
                            case 67: statePc = -1; break;
                            case 68: statePc = -1; break;
                            case 69: statePc = -1; break;
                            case 70: statePc = -1; break;
                            case 71: statePc = -1; break;
                            case 72: statePc = -1; break;
                            case 73: statePc = -1; break;
                            case 74: statePc = -1; break;
                            case 75: statePc = -1; break;
                            case 76: statePc = -1; break;
                            case 77: statePc = -1; break;
                            case 78: statePc = -1; break;
                            case 79: statePc = -1; break;
                            case 80: statePc = -1; break;
                            case 81: statePc = -1; break;
                            case 85: statePc = -1; break;
                            case 86: statePc = -1; break;
                            case 87: statePc = -1; break;
                            case 88: statePc = -1; break;
                            case 89: statePc = -1; break;
                            case 90: statePc = -1; break;
                            case 91: statePc = -1; break;
                            case 92: statePc = -1; break;
                            case 93: statePc = -1; break;
                            case 94: statePc = -1; break;
                            case 95: statePc = -1; break;
                            case 96: statePc = -1; break;
                            case 97: statePc = -1; break;
                            case 98: statePc = -1; break;
                            case 99: statePc = -1; break;
                            case 100: statePc = -1; break;
                            case 101: statePc = -1; break;
                            case 102: statePc = -1; break;
                            case 103: statePc = -1; break;
                            case 104: statePc = -1; break;
                            case 105: statePc = -1; break;
                            case 106: statePc = -1; break;
                            case 107: statePc = -1; break;
                            case 108: statePc = -1; break;
                            case 109: statePc = -1; break;
                            case 110: statePc = -1; break;
                            case 111: statePc = -1; break;
                            case 112: statePc = -1; break;
                            case 113: statePc = -1; break;
                            case 114: statePc = -1; break;
                            case 115: statePc = -1; break;
                            case 116: statePc = -1; break;
                            case 117: statePc = -1; break;
                            case 118: statePc = -1; break;
                            case 119: statePc = -1; break;
                            case 120: statePc = -1; break;
                            case 121: statePc = -1; break;
                            case 122: statePc = -1; break;
                            case 123: statePc = -1; break;
                            case 124: statePc = -1; break;
                            case 125: statePc = -1; break;
                            case 126: statePc = -1; break;
                            case 127: statePc = -1; break;
                            case 128: statePc = -1; break;
                            case 129: statePc = -1; break;
                            case 130: statePc = -1; break;
                            case 131: statePc = -1; break;
                            case 132: statePc = -1; break;
                            case 148: statePc = -1; break;
                            case 149: statePc = -1; break;
                            case 150: statePc = -1; break;
                            case 151: statePc = -1; break;
                            case 152: statePc = -1; break;
                            case 153: statePc = -1; break;
                            case 154: statePc = -1; break;
                            case 155: statePc = -1; break;
                            case 156: statePc = -1; break;
                            case 157: statePc = -1; break;
                            case 158: statePc = -1; break;
                            case 159: statePc = -1; break;
                            case 160: statePc = -1; break;
                            case 161: statePc = -1; break;
                            case 162: statePc = -1; break;
                            case 163: statePc = -1; break;
                            case 164: statePc = -1; break;
                            case 165: statePc = -1; break;
                            case 166: statePc = -1; break;
                            case 167: statePc = -1; break;
                            case 168: statePc = -1; break;
                            case 169: statePc = -1; break;
                            case 170: statePc = -1; break;
                            case 171: statePc = -1; break;
                            case 172: statePc = -1; break;
                            case 173: statePc = -1; break;
                            case 174: statePc = -1; break;
                            case 175: statePc = -1; break;
                            case 176: statePc = -1; break;
                            case 177: statePc = -1; break;
                            case 178: statePc = -1; break;
                            case 179: statePc = -1; break;
                            case 180: statePc = -1; break;
                            case 181: statePc = -1; break;
                            case 182: statePc = -1; break;
                            case 183: statePc = -1; break;
                            case 184: statePc = -1; break;
                            case 185: statePc = -1; break;
                            case 186: statePc = -1; break;
                            case 187: statePc = -1; break;
                            case 188: statePc = -1; break;
                            case 189: statePc = -1; break;
                            case 190: statePc = -1; break;
                            case 191: statePc = -1; break;
                            case 192: statePc = -1; break;
                            case 193: statePc = -1; break;
                            case 194: statePc = -1; break;
                            case 195: statePc = -1; break;
                            case 196: statePc = -1; break;
                            case 197: statePc = -1; break;
                            case 198: statePc = -1; break;
                            case 199: statePc = -1; break;
                            case 200: statePc = -1; break;
                            case 201: statePc = -1; break;
                            case 202: statePc = -1; break;
                            case 203: statePc = -1; break;
                            case 204: statePc = -1; break;
                            case 205: statePc = -1; break;
                            case 206: statePc = -1; break;
                            case 207: statePc = -1; break;
                            case 208: statePc = -1; break;
                            case 209: statePc = -1; break;
                            case 210: statePc = -1; break;
                            case 211: statePc = -1; break;
                            case 212: statePc = -1; break;
                            case 213: statePc = -1; break;
                            case 214: statePc = -1; break;
                            case 215: statePc = -1; break;
                            case 216: statePc = -1; break;
                            case 217: statePc = -1; break;
                            case 218: statePc = -1; break;
                            case 219: statePc = -1; break;
                            case 220: statePc = -1; break;
                            case 221: statePc = -1; break;
                            case 222: statePc = -1; break;
                            case 223: statePc = -1; break;
                            case 224: statePc = -1; break;
                            case 225: statePc = -1; break;
                            case 226: statePc = -1; break;
                            case 227: statePc = -1; break;
                            case 228: statePc = -1; break;
                            case 229: statePc = -1; break;
                            case 230: statePc = -1; break;
                            case 231: statePc = -1; break;
                            case 232: statePc = -1; break;
                            case 233: statePc = -1; break;
                            case 234: statePc = -1; break;
                            case 235: statePc = -1; break;
                            case 236: statePc = -1; break;
                            case 237: statePc = -1; break;
                            case 238: statePc = -1; break;
                            case 239: statePc = -1; break;
                            case 240: statePc = -1; break;
                            case 241: statePc = -1; break;
                            case 242: statePc = -1; break;
                            case 243: statePc = -1; break;
                            case 244: statePc = -1; break;
                            default: statePc = 8; break;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (ln.field_a.field_k[var7] < 247) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (ln.field_a.field_k[var7] >= 353) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = vj.field_w;
                        stackOut_10_1 = dk.field_o;
                        stackOut_10_2 = null;
                        stackOut_10_3 = null;
                        stackOut_10_4 = (id) param0;
                        stackOut_10_5 = (oc) var6;
                        stackOut_10_6 = -247 + (ln.field_a.field_k[var7] + 233);
                        stackOut_10_7 = rl.field_c;
                        stackOut_10_8 = param0.field_z[var7];
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        stackIn_12_5 = stackOut_10_5;
                        stackIn_12_6 = stackOut_10_6;
                        stackIn_12_7 = stackOut_10_7;
                        stackIn_12_8 = stackOut_10_8;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        stackIn_11_4 = stackOut_10_4;
                        stackIn_11_5 = stackOut_10_5;
                        stackIn_11_6 = stackOut_10_6;
                        stackIn_11_7 = stackOut_10_7;
                        stackIn_11_8 = stackOut_10_8;
                        if (ua.a(1, param0.field_j[var7]) != 1) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (qm[]) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = null;
                        stackOut_11_3 = null;
                        stackOut_11_4 = (id) (Object) stackIn_11_4;
                        stackOut_11_5 = (oc) (Object) stackIn_11_5;
                        stackOut_11_6 = stackIn_11_6;
                        stackOut_11_7 = stackIn_11_7;
                        stackOut_11_8 = stackIn_11_8;
                        stackOut_11_9 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        stackIn_13_5 = stackOut_11_5;
                        stackIn_13_6 = stackOut_11_6;
                        stackIn_13_7 = stackOut_11_7;
                        stackIn_13_8 = stackOut_11_8;
                        stackIn_13_9 = stackOut_11_9;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (qm[]) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = null;
                        stackOut_12_3 = null;
                        stackOut_12_4 = (id) (Object) stackIn_12_4;
                        stackOut_12_5 = (oc) (Object) stackIn_12_5;
                        stackOut_12_6 = stackIn_12_6;
                        stackOut_12_7 = stackIn_12_7;
                        stackOut_12_8 = stackIn_12_8;
                        stackOut_12_9 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        stackIn_13_5 = stackOut_12_5;
                        stackIn_13_6 = stackOut_12_6;
                        stackIn_13_7 = stackOut_12_7;
                        stackIn_13_8 = stackOut_12_8;
                        stackIn_13_9 = stackOut_12_9;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_13_0[stackIn_13_1] = new qm(stackIn_13_4, stackIn_13_5, stackIn_13_6, stackIn_13_7, stackIn_13_8, stackIn_13_9 != 0);
                        dk.field_o = dk.field_o + 1;
                        param0.field_k[var7] = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 <= var8) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        wh.field_b[ll.field_a].field_c = (double)var10;
                        wh.field_b[ll.field_a].field_j.a((byte) 46, var6);
                        wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
                        wh.field_b[ll.field_a].field_e = 0;
                        wh.field_b[ll.field_a].field_h = var9;
                        wh.field_b[ll.field_a].field_i = var8;
                        ll.field_a = ll.field_a + 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6.field_g = var6.field_g + 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6.field_e = var6.field_e + 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6.field_e = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (~var6.field_e <= ~var4) {
                            statePc = 29;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6.field_g = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (~var5 >= ~var6.field_g) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7 = var6.b(-4);
                        var8 = -1;
                        var9 = -1;
                        var10 = param0.field_k[var7];
                        switch (var10) {
                            case 11: statePc = -1; break;
                            case 23: statePc = -1; break;
                            case 24: statePc = -1; break;
                            case 12: statePc = -1; break;
                            case 16: statePc = -1; break;
                            case 17: statePc = -1; break;
                            case 18: statePc = -1; break;
                            case 142: statePc = -1; break;
                            case 143: statePc = -1; break;
                            case 144: statePc = -1; break;
                            case 145: statePc = -1; break;
                            case 146: statePc = -1; break;
                            case 147: statePc = -1; break;
                            case 245: statePc = -1; break;
                            case 246: statePc = -1; break;
                            default: statePc = 24; break;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 >= 0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        wh.field_b[ll.field_a].field_c = 0.0;
                        wh.field_b[ll.field_a].field_j.a((byte) 46, var6);
                        wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
                        wh.field_b[ll.field_a].field_e = 0;
                        wh.field_b[ll.field_a].field_h = var9;
                        wh.field_b[ll.field_a].field_i = var8;
                        wh.field_b[ll.field_a].field_n = false;
                        ll.field_a = ll.field_a + 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6.field_g = var6.field_g + 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6.field_e = var6.field_e + 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var3 <= 0) {
                            statePc = 49;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7 = 0;
                        var8 = 1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var3 <= var8) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var14[var8].field_j.field_e != var2_array[var8 + -1].field_j.field_e) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var14[var8].field_j.field_g == 1 + var2_array[-1 + var8].field_j.field_g) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = var7;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 <= var9) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var14[var9].field_z = -var7 + var8;
                        var14[var9].field_p = var9 + -var7;
                        var9++;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7 = var8;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8++;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var3 <= var7) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8 = var7;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var3 <= var8) {
                            statePc = 49;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var14[var8].field_z = -var7 + var3;
                        var14[var8].field_p = var8 + -var7;
                        var8++;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var2 = (RuntimeException) (Object) caughtException;
                    stackOut_45_0 = (RuntimeException) var2;
                    stackOut_45_1 = new StringBuilder().append("mm.B(");
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    if (param0 == null) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                    stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                    stackOut_46_2 = "{...}";
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    stackIn_48_2 = stackOut_46_2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 47: {
                    stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                    stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                    stackOut_47_2 = "null";
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    throw wg.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + true + ')');
                }
                case 49: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    mm(int param0, int param1, int param2, int param3, int param4) {
        ((mm) this).field_p = param2;
        ((mm) this).field_i = param4;
        ((mm) this).field_o = param3;
        ((mm) this).field_r = param0;
        ((mm) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 640;
        field_h = "Quit";
        field_k = "Names cannot contain consecutive spaces";
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
