/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class op {
    static nn field_d;
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == sp.field_c) {
                break L0;
              } else {
                L1: {
                  if (-1 < (param1 ^ -1)) {
                    break L1;
                  } else {
                    if (pd.field_A == qa.field_c) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param0 != ac.field_B.field_o) {
                    break L2;
                  } else {
                    if (kd.c(-2456) > 10000L + wh.field_e) {
                      ac.field_B.d((byte) -91, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= ac.field_B.field_o) {
                    break L3;
                  } else {
                    try {
                      sp.field_c.b(ac.field_B.field_m, false, 0, ac.field_B.field_o);
                      wh.field_e = kd.c(-2456);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    iOException = (IOException) (Object) decompiledCaughtException;
                    tl.a(117);
                    break L3;
                  }
                }
                ac.field_B.field_o = 0;
              }
            }
            ac.field_B.field_o = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(cd param0, int param1, int param2, cd param3, String param4, int param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        ec stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ec stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ec stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String stackIn_8_2 = null;
        ec stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ec stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ec stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_11_2 = null;
        ec stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        ec stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        ec stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        String stackIn_72_2 = null;
        ec stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        ec stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        ec stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_75_2 = null;
        ec stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        ec stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        String stackOut_71_2 = null;
        ec stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        String stackOut_70_2 = null;
        ec stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ec stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        String stackOut_74_2 = null;
        ec stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        String stackOut_73_2 = null;
        ec stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ec stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        String stackOut_7_2 = null;
        ec stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        String stackOut_6_2 = null;
        ec stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ec stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_10_2 = null;
        ec stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_9_2 = null;
        L0: {
          var13 = DungeonAssault.field_K;
          if (param5 <= -47) {
            break L0;
          } else {
            op.a(3, -113);
            break L0;
          }
        }
        var14 = param0.b(-1);
        var11_ref = var14;
        var11_ref = var14;
        var8 = param3.b(-1);
        var11_ref = var8;
        var11_ref = var8;
        if (null == sp.field_c) {
          if (!rj.a((byte) 83, false)) {
            return -1;
          } else {
            L1: {
              if (no.field_c != pd.field_A) {
                break L1;
              } else {
                L2: {
                  fj.field_e = null;
                  ac.field_B.field_o = 0;
                  if (param4 != null) {
                    L3: {
                      var9 = 0;
                      if (!param6) {
                        break L3;
                      } else {
                        var9 = var9 | 1;
                        break L3;
                      }
                    }
                    L4: {
                      ta.field_c.field_o = 0;
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      ta.field_c.a(2, var14);
                      ta.field_c.a(2, var8);
                      var15 = (CharSequence) (Object) param4;
                      ta.field_c.a(2, qf.a(var15, -1));
                      ta.field_c.i(param1, -86);
                      ta.field_c.a(6, param2);
                      ta.field_c.a(6, var9);
                      ac.field_B.a(6, 18);
                      ac.field_B.field_o = ac.field_B.field_o + 2;
                      var10 = ac.field_B.field_o;
                      var11_ref = oj.a(m.c(true), (byte) -21);
                      if (var11_ref != null) {
                        break L4;
                      } else {
                        var11_ref = "";
                        break L4;
                      }
                    }
                    ac.field_B.b(var11_ref, (byte) -20);
                    of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -120, ta.field_c);
                    ac.field_B.b(-var10 + ac.field_B.field_o, 1);
                    break L2;
                  } else {
                    L5: {
                      ta.field_c.field_o = 0;
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      ta.field_c.a((byte) 63, bl.field_i.nextInt());
                      stackOut_69_0 = ta.field_c;
                      stackOut_69_1 = 2;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      if (!param0.a((byte) -102)) {
                        stackOut_71_0 = (ec) (Object) stackIn_71_0;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = "";
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        stackIn_72_2 = stackOut_71_2;
                        break L5;
                      } else {
                        stackOut_70_0 = (ec) (Object) stackIn_70_0;
                        stackOut_70_1 = stackIn_70_1;
                        stackOut_70_2 = (String) var14;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        stackIn_72_2 = stackOut_70_2;
                        break L5;
                      }
                    }
                    L6: {
                      ((ec) (Object) stackIn_72_0).a(stackIn_72_1, stackIn_72_2);
                      stackOut_72_0 = ta.field_c;
                      stackOut_72_1 = 2;
                      stackIn_74_0 = stackOut_72_0;
                      stackIn_74_1 = stackOut_72_1;
                      stackIn_73_0 = stackOut_72_0;
                      stackIn_73_1 = stackOut_72_1;
                      if (param3.a((byte) 123)) {
                        stackOut_74_0 = (ec) (Object) stackIn_74_0;
                        stackOut_74_1 = stackIn_74_1;
                        stackOut_74_2 = (String) var8;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        stackIn_75_2 = stackOut_74_2;
                        break L6;
                      } else {
                        stackOut_73_0 = (ec) (Object) stackIn_73_0;
                        stackOut_73_1 = stackIn_73_1;
                        stackOut_73_2 = "";
                        stackIn_75_0 = stackOut_73_0;
                        stackIn_75_1 = stackOut_73_1;
                        stackIn_75_2 = stackOut_73_2;
                        break L6;
                      }
                    }
                    ((ec) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2);
                    ac.field_B.a(6, 16);
                    ac.field_B.field_o = ac.field_B.field_o + 1;
                    var9 = ac.field_B.field_o;
                    of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -116, ta.field_c);
                    ac.field_B.c(ac.field_B.field_o + -var9, -1);
                    break L2;
                  }
                }
                op.a(0, -1);
                pd.field_A = kp.field_b;
                break L1;
              }
            }
            L7: {
              if (pd.field_A == kp.field_b) {
                if (oi.a(-12929, 1)) {
                  L8: {
                    var9 = ra.field_c.c(true);
                    ra.field_c.field_o = 0;
                    if (var9 < 100) {
                      break L8;
                    } else {
                      if (105 < var9) {
                        break L8;
                      } else {
                        pd.field_A = jg.field_a;
                        mf.field_c = new String[-100 + var9];
                        break L7;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 == var9) {
                      L9: {
                        boolean discarded$2 = oi.a(-12929, la.a(23940));
                        fj.field_e = new Boolean(fm.a((ec) (Object) ra.field_c, -127));
                        ra.field_c.field_o = 0;
                        if (pd.field_A == jg.field_a) {
                          var9 = 2;
                          if (oi.a(-12929, var9)) {
                            var10 = ra.field_c.k(0);
                            ra.field_c.field_o = 0;
                            if (oi.a(-12929, var10)) {
                              var11 = mf.field_c.length;
                              var12 = 0;
                              L10: while (true) {
                                if (var11 <= var12) {
                                  tl.a(-60);
                                  nh.field_e = false;
                                  return var11 + 100;
                                } else {
                                  mf.field_c[var12] = ra.field_c.a(-21030);
                                  var12++;
                                  continue L10;
                                }
                              }
                            } else {
                              break L9;
                            }
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      if (pd.field_A == sd.field_G) {
                        if (!kh.d((byte) -75)) {
                          L11: {
                            if (null != sp.field_c) {
                              break L11;
                            } else {
                              if (!nh.field_e) {
                                var9 = an.field_E;
                                an.field_E = l.field_b;
                                nh.field_e = true;
                                l.field_b = var9;
                                break L11;
                              } else {
                                if (30000L >= b.a(119)) {
                                  tp.field_v = fc.field_l;
                                  nh.field_e = false;
                                  return 249;
                                } else {
                                  tp.field_v = lh.field_r;
                                  nh.field_e = false;
                                  return 249;
                                }
                              }
                            }
                          }
                          return -1;
                        } else {
                          if ((hc.field_c ^ -1) != -256) {
                            tp.field_v = ra.field_c.d(-101);
                            tl.a(-59);
                            nh.field_e = false;
                            return hc.field_c;
                          } else {
                            var9_ref = ra.field_c.b(true);
                            if (var9_ref == null) {
                              tl.a(-59);
                              nh.field_e = false;
                              return hc.field_c;
                            } else {
                              jb.a(true, var9_ref, m.c(true));
                              tl.a(-59);
                              nh.field_e = false;
                              return hc.field_c;
                            }
                          }
                        }
                      } else {
                        if (null == sp.field_c) {
                          if (!nh.field_e) {
                            var9 = an.field_E;
                            an.field_E = l.field_b;
                            nh.field_e = true;
                            l.field_b = var9;
                            return -1;
                          } else {
                            L12: {
                              if (30000L >= b.a(119)) {
                                tp.field_v = fc.field_l;
                                break L12;
                              } else {
                                tp.field_v = lh.field_r;
                                break L12;
                              }
                            }
                            nh.field_e = false;
                            return 249;
                          }
                        } else {
                          return -1;
                        }
                      }
                    } else {
                      nj.field_b = -1;
                      hc.field_c = var9;
                      pd.field_A = sd.field_G;
                      break L7;
                    }
                  } else {
                    np.a((byte) -126, m.c(true));
                    tp.field_v = m.field_f;
                    tl.a(-84);
                    nh.field_e = false;
                    return var9;
                  }
                } else {
                  L13: {
                    if (pd.field_A == jg.field_a) {
                      var9 = 2;
                      if (oi.a(-12929, var9)) {
                        var10 = ra.field_c.k(0);
                        ra.field_c.field_o = 0;
                        if (oi.a(-12929, var10)) {
                          var11 = mf.field_c.length;
                          var12 = 0;
                          L14: while (true) {
                            if (var11 <= var12) {
                              tl.a(-60);
                              nh.field_e = false;
                              return var11 + 100;
                            } else {
                              mf.field_c[var12] = ra.field_c.a(-21030);
                              var12++;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  if (pd.field_A == sd.field_G) {
                    if (!kh.d((byte) -75)) {
                      if (null == sp.field_c) {
                        if (nh.field_e) {
                          if (30000L < b.a(119)) {
                            tp.field_v = lh.field_r;
                            nh.field_e = false;
                            return 249;
                          } else {
                            tp.field_v = fc.field_l;
                            nh.field_e = false;
                            return 249;
                          }
                        } else {
                          var9 = an.field_E;
                          an.field_E = l.field_b;
                          nh.field_e = true;
                          l.field_b = var9;
                          return -1;
                        }
                      } else {
                        return -1;
                      }
                    } else {
                      if ((hc.field_c ^ -1) == -256) {
                        var9_ref = ra.field_c.b(true);
                        if (var9_ref == null) {
                          tl.a(-59);
                          nh.field_e = false;
                          return hc.field_c;
                        } else {
                          jb.a(true, var9_ref, m.c(true));
                          tl.a(-59);
                          nh.field_e = false;
                          return hc.field_c;
                        }
                      } else {
                        tp.field_v = ra.field_c.d(-101);
                        tl.a(-59);
                        nh.field_e = false;
                        return hc.field_c;
                      }
                    }
                  } else {
                    if (null == sp.field_c) {
                      if (!nh.field_e) {
                        var9 = an.field_E;
                        an.field_E = l.field_b;
                        nh.field_e = true;
                        l.field_b = var9;
                        return -1;
                      } else {
                        L15: {
                          if (30000L >= b.a(119)) {
                            tp.field_v = fc.field_l;
                            break L15;
                          } else {
                            tp.field_v = lh.field_r;
                            break L15;
                          }
                        }
                        nh.field_e = false;
                        return 249;
                      }
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            if (pd.field_A == jg.field_a) {
              var9 = 2;
              if (oi.a(-12929, var9)) {
                var10 = ra.field_c.k(0);
                ra.field_c.field_o = 0;
                if (oi.a(-12929, var10)) {
                  var11 = mf.field_c.length;
                  var12 = 0;
                  L16: while (true) {
                    if (var11 <= var12) {
                      tl.a(-60);
                      nh.field_e = false;
                      return var11 + 100;
                    } else {
                      mf.field_c[var12] = ra.field_c.a(-21030);
                      var12++;
                      continue L16;
                    }
                  }
                } else {
                  if (pd.field_A == sd.field_G) {
                    if (!kh.d((byte) -75)) {
                      L17: {
                        if (null != sp.field_c) {
                          break L17;
                        } else {
                          if (!nh.field_e) {
                            var9 = an.field_E;
                            an.field_E = l.field_b;
                            nh.field_e = true;
                            l.field_b = var9;
                            break L17;
                          } else {
                            if (30000L >= b.a(119)) {
                              tp.field_v = fc.field_l;
                              nh.field_e = false;
                              return 249;
                            } else {
                              tp.field_v = lh.field_r;
                              nh.field_e = false;
                              return 249;
                            }
                          }
                        }
                      }
                      return -1;
                    } else {
                      if ((hc.field_c ^ -1) != -256) {
                        tp.field_v = ra.field_c.d(-101);
                        tl.a(-59);
                        nh.field_e = false;
                        return hc.field_c;
                      } else {
                        var9_ref = ra.field_c.b(true);
                        if (var9_ref == null) {
                          tl.a(-59);
                          nh.field_e = false;
                          return hc.field_c;
                        } else {
                          jb.a(true, var9_ref, m.c(true));
                          tl.a(-59);
                          nh.field_e = false;
                          return hc.field_c;
                        }
                      }
                    }
                  } else {
                    L18: {
                      if (null != sp.field_c) {
                        break L18;
                      } else {
                        if (!nh.field_e) {
                          var9 = an.field_E;
                          an.field_E = l.field_b;
                          nh.field_e = true;
                          l.field_b = var9;
                          break L18;
                        } else {
                          if (30000L >= b.a(119)) {
                            tp.field_v = fc.field_l;
                            nh.field_e = false;
                            return 249;
                          } else {
                            tp.field_v = lh.field_r;
                            nh.field_e = false;
                            return 249;
                          }
                        }
                      }
                    }
                    return -1;
                  }
                }
              } else {
                if (pd.field_A == sd.field_G) {
                  if (!kh.d((byte) -75)) {
                    L19: {
                      if (null != sp.field_c) {
                        break L19;
                      } else {
                        if (!nh.field_e) {
                          var9 = an.field_E;
                          an.field_E = l.field_b;
                          nh.field_e = true;
                          l.field_b = var9;
                          break L19;
                        } else {
                          if (30000L >= b.a(119)) {
                            tp.field_v = fc.field_l;
                            nh.field_e = false;
                            return 249;
                          } else {
                            tp.field_v = lh.field_r;
                            nh.field_e = false;
                            return 249;
                          }
                        }
                      }
                    }
                    return -1;
                  } else {
                    if ((hc.field_c ^ -1) != -256) {
                      tp.field_v = ra.field_c.d(-101);
                      tl.a(-59);
                      nh.field_e = false;
                      return hc.field_c;
                    } else {
                      var9_ref = ra.field_c.b(true);
                      if (var9_ref == null) {
                        tl.a(-59);
                        nh.field_e = false;
                        return hc.field_c;
                      } else {
                        jb.a(true, var9_ref, m.c(true));
                        tl.a(-59);
                        nh.field_e = false;
                        return hc.field_c;
                      }
                    }
                  }
                } else {
                  L20: {
                    if (null != sp.field_c) {
                      break L20;
                    } else {
                      if (!nh.field_e) {
                        var9 = an.field_E;
                        an.field_E = l.field_b;
                        nh.field_e = true;
                        l.field_b = var9;
                        break L20;
                      } else {
                        if (30000L >= b.a(119)) {
                          tp.field_v = fc.field_l;
                          nh.field_e = false;
                          return 249;
                        } else {
                          tp.field_v = lh.field_r;
                          nh.field_e = false;
                          return 249;
                        }
                      }
                    }
                  }
                  return -1;
                }
              }
            } else {
              if (pd.field_A == sd.field_G) {
                if (!kh.d((byte) -75)) {
                  L21: {
                    if (null != sp.field_c) {
                      break L21;
                    } else {
                      if (!nh.field_e) {
                        var9 = an.field_E;
                        an.field_E = l.field_b;
                        nh.field_e = true;
                        l.field_b = var9;
                        break L21;
                      } else {
                        if (30000L >= b.a(119)) {
                          tp.field_v = fc.field_l;
                          nh.field_e = false;
                          return 249;
                        } else {
                          tp.field_v = lh.field_r;
                          nh.field_e = false;
                          return 249;
                        }
                      }
                    }
                  }
                  return -1;
                } else {
                  if ((hc.field_c ^ -1) != -256) {
                    tp.field_v = ra.field_c.d(-101);
                    tl.a(-59);
                    nh.field_e = false;
                    return hc.field_c;
                  } else {
                    var9_ref = ra.field_c.b(true);
                    if (var9_ref == null) {
                      tl.a(-59);
                      nh.field_e = false;
                      return hc.field_c;
                    } else {
                      jb.a(true, var9_ref, m.c(true));
                      tl.a(-59);
                      nh.field_e = false;
                      return hc.field_c;
                    }
                  }
                }
              } else {
                L22: {
                  if (null != sp.field_c) {
                    break L22;
                  } else {
                    if (!nh.field_e) {
                      var9 = an.field_E;
                      an.field_E = l.field_b;
                      nh.field_e = true;
                      l.field_b = var9;
                      break L22;
                    } else {
                      L23: {
                        if (30000L >= b.a(119)) {
                          tp.field_v = fc.field_l;
                          break L23;
                        } else {
                          tp.field_v = lh.field_r;
                          break L23;
                        }
                      }
                      nh.field_e = false;
                      return 249;
                    }
                  }
                }
                return -1;
              }
            }
          }
        } else {
          L24: {
            if (no.field_c != pd.field_A) {
              break L24;
            } else {
              L25: {
                fj.field_e = null;
                ac.field_B.field_o = 0;
                if (param4 != null) {
                  L26: {
                    var9 = 0;
                    if (!param6) {
                      break L26;
                    } else {
                      var9 = var9 | 1;
                      break L26;
                    }
                  }
                  L27: {
                    ta.field_c.field_o = 0;
                    ta.field_c.a((byte) 63, bl.field_i.nextInt());
                    ta.field_c.a((byte) 63, bl.field_i.nextInt());
                    ta.field_c.a(2, var14);
                    ta.field_c.a(2, var8);
                    var15 = (CharSequence) (Object) param4;
                    ta.field_c.a(2, qf.a(var15, -1));
                    ta.field_c.i(param1, -86);
                    ta.field_c.a(6, param2);
                    ta.field_c.a(6, var9);
                    ac.field_B.a(6, 18);
                    ac.field_B.field_o = ac.field_B.field_o + 2;
                    var10 = ac.field_B.field_o;
                    var11_ref = oj.a(m.c(true), (byte) -21);
                    if (var11_ref != null) {
                      break L27;
                    } else {
                      var11_ref = "";
                      break L27;
                    }
                  }
                  ac.field_B.b(var11_ref, (byte) -20);
                  of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -120, ta.field_c);
                  ac.field_B.b(-var10 + ac.field_B.field_o, 1);
                  break L25;
                } else {
                  L28: {
                    ta.field_c.field_o = 0;
                    ta.field_c.a((byte) 63, bl.field_i.nextInt());
                    ta.field_c.a((byte) 63, bl.field_i.nextInt());
                    stackOut_5_0 = ta.field_c;
                    stackOut_5_1 = 2;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (!param0.a((byte) -102)) {
                      stackOut_7_0 = (ec) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = "";
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L28;
                    } else {
                      stackOut_6_0 = (ec) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = (String) var14;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L28;
                    }
                  }
                  L29: {
                    ((ec) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2);
                    stackOut_8_0 = ta.field_c;
                    stackOut_8_1 = 2;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (param3.a((byte) 123)) {
                      stackOut_10_0 = (ec) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (String) var8;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L29;
                    } else {
                      stackOut_9_0 = (ec) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = "";
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L29;
                    }
                  }
                  ((ec) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2);
                  ac.field_B.a(6, 16);
                  ac.field_B.field_o = ac.field_B.field_o + 1;
                  var9 = ac.field_B.field_o;
                  of.a((ec) (Object) ac.field_B, kd.field_d, om.field_c, (byte) -116, ta.field_c);
                  ac.field_B.c(ac.field_B.field_o + -var9, -1);
                  break L25;
                }
              }
              op.a(0, -1);
              pd.field_A = kp.field_b;
              break L24;
            }
          }
          L30: {
            if (pd.field_A == kp.field_b) {
              if (!oi.a(-12929, 1)) {
                break L30;
              } else {
                L31: {
                  var9 = ra.field_c.c(true);
                  ra.field_c.field_o = 0;
                  if (var9 < 100) {
                    break L31;
                  } else {
                    if (105 < var9) {
                      break L31;
                    } else {
                      pd.field_A = jg.field_a;
                      mf.field_c = new String[-100 + var9];
                      break L30;
                    }
                  }
                }
                if (248 == var9) {
                  np.a((byte) -126, m.c(true));
                  tp.field_v = m.field_f;
                  tl.a(-84);
                  nh.field_e = false;
                  return var9;
                } else {
                  if (99 == var9) {
                    boolean discarded$3 = oi.a(-12929, la.a(23940));
                    fj.field_e = new Boolean(fm.a((ec) (Object) ra.field_c, -127));
                    ra.field_c.field_o = 0;
                    break L30;
                  } else {
                    nj.field_b = -1;
                    hc.field_c = var9;
                    pd.field_A = sd.field_G;
                    break L30;
                  }
                }
              }
            } else {
              break L30;
            }
          }
          L32: {
            if (pd.field_A == jg.field_a) {
              var9 = 2;
              if (oi.a(-12929, var9)) {
                var10 = ra.field_c.k(0);
                ra.field_c.field_o = 0;
                if (oi.a(-12929, var10)) {
                  var11 = mf.field_c.length;
                  var12 = 0;
                  L33: while (true) {
                    if (var11 <= var12) {
                      tl.a(-60);
                      nh.field_e = false;
                      return var11 + 100;
                    } else {
                      mf.field_c[var12] = ra.field_c.a(-21030);
                      var12++;
                      continue L33;
                    }
                  }
                } else {
                  break L32;
                }
              } else {
                break L32;
              }
            } else {
              break L32;
            }
          }
          if (pd.field_A == sd.field_G) {
            if (!kh.d((byte) -75)) {
              if (null == sp.field_c) {
                if (nh.field_e) {
                  if (30000L < b.a(119)) {
                    tp.field_v = lh.field_r;
                    nh.field_e = false;
                    return 249;
                  } else {
                    tp.field_v = fc.field_l;
                    nh.field_e = false;
                    return 249;
                  }
                } else {
                  var9 = an.field_E;
                  an.field_E = l.field_b;
                  nh.field_e = true;
                  l.field_b = var9;
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              if ((hc.field_c ^ -1) == -256) {
                var9_ref = ra.field_c.b(true);
                if (var9_ref != null) {
                  jb.a(true, var9_ref, m.c(true));
                  tl.a(-59);
                  nh.field_e = false;
                  return hc.field_c;
                } else {
                  tl.a(-59);
                  nh.field_e = false;
                  return hc.field_c;
                }
              } else {
                tp.field_v = ra.field_c.d(-101);
                tl.a(-59);
                nh.field_e = false;
                return hc.field_c;
              }
            }
          } else {
            if (null == sp.field_c) {
              if (nh.field_e) {
                L34: {
                  if (30000L >= b.a(119)) {
                    tp.field_v = fc.field_l;
                    break L34;
                  } else {
                    tp.field_v = lh.field_r;
                    break L34;
                  }
                }
                nh.field_e = false;
                return 249;
              } else {
                var9 = an.field_E;
                an.field_E = l.field_b;
                nh.field_e = true;
                l.field_b = var9;
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 > -8) {
          op.a((byte) -85);
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Dark Elf Assassin";
        field_a = "Orb points: ";
    }
}
