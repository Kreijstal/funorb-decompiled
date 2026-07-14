/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jd extends lg implements sv {
    static String field_e;
    static int[] field_h;
    static String[] field_i;
    static ut[] field_d;
    static int[] field_g;
    private ga field_f;

    final static tv a(byte param0, boolean param1) {
        ml var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ml var8 = null;
        bg var9 = null;
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
                    var7 = Kickabout.field_G;
                    var8 = un.field_e;
                    var2 = var8;
                    var3 = var8.h((byte) -112);
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
                    lo.field_l = stackIn_3_0 != 0;
                    jn.field_ob = 127 & var3;
                    ie.field_F = var8.h((byte) -108);
                    i.field_z = var8.i((byte) -124);
                    if (-3 != (jn.field_ob ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    sc.field_E = var8.a((byte) 81);
                    cj.field_G = var8.i(-119);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    sc.field_E = 0;
                    cj.field_G = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-2 != (var8.h((byte) -116) ^ -1)) {
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
                    var4 = stackIn_9_0;
                    sr.field_d = var8.a(-114);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    hr.field_f = sr.field_d;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    hr.field_f = var8.a(69);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if ((jn.field_ob ^ -1) == -2) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((jn.field_ob ^ -1) == -5) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    oh.field_f = 0;
                    vp.field_e = null;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    oh.field_f = var8.a((byte) 81);
                    vp.field_e = var8.a(42);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    oh.field_f = var8.a((byte) 81);
                    vp.field_e = var8.a(42);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (!param1) {
                        statePc = 31;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = var8.a((byte) 81);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        var9 = lm.field_j.a(-39, var5);
                        ee.field_a = var9.g((byte) -98);
                        if (hr.field_f.equals((Object) (Object) ow.field_e)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var9.field_n;
                        stackIn_22_0 = stackOut_20_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
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
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        gk.field_b = stackIn_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    if (param0 <= 84) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return new tv(param1);
                }
                case 25: {
                    jd.b((byte) 82);
                    return new tv(param1);
                }
                case 27: {
                    var6 = (Exception) (Object) caughtException;
                    bd.a("CC1", (Throwable) (Object) var6, 1);
                    ee.field_a = null;
                    gk.field_b = null;
                    if (param0 <= 84) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return new tv(param1);
                }
                case 29: {
                    jd.b((byte) 82);
                    return new tv(param1);
                }
                case 31: {
                    ee.field_a = gw.a(80, (byte) -96, (iw) (Object) var8);
                    gk.field_b = null;
                    if (param0 > 84) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    jd.b((byte) 82);
                    return new tv(param1);
                }
                case 33: {
                    return new tv(param1);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract rv a(String param0, int param1);

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -28) {
          if (((jd) this).field_f.field_q != null) {
            if (((jd) this).field_f.field_q.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_h = null;
          if (((jd) this).field_f.field_q == null) {
            return true;
          } else {
            L0: {
              if (((jd) this).field_f.field_q.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final rv a(boolean param0) {
        if (param0) {
          rv discarded$2 = ((jd) this).a(true);
          return ((jd) this).a(((jd) this).field_f.field_q, -5);
        } else {
          return ((jd) this).a(((jd) this).field_f.field_q, -5);
        }
    }

    public final void a(int param0, ga param1) {
        int var3 = -82 % ((param0 - 8) / 47);
    }

    public final void a(byte param0, ga param1) {
        if (param0 < 65) {
            return;
        }
        ((jd) this).a(116);
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        po.a(-27, param1);
        jg.a(param0, (byte) -26, param1, param3);
        if (param2 != 14686) {
            field_g = null;
        }
    }

    final String e(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ((jd) this).a((byte) 25, ((jd) this).field_f.field_q);
    }

    jd(ga param0) {
        ((jd) this).field_f = param0;
    }

    abstract String a(byte param0, String param1);

    public static void b(byte param0) {
        int var1 = 91 % ((-57 - param0) / 62);
        field_g = null;
        field_d = null;
        field_e = null;
        field_h = null;
        field_i = null;
    }

    final static boolean f(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (!la.a(100)) {
            if ((eq.field_d ^ -1) >= -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "quickplay";
        field_h = new int[8192];
        field_i = new String[]{"Match me up with a player of similar rating", "Match me up with a player in the same, or nearest league", "Match me up with a player who's team is of a similar level"};
    }
}
