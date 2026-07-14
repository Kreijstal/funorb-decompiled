/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    final static qb[] a(int param0, int param1, int param2, int param3, byte param4) {
        qb[] var6 = new qb[9];
        qb[] var5 = var6;
        if (param4 != 123) {
            return null;
        }
        var6[6] = ce.b(param2, param3, 21385);
        var5[3] = ce.b(param2, param3, 21385);
        var5[2] = ce.b(param2, param3, 21385);
        var5[1] = ce.b(param2, param3, 21385);
        var5[0] = ce.b(param2, param3, 21385);
        var5[8] = ce.b(param2, param1, param4 + 21262);
        var5[7] = ce.b(param2, param1, param4 + 21262);
        var5[5] = ce.b(param2, param1, param4 + 21262);
        if (param0 != 0) {
            var5[4] = ce.b(64, param0, hh.a((int) param4, 21490));
        }
        return var5;
    }

    public static void a(byte param0) {
        field_i = null;
        field_l = null;
        field_h = null;
        int var1 = -124 % ((param0 - 0) / 41);
        field_p = null;
        field_o = null;
        field_j = null;
        field_k = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
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
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        String[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String stackIn_44_2 = null;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String stackIn_50_2 = null;
        int stackIn_92_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        String stackOut_49_2 = null;
        String[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String stackOut_48_2 = null;
        String[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String stackOut_43_2 = null;
        String[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        String stackOut_42_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 == -4693) {
            break L0;
          } else {
            field_m = -4;
            break L0;
          }
        }
        L1: {
          go.field_i = param2;
          if (go.field_i == -1) {
            var3 = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C, param1 + 25923);
            var4 = 3 + var3;
            ib.field_v = new String[var4];
            oe.field_c = new int[var4];
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4) {
                hn.field_k = new int[2];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var3) {
                    ib.field_v[var4 - 3] = "";
                    ib.field_v[-2 + var4] = la.field_e;
                    oe.field_c[var4 - 2] = 0;
                    hn.field_k[0] = 4;
                    ib.field_v[-1 + var4] = dd.field_e;
                    oe.field_c[var4 + -1] = 1;
                    hn.field_k[1] = 5;
                    break L1;
                  } else {
                    ib.field_v[var5] = qg.field_a[var5];
                    var5++;
                    continue L3;
                  }
                }
              } else {
                oe.field_c[var5] = -1;
                var5++;
                continue L2;
              }
            }
          } else {
            if (-2 != go.field_i) {
              if (go.field_i != 2) {
                if ((go.field_i ^ -1) != -4) {
                  if ((go.field_i ^ -1) == -5) {
                    var3 = hf.a(qg.field_a, ki.field_w, eb.field_a, mg.field_C, 21230);
                    var4 = 2 + var3;
                    oe.field_c = new int[var4];
                    ib.field_v = new String[var4];
                    var5 = 0;
                    L4: while (true) {
                      if (var4 <= var5) {
                        hn.field_k = new int[1];
                        var5 = 0;
                        L5: while (true) {
                          if (var5 >= var3) {
                            ib.field_v[var4 + -2] = "";
                            ib.field_v[var4 + -1] = dd.field_e;
                            oe.field_c[-1 + var4] = 0;
                            hn.field_k[0] = 5;
                            break L1;
                          } else {
                            ib.field_v[var5] = qg.field_a[var5];
                            var5++;
                            continue L5;
                          }
                        }
                      } else {
                        oe.field_c[var5] = -1;
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if ((go.field_i ^ -1) == -6) {
                      var3 = hf.a(qg.field_a, fl.field_d, eb.field_a, mg.field_C, param1 + 25923);
                      var4 = 3 + var3;
                      ib.field_v = new String[var4];
                      oe.field_c = new int[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var5 >= var4) {
                          hn.field_k = new int[2];
                          var5 = 0;
                          L7: while (true) {
                            if (var5 >= var3) {
                              ib.field_v[var4 + -3] = "";
                              ib.field_v[-2 + var4] = sl.field_R;
                              oe.field_c[var4 + -2] = 0;
                              hn.field_k[0] = 3;
                              ib.field_v[-1 + var4] = dd.field_e;
                              oe.field_c[-1 + var4] = 1;
                              hn.field_k[1] = 5;
                              break L1;
                            } else {
                              ib.field_v[var5] = qg.field_a[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          oe.field_c[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  }
                } else {
                  L8: {
                    if (fi.field_d.field_p) {
                      var3 = hf.a(qg.field_a, of.field_l, eb.field_a, mg.field_C, 21230);
                      break L8;
                    } else {
                      var3 = hf.a(qg.field_a, wi.field_j, eb.field_a, mg.field_C, param1 ^ -16571);
                      break L8;
                    }
                  }
                  var4 = var3 + 2;
                  ib.field_v = new String[var4];
                  oe.field_c = new int[var4];
                  var5 = 0;
                  L9: while (true) {
                    if (var4 <= var5) {
                      hn.field_k = new int[1];
                      var5 = 0;
                      L10: while (true) {
                        if (var5 >= var3) {
                          ib.field_v[var4 + -2] = "";
                          ib.field_v[var4 + -1] = dd.field_e;
                          oe.field_c[var4 - 1] = 0;
                          hn.field_k[0] = 5;
                          break L1;
                        } else {
                          ib.field_v[var5] = qg.field_a[var5];
                          var5++;
                          continue L10;
                        }
                      }
                    } else {
                      oe.field_c[var5] = -1;
                      var5++;
                      continue L9;
                    }
                  }
                }
              } else {
                var3 = hf.a(qg.field_a, tj.a(-112, new String[1], dm.field_F), eb.field_a, mg.field_C, param1 + 25923);
                var4 = -1;
                var5 = 0;
                L11: while (true) {
                  L12: {
                    if (var3 <= var5) {
                      break L12;
                    } else {
                      if ("<%0>".equals((Object) (Object) qg.field_a[var5])) {
                        var4 = var5;
                        break L12;
                      } else {
                        var5++;
                        continue L11;
                      }
                    }
                  }
                  if (0 == (var4 ^ -1)) {
                    throw new IllegalStateException();
                  } else {
                    jb.field_u = new String[var4];
                    sf.a((Object[]) (Object) qg.field_a, 0, (Object[]) (Object) jb.field_u, 0, var4);
                    ik.field_c = new String[-1 + (-var4 + var3)];
                    sf.a((Object[]) (Object) qg.field_a, var4 + 1, (Object[]) (Object) ik.field_c, 0, var3 + -var4 - 1);
                    var4 = -1;
                    var3 = hf.a(qg.field_a, tj.a(param1 ^ -4656, new String[1], bo.field_b), eb.field_a, mg.field_C, 21230);
                    var5 = 0;
                    L13: while (true) {
                      L14: {
                        if (var3 <= var5) {
                          break L14;
                        } else {
                          if ("<%0>".equals((Object) (Object) qg.field_a[var5])) {
                            var4 = var5;
                            break L14;
                          } else {
                            var5++;
                            continue L13;
                          }
                        }
                      }
                      if ((var4 ^ -1) == 0) {
                        throw new IllegalStateException();
                      } else {
                        L15: {
                          lo.field_u = new String[var4];
                          sf.a((Object[]) (Object) qg.field_a, 0, (Object[]) (Object) lo.field_u, 0, var4);
                          dk.field_c = new String[-1 + var3 - var4];
                          sf.a((Object[]) (Object) qg.field_a, 1 + var4, (Object[]) (Object) dk.field_c, 0, -var4 + var3 - 1);
                          if (jb.field_u.length >= lo.field_u.length) {
                            stackOut_32_0 = jb.field_u.length;
                            stackIn_33_0 = stackOut_32_0;
                            break L15;
                          } else {
                            stackOut_31_0 = lo.field_u.length;
                            stackIn_33_0 = stackOut_31_0;
                            break L15;
                          }
                        }
                        L16: {
                          var5 = stackIn_33_0;
                          if (ik.field_c.length < dk.field_c.length) {
                            stackOut_35_0 = dk.field_c.length;
                            stackIn_36_0 = stackOut_35_0;
                            break L16;
                          } else {
                            stackOut_34_0 = ik.field_c.length;
                            stackIn_36_0 = stackOut_34_0;
                            break L16;
                          }
                        }
                        var6 = stackIn_36_0;
                        var7 = var5 + (7 - -var6);
                        ib.field_v = new String[var7];
                        oe.field_c = new int[var7];
                        var8 = 0;
                        L17: while (true) {
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
                            L18: while (true) {
                              if (var8 >= var5) {
                                ib.field_v[6 - -var5] = null;
                                oe.field_c[6 + var5] = -2;
                                var8 = 0;
                                L19: while (true) {
                                  if (var6 <= var8) {
                                    break L1;
                                  } else {
                                    L20: {
                                      stackOut_47_0 = ib.field_v;
                                      stackOut_47_1 = var8 + (var5 + 7);
                                      stackIn_49_0 = stackOut_47_0;
                                      stackIn_49_1 = stackOut_47_1;
                                      stackIn_48_0 = stackOut_47_0;
                                      stackIn_48_1 = stackOut_47_1;
                                      if (var8 < dk.field_c.length) {
                                        stackOut_49_0 = (String[]) (Object) stackIn_49_0;
                                        stackOut_49_1 = stackIn_49_1;
                                        stackOut_49_2 = dk.field_c[var8];
                                        stackIn_50_0 = stackOut_49_0;
                                        stackIn_50_1 = stackOut_49_1;
                                        stackIn_50_2 = stackOut_49_2;
                                        break L20;
                                      } else {
                                        stackOut_48_0 = (String[]) (Object) stackIn_48_0;
                                        stackOut_48_1 = stackIn_48_1;
                                        stackOut_48_2 = "";
                                        stackIn_50_0 = stackOut_48_0;
                                        stackIn_50_1 = stackOut_48_1;
                                        stackIn_50_2 = stackOut_48_2;
                                        break L20;
                                      }
                                    }
                                    stackIn_50_0[stackIn_50_1] = (String) (Object) stackIn_50_2;
                                    var8++;
                                    continue L19;
                                  }
                                }
                              } else {
                                L21: {
                                  stackOut_41_0 = ib.field_v;
                                  stackOut_41_1 = 6 + var8;
                                  stackIn_43_0 = stackOut_41_0;
                                  stackIn_43_1 = stackOut_41_1;
                                  stackIn_42_0 = stackOut_41_0;
                                  stackIn_42_1 = stackOut_41_1;
                                  if (lo.field_u.length + var8 - var5 >= 0) {
                                    stackOut_43_0 = (String[]) (Object) stackIn_43_0;
                                    stackOut_43_1 = stackIn_43_1;
                                    stackOut_43_2 = lo.field_u[lo.field_u.length + (var8 - var5)];
                                    stackIn_44_0 = stackOut_43_0;
                                    stackIn_44_1 = stackOut_43_1;
                                    stackIn_44_2 = stackOut_43_2;
                                    break L21;
                                  } else {
                                    stackOut_42_0 = (String[]) (Object) stackIn_42_0;
                                    stackOut_42_1 = stackIn_42_1;
                                    stackOut_42_2 = "";
                                    stackIn_44_0 = stackOut_42_0;
                                    stackIn_44_1 = stackOut_42_1;
                                    stackIn_44_2 = stackOut_42_2;
                                    break L21;
                                  }
                                }
                                stackIn_44_0[stackIn_44_1] = (String) (Object) stackIn_44_2;
                                var8++;
                                continue L18;
                              }
                            }
                          } else {
                            oe.field_c[var8] = -1;
                            var8++;
                            continue L17;
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              var3 = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C, param1 + 25923);
              var4 = 2 - -var3;
              ib.field_v = new String[var4];
              oe.field_c = new int[var4];
              var5 = 0;
              L22: while (true) {
                if (var4 <= var5) {
                  hn.field_k = new int[1];
                  var5 = 0;
                  L23: while (true) {
                    if (var5 >= var3) {
                      ib.field_v[var4 + -2] = "";
                      ib.field_v[var4 - 1] = dd.field_e;
                      oe.field_c[-1 + var4] = 0;
                      hn.field_k[0] = 5;
                      break L1;
                    } else {
                      ib.field_v[var5] = qg.field_a[var5];
                      var5++;
                      continue L23;
                    }
                  }
                } else {
                  oe.field_c[var5] = -1;
                  var5++;
                  continue L22;
                }
              }
            }
          }
        }
        hi.field_h.field_f = hn.field_k.length;
        var3 = 0;
        var4 = 0;
        L24: while (true) {
          if (ib.field_v.length <= var4) {
            L25: {
              if (-3 != (go.field_i ^ -1)) {
                break L25;
              } else {
                var10 = jb.field_u;
                var5 = 0;
                L26: while (true) {
                  if (var10.length <= var5) {
                    var11 = ik.field_c;
                    var5 = 0;
                    L27: while (true) {
                      if (var11.length <= var5) {
                        break L25;
                      } else {
                        var13 = var11[var5];
                        var7 = vh.a(false, (byte) 96, var13);
                        if (var3 < var7) {
                          var3 = var7;
                          var5++;
                          continue L27;
                        } else {
                          var5++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    var12 = var10[var5];
                    var7 = vh.a(false, (byte) 37, var12);
                    if (var3 < var7) {
                      var3 = var7;
                      var5++;
                      continue L26;
                    } else {
                      var5++;
                      continue L26;
                    }
                  }
                }
              }
            }
            rd.field_a = (bm.field_h + da.field_c << 802792033) * hi.field_h.field_f;
            var4 = 0;
            L28: while (true) {
              if (ib.field_v.length <= var4) {
                hf.field_r = to.field_p + -(rd.field_a >> -2010076223);
                wh.field_d = new int[ib.field_v.length][];
                var4 = 0;
                var5 = hf.field_r;
                L29: while (true) {
                  if (var4 >= ib.field_v.length) {
                    L30: {
                      if (-3 == (go.field_i ^ -1)) {
                        hi.field_h.a(param0, -1, false, -1);
                        break L30;
                      } else {
                        hi.field_h.a(param0, 0, false, bl.a(me.field_I, (byte) 70, an.field_g));
                        break L30;
                      }
                    }
                    return;
                  } else {
                    var6 = oe.field_c[var4];
                    if (0 <= var6) {
                      var7 = vh.a(true, (byte) 111, ib.field_v[var4]);
                      var8 = -(var7 >> 1501744289) + vd.field_l;
                      var5 = var5 + da.field_c;
                      wh.field_d[var4] = new int[4];
                      wh.field_d[var4][0] = var8 + -la.field_d;
                      wh.field_d[var4][1] = var5;
                      wh.field_d[var4][2] = var7 + (la.field_d << -1384231487);
                      var5 = var5 + ((bm.field_h << 486015425) - -da.field_c - -mo.field_h);
                      wh.field_d[var4][3] = mo.field_h + (bm.field_h << 1491353665);
                      var4++;
                      continue L29;
                    } else {
                      var5 = var5 + qj.field_a;
                      var4++;
                      continue L29;
                    }
                  }
                }
              } else {
                L31: {
                  stackOut_108_0 = rd.field_a;
                  stackIn_110_0 = stackOut_108_0;
                  stackIn_109_0 = stackOut_108_0;
                  if (oe.field_c[var4] < 0) {
                    stackOut_110_0 = stackIn_110_0;
                    stackOut_110_1 = qj.field_a;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    break L31;
                  } else {
                    stackOut_109_0 = stackIn_109_0;
                    stackOut_109_1 = mo.field_h;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_111_1 = stackOut_109_1;
                    break L31;
                  }
                }
                rd.field_a = stackIn_111_0 + stackIn_111_1;
                var4++;
                continue L28;
              }
            }
          } else {
            L32: {
              if (0 > oe.field_c[var4]) {
                stackOut_91_0 = 0;
                stackIn_92_0 = stackOut_91_0;
                break L32;
              } else {
                stackOut_90_0 = 1;
                stackIn_92_0 = stackOut_90_0;
                break L32;
              }
            }
            var5 = vh.a(stackIn_92_0 != 0, (byte) 10, ib.field_v[var4]);
            if (var3 < var5) {
              var3 = var5;
              var4++;
              continue L24;
            } else {
              var4++;
              continue L24;
            }
          }
        }
    }

    qa(int param0) {
        ((qa) this).field_n = param0;
    }

    final static boolean a(boolean param0, wa param1, wa param2) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0) {
            return true;
        }
        int var3 = -param2.field_Bb + param1.field_Bb;
        if (param1.field_Lb != ie.field_Nb) {
            // ifnonnull L69
            // wide iinc 3 200
        } else {
            // wide iinc 3 -200
        }
        if (param2.field_Lb == ie.field_Nb) {
            // wide iinc 3 200
        } else {
            if (param2.field_Lb == null) {
                // wide iinc 3 -200
            }
        }
        return (var3 ^ -1) < -1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new char[128];
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = false;
        field_k = "You are already in a tower";
        field_p = "MOST ANNOYING - ";
    }
}
