/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static ka[] field_d;
    static String[] field_c;
    static sl field_a;
    static ka[] field_b;
    static boolean[][][] field_e;
    static int[][] field_j;
    static int[] field_g;
    static int[][] field_f;
    static int[] field_h;
    static ra field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ka[] var11;
        ka var12;
        int var13;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var6Lifetime2Lifetime1;
        int var7Lifetime2Lifetime1;
        var13 = TorChallenge.field_F ? 1 : 0;
        if (lg.field_d[param0][18] < 0) {
          return;
        }
        var5 = ic.field_B[param0][0];
        if (0 > var5) {
          return;
        }
        var6 = ic.field_B[param0][2];
        var7 = ic.field_B[param0][3];
        var8 = ic.field_B[param0][4];
        var9 = ic.field_B[param0][5];
        var10 = -1 - var9;
        if (param2 < 0 &&
          param1 <= 0) {
          return;
        }
        if (0 < param2 &&
          param1 >= param4) {
          return;
        }
        if (param3 > -108) {
          field_h = (int[]) null;
        }
        if ((param2 < 0 ||
          param2 > 0) &&
          (param1 > 0 &&
          param4 > param1)) {
          if (param2 < 0) {
            var7 = (var7 - var10) * param1 / param4 + var10;
          } else {
            var7 = var7 + param1 * (var10 - var7) / param4;
          }
        }
        var11 = ui.field_i;
        hd.a(var11, var9, var8, (byte) 102, var7, var6);
        var12 = ph.field_o[var5];
        var7Lifetime1 = ic.field_B[param0][7];
        var6Lifetime1 = ic.field_B[param0][6];
        var10 = -ic.field_B[param0][3] + var10 + var7Lifetime1;
        if ((param2 < 0 ||
          param2 > 0) && (param1 > 0 &&
          param4 > param1)) {
          if (param2 >= 0) {
            var7Lifetime1 = var7Lifetime1 + (-var7Lifetime1 + var10) * param1 / param4;
          } else {
            var7Lifetime1 = var10 + param1 * (-var10 + var7Lifetime1) / param4;
          }
        }
        var12.g(var6Lifetime1, var7Lifetime1);
        if (0 == param0) {
          var6Lifetime2 = ic.field_B[0][8];
          var7Lifetime2 = ic.field_B[0][9];
          ri.field_j.g(var6Lifetime2, var7Lifetime2);
          var7Lifetime2Lifetime1 = ic.field_B[0][11];
          var6Lifetime2Lifetime1 = ic.field_B[0][10];
          ri.field_j.g(var6Lifetime2Lifetime1, var7Lifetime2Lifetime1);
        }
        return;
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = (boolean[][][]) null;
        field_d = null;
        field_i = null;
        field_j = (int[][]) null;
        if (param0 != -5) {
          field_g = (int[]) null;
        }
        field_b = null;
        field_h = null;
        field_c = null;
        field_f = (int[][]) null;
        field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void b(byte param0) {
        if (param0 != -44) {
          field_h = (int[]) null;
        }
        na.field_e = false;
        id.field_b.j(-117);
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        uf var16 = null;
        uf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          var16 = new uf(param0);
          var17 = var16;
          var17.field_q = param0.length - 2;
          vl.field_b = var17.c(false);
          ug.field_e = new int[vl.field_b];
          vd.field_c = new boolean[vl.field_b];
          gf.field_t = new byte[vl.field_b][];
          h.field_a = new byte[vl.field_b][];
          lg.field_e = new int[vl.field_b];
          pg.field_r = new int[vl.field_b];
          dd.field_t = new int[vl.field_b];
          var17.field_q = param0.length - 7 - 8 * vl.field_b;
          ij.field_B = var17.c(false);
          le.field_g = var17.c(false);
          var3 = 1 + (255 & var17.j(-94));
          for (var4 = 0; vl.field_b > var4; var4++) {
            ug.field_e[var4] = var16.c(false);
          }
          for (var4Lifetime1 = param1; var4Lifetime1 < vl.field_b; var4Lifetime1++) {
            dd.field_t[var4Lifetime1] = var17.c(false);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < vl.field_b; var4Lifetime2++) {
            pg.field_r[var4Lifetime2] = var17.c(false);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < vl.field_b; var4Lifetime3++) {
            lg.field_e[var4Lifetime3] = var17.c(false);
          }
          var17.field_q = -(var3 * 3) + 3 + (-(8 * vl.field_b) + param0.length - 7);
          td.field_m = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            td.field_m[var4Lifetime4] = var17.g(0);
            if (0 == td.field_m[var4Lifetime4]) {
              td.field_m[var4Lifetime4] = 1;
            }
          }
          var17.field_q = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < vl.field_b; var4Lifetime5++) {
            var5 = pg.field_r[var4Lifetime5];
            var6 = lg.field_e[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            h.field_a[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            gf.field_t[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.j(-91);
            stackIn_22_0 = 0;
            stackIn_22_1 = var11 & 1;
            if (stackIn_22_0 == stackIn_22_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.d((byte) 90);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var17.d((byte) 102);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_47_0 = var10;
                  if (var13 == -1) {
                    stackIn_48_1 = 0;
                  } else {
                    stackIn_48_1 = 1;
                  }
                  var10 = stackIn_47_0 | stackIn_48_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var12 + var13 * var5] = var17.d((byte) 114);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var17.d((byte) 98);
                    var9[var12 + var13 * var5] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_36_0 = var10;
                    if (var14 == -1) {
                      stackIn_37_1 = 0;
                    } else {
                      stackIn_37_1 = 1;
                    }
                    var10 = stackIn_36_0 | stackIn_37_1;
                  }
                }
              }
            }
            vd.field_c[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("ba.E(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(byte param0) {
        t.field_b.i(param0 + 8389890);
        if (oa.field_k == null) {
          oa.field_k = new pe(t.field_b, jh.field_a);
        }
        t.field_b.a((byte) 53, (ee) (oa.field_k));
        if (param0 != 15) {
          ba.a(-4, 102, 101, -116, -9);
        }
    }

    static {
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_e = new boolean[][][]{new boolean[][]{new boolean[]{false, true, false}, new boolean[]{true, false}, new boolean[]{true, false}, new boolean[]{true, true, true, true, true, true}, new boolean[]{true, false}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}, new boolean[][]{new boolean[]{true, false}, new boolean[]{true, false, true, false}, new boolean[]{false, true, true, true, false, false}, new boolean[]{false, true, true, false, true, false}, new boolean[]{false, true, true, false, false}, new boolean[]{true, true, false, true, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, false}, new boolean[]{false, true}, new boolean[]{false, true, true, false}, new boolean[]{false, true, true, true, true, true}, new boolean[]{false, true, true}, new boolean[]{false}, new boolean[]{true, true, true, true, true, true}}};
        field_g = new int[]{1, 2, 3, 4, 5, 6, 7, 22, 23, 24};
        field_h = new int[8192];
        field_f = new int[2][2];
    }
}
