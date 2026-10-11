/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends lh {
    static String[] field_s;
    static kh[][] field_m;
    static int[] field_l;
    static String field_o;
    static int[] field_j;
    int[] field_i;
    static int[] field_t;
    boolean field_n;
    int field_k;
    static int[] field_r;
    static int[][] field_p;
    static int[] field_q;

    final static sf a(int param0, int param1, int param2) {
        byte[] var4 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = fleas.field_A ? 1 : 0;
        sf var3 = new sf(22050, param0);
        byte[] var4Lifetime1;
        double var5Lifetime1;
        int var7Lifetime1;
        if (param2 == 1) {
          var4 = var3.field_l;
          var5 = 6.283185307179586 * (double)param1 / 22050.0;
          for (var7 = param0 - 1; 0 <= var7; var7--) {
            var4[var7] = (byte)(int)(ma.a(var5 * (double)var7, 97) * 127.0);
          }
          return var3;
        }
        ia.a(-45);
        var4Lifetime1 = var3.field_l;
        var5Lifetime1 = 6.283185307179586 * (double)param1 / 22050.0;
        for (var7Lifetime1 = param0 - 1; 0 <= var7Lifetime1; var7Lifetime1--) {
          var4Lifetime1[var7Lifetime1] = (byte)(int)(ma.a(var5Lifetime1 * (double)var7Lifetime1, 97) * 127.0);
        }
        return var3;
    }

    final static int a(boolean param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = uj.a(false, 0, param2, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 40;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ia.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_m = (kh[][]) null;
        field_l = null;
        field_s = null;
        field_o = null;
        field_j = null;
        field_p = (int[][]) null;
        field_t = null;
        if (param0) {
          field_r = null;
          field_q = null;
          return;
        }
        ia.b(true);
        field_r = null;
        field_q = null;
    }

    final static void a(boolean param0, int param1) {
        pd var2 = null;
        int var3 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        pd var2Lifetime1;
        var3 = fleas.field_A ? 1 : 0;
        try {
          gf.field_d = param1;
          if (!param0) {
            ia.a(17, 35, -72);
          }
          var2 = (pd) (bk.field_d.c((byte) 47));
          while (var2 != null) {
            if (!var2.field_n.b((byte) -54)) {
              var2.c(-1);
            } else {
              var2.field_m.h(gf.field_d * var2.field_j + 128 >> 8);
            }
            var2 = (pd) (bk.field_d.b((byte) -105));
          }
          if (jc.field_c == null) {
            return;
          }
          var2Lifetime1 = (pd) (jc.field_c.c((byte) 47));
          while (var2Lifetime1 != null) {
            stackIn_15_0 = var2Lifetime1.field_n.b((byte) -54);
            if (stackIn_15_0) {
              var2Lifetime1.field_m.h(128 + gf.field_d * var2Lifetime1.field_j >> 8);
            } else {
              var2Lifetime1.c(-1);
            }
            var2Lifetime1 = (pd) (jc.field_c.b((byte) -105));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "ia.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          field_s = (String[]) null;
        }
    }

    final static void a(int param0) {
        uh var1 = (uh) (fg.field_t.a((byte) 100));
        if (param0 > -52) {
          field_q = (int[]) null;
          if (var1 != null) {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, var1);
            return;
          }
          throw new IllegalStateException();
        }
        if (var1 != null) {
          gb.a(var1.field_r, var1.field_i, var1.field_p);
          gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
          var1.field_r = null;
          fk.field_z.a(false, var1);
          return;
        }
        throw new IllegalStateException();
    }

    ia() {
        this.field_n = false;
    }

    static {
        field_s = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_m = new kh[2][];
        field_j = new int[11];
        field_o = "<%0>Slopes:<%1> these come in left and right varieties; fleas can walk up these.";
        field_t = new int[11];
        field_l = new int[11];
        field_r = new int[11];
        field_q = new int[4];
        field_p = new int[11][];
        tk.a(34, 155, new int[]{0, 21, 3, 12, 13, 4, 2, 14, 11}, 485, -124, 0, 135);
        tk.a(34, 155, new int[]{1, 19, 12, 13, 3, 7}, 485, -121, 1, 135);
        tk.a(34, 140, new int[]{15, 5}, 500, -123, 2, 383);
        tk.a(34, 85, new int[]{17, 6, 18}, 600, -128, 3, 415);
        tk.a(34, 140, new int[]{15, 5}, 500, -119, 4, 383);
        tk.a(34, 165, new int[]{2, 5}, 475, -118, 5, 383);
        tk.a(70, 165, new int[]{15, 16}, 475, -118, 6, 295);
        tk.a(32, 50, new int[]{}, 288, -119, 7, 400);
        tk.a(34, 140, new int[]{20, 15, 5}, 500, -117, 8, 376);
        tk.a(34, 165, new int[]{22}, 475, -118, 9, 400);
        tk.a(34, 190, new int[]{22}, 450, -126, 10, 400);
    }
}
