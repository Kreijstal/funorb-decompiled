/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends za {
    static int[] field_j;
    static boolean[] field_m;
    static String field_l;
    static boolean[] field_k;
    static int[] field_i;
    jaclib.memory.heap.NativeHeap field_h;
    static int[] field_n;

    final void b(byte param0) {
        if (param0 != 30) {
            to.c(53);
        }
        ((to) this).field_h.a();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rua.field_gb.a(param0, param5, param3 ^ -23751, param6, param1);
        if (!(kga.field_n == null)) {
            kga.field_n.a(param4, -wv.field_j + param2, -3269, param5, param5, param2);
        }
        if (param3 != 25) {
            to.a(-20, 16, -95, -68, -87, 79, 16);
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_n = null;
        field_i = null;
        field_l = null;
        int var1 = 105 % ((75 - param0) / 47);
        field_k = null;
        field_j = null;
    }

    final static void b(int param0) {
        qga.c(-10794);
    }

    to(int param0) {
        ((to) this).field_h = new jaclib.memory.heap.NativeHeap(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_l = "Searching for opponents";
        field_k = new boolean[98];
        field_n = new int[98];
        field_j = new int[98];
        field_i = new int[98];
        field_m = new boolean[98];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 98) {
            field_k[94] = true;
            field_m[1] = true;
            field_k[93] = true;
            field_k[63] = true;
            field_k[47] = true;
            field_k[32] = true;
            field_n[25] = 196;
            field_m[5] = true;
            field_n[50] = 196;
            field_k[42] = true;
            field_k[97] = true;
            field_n[48] = 64;
            field_n[14] = 72;
            field_k[31] = true;
            field_k[65] = true;
            field_k[30] = true;
            field_k[37] = true;
            field_k[48] = true;
            field_k[50] = true;
            field_k[35] = true;
            field_m[13] = true;
            field_n[49] = 196;
            field_k[33] = true;
            field_k[29] = true;
            field_m[17] = true;
            field_m[22] = true;
            field_k[71] = true;
            field_k[41] = true;
            field_n[59] = 128;
            field_k[44] = true;
            field_k[43] = true;
            field_n[11] = 64;
            field_k[95] = true;
            field_n[89] = 128;
            field_n[5] = 96;
            field_n[71] = 16;
            field_k[45] = true;
            field_m[10] = true;
            field_m[19] = true;
            field_m[21] = true;
            field_n[10] = 255;
            field_k[67] = true;
            field_n[57] = 196;
            field_k[62] = true;
            field_n[67] = 96;
            field_k[34] = true;
            field_n[61] = 255;
            field_n[9] = 196;
            field_n[60] = 128;
            field_n[62] = 96;
            field_n[85] = 96;
            field_n[43] = 64;
            field_n[54] = 196;
            field_k[39] = true;
            field_n[88] = 96;
            field_k[46] = true;
            field_n[86] = 96;
            field_m[11] = true;
            field_n[13] = 64;
            field_m[4] = true;
            field_k[54] = true;
            field_n[55] = 128;
            field_n[65] = 255;
            field_m[0] = true;
            field_n[68] = 96;
            field_n[87] = 96;
            field_k[64] = true;
            field_k[68] = true;
            field_m[9] = true;
            field_n[58] = 196;
            field_n[56] = 255;
            field_k[40] = true;
            field_n[26] = 128;
            field_k[49] = true;
            field_k[36] = true;
            field_n[17] = 128;
            field_k[61] = true;
            field_n[77] = 32;
            field_k[38] = true;
            field_k[96] = true;
            field_n[6] = 96;
            field_k[89] = true;
            field_i[26] = 2;
            field_i[71] = 3;
            field_i[14] = 6;
            field_i[13] = 4;
            field_m[42] = true;
            field_i[78] = 3;
            field_i[77] = 8;
            field_i[28] = 2;
            field_m[29] = true;
            field_i[23] = 4;
            field_m[40] = true;
            field_i[25] = 3;
            field_m[32] = true;
            field_i[74] = 3;
            field_i[89] = 4;
            field_i[86] = 5;
            field_i[49] = 3;
            field_m[96] = true;
            field_m[30] = true;
            field_m[39] = true;
            field_i[76] = 4;
            field_m[53] = true;
            field_i[88] = 5;
            field_i[84] = 2;
            field_i[63] = 10;
            field_i[20] = 3;
            field_i[90] = 3;
            field_i[82] = 2;
            field_i[80] = 4;
            field_i[2] = 5;
            field_m[31] = true;
            field_i[70] = 3;
            field_m[33] = true;
            field_i[93] = 2;
            field_m[43] = true;
            field_m[94] = true;
            field_i[75] = 4;
            field_i[16] = 4;
            field_i[87] = 5;
            field_i[64] = 2;
            field_m[57] = true;
            field_i[85] = 5;
            field_m[55] = true;
            field_i[79] = 4;
            field_j[1] = 9;
            field_m[97] = true;
            field_m[41] = true;
            field_i[50] = 3;
            field_i[69] = 3;
            field_i[11] = 4;
            field_i[3] = 5;
            field_m[95] = true;
            field_i[24] = 4;
            field_i[92] = 2;
            field_j[0] = 8;
            field_j[35] = 111;
            field_j[29] = 105;
            field_j[12] = 44;
            field_j[11] = 46;
            field_j[94] = 231;
            field_j[47] = 103;
            field_j[42] = 98;
            field_j[60] = 130;
            field_j[79] = 174;
            field_j[44] = 100;
            field_j[81] = 220;
            field_j[77] = 212;
            field_j[13] = 50;
            field_j[74] = 143;
            field_j[67] = 197;
            field_j[28] = 92;
            field_j[22] = 78;
            field_j[48] = 104;
            field_j[30] = 106;
            field_j[84] = 182;
            field_j[62] = 195;
            field_j[93] = 235;
            field_j[71] = 138;
            field_j[9] = 25;
            field_j[15] = 45;
            field_j[75] = 146;
            field_j[91] = 222;
            field_j[49] = 116;
            field_j[92] = 225;
            field_j[80] = 184;
            field_j[88] = 169;
            field_j[90] = 221;
            field_j[73] = 142;
            field_j[5] = 28;
            field_j[38] = 114;
            field_j[41] = 97;
            field_j[39] = 95;
            field_j[57] = 127;
            field_j[65] = 210;
            field_j[46] = 102;
            field_j[16] = 34;
            field_j[33] = 109;
            field_j[40] = 96;
            field_j[54] = 115;
            field_j[21] = 77;
            field_j[59] = 129;
            field_j[43] = 99;
            field_j[86] = 159;
            field_j[53] = 123;
            field_j[97] = 234;
            field_j[76] = 150;
            field_j[96] = 233;
            field_j[25] = 87;
            field_j[24] = 83;
            field_j[4] = 20;
            field_j[83] = 181;
            field_j[26] = 90;
            field_j[64] = 208;
            field_j[51] = 122;
            field_j[19] = 76;
            field_j[17] = 56;
            field_j[32] = 108;
            field_j[3] = 15;
            field_j[18] = 72;
            field_j[50] = 119;
            field_j[7] = 21;
            field_j[8] = 26;
            field_j[72] = 141;
            field_j[14] = 38;
            field_j[85] = 154;
            field_j[23] = 79;
            field_j[89] = 227;
            field_j[78] = 178;
            field_j[31] = 107;
            field_j[63] = 198;
            field_j[87] = 164;
            field_j[58] = 128;
            field_j[61] = 131;
            field_j[52] = 124;
            field_j[10] = 54;
            field_j[36] = 112;
            field_j[37] = 113;
            field_j[45] = 101;
            field_j[56] = 126;
            field_j[82] = 188;
            field_j[6] = 29;
            field_j[68] = 196;
            field_j[20] = 73;
            field_j[34] = 110;
            field_j[69] = 132;
            field_j[2] = 10;
            field_j[70] = 135;
            field_j[55] = 125;
            field_j[27] = 94;
            field_j[95] = 232;
            return;
          } else {
            field_k[var0] = false;
            field_n[var0] = 96;
            field_m[var0] = false;
            field_i[var0] = 0;
            field_j[var0] = -1;
            var0++;
            continue L0;
          }
        }
    }
}
