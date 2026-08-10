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
        sf var3;
        byte[] var4;
        double var5;
        int var7;
        int var8;
        var8 = fleas.field_A ? 1 : 0;
        var3 = new sf(22050, param0);
        if (param2 != 1) {
          ia.a(-45);
          var4 = var3.field_l;
          var5 = 6.283185307179586 * (double)param1 / 22050.0;
          var7 = param0 + -1;
          L0: while (true) {
            if (0 > var7) {
              return var3;
            } else {
              var4[var7] = (byte)(int)(ma.a(var5 * (double)var7, 97) * 127.0);
              var7--;
              continue L0;
            }
          }
        } else {
          var4 = var3.field_l;
          var5 = 6.283185307179586 * (double)param1 / 22050.0;
          var7 = param0 + -1;
          L1: while (true) {
            if (0 > var7) {
              return var3;
            } else {
              var4[var7] = (byte)(int)(ma.a(var5 * (double)var7, 97) * 127.0);
              var7--;
              continue L1;
            }
          }
        }
    }

    final static int a(boolean param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = uj.a(false, 0, param2, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 40;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ia.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
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
        if (!param0) {
          ia.b(true);
          field_r = null;
          field_q = null;
          return;
        } else {
          field_r = null;
          field_q = null;
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        pd var2 = null;
        int var3 = 0;
        boolean stackIn_15_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              gf.field_d = param1;
              if (param0) {
                break L1;
              } else {
                ia.a(17, 35, -72);
                break L1;
              }
            }
            var2 = (pd) ((Object) bk.field_d.c((byte) 47));
            L2: while (true) {
              if (var2 == null) {
                if (jc.field_c != null) {
                  var2 = (pd) ((Object) jc.field_c.c((byte) 47));
                  L3: while (true) {
                    if (var2 == null) {
                      break L0;
                    } else {
                      stackIn_15_0 = var2.field_n.b((byte) -54);
                      L4: {
                        if (stackIn_15_0) {
                          var2.field_m.h(128 + gf.field_d * var2.field_j >> -1160573624);
                          break L4;
                        } else {
                          var2.c(-1);
                          break L4;
                        }
                      }
                      var2 = (pd) ((Object) jc.field_c.b((byte) -105));
                      continue L3;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L5: {
                  if (!var2.field_n.b((byte) -54)) {
                    var2.c(-1);
                    break L5;
                  } else {
                    var2.field_m.h(gf.field_d * var2.field_j - -128 >> 1641415368);
                    break L5;
                  }
                }
                var2 = (pd) ((Object) bk.field_d.b((byte) -105));
                continue L2;
              }
            }
          }
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
        uh var1;
        var1 = (uh) ((Object) fg.field_t.a((byte) 100));
        if (param0 <= -52) {
          if (var1 == null) {
            throw new IllegalStateException();
          } else {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, var1);
            return;
          }
        } else {
          field_q = (int[]) null;
          if (var1 == null) {
            throw new IllegalStateException();
          } else {
            gb.a(var1.field_r, var1.field_i, var1.field_p);
            gb.a(var1.field_j, var1.field_l, var1.field_q, var1.field_u);
            var1.field_r = null;
            fk.field_z.a(false, var1);
            return;
          }
        }
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
