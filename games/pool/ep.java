/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ep extends kq {
    private int field_q;
    static ko field_A;
    private int field_E;
    static di field_F;
    static String field_v;
    private int field_B;
    static String field_G;
    String field_t;
    private long field_o;
    private int field_w;
    private boolean field_x;
    private int field_u;
    static dd field_s;
    private boolean field_r;
    static boolean field_z;
    private boolean field_C;
    private int field_D;
    static String field_p;
    static int[] field_H;
    static String field_y;

    private final void c(int param0) {
        int var2 = -25 / ((param0 - 25) / 53);
        fe.field_H[12] = true;
        fe.field_H[11] = true;
        fe.field_H[13] = true;
    }

    final void a(int param0, String param1, int param2, int param3, int param4) {
        Exception var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ep) this).b(param3 ^ -26164)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        ((ep) this).field_t = ((ep) this).getCodeBase().getHost();
                        var10 = ((ep) this).field_t.toLowerCase();
                        stackOut_2_0 = this;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_3_0 = stackOut_2_0;
                        if (var10.equals((Object) (Object) "jagex.com")) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var10.endsWith(".jagex.com")) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackOut_5_1 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((ep) this).field_x = stackIn_7_1 != 0;
                        ((ep) this).field_u = Integer.parseInt(((ep) this).getParameter("gameport1"));
                        ((ep) this).field_B = Integer.parseInt(((ep) this).getParameter("gameport2"));
                        var7 = ((ep) this).getParameter("servernum");
                        if (var7 != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((ep) this).field_q = Integer.parseInt(var7);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ep) this).field_D = Integer.parseInt(((ep) this).getParameter("gamecrc"));
                        ((ep) this).field_o = Long.parseLong(((ep) this).getParameter("instanceid"));
                        ((ep) this).field_r = ((ep) this).getParameter("member").equals((Object) (Object) "yes");
                        var8 = ((ep) this).getParameter("lang");
                        if (var8 != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((ep) this).field_E = Integer.parseInt(var8);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((ep) this).field_E ^ -1) > -6) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((ep) this).field_E = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = ((ep) this).getParameter("affid");
                        if (var9 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ep) this).field_w = Integer.parseInt(var9);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        sd.field_T = Boolean.valueOf(((ep) this).getParameter("simplemode")).booleanValue();
                        ((ep) this).a(((ep) this).field_D, param2, param1, (byte) 115, 32, param4, param0);
                        if (param3 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((ep) this).a(-57, 27, 54, 110, 115, false, -63, 23);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var6 = (Exception) (Object) caughtException;
                    tc.a((Throwable) (Object) var6, (String) null, param3 + -8555);
                    ((ep) this).a((byte) 100, "crash");
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        L0: {
          this.b(0, true);
          if (param3) {
            this.j(param0 ^ -42);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param6) {
            this.i(7);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!param1) {
            break L2;
          } else {
            this.g(-22045);
            break L2;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          L3: {
            if (!param5) {
              break L3;
            } else {
              this.j((byte) -98);
              break L3;
            }
          }
          L4: {
            if (!param4) {
              break L4;
            } else {
              this.b(true);
              break L4;
            }
          }
          L5: {
            if (param2) {
              this.c(-55);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    private final void b(boolean param0) {
        fe.field_H[6] = param0;
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            ge var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Pool.field_O;
                        var4 = ek.a((byte) -88, param1, wp.field_d, gj.field_S);
                        if (0 != var4) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if ((var4 ^ -1) != -2) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var5_int = kb.a(9539, lg.c(5), eh.c(8388));
                        if (-1 != var5_int) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        sq.a(bi.field_b, false, var5_int, ke.field_g);
                        bi.field_b = null;
                        ke.field_g = null;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var11 = sb.a(118);
                        if (var11 != null) {
                            statePc = 8;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        cq.a(var11.booleanValue(), 68);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if ((var4 ^ -1) == -3) {
                            statePc = 11;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var5_int = fn.a(gd.a(true), ((ep) this).field_w, sa.a(false), 50, cn.a((byte) 108), kg.c((byte) 64), ng.c(12854));
                        if (-1 == var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ke.a(ke.field_g, var5_int, bi.field_b, (byte) -16);
                        bi.field_b = null;
                        ke.field_g = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if ((var4 ^ -1) != -4) {
                            statePc = 23;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if ((sk.field_a ^ -1) == 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (0 == sk.field_a) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        sk.field_a = -1;
                        wa.i((byte) 72);
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (!param0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        rg.field_v = false;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = np.a(false, sa.a(false), false, ((ep) this).field_x, ((ep) this).field_w, kg.c((byte) 54));
                        if (0 == (var5_int ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (var5_int == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        re.a(true, ke.field_g, var5_int);
                        ke.field_g = null;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        hf.field_e = hm.field_a;
                        kh.f((byte) 121);
                        gk.field_kb = false;
                        fk.field_ab = 10;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (4 != var4) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (bf.field_g) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        fk.field_ab = 10;
                        gk.field_kb = true;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        wb.a(false, hk.d(76));
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        if (5 != var4) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        tk.a(-1, hk.d(79));
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (var4 == 6) {
                            statePc = 31;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (!mf.field_o) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        fk.field_ab = 10;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (var4 == -8) {
                            statePc = 35;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        nl.a((byte) 112, hk.d(99));
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (8 != var4) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        wb.a(false, hk.d(104));
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (-10 != var4) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        hp.a((byte) 83, hk.d(60));
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (var4 != -11) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        ej.field_j.b(false, 17);
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (-12 != var4) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        gg.a(hk.d(114), (byte) -121);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (param2 < -96) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        ((ep) this).f(91);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if ((var4 ^ -1) != -13) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        ui.a(rc.b(true), hk.d(109), false);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (13 == var4) {
                            statePc = 50;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        try {
                            if (null == l.field_d) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            l.field_d = new ej(lg.field_s, new java.net.URL(((ep) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (l.field_d.a((byte) -118)) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var12 = l.field_d.a(-25955);
                            if (var12 != null) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var9 = null;
                            hg.a((String) null, true);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var7 = tl.a(var12.field_v, -7510, var12.field_t, 0);
                            hg.a(var7, true);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            l.field_d = null;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        var5 = (Exception) (Object) caughtException;
                        tc.a((Throwable) (Object) var5, "S1", -8555);
                        var10 = null;
                        hg.a((String) null, true);
                        l.field_d = null;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (var4 != 15) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        fk.field_ab = 10;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if ((var4 ^ -1) != -17) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        return 1;
                    }
                    case 65: {
                        if ((var4 ^ -1) != -18) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        return 2;
                    }
                    case 67: {
                        return 0;
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

    public static void a(boolean param0) {
        if (!param0) {
            ep.a(false);
        }
        field_p = null;
        field_H = null;
        field_v = null;
        field_F = null;
        field_y = null;
        field_A = null;
        field_G = null;
        field_s = null;
    }

    private final void j(byte param0) {
        fe.field_H[5] = true;
        if (param0 != -98) {
            this.j((byte) -122);
        }
    }

    final void f(int param0) {
        int var2 = 0;
        pn var3 = null;
        int var4 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        L0: {
          var4 = Pool.field_O;
          var2 = uq.field_c;
          if ((var2 ^ -1) <= -65) {
            break L0;
          } else {
            if (!fe.field_H[var2]) {
              break L0;
            } else {
              if (-1 == var2) {
                return;
              } else {
                L1: {
                  if (var2 == 1) {
                    cm.f(80);
                    break L1;
                  } else {
                    if (2 == var2) {
                      id.c(param0 + -14873);
                      break L1;
                    } else {
                      if (var2 != 3) {
                        if (-5 == var2) {
                          wi.a(199);
                          break L1;
                        } else {
                          if (5 != var2) {
                            if (var2 == -7) {
                              da.a((byte) 106);
                              break L1;
                            } else {
                              if (var2 != 7) {
                                if (var2 == 8) {
                                  vn.a((byte) 34, of.field_Pb, lg.field_s, (ge) (Object) kn.field_e);
                                  break L1;
                                } else {
                                  if (-17 != var2) {
                                    L2: {
                                      if (-12 == var2) {
                                        break L2;
                                      } else {
                                        if (-13 == var2) {
                                          break L2;
                                        } else {
                                          if (-14 != var2) {
                                            if (-18 == var2) {
                                              this.d(70);
                                              break L1;
                                            } else {
                                              if (-19 != (var2 ^ -1)) {
                                                tc.a((Throwable) null, "MGS1: " + t.a(127), param0 + -23555);
                                                dn.c(-75);
                                                break L1;
                                              } else {
                                                ul.i(3);
                                                break L1;
                                              }
                                            }
                                          } else {
                                            ga.n(29769);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_27_0 = -31;
                                      stackIn_29_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackOut_29_1 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        break L3;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackOut_28_1 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_30_1 = stackOut_28_1;
                                        break L3;
                                      }
                                    }
                                    var3 = ee.a((byte) stackIn_30_0, stackIn_30_1 != 0);
                                    ee.a(var3, 101);
                                    break L1;
                                  } else {
                                    ea.c((byte) -56);
                                    break L1;
                                  }
                                }
                              } else {
                                this.h(6);
                                break L1;
                              }
                            }
                          } else {
                            nk.a(param0 + -14874);
                            break L1;
                          }
                        }
                      } else {
                        uo.f(-104);
                        break L1;
                      }
                    }
                  }
                }
                L4: {
                  if (param0 == 15000) {
                    break L4;
                  } else {
                    int discarded$1 = ((ep) this).a(true, true);
                    break L4;
                  }
                }
                return;
              }
            }
          }
        }
        tc.a((Throwable) null, "MGS2: " + t.a(param0 + -14914), -8555);
        dn.c(-108);
    }

    private final void i(int param0) {
        if (param0 != 7) {
            field_F = null;
        }
        fe.field_H[2] = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ep) this).setBackground(java.awt.Color.black);
        gj.field_S = ((ep) this).field_E;
        th.a((byte) -94, gj.field_S);
        vp.a(((ep) this).field_u, ((ep) this).field_D, (byte) 86, ((ep) this).field_r, gj.field_S, ((ep) this).field_B, param5, ((ep) this).field_t, lg.field_s, 5000, ((ep) this).field_q, 5000, param6, ((ep) this).field_o);
        je.a(lg.field_s, param6, ((ep) this).field_D, ((ep) this).field_B, ((ep) this).field_t, (byte) -96, ((ep) this).field_u, gj.field_S, ((ep) this).field_q);
        fl.a(true);
        oa.field_a = nn.b(96);
        kc.a(pa.field_K, param4 + param4);
        jd.field_d = param2;
        mk.field_c = param0;
        pp.field_a = param7;
        cj.field_eb = param1;
        ie.field_g = param3;
        this.i((byte) -81);
        ao.c(false);
    }

    final static void a(byte param0, uf param1) {
        ij var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        ij var6 = null;
        Object var7 = null;
        ij var7_ref = null;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var7 = null;
          var4 = Pool.field_O;
          if (!nd.field_i.c(0)) {
            L1: {
              kg.field_m = kg.field_m + 1;
              if (kq.field_l != null) {
                kq.field_l.a(false, 50, kg.field_m);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null == nl.field_b) {
                break L2;
              } else {
                nl.field_b.a(false, 50, kg.field_m);
                break L2;
              }
            }
            L3: {
              var6 = (ij) (Object) nd.field_i.c((byte) 80);
              if (var6.field_H - -var6.field_B + var6.field_y <= kg.field_m) {
                L4: {
                  var2 = (ij) (Object) nd.field_i.e((byte) -41);
                  if ((ij) (Object) nd.field_i.e((byte) -41) != null) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = -1;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                kg.field_m = stackIn_16_0;
                var7_ref = (ij) (Object) nd.field_i.c((byte) -27);
                break L3;
              } else {
                break L3;
              }
            }
            if (var7_ref != null) {
              L5: {
                if (var7_ref.field_I != null) {
                  var7_ref.field_L[1] = (var7_ref.field_I.field_Db >> -1610738527) + var7_ref.field_I.field_ib;
                  var7_ref.field_L[0] = (var7_ref.field_I.field_gb >> 1762403489) + var7_ref.field_I.field_sb;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (null == var7_ref.field_l) {
                  break L6;
                } else {
                  var7_ref.field_z[0] = (var7_ref.field_l.field_gb >> -695968895) + var7_ref.field_l.field_sb;
                  var7_ref.field_z[1] = (var7_ref.field_l.field_Db >> 630292417) + var7_ref.field_l.field_ib;
                  break L6;
                }
              }
              L7: {
                if (null == var7_ref.field_q) {
                  break L7;
                } else {
                  var7_ref.field_x[1] = var7_ref.field_q.field_ib - -(var7_ref.field_q.field_Db >> 1613030337);
                  var7_ref.field_x[0] = var7_ref.field_q.field_sb + (var7_ref.field_q.field_gb >> 1142865089);
                  break L7;
                }
              }
              L8: {
                if (null == var7_ref.field_p) {
                  break L8;
                } else {
                  uj.a(param1, var7_ref, var7_ref.field_L, var7_ref.field_p, 1);
                  break L8;
                }
              }
              L9: {
                if (var7_ref.field_F != null) {
                  uj.a(param1, var7_ref, var7_ref.field_z, var7_ref.field_F, 1);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var7_ref.field_D == null) {
                  break L10;
                } else {
                  uj.a(param1, var7_ref, var7_ref.field_x, var7_ref.field_D, 1);
                  break L10;
                }
              }
              if (kg.field_m < var7_ref.field_H) {
                L11: {
                  if (-1 != (1 & var7_ref.field_v ^ -1)) {
                    var7_ref.field_J = var7_ref.field_L[0] + bc.a(-var7_ref.field_L[0] + var7_ref.field_z[0], kg.field_m, var7_ref.field_H, param0 + 13849);
                    var7_ref.field_C = var7_ref.field_L[1] + bc.a(-var7_ref.field_L[1] + var7_ref.field_z[1], kg.field_m, var7_ref.field_H, 13776);
                    break L11;
                  } else {
                    var7_ref.field_J = var7_ref.field_z[0];
                    var7_ref.field_C = var7_ref.field_z[1];
                    break L11;
                  }
                }
                L12: {
                  if (0 != (var7_ref.field_v & 8)) {
                    var7_ref.field_w = bc.a(256, kg.field_m, var7_ref.field_H, 13776);
                    break L12;
                  } else {
                    var7_ref.field_w = 256;
                    break L12;
                  }
                }
                if ((4 & var7_ref.field_v) != 0) {
                  var7_ref.field_E = ck.a((byte) -127, 4000, var7_ref.field_y, kg.field_m) + 96;
                  break L0;
                } else {
                  if (0 != (var7_ref.field_v & 2)) {
                    var7_ref.field_E = 4096 + bc.a(2048, kg.field_m, var7_ref.field_H, 13776);
                    break L0;
                  } else {
                    var7_ref.field_E = 0;
                    break L0;
                  }
                }
              } else {
                if (kg.field_m >= var7_ref.field_H + var7_ref.field_B) {
                  if (var7_ref.field_y + var7_ref.field_H + var7_ref.field_B > kg.field_m) {
                    L13: {
                      var3 = -var7_ref.field_B + -var7_ref.field_H + kg.field_m;
                      if (-1 != (var7_ref.field_r & 1 ^ -1)) {
                        var7_ref.field_J = var7_ref.field_z[0] + bc.a(-var7_ref.field_z[0] + var7_ref.field_x[0], var3, var7_ref.field_y, 13776);
                        var7_ref.field_C = var7_ref.field_z[1] - -bc.a(-var7_ref.field_z[1] + var7_ref.field_x[1], var3, var7_ref.field_y, 13776);
                        break L13;
                      } else {
                        var7_ref.field_C = var7_ref.field_x[1];
                        var7_ref.field_J = var7_ref.field_x[0];
                        break L13;
                      }
                    }
                    L14: {
                      if ((8 & var7_ref.field_r) != 0) {
                        var7_ref.field_w = ec.a(32635, var7_ref.field_y, -var3 + var7_ref.field_y, 256);
                        break L14;
                      } else {
                        var7_ref.field_w = 256;
                        break L14;
                      }
                    }
                    if (-1 == (4 & var7_ref.field_r ^ -1)) {
                      if ((var7_ref.field_r & 2) == 0) {
                        var7_ref.field_E = 0;
                        break L0;
                      } else {
                        var7_ref.field_E = bc.a(2048, var3, var7_ref.field_y, param0 + 13849) + 4096;
                        break L0;
                      }
                    } else {
                      var7_ref.field_E = 96 + ck.a((byte) -126, 4000, var7_ref.field_y, -var3 + var7_ref.field_y);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  var7_ref.field_E = 0;
                  var7_ref.field_J = var7_ref.field_z[0];
                  var7_ref.field_C = var7_ref.field_z[1];
                  break L0;
                }
              }
            } else {
              return;
            }
          } else {
            if (-1 != kg.field_m) {
              kg.field_m = -1;
              break L0;
            } else {
              L15: {
                if (param0 == -73) {
                  break L15;
                } else {
                  var5 = null;
                  ep.a((byte) -7, (uf) null);
                  break L15;
                }
              }
              return;
            }
          }
        }
        L16: {
          if (param0 == -73) {
            break L16;
          } else {
            var5 = null;
            ep.a((byte) -7, (uf) null);
            break L16;
          }
        }
    }

    private final void g(int param0) {
        fe.field_H[4] = true;
        if (param0 != -22045) {
            ((ep) this).field_D = 101;
        }
    }

    final void l(byte param0) {
        int var3 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        var3 = Pool.field_O;
        if (param0 > -64) {
          return;
        } else {
          L0: {
            if (gg.a(true)) {
              L1: {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (ne.field_u == null) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L1;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L1;
                }
              }
              int discarded$370 = this.a(stackIn_11_1 != 0, stackIn_11_2 != 0, -114);
              break L0;
            } else {
              if (sf.field_y < 10) {
                break L0;
              } else {
                if (!u.a(77)) {
                  un.b(121);
                  break L0;
                } else {
                  if (fk.field_ab != 0) {
                    ln.a(0, wp.field_d);
                    break L0;
                  } else {
                    int discarded$371 = this.a(false, false, -124);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void h(int param0) {
        if (param0 != 6) {
            ((ep) this).l((byte) -16);
        }
        String var2 = ec.a(false);
        aj.a(hk.d(115), -18788, var2);
    }

    final int a(boolean param0, boolean param1) {
        if (param1) {
            return -1;
        }
        return this.a(true, param0, -105);
    }

    private final void d(int param0) {
        int var4 = 122 % ((-11 - param0) / 50);
        int var2 = kn.field_e.g(-74);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var5 = -1 + of.field_Pb;
        byte[] var6 = new byte[var5];
        kn.field_e.a(0, -109, var6, var5);
        jc.a(-10553, hk.d(70), a.a(var6, -99), var3 != 0);
    }

    private final int e(int param0) {
        int var2 = 0;
        if (!((ep) this).field_n) {
          if (pk.b((byte) 109)) {
            if (!rg.field_v) {
              var2 = np.a(false, sa.a(false), true, ((ep) this).field_x, ((ep) this).field_w, kg.c((byte) 121));
              if (param0 == var2) {
                return -1;
              } else {
                if (-1 != var2) {
                  if (1 == var2) {
                    L0: {
                      if (fk.field_ab != 11) {
                        break L0;
                      } else {
                        if (0 == sk.field_a) {
                          kh.f((byte) -50);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return var2;
                  } else {
                    L1: {
                      if (!bi.field_f) {
                        ((ep) this).a((byte) 22, "reconnect");
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    de.c(param0 + 11);
                    re.a(true, ke.field_g, var2);
                    rg.field_v = true;
                    ia.field_k = rl.a((byte) -93) + 15000L;
                    return var2;
                  }
                } else {
                  L2: {
                    if (fk.field_ab != 11) {
                      break L2;
                    } else {
                      if (0 == sk.field_a) {
                        kh.f((byte) -50);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var2;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void j(int param0) {
        if (param0 < 27) {
            field_s = null;
        }
        fe.field_H[1] = true;
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_146_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_145_0 = 0;
        int stackOut_144_0 = 0;
        L0: {
          var5 = Pool.field_O;
          if (fk.field_gb == null) {
            break L0;
          } else {
            L1: {
              if (ne.field_u == null) {
                var6 = hg.a(false);
                var4 = var6.getSize();
                fk.field_gb.a(var4.width, 51, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            fk.field_gb.a(true);
            break L0;
          }
        }
        L2: {
          id.a(127);
          bo.a((byte) 123);
          if (ue.a((byte) -124)) {
            break L2;
          } else {
            if ((fk.field_ab ^ -1) != -12) {
              t.b(-11);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == oa.field_a) {
            break L3;
          } else {
            wp.field_d = oa.field_a.b(2);
            break L3;
          }
        }
        L4: {
          if (mg.a(-66)) {
            L5: {
              var3 = up.a(-21282) * 1200;
              if (((ep) this).field_C) {
                break L5;
              } else {
                if (var3 >= nj.a(-21055)) {
                  break L4;
                } else {
                  if (sk.a((byte) 119) <= var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ep) this).field_C = false;
            dn.c(-80);
            de.c(param0 + 15);
            re.a(true, bm.field_l, 2);
            qr.c(640);
            rg.field_v = true;
            ia.field_k = 15000L + rl.a((byte) -101);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          if (param0 == -4) {
            break L6;
          } else {
            int discarded$1 = ((ep) this).a(true, false);
            break L6;
          }
        }
        L7: {
          L8: {
            if (sk.field_a == -1) {
              break L8;
            } else {
              if (sk.field_a != -1) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (0 != sk.field_a) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L9;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_26_0;
            sk.field_a = dp.b(-69);
            if (var3 == 0) {
              break L10;
            } else {
              if (sk.field_a == 0) {
                if (11 != fk.field_ab) {
                  break L10;
                } else {
                  if (!pk.b((byte) 109)) {
                    kh.f((byte) 124);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          if (-1 == sk.field_a) {
            break L7;
          } else {
            if (sk.field_a != 0) {
              ia.field_k = rl.a((byte) -99) - -15000L;
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if ((sk.field_a ^ -1) == 0) {
            break L11;
          } else {
            if (sk.field_a == -1) {
              break L11;
            } else {
              if (10 <= sf.field_y) {
                if (-11 < fk.field_ab) {
                  break L11;
                } else {
                  L12: {
                    de.c(11);
                    if (3 != sk.field_a) {
                      if (-5 != sk.field_a) {
                        if (sk.field_a == 2) {
                          re.a(true, hh.field_b, 256);
                          break L12;
                        } else {
                          if (sk.field_a == 5) {
                            re.a(true, dk.field_h, 5);
                            break L12;
                          } else {
                            re.a(true, bc.field_e, 256);
                            break L12;
                          }
                        }
                      } else {
                        re.a(true, cm.field_I, 256);
                        break L12;
                      }
                    } else {
                      re.a(true, br.field_L, 256);
                      break L12;
                    }
                  }
                  rg.field_v = true;
                  break L11;
                }
              } else {
                if (-4 != sk.field_a) {
                  if (sk.field_a != 4) {
                    if ((sk.field_a ^ -1) != -3) {
                      if (5 != sk.field_a) {
                        ((ep) this).a((byte) -93, "js5connect");
                        break L11;
                      } else {
                        ((ep) this).a((byte) 103, "outofdate");
                        break L11;
                      }
                    } else {
                      ((ep) this).a((byte) -30, "js5connect_full");
                      break L11;
                    }
                  } else {
                    ((ep) this).a((byte) -2, "js5io");
                    break L11;
                  }
                } else {
                  ((ep) this).a((byte) -117, "js5crc");
                  break L11;
                }
              }
            }
          }
        }
        L13: {
          if (-1 != sk.field_a) {
            if (sk.field_a != 0) {
              if ((ia.field_k ^ -1L) < (rl.a((byte) -126) ^ -1L)) {
                break L13;
              } else {
                rg.field_v = false;
                if (-1 == sk.field_a) {
                  break L13;
                } else {
                  if (0 == sk.field_a) {
                    break L13;
                  } else {
                    sk.field_a = -1;
                    wa.i((byte) 72);
                    break L13;
                  }
                }
              }
            } else {
              if (!pk.b((byte) 109)) {
                break L13;
              } else {
                if ((ia.field_k ^ -1L) < (rl.a((byte) -126) ^ -1L)) {
                  break L13;
                } else {
                  rg.field_v = false;
                  if (-1 == sk.field_a) {
                    break L13;
                  } else {
                    if (0 == sk.field_a) {
                      break L13;
                    } else {
                      sk.field_a = -1;
                      wa.i((byte) 72);
                      break L13;
                    }
                  }
                }
              }
            }
          } else {
            if (!pk.b((byte) 109)) {
              break L13;
            } else {
              if ((ia.field_k ^ -1L) < (rl.a((byte) -126) ^ -1L)) {
                break L13;
              } else {
                rg.field_v = false;
                if (-1 == sk.field_a) {
                  break L13;
                } else {
                  if (0 == sk.field_a) {
                    break L13;
                  } else {
                    sk.field_a = -1;
                    wa.i((byte) 72);
                    break L13;
                  }
                }
              }
            }
          }
        }
        L14: {
          if (sk.field_a != -1) {
            break L14;
          } else {
            if (!pk.b((byte) 109)) {
              uh.field_o = false;
              break L14;
            } else {
              break L14;
            }
          }
        }
        L15: {
          if (-1 == sf.field_y) {
            if (!hi.e(-11071)) {
              break L15;
            } else {
              sf.field_y = 1;
              break L15;
            }
          } else {
            break L15;
          }
        }
        L16: {
          if (1 != sf.field_y) {
            break L16;
          } else {
            L17: {
              if (gj.field_S == 0) {
                break L17;
              } else {
                wh.field_a = fh.a(jd.field_d, (byte) 103);
                break L17;
              }
            }
            uj.field_d = oq.a(false, -4, 1, pp.field_a, true);
            vf.field_nb = oq.a(false, -49, 1, ie.field_g, true);
            rg.field_r = oq.a(false, -40, 1, cj.field_eb, true);
            qp.field_Zb = vf.field_nb;
            sf.field_y = 2;
            sd.field_R = uj.field_d;
            break L16;
          }
        }
        L18: {
          if (-3 != (sf.field_y ^ -1)) {
            break L18;
          } else {
            L19: {
              if (wh.field_a != null) {
                if (!wh.field_a.d(85)) {
                  break L19;
                } else {
                  if (!wh.field_a.a((byte) -122, "")) {
                    wh.field_a = null;
                    break L19;
                  } else {
                    if (wh.field_a.a("", param0 ^ -4)) {
                      nk.a(wh.field_a, -21013);
                      wh.field_a = null;
                      fm.a(0);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              } else {
                break L19;
              }
            }
            if (wh.field_a != null) {
              break L18;
            } else {
              sf.field_y = 3;
              break L18;
            }
          }
        }
        L20: {
          if (sf.field_y == 3) {
            if (!k.a(uj.field_d, vf.field_nb, rg.field_r, true)) {
              break L20;
            } else {
              if (ab.a(rg.field_r, true)) {
                L21: {
                  L22: {
                    dn.d(8192);
                    ia.a((byte) 98);
                    am.field_n = o.field_A;
                    mf.field_o = false;
                    uf.a(param0 ^ 11934, bf.field_g, uj.field_d, rg.field_r, vf.field_nb);
                    if (pd.field_g) {
                      break L22;
                    } else {
                      if (null == b.field_J) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    stackOut_108_0 = -122;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_109_0 = stackOut_108_0;
                    if (pd.field_g) {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      break L23;
                    } else {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_111_0 = stackIn_111_0;
                    stackOut_111_1 = stackIn_111_1;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    if (pd.field_g) {
                      stackOut_113_0 = stackIn_113_0;
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      stackIn_114_2 = stackOut_113_2;
                      break L24;
                    } else {
                      stackOut_112_0 = stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_114_2 = stackOut_112_2;
                      break L24;
                    }
                  }
                  tg.a(stackIn_114_0, stackIn_114_1 != 0, stackIn_114_2 != 0, b.field_J);
                  break L21;
                }
                L25: {
                  if (sd.field_T) {
                    al.m(4);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null == oh.field_c) {
                    oh.field_c = vb.b(105);
                    u.field_a = sq.g(108);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                wj.a(rg.field_r, u.field_a, false, oh.field_c);
                rg.field_r = null;
                vf.field_nb = null;
                uj.field_d = null;
                pr.a(-23989, (java.applet.Applet) this);
                fm.a(0);
                sf.field_y = 10;
                break L20;
              } else {
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L27: {
          if (sf.field_y == -11) {
            L28: {
              if (-1 == gj.field_S) {
                break L28;
              } else {
                kq.field_m = fh.a(mk.field_c, (byte) 103);
                break L28;
              }
            }
            sf.field_y = 11;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if (-12 == (sf.field_y ^ -1)) {
            L30: {
              if (kq.field_m == null) {
                break L30;
              } else {
                L31: {
                  if (!kq.field_m.d(param0 ^ -52)) {
                    break L31;
                  } else {
                    if (kq.field_m.c(param0 ^ 61)) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                fo.a(hp.a(kq.field_m, ir.field_b, -641, ud.field_F), 0.0f, false);
                break L29;
              }
            }
            od.field_c = true;
            sf.field_y = 12;
            break L29;
          } else {
            break L29;
          }
        }
        L32: {
          if (-13 == sf.field_y) {
            if (!od.field_c) {
              sf.field_y = 13;
              break L32;
            } else {
              break L32;
            }
          } else {
            break L32;
          }
        }
        L33: {
          if (-14 == sf.field_y) {
            L34: {
              var3 = 1;
              if (jl.field_e == null) {
                break L34;
              } else {
                L35: {
                  if (!jl.field_e.b((byte) -51)) {
                    stackOut_145_0 = 0;
                    stackIn_146_0 = stackOut_145_0;
                    break L35;
                  } else {
                    stackOut_144_0 = 1;
                    stackIn_146_0 = stackOut_144_0;
                    break L35;
                  }
                }
                var3 = stackIn_146_0;
                fo.a(jl.field_e.field_m, jl.field_e.field_c, false);
                break L34;
              }
            }
            if (var3 == 0) {
              break L33;
            } else {
              sf.field_y = 20;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L36: {
          if (param1) {
            break L36;
          } else {
            if (!wd.field_Sb) {
              break L36;
            } else {
              he.a(pa.field_K, 0);
              ((ep) this).f((byte) 86);
              kc.a(pa.field_K, 2);
              break L36;
            }
          }
        }
        L37: {
          if (!fe.field_H[8]) {
            break L37;
          } else {
            fd.h(119);
            break L37;
          }
        }
    }

    private final void b(int param0, boolean param1) {
        fe.field_H[18] = true;
        fe.field_H[3] = true;
        fe.field_H[17] = true;
        fe.field_H[param0] = true;
        fe.field_H[7] = true;
        fe.field_H[16] = true;
        fe.field_H[8] = param1;
    }

    private final void i(byte param0) {
        r.field_m[4] = -1;
        r.field_m[2] = -2;
        r.field_m[16] = -1;
        r.field_m[8] = -2;
        r.field_m[13] = -1;
        r.field_m[3] = -1;
        r.field_m[9] = -1;
        r.field_m[18] = 1;
        r.field_m[12] = -1;
        r.field_m[17] = -1;
        r.field_m[1] = 16;
        r.field_m[6] = -2;
        r.field_m[5] = -1;
        r.field_m[7] = -1;
        r.field_m[10] = -1;
        r.field_m[11] = -1;
        if (param0 != -81) {
            ((ep) this).field_u = 93;
        }
    }

    final static dd[] a(int param0, di param1, String param2, String param3) {
        if (param0 < 36) {
            Object var6 = null;
            ep.a((byte) -107, (uf) null);
        }
        int var4 = param1.b(param3, -1);
        int var5 = param1.a(var4, 0, param2);
        return im.a(var4, var5, 0, param1);
    }

    protected ep() {
    }

    final int k(byte param0) {
        int var2 = -86 % ((param0 - -81) / 39);
        int var3 = this.e(0);
        if (-1 != (var3 ^ -1)) {
            // if_icmpeq L35
        } else {
            if (!(!fe.field_H[1])) {
                tp.a(true, 2);
            }
            if (fe.field_H[2]) {
                eh.a(3, true);
            }
            if (!(!fe.field_H[3])) {
                db.a((byte) 58, 4);
            }
            if (fe.field_H[4]) {
                af.a(5, true);
            }
            if (fe.field_H[5]) {
                um.a(10, 6);
            }
            if (fe.field_H[6]) {
                nk.a(7, (byte) -91);
            }
            if (fe.field_H[8]) {
                rq.c(946);
            }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Nine-ball Tutorial";
        field_v = "This is <%0>'s RuneScape clan if they have one.";
        field_z = false;
        field_p = "Report <%0> for abuse";
        field_s = new dd(360, 240);
        field_y = "Log in / Create account";
    }
}
