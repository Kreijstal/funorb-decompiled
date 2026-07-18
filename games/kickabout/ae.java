/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends wj implements qu, vh, ur {
    private mr field_E;
    static ut[][][] field_C;
    static ut field_H;
    private wi field_Q;
    private wi field_F;
    private mr field_K;
    static vl field_I;
    static String field_P;
    static int field_G;
    static String field_M;
    private lb field_R;
    private mr field_N;
    static tv field_D;
    private mr field_S;
    private mr field_T;
    private mr field_J;
    private qk field_O;
    fr field_L;

    final void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            ((ae) this).field_Q.field_y = this.k(-123);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ae.P(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ut a(boolean param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        ut var5_ref = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        ut var7_ref_ut = null;
        int var7 = 0;
        int var8 = 0;
        ut var8_ref_ut = null;
        int[] var8_ref_int__ = null;
        int var9 = 0;
        ut var9_ref_ut = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        ut stackIn_12_2 = null;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        ut stackIn_16_2 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        ut stackIn_20_2 = null;
        ut stackIn_95_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        ut stackOut_11_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        ut stackOut_9_2 = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        ut stackOut_15_2 = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        ut stackOut_13_2 = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        ut stackOut_19_2 = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        ut stackOut_17_2 = null;
        ut stackOut_94_0 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var6 = 0;
                if (param3 == -1) {
                  break L2;
                } else {
                  L3: {
                    if (param3 != -2) {
                      break L3;
                    } else {
                      var5_ref = nm.a(param4, -85, lb.field_L);
                      iw.a(98, var5_ref);
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    stackOut_6_0 = param4;
                    stackOut_6_1 = param1 + -62;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_11_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (param0) {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = gu.field_zb;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L4;
                    } else {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackOut_9_0 = stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = uv.field_m;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_12_2 = stackOut_9_2;
                      break L4;
                    }
                  }
                  L5: {
                    var7_ref_ut = nm.a(stackIn_12_0, stackIn_12_1, stackIn_12_2);
                    stackOut_12_0 = param4;
                    stackOut_12_1 = -95;
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_15_1 = stackOut_12_1;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    if (param0) {
                      stackOut_15_0 = stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = (ut) field_H;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      break L5;
                    } else {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = uj.field_B;
                      stackIn_16_0 = stackOut_13_0;
                      stackIn_16_1 = stackOut_13_1;
                      stackIn_16_2 = stackOut_13_2;
                      break L5;
                    }
                  }
                  L6: {
                    var8_ref_ut = nm.a(stackIn_16_0, stackIn_16_1, stackIn_16_2);
                    stackOut_16_0 = param4;
                    stackOut_16_1 = -113;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (!param0) {
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = mf.field_Cb;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L6;
                    } else {
                      stackOut_17_0 = stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = fv.field_b;
                      stackIn_20_0 = stackOut_17_0;
                      stackIn_20_1 = stackOut_17_1;
                      stackIn_20_2 = stackOut_17_2;
                      break L6;
                    }
                  }
                  var9_ref_ut = nm.a(stackIn_20_0, stackIn_20_1, stackIn_20_2);
                  var5_ref = new ut(param3, var7_ref_ut.field_v);
                  iw.a(-116, var5_ref);
                  var9_ref_ut.d(var5_ref.field_o - var9_ref_ut.field_o, 0);
                  var10 = var7_ref_ut.field_o;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var10 >= var5_ref.field_o - var9_ref_ut.field_o) {
                          break L9;
                        } else {
                          var8_ref_ut.d(var10, 0);
                          var10 = var10 + var8_ref_ut.field_o;
                          if (var11 != 0) {
                            break L8;
                          } else {
                            if (var11 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      var6 = 1;
                      var7_ref_ut.d(0, 0);
                      break L8;
                    }
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5_ref = nm.a(param4, -74, ll.field_m);
              iw.a(param1 + 13, var5_ref);
              break L1;
            }
            L10: {
              L11: {
                L12: {
                  pt.a(-3 + on.field_g, -22914, 3, on.field_f - 3, 3);
                  if (param2 != 0) {
                    break L12;
                  } else {
                    if (var6 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (1 == param2) {
                    break L13;
                  } else {
                    L14: {
                      if (2 != param2) {
                        break L14;
                      } else {
                        ta.e(param1 ^ -69);
                        ta.e(123);
                        var7_ref_ut = var5_ref;
                        var5_ref = new ut(var5_ref.field_o, var5_ref.field_v);
                        iw.a(-45, var5_ref);
                        eo.a(var7_ref_ut, 0, 0, 230);
                        pt.a(-3 + on.field_g, -22914, 3, on.field_f + -3, 3);
                        var8_ref_int__ = new int[64];
                        var9 = 0;
                        L15: while (true) {
                          L16: {
                            L17: {
                              if (~var9 <= ~var8_ref_int__.length) {
                                break L17;
                              } else {
                                var8_ref_int__[var9] = 197379 * var9;
                                var9++;
                                if (var11 != 0) {
                                  break L16;
                                } else {
                                  if (var11 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            nh.a(4, 6, on.field_g, 6, 8, -40 + var8_ref_int__.length, var8_ref_int__);
                            break L16;
                          }
                          if (var11 == 0) {
                            break L10;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if (3 == param2) {
                      nh.a(var5_ref, 0.0, 0.0, 0.7);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L13;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                iw.a(109, var5_ref);
                var5_ref.c(0, 0, 60);
                ta.e(param1 + 174);
                var7_ref_int__ = new int[64];
                var8 = 0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (var7_ref_int__.length <= var8) {
                        break L20;
                      } else {
                        var7_ref_int__[var8] = 197379 * var8;
                        var8++;
                        if (var11 != 0) {
                          break L19;
                        } else {
                          if (var11 == 0) {
                            continue L18;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    nh.a(4, 6, on.field_g - 4, 6, 8, -40 + var7_ref_int__.length, var7_ref_int__);
                    break L19;
                  }
                  if (var11 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              var7_ref_int__ = new int[64];
              var8 = 0;
              L21: while (true) {
                L22: {
                  L23: {
                    if (~var8 <= ~var7_ref_int__.length) {
                      break L23;
                    } else {
                      var7_ref_int__[var8] = 263172 * var8;
                      var8++;
                      if (var11 != 0) {
                        break L22;
                      } else {
                        if (var11 == 0) {
                          continue L21;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  nh.a(10, 6, on.field_g + -10, 6, 6, 8, var7_ref_int__);
                  break L22;
                }
                nh.a(10, 8, on.field_g + -10, 8, 6, 8, var7_ref_int__);
                break L10;
              }
            }
            L24: {
              L25: {
                ta.e(117);
                if (param3 != -1) {
                  break L25;
                } else {
                  kh.field_r.c(0, 0, 16);
                  if (var11 == 0) {
                    break L24;
                  } else {
                    break L25;
                  }
                }
              }
              L26: {
                if (param3 == -2) {
                  break L26;
                } else {
                  if (!param0) {
                    tt.field_e.c(0, 0, 16);
                    pt.a(on.field_g + -cg.field_K.field_o, -22914, 0, on.field_f, 0);
                    var7 = tt.field_e.field_o;
                    L27: while (true) {
                      L28: {
                        L29: {
                          if (on.field_g + -cg.field_K.field_o <= var7) {
                            break L29;
                          } else {
                            ah.field_l.c(var7, 0, 16);
                            var7 = var7 + ah.field_l.field_o;
                            if (var11 != 0) {
                              break L28;
                            } else {
                              if (var11 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                        ta.e(124);
                        cg.field_K.c(var5_ref.field_o + -cg.field_K.field_o, 0, 16);
                        break L28;
                      }
                      if (var11 == 0) {
                        break L24;
                      } else {
                        break L26;
                      }
                    }
                  } else {
                    break L24;
                  }
                }
              }
              ap.field_l.c(0, 0, 16);
              break L24;
            }
            L30: {
              if (param1 == -52) {
                break L30;
              } else {
                field_D = null;
                break L30;
              }
            }
            ta.e(117);
            stackOut_94_0 = (ut) var5_ref;
            stackIn_95_0 = stackOut_94_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "ae.AB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_95_0;
    }

    private final int a(int param0, String param1, int param2, int param3, fd param4) {
        cg var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 21621) {
                break L1;
              } else {
                ((ae) this).field_Q = null;
                break L1;
              }
            }
            var6 = new cg(20, param3, param0 + 120, 25, param4, false, 120, 3, gf.field_a, 16777215, param1);
            ((ae) this).a(-54, (fd) (Object) var6);
            stackOut_3_0 = var6.field_i;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6_ref;
            stackOut_5_1 = new StringBuilder().append("ae.CB(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    public ae() {
        super(0, 0, 496, 0, (gj) null);
        RuntimeException var1 = null;
        int var1_int = 0;
        String var2 = null;
        int var3 = 0;
        cg var4 = null;
        qv var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((ae) this).field_E = new mr("", (jv) null, 12);
            ((ae) this).field_S = new mr("", (jv) null, 100);
            ((ae) this).field_K = new mr("", (jv) null, 100);
            ((ae) this).field_T = new mr("", (jv) null, 20);
            ((ae) this).field_N = new mr("", (jv) null, 20);
            ((ae) this).field_J = new mr("", (jv) null, 3);
            var1_int = 1;
            ((ae) this).field_O = new qk("", (jv) null, var1_int != 0);
            ((ae) this).field_Q = new wi(ph.field_c, (jv) null);
            ((ae) this).field_F = new wi(vb.field_e, (jv) null);
            ((ae) this).field_E.field_u = sr.field_b;
            ((ae) this).field_S.field_u = gi.field_Bb;
            ((ae) this).field_K.field_u = aw.field_G;
            ((ae) this).field_T.field_u = od.field_o;
            ((ae) this).field_N.field_u = hd.field_Z;
            ((ae) this).field_J.field_u = lu.field_r;
            ((ae) this).field_O.field_u = le.field_b;
            ((ae) this).field_E.a(6, (l) (Object) new bv((ga) (Object) ((ae) this).field_E));
            ((ae) this).field_S.a(6, (l) (Object) new qo((ga) (Object) ((ae) this).field_S));
            ((ae) this).field_K.a(6, (l) (Object) new mh((ga) (Object) ((ae) this).field_K, (ga) (Object) ((ae) this).field_S));
            ((ae) this).field_T.a(6, (l) (Object) new lo((ga) (Object) ((ae) this).field_T, (ga) (Object) ((ae) this).field_E, (ga) (Object) ((ae) this).field_S));
            ((ae) this).field_N.a(6, (l) (Object) new ge((ga) (Object) ((ae) this).field_N, (ga) (Object) ((ae) this).field_T));
            ((ae) this).field_J.a(6, (l) (Object) new fo((ga) (Object) ((ae) this).field_J));
            ((ae) this).field_Q.field_y = false;
            ((ae) this).field_Q.field_r = (gj) (Object) new op();
            ((ae) this).field_F.field_r = (gj) (Object) new cr();
            ((ae) this).field_E.field_r = (gj) (Object) new ri(10000536);
            ri dupTemp$2 = new ri(10000536);
            ((ae) this).field_K.field_r = (gj) (Object) dupTemp$2;
            ((ae) this).field_S.field_r = (gj) (Object) dupTemp$2;
            ((ae) this).field_J.field_r = (gj) (Object) new ri(10000536);
            ((ae) this).field_O.field_r = (gj) (Object) new mn();
            rp dupTemp$3 = new rp(10000536);
            ((ae) this).field_N.field_r = (gj) (Object) dupTemp$3;
            ((ae) this).field_T.field_r = (gj) (Object) dupTemp$3;
            var2 = vo.a((byte) -18, mf.field_Ab, new String[2]);
            var3 = 20;
            var3 = var3 + this.a(170, si.field_i, 21621, var3, (fd) (Object) ((ae) this).field_S);
            var3 = var3 + (5 + this.a(20, true, ah.field_n, (fd) (Object) ((ae) this).field_K, 170, "", var3));
            var3 = var3 + this.a(170, at.field_Ib, 21621, var3, (fd) (Object) ((ae) this).field_T);
            var3 = var3 + (this.a((fd) (Object) ((ae) this).field_N, fa.field_h, 35, 170, var3, ev.field_A) + 5);
            var3 = var3 + (this.a((fd) (Object) ((ae) this).field_E, ua.field_f, 35, 170, var3, jk.field_i) - -5);
            var3 = var3 + this.a(var3, pl.field_a, 170, (fd) (Object) ((ae) this).field_J, (byte) 117);
            var4 = new cg(46, var3, -90 + ((ae) this).field_n, 25, (fd) (Object) ((ae) this).field_O, true, ((ae) this).field_n + -120, 5, qo.field_k, 11579568, pn.field_v);
            ((ae) this).a(-35, (fd) (Object) var4);
            var3 = var3 + var4.field_i;
            var5 = new qv(gf.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, gf.field_a.field_G, -1, 2147483647, true);
            ((ae) this).field_R = new lb(var2, (gj) (Object) var5);
            ((ae) this).field_R.field_u = "";
            ((ae) this).field_R.a(fa.field_e, 0, 12082);
            ((ae) this).field_R.a(fa.field_e, 1, 12082);
            ((ae) this).field_R.field_k = (jv) this;
            ((ae) this).field_R.c(-1, ((ae) this).field_n - 90, 46, var3);
            var3 = var3 + (15 + ((ae) this).field_R.field_i);
            ((ae) this).a(-45, (fd) (Object) ((ae) this).field_R);
            var6 = 4;
            var7 = 200;
            ((ae) this).field_Q.a(40, 1, -var7 + 496 >> -588580671, var7, var3);
            ((ae) this).field_F.a(40, 1, 3 + var6, 60, var3 - -15);
            ((ae) this).field_F.field_k = (jv) this;
            ((ae) this).field_Q.field_k = (jv) this;
            ((ae) this).a(-106, (fd) (Object) ((ae) this).field_Q);
            ((ae) this).a(-29, (fd) (Object) ((ae) this).field_F);
            ((ae) this).field_L = new fr((ur) this);
            ((ae) this).field_L.a(150, 1, 60 + ((ae) this).field_E.field_n + ((ae) this).field_E.field_t, ((ae) this).field_n + -((ae) this).field_E.field_t + (-((ae) this).field_E.field_n - 60), ((ae) this).field_E.field_g + 20);
            ((ae) this).a(-56, (fd) (Object) ((ae) this).field_L);
            ((ae) this).a(var6 + (55 + var3), 1, 0, 496, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ae.<init>()");
        }
    }

    private final int a(int param0, boolean param1, String param2, fd param3, int param4, String param5, int param6) {
        cg var8 = null;
        RuntimeException var8_ref = null;
        ju var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var8 = new cg(20, param6, 120 - -param4, 25, param3, false, 120, 3, gf.field_a, 16777215, param2);
            if (param1) {
              ((ae) this).a(-84, (fd) (Object) var8);
              var9 = new ju(((cw) (Object) param3).a((byte) -128), param5, 126, var8.field_i + param6, 50 + param4, param0);
              var9.field_k = (jv) this;
              ((ae) this).a(-42, (fd) (Object) var9);
              stackOut_3_0 = var8.field_i - -var9.field_i;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -97;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8_ref;
            stackOut_5_1 = new StringBuilder().append("ae.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param4).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param6 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(int param0) {
        if (param0 != -1) {
            return;
        }
        try {
            ((bv) (Object) ((ae) this).field_E.a((byte) -110)).c((byte) 92);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ae.D(" + param0 + ')');
        }
    }

    public final void a(lb param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 != 0) {
                  break L2;
                } else {
                  rb.a((byte) -51, "terms.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (1 != param2) {
                  break L3;
                } else {
                  rb.a((byte) -51, "privacy.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (2 != param2) {
                break L1;
              } else {
                rb.a((byte) -51, "conduct.ws");
                break L1;
              }
            }
            L4: {
              if (param3 >= 7) {
                break L4;
              } else {
                boolean discarded$2 = this.k(-42);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("ae.VA(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        try {
            field_M = null;
            field_I = null;
            field_C = null;
            field_D = null;
            field_P = null;
            field_H = null;
            int var1_int = 0 / ((param0 - -32) / 50);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ae.H(" + param0 + ')');
        }
    }

    private final boolean k(int param0) {
        RuntimeException var2 = null;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            L1: {
              if (!this.a((cw) (Object) ((ae) this).field_E, 120)) {
                break L1;
              } else {
                if (!this.a((cw) (Object) ((ae) this).field_S, 120)) {
                  break L1;
                } else {
                  if (!this.a((cw) (Object) ((ae) this).field_K, 120)) {
                    break L1;
                  } else {
                    if (!this.a((cw) (Object) ((ae) this).field_T, 120)) {
                      break L1;
                    } else {
                      if (!this.a((cw) (Object) ((ae) this).field_N, 120)) {
                        break L1;
                      } else {
                        if (!this.a((cw) (Object) ((ae) this).field_J, 120)) {
                          break L1;
                        } else {
                          L2: {
                            if (param0 < -108) {
                              break L2;
                            } else {
                              ae.a((byte) 127);
                              break L2;
                            }
                          }
                          stackOut_23_0 = 1;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            return stackIn_19_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ae.M(" + param0 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final static void m(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= ns.field_a) {
                  break L2;
                } else {
                  ns.field_a = ns.field_a - 1;
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (fj.field_a <= 0) {
                  break L3;
                } else {
                  fj.field_a = fj.field_a - 1;
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (0 >= ee.field_b) {
                break L1;
              } else {
                ee.field_b = ee.field_b - 1;
                break L1;
              }
            }
            L4: {
              if (param0 == -19417) {
                break L4;
              } else {
                field_I = null;
                break L4;
              }
            }
            L5: {
              if (ns.field_a > 0) {
                pa.b((byte) 82);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (fj.field_a <= 0) {
                break L6;
              } else {
                dw.a(param0 + 19335, fj.field_a);
                break L6;
              }
            }
            L7: {
              if (ee.field_b > 0) {
                dw.a(125, ee.field_b);
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ae.WA(" + param0 + ')');
        }
    }

    private final boolean h(byte param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        Throwable decompiledCaughtException = null;
        boolean stackOut_10_0 = false;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -82) {
                break L1;
              } else {
                int discarded$2 = this.a(-122, true, (String) null, (fd) null, 3, (String) null, -84);
                break L1;
              }
            }
            if (this.k(-112)) {
              var2_int = -1;
              try {
                L2: {
                  var2_int = Integer.parseInt(((ae) this).field_J.field_q);
                  break L2;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
                  break L3;
                }
              }
              stackOut_10_0 = gp.a((byte) 117, ((ae) this).field_S.field_q, ((ae) this).field_O.field_A, ((ae) this).field_E.field_q, (ae) this, var2_int, ((ae) this).field_T.field_q);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ae.J(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    private final int a(fd param0, String param1, int param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 35) {
                break L1;
              } else {
                ae.m(-40);
                break L1;
              }
            }
            stackOut_3_0 = this.a(35, true, param1, param0, param3, param5, param4);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("ae.BB(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 64) {
                break L1;
              } else {
                ae.a((byte) -10);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ae) this).field_F != param1) {
                  break L3;
                } else {
                  jk.a((byte) -125);
                  if (Kickabout.field_G == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1 != ((ae) this).field_Q) {
                break L2;
              } else {
                boolean discarded$2 = this.h((byte) -104);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("ae.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final String l(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                ((ae) this).field_J = null;
                break L1;
              }
            }
            stackOut_3_0 = "</col></u>";
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ae.K(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final String b(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_M = null;
                break L1;
              }
            }
            stackOut_3_0 = "<u=2164A2><col=2164A2>";
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ae.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(int param0, String param1, int param2, fd param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        cg var7 = null;
        gb var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var6_int = 94 / ((10 - param4) / 49);
            var7 = new cg(20, param0, param2 + 120, 25, param3, false, 120, 3, gf.field_a, 16777215, param1);
            ((ae) this).a(-111, (fd) (Object) var7);
            var8 = new gb(((cw) (Object) param3).a((byte) -117));
            ((ae) this).a(-48, (fd) (Object) var8);
            var8.a(15, 1, 3 + (var7.field_n + var7.field_t), 15, var7.field_g - -(var7.field_i - 15 >> -131033951));
            stackOut_0_0 = var7.field_i;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ae.L(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_16_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (super.a(param0, (byte) -126, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param1 < -60) {
                if (param3 != 98) {
                  if (param3 == 99) {
                    stackOut_14_0 = ((ae) this).b(param2, (byte) 123);
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = ((ae) this).a(param2, (byte) -100);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("ae.E(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private final boolean a(cw param0, int param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var3 = param0.a((byte) -126);
              if (param1 == 120) {
                break L1;
              } else {
                field_P = null;
                break L1;
              }
            }
            if (null != var3) {
              var4 = var3.c(param1 ^ -24367);
              if (var4 != jt.field_Bb) {
                if (mn.field_c != var4) {
                  if (var4 != os.field_l) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("ae.I(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public final void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        mr var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((ae) this).field_E;
              var4 = param0;
              ((ga) (Object) var3).a(var4, (byte) -17, false);
              if (param1 == 15) {
                break L1;
              } else {
                int discarded$3 = this.a(24, false, (String) null, (fd) null, 103, (String) null, 84);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ae.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "<%0> (og)";
        field_M = "This player's stats are maxed out.<br>He no longer earns experience";
        field_I = new vl("usename");
    }
}
