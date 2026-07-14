/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends wda {
    private boolean field_o;
    private int field_p;
    private int field_q;
    private int field_s;
    static ko field_r;

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 75, param1, ((sa) this).field_p);
        if (param0 != 0) {
            return -7;
        }
        param1 = fs.a((byte) 117, param1, ((sa) this).field_q);
        param1 = fs.a((byte) 121, param1, ((sa) this).field_s);
        return param1;
    }

    final static cn a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 > -75) {
            return null;
        }
        return nt.a(param1, param3, 5200, param2, false, param0);
    }

    final static eua a(jea param0, jea param1, jea param2, int[] param3, boolean param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        eua[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        wua var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = TombRacer.field_G ? 1 : 0;
                    var5 = param3.length;
                    var6 = new String[var5];
                    var14 = new char[var5];
                    var13 = var14;
                    var7 = var13;
                    if (!param4) {
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
                    var8 = new eua[var5];
                    var9 = 49;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var10_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10_int >= var5) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = qu.field_a.a(false, param3[var10_int]);
                        var6[var10_int] = var11.b((byte) -5);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    var10 = (Exception) (Object) caughtException;
                    return null;
                }
                case 8: {
                    return new eua(0L, param2, param0, param1, var8, param3, var6, var14);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            return 68;
        }
        return 10;
    }

    final static void a(boolean param0, byte param1) {
        if (-1 > (mla.field_a ^ -1)) {
            if (!(!uv.field_o)) {
                bea.d(0, 0, bea.field_g, era.field_e.field_A);
                wo.field_k.b(108, param0);
            }
        }
        if (param1 <= 6) {
            Object var3 = null;
            eua discarded$0 = sa.a((jea) null, (jea) null, (jea) null, (int[]) null, true);
        }
        if (gt.field_a >= -1) {
            // if_icmpge L125
        }
        if (!(!tla.field_e)) {
            bea.d(0, 0, bea.field_g, era.field_e.field_A);
            hf.field_a.b(85, param0);
        }
    }

    final void a(kh param0, byte param1) {
        super.a(param0, (byte) -85);
        param0.a((byte) 2, dqa.a(true, ((sa) this).field_p >> -1314422288, 12), 12);
        param0.a((byte) -126, dqa.a(true, ((sa) this).field_q >> -422712784, 12), 12);
        if (param1 > -78) {
            return;
        }
        param0.a((byte) 79, ((sa) this).field_o ? 1 : 0, 1);
        param0.a((byte) 56, dqa.a(true, ((sa) this).field_s, 12), 12);
    }

    final void b(int param0) {
        if (param0 != 1) {
            field_r = null;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var2 = ((sa) this).field_n.s(25745) + -((sa) this).d((byte) -57);
          var5 = -32 / ((-69 - param0) / 42);
          var3 = ((sa) this).field_n.e(false) + -((sa) this).a(false);
          if (((sa) this).field_o) {
            var6 = -((sa) this).field_q + var3 >> -1113489110;
            var4 = -((sa) this).field_p + var2 >> 1187368682;
            break L0;
          } else {
            var6 = ((sa) this).field_q - var3 >> 632890442;
            var4 = ((sa) this).field_p + -var2 >> -750115894;
            break L0;
          }
        }
        var7 = tia.a(var6, var4, -29543) - tia.a(-256, 0, -29543);
        var7 = var7 * -1;
        L1: while (true) {
          if ((var7 ^ -1) <= -1) {
            L2: {
              L3: {
                var8 = var7 - ((sa) this).field_n.g(-25787);
                if (0 >= ((sa) this).field_s) {
                  break L3;
                } else {
                  L4: while (true) {
                    if ((var8 ^ -1) <= 4095) {
                      L5: while (true) {
                        if (var8 <= 4096) {
                          if (((sa) this).field_s < var8) {
                            var8 = ((sa) this).field_s;
                            break L3;
                          } else {
                            if (var8 < -((sa) this).field_s) {
                              var8 = -((sa) this).field_s;
                              ((sa) this).field_n.c(false, var8);
                              break L2;
                            } else {
                              ((sa) this).field_n.c(false, var8);
                              break L2;
                            }
                          }
                        } else {
                          // wide iinc 8 -8192
                          continue L5;
                        }
                      }
                    } else {
                      // wide iinc 8 8192
                      continue L4;
                    }
                  }
                }
              }
              ((sa) this).field_n.c(false, var8);
              break L2;
            }
            return;
          } else {
            // wide iinc 7 8192
            continue L1;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        if (param0 >= -43) {
            field_r = null;
        }
    }

    final void a(int param0, fsa param1) {
        if (param0 <= 35) {
            cn discarded$0 = sa.a(true, 47, true, -59, (byte) -121);
        }
        super.a(110, param1);
    }

    sa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((sa) this).field_o = true;
        ((sa) this).field_p = bla.a(true, 12, param1.b((byte) 44, 12)) << -986938096;
        ((sa) this).field_q = bla.a(true, 12, param1.b((byte) 44, 12)) << 525027408;
        ((sa) this).field_o = -2 == param1.b((byte) 44, 1) ? true : false;
        if (-4 <= ((sa) this).c(true).field_E) {
            ((sa) this).field_s = bla.a(true, 12, param1.b((byte) 44, 12));
        } else {
            ((sa) this).field_s = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ko(1);
    }
}
