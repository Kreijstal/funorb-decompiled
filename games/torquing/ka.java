/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class ka extends q {
    int field_m;
    static int[][] field_n;
    int field_k;
    static int field_j;
    static String field_l;

    final static void a(int param0, boolean param1, byte param2) {
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
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_46_2 = null;
        int stackIn_88_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        String[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_44_2 = null;
        String[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        String[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_38_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        L0: {
          var9 = Torquing.field_u;
          i.field_R = true;
          go.field_x = param0;
          if (go.field_x == 0) {
            var3_int = rf.a(dd.field_e, bo.field_e, field_j, 87, pc.field_i);
            var4 = var3_int + 3;
            mn.field_Z = new int[var4];
            wh.field_z = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                di.field_e = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (~var3_int >= ~var5) {
                    wh.field_z[-3 + var4] = "";
                    wh.field_z[-2 + var4] = ol.field_b;
                    mn.field_Z[var4 + -2] = 0;
                    di.field_e[0] = 4;
                    wh.field_z[var4 - 1] = qd.field_i;
                    mn.field_Z[-1 + var4] = 1;
                    di.field_e[1] = 5;
                    break L0;
                  } else {
                    wh.field_z[var5] = dd.field_e[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                mn.field_Z[var5] = -1;
                var5++;
                continue L1;
              }
            }
          } else {
            if (go.field_x != 1) {
              if (go.field_x != 2) {
                if (go.field_x == 3) {
                  L3: {
                    if (!nk.field_u.field_d) {
                      var3_int = rf.a(dd.field_e, bo.field_e, field_j, 115, ak.field_h);
                      break L3;
                    } else {
                      var3_int = rf.a(dd.field_e, bo.field_e, field_j, 84, hj.field_a);
                      break L3;
                    }
                  }
                  var4 = 2 - -var3_int;
                  wh.field_z = new String[var4];
                  mn.field_Z = new int[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (~var4 >= ~var5) {
                      di.field_e = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var3_int <= var5) {
                          wh.field_z[var4 + -2] = "";
                          wh.field_z[-1 + var4] = qd.field_i;
                          mn.field_Z[-1 + var4] = 0;
                          di.field_e[0] = 5;
                          break L0;
                        } else {
                          wh.field_z[var5] = dd.field_e[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      mn.field_Z[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if (go.field_x != 4) {
                    if (go.field_x != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = rf.a(dd.field_e, bo.field_e, field_j, 74, dn.field_c);
                      var4 = var3_int + 3;
                      mn.field_Z = new int[var4];
                      wh.field_z = new String[var4];
                      var5 = 0;
                      L6: while (true) {
                        if (var4 <= var5) {
                          di.field_e = new int[2];
                          var5 = 0;
                          L7: while (true) {
                            if (var3_int <= var5) {
                              wh.field_z[var4 - 3] = "";
                              wh.field_z[-2 + var4] = ud.field_l;
                              mn.field_Z[-2 + var4] = 0;
                              di.field_e[0] = 3;
                              wh.field_z[var4 - 1] = qd.field_i;
                              mn.field_Z[-1 + var4] = 1;
                              di.field_e[1] = 5;
                              break L0;
                            } else {
                              wh.field_z[var5] = dd.field_e[var5];
                              var5++;
                              continue L7;
                            }
                          }
                        } else {
                          mn.field_Z[var5] = -1;
                          var5++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    var3_int = rf.a(dd.field_e, bo.field_e, field_j, 75, wj.field_j);
                    var4 = 2 - -var3_int;
                    mn.field_Z = new int[var4];
                    wh.field_z = new String[var4];
                    var5 = 0;
                    L8: while (true) {
                      if (~var5 <= ~var4) {
                        di.field_e = new int[1];
                        var5 = 0;
                        L9: while (true) {
                          if (~var3_int >= ~var5) {
                            wh.field_z[var4 - 2] = "";
                            wh.field_z[-1 + var4] = qd.field_i;
                            mn.field_Z[var4 - 1] = 0;
                            di.field_e[0] = 5;
                            break L0;
                          } else {
                            wh.field_z[var5] = dd.field_e[var5];
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        mn.field_Z[var5] = -1;
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                var3_int = rf.a(dd.field_e, bo.field_e, field_j, 99, ff.a(new String[1], 0, fi.field_c));
                var4 = -1;
                var5 = 0;
                L10: while (true) {
                  L11: {
                    if (~var3_int >= ~var5) {
                      break L11;
                    } else {
                      if (!"<%0>".equals((Object) (Object) dd.field_e[var5])) {
                        var5++;
                        continue L10;
                      } else {
                        var4 = var5;
                        break L11;
                      }
                    }
                  }
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    fd.field_k = new String[var4];
                    dk.a((Object[]) (Object) dd.field_e, 0, (Object[]) (Object) fd.field_k, 0, var4);
                    ib.field_c = new String[-1 + -var4 + var3_int];
                    dk.a((Object[]) (Object) dd.field_e, var4 + 1, (Object[]) (Object) ib.field_c, 0, -1 + var3_int - var4);
                    var3_int = rf.a(dd.field_e, bo.field_e, field_j, 122, ff.a(new String[1], 0, k.field_f));
                    var4 = -1;
                    var5 = 0;
                    L12: while (true) {
                      L13: {
                        if (~var3_int >= ~var5) {
                          break L13;
                        } else {
                          if ("<%0>".equals((Object) (Object) dd.field_e[var5])) {
                            var4 = var5;
                            break L13;
                          } else {
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (var4 != -1) {
                        L14: {
                          qh.field_b = new String[var4];
                          dk.a((Object[]) (Object) dd.field_e, 0, (Object[]) (Object) qh.field_b, 0, var4);
                          me.field_a = new String[var3_int - var4 - 1];
                          dk.a((Object[]) (Object) dd.field_e, 1 + var4, (Object[]) (Object) me.field_a, 0, -1 + var3_int + -var4);
                          if (fd.field_k.length < qh.field_b.length) {
                            stackOut_28_0 = qh.field_b.length;
                            stackIn_29_0 = stackOut_28_0;
                            break L14;
                          } else {
                            stackOut_27_0 = fd.field_k.length;
                            stackIn_29_0 = stackOut_27_0;
                            break L14;
                          }
                        }
                        L15: {
                          var5 = stackIn_29_0;
                          if (ib.field_c.length >= me.field_a.length) {
                            stackOut_31_0 = ib.field_c.length;
                            stackIn_32_0 = stackOut_31_0;
                            break L15;
                          } else {
                            stackOut_30_0 = me.field_a.length;
                            stackIn_32_0 = stackOut_30_0;
                            break L15;
                          }
                        }
                        var6 = stackIn_32_0;
                        var7 = var5 + (7 - -var6);
                        mn.field_Z = new int[var7];
                        wh.field_z = new String[var7];
                        var8 = 0;
                        L16: while (true) {
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
                            L17: while (true) {
                              if (var5 <= var8) {
                                wh.field_z[6 - -var5] = null;
                                mn.field_Z[var5 + 6] = -2;
                                var8 = 0;
                                L18: while (true) {
                                  if (var6 <= var8) {
                                    dc.field_c = km.b(-1);
                                    break L0;
                                  } else {
                                    L19: {
                                      stackOut_43_0 = wh.field_z;
                                      stackOut_43_1 = 7 + var5 + var8;
                                      stackIn_45_0 = stackOut_43_0;
                                      stackIn_45_1 = stackOut_43_1;
                                      stackIn_44_0 = stackOut_43_0;
                                      stackIn_44_1 = stackOut_43_1;
                                      if (~var8 > ~me.field_a.length) {
                                        stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                        stackOut_45_1 = stackIn_45_1;
                                        stackOut_45_2 = me.field_a[var8];
                                        stackIn_46_0 = stackOut_45_0;
                                        stackIn_46_1 = stackOut_45_1;
                                        stackIn_46_2 = stackOut_45_2;
                                        break L19;
                                      } else {
                                        stackOut_44_0 = (String[]) (Object) stackIn_44_0;
                                        stackOut_44_1 = stackIn_44_1;
                                        stackOut_44_2 = "";
                                        stackIn_46_0 = stackOut_44_0;
                                        stackIn_46_1 = stackOut_44_1;
                                        stackIn_46_2 = stackOut_44_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_46_0[stackIn_46_1] = stackIn_46_2;
                                    var8++;
                                    continue L18;
                                  }
                                }
                              } else {
                                L20: {
                                  stackOut_37_0 = wh.field_z;
                                  stackOut_37_1 = 6 + var8;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_39_1 = stackOut_37_1;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  if (-var5 + (var8 + qh.field_b.length) >= 0) {
                                    stackOut_39_0 = (String[]) (Object) stackIn_39_0;
                                    stackOut_39_1 = stackIn_39_1;
                                    stackOut_39_2 = qh.field_b[-var5 + (qh.field_b.length + var8)];
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    stackIn_40_2 = stackOut_39_2;
                                    break L20;
                                  } else {
                                    stackOut_38_0 = (String[]) (Object) stackIn_38_0;
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = "";
                                    stackIn_40_0 = stackOut_38_0;
                                    stackIn_40_1 = stackOut_38_1;
                                    stackIn_40_2 = stackOut_38_2;
                                    break L20;
                                  }
                                }
                                stackIn_40_0[stackIn_40_1] = stackIn_40_2;
                                var8++;
                                continue L17;
                              }
                            }
                          } else {
                            mn.field_Z[var8] = -1;
                            var8++;
                            continue L16;
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
              L21: while (true) {
                if (~var4 >= ~var5) {
                  di.field_e = new int[1];
                  var5 = 0;
                  L22: while (true) {
                    if (~var5 <= ~var3_int) {
                      wh.field_z[-2 + var4] = "";
                      wh.field_z[var4 - 1] = qd.field_i;
                      mn.field_Z[var4 + -1] = 0;
                      di.field_e[0] = 5;
                      break L0;
                    } else {
                      wh.field_z[var5] = dd.field_e[var5];
                      var5++;
                      continue L22;
                    }
                  }
                } else {
                  mn.field_Z[var5] = -1;
                  var5++;
                  continue L21;
                }
              }
            }
          }
        }
        kb.field_g.field_i = di.field_e.length;
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (~wh.field_z.length >= ~var4) {
            L24: {
              if (param2 < -31) {
                break L24;
              } else {
                byte discarded$1 = ka.a(true, '+');
                break L24;
              }
            }
            L25: {
              if (2 == go.field_x) {
                var10 = fd.field_k;
                var5 = 0;
                L26: while (true) {
                  if (~var10.length >= ~var5) {
                    var11 = ib.field_c;
                    var5 = 0;
                    L27: while (true) {
                      if (~var11.length >= ~var5) {
                        break L25;
                      } else {
                        L28: {
                          var13 = var11[var5];
                          var7 = mh.a(false, -86, var13);
                          if (var3_int >= var7) {
                            break L28;
                          } else {
                            var3_int = var7;
                            break L28;
                          }
                        }
                        var5++;
                        continue L27;
                      }
                    }
                  } else {
                    L29: {
                      var12 = var10[var5];
                      var7 = mh.a(false, -122, var12);
                      if (~var3_int <= ~var7) {
                        break L29;
                      } else {
                        var3_int = var7;
                        break L29;
                      }
                    }
                    var5++;
                    continue L26;
                  }
                }
              } else {
                break L25;
              }
            }
            bh.field_b = vk.field_A + var3_int + -(var3_int >> 1);
            v.field_a = -(var3_int >> 1) + vk.field_A;
            ii.field_k = (hn.field_z + ln.field_D << 1) * kb.field_g.field_i;
            var4 = 0;
            L30: while (true) {
              if (wh.field_z.length <= var4) {
                a.field_d = jo.field_b + -(ii.field_k >> 1);
                kb.field_e = new int[wh.field_z.length][];
                var4 = 0;
                var5 = a.field_d;
                L31: while (true) {
                  if (~wh.field_z.length >= ~var4) {
                    L32: {
                      if (go.field_x != 2) {
                        kb.field_g.a(qd.a(16452, n.field_t, k.field_e), (byte) 52, param1, 0);
                        break L32;
                      } else {
                        kb.field_g.a(-1, (byte) 123, param1, -1);
                        break L32;
                      }
                    }
                    return;
                  } else {
                    L33: {
                      var6 = mn.field_Z[var4];
                      if (var6 < 0) {
                        var5 = var5 + bp.field_e;
                        break L33;
                      } else {
                        var7 = mh.a(true, -119, wh.field_z[var4]);
                        var5 = var5 + hn.field_z;
                        var8 = vk.field_A + -(var7 >> 1);
                        kb.field_e[var4] = new int[4];
                        kb.field_e[var4][0] = -aq.field_b + var8;
                        kb.field_e[var4][1] = var5;
                        kb.field_e[var4][2] = var7 + (aq.field_b << 1);
                        kb.field_e[var4][3] = (ln.field_D << 1) + kp.field_d;
                        var5 = var5 + (hn.field_z + ((ln.field_D << 1) + kp.field_d));
                        break L33;
                      }
                    }
                    var4++;
                    continue L31;
                  }
                }
              } else {
                L34: {
                  stackOut_107_0 = ii.field_k;
                  stackIn_109_0 = stackOut_107_0;
                  stackIn_108_0 = stackOut_107_0;
                  if (0 <= mn.field_Z[var4]) {
                    stackOut_109_0 = stackIn_109_0;
                    stackOut_109_1 = kp.field_d;
                    stackIn_110_0 = stackOut_109_0;
                    stackIn_110_1 = stackOut_109_1;
                    break L34;
                  } else {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = bp.field_e;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    break L34;
                  }
                }
                ii.field_k = stackIn_110_0 + stackIn_110_1;
                var4++;
                continue L30;
              }
            }
          } else {
            L35: {
              if (0 > mn.field_Z[var4]) {
                stackOut_87_0 = 0;
                stackIn_88_0 = stackOut_87_0;
                break L35;
              } else {
                stackOut_86_0 = 1;
                stackIn_88_0 = stackOut_86_0;
                break L35;
              }
            }
            L36: {
              var5 = mh.a(stackIn_88_0 != 0, -125, wh.field_z[var4]);
              if (var3_int >= var5) {
                break L36;
              } else {
                var3_int = var5;
                break L36;
              }
            }
            var4++;
            continue L23;
          }
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
        bp stackIn_4_0 = null;
        bp stackIn_8_0 = null;
        bp stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        bp stackIn_26_0 = null;
        bp stackIn_40_0 = null;
        bp stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        bp stackOut_3_0 = null;
        bp stackOut_7_0 = null;
        bp stackOut_39_0 = null;
        bp stackOut_43_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        bp stackOut_25_0 = null;
        bp stackOut_11_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = Torquing.field_u;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = oj.field_l;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = wn.field_s;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) != 34) {
                var3 = 0;
                var4 = 0;
                L0: while (true) {
                  if (~var2_int < ~var4) {
                    L1: {
                      var5 = param0.charAt(var4);
                      if (46 == var5) {
                        L2: {
                          if (0 == var4) {
                            break L2;
                          } else {
                            if (~(var2_int - 1) == ~var4) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                var3 = 1;
                                break L1;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = va.field_H;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      } else {
                        if (pb.field_g.indexOf(var5) != -1) {
                          var3 = 0;
                          break L1;
                        } else {
                          stackOut_43_0 = va.field_H;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        }
                      }
                    }
                    var4++;
                    continue L0;
                  } else {
                    return null;
                  }
                }
              } else {
                if (param0.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (~var4 > ~(-1 + var2_int)) {
                      L4: {
                        var5 = param0.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L5;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_21_0;
                          break L4;
                        } else {
                          L6: {
                            if (34 != var5) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_25_0 = va.field_H;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_11_0 = va.field_H;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("ka.B(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L7;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L7;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + -10 + ')');
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
                        field_l = null;
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ka.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(byte param0) {
        od.b(128, 4);
    }

    final static String a(long param0, int param1) {
        ne.field_b.setTime(new Date(param0));
        int var3 = ne.field_b.get(7);
        int var4 = ne.field_b.get(5);
        int var5 = ne.field_b.get(2);
        int var6 = ne.field_b.get(1);
        int var7 = ne.field_b.get(11);
        int var8 = ne.field_b.get(12);
        int var9 = ne.field_b.get(13);
        return sb.field_n[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + nh.field_j[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    ka(int param0, int param1) {
        ((ka) this).field_m = param0;
        ((ka) this).field_k = param1;
    }

    public static void a(int param0) {
        field_l = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[32][5];
        field_l = "You collected <%0> of <%1> powerups";
    }
}
