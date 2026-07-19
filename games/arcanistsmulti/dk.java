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

    final static void a(int param0) {
        ho.field_i = null;
        ph.field_c = null;
        be.field_d = null;
        jg.field_p = null;
        ln.field_I = (byte[][]) null;
        hl.field_l = null;
        if (param0 != -18229) {
            field_f = (String) null;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            field_k = (kc) null;
        }
        de.a(this.field_l, this.field_e, this.field_m);
    }

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0, int param1) {
        if (param1 != 14067) {
            dk.b(true);
        }
        if (!bj.g(false)) {
            return;
        }
        if (!(!param0)) {
            de.e(0, 0, de.field_e, de.field_j, 0, 192);
        }
        pm.field_e.a(0, true, 0);
    }

    final static void a(String param0, byte param1, boolean param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              sb.field_a = true;
              i.field_d = param3;
              var11 = param0;
              if (!param2) {
                stackOut_3_0 = la.field_e;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ArcanistsMulti.field_H;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (0 != i.field_d) {
                if (1 != i.field_d) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = hf.a(of.field_e, var11, 480, ob.field_T, 21230);
                  var8 = var7 + 2;
                  ln.field_M = new int[var8];
                  pm.field_f = new String[var8];
                  var9 = 0;
                  L3: while (true) {
                    if (var8 <= var9) {
                      cf.field_c = new int[1];
                      var9 = 0;
                      L4: while (true) {
                        if (var7 <= var9) {
                          pm.field_f[-2 + var8] = "";
                          pm.field_f[var8 - 1] = dd.field_e;
                          ln.field_M[-1 + var8] = 0;
                          cf.field_c[0] = 2;
                          break L2;
                        } else {
                          pm.field_f[var9] = of.field_e[var9];
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      ln.field_M[var9] = -1;
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                var7 = hf.a(of.field_e, var11, 480, ob.field_T, 21230);
                var8 = var7 + 3;
                pm.field_f = new String[var8];
                ln.field_M = new int[var8];
                var9 = 0;
                L5: while (true) {
                  if (var8 <= var9) {
                    cf.field_c = new int[2];
                    var9 = 0;
                    L6: while (true) {
                      if (var9 >= var7) {
                        pm.field_f[-3 + var8] = "";
                        pm.field_f[var8 + -2] = var6;
                        ln.field_M[var8 + -2] = 0;
                        cf.field_c[0] = 1;
                        pm.field_f[var8 + -1] = dd.field_e;
                        ln.field_M[var8 + -1] = 1;
                        cf.field_c[1] = 2;
                        break L2;
                      } else {
                        pm.field_f[var9] = of.field_e[var9];
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    ln.field_M[var9] = -1;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
            wl.field_S.field_f = cf.field_c.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (pm.field_f.length <= var8) {
                bk.field_I = -(var7 >> 1942188801) + af.field_Eb;
                ih.field_b = (uk.field_d + ic.field_a << 1406074625) * wl.field_S.field_f;
                bj.field_tb = -(var7 >> -205317023) + af.field_Eb - -var7;
                if (param1 < -37) {
                  var8 = 0;
                  L8: while (true) {
                    if (var8 >= pm.field_f.length) {
                      qe.field_o = ub.field_g + -(ih.field_b >> 588161505);
                      wl.field_S.a(param4, 0, false, ao.a(31128, an.field_g, me.field_I));
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        stackOut_36_0 = ih.field_b;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (ln.field_M[var8] < 0) {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = u.field_l;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          break L9;
                        } else {
                          stackOut_37_0 = stackIn_37_0;
                          stackOut_37_1 = tm.field_b;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          break L9;
                        }
                      }
                      ih.field_b = stackIn_39_0 + stackIn_39_1;
                      var8++;
                      continue L8;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L10: {
                  if ((ln.field_M[var8] ^ -1) > -1) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L10;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L10;
                  }
                }
                L11: {
                  var9 = lc.a(stackIn_26_0 != 0, pm.field_f[var8], (byte) -94);
                  if (-1 != ln.field_M[var8]) {
                    var9 = var9 + 2 * f.field_h;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (var9 > var7) {
                  var7 = var9;
                  var8++;
                  continue L7;
                } else {
                  var8++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var5);
            stackOut_42_1 = new StringBuilder().append("dk.G(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L12;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        field_i = null;
        field_k = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_a = (int[][]) null;
        if (param0) {
            return;
        }
        field_c = null;
        field_g = null;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    static {
        field_i = "You are invited to <%0>'s game.";
        field_d = new int[128];
        field_g = " wands";
        field_f = "Increases the potency of Thorn Bombs, Vine Bombs and Elves";
        field_h = "Average rating";
        field_b = "ESC - cancel private message";
    }
}
