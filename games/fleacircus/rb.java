/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends gj implements da {
    private bb field_I;
    private bb field_J;
    static int field_H;
    static dd field_G;
    private bb field_F;

    final static void a(int param0, int param1, byte param2) {
        af.field_b = param0;
        vc.field_f = param1;
        if (param2 < 61) {
            rb.a(-16, 15, (byte) 71);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 248) {
                break L1;
              } else {
                rb.a(-65, -100, (byte) -84);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param4 != this.field_F) {
                  break L3;
                } else {
                  na.a((byte) -81);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param4 == this.field_J) {
                  break L4;
                } else {
                  if (this.field_I != param4) {
                    break L2;
                  } else {
                    ak.a(65);
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              oh.d(false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("rb.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2, String param3, int param4, int param5) {
        try {
            int stackIn_4_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_48_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_85_0 = 0;
            int stackIn_88_0 = 0;
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_109_0 = 0;
            int stackIn_111_0 = 0;
            RuntimeException stackIn_113_0 = null;
            StringBuilder stackIn_113_1 = null;
            RuntimeException stackIn_114_0 = null;
            StringBuilder stackIn_114_1 = null;
            RuntimeException stackIn_115_0 = null;
            StringBuilder stackIn_115_1 = null;
            String stackIn_115_2 = null;
            RuntimeException stackIn_116_0 = null;
            StringBuilder stackIn_116_1 = null;
            RuntimeException stackIn_117_0 = null;
            StringBuilder stackIn_117_1 = null;
            RuntimeException stackIn_118_0 = null;
            StringBuilder stackIn_118_1 = null;
            String stackIn_118_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var6_int = 0;
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            Throwable var8_ref_Throwable = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            CharSequence var12 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != sg.field_h) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (id.a(false, param2)) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackIn_4_0 = -1;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0;
                    }
                    case 5: {
                        try {
                            if (rh.field_k == d.field_O) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!param2) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var10 = (String) null;
                            cf.field_c = r.a(false, aj.field_w, (byte) 84, (String) null, param1);
                            if (var9 == 0) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            cf.field_c = lk.a(param1, false, (byte) -35, param3);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ud.field_b.field_i = 0;
                            ud.field_b.a(-11, 14);
                            ud.field_b.a(-11, cf.field_c.a(true).field_c);
                            dk.b((byte) 41, -1);
                            rh.field_k = je.field_P;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (rh.field_k != je.field_P) {
                                statePc = 20;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (gi.a(1, true)) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var6_int = ae.field_a.e(false);
                            if (var6_int == 0) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            rh.field_k = pi.field_g;
                            be.field_a = var6_int;
                            pd.field_l = -1;
                            if (var9 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            rh.field_k = ef.field_h;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ae.field_a.field_i = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (ef.field_h != rh.field_k) {
                                statePc = 23;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (!gi.a(8, true)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ug.field_a = ae.field_a.f(-71);
                            ae.field_a.field_i = 0;
                            wd.a(param2, -120, cf.field_c, param4, param0);
                            rh.field_k = dl.field_w;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (dl.field_w == rh.field_k) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (gi.a(1, true)) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var6_int = ae.field_a.e(false);
                            be.field_a = var6_int;
                            ae.field_a.field_i = 0;
                            wc.field_p = null;
                            if (-1 == (var6_int ^ -1)) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var6_int != 1) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            pd.field_l = -1;
                            rh.field_k = ll.field_r;
                            if (var9 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var6_int == 8) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            rh.field_k = pi.field_g;
                            pd.field_l = -1;
                            if (var9 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            k.c(-28354);
                            aa.field_q = false;
                            stackIn_36_0 = var6_int;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        try {
                            if (ll.field_r == rh.field_k) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!gf.b(-128)) {
                                statePc = 86;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            aj.field_w = ae.field_a.f(-109);
                            qe.field_k = ae.field_a.e(false);
                            ae.field_a.e(false);
                            wc.field_q = ae.field_a.d((byte) -116);
                            var11 = ae.field_a.a((byte) -115);
                            var7 = ae.field_a.e(false);
                            if ((var7 & 1) != 0) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            f.d((byte) -37);
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (!param2) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if ((var7 & 4) == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackIn_48_0 = 1;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_48_0 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            ed.field_a = stackIn_48_0 != 0;
                            if (-1 == (var7 & 8 ^ -1)) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackIn_51_0 = 1;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            stackIn_51_0 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            ee.field_i = stackIn_51_0 != 0;
                            if (!ee.field_i) {
                                statePc = 52;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!bk.field_e) {
                                statePc = 58;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ae.field_a.e(false);
                            ae.field_a.e(false);
                            ae.field_a.c((byte) 123);
                            ge.field_g = ae.field_a.d((byte) -117);
                            gi.field_c = new byte[ge.field_g];
                            var8 = 0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (ge.field_g <= var8) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            gi.field_c[var8] = ae.field_a.i(-127);
                            var8++;
                            if (var9 != 0) {
                                statePc = 59;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var9 == 0) {
                                statePc = 54;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            b.field_e = ae.field_a.h(0);
                            var12 = (CharSequence) ((Object) b.field_e);
                            ma.field_a = uk.a(92, var12);
                            nb.field_h = ae.field_a.e(false);
                            rh.field_k = fh.field_b;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (cf.field_c.a(true) == wa.field_g) {
                                statePc = 63;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (cf.field_c.a(true) == mk.field_i) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            wd.field_b.a(true, rl.a((byte) -116));
                            if (var9 == 0) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ml.field_F.a(true, rl.a((byte) -111));
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            aa.field_q = false;
                            if (var11 != null) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ea.a(376, rl.a((byte) -120), var11);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (0 < wc.field_q) {
                                statePc = 73;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (ed.field_a) {
                                statePc = 73;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            eb.a("unzap", rl.a((byte) -65), -250);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 72;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var8_ref_Throwable = caughtException;
                            if (var9 == 0) {
                                statePc = 76;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            eb.a("zap", new Object[]{rh.a((byte) -70, aj.field_w)}, -11745, rl.a((byte) -126));
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 75;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var8_ref_Throwable = caughtException;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (0 >= wc.field_q) {
                                statePc = 78;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            va.field_m = true;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ud.field_b.a(ue.field_a, (byte) 12);
                            var8 = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (4 <= var8) {
                                statePc = 83;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ue.field_a[var8] = ue.field_a[var8] + 50;
                            var8++;
                            if (var9 != 0) {
                                statePc = 84;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var9 == 0) {
                                statePc = 79;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ae.field_a.a(ue.field_a, (byte) 12);
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackIn_85_0 = be.field_a;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        return stackIn_85_0;
                    }
                    case 86: {
                        try {
                            if (param5 < -19) {
                                statePc = 89;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            stackIn_88_0 = 13;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        return stackIn_88_0;
                    }
                    case 89: {
                        try {
                            if (pi.field_g == rh.field_k) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (!gf.b(115)) {
                                statePc = 101;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            k.c(-28354);
                            if (7 != be.field_a) {
                                statePc = 96;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (aa.field_q) {
                                statePc = 96;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            aa.field_q = true;
                            stackIn_95_0 = -1;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        return stackIn_95_0;
                    }
                    case 96: {
                        try {
                            if (be.field_a == 7) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            be.field_a = 3;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            fh.field_a = ae.field_a.h(0);
                            aa.field_q = false;
                            stackIn_100_0 = be.field_a;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        return stackIn_100_0;
                    }
                    case 101: {
                        try {
                            if (sg.field_h != null) {
                                statePc = 110;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (aa.field_q) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var6_int = be.field_b;
                            be.field_b = ab.field_d;
                            ab.field_d = var6_int;
                            aa.field_q = true;
                            if (var9 == 0) {
                                statePc = 110;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if (-30001L <= (h.b(102) ^ -1L)) {
                                statePc = 107;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            fh.field_a = ok.field_B;
                            if (var9 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            fh.field_a = jc.field_d;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            aa.field_q = false;
                            stackIn_109_0 = 3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        return stackIn_109_0;
                    }
                    case 110: {
                        try {
                            stackIn_111_0 = -1;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        return stackIn_111_0;
                    }
                    case 112: {
                        var6 = (RuntimeException) ((Object) caughtException);
                        stackIn_114_0 = (RuntimeException) (var6);
                        stackIn_113_0 = stackIn_114_0;
                        stackIn_114_1 = new StringBuilder().append("rb.AA(").append(param0).append(',');
                        stackIn_113_1 = stackIn_114_1;
                        if (param1 == null) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    }
                    case 113: {
                        stackIn_115_0 = (RuntimeException) ((Object) stackIn_113_0);
                        stackIn_115_1 = (StringBuilder) ((Object) stackIn_113_1);
                        stackIn_115_2 = "{...}";
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 114: {
                        stackIn_115_0 = (RuntimeException) ((Object) stackIn_114_0);
                        stackIn_115_1 = (StringBuilder) ((Object) stackIn_114_1);
                        stackIn_115_2 = "null";
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        stackIn_117_0 = (RuntimeException) ((Object) stackIn_115_0);
                        stackIn_116_0 = stackIn_117_0;
                        stackIn_117_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_115_2).append(',').append(param2).append(',');
                        stackIn_116_1 = stackIn_117_1;
                        if (param3 == null) {
                            statePc = 117;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    }
                    case 116: {
                        stackIn_118_0 = (RuntimeException) ((Object) stackIn_116_0);
                        stackIn_118_1 = (StringBuilder) ((Object) stackIn_116_1);
                        stackIn_118_2 = "{...}";
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 117: {
                        stackIn_118_0 = (RuntimeException) ((Object) stackIn_117_0);
                        stackIn_118_1 = (StringBuilder) ((Object) stackIn_117_1);
                        stackIn_118_2 = "null";
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        throw pf.a((Throwable) ((Object) stackIn_118_0), stackIn_118_2 + ',' + param4 + ',' + param5 + ')');
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

    public static void a(int param0) {
        field_G = null;
        if (param0 > -95) {
            dd var2 = (dd) null;
            rb.a(127, -14, 40, (dd) null, 38, 110, (byte) -127, -57, -56);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = this.field_y + param1;
        int var6 = this.field_z + param0;
        ug.field_e.a(rd.field_b, var5 + 20, var6 - -20, this.field_u - 40, this.field_j - 50, 16777215, -1, 1, 0, ug.field_e.field_H);
        super.b(param0, param1, param2, param3);
    }

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) != -99) {
                if (param1 != 99) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.b(param2, -28533);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("rb.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    public rb() {
        super(0, 0, 476, 225, (ch) null);
        this.field_J = new bb(qk.field_h, (kd) null);
        this.field_F = new bb(qj.field_J, (kd) null);
        this.field_I = new bb(tc.field_g, (kd) null);
        ri var1 = new ri();
        this.field_J.field_p = (ch) ((Object) var1);
        this.field_F.field_p = (ch) ((Object) var1);
        this.field_I.field_p = (ch) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -1935077055;
        this.field_F.a(-var3 + this.field_u >> -2073875711, var4, -var2 + this.field_j + -48, 30, 80);
        this.field_I.a(var2 + (var4 + (-var3 + this.field_u >> -348715167)), var4, -var2 + (-48 + this.field_j), 30, 80);
        this.field_J.a(this.field_u - var3 >> -1481717663, var3, this.field_j - (78 + var2 * 2), 30, 80);
        this.field_F.field_s = (kd) (this);
        this.field_J.field_s = (kd) (this);
        this.field_J.field_m = se.field_f;
        this.field_I.field_s = (kd) (this);
        this.field_I.field_m = ga.field_n;
        this.a((qa) (this.field_F), (byte) -39);
        this.a((qa) (this.field_J), (byte) -59);
        this.a((qa) (this.field_I), (byte) -53);
    }

    final static void a(int param0, int param1, int param2, dd param3, int param4, int param5, byte param6, int param7, int param8) {
        bh.field_l = param2;
        li.field_i = param8;
        ei.field_V = param1;
        if (param6 <= 119) {
            return;
        }
        try {
            aj.field_q = param7;
            t.field_d = param0;
            kh.field_d = param5;
            wa.field_m = param4;
            pb.field_g = param3;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "rb.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
    }
}
