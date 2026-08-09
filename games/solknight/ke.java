/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends si {
    static int field_I;
    private int field_P;
    static int field_J;
    static o field_K;
    private mg field_M;
    static String[] field_O;
    static int field_N;
    static mg field_H;
    private int field_S;
    private String field_Q;
    private boolean field_L;
    private int field_R;

    public static void d(byte param0) {
        String var2;
        if (param0 != -61) {
          var2 = (String) null;
          ke.a((byte) 115, (java.applet.Applet) null, (String) null, false);
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        } else {
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        }
    }

    final static int a(byte param0) {
        int var1;
        d.field_b.a(24561);
        var1 = 17 / ((40 - param0) / 47);
        if (il.field_c.d((byte) 0)) {
          return 0;
        } else {
          return pg.a((byte) 83);
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            StringBuilder stackIn_13_1 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!dl.field_t.startsWith("win")) {
                    break L1;
                  } else {
                    if (!sj.a(97, param2)) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                try {
                  L2: {
                    param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                    if (param0 < -60) {
                      break L2;
                    } else {
                      ke.a((byte) -80);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  hi.a((Throwable) null, "MGR1: " + param2, 1);
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var4_ref);

                stackIn_10_1 = new StringBuilder().append("ke.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L3;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

                if (param2 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int a(boolean param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_73_0 = false;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_72_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ua.field_L = ua.field_L + 65536;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (sb.a(ua.field_L, uc.field_b, 1513551664) < 65536) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        wd.field_a = wd.field_a + 1;
                        stackIn_7_0 = ua.field_L - uc.field_b;
                        stackIn_4_0 = stackIn_7_0;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ua.field_L = stackIn_4_0;
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = -1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2_int = stackIn_7_0;
                        if (param1) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ke.b(-18, 56, 85);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == jb.field_d) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2_int = jb.field_d.length;
                        if (var5 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (qd.field_e == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int = qd.field_e.length;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var2_int ^ -1) == 0) {
                            statePc = 38;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (ti.field_e < uc.field_c) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ti.field_e = ti.field_e + 1;
                        if (ti.field_e <= uc.field_e) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == jb.field_d) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null != jb.field_d[we.field_h]) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ti.field_e = ti.field_e - 1;
                        if (var5 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (uc.field_c > ti.field_e) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null != jb.field_d[(we.field_h + 1) % var2_int]) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ti.field_e = ti.field_e - 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (uc.field_c <= ti.field_e) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        vb.field_g = we.field_h;
                        if (!fh.field_g) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        we.field_h = we.field_h + 1;
                        if (var2_int <= we.field_h) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        we.field_h = we.field_h - var2_int;
                        if (var5 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        we.field_h = we.field_h - 1;
                        if (-1 < (we.field_h ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        we.field_h = we.field_h + var2_int;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ti.field_e = ti.field_e - uc.field_c;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (uc.field_e < ti.field_e) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        fh.field_g = true;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (kj.field_S != null) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var3 = 357 - kj.field_S.field_r / 2;
                        var4 = 0;
                        if (hg.field_F == 0) {
                            statePc = 51;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (s.field_gb <= var3) {
                            statePc = 51;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (s.field_gb < kj.field_S.field_t + var3) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (db.field_o <= 269 + -kj.field_S.field_p) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-270 >= (db.field_o ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var4 = 1;
                        ti.field_e = uc.field_c;
                        fh.field_g = false;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (db.field_o <= 586) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (kj.field_S.field_p + 586 > db.field_o) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var4 = 1;
                        ti.field_e = uc.field_c;
                        fh.field_g = true;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var4 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (uc.field_e >= ti.field_e) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var3 >= ad.field_m) {
                            statePc = 61;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (ad.field_m >= var3 - -kj.field_S.field_t) {
                            statePc = 61;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (gb.field_j <= 269 - kj.field_S.field_p) {
                            statePc = 58;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((gb.field_j ^ -1) <= -270) {
                            statePc = 58;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ti.field_e = uc.field_e;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (586 >= gb.field_j) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (kj.field_S.field_p + 586 <= gb.field_j) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ti.field_e = uc.field_e;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param0) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        return 0;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                        if (!qh.field_b.d((byte) -8)) {
                            statePc = 71;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (qh.field_b.field_f != 0) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackIn_66_0 = 3;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return stackIn_66_0;
                }
                case 67: {
                    try {
                        if (-2 != (qh.field_b.field_f ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = 2;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 69: {
                    return stackIn_69_0;
                }
                case 71: {
                    try {
                        if (!wk.a((byte) -56)) {
                            statePc = 85;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        qh.field_b.a(0, false);
                        stackOut_72_0 = qh.field_b.d((byte) -33);
                        stackIn_86_0 = stackOut_72_0 ? 1 : 0;
                        stackIn_73_0 = stackOut_72_0;
                        if (var5 != 0) {
                            statePc = 86;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (-1 != (qh.field_b.field_f ^ -1)) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_77_0 = 3;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return stackIn_77_0;
                }
                case 78: {
                    try {
                        if (-2 != (qh.field_b.field_f ^ -1)) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = 1;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 80: {
                    return stackIn_80_0;
                }
                case 81: {
                    try {
                        if (-14 == (el.field_n ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = 1;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    return stackIn_84_0;
                }
                case 85: {
                    try {
                        stackIn_86_0 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    return stackIn_86_0;
                }
                case 87: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var2), "ke.D(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String c(byte param0) {
        int var2;
        String var3;
        rc stackIn_2_0 = null;
        rc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var2 = this.field_G.field_v ? 1 : 0;
          this.field_G.field_v = this.field_v;
          var3 = this.field_G.c((byte) 45);
          stackIn_2_0 = this.field_G;

          if (var2 == 0) {
            stackIn_3_0 = (rc) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (rc) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        if (param0 <= 14) {
          ke.a(false, true);
          return var3;
        } else {
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + this.field_m;
        int var6 = this.field_j + param0;
        super.a(param0, param1, param2, param3 + 0);
        if (!(param1 == param3)) {
            return;
        }
        int var7 = this.field_L ? this.field_t + (-this.field_R + -(2 * this.field_P)) : 0;
        this.field_M.a(this.field_Q, this.field_P + (var5 - -var7), this.field_P + var6, this.field_R + -this.field_P, this.field_x - 2 * this.field_P, this.field_S, -1, this.field_L ? 0 : 2, 1, this.field_M.field_F);
    }

    final static int b(int param0, int param1, int param2) {
        if (param1 != -1697860097) {
            return 78;
        }
        int var3 = param0 >>> -1697860097;
        return -var3 + (param0 + var3) / param2;
    }

    ke(int param0, int param1, int param2, int param3, rc param4, boolean param5, int param6, int param7, mg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (j) null, (dg) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_S = param9;
              this.field_M = param8;
              this.field_G = param4;
              this.field_R = param6;
              this.field_Q = param10;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((ke) (this)).field_L = stackIn_4_1 != 0;
                this.field_P = param7;
                var12_int = this.field_R + -this.field_P;
                var13 = this.field_M.b(param10, var12_int, this.field_M.field_F) + 2 * this.field_P;
                if (param3 >= var13) {
                  break L3;
                } else {
                  this.b(var13, param2, param0, 0, param1);
                  if (!SolKnight.field_L) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var13 = param3;
              break L2;
            }
            L4: {
              if (!this.field_L) {
                stackIn_10_0 = 2 * this.field_P + this.field_R;
                break L4;
              } else {
                stackIn_10_0 = 0;
                break L4;
              }
            }
            var14 = stackIn_10_0;
            this.field_G.b(-(2 * this.field_P) + param3, -(this.field_P * 3) + param2 + -this.field_R, var14, 0, (-param3 + var13 >> -30316799) + this.field_P);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("ke.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    static {
    }
}
