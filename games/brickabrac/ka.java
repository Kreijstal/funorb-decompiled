/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends nm {
    int field_x;
    int field_r;
    int field_s;
    int field_z;
    static tq field_l;
    static jp field_n;
    int field_o;
    static String field_C;
    jm field_G;
    int field_A;
    int field_q;
    int field_B;
    pq field_k;
    int field_p;
    kl field_y;
    int field_v;
    int field_D;
    int field_w;
    int field_t;
    int field_i;
    static int field_E;
    int field_m;
    oe field_F;
    int field_j;
    int field_u;

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              go.field_e = go.field_e + 1;
              if (-1 != oo.field_v) {
                break L1;
              } else {
                if (ll.field_b != -1) {
                  break L1;
                } else {
                  oo.field_v = pq.field_k;
                  ll.field_b = po.field_a;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 == null) {
                  if (null != vq.field_J) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (param0.equals((Object) (Object) vq.field_J)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (th.field_h) {
                    break L5;
                  } else {
                    if (~go.field_e > ~ue.field_e) {
                      break L5;
                    } else {
                      if (ue.field_e + jh.field_a <= go.field_e) {
                        break L5;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_28_0 = stackOut_25_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L4;
              }
              L6: {
                L7: {
                  var2_int = stackIn_28_0;
                  if (param0 == null) {
                    break L7;
                  } else {
                    L8: {
                      if (th.field_h) {
                        break L8;
                      } else {
                        if (var2_int == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    go.field_e = ue.field_e;
                    if (var3 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                go.field_e = 0;
                break L6;
              }
              L9: {
                L10: {
                  ad.field_j = ll.field_b;
                  if (null != param0) {
                    break L10;
                  } else {
                    if (var2_int != 0) {
                      th.field_h = true;
                      if (var3 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                th.field_h = false;
                break L9;
              }
              b.field_a = oo.field_v;
              break L2;
            }
            L11: {
              vq.field_J = param0;
              if (th.field_h) {
                break L11;
              } else {
                if (go.field_e >= ue.field_e) {
                  break L11;
                } else {
                  if (kb.field_Xb) {
                    b.field_a = oo.field_v;
                    go.field_e = 0;
                    ad.field_j = ll.field_b;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
            L12: {
              if (!th.field_h) {
                break L12;
              } else {
                if (go.field_e == ol.field_y) {
                  th.field_h = false;
                  go.field_e = 0;
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            ll.field_b = -1;
            oo.field_v = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var2;
            stackOut_69_1 = new StringBuilder().append("ka.G(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L13;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L13;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + 22546 + 41);
        }
    }

    final static void a(boolean param0, mm param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vl var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object var12 = null;
        id var13 = null;
        int var14 = 0;
        mh var15 = null;
        mh var16 = null;
        mh var17 = null;
        mh var18 = null;
        mh var19 = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        String var24 = null;
        int var24_int = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26_int = 0;
        Object var26 = null;
        int var27 = 0;
        int var28_int = 0;
        String var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31_int = 0;
        String var31 = null;
        int var32 = 0;
        mm stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        boolean stackIn_48_5 = false;
        mm stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        boolean stackIn_49_5 = false;
        mm stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_50_3 = 0;
        int stackIn_50_4 = 0;
        boolean stackIn_50_5 = false;
        int stackIn_50_6 = 0;
        int stackIn_66_0 = 0;
        mh stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        mh stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        mh stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        mm stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        boolean stackOut_47_5 = false;
        mm stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        int stackOut_49_4 = 0;
        boolean stackOut_49_5 = false;
        int stackOut_49_6 = 0;
        mm stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        boolean stackOut_48_5 = false;
        int stackOut_48_6 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        mh stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        mh stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        mh stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        L0: {
          L1: {
            var32 = BrickABrac.field_J ? 1 : 0;
            var5_int = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            if (o.field_e == null) {
              break L1;
            } else {
              L2: {
                if (null != vl.field_a) {
                  break L2;
                } else {
                  if (null != bl.field_F) {
                    break L2;
                  } else {
                    if (null != ld.field_v) {
                      break L2;
                    } else {
                      if (null == me.field_e) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var9 = 0;
              L3: while (true) {
                if (var9 >= cq.field_p) {
                  break L1;
                } else {
                  var10_int = 255 & o.field_e.field_Tb[var9];
                  if (var32 != 0) {
                    break L0;
                  } else {
                    L4: {
                      if (null == vl.field_a) {
                        break L4;
                      } else {
                        if (null != vl.field_a[var9]) {
                          if (!vl.field_a[var9][var10_int]) {
                            break L4;
                          } else {
                            var5_int = 1;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (bl.field_F == null) {
                        break L5;
                      } else {
                        if (bl.field_F[var9] == null) {
                          break L5;
                        } else {
                          L6: {
                            var11 = bl.field_F[var9][var10_int];
                            if (var11 == 0) {
                              break L6;
                            } else {
                              if (!ea.field_g) {
                                var5_int = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var11 > var6) {
                            var6 = var11;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L7: {
                      if (null == me.field_e) {
                        break L7;
                      } else {
                        if (null == me.field_e[var9]) {
                          break L7;
                        } else {
                          var8 = var8 | me.field_e[var9][var10_int];
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (null == ld.field_v) {
                        break L8;
                      } else {
                        if (ld.field_v[var9] != null) {
                          L9: {
                            var11 = ld.field_v[var9][var10_int];
                            if (var11 == 0) {
                              break L9;
                            } else {
                              if (!ea.field_g) {
                                var5_int = 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var11 > var7) {
                            var7 = var11;
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    var9++;
                    if (var32 == 0) {
                      continue L3;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L10: {
            stackOut_47_0 = (mm) param1;
            stackOut_47_1 = 2;
            stackOut_47_2 = param3 * 4 * (2 + np.field_a);
            stackOut_47_3 = np.field_a * 2 - -4;
            stackOut_47_4 = 22676;
            stackOut_47_5 = param0;
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_49_2 = stackOut_47_2;
            stackIn_49_3 = stackOut_47_3;
            stackIn_49_4 = stackOut_47_4;
            stackIn_49_5 = stackOut_47_5;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            stackIn_48_2 = stackOut_47_2;
            stackIn_48_3 = stackOut_47_3;
            stackIn_48_4 = stackOut_47_4;
            stackIn_48_5 = stackOut_47_5;
            if (param1 != o.field_b) {
              stackOut_49_0 = (mm) (Object) stackIn_49_0;
              stackOut_49_1 = stackIn_49_1;
              stackOut_49_2 = stackIn_49_2;
              stackOut_49_3 = stackIn_49_3;
              stackOut_49_4 = stackIn_49_4;
              stackOut_49_5 = stackIn_49_5;
              stackOut_49_6 = 0;
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              stackIn_50_3 = stackOut_49_3;
              stackIn_50_4 = stackOut_49_4;
              stackIn_50_5 = stackOut_49_5;
              stackIn_50_6 = stackOut_49_6;
              break L10;
            } else {
              stackOut_48_0 = (mm) (Object) stackIn_48_0;
              stackOut_48_1 = stackIn_48_1;
              stackOut_48_2 = stackIn_48_2;
              stackOut_48_3 = stackIn_48_3;
              stackOut_48_4 = stackIn_48_4;
              stackOut_48_5 = stackIn_48_5;
              stackOut_48_6 = 1;
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              stackIn_50_3 = stackOut_48_3;
              stackIn_50_4 = stackOut_48_4;
              stackIn_50_5 = stackOut_48_5;
              stackIn_50_6 = stackOut_48_6;
              break L10;
            }
          }
          var9 = ((mm) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, stackIn_50_3, stackIn_50_4, stackIn_50_5, stackIn_50_6 != 0) ? 1 : 0;
          break L0;
        }
        var10 = param1.field_Rb.field_bb;
        var11 = 73 % ((param4 - 41) / 57);
        var12 = null;
        var13 = (id) (Object) var10.d(-67);
        L11: while (true) {
          L12: {
            L13: {
              if (null == var13) {
                break L13;
              } else {
                var14 = 0;
                if (var32 != 0) {
                  break L12;
                } else {
                  L14: {
                    if (null != var13.field_bb) {
                      break L14;
                    } else {
                      L15: {
                        var13.field_Rb = new mh(0L, vb.field_K);
                        var13.a(var13.field_Rb, 0);
                        var13.field_dc = new mh(0L, fp.field_v);
                        if (vd.field_e) {
                          var13.a(var13.field_dc, 0);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var13.field_dc.field_S = 2;
                      var13.field_Tb = new mh(0L, ad.field_l);
                      var13.a(var13.field_Tb, 0);
                      var13.c(true);
                      var13.field_Vb = new mh(0L, ok.field_d);
                      var13.a(var13.field_Vb, 0);
                      var13.field_cc = new mh(0L, ee.field_s);
                      var13.a(var13.field_cc, 0);
                      var14 = 1;
                      break L14;
                    }
                  }
                  L16: {
                    var13.field_Rb.field_Mb = null;
                    var15 = var13.field_Rb;
                    var13.field_Rb.field_cb = 0;
                    var15.field_Ib = 0;
                    var13.field_dc.field_Mb = null;
                    var13.field_dc.field_cb = 0;
                    var16 = var13.field_dc;
                    var16.field_Ib = 0;
                    var13.field_Vb.field_Mb = null;
                    var17 = var13.field_Vb;
                    var13.field_Vb.field_cb = 0;
                    var13.field_cc.field_Mb = null;
                    var17.field_Ib = 0;
                    var18 = var13.field_cc;
                    var13.field_cc.field_cb = 0;
                    var18.field_Ib = 0;
                    var13.field_Tb.field_Mb = null;
                    var19 = var13.field_Tb;
                    var13.field_Tb.field_cb = 0;
                    var19.field_Ib = 0;
                    var13.field_Ib = param1.field_Rb.field_Ib;
                    var20 = 0;
                    var21 = var13.field_Yb;
                    var22 = 72;
                    if (param1 != fo.field_b) {
                      break L16;
                    } else {
                      var22 += 42;
                      break L16;
                    }
                  }
                  L17: {
                    var21 = dh.a(var13.field_Rb.field_O, var21, var22);
                    if (var21.equals((Object) (Object) var13.field_Yb)) {
                      stackOut_65_0 = 0;
                      stackIn_66_0 = stackOut_65_0;
                      break L17;
                    } else {
                      stackOut_64_0 = 1;
                      stackIn_66_0 = stackOut_64_0;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var23 = stackIn_66_0;
                      if (4 > var13.field_Zb) {
                        break L19;
                      } else {
                        var21 = "<img=" + (mq.field_g + -4 + var13.field_Zb) + ">" + var21;
                        if (var32 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (0 >= var13.field_Zb) {
                      break L18;
                    } else {
                      var21 = "<img=" + (-1 + var13.field_Zb) + ">" + var21;
                      break L18;
                    }
                  }
                  L20: {
                    var13.field_Rb.field_Mb = var21;
                    if (var13.i(0)) {
                      break L20;
                    } else {
                      L21: {
                        L22: {
                          L23: {
                            var24_int = 16764006;
                            var25_int = 16777215;
                            if (var5_int == 0) {
                              break L23;
                            } else {
                              if (!var13.field_ec) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                          if (~var6 < ~var13.field_Wb) {
                            break L22;
                          } else {
                            if (var7 > var13.field_ac) {
                              break L22;
                            } else {
                              if (0 < (var8 & ~var13.field_Ub)) {
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        var25_int = 8421504;
                        var24_int = 8414771;
                        break L21;
                      }
                      L24: {
                        L25: {
                          var13.field_Rb.field_vb = var25_int;
                          var13.field_Rb.field_Fb = var25_int;
                          var13.field_Rb.field_Y = var25_int;
                          var13.field_Vb.field_X = var24_int;
                          var13.field_dc.field_X = var24_int;
                          var13.field_Rb.field_X = var24_int;
                          var13.field_dc.field_vb = var25_int;
                          var13.field_dc.field_Fb = var25_int;
                          var13.field_dc.field_Y = var25_int;
                          var13.field_Vb.field_vb = var25_int;
                          var13.field_Vb.field_Fb = var25_int;
                          var13.field_Vb.field_Y = var25_int;
                          if (param1 != vp.field_u) {
                            break L25;
                          } else {
                            if (o.field_e.field_Rb) {
                              break L24;
                            } else {
                              var13.field_cc.field_Mb = mj.field_b;
                              if (var32 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L26: {
                          if (var13.field_Qb) {
                            break L26;
                          } else {
                            L27: {
                              if (var13.field_fc) {
                                break L27;
                              } else {
                                var13.field_Vb.field_Mb = ea.field_f;
                                if (var32 == 0) {
                                  break L24;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var13.field_Rb.field_Mb = rd.a(ce.field_g, new String[1], (byte) 103);
                            var13.field_Vb.field_Mb = ip.field_t;
                            var13.field_cc.field_Mb = gq.field_Wb;
                            if (var32 == 0) {
                              break L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                        var13.field_Rb.field_Mb = rd.a(ll.field_a, new String[1], (byte) 103);
                        var13.field_cc.field_Mb = wl.field_L;
                        break L24;
                      }
                      L28: {
                        var26_int = 0;
                        if (null == o.field_e) {
                          break L28;
                        } else {
                          int discarded$5 = 7;
                          if (!hn.b()) {
                            break L28;
                          } else {
                            if (~oc.field_p == ~var13.field_gc) {
                              break L28;
                            } else {
                              L29: {
                                if (null == var13.field_Vb.field_Mb) {
                                  break L29;
                                } else {
                                  var27 = var13.field_Vb.g(123) - -(2 * om.field_oc);
                                  var13.field_Vb.a(np.field_a, var20, var26_int, var27, (byte) 64);
                                  var26_int = var26_int + var27;
                                  break L29;
                                }
                              }
                              if (var13.field_cc.field_Mb != null) {
                                L30: {
                                  L31: {
                                    if (vp.field_u != param1) {
                                      break L31;
                                    } else {
                                      var27 = 40;
                                      if (var32 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  var27 = var13.field_cc.g(99) - -(2 * om.field_oc);
                                  break L30;
                                }
                                var13.field_cc.a(np.field_a, var20, var26_int, var27, (byte) 64);
                                var26_int = var26_int + var27;
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                      }
                      L32: {
                        stackOut_111_0 = var13.field_Rb;
                        stackOut_111_1 = np.field_a;
                        stackOut_111_2 = var20;
                        stackOut_111_3 = var26_int;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_113_1 = stackOut_111_1;
                        stackIn_113_2 = stackOut_111_2;
                        stackIn_113_3 = stackOut_111_3;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        if (vd.field_e) {
                          stackOut_113_0 = (mh) (Object) stackIn_113_0;
                          stackOut_113_1 = stackIn_113_1;
                          stackOut_113_2 = stackIn_113_2;
                          stackOut_113_3 = stackIn_113_3;
                          stackOut_113_4 = 42;
                          stackIn_114_0 = stackOut_113_0;
                          stackIn_114_1 = stackOut_113_1;
                          stackIn_114_2 = stackOut_113_2;
                          stackIn_114_3 = stackOut_113_3;
                          stackIn_114_4 = stackOut_113_4;
                          break L32;
                        } else {
                          stackOut_112_0 = (mh) (Object) stackIn_112_0;
                          stackOut_112_1 = stackIn_112_1;
                          stackOut_112_2 = stackIn_112_2;
                          stackOut_112_3 = stackIn_112_3;
                          stackOut_112_4 = 0;
                          stackIn_114_0 = stackOut_112_0;
                          stackIn_114_1 = stackOut_112_1;
                          stackIn_114_2 = stackOut_112_2;
                          stackIn_114_3 = stackOut_112_3;
                          stackIn_114_4 = stackOut_112_4;
                          break L32;
                        }
                      }
                      L33: {
                        L34: {
                          ((mh) (Object) stackIn_114_0).a(stackIn_114_1, stackIn_114_2, stackIn_114_3, -stackIn_114_4 + var13.field_Ib + -var26_int, (byte) 64);
                          var13.field_dc.field_Mb = Integer.toString(var13.field_Wb);
                          var13.field_dc.a(np.field_a, var20, -40 + var13.field_Ib, 40, (byte) 64);
                          if (!var13.field_Rb.field_kb) {
                            break L34;
                          } else {
                            if (var23 == 0) {
                              break L34;
                            } else {
                              ep.field_e = var13.field_Yb;
                              if (null == wq.field_i) {
                                break L33;
                              } else {
                                if (wq.field_i[var13.field_Zb] != null) {
                                  ep.field_e = ep.field_e + " - " + wq.field_i[var13.field_Zb];
                                  if (var32 == 0) {
                                    break L33;
                                  } else {
                                    break L34;
                                  }
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                        }
                        if (!var13.field_Rb.field_kb) {
                          break L33;
                        } else {
                          if (null == wq.field_i) {
                            break L33;
                          } else {
                            if (wq.field_i[var13.field_Zb] == null) {
                              break L33;
                            } else {
                              ep.field_e = wq.field_i[var13.field_Zb];
                              break L33;
                            }
                          }
                        }
                      }
                      var20 = var20 + np.field_a;
                      break L20;
                    }
                  }
                  L35: {
                    var24 = l.a((byte) -110, var21, var13.field_kc);
                    if (null == var24) {
                      break L35;
                    } else {
                      var25_int = var13.field_Tb.field_O.a(var24, -om.field_oc + var13.field_Ib + -om.field_oc);
                      var13.field_Tb.field_jb = var13.field_ic * 256 / cm.field_o;
                      var13.field_Tb.field_Mb = var24;
                      var13.field_Tb.a(var25_int * np.field_a, var20, om.field_oc, var13.field_Ib + -(2 * om.field_oc), (byte) 64);
                      var20 = var20 + np.field_a * var25_int;
                      break L35;
                    }
                  }
                  L36: {
                    if (var9 == 0) {
                      var13.field_C = var20 - var13.field_cb;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if (var14 != 0) {
                      param1.field_Rb.a((mh) var12, 2, (mh) (Object) var13, 17290);
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  L38: {
                    if (var13.field_L == 0) {
                      break L38;
                    } else {
                      if (var13.i(0)) {
                        break L38;
                      } else {
                        L39: {
                          if (0 != var13.field_Vb.field_L) {
                            break L39;
                          } else {
                            L40: {
                              if (var13.field_cc.field_L == 0) {
                                break L40;
                              } else {
                                int discarded$6 = 1;
                                rf.a(param2, var13.field_gc);
                                if (var32 == 0) {
                                  break L38;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            int discarded$7 = 0;
                            mn.a(0, qo.field_O, var13, param1, (byte) 58, tb.field_fb);
                            if (var32 == 0) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        hd.a(var13.field_gc, 66, param2);
                        break L38;
                      }
                    }
                  }
                  L41: {
                    var12 = (Object) (Object) var13;
                    if (!var13.field_G) {
                      break L41;
                    } else {
                      if (!var13.i(0)) {
                        L42: {
                          var25 = null;
                          if (~var13.field_gc == ~oc.field_p) {
                            L43: {
                              if (var5_int == 0) {
                                break L43;
                              } else {
                                if (!var13.field_ec) {
                                  var25 = (Object) (Object) ug.field_J;
                                  break L42;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            if (var13.field_ac >= var7) {
                              if (var6 > var13.field_Wb) {
                                var25 = (Object) (Object) rd.a(ea.field_h, new String[2], (byte) 103);
                                break L42;
                              } else {
                                if ((var8 & ~var13.field_Ub) != 0) {
                                  L44: {
                                    var26_int = r.a((byte) -82, ~var13.field_Ub & var8);
                                    var25 = (Object) (Object) ao.field_j;
                                    if (var26_int <= 0) {
                                      break L44;
                                    } else {
                                      if (eb.field_p == null) {
                                        break L44;
                                      } else {
                                        if (~var26_int < ~eb.field_p.length) {
                                          break L44;
                                        } else {
                                          if (eb.field_p[var26_int - 1] != null) {
                                            var25 = (Object) (Object) eb.field_p[var26_int - 1][1];
                                            break L44;
                                          } else {
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            } else {
                              L45: {
                                var26_int = -var13.field_ac + var7;
                                if (var26_int == 1) {
                                  var25 = (Object) (Object) hq.field_w;
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                              var25 = (Object) (Object) rd.a(on.field_F, new String[2], (byte) 103);
                              break L42;
                            }
                          } else {
                            L46: {
                              if (var5_int == 0) {
                                break L46;
                              } else {
                                if (var13.field_ec) {
                                  break L46;
                                } else {
                                  var25 = (Object) (Object) rd.a(re.field_f, new String[1], (byte) 103);
                                  break L42;
                                }
                              }
                            }
                            if (var13.field_ac >= var7) {
                              if (~var13.field_Wb > ~var6) {
                                var25 = (Object) (Object) rd.a(cp.field_H, new String[2], (byte) 103);
                                break L42;
                              } else {
                                if ((var8 & ~var13.field_Ub) == 0) {
                                  break L42;
                                } else {
                                  L47: {
                                    var26_int = r.a((byte) -82, ~var13.field_Ub & var8);
                                    var25 = (Object) (Object) rd.a(kq.field_m, new String[1], (byte) 103);
                                    if (var26_int <= 0) {
                                      break L47;
                                    } else {
                                      if (null == eb.field_p) {
                                        break L47;
                                      } else {
                                        if (var26_int > eb.field_p.length) {
                                          break L47;
                                        } else {
                                          if (eb.field_p[-1 + var26_int] != null) {
                                            var25 = (Object) (Object) rd.a(eb.field_p[var26_int + -1][2], new String[1], (byte) 103);
                                            break L47;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L42;
                                }
                              }
                            } else {
                              L48: {
                                var26_int = var7 - var13.field_ac;
                                if (var26_int != 1) {
                                  break L48;
                                } else {
                                  var25 = (Object) (Object) rd.a(di.field_b, new String[1], (byte) 103);
                                  break L48;
                                }
                              }
                              var25 = (Object) (Object) rd.a(qh.field_g, new String[2], (byte) 103);
                              break L42;
                            }
                          }
                        }
                        if (var25 != null) {
                          var25 = (Object) (Object) ("<col=A00000>" + var25);
                          var26 = null;
                          var27 = 0;
                          var28_int = 0;
                          L49: while (true) {
                            L50: {
                              L51: {
                                L52: {
                                  L53: {
                                    if (cq.field_p <= var28_int) {
                                      break L53;
                                    } else {
                                      var29 = o.field_e.field_Tb[var28_int] & 255;
                                      var30 = 0;
                                      if (var32 != 0) {
                                        break L52;
                                      } else {
                                        L54: {
                                          if (vl.field_a == null) {
                                            break L54;
                                          } else {
                                            if (vl.field_a[var28_int] == null) {
                                              break L54;
                                            } else {
                                              if (!vl.field_a[var28_int][var29]) {
                                                break L54;
                                              } else {
                                                if (!var13.field_ec) {
                                                  var30 = 1;
                                                  break L54;
                                                } else {
                                                  break L54;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L55: {
                                          if (null == bl.field_F) {
                                            break L55;
                                          } else {
                                            if (bl.field_F[var28_int] != null) {
                                              L56: {
                                                var31_int = bl.field_F[var28_int][var29];
                                                if (var31_int == 0) {
                                                  break L56;
                                                } else {
                                                  if (ea.field_g) {
                                                    break L56;
                                                  } else {
                                                    if (!var13.field_ec) {
                                                      var30 = 1;
                                                      break L56;
                                                    } else {
                                                      break L56;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var13.field_Wb >= var31_int) {
                                                break L55;
                                              } else {
                                                var30 = 1;
                                                break L55;
                                              }
                                            } else {
                                              break L55;
                                            }
                                          }
                                        }
                                        L57: {
                                          if (null == ld.field_v) {
                                            break L57;
                                          } else {
                                            if (null == ld.field_v[var28_int]) {
                                              break L57;
                                            } else {
                                              L58: {
                                                var31_int = ld.field_v[var28_int][var29];
                                                if (var31_int == 0) {
                                                  break L58;
                                                } else {
                                                  if (ea.field_g) {
                                                    break L58;
                                                  } else {
                                                    if (var13.field_ec) {
                                                      break L58;
                                                    } else {
                                                      var30 = 1;
                                                      break L58;
                                                    }
                                                  }
                                                }
                                              }
                                              if (~var31_int >= ~var13.field_ac) {
                                                break L57;
                                              } else {
                                                var30 = 1;
                                                break L57;
                                              }
                                            }
                                          }
                                        }
                                        L59: {
                                          if (null == me.field_e) {
                                            break L59;
                                          } else {
                                            if (me.field_e[var28_int] != null) {
                                              if ((me.field_e[var28_int][var29] & ~var13.field_Ub) != 0) {
                                                var30 = 1;
                                                break L59;
                                              } else {
                                                break L59;
                                              }
                                            } else {
                                              break L59;
                                            }
                                          }
                                        }
                                        L60: {
                                          if (var30 == 0) {
                                            break L60;
                                          } else {
                                            L61: {
                                              var31 = "<col=A00000>" + rg.field_b[var28_int] + "</col>";
                                              if (var26 != null) {
                                                break L61;
                                              } else {
                                                var26 = (Object) (Object) var31;
                                                if (var32 == 0) {
                                                  break L60;
                                                } else {
                                                  break L61;
                                                }
                                              }
                                            }
                                            var26 = (Object) (Object) (var26 + ", " + var31);
                                            var27 = 1;
                                            break L60;
                                          }
                                        }
                                        var28_int++;
                                        if (var32 == 0) {
                                          continue L49;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                  }
                                  if (param1 != vp.field_u) {
                                    break L52;
                                  } else {
                                    int discarded$8 = 7;
                                    if (hn.b()) {
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L62: {
                                  if (var27 != 0) {
                                    break L62;
                                  } else {
                                    var25 = (Object) (Object) (var25 + "<br>" + rd.a(jo.field_k, new String[1], (byte) 103));
                                    if (var32 == 0) {
                                      break L50;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                var25 = (Object) (Object) (var25 + "<br>" + jm.field_l + var26);
                                if (var32 == 0) {
                                  break L50;
                                } else {
                                  break L51;
                                }
                              }
                              L63: {
                                if (var27 != 0) {
                                  break L63;
                                } else {
                                  var25 = (Object) (Object) (var25 + "<br>" + rd.a(id.field_bc, new String[1], (byte) 103));
                                  if (var32 == 0) {
                                    break L50;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              var25 = (Object) (Object) (var25 + "<br>" + kb.field_Rb + var26);
                              break L50;
                            }
                            L64: {
                              if (vp.field_u != param1) {
                                break L64;
                              } else {
                                int discarded$9 = 7;
                                if (hn.b()) {
                                  break L64;
                                } else {
                                  var28 = o.field_e.field_Fc;
                                  var25 = (Object) (Object) (var25 + "<br>" + rd.a(ba.field_y, new String[1], (byte) 103));
                                  break L64;
                                }
                              }
                            }
                            ep.field_e = (String) var25;
                            break L41;
                          }
                        } else {
                          break L41;
                        }
                      } else {
                        break L41;
                      }
                    }
                  }
                  var13 = (id) (Object) var10.a((byte) 116);
                  if (var32 == 0) {
                    continue L11;
                  } else {
                    break L13;
                  }
                }
              }
            }
            break L12;
          }
          return;
        }
    }

    public static void c() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_l = null;
            field_C = null;
            field_n = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ka.A(" + 67 + 41);
        }
    }

    final void a(int param0) {
        ((ka) this).field_y = null;
        ((ka) this).field_F = null;
        ((ka) this).field_k = null;
        if (param0 > -39) {
            return;
        }
        try {
            ((ka) this).field_G = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ka.B(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, ta param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              vg.field_c = param3;
              un.field_a = param0;
              vo.field_A = param2;
              if (param1 < -25) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ka.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 60) {
                break L1;
              } else {
                field_E = -98;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!r.field_A) {
                  break L3;
                } else {
                  if (~ga.field_i == ~pp.field_a) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ka.E(" + param0 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int[] param0, int param1, int[] param2, boolean param3, boolean param4, fr param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var30 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 2;
            var22 = param0[4] >> 2;
            var23 = param0[5] >> 2;
            var24 = param0[6] >> 2;
            var25 = param0[7] >> 2;
            var26 = param0[8] >> 2;
            var27 = param0[9] >> 2;
            var28 = param0[10] >> 2;
            var13 = var25 * param2[4] + (var24 * param2[3] + param2[5] * var26) >> 14;
            var29 = param0[11] >> 2;
            var12 = param2[5] * var23 + (param2[3] * var21 + param2[4] * var22) >> 14;
            var16 = param2[8] * var26 + var24 * param2[6] - -(param2[7] * var25) >> 14;
            var18 = var23 * param2[11] + param2[10] * var22 + param2[9] * var21 >> 14;
            var15 = param2[7] * var22 + var21 * param2[6] - -(param2[8] * var23) >> 14;
            var20 = var28 * param2[10] + (param2[9] * var27 + param2[11] * var29) >> 14;
            var19 = param2[11] * var26 + (var25 * param2[10] + param2[9] * var24) >> 14;
            var14 = param2[3] * var27 - (-(param2[4] * var28) + -(param2[5] * var29)) >> 14;
            var17 = param2[8] * var29 + (var27 * param2[6] - -(var28 * param2[7])) >> 14;
            var21 = param2[0] + -param0[0];
            var22 = param2[1] + -param0[1];
            var23 = -param0[2] + param2[2];
            var9 = param0[4] * var22 + var21 * param0[3] - -(var23 * param0[5]) >> -lc.field_k + 16;
            var10 = var23 * param0[8] + (param0[7] * var22 + var21 * param0[6]) >> -lc.field_k + 16;
            var11 = param0[11] * var23 + (var21 * param0[9] + var22 * param0[10]) >> 16;
            var21 = mg.field_d;
            var22 = mg.field_a;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (~param5.field_w >= ~var23) {
                      break L4;
                    } else {
                      var24 = param5.field_B[var23];
                      var25 = param5.field_Q[var23];
                      var26 = param5.field_P[var23];
                      var27 = var9 + (var24 * var12 - -(var15 * var25) + var26 * var18 >> -lc.field_k + 16);
                      var28 = var10 + (var26 * var19 + var24 * var13 + var25 * var16 >> -lc.field_k + 16);
                      var29 = var11 - -(var24 * var14 + var17 * var25 + var26 * var20 >> 16);
                      stackOut_6_0 = ~var29;
                      stackOut_6_1 = -51;
                      stackIn_63_0 = stackOut_6_0;
                      stackIn_63_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_7_0 > stackIn_7_1) {
                              break L6;
                            } else {
                              L7: {
                                da.field_M[var23] = var21 - -(var27 / var29);
                                ed.field_e[var23] = var28 / var29 + var22;
                                if (var7_int > var29) {
                                  var7_int = var29;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              vo.field_v[var23] = var29;
                              if (var29 <= var8) {
                                break L5;
                              } else {
                                var8 = var29;
                                if (var30 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          vo.field_v[var23] = -2147483648;
                          break L5;
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: {
                    if (null == param5.field_F) {
                      break L8;
                    } else {
                      if (null == param5.field_E) {
                        break L8;
                      } else {
                        if (param5.field_O == null) {
                          break L8;
                        } else {
                          if (null == param5.field_I) {
                            break L8;
                          } else {
                            if (param5.field_D == null) {
                              break L8;
                            } else {
                              if (null == param5.field_u) {
                                break L8;
                              } else {
                                if (param5.field_g == null) {
                                  break L8;
                                } else {
                                  if (null == param5.field_s) {
                                    break L8;
                                  } else {
                                    if (param5.field_i == null) {
                                      break L8;
                                    } else {
                                      var23 = 0;
                                      L9: while (true) {
                                        if (param5.field_C <= var23) {
                                          break L8;
                                        } else {
                                          var24 = param5.field_F[var23];
                                          var25 = param5.field_E[var23];
                                          var26 = param5.field_O[var23];
                                          nj.field_v[var23] = (var15 * var25 + (var12 * var24 + var18 * var26) >> 16) + var9;
                                          nd.field_e[var23] = var10 - -(var16 * var25 + (var24 * var13 - -(var26 * var19)) >> 16);
                                          jk.field_r[var23] = (var14 * var24 - (-(var25 * var17) - var20 * var26) >> 16) + var11;
                                          var24 = param5.field_I[var23];
                                          var25 = param5.field_D[var23];
                                          var26 = param5.field_u[var23];
                                          lc.field_l[var23] = (var24 * var12 - -(var25 * var15) + var18 * var26 >> 16) + var9;
                                          bf.field_M[var23] = var10 + (var19 * var26 + (var13 * var24 + var16 * var25) >> 16);
                                          vq.field_G[var23] = (var26 * var20 + (var24 * var14 + var25 * var17) >> 16) + var11;
                                          var24 = param5.field_g[var23];
                                          var25 = param5.field_s[var23];
                                          var26 = param5.field_i[var23];
                                          vd.field_b[var23] = var9 - -(var25 * var15 + (var24 * var12 - -(var26 * var18)) >> 16);
                                          cc.field_I[var23] = var10 - -(var19 * var26 + var13 * var24 + var16 * var25 >> 16);
                                          il.field_D[var23] = (var14 * var24 - (-(var17 * var25) - var26 * var20) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L9;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var9 = param2[3];
                  var10 = param2[4];
                  var11 = param2[5];
                  var12 = param2[6];
                  var13 = param2[7];
                  var14 = param2[8];
                  var15 = param2[9];
                  var16 = param2[10];
                  var17 = param2[11];
                  var18 = 0;
                  L10: while (true) {
                    L11: {
                      if (var18 >= param5.field_o) {
                        break L11;
                      } else {
                        stackOut_57_0 = ~var18;
                        stackOut_57_1 = ~wl.field_R.length;
                        stackIn_63_0 = stackOut_57_0;
                        stackIn_63_1 = stackOut_57_1;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          if (stackIn_58_0 <= stackIn_58_1) {
                            break L11;
                          } else {
                            var19 = param5.field_n[var18];
                            var20 = param5.field_H[var18];
                            var21 = param5.field_a[var18];
                            wl.field_R[var18] = var21 * var15 + (var9 * var19 + var20 * var12) >> 16;
                            ff.field_f[var18] = var21 * var16 + var13 * var20 + var19 * var10 >> 16;
                            nn.field_h[var18] = var19 * var11 - (-(var20 * var14) + -(var21 * var17)) >> 16;
                            var18++;
                            if (var30 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_62_0 = 0;
                    stackOut_62_1 = var7_int;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    break L3;
                  }
                }
                bm.a(stackIn_63_0 != 0, stackIn_63_1, var8, false, param5);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("ka.C(");
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L12;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L12;
            }
          }
          L13: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44).append(-16283).append(44);
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L13;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L13;
            }
          }
          L14: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(0).append(44).append(1).append(44);
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L14;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L14;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + 0 + 41);
        }
    }

    ka() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "<%0> is not on your friend list.";
    }
}
