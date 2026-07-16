/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hd {
    private hd field_Hb;
    private hd field_Cb;
    private hd field_yb;
    static int field_Ab;
    private hd field_Gb;
    private hd field_Fb;
    static String field_Eb;
    static int field_Ib;
    private int field_Db;
    static int[][] field_zb;
    private hd field_Bb;

    na(long param0, hd param1, hd param2, hd param3, hd param4) {
        super(param0, (hd) null);
        ((na) this).field_Bb = new hd(0L, param1);
        ((na) this).field_Gb = new hd(0L, param2);
        ((na) this).a((byte) -107, ((na) this).field_Bb);
        ((na) this).a((byte) -106, ((na) this).field_Gb);
        ((na) this).field_Cb = new hd(0L, (hd) null);
        ((na) this).a((byte) -127, ((na) this).field_Cb);
        ((na) this).field_Fb = new hd(0L, param3);
        ((na) this).field_yb = new hd(0L, param3);
        hd var7 = ((na) this).field_Fb;
        ((na) this).field_yb.field_ob = true;
        var7.field_ob = true;
        ((na) this).field_Cb.a((byte) -127, ((na) this).field_Fb);
        ((na) this).field_Cb.a((byte) -112, ((na) this).field_yb);
        ((na) this).field_Hb = new hd(0L, param4);
        ((na) this).field_Hb.field_Y = true;
        ((na) this).field_Cb.a((byte) -127, ((na) this).field_Hb);
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (param0 > 103) {
          L0: {
            var5 = 0;
            var6 = ((na) this).field_Cb.field_mb - ((na) this).field_Hb.field_mb;
            if ((var6 ^ -1) >= -1) {
              break L0;
            } else {
              var7 = ((na) this).field_Hb.field_J;
              var8 = param2 - param3;
              var5 = (var7 * var8 - -(var6 / 2)) / var6;
              break L0;
            }
          }
          L1: {
            L2: {
              if (param1) {
                break L2;
              } else {
                L3: {
                  if ((var5 ^ -1) >= (param2 - param3 ^ -1)) {
                    break L3;
                  } else {
                    var5 = -param3 + param2;
                    break L3;
                  }
                }
                if ((var5 ^ -1) > -1) {
                  var5 = 0;
                  if (Kickabout.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            L4: {
              if (-1 >= (var5 ^ -1)) {
                break L4;
              } else {
                var5 = 0;
                break L4;
              }
            }
            if ((var5 ^ -1) < (param2 - param3 ^ -1)) {
              var5 = param2 + -param3;
              break L1;
            } else {
              break L1;
            }
          }
          return var5;
        } else {
          return 2;
        }
    }

    final boolean b(int param0) {
        if (param0 != 23028) {
            boolean discarded$0 = ((na) this).m(124);
        }
        if (!(0 == ((na) this).field_Fb.field_sb)) {
            ((na) this).field_Db = 20;
            return true;
        }
        if (0 == ((na) this).field_Fb.field_qb) {
            return false;
        }
        if (!(0 >= ((na) this).field_Db)) {
            ((na) this).field_Db = ((na) this).field_Db - 1;
        }
        if (0 != ((na) this).field_Db) {
            return false;
        }
        if (!(n.field_m >= ((na) this).field_Hb.field_T - -((na) this).field_Hb.field_v)) {
            ((na) this).field_Db = 3;
            return true;
        }
        return false;
    }

    final boolean m(int param0) {
        if (((na) this).field_yb.field_sb == 0) {
          if ((((na) this).field_yb.field_qb ^ -1) != param0) {
            L0: {
              if ((((na) this).field_Db ^ -1) >= -1) {
                break L0;
              } else {
                ((na) this).field_Db = ((na) this).field_Db - 1;
                break L0;
              }
            }
            if (((na) this).field_Db == 0) {
              if (((na) this).field_Hb.field_T + ((na) this).field_Hb.field_v - -((na) this).field_Hb.field_mb - -((na) this).field_Hb.field_L > n.field_m) {
                return false;
              } else {
                ((na) this).field_Db = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((na) this).field_Db = 20;
          return true;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((na) this).field_q = param3;
        ((na) this).field_J = param6;
        ((na) this).field_s = param0;
        if (!param1) {
          return;
        } else {
          ((na) this).field_mb = param2;
          ((na) this).a(param4, param5, (byte) 64, param7);
          return;
        }
    }

    final static void h(int param0) {
        m.field_m = new hd(0L, (hd) null);
        if (ui.field_t) {
            m.field_m.a((byte) -127, li.field_a);
        }
        m.field_m.a((byte) -114, mc.field_d);
        tn.field_d = new rf(qt.field_z, m.field_m);
        ss.field_c = new hd((long)param0, (hd) null);
        ss.field_c.a((byte) -127, (hd) (Object) tn.field_d.field_b);
        ss.field_c.a((byte) -116, rg.field_a);
        ml.c(false);
    }

    final boolean j(int param0) {
        if (-1 != ((na) this).field_Bb.field_sb) {
          ((na) this).field_Db = 20;
          return true;
        } else {
          L0: {
            if (0 == ((na) this).field_Bb.field_qb) {
              break L0;
            } else {
              L1: {
                if (-1 >= ((na) this).field_Db) {
                  break L1;
                } else {
                  ((na) this).field_Db = ((na) this).field_Db - 1;
                  break L1;
                }
              }
              if (((na) this).field_Db == 0) {
                ((na) this).field_Db = 3;
                return true;
              } else {
                break L0;
              }
            }
          }
          if (param0 != -819561055) {
            field_Eb = null;
            return false;
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_zb = null;
        int var1 = 42 / ((52 - param0) / 62);
        field_Eb = null;
    }

    final boolean h(byte param0) {
        if ((((na) this).field_Gb.field_sb ^ -1) != -1) {
            ((na) this).field_Db = 20;
            return true;
        }
        if (0 != ((na) this).field_Gb.field_qb) {
            if (!(-1 <= (((na) this).field_Db ^ -1))) {
                ((na) this).field_Db = ((na) this).field_Db - 1;
            }
            if (0 == ((na) this).field_Db) {
                ((na) this).field_Db = 3;
                return true;
            }
        }
        if (param0 != -40) {
            ((na) this).field_Gb = null;
            return false;
        }
        return false;
    }

    na(long param0, na param1) {
        this(param0, param1.field_Bb, param1.field_Gb, param1.field_Fb, param1.field_Hb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hd var13 = null;
        hd stackIn_14_0 = null;
        hd stackIn_14_1 = null;
        hd stackIn_14_2 = null;
        hd stackIn_15_0 = null;
        hd stackIn_15_1 = null;
        hd stackIn_15_2 = null;
        hd stackIn_16_0 = null;
        hd stackIn_16_1 = null;
        hd stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        hd stackOut_13_0 = null;
        hd stackOut_13_1 = null;
        hd stackOut_13_2 = null;
        hd stackOut_15_0 = null;
        hd stackOut_15_1 = null;
        hd stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        hd stackOut_14_0 = null;
        hd stackOut_14_1 = null;
        hd stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          L1: {
            if (2 * ((na) this).field_q > ((na) this).field_mb) {
              break L1;
            } else {
              var6 = ((na) this).field_mb - ((na) this).field_q;
              var5 = ((na) this).field_q;
              if (Kickabout.field_G == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var6 = ((na) this).field_mb / 2;
          var5 = ((na) this).field_mb / 2;
          break L0;
        }
        L2: {
          var7 = var6 + -var5;
          var8 = var7;
          if (-1 > (param0 ^ -1)) {
            L3: {
              var8 = param1 * var8 / param0;
              if (((na) this).field_q > var8) {
                var8 = ((na) this).field_q;
                break L3;
              } else {
                break L3;
              }
            }
            if (var8 <= var7) {
              break L2;
            } else {
              var8 = var7;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          var9 = -param1 + param0;
          var10 = -var8 + var7;
          var11 = 0;
          if (-1 <= (var9 ^ -1)) {
            break L4;
          } else {
            var11 = (param3 * var10 + var9 / 2) / var9;
            break L4;
          }
        }
        var12 = var8 / 2 + var11;
        var13 = ((na) this).field_Bb;
        var13.field_mb = var5;
        var13.field_s = 0;
        var13.field_q = ((na) this).field_q;
        var13.field_J = 0;
        var13 = ((na) this).field_Gb;
        var13.field_J = var6;
        var13.field_mb = -var6 + ((na) this).field_mb;
        var13.field_s = 0;
        var13.field_q = ((na) this).field_q;
        var13 = ((na) this).field_Cb;
        var13.field_q = ((na) this).field_q;
        var13.field_mb = var7;
        var13.field_J = var5;
        var13.field_s = 0;
        var13 = ((na) this).field_Fb;
        var13.field_mb = var12;
        var13.field_q = ((na) this).field_q;
        var13.field_J = 0;
        var13.field_s = 0;
        var13 = ((na) this).field_yb;
        var13.field_J = var12;
        var13.field_mb = -var12 + var7;
        var13.field_s = 0;
        if (param2 <= 33) {
          return;
        } else {
          L5: {
            var13.field_q = ((na) this).field_q;
            var13 = ((na) this).field_Hb;
            var13.field_s = 0;
            var13.field_J = var11;
            var13.field_mb = var8;
            stackOut_13_0 = ((na) this).field_Bb;
            stackOut_13_1 = ((na) this).field_Gb;
            stackOut_13_2 = ((na) this).field_Cb;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            if (param1 >= param0) {
              stackOut_15_0 = (hd) (Object) stackIn_15_0;
              stackOut_15_1 = (hd) (Object) stackIn_15_1;
              stackOut_15_2 = (hd) (Object) stackIn_15_2;
              stackOut_15_3 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              break L5;
            } else {
              stackOut_14_0 = (hd) (Object) stackIn_14_0;
              stackOut_14_1 = (hd) (Object) stackIn_14_1;
              stackOut_14_2 = (hd) (Object) stackIn_14_2;
              stackOut_14_3 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_16_3 = stackOut_14_3;
              break L5;
            }
          }
          stackIn_16_2.field_lb = stackIn_16_3 != 0;
          stackIn_16_1.field_lb = stackIn_16_3 != 0;
          stackIn_16_0.field_lb = stackIn_16_3 != 0;
          var13.field_q = ((na) this).field_q;
          return;
        }
    }

    final static void k(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        dg var9 = null;
        int var10 = 0;
        int stackIn_11_0 = 0;
        dg stackIn_15_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        dg stackOut_14_0 = null;
        dg stackOut_13_0 = null;
        var10 = Kickabout.field_G;
        var1 = -nb.field_k + so.field_e;
        nb.field_k = qg.field_k + -(var1 >> 572159937);
        so.field_e = nb.field_k - -var1;
        hm.field_I = -(fr.field_G >> 905985825) + eh.field_e;
        var2 = hm.field_I;
        var3 = param0;
        L0: while (true) {
          L1: {
            if (j.field_a.length <= var3) {
              break L1;
            } else {
              var4 = wj.field_x[var3];
              if (var10 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (0 > var4) {
                      break L3;
                    } else {
                      L4: {
                        if (re.field_c.field_e == var4) {
                          break L4;
                        } else {
                          var5 = ju.field_U;
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = gt.field_w;
                      break L3;
                    }
                  }
                  var5 = du.field_a;
                  break L2;
                }
                L5: {
                  var6 = j.field_a[var3];
                  if ((var4 ^ -1) > -1) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L5;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L5;
                  }
                }
                L6: {
                  var7 = ec.a(stackIn_11_0 != 0, var6, -23044);
                  var8 = qg.field_k + -(var7 >> 1534179681);
                  if (var4 < 0) {
                    break L6;
                  } else {
                    L7: {
                      if (re.field_c.field_e != var4) {
                        stackOut_14_0 = ta.field_B;
                        stackIn_15_0 = stackOut_14_0;
                        break L7;
                      } else {
                        stackOut_13_0 = oh.field_d;
                        stackIn_15_0 = stackOut_13_0;
                        break L7;
                      }
                    }
                    L8: {
                      var9 = stackIn_15_0;
                      var2 = var2 + of.field_a;
                      if (var9 != null) {
                        var9.a(var8 + -vg.field_zb, tk.field_zb - -(pb.field_H << -21119999), var2, (vg.field_zb << 602982305) + var7, 3);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var2 = var2 + pb.field_H;
                    break L6;
                  }
                }
                L9: {
                  L10: {
                    if (-1 < (var4 ^ -1)) {
                      break L10;
                    } else {
                      sn.field_a.a(var6, var8, var2 + ag.field_g, var5, -1);
                      var2 = var2 + (pb.field_H + of.field_a + tk.field_zb);
                      if (var10 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  sn.field_i.a(var6, var8, var2 - -bs.field_f, var5, -1);
                  var2 = var2 + qp.field_H;
                  break L9;
                }
                var3++;
                continue L0;
              }
            }
          }
          return;
        }
    }

    final boolean l(int param0) {
        if (param0 >= -30) {
            ((na) this).field_yb = null;
        }
        return 0 != ((na) this).field_Hb.field_qb ? true : false;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_24_0 = 0;
        boolean stackOut_28_0 = false;
        var14 = Kickabout.field_G;
        if (param6 >= param5) {
          return;
        } else {
          if (param6 + param4 < param2) {
            L0: {
              if (5 + param6 >= param2) {
                break L0;
              } else {
                if (param3 == param0) {
                  break L0;
                } else {
                  var7 = (1 & (param3 & param0)) + (param0 >> 416072801) + (param3 >> -819561055);
                  var8 = param6;
                  var9 = param0;
                  var10 = param3;
                  var11 = param6;
                  L1: while (true) {
                    L2: {
                      if (var11 >= param2) {
                        na.a(param0, param1, var8, var9, 1, param5, param6);
                        stackOut_20_0 = var10;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      } else {
                        var12 = pf.field_d[var11];
                        stackOut_9_0 = param1;
                        stackIn_21_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var14 != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (stackIn_10_0) {
                              stackOut_12_0 = bl.field_m[var12];
                              stackIn_13_0 = stackOut_12_0;
                              break L3;
                            } else {
                              stackOut_11_0 = w.field_a[var12];
                              stackIn_13_0 = stackOut_11_0;
                              break L3;
                            }
                          }
                          L4: {
                            L5: {
                              var13 = stackIn_13_0;
                              if (var13 <= var7) {
                                break L5;
                              } else {
                                pf.field_d[var11] = pf.field_d[var8];
                                int incrementValue$1 = var8;
                                var8++;
                                pf.field_d[incrementValue$1] = var12;
                                if (var13 < var9) {
                                  var9 = var13;
                                  if (var14 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  var11++;
                                  continue L1;
                                }
                              }
                            }
                            if (var13 <= var10) {
                              break L4;
                            } else {
                              var10 = var13;
                              break L4;
                            }
                          }
                          var11++;
                          continue L1;
                        }
                      }
                    }
                    na.a(stackIn_21_0, param1, param2, param3, 1, param5, var8);
                    return;
                  }
                }
              }
            }
            var7 = -1 + param2;
            L6: while (true) {
              stackOut_24_0 = var7;
              stackIn_25_0 = stackOut_24_0;
              L7: while (true) {
                if (stackIn_25_0 > param6) {
                  var8 = param6;
                  if (var8 >= var7) {
                    var7--;
                    if (var14 == 0) {
                      continue L6;
                    } else {
                      return;
                    }
                  } else {
                    var9 = pf.field_d[var8];
                    var10 = pf.field_d[1 + var8];
                    stackOut_28_0 = gn.a((byte) 8, param1, var9, var10);
                    stackIn_25_0 = stackOut_28_0 ? 1 : 0;
                    continue L7;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void i(int param0) {
        ml var1 = null;
        int var2 = 0;
        he var3_ref_he = null;
        long var3 = 0L;
        int var3_int = 0;
        qb var3_ref_qb = null;
        qb var4_ref_qb = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        qb var6_ref = null;
        he var7 = null;
        he var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12 = null;
        he var13 = null;
        he var14 = null;
        String var15 = null;
        String var16 = null;
        he var17 = null;
        Object var18 = null;
        qb var18_ref = null;
        Object var19 = null;
        qb var19_ref = null;
        Object var20 = null;
        qb var20_ref = null;
        he var21 = null;
        String var22 = null;
        String var23 = null;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        he stackIn_110_0 = null;
        he stackIn_111_0 = null;
        he stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_173_0 = 0;
        he stackIn_179_0 = null;
        he stackIn_180_0 = null;
        he stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_25_0 = 0;
        he stackOut_109_0 = null;
        he stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        he stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        he stackOut_178_0 = null;
        he stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        he stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        L0: {
          var18 = null;
          var19 = null;
          var20 = null;
          var11 = Kickabout.field_G;
          var12 = un.field_e;
          var1 = var12;
          var2 = ((iw) (Object) var1).h((byte) -118);
          if (param0 == 14) {
            break L0;
          } else {
            field_zb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                if (-1 == (var2 ^ -1)) {
                  break L4;
                } else {
                  if (-2 == (var2 ^ -1)) {
                    break L4;
                  } else {
                    if (2 == var2) {
                      break L4;
                    } else {
                      if ((var2 ^ -1) == -4) {
                        break L4;
                      } else {
                        if (4 != var2) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_he = (he) (Object) lw.field_d.g(24009);
              L5: while (true) {
                L6: {
                  L7: {
                    if (var3_ref_he == null) {
                      break L7;
                    } else {
                      var3_ref_he.c((byte) -109);
                      var3_ref_he.f(9);
                      var3_ref_he = (he) (Object) lw.field_d.c(33);
                      if (var11 != 0) {
                        break L6;
                      } else {
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var3_ref_he = (he) (Object) pq.field_N.b((byte) 72);
                  break L6;
                }
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var3_ref_he == null) {
                        break L10;
                      } else {
                        stackOut_16_0 = var3_ref_he.field_Gb;
                        stackIn_26_0 = stackOut_16_0 ? 1 : 0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var11 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_17_0) {
                                break L12;
                              } else {
                                if (!var3_ref_he.field_Fb) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              if (var3_ref_he.field_Fb) {
                                fh.field_b = fh.field_b - 1;
                                var3_ref_he.field_Fb = false;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var3_ref_he.field_Gb = false;
                            iw.a((byte) 81, var3_ref_he);
                            break L11;
                          }
                          var3_ref_he = (he) (Object) pq.field_N.a(param0 + -14);
                          if (var11 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_25_0 = var2 ^ -1;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  }
                  L14: {
                    if (stackIn_26_0 != -2) {
                      break L14;
                    } else {
                      if (null != uv.field_i) {
                        h.field_f = uv.field_i.field_ec;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if ((var2 ^ -1) != -5) {
                      uv.field_i = null;
                      break L15;
                    } else {
                      var3_int = ((iw) (Object) var1).a((byte) 81);
                      uv.field_i = new qb(ss.field_j);
                      uv.field_i.a((long)var3_int, (byte) -113);
                      ra.a(false, 114, (iw) (Object) var1, uv.field_i);
                      vg.field_Ib = 0L;
                      break L15;
                    }
                  }
                  L16: {
                    L17: {
                      L18: {
                        if (var2 == 2) {
                          break L18;
                        } else {
                          if (-4 != (var2 ^ -1)) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (null != ow.field_b) {
                        break L16;
                      } else {
                        ow.field_b = new qb(ss.field_j);
                        if (var11 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    ow.field_b = null;
                    break L16;
                  }
                  L19: {
                    if (-4 != (var2 ^ -1)) {
                      break L19;
                    } else {
                      hw.field_k = true;
                      var3_int = 0;
                      L20: while (true) {
                        L21: {
                          L22: {
                            if ((er.field_h.length ^ -1) >= (var3_int ^ -1)) {
                              break L22;
                            } else {
                              er.field_h[var3_int] = ((iw) (Object) var12).j((byte) -82);
                              var3_int++;
                              if (var11 != 0) {
                                break L21;
                              } else {
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          lk.field_l = ((iw) (Object) var1).h((byte) -110);
                          ru.field_C = ((iw) (Object) var1).h((byte) -105);
                          break L21;
                        }
                        var3_int = 0;
                        L23: while (true) {
                          L24: {
                            if (rf.field_d.length <= var3_int) {
                              break L24;
                            } else {
                              rf.field_d[var3_int] = ((iw) (Object) var12).j((byte) -81);
                              var3_int++;
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var11 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                  hw.field_k = false;
                  if (var11 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L25: {
              if (var2 == 5) {
                break L25;
              } else {
                L26: {
                  if ((var2 ^ -1) == -7) {
                    break L26;
                  } else {
                    L27: {
                      if (7 != var2) {
                        break L27;
                      } else {
                        var3_ref_he = (he) (Object) rp.field_B.g(24009);
                        L28: while (true) {
                          L29: {
                            L30: {
                              if (var3_ref_he == null) {
                                break L30;
                              } else {
                                var3_ref_he.c((byte) -109);
                                var3_ref_he.f(-5);
                                var3_ref_he = (he) (Object) rp.field_B.c(33);
                                if (var11 != 0) {
                                  break L29;
                                } else {
                                  if (var11 == 0) {
                                    continue L28;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            fh.field_b = 0;
                            break L29;
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    L31: {
                      if (var2 != 8) {
                        break L31;
                      } else {
                        L32: {
                          var3_int = ((iw) (Object) var1).a((byte) 81);
                          var4_ref_qb = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                          if (var4_ref_qb == null) {
                            var4_ref_qb = new qb(ss.field_j);
                            sr.field_f.a((am) (Object) var4_ref_qb, (byte) -4, (long)var3_int);
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        ra.a(true, 116, (iw) (Object) var1, var4_ref_qb);
                        ve.a(var4_ref_qb, (byte) -119);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L31;
                        }
                      }
                    }
                    L33: {
                      if (-10 == (var2 ^ -1)) {
                        break L33;
                      } else {
                        L34: {
                          if (10 != var2) {
                            break L34;
                          } else {
                            var3_ref_qb = (qb) (Object) kq.field_yb.g(24009);
                            L35: while (true) {
                              L36: {
                                if (var3_ref_qb == null) {
                                  break L36;
                                } else {
                                  var3_ref_qb.c((byte) -109);
                                  var3_ref_qb.f(-98);
                                  var3_ref_qb = (qb) (Object) kq.field_yb.c(33);
                                  if (var11 != 0) {
                                    break L2;
                                  } else {
                                    if (var11 == 0) {
                                      continue L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                              }
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L34;
                              }
                            }
                          }
                        }
                        L37: {
                          if (11 == var2) {
                            break L37;
                          } else {
                            if (-13 == (var2 ^ -1)) {
                              break L37;
                            } else {
                              L38: {
                                if (var2 == 13) {
                                  break L38;
                                } else {
                                  L39: {
                                    L40: {
                                      if (var2 == 14) {
                                        break L40;
                                      } else {
                                        if ((var2 ^ -1) != -17) {
                                          break L39;
                                        } else {
                                          break L40;
                                        }
                                      }
                                    }
                                    L41: {
                                      var3 = ((iw) (Object) var1).i((byte) -124);
                                      var13 = lo.a(var3, false);
                                      if (var13 == null) {
                                        break L41;
                                      } else {
                                        L42: {
                                          L43: {
                                            if (14 != var2) {
                                              break L43;
                                            } else {
                                              var13.field_Gb = true;
                                              if (var11 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                          if (!var13.field_Fb) {
                                            var13.field_Fb = true;
                                            fh.field_b = fh.field_b + 1;
                                            break L42;
                                          } else {
                                            break L42;
                                          }
                                        }
                                        iw.a((byte) 72, var13);
                                        break L41;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L2;
                                    } else {
                                      break L39;
                                    }
                                  }
                                  L44: {
                                    L45: {
                                      if (-16 == (var2 ^ -1)) {
                                        break L45;
                                      } else {
                                        if (-18 != (var2 ^ -1)) {
                                          break L44;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                    L46: {
                                      var3 = ((iw) (Object) var1).i((byte) -124);
                                      var5 = ((iw) (Object) var1).h((byte) -123);
                                      var14 = lo.a(var3, false);
                                      if (var14 == null) {
                                        break L46;
                                      } else {
                                        L47: {
                                          if (var5 == 0) {
                                            break L47;
                                          } else {
                                            var14.field_Mb = var5;
                                            var14.field_Jb = mg.field_c;
                                            break L47;
                                          }
                                        }
                                        L48: {
                                          L49: {
                                            if (-16 != (var2 ^ -1)) {
                                              break L49;
                                            } else {
                                              var14.field_Gb = false;
                                              if (var11 == 0) {
                                                break L48;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                          if (!var14.field_Fb) {
                                            break L48;
                                          } else {
                                            var14.field_Fb = false;
                                            fh.field_b = fh.field_b - 1;
                                            break L48;
                                          }
                                        }
                                        iw.a((byte) 56, var14);
                                        break L46;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L2;
                                    } else {
                                      break L44;
                                    }
                                  }
                                  L50: {
                                    if (-19 != (var2 ^ -1)) {
                                      break L50;
                                    } else {
                                      L51: {
                                        var3 = ((iw) (Object) var1).i((byte) -124);
                                        var15 = ((iw) (Object) var1).a(-128);
                                        var16 = ((iw) (Object) var1).a(-114);
                                        var7 = nk.a(31253, var3);
                                        if (var7 != null) {
                                          break L51;
                                        } else {
                                          var7 = new he(var15, var16, var3);
                                          pu.field_Eb.a((am) (Object) var7, (byte) -4, var3);
                                          uv.field_i.field_gc = uv.field_i.field_gc + 1;
                                          break L51;
                                        }
                                      }
                                      L52: {
                                        var7.field_Qb = ((iw) (Object) var1).a((byte) 81);
                                        var8_int = ((iw) (Object) var1).l(param0 ^ 120);
                                        stackOut_109_0 = (he) var7;
                                        stackIn_111_0 = stackOut_109_0;
                                        stackIn_110_0 = stackOut_109_0;
                                        if (-1 == (1 & var8_int ^ -1)) {
                                          stackOut_111_0 = (he) (Object) stackIn_111_0;
                                          stackOut_111_1 = 0;
                                          stackIn_112_0 = stackOut_111_0;
                                          stackIn_112_1 = stackOut_111_1;
                                          break L52;
                                        } else {
                                          stackOut_110_0 = (he) (Object) stackIn_110_0;
                                          stackOut_110_1 = 1;
                                          stackIn_112_0 = stackOut_110_0;
                                          stackIn_112_1 = stackOut_110_1;
                                          break L52;
                                        }
                                      }
                                      stackIn_112_0.field_Cb = stackIn_112_1 != 0;
                                      var7.field_Db = var8_int >> 830957377;
                                      var7.field_Sb = ((iw) (Object) var1).h((byte) -113);
                                      var7.field_Pb = ((iw) (Object) var1).h((byte) -119);
                                      lw.field_d.a((gn) (Object) var7, 3);
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L50;
                                      }
                                    }
                                  }
                                  L53: {
                                    if (-20 != (var2 ^ -1)) {
                                      break L53;
                                    } else {
                                      L54: {
                                        var3 = ((iw) (Object) var1).i((byte) -124);
                                        var5 = ((iw) (Object) var1).h((byte) -126);
                                        var17 = nk.a(31253, var3);
                                        if (var17 != null) {
                                          L55: {
                                            L56: {
                                              if (-1 != (var5 ^ -1)) {
                                                break L56;
                                              } else {
                                                var17.c((byte) -109);
                                                if (var11 == 0) {
                                                  break L55;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                            var17.field_Mb = var5;
                                            var17.field_Jb = mg.field_c;
                                            break L55;
                                          }
                                          var17.f(-111);
                                          uv.field_i.field_gc = uv.field_i.field_gc - 1;
                                          break L54;
                                        } else {
                                          break L54;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                  L57: {
                                    if (-21 == (var2 ^ -1)) {
                                      break L57;
                                    } else {
                                      L58: {
                                        if (21 != var2) {
                                          break L58;
                                        } else {
                                          L59: {
                                            L60: {
                                              var3_int = ((iw) (Object) var1).a((byte) 81);
                                              if (-1 == (var3_int ^ -1)) {
                                                break L60;
                                              } else {
                                                vg.field_Ib = (long)var3_int + nj.a(36);
                                                if (var11 == 0) {
                                                  break L59;
                                                } else {
                                                  break L60;
                                                }
                                              }
                                            }
                                            vg.field_Ib = 0L;
                                            break L59;
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L58;
                                          }
                                        }
                                      }
                                      L61: {
                                        if (-23 == (var2 ^ -1)) {
                                          break L61;
                                        } else {
                                          L62: {
                                            if (23 == var2) {
                                              break L62;
                                            } else {
                                              bd.a("L1: " + tr.b(0), (Throwable) null, param0 ^ 15);
                                              lr.b((byte) -116);
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L62;
                                              }
                                            }
                                          }
                                          dd.field_c = ((iw) (Object) var1).i((byte) -124);
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L61;
                                          }
                                        }
                                      }
                                      mi.field_d = ((iw) (Object) var1).a((byte) 81);
                                      da.field_o = ((iw) (Object) var1).l(121);
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  ra.a(false, param0 ^ 116, (iw) (Object) var1, uv.field_i);
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L63: {
                                var3_int = ((iw) (Object) var1).a((byte) 81);
                                var4 = ((iw) (Object) var1).h((byte) -110);
                                var18_ref = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                                if (var18_ref != null) {
                                  L64: {
                                    var18_ref.field_Tb = false;
                                    var6_ref = var18_ref;
                                    if (var4 != 0) {
                                      var18_ref.field_Ab = var4;
                                      var18_ref.field_Db = mg.field_c;
                                      break L64;
                                    } else {
                                      break L64;
                                    }
                                  }
                                  var6_ref.field_hc = false;
                                  ve.a(var18_ref, (byte) -119);
                                  break L63;
                                } else {
                                  break L63;
                                }
                              }
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L37;
                              }
                            }
                          }
                        }
                        L65: {
                          var3_int = ((iw) (Object) var1).a((byte) 81);
                          var19_ref = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                          if (var19_ref != null) {
                            L66: {
                              L67: {
                                if (-12 == (var2 ^ -1)) {
                                  break L67;
                                } else {
                                  var19_ref.field_Tb = true;
                                  if (var11 == 0) {
                                    break L66;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                              var19_ref.field_hc = true;
                              break L66;
                            }
                            ve.a(var19_ref, (byte) -119);
                            break L65;
                          } else {
                            break L65;
                          }
                        }
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L33;
                        }
                      }
                    }
                    L68: {
                      var3_int = ((iw) (Object) var1).a((byte) 81);
                      var4 = ((iw) (Object) var1).h((byte) -108);
                      var20_ref = (qb) (Object) sr.field_f.a(-3611, (long)var3_int);
                      if (var20_ref == null) {
                        break L68;
                      } else {
                        L69: {
                          L70: {
                            if (-1 != (var4 ^ -1)) {
                              break L70;
                            } else {
                              var20_ref.c((byte) -109);
                              if (var11 == 0) {
                                break L69;
                              } else {
                                break L70;
                              }
                            }
                          }
                          var20_ref.field_Ab = var4;
                          var20_ref.field_Db = mg.field_c;
                          break L69;
                        }
                        var20_ref.f(-95);
                        break L68;
                      }
                    }
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L26;
                    }
                  }
                }
                L71: {
                  var3 = ((iw) (Object) var1).i((byte) -124);
                  var5 = ((iw) (Object) var1).h((byte) -121);
                  var21 = lo.a(var3, false);
                  if (var21 == null) {
                    break L71;
                  } else {
                    L72: {
                      if (!var21.field_Fb) {
                        break L72;
                      } else {
                        fh.field_b = fh.field_b - 1;
                        var21.field_Fb = false;
                        break L72;
                      }
                    }
                    L73: {
                      L74: {
                        if ((var5 ^ -1) != -1) {
                          break L74;
                        } else {
                          var21.c((byte) -109);
                          if (var11 == 0) {
                            break L73;
                          } else {
                            break L74;
                          }
                        }
                      }
                      var21.field_Jb = mg.field_c;
                      var21.field_Mb = var5;
                      break L73;
                    }
                    var21.f(param0 ^ -71);
                    break L71;
                  }
                }
                if (var11 == 0) {
                  break L2;
                } else {
                  break L25;
                }
              }
            }
            L75: {
              var3 = ((iw) (Object) var1).i((byte) -124);
              var22 = ((iw) (Object) var1).a(62);
              var6 = ((iw) (Object) var1).a(param0 + 64);
              var23 = ((iw) (Object) var1).a(-101);
              var8 = lo.a(var3, false);
              if (var6.equals((Object) (Object) "")) {
                stackOut_172_0 = 0;
                stackIn_173_0 = stackOut_172_0;
                break L75;
              } else {
                stackOut_171_0 = 1;
                stackIn_173_0 = stackOut_171_0;
                break L75;
              }
            }
            L76: {
              L77: {
                var9 = stackIn_173_0;
                if (var8 != null) {
                  break L77;
                } else {
                  var8 = new he(var22, var23, var3);
                  pq.field_N.a((am) (Object) var8, (byte) -4, var3);
                  if (var11 == 0) {
                    break L76;
                  } else {
                    break L77;
                  }
                }
              }
              if (var9 != 0) {
                var8.a((byte) -2, var23, var22);
                break L76;
              } else {
                break L76;
              }
            }
            L78: {
              var8.field_Ib = nj.a(-93) + -(long)((iw) (Object) var1).k(4);
              var8.field_Qb = ((iw) (Object) var1).a((byte) 81);
              var10 = ((iw) (Object) var1).l(127);
              var8.field_Db = var10 >> 19134209;
              stackOut_178_0 = (he) var8;
              stackIn_180_0 = stackOut_178_0;
              stackIn_179_0 = stackOut_178_0;
              if ((1 & var10) == 0) {
                stackOut_180_0 = (he) (Object) stackIn_180_0;
                stackOut_180_1 = 0;
                stackIn_181_0 = stackOut_180_0;
                stackIn_181_1 = stackOut_180_1;
                break L78;
              } else {
                stackOut_179_0 = (he) (Object) stackIn_179_0;
                stackOut_179_1 = 1;
                stackIn_181_0 = stackOut_179_0;
                stackIn_181_1 = stackOut_179_1;
                break L78;
              }
            }
            stackIn_181_0.field_Cb = stackIn_181_1 != 0;
            var8.field_Sb = ((iw) (Object) var1).h((byte) -105);
            var8.field_Pb = ((iw) (Object) var1).h((byte) -110);
            iw.a((byte) 84, var8);
            break L2;
          }
          break L1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Player is not involved in an auction.";
        field_Ab = 480;
        field_zb = new int[][]{new int[11], new int[11], new int[11], new int[11]};
    }
}
