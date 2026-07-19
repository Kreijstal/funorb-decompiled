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
            return (qb[]) null;
        }
        qb dupTemp$0 = ce.b(param2, param3, 21385);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qb dupTemp$1 = ce.b(param2, param1, param4 + 21262);
        var5[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
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
        field_o = (String[][]) null;
        field_j = null;
        field_k = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
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
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String stackIn_45_2 = null;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        String stackIn_51_2 = null;
        int stackIn_93_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        String[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        String stackOut_50_2 = null;
        String[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        String stackOut_49_2 = null;
        String[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_44_2 = null;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String stackOut_43_2 = null;
        int stackOut_112_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -4693) {
                break L1;
              } else {
                field_m = -4;
                break L1;
              }
            }
            L2: {
              go.field_i = param2;
              if (go.field_i == 0) {
                var3_int = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C, param1 + 25923);
                var4 = 3 + var3_int;
                ib.field_v = new String[var4];
                oe.field_c = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    hn.field_k = new int[2];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var3_int) {
                        ib.field_v[var4 - 3] = "";
                        ib.field_v[-2 + var4] = la.field_e;
                        oe.field_c[var4 - 2] = 0;
                        hn.field_k[0] = 4;
                        ib.field_v[-1 + var4] = dd.field_e;
                        oe.field_c[var4 + -1] = 1;
                        hn.field_k[1] = 5;
                        break L2;
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
                if (-2 != (go.field_i ^ -1)) {
                  if (go.field_i != 2) {
                    if ((go.field_i ^ -1) != -4) {
                      if ((go.field_i ^ -1) == -5) {
                        var3_int = hf.a(qg.field_a, ki.field_w, eb.field_a, mg.field_C, 21230);
                        var4 = 2 + var3_int;
                        oe.field_c = new int[var4];
                        ib.field_v = new String[var4];
                        var5 = 0;
                        L5: while (true) {
                          if (var4 <= var5) {
                            hn.field_k = new int[1];
                            var5 = 0;
                            L6: while (true) {
                              if (var5 >= var3_int) {
                                ib.field_v[var4 + -2] = "";
                                ib.field_v[var4 + -1] = dd.field_e;
                                oe.field_c[-1 + var4] = 0;
                                hn.field_k[0] = 5;
                                break L2;
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
                        if ((go.field_i ^ -1) == -6) {
                          var3_int = hf.a(qg.field_a, fl.field_d, eb.field_a, mg.field_C, param1 + 25923);
                          var4 = 3 + var3_int;
                          ib.field_v = new String[var4];
                          oe.field_c = new int[var4];
                          var5 = 0;
                          L7: while (true) {
                            if (var5 >= var4) {
                              hn.field_k = new int[2];
                              var5 = 0;
                              L8: while (true) {
                                if (var5 >= var3_int) {
                                  ib.field_v[var4 + -3] = "";
                                  ib.field_v[-2 + var4] = sl.field_R;
                                  oe.field_c[var4 + -2] = 0;
                                  hn.field_k[0] = 3;
                                  ib.field_v[-1 + var4] = dd.field_e;
                                  oe.field_c[-1 + var4] = 1;
                                  hn.field_k[1] = 5;
                                  break L2;
                                } else {
                                  ib.field_v[var5] = qg.field_a[var5];
                                  var5++;
                                  continue L8;
                                }
                              }
                            } else {
                              oe.field_c[var5] = -1;
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      }
                    } else {
                      L9: {
                        if (fi.field_d.field_p) {
                          var3_int = hf.a(qg.field_a, of.field_l, eb.field_a, mg.field_C, 21230);
                          break L9;
                        } else {
                          var3_int = hf.a(qg.field_a, wi.field_j, eb.field_a, mg.field_C, param1 ^ -16571);
                          break L9;
                        }
                      }
                      var4 = var3_int + 2;
                      ib.field_v = new String[var4];
                      oe.field_c = new int[var4];
                      var5 = 0;
                      L10: while (true) {
                        if (var4 <= var5) {
                          hn.field_k = new int[1];
                          var5 = 0;
                          L11: while (true) {
                            if (var5 >= var3_int) {
                              ib.field_v[var4 + -2] = "";
                              ib.field_v[var4 + -1] = dd.field_e;
                              oe.field_c[var4 - 1] = 0;
                              hn.field_k[0] = 5;
                              break L2;
                            } else {
                              ib.field_v[var5] = qg.field_a[var5];
                              var5++;
                              continue L11;
                            }
                          }
                        } else {
                          oe.field_c[var5] = -1;
                          var5++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    var3_int = hf.a(qg.field_a, tj.a(-112, new String[]{"<br><%0><br>"}, dm.field_F), eb.field_a, mg.field_C, param1 + 25923);
                    var4 = -1;
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (var3_int <= var5) {
                          break L13;
                        } else {
                          if ("<%0>".equals(qg.field_a[var5])) {
                            var4 = var5;
                            break L13;
                          } else {
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (0 == (var4 ^ -1)) {
                        throw new IllegalStateException();
                      } else {
                        jb.field_u = new String[var4];
                        sf.a(qg.field_a, 0, jb.field_u, 0, var4);
                        ik.field_c = new String[-1 + (-var4 + var3_int)];
                        sf.a(qg.field_a, var4 + 1, ik.field_c, 0, var3_int + -var4 - 1);
                        var4 = -1;
                        var3_int = hf.a(qg.field_a, tj.a(param1 ^ -4656, new String[]{"<br><%0><br>"}, bo.field_b), eb.field_a, mg.field_C, 21230);
                        var5 = 0;
                        L14: while (true) {
                          L15: {
                            if (var3_int <= var5) {
                              break L15;
                            } else {
                              if ("<%0>".equals(qg.field_a[var5])) {
                                var4 = var5;
                                break L15;
                              } else {
                                var5++;
                                continue L14;
                              }
                            }
                          }
                          if ((var4 ^ -1) == 0) {
                            throw new IllegalStateException();
                          } else {
                            L16: {
                              lo.field_u = new String[var4];
                              sf.a(qg.field_a, 0, lo.field_u, 0, var4);
                              dk.field_c = new String[-1 + var3_int - var4];
                              sf.a(qg.field_a, 1 + var4, dk.field_c, 0, -var4 + var3_int - 1);
                              if (jb.field_u.length >= lo.field_u.length) {
                                stackOut_33_0 = jb.field_u.length;
                                stackIn_34_0 = stackOut_33_0;
                                break L16;
                              } else {
                                stackOut_32_0 = lo.field_u.length;
                                stackIn_34_0 = stackOut_32_0;
                                break L16;
                              }
                            }
                            L17: {
                              var5 = stackIn_34_0;
                              if (ik.field_c.length < dk.field_c.length) {
                                stackOut_36_0 = dk.field_c.length;
                                stackIn_37_0 = stackOut_36_0;
                                break L17;
                              } else {
                                stackOut_35_0 = ik.field_c.length;
                                stackIn_37_0 = stackOut_35_0;
                                break L17;
                              }
                            }
                            var6 = stackIn_37_0;
                            var7 = var5 + (7 - -var6);
                            ib.field_v = new String[var7];
                            oe.field_c = new int[var7];
                            var8 = 0;
                            L18: while (true) {
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
                                L19: while (true) {
                                  if (var8 >= var5) {
                                    ib.field_v[6 - -var5] = null;
                                    oe.field_c[6 + var5] = -2;
                                    var8 = 0;
                                    L20: while (true) {
                                      if (var6 <= var8) {
                                        break L2;
                                      } else {
                                        L21: {
                                          stackOut_48_0 = ib.field_v;
                                          stackOut_48_1 = var8 + (var5 + 7);
                                          stackIn_50_0 = stackOut_48_0;
                                          stackIn_50_1 = stackOut_48_1;
                                          stackIn_49_0 = stackOut_48_0;
                                          stackIn_49_1 = stackOut_48_1;
                                          if (var8 < dk.field_c.length) {
                                            stackOut_50_0 = (String[]) ((Object) stackIn_50_0);
                                            stackOut_50_1 = stackIn_50_1;
                                            stackOut_50_2 = dk.field_c[var8];
                                            stackIn_51_0 = stackOut_50_0;
                                            stackIn_51_1 = stackOut_50_1;
                                            stackIn_51_2 = stackOut_50_2;
                                            break L21;
                                          } else {
                                            stackOut_49_0 = (String[]) ((Object) stackIn_49_0);
                                            stackOut_49_1 = stackIn_49_1;
                                            stackOut_49_2 = "";
                                            stackIn_51_0 = stackOut_49_0;
                                            stackIn_51_1 = stackOut_49_1;
                                            stackIn_51_2 = stackOut_49_2;
                                            break L21;
                                          }
                                        }
                                        stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                                        var8++;
                                        continue L20;
                                      }
                                    }
                                  } else {
                                    L22: {
                                      stackOut_42_0 = ib.field_v;
                                      stackOut_42_1 = 6 + var8;
                                      stackIn_44_0 = stackOut_42_0;
                                      stackIn_44_1 = stackOut_42_1;
                                      stackIn_43_0 = stackOut_42_0;
                                      stackIn_43_1 = stackOut_42_1;
                                      if (lo.field_u.length + var8 - var5 >= 0) {
                                        stackOut_44_0 = (String[]) ((Object) stackIn_44_0);
                                        stackOut_44_1 = stackIn_44_1;
                                        stackOut_44_2 = lo.field_u[lo.field_u.length + (var8 - var5)];
                                        stackIn_45_0 = stackOut_44_0;
                                        stackIn_45_1 = stackOut_44_1;
                                        stackIn_45_2 = stackOut_44_2;
                                        break L22;
                                      } else {
                                        stackOut_43_0 = (String[]) ((Object) stackIn_43_0);
                                        stackOut_43_1 = stackIn_43_1;
                                        stackOut_43_2 = "";
                                        stackIn_45_0 = stackOut_43_0;
                                        stackIn_45_1 = stackOut_43_1;
                                        stackIn_45_2 = stackOut_43_2;
                                        break L22;
                                      }
                                    }
                                    stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                                    var8++;
                                    continue L19;
                                  }
                                }
                              } else {
                                oe.field_c[var8] = -1;
                                var8++;
                                continue L18;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3_int = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C, param1 + 25923);
                  var4 = 2 - -var3_int;
                  ib.field_v = new String[var4];
                  oe.field_c = new int[var4];
                  var5 = 0;
                  L23: while (true) {
                    if (var4 <= var5) {
                      hn.field_k = new int[1];
                      var5 = 0;
                      L24: while (true) {
                        if (var5 >= var3_int) {
                          ib.field_v[var4 + -2] = "";
                          ib.field_v[var4 - 1] = dd.field_e;
                          oe.field_c[-1 + var4] = 0;
                          hn.field_k[0] = 5;
                          break L2;
                        } else {
                          ib.field_v[var5] = qg.field_a[var5];
                          var5++;
                          continue L24;
                        }
                      }
                    } else {
                      oe.field_c[var5] = -1;
                      var5++;
                      continue L23;
                    }
                  }
                }
              }
            }
            hi.field_h.field_f = hn.field_k.length;
            var3_int = 0;
            var4 = 0;
            L25: while (true) {
              if (ib.field_v.length <= var4) {
                L26: {
                  if (-3 != (go.field_i ^ -1)) {
                    break L26;
                  } else {
                    var10 = jb.field_u;
                    var5 = 0;
                    L27: while (true) {
                      if (var10.length <= var5) {
                        var11 = ik.field_c;
                        var5 = 0;
                        L28: while (true) {
                          if (var11.length <= var5) {
                            break L26;
                          } else {
                            L29: {
                              var13 = var11[var5];
                              var7 = vh.a(false, (byte) 96, var13);
                              if (var3_int < var7) {
                                var3_int = var7;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            var5++;
                            continue L28;
                          }
                        }
                      } else {
                        L30: {
                          var12 = var10[var5];
                          var7 = vh.a(false, (byte) 37, var12);
                          if (var3_int < var7) {
                            var3_int = var7;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        var5++;
                        continue L27;
                      }
                    }
                  }
                }
                rd.field_a = (bm.field_h + da.field_c << 802792033) * hi.field_h.field_f;
                var4 = 0;
                L31: while (true) {
                  if (ib.field_v.length <= var4) {
                    hf.field_r = to.field_p + -(rd.field_a >> -2010076223);
                    wh.field_d = new int[ib.field_v.length][];
                    var4 = 0;
                    var5 = hf.field_r;
                    L32: while (true) {
                      if (var4 >= ib.field_v.length) {
                        L33: {
                          if (-3 == (go.field_i ^ -1)) {
                            hi.field_h.a(param0, -1, false, -1);
                            break L33;
                          } else {
                            hi.field_h.a(param0, 0, false, bl.a(me.field_I, (byte) 70, an.field_g));
                            break L33;
                          }
                        }
                        break L0;
                      } else {
                        L34: {
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
                            break L34;
                          } else {
                            var5 = var5 + qj.field_a;
                            break L34;
                          }
                        }
                        var4++;
                        continue L32;
                      }
                    }
                  } else {
                    L35: {
                      stackOut_112_0 = rd.field_a;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_113_0 = stackOut_112_0;
                      if (oe.field_c[var4] < 0) {
                        stackOut_114_0 = stackIn_114_0;
                        stackOut_114_1 = qj.field_a;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        break L35;
                      } else {
                        stackOut_113_0 = stackIn_113_0;
                        stackOut_113_1 = mo.field_h;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        break L35;
                      }
                    }
                    rd.field_a = stackIn_115_0 + stackIn_115_1;
                    var4++;
                    continue L31;
                  }
                }
              } else {
                L36: {
                  if (0 > oe.field_c[var4]) {
                    stackOut_92_0 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    break L36;
                  } else {
                    stackOut_91_0 = 1;
                    stackIn_93_0 = stackOut_91_0;
                    break L36;
                  }
                }
                L37: {
                  var5 = vh.a(stackIn_93_0 != 0, (byte) 10, ib.field_v[var4]);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                var4++;
                continue L25;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "qa.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    qa(int param0) {
        this.field_n = param0;
    }

    final static boolean a(boolean param0, wa param1, wa param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (!param0) {
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
                if ((var3_int ^ -1) >= -1) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("qa.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    static {
        field_i = new char[128];
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = false;
        field_k = "You are already in a tower";
        field_p = "MOST ANNOYING - ";
    }
}
