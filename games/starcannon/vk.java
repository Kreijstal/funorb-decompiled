/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class vk extends uj implements ch {
    static String field_x;
    static String field_w;
    static String field_t;
    static String field_v;
    rk field_u;

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        ba var2 = null;
        uj var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new ba(this.field_u);
                        if (param0 < -72) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_t = (String) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = (uj) ((Object) var2.a(0));
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 == null) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3.b((byte) -127);
                        var3 = (uj) ((Object) var2.b(106));
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw sd.a((Throwable) ((Object) runtimeException), "vk.NA(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean d(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                vk.e((byte) 0);
                break L1;
              }
            }
            L2: {
              if (null == this.h(1)) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "vk.UA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 != (param0 ^ -1)) {
                            statePc = 7;
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
                        if (null == this.field_o) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_o.a(param1, true, 71, param3, (uj) (this));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5 = new ba(this.field_u);
                        var6 = (uj) ((Object) var5.a(false));
                        if (param2 == 49) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        if (null == var6) {
                            statePc = 16;
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
                        var6.a(param0, this.field_s + param1, (byte) 49, param3 + this.field_j);
                        var6 = (uj) ((Object) var5.a((byte) -34));
                        if (var7 != 0) {
                            statePc = 16;
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
                        if (var7 == 0) {
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw sd.a((Throwable) ((Object) runtimeException), "vk.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void f(int param0) {
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ia var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        rj var3 = null;
        hb var3_ref = null;
        int[] var3_array = null;
        int[] var4 = null;
        rj var4_ref = null;
        ia var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = se.field_p;
                        var2 = var1.j(7909);
                        if (-1 == (var2 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-2 == (var2 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (2 == var2) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        hc.a((Throwable) null, "A1: " + oe.a(87), (byte) 72);
                        ec.a((byte) 27);
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var3 = (rj) ((Object) sd.field_d.c(-3905));
                        if (var3 != null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ec.a((byte) 27);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var3.field_g = wa.a((byte) -109);
                        var3.field_k = var3.field_g[0];
                        var3.field_n = true;
                        var3.b(4);
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3_ref = (hb) ((Object) hi.field_f.c(-3905));
                        if (var3_ref == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ec.a((byte) 27);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    try {
                        var3_ref.b(4);
                        if (var8 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var3_array = wa.a((byte) -77);
                        var4 = var3_array;
                        var5 = var1;
                        var6 = ((rb) ((Object) var5)).j(7909);
                        var7 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 >= var6) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4[var7] = ((rb) ((Object) var5)).f((byte) -125);
                        var7++;
                        if (var8 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4_ref = (rj) ((Object) sd.field_d.c(-3905));
                        if (var4_ref != null) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ec.a((byte) 27);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return;
                }
                case 30: {
                    try {
                        var4_ref.field_n = true;
                        var4_ref.field_k = var3_array[0];
                        var4_ref.field_g = var3_array;
                        var4_ref.b(4);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param0 < -25) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        vk.a((String) null, -7, (String) null, (ue) null);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw sd.a((Throwable) ((Object) var1_ref), "vk.SB(" + param0 + ')');
                }
                case 36: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static hl a(String param0, int param1, String param2, ue param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hl stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param3.a(param0, false);
              var5 = param3.a(param2, true, var4_int);
              if (param1 > 9) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            stackIn_4_0 = di.a(130, var5, param3, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("vk.EB(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              var5 = new ba(this.field_u);
              if (param0 == -36) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            var6 = (uj) ((Object) var5.a(param0 + 36));
            L2: while (true) {
              if (null == var6) {
                break L0;
              } else {
                discarded$9 = param2.append('\n');
                var7 = 0;
                L3: while (true) {
                  if ((param3 ^ -1) > (var7 ^ -1)) {
                    var6.a(param1, param2, (byte) 39, 1 + param3);
                    var6 = (uj) ((Object) var5.b(param0 + 149));
                    continue L2;
                  } else {
                    discarded$10 = param2.append(' ');
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5_ref);

            stackIn_14_1 = new StringBuilder().append("vk.WB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, uj param1) {
        ba var3 = null;
        uj var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = new ba(this.field_u);
            var4 = (uj) ((Object) var3.a(param0));
            L1: while (true) {
              if (var4 == null) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var4.a(0, param1)) {
                  var4 = (uj) ((Object) var3.b(95));
                  continue L1;
                } else {
                  stackIn_6_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("vk.PA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    private final void g(int param0) {
        RuntimeException runtimeException = null;
        ba var2 = null;
        uj var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new ba(this.field_u);
              if (param0 == 27807) {
                break L1;
              } else {
                this.a((Hashtable) null, (StringBuilder) null, (byte) -115, -49);
                break L1;
              }
            }
            var3 = (uj) ((Object) var2.a(0));
            L2: while (true) {
              if (null == var3) {
                break L0;
              } else {
                var3.d((byte) -30);
                var3 = (uj) ((Object) var2.b(95));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "vk.TB(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, uj param4, int param5, int param6) {
        ba var8 = null;
        RuntimeException var8_ref = null;
        uj var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var10 = StarCannon.field_A;
        try {
          L0: {
            var8 = new ba(this.field_u);
            var9 = (uj) ((Object) var8.a(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.a((byte) -110);
                    stackIn_17_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.d(true)) {
                            break L4;
                          } else {
                            if (!var9.a(param0, param1, param2, param3, param4, param5, -81)) {
                              break L4;
                            } else {
                              stackIn_14_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        var9 = (uj) ((Object) var8.b(param6 ^ -46));
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_17_0 = param6;
                break L2;
              }
              L5: {
                if (stackIn_17_0 == -81) {
                  break L5;
                } else {
                  field_w = (String) null;
                  break L5;
                }
              }
              stackIn_21_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8_ref);

            stackIn_25_1 = new StringBuilder().append("vk.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param0, 0, param1, param3)) {
                this.a(param0, param1, param3, 19103);
                this.a((byte) -36, param0, param1, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 39) {
                break L2;
              } else {
                this.g(89);
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("vk.SA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0;
    }

    final static void b(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 == 32) {
                    break L3;
                  } else {
                    field_w = (String) null;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_10_0 = (RuntimeException) (var2_ref2);

                stackIn_10_1 = new StringBuilder().append("vk.AC(");

                if (param0 == null) {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "null";
                  break L4;
                } else {
                  stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackIn_11_2 = "{...}";
                  break L4;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sk a(byte param0, String param1) {
        sk stackIn_3_0 = null;
        sk stackIn_6_0 = null;
        sk stackIn_12_0 = null;
        int stackIn_22_0 = 0;
        sk stackIn_30_0 = null;
        Object stackIn_34_0 = null;
        sk stackIn_37_0 = null;
        sk stackIn_53_0 = null;
        sk stackIn_61_0 = null;
        Object stackIn_65_0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        if (0 != var2_int) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = qb.field_b;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var2_int <= 64) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = ai.field_a;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if (34 == param1.charAt(0)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (34 == param1.charAt(-1 + var2_int)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = ra.field_t;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 + var2_int <= var4) {
                            statePc = 33;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = param1.charAt(var4);
                        if (92 == var5) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var3 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var3 = stackIn_22_0;
                        if (var6 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (-35 != (var5 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var3 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = ra.field_t;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0;
                }
                case 31: {
                    try {
                        var3 = 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = null;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return (sk) ((Object) stackIn_34_0);
                }
                case 35: {
                    try {
                        var3 = 0;
                        if (param0 == 63) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = (sk) null;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0;
                }
                case 38: {
                    try {
                        var4 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 64;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5 = param1.charAt(var4);
                        if (-47 != (var5 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((var4 ^ -1) == -1) {
                            statePc = 52;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (-1 + var2_int == var4) {
                            statePc = 52;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var3 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = ra.field_t;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 53: {
                    return stackIn_53_0;
                }
                case 54: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (-1 == oj.field_k.indexOf(var5)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_61_0 = ra.field_t;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    return stackIn_61_0;
                }
                case 62: {
                    try {
                        var3 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = null;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    return (sk) ((Object) stackIn_65_0);
                }
                case 66: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_69_0 = (RuntimeException) (var2);
                    stackIn_67_0 = stackIn_69_0;
                    stackIn_69_1 = new StringBuilder().append("vk.UB(").append(param0).append(',');
                    stackIn_67_1 = stackIn_69_1;
                    if (param1 == null) {
                        statePc = 69;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_70_2 = "{...}";
                    statePc = 70;
                    continue stateLoop;
                }
                case 69: {
                    stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_70_2 = "null";
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    throw sd.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void e(int param0) {
        try {
            fd.a(4, 0);
            if (param0 >= -18) {
                vk.b((java.applet.Applet) null, 53);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vk.CB(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, (byte) 118, param3, param4);
              if (param2 >= 115) {
                break L1;
              } else {
                this.field_u = (rk) null;
                break L1;
              }
            }
            this.g(27807);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var6), "vk.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0, uj param1) {
        ba var3 = null;
        uj var4 = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_11_0;
        boolean stackOut_20_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_u.a(true)) {
                            statePc = 4;
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
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (param0 == -103) {
                            statePc = 9;
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
                        field_x = (String) null;
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
                        var3 = new ba(this.field_u);
                        var4 = (uj) ((Object) var3.a(param0 ^ -103));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == var4) {
                            statePc = 29;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var4.d(true);
                        stackIn_30_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var7 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 == 0) {
                            statePc = 28;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = new ba(this.field_u);
                        var5.a(var4, param0 + 103);
                        var6 = (uj) ((Object) var5.b(95));
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
                        if (null == var6) {
                            statePc = 28;
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
                        stackOut_20_0 = var6.a(0, param1);
                        stackIn_30_0 = stackOut_20_0 ? 1 : 0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var7 != 0) {
                            statePc = 30;
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
                        if (stackIn_21_0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    try {
                        var6 = (uj) ((Object) var5.b(101));
                        if (var7 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (uj) ((Object) var3.b(102));
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var3_ref);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("vk.VB(").append(param0).append(',');
                    stackIn_32_1 = stackIn_34_1;
                    if (param1 == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_32_1);
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
                    throw sd.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, uj param2, int param3) {
        RuntimeException runtimeException = null;
        ba var5 = null;
        uj var6 = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = StarCannon.field_A;
        try {
          L0: {
            if (param0 > 27) {
              super.a(120, param1, param2, param3);
              var5 = new ba(this.field_u);
              var6 = (uj) ((Object) var5.a(0));
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (!var6.a((byte) -125)) {
                      break L2;
                    } else {
                      var6.a(119, param1 + this.field_s, param2, this.field_j + param3);
                      var6 = (uj) ((Object) var5.b(69));
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("vk.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(byte param0) {
        field_x = null;
        field_t = null;
        field_w = null;
        if (param0 != 73) {
            return;
        }
        try {
            field_v = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vk.BB(" + param0 + ')');
        }
    }

    final String d(int param0) {
        ba var2 = null;
        RuntimeException var2_ref = null;
        uj var3 = null;
        String var4 = null;
        int var5 = 0;
        String stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var2 = new ba(this.field_u);
              var3 = (uj) ((Object) var2.a(0));
              if (param0 == 12606) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var4 = var3.d(12606);
                    stackIn_15_0 = null;

                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (stackIn_15_0 != var4) {
                        stackIn_12_0 = (String) (var4);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3 = (uj) ((Object) var2.b(param0 + -12496));
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_15_0 = null;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "vk.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_15_0);
        } else {
          return stackIn_12_0;
        }
    }

    uj h(int param0) {
        ba var2 = null;
        uj var3 = null;
        uj stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            var2 = new ba(this.field_u);
            var3 = (uj) ((Object) var2.a(param0 ^ param0));
            L1: while (true) {
              if (null == var3) {
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!var3.d(true)) {
                  var3 = (uj) ((Object) var2.b(114));
                  continue L1;
                } else {
                  stackIn_6_0 = (uj) (var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "vk.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return (uj) ((Object) stackIn_9_0);
        }
    }

    final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        ba var7 = null;
        uj var8 = null;
        int var9 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var9 = StarCannon.field_A;
        try {
          L0: {
            var7 = new ba(this.field_u);
            var8 = (uj) ((Object) var7.a(param4 ^ -22));
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var8) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.a((byte) 24);
                    stackIn_9_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var8.a(param0, param1 + this.field_j, param2 + this.field_s, param3, (byte) -22, param5);
                        var8 = (uj) ((Object) var7.b(param4 + 142));
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_9_0 = param4;
                break L2;
              }
              L4: {
                if (stackIn_9_0 == -22) {
                  break L4;
                } else {
                  field_v = (String) null;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("vk.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean b(int param0, uj param1) {
        int var3_int = 0;
        ba var4 = null;
        uj var5 = null;
        ba var6 = null;
        uj var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_8_0;
        boolean stackOut_14_0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 96 / ((param0 - -61) / 35);
                        if (this.field_u.a(true)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var4 = new ba(this.field_u);
                        var5 = (uj) ((Object) var4.a(false));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == null) {
                            statePc = 23;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = var5.d(true);
                        stackIn_24_0 = stackOut_8_0 ? 1 : 0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var8 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!stackIn_9_0) {
                            statePc = 22;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6 = new ba(this.field_u);
                        var6.a(0, var5);
                        var7 = (uj) ((Object) var6.a((byte) -34));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 == null) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = var7.a(0, param1);
                        stackIn_24_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var8 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    try {
                        var7 = (uj) ((Object) var6.a((byte) -34));
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = (uj) ((Object) var4.a((byte) -34));
                        if (var8 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var3);
                    stackIn_26_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("vk.FB(").append(param0).append(',');
                    stackIn_26_1 = stackIn_28_1;
                    if (param1 == null) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw sd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ba var3 = null;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            var2_int = 0;
            var3 = new ba(this.field_u);
            var4 = (uj) ((Object) var3.a(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    var5 = var4.c(false);
                    stackIn_10_0 = var2_int ^ -1;

                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_10_0 <= (var5 ^ -1)) {
                          break L4;
                        } else {
                          var2_int = var5;
                          break L4;
                        }
                      }
                      var4 = (uj) ((Object) var3.b(80));
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackIn_10_0 = param0 ? 1 : 0;
                break L2;
              }
              L5: {
                if (stackIn_10_0 == 0) {
                  break L5;
                } else {
                  field_v = (String) null;
                  break L5;
                }
              }
              stackIn_14_0 = var2_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "vk.HB(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        ba var8 = null;
        RuntimeException var8_ref = null;
        uj var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var8 = new ba(this.field_u);
              if (param4 == -11) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            var9 = (uj) ((Object) var8.a(param4 ^ -11));
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var9) {
                    break L4;
                  } else {
                    stackOut_6_0 = var9.a((byte) 120);
                    stackIn_17_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2 - -this.field_s, param3 - -this.field_j, (byte) -11, param5, param6)) {
                          var9 = (uj) ((Object) var8.b(68));
                          if (var10 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackIn_14_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackIn_17_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8_ref);

            stackIn_21_1 = new StringBuilder().append("vk.G(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          return stackIn_14_0 != 0;
        }
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        ba var5 = null;
        RuntimeException var5_ref = null;
        uj var6_ref_uj = null;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var7 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5 = new ba(this.field_u);
              if (param2 == -90) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var6_ref_uj = (uj) ((Object) var5.a(param2 + 90));
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var6_ref_uj) {
                    break L4;
                  } else {
                    stackOut_6_0 = var6_ref_uj.a((byte) 64);
                    stackIn_22_0 = stackOut_6_0 ? 1 : 0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_7_0) {
                        break L4;
                      } else {
                        L5: {
                          if (!var6_ref_uj.d(true)) {
                            break L5;
                          } else {
                            if (var6_ref_uj.a(param0, param1, (byte) -90, param3)) {
                              stackIn_19_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var6_ref_uj = (uj) ((Object) var5.b(97));
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_22_0 = param3;
                break L3;
              }
              var6 = stackIn_22_0;
              if (var6 == 80) {
                L6: {
                  if (!wc.field_c[81]) {
                    stackIn_29_0 = this.a((byte) -103, param0);
                    break L6;
                  } else {
                    stackIn_29_0 = this.b(-110, param0);
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_31_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var5_ref);

            stackIn_35_1 = new StringBuilder().append("vk.EA(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L7;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0;
          } else {
            return stackIn_31_0 != 0;
          }
        }
    }

    final static void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ia var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        ld var6 = null;
        String var6_ref = null;
        String var7 = null;
        ld var7_ref = null;
        String var8 = null;
        ld var8_ref = null;
        int var9 = 0;
        var9 = StarCannon.field_A;
        try {
          L0: {
            var1 = se.field_p;
            var3 = 82 / ((-41 - param0) / 54);
            var2 = var1.j(7909);
            if ((var2 ^ -1) == -1) {
              L1: {
                if (td.field_o != null) {
                  break L1;
                } else {
                  td.field_o = new ai(128);
                  hi.field_b = 0;
                  break L1;
                }
              }
              L2: {
                if (1 != var1.j(7909)) {
                  stackIn_11_0 = 0;
                  break L2;
                } else {
                  stackIn_11_0 = 1;
                  break L2;
                }
              }
              L3: {
                var4_int = stackIn_11_0;
                var5_ref_String = var1.a(-120);
                if (var4_int != 0) {
                  var1.a(-71);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var6 = wk.a(var5_ref_String, 92);
                var7 = var1.a(-79);
                var8 = ni.a(126, (CharSequence) ((Object) var5_ref_String));
                if (var8 != null) {
                  break L4;
                } else {
                  var8 = var5_ref_String;
                  break L4;
                }
              }
              L5: {
                if (var6 == null) {
                  var6 = wk.a(var7, 89);
                  if (var6 == null) {
                    break L5;
                  } else {
                    td.field_o.a(2, (long)var8.hashCode(), var6);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (null == var6) {
                  var6 = new ld();
                  td.field_o.a(2, (long)var8.hashCode(), var6);
                  fieldTemp$0 = hi.field_b;
                  hi.field_b = hi.field_b + 1;
                  var6.field_hb = fieldTemp$0;
                  ma.field_c.b(122, var6);
                  break L6;
                } else {
                  break L6;
                }
              }
              var6.field_kb = var5_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (2 == var2) {
                  L7: {
                    if (1 == bd.field_f) {
                      bd.field_f = 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (3 == var2) {
                    L8: {
                      if (bd.field_f == 2) {
                        bd.field_f = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) == -5) {
                      bd.field_f = 1;
                      var4 = var1.a(-72);
                      wg.field_a = ((String) (var4)).intern();
                      var5 = var1.j(7909);
                      ej.b(true, var5);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      hc.a((Throwable) null, "F1: " + oe.a(73), (byte) 106);
                      ec.a((byte) 27);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                L9: {
                  if (m.field_d == null) {
                    m.field_d = new ai(128);
                    ec.field_b = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var4 = var1.a(-42);
                  if (!((String) (var4)).equals("")) {
                    break L10;
                  } else {
                    var4 = null;
                    break L10;
                  }
                }
                L11: {
                  var5_ref_String = var1.a(-39);
                  var6_ref = var1.a(-107);
                  var7_ref = hg.a(120, var5_ref_String);
                  if (var7_ref != null) {
                    break L11;
                  } else {
                    var7_ref = hg.a(120, var6_ref);
                    if (null != var7_ref) {
                      m.field_d.a(2, (long)ni.a(107, (CharSequence) ((Object) var5_ref_String)).hashCode(), var7_ref);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (null == var7_ref) {
                    var7_ref = new ld();
                    m.field_d.a(2, (long)ni.a(113, (CharSequence) ((Object) var5_ref_String)).hashCode(), var7_ref);
                    fieldTemp$1 = ec.field_b;
                    ec.field_b = ec.field_b + 1;
                    var7_ref.field_hb = fieldTemp$1;
                    ti.field_a.b(121, var7_ref);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (null == var4) {
                    break L13;
                  } else {
                    var4 = ((String) (var4)).intern();
                    break L13;
                  }
                }
                var7_ref.field_gb = (String) (var4);
                var7_ref.field_kb = var5_ref_String;
                var7_ref.b(4);
                var8_ref = (ld) ((Object) ti.field_a.c(-3905));
                L14: while (true) {
                  L15: {
                    if (var8_ref == null) {
                      break L15;
                    } else {
                      if (!ff.a(80, var7_ref, var8_ref)) {
                        break L15;
                      } else {
                        var8_ref = (ld) ((Object) ti.field_a.a(-16913));
                        if (var9 == 0) {
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  L16: {
                    L17: {
                      if (null != var8_ref) {
                        break L17;
                      } else {
                        ti.field_a.b(66, var7_ref);
                        if (var9 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    fe.a(var8_ref, var7_ref, false);
                    break L16;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "vk.GB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, uj param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            this.field_u.b(91, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vk.WA(").append(param0).append(',');

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
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    vk(int param0, int param1, int param2, int param3, de param4) {
        super(param0, param1, param2, param3, param4, (qg) null);
        this.field_u = new rk();
    }

    static {
        field_x = "Unfortunately we are unable to create an account for you at this time.";
        field_t = "OVER <%0>";
        field_w = "LIVES:";
    }
}
