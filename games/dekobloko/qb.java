/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb extends dd {
    static im field_r;
    static String field_t;
    private qk field_v;
    static ln field_s;
    static ck field_q;
    static int field_u;
    static w field_p;

    final void d(byte param0) {
        if (param0 < 107) {
            this.d((byte) 12);
        }
        if (!(null == this.field_v)) {
            this.field_v.a(0);
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            int var4_int = 0;
            RuntimeException var4_ref = null;
            pj var5 = null;
            IOException var5_ref = null;
            Exception var6 = null;
            int var7 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != this.field_v) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_v.a(0);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 30);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = (Exception) ((Object) caughtException);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_v = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_v = (qk) (param0);
                            this.e((byte) -15);
                            this.a((byte) -124, param2);
                            var4_int = -84 % ((param1 - -75) / 50);
                            this.field_h = null;
                            this.field_c.field_n = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var5 = (pj) ((Object) this.field_g.a((byte) -111));
                            if (var5 != null) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var7 != 0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var7 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            this.field_d.a(var5, -7267);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var7 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var5 = (pj) ((Object) this.field_l.a((byte) -71));
                            if (var5 == null) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            this.field_n.a(var5, -7267);
                            if (var7 != 0) {
                                statePc = 28;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var7 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (0 != this.field_f) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            this.field_i.field_n = 0;
                            this.field_i.a(true, 4);
                            this.field_i.a(true, (int) this.field_f);
                            this.field_i.a(0, false);
                            this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof IOException ? 23 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5_ref = (IOException) ((Object) caughtException);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.field_v.a(0);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof Exception ? 26 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var6 = (Exception) ((Object) caughtException);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_j = this.field_j + 1;
                            this.field_o = -2;
                            this.field_v = null;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            this.field_b = 0;
                            this.field_e = ik.a(4);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var4_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_32_0 = (RuntimeException) (var4_ref);
                        stackIn_31_0 = stackIn_32_0;
                        stackIn_32_1 = new StringBuilder().append("qb.K(");
                        stackIn_31_1 = stackIn_32_1;
                        if (param0 == null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                        stackIn_33_1 = (StringBuilder) ((Object) stackIn_31_1);
                        stackIn_33_2 = "{...}";
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                        stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                        stackIn_33_2 = "null";
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        throw dh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
                    }
                    case 34: {
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

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            wl stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            wl stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            int stackIn_5_2 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (null != this.field_v) {
              try {
                L0: {
                  L1: {
                    this.field_i.field_n = 0;
                    stackIn_4_0 = this.field_i;

                    stackIn_4_1 = 1;

                    if (!param1) {
                      stackIn_5_0 = (wl) ((Object) stackIn_4_0);
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = 3;
                      break L1;
                    } else {
                      stackIn_5_0 = (wl) ((Object) stackIn_4_0);
                      stackIn_5_1 = stackIn_4_1;
                      stackIn_5_2 = 2;
                      break L1;
                    }
                  }
                  ((wl) (Object) stackIn_5_0).a(stackIn_5_1 != 0, stackIn_5_2);
                  if (param0 < -108) {
                    this.field_i.a(-93, 0L);
                    this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_v.a(0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_j = this.field_j + 1;
                  this.field_o = -2;
                  this.field_v = null;
                  decompiledRegionSelector0 = 1;
                  break L2;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              } else {
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

    final static int a(boolean param0, int param1, jg param2, int param3, int param4, jg param5, String param6) {
        int stackIn_4_0 = 0;
        wl stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        wl stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        wl stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        String stackIn_16_2 = null;
        wl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        wl stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        wl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String stackIn_19_2 = null;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        String var10_ref_String = null;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = null;
                    var14 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var15 = param2.a((byte) 56);
                        var12_ref_String = var15;
                        var12_ref_String = var15;
                        var8 = -65 / ((-58 - param3) / 43);
                        var9 = param5.a((byte) 56);
                        var12_ref_String = var9;
                        var12_ref_String = var9;
                        if (null != qc.field_s) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (mb.a(false, -75)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
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
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (ph.field_xb == ba.field_f) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        wb.field_Ub = null;
                        we.field_b.field_n = 0;
                        if (param6 == null) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = 0;
                        if (!param0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = var10 | 1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        vi.field_A.field_n = 0;
                        vi.field_A.a(gg.field_A.nextInt(), false);
                        vi.field_A.a(gg.field_A.nextInt(), false);
                        vi.field_A.b(8, var15);
                        vi.field_A.b(8, var9);
                        var17 = (CharSequence) ((Object) param6);
                        vi.field_A.b(8, bc.a(var17, 65));
                        vi.field_A.d(-1, param4);
                        vi.field_A.a(true, param1);
                        vi.field_A.a(true, var10);
                        we.field_b.a(true, 18);
                        we.field_b.field_n = we.field_b.field_n + 2;
                        var11 = we.field_b.field_n;
                        var12_ref_String = a.a(se.h(25144), (byte) 121);
                        if (var12_ref_String != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12_ref_String = "";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        we.field_b.a(0, var12_ref_String);
                        re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
                        we.field_b.b(true, -var11 + we.field_b.field_n);
                        if (var14 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        vi.field_A.field_n = 0;
                        vi.field_A.a(gg.field_A.nextInt(), false);
                        vi.field_A.a(gg.field_A.nextInt(), false);
                        stackIn_15_0 = vi.field_A;
                        stackIn_14_0 = stackIn_15_0;
                        stackIn_15_1 = 8;
                        stackIn_14_1 = stackIn_15_1;
                        if (!param2.a(true)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_16_0 = (wl) ((Object) stackIn_14_0);
                        stackIn_16_1 = stackIn_14_1;
                        stackIn_16_2 = (String) (var15);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = (wl) ((Object) stackIn_15_0);
                        stackIn_16_1 = stackIn_15_1;
                        stackIn_16_2 = "";
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((wl) (Object) stackIn_16_0).b(stackIn_16_1, stackIn_16_2);
                        stackIn_18_0 = vi.field_A;
                        stackIn_17_0 = stackIn_18_0;
                        stackIn_18_1 = 8;
                        stackIn_17_1 = stackIn_18_1;
                        if (param5.a(true)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = (wl) ((Object) stackIn_17_0);
                        stackIn_19_1 = stackIn_17_1;
                        stackIn_19_2 = "";
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = (wl) ((Object) stackIn_18_0);
                        stackIn_19_1 = stackIn_18_1;
                        stackIn_19_2 = (String) (var9);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((wl) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2);
                        we.field_b.a(true, 16);
                        we.field_b.field_n = we.field_b.field_n + 1;
                        var10 = we.field_b.field_n;
                        re.a(uk.field_p, ea.field_k, we.field_b, vi.field_A, 0);
                        we.field_b.b(-var10 + we.field_b.field_n, true);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        wj.c(4792, -1);
                        ph.field_xb = kb.field_c;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (kb.field_c != ph.field_xb) {
                            statePc = 35;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (!pe.b(25973, 1)) {
                            statePc = 35;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10 = de.field_V.d((byte) -70);
                        de.field_V.field_n = 0;
                        if (var10 < 100) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((var10 ^ -1) >= -106) {
                            statePc = 34;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var10 == 248) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (99 == var10) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        sm.field_e = -1;
                        bh.field_k = var10;
                        ph.field_xb = rb.field_f;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        pe.b(25973, vi.d(1));
                        wb.field_Ub = new Boolean(f.a(de.field_V, 19));
                        de.field_V.field_n = 0;
                        if (var14 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        jg.a(se.h(25144), 0);
                        rk.field_Y = tj.field_ic;
                        si.a(89);
                        jd.field_Qb = false;
                        stackIn_33_0 = var10;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return stackIn_33_0;
                }
                case 34: {
                    try {
                        ph.field_xb = ll.field_a;
                        ph.field_Eb = new String[-100 + var10];
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (ph.field_xb == ll.field_a) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = 2;
                        if (pe.b(25973, var10)) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = de.field_V.e(3);
                        de.field_V.field_n = 0;
                        if (!pe.b(25973, var11)) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12 = ph.field_Eb.length;
                        var13 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var12 <= var13) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ph.field_Eb[var13] = de.field_V.b(true);
                        var13++;
                        if (var14 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var14 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        si.a(60);
                        jd.field_Qb = false;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var12 + 100;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 47: {
                    return stackIn_47_0;
                }
                case 48: {
                    try {
                        if (rb.field_f != ph.field_xb) {
                            statePc = 57;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!fh.a((byte) 117)) {
                            statePc = 57;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (255 == bh.field_k) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        rk.field_Y = de.field_V.c((byte) -38);
                        if (var14 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var10_ref_String = de.field_V.c(-16829);
                        if (var10_ref_String == null) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        a.a(var10_ref_String, false, se.h(25144));
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        si.a(105);
                        jd.field_Qb = false;
                        stackIn_56_0 = bh.field_k;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 56: {
                    return stackIn_56_0;
                }
                case 57: {
                    try {
                        if (null == qc.field_s) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!jd.field_Qb) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (30000L < sl.a(-1)) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        rk.field_Y = re.field_u;
                        if (var14 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        rk.field_Y = kh.field_f;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        jd.field_Qb = false;
                        stackIn_65_0 = 249;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return stackIn_65_0;
                }
                case 66: {
                    try {
                        var10 = hc.field_a;
                        hc.field_a = ef.field_P;
                        jd.field_Qb = true;
                        ef.field_P = var10;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = -1;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return stackIn_68_0;
                }
                case 69: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var7);
                    stackIn_70_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("qb.F(").append(param0).append(',').append(param1).append(',');
                    stackIn_70_1 = stackIn_71_1;
                    if (param2 == null) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_73_1 = stackIn_74_1;
                    if (param5 == null) {
                        statePc = 74;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_73_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_73_1);
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
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_77_0;
                    stackIn_77_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
                    stackIn_76_1 = stackIn_77_1;
                    if (param6 == null) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_78_2 = "{...}";
                    statePc = 78;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_78_2 = "null";
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    throw dh.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(byte param0) {
        try {
            int stackIn_23_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_107_0 = 0;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            pj var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            pj var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = client.field_A ? 1 : 0;
                        if (null != this.field_v) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = ik.a(param0 ^ -52);
                        var4 = (int)(-this.field_e + var2_long);
                        if (200 >= var4) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        this.field_e = var2_long;
                        this.field_b = this.field_b + var4;
                        if (-30001 <= (this.field_b ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            this.field_v.a(0);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var5_ref_Exception = (Exception) ((Object) caughtException);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        this.field_v = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (null != this.field_v) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        if (this.c((byte) -114) == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return false;
                    }
                    case 12: {
                        if (this.c(param0 ^ -56) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return false;
                    }
                    case 14: {
                        return true;
                    }
                    case 16: {
                        try {
                            this.field_v.b((byte) -124);
                            var2 = (pj) ((Object) this.field_d.b(-2198));
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var2 == null) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            this.field_i.field_n = 0;
                            this.field_i.a(true, 1);
                            this.field_i.a(-71, var2.field_r);
                            this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                            this.field_g.a(var2, -7267);
                            var2 = (pj) ((Object) this.field_d.b((byte) 20));
                            if (var16 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var16 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param0 == -56) {
                                statePc = 24;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackIn_23_0 = 0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0 != 0;
                    }
                    case 24: {
                        try {
                            var2 = (pj) ((Object) this.field_n.b(-2198));
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2 == null) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            this.field_i.field_n = 0;
                            this.field_i.a(true, 0);
                            this.field_i.a(-98, var2.field_r);
                            this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                            this.field_l.a(var2, -7267);
                            var2 = (pj) ((Object) this.field_n.b((byte) 20));
                            if (var16 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var2_int = 0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var2_int ^ -1) <= -101) {
                                statePc = 106;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var3_int = this.field_v.b(0);
                            stackIn_107_0 = -1;
                            stackIn_30_0 = stackIn_107_0;
                            if (var16 != 0) {
                                statePc = 107;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (stackIn_30_0 < (var3_int ^ -1)) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-1 != (var3_int ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var16 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            this.field_b = 0;
                            var4 = 0;
                            if (null != this.field_h) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var4 = 10;
                            if (var16 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (0 != this.field_h.field_K) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var4 = 1;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 87;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var5 = -this.field_c.field_n + var4;
                            if (var5 <= var3_int) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var5 = var3_int;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            this.field_v.a(var5, this.field_c.field_n, (byte) 17, this.field_c.field_r);
                            if (this.field_f == 0) {
                                statePc = 49;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var6 = 0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var5 <= var6) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            this.field_c.field_r[this.field_c.field_n - -var6] = (byte)qm.b((int) this.field_c.field_r[this.field_c.field_n + var6], (int) this.field_f);
                            var6++;
                            if (var16 != 0) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var16 == 0) {
                                statePc = 45;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            this.field_c.field_n = this.field_c.field_n + var5;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (this.field_c.field_n >= var4) {
                                statePc = 53;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var16 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (this.field_h == null) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_c.field_n = 0;
                            var6 = this.field_c.d((byte) -48);
                            var7 = this.field_c.i(7553);
                            var8 = this.field_c.d((byte) -99);
                            var9 = this.field_c.i(7553);
                            var10 = 127 & var8;
                            if (0 == (128 & var8)) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            stackIn_58_0 = 1;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackIn_58_0 = 0;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = stackIn_58_0;
                            var12 = (long)var7 + ((long)var6 << -1415245088);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 64;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (pj) ((Object) this.field_l.b(param0 + -2142));
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackIn_75_0 = (var14_ref.field_r < var12 ? -1 : (var14_ref.field_r == var12 ? 0 : 1));
                            stackIn_62_0 = stackIn_75_0;
                            if (var16 != 0) {
                                statePc = 75;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (stackIn_62_0 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (pj) ((Object) this.field_l.b((byte) 20));
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (pj) ((Object) this.field_g.b(-2198));
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackIn_75_0 = ((var14_ref.field_r ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_r ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_67_0 = stackIn_75_0;
                            if (var16 != 0) {
                                statePc = 75;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (stackIn_67_0 != 0) {
                                statePc = 70;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var16 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (pj) ((Object) this.field_g.b((byte) 20));
                            if (var16 == 0) {
                                statePc = 65;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var14_ref == null) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackIn_75_0 = var10;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (stackIn_75_0 == 0) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackIn_78_0 = 9;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_78_0 = 5;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var15 = stackIn_78_0;
                            this.field_h = var14_ref;
                            this.field_h.field_J = new wl(var9 - -var15 - -this.field_h.field_M);
                            this.field_h.field_J.a(true, var10);
                            this.field_h.field_J.a(var9, false);
                            this.field_h.field_K = 10;
                            this.field_c.field_n = 0;
                            if (var16 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (0 == this.field_h.field_K) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (-1 != this.field_c.field_r[0]) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            this.field_h.field_K = 1;
                            this.field_c.field_n = 0;
                            if (var16 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            this.field_h = null;
                            if (var16 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var5 = -this.field_h.field_M + this.field_h.field_J.field_r.length;
                            var6 = -this.field_h.field_K + 512;
                            if (var6 > var5 + -this.field_h.field_J.field_n) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var6 = var5 + -this.field_h.field_J.field_n;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var6 = var3_int;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            this.field_v.a(var6, this.field_h.field_J.field_n, (byte) 17, this.field_h.field_J.field_r);
                            if (0 == this.field_f) {
                                statePc = 99;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var7 = 0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (var7 >= var6) {
                                statePc = 99;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            this.field_h.field_J.field_r[var7 + this.field_h.field_J.field_n] = (byte)qm.b((int) this.field_h.field_J.field_r[var7 + this.field_h.field_J.field_n], (int) this.field_f);
                            var7++;
                            if (var16 != 0) {
                                statePc = 100;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (var16 == 0) {
                                statePc = 95;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            this.field_h.field_K = this.field_h.field_K + var6;
                            this.field_h.field_J.field_n = this.field_h.field_J.field_n + var6;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (this.field_h.field_J.field_n != var5) {
                                statePc = 103;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.field_h.e((byte) 116);
                            this.field_h.field_z = false;
                            this.field_h = null;
                            if (var16 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (512 != this.field_h.field_K) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            this.field_h.field_K = 0;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 28;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            stackIn_107_0 = 1;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        return stackIn_107_0 != 0;
                    }
                    case 108: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 109;
                        continue stateLoop;
                    }
                    case 109: {
                        try {
                            this.field_v.a(0);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        this.field_j = this.field_j + 1;
                        this.field_o = -2;
                        this.field_v = null;
                        if (this.c((byte) -115) == 0) {
                            statePc = 114;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    }
                    case 113: {
                        return false;
                    }
                    case 114: {
                        if (-1 == (this.c(0) ^ -1)) {
                            statePc = 116;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    }
                    case 115: {
                        return false;
                    }
                    case 116: {
                        return true;
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

    final void a(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_v.a(0);
              if (param0 == 8192) {
                break L1;
              } else {
                this.a((byte) -2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        this.field_o = -1;
        this.field_j = this.field_j + 1;
        this.field_v = null;
        this.field_f = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        field_p = null;
        int var1 = -57 % ((60 - param0) / 50);
        field_t = null;
        field_r = null;
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              if (param2) {
                stackIn_7_0 = aj.field_d.a(param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = wf.field_q.a(param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 14;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("qb.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0, byte param1, kn param2) {
        try {
            pb.field_c.a(param2, 2777);
            if (param1 != 85) {
                field_t = (String) null;
            }
            fm.a((byte) -113, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            fd stackIn_10_0 = null;
            java.net.URL stackIn_10_1 = null;
            java.net.URL stackIn_10_2 = null;
            java.net.URL stackIn_10_3 = null;
            StringBuilder stackIn_10_4 = null;
            fd stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            fd stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            String stackIn_12_5 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            mh var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = client.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3 = j.a(param0, (byte) 37);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param2 == null) {
                                statePc = 7;
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
                            if (param0 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3 = var3 + " | ";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3 = var3 + param2;
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
                            im.a(18239, var3);
                            var3 = bh.a(0, var3, "%3a", ":");
                            var3 = bh.a(param1 + -16408, var3, "%40", "@");
                            var3 = bh.a(param1 ^ param1, var3, "%26", "&");
                            var7 = bh.a(0, var3, "%23", "#");
                            if (null != th.field_b) {
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
                        return;
                    }
                    case 9: {
                        try {
                            stackIn_11_0 = o.field_f;
                            stackIn_10_0 = stackIn_11_0;
                            stackIn_11_1 = null;
                            stackIn_10_1 = stackIn_11_1;
                            stackIn_11_2 = null;
                            stackIn_10_2 = stackIn_11_2;
                            stackIn_11_3 = th.field_b.getCodeBase();
                            stackIn_10_3 = stackIn_11_3;
                            stackIn_11_4 = new StringBuilder().append("clienterror.ws?c=").append(wb.field_Rb).append("&u=");
                            stackIn_10_4 = stackIn_11_4;
                            if (eh.field_d != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackIn_12_0 = (fd) ((Object) stackIn_10_0);
                            stackIn_12_1 = null;
                            stackIn_12_2 = null;
                            stackIn_12_3 = (java.net.URL) ((Object) stackIn_10_3);
                            stackIn_12_4 = (StringBuilder) ((Object) stackIn_10_4);
                            stackIn_12_5 = "" + ua.field_B;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackIn_12_0 = (fd) ((Object) stackIn_11_0);
                            stackIn_12_1 = null;
                            stackIn_12_2 = null;
                            stackIn_12_3 = (java.net.URL) ((Object) stackIn_11_3);
                            stackIn_12_4 = (StringBuilder) ((Object) stackIn_11_4);
                            stackIn_12_5 = eh.field_d;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = ((fd) (Object) stackIn_12_0).a(new java.net.URL(stackIn_12_3, stackIn_12_5 + "&v1=" + fd.field_k + "&v2=" + fd.field_c + "&e=" + var7), (byte) 42);
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
                            if (var4.field_c != 0) {
                                statePc = 17;
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
                            ua.a(1L, -128);
                            if (var6 != 0) {
                                statePc = 21;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6 == 0) {
                                statePc = 13;
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
                            if (1 != var4.field_c) {
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
                            var5 = (DataInputStream) (var4.field_b);
                            var5.read();
                            var5.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var3_ref = (Exception) ((Object) caughtException);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
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

    private final void e(byte param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (param0 == -15) {
              if (this.field_v != null) {
                try {
                  L0: {
                    this.field_i.field_n = 0;
                    this.field_i.a(true, 6);
                    this.field_i.b((byte) 46, 3);
                    this.field_i.d(-1, 0);
                    this.field_v.a(0, this.field_i.field_r.length, 1, this.field_i.field_r);
                    break L0;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L1: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    try {
                      L2: {
                        this.field_v.a(param0 + 15);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L3: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    this.field_v = null;
                    this.field_j = this.field_j + 1;
                    this.field_o = -2;
                    break L1;
                  }
                }
                return;
              } else {
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

    public qb() {
    }

    static {
        field_u = 22;
        field_s = new ln();
    }
}
