/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    static String field_c;
    static cm field_a;
    static String field_e;
    static String field_d;
    static String field_b;
    static String field_f;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_f = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = rj.a(26, (int[]) null);
        }
    }

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        ra var4_ref_ra = null;
        int var4 = 0;
        int var5_int = 0;
        ra var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        if (od.field_g != mh.field_a) {
          return false;
        } else {
          L0: {
            var2 = ll.a(param0 ^ -1491051318);
            if (eh.field_d == 0) {
              break L0;
            } else {
              if (fg.field_d < 0) {
                var4_ref_ra = (ra) (Object) am.field_F.d(9272);
                if (var4_ref_ra == null) {
                  break L0;
                } else {
                  if ((var4_ref_ra.field_o ^ -1L) > (var2 ^ -1L)) {
                    var4_ref_ra.b((byte) 12);
                    qh.field_d = var4_ref_ra.field_k.length;
                    mk.field_j.field_k = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= qh.field_d) {
                        wc.field_r = wf.field_n;
                        wf.field_n = uc.field_r;
                        uc.field_r = qk.field_b;
                        qk.field_b = var4_ref_ra.field_n;
                        return true;
                      } else {
                        mk.field_j.field_i[var5_int] = var4_ref_ra.field_k[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (param0 == -1491050718) {
              break L2;
            } else {
              field_a = null;
              break L2;
            }
          }
          L3: while (true) {
            L4: {
              if (-1 >= (fg.field_d ^ -1)) {
                break L4;
              } else {
                mk.field_j.field_k = 0;
                if (vc.a(-125, 1)) {
                  fg.field_d = mk.field_j.a(false);
                  mk.field_j.field_k = 0;
                  qh.field_d = param1[fg.field_d];
                  break L4;
                } else {
                  return false;
                }
              }
            }
            if (!cm.b((byte) -43)) {
              return false;
            } else {
              if (-1 == (eh.field_d ^ -1)) {
                wc.field_r = wf.field_n;
                wf.field_n = uc.field_r;
                uc.field_r = qk.field_b;
                qk.field_b = fg.field_d;
                fg.field_d = -1;
                return true;
              } else {
                L5: {
                  var4 = eh.field_d;
                  if (tb.field_u == 0.0) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + j.field_H.nextGaussian() * tb.field_u);
                    if ((var4 ^ -1) > -1) {
                      var4 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = new ra(var2 - -(long)var4, fg.field_d, new byte[qh.field_d]);
                var6 = 0;
                L6: while (true) {
                  if (qh.field_d <= var6) {
                    am.field_F.a((uf) (Object) var5, param0 ^ 1491066943);
                    fg.field_d = -1;
                    continue L3;
                  } else {
                    var5.field_k[var6] = mk.field_j.field_i[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        me var4 = null;
        int var4_int = 0;
        int var5 = 0;
        vi var5_ref_vi = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        uc var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var8 = Terraphoenix.field_V;
          var10 = mk.field_j;
          var2 = var10.a(-16384);
          var3 = var10.a(-16384);
          if (param0 >= 72) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$1 = rj.a(-113, (int[]) null);
            break L0;
          }
        }
        L1: {
          if (0 == var2) {
            var4 = (me) (Object) ga.field_r.d(9272);
            if (var4 != null) {
              L2: {
                var5 = qh.field_d - var10.field_k;
                var14 = var4.field_i;
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var6 = var11;
                if (var14.length << -1491050718 >= var5) {
                  break L2;
                } else {
                  var5 = var14.length << 48379010;
                  break L2;
                }
              }
              var7 = 0;
              L3: while (true) {
                if (var5 <= var7) {
                  var4.b((byte) 12);
                  break L1;
                } else {
                  var6[var7 >> -30357534] = var6[var7 >> -30357534] + (var10.a(-16384) << (dg.a(3, var7) << 1210091528));
                  var7++;
                  continue L3;
                }
              }
            } else {
              gb.g(-17464);
              return;
            }
          } else {
            if (var2 == 1) {
              var4_int = var10.e((byte) 118);
              var5_ref_vi = (vi) (Object) pd.field_g.d(9272);
              L4: while (true) {
                L5: {
                  if (var5_ref_vi == null) {
                    break L5;
                  } else {
                    L6: {
                      if (var3 != var5_ref_vi.field_l) {
                        break L6;
                      } else {
                        if (var5_ref_vi.field_s != var4_int) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5_ref_vi = (vi) (Object) pd.field_g.e((byte) -119);
                    continue L4;
                  }
                }
                if (var5_ref_vi == null) {
                  gb.g(-17464);
                  return;
                } else {
                  var5_ref_vi.b((byte) 12);
                  break L1;
                }
              }
            } else {
              bd.a((Throwable) null, "LR1: " + r.i(-15465), 67);
              gb.g(-17464);
              break L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, me param2) {
        uc var3 = di.field_l;
        var3.k(-17410, param0);
        var3.i(2, -106);
        var3.i(0, -119);
        if (param1 >= -117) {
            field_f = null;
        }
        var3.i(param2.field_j, 12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Exit debriefing without saving";
        field_e = "Continue";
        field_d = "Saved games can be continued from the main menu.<br>  You can only have one saved game.";
        field_a = new cm(3);
        field_f = "No route";
        field_b = "    Stairs";
    }
}
