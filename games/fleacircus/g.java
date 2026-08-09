/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class g extends w {
    static int field_s;
    private td field_v;
    static String field_t;
    static double field_u;

    public g() {
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
            field_s = 92;
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            fk var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = fleas.field_A ? 1 : 0;
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
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.field_v.h(0);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 5 : 34);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 34;
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
                            statePc = 34;
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
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (param2 == 105) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            this.field_v = (td) (param0);
                            this.g(-79);
                            this.a(param2 + 5, param1);
                            this.field_p = null;
                            this.field_f.field_i = 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var4_ref = (fk) ((Object) this.field_q.a(param2 ^ -30));
                            if (var4_ref != null) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 34;
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
                            statePc = 34;
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
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            this.field_o.a(var4_ref, -1089421886);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 34;
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
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var4_ref = (fk) ((Object) this.field_h.a(-122));
                            if (var4_ref != null) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var6 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var6 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            this.field_n.a(var4_ref, param2 ^ -1089421909);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var6 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (this.field_g != 0) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            this.field_d.field_i = 0;
                            this.field_d.a(-11, 4);
                            this.field_d.a(param2 + -116, (int) this.field_g);
                            this.field_d.a(0, (byte) -58);
                            this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof IOException ? 27 : 34);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            this.field_v.h(0);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof Exception ? 30 : 34);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            this.field_b = -2;
                            this.field_c = this.field_c + 1;
                            this.field_v = null;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            this.field_k = 0;
                            this.field_m = lj.a((byte) -67);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_36_0 = (RuntimeException) (var4_ref3);
                        stackIn_35_0 = stackIn_36_0;
                        stackIn_36_1 = new StringBuilder().append("g.L(");
                        stackIn_35_1 = stackIn_36_1;
                        if (param0 == null) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                        stackIn_37_2 = "{...}";
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 36: {
                        stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                        stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                        stackIn_37_2 = "null";
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        throw pf.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
                    }
                    case 38: {
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

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            ni stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ni stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            Exception var4 = null;
            if (this.field_v != null) {
              try {
                L0: {
                  L1: {
                    this.field_d.field_i = 0;
                    if (param0 > 48) {
                      break L1;
                    } else {
                      this.b((byte) 48);
                      break L1;
                    }
                  }
                  L2: {
                    stackIn_6_0 = this.field_d;

                    stackIn_6_1 = -11;

                    if (param1) {
                      stackIn_7_0 = (ni) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 2;
                      break L2;
                    } else {
                      stackIn_7_0 = (ni) ((Object) stackIn_6_0);
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = 3;
                      break L2;
                    }
                  }
                  ((ni) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                  this.field_d.a(0L, (byte) -39);
                  this.field_v.a((byte) -118, this.field_d.field_k.length, 0, this.field_d.field_k);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      this.field_v.h(0);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  this.field_v = null;
                  this.field_b = -2;
                  this.field_c = this.field_c + 1;
                  break L3;
                }
              }
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

    final void a(byte param0) {
        try {
            this.field_v.h(0);
        } catch (Exception exception) {
        }
        this.field_c = this.field_c + 1;
        this.field_b = -1;
        this.field_v = null;
        this.field_g = (byte)(int)(1.0 + Math.random() * 255.0);
        int var2 = 116 / ((param0 - -29) / 47);
    }

    final void d(int param0) {
        if (null != this.field_v) {
            this.field_v.h(param0 + 14835);
        }
        if (param0 != -14835) {
            this.d(-128);
        }
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var3 = jc.a(param2, 116);
        int var4 = we.a((byte) 75, param2);
        int var5 = jc.a(param1, 117);
        int var6 = 104 % ((53 - param0) / 58);
        int var7 = we.a((byte) 101, param1);
        int var8 = (int)((long)var5 * (long)var3 >> 922083344);
        int var9 = (int)((long)var7 * (long)var3 >> -961792752);
        int var10 = (int)((long)var4 * (long)var5 >> 21370448);
        int var11 = (int)((long)var7 * (long)var4 >> 484235664);
        return new int[]{0, 0, 0, var7, 0, var5, var8, var4, -var9, -var10, var3, var11};
    }

    private final void g(int param0) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            Exception var3 = null;
            if (this.field_v != null) {
              L0: {
                if (param0 <= -33) {
                  break L0;
                } else {
                  field_t = (String) null;
                  break L0;
                }
              }
              try {
                L1: {
                  this.field_d.field_i = 0;
                  this.field_d.a(-11, 6);
                  this.field_d.a(false, 3);
                  this.field_d.b((byte) 75, 0);
                  this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
                  break L1;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      this.field_v.h(0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  this.field_b = -2;
                  this.field_v = null;
                  this.field_c = this.field_c + 1;
                  break L2;
                }
              }
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

    final boolean b(byte param0) {
        try {
            int stackIn_31_0 = 0;
            int stackIn_58_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_69_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_78_0 = 0;
            int stackIn_106_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            fk var2 = null;
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
            fk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = fleas.field_A ? 1 : 0;
                        if (null != this.field_v) {
                            statePc = 2;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2_long = lj.a((byte) -24);
                        var4 = (int)(-this.field_m + var2_long);
                        if ((var4 ^ -1) >= -201) {
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
                        this.field_m = var2_long;
                        this.field_k = this.field_k + var4;
                        if (this.field_k > 30000) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            this.field_v.h(0);
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
                        this.field_v = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == this.field_v) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (this.f(1) == 0) {
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
                        if (this.e(-53) != 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return true;
                    }
                    case 16: {
                        return false;
                    }
                    case 18: {
                        try {
                            this.field_v.c(0);
                            var2 = (fk) ((Object) this.field_o.b((byte) 113));
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            this.field_d.field_i = 0;
                            this.field_d.a(-11, 1);
                            this.field_d.a(var2.field_j, (byte) -39);
                            this.field_v.a((byte) -122, this.field_d.field_k.length, 0, this.field_d.field_k);
                            this.field_q.a(var2, -1089421886);
                            var2 = (fk) ((Object) this.field_o.c((byte) 67));
                            if (var16 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (param0 == 66) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.g(-76);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var2 = (fk) ((Object) this.field_n.b((byte) 120));
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            this.field_d.field_i = 0;
                            this.field_d.a(-11, 0);
                            this.field_d.a(var2.field_j, (byte) -39);
                            this.field_v.a((byte) -103, this.field_d.field_k.length, 0, this.field_d.field_k);
                            this.field_h.a(var2, -1089421886);
                            var2 = (fk) ((Object) this.field_n.c((byte) 117));
                            if (var16 == 0) {
                                statePc = 26;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 105;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var3_int = this.field_v.e(-120);
                            stackIn_106_0 = 0;
                            stackIn_31_0 = stackIn_106_0;
                            if (var16 != 0) {
                                statePc = 106;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (stackIn_31_0 > var3_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var3_int != 0) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var16 == 0) {
                                statePc = 105;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.field_k = 0;
                            var4 = 0;
                            if (this.field_p != null) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var4 = 10;
                            if (var16 == 0) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (this.field_p.field_y != 0) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var4 = 1;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (var4 <= 0) {
                                statePc = 87;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var5 = var4 + -this.field_f.field_i;
                            if (var3_int < var5) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var5 = var3_int;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            this.field_v.a(var5, this.field_f.field_k, this.field_f.field_i, false);
                            if (-1 != (this.field_g ^ -1)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var6 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var6 >= var5) {
                                statePc = 52;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            this.field_f.field_k[var6 + this.field_f.field_i] = (byte)df.a((int) this.field_f.field_k[var6 + this.field_f.field_i], (int) this.field_g);
                            var6++;
                            if (var16 != 0) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var16 == 0) {
                                statePc = 48;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            this.field_f.field_i = this.field_f.field_i + var5;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (this.field_f.field_i < var4) {
                                statePc = 104;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (this.field_p != null) {
                                statePc = 79;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            this.field_f.field_i = 0;
                            var6 = this.field_f.e(false);
                            var7 = this.field_f.c((byte) 25);
                            var8 = this.field_f.e(false);
                            var9 = this.field_f.c((byte) 124);
                            var10 = 127 & var8;
                            if ((var8 & 128) == 0) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 107;
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
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = stackIn_58_0;
                            var12 = (long)var7 + ((long)var6 << -919735392);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 66;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var14_ref = (fk) ((Object) this.field_q.b((byte) 117));
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackIn_75_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                            stackIn_62_0 = stackIn_75_0;
                            if (var16 != 0) {
                                statePc = 75;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (stackIn_62_0 != 0) {
                                statePc = 65;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var16 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var14_ref = (fk) ((Object) this.field_q.c((byte) 71));
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var14_ref = (fk) ((Object) this.field_h.b((byte) 120));
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var14_ref == null) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackIn_75_0 = ((var14_ref.field_j ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_j ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_69_0 = stackIn_75_0;
                            if (var16 != 0) {
                                statePc = 75;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (stackIn_69_0 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14_ref = (fk) ((Object) this.field_h.c((byte) 97));
                            if (var16 == 0) {
                                statePc = 67;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackIn_75_0 = var10 ^ -1;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (stackIn_75_0 != -1) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackIn_78_0 = 5;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_78_0 = 9;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var15 = stackIn_78_0;
                            this.field_p = var14_ref;
                            this.field_p.field_A = new ni(this.field_p.field_E + var9 + var15);
                            this.field_p.field_A.a(-11, var10);
                            this.field_p.field_A.a(var9, (byte) -106);
                            this.field_f.field_i = 0;
                            this.field_p.field_y = 10;
                            if (var16 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (-1 == (this.field_p.field_y ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if ((this.field_f.field_k[0] ^ -1) == 0) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            this.field_p = null;
                            if (var16 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            this.field_f.field_i = 0;
                            this.field_p.field_y = 1;
                            if (var16 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var5 = this.field_p.field_A.field_k.length + -this.field_p.field_E;
                            var6 = -this.field_p.field_y + 512;
                            if (var5 - this.field_p.field_A.field_i < var6) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var6 = -this.field_p.field_A.field_i + var5;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            if (var6 <= var3_int) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var6 = var3_int;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            this.field_v.a(var6, this.field_p.field_A.field_k, this.field_p.field_A.field_i, false);
                            if (0 == this.field_g) {
                                statePc = 98;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var7 = 0;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (var7 >= var6) {
                                statePc = 98;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i] = (byte)df.a((int) this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i], (int) this.field_g);
                            var7++;
                            if (var16 != 0) {
                                statePc = 99;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (var16 == 0) {
                                statePc = 94;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            this.field_p.field_y = this.field_p.field_y + var6;
                            this.field_p.field_A.field_i = this.field_p.field_A.field_i + var6;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (this.field_p.field_A.field_i == var5) {
                                statePc = 103;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (512 != this.field_p.field_y) {
                                statePc = 104;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.field_p.field_y = 0;
                            if (var16 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            this.field_p.e(-100);
                            this.field_p.field_q = false;
                            this.field_p = null;
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            stackIn_106_0 = 1;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        return stackIn_106_0 != 0;
                    }
                    case 107: {
                        var2_ref = (IOException) ((Object) caughtException);
                        statePc = 108;
                        continue stateLoop;
                    }
                    case 108: {
                        try {
                            this.field_v.h(0);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        var3 = (Exception) ((Object) caughtException);
                        statePc = 111;
                        continue stateLoop;
                    }
                    case 111: {
                        this.field_c = this.field_c + 1;
                        this.field_b = -2;
                        this.field_v = null;
                        if (0 == this.f(1)) {
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
                        if (this.e(-64) == 0) {
                            statePc = 115;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    }
                    case 114: {
                        return false;
                    }
                    case 115: {
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

    static {
        field_s = 0;
        field_t = "Fleas get in each others' way, and can even climb over each other. If you have too many fleas together, be careful, as they can sometimes overflow out of the confined space they are in. On some levels you need to do this to win!";
        field_u = 0.0;
    }
}
