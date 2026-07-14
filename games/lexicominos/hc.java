/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends ui {
    String field_jb;
    int field_hb;
    static int field_db;
    static sh field_eb;
    static int field_fb;
    static sh field_gb;
    static String[] field_ib;
    static String field_kb;
    String field_R;

    final static int a(int param0, int param1, gb param2, int param3, gb param4, String param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        wf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        wf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        wf stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        wf stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wf stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        wf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        wf stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        wf stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        wf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_8_2 = null;
        wf stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        wf stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        L0: {
          var13 = Lexicominos.field_L ? 1 : 0;
          var14 = param4.b(25545);
          var8 = param2.b(25545);
          if (null != jc.field_b) {
            break L0;
          } else {
            if (!dg.a(false, true)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (uf.field_m == ae.field_E) {
            L2: {
              ed.field_q.field_h = 0;
              wh.field_d = null;
              if (param5 != null) {
                L3: {
                  var9 = 0;
                  of.field_a.field_h = 0;
                  if (!param6) {
                    break L3;
                  } else {
                    var9 = var9 | 1;
                    break L3;
                  }
                }
                L4: {
                  of.field_a.f(q.field_a.nextInt(), -32287);
                  of.field_a.f(q.field_a.nextInt(), -32287);
                  of.field_a.a((byte) -38, var14);
                  of.field_a.a((byte) -38, var8);
                  var15 = (CharSequence) (Object) param5;
                  of.field_a.a((byte) -38, aa.a(var15, param3 + 30742));
                  of.field_a.e(param3 + 30884, param1);
                  of.field_a.c(param0, -1);
                  of.field_a.c(var9, param3 + 30761);
                  ed.field_q.c(18, -1);
                  ed.field_q.field_h = ed.field_q.field_h + 2;
                  var10 = ed.field_q.field_h;
                  var11_ref = pg.a(kk.c(param3 + 16715), (byte) -28);
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ed.field_q.a(var11_ref, (byte) 0);
                wc.a(wb.field_m, (wf) (Object) ed.field_q, re.field_T, (byte) 111, of.field_a);
                ed.field_q.b(ed.field_q.field_h - var10, (byte) 26);
                break L2;
              } else {
                L5: {
                  of.field_a.field_h = 0;
                  of.field_a.f(q.field_a.nextInt(), param3 ^ 1591);
                  of.field_a.f(q.field_a.nextInt(), -32287);
                  stackOut_7_0 = of.field_a;
                  stackOut_7_1 = -38;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (!param4.a(15738)) {
                    stackOut_9_0 = (wf) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = "";
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    break L5;
                  } else {
                    stackOut_8_0 = (wf) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = (String) var14;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    break L5;
                  }
                }
                L6: {
                  ((wf) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2);
                  stackOut_10_0 = of.field_a;
                  stackOut_10_1 = -38;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (param2.a(15738)) {
                    stackOut_12_0 = (wf) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = (String) var8;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L6;
                  } else {
                    stackOut_11_0 = (wf) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = "";
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    break L6;
                  }
                }
                ((wf) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2);
                ed.field_q.c(16, -1);
                ed.field_q.field_h = ed.field_q.field_h + 1;
                var9 = ed.field_q.field_h;
                wc.a(wb.field_m, (wf) (Object) ed.field_q, re.field_T, (byte) 111, of.field_a);
                ed.field_q.d(ed.field_q.field_h + -var9, (byte) -128);
                break L2;
              }
            }
            kc.a(-1, param3 ^ 30761);
            uf.field_m = ve.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (param3 == -30762) {
            break L7;
          } else {
            hc.g(-12);
            break L7;
          }
        }
        L8: {
          if (uf.field_m == ve.field_e) {
            if (!a.b(1, 10343)) {
              break L8;
            } else {
              L9: {
                var9 = ig.field_a.d(true);
                ig.field_a.field_h = 0;
                if (-101 < var9) {
                  break L9;
                } else {
                  if (var9 <= 105) {
                    fc.field_S = new String[var9 + -100];
                    uf.field_m = sg.field_l;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (-249 != var9) {
                if ((var9 ^ -1) != -100) {
                  a.field_c = -1;
                  pg.field_d = var9;
                  uf.field_m = bc.field_F;
                  break L8;
                } else {
                  boolean discarded$1 = a.b(wg.b(param3 ^ -19296), 10343);
                  wh.field_d = new Boolean(f.a((wf) (Object) ig.field_a, 25444));
                  ig.field_a.field_h = 0;
                  break L8;
                }
              } else {
                sa.a((byte) 108, kk.c(-14047));
                wj.field_p = el.field_d;
                ck.b((byte) -88);
                fb.field_p = false;
                return var9;
              }
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (uf.field_m != sg.field_l) {
            break L10;
          } else {
            var9 = 2;
            if (a.b(var9, 10343)) {
              var10 = ig.field_a.b(-1698573656);
              ig.field_a.field_h = 0;
              if (a.b(var10, 10343)) {
                var11 = fc.field_S.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    ck.b((byte) -36);
                    fb.field_p = false;
                    return 100 + var11;
                  } else {
                    fc.field_S[var12] = ig.field_a.d(0);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (bc.field_F == uf.field_m) {
            if (dc.d(2)) {
              L13: {
                if ((pg.field_d ^ -1) == -256) {
                  var9_ref = ig.field_a.e((byte) -49);
                  if (var9_ref == null) {
                    break L13;
                  } else {
                    ee.a(var9_ref, -11971, kk.c(-14047));
                    break L13;
                  }
                } else {
                  wj.field_p = ig.field_a.c(false);
                  break L13;
                }
              }
              ck.b((byte) -85);
              fb.field_p = false;
              return pg.field_d;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (null == jc.field_b) {
            if (!fb.field_p) {
              var9 = nj.field_a;
              nj.field_a = mg.field_y;
              mg.field_y = var9;
              fb.field_p = true;
              break L14;
            } else {
              L15: {
                if (vl.b(-116) <= 30000L) {
                  wj.field_p = sa.field_h;
                  break L15;
                } else {
                  wj.field_p = nk.field_t;
                  break L15;
                }
              }
              fb.field_p = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    final static mj a(byte param0, sh param1, sh param2, int param3, int param4) {
        if (!nb.a(param4, param3, (byte) 124, param1)) {
            return null;
        }
        if (param0 < 97) {
            field_eb = null;
        }
        return fl.a(param2.a(param4, -27493, param3), (byte) -116);
    }

    final static int f(int param0) {
        if (param0 != -1980) {
            field_eb = null;
        }
        return gd.field_o + -me.field_v;
    }

    public static void g(int param0) {
        field_ib = null;
        if (param0 != -1) {
            field_gb = null;
        }
        field_eb = null;
        field_gb = null;
        field_kb = null;
    }

    final static void h(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (hh.field_M == null) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) hh.field_M;
                    // monitorenter hh.field_M
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        hh.field_M = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    if (param0 == 249) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_ib = null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    hc() {
        super(0L, (ui) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = new String[]{"Make a 5-letter word", "Make a 6-letter word", "Make a 7-letter word", "Make an 8-letter word", "Get a x3 multiplier", "Get a x4 multiplier", "Get a x5 multiplier", "Get a x6 multiplier", "Build a 3-part chain", "Build a 4-part chain", "Build a 5-part chain", "Reach level 5", "Reach level 10", "Reach level 15", "Reach level 20", "Recover from a panic situation"};
        field_kb = "Player Name: ";
    }
}
