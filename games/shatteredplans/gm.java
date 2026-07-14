/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class gm extends oh {
    static String[] field_l;
    static qr field_m;
    int field_h;
    al field_p;
    static String field_o;
    static int[] field_k;
    static int field_i;
    static String field_j;
    oh field_n;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String[] var12 = null;
        String var13 = null;
        String var14 = null;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        String[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_47_2 = null;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        String[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        String[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        String stackIn_53_2 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        String[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        String[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        String stackOut_52_2 = null;
        String[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        String stackOut_51_2 = null;
        String[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String stackOut_45_2 = null;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          eh.field_C = param2;
          bh.field_j = true;
          if (-1 != (eh.field_C ^ -1)) {
            if (-2 != (eh.field_C ^ -1)) {
              if (eh.field_C != 2) {
                if (eh.field_C == 3) {
                  L1: {
                    if (fa.field_W.field_w) {
                      var3 = db.a(fp.field_c, um.field_c, ja.field_k, ts.field_K, 3);
                      break L1;
                    } else {
                      var3 = db.a(fp.field_c, um.field_c, ne.field_n, ts.field_K, 3);
                      break L1;
                    }
                  }
                  var4 = 2 + var3;
                  kr.field_f = new String[var4];
                  ss.field_a = new int[var4];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4) {
                      ShatteredPlansClient.field_E = new int[1];
                      var5 = 0;
                      L3: while (true) {
                        if (var3 <= var5) {
                          kr.field_f[-2 + var4] = "";
                          kr.field_f[-1 + var4] = nf.field_i;
                          ss.field_a[-1 + var4] = 0;
                          ShatteredPlansClient.field_E[0] = 5;
                          break L0;
                        } else {
                          kr.field_f[var5] = ts.field_K[var5];
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      ss.field_a[var5] = -1;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  if (4 != eh.field_C) {
                    if (-6 == (eh.field_C ^ -1)) {
                      var3 = db.a(fp.field_c, um.field_c, sc.field_p, ts.field_K, 3);
                      var4 = 3 + var3;
                      kr.field_f = new String[var4];
                      ss.field_a = new int[var4];
                      var5 = 0;
                      L4: while (true) {
                        if (var4 <= var5) {
                          ShatteredPlansClient.field_E = new int[2];
                          var5 = 0;
                          L5: while (true) {
                            if (var3 <= var5) {
                              kr.field_f[-3 + var4] = "";
                              kr.field_f[-2 + var4] = qq.field_t;
                              ss.field_a[var4 - 2] = 0;
                              ShatteredPlansClient.field_E[0] = 3;
                              kr.field_f[-1 + var4] = nf.field_i;
                              ss.field_a[-1 + var4] = 1;
                              ShatteredPlansClient.field_E[1] = 5;
                              break L0;
                            } else {
                              kr.field_f[var5] = ts.field_K[var5];
                              var5++;
                              continue L5;
                            }
                          }
                        } else {
                          ss.field_a[var5] = -1;
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      throw new IllegalArgumentException();
                    }
                  } else {
                    var3 = db.a(fp.field_c, um.field_c, lp.field_z, ts.field_K, 3);
                    var4 = var3 + 2;
                    kr.field_f = new String[var4];
                    ss.field_a = new int[var4];
                    var5 = 0;
                    L6: while (true) {
                      if (var4 <= var5) {
                        ShatteredPlansClient.field_E = new int[1];
                        var5 = 0;
                        L7: while (true) {
                          if (var3 <= var5) {
                            kr.field_f[var4 + -2] = "";
                            kr.field_f[-1 + var4] = nf.field_i;
                            ss.field_a[-1 + var4] = 0;
                            ShatteredPlansClient.field_E[0] = 5;
                            break L0;
                          } else {
                            kr.field_f[var5] = ts.field_K[var5];
                            var5++;
                            continue L7;
                          }
                        }
                      } else {
                        ss.field_a[var5] = -1;
                        var5++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                var3 = db.a(fp.field_c, um.field_c, re.a(vs.field_f, 4371, new String[1]), ts.field_K, 3);
                var4 = -1;
                var5 = 0;
                L8: while (true) {
                  L9: {
                    if (var3 <= var5) {
                      break L9;
                    } else {
                      if (!"<%0>".equals((Object) (Object) ts.field_K[var5])) {
                        var5++;
                        continue L8;
                      } else {
                        var4 = var5;
                        break L9;
                      }
                    }
                  }
                  if (0 != (var4 ^ -1)) {
                    kp.field_o = new String[var4];
                    ps.a((Object[]) (Object) ts.field_K, 0, (Object[]) (Object) kp.field_o, 0, var4);
                    kd.field_b = new String[-1 + (var3 - var4)];
                    ps.a((Object[]) (Object) ts.field_K, var4 + 1, (Object[]) (Object) kd.field_b, 0, var3 + (-var4 + -1));
                    var4 = -1;
                    var3 = db.a(fp.field_c, um.field_c, re.a(ln.field_U, 4371, new String[1]), ts.field_K, 3);
                    var5 = 0;
                    L10: while (true) {
                      L11: {
                        if (var5 >= var3) {
                          break L11;
                        } else {
                          if ("<%0>".equals((Object) (Object) ts.field_K[var5])) {
                            var4 = var5;
                            break L11;
                          } else {
                            var5++;
                            continue L10;
                          }
                        }
                      }
                      if (-1 == var4) {
                        throw new IllegalStateException();
                      } else {
                        L12: {
                          el.field_d = new String[var4];
                          ps.a((Object[]) (Object) ts.field_K, 0, (Object[]) (Object) el.field_d, 0, var4);
                          hm.field_p = new String[-1 + (var3 - var4)];
                          ps.a((Object[]) (Object) ts.field_K, var4 - -1, (Object[]) (Object) hm.field_p, 0, var3 - var4 - 1);
                          if (kp.field_o.length >= el.field_d.length) {
                            stackOut_35_0 = kp.field_o.length;
                            stackIn_36_0 = stackOut_35_0;
                            break L12;
                          } else {
                            stackOut_34_0 = el.field_d.length;
                            stackIn_36_0 = stackOut_34_0;
                            break L12;
                          }
                        }
                        L13: {
                          var5 = stackIn_36_0;
                          if (hm.field_p.length > kd.field_b.length) {
                            stackOut_38_0 = hm.field_p.length;
                            stackIn_39_0 = stackOut_38_0;
                            break L13;
                          } else {
                            stackOut_37_0 = kd.field_b.length;
                            stackIn_39_0 = stackOut_37_0;
                            break L13;
                          }
                        }
                        var6 = stackIn_39_0;
                        var7 = var6 + var5 + 7;
                        kr.field_f = new String[var7];
                        ss.field_a = new int[var7];
                        var8 = 0;
                        L14: while (true) {
                          if (var8 >= var7) {
                            ShatteredPlansClient.field_E = new int[2];
                            kr.field_f[0] = wp.field_b;
                            ss.field_a[1] = 0;
                            kr.field_f[1] = pa.field_h;
                            kr.field_f[2] = ld.field_i;
                            ss.field_a[3] = 1;
                            kr.field_f[5] = "";
                            ShatteredPlansClient.field_E[1] = 2;
                            ShatteredPlansClient.field_E[0] = 5;
                            kr.field_f[3] = dd.field_a;
                            kr.field_f[4] = ge.field_m;
                            var8 = 0;
                            L15: while (true) {
                              if (var8 >= var5) {
                                kr.field_f[var5 + 6] = null;
                                ss.field_a[6 + var5] = -2;
                                var8 = 0;
                                L16: while (true) {
                                  if (var6 <= var8) {
                                    br.field_p = pr.a(14274);
                                    break L0;
                                  } else {
                                    L17: {
                                      stackOut_50_0 = kr.field_f;
                                      stackOut_50_1 = 7 - (-var5 - var8);
                                      stackIn_52_0 = stackOut_50_0;
                                      stackIn_52_1 = stackOut_50_1;
                                      stackIn_51_0 = stackOut_50_0;
                                      stackIn_51_1 = stackOut_50_1;
                                      if (var8 < hm.field_p.length) {
                                        stackOut_52_0 = (String[]) (Object) stackIn_52_0;
                                        stackOut_52_1 = stackIn_52_1;
                                        stackOut_52_2 = hm.field_p[var8];
                                        stackIn_53_0 = stackOut_52_0;
                                        stackIn_53_1 = stackOut_52_1;
                                        stackIn_53_2 = stackOut_52_2;
                                        break L17;
                                      } else {
                                        stackOut_51_0 = (String[]) (Object) stackIn_51_0;
                                        stackOut_51_1 = stackIn_51_1;
                                        stackOut_51_2 = "";
                                        stackIn_53_0 = stackOut_51_0;
                                        stackIn_53_1 = stackOut_51_1;
                                        stackIn_53_2 = stackOut_51_2;
                                        break L17;
                                      }
                                    }
                                    stackIn_53_0[stackIn_53_1] = stackIn_53_2;
                                    var8++;
                                    continue L16;
                                  }
                                }
                              } else {
                                L18: {
                                  stackOut_44_0 = kr.field_f;
                                  stackOut_44_1 = var8 + 6;
                                  stackIn_46_0 = stackOut_44_0;
                                  stackIn_46_1 = stackOut_44_1;
                                  stackIn_45_0 = stackOut_44_0;
                                  stackIn_45_1 = stackOut_44_1;
                                  if (0 > el.field_d.length + var8 - var5) {
                                    stackOut_46_0 = (String[]) (Object) stackIn_46_0;
                                    stackOut_46_1 = stackIn_46_1;
                                    stackOut_46_2 = "";
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    stackIn_47_2 = stackOut_46_2;
                                    break L18;
                                  } else {
                                    stackOut_45_0 = (String[]) (Object) stackIn_45_0;
                                    stackOut_45_1 = stackIn_45_1;
                                    stackOut_45_2 = el.field_d[var8 - (-el.field_d.length + var5)];
                                    stackIn_47_0 = stackOut_45_0;
                                    stackIn_47_1 = stackOut_45_1;
                                    stackIn_47_2 = stackOut_45_2;
                                    break L18;
                                  }
                                }
                                stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                                var8++;
                                continue L15;
                              }
                            }
                          } else {
                            ss.field_a[var8] = -1;
                            var8++;
                            continue L14;
                          }
                        }
                      }
                    }
                  } else {
                    throw new IllegalStateException();
                  }
                }
              }
            } else {
              var3 = db.a(fp.field_c, um.field_c, hl.field_D, ts.field_K, 3);
              var4 = 2 - -var3;
              kr.field_f = new String[var4];
              ss.field_a = new int[var4];
              var5 = 0;
              L19: while (true) {
                if (var4 <= var5) {
                  ShatteredPlansClient.field_E = new int[1];
                  var5 = 0;
                  L20: while (true) {
                    if (var5 >= var3) {
                      kr.field_f[var4 + -2] = "";
                      kr.field_f[-1 + var4] = nf.field_i;
                      ss.field_a[var4 + -1] = 0;
                      ShatteredPlansClient.field_E[0] = 5;
                      break L0;
                    } else {
                      kr.field_f[var5] = ts.field_K[var5];
                      var5++;
                      continue L20;
                    }
                  }
                } else {
                  ss.field_a[var5] = -1;
                  var5++;
                  continue L19;
                }
              }
            }
          } else {
            var3 = db.a(fp.field_c, um.field_c, hl.field_D, ts.field_K, 3);
            var4 = 3 - -var3;
            kr.field_f = new String[var4];
            ss.field_a = new int[var4];
            var5 = 0;
            L21: while (true) {
              if (var5 >= var4) {
                ShatteredPlansClient.field_E = new int[2];
                var5 = 0;
                L22: while (true) {
                  if (var3 <= var5) {
                    kr.field_f[-3 + var4] = "";
                    kr.field_f[-2 + var4] = jm.field_s;
                    ss.field_a[var4 - 2] = 0;
                    ShatteredPlansClient.field_E[0] = 4;
                    kr.field_f[var4 - 1] = nf.field_i;
                    ss.field_a[var4 + -1] = 1;
                    ShatteredPlansClient.field_E[1] = 5;
                    break L0;
                  } else {
                    kr.field_f[var5] = ts.field_K[var5];
                    var5++;
                    continue L22;
                  }
                }
              } else {
                ss.field_a[var5] = -1;
                var5++;
                continue L21;
              }
            }
          }
        }
        dc.field_l.field_b = ShatteredPlansClient.field_E.length;
        var3 = 0;
        var4 = 0;
        L23: while (true) {
          if (kr.field_f.length <= var4) {
            L24: {
              if ((eh.field_C ^ -1) == -3) {
                var11 = kp.field_o;
                var5 = 0;
                L25: while (true) {
                  if (var11.length <= var5) {
                    var12 = kd.field_b;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var12.length) {
                        break L24;
                      } else {
                        var14 = var12[var5];
                        var7 = vm.a(var14, 0, false);
                        if (var7 > var3) {
                          var3 = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    var13 = var11[var5];
                    var7 = vm.a(var13, 0, false);
                    if (var7 > var3) {
                      var3 = var7;
                      var5++;
                      continue L25;
                    } else {
                      var5++;
                      continue L25;
                    }
                  }
                }
              } else {
                break L24;
              }
            }
            mr.field_a = (sm.field_b + ar.field_i << -331333599) * dc.field_l.field_b;
            db.field_f = cn.field_w + -(var3 >> -512111583);
            ho.field_a = -(var3 >> 1958827745) + (var3 + cn.field_w);
            var4 = 0;
            L27: while (true) {
              if (var4 >= kr.field_f.length) {
                uq.field_k = dm.field_i - (mr.field_a >> 1182693313);
                m.field_w = new int[kr.field_f.length][];
                var4 = 0;
                var5 = -123 / ((-15 - param1) / 55);
                var6 = uq.field_k;
                L28: while (true) {
                  if (var4 >= kr.field_f.length) {
                    L29: {
                      if (2 == eh.field_C) {
                        dc.field_l.a(-1, -1, param0, 99);
                        break L29;
                      } else {
                        dc.field_l.a(kq.a(pd.field_k, bb.field_b, 16777215), 0, param0, -58);
                        break L29;
                      }
                    }
                    return;
                  } else {
                    var7 = ss.field_a[var4];
                    if (-1 >= (var7 ^ -1)) {
                      var8 = vm.a(kr.field_f[var4], 0, true);
                      var9 = cn.field_w + -(var8 >> -2103187423);
                      var6 = var6 + sm.field_b;
                      m.field_w[var4] = new int[4];
                      m.field_w[var4][0] = var9 + -tr.field_Lb;
                      m.field_w[var4][1] = var6;
                      m.field_w[var4][2] = var8 - -(tr.field_Lb << -2040748639);
                      var6 = var6 + (id.field_b + ((ar.field_i << 205268257) - -sm.field_b));
                      m.field_w[var4][3] = (ar.field_i << -1975505471) + id.field_b;
                      var4++;
                      continue L28;
                    } else {
                      var6 = var6 + e.field_d;
                      var4++;
                      continue L28;
                    }
                  }
                }
              } else {
                L30: {
                  stackOut_105_0 = mr.field_a;
                  stackIn_107_0 = stackOut_105_0;
                  stackIn_106_0 = stackOut_105_0;
                  if (0 > ss.field_a[var4]) {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = e.field_d;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L30;
                  } else {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = id.field_b;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    break L30;
                  }
                }
                mr.field_a = stackIn_108_0 + stackIn_108_1;
                var4++;
                continue L27;
              }
            }
          } else {
            L31: {
              stackOut_85_0 = kr.field_f[var4];
              stackOut_85_1 = 0;
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              if (ss.field_a[var4] < 0) {
                stackOut_87_0 = (String) (Object) stackIn_87_0;
                stackOut_87_1 = stackIn_87_1;
                stackOut_87_2 = 0;
                stackIn_88_0 = stackOut_87_0;
                stackIn_88_1 = stackOut_87_1;
                stackIn_88_2 = stackOut_87_2;
                break L31;
              } else {
                stackOut_86_0 = (String) (Object) stackIn_86_0;
                stackOut_86_1 = stackIn_86_1;
                stackOut_86_2 = 1;
                stackIn_88_0 = stackOut_86_0;
                stackIn_88_1 = stackOut_86_1;
                stackIn_88_2 = stackOut_86_2;
                break L31;
              }
            }
            var5 = vm.a(stackIn_88_0, stackIn_88_1, stackIn_88_2 != 0);
            if (var3 < var5) {
              var3 = var5;
              var4++;
              continue L23;
            } else {
              var4++;
              continue L23;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        cg.field_F = param1;
        if (param0 <= 48) {
            return;
        }
        qj.a((byte) -127, 12);
    }

    public static void a(byte param0) {
        field_k = null;
        field_o = null;
        if (param0 >= -100) {
            return;
        }
        field_j = null;
        field_l = null;
        field_m = null;
    }

    final void a(byte param0, int param1) {
        ((gm) this).field_h = param1;
        ((gm) this).field_p.e(128 + tf.field_p * param1 >> -948593976);
        int var3 = 85 % ((param0 - 59) / 59);
    }

    gm(al param0, oh param1) {
        ((gm) this).field_p = param0;
        ((gm) this).field_h = param0.i();
        ((gm) this).field_n = param1;
        ((gm) this).field_p.e(128 + ((gm) this).field_h * tf.field_p >> 387701576);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends";
        field_k = new int[]{8372223, 8380207, 16744192, 16711935};
        field_j = "Game full";
    }
}
