/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends lh {
    int[] field_o;
    int field_k;
    static sf field_l;
    static ia field_x;
    int field_v;
    od[] field_s;
    int[] field_r;
    static vc field_t;
    static ce field_q;
    int[] field_p;
    static ce field_i;
    static dd field_j;
    static int[] field_u;
    byte[][][] field_w;
    od[] field_n;
    static String field_m;

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            pl.field_f = 0;
            var1_int = 0;
            qh.field_z = 0;
            qi.field_f = 0;
            kb.field_i = 0;
            pa.field_o = 0;
            gh.field_q = 0;
            jc.field_f = 0;
            md.field_L = 1;
            pl.field_g = 0;
            db.field_H = 0;
            ue.field_d = 4;
            we.field_c = 0;
            oe.field_a = 0;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 40) {
                int discarded$1 = 31;
                bm.e();
                ee.field_h = 6;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 21) {
                    var2++;
                    continue L1;
                  } else {
                    L3: {
                      var4 = fl.field_c[var2][var3];
                      if (var4 != 15) {
                        break L3;
                      } else {
                        fl.field_c[var2][var3 - -2] = '';
                        break L3;
                      }
                    }
                    L4: {
                      if (1 != var4) {
                        break L4;
                      } else {
                        rk.field_s = 8 + 16 * var2;
                        ck.field_o = 16 + var3 * 16;
                        break L4;
                      }
                    }
                    L5: {
                      if (8 == var4) {
                        gk.a(var3, 125, 9, var2, 8);
                        ok.field_s[-1 + oe.field_a] = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (13 == var4) {
                          break L7;
                        } else {
                          if (var4 == 27) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      gk.a(var3, 124, 27, var2, 13);
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (var4 == 12) {
                          break L9;
                        } else {
                          if (var4 != 32) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      gk.a(var3, 127, 32, var2, 12);
                      break L8;
                    }
                    L10: {
                      L11: {
                        if (var4 == 14) {
                          break L11;
                        } else {
                          if (var4 == 28) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      gk.a(var3, 126, 28, var2, 14);
                      rk.field_u[qi.field_f] = var2;
                      kk.field_a[qi.field_f] = var3;
                      me.field_i[qi.field_f] = 0;
                      qi.field_f = qi.field_f + 1;
                      break L10;
                    }
                    L12: {
                      L13: {
                        if (16 == var4) {
                          break L13;
                        } else {
                          if (var4 == 29) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (jc.field_f != 0) {
                          hf.field_b = var3;
                          tg.field_d = var2;
                          jc.field_f = 2;
                          break L14;
                        } else {
                          jc.field_f = 1;
                          pc.field_b = var2;
                          lb.field_m = var3;
                          break L14;
                        }
                      }
                      gk.a(var3, 127, 29, var2, 16);
                      break L12;
                    }
                    L15: {
                      L16: {
                        if (var4 == 17) {
                          break L16;
                        } else {
                          if (var4 == 31) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      gk.a(var3, 126, 31, var2, 17);
                      break L15;
                    }
                    var5 = fl.field_c[var2][var3];
                    var6 = 0;
                    L17: while (true) {
                      if (var6 >= 4) {
                        var3++;
                        continue L2;
                      } else {
                        var7 = 0;
                        L18: while (true) {
                          if (var7 >= 4) {
                            var6++;
                            continue L17;
                          } else {
                            L19: {
                              if (var5 != 0) {
                                if (var5 != 1) {
                                  if (3 != var5) {
                                    if (var5 != 4) {
                                      if (var5 != 8) {
                                        if (18 == var5) {
                                          lh.field_e[var6 + var2 * 4][var7 + var3 * 4] = -1;
                                          break L19;
                                        } else {
                                          if (var5 == 11) {
                                            if (3 == var7) {
                                              lh.field_e[var6 + 4 * var2][var7 + var3 * 4] = 1;
                                              break L19;
                                            } else {
                                              lh.field_e[4 * var2 - -var6][var3 * 4 + var7] = 0;
                                              break L19;
                                            }
                                          } else {
                                            lh.field_e[var6 + var2 * 4][var3 * 4 - -var7] = 2;
                                            break L19;
                                          }
                                        }
                                      } else {
                                        lh.field_e[var2 * 4 + var6][var7 + 4 * var3] = -1;
                                        break L19;
                                      }
                                    } else {
                                      if (var7 == var6) {
                                        lh.field_e[4 * var2 + var6][4 * var3 + var7] = 1;
                                        break L19;
                                      } else {
                                        lh.field_e[var6 + 4 * var2][4 * var3 + var7] = 0;
                                        break L19;
                                      }
                                    }
                                  } else {
                                    if (var6 == -var7 + 3) {
                                      lh.field_e[var6 + var2 * 4][4 * var3 + var7] = 1;
                                      break L19;
                                    } else {
                                      lh.field_e[var6 + 4 * var2][4 * var3 - -var7] = 0;
                                      break L19;
                                    }
                                  }
                                } else {
                                  lh.field_e[var6 + 4 * var2][var3 * 4 + var7] = 1;
                                  break L19;
                                }
                              } else {
                                lh.field_e[4 * var2 + var6][var7 + 4 * var3] = 0;
                                break L19;
                              }
                            }
                            var7++;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "fg.B(" + 13 + 41);
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_t = null;
        field_m = null;
        field_l = null;
        field_i = null;
        field_q = null;
        field_j = null;
        field_x = null;
    }

    fg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[150];
        field_t = new vc();
        field_m = null;
    }
}
