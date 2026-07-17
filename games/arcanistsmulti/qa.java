/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qa extends pg {
    int field_n;
    static char[] field_i;
    static kc field_j;
    static String[][] field_o;
    static byte[] field_l;
    static String field_k;
    static char[] field_h;
    static int field_m;
    static volatile boolean field_g;
    static String field_p;

    final static qb[] a(int param0, int param1, int param2, int param3) {
        qb[] var6 = new qb[9];
        qb[] var5 = var6;
        qb dupTemp$0 = ce.b(1, param3, 21385);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qb dupTemp$1 = ce.b(1, param1, 21385);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param0 != 0) {
            var5[4] = ce.b(64, param0, hh.a(123, 21490));
        }
        return var5;
    }

    public static void a() {
        field_i = null;
        field_l = null;
        field_h = null;
        int var1 = 0;
        field_p = null;
        field_o = null;
        field_j = null;
        field_k = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String stackIn_48_2 = null;
        int stackIn_90_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String stackOut_47_2 = null;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          go.field_i = param2;
          if (go.field_i == 0) {
            int discarded$8 = 21230;
            var3_int = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C);
            var4 = 3 + var3_int;
            ib.field_v = new String[var4];
            oe.field_c = new int[var4];
            var5 = 0;
            L1: while (true) {
              if (~var5 <= ~var4) {
                hn.field_k = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (~var5 <= ~var3_int) {
                    ib.field_v[var4 - 3] = "";
                    ib.field_v[-2 + var4] = la.field_e;
                    oe.field_c[var4 - 2] = 0;
                    hn.field_k[0] = 4;
                    ib.field_v[-1 + var4] = dd.field_e;
                    oe.field_c[var4 + -1] = 1;
                    hn.field_k[1] = 5;
                    break L0;
                  } else {
                    ib.field_v[var5] = qg.field_a[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                oe.field_c[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (go.field_i != 1) {
              if (go.field_i != 2) {
                if (go.field_i != 3) {
                  if (go.field_i == 4) {
                    int discarded$9 = 21230;
                    var3_int = hf.a(qg.field_a, ki.field_w, eb.field_a, mg.field_C);
                    var4 = 2 + var3_int;
                    oe.field_c = new int[var4];
                    ib.field_v = new String[var4];
                    var5 = 0;
                    L3: while (true) {
                      if (var4 <= var5) {
                        hn.field_k = new int[1];
                        var5 = 0;
                        L4: while (true) {
                          if (~var5 <= ~var3_int) {
                            ib.field_v[var4 + -2] = "";
                            ib.field_v[var4 + -1] = dd.field_e;
                            oe.field_c[-1 + var4] = 0;
                            hn.field_k[0] = 5;
                            break L0;
                          } else {
                            ib.field_v[var5] = qg.field_a[var5];
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        oe.field_c[var5] = -1;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    if (go.field_i == 5) {
                      int discarded$10 = 21230;
                      var3_int = hf.a(qg.field_a, fl.field_d, eb.field_a, mg.field_C);
                      var4 = 3 + var3_int;
                      ib.field_v = new String[var4];
                      oe.field_c = new int[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var4) {
                          hn.field_k = new int[2];
                          var5 = 0;
                          L6: while (true) {
                            if (~var5 <= ~var3_int) {
                              ib.field_v[var4 + -3] = "";
                              ib.field_v[-2 + var4] = sl.field_R;
                              oe.field_c[var4 + -2] = 0;
                              hn.field_k[0] = 3;
                              ib.field_v[-1 + var4] = dd.field_e;
                              oe.field_c[-1 + var4] = 1;
                              hn.field_k[1] = 5;
                              break L0;
                            } else {
                              ib.field_v[var5] = qg.field_a[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          oe.field_c[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                } else {
                  L7: {
                    if (fi.field_d.field_p) {
                      int discarded$11 = 21230;
                      var3_int = hf.a(qg.field_a, of.field_l, eb.field_a, mg.field_C);
                      break L7;
                    } else {
                      int discarded$12 = 21230;
                      var3_int = hf.a(qg.field_a, wi.field_j, eb.field_a, mg.field_C);
                      break L7;
                    }
                  }
                  var4 = var3_int + 2;
                  ib.field_v = new String[var4];
                  oe.field_c = new int[var4];
                  var5 = 0;
                  L8: while (true) {
                    if (var4 <= var5) {
                      hn.field_k = new int[1];
                      var5 = 0;
                      L9: while (true) {
                        if (var5 >= var3_int) {
                          ib.field_v[var4 + -2] = "";
                          ib.field_v[var4 + -1] = dd.field_e;
                          oe.field_c[var4 - 1] = 0;
                          hn.field_k[0] = 5;
                          break L0;
                        } else {
                          ib.field_v[var5] = qg.field_a[var5];
                          var5++;
                          continue L9;
                        }
                      }
                    } else {
                      oe.field_c[var5] = -1;
                      var5++;
                      continue L8;
                    }
                  }
                }
              } else {
                int discarded$13 = 21230;
                var3_int = hf.a(qg.field_a, tj.a(-112, new String[1], dm.field_F), eb.field_a, mg.field_C);
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (~var3_int >= ~var5) {
                      break L11;
                    } else {
                      if ("<%0>".equals((Object) (Object) qg.field_a[var5])) {
                        var4 = var5;
                        break L11;
                      } else {
                        var5++;
                        continue L10;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    jb.field_u = new String[var4];
                    sf.a((Object[]) (Object) qg.field_a, 0, (Object[]) (Object) jb.field_u, 0, var4);
                    ik.field_c = new String[-1 + (-var4 + var3_int)];
                    sf.a((Object[]) (Object) qg.field_a, var4 + 1, (Object[]) (Object) ik.field_c, 0, var3_int + -var4 - 1);
                    var4 = -1;
                    int discarded$14 = 21230;
                    var3_int = hf.a(qg.field_a, tj.a(123, new String[1], bo.field_b), eb.field_a, mg.field_C);
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var3_int <= var5) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) qg.field_a[var5])) {
                            var4 = var5;
                            break L13;
                          } else {
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (var4 == -1) {
                        throw new IllegalStateException();
                      } else {
                        L14: {
                          lo.field_u = new String[var4];
                          sf.a((Object[]) (Object) qg.field_a, 0, (Object[]) (Object) lo.field_u, 0, var4);
                          dk.field_c = new String[-1 + var3_int - var4];
                          sf.a((Object[]) (Object) qg.field_a, 1 + var4, (Object[]) (Object) dk.field_c, 0, -var4 + var3_int - 1);
                          if (~jb.field_u.length <= ~lo.field_u.length) {
                            stackOut_30_0 = jb.field_u.length;
                            stackIn_31_0 = stackOut_30_0;
                            break L14;
                          } else {
                            stackOut_29_0 = lo.field_u.length;
                            stackIn_31_0 = stackOut_29_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_31_0;
                          if (~ik.field_c.length > ~dk.field_c.length) {
                            stackOut_33_0 = dk.field_c.length;
                            stackIn_34_0 = stackOut_33_0;
                            break L15;
                          } else {
                            stackOut_32_0 = ik.field_c.length;
                            stackIn_34_0 = stackOut_32_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_34_0;
                        var7 = var5 + (7 - -var6);
                        ib.field_v = new String[var7];
                        oe.field_c = new int[var7];
                        var8 = 0;
                        L16: while (true) {
                          if (var7 <= var8) {
                            ib.field_v[1] = ln.field_R;
                            oe.field_c[1] = 0;
                            ib.field_v[0] = tc.field_C;
                            hn.field_k = new int[2];
                            ib.field_v[4] = we.field_d;
                            ib.field_v[5] = "";
                            ib.field_v[2] = li.field_G;
                            ib.field_v[3] = ki.field_t;
                            oe.field_c[3] = 1;
                            hn.field_k[0] = 5;
                            hn.field_k[1] = 2;
                            var8 = 0;
                            L17: while (true) {
                              if (~var8 <= ~var5) {
                                ib.field_v[6 - -var5] = null;
                                oe.field_c[6 + var5] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (~var6 >= ~var8) {
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_45_0 = ib.field_v;
                                      stackOut_45_1 = var8 + (var5 + 7);
                                      stackIn_47_0 = stackOut_45_0;
                                      stackIn_47_1 = stackOut_45_1;
                                      stackIn_46_0 = stackOut_45_0;
                                      stackIn_46_1 = stackOut_45_1;
                                      if (~var8 > ~dk.field_c.length) {
                                        stackOut_47_0 = (String[]) (Object) stackIn_47_0;
                                        stackOut_47_1 = stackIn_47_1;
                                        stackOut_47_2 = dk.field_c[var8];
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        stackIn_48_2 = stackOut_47_2;
                                        break L19;
                                      } else {
                                        stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = "";
                                        stackIn_48_0 = stackOut_46_0;
                                        stackIn_48_1 = stackOut_46_1;
                                        stackIn_48_2 = stackOut_46_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_39_0 = ib.field_v;
                                  stackOut_39_1 = 6 + var8;
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  stackIn_40_0 = stackOut_39_0;
                                  stackIn_40_1 = stackOut_39_1;
                                  if (lo.field_u.length + var8 - var5 >= 0) {
                                    stackOut_41_0 = (String[]) (Object) stackIn_41_0;
                                    stackOut_41_1 = stackIn_41_1;
                                    stackOut_41_2 = lo.field_u[lo.field_u.length + (var8 - var5)];
                                    stackIn_42_0 = stackOut_41_0;
                                    stackIn_42_1 = stackOut_41_1;
                                    stackIn_42_2 = stackOut_41_2;
                                    break L20;
                                  } else {
                                    stackOut_40_0 = (String[]) (Object) stackIn_40_0;
                                    stackOut_40_1 = stackIn_40_1;
                                    stackOut_40_2 = "";
                                    stackIn_42_0 = stackOut_40_0;
                                    stackIn_42_1 = stackOut_40_1;
                                    stackIn_42_2 = stackOut_40_2;
                                    break L20;
                                  }
                                }
                                stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            oe.field_c[var8] = -1;
                            var8++;
                            continue L16;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              int discarded$15 = 21230;
              var3_int = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C);
              var4 = 2 - -var3_int;
              ib.field_v = new String[var4];
              oe.field_c = new int[var4];
              var5 = 0;
              L21: while (true) {
                if (~var4 >= ~var5) {
                  hn.field_k = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (var5 >= var3_int) {
                      ib.field_v[var4 + -2] = "";
                      ib.field_v[var4 - 1] = dd.field_e;
                      oe.field_c[-1 + var4] = 0;
                      hn.field_k[0] = 5;
                      break L0;
                    } else {
                      ib.field_v[var5] = qg.field_a[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  oe.field_c[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        hi.field_h.field_f = hn.field_k.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (~ib.field_v.length >= ~var4) {
            L24: {
              if (go.field_i != 2) {
                break L24;
              } else {
                var10 = jb.field_u;
                var5 = 0;
                L25: while (true) {
                  if (~var10.length >= ~var5) {
                    var11 = ik.field_c;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        break L24;
                      } else {
                        L27: {
                          var13 = var11[var5];
                          var7 = vh.a(false, (byte) 96, var13);
                          if (~var3_int > ~var7) {
                            var3_int = var7;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = vh.a(false, (byte) 37, var12);
                      if (~var3_int > ~var7) {
                        var3_int = var7;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              }
            }
            rd.field_a = (bm.field_h + da.field_c << 1) * hi.field_h.field_f;
            var4 = 0;
            L29: while (true) {
              if (ib.field_v.length <= var4) {
                hf.field_r = to.field_p + -(rd.field_a >> 1);
                wh.field_d = new int[ib.field_v.length][];
                var4 = 0;
                var5 = hf.field_r;
                L30: while (true) {
                  if (~var4 <= ~ib.field_v.length) {
                    L31: {
                      if (go.field_i == 2) {
                        hi.field_h.a(param0, -1, false, -1);
                        break L31;
                      } else {
                        hi.field_h.a(param0, 0, false, bl.a(me.field_I, (byte) 70, an.field_g));
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = oe.field_c[var4];
                      if (0 <= var6) {
                        var7 = vh.a(true, (byte) 111, ib.field_v[var4]);
                        var8 = -(var7 >> 1) + vd.field_l;
                        var5 = var5 + da.field_c;
                        wh.field_d[var4] = new int[4];
                        wh.field_d[var4][0] = var8 + -la.field_d;
                        wh.field_d[var4][1] = var5;
                        wh.field_d[var4][2] = var7 + (la.field_d << 1);
                        var5 = var5 + ((bm.field_h << 1) - -da.field_c - -mo.field_h);
                        wh.field_d[var4][3] = mo.field_h + (bm.field_h << 1);
                        break L32;
                      } else {
                        var5 = var5 + qj.field_a;
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_109_0 = rd.field_a;
                  stackIn_111_0 = stackOut_109_0;
                  stackIn_110_0 = stackOut_109_0;
                  if (oe.field_c[var4] < 0) {
                    stackOut_111_0 = stackIn_111_0;
                    stackOut_111_1 = qj.field_a;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    break L33;
                  } else {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = mo.field_h;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    break L33;
                  }
                }
                rd.field_a = stackIn_112_0 + stackIn_112_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              if (0 > oe.field_c[var4]) {
                stackOut_89_0 = 0;
                stackIn_90_0 = stackOut_89_0;
                break L34;
              } else {
                stackOut_88_0 = 1;
                stackIn_90_0 = stackOut_88_0;
                break L34;
              }
            }
            L35: {
              var5 = vh.a(stackIn_90_0 != 0, (byte) 10, ib.field_v[var4]);
              if (var3_int < var5) {
                var3_int = var5;
                break L35;
              } else {
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    qa(int param0) {
        ((qa) this).field_n = param0;
    }

    final static boolean a(boolean param0, wa param1, wa param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -param2.field_Bb + param1.field_Bb;
              if (param1.field_Lb == ie.field_Nb) {
                var3_int -= 200;
                break L1;
              } else {
                if (param1.field_Lb != null) {
                  break L1;
                } else {
                  var3_int += 200;
                  break L1;
                }
              }
            }
            L2: {
              if (param2.field_Lb != ie.field_Nb) {
                if (param2.field_Lb != null) {
                  break L2;
                } else {
                  var3_int -= 200;
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("qa.D(").append(0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new char[128];
        field_h = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_g = false;
        field_k = "You are already in a tower";
        field_p = "MOST ANNOYING - ";
    }
}
