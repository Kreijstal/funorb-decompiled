/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends si {
    int field_K;
    static bb field_L;
    static vd field_M;
    static String field_I;
    static u field_H;
    static String field_J;

    dl(vg param0) {
        super(param0.field_o, param0.field_m, param0.field_w, param0.field_k, (cg) null, (fd) null);
        param0.a(0, ((dl) this).field_k, 0, 16535, ((dl) this).field_w);
        ((dl) this).field_z = param0;
        ((dl) this).field_K = 256;
    }

    final static nh[] a(byte param0, int param1, int param2, int param3, int param4) {
        int var5 = -126 % ((-80 - param0) / 37);
        return n.a(123, 3, param4, param3, param1, 1, param2, 1, 1);
    }

    final static void a(String param0, int param1, int param2) {
        int var3 = 0;
        oi.field_c = false;
        pj.field_F = false;
        if (param2 >= 57) {
          if (ol.field_a != null) {
            if (ol.field_a.field_Q) {
              L0: {
                var3 = 1;
                if ((param1 ^ -1) == -9) {
                  L1: {
                    if (!sg.field_a) {
                      param0 = m.field_c;
                      break L1;
                    } else {
                      param0 = tf.field_ib;
                      break L1;
                    }
                  }
                  param1 = 2;
                  pi.field_O.b((byte) 37, qf.field_c);
                  break L0;
                } else {
                  break L0;
                }
              }
              L2: {
                if (-11 != (param1 ^ -1)) {
                  break L2;
                } else {
                  bh.a((byte) -31);
                  var3 = 0;
                  break L2;
                }
              }
              L3: {
                if (var3 != 0) {
                  L4: {
                    if (!pj.field_F) {
                      break L4;
                    } else {
                      param0 = a.a(5044, field_J, new String[1]);
                      break L4;
                    }
                  }
                  L5: {
                    if (hl.field_b) {
                      param0 = eg.field_b;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ol.field_a.a(param1, param0, -5485);
                  break L3;
                } else {
                  break L3;
                }
              }
              if ((param1 ^ -1) != -257) {
                if (param1 != 10) {
                  if (sg.field_a) {
                    return;
                  } else {
                    pi.field_O.i(134);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          fg discarded$1 = dl.a(false, -65);
          if (ol.field_a != null) {
            if (ol.field_a.field_Q) {
              L6: {
                var3 = 1;
                if ((param1 ^ -1) == -9) {
                  L7: {
                    if (!sg.field_a) {
                      param0 = m.field_c;
                      break L7;
                    } else {
                      param0 = tf.field_ib;
                      break L7;
                    }
                  }
                  param1 = 2;
                  pi.field_O.b((byte) 37, qf.field_c);
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if (-11 != (param1 ^ -1)) {
                  break L8;
                } else {
                  bh.a((byte) -31);
                  var3 = 0;
                  break L8;
                }
              }
              L9: {
                if (var3 != 0) {
                  L10: {
                    if (!pj.field_F) {
                      break L10;
                    } else {
                      param0 = a.a(5044, field_J, new String[1]);
                      break L10;
                    }
                  }
                  L11: {
                    if (hl.field_b) {
                      param0 = eg.field_b;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ol.field_a.a(param1, param0, -5485);
                  break L9;
                } else {
                  break L9;
                }
              }
              if ((param1 ^ -1) != -257) {
                if (param1 != 10) {
                  if (sg.field_a) {
                    return;
                  } else {
                    pi.field_O.i(134);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static fg a(boolean param0, int param1) {
        lh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        lh var9 = null;
        ai var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    var9 = dh.field_N;
                    var2 = var9;
                    var3 = var9.l(31760);
                    if (-1 == (128 & var3 ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    td.field_f = stackIn_3_0 != 0;
                    kl.field_J = 127 & var3;
                    ib.field_o = var9.l(31760);
                    var4 = -87 % ((param1 - -47) / 45);
                    fm.field_j = var9.a((byte) -53);
                    if (-3 == (kl.field_J ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ob.field_a = 0;
                    dj.field_K = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    dj.field_K = var9.j(-788751192);
                    ob.field_a = var9.g(-1);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var9.l(31760) ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5 = stackIn_9_0;
                    rh.field_j = var9.b((byte) -93);
                    if (var5 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    tf.field_kb = rh.field_j;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    tf.field_kb = var9.b((byte) -64);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 == kl.field_J) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((kl.field_J ^ -1) != -5) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$4 = var9.j(-788751192);
                    String discarded$5 = var9.b((byte) -57);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    int discarded$6 = var9.j(-788751192);
                    String discarded$7 = var9.b((byte) -57);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param0) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6 = var9.j(-788751192);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var10 = nc.field_O.a(var6, (byte) -74);
                        am.field_m = var10.i(121);
                        if (tf.field_kb.equals((Object) (Object) oa.field_d)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var10.field_D;
                        stackIn_22_0 = stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = null;
                        stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        mf.field_x = stackIn_22_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var7 = (Exception) (Object) caughtException;
                    gb.a((Throwable) (Object) var7, "CC1", 10);
                    mf.field_x = null;
                    am.field_m = null;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    am.field_m = gm.a((byte) -96, (od) (Object) var9, 80);
                    mf.field_x = null;
                    return new fg(param0);
                }
                case 26: {
                    return new fg(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public dl() {
        super(0, 0, 0, 0, (cg) null, (fd) null);
        ((dl) this).field_K = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        nh var5 = null;
        if (param1 != 0) {
          return;
        } else {
          if (null != ((dl) this).field_z) {
            if (((dl) this).field_K != -1) {
              if (-257 == ((dl) this).field_K) {
                ((dl) this).field_z.a(((dl) this).field_o + param0, param1, (byte) -21, ((dl) this).field_m + param3);
                return;
              } else {
                var5 = new nh(((dl) this).field_z.field_w, ((dl) this).field_z.field_k);
                aj.a(var5, (byte) 47);
                ((dl) this).field_z.a(0, param1, param2, 0);
                cl.d((byte) -81);
                var5.e(((dl) this).field_o + param0, ((dl) this).field_m + param3, ((dl) this).field_K);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static double a(boolean param0, double param1, double param2) {
        if (!param0) {
          return Math.sqrt(param2 * param2 + param1 * param1);
        } else {
          return Math.sqrt(param2 * param2 + param1 * param1);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ul.field_j[param3] = param0;
        if (param6 <= 118) {
          return;
        } else {
          ul.field_b[param3] = param2;
          ul.field_i[param3] = param4;
          ul.field_e[param3] = param1;
          ul.field_f[param3] = param5;
          return;
        }
    }

    public static void j(int param0) {
        field_M = null;
        if (param0 != 0) {
            return;
        }
        field_I = null;
        field_H = null;
        field_J = null;
        field_L = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new bb();
        field_M = new vd();
        field_H = null;
        field_I = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_J = "Connection lost. <%0>";
    }
}
