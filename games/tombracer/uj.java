/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj implements bo {
    static String field_e;
    private int[] field_a;
    private int field_c;
    static String field_f;
    private boolean[] field_g;
    private int[] field_b;
    static int[] field_d;

    public final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        boolean[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        boolean[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param1 == -19) {
            break L0;
          } else {
            var5 = null;
            ((uj) this).a(-28, (kh) null);
            break L0;
          }
        }
        param0.h((byte) -89);
        var3 = 0;
        L1: while (true) {
          if (var3 >= ((uj) this).field_c) {
            param0.i((byte) 98);
            return;
          } else {
            L2: {
              stackOut_4_0 = ((uj) this).field_g;
              stackOut_4_1 = var3;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (param0.b((byte) 44, 1) != 1) {
                stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              } else {
                stackOut_5_0 = (boolean[]) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L2;
              }
            }
            stackIn_7_0[stackIn_7_1] = stackIn_7_2 != 0;
            if (((uj) this).field_g[var3]) {
              ((uj) this).field_b[var3] = -1;
              ((uj) this).field_a[var3] = 0;
              var3++;
              continue L1;
            } else {
              ((uj) this).field_b[var3] = param0.b((byte) 44, 3);
              ((uj) this).field_a[var3] = param0.b((byte) 44, 32);
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(qh param0, v param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (((uj) this).field_c <= var4) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((uj) this).field_c) {
                L2: {
                  var4 = 125 % ((57 - param2) / 55);
                  if (-1 != (param0.field_k.field_K ^ -1)) {
                    break L2;
                  } else {
                    param0.k(-1);
                    break L2;
                  }
                }
                return;
              } else {
                if (!((uj) this).field_g[var4]) {
                  param0.field_k.field_c.field_b[var4] = ((uj) this).field_b[var4];
                  param0.field_k.field_c.field_e[((uj) this).field_b[var4]] = var4;
                  if (((uj) this).field_a[var4] == 0) {
                    param0.field_k.field_G[var4].a(94, false);
                    var4++;
                    continue L1;
                  } else {
                    L3: {
                      if (param0.field_k.field_G[var4].b(0)) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_9_0 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        break L3;
                      }
                    }
                    var5 = stackIn_11_0;
                    param0.field_k.field_G[var4].a(84, true);
                    param0.field_k.field_G[var4].field_c = ((uj) this).field_a[var4];
                    if (var5 != 0) {
                      param0.a(98, var4);
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            param0.field_k.field_c.field_b[var4] = -1;
            param0.field_k.field_c.field_e[var4] = -1;
            var4++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        int var1 = -113 / ((param0 - 0) / 40);
        field_d = null;
    }

    public final void a(int param0, kh param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        param1.i(param0 ^ 192);
        var3 = 0;
        L0: while (true) {
          if (var3 >= ((uj) this).field_c) {
            L1: {
              param1.k(-1826190686);
              if (param0 == 200) {
                break L1;
              } else {
                ((uj) this).field_a = null;
                break L1;
              }
            }
            return;
          } else {
            if (((uj) this).field_g[var3]) {
              param1.a((byte) -127, 1, 1);
              var3++;
              continue L0;
            } else {
              param1.a((byte) -126, 0, 1);
              param1.a((byte) 92, ((uj) this).field_b[var3], 3);
              param1.a((byte) -126, ((uj) this).field_a[var3], 32);
              var3++;
              continue L0;
            }
          }
        }
    }

    final static hja[] a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        hja[] var1 = new hja[fa.field_b];
        for (var2 = param0; fa.field_b > var2; var2++) {
            var1[var2] = new hja(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], ck.field_c[var2], mga.field_g);
        }
        loa.a((byte) 106);
        return var1;
    }

    final static String a(byte param0, CharSequence[] param1) {
        if (param0 < 104) {
            hja[] discarded$0 = uj.a(-27);
        }
        return qga.a(125, param1, 0, param1.length);
    }

    uj(int param0) {
        ((uj) this).field_g = new boolean[param0];
        ((uj) this).field_b = new int[param0];
        ((uj) this).field_c = param0;
        ((uj) this).field_a = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Revolver";
        field_f = "You've collected a skeleton key. Walk into the lock to open it, or drop the key using <img=8><img=9>";
        field_d = new int[]{0, 28};
    }
}
