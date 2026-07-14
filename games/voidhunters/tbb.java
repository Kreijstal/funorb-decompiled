/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tbb implements ntb {
    private int[] field_d;
    private int[] field_f;
    private int field_c;
    private int[] field_b;
    private int field_a;
    private int field_g;
    private int[] field_e;

    public final void b(byte param0, tv param1) {
        tbb var3 = null;
        var3 = (tbb) (Object) param1;
        var3.field_b = dob.a(var3.field_b, (byte) -124, var3.field_b);
        var3.field_f = dob.a(var3.field_f, (byte) -105, var3.field_f);
        var3.field_e = dob.a(var3.field_e, (byte) -29, var3.field_e);
        var3.field_d = dob.a(var3.field_d, (byte) -103, var3.field_d);
        if (param0 <= 54) {
          ((tbb) this).field_b = null;
          var3.field_a = var3.field_a;
          var3.field_g = var3.field_g;
          var3.field_c = var3.field_c;
          return;
        } else {
          var3.field_a = var3.field_a;
          var3.field_g = var3.field_g;
          var3.field_c = var3.field_c;
          return;
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 < -109) {
            return;
        }
        ((tbb) this).field_g = -81;
    }

    final void a(byte param0) {
        Object var3 = null;
        L0: {
          ((tbb) this).field_a = ((tbb) this).field_a - 8;
          ((tbb) this).field_g = ((tbb) this).field_g + 1;
          if (((tbb) this).field_a > -1) {
            ((tbb) this).field_a = 0;
            break L0;
          } else {
            break L0;
          }
        }
        if (-5 >= ((tbb) this).field_g) {
          if (param0 < -123) {
            return;
          } else {
            var3 = null;
            ((tbb) this).b((byte) -29, (tv) null);
            return;
          }
        } else {
          ((tbb) this).field_c = (1 + ((tbb) this).field_c) % 64;
          ((tbb) this).field_d[((tbb) this).field_c] = 0;
          ((tbb) this).field_g = 0;
          if (param0 < -123) {
            return;
          } else {
            var3 = null;
            ((tbb) this).b((byte) -29, (tv) null);
            return;
          }
        }
    }

    final void a(byte param0, int param1) {
        Object var4 = null;
        ((tbb) this).field_a = ((tbb) this).field_a + param1;
        if (-256 <= (((tbb) this).field_a ^ -1)) {
          if (param0 > 93) {
            return;
          } else {
            var4 = null;
            ((tbb) this).a((tv) null, 104);
            return;
          }
        } else {
          ((tbb) this).field_a = 255;
          if (param0 > 93) {
            return;
          } else {
            var4 = null;
            ((tbb) this).a((tv) null, 104);
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        if (param2 >= -104) {
          ((tbb) this).field_b = null;
          var8 = ((tbb) this).field_c << 171287137;
          ((tbb) this).field_b[var8] = param4;
          ((tbb) this).field_b[1 + var8] = param6;
          ((tbb) this).field_f[var8] = param1;
          ((tbb) this).field_f[1 + var8] = param0;
          ((tbb) this).field_e[var8] = param3;
          ((tbb) this).field_e[var8 + 1] = param5;
          ((tbb) this).field_d[((tbb) this).field_c] = ((tbb) this).field_a;
          return;
        } else {
          var8 = ((tbb) this).field_c << 171287137;
          ((tbb) this).field_b[var8] = param4;
          ((tbb) this).field_b[1 + var8] = param6;
          ((tbb) this).field_f[var8] = param1;
          ((tbb) this).field_f[1 + var8] = param0;
          ((tbb) this).field_e[var8] = param3;
          ((tbb) this).field_e[var8 + 1] = param5;
          ((tbb) this).field_d[((tbb) this).field_c] = ((tbb) this).field_a;
          return;
        }
    }

    final void a(lta param0, int param1, int param2) {
        if (param1 != 1325107016) {
          ((tbb) this).field_f = null;
          fsb.a(param0, ((tbb) this).field_f, 6407, ((tbb) this).field_g, ((tbb) this).field_b, ((tbb) this).field_e, ((tbb) this).field_c, ((tbb) this).field_d, param2);
          return;
        } else {
          fsb.a(param0, ((tbb) this).field_f, 6407, ((tbb) this).field_g, ((tbb) this).field_b, ((tbb) this).field_e, ((tbb) this).field_c, ((tbb) this).field_d, param2);
          return;
        }
    }

    final static pgb a(int param0, boolean param1) {
        faa var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        faa var8 = null;
        pi var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = VoidHunters.field_G;
                    var8 = qga.field_b;
                    var2 = var8;
                    if (param0 >= 4) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var3 = var8.e((byte) -121);
                    wja.field_a = 127 & var3;
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
                    dab.field_e = stackIn_5_0 != 0;
                    bl.field_A = var8.e((byte) -106);
                    sga.field_q = var8.k(255);
                    if ((wja.field_a ^ -1) == -3) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    sj.field_o = 0;
                    jkb.field_b = 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    sj.field_o = var8.e(1869);
                    jkb.field_b = var8.c((byte) -38);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (-2 != (var8.e((byte) -106) ^ -1)) {
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
                    ti.field_h = var8.a(-1);
                    if (var4 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    uja.field_a = ti.field_h;
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    uja.field_a = var8.a(-1);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (wja.field_a == -2) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (-5 != wja.field_a) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    psb.field_a = var8.e(1869);
                    pva.field_f = var8.a(-1);
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    psb.field_a = var8.e(1869);
                    pva.field_f = var8.a(-1);
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    psb.field_a = 0;
                    pva.field_f = null;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (param1) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    jh.field_p = sib.a(80, (ds) (Object) var8, (byte) 112);
                    un.field_h = null;
                    return new pgb(param1);
                }
                case 22: {
                    var5 = var8.e(1869);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        var9 = usa.field_o.a(var5, -119);
                        jh.field_p = var9.a(80);
                        if (uja.field_a.equals((Object) (Object) kca.field_a)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = var9.field_n;
                        stackIn_26_0 = stackOut_24_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = null;
                        stackIn_26_0 = (int[]) (Object) stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        un.field_h = stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return new pgb(param1);
                }
                case 28: {
                    var6 = (Exception) (Object) caughtException;
                    gna.a((Throwable) (Object) var6, "CC1", 0);
                    un.field_h = null;
                    jh.field_p = null;
                    return new pgb(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(faa param0, boolean param1) {
        if (!param1) {
            return;
        }
        ((tbb) this).field_e = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = 0;
        L0: while (true) {
          if (((tbb) this).field_b.length <= var2) {
            var2 = 0;
            L1: while (true) {
              if (((tbb) this).field_d.length <= var2) {
                var2 = 104 / ((37 - param0) / 55);
                ((tbb) this).field_c = 0;
                ((tbb) this).field_a = 0;
                ((tbb) this).field_g = 0;
                return;
              } else {
                ((tbb) this).field_d[var2] = 0;
                var2++;
                continue L1;
              }
            }
          } else {
            ((tbb) this).field_b[var2] = 0;
            ((tbb) this).field_f[var2] = 0;
            ((tbb) this).field_f[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(no param0, int param1, toa param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param4 == 18126) {
            break L0;
          } else {
            pgb discarded$1 = tbb.a(-98, false);
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (param3.length() > var7) {
            L2: {
              var8 = param3.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = (var5 >> 1325107016) - (-param2.field_c[0] + -param0.b(param3.substring(0, var7)));
                break L2;
              }
            }
            L3: {
              if (-1 != var6) {
                param2.field_c[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (32 != var8) {
                    break L4;
                  } else {
                    var5 = var5 + param1;
                    break L4;
                  }
                }
                param2.field_c[var7] = param2.field_c[0] + ((var5 >> 1751524392) + (param0.b(param3.substring(0, 1 + var7)) + -param0.a((char) var8)));
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              var7++;
              continue L1;
            } else {
              var7++;
              var7++;
              continue L1;
            }
          } else {
            return;
          }
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 74 / ((22 - param0) / 59);
        return false;
    }

    public final void a(tv param0, int param1) {
        if (param1 <= -19) {
            return;
        }
        ((tbb) this).a(-95, 21, (byte) 84, 30, -19, 64, 55);
    }

    tbb() {
        ((tbb) this).field_d = new int[64];
        ((tbb) this).field_c = 0;
        ((tbb) this).field_f = new int[128];
        ((tbb) this).field_b = new int[128];
        ((tbb) this).field_a = 0;
        ((tbb) this).field_g = 0;
        ((tbb) this).field_e = new int[128];
    }

    static {
    }
}
