/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements rd {
    private int field_d;
    static String field_c;
    static String field_b;
    private le field_i;
    private int field_a;
    private int field_e;
    private int field_g;
    static int[][] field_f;
    private int field_k;
    private int field_h;
    static String field_j;

    public static void a(byte param0) {
        field_f = (int[][]) null;
        field_c = null;
        int var1 = -100 % ((param0 - 73) / 46);
        field_b = null;
        field_j = null;
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        w stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!(param3 instanceof wi)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = (w) (param3);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = (wi) ((Object) stackIn_4_0);
                        if (var12 != null) {
                            statePc = 5;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        lf.a(param3.field_t + param1, param3.field_o + param0, param3.field_j, param3.field_v, this.field_d);
                        var7 = -(var12.field_G * 2) + param3.field_j;
                        var8 = var12.field_G + param3.field_t + param1;
                        var9 = param0 - (-param3.field_o - var12.field_H);
                        if (param4 == -3284) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_g = 108;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lf.b(var8, var9, var7 + var8, var9, this.field_h);
                        var10 = -1 + var12.e(false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-1 < (var10 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        lf.c(var12.a(var10, (byte) -37) * var7 / var12.i(-1) + var8, var9, this.field_a, this.field_k);
                        var10--;
                        if (var11 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_i == null) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_i.a(var12.field_u, var7 / 2 + var8, var12.field_H + var9 - -this.field_i.field_C, this.field_e, this.field_g);
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var6);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("og.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param3 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 23440) {
            return false;
        }
        return 250 < mc.field_k ? true : false;
    }

    og(le param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_d = param4;
            this.field_e = param1;
            this.field_i = param0;
            this.field_h = param3;
            this.field_g = param2;
            this.field_a = param5;
            this.field_k = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_j = "Retry";
        field_f = new int[][]{new int[]{321, 332, 363, 394, 435, 484, 508, 553, 584, 619}, new int[]{321, 332, 363, 394, 435, 484, 508, 554, 585, 619}, new int[]{321, 332, 363, 394, 435, 484, 508, 554, 586, 621}, new int[]{321, 332, 362, 393, 434, 484, 508, 556, 587, 623}, new int[]{321, 331, 361, 391, 433, 484, 509, 557, 589, 626}, new int[]{321, 330, 359, 389, 431, 483, 508, 558, 590, 628}, new int[]{321, 329, 357, 387, 429, 481, 507, 558, 591, 629}, new int[]{321, 328, 354, 383, 425, 478, 505, 557, 590, 628}, new int[]{321, 327, 352, 380, 422, 476, 502, 554, 588, 626}, new int[]{321, 326, 350, 378, 418, 473, 499, 552, 585, 623}, new int[]{321, 325, 348, 375, 415, 470, 496, 549, 581, 620}, new int[]{321, 324, 345, 372, 412, 467, 493, 544, 577, 616}, new int[]{321, 323, 342, 367, 406, 462, 487, 538, 571, 609}, new int[]{321, 322, 337, 360, 399, 454, 479, 529, 561, 599}, new int[]{321, 322, 330, 349, 387, 442, 466, 515, 547, 585}, new int[]{321, 321, 321, 334, 371, 426, 450, 496, 528, 565}, new int[]{321, 320, 311, 317, 352, 408, 430, 476, 507, 544}, new int[]{321, 319, 302, 301, 332, 389, 411, 457, 488, 525}, new int[]{321, 319, 296, 288, 315, 371, 395, 441, 473, 509}, new int[]{321, 318, 291, 278, 301, 357, 381, 429, 462, 498}, new int[]{321, 318, 289, 274, 293, 349, 373, 422, 454, 490}, new int[]{321, 317, 288, 272, 289, 345, 369, 417, 449, 486}, new int[]{321, 316, 287, 270, 284, 339, 364, 412, 444, 481}, new int[]{321, 316, 287, 269, 277, 331, 357, 406, 438, 475}, new int[]{321, 315, 288, 268, 267, 318, 346, 396, 428, 465}, new int[]{321, 314, 288, 267, 255, 299, 329, 381, 413, 450}, new int[]{321, 314, 289, 265, 244, 276, 307, 361, 394, 429}, new int[]{321, 313, 289, 264, 235, 255, 284, 341, 374, 409}, new int[]{321, 313, 289, 263, 228, 238, 266, 324, 358, 392}, new int[]{321, 313, 288, 261, 224, 225, 251, 310, 345, 379}, new int[]{321, 312, 287, 259, 220, 216, 240, 299, 335, 370}, new int[]{321, 312, 286, 258, 217, 207, 228, 286, 323, 361}, new int[]{321, 311, 285, 256, 215, 195, 209, 262, 299, 340}, new int[]{321, 311, 284, 254, 212, 180, 184, 219, 250, 288}, new int[]{321, 310, 282, 252, 210, 167, 156, 158, 169, 188}, new int[]{321, 310, 281, 250, 208, 158, 136, 102, 87, 72}, new int[]{321, 310, 280, 249, 207, 155, 127, 75, 45, 10}, new int[]{321, 309, 279, 248, 207, 155, 128, 74, 40, 1}, new int[]{321, 309, 279, 248, 207, 157, 131, 81, 48, 11}, new int[]{321, 309, 279, 248, 207, 158, 133, 87, 56, 20}, new int[]{321, 309, 279, 248, 207, 158, 134, 89, 58, 23}};
    }
}
