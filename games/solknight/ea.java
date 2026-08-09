/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea extends va {
    private ad field_r;
    static String field_q;
    static int[] field_p;
    static int field_o;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            String stackIn_35_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            ic var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (this.field_r != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_r.d(param1 + -104);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 32);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 32;
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
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_r = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.field_r = (ad) (param2);
                            if (param1 == 106) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.c(false);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.c(true);
                            this.a(param0, false);
                            this.field_a = null;
                            this.field_h.field_m = 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var4_ref = (ic) ((Object) this.field_i.c(param1 ^ 106));
                            if (var4_ref != null) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var6 != 0) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var6 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            this.field_m.a(var4_ref, 0);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var4_ref = (ic) ((Object) this.field_k.c(0));
                            if (var4_ref == null) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            this.field_d.a(var4_ref, 0);
                            if (var6 != 0) {
                                statePc = 30;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var6 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (this.field_n != 0) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            this.field_e.field_m = 0;
                            this.field_e.c(95, 4);
                            this.field_e.c(7, (int) this.field_n);
                            this.field_e.b(0, false);
                            this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof IOException ? 25 : 32);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            this.field_r.d(2);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof Exception ? 28 : 32);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            this.field_l = this.field_l + 1;
                            this.field_r = null;
                            this.field_c = -2;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            this.field_j = 0;
                            this.field_b = je.a(1);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_34_0 = (RuntimeException) (var4_ref3);
                        stackIn_33_0 = stackIn_34_0;
                        stackIn_34_1 = new StringBuilder().append("ea.K(").append(param0).append(',').append(param1).append(',');
                        stackIn_33_1 = stackIn_34_1;
                        if (param2 == null) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                        stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                        stackIn_35_2 = "{...}";
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 34: {
                        stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                        stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                        stackIn_35_2 = "null";
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        throw fc.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
                    }
                    case 36: {
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

    final static od e(byte param0) {
        int var1 = -72 / ((param0 - 13) / 63);
        od var2 = new od(kl.field_a, we.field_e, ph.field_h[0], qf.field_d[0], sa.field_l[0], uj.field_b[0], jc.field_c[0], ig.field_H);
        og.a((byte) -97);
        return var2;
    }

    public static void d(boolean param0) {
        field_p = null;
        if (param0) {
            ea.e((byte) 96);
        }
        field_q = null;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            gb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    this.field_e.field_m = 0;
                    stackIn_5_0 = this.field_e;

                    stackIn_5_1 = 31;

                    if (param0) {
                      stackIn_6_0 = (gb) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 2;
                      break L1;
                    } else {
                      stackIn_6_0 = (gb) ((Object) stackIn_5_0);
                      stackIn_6_1 = stackIn_5_1;
                      stackIn_6_2 = 3;
                      break L1;
                    }
                  }
                  L2: {
                    ((gb) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2);
                    if (!param1) {
                      break L2;
                    } else {
                      ea.d(false);
                      break L2;
                    }
                  }
                  this.field_e.a(0L, 25576);
                  this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_r.d(2);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_l = this.field_l + 1;
                  this.field_c = -2;
                  this.field_r = null;
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

    final boolean d(byte param0) {
        try {
            int stackIn_31_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_76_0 = 0;
            int stackIn_104_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            ic var2 = null;
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
            ic var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = SolKnight.field_L ? 1 : 0;
                        if (null == this.field_r) {
                            statePc = 10;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2_long = je.a(1);
                        var4 = (int)(-this.field_b + var2_long);
                        this.field_b = var2_long;
                        if (var4 > 200) {
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
                        this.field_j = this.field_j + var4;
                        if (this.field_j > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            this.field_r.d(2);
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
                        this.field_r = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == this.field_r) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (0 == this.b(false)) {
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
                        if (this.c(param0 ^ -25) == 0) {
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
                            this.field_r.a(true);
                            var2 = (ic) ((Object) this.field_m.d(122));
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            this.field_e.field_m = 0;
                            this.field_e.c(param0 ^ 71, 1);
                            this.field_e.a(var2.field_l, param0 ^ 25576);
                            this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                            this.field_i.a(var2, 0);
                            var2 = (ic) ((Object) this.field_m.b(param0 ^ -1));
                            if (var16 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (param0 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ea.d(false);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var2 = (ic) ((Object) this.field_d.d(123));
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2 == null) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_e.field_m = 0;
                            this.field_e.c(117, 0);
                            this.field_e.a(var2.field_l, 25576);
                            this.field_r.a(param0 ^ -28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                            this.field_k.a(var2, 0);
                            var2 = (ic) ((Object) this.field_d.b(-1));
                            if (var16 == 0) {
                                statePc = 26;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var2_int = 0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((var2_int ^ -1) <= -101) {
                                statePc = 103;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var3_int = this.field_r.b(-30119);
                            stackIn_104_0 = 0;
                            stackIn_31_0 = stackIn_104_0;
                            if (var16 != 0) {
                                statePc = 104;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (stackIn_31_0 <= var3_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var16 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            this.field_j = 0;
                            var4 = 0;
                            if (null == this.field_a) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (0 != this.field_a.field_s) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var4 = 10;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var4 <= 0) {
                                statePc = 84;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var5 = -this.field_h.field_m + var4;
                            if (var5 > var3_int) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var5 = var3_int;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            this.field_r.a((byte) 39, this.field_h.field_m, var5, this.field_h.field_l);
                            if (this.field_n == 0) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var6 = 0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var6 >= var5) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            this.field_h.field_l[var6 + this.field_h.field_m] = (byte)wa.a((int) this.field_h.field_l[var6 + this.field_h.field_m], (int) this.field_n);
                            var6++;
                            if (var16 != 0) {
                                statePc = 51;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var16 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            this.field_h.field_m = this.field_h.field_m + var5;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (this.field_h.field_m >= var4) {
                                statePc = 54;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var16 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (this.field_a != null) {
                                statePc = 77;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_h.field_m = 0;
                            var6 = this.field_h.j(255);
                            var7 = this.field_h.e(true);
                            var8 = this.field_h.j(255);
                            var9 = this.field_h.e(true);
                            var10 = var8 & 127;
                            if ((128 & var8) == 0) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 105;
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
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = stackIn_58_0;
                            var12 = (long)var7 + ((long)var6 << -959417440);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 64;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (ic) ((Object) this.field_k.d(122));
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (var14_ref == null) {
                                statePc = 69;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackIn_73_0 = ((var12 ^ -1L) < (var14_ref.field_l ^ -1L) ? -1 : ((var12 ^ -1L) == (var14_ref.field_l ^ -1L) ? 0 : 1));
                            stackIn_62_0 = stackIn_73_0;
                            if (var16 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (stackIn_62_0 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var14_ref = (ic) ((Object) this.field_k.b(-1));
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var14_ref = (ic) ((Object) this.field_i.d(124));
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var14_ref == null) {
                                statePc = 69;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackIn_73_0 = ((var14_ref.field_l ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_l ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_67_0 = stackIn_73_0;
                            if (var16 != 0) {
                                statePc = 73;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (stackIn_67_0 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var14_ref = (ic) ((Object) this.field_i.b(-1));
                            if (var16 == 0) {
                                statePc = 65;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            stackIn_73_0 = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (stackIn_73_0 != var10) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 105;
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
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var15 = stackIn_76_0;
                            this.field_a = var14_ref;
                            this.field_a.field_v = new gb(var9 + (var15 - -this.field_a.field_y));
                            this.field_a.field_v.c(param0 + 53, var10);
                            this.field_a.field_v.b(var9, false);
                            this.field_h.field_m = 0;
                            this.field_a.field_s = 10;
                            if (var16 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (this.field_a.field_s != 0) {
                                statePc = 83;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (this.field_h.field_l[0] != -1) {
                                statePc = 81;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            this.field_h.field_m = 0;
                            this.field_a.field_s = 1;
                            if (var16 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            this.field_a = null;
                            if (var16 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var5 = -this.field_a.field_y + this.field_a.field_v.field_l.length;
                            var6 = -this.field_a.field_s + 512;
                            if (-this.field_a.field_v.field_m + var5 >= var6) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var6 = -this.field_a.field_v.field_m + var5;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            this.field_r.a((byte) 44, this.field_a.field_v.field_m, var6, this.field_a.field_v.field_l);
                            if (this.field_n != 0) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 105;
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
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            this.field_a.field_v.field_l[this.field_a.field_v.field_m + var7] = (byte)wa.a((int) this.field_a.field_v.field_l[this.field_a.field_v.field_m + var7], (int) this.field_n);
                            var7++;
                            if (var16 != 0) {
                                statePc = 97;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 105;
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
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            this.field_a.field_v.field_m = this.field_a.field_v.field_m + var6;
                            this.field_a.field_s = this.field_a.field_s + var6;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (var5 != this.field_a.field_v.field_m) {
                                statePc = 100;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            this.field_a.a(97);
                            this.field_a.field_m = false;
                            this.field_a = null;
                            if (var16 == 0) {
                                statePc = 102;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (this.field_a.field_s != 512) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.field_a.field_s = 0;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            stackIn_104_0 = 1;
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 105;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        return stackIn_104_0 != 0;
                    }
                    case 105: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 106;
                        continue stateLoop;
                    }
                    case 106: {
                        try {
                            this.field_r.d(param0 + 2);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 109;
                        continue stateLoop;
                    }
                    case 109: {
                        this.field_r = null;
                        this.field_c = -2;
                        this.field_l = this.field_l + 1;
                        if (0 == this.b(false)) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    }
                    case 110: {
                        return false;
                    }
                    case 111: {
                        if (this.c(param0 ^ -128) == 0) {
                            statePc = 113;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    }
                    case 112: {
                        return false;
                    }
                    case 113: {
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

    private final void c(boolean param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (this.field_r == null) {
              return;
            } else {
              try {
                L0: {
                  this.field_e.field_m = 0;
                  this.field_e.c(-128, 6);
                  this.field_e.d(3, 2132504424);
                  this.field_e.a(param0, 0);
                  this.field_r.a(-28748, 0, this.field_e.field_l.length, this.field_e.field_l);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L2: {
                      this.field_r.d(2);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L3: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  this.field_l = this.field_l + 1;
                  this.field_r = null;
                  this.field_c = -2;
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

    final void c(byte param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            this.field_r.d(2);
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L1;
          }
        }
        this.field_l = this.field_l + 1;
        this.field_r = null;
        if (param0 != 59) {
          return;
        } else {
          this.field_c = -1;
          this.field_n = (byte)(int)(255.0 * Math.random() + 1.0);
          return;
        }
    }

    public ea() {
    }

    final void a(byte param0) {
        if (param0 != 92) {
            field_q = (String) null;
        }
        if (!(null == this.field_r)) {
            this.field_r.d(2);
        }
    }

    static {
        field_q = "Instructions";
        field_p = new int[]{96, 96, 96, 112, 124, 192, 96, 96};
    }
}
