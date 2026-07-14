/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static int field_b;
    static bd[][] field_a;
    static String field_c;

    final static void b(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        en var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hm var12 = null;
        ri var13 = null;
        en var14 = null;
        ri var15 = null;
        L0: {
          var8 = HostileSpawn.field_I ? 1 : 0;
          var14 = sc.field_g;
          if (param0 == -20785) {
            break L0;
          } else {
            lb.a(107);
            break L0;
          }
        }
        L1: {
          var2 = var14.l(32270);
          if (0 == var2) {
            var11 = nf.a(false);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((vi) (Object) var5).l(32270);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var13 = (ri) (Object) ei.field_h.g(-63);
                if (var13 != null) {
                  var13.field_j = var3;
                  var13.field_l = true;
                  var13.b(111);
                  break L1;
                } else {
                  le.c((byte) 53);
                  return;
                }
              } else {
                var10[var7] = ((vi) (Object) var5).d(8195);
                var7++;
                continue L2;
              }
            }
          } else {
            if (var2 != 1) {
              if ((var2 ^ -1) == -3) {
                var15 = (ri) (Object) ei.field_h.g(param0 ^ 20755);
                if (var15 != null) {
                  var15.field_j = nf.a(false);
                  var15.field_l = true;
                  var15.b(param0 ^ 20777);
                  break L1;
                } else {
                  le.c((byte) 66);
                  return;
                }
              } else {
                ic.a((byte) -118, "A1: " + gf.a((byte) -125), (Throwable) null);
                le.c((byte) 78);
                break L1;
              }
            } else {
              var12 = (hm) (Object) ih.field_x.g(-117);
              if (var12 == null) {
                le.c((byte) 81);
                return;
              } else {
                var12.b(-76);
                break L1;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -16182) {
            return;
        }
        field_a = null;
    }

    final static int a(int param0, byte param1, s param2, boolean param3, s param4, String param5, int param6) {
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
        vi stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vi stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vi stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_12_2 = null;
        vi stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        vi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        vi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        vi stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        vi stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        vi stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        vi stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        vi stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        vi stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var14 = param2.a(16751324);
        var11_ref = var14;
        if (param1 > 123) {
          L0: {
            var8 = param4.a(16751324);
            var11_ref = var8;
            var11_ref = var8;
            if (null == ag.field_t) {
              if (!me.a(false, 96)) {
                return -1;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          L1: {
            if (sa.field_c != rc.field_a) {
              break L1;
            } else {
              L2: {
                ii.field_h = null;
                s.field_b.field_i = 0;
                if (param5 != null) {
                  L3: {
                    var9 = 0;
                    ob.field_s.field_i = 0;
                    if (!param3) {
                      break L3;
                    } else {
                      var9 = var9 | 1;
                      break L3;
                    }
                  }
                  L4: {
                    ob.field_s.b(jk.field_b.nextInt(), 25251);
                    ob.field_s.b(jk.field_b.nextInt(), 25251);
                    ob.field_s.a(110, var14);
                    ob.field_s.a(110, var8);
                    var15 = (CharSequence) (Object) param5;
                    ob.field_s.a(83, jk.a((byte) 104, var15));
                    ob.field_s.a((byte) -121, param0);
                    ob.field_s.d(81, param6);
                    ob.field_s.d(88, var9);
                    s.field_b.d(94, 18);
                    s.field_b.field_i = s.field_b.field_i + 2;
                    var10 = s.field_b.field_i;
                    var11_ref = de.a(-120, bn.c(-1));
                    if (var11_ref != null) {
                      break L4;
                    } else {
                      var11_ref = "";
                      break L4;
                    }
                  }
                  s.field_b.a(var11_ref, 0);
                  ml.a((vi) (Object) s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
                  s.field_b.a(true, s.field_b.field_i + -var10);
                  break L2;
                } else {
                  L5: {
                    ob.field_s.field_i = 0;
                    ob.field_s.b(jk.field_b.nextInt(), 25251);
                    ob.field_s.b(jk.field_b.nextInt(), 25251);
                    stackOut_9_0 = ob.field_s;
                    stackOut_9_1 = 124;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (param2.a((byte) -80)) {
                      stackOut_11_0 = (vi) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = (String) var14;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L5;
                    } else {
                      stackOut_10_0 = (vi) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = "";
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L5;
                    }
                  }
                  L6: {
                    ((vi) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2);
                    stackOut_12_0 = ob.field_s;
                    stackOut_12_1 = 36;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (param4.a((byte) -80)) {
                      stackOut_14_0 = (vi) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = (String) var8;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      break L6;
                    } else {
                      stackOut_13_0 = (vi) (Object) stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = "";
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      break L6;
                    }
                  }
                  ((vi) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                  s.field_b.d(86, 16);
                  s.field_b.field_i = s.field_b.field_i + 1;
                  var9 = s.field_b.field_i;
                  ml.a((vi) (Object) s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
                  s.field_b.a(-var9 + s.field_b.field_i, -19720);
                  break L2;
                }
              }
              mb.d(-1, -22370);
              rc.field_a = re.field_r;
              break L1;
            }
          }
          L7: {
            if (re.field_r == rc.field_a) {
              if (!re.c((byte) 33, 1)) {
                break L7;
              } else {
                L8: {
                  var9 = sc.field_g.l(32270);
                  sc.field_g.field_i = 0;
                  if ((var9 ^ -1) > -101) {
                    break L8;
                  } else {
                    if (105 >= var9) {
                      ea.field_a = new String[var9 + -100];
                      rc.field_a = gj.field_b;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if ((var9 ^ -1) == -249) {
                  cj.a(bn.c(-1), 0);
                  km.field_x = sg.field_g;
                  le.c((byte) 119);
                  jn.field_C = false;
                  return var9;
                } else {
                  if (99 == var9) {
                    boolean discarded$1 = re.c((byte) 33, ob.c((byte) -79));
                    ii.field_h = new Boolean(gn.a(0, (vi) (Object) sc.field_g));
                    sc.field_g.field_i = 0;
                    break L7;
                  } else {
                    rc.field_a = sj.field_c;
                    wa.field_k = var9;
                    jd.field_q = -1;
                    break L7;
                  }
                }
              }
            } else {
              break L7;
            }
          }
          L9: {
            if (rc.field_a == gj.field_b) {
              var9 = 2;
              if (!re.c((byte) 33, var9)) {
                break L9;
              } else {
                var10 = sc.field_g.e(8);
                sc.field_g.field_i = 0;
                if (!re.c((byte) 33, var10)) {
                  break L9;
                } else {
                  var11 = ea.field_a.length;
                  var12 = 0;
                  L10: while (true) {
                    if (var12 >= var11) {
                      le.c((byte) 98);
                      jn.field_C = false;
                      return var11 + 100;
                    } else {
                      ea.field_a[var12] = sc.field_g.n(-31298);
                      var12++;
                      continue L10;
                    }
                  }
                }
              }
            } else {
              break L9;
            }
          }
          L11: {
            if (rc.field_a == sj.field_c) {
              if (eb.a(13372)) {
                L12: {
                  if (255 == wa.field_k) {
                    var9_ref = sc.field_g.a((byte) 28);
                    if (var9_ref != null) {
                      gb.a((byte) 98, bn.c(-1), var9_ref);
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    km.field_x = sc.field_g.o(32);
                    break L12;
                  }
                }
                le.c((byte) 84);
                jn.field_C = false;
                return wa.field_k;
              } else {
                break L11;
              }
            } else {
              break L11;
            }
          }
          L13: {
            if (null != ag.field_t) {
              break L13;
            } else {
              if (jn.field_C) {
                L14: {
                  if (-30001L <= (m.a(true) ^ -1L)) {
                    km.field_x = fl.field_d;
                    break L14;
                  } else {
                    km.field_x = od.field_H;
                    break L14;
                  }
                }
                jn.field_C = false;
                return 249;
              } else {
                var9 = cb.field_c;
                cb.field_c = fh.field_b;
                jn.field_C = true;
                fh.field_b = var9;
                break L13;
              }
            }
          }
          return -1;
        } else {
          return 6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "CLICK TO BEGIN";
    }
}
