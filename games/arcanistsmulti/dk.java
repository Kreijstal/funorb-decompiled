/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dk {
    static String[] field_c;
    int field_e;
    int[] field_l;
    static String field_f;
    static String field_i;
    static int[][] field_a;
    static String field_g;
    static int[] field_d;
    static String field_b;
    int field_m;
    static String field_h;
    java.awt.Image field_j;
    static kc field_k;

    final static void a() {
        ho.field_i = null;
        ph.field_c = null;
        be.field_d = null;
        jg.field_p = null;
        ln.field_I = null;
        hl.field_l = null;
    }

    final void a(boolean param0) {
        if (!param0) {
            field_k = null;
        }
        de.a(((dk) this).field_l, ((dk) this).field_e, ((dk) this).field_m);
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0, int param1) {
        int discarded$2 = 0;
        if (!bj.g()) {
            return;
        }
        de.e(0, 0, de.field_e, de.field_j, 0, 192);
        pm.field_e.a(0, true, 0);
    }

    final static void a(String param0, byte param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.field_a = true;
              i.field_d = param3;
              var5_ref = param0;
              var6 = ArcanistsMulti.field_H;
              if (0 != i.field_d) {
                if (1 != i.field_d) {
                  throw new IllegalArgumentException();
                } else {
                  int discarded$2 = 21230;
                  var7 = hf.a(of.field_e, var5_ref, 480, ob.field_T);
                  var8 = var7 + 2;
                  ln.field_M = new int[var8];
                  pm.field_f = new String[var8];
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      cf.field_c = new int[1];
                      var9 = 0;
                      L3: while (true) {
                        if (var7 <= var9) {
                          pm.field_f[-2 + var8] = "";
                          pm.field_f[var8 - 1] = dd.field_e;
                          ln.field_M[-1 + var8] = 0;
                          cf.field_c[0] = 2;
                          break L1;
                        } else {
                          pm.field_f[var9] = of.field_e[var9];
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      ln.field_M[var9] = -1;
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                int discarded$3 = 21230;
                var7 = hf.a(of.field_e, var5_ref, 480, ob.field_T);
                var8 = var7 + 3;
                pm.field_f = new String[var8];
                ln.field_M = new int[var8];
                var9 = 0;
                L4: while (true) {
                  if (var8 <= var9) {
                    cf.field_c = new int[2];
                    var9 = 0;
                    L5: while (true) {
                      if (var9 >= var7) {
                        pm.field_f[-3 + var8] = "";
                        pm.field_f[var8 + -2] = var6;
                        ln.field_M[var8 + -2] = 0;
                        cf.field_c[0] = 1;
                        pm.field_f[var8 + -1] = dd.field_e;
                        ln.field_M[var8 + -1] = 1;
                        cf.field_c[1] = 2;
                        break L1;
                      } else {
                        pm.field_f[var9] = of.field_e[var9];
                        var9++;
                        continue L5;
                      }
                    }
                  } else {
                    ln.field_M[var9] = -1;
                    var9++;
                    continue L4;
                  }
                }
              }
            }
            wl.field_S.field_f = cf.field_c.length;
            var7 = 0;
            var8 = 0;
            L6: while (true) {
              if (pm.field_f.length <= var8) {
                bk.field_I = -(var7 >> 1) + af.field_Eb;
                ih.field_b = (uk.field_d + ic.field_a << 1) * wl.field_S.field_f;
                bj.field_tb = -(var7 >> 1) + af.field_Eb - -var7;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= pm.field_f.length) {
                    qe.field_o = ub.field_g + -(ih.field_b >> 1);
                    wl.field_S.a(param4, 0, false, ao.a(31128, an.field_g, me.field_I));
                    break L0;
                  } else {
                    L8: {
                      stackOut_33_0 = ih.field_b;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (ln.field_M[var8] < 0) {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = u.field_l;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        break L8;
                      } else {
                        stackOut_34_0 = stackIn_34_0;
                        stackOut_34_1 = tm.field_b;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        break L8;
                      }
                    }
                    ih.field_b = stackIn_36_0 + stackIn_36_1;
                    var8++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  if (ln.field_M[var8] < 0) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L9;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L9;
                  }
                }
                L10: {
                  var9 = lc.a(stackIn_23_0 != 0, pm.field_f[var8], (byte) -94);
                  if (-1 != ln.field_M[var8]) {
                    var9 = var9 + 2 * f.field_h;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var9 <= var7) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var5;
            stackOut_39_1 = new StringBuilder().append("dk.G(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + -72 + ',' + true + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b() {
        field_b = null;
        field_i = null;
        field_k = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_g = null;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "You are invited to <%0>'s game.";
        field_d = new int[128];
        field_g = " wands";
        field_f = "Increases the potency of Thorn Bombs, Vine Bombs and Elves";
        field_h = "Average rating";
        field_b = "ESC - cancel private message";
    }
}
