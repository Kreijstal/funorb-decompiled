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
        if (param1 >= -62) {
            return null;
        }
        rf var3 = this.a(0, param0, (byte) -97);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b(true);
        var3.b((byte) 12);
        return var4;
    }

    final static void a(int param0, int param1, int param2) {
        nd.field_r = param0;
        ma.field_E = param2;
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_7_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            String stackOut_6_0 = null;
            Object stackOut_11_0 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
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
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var6 >= var4.length) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var4[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4[var6].substring(0, var7).trim().equals((Object) (Object) param1)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var4[var6].substring(1 + var7).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref = caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = null;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (String) (Object) stackIn_12_0;
                    }
                    case 13: {
                        var3_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_13_0 = (RuntimeException) var3_ref2;
                        stackOut_13_1 = new StringBuilder().append("tb.G(").append(param0).append(',');
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param1 == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                        stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                        stackOut_15_2 = "null";
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param2 == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "null";
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
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
        CharSequence var14 = null;
        int stackIn_6_0 = 0;
        dh stackIn_18_0 = null;
        dh stackIn_19_0 = null;
        dh stackIn_20_0 = null;
        String stackIn_20_1 = null;
        dh stackIn_21_0 = null;
        dh stackIn_22_0 = null;
        dh stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        dh stackOut_17_0 = null;
        dh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        dh stackOut_18_0 = null;
        String stackOut_18_1 = null;
        dh stackOut_20_0 = null;
        dh stackOut_22_0 = null;
        String stackOut_22_1 = null;
        dh stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_33_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var7_ref = param2.a(119);
              var8 = param1.a(121);
              if (null == ig.field_e) {
                if (!le.a(false, (byte) 109)) {
                  stackOut_5_0 = -1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (va.field_e == mh.field_a) {
                L3: {
                  ge.field_d = null;
                  di.field_l.field_k = 0;
                  if (param0 == null) {
                    L4: {
                      nc.field_c.field_k = 0;
                      nc.field_c.e(j.field_H.nextInt(), 8959);
                      nc.field_c.e(j.field_H.nextInt(), 8959);
                      stackOut_17_0 = nc.field_c;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!param2.c(1)) {
                        stackOut_19_0 = (dh) (Object) stackIn_19_0;
                        stackOut_19_1 = "";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L4;
                      } else {
                        stackOut_18_0 = (dh) (Object) stackIn_18_0;
                        stackOut_18_1 = (String) var7_ref;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L4;
                      }
                    }
                    L5: {
                      ((dh) (Object) stackIn_20_0).b(stackIn_20_1, -86);
                      stackOut_20_0 = nc.field_c;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (param1.c(1)) {
                        stackOut_22_0 = (dh) (Object) stackIn_22_0;
                        stackOut_22_1 = (String) var8;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L5;
                      } else {
                        stackOut_21_0 = (dh) (Object) stackIn_21_0;
                        stackOut_21_1 = "";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L5;
                      }
                    }
                    ((dh) (Object) stackIn_23_0).b(stackIn_23_1, -105);
                    di.field_l.i(16, 59);
                    di.field_l.field_k = di.field_l.field_k + 1;
                    var9 = di.field_l.field_k;
                    ea.a(ga.field_o, nc.field_c, 0, dj.field_c, (dh) (Object) di.field_l);
                    di.field_l.j(di.field_l.field_k - var9, -119);
                    break L3;
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
                      nc.field_c.e(j.field_H.nextInt(), 8959);
                      nc.field_c.b(var7_ref, -33);
                      nc.field_c.b(var8, -101);
                      var14 = (CharSequence) (Object) param0;
                      nc.field_c.b(nh.a(-31621, var14), -34);
                      nc.field_c.h(-1564407352, param4);
                      nc.field_c.i(param6, -115);
                      nc.field_c.i(var9, -90);
                      di.field_l.i(18, 117);
                      di.field_l.field_k = di.field_l.field_k + 2;
                      var10 = di.field_l.field_k;
                      var11_ref_String = kf.a(-24, dg.a(false));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    di.field_l.a(var11_ref_String, 2295);
                    ea.a(ga.field_o, nc.field_c, 0, dj.field_c, (dh) (Object) di.field_l);
                    di.field_l.g(-var10 + di.field_l.field_k, -20125);
                    break L3;
                  }
                }
                int discarded$4 = 0;
                bc.a(-1);
                mh.field_a = ha.field_n;
                break L2;
              } else {
                break L2;
              }
            }
            L8: {
              if (mh.field_a == ha.field_n) {
                if (vc.a(-117, 1)) {
                  L9: {
                    var9 = mk.field_j.a(-16384);
                    mk.field_j.field_k = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        te.field_a = new String[-100 + var9];
                        mh.field_a = tc.field_f;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 != 248) {
                    if (var9 != 99) {
                      mh.field_a = tf.field_d;
                      qh.field_d = -1;
                      qk.field_b = var9;
                      break L8;
                    } else {
                      int discarded$5 = 30;
                      boolean discarded$6 = vc.a(-111, dc.b());
                      int discarded$7 = 102;
                      ge.field_d = new Boolean(cb.a((dh) (Object) mk.field_j));
                      mk.field_j.field_k = 0;
                      break L8;
                    }
                  } else {
                    ke.a(dg.a(false), (byte) 95);
                    bh.field_d = kj.field_e;
                    gb.g(-17464);
                    vj.field_Q = false;
                    stackOut_33_0 = var9;
                    stackIn_34_0 = stackOut_33_0;
                    return stackIn_34_0;
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (mh.field_a == tc.field_f) {
                var9 = 2;
                if (vc.a(-99, var9)) {
                  var10 = mk.field_j.i(-25578);
                  mk.field_j.field_k = 0;
                  if (vc.a(-128, var10)) {
                    var11 = te.field_a.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        gb.g(-17464);
                        vj.field_Q = false;
                        stackOut_48_0 = 100 + var11;
                        stackIn_49_0 = stackOut_48_0;
                        return stackIn_49_0;
                      } else {
                        te.field_a[var12] = mk.field_j.c((byte) 46);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (tf.field_d != mh.field_a) {
                break L12;
              } else {
                if (!cm.b((byte) -98)) {
                  break L12;
                } else {
                  L13: {
                    if (qk.field_b != 255) {
                      bh.field_d = mk.field_j.e(-1);
                      break L13;
                    } else {
                      var9_ref_String = mk.field_j.j(-1915115064);
                      if (var9_ref_String != null) {
                        hk.a(var9_ref_String, (byte) 3, dg.a(false));
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  gb.g(-17464);
                  vj.field_Q = false;
                  stackOut_57_0 = qk.field_b;
                  stackIn_58_0 = stackOut_57_0;
                  return stackIn_58_0;
                }
              }
            }
            L14: {
              if (ig.field_e != null) {
                break L14;
              } else {
                if (vj.field_Q) {
                  L15: {
                    if (30000L < ce.b(1)) {
                      bh.field_d = qk.field_f;
                      break L15;
                    } else {
                      bh.field_d = cl.field_I;
                      break L15;
                    }
                  }
                  vj.field_Q = false;
                  stackOut_65_0 = 249;
                  stackIn_66_0 = stackOut_65_0;
                  return stackIn_66_0;
                } else {
                  var9 = sb.field_i;
                  sb.field_i = pg.field_f;
                  pg.field_f = var9;
                  vj.field_Q = true;
                  break L14;
                }
              }
            }
            stackOut_67_0 = -1;
            stackIn_68_0 = stackOut_67_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("tb.K(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L16;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L16;
            }
          }
          L17: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L17;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L17;
            }
          }
          L18: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param3 + ',' + param4 + ',' + 96 + ',' + param6 + ')');
        }
        return stackIn_68_0;
    }

    public static void a() {
        field_x = null;
        field_i = null;
        field_l = null;
    }

    final void e(byte param0) {
        int var2_int = 0;
        rf var2 = null;
        uf var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (param0 == -51) {
          L0: {
            if (((tb) this).field_k != null) {
              if (((tb) this).a((byte) 105) == null) {
                return;
              } else {
                if (!((tb) this).field_w) {
                  if (!((tb) this).field_o) {
                    ((tb) this).field_k = null;
                    break L0;
                  } else {
                    var2_int = 1;
                    var3 = ((tb) this).field_k.d(9272);
                    L1: while (true) {
                      if (var3 == null) {
                        L2: while (true) {
                          L3: {
                            if (((tb) this).field_z >= ((tb) this).field_j.field_d.length) {
                              break L3;
                            } else {
                              L4: {
                                if (((tb) this).field_j.field_d[((tb) this).field_z] == 0) {
                                  break L4;
                                } else {
                                  if (((tb) this).field_r.b(true)) {
                                    var2_int = 0;
                                    break L3;
                                  } else {
                                    L5: {
                                      if (((tb) this).field_n[((tb) this).field_z] == 1) {
                                        break L5;
                                      } else {
                                        rf discarded$4 = this.a(2, ((tb) this).field_z, (byte) -97);
                                        break L5;
                                      }
                                    }
                                    if (1 == ((tb) this).field_n[((tb) this).field_z]) {
                                      break L4;
                                    } else {
                                      var3 = new uf();
                                      var3.field_g = (long)((tb) this).field_z;
                                      ((tb) this).field_k.a(var3, -16611);
                                      var2_int = 0;
                                      break L4;
                                    }
                                  }
                                }
                              }
                              ((tb) this).field_z = ((tb) this).field_z + 1;
                              continue L2;
                            }
                          }
                          if (var2_int == 0) {
                            break L0;
                          } else {
                            ((tb) this).field_z = 0;
                            ((tb) this).field_o = false;
                            break L0;
                          }
                        }
                      } else {
                        L6: {
                          var4 = (int)var3.field_g;
                          if (-2 != ((tb) this).field_n[var4]) {
                            rf discarded$5 = this.a(2, var4, (byte) -97);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (-2 == ((tb) this).field_n[var4]) {
                            var3.b((byte) 12);
                            break L7;
                          } else {
                            var2_int = 0;
                            break L7;
                          }
                        }
                        var3 = ((tb) this).field_k.e((byte) -119);
                        continue L1;
                      }
                    }
                  }
                } else {
                  var2_int = 1;
                  var3 = ((tb) this).field_k.d(9272);
                  L8: while (true) {
                    if (var3 == null) {
                      L9: while (true) {
                        L10: {
                          if (((tb) this).field_z >= ((tb) this).field_j.field_d.length) {
                            break L10;
                          } else {
                            if (0 != ((tb) this).field_j.field_d[((tb) this).field_z]) {
                              if (((tb) this).field_s.field_b >= 250) {
                                var2_int = 0;
                                break L10;
                              } else {
                                L11: {
                                  if (0 == ((tb) this).field_n[((tb) this).field_z]) {
                                    rf discarded$6 = this.a(1, ((tb) this).field_z, (byte) -97);
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
                                continue L9;
                              }
                            } else {
                              ((tb) this).field_z = ((tb) this).field_z + 1;
                              continue L9;
                            }
                          }
                        }
                        if (var2_int == 0) {
                          break L0;
                        } else {
                          ((tb) this).field_z = 0;
                          ((tb) this).field_w = false;
                          break L0;
                        }
                      }
                    } else {
                      L13: {
                        var4 = (int)var3.field_g;
                        if (0 == ((tb) this).field_n[var4]) {
                          rf discarded$7 = this.a(1, var4, (byte) -97);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (((tb) this).field_n[var4] == 0) {
                          var2_int = 0;
                          break L14;
                        } else {
                          var3.b((byte) 12);
                          break L14;
                        }
                      }
                      var3 = ((tb) this).field_k.e((byte) -119);
                      continue L8;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L15: {
            if (!((tb) this).field_B) {
              break L15;
            } else {
              if (ll.a(1000) < ((tb) this).field_g) {
                break L15;
              } else {
                var2 = (rf) (Object) ((tb) this).field_q.a((byte) 117);
                L16: while (true) {
                  if (var2 == null) {
                    ((tb) this).field_g = ll.a(1000) - -1000L;
                    break L15;
                  } else {
                    L17: {
                      if (!var2.field_A) {
                        if (var2.field_C) {
                          if (!var2.field_x) {
                            throw new RuntimeException();
                          } else {
                            var2.b((byte) 12);
                            break L17;
                          }
                        } else {
                          var2.field_C = true;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    var2 = (rf) (Object) ((tb) this).field_q.a(true);
                    continue L16;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        if (param0 != 2) {
            ((tb) this).field_m = null;
        }
        if (null == ((tb) this).field_m) {
            return;
        }
        ((tb) this).field_o = true;
        if (!(null != ((tb) this).field_k)) {
            ((tb) this).field_k = new jj();
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
        int var11 = 0;
        Object stackIn_58_0 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_57_0 = null;
        L0: {
          var10 = Terraphoenix.field_V;
          var4 = (Object) (Object) (rf) (Object) ((tb) this).field_q.a((byte) 46, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (0 != param0) {
              break L0;
            } else {
              if (((rf) var4).field_x) {
                break L0;
              } else {
                if (!((rf) var4).field_A) {
                  break L0;
                } else {
                  ((rf) var4).b((byte) 12);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              if (0 == param0) {
                L3: {
                  if (((tb) this).field_m == null) {
                    break L3;
                  } else {
                    if (((tb) this).field_n[param1] == -1) {
                      break L3;
                    } else {
                      var4 = (Object) (Object) ((tb) this).field_s.a(((tb) this).field_m, param1, 2);
                      break L2;
                    }
                  }
                }
                if (!((tb) this).field_r.d(-21)) {
                  var4 = (Object) (Object) ((tb) this).field_r.a(param1, true, ((tb) this).field_f, (byte) 110, (byte) 2);
                  break L2;
                } else {
                  return null;
                }
              } else {
                if (1 == param0) {
                  if (((tb) this).field_m != null) {
                    var4 = (Object) (Object) ((tb) this).field_s.a(41, param1, ((tb) this).field_m);
                    break L2;
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  if (param0 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (((tb) this).field_m == null) {
                      throw new RuntimeException();
                    } else {
                      if (((tb) this).field_n[param1] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((tb) this).field_r.b(true)) {
                          var4 = (Object) (Object) ((tb) this).field_r.a(param1, false, ((tb) this).field_f, (byte) 115, (byte) 2);
                          break L2;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((tb) this).field_q.a((uf) var4, (long)param1, (byte) -71);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((rf) var4).field_A) {
          var5 = ((rf) var4).b(true);
          if (!(var4 instanceof ma)) {
            try {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var5.length <= 2) {
                      break L5;
                    } else {
                      qc.field_d.reset();
                      qc.field_d.update(var5, 0, -2 + var5.length);
                      var6_int = (int)qc.field_d.getValue();
                      if (~((tb) this).field_j.field_h[param1] != ~var6_int) {
                        throw new RuntimeException();
                      } else {
                        L6: {
                          if (null == ((tb) this).field_j.field_p) {
                            break L6;
                          } else {
                            if (((tb) this).field_j.field_p[param1] == null) {
                              break L6;
                            } else {
                              var7 = ((tb) this).field_j.field_p[param1];
                              int discarded$3 = 8;
                              var8 = tg.a(var5, var5.length + -2, 0);
                              var11 = 0;
                              var9 = var11;
                              L7: while (true) {
                                if (var11 >= 64) {
                                  break L6;
                                } else {
                                  if (var8[var11] != var7[var11]) {
                                    throw new RuntimeException();
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((tb) this).field_r.field_i = 0;
                        ((tb) this).field_r.field_l = 0;
                        break L4;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              ((tb) this).field_r.b(-12948);
              ((rf) var4).b((byte) 12);
              if (((rf) var4).field_x) {
                if (!((tb) this).field_r.d(-21)) {
                  var4 = (Object) (Object) ((tb) this).field_r.a(param1, true, ((tb) this).field_f, (byte) 77, (byte) 2);
                  ((tb) this).field_q.a((uf) var4, (long)param1, (byte) -100);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            L8: {
              var5[var5.length + -2] = (byte)(((tb) this).field_j.field_o[param1] >>> 8);
              var5[var5.length + -1] = (byte)((tb) this).field_j.field_o[param1];
              if (null != ((tb) this).field_m) {
                ma discarded$4 = ((tb) this).field_s.a(var5, param1, 4626, ((tb) this).field_m);
                if (((tb) this).field_n[param1] != 1) {
                  ((tb) this).field_n[param1] = (byte) 1;
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L9: {
              if (!((rf) var4).field_x) {
                ((rf) var4).b((byte) 12);
                break L9;
              } else {
                break L9;
              }
            }
            return (rf) var4;
          } else {
            try {
              L10: {
                L11: {
                  if (var5 == null) {
                    break L11;
                  } else {
                    if (var5.length <= 2) {
                      break L11;
                    } else {
                      qc.field_d.reset();
                      qc.field_d.update(var5, 0, -2 + var5.length);
                      var6_int = (int)qc.field_d.getValue();
                      if (~var6_int == ~((tb) this).field_j.field_h[param1]) {
                        L12: {
                          if (null == ((tb) this).field_j.field_p) {
                            break L12;
                          } else {
                            if (null != ((tb) this).field_j.field_p[param1]) {
                              var7 = ((tb) this).field_j.field_p[param1];
                              int discarded$5 = 8;
                              var8 = tg.a(var5, var5.length + -2, 0);
                              var9 = 0;
                              L13: while (true) {
                                if (var9 >= 64) {
                                  break L12;
                                } else {
                                  if (~var7[var9] == ~var8[var9]) {
                                    var9++;
                                    continue L13;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        var7_int = (255 & var5[-1 + var5.length]) + ((255 & var5[var5.length - 2]) << 8);
                        if (var7_int != (65535 & ((tb) this).field_j.field_o[param1])) {
                          throw new RuntimeException();
                        } else {
                          L14: {
                            if (((tb) this).field_n[param1] == 1) {
                              break L14;
                            } else {
                              L15: {
                                if (0 != ((tb) this).field_n[param1]) {
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              ((tb) this).field_n[param1] = (byte) 1;
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
                          stackOut_57_0 = var4;
                          stackIn_58_0 = stackOut_57_0;
                          break L10;
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
              L17: {
                var6 = (Exception) (Object) decompiledCaughtException;
                ((tb) this).field_n[param1] = (byte) -1;
                ((rf) var4).b((byte) 12);
                if (((rf) var4).field_x) {
                  if (!((tb) this).field_r.d(-21)) {
                    var4 = (Object) (Object) ((tb) this).field_r.a(param1, true, ((tb) this).field_f, (byte) 91, (byte) 2);
                    ((tb) this).field_q.a((uf) var4, (long)param1, (byte) -101);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              return null;
            }
            return (rf) (Object) stackIn_58_0;
          }
        } else {
          return null;
        }
    }

    final int b(int param0, int param1) {
        rf var3 = (rf) (Object) ((tb) this).field_q.a((byte) 46, (long)param1);
        if (param0 != 0) {
            return -22;
        }
        if (var3 == null) {
            return 0;
        }
        return var3.c(0);
    }

    final km a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        if (((tb) this).field_j == null) {
          L0: {
            if (((tb) this).field_h != null) {
              break L0;
            } else {
              if (!((tb) this).field_r.d(-21)) {
                ((tb) this).field_h = (rf) (Object) ((tb) this).field_r.a(((tb) this).field_f, true, 255, (byte) 105, (byte) 0);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((tb) this).field_h.field_A) {
            L1: {
              var5 = ((tb) this).field_h.b(true);
              var2 = var5;
              if (((tb) this).field_h instanceof ma) {
                try {
                  L2: {
                    if (var5 != null) {
                      ((tb) this).field_j = new km(var5, ((tb) this).field_A, ((tb) this).field_y);
                      if (((tb) this).field_j.field_t != ((tb) this).field_p) {
                        throw new RuntimeException();
                      } else {
                        break L2;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    ((tb) this).field_j = null;
                    if (((tb) this).field_r.d(-21)) {
                      ((tb) this).field_h = null;
                      break L3;
                    } else {
                      ((tb) this).field_h = (rf) (Object) ((tb) this).field_r.a(((tb) this).field_f, true, 255, (byte) 61, (byte) 0);
                      break L3;
                    }
                  }
                  return null;
                }
                break L1;
              } else {
                try {
                  L4: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      ((tb) this).field_j = new km(var5, ((tb) this).field_A, ((tb) this).field_y);
                      break L4;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L5: {
                    var3 = decompiledCaughtException;
                    ((tb) this).field_r.b(-12948);
                    ((tb) this).field_j = null;
                    if (((tb) this).field_r.d(-21)) {
                      ((tb) this).field_h = null;
                      break L5;
                    } else {
                      ((tb) this).field_h = (rf) (Object) ((tb) this).field_r.a(((tb) this).field_f, true, 255, (byte) 93, (byte) 0);
                      break L5;
                    }
                  }
                  return null;
                }
                if (null != ((tb) this).field_t) {
                  ma discarded$1 = ((tb) this).field_s.a(var5, ((tb) this).field_f, 4626, ((tb) this).field_t);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (param0 >= 50) {
                break L6;
              } else {
                ((tb) this).field_z = 32;
                break L6;
              }
            }
            L7: {
              if (null == ((tb) this).field_m) {
                break L7;
              } else {
                ((tb) this).field_n = new byte[((tb) this).field_j.field_j];
                break L7;
              }
            }
            ((tb) this).field_h = null;
            return ((tb) this).field_j;
          } else {
            return null;
          }
        } else {
          return ((tb) this).field_j;
        }
    }

    final void d(byte param0) {
        uf var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Terraphoenix.field_V;
        if (null == ((tb) this).field_k) {
          return;
        } else {
          if (null == ((tb) this).a((byte) 127)) {
            return;
          } else {
            L0: {
              if (param0 == -21) {
                break L0;
              } else {
                var5 = null;
                String discarded$4 = tb.a(-41, (String) null, (java.applet.Applet) null);
                break L0;
              }
            }
            var2 = ((tb) this).field_v.d(9272);
            L1: while (true) {
              if (var2 == null) {
                return;
              } else {
                L2: {
                  var3 = (int)var2.field_g;
                  if (var3 < 0) {
                    break L2;
                  } else {
                    if (var3 >= ((tb) this).field_j.field_j) {
                      break L2;
                    } else {
                      if (((tb) this).field_j.field_d[var3] == 0) {
                        break L2;
                      } else {
                        L3: {
                          if (((tb) this).field_n[var3] == -1) {
                            rf discarded$5 = this.a(1, var3, (byte) -97);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (0 == ((tb) this).field_n[var3]) {
                            rf discarded$6 = this.a(2, var3, (byte) -97);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (((tb) this).field_n[var3] == 1) {
                            var2.b((byte) 12);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var2 = ((tb) this).field_v.e((byte) -119);
                        continue L1;
                      }
                    }
                  }
                }
                var2.b((byte) 12);
                var2 = ((tb) this).field_v.e((byte) -119);
                continue L1;
              }
            }
          }
        }
    }

    tb(int param0, ua param1, ua param2, h param3, wh param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((tb) this).field_q = new il(16);
        ((tb) this).field_z = 0;
        ((tb) this).field_v = new jj();
        ((tb) this).field_g = 0L;
        try {
          L0: {
            L1: {
              ((tb) this).field_m = param1;
              ((tb) this).field_f = param0;
              if (((tb) this).field_m != null) {
                ((tb) this).field_w = true;
                ((tb) this).field_k = new jj();
                break L1;
              } else {
                ((tb) this).field_w = false;
                break L1;
              }
            }
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((tb) this).field_B = stackIn_7_1 != 0;
              ((tb) this).field_s = param4;
              ((tb) this).field_A = param5;
              ((tb) this).field_r = param3;
              ((tb) this).field_y = param6;
              ((tb) this).field_p = param7;
              ((tb) this).field_t = param2;
              if (((tb) this).field_t == null) {
                break L3;
              } else {
                ((tb) this).field_h = (rf) (Object) ((tb) this).field_s.a(((tb) this).field_t, ((tb) this).field_f, 2);
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
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
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
