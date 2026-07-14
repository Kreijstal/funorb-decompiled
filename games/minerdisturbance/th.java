/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    private boolean[][] field_c;
    static boolean[][] field_b;
    static String field_a;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 > -112) {
            field_a = null;
        }
        ((th) this).field_c[param0][param1] = true;
        if (!(!vd.field_s[param0])) {
            for (var4 = 0; var4 < 2; var4++) {
                ((th) this).field_c[param0][var4] = true;
            }
        }
    }

    th() {
        this.a((byte) -93);
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 70 % ((param2 - 63) / 34);
        return ((th) this).field_c[param0][param1];
    }

    final static int a(byte param0, int param1) {
        if (param0 != 24) {
            field_a = null;
        }
        int var2 = 0;
        if ((param1 & 7) != 0) {
            var2 = 8 + -(7 & param1);
        }
        int var3 = param1 - -var2;
        return var3;
    }

    private final void a(int param0, ld param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        param1.f((byte) 16);
        for (var3 = 0; var3 < 35; var3++) {
            for (var4 = 0; 2 > var4; var4++) {
                ((th) this).field_c[var3][var4] = -2 == (param1.c((byte) -107, 1) ^ -1) ? true : false;
            }
        }
        if (param0 != 33) {
            this.a((byte) 67);
        }
        param1.o(param0 + 72);
    }

    th(ld param0) {
        this.a((byte) 126);
        this.a(33, param0);
    }

    final void b(int param0, ld param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        param1.c(true);
        for (var3 = 0; -36 < var3; var3++) {
            for (var4 = 0; -3 > var4; var4++) {
                param1.a(!((th) this).field_c[var3][var4] ? 0 : 1, (byte) 14, 1);
            }
        }
        param1.n(98);
        if (param0 != 27437) {
            ((th) this).a(-96, 39, -5);
        }
    }

    private final void a(byte param0) {
        ((th) this).field_c = new boolean[35][2];
        int var2 = 70 % ((-35 - param0) / 33);
    }

    final void a(int param0, th param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (param0 == 35) {
          var3 = 0;
          L0: while (true) {
            if (35 <= var3) {
              return;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= 2) {
                  var3++;
                  continue L0;
                } else {
                  if (param1.field_c[var3][var4]) {
                    ((th) this).field_c[var3][var4] = true;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -15649) {
            int discarded$0 = th.a((byte) -110, -86);
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[35][2];
        field_b[0][0] = true;
        field_b[1][0] = true;
        field_b[2][0] = true;
        field_b[3][0] = true;
        field_b[4][0] = true;
        field_b[5][0] = true;
        field_b[6][0] = true;
        field_b[7][0] = true;
        field_b[8][0] = true;
        field_b[9][0] = true;
        field_b[10][0] = true;
        field_b[11][0] = true;
        field_b[12][0] = true;
        field_b[13][0] = true;
        field_b[14][0] = true;
        field_b[15][0] = true;
        field_b[16][0] = true;
        field_b[17][0] = true;
        field_b[18][0] = true;
        field_b[20][0] = true;
        field_b[21][0] = true;
        field_b[22][0] = true;
        field_b[23][0] = true;
        field_b[24][0] = false;
        field_b[25][0] = false;
        field_b[26][0] = false;
        field_b[27][0] = false;
        field_b[28][0] = false;
        field_b[29][0] = false;
        field_b[30][0] = false;
        field_b[31][0] = false;
        field_b[32][0] = false;
        field_b[33][0] = false;
        field_b[0][1] = true;
        field_b[1][1] = true;
        field_b[2][1] = true;
        field_b[3][1] = true;
        field_b[4][1] = true;
        field_b[5][1] = true;
        field_b[6][1] = true;
        field_b[7][1] = true;
        field_b[8][1] = true;
        field_b[9][1] = true;
        field_b[10][1] = true;
        field_b[11][1] = true;
        field_b[12][1] = true;
        field_b[13][1] = true;
        field_b[14][1] = true;
        field_b[15][1] = true;
        field_b[16][1] = true;
        field_b[17][1] = true;
        field_b[18][1] = true;
        field_b[20][1] = true;
        field_b[19][1] = true;
        field_b[21][1] = true;
        field_b[22][1] = true;
        field_b[23][1] = true;
        field_b[24][1] = true;
        field_b[25][1] = true;
        field_b[26][1] = true;
        field_b[27][1] = true;
        field_b[28][1] = true;
        field_b[29][1] = true;
        field_b[30][1] = true;
        field_b[31][1] = true;
        field_b[32][1] = true;
        field_b[33][1] = true;
        field_b[34][1] = true;
        field_a = "Greaseproof suit: Swim through oil as through water.";
    }
}
