/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends uj {
    static String field_x;
    static String field_i;
    private il field_q;
    private int field_f;
    private rf field_h;
    private int field_A;
    private km field_j;
    private byte[] field_y;
    static String field_l;
    private int field_p;
    static double field_u;
    private wh field_s;
    private byte[] field_n;
    private ua field_m;
    private h field_r;
    private ua field_t;
    private boolean field_o;
    private int field_z;
    private boolean field_w;
    private jj field_v;
    private jj field_k;
    private boolean field_B;
    private long field_g;

    final byte[] a(int param0, int param1) {
        rf var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1 < -62) {
              var3 = this.a(0, param0, (byte) -97);
              if (null == var3) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              } else {
                var4 = var3.b(true);
                var3.b((byte) 12);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3_ref, "tb.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1, int param2) {
        try {
            nd.field_r = param0;
            ma.field_E = param2;
            if (param1 != 21361) {
                field_u = 0.05953700668806378;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "tb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            RuntimeException var3_ref = null;
            Throwable var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_13_0 = null;
            Object stackIn_18_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            String stackOut_12_0 = null;
            Object stackOut_17_0 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = (String) cd.a((byte) -128, "getcookies", param2);
                            var4 = nc.a(14352, var3, ';');
                            var5 = 47 % ((param0 - -47) / 32);
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (~var6 <= ~var4.length) {
                                statePc = 15;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var4[var6].indexOf('=');
                            if (var8 != 0) {
                                statePc = 17;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var7 < 0) {
                                statePc = 14;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4[var6].substring(0, var7).trim().equals((Object) (Object) param1)) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = var4[var6].substring(1 + var7).trim();
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0;
                    }
                    case 14: {
                        try {
                            var6++;
                            if (var8 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var3_ref2 = caughtException;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = null;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return (String) (Object) stackIn_18_0;
                    }
                    case 19: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        stackOut_19_0 = (RuntimeException) var3_ref;
                        stackOut_19_1 = new StringBuilder().append("tb.G(").append(param0).append(',');
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param1 == null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (param2 == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                        stackOut_24_2 = "{...}";
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                        stackOut_26_2 = "null";
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        throw qk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, gd param1, gd param2, boolean param3, int param4, byte param5, int param6) {
        RuntimeException var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_11_0 = 0;
        dh stackIn_26_0 = null;
        dh stackIn_28_0 = null;
        dh stackIn_30_0 = null;
        dh stackIn_31_0 = null;
        String stackIn_31_1 = null;
        dh stackIn_32_0 = null;
        dh stackIn_34_0 = null;
        dh stackIn_35_0 = null;
        String stackIn_35_1 = null;
        int stackIn_51_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_116_2 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        dh stackOut_25_0 = null;
        dh stackOut_30_0 = null;
        String stackOut_30_1 = null;
        dh stackOut_26_0 = null;
        dh stackOut_28_0 = null;
        String stackOut_28_1 = null;
        dh stackOut_31_0 = null;
        dh stackOut_34_0 = null;
        String stackOut_34_1 = null;
        dh stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_50_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param5 == 96) {
                break L1;
              } else {
                field_u = 0.5936452060822851;
                break L1;
              }
            }
            L2: {
              var7_ref = param2.a(119);
              var8 = param1.a(param5 ^ 25);
              if (null == ig.field_e) {
                var9 = le.a(false, (byte) 109) ? 1 : 0;
                if (var9 == 0) {
                  stackOut_10_0 = -1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (va.field_e == mh.field_a) {
                L4: {
                  L5: {
                    ge.field_d = null;
                    di.field_l.field_k = 0;
                    if (param0 == null) {
                      break L5;
                    } else {
                      L6: {
                        var9 = 0;
                        if (param3) {
                          var9 = var9 | 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        nc.field_c.field_k = 0;
                        nc.field_c.e(j.field_H.nextInt(), 8959);
                        nc.field_c.e(j.field_H.nextInt(), param5 + 8863);
                        nc.field_c.b(var7_ref, -33);
                        nc.field_c.b(var8, -101);
                        nc.field_c.b(nh.a(-31621, (CharSequence) (Object) param0), -34);
                        nc.field_c.h(-1564407352, param4);
                        nc.field_c.i(param6, -115);
                        nc.field_c.i(var9, -90);
                        di.field_l.i(18, param5 ^ 21);
                        di.field_l.field_k = di.field_l.field_k + 2;
                        var10 = di.field_l.field_k;
                        var11_ref_String = kf.a(param5 ^ -120, dg.a(false));
                        if (var11_ref_String == null) {
                          var11_ref_String = "";
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      di.field_l.a(var11_ref_String, 2295);
                      ea.a(ga.field_o, nc.field_c, param5 + -96, dj.field_c, (dh) (Object) di.field_l);
                      di.field_l.g(-var10 + di.field_l.field_k, -20125);
                      if (var13 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L8: {
                    nc.field_c.field_k = 0;
                    nc.field_c.e(j.field_H.nextInt(), param5 + 8863);
                    nc.field_c.e(j.field_H.nextInt(), 8959);
                    stackOut_25_0 = nc.field_c;
                    stackIn_30_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (!param2.c(1)) {
                      stackOut_30_0 = (dh) (Object) stackIn_30_0;
                      stackOut_30_1 = "";
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L8;
                    } else {
                      stackOut_26_0 = (dh) (Object) stackIn_26_0;
                      stackIn_28_0 = stackOut_26_0;
                      stackOut_28_0 = (dh) (Object) stackIn_28_0;
                      stackOut_28_1 = (String) var7_ref;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_31_1 = stackOut_28_1;
                      break L8;
                    }
                  }
                  L9: {
                    ((dh) (Object) stackIn_31_0).b(stackIn_31_1, -86);
                    stackOut_31_0 = nc.field_c;
                    stackIn_34_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (param1.c(param5 ^ 97)) {
                      stackOut_34_0 = (dh) (Object) stackIn_34_0;
                      stackOut_34_1 = (String) var8;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L9;
                    } else {
                      stackOut_32_0 = (dh) (Object) stackIn_32_0;
                      stackOut_32_1 = "";
                      stackIn_35_0 = stackOut_32_0;
                      stackIn_35_1 = stackOut_32_1;
                      break L9;
                    }
                  }
                  ((dh) (Object) stackIn_35_0).b(stackIn_35_1, -105);
                  di.field_l.i(16, 59);
                  di.field_l.field_k = di.field_l.field_k + 1;
                  var9 = di.field_l.field_k;
                  ea.a(ga.field_o, nc.field_c, 0, dj.field_c, (dh) (Object) di.field_l);
                  di.field_l.j(di.field_l.field_k - var9, param5 + -215);
                  break L4;
                }
                bc.a(-1, param5 + -96);
                mh.field_a = ha.field_n;
                break L3;
              } else {
                break L3;
              }
            }
            L10: {
              if (mh.field_a == ha.field_n) {
                if (vc.a(param5 + -213, 1)) {
                  L11: {
                    L12: {
                      var9 = mk.field_j.a(-16384);
                      mk.field_j.field_k = 0;
                      if (var9 < 100) {
                        break L12;
                      } else {
                        if (var9 <= 105) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (var9 != 248) {
                      L13: {
                        if (var9 != 99) {
                          break L13;
                        } else {
                          boolean discarded$1 = vc.a(-111, dc.b((byte) 30));
                          ge.field_d = new Boolean(cb.a((dh) (Object) mk.field_j, 102));
                          mk.field_j.field_k = 0;
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                      mh.field_a = tf.field_d;
                      qh.field_d = -1;
                      qk.field_b = var9;
                      if (var13 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    } else {
                      ke.a(dg.a(false), (byte) 95);
                      bh.field_d = kj.field_e;
                      gb.g(-17464);
                      vj.field_Q = false;
                      stackOut_50_0 = var9;
                      stackIn_51_0 = stackOut_50_0;
                      return stackIn_51_0;
                    }
                  }
                  te.field_a = new String[-100 + var9];
                  mh.field_a = tc.field_f;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L14: {
              if (mh.field_a == tc.field_f) {
                var9 = 2;
                if (vc.a(-99, var9)) {
                  var10 = mk.field_j.i(-25578);
                  mk.field_j.field_k = 0;
                  if (vc.a(param5 ^ -32, var10)) {
                    var11 = te.field_a.length;
                    var12 = 0;
                    L15: while (true) {
                      L16: {
                        L17: {
                          if (~var12 <= ~var11) {
                            break L17;
                          } else {
                            te.field_a[var12] = mk.field_j.c((byte) 46);
                            var12++;
                            if (var13 != 0) {
                              break L16;
                            } else {
                              if (var13 == 0) {
                                continue L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        gb.g(-17464);
                        vj.field_Q = false;
                        break L16;
                      }
                      stackOut_77_0 = 100 + var11;
                      stackIn_78_0 = stackOut_77_0;
                      return stackIn_78_0;
                    }
                  } else {
                    break L14;
                  }
                } else {
                  break L14;
                }
              } else {
                break L14;
              }
            }
            L18: {
              if (tf.field_d != mh.field_a) {
                break L18;
              } else {
                if (!cm.b((byte) -98)) {
                  break L18;
                } else {
                  L19: {
                    L20: {
                      if (qk.field_b != 255) {
                        break L20;
                      } else {
                        L21: {
                          var9_ref_String = mk.field_j.j(-1915115064);
                          if (var9_ref_String != null) {
                            hk.a(var9_ref_String, (byte) 3, dg.a(false));
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        if (var13 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    bh.field_d = mk.field_j.e(-1);
                    break L19;
                  }
                  gb.g(param5 ^ -17496);
                  vj.field_Q = false;
                  stackOut_93_0 = qk.field_b;
                  stackIn_94_0 = stackOut_93_0;
                  return stackIn_94_0;
                }
              }
            }
            L22: {
              if (ig.field_e != null) {
                break L22;
              } else {
                L23: {
                  if (vj.field_Q) {
                    break L23;
                  } else {
                    var9 = sb.field_i;
                    sb.field_i = pg.field_f;
                    pg.field_f = var9;
                    vj.field_Q = true;
                    if (var13 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (30000L < ce.b(1)) {
                      break L25;
                    } else {
                      bh.field_d = cl.field_I;
                      if (var13 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  bh.field_d = qk.field_f;
                  break L24;
                }
                vj.field_Q = false;
                stackOut_108_0 = 249;
                stackIn_109_0 = stackOut_108_0;
                return stackIn_109_0;
              }
            }
            stackOut_110_0 = -1;
            stackIn_111_0 = stackOut_110_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var7 = decompiledCaughtException;
            stackOut_112_0 = (RuntimeException) var7;
            stackOut_112_1 = new StringBuilder().append("tb.K(");
            stackIn_115_0 = stackOut_112_0;
            stackIn_115_1 = stackOut_112_1;
            stackIn_113_0 = stackOut_112_0;
            stackIn_113_1 = stackOut_112_1;
            if (param0 == null) {
              stackOut_115_0 = (RuntimeException) (Object) stackIn_115_0;
              stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
              stackOut_115_2 = "null";
              stackIn_116_0 = stackOut_115_0;
              stackIn_116_1 = stackOut_115_1;
              stackIn_116_2 = stackOut_115_2;
              break L26;
            } else {
              stackOut_113_0 = (RuntimeException) (Object) stackIn_113_0;
              stackOut_113_1 = (StringBuilder) (Object) stackIn_113_1;
              stackOut_113_2 = "{...}";
              stackIn_116_0 = stackOut_113_0;
              stackIn_116_1 = stackOut_113_1;
              stackIn_116_2 = stackOut_113_2;
              break L26;
            }
          }
          L27: {
            stackOut_116_0 = (RuntimeException) (Object) stackIn_116_0;
            stackOut_116_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_116_2).append(',');
            stackIn_119_0 = stackOut_116_0;
            stackIn_119_1 = stackOut_116_1;
            stackIn_117_0 = stackOut_116_0;
            stackIn_117_1 = stackOut_116_1;
            if (param1 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L27;
            } else {
              stackOut_117_0 = (RuntimeException) (Object) stackIn_117_0;
              stackOut_117_1 = (StringBuilder) (Object) stackIn_117_1;
              stackOut_117_2 = "{...}";
              stackIn_120_0 = stackOut_117_0;
              stackIn_120_1 = stackOut_117_1;
              stackIn_120_2 = stackOut_117_2;
              break L27;
            }
          }
          L28: {
            stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
            stackOut_120_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',');
            stackIn_123_0 = stackOut_120_0;
            stackIn_123_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param2 == null) {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "null";
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              break L28;
            } else {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_124_0 = stackOut_121_0;
              stackIn_124_1 = stackOut_121_1;
              stackIn_124_2 = stackOut_121_2;
              break L28;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_124_0, stackIn_124_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_111_0;
    }

    public static void a(int param0) {
        field_x = null;
        if (param0 != -18440) {
            return;
        }
        try {
            field_i = null;
            field_l = null;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "tb.F(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rf var2_ref = null;
        uf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_14_0 = 0;
        byte stackIn_14_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_94_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        byte stackOut_13_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_93_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (param0 == -51) {
              L1: {
                if (((tb) this).field_k != null) {
                  if (((tb) this).a((byte) 105) == null) {
                    return;
                  } else {
                    L2: {
                      if (!((tb) this).field_w) {
                        break L2;
                      } else {
                        var2_int = 1;
                        var3 = ((tb) this).field_k.d(9272);
                        L3: while (true) {
                          L4: {
                            L5: {
                              L6: {
                                if (var3 == null) {
                                  break L6;
                                } else {
                                  var4 = (int)var3.field_g;
                                  stackOut_13_0 = 0;
                                  stackOut_13_1 = ((tb) this).field_n[var4];
                                  stackIn_26_0 = stackOut_13_0;
                                  stackIn_26_1 = stackOut_13_1;
                                  stackIn_14_0 = stackOut_13_0;
                                  stackIn_14_1 = stackOut_13_1;
                                  if (var5 != 0) {
                                    L7: while (true) {
                                      if (stackIn_26_0 >= stackIn_26_1) {
                                        break L5;
                                      } else {
                                        stackOut_27_0 = 0;
                                        stackIn_50_0 = stackOut_27_0;
                                        stackIn_28_0 = stackOut_27_0;
                                        if (var5 != 0) {
                                          break L4;
                                        } else {
                                          stackOut_28_0 = stackIn_28_0;
                                          stackIn_30_0 = stackOut_28_0;
                                          L8: {
                                            L9: {
                                              if (stackIn_30_0 != ((tb) this).field_j.field_d[((tb) this).field_z]) {
                                                break L9;
                                              } else {
                                                ((tb) this).field_z = ((tb) this).field_z + 1;
                                                if (var5 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            L10: {
                                              if (((tb) this).field_s.field_b >= 250) {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L5;
                                                } else {
                                                  break L10;
                                                }
                                              } else {
                                                break L10;
                                              }
                                            }
                                            L11: {
                                              if (0 == ((tb) this).field_n[((tb) this).field_z]) {
                                                rf discarded$4 = this.a(1, ((tb) this).field_z, (byte) -97);
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              if (0 != ((tb) this).field_n[((tb) this).field_z]) {
                                                break L12;
                                              } else {
                                                var3 = new uf();
                                                var3.field_g = (long)((tb) this).field_z;
                                                var2_int = 0;
                                                ((tb) this).field_k.a(var3, -16611);
                                                break L12;
                                              }
                                            }
                                            ((tb) this).field_z = ((tb) this).field_z + 1;
                                            if (var5 == 0) {
                                              break L8;
                                            } else {
                                              break L5;
                                            }
                                          }
                                          stackOut_25_0 = ((tb) this).field_z;
                                          stackOut_25_1 = ((tb) this).field_j.field_d.length;
                                          stackIn_26_0 = stackOut_25_0;
                                          stackIn_26_1 = stackOut_25_1;
                                          continue L7;
                                        }
                                      }
                                    }
                                  } else {
                                    L13: {
                                      if (stackIn_14_0 == stackIn_14_1) {
                                        rf discarded$5 = this.a(1, var4, (byte) -97);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      L15: {
                                        if (((tb) this).field_n[var4] == 0) {
                                          break L15;
                                        } else {
                                          var3.b((byte) 12);
                                          if (var5 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var2_int = 0;
                                      break L14;
                                    }
                                    var3 = ((tb) this).field_k.e((byte) -119);
                                    if (var5 == 0) {
                                      continue L3;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              L16: while (true) {
                                stackOut_25_0 = ((tb) this).field_z;
                                stackOut_25_1 = ((tb) this).field_j.field_d.length;
                                stackIn_26_0 = stackOut_25_0;
                                stackIn_26_1 = stackOut_25_1;
                                if (stackIn_26_0 >= stackIn_26_1) {
                                  break L5;
                                } else {
                                  stackOut_27_0 = 0;
                                  stackIn_50_0 = stackOut_27_0;
                                  stackIn_28_0 = stackOut_27_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    stackOut_28_0 = stackIn_28_0;
                                    stackIn_30_0 = stackOut_28_0;
                                    L17: {
                                      if (stackIn_30_0 != ((tb) this).field_j.field_d[((tb) this).field_z]) {
                                        break L17;
                                      } else {
                                        ((tb) this).field_z = ((tb) this).field_z + 1;
                                        if (var5 == 0) {
                                          continue L16;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L18: {
                                      if (((tb) this).field_s.field_b >= 250) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L5;
                                        } else {
                                          break L18;
                                        }
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (0 == ((tb) this).field_n[((tb) this).field_z]) {
                                        rf discarded$4 = this.a(1, ((tb) this).field_z, (byte) -97);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (0 != ((tb) this).field_n[((tb) this).field_z]) {
                                        break L20;
                                      } else {
                                        var3 = new uf();
                                        var3.field_g = (long)((tb) this).field_z;
                                        var2_int = 0;
                                        ((tb) this).field_k.a(var3, -16611);
                                        break L20;
                                      }
                                    }
                                    ((tb) this).field_z = ((tb) this).field_z + 1;
                                    if (var5 == 0) {
                                      continue L16;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_49_0 = var2_int;
                            stackIn_50_0 = stackOut_49_0;
                            break L4;
                          }
                          L21: {
                            if (stackIn_50_0 == 0) {
                              break L21;
                            } else {
                              ((tb) this).field_z = 0;
                              ((tb) this).field_w = false;
                              break L21;
                            }
                          }
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    L22: {
                      if (!((tb) this).field_o) {
                        break L22;
                      } else {
                        var2_int = 1;
                        var3 = ((tb) this).field_k.d(9272);
                        L23: while (true) {
                          L24: {
                            L25: {
                              L26: {
                                if (var3 == null) {
                                  break L26;
                                } else {
                                  var4 = (int)var3.field_g;
                                  stackOut_59_0 = -2;
                                  stackOut_59_1 = ~((tb) this).field_n[var4];
                                  stackIn_71_0 = stackOut_59_0;
                                  stackIn_71_1 = stackOut_59_1;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  if (var5 != 0) {
                                    L27: while (true) {
                                      if (stackIn_71_0 <= stackIn_71_1) {
                                        break L25;
                                      } else {
                                        stackOut_72_0 = -1;
                                        stackIn_94_0 = stackOut_72_0;
                                        stackIn_73_0 = stackOut_72_0;
                                        if (var5 != 0) {
                                          break L24;
                                        } else {
                                          stackOut_73_0 = stackIn_73_0;
                                          stackIn_75_0 = stackOut_73_0;
                                          L28: {
                                            L29: {
                                              if (stackIn_75_0 == ~((tb) this).field_j.field_d[((tb) this).field_z]) {
                                                ((tb) this).field_z = ((tb) this).field_z + 1;
                                                if (var5 == 0) {
                                                  break L28;
                                                } else {
                                                  break L29;
                                                }
                                              } else {
                                                break L29;
                                              }
                                            }
                                            L30: {
                                              if (((tb) this).field_r.b(true)) {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L25;
                                                } else {
                                                  break L30;
                                                }
                                              } else {
                                                break L30;
                                              }
                                            }
                                            L31: {
                                              if (((tb) this).field_n[((tb) this).field_z] == 1) {
                                                break L31;
                                              } else {
                                                rf discarded$6 = this.a(2, ((tb) this).field_z, (byte) -97);
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              if (1 == ((tb) this).field_n[((tb) this).field_z]) {
                                                break L32;
                                              } else {
                                                var3 = new uf();
                                                var3.field_g = (long)((tb) this).field_z;
                                                ((tb) this).field_k.a(var3, -16611);
                                                var2_int = 0;
                                                break L32;
                                              }
                                            }
                                            ((tb) this).field_z = ((tb) this).field_z + 1;
                                            if (var5 == 0) {
                                              break L28;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          stackOut_70_0 = ~((tb) this).field_z;
                                          stackOut_70_1 = ~((tb) this).field_j.field_d.length;
                                          stackIn_71_0 = stackOut_70_0;
                                          stackIn_71_1 = stackOut_70_1;
                                          continue L27;
                                        }
                                      }
                                    }
                                  } else {
                                    L33: {
                                      if (stackIn_60_0 != stackIn_60_1) {
                                        rf discarded$7 = this.a(2, var4, (byte) -97);
                                        break L33;
                                      } else {
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      L35: {
                                        if (((tb) this).field_n[var4] == 1) {
                                          break L35;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L34;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                      var3.b((byte) 12);
                                      break L34;
                                    }
                                    var3 = ((tb) this).field_k.e((byte) -119);
                                    if (var5 == 0) {
                                      continue L23;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              L36: while (true) {
                                stackOut_70_0 = ~((tb) this).field_z;
                                stackOut_70_1 = ~((tb) this).field_j.field_d.length;
                                stackIn_71_0 = stackOut_70_0;
                                stackIn_71_1 = stackOut_70_1;
                                if (stackIn_71_0 <= stackIn_71_1) {
                                  break L25;
                                } else {
                                  stackOut_72_0 = -1;
                                  stackIn_94_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_73_0 = stackIn_73_0;
                                    stackIn_75_0 = stackOut_73_0;
                                    L37: {
                                      if (stackIn_75_0 == ~((tb) this).field_j.field_d[((tb) this).field_z]) {
                                        ((tb) this).field_z = ((tb) this).field_z + 1;
                                        if (var5 == 0) {
                                          continue L36;
                                        } else {
                                          break L37;
                                        }
                                      } else {
                                        break L37;
                                      }
                                    }
                                    L38: {
                                      if (((tb) this).field_r.b(true)) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L25;
                                        } else {
                                          break L38;
                                        }
                                      } else {
                                        break L38;
                                      }
                                    }
                                    L39: {
                                      if (((tb) this).field_n[((tb) this).field_z] == 1) {
                                        break L39;
                                      } else {
                                        rf discarded$6 = this.a(2, ((tb) this).field_z, (byte) -97);
                                        break L39;
                                      }
                                    }
                                    L40: {
                                      if (1 == ((tb) this).field_n[((tb) this).field_z]) {
                                        break L40;
                                      } else {
                                        var3 = new uf();
                                        var3.field_g = (long)((tb) this).field_z;
                                        ((tb) this).field_k.a(var3, -16611);
                                        var2_int = 0;
                                        break L40;
                                      }
                                    }
                                    ((tb) this).field_z = ((tb) this).field_z + 1;
                                    if (var5 == 0) {
                                      continue L36;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_93_0 = var2_int;
                            stackIn_94_0 = stackOut_93_0;
                            break L24;
                          }
                          L41: {
                            if (stackIn_94_0 == 0) {
                              break L41;
                            } else {
                              ((tb) this).field_z = 0;
                              ((tb) this).field_o = false;
                              break L41;
                            }
                          }
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    ((tb) this).field_k = null;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L42: {
                if (!((tb) this).field_B) {
                  break L42;
                } else {
                  if (ll.a(1000) < ((tb) this).field_g) {
                    break L42;
                  } else {
                    var2_ref = (rf) (Object) ((tb) this).field_q.a((byte) 117);
                    L43: while (true) {
                      L44: {
                        if (var2_ref == null) {
                          break L44;
                        } else {
                          if (var5 != 0) {
                            break L42;
                          } else {
                            L45: {
                              L46: {
                                if (!var2_ref.field_A) {
                                  break L46;
                                } else {
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L47: {
                                if (var2_ref.field_C) {
                                  break L47;
                                } else {
                                  var2_ref.field_C = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              if (!var2_ref.field_x) {
                                throw new RuntimeException();
                              } else {
                                var2_ref.b((byte) 12);
                                break L45;
                              }
                            }
                            var2_ref = (rf) (Object) ((tb) this).field_q.a(true);
                            if (var5 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      ((tb) this).field_g = ll.a(1000) - -1000L;
                      break L42;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "tb.J(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                ((tb) this).field_m = null;
                break L1;
              }
            }
            if (null != ((tb) this).field_m) {
              L2: {
                ((tb) this).field_o = true;
                if (null == ((tb) this).field_k) {
                  ((tb) this).field_k = new jj();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "tb.H(" + param0 + ')');
        }
    }

    private final rf a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        Object stackIn_105_0 = null;
        Object stackIn_114_0 = null;
        byte stackIn_133_0 = 0;
        byte stackIn_133_1 = 0;
        Object stackIn_147_0 = null;
        byte stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        Object stackIn_160_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_36_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_62_0 = null;
        byte stackOut_132_0 = 0;
        byte stackOut_132_1 = 0;
        Object stackOut_146_0 = null;
        byte stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        Object stackOut_159_0 = null;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        Object stackOut_104_0 = null;
        Object stackOut_113_0 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (rf) (Object) ((tb) this).field_q.a((byte) 46, (long)param1);
              if (null == var4) {
                break L1;
              } else {
                if (0 != param0) {
                  break L1;
                } else {
                  if (((rf) var4).field_x) {
                    break L1;
                  } else {
                    if (!((rf) var4).field_A) {
                      break L1;
                    } else {
                      ((rf) var4).b((byte) 12);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (param2 == -97) {
                break L2;
              } else {
                tb.a(97);
                break L2;
              }
            }
            L3: {
              if (var4 == null) {
                L4: {
                  L5: {
                    if (0 == param0) {
                      break L5;
                    } else {
                      if (1 == param0) {
                        if (((tb) this).field_m != null) {
                          var4 = (Object) (Object) ((tb) this).field_s.a(41, param1, ((tb) this).field_m);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        L6: {
                          if (param0 != 2) {
                            break L6;
                          } else {
                            if (((tb) this).field_m == null) {
                              throw new RuntimeException();
                            } else {
                              if (((tb) this).field_n[param1] != -1) {
                                throw new RuntimeException();
                              } else {
                                if (!((tb) this).field_r.b(true)) {
                                  var4 = (Object) (Object) ((tb) this).field_r.a(param1, false, ((tb) this).field_f, (byte) 115, (byte) 2);
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  stackOut_36_0 = null;
                                  stackIn_37_0 = stackOut_36_0;
                                  return (rf) (Object) stackIn_37_0;
                                }
                              }
                            }
                          }
                        }
                        throw new RuntimeException();
                      }
                    }
                  }
                  L7: {
                    if (((tb) this).field_m == null) {
                      break L7;
                    } else {
                      if (((tb) this).field_n[param1] == -1) {
                        break L7;
                      } else {
                        var4 = (Object) (Object) ((tb) this).field_s.a(((tb) this).field_m, param1, 2);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    if (((tb) this).field_r.d(-21)) {
                      break L8;
                    } else {
                      var4 = (Object) (Object) ((tb) this).field_r.a(param1, true, ((tb) this).field_f, (byte) 110, (byte) 2);
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L8;
                      }
                    }
                  }
                  stackOut_56_0 = null;
                  stackIn_57_0 = stackOut_56_0;
                  return (rf) (Object) stackIn_57_0;
                }
                ((tb) this).field_q.a((uf) var4, (long)param1, (byte) -71);
                break L3;
              } else {
                break L3;
              }
            }
            if (((rf) var4).field_A) {
              stackOut_62_0 = null;
              stackIn_63_0 = stackOut_62_0;
              return (rf) (Object) stackIn_63_0;
            } else {
              var5 = ((rf) var4).b(true);
              if (!(var4 instanceof ma)) {
                try {
                  L9: {
                    L10: {
                      if (var5 == null) {
                        break L10;
                      } else {
                        if (var5.length <= 2) {
                          break L10;
                        } else {
                          qc.field_d.reset();
                          qc.field_d.update(var5, 0, -2 + var5.length);
                          var6_int = (int)qc.field_d.getValue();
                          if (~((tb) this).field_j.field_h[param1] != ~var6_int) {
                            throw new RuntimeException();
                          } else {
                            L11: {
                              if (null == ((tb) this).field_j.field_p) {
                                break L11;
                              } else {
                                if (((tb) this).field_j.field_p[param1] == null) {
                                  break L11;
                                } else {
                                  var7 = ((tb) this).field_j.field_p[param1];
                                  var8 = tg.a(var5, var5.length + -2, 0, 8);
                                  var9 = 0;
                                  L12: while (true) {
                                    if (var9 >= 64) {
                                      break L11;
                                    } else {
                                      stackOut_132_0 = var8[var9];
                                      stackOut_132_1 = var7[var9];
                                      stackIn_152_0 = stackOut_132_0;
                                      stackIn_152_1 = stackOut_132_1;
                                      stackIn_133_0 = stackOut_132_0;
                                      stackIn_133_1 = stackOut_132_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L9;
                                      } else {
                                        if (stackIn_133_0 != stackIn_133_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L12;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((tb) this).field_r.field_i = 0;
                            ((tb) this).field_r.field_l = 0;
                            decompiledRegionSelector0 = 1;
                            break L9;
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((tb) this).field_r.b(-12948);
                    ((rf) var4).b((byte) 12);
                    if (!((rf) var4).field_x) {
                      break L13;
                    } else {
                      if (((tb) this).field_r.d(-21)) {
                        break L13;
                      } else {
                        var4 = (Object) (Object) ((tb) this).field_r.a(param1, true, ((tb) this).field_f, (byte) 77, (byte) 2);
                        ((tb) this).field_q.a((uf) var4, (long)param1, (byte) -100);
                        break L13;
                      }
                    }
                  }
                  stackOut_146_0 = null;
                  stackIn_147_0 = stackOut_146_0;
                  return (rf) (Object) stackIn_147_0;
                }
                L14: {
                  L15: {
                    if (decompiledRegionSelector0 == 0) {
                      break L15;
                    } else {
                      var5[var5.length + -2] = (byte)(((tb) this).field_j.field_o[param1] >>> -471979064);
                      var5[var5.length + -1] = (byte)((tb) this).field_j.field_o[param1];
                      if (null != ((tb) this).field_m) {
                        ma discarded$1 = ((tb) this).field_s.a(var5, param1, param2 ^ -4723, ((tb) this).field_m);
                        stackOut_151_0 = ((tb) this).field_n[param1];
                        stackOut_151_1 = 1;
                        stackIn_152_0 = stackOut_151_0;
                        stackIn_152_1 = stackOut_151_1;
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (stackIn_152_0 != stackIn_152_1) {
                    ((tb) this).field_n[param1] = (byte) 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (!((rf) var4).field_x) {
                    ((rf) var4).b((byte) 12);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                stackOut_159_0 = var4;
                stackIn_160_0 = stackOut_159_0;
                break L0;
              } else {
                try {
                  L17: {
                    L18: {
                      if (null == var5) {
                        break L18;
                      } else {
                        if (var5.length <= 2) {
                          break L18;
                        } else {
                          qc.field_d.reset();
                          qc.field_d.update(var5, 0, -2 + var5.length);
                          var6_int = (int)qc.field_d.getValue();
                          if (~var6_int == ~((tb) this).field_j.field_h[param1]) {
                            L19: {
                              L20: {
                                if (null == ((tb) this).field_j.field_p) {
                                  break L20;
                                } else {
                                  if (null != ((tb) this).field_j.field_p[param1]) {
                                    var7 = ((tb) this).field_j.field_p[param1];
                                    var8 = tg.a(var5, var5.length + -2, 0, 8);
                                    var9 = 0;
                                    L21: while (true) {
                                      if (var9 >= 64) {
                                        break L20;
                                      } else {
                                        stackOut_83_0 = ~var7[var9];
                                        stackOut_83_1 = ~var8[var9];
                                        stackIn_91_0 = stackOut_83_0;
                                        stackIn_91_1 = stackOut_83_1;
                                        stackIn_84_0 = stackOut_83_0;
                                        stackIn_84_1 = stackOut_83_1;
                                        if (var10 != 0) {
                                          break L19;
                                        } else {
                                          if (stackIn_84_0 == stackIn_84_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L21;
                                            } else {
                                              break L20;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              stackOut_90_0 = 255 & var5[-1 + var5.length];
                              stackOut_90_1 = (255 & var5[var5.length - 2]) << 1366633416;
                              stackIn_91_0 = stackOut_90_0;
                              stackIn_91_1 = stackOut_90_1;
                              break L19;
                            }
                            var7_int = stackIn_91_0 + stackIn_91_1;
                            if (var7_int != (65535 & ((tb) this).field_j.field_o[param1])) {
                              throw new RuntimeException();
                            } else {
                              L22: {
                                if (((tb) this).field_n[param1] == 1) {
                                  break L22;
                                } else {
                                  L23: {
                                    if (0 != ((tb) this).field_n[param1]) {
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  ((tb) this).field_n[param1] = (byte) 1;
                                  break L22;
                                }
                              }
                              L24: {
                                if (!((rf) var4).field_x) {
                                  ((rf) var4).b((byte) 12);
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              stackOut_104_0 = var4;
                              stackIn_105_0 = stackOut_104_0;
                              break L17;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L25: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((tb) this).field_n[param1] = (byte) -1;
                    ((rf) var4).b((byte) 12);
                    if (((rf) var4).field_x) {
                      if (!((tb) this).field_r.d(-21)) {
                        var4 = (Object) (Object) ((tb) this).field_r.a(param1, true, ((tb) this).field_f, (byte) 91, (byte) 2);
                        ((tb) this).field_q.a((uf) var4, (long)param1, (byte) -101);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  stackOut_113_0 = null;
                  stackIn_114_0 = stackOut_113_0;
                  return (rf) (Object) stackIn_114_0;
                }
                return (rf) (Object) stackIn_105_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw qk.a((Throwable) var4, "tb.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (rf) (Object) stackIn_160_0;
    }

    final int b(int param0, int param1) {
        rf var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (rf) (Object) ((tb) this).field_q.a((byte) 46, (long)param1);
            if (param0 == 0) {
              if (var3 != null) {
                stackOut_6_0 = var3.c(0);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = -22;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var3_ref, "tb.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final km a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        km stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_50_0 = null;
        km stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_49_0 = null;
        km stackOut_57_0 = null;
        Object stackOut_14_0 = null;
        km stackOut_2_0 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (((tb) this).field_j == null) {
              L1: {
                if (((tb) this).field_h != null) {
                  break L1;
                } else {
                  if (((tb) this).field_r.d(-21)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (km) (Object) stackIn_11_0;
                  } else {
                    ((tb) this).field_h = (rf) (Object) ((tb) this).field_r.a(((tb) this).field_f, true, 255, (byte) 105, (byte) 0);
                    break L1;
                  }
                }
              }
              if (!((tb) this).field_h.field_A) {
                L2: {
                  L3: {
                    var2_array = ((tb) this).field_h.b(true);
                    if (((tb) this).field_h instanceof ma) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((tb) this).field_j = new km(var2_array, ((tb) this).field_A, ((tb) this).field_y);
                            break L4;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var3 = decompiledCaughtException;
                            ((tb) this).field_r.b(-12948);
                            ((tb) this).field_j = null;
                            if (((tb) this).field_r.d(-21)) {
                              break L6;
                            } else {
                              ((tb) this).field_h = (rf) (Object) ((tb) this).field_r.a(((tb) this).field_f, true, 255, (byte) 93, (byte) 0);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((tb) this).field_h = null;
                          break L5;
                        }
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        return (km) (Object) stackIn_30_0;
                      }
                      if (null != ((tb) this).field_t) {
                        ma discarded$1 = ((tb) this).field_s.a(var2_array, ((tb) this).field_f, 4626, ((tb) this).field_t);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  try {
                    L7: {
                      if (null != var2_array) {
                        ((tb) this).field_j = new km(var2_array, ((tb) this).field_A, ((tb) this).field_y);
                        if (((tb) this).field_j.field_t != ((tb) this).field_p) {
                          throw new RuntimeException();
                        } else {
                          break L7;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var3 = decompiledCaughtException;
                        ((tb) this).field_j = null;
                        if (((tb) this).field_r.d(-21)) {
                          break L9;
                        } else {
                          ((tb) this).field_h = (rf) (Object) ((tb) this).field_r.a(((tb) this).field_f, true, 255, (byte) 61, (byte) 0);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((tb) this).field_h = null;
                      break L8;
                    }
                    stackOut_49_0 = null;
                    stackIn_50_0 = stackOut_49_0;
                    return (km) (Object) stackIn_50_0;
                  }
                  break L2;
                }
                L10: {
                  if (param0 >= 50) {
                    break L10;
                  } else {
                    ((tb) this).field_z = 32;
                    break L10;
                  }
                }
                L11: {
                  if (null == ((tb) this).field_m) {
                    break L11;
                  } else {
                    ((tb) this).field_n = new byte[((tb) this).field_j.field_j];
                    break L11;
                  }
                }
                ((tb) this).field_h = null;
                stackOut_57_0 = ((tb) this).field_j;
                stackIn_58_0 = stackOut_57_0;
                break L0;
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (km) (Object) stackIn_15_0;
              }
            } else {
              stackOut_2_0 = ((tb) this).field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "tb.D(" + param0 + ')');
        }
        return stackIn_58_0;
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        uf var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            if (null == ((tb) this).field_k) {
              return;
            } else {
              if (null == ((tb) this).a((byte) 127)) {
                return;
              } else {
                L1: {
                  if (param0 == -21) {
                    break L1;
                  } else {
                    String discarded$3 = tb.a(-41, (String) null, (java.applet.Applet) null);
                    break L1;
                  }
                }
                var2_ref = ((tb) this).field_v.d(9272);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_g;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (~var3 <= ~((tb) this).field_j.field_j) {
                                    break L7;
                                  } else {
                                    if (((tb) this).field_j.field_d[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.b((byte) 12);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((tb) this).field_n[var3] == 0) {
                                rf discarded$4 = this.a(1, var3, (byte) -97);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((tb) this).field_n[var3] == -1) {
                                rf discarded$5 = this.a(2, var3, (byte) -97);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((tb) this).field_n[var3] == 1) {
                              var2_ref.b((byte) 12);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((tb) this).field_v.e((byte) -119);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "tb.I(" + param0 + ')');
        }
    }

    tb(int param0, ua param1, ua param2, h param3, wh param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((tb) this).field_q = new il(16);
        ((tb) this).field_z = 0;
        ((tb) this).field_v = new jj();
        ((tb) this).field_g = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((tb) this).field_m = param1;
                ((tb) this).field_f = param0;
                if (((tb) this).field_m != null) {
                  break L2;
                } else {
                  ((tb) this).field_w = false;
                  if (Terraphoenix.field_V == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((tb) this).field_w = true;
              ((tb) this).field_k = new jj();
              break L1;
            }
            L3: {
              ((tb) this).field_B = param8;
              ((tb) this).field_s = param4;
              ((tb) this).field_A = param5;
              ((tb) this).field_r = param3;
              ((tb) this).field_y = param6;
              ((tb) this).field_p = param7;
              ((tb) this).field_t = param2;
              if (((tb) this).field_t != null) {
                ((tb) this).field_h = (rf) (Object) ((tb) this).field_s.a(((tb) this).field_t, ((tb) this).field_f, 2);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("tb.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Suggested names: ";
        field_u = 0.0;
        field_i = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_x = "Zombie";
    }
}
