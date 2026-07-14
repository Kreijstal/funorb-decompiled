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
        sf var3 = null;
        byte[] var4 = null;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
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
        if (!param0) {
            return 40;
        }
        return uj.a(false, 0, param2, param1);
    }

    public static void c(boolean param0) {
        field_m = null;
        field_l = null;
        field_s = null;
        field_o = null;
        field_j = null;
        field_p = null;
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
        Object var2 = null;
        pd var2_ref = null;
        int var3 = 0;
        var2 = null;
        var3 = fleas.field_A ? 1 : 0;
        gf.field_d = param1;
        if (param0) {
          var2_ref = (pd) (Object) bk.field_d.c((byte) 47);
          L0: while (true) {
            if (var2_ref == null) {
              if (jc.field_c != null) {
                var2_ref = (pd) (Object) jc.field_c.c((byte) 47);
                L1: while (true) {
                  if (var2_ref != null) {
                    L2: {
                      if (var2_ref.field_n.b((byte) -54)) {
                        var2_ref.field_m.h(128 + gf.field_d * var2_ref.field_j >> -1160573624);
                        break L2;
                      } else {
                        var2_ref.c(-1);
                        break L2;
                      }
                    }
                    var2_ref = (pd) (Object) jc.field_c.b((byte) -105);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (!var2_ref.field_n.b((byte) -54)) {
                  var2_ref.c(-1);
                  break L3;
                } else {
                  var2_ref.field_m.h(gf.field_d * var2_ref.field_j - -128 >> 1641415368);
                  break L3;
                }
              }
              var2_ref = (pd) (Object) bk.field_d.b((byte) -105);
              continue L0;
            }
          }
        } else {
          sf discarded$1 = ia.a(17, 35, -72);
          var2_ref = (pd) (Object) bk.field_d.c((byte) 47);
          L4: while (true) {
            if (var2_ref == null) {
              if (jc.field_c != null) {
                var2_ref = (pd) (Object) jc.field_c.c((byte) 47);
                L5: while (true) {
                  if (var2_ref != null) {
                    L6: {
                      if (var2_ref.field_n.b((byte) -54)) {
                        var2_ref.field_m.h(128 + gf.field_d * var2_ref.field_j >> -1160573624);
                        break L6;
                      } else {
                        var2_ref.c(-1);
                        break L6;
                      }
                    }
                    var2_ref = (pd) (Object) jc.field_c.b((byte) -105);
                    continue L5;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L7: {
                if (!var2_ref.field_n.b((byte) -54)) {
                  var2_ref.c(-1);
                  break L7;
                } else {
                  var2_ref.field_m.h(gf.field_d * var2_ref.field_j - -128 >> 1641415368);
                  break L7;
                }
              }
              var2_ref = (pd) (Object) bk.field_d.b((byte) -105);
              continue L4;
            }
          }
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            field_s = null;
        }
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
