/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge implements Runnable {
    private int field_a;
    private InputStream field_b;
    private int field_i;
    private int field_k;
    private ab field_d;
    private byte[] field_f;
    private java.net.Socket field_g;
    private ei field_c;
    private boolean field_l;
    private OutputStream field_h;
    private boolean field_j;
    static String field_e;

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.field_l) {
              stackIn_5_0 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= param2) {
                        break L4;
                      } else {
                        var5_int = this.field_b.read(param0, param3, param2);
                        var8 = var5_int ^ -1;
                        var7 = -1;
                        if (var6 != 0) {
                          if (var7 == var8) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          if (var7 > var8) {
                            param3 = param3 + var5_int;
                            param2 = param2 - var5_int;
                            if (var6 == 0) {
                              stackIn_5_0 = 0;
                              continue L1;
                            } else {
                              break L4;
                            }
                          } else {
                            throw new EOFException();
                          }
                        }
                      }
                    }
                    if (param1 == -109) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  field_e = (String) null;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ge.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected final void finalize() {
        this.b(58);
    }

    ge(java.net.Socket param0, ab param1) throws IOException {
        this(param0, param1, 5000);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 == -59) {
            return;
        }
        field_e = (String) null;
    }

    final static void c(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_31_0 = 0;
        boolean stackIn_34_0 = false;
        int stackIn_39_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_33_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        f var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        th var13 = null;
        th var14 = null;
        int[][] var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var13 = ig.field_a;
                        var14 = var13;
                        var2 = var14.d(true);
                        if (param0 > 105) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ge.f(-123);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = (f) ((Object) dj.field_c.a(true));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_11_0 = var3.field_k;
                        stackIn_6_0 = stackIn_11_0;
                        if (var12 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == var2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = (f) ((Object) dj.field_c.f(2));
                        if (var12 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var3 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = -47;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ck.b((byte) stackIn_11_0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var4 = var14.d(true);
                        if (var4 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = var3.field_j;
                        ph.field_a[0] = og.field_c;
                        var6_int = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4 <= var6_int) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ph.field_a[var6_int] = var13.c(false);
                        var6_int++;
                        if (var12 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        fb.a((byte) -107, var5, var4);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var6_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var6_int >= var4) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        lh.a(var14, -95);
                        stackIn_31_0 = var6_int;
                        stackIn_24_0 = stackIn_31_0;
                        if (var12 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (stackIn_24_0 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                        if (var12 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ra.a(sg.field_a, 0, th.field_s, hh.field_I, var6_int, ki.field_g);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var6_int++;
                        if (var12 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        bh.b((byte) 83, var5);
                        stackIn_31_0 = 2;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var6 = new String[stackIn_31_0][var5];
                        var18 = new int[2][4 * var5];
                        var8 = pf.field_o;
                        var9 = 0;
                        var10 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var8 <= var9) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = ff.field_a[var9];
                        var6[0][var10] = ph.field_a[var11];
                        var18[0][4 * var10] = we.field_g[var11];
                        var18[0][1 + 4 * var10] = l.field_D[var11];
                        var18[0][2 + var10 * 4] = oc.field_a[var11];
                        var18[0][var10 * 4 + 3] = hl.field_N[var11];
                        stackOut_33_0 = md.a(ph.field_a[var11], -113);
                        stackIn_39_0 = stackOut_33_0 ? 1 : 0;
                        stackIn_34_0 = stackOut_33_0;
                        if (var12 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!stackIn_34_0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-1 != (oc.field_a[var11] + (l.field_D[var11] - -hl.field_N[var11]) ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var6[0][var10] = null;
                        var10--;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10++;
                        var9++;
                        if (var12 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var9 = 0;
                        stackIn_39_0 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var10 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var8 > var9) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var3.b((byte) -127);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11 = ff.field_a[var5 + var9];
                        var6[1][var10] = ph.field_a[var11];
                        var18[1][var10 * 4] = we.field_g[var11];
                        var18[1][1 + 4 * var10] = l.field_D[var11];
                        var18[1][2 + 4 * var10] = oc.field_a[var11];
                        var18[1][var10 * 4 - -3] = hl.field_N[var11];
                        if (var12 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (md.a(ph.field_a[var11], -101)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (0 == hl.field_N[var11] + oc.field_a[var11] + l.field_D[var11]) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6[1][var10] = null;
                        var10--;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10++;
                        var9++;
                        if (var12 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var3.b((byte) -127);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1), "ge.K(" + param0 + ')');
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, int param1, wf param2, ab param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            pd var15 = null;
            String var16 = null;
            byte[][] var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var15 = new pd();
                            var15.field_p = param2.d(true);
                            var15.field_j = param2.d((byte) 19);
                            var15.field_n = new int[var15.field_p];
                            var15.field_h = new int[var15.field_p];
                            if (param0 <= -120) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ge.a((byte) -107);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var15.field_i = new ei[var15.field_p];
                            var15.field_k = new ei[var15.field_p];
                            var15.field_m = new int[var15.field_p];
                            var15.field_o = new byte[var15.field_p][][];
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var15.field_p <= var5) {
                                statePc = 44;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6_int = param2.d(true);
                            if (var14 != 0) {
                                statePc = 53;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_5 instanceof SecurityException ? 39 : ((Object) stateCaught_5 instanceof NullPointerException ? 40 : ((Object) stateCaught_5 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (0 == var6_int) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_6 instanceof SecurityException ? 39 : ((Object) stateCaught_6 instanceof NullPointerException ? 40 : ((Object) stateCaught_6 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (1 == var6_int) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_7 instanceof SecurityException ? 39 : ((Object) stateCaught_7 instanceof NullPointerException ? 40 : ((Object) stateCaught_7 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (-3 != (var6_int ^ -1)) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_8 instanceof SecurityException ? 39 : ((Object) stateCaught_8 instanceof NullPointerException ? 40 : ((Object) stateCaught_8 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_9 instanceof SecurityException ? 39 : ((Object) stateCaught_9 instanceof NullPointerException ? 40 : ((Object) stateCaught_9 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var16 = param2.c(false);
                            var8 = param2.c(false);
                            var9 = 0;
                            if (var6_int == 1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_10 instanceof SecurityException ? 39 : ((Object) stateCaught_10 instanceof NullPointerException ? 40 : ((Object) stateCaught_10 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_11 instanceof SecurityException ? 39 : ((Object) stateCaught_11 instanceof NullPointerException ? 40 : ((Object) stateCaught_11 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var9 = param2.d((byte) 19);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_12 instanceof SecurityException ? 39 : ((Object) stateCaught_12 instanceof NullPointerException ? 40 : ((Object) stateCaught_12 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var15.field_m[var5] = var6_int;
                            var15.field_h[var5] = var9;
                            var15.field_k[var5] = param3.a(var8, 2, qf.a(-4174, var16));
                            if (var14 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_13 instanceof SecurityException ? 39 : ((Object) stateCaught_13 instanceof NullPointerException ? 40 : ((Object) stateCaught_13 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-4 == (var6_int ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_14 instanceof SecurityException ? 39 : ((Object) stateCaught_14 instanceof NullPointerException ? 40 : ((Object) stateCaught_14 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-5 == (var6_int ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_15 instanceof SecurityException ? 39 : ((Object) stateCaught_15 instanceof NullPointerException ? 40 : ((Object) stateCaught_15 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_16 instanceof SecurityException ? 39 : ((Object) stateCaught_16 instanceof NullPointerException ? 40 : ((Object) stateCaught_16 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var18 = param2.c(false);
                            var8 = param2.c(false);
                            var9 = param2.d(true);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_17 instanceof SecurityException ? 39 : ((Object) stateCaught_17 instanceof NullPointerException ? 40 : ((Object) stateCaught_17 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var11_int >= var9) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_18 instanceof SecurityException ? 39 : ((Object) stateCaught_18 instanceof NullPointerException ? 40 : ((Object) stateCaught_18 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var10[var11_int] = param2.c(false);
                            var11_int++;
                            if (var14 != 0) {
                                statePc = 43;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_19 instanceof SecurityException ? 39 : ((Object) stateCaught_19 instanceof NullPointerException ? 40 : ((Object) stateCaught_19 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var14 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_20 instanceof SecurityException ? 39 : ((Object) stateCaught_20 instanceof NullPointerException ? 40 : ((Object) stateCaught_20 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_21 instanceof SecurityException ? 39 : ((Object) stateCaught_21 instanceof NullPointerException ? 40 : ((Object) stateCaught_21 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var19 = new byte[var9][];
                            var17 = var19;
                            var11 = var17;
                            if (var6_int == 3) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_22 instanceof SecurityException ? 39 : ((Object) stateCaught_22 instanceof NullPointerException ? 40 : ((Object) stateCaught_22 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_23 instanceof SecurityException ? 39 : ((Object) stateCaught_23 instanceof NullPointerException ? 40 : ((Object) stateCaught_23 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var12_int = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_24 instanceof SecurityException ? 39 : ((Object) stateCaught_24 instanceof NullPointerException ? 40 : ((Object) stateCaught_24 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var12_int >= var9) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_25 instanceof SecurityException ? 39 : ((Object) stateCaught_25 instanceof NullPointerException ? 40 : ((Object) stateCaught_25 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var13 = param2.d((byte) 19);
                            array$0 = new byte[var13];
                            var11[var12_int] = array$0;
                            param2.a(116, var13, 0, var19[var12_int]);
                            var12_int++;
                            if (var14 != 0) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_26 instanceof SecurityException ? 39 : ((Object) stateCaught_26 instanceof NullPointerException ? 40 : ((Object) stateCaught_26 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var14 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_27 instanceof SecurityException ? 39 : ((Object) stateCaught_27 instanceof NullPointerException ? 40 : ((Object) stateCaught_27 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_28 instanceof SecurityException ? 39 : ((Object) stateCaught_28 instanceof NullPointerException ? 40 : ((Object) stateCaught_28 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var15.field_m[var5] = var6_int;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_29 instanceof SecurityException ? 39 : ((Object) stateCaught_29 instanceof NullPointerException ? 40 : ((Object) stateCaught_29 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var12 = new Class[var9];
                            var13 = 0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_30 instanceof SecurityException ? 39 : ((Object) stateCaught_30 instanceof NullPointerException ? 40 : ((Object) stateCaught_30 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var9 <= var13) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_31 instanceof SecurityException ? 39 : ((Object) stateCaught_31 instanceof NullPointerException ? 40 : ((Object) stateCaught_31 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var12[var13] = qf.a(-4174, var10[var13]);
                            var13++;
                            if (var14 != 0) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_32 instanceof SecurityException ? 39 : ((Object) stateCaught_32 instanceof NullPointerException ? 40 : ((Object) stateCaught_32 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var14 == 0) {
                                statePc = 31;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_33 instanceof SecurityException ? 39 : ((Object) stateCaught_33 instanceof NullPointerException ? 40 : ((Object) stateCaught_33 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_34 instanceof SecurityException ? 39 : ((Object) stateCaught_34 instanceof NullPointerException ? 40 : ((Object) stateCaught_34 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var15.field_i[var5] = param3.a(var8, qf.a(-4174, var18), var12, (byte) 113);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_35 instanceof SecurityException ? 39 : ((Object) stateCaught_35 instanceof NullPointerException ? 40 : ((Object) stateCaught_35 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var15.field_o[var5] = var19;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof ClassNotFoundException ? 38 : ((Object) stateCaught_36 instanceof SecurityException ? 39 : ((Object) stateCaught_36 instanceof NullPointerException ? 40 : ((Object) stateCaught_36 instanceof Exception ? 41 : 42))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            var15.field_n[var5] = -1;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6_ref = (SecurityException) ((Object) caughtException);
                            var15.field_n[var5] = -2;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6_ref2 = (NullPointerException) ((Object) caughtException);
                            var15.field_n[var5] = -3;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6_ref3 = (Exception) ((Object) caughtException);
                            var15.field_n[var5] = -4;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var6_ref4 = caughtException;
                            var15.field_n[var5] = -5;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var5++;
                            if (var14 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            al.field_C.b(124, var15);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_48_0 = (RuntimeException) (var4);
                        stackIn_47_0 = stackIn_48_0;
                        stackIn_48_1 = new StringBuilder().append("ge.H(").append(param0).append(',').append(param1).append(',');
                        stackIn_47_1 = stackIn_48_1;
                        if (param2 == null) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        stackIn_49_0 = (RuntimeException) ((Object) stackIn_47_0);
                        stackIn_49_1 = (StringBuilder) ((Object) stackIn_47_1);
                        stackIn_49_2 = "{...}";
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 48: {
                        stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                        stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                        stackIn_49_2 = "null";
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_50_0 = stackIn_51_0;
                        stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                        stackIn_50_1 = stackIn_51_1;
                        if (param3 == null) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_52_1 = (StringBuilder) ((Object) stackIn_50_1);
                        stackIn_52_2 = "{...}";
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 51: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
                        stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                        stackIn_52_2 = "null";
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        throw ld.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
                    }
                    case 53: {
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

    final int d(int param0) throws IOException {
        if (this.field_l) {
          return 0;
        } else {
          if (param0 != -6448) {
            this.field_k = 100;
            return this.field_b.available();
          } else {
            return this.field_b.available();
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 == 0) {
                      var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                      param1.getAppletContext().showDocument(gf.a(3, var2, param1), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("ge.J(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            InterruptedException var4 = null;
            int var6 = 0;
            String var7 = null;
            var6 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  var3 = this;
                  synchronized (var3) {
                    L2: {
                      L3: {
                        if (this.field_k == this.field_i) {
                          L4: {
                            if (!this.field_l) {
                              break L4;
                            } else {
                              if (var6 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              var4 = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L7: {
                        L8: {
                          var2 = this.field_k;
                          if (this.field_k <= this.field_i) {
                            break L8;
                          } else {
                            var1_int = this.field_a + -this.field_k;
                            if (var6 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var1_int = this.field_i + -this.field_k;
                        break L7;
                      }
                      decompiledRegionSelector0 = 1;
                      break L2;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    try {
                      L9: {
                        L10: {
                          if (null == this.field_b) {
                            break L10;
                          } else {
                            this.field_b.close();
                            break L10;
                          }
                        }
                        L11: {
                          if (this.field_h == null) {
                            break L11;
                          } else {
                            this.field_h.close();
                            break L11;
                          }
                        }
                        L12: {
                          if (null == this.field_g) {
                            break L12;
                          } else {
                            this.field_g.close();
                            break L12;
                          }
                        }
                        break L9;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var1 = (IOException) (Object) decompiledCaughtException;
                        break L13;
                      }
                    }
                    this.field_f = null;
                    break L0;
                  } else {
                    if (0 >= var1_int) {
                      continue L1;
                    } else {
                      try {
                        L14: {
                          this.field_h.write(this.field_f, var2, var1_int);
                          break L14;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L15: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_j = true;
                          break L15;
                        }
                      }
                      this.field_k = (this.field_k + var1_int) % this.field_a;
                      try {
                        L16: {
                          L17: {
                            if (this.field_k != this.field_i) {
                              break L17;
                            } else {
                              this.field_h.flush();
                              break L17;
                            }
                          }
                          break L16;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L18: {
                          var3_ref = (IOException) (Object) decompiledCaughtException;
                          this.field_j = true;
                          break L18;
                        }
                      }
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter4) {
              decompiledCaughtException = decompiledCaughtParameter4;
              L19: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = (String) null;
                uj.a((String) null, (Throwable) ((Object) var1_ref), 1);
                break L19;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int var1;
        int var2;
        var1 = hc.f(-1980);
        if (param0 < 55) {
          field_e = (String) null;
          var2 = eb.d((byte) -6);
          ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 291208897) + var2, var1 - -(wh.field_f << -2129819103), me.field_v - wh.field_f, -1160208572);
          hi.b(0);
          return;
        } else {
          var2 = eb.d((byte) -6);
          ki.field_a.a(rf.field_c + -id.field_v, (id.field_v << 291208897) + var2, var1 - -(wh.field_f << -2129819103), me.field_v - wh.field_f, -1160208572);
          hi.b(0);
          return;
        }
    }

    final int e(int param0) throws IOException {
        if (param0 != 291208897) {
            return -65;
        }
        if (!(!this.field_l)) {
            return 0;
        }
        return this.field_b.read();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        Object stackIn_16_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int var7 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_l) {
              break L0;
            } else {
              if (!this.field_j) {
                L1: {
                  var5_int = 120 / ((param2 - -44) / 56);
                  if (null != this.field_f) {
                    break L1;
                  } else {
                    this.field_f = new byte[this.field_a];
                    break L1;
                  }
                }
                var6 = this;
                synchronized (var6) {
                  L2: {
                    var7 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (param1 <= var7) {
                            break L5;
                          } else {
                            this.field_f[this.field_i] = param0[param3 + var7];
                            this.field_i = (this.field_i - -1) % this.field_a;
                            stackIn_16_0 = this;

                            if (var9 != 0) {
                              break L4;
                            } else {
                              if (((ge) (this)).field_i != (this.field_a + (this.field_k - 100)) % this.field_a) {
                                var7++;
                                if (var9 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        }
                        stackIn_16_0 = this;
                        break L4;
                      }
                      L6: {
                        if (((ge) (this)).field_c == null) {
                          this.field_c = this.field_d.a((Runnable) (this), false, 3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.notifyAll();
                      break L2;
                    }
                  }
                }
                return;
              } else {
                this.field_j = false;
                throw new IOException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("ge.E(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            int var4 = 0;
            var4 = Lexicominos.field_L ? 1 : 0;
            if (!this.field_l) {
              L0: {
                if (param0 > 13) {
                  break L0;
                } else {
                  this.field_d = (ab) null;
                  break L0;
                }
              }
              var2 = this;
              synchronized (var2) {
                L1: {
                  this.field_l = true;
                  this.notifyAll();
                  break L1;
                }
              }
              if (this.field_c != null) {
                L2: while (true) {
                  L3: {
                    L4: {
                      if (-1 != (this.field_c.field_b ^ -1)) {
                        break L4;
                      } else {
                        ge.a(0, 1L);
                        if (var4 != 0) {
                          break L3;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (1 == this.field_c.field_b) {
                      try {
                        L5: {
                          ((Thread) (this.field_c.field_g)).join();
                          break L5;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        this.field_c = null;
                        return;
                      }
                      break L3;
                    } else {
                      this.field_c = null;
                      return;
                    }
                  }
                  this.field_c = null;
                  return;
                }
              } else {
                this.field_c = null;
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) throws IOException {
        if (this.field_l) {
            return;
        }
        if (param0 != 0) {
            return;
        }
        if (!(!this.field_j)) {
            this.field_j = false;
            throw new IOException();
        }
    }

    final static void a(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        } else {
          if ((long)param0 == param1 % 10L) {
            wa.a((byte) 5, -1L + param1);
            wa.a((byte) 5, 1L);
            if (Lexicominos.field_L) {
              wa.a((byte) 5, param1);
              return;
            } else {
              return;
            }
          } else {
            wa.a((byte) 5, param1);
            return;
          }
        }
    }

    private ge(java.net.Socket param0, ab param1, int param2) throws IOException {
        this.field_k = 0;
        this.field_i = 0;
        this.field_l = false;
        this.field_j = false;
        try {
            this.field_g = param0;
            this.field_d = param1;
            this.field_g.setSoTimeout(30000);
            this.field_g.setTcpNoDelay(true);
            this.field_b = this.field_g.getInputStream();
            this.field_h = this.field_g.getOutputStream();
            this.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
