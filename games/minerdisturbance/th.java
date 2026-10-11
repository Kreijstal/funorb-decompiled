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
          field_a = (String) null;
        }
        this.field_c[param0][param1] = true;
        if (vd.field_s[param0]) {
          for (var4 = 0; var4 < 2; var4++) {
            this.field_c[param0][var4] = true;
          }
        }
    }

    th() {
        this.a((byte) -93);
    }

    final boolean a(int param0, int param1, byte param2) {
        int var4 = 70 % ((param2 - 63) / 34);
        return this.field_c[param0][param1];
    }

    final static int a(byte param0, int param1) {
        if (param0 != 24) {
          field_a = (String) null;
        }
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = 8 - (7 & param1);
        }
        int var3 = param1 + var2;
        return var3;
    }

    private final void a(int param0, ld param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        try {
          param1.f((byte) 16);
          for (var3_int = 0; var3_int < 35; var3_int++) {
            for (var4 = 0; 2 > var4; var4++) {
              this.field_c[var3_int][var4] = param1.c((byte) -107, 1) == 1 ? true : false;
            }
          }
          if (param0 != 33) {
            this.a((byte) 67);
          }
          param1.o(param0 + 72);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "th.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    th(ld param0) {
        try {
          this.a((byte) 126);
          this.a(33, param0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "th.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, ld param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_7_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          param1.c(true);
          for (var3_int = 0; var3_int < 35; var3_int++) {
            for (var4 = 0; var4 < 2; var4++) {
              stackIn_7_0 = (ld) (param1);
              if (this.field_c[var3_int][var4]) {
                stackIn_8_1 = 1;
              } else {
                stackIn_8_1 = 0;
              }
              ((ld) (Object) stackIn_7_0).a(stackIn_8_1, (byte) 14, 1);
            }
          }
          param1.n(98);
          if (param0 != 27437) {
            this.a(-96, 39, -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("th.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        this.field_c = new boolean[35][2];
        int var2 = 70 % ((-35 - param0) / 33);
    }

    final void a(int param0, th param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (param0 != 35) {
            return;
          }
          for (var3_int = 0; 35 > var3_int; var3_int++) {
            for (var4 = 0; var4 < 2; var4++) {
              if (param1.field_c[var3_int][var4]) {
                this.field_c[var3_int][var4] = true;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("th.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -15649) {
          th.a((byte) -110, -86);
        }
        field_b = (boolean[][]) null;
    }

    static {
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
