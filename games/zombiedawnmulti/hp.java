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
          field_i = (String) null;
        }
        field_j = (int[][]) null;
        field_h = null;
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 >= param2) {
            throw new IllegalArgumentException();
          }
          if (l.a(param2, -62)) {
            stackIn_6_0 = (int)((long)param2 * (4294967295L & (long)param1.nextInt()) >> 32);
            return stackIn_6_0;
          }
          var4 = 32 / ((param0 + 31) / 34);
          var3_int = -2147483648 - (int)(4294967296L % (long)param2);
          do {
            var5 = param1.nextInt();
          } while (var5 >= var3_int);
          stackIn_11_0 = gd.a(var5, (byte) -87, param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1020) {
            hp.a(-13);
          }
          stackIn_5_0 = (md.a((byte) -11, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("hp.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private hp() throws Throwable {
        throw new Error();
    }

    static {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
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
        var2Lifetime1 = var4;
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
