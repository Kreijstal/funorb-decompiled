/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vb extends bf {
    static String field_i;

    final static void f(int param0) {
        int fieldTemp$0 = 0;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fieldTemp$0 = si.field_r;
                        si.field_r = si.field_r + 1;
                        if ((3 & fieldTemp$0) != 0) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bc.field_a = bc.field_a + 1;
                        if (5 != bc.field_a) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        bc.field_a = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ob.field_r = ob.field_r + 1;
                        if ((ob.field_r ^ -1) == -6) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ob.field_r = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        dd.field_e = dd.field_e + 6;
                        hl.field_a = hl.field_a + 1;
                        ne.field_b = ne.field_b + 6;
                        if (60 >= hl.field_a) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        hl.field_a = 60;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((ah.field_d ^ -1) > -1301) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1801 <= (ah.field_d ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (dk.field_j != 0) {
                            statePc = 30;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (Math.random() <= 0.99) {
                            statePc = 30;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (480 >= ne.field_b) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var1_int = stackIn_17_0;
                        if ((dd.field_e ^ -1) >= -481) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2 = stackIn_20_0;
                        if (var1_int == 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var2 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (Math.random() >= 0.5) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2 = 0;
                        if (var4 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var1_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var2 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        dd.field_e = -df.field_q[0].field_n;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var1_int != 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ne.field_b = -df.field_q[0].field_n;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ah.field_d = ah.field_d + 2;
                        if ((ah.field_d ^ -1) < -2001) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ah.field_d = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param0 >= 15) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        field_i = (String) null;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var1_double = Math.random();
                        if (var1_double > 0.95) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var1_double > 0.975) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        cj.a((byte) -23, ke.field_h[17]);
                        if (var4 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        cj.a((byte) 127, ke.field_h[16]);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (0 != (ah.field_d & 3)) {
                            statePc = 60;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((ah.field_d ^ -1) >= -1301) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((ah.field_d ^ -1) > -1801) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-1 <= (dk.field_j ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        dk.field_j = dk.field_j - 1;
                        if (var4 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (-1306 >= (ah.field_d ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        cj.a((byte) 124, ke.field_h[15]);
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (-201 >= (dk.field_j ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ve.field_x[dk.field_j][0] = pf.a((byte) 104, 640);
                        ve.field_x[dk.field_j][1] = pf.a((byte) -100, 480);
                        dk.field_j = dk.field_j + 1;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var3 = 0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var3 >= dk.field_j) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        dupTemp$1 = ve.field_x[var3];
                        dupTemp$1[0] = dupTemp$1[0] + (pf.a((byte) -122, 3) + -1);
                        dupTemp$2 = ve.field_x[var3];
                        dupTemp$2[1] = dupTemp$2[1] + 2;
                        var3++;
                        if (var4 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        return;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var4 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        return;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1), "vb.F(" + param0 + ')');
                }
                case 60: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void g(int param0) {
        oa.field_G = -1;
        if (param0 < 65) {
          vb.f(-26);
          pf.field_b = null;
          ka.field_a = 0;
          nj.field_a = -1;
          ac.field_b = false;
          return;
        } else {
          pf.field_b = null;
          ka.field_a = 0;
          nj.field_a = -1;
          ac.field_b = false;
          return;
        }
    }

    final static void a(int param0, bk param1, boolean param2) {
        hb var3 = null;
        try {
            var3 = gf.field_c;
            var3.b(param2, param0);
            var3.b(2, -49152);
            var3.b(0, -49152);
            var3.b(param1.field_e, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    vb() {
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var2 = 0;
        if (param0 <= 62) {
          return 28;
        } else {
          L0: {
            if (0 != (7 & param1)) {
              var2 = -(param1 & 7) + 8;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = param1 + var2;
          return var3;
        }
    }

    public static void e(int param0) {
        int var1 = -105 % ((param0 - 14) / 34);
        field_i = null;
    }

    final static void a(byte param0) {
        String var1;
        if (fk.field_a) {
          if (null == me.field_f) {
            var1 = hf.b(0);
            j.field_e = new qi(var1, (String) null, true, false, false);
            if (param0 != 28) {
              field_i = (String) null;
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            } else {
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            }
          } else {
            me.field_f.g((byte) -75);
            var1 = hf.b(0);
            j.field_e = new qi(var1, (String) null, true, false, false);
            if (param0 == 28) {
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            } else {
              field_i = (String) null;
              wg.field_j.b((byte) -54, jh.field_C);
              jh.field_C.c((byte) 119, j.field_e);
              jh.field_C.p(-21);
              return;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (!th.a(false, param1)) {
            if (param1 != 45) {
              if (160 != param1) {
                if (32 != param1) {
                  if (param1 != 95) {
                    if (param0 < 109) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        field_i = "Waiting for graphics";
    }
}
