/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends gg {
    int[] field_r;
    int field_m;
    int field_k;
    int field_p;
    int field_j;
    static me field_s;
    static kb field_i;
    static int[] field_o;
    static int[] field_l;
    int field_u;
    int field_q;
    int field_t;
    long field_n;
    static String[] field_h;

    public static void b(boolean param0) {
        field_l = null;
        field_h = null;
        field_s = null;
        field_i = null;
        field_o = null;
        if (param0) {
            field_h = null;
        }
    }

    final static void a(boolean param0, int param1) {
        td.field_h.a(param0, (byte) -75);
        if (param1 > -104) {
            qc.b(false);
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 34) {
          if (10 <= fj.field_i) {
            if (lh.field_l) {
              return false;
            } else {
              L0: {
                if (wf.c((byte) -79)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          qc.a(true, 85);
          if (10 <= fj.field_i) {
            if (lh.field_l) {
              return false;
            } else {
              L1: {
                if (wf.c((byte) -79)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    qc(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((qc) this).field_r = param6;
        ((qc) this).field_q = param5;
        ((qc) this).field_p = param1;
        ((qc) this).field_j = param3;
        ((qc) this).field_k = param2;
        int fieldTemp$0 = l.field_c;
        l.field_c = l.field_c + 1;
        ((qc) this).field_u = fieldTemp$0 & 65535;
        ((qc) this).field_m = param0;
        ((qc) this).field_t = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[6];
        field_l = new int[36];
        field_o[4] = 220;
        field_o[0] = 140;
        field_o[5] = 125;
        field_o[3] = 160;
        field_l[13] = 88;
        field_o[2] = 170;
        field_o[1] = 160;
        field_l[12] = 34;
        field_l[6] = 126;
        field_l[30] = 83;
        field_l[5] = 84;
        field_l[2] = 124;
        field_l[15] = 44;
        field_l[18] = 111;
        field_l[33] = 36;
        field_l[32] = 34;
        field_l[20] = 59;
        field_l[23] = 25;
        field_l[27] = 63;
        field_l[24] = 26;
        field_l[11] = 43;
        field_l[7] = 71;
        field_l[26] = 63;
        field_l[21] = 25;
        field_l[8] = 48;
        field_l[17] = 105;
        field_l[22] = 25;
        field_l[4] = 93;
        field_l[35] = 76;
        field_l[9] = 41;
        field_l[34] = 31;
        field_l[16] = 256;
        field_l[10] = 68;
        field_l[25] = 36;
        field_l[3] = 43;
        field_l[19] = 98;
        field_l[31] = 40;
        field_l[29] = 61;
        field_l[14] = 79;
        field_l[1] = 190;
        field_l[29] = 52;
        field_l[0] = 256;
        field_i = new kb();
    }
}
