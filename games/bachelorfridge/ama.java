/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ama extends k {
    static String field_m;
    static kv[] field_o;
    private vo[] field_n;
    static String field_l;
    static String field_k;

    public ama() {
        super(0, true);
    }

    final int[] a(int param0, int param1) {
        int[] var4 = ((ama) this).field_j.a(param0, -1);
        int[] var3 = var4;
        if (param1 != 0) {
            ama.e((byte) 27);
        }
        if (((ama) this).field_j.field_m) {
            this.a((byte) 126, ((ama) this).field_j.a(false));
        }
        return var4;
    }

    final int[][] a(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = BachelorFridge.field_y;
        int[][] var3 = ((ama) this).field_h.a(param1, -858);
        if (param0) {
            return null;
        }
        if (!(!((ama) this).field_h.field_b)) {
            var4 = hh.field_d;
            var5 = bi.field_g;
            var29 = new int[var5][var4];
            var30 = ((ama) this).field_h.b(-108);
            this.a((byte) 106, var29);
            for (var8 = 0; var8 < bi.field_g; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; hh.field_d > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = dda.a(var15, 255) << -892567228;
                    var12[var14] = dda.a(65280, var15) >> 294872388;
                    var11[var14] = dda.a(var15 >> 357549900, 4080);
                }
            }
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (-1 != (param2 ^ -1)) {
            if (1 != param2) {
              break L0;
            } else {
              L1: {
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (param1.b(16711935) != 1) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L1;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L1;
                }
              }
              ((ama) this).field_f = stackIn_19_1 != 0;
              break L0;
            }
          } else {
            ((ama) this).field_n = new vo[param1.b(param0 + 16712006)];
            var4 = 0;
            L2: while (true) {
              if (var4 >= ((ama) this).field_n.length) {
                break L0;
              } else {
                var5 = param1.b(16711935);
                var6 = var5;
                if (0 != var6) {
                  if (-2 != (var6 ^ -1)) {
                    if (var6 == 2) {
                      ((ama) this).field_n[var4] = (vo) (Object) ig.a(0, param1);
                      var4++;
                      continue L2;
                    } else {
                      if ((var6 ^ -1) == -4) {
                        ((ama) this).field_n[var4] = (vo) (Object) afa.a(param1, -128);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  } else {
                    ((ama) this).field_n[var4] = (vo) (Object) ch.a(false, param1);
                    var4++;
                    continue L2;
                  }
                } else {
                  ((ama) this).field_n[var4] = (vo) (Object) pka.a(param1, false);
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == -71) {
            break L3;
          } else {
            field_k = null;
            break L3;
          }
        }
    }

    public static void e(byte param0) {
        field_o = null;
        field_l = null;
        if (param0 > -107) {
            return;
        }
        field_m = null;
        field_k = null;
    }

    private final void a(byte param0, int[][] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vo var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          var3 = hh.field_d;
          var4 = bi.field_g;
          tma.a(param1, -5);
          bm.a(it.field_r, 0, wp.field_r, -14702, 0);
          if (((ama) this).field_n != null) {
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((ama) this).field_n.length) {
                break L0;
              } else {
                var6 = ((ama) this).field_n[var5];
                var7 = var6.field_a;
                var8 = var6.field_f;
                if (var7 < 0) {
                  if (0 <= var8) {
                    var6.a(var3, -25222, var4);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  if (var8 >= 0) {
                    var6.a((byte) -80, var4, var3);
                    var5++;
                    continue L1;
                  } else {
                    var6.b(var3, 76, var4);
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 >= 72) {
            break L2;
          } else {
            field_l = null;
            break L2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Set up new unrated game";
        field_l = "Unable to add friend - system busy";
        field_k = "Message game";
    }
}
