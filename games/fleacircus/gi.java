/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gi {
    static byte[] field_c;
    static uc field_b;
    static String[] field_a;
    static sf field_d;

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (ii.a(1, param1)) {
            return true;
          } else {
            if (param1 != (char)param0) {
              if (160 != param1) {
                if (32 != param1) {
                  if (95 == param1) {
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
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            if (ae.field_a.field_i >= param0) {
                return true;
            }
            if (!(null != sg.field_h)) {
                return false;
            }
            if (!param1) {
                field_d = (sf) null;
            }
            int var2_int = sg.field_h.e(-114);
            if (var2_int > 0) {
                if (!(var2_int <= param0 + -ae.field_a.field_i)) {
                    var2_int = param0 - ae.field_a.field_i;
                }
                sg.field_h.a(var2_int, ae.field_a.field_k, ae.field_a.field_i, false);
                ug.field_d = lj.a((byte) -128);
                ae.field_a.field_i = ae.field_a.field_i + var2_int;
                if (ae.field_a.field_i < param0) {
                    return false;
                }
                ae.field_a.field_i = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (-1 >= (var2_int ^ -1) && (h.b(115) ^ -1L) >= -30001L) {
                    return false;
                }
                k.c(-28354);
            } catch (IOException iOException) {
                k.c(-28354);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(int param0, byte param1);

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_34_0 = false;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_14_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 <= param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (param1 - -1 < param2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (param2 <= 5 + param1) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param6 == param4) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7_int = param2 - 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = param1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 >= var7_int) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = param1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 >= var7_int) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = mh.field_y[var8];
                        var10 = mh.field_y[1 + var8];
                        stackOut_14_0 = ob.a(param0, var9, true, var10);
                        stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var14 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        mh.field_y[var8] = var10;
                        mh.field_y[1 + var8] = var9;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int--;
                        if (var14 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var7_int = (1 & (param6 & param4)) + ((param6 >> -1403664127) + (param4 >> -1570190047));
                        var8 = param1;
                        var9 = param4;
                        var10 = param6;
                        var11 = param1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param2 <= var11) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = mh.field_y[var11];
                        stackIn_34_0 = param0;
                        stackIn_24_0 = stackIn_34_0;
                        if (var14 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!stackIn_24_0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = jl.field_b[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = uj.field_a[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = stackIn_27_0;
                        if (var7_int >= var13) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        mh.field_y[var11] = mh.field_y[var8];
                        incrementValue$0 = var8;
                        var8++;
                        mh.field_y[incrementValue$0] = var12;
                        if (var9 <= var13) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = var13;
                        if (var14 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var10 >= var13) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10 = var13;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        gi.a(param0, param1, var8, param3, param4, param5, var9);
                        stackIn_34_0 = param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        gi.a(stackIn_34_0, var8, param2, -3300, var10, param5, param6);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var7), "gi.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2, int param3) {
        int stackIn_8_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 < 2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 > 36) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException("" + param3);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        var6 = param2;
                        var7 = param0.length();
                        var8 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 >= var7) {
                            statePc = 42;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = param0.charAt(var8);
                        stackIn_43_0 = var8;
                        stackIn_8_0 = stackIn_43_0;
                        if (var11 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 != 45) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 != 43) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!param1) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9 < 48) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var9 > 57) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var9 < 65) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var9 > 90) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var9 < 97) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 <= 122) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 29: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var9 >= param3) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                case 35: {
                    try {
                        if (var4_int == 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -var9;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = param3 * var6 - -var9;
                        if (var10 / param3 == var6) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0 != 0;
                }
                case 40: {
                    try {
                        var5 = 1;
                        var6 = var10;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var5;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0 != 0;
                }
                case 44: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_46_0 = (RuntimeException) (var4);
                    stackIn_45_0 = stackIn_46_0;
                    stackIn_46_1 = new StringBuilder().append("gi.L(");
                    stackIn_45_1 = stackIn_46_1;
                    if (param0 == null) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
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
                    throw pf.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract byte[] b(int param0, boolean param1);

    abstract rf a(int param0);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 < 26) {
            field_b = (uc) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
