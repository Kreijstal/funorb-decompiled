/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hp extends br {
    static int[] field_s;
    int field_v;
    int field_n;
    int field_r;
    static int[][] field_j;
    int field_f;
    static int[] field_g;
    int field_u;
    int field_q;
    static int[] field_l;
    static String field_i;
    static String field_o;
    static String field_m;
    static String[] field_p;
    static ri field_t;
    static String field_h;
    static int field_k;

    public static void a(int param0) {
        field_i = null;
        field_p = null;
        field_g = null;
        field_s = null;
        field_m = null;
        field_t = null;
        field_l = null;
        field_o = null;
        if (param0 != 120) {
            field_i = null;
        }
        field_j = null;
        field_h = null;
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (0 >= param2) {
              throw new IllegalArgumentException();
            } else {
              if (l.a(param2, -62)) {
                stackOut_5_0 = (int)((long)param2 * (4294967295L & (long)param1.nextInt()) >> 32);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var4 = 32 / ((param0 - -31) / 34);
                var3_int = -2147483648 - (int)(4294967296L % (long)param2);
                L1: while (true) {
                  var5 = param1.nextInt();
                  if (var5 < var3_int) {
                    stackOut_10_0 = gd.a(var5, (byte) -87, param2);
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("hp.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 1020) {
                break L1;
              } else {
                hp.a(-13);
                break L1;
              }
            }
            L2: {
              if (md.a((byte) -11, param0) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("hp.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private hp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        int var3 = 0;
        field_s = new int[8192];
        field_l = new int[120];
        field_g = new int[120];
        field_j = new int[8][16];
        double var0 = 0.05235987755982988;
        for (var2 = 0; var2 < 120; var2++) {
            field_l[var2] = (int)(24.0 * Math.cos(var0 * (double)var2));
            field_g[var2] = (int)(24.0 * Math.sin(var0 * (double)var2));
        }
        int var4 = 0;
        var2 = var4;
        while (field_j[0].length > var4) {
            var3 = 16 * var4;
            field_j[0][var4] = cr.b(tq.b(var3, 255), tq.b(-1174404865, var3) << 8);
            field_j[1][var4] = cr.b(var3 << 16, var3 << 8);
            field_j[2][var4] = cr.b(tq.b(255, var3 / 2), tq.b(var3, -234880769) << 8);
            field_j[3][var4] = var3 * 65793;
            field_j[4][var4] = cr.b(tq.b(1744830974, var3) << 7, var3 << 16);
            field_j[5][var4] = var3 << 16;
            field_j[6][var4] = var3 << 16;
            field_j[7][var4] = cr.b(cr.b(tq.b(var3, 1020) << 6, tq.b(var3 << 14, 16718971)), var3);
            var4++;
        }
        field_i = "You can ask to join this game";
        field_p = new String[]{"Catch as many as you can before the time runs out!", "Get across the road!", "Swarm the entrance to the White House!", ""};
        field_h = "Exploiting a bug";
        field_m = "Unrated game";
        field_o = "Ask to join <%0>'s game";
    }
}
