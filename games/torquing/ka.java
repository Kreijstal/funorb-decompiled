/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends q {
    int field_m;
    static int[][] field_n;
    int field_k;
    static int field_j;
    static String field_l;

    final static void a(int param0, boolean param1, byte param2) {
        byte discarded$1 = 0;
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
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        int stackIn_89_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              i.field_R = true;
              go.field_x = param0;
              if (-1 == (go.field_x ^ -1)) {
                var3_int = rf.a(dd.field_e, bo.field_e, field_j, 87, pc.field_i);
                var4 = var3_int + 3;
                mn.field_Z = new int[var4];
                wh.field_z = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    di.field_e = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        wh.field_z[-3 + var4] = "";
                        wh.field_z[-2 + var4] = ol.field_b;
                        mn.field_Z[var4 + -2] = 0;
                        di.field_e[0] = 4;
                        wh.field_z[var4 - 1] = qd.field_i;
                        mn.field_Z[-1 + var4] = 1;
                        di.field_e[1] = 5;
                        break L1;
                      } else {
                        wh.field_z[var5] = dd.field_e[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    mn.field_Z[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-2 != (go.field_x ^ -1)) {
                  if ((go.field_x ^ -1) != -3) {
                    if (go.field_x == 3) {
                      L4: {
                        if (!nk.field_u.field_d) {
                          var3_int = rf.a(dd.field_e, bo.field_e, field_j, 115, ak.field_h);
                          break L4;
                        } else {
                          var3_int = rf.a(dd.field_e, bo.field_e, field_j, 84, hj.field_a);
                          break L4;
                        }
                      }
                      var4 = 2 - -var3_int;
                      wh.field_z = new String[var4];
                      mn.field_Z = new int[var4];
                      var5 = 0;
                      L5: while (true) {
                        if (var4 <= var5) {
                          di.field_e = new int[1];
                          var5 = 0;
                          L6: while (true) {
                            if (var3_int <= var5) {
                              wh.field_z[var4 + -2] = "";
                              wh.field_z[-1 + var4] = qd.field_i;
                              mn.field_Z[-1 + var4] = 0;
                              di.field_e[0] = 5;
                              break L1;
                            } else {
                              wh.field_z[var5] = dd.field_e[var5];
                              var5++;
                              continue L6;
                            }
                          }
                        } else {
                          mn.field_Z[var5] = -1;
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      if (-5 != (go.field_x ^ -1)) {
                        if ((go.field_x ^ -1) != -6) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = rf.a(dd.field_e, bo.field_e, field_j, 74, dn.field_c);
                          var4 = var3_int + 3;
                          mn.field_Z = new int[var4];
                          wh.field_z = new String[var4];
                          var5 = 0;
                          L7: while (true) {
                            if (var4 <= var5) {
                              di.field_e = new int[2];
                              var5 = 0;
                              L8: while (true) {
                                if (var3_int <= var5) {
                                  wh.field_z[var4 - 3] = "";
                                  wh.field_z[-2 + var4] = ud.field_l;
                                  mn.field_Z[-2 + var4] = 0;
                                  di.field_e[0] = 3;
                                  wh.field_z[var4 - 1] = qd.field_i;
                                  mn.field_Z[-1 + var4] = 1;
                                  di.field_e[1] = 5;
                                  break L1;
                                } else {
                                  wh.field_z[var5] = dd.field_e[var5];
                                  var5++;
                                  continue L8;
                                }
                              }
                            } else {
                              mn.field_Z[var5] = -1;
                              var5++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        var3_int = rf.a(dd.field_e, bo.field_e, field_j, 75, wj.field_j);
                        var4 = 2 - -var3_int;
                        mn.field_Z = new int[var4];
                        wh.field_z = new String[var4];
                        var5 = 0;
                        L9: while (true) {
                          if (var5 >= var4) {
                            di.field_e = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var3_int <= var5) {
                                wh.field_z[var4 - 2] = "";
                                wh.field_z[-1 + var4] = qd.field_i;
                                mn.field_Z[var4 - 1] = 0;
                                di.field_e[0] = 5;
                                break L1;
                              } else {
                                wh.field_z[var5] = dd.field_e[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            mn.field_Z[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = rf.a(dd.field_e, bo.field_e, field_j, 99, ff.a(new String[]{"<br><%0><br>"}, 0, fi.field_c));
                    var4 = -1;
                    var5 = 0;
                    L11: while (true) {
                      L12: {
                        if (var3_int <= var5) {
                          break L12;
                        } else {
                          if (!"<%0>".equals(dd.field_e[var5])) {
                            var5++;
                            continue L11;
                          } else {
                            var4 = var5;
                            break L12;
                          }
                        }
                      }
                      if ((var4 ^ -1) == 0) {
                        throw new IllegalStateException();
                      } else {
                        fd.field_k = new String[var4];
                        dk.a(dd.field_e, 0, fd.field_k, 0, var4);
                        ib.field_c = new String[-1 + -var4 + var3_int];
                        dk.a(dd.field_e, var4 + 1, ib.field_c, 0, -1 + var3_int - var4);
                        var3_int = rf.a(dd.field_e, bo.field_e, field_j, 122, ff.a(new String[]{"<br><%0><br>"}, 0, k.field_f));
                        var4 = -1;
                        var5 = 0;
                        L13: while (true) {
                          L14: {
                            if (var3_int <= var5) {
                              break L14;
                            } else {
                              if ("<%0>".equals(dd.field_e[var5])) {
                                var4 = var5;
                                break L14;
                              } else {
                                var5++;
                                continue L13;
                              }
                            }
                          }
                          if ((var4 ^ -1) != 0) {
                            L15: {
                              qh.field_b = new String[var4];
                              dk.a(dd.field_e, 0, qh.field_b, 0, var4);
                              me.field_a = new String[var3_int - var4 - 1];
                              dk.a(dd.field_e, 1 + var4, me.field_a, 0, -1 + var3_int + -var4);
                              if (fd.field_k.length < qh.field_b.length) {
                                stackOut_29_0 = qh.field_b.length;
                                stackIn_30_0 = stackOut_29_0;
                                break L15;
                              } else {
                                stackOut_28_0 = fd.field_k.length;
                                stackIn_30_0 = stackOut_28_0;
                                break L15;
                              }
                            }
                            L16: {
                              var5 = stackIn_30_0;
                              if (ib.field_c.length >= me.field_a.length) {
                                stackOut_32_0 = ib.field_c.length;
                                stackIn_33_0 = stackOut_32_0;
                                break L16;
                              } else {
                                stackOut_31_0 = me.field_a.length;
                                stackIn_33_0 = stackOut_31_0;
                                break L16;
                              }
                            }
                            var6 = stackIn_33_0;
                            var7 = var5 + (7 - -var6);
                            mn.field_Z = new int[var7];
                            wh.field_z = new String[var7];
                            var8 = 0;
                            L17: while (true) {
                              if (var8 >= var7) {
                                di.field_e = new int[2];
                                wh.field_z[1] = tn.field_m;
                                wh.field_z[0] = vb.field_b;
                                mn.field_Z[1] = 0;
                                di.field_e[1] = 2;
                                di.field_e[0] = 5;
                                wh.field_z[5] = "";
                                wh.field_z[2] = gn.field_f;
                                mn.field_Z[3] = 1;
                                wh.field_z[3] = fo.field_E;
                                wh.field_z[4] = gp.field_Q;
                                var8 = 0;
                                L18: while (true) {
                                  if (var5 <= var8) {
                                    wh.field_z[6 - -var5] = null;
                                    mn.field_Z[var5 + 6] = -2;
                                    var8 = 0;
                                    L19: while (true) {
                                      if (var6 <= var8) {
                                        dc.field_c = km.b(-1);
                                        break L1;
                                      } else {
                                        L20: {
                                          stackOut_44_0 = wh.field_z;
                                          stackOut_44_1 = 7 + var5 + var8;
                                          stackIn_46_0 = stackOut_44_0;
                                          stackIn_46_1 = stackOut_44_1;
                                          stackIn_45_0 = stackOut_44_0;
                                          stackIn_45_1 = stackOut_44_1;
                                          if (var8 < me.field_a.length) {
                                            stackOut_46_0 = (String[]) ((Object) stackIn_46_0);
                                            stackOut_46_1 = stackIn_46_1;
                                            stackOut_46_2 = me.field_a[var8];
                                            stackIn_47_0 = stackOut_46_0;
                                            stackIn_47_1 = stackOut_46_1;
                                            stackIn_47_2 = stackOut_46_2;
                                            break L20;
                                          } else {
                                            stackOut_45_0 = (String[]) ((Object) stackIn_45_0);
                                            stackOut_45_1 = stackIn_45_1;
                                            stackOut_45_2 = "";
                                            stackIn_47_0 = stackOut_45_0;
                                            stackIn_47_1 = stackOut_45_1;
                                            stackIn_47_2 = stackOut_45_2;
                                            break L20;
                                          }
                                        }
                                        stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                        var8++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    L21: {
                                      stackOut_38_0 = wh.field_z;
                                      stackOut_38_1 = 6 + var8;
                                      stackIn_40_0 = stackOut_38_0;
                                      stackIn_40_1 = stackOut_38_1;
                                      stackIn_39_0 = stackOut_38_0;
                                      stackIn_39_1 = stackOut_38_1;
                                      if (-var5 + (var8 + qh.field_b.length) >= 0) {
                                        stackOut_40_0 = (String[]) ((Object) stackIn_40_0);
                                        stackOut_40_1 = stackIn_40_1;
                                        stackOut_40_2 = qh.field_b[-var5 + (qh.field_b.length + var8)];
                                        stackIn_41_0 = stackOut_40_0;
                                        stackIn_41_1 = stackOut_40_1;
                                        stackIn_41_2 = stackOut_40_2;
                                        break L21;
                                      } else {
                                        stackOut_39_0 = (String[]) ((Object) stackIn_39_0);
                                        stackOut_39_1 = stackIn_39_1;
                                        stackOut_39_2 = "";
                                        stackIn_41_0 = stackOut_39_0;
                                        stackIn_41_1 = stackOut_39_1;
                                        stackIn_41_2 = stackOut_39_2;
                                        break L21;
                                      }
                                    }
                                    stackIn_41_0[stackIn_41_1] = stackIn_41_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                mn.field_Z[var8] = -1;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            throw new IllegalStateException();
                          }
                        }
                      }
                    }
                  }
                } else {
                  var3_int = rf.a(dd.field_e, bo.field_e, field_j, 74, pc.field_i);
                  var4 = var3_int + 2;
                  mn.field_Z = new int[var4];
                  wh.field_z = new String[var4];
                  var5 = 0;
                  L22: while (true) {
                    if (var4 <= var5) {
                      di.field_e = new int[1];
                      var5 = 0;
                      L23: while (true) {
                        if (var5 >= var3_int) {
                          wh.field_z[-2 + var4] = "";
                          wh.field_z[var4 - 1] = qd.field_i;
                          mn.field_Z[var4 + -1] = 0;
                          di.field_e[0] = 5;
                          break L1;
                        } else {
                          wh.field_z[var5] = dd.field_e[var5];
                          var5++;
                          continue L23;
                        }
                      }
                    } else {
                      mn.field_Z[var5] = -1;
                      var5++;
                      continue L22;
                    }
                  }
                }
              }
            }
            kb.field_g.field_i = di.field_e.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (wh.field_z.length <= var4) {
                L25: {
                  if (param2 < -31) {
                    break L25;
                  } else {
                    discarded$1 = ka.a(true, '+');
                    break L25;
                  }
                }
                L26: {
                  if (2 == go.field_x) {
                    var10 = fd.field_k;
                    var5 = 0;
                    L27: while (true) {
                      if (var10.length <= var5) {
                        var11 = ib.field_c;
                        var5 = 0;
                        L28: while (true) {
                          if (var11.length <= var5) {
                            break L26;
                          } else {
                            var13 = var11[var5];
                            var7 = mh.a(false, -86, var13);
                            if (var3_int < var7) {
                              var3_int = var7;
                              var5++;
                              continue L28;
                            } else {
                              var5++;
                              continue L28;
                            }
                          }
                        }
                      } else {
                        var12 = var10[var5];
                        var7 = mh.a(false, -122, var12);
                        if (var3_int < var7) {
                          var3_int = var7;
                          var5++;
                          continue L27;
                        } else {
                          var5++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                bh.field_b = vk.field_A + var3_int + -(var3_int >> -1622476095);
                v.field_a = -(var3_int >> -1229240447) + vk.field_A;
                ii.field_k = (hn.field_z + ln.field_D << -1988507775) * kb.field_g.field_i;
                var4 = 0;
                L29: while (true) {
                  if (wh.field_z.length <= var4) {
                    a.field_d = jo.field_b + -(ii.field_k >> -1266301919);
                    kb.field_e = new int[wh.field_z.length][];
                    var4 = 0;
                    var5 = a.field_d;
                    L30: while (true) {
                      if (wh.field_z.length <= var4) {
                        L31: {
                          if ((go.field_x ^ -1) != -3) {
                            kb.field_g.a(qd.a(16452, n.field_t, k.field_e), (byte) 52, param1, 0);
                            break L31;
                          } else {
                            kb.field_g.a(-1, (byte) 123, param1, -1);
                            break L31;
                          }
                        }
                        break L0;
                      } else {
                        L32: {
                          var6 = mn.field_Z[var4];
                          if (-1 < (var6 ^ -1)) {
                            var5 = var5 + bp.field_e;
                            break L32;
                          } else {
                            var7 = mh.a(true, -119, wh.field_z[var4]);
                            var5 = var5 + hn.field_z;
                            var8 = vk.field_A + -(var7 >> 1287195201);
                            kb.field_e[var4] = new int[4];
                            kb.field_e[var4][0] = -aq.field_b + var8;
                            kb.field_e[var4][1] = var5;
                            kb.field_e[var4][2] = var7 + (aq.field_b << -1652988543);
                            kb.field_e[var4][3] = (ln.field_D << 2090392801) + kp.field_d;
                            var5 = var5 + (hn.field_z + ((ln.field_D << -1835203263) + kp.field_d));
                            break L32;
                          }
                        }
                        var4++;
                        continue L30;
                      }
                    }
                  } else {
                    L33: {
                      stackOut_108_0 = ii.field_k;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_109_0 = stackOut_108_0;
                      if (0 <= mn.field_Z[var4]) {
                        stackOut_110_0 = stackIn_110_0;
                        stackOut_110_1 = kp.field_d;
                        stackIn_111_0 = stackOut_110_0;
                        stackIn_111_1 = stackOut_110_1;
                        break L33;
                      } else {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = bp.field_e;
                        stackIn_111_0 = stackOut_109_0;
                        stackIn_111_1 = stackOut_109_1;
                        break L33;
                      }
                    }
                    ii.field_k = stackIn_111_0 + stackIn_111_1;
                    var4++;
                    continue L29;
                  }
                }
              } else {
                L34: {
                  if (0 > mn.field_Z[var4]) {
                    stackOut_88_0 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    break L34;
                  } else {
                    stackOut_87_0 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    break L34;
                  }
                }
                var5 = mh.a(stackIn_89_0 != 0, -125, wh.field_z[var4]);
                if (var3_int < var5) {
                  var3_int = var5;
                  var4++;
                  continue L24;
                } else {
                  var4++;
                  continue L24;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "ka.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static byte a(boolean param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = Torquing.field_u;
              if (param1 <= 0) {
                break L2;
              } else {
                if (param1 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (255 < param1) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            if (8364 != param1) {
              if (param1 == 8218) {
                var2 = -126;
                break L0;
              } else {
                if (param1 != 402) {
                  if (8222 == param1) {
                    var2 = -124;
                    break L0;
                  } else {
                    if (8230 != param1) {
                      if (param1 == 8224) {
                        var2 = -122;
                        break L0;
                      } else {
                        if (param1 != 8225) {
                          if (710 != param1) {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                                break L0;
                              } else {
                                if (param1 == 8249) {
                                  var2 = -117;
                                  break L0;
                                } else {
                                  if (338 == param1) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param1 != 381) {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (param1 == 8220) {
                                            var2 = -109;
                                            break L0;
                                          } else {
                                            if (param1 != 8221) {
                                              if (8226 != param1) {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                  break L0;
                                                } else {
                                                  if (param1 != 8212) {
                                                    if (param1 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                        break L0;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                          break L0;
                                                        } else {
                                                          if (param1 != 8250) {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                              break L0;
                                                            } else {
                                                              if (param1 != 382) {
                                                                if (param1 != 376) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              } else {
                                                                var2 = -98;
                                                                break L0;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                    break L0;
                                                  }
                                                }
                                              } else {
                                                var2 = -107;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -108;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -114;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          } else {
                            var2 = -120;
                            break L0;
                          }
                        } else {
                          var2 = -121;
                          break L0;
                        }
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  }
                } else {
                  var2 = -125;
                  break L0;
                }
              }
            } else {
              var2 = -128;
              break L0;
            }
          }
          var2 = (byte)param1;
          break L0;
        }
        if (!param0) {
          return (byte) var2;
        } else {
          return (byte) -87;
        }
    }

    final static bp a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bp stackIn_6_0 = null;
        bp stackIn_10_0 = null;
        bp stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        bp stackIn_28_0 = null;
        bp stackIn_42_0 = null;
        bp stackIn_46_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bp stackOut_5_0 = null;
        bp stackOut_9_0 = null;
        bp stackOut_41_0 = null;
        bp stackOut_45_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        bp stackOut_27_0 = null;
        bp stackOut_13_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param1 == -10) {
                break L1;
              } else {
                field_j = -54;
                break L1;
              }
            }
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_5_0 = oj.field_l;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -65) {
                stackOut_9_0 = wn.field_s;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L2: while (true) {
                    if (var2_int > var4) {
                      L3: {
                        var5 = param0.charAt(var4);
                        if (46 == var5) {
                          L4: {
                            if (0 == var4) {
                              break L4;
                            } else {
                              if (var2_int - 1 == var4) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L3;
                                }
                              }
                            }
                          }
                          stackOut_41_0 = va.field_H;
                          stackIn_42_0 = stackOut_41_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (pb.field_g.indexOf(var5) != -1) {
                            var3 = 0;
                            break L3;
                          } else {
                            stackOut_45_0 = va.field_H;
                            stackIn_46_0 = stackOut_45_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L2;
                    } else {
                      return null;
                    }
                  }
                } else {
                  if (-35 == (param0.charAt(-1 + var2_int) ^ -1)) {
                    var3 = 0;
                    var4 = 1;
                    L5: while (true) {
                      if (var4 < -1 + var2_int) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L7: {
                              if (var3 != 0) {
                                stackOut_22_0 = 0;
                                stackIn_23_0 = stackOut_22_0;
                                break L7;
                              } else {
                                stackOut_21_0 = 1;
                                stackIn_23_0 = stackOut_21_0;
                                break L7;
                              }
                            }
                            var3 = stackIn_23_0;
                            break L6;
                          } else {
                            L8: {
                              if (34 != var5) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  stackOut_27_0 = va.field_H;
                                  stackIn_28_0 = stackOut_27_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var3 = 0;
                            break L6;
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_13_0 = va.field_H;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var2);
            stackOut_50_1 = new StringBuilder().append("ka.B(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L9;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L9;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_28_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_46_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, java.awt.Frame param1, vh param2) {
        rc var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(false, param1);
              L2: while (true) {
                if (0 != var3.field_a) {
                  if (var3.field_a != 1) {
                    ub.a(1976, 100L);
                    continue L1;
                  } else {
                    L3: {
                      param1.setVisible(false);
                      param1.dispose();
                      if (param0 < -94) {
                        break L3;
                      } else {
                        field_l = (String) null;
                        break L3;
                      }
                    }
                    break L0;
                  }
                } else {
                  ub.a(1976, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("ka.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static void a(byte param0) {
        bp discarded$0 = null;
        if (param0 > -101) {
            String var2 = (String) null;
            discarded$0 = ka.a((String) null, (byte) 100);
        }
        od.b(128, 4);
    }

    final static String a(long param0, int param1) {
        ne.field_b.setTime(new Date(param0));
        int var3 = ne.field_b.get(7);
        int var4 = ne.field_b.get(5);
        if (param1 != -2) {
            field_n = (int[][]) null;
        }
        int var5 = ne.field_b.get(2);
        int var6 = ne.field_b.get(1);
        int var7 = ne.field_b.get(11);
        int var8 = ne.field_b.get(12);
        int var9 = ne.field_b.get(13);
        return sb.field_n[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + nh.field_j[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    ka(int param0, int param1) {
        this.field_m = param0;
        this.field_k = param1;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 < 89) {
            field_n = (int[][]) null;
        }
        field_n = (int[][]) null;
    }

    static {
        field_n = new int[32][5];
        field_l = "You collected <%0> of <%1> powerups";
    }
}
