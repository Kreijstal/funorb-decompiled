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
        L0: {
          if (param0 >= 5) {
            break L0;
          } else {
            rb.h(-39);
            break L0;
          }
        }
        if ((mc.field_a ^ -1) <= -3) {
          L1: {
            if (fe.field_h != 0) {
              L2: {
                if (ec.field_a != null) {
                  if (ec.field_a.a(-58)) {
                    if (!ec.field_a.b("", (byte) -102)) {
                      return 29;
                    } else {
                      if (!ec.field_a.a(0, "")) {
                        return 29;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L2;
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
                          break L1;
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
                          break L1;
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
        int[] array$0 = null;
        int[] array$1 = null;
        int stackIn_6_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        gk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ki var9_ref_ki = null;
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
        var19 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var22 = wc.field_d.a("level" + param0, "", param1 + 49);
            var18 = var22;
            var17 = var18;
            var2 = var17;
            if (var17 != null) {
              L1: {
                var3 = new gk(var22);
                if (var3.a((byte) 114) != el.field_a) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
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
                      var19_ref = (ki) ((Object) ri.field_b.d(param1 + 4069));
                      var19_ref.a((byte) 126, var3);
                      ri.field_b.a(-8212, var19_ref);
                      var6_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var23 = new int[var5];
              var20 = var23;
              var6 = var20;
              gb.field_o = 0;
              var24 = new int[var5];
              var21 = var24;
              var7 = var21;
              var8 = 0;
              L4: while (true) {
                if (var5 <= var8) {
                  L5: {
                    if (param1 == -58) {
                      break L5;
                    } else {
                      field_hb = (String[]) null;
                      break L5;
                    }
                  }
                  var8 = 1;
                  L6: while (true) {
                    if (var5 <= var8) {
                      var8 = 15;
                      var9 = var23[0];
                      var10 = var23[0];
                      pd.field_f = new int[32];
                      ib.field_c = 0;
                      mc.field_e = new int[32][4];
                      var11 = var24[0];
                      var12 = 0;
                      var13 = 1;
                      L7: while (true) {
                        if (var13 >= var5) {
                          pd.field_f[var12] = (var10 - -var9) / 2;
                          var13 = var11 / dj.field_a[0].field_n - -1;
                          array$0 = new int[var13];
                          mc.field_e[var12] = array$0;
                          var14 = 0;
                          L8: while (true) {
                            if (var14 >= var13) {
                              var12++;
                              ib.field_c = var12;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              mc.field_e[var12][var14] = pf.a((byte) 92, 16);
                              var14++;
                              continue L8;
                            }
                          }
                        } else {
                          L9: {
                            if (var8 >= var23[var13] - var9) {
                              break L9;
                            } else {
                              pd.field_f[var12] = (var9 + var10) / 2;
                              var14 = var11 / dj.field_a[0].field_n - -1;
                              array$1 = new int[var14];
                              mc.field_e[var12] = array$1;
                              var15 = 0;
                              L10: while (true) {
                                if (var14 <= var15) {
                                  var11 = var24[var13];
                                  var12++;
                                  var9 = var23[var13];
                                  break L9;
                                } else {
                                  mc.field_e[var12][var15] = pf.a((byte) -128, 16);
                                  var15++;
                                  continue L10;
                                }
                              }
                            }
                          }
                          L11: {
                            if (var11 >= var24[var13]) {
                              break L11;
                            } else {
                              var11 = var24[var13];
                              break L11;
                            }
                          }
                          var10 = var23[var13];
                          var13++;
                          continue L7;
                        }
                      }
                    } else {
                      var9 = var8 + -1;
                      var10 = var23[var8];
                      var11 = var24[var8];
                      L12: while (true) {
                        L13: {
                          if (var9 < 0) {
                            break L13;
                          } else {
                            if (var10 >= var23[var9]) {
                              break L13;
                            } else {
                              var6[var9 + 1] = var23[var9];
                              var7[1 + var9] = var24[var9];
                              var9--;
                              continue L12;
                            }
                          }
                        }
                        var6[1 + var9] = var10;
                        var7[1 + var9] = var11;
                        var8++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  L14: {
                    var9_ref_ki = (ki) ((Object) ri.field_b.d(4011));
                    var9_ref_ki.a((byte) 116, var3);
                    if (-3 == (var9_ref_ki.field_w ^ -1)) {
                      h.a(3, true);
                      break L14;
                    } else {
                      if (3 != var9_ref_ki.field_w) {
                        if (5 != var9_ref_ki.field_w) {
                          break L14;
                        } else {
                          h.a(2, true);
                          break L14;
                        }
                      } else {
                        h.a(4, true);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    var9_ref_ki.c((byte) -113);
                    var6[var8] = (int)var9_ref_ki.field_B;
                    var7[var8] = (int)var9_ref_ki.field_q;
                    if (var9_ref_ki.field_w == 0) {
                      gb.field_o = gb.field_o + 1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ok.field_a.a(-8212, var9_ref_ki);
                  var8++;
                  continue L4;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "rb.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_fb = null;
        field_hb = null;
        if (param0 > -114) {
            field_eb = -20;
        }
    }

    final static void h(int param0) {
        vh.a(ba.field_f, (byte) -125);
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
        field_hb = new String[]{"Explorer in the Mist", "King of the Jungle", "Nut Cracker", "See No Monkey", "Hear No Monkey", "Speak No Monkey", "Monkeying Around", "Bad Monkey", "Naughty Monkey", "Cheeky Monkey"};
    }
}
