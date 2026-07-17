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

    final static sf a() {
        int var7 = 0;
        int var8 = fleas.field_A ? 1 : 0;
        sf var3 = new sf(22050, 882);
        byte[] var4 = var3.field_l;
        double var5 = 6.283185307179586 * (double)2500 / 22050.0;
        for (var7 = 881; 0 <= var7; var7--) {
            var4[var7] = (byte)(int)(ma.a(var5 * (double)var7, 97) * 127.0);
        }
        return var3;
    }

    final static int a(boolean param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = uj.a(false, 0, param2, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ia.F(").append(1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void c() {
        field_m = null;
        field_l = null;
        field_s = null;
        field_o = null;
        field_j = null;
        field_p = null;
        field_t = null;
        field_r = null;
        field_q = null;
    }

    final static void a(boolean param0, int param1) {
        pd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            gf.field_d = param1;
            var2 = (pd) (Object) bk.field_d.c((byte) 47);
            L1: while (true) {
              if (var2 == null) {
                if (jc.field_c != null) {
                  var2 = (pd) (Object) jc.field_c.c((byte) 47);
                  L2: while (true) {
                    if (var2 == null) {
                      break L0;
                    } else {
                      L3: {
                        if (var2.field_n.b((byte) -54)) {
                          var2.field_m.h(128 + gf.field_d * var2.field_j >> 8);
                          break L3;
                        } else {
                          var2.c(-1);
                          break L3;
                        }
                      }
                      var2 = (pd) (Object) jc.field_c.b((byte) -105);
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L4: {
                  if (!var2.field_n.b((byte) -54)) {
                    var2.c(-1);
                    break L4;
                  } else {
                    var2.field_m.h(gf.field_d * var2.field_j - -128 >> 8);
                    break L4;
                  }
                }
                var2 = (pd) (Object) bk.field_d.b((byte) -105);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var2_ref, "ia.B(" + 1 + 44 + param1 + 41);
        }
    }

    final static void b() {
    }

    final static void a(int param0) {
        uh var1 = null;
        var1 = (uh) (Object) fg.field_t.a((byte) 100);
        if (param0 <= -52) {
          if (var1 == null) {
            throw new IllegalStateException();
          } else {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, (lh) (Object) var1);
            return;
          }
        } else {
          field_q = null;
          if (var1 == null) {
            throw new IllegalStateException();
          } else {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, (lh) (Object) var1);
            return;
          }
        }
    }

    ia() {
        ((ia) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_m = new kh[2][];
        field_j = new int[11];
        field_o = "<%0>Slopes:<%1> these come in left and right varieties; fleas can walk up these.";
        field_t = new int[11];
        field_l = new int[11];
        field_r = new int[11];
        field_q = new int[4];
        field_p = new int[11][];
        tk.a(34, 155, new int[9], 485, -124, 0, 135);
        tk.a(34, 155, new int[6], 485, -121, 1, 135);
        tk.a(34, 140, new int[2], 500, -123, 2, 383);
        tk.a(34, 85, new int[3], 600, -128, 3, 415);
        tk.a(34, 140, new int[2], 500, -119, 4, 383);
        tk.a(34, 165, new int[2], 475, -118, 5, 383);
        tk.a(70, 165, new int[2], 475, -118, 6, 295);
        tk.a(32, 50, new int[0], 288, -119, 7, 400);
        tk.a(34, 140, new int[3], 500, -117, 8, 376);
        tk.a(34, 165, new int[1], 475, -118, 9, 400);
        tk.a(34, 190, new int[1], 450, -126, 10, 400);
    }
}
