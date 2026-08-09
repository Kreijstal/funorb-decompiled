/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends id {
    static int field_N;
    static int field_O;
    static ja[] field_M;
    private uj field_R;
    static String field_G;
    static boolean field_J;
    private String field_P;
    private int field_F;
    static th field_K;
    static char field_I;
    private uj field_L;
    static cj field_H;

    final static uj b(int param0, int param1) {
        wj var2 = new wj(param1);
        var2.field_m.g(param0);
        fd.field_M.a(var2, false);
        return var2.field_m;
    }

    final static void i(int param0) {
        dm var1 = null;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ej.field_n = null;
                        mh.field_c = null;
                        la.field_k = false;
                        if (cg.field_i != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        cg.field_i.e(-30986);
                        cg.field_i = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        hq.field_c = null;
                        if (tn.field_C == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        tn.field_C.e(-30986);
                        tn.field_C = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        af.field_h = null;
                        if (null == nh.field_g) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        nh.field_g.e(-30986);
                        nh.field_g = null;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        kp.field_o = null;
                        if (hq.field_c != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var1 = (dm) ((Object) hq.field_c.a((byte) 7));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var1 == null) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var1.a(param0 ^ 32692);
                        var1 = (dm) ((Object) hq.field_c.c((byte) 97));
                        if (var2 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var2 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        hq.field_c = null;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param0 == -28264) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        field_M = (ja[]) null;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1_ref), "wc.L(" + param0 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void g(byte param0) {
        if (param0 != -66) {
          wc.a(62, false);
          field_H = null;
          field_M = null;
          field_K = null;
          field_G = null;
          return;
        } else {
          field_H = null;
          field_M = null;
          field_K = null;
          field_G = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_79_1 = 0;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_123_1 = 0;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_151_0 = 0;
        int stackIn_154_1 = 0;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_167_1 = 0;
        int stackIn_168_1 = 0;
        int stackIn_168_2 = 0;
        int var2;
        hi.h(2);
        if (null != mh.field_c) {
          if (-3 == (mh.field_c.field_cc ^ -1)) {
            var2 = 1;
            stackIn_151_0 = 1;

            if (!hh.field_b) {


              if (cp.field_K) {
                L0: {


                  stackIn_167_1 = 1;

                  if (ib.field_a <= 50) {

                    stackIn_168_1 = stackIn_167_1;
                    stackIn_168_2 = 0;
                    break L0;
                  } else {

                    stackIn_168_1 = stackIn_167_1;
                    stackIn_168_2 = 1;
                    break L0;
                  }
                }
                L1: {
                  df.a(stackIn_151_0 != 0, stackIn_168_1 != 0, stackIn_168_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                  if (cf.field_r) {
                    ma.field_a.b((byte) -35, 57);
                    cf.field_r = false;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (uk.field_N) {
                    ma.field_a.b((byte) -35, 10);
                    uk.field_N = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (pb.field_f) {
                    qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                    pb.field_f = false;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              } else {
                L4: {


                  stackIn_154_1 = 0;

                  if (ib.field_a <= 50) {

                    stackIn_155_1 = stackIn_154_1;
                    stackIn_155_2 = 0;
                    break L4;
                  } else {

                    stackIn_155_1 = stackIn_154_1;
                    stackIn_155_2 = 1;
                    break L4;
                  }
                }
                L5: {
                  df.a(stackIn_151_0 != 0, stackIn_155_1 != 0, stackIn_155_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                  if (cf.field_r) {
                    ma.field_a.b((byte) -35, 57);
                    cf.field_r = false;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (uk.field_N) {
                    ma.field_a.b((byte) -35, 10);
                    uk.field_N = false;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (pb.field_f) {
                    qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                    pb.field_f = false;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            } else {
              stackIn_138_0 = stackIn_151_0;
              stackIn_138_1 = 1;
              L8: {




                if (ib.field_a <= 50) {


                  stackIn_141_2 = 0;
                  break L8;
                } else {


                  stackIn_141_2 = 1;
                  break L8;
                }
              }
              L9: {
                df.a(stackIn_138_0 != 0, stackIn_138_1 != 0, stackIn_141_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                if (cf.field_r) {
                  ma.field_a.b((byte) -35, 57);
                  cf.field_r = false;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (uk.field_N) {
                  ma.field_a.b((byte) -35, 10);
                  uk.field_N = false;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (pb.field_f) {
                  qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                  pb.field_f = false;
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            if (-5 == (mh.field_c.field_cc ^ -1)) {
              var2 = 1;
              stackIn_107_0 = 1;

              if (!hh.field_b) {


                if (cp.field_K) {
                  L12: {


                    stackIn_123_1 = 1;

                    if (ib.field_a <= 50) {

                      stackIn_124_1 = stackIn_123_1;
                      stackIn_124_2 = 0;
                      break L12;
                    } else {

                      stackIn_124_1 = stackIn_123_1;
                      stackIn_124_2 = 1;
                      break L12;
                    }
                  }
                  L13: {
                    df.a(stackIn_107_0 != 0, stackIn_124_1 != 0, stackIn_124_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                    if (cf.field_r) {
                      ma.field_a.b((byte) -35, 57);
                      cf.field_r = false;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (uk.field_N) {
                      ma.field_a.b((byte) -35, 10);
                      uk.field_N = false;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (pb.field_f) {
                      qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                      pb.field_f = false;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  return;
                } else {
                  L16: {


                    stackIn_110_1 = 0;

                    if (ib.field_a <= 50) {

                      stackIn_111_1 = stackIn_110_1;
                      stackIn_111_2 = 0;
                      break L16;
                    } else {

                      stackIn_111_1 = stackIn_110_1;
                      stackIn_111_2 = 1;
                      break L16;
                    }
                  }
                  L17: {
                    df.a(stackIn_107_0 != 0, stackIn_111_1 != 0, stackIn_111_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                    if (cf.field_r) {
                      ma.field_a.b((byte) -35, 57);
                      cf.field_r = false;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (uk.field_N) {
                      ma.field_a.b((byte) -35, 10);
                      uk.field_N = false;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (pb.field_f) {
                      qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                      pb.field_f = false;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  return;
                }
              } else {
                stackIn_94_0 = stackIn_107_0;
                stackIn_94_1 = 1;
                L20: {




                  if (ib.field_a <= 50) {


                    stackIn_97_2 = 0;
                    break L20;
                  } else {


                    stackIn_97_2 = 1;
                    break L20;
                  }
                }
                L21: {
                  df.a(stackIn_94_0 != 0, stackIn_94_1 != 0, stackIn_97_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                  if (cf.field_r) {
                    ma.field_a.b((byte) -35, 57);
                    cf.field_r = false;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (uk.field_N) {
                    ma.field_a.b((byte) -35, 10);
                    uk.field_N = false;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (pb.field_f) {
                    qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                    pb.field_f = false;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return;
              }
            } else {
              var2 = 0;
              stackIn_63_0 = 1;

              if (!hh.field_b) {


                if (cp.field_K) {
                  L24: {


                    stackIn_79_1 = 1;

                    if (ib.field_a <= 50) {

                      stackIn_80_1 = stackIn_79_1;
                      stackIn_80_2 = 0;
                      break L24;
                    } else {

                      stackIn_80_1 = stackIn_79_1;
                      stackIn_80_2 = 1;
                      break L24;
                    }
                  }
                  L25: {
                    df.a(stackIn_63_0 != 0, stackIn_80_1 != 0, stackIn_80_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                    if (cf.field_r) {
                      ma.field_a.b((byte) -35, 57);
                      cf.field_r = false;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (uk.field_N) {
                      ma.field_a.b((byte) -35, 10);
                      uk.field_N = false;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (pb.field_f) {
                      qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                      pb.field_f = false;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  return;
                } else {
                  L28: {


                    stackIn_66_1 = 0;

                    if (ib.field_a <= 50) {

                      stackIn_67_1 = stackIn_66_1;
                      stackIn_67_2 = 0;
                      break L28;
                    } else {

                      stackIn_67_1 = stackIn_66_1;
                      stackIn_67_2 = 1;
                      break L28;
                    }
                  }
                  L29: {
                    df.a(stackIn_63_0 != 0, stackIn_67_1 != 0, stackIn_67_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                    if (cf.field_r) {
                      ma.field_a.b((byte) -35, 57);
                      cf.field_r = false;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (uk.field_N) {
                      ma.field_a.b((byte) -35, 10);
                      uk.field_N = false;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (pb.field_f) {
                      qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                      pb.field_f = false;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  return;
                }
              } else {
                stackIn_50_0 = stackIn_63_0;
                stackIn_50_1 = 1;
                L32: {




                  if (ib.field_a <= 50) {


                    stackIn_53_2 = 0;
                    break L32;
                  } else {


                    stackIn_53_2 = 1;
                    break L32;
                  }
                }
                L33: {
                  df.a(stackIn_50_0 != 0, stackIn_50_1 != 0, stackIn_53_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                  if (cf.field_r) {
                    ma.field_a.b((byte) -35, 57);
                    cf.field_r = false;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (uk.field_N) {
                    ma.field_a.b((byte) -35, 10);
                    uk.field_N = false;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (pb.field_f) {
                    qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                    pb.field_f = false;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                return;
              }
            }
          }
        } else {
          var2 = 0;
          stackIn_17_0 = 1;

          if (!hh.field_b) {


            if (cp.field_K) {
              L36: {


                stackIn_33_1 = 1;

                if (ib.field_a <= 50) {

                  stackIn_34_1 = stackIn_33_1;
                  stackIn_34_2 = 0;
                  break L36;
                } else {

                  stackIn_34_1 = stackIn_33_1;
                  stackIn_34_2 = 1;
                  break L36;
                }
              }
              L37: {
                df.a(stackIn_17_0 != 0, stackIn_34_1 != 0, stackIn_34_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                if (cf.field_r) {
                  ma.field_a.b((byte) -35, 57);
                  cf.field_r = false;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (uk.field_N) {
                  ma.field_a.b((byte) -35, 10);
                  uk.field_N = false;
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                if (pb.field_f) {
                  qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                  pb.field_f = false;
                  break L39;
                } else {
                  break L39;
                }
              }
              return;
            } else {
              L40: {


                stackIn_20_1 = 0;

                if (ib.field_a <= 50) {

                  stackIn_21_1 = stackIn_20_1;
                  stackIn_21_2 = 0;
                  break L40;
                } else {

                  stackIn_21_1 = stackIn_20_1;
                  stackIn_21_2 = 1;
                  break L40;
                }
              }
              L41: {
                df.a(stackIn_17_0 != 0, stackIn_21_1 != 0, stackIn_21_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
                if (cf.field_r) {
                  ma.field_a.b((byte) -35, 57);
                  cf.field_r = false;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (uk.field_N) {
                  ma.field_a.b((byte) -35, 10);
                  uk.field_N = false;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (pb.field_f) {
                  qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                  pb.field_f = false;
                  break L43;
                } else {
                  break L43;
                }
              }
              return;
            }
          } else {
            stackIn_4_0 = stackIn_17_0;
            stackIn_4_1 = 1;
            L44: {




              if (ib.field_a <= 50) {


                stackIn_7_2 = 0;
                break L44;
              } else {


                stackIn_7_2 = 1;
                break L44;
              }
            }
            L45: {
              df.a(stackIn_4_0 != 0, stackIn_4_1 != 0, stackIn_7_2 != 0, -93, param0, 0, var2 != 0, 11, 13, t.field_d, 14, param1);
              if (cf.field_r) {
                ma.field_a.b((byte) -35, 57);
                cf.field_r = false;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              if (uk.field_N) {
                ma.field_a.b((byte) -35, 10);
                uk.field_N = false;
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              if (pb.field_f) {
                qf.a(1, pl.field_I, true, (byte) 93, bl.field_e);
                pb.field_f = false;
                break L47;
              } else {
                break L47;
              }
            }
            return;
          }
        }
    }

    final void f(byte param0) {
        if (param0 < -79) {
          if (0 < this.field_F) {
            this.field_F = this.field_F - 7;
            this.field_E = this.field_E - 131072;
            if (0 <= this.field_F) {
              return;
            } else {
              this.field_F = 0;
              return;
            }
          } else {
            this.a(true);
            if (ZombieDawnMulti.field_E) {
              L0: {
                this.field_F = this.field_F - 7;
                this.field_E = this.field_E - 131072;
                if (0 > this.field_F) {
                  this.field_F = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          wc.a(8, false);
          if (0 >= this.field_F) {
            this.a(true);
            if (!ZombieDawnMulti.field_E) {
              return;
            } else {
              L1: {
                this.field_F = this.field_F - 7;
                this.field_E = this.field_E - 131072;
                if (0 > this.field_F) {
                  this.field_F = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              this.field_F = this.field_F - 7;
              this.field_E = this.field_E - 131072;
              if (0 > this.field_F) {
                this.field_F = 0;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, nm param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.c(this.g(param0 ^ -10199), -20126);
              var4 = param1.d(this.h(-109), 116);
              ah.field_e.a(this.field_P, var3_int, var4, 3, -1, this.field_F);
              if (null != this.field_R) {
                L2: {
                  if (this.field_R.k()) {
                    break L2;
                  } else {
                    L3: {
                      var5 = sd.b(125, var4, var3_int);
                      this.field_R.h(var5);
                      if (this.field_L == null) {
                        break L3;
                      } else {
                        this.field_L.h(var5);
                        break L3;
                      }
                    }
                    if (!ZombieDawnMulti.field_E) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_R = null;
                this.field_L = null;
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              if (param0 == -10136) {
                break L4;
              } else {
                field_H = (cj) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("wc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static boolean j(int param0) {
        if (param0 <= 88) {
            return false;
        }
        return og.field_N;
    }

    wc(int param0, int param1, int param2, boolean param3) {
        super(param0, param1, 0);
        this.field_R = null;
        this.field_L = null;
        this.field_P = Integer.toString(param2);
        this.field_F = 255;
        if (!param3) {
            this.field_R = nm.b(-128, 55);
        }
    }

    static {
        field_J = false;
        field_I = '/';
        field_K = null;
        field_G = "achievements to collect";
        field_O = 131072;
    }
}
