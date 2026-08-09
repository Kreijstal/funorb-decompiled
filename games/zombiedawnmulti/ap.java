/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends qb {
    static String field_u;
    static boolean field_s;
    static String field_r;
    static ja field_t;
    private ej field_q;

    private final void a(boolean param0, boolean param1) {
        try {
            k stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            k stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            IOException var3 = null;
            Exception var4 = null;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_b.field_j = 0;
                    stackIn_5_0 = this.field_b;

                    stackIn_5_1 = 122;

                    if (param0) {
                      stackIn_6_0 = (k) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 2;
                      break L1;
                    } else {
                      stackIn_6_0 = (k) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 3;
                      break L1;
                    }
                  }
                  L2: {
                    ((k) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                    this.field_b.b(0L, param1);
                    this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                    if (param1) {
                      break L2;
                    } else {
                      this.a(false, false);
                      break L2;
                    }
                  }
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_q.c(93);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_n = this.field_n + 1;
                  this.field_q = null;
                  this.field_p = -2;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ul param0, byte param1, fm param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ob var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        Throwable var11 = null;
        Throwable var12 = null;
        fm var13 = null;
        int[] var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = p.field_e;
                        rp.field_l = new cj(0L, (cj) null);
                        var4 = 97 / ((param1 - 46) / 63);
                        if (param0 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var11 = (Throwable) null;
                        bd.a("QC1", (Throwable) null, false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        param0.field_j = false;
                        param0.field_b = 0;
                        ok.field_p = new ig(var3_int, param0, param0);
                        bd.field_c = new an(var3_int, param0, param0, new dd());
                        var5 = ha.b(false);
                        if (var5 == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = (Throwable) null;
                        bd.a("QC2", (Throwable) null, false);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        fb.a(var5, (byte) -19);
                        var13 = (fm) null;
                        tg.field_d = qd.a(1127256, (fm) null, 65793, 1513239, 8947848, 4020342, 65793, (byte) 123, 0, 2245737, 65793, 1513239, 5138823);
                        bb.field_k = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 127, 16764006, 0, 0, 0, 0);
                        kb.field_x = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 122, 16777215, 0, 0, 0, 0);
                        var6 = oo.field_b;
                        var7 = oo.field_l;
                        var17 = oo.field_i;
                        tb.field_v = new ja(10, 14);
                        tb.field_v.a();
                        var9 = 2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (7 <= var9) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        oo.g(var9, var9 + 1, 14 + -(var9 << -1210809887), 16777215);
                        var9++;
                        if (var10 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var10 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        oo.a(var17, var6, var7);
                        tl.field_t = eh.a(false, tg.field_d, bb.field_k, kb.field_x, var5);
                        rp.field_l.field_Cb = new th();
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var3);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("ap.M(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param2 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(byte param0) {
        try {
            int stackIn_29_0 = 0;
            int stackIn_54_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_105_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            tn var2 = null;
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
            tn var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ZombieDawnMulti.field_E ? 1 : 0;
                        if (this.field_q == null) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = bl.a((byte) 115);
                        var4 = (int)(var2_long - this.field_f);
                        if (-201 > (var4 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var4 = 200;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        this.field_f = var2_long;
                        this.field_d = this.field_d + var4;
                        if (this.field_d > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            this.field_q.c(99);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var5_ref_Exception = (Exception) ((Object) caughtException);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        this.field_q = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == this.field_q) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (this.a(0) == 0) {
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
                        if (0 == this.d(20)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return false;
                    }
                    case 16: {
                        return true;
                    }
                    case 18: {
                        try {
                            this.field_q.b(-26844);
                            var2 = (tn) ((Object) this.field_g.c((byte) 111));
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2 == null) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            this.field_b.field_j = 0;
                            this.field_b.a(-112, 1);
                            this.field_b.b(var2.field_l, true);
                            this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                            this.field_j.a(29664, var2);
                            var2 = (tn) ((Object) this.field_g.b((byte) 97));
                            if (var16 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var16 == 0) {
                                statePc = 19;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2 = (tn) ((Object) this.field_c.c((byte) 124));
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2 == null) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            this.field_b.field_j = 0;
                            this.field_b.a(-20, 0);
                            this.field_b.b(var2.field_l, true);
                            this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                            this.field_l.a(29664, var2);
                            var2 = (tn) ((Object) this.field_c.b((byte) 102));
                            if (var16 == 0) {
                                statePc = 24;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var2_int = 0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 104;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var3_int = this.field_q.a(-79);
                            stackIn_105_0 = var3_int;
                            stackIn_29_0 = stackIn_105_0;
                            if (var16 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (stackIn_29_0 >= 0) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (0 == var3_int) {
                                statePc = 104;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            this.field_d = 0;
                            var4 = 0;
                            if (null == this.field_m) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (this.field_m.field_D == 0) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var4 = 10;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((var4 ^ -1) >= -1) {
                                statePc = 85;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var5 = -this.field_k.field_j + var4;
                            if (var3_int < var5) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var5 = var3_int;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.field_q.a(var5, this.field_k.field_j, this.field_k.field_m, 108);
                            if (this.field_i != 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var6 = 0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var5 <= var6) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            this.field_k.field_m[var6 + this.field_k.field_j] = (byte)vg.a((int) this.field_k.field_m[var6 + this.field_k.field_j], (int) this.field_i);
                            var6++;
                            if (var16 != 0) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var16 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            this.field_k.field_j = this.field_k.field_j + var5;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var4 > this.field_k.field_j) {
                                statePc = 103;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (this.field_m != null) {
                                statePc = 77;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            this.field_k.field_j = 0;
                            var6 = this.field_k.g(31365);
                            var7 = this.field_k.i(-1478490344);
                            var8 = this.field_k.g(31365);
                            var9 = this.field_k.i(-1478490344);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            stackIn_54_0 = 1;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            stackIn_54_0 = 0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var11 = stackIn_54_0;
                            var12 = (long)var7 + ((long)var6 << -827722592);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 62;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var14_ref = (tn) ((Object) this.field_l.c((byte) 110));
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var14_ref == null) {
                                statePc = 69;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            stackIn_73_0 = ((var14_ref.field_l ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_l ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_58_0 = stackIn_73_0;
                            if (var16 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (stackIn_58_0 != 0) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var16 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var14_ref = (tn) ((Object) this.field_l.b((byte) 122));
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var14_ref = (tn) ((Object) this.field_j.c((byte) 96));
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var14_ref == null) {
                                statePc = 69;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackIn_73_0 = ((var12 ^ -1L) < (var14_ref.field_l ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_l ^ -1L) ? 0 : 1));
                            stackIn_65_0 = stackIn_73_0;
                            if (var16 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (stackIn_65_0 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var16 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (tn) ((Object) this.field_j.b((byte) 123));
                            if (var16 == 0) {
                                statePc = 63;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            stackIn_73_0 = var10 ^ -1;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (stackIn_73_0 != -1) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackIn_76_0 = 5;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackIn_76_0 = 9;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var15 = stackIn_76_0;
                            this.field_m = var14_ref;
                            this.field_m.field_y = new k(var15 + (var9 + this.field_m.field_B));
                            this.field_m.field_y.a(125, var10);
                            this.field_m.field_y.b(42, var9);
                            this.field_m.field_D = 10;
                            this.field_k.field_j = 0;
                            if (var16 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (-1 == (this.field_m.field_D ^ -1)) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if ((this.field_k.field_m[0] ^ -1) == 0) {
                                statePc = 82;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            this.field_m = null;
                            if (var16 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            this.field_m.field_D = 1;
                            this.field_k.field_j = 0;
                            if (var16 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var5 = this.field_m.field_y.field_m.length - this.field_m.field_B;
                            var6 = -this.field_m.field_D + 512;
                            if (var6 <= -this.field_m.field_y.field_j + var5) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var6 = -this.field_m.field_y.field_j + var5;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var6 = var3_int;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            this.field_q.a(var6, this.field_m.field_y.field_j, this.field_m.field_y.field_m, 117);
                            if (0 != this.field_i) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var7 = 0;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (var6 <= var7) {
                                statePc = 96;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j] = (byte)vg.a((int) this.field_m.field_y.field_m[var7 + this.field_m.field_y.field_j], (int) this.field_i);
                            var7++;
                            if (var16 != 0) {
                                statePc = 97;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (var16 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            this.field_m.field_y.field_j = this.field_m.field_y.field_j + var6;
                            this.field_m.field_D = this.field_m.field_D + var6;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (this.field_m.field_y.field_j != var5) {
                                statePc = 100;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            this.field_m.a(-4564);
                            this.field_m.field_t = false;
                            this.field_m = null;
                            if (var16 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (-513 == (this.field_m.field_D ^ -1)) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            this.field_m.field_D = 0;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 27;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var2_int = -121 % ((44 - param0) / 45);
                            stackIn_105_0 = 1;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 106;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        return stackIn_105_0 != 0;
                    }
                    case 106: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 107;
                        continue stateLoop;
                    }
                    case 107: {
                        try {
                            this.field_q.c(82);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 110;
                        continue stateLoop;
                    }
                    case 110: {
                        this.field_q = null;
                        this.field_n = this.field_n + 1;
                        this.field_p = -2;
                        if (0 == this.a(0)) {
                            statePc = 112;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    }
                    case 111: {
                        return false;
                    }
                    case 112: {
                        if (0 == this.d(20)) {
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

    final static sl a(ul param0, ul param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sl stackIn_2_0 = null;
        sl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 4) {
              var5_int = param0.a(param2, (byte) 123);
              var6 = param0.a(param4, var5_int, -1);
              stackIn_4_0 = pm.a(param1, var6, var5_int, param0, -29435);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sl) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ap.Q(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (this.field_q == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_b.field_j = param0;
                  this.field_b.a(124, 6);
                  this.field_b.d(3, -8593);
                  this.field_b.a(0, (byte) -55);
                  this.field_q.a(0, param0 + -100, this.field_b.field_m.length, this.field_b.field_m);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_q.c(116);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_p = -2;
                  this.field_q = null;
                  this.field_n = this.field_n + 1;
                  break L1;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ap() {
    }

    final void a(byte param0) {
        try {
            int var2_int = 0 / ((param0 - 53) / 41);
            this.field_q.c(-101);
        } catch (Exception exception) {
        }
        this.field_n = this.field_n + 1;
        this.field_p = -1;
        this.field_q = null;
        this.field_i = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final void f(int param0) {
        if (param0 != 31) {
            this.a(false, true);
        }
        if (!(this.field_q == null)) {
            this.field_q.c(88);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            tn var4_ref = null;
            IOException var4_ref2 = null;
            int var4_int = 0;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (this.field_q != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_q.c(-90);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 27);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 27;
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
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_q = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_q = (ej) (param1);
                            this.g(0);
                            this.a(param0, true);
                            this.field_m = null;
                            this.field_k.field_j = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4_ref = (tn) ((Object) this.field_j.a(11356));
                            if (var4_ref == null) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.field_g.a(29664, var4_ref);
                            if (var6 != 0) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var6 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4_ref = (tn) ((Object) this.field_l.a(11356));
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var4_ref == null) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            this.field_c.a(29664, var4_ref);
                            if (var6 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (0 == this.field_i) {
                                statePc = 25;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            this.field_b.field_j = 0;
                            this.field_b.a(126, 4);
                            this.field_b.a(125, (int) this.field_i);
                            this.field_b.b(-103, 0);
                            this.field_q.a(0, -100, this.field_b.field_m.length, this.field_b.field_m);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof IOException ? 20 : 27);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            this.field_q.c(-53);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof Exception ? 23 : 27);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.field_q = null;
                            this.field_n = this.field_n + 1;
                            this.field_p = -2;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var4_int = 12 % ((param2 - 63) / 33);
                            this.field_d = 0;
                            this.field_f = bl.a((byte) 110);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_29_0 = (RuntimeException) (var4_ref3);
                        stackIn_28_0 = stackIn_29_0;
                        stackIn_29_1 = new StringBuilder().append("ap.F(").append(param0).append(',');
                        stackIn_28_1 = stackIn_29_1;
                        if (param1 == null) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                        stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                        stackIn_30_2 = "{...}";
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                        stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                        stackIn_30_2 = "null";
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
                    }
                    case 31: {
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

    public static void h(int param0) {
        if (param0 != 16682) {
            field_s = false;
        }
        field_r = null;
        field_u = null;
        field_t = null;
    }

    static {
        field_s = false;
        field_u = "Spectate";
        field_r = "<%0> has not yet unlocked this option for use.";
    }
}
