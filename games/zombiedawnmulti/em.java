/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends wk {
    private pm field_R;
    static int[] field_W;
    static int[][] field_ab;
    static boolean field_P;
    private pm field_T;
    static int[] field_O;
    private boolean field_Z;
    static long field_N;
    static String field_V;
    static qh field_U;
    static ri field_X;
    static int[][][] field_Y;
    static int field_bb;
    static volatile int field_cb;
    private pm field_Q;

    final String d(byte param0) {
        String var2 = ((em) this).field_T.d((byte) -113);
        if (var2 != null) {
            return var2;
        }
        if (!(!((em) this).field_l)) {
            return ((em) this).field_x == null ? ((em) this).field_j : ((em) this).field_x;
        }
        int var3 = 62 / ((53 - param0) / 57);
        return null;
    }

    final int j(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          if (param0 == -194) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = -21;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = Integer.parseInt(((em) this).field_T.field_j) - 1;
          stackIn_4_0 = stackOut_3_0;
        }
        return 0;
    }

    private final void a(String param0, int param1, int param2, cf param3, boolean param4) {
        if (!param4) {
            return;
        }
        cp.field_H.b(param0, param3.field_y + param1 - -(param3.field_n >> -1968138175), param3.field_i + (param2 - 5), 16777215, -1);
    }

    final void a(int param0, dj param1) {
        super.a(param0 ^ 0, param1);
        ((em) this).field_R.field_A = (bj) (Object) param1;
        ((em) this).field_T.field_A = (bj) (Object) param1;
        if (param0 != 3) {
            Object var4 = null;
            ((em) this).a(-101, (dj) null);
        }
        ((em) this).field_Q.field_A = (bj) (Object) param1;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, 28972, param3, param4);
        int var6 = -130 + param3 >> -1955977535;
        if (((em) this).field_Z) {
            ((em) this).field_T.b(var6, 0, 28972, 25, param4);
            ((em) this).field_R.b(45 + var6, 0, param2 ^ 0, 25, param4);
        } else {
            ((em) this).field_R.b(var6, 0, param2 ^ 0, 25, param4);
            ((em) this).field_T.b(var6 + 45, 0, 28972, 25, param4);
        }
        ((em) this).field_Q.b(var6 - -90, 0, param2, 40, param4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ja[] param5, int param6, int param7, fm param8, int param9, int param10, int param11, int param12, ja[] param13, int param14, fm param15, ja[] param16, int param17, int param18, int param19, int param20) {
        if (param2 != 2) {
            return;
        }
        jl.a(param4, param18, param3, param20, param11, param14, param8, new pd(param5), new pd(param13), param17, param19, param10, param7, param9, param6, param15, param12, param0, new pd(param16), param1, true);
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        Object var3 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = em.a((CharSequence) null, (byte) 36);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((em) this).field_R.field_j);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    public static void k(int param0) {
        field_W = null;
        if (param0 != 4) {
            field_N = 114L;
        }
        field_U = null;
        field_Y = null;
        field_O = null;
        field_ab = null;
        field_X = null;
        field_V = null;
    }

    final boolean a(int param0) {
        L0: {
          if (null == ((em) this).field_R.field_j) {
            break L0;
          } else {
            if (((em) this).field_R.field_j.length() == 0) {
              break L0;
            } else {
              if (((em) this).field_T.field_j == null) {
                return true;
              } else {
                if (((em) this).field_T.field_j.length() != 0) {
                  L1: {
                    if (null == ((em) this).field_Q.field_j) {
                      break L1;
                    } else {
                      if (0 == ((em) this).field_Q.field_j.length()) {
                        break L1;
                      } else {
                        L2: {
                          if (param0 == 1872) {
                            break L2;
                          } else {
                            field_N = -117L;
                            break L2;
                          }
                        }
                        return false;
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              }
            }
          }
        }
        return true;
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(vd.a(true, param0, (byte) -122))) {
            return false;
        }
        for (var2 = 0; var2 < param0.length(); var2++) {
            if (!lo.a(param1 ^ -8230, param0.charAt(var2))) {
                return false;
            }
        }
        if (param1 != -38) {
            em.k(19);
        }
        return true;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0 ^ 0, param1, param2, param3);
        if (0 != param2) {
            return;
        }
        param3 = param3 + ((em) this).field_y;
        param1 = param1 + ((em) this).field_i;
        this.a(wg.field_b, param3, param1, (cf) (Object) ((em) this).field_R, true);
        this.a(eo.field_a, param3, param1, (cf) (Object) ((em) this).field_T, true);
        this.a(ij.field_a, param3, param1, (cf) (Object) ((em) this).field_Q, true);
        if (param0 != -2) {
            field_cb = -58;
        }
    }

    private em(nl param0, boolean param1) {
        super(0, 0, 0, 0, (nl) null);
        ((em) this).field_R = (pm) (Object) new on("", (bj) null, 2);
        ((em) this).field_T = (pm) (Object) new on("", (bj) null, 2);
        ((em) this).field_Q = (pm) (Object) new on("", (bj) null, 4);
        ((em) this).field_Q.field_h = param0;
        ((em) this).field_T.field_h = param0;
        ((em) this).field_R.field_h = param0;
        ((em) this).field_Z = param1 ? true : false;
        if (!((em) this).field_Z) {
            ((em) this).b((byte) 111, (cf) (Object) ((em) this).field_R);
            ((em) this).b((byte) 76, (cf) (Object) ((em) this).field_T);
        } else {
            ((em) this).b((byte) 123, (cf) (Object) ((em) this).field_T);
            ((em) this).b((byte) 94, (cf) (Object) ((em) this).field_R);
        }
        ((em) this).b((byte) 124, (cf) (Object) ((em) this).field_Q);
    }

    em(nl param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((em) this).b(param2, param3, 28972, param4, param5);
    }

    final int g(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 < -22) {
          try {
            stackOut_2_0 = Integer.parseInt(((em) this).field_Q.field_j);
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -101;
        }
        return 0;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = param1.getDocumentBase().getFile();
                            var3 = var2.indexOf('?');
                            var4 = "reload.ws";
                            if (0 <= var3) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var4 = var4 + var2.substring(var3);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = new java.net.URL(param1.getCodeBase(), var4);
                            param1.getAppletContext().showDocument(gf.a(param1, true, var5), "_self");
                            if (!param0) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            field_bb = 102;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_P = false;
        field_W = new int[63];
        field_cb = 0;
        field_V = "This will clear your mind and help you think faster.";
        field_ab = new int[63][2];
        var0 = 0;
        L0: while (true) {
          if (var0 >= field_ab.length) {
            vm.d(93, 4, 1);
            vm.d(95, 2, 58);
            vm.d(-84, 57, 58);
            vm.d(75, 56, 59);
            wp.a(46, 5, 14, 0);
            wp.a(56, 7, 2, 0);
            vm.d(-115, 9, 8);
            wp.a(9, 10, 52, 0);
            wp.a(9, 11, 60, 0);
            wp.a(11, 12, 34, 0);
            wp.a(50, 13, 34, 0);
            wp.a(32, 14, 54, 0);
            wp.a(4, 15, 57, 0);
            wp.a(2, 16, 57, 0);
            wp.a(33, 17, 7, 0);
            wp.a(36, 18, 37, 0);
            vm.d(103, 60, 53);
            vm.d(-109, 55, 3);
            vm.d(-120, 54, 61);
            vm.d(-54, 52, 53);
            vm.d(-128, 51, 8);
            wp.a(52, 50, 51, 0);
            vm.d(-72, 49, 54);
            wp.a(50, 48, 10, 0);
            wp.a(46, 47, 49, 0);
            wp.a(49, 35, 14, 0);
            wp.a(47, 45, 35, 0);
            wp.a(12, 44, 48, 0);
            vm.d(-127, 32, 0);
            vm.d(-94, 33, 56);
            vm.d(125, 34, 51);
            wp.a(55, 46, 32, 0);
            wp.a(7, 36, 15, 0);
            wp.a(33, 37, 16, 0);
            vm.d(-56, 38, 11);
            field_Y = new int[3][5][4];
            var0 = 0;
            L1: while (true) {
              if (var0 >= field_Y.length) {
                field_Y[0][0][2] = 61;
                field_Y[0][0][1] = 0;
                field_Y[0][0][0] = 3;
                field_Y[0][1][1] = 32;
                field_Y[0][1][2] = 54;
                field_Y[0][1][0] = 55;
                field_Y[0][2][0] = 46;
                field_Y[0][2][1] = 49;
                field_Y[0][2][2] = 14;
                field_Y[0][3][0] = 47;
                field_Y[0][3][2] = 35;
                field_Y[0][3][1] = 5;
                field_Y[0][4][0] = 45;
                field_Y[1][0][0] = 59;
                field_Y[1][0][1] = 1;
                field_Y[1][0][2] = 58;
                field_Y[1][1][3] = 57;
                field_Y[1][1][0] = 56;
                field_Y[1][1][2] = 2;
                field_Y[1][1][1] = 4;
                field_Y[1][2][2] = 15;
                field_Y[1][2][1] = 7;
                field_Y[1][2][0] = 33;
                field_Y[1][2][3] = 16;
                field_Y[1][3][1] = 36;
                field_Y[1][3][0] = 17;
                field_Y[1][3][2] = 37;
                field_Y[1][4][0] = 18;
                field_Y[2][0][0] = 53;
                field_Y[2][0][1] = 8;
                field_Y[2][1][1] = 9;
                field_Y[2][1][3] = 51;
                field_Y[2][1][0] = 60;
                field_Y[2][1][2] = 52;
                field_Y[2][2][0] = 11;
                field_Y[2][2][3] = 34;
                field_Y[2][2][2] = 50;
                field_Y[2][2][1] = 10;
                field_Y[2][3][1] = 12;
                field_Y[2][3][3] = 13;
                field_Y[2][3][2] = 48;
                field_Y[2][3][0] = 38;
                field_Y[2][4][0] = 44;
                field_O = new int[19];
                field_N = 0L;
                wf.a(3, 38, -1);
                wf.a(2, 38, -1);
                wf.a(4, 37, -1);
                wf.a(7, 37, -1);
                wf.a(1, 37, -1);
                wf.a(2, 32, -1);
                wf.a(0, 32, -1);
                wf.a(15, 32, -1);
                wf.a(13, 36, -1);
                wf.a(4, 34, -1);
                wf.a(8, 34, -1);
                wf.a(14, 33, -1);
                wf.a(16, 33, -1);
                wf.a(5, 33, -1);
                wf.a(5, 35, -1);
                var0 = 0;
                L2: while (true) {
                  if (var0 >= 63) {
                    field_W[57] = 167;
                    field_W[45] = 7499;
                    field_W[60] = 139;
                    field_W[16] = 547;
                    field_W[7] = 631;
                    field_W[56] = 149;
                    field_W[61] = 43;
                    field_W[35] = 2017;
                    field_W[9] = 163;
                    field_W[15] = 449;
                    field_W[38] = 2005;
                    field_W[1] = 59;
                    field_W[37] = 2011;
                    field_W[4] = 127;
                    field_W[10] = 509;
                    field_W[12] = 2029;
                    field_W[49] = 647;
                    field_W[17] = 1997;
                    field_W[0] = 53;
                    field_W[48] = 1993;
                    field_W[32] = 131;
                    field_W[2] = 137;
                    field_W[13] = 1987;
                    field_W[54] = 113;
                    field_W[53] = 73;
                    field_W[47] = 2003;
                    field_W[14] = 467;
                    field_W[46] = 593;
                    field_W[5] = 2039;
                    field_W[52] = 173;
                    field_W[3] = 61;
                    field_W[51] = 157;
                    field_W[36] = 2027;
                    field_W[55] = 151;
                    field_W[44] = 7489;
                    field_W[11] = 491;
                    field_W[50] = 523;
                    field_W[8] = 83;
                    field_W[59] = 67;
                    field_W[58] = 29;
                    field_W[33] = 569;
                    field_W[34] = 607;
                    field_W[18] = 7507;
                  } else {
                    field_W[var0] = 100;
                    var0++;
                    continue L2;
                  }
                }
              } else {
                var1 = 0;
                L3: while (true) {
                  if (var1 >= field_Y[0].length) {
                    var0++;
                    continue L1;
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (field_Y[0][0].length <= var2) {
                        var1++;
                        continue L3;
                      } else {
                        field_Y[var0][var1][var2] = 255;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var1 = 0;
            L5: while (true) {
              if (field_ab[var0].length <= var1) {
                var0++;
                continue L0;
              } else {
                field_ab[var0][var1] = 255;
                if (19 <= var0) {
                  if (var0 < 44) {
                    field_ab[var0][var1] = 19;
                    var1++;
                    continue L5;
                  } else {
                    var1++;
                    continue L5;
                  }
                } else {
                  var1++;
                  continue L5;
                }
              }
            }
          }
        }
    }
}
