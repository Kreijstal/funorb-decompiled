/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class via implements qda {
    private int field_a;
    private po field_i;
    private int field_b;
    private int field_d;
    static String field_c;
    private int field_h;
    private int field_f;
    private int field_g;
    private int field_e;

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 > 55) {
          param0 = param0 & 8191;
          if (4096 > param0) {
            L0: {
              if (param0 < 2048) {
                stackOut_18_0 = ed.field_b[param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = ed.field_b[4096 + -param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (-6145 >= (param0 ^ -1)) {
                stackOut_14_0 = -ed.field_b[-param0 + 8192];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -ed.field_b[-4096 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_c = null;
          param0 = param0 & 8191;
          if (4096 > param0) {
            L2: {
              if (param0 < 2048) {
                stackOut_8_0 = ed.field_b[param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = ed.field_b[4096 + -param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (-6145 >= (param0 ^ -1)) {
                stackOut_4_0 = -ed.field_b[-param0 + 8192];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -ed.field_b[-4096 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static gs a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pf var8 = null;
        pda var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_25_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_24_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = BachelorFridge.field_y;
                    var8 = ig.field_m;
                    if (param0 == -10183) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = var8.b(16711935);
                    wka.field_a = var3 & 127;
                    if ((128 & var3) == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    gq.field_x = stackIn_5_0 != 0;
                    vv.field_d = var8.b(param0 ^ -16721722);
                    sr.field_a = var8.c(-108);
                    if (-3 == (wka.field_a ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ad.field_g = 0;
                    bna.field_w = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    ad.field_g = var8.e((byte) 75);
                    bna.field_w = var8.a(param0 ^ -10182);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var8.b(16711935) != 1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    gba.field_yb = var8.g(88);
                    if (var4 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    qia.field_b = var8.g(48);
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    qia.field_b = gba.field_yb;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (1 == wka.field_a) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (wka.field_a != 4) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    laa.field_m = var8.e((byte) 116);
                    to.field_a = var8.g(87);
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    laa.field_m = var8.e((byte) 116);
                    to.field_a = var8.g(87);
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    to.field_a = null;
                    laa.field_m = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (!param1) {
                        statePc = 28;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = var8.e((byte) 123);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var9 = cea.field_h.a(-22834, var5);
                        qk.field_n = var9.d((byte) 117);
                        if (!qia.field_b.equals((Object) (Object) cha.field_l)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_25_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var9.field_s;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        hv.field_a = (int[]) (Object) stackIn_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return new gs(param1);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    cv.a(1, "CC1", (Throwable) (Object) var6);
                    qk.field_n = null;
                    hv.field_a = null;
                    return new gs(param1);
                }
                case 28: {
                    qk.field_n = oka.a((lu) (Object) var8, 80, (byte) -68);
                    hv.field_a = null;
                    return new gs(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        wj stackIn_5_0 = null;
        wj stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        if (param2 == 32679) {
          L0: {
            if (param1 instanceof km) {
              stackOut_4_0 = (wj) param1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_5_0 = (wj) (Object) stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var14 = (km) (Object) stackIn_5_0;
            if (var14 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            dg.c(param0 - -param1.field_s, param3 + param1.field_v, param1.field_p, param1.field_q, ((via) this).field_e);
            var7 = param1.field_s + param0 - -var14.field_A;
            var8 = param3 + param1.field_v + var14.field_D;
            dg.b(var7, var8, var14.field_G, ((via) this).field_d);
            if (var14.field_J == -1) {
              break L2;
            } else {
              var9 = (double)var14.field_J * 3.141592653589793 * 2.0 / (double)var14.field_F;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
              var12 = (int)(Math.cos(var9) * (double)var14.field_G);
              dg.b(var11 + var7, var8 + var12, 1, ((via) this).field_a);
              break L2;
            }
          }
          L3: {
            dg.b(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_F;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
            var12 = (int)(Math.cos(var9) * (double)var14.field_G);
            dg.d(var7, var8, var7 + var11, var8 + var12, 1);
            if (((via) this).field_i != null) {
              var13 = var14.field_G + var14.field_A + ((via) this).field_f;
              int discarded$1 = ((via) this).field_i.a(param1.field_w, param0 - (-param1.field_s - var13), param1.field_v + (param3 - -((via) this).field_g), -var13 + (-((via) this).field_f + param1.field_p), -(((via) this).field_f << 65857697) + param1.field_q, ((via) this).field_h, ((via) this).field_b, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static String a(int param0, String param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        nea var7 = null;
        nea var8 = null;
        pf var9 = null;
        CharSequence var10 = null;
        var6 = BachelorFridge.field_y;
        var10 = (CharSequence) (Object) param1;
        if (!wc.a(0, var10)) {
          return mk.field_f;
        } else {
          if (2 != um.field_c) {
            return nha.field_d;
          } else {
            var8 = bna.b(-50, param1);
            if (var8 != null) {
              bw discarded$1 = es.field_j.a((bw) (Object) var8, 0);
              L0: while (true) {
                var7 = (nea) (Object) es.field_j.c(0);
                if (var7 != null) {
                  var7.field_wb = var7.field_wb - 1;
                  continue L0;
                } else {
                  var8.a(false);
                  var8.b(0);
                  maa.field_v = maa.field_v - 1;
                  var9 = sja.field_fb;
                  var9.c(param0, (byte) 114);
                  var9.field_g = var9.field_g + 1;
                  if (param2 > -40) {
                    field_c = null;
                    var5 = var9.field_g;
                    var9.d(1, 0);
                    var9.a((byte) -50, param1);
                    var9.b((byte) -63, var9.field_g + -var5);
                    return null;
                  } else {
                    var5 = var9.field_g;
                    var9.d(1, 0);
                    var9.a((byte) -50, param1);
                    var9.b((byte) -63, var9.field_g + -var5);
                    return null;
                  }
                }
              }
            } else {
              return lga.a(true, new String[1], qga.field_q);
            }
          }
        }
    }

    via(po param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((via) this).field_i = param0;
        ((via) this).field_a = param6;
        ((via) this).field_h = param3;
        ((via) this).field_f = param1;
        ((via) this).field_d = param5;
        ((via) this).field_e = param7;
        ((via) this).field_g = param2;
        ((via) this).field_b = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Arena basics. Click the tooltips to continue.";
    }
}
