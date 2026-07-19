/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String stackIn_48_2 = null;
        String[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        String[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        String[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        String stackIn_54_2 = null;
        String stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        String stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        String[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        String[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        String stackOut_53_2 = null;
        String[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        String stackOut_52_2 = null;
        String[] stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String stackOut_47_2 = null;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String stackOut_46_2 = null;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        String stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        String stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        String stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              eh.field_C = param2;
              bh.field_j = true;
              if (-1 != (eh.field_C ^ -1)) {
                if (-2 != (eh.field_C ^ -1)) {
                  if (eh.field_C != 2) {
                    if (eh.field_C == 3) {
                      L2: {
                        if (fa.field_W.field_w) {
                          var3_int = db.a(fp.field_c, um.field_c, ja.field_k, ts.field_K, 3);
                          break L2;
                        } else {
                          var3_int = db.a(fp.field_c, um.field_c, ne.field_n, ts.field_K, 3);
                          break L2;
                        }
                      }
                      var4 = 2 + var3_int;
                      kr.field_f = new String[var4];
                      ss.field_a = new int[var4];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4) {
                          ShatteredPlansClient.field_E = new int[1];
                          var5 = 0;
                          L4: while (true) {
                            if (var3_int <= var5) {
                              kr.field_f[-2 + var4] = "";
                              kr.field_f[-1 + var4] = nf.field_i;
                              ss.field_a[-1 + var4] = 0;
                              ShatteredPlansClient.field_E[0] = 5;
                              break L1;
                            } else {
                              kr.field_f[var5] = ts.field_K[var5];
                              var5++;
                              continue L4;
                            }
                          }
                        } else {
                          ss.field_a[var5] = -1;
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (4 != eh.field_C) {
                        if (-6 == (eh.field_C ^ -1)) {
                          var3_int = db.a(fp.field_c, um.field_c, sc.field_p, ts.field_K, 3);
                          var4 = 3 + var3_int;
                          kr.field_f = new String[var4];
                          ss.field_a = new int[var4];
                          var5 = 0;
                          L5: while (true) {
                            if (var4 <= var5) {
                              ShatteredPlansClient.field_E = new int[2];
                              var5 = 0;
                              L6: while (true) {
                                if (var3_int <= var5) {
                                  kr.field_f[-3 + var4] = "";
                                  kr.field_f[-2 + var4] = qq.field_t;
                                  ss.field_a[var4 - 2] = 0;
                                  ShatteredPlansClient.field_E[0] = 3;
                                  kr.field_f[-1 + var4] = nf.field_i;
                                  ss.field_a[-1 + var4] = 1;
                                  ShatteredPlansClient.field_E[1] = 5;
                                  break L1;
                                } else {
                                  kr.field_f[var5] = ts.field_K[var5];
                                  var5++;
                                  continue L6;
                                }
                              }
                            } else {
                              ss.field_a[var5] = -1;
                              var5++;
                              continue L5;
                            }
                          }
                        } else {
                          throw new IllegalArgumentException();
                        }
                      } else {
                        var3_int = db.a(fp.field_c, um.field_c, lp.field_z, ts.field_K, 3);
                        var4 = var3_int + 2;
                        kr.field_f = new String[var4];
                        ss.field_a = new int[var4];
                        var5 = 0;
                        L7: while (true) {
                          if (var4 <= var5) {
                            ShatteredPlansClient.field_E = new int[1];
                            var5 = 0;
                            L8: while (true) {
                              if (var3_int <= var5) {
                                kr.field_f[var4 + -2] = "";
                                kr.field_f[-1 + var4] = nf.field_i;
                                ss.field_a[-1 + var4] = 0;
                                ShatteredPlansClient.field_E[0] = 5;
                                break L1;
                              } else {
                                kr.field_f[var5] = ts.field_K[var5];
                                var5++;
                                continue L8;
                              }
                            }
                          } else {
                            ss.field_a[var5] = -1;
                            var5++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = db.a(fp.field_c, um.field_c, re.a(vs.field_f, 4371, new String[]{"<br><%0><br>"}), ts.field_K, 3);
                    var4 = -1;
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        if (var3_int <= var5) {
                          break L10;
                        } else {
                          if (!"<%0>".equals(ts.field_K[var5])) {
                            var5++;
                            continue L9;
                          } else {
                            var4 = var5;
                            break L10;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        kp.field_o = new String[var4];
                        ps.a(ts.field_K, 0, kp.field_o, 0, var4);
                        kd.field_b = new String[-1 + (var3_int - var4)];
                        ps.a(ts.field_K, var4 + 1, kd.field_b, 0, var3_int + (-var4 + -1));
                        var4 = -1;
                        var3_int = db.a(fp.field_c, um.field_c, re.a(ln.field_U, 4371, new String[]{"<br><%0><br>"}), ts.field_K, 3);
                        var5 = 0;
                        L11: while (true) {
                          L12: {
                            if (var5 >= var3_int) {
                              break L12;
                            } else {
                              if ("<%0>".equals(ts.field_K[var5])) {
                                var4 = var5;
                                break L12;
                              } else {
                                var5++;
                                continue L11;
                              }
                            }
                          }
                          if (-1 == var4) {
                            throw new IllegalStateException();
                          } else {
                            L13: {
                              el.field_d = new String[var4];
                              ps.a(ts.field_K, 0, el.field_d, 0, var4);
                              hm.field_p = new String[-1 + (var3_int - var4)];
                              ps.a(ts.field_K, var4 - -1, hm.field_p, 0, var3_int - var4 - 1);
                              if (kp.field_o.length >= el.field_d.length) {
                                stackOut_36_0 = kp.field_o.length;
                                stackIn_37_0 = stackOut_36_0;
                                break L13;
                              } else {
                                stackOut_35_0 = el.field_d.length;
                                stackIn_37_0 = stackOut_35_0;
                                break L13;
                              }
                            }
                            L14: {
                              var5 = stackIn_37_0;
                              if (hm.field_p.length > kd.field_b.length) {
                                stackOut_39_0 = hm.field_p.length;
                                stackIn_40_0 = stackOut_39_0;
                                break L14;
                              } else {
                                stackOut_38_0 = kd.field_b.length;
                                stackIn_40_0 = stackOut_38_0;
                                break L14;
                              }
                            }
                            var6 = stackIn_40_0;
                            var7 = var6 + var5 + 7;
                            kr.field_f = new String[var7];
                            ss.field_a = new int[var7];
                            var8 = 0;
                            L15: while (true) {
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
                                L16: while (true) {
                                  if (var8 >= var5) {
                                    kr.field_f[var5 + 6] = null;
                                    ss.field_a[6 + var5] = -2;
                                    var8 = 0;
                                    L17: while (true) {
                                      if (var6 <= var8) {
                                        br.field_p = pr.a(14274);
                                        break L1;
                                      } else {
                                        L18: {
                                          stackOut_51_0 = kr.field_f;
                                          stackOut_51_1 = 7 - (-var5 - var8);
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_53_1 = stackOut_51_1;
                                          stackIn_52_0 = stackOut_51_0;
                                          stackIn_52_1 = stackOut_51_1;
                                          if (var8 < hm.field_p.length) {
                                            stackOut_53_0 = (String[]) ((Object) stackIn_53_0);
                                            stackOut_53_1 = stackIn_53_1;
                                            stackOut_53_2 = hm.field_p[var8];
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            stackIn_54_2 = stackOut_53_2;
                                            break L18;
                                          } else {
                                            stackOut_52_0 = (String[]) ((Object) stackIn_52_0);
                                            stackOut_52_1 = stackIn_52_1;
                                            stackOut_52_2 = "";
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_54_1 = stackOut_52_1;
                                            stackIn_54_2 = stackOut_52_2;
                                            break L18;
                                          }
                                        }
                                        stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                                        var8++;
                                        continue L17;
                                      }
                                    }
                                  } else {
                                    L19: {
                                      stackOut_45_0 = kr.field_f;
                                      stackOut_45_1 = var8 + 6;
                                      stackIn_47_0 = stackOut_45_0;
                                      stackIn_47_1 = stackOut_45_1;
                                      stackIn_46_0 = stackOut_45_0;
                                      stackIn_46_1 = stackOut_45_1;
                                      if (0 > el.field_d.length + var8 - var5) {
                                        stackOut_47_0 = (String[]) ((Object) stackIn_47_0);
                                        stackOut_47_1 = stackIn_47_1;
                                        stackOut_47_2 = "";
                                        stackIn_48_0 = stackOut_47_0;
                                        stackIn_48_1 = stackOut_47_1;
                                        stackIn_48_2 = stackOut_47_2;
                                        break L19;
                                      } else {
                                        stackOut_46_0 = (String[]) ((Object) stackIn_46_0);
                                        stackOut_46_1 = stackIn_46_1;
                                        stackOut_46_2 = el.field_d[var8 - (-el.field_d.length + var5)];
                                        stackIn_48_0 = stackOut_46_0;
                                        stackIn_48_1 = stackOut_46_1;
                                        stackIn_48_2 = stackOut_46_2;
                                        break L19;
                                      }
                                    }
                                    stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                    var8++;
                                    continue L16;
                                  }
                                }
                              } else {
                                ss.field_a[var8] = -1;
                                var8++;
                                continue L15;
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
                  var3_int = db.a(fp.field_c, um.field_c, hl.field_D, ts.field_K, 3);
                  var4 = 2 - -var3_int;
                  kr.field_f = new String[var4];
                  ss.field_a = new int[var4];
                  var5 = 0;
                  L20: while (true) {
                    if (var4 <= var5) {
                      ShatteredPlansClient.field_E = new int[1];
                      var5 = 0;
                      L21: while (true) {
                        if (var5 >= var3_int) {
                          kr.field_f[var4 + -2] = "";
                          kr.field_f[-1 + var4] = nf.field_i;
                          ss.field_a[var4 + -1] = 0;
                          ShatteredPlansClient.field_E[0] = 5;
                          break L1;
                        } else {
                          kr.field_f[var5] = ts.field_K[var5];
                          var5++;
                          continue L21;
                        }
                      }
                    } else {
                      ss.field_a[var5] = -1;
                      var5++;
                      continue L20;
                    }
                  }
                }
              } else {
                var3_int = db.a(fp.field_c, um.field_c, hl.field_D, ts.field_K, 3);
                var4 = 3 - -var3_int;
                kr.field_f = new String[var4];
                ss.field_a = new int[var4];
                var5 = 0;
                L22: while (true) {
                  if (var5 >= var4) {
                    ShatteredPlansClient.field_E = new int[2];
                    var5 = 0;
                    L23: while (true) {
                      if (var3_int <= var5) {
                        kr.field_f[-3 + var4] = "";
                        kr.field_f[-2 + var4] = jm.field_s;
                        ss.field_a[var4 - 2] = 0;
                        ShatteredPlansClient.field_E[0] = 4;
                        kr.field_f[var4 - 1] = nf.field_i;
                        ss.field_a[var4 + -1] = 1;
                        ShatteredPlansClient.field_E[1] = 5;
                        break L1;
                      } else {
                        kr.field_f[var5] = ts.field_K[var5];
                        var5++;
                        continue L23;
                      }
                    }
                  } else {
                    ss.field_a[var5] = -1;
                    var5++;
                    continue L22;
                  }
                }
              }
            }
            dc.field_l.field_b = ShatteredPlansClient.field_E.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (kr.field_f.length <= var4) {
                L25: {
                  if ((eh.field_C ^ -1) == -3) {
                    var11 = kp.field_o;
                    var5 = 0;
                    L26: while (true) {
                      if (var11.length <= var5) {
                        var12 = kd.field_b;
                        var5 = 0;
                        L27: while (true) {
                          if (var5 >= var12.length) {
                            break L25;
                          } else {
                            var14 = var12[var5];
                            var7 = vm.a(var14, 0, false);
                            if (var7 > var3_int) {
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
                        var13 = var11[var5];
                        var7 = vm.a(var13, 0, false);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                mr.field_a = (sm.field_b + ar.field_i << -331333599) * dc.field_l.field_b;
                db.field_f = cn.field_w + -(var3_int >> -512111583);
                ho.field_a = -(var3_int >> 1958827745) + (var3_int + cn.field_w);
                var4 = 0;
                L28: while (true) {
                  if (var4 >= kr.field_f.length) {
                    uq.field_k = dm.field_i - (mr.field_a >> 1182693313);
                    m.field_w = new int[kr.field_f.length][];
                    var4 = 0;
                    var5 = -123 / ((-15 - param1) / 55);
                    var6 = uq.field_k;
                    L29: while (true) {
                      if (var4 >= kr.field_f.length) {
                        L30: {
                          if (2 == eh.field_C) {
                            dc.field_l.a(-1, -1, param0, 99);
                            break L30;
                          } else {
                            dc.field_l.a(kq.a(pd.field_k, bb.field_b, 16777215), 0, param0, -58);
                            break L30;
                          }
                        }
                        break L0;
                      } else {
                        L31: {
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
                            break L31;
                          } else {
                            var6 = var6 + e.field_d;
                            break L31;
                          }
                        }
                        var4++;
                        continue L29;
                      }
                    }
                  } else {
                    L32: {
                      stackOut_106_0 = mr.field_a;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_107_0 = stackOut_106_0;
                      if (0 > ss.field_a[var4]) {
                        stackOut_108_0 = stackIn_108_0;
                        stackOut_108_1 = e.field_d;
                        stackIn_109_0 = stackOut_108_0;
                        stackIn_109_1 = stackOut_108_1;
                        break L32;
                      } else {
                        stackOut_107_0 = stackIn_107_0;
                        stackOut_107_1 = id.field_b;
                        stackIn_109_0 = stackOut_107_0;
                        stackIn_109_1 = stackOut_107_1;
                        break L32;
                      }
                    }
                    mr.field_a = stackIn_109_0 + stackIn_109_1;
                    var4++;
                    continue L28;
                  }
                }
              } else {
                L33: {
                  stackOut_86_0 = kr.field_f[var4];
                  stackOut_86_1 = 0;
                  stackIn_88_0 = stackOut_86_0;
                  stackIn_88_1 = stackOut_86_1;
                  stackIn_87_0 = stackOut_86_0;
                  stackIn_87_1 = stackOut_86_1;
                  if (ss.field_a[var4] < 0) {
                    stackOut_88_0 = (String) ((Object) stackIn_88_0);
                    stackOut_88_1 = stackIn_88_1;
                    stackOut_88_2 = 0;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    stackIn_89_2 = stackOut_88_2;
                    break L33;
                  } else {
                    stackOut_87_0 = (String) ((Object) stackIn_87_0);
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = 1;
                    stackIn_89_0 = stackOut_87_0;
                    stackIn_89_1 = stackOut_87_1;
                    stackIn_89_2 = stackOut_87_2;
                    break L33;
                  }
                }
                var5 = vm.a(stackIn_89_0, stackIn_89_1, stackIn_89_2 != 0);
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
          throw r.a((Throwable) ((Object) var3), "gm.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        cg.field_F = param1;
        if (param0 <= 48) {
            return;
        }
        try {
            qj.a((byte) -127, 12);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "gm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        this.field_h = param1;
        this.field_p.e(128 + tf.field_p * param1 >> -948593976);
        int var3 = 85 % ((param0 - 59) / 59);
    }

    gm(al param0, oh param1) {
        try {
            this.field_p = param0;
            this.field_h = param0.i();
            this.field_n = param1;
            this.field_p.e(128 + this.field_h * tf.field_p >> 387701576);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Friends";
        field_k = new int[]{8372223, 8380207, 16744192, 16711935};
        field_j = "Game full";
    }
}
