/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp {
    static gb field_a;
    int[] field_c;
    static jpa field_d;
    static String field_b;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                ts.field_g = param0;
                try {
                  L1: {
                    L2: {
                      L3: {
                        var3 = param1.getParameter("cookieprefix");
                        var4 = param1.getParameter("cookiehost");
                        var5 = var3 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                        if (-1 != (param0.length() ^ -1)) {
                          break L3;
                        } else {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          if (!TombRacer.field_G) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var5 = var5 + "; Expires=" + ida.a(bva.b((byte) -107) - -94608000000L, param2 + 21406) + "; Max-Age=" + 94608000L;
                      break L2;
                    }
                    L4: {
                      lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
                      if (param2 == -21407) {
                        break L4;
                      } else {
                        mp.a(-2);
                        break L4;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    throwable = decompiledCaughtException;
                    break L5;
                  }
                }
                v.a((byte) 64, param1);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (runtimeException);

                stackIn_14_1 = new StringBuilder().append("mp.C(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param1 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        vb var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_23_0 = false;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ot.field_v = param1;
                        if (param0 == 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2 = (vb) ((Object) tna.field_e.f(param0 ^ -78));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == var2) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_23_0 = var2.field_h.l((byte) 122);
                        stackIn_6_0 = stackIn_23_0;
                        if (var3 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2.p(78);
                        if (var3 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2.field_f.e(var2.field_g * ot.field_v + 128 >> 720592520);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2 = (vb) ((Object) tna.field_e.e(112));
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null != db.field_f) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2 = (vb) ((Object) db.field_f.f(param0 ^ -78));
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (null == var2) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var3 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = var2.field_h.l((byte) 44);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!stackIn_23_0) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var2.field_f.e(var2.field_g * ot.field_v - -128 >> 622387560);
                        if (var3 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var2.p(param0 + 2);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2 = (vb) ((Object) db.field_f.e(113));
                        if (var3 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw tba.a((Throwable) ((Object) runtimeException), "mp.E(" + param0 + ',' + param1 + ')');
                }
                case 32: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        try {
          L0: {
            var1_int = 11 % ((-52 - param0) / 57);
            stackIn_1_0 = ej.field_a.g(-110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mp.A(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(jea param0, jea param1, boolean param2, jea param3, oj param4, jea param5, int param6, jea param7, jea param8, jea param9, jea param10, il param11) {
        int stackIn_4_0 = 0;
        String stackIn_27_0 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        iu var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        iu[] var16 = null;
        jea var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pm.field_a[3] = 16736511;
                        pm.field_a[2] = 9474303;
                        lpa.field_s = param11;
                        pm.field_a[4] = 16711935;
                        kq.field_c = param2;
                        pm.field_a[0] = 16764000;
                        pm.field_a[1] = 6356832;
                        bn.field_t = param7;
                        bma.field_t[3] = 16736511;
                        bma.field_t[2] = 16736352;
                        sva.field_d = 8421504;
                        bma.field_t[param6] = 16764000;
                        pm.field_a[4] = 16711935;
                        bma.field_t[1] = 6356832;
                        var12 = new iu(4, 4);
                        var13 = var12.field_r;
                        var14 = var12.field_r;
                        var15 = var12.field_r;
                        var12.field_r[15] = 7368816;
                        var13[2] = 7368816;
                        var15[8] = 7368816;
                        var14[5] = 7368816;
                        var16 = new iu[9];
                        var16[4] = var12;
                        era.field_e = new jea(0L, param0);
                        v.field_i = new jea(0L, param9);
                        era.field_e.b(-128, v.field_i);
                        var17 = new jea(0L, (jea) null);
                        var17.field_J = new vna();
                        ne.field_d = new iv(0L, var17, param3, param4);
                        v.field_i.b(-126, ne.field_d);
                        sua.field_K = new jea(0L, param1);
                        v.field_i.b(-124, sua.field_K);
                        pq.field_g = new jea(0L, param5);
                        pq.field_g.field_H = lpa.field_s;
                        sua.field_K.b(param6 + -124, pq.field_g);
                        sua.field_K.a(param6 ^ -10966);
                        mka.field_b = new jea(0L, (jea) null);
                        mka.field_b.field_w = var16;
                        sua.field_K.b(-125, mka.field_b);
                        bt.field_c = new jea[5];
                        kva.field_p = new jea[5];
                        oka.field_y = new jea[5];
                        wba.field_p = new jea[5];
                        var18 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var18 ^ -1) <= -6) {
                            statePc = 30;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_31_0 = var18 ^ -1;
                        stackIn_4_0 = stackIn_31_0;
                        if (var20 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == -1) {
                            statePc = 21;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var18 ^ -1) != -2) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (kq.field_c) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var18 ^ -1) == -3) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var20 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var19 = dna.field_H;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var19 = kh.field_p;
                        if (var20 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!kq.field_c) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_27_0 = cla.field_o;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = wra.field_a;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var19 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        wba.field_p[var18] = new jea(0L, param10);
                        bt.field_c[var18] = new jea(0L, bn.field_t, var19);
                        oka.field_y[var18] = new jea(0L, (jea) null);
                        oka.field_y[var18].field_bb = 1;
                        kva.field_p[var18] = new jea(0L, bn.field_t);
                        kva.field_p[var18].field_bb = 1;
                        wba.field_p[var18].b(-122, bt.field_c[var18]);
                        wba.field_p[var18].b(param6 + -125, oka.field_y[var18]);
                        wba.field_p[var18].b(-125, kva.field_p[var18]);
                        wba.field_p[var18].a(-10966);
                        era.field_e.b(-127, wba.field_p[var18]);
                        gka.field_g = gka.field_g + 1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var18++;
                        if (var20 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ara.field_ub = new jea(0L, param8);
                        ara.field_ub.field_r = ge.field_G;
                        era.field_e.b(-128, ara.field_ub);
                        stackIn_31_0 = o.e(540800) ? 1 : 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (fua.field_g) {
                            statePc = 37;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        apa.field_c = new ada(0, 0, 0, 0);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var12_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var12_ref);
                    stackIn_40_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("mp.D(");
                    stackIn_40_1 = stackIn_42_1;
                    if (param0 == null) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_43_0);
                    stackIn_44_0 = stackIn_46_0;
                    stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
                    stackIn_44_1 = stackIn_46_1;
                    if (param1 == null) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_47_2 = "{...}";
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_47_2 = "null";
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    stackIn_50_0 = (RuntimeException) ((Object) stackIn_47_0);
                    stackIn_48_0 = stackIn_50_0;
                    stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',');
                    stackIn_48_1 = stackIn_50_1;
                    if (param3 == null) {
                        statePc = 50;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_51_2 = "{...}";
                    statePc = 51;
                    continue stateLoop;
                }
                case 50: {
                    stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_51_2 = "null";
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_54_0 = (RuntimeException) ((Object) stackIn_51_0);
                    stackIn_52_0 = stackIn_54_0;
                    stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
                    stackIn_52_1 = stackIn_54_1;
                    if (param4 == null) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_52_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_52_1);
                    stackIn_55_2 = "{...}";
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackIn_55_2 = "null";
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackIn_58_0 = (RuntimeException) ((Object) stackIn_55_0);
                    stackIn_56_0 = stackIn_58_0;
                    stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
                    stackIn_56_1 = stackIn_58_1;
                    if (param5 == null) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_59_2 = "{...}";
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_59_2 = "null";
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_0 = stackIn_62_0;
                    stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param6).append(',');
                    stackIn_60_1 = stackIn_62_1;
                    if (param7 == null) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_63_2 = "{...}";
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_63_2 = "null";
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_64_0 = stackIn_66_0;
                    stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',');
                    stackIn_64_1 = stackIn_66_1;
                    if (param8 == null) {
                        statePc = 66;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_67_0 = (RuntimeException) ((Object) stackIn_64_0);
                    stackIn_67_1 = (StringBuilder) ((Object) stackIn_64_1);
                    stackIn_67_2 = "{...}";
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_67_2 = "null";
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
                    stackIn_68_1 = stackIn_70_1;
                    if (param9 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param10 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param11 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw tba.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ')');
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_b = null;
              if (param0 == 9) {
                break L1;
              } else {
                mp.a(13);
                break L1;
              }
            }
            field_a = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "mp.B(" + param0 + ')');
        }
    }

    public mp() {
        this.field_c = new int[16];
    }

    static {
        field_a = new gb();
        field_b = "Add <%0> to ignore list";
    }
}
