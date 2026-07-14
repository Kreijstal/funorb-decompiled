/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static hk field_f;
    static String field_g;
    static String field_d;
    static int[] field_a;
    static String[] field_e;
    static String[] field_c;
    static boolean field_b;
    static int field_h;

    final static vk c(int param0) {
        if (param0 != 3) {
            return null;
        }
        return jp.field_Bb;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        jr var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        wj var27_ref = null;
        sl var28 = null;
        Object var29 = null;
        wj var29_ref = null;
        long[][] var36 = null;
        int[][] var37 = null;
        L0: {
          var29 = null;
          var27 = null;
          var26 = ShatteredPlansClient.field_F ? 1 : 0;
          var28 = sa.field_a;
          var2 = var28.j(-56);
          if (0 == var2) {
            var3 = var28.f(-20976);
            var4 = (jr) (Object) i.field_n.d(0);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var3 != var4.field_j) {
                    var4 = (jr) (Object) i.field_n.a((byte) -71);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 != null) {
                L3: {
                  var5 = var28.j(-77);
                  if (0 == var5) {
                    break L3;
                  } else {
                    var6 = var4.field_i;
                    rf.field_j[0].field_b = null;
                    rf.field_j[0].field_d = ln.field_o;
                    var7 = var4.field_k;
                    rf.field_j[0].field_a = false;
                    var8_int = 1;
                    L4: while (true) {
                      if (var5 <= var8_int) {
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var36 = new long[3][var6];
                        var37 = new int[3][var7 * var6];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.j(-56);
                        if (-1 <= (var18 ^ -1)) {
                          break L3;
                        } else {
                          var19 = 0;
                          L5: while (true) {
                            if (var19 >= var18) {
                              break L3;
                            } else {
                              L6: {
                                var20 = var28.j(-115);
                                var21 = rf.field_j[var20].field_d;
                                var22 = var28.d(105);
                                var24 = var28.field_j;
                                if (var19 < var6) {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = rf.field_j[var20].field_b;
                                  var36[0][var12] = var22;
                                  var25 = 0;
                                  L7: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L6;
                                    } else {
                                      var15++;
                                      var37[0][var15] = var28.a(16711680);
                                      var25++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var21 == null) {
                                  break L8;
                                } else {
                                  if (jp.a(var21, (byte) -105)) {
                                    var8[1][var13] = ln.field_o;
                                    var9[1][var13] = null;
                                    var36[1][var13] = var22;
                                    var13++;
                                    var28.field_j = var24;
                                    var25 = 0;
                                    L9: while (true) {
                                      if (var25 >= var7) {
                                        break L8;
                                      } else {
                                        var16++;
                                        var37[1][var16] = var28.a(16711680);
                                        var25++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!rf.field_j[var20].field_a) {
                                  rf.field_j[var20].field_a = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = rf.field_j[var20].field_b;
                                  var36[2][var14] = var22;
                                  var28.field_j = var24;
                                  var14++;
                                  var25 = 0;
                                  L10: while (true) {
                                    if (var25 < var7) {
                                      var17++;
                                      var37[2][var17] = var28.a(16711680);
                                      var25++;
                                      continue L10;
                                    } else {
                                      var19++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L5;
                                }
                              } else {
                                var19++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        rf.field_j[var8_int].field_d = var28.e(-1);
                        rf.field_j[var8_int].field_a = false;
                        if ((var28.j(-78) ^ -1) != -2) {
                          rf.field_j[var8_int].field_b = null;
                          var8_int++;
                          continue L4;
                        } else {
                          rf.field_j[var8_int].field_b = var28.e(-1);
                          var8_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                var4.b((byte) -58);
                break L0;
              } else {
                q.g(-125);
                return;
              }
            }
          } else {
            if (1 == var2) {
              var3 = var28.f(-20976);
              var29_ref = (wj) (Object) wd.field_P.d(0);
              L11: while (true) {
                L12: {
                  if (var29_ref == null) {
                    break L12;
                  } else {
                    if (var29_ref.field_h == var3) {
                      break L12;
                    } else {
                      var27_ref = (wj) (Object) wd.field_P.a((byte) -71);
                      continue L11;
                    }
                  }
                }
                if (var27_ref != null) {
                  var27_ref.b((byte) -63);
                  break L0;
                } else {
                  q.g(-112);
                  return;
                }
              }
            } else {
              jq.a(-29901, (Throwable) null, "HS1: " + w.a(16738));
              q.g(-100);
              break L0;
            }
          }
        }
        L13: {
          if (param0 > 94) {
            break L13;
          } else {
            field_c = null;
            break L13;
          }
        }
    }

    final static int[] a(int param0) {
        int var1 = 125 % ((-3 - param0) / 43);
        return new int[8];
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -17358) {
            field_b = false;
        }
        field_g = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = 59 / ((param0 - -53) / 32);
                    var2 = (Object) (Object) pd.field_j;
                    // monitorenter pd.field_j
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ql.field_q = ql.field_q + 1;
                        rf.field_n = v.field_d;
                        pd.field_k = aj.field_f;
                        bb.field_b = rf.field_i;
                        r.field_d = kh.field_Lb;
                        kh.field_Lb = false;
                        je.field_d = vh.field_c;
                        nh.field_p = lc.field_c;
                        td.field_P = el.field_e;
                        vh.field_c = 0;
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) im.field_c);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) im.field_c);
        if (param1 != 18014) {
            vk discarded$0 = ae.c(-12);
        }
        qn.field_c = -1;
    }

    final static bi[] a(int param0, String param1, bc param2, String param3) {
        int var4 = param2.a(122, param1);
        int var5 = param2.a(var4, (byte) 106, param3);
        int var6 = -106 / ((-22 - param0) / 53);
        return ch.a(var5, (byte) 87, param2, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You are offering an unrated rematch.";
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new int[256];
    }
}
