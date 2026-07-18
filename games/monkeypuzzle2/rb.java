/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ii {
    String field_bb;
    static int field_cb;
    static int field_eb;
    static int[] field_fb;
    String field_db;
    int field_gb;
    static String[] field_hb;

    final static int c(byte param0) {
        if (mc.field_a >= 2) {
          L0: {
            if (fe.field_h != 0) {
              L1: {
                if (ec.field_a != null) {
                  if (ec.field_a.a(-58)) {
                    if (!ec.field_a.b("", (byte) -102)) {
                      return 29;
                    } else {
                      if (!ec.field_a.a(0, "")) {
                        return 29;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!fj.field_B.a(93)) {
                return 43;
              } else {
                if (fj.field_B.a(0, "commonui")) {
                  if (hf.field_a.a(-90)) {
                    if (hf.field_a.a(0, "commonui")) {
                      if (!ii.field_m.a(-47)) {
                        return 82;
                      } else {
                        if (ii.field_m.b(0)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            } else {
              if (fj.field_B.a(-46)) {
                if (fj.field_B.a(0, "commonui")) {
                  if (hf.field_a.a(-59)) {
                    if (hf.field_a.a(0, "commonui")) {
                      if (ii.field_m.a(107)) {
                        if (ii.field_m.b(0)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        gk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ki var9_ref_ki = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        Object var19 = null;
        ki var19_ref = null;
        int[] var20 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var19 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var28 = wc.field_d.a("level" + param0, "", -9);
            var25 = var28;
            var22 = var25;
            var18 = var22;
            var17 = var18;
            var2_array = var17;
            if (var17 != null) {
              L1: {
                var3 = new gk(var28);
                if (var3.a((byte) 114) != el.field_a) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var4 = stackIn_6_0;
                el.a(true, var3.a((byte) 114));
                var5 = var3.j(17277);
                if (var4 != 0) {
                  var6_int = 0;
                  L3: while (true) {
                    if (var5 <= var6_int) {
                      var5 = var3.j(17277);
                      break L2;
                    } else {
                      var19_ref = (ki) (Object) ri.field_b.d(4011);
                      var19_ref.a((byte) 126, var3);
                      ri.field_b.a(-8212, (ug) (Object) var19_ref);
                      var6_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var29 = new int[var5];
              var26 = var29;
              var23 = var26;
              var20 = var23;
              var6 = var20;
              gb.field_o = 0;
              var30 = new int[var5];
              var27 = var30;
              var24 = var27;
              var21 = var24;
              var7 = var21;
              var8 = 0;
              L4: while (true) {
                if (var5 <= var8) {
                  var8 = 1;
                  L5: while (true) {
                    if (var5 <= var8) {
                      var8 = 15;
                      var9 = var29[0];
                      var10 = var29[0];
                      pd.field_f = new int[32];
                      ib.field_c = 0;
                      mc.field_e = new int[32][4];
                      var11 = var30[0];
                      var12 = 0;
                      var13 = 1;
                      L6: while (true) {
                        if (var13 >= var5) {
                          pd.field_f[var12] = (var10 - -var9) / 2;
                          var13 = var11 / dj.field_a[0].field_n - -1;
                          mc.field_e[var12] = new int[var13];
                          var14 = 0;
                          L7: while (true) {
                            if (var14 >= var13) {
                              var12++;
                              ib.field_c = var12;
                              break L0;
                            } else {
                              mc.field_e[var12][var14] = pf.a((byte) 92, 16);
                              var14++;
                              continue L7;
                            }
                          }
                        } else {
                          L8: {
                            if (var8 >= var29[var13] - var9) {
                              break L8;
                            } else {
                              pd.field_f[var12] = (var9 + var10) / 2;
                              var14 = var11 / dj.field_a[0].field_n - -1;
                              mc.field_e[var12] = new int[var14];
                              var15 = 0;
                              L9: while (true) {
                                if (var14 <= var15) {
                                  var11 = var30[var13];
                                  var12++;
                                  var9 = var29[var13];
                                  break L8;
                                } else {
                                  mc.field_e[var12][var15] = pf.a((byte) -128, 16);
                                  var15++;
                                  continue L9;
                                }
                              }
                            }
                          }
                          L10: {
                            if (var11 >= var30[var13]) {
                              break L10;
                            } else {
                              var11 = var30[var13];
                              break L10;
                            }
                          }
                          var10 = var29[var13];
                          var13++;
                          continue L6;
                        }
                      }
                    } else {
                      var9 = var8 + -1;
                      var10 = var29[var8];
                      var11 = var30[var8];
                      L11: while (true) {
                        L12: {
                          if (var9 < 0) {
                            break L12;
                          } else {
                            if (var10 >= var29[var9]) {
                              break L12;
                            } else {
                              var6[var9 + 1] = var29[var9];
                              var7[1 + var9] = var30[var9];
                              var9--;
                              continue L11;
                            }
                          }
                        }
                        var6[1 + var9] = var10;
                        var7[1 + var9] = var11;
                        var8++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  L13: {
                    var9_ref_ki = (ki) (Object) ri.field_b.d(4011);
                    var9_ref_ki.a((byte) 116, var3);
                    if (var9_ref_ki.field_w == 2) {
                      h.a(3, true);
                      break L13;
                    } else {
                      if (3 != var9_ref_ki.field_w) {
                        if (5 != var9_ref_ki.field_w) {
                          break L13;
                        } else {
                          h.a(2, true);
                          break L13;
                        }
                      } else {
                        h.a(4, true);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    var9_ref_ki.c((byte) -113);
                    var6[var8] = (int)var9_ref_ki.field_B;
                    var7[var8] = (int)var9_ref_ki.field_q;
                    if (var9_ref_ki.field_w == 0) {
                      gb.field_o = gb.field_o + 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  ok.field_a.a(-8212, (ug) (Object) var9_ref_ki);
                  var8++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "rb.B(" + param0 + ',' + -58 + ')');
        }
    }

    public static void i(int param0) {
        field_fb = null;
        field_hb = null;
    }

    final static void h(int param0) {
        vh.a((java.awt.Canvas) (Object) ba.field_f, (byte) -125);
        if (param0 != 3591) {
            field_eb = -116;
        }
        ba.field_f.a((byte) -107, rc.field_k);
        ie.field_e.requestFocus();
        ba.field_f = null;
    }

    rb() {
        super(0L, (ii) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = new String[]{"Explorer in the Mist", "King of the Jungle", "Nut Cracker", "See No Monkey", "Hear No Monkey", "Speak No Monkey", "Monkeying Around", "Bad Monkey", "Naughty Monkey", "Cheeky Monkey"};
    }
}
