/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ck {
    private float field_i;
    private float field_d;
    private float field_c;
    private float field_h;
    private int field_f;
    static String field_g;
    private int field_k;
    private float field_a;
    static am field_j;
    private float field_e;
    static rl[] field_b;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_j = null;
    }

    final static rg a(String param0, String param1, boolean param2, long param3, int param4) {
        RuntimeException var6 = null;
        gq stackIn_4_0 = null;
        wk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        wk stackOut_5_0 = null;
        gq stackOut_3_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param3 != 0L) {
                break L1;
              } else {
                if (param1 != null) {
                  stackOut_5_0 = new wk(param1, param0);
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = new gq(param3, param0);
            stackIn_4_0 = stackOut_3_0;
            return (rg) (Object) stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("ck.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + false + ',' + param3 + ',' + param4 + ')');
        }
        return (rg) (Object) stackIn_6_0;
    }

    final void b(int param0) {
        if (((ck) this).field_f > 0) {
            ((ck) this).field_f = ((ck) this).field_f - 1;
            return;
        }
        ((ck) this).field_c = ((ck) this).field_c - ((ck) this).field_d;
        ((ck) this).field_a = ((ck) this).field_a + ((ck) this).field_e;
        if (param0 != -26338) {
            return;
        }
        ((ck) this).field_h = ((ck) this).field_h + ((ck) this).field_i;
        if (0.0f > ((ck) this).field_c) {
            this.a(-22970);
        }
        ((ck) this).field_k = (int)((ck) this).field_c * 100 / 400;
        if (((ck) this).field_k > 100) {
            ((ck) this).field_k = 100;
        }
    }

    private final void a(int param0) {
        ((ck) this).field_f = ok.a(ea.field_b, -101, 50) + 20;
        ((ck) this).field_d = 1.5f + (float)ok.a(ea.field_b, -125, 100) / 100.0f;
        int var2 = ok.a(ea.field_b, -123, 2) == 1 ? 1 : 0;
        int var3 = ok.a(ea.field_b, -115, 2) == 1 ? 1 : 0;
        if (var2 != 0) {
            ((ck) this).field_h = var3 != 0 ? 640.0f : -100.0f;
            ((ck) this).field_a = (float)(ok.a(ea.field_b, -109, 580) + -100);
        } else {
            ((ck) this).field_h = (float)(-100 + ok.a(ea.field_b, -106, 740));
            ((ck) this).field_a = var3 == 0 ? -100.0f : 480.0f;
        }
        int var4 = 320 + -(int)((ck) this).field_h;
        int var5 = 240 - (int)((ck) this).field_a;
        ((ck) this).field_c = (float)hd.a(var4 * var4 - -(var5 * var5), 126);
        float var6 = ((ck) this).field_d / ((ck) this).field_c;
        ((ck) this).field_i = var6 * (float)var4;
        ((ck) this).field_e = var6 * (float)var5;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        if (((ck) this).field_k > 8) {
          if (param0 == 100) {
            L0: {
              if (param1) {
                stackOut_6_0 = 16777215;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            L1: {
              var3 = stackIn_7_0;
              if (((ck) this).field_k < 24) {
                L2: {
                  var4 = -8 + ((ck) this).field_k << 1;
                  var5 = -1 + ((ck) this).field_k / 2;
                  if (var5 < 0) {
                    var5 = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5 <= 5) {
                    break L3;
                  } else {
                    var5 = 5;
                    break L3;
                  }
                }
                if (jc.field_d) {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, var5, var3, var4);
                  break L1;
                } else {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, var3, var4);
                  break L1;
                }
              } else {
                if (!jc.field_d) {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, var3, 100);
                  break L1;
                } else {
                  t.a((int)((ck) this).field_h, (int)((ck) this).field_a, ((ck) this).field_k, ((ck) this).field_k, 5, var3, 32);
                  break L1;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, jl param1, fm param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        qe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = wo.field_d;
            bn.field_I = new ak(0L, (ak) null);
            if (param2 == null) {
              var10 = null;
              jo.a(1, "QC1", (Throwable) null);
              return;
            } else {
              param2.field_i = false;
              param2.field_e = 0;
              w.field_y = new il(var3_int, param2, param2);
              jd.field_k = new u(var3_int, param2, param2, (hj) (Object) new dn());
              var4 = fl.c(-3060);
              if (var4 == null) {
                var11 = null;
                jo.a(1, "QC2", (Throwable) null);
                return;
              } else {
                oo.a(-1, var4);
                var12 = null;
                vl.field_L = ka.a(65793, 4020342, 65793, (jl) null, 1513239, 0, 8947848, 65793, 21, 1513239, 2245737, 5138823, 1127256);
                ue.field_t = ka.a(0, 0, 0, param1, 0, 16764006, 0, 0, 21, 0, 0, 0, 0);
                ve.field_Ib = ka.a(0, 0, 0, param1, 0, 16777215, 0, 0, 21, 0, 0, 0, 0);
                var5 = t.field_j;
                var6 = t.field_d;
                var16 = t.field_k;
                fe.field_b = new tf(10, 14);
                fe.field_b.c();
                var8 = 2;
                L1: while (true) {
                  if (var8 >= 7) {
                    t.a(var16, var5, var6);
                    pi.field_Rb = lj.a(ue.field_t, ve.field_Ib, -55, vl.field_L, var4);
                    bn.field_I.field_L = new bb();
                    break L0;
                  } else {
                    t.g(var8, 1 + var8, -(var8 << 1) + 14, 16777215);
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ck.A(").append(65793).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_18_0 = 0;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Pixelate.field_H ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!c.field_T) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = 1;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            var2 = "tuhstatbut";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3 = (String) cq.a("getcookies", (byte) -113, param1);
                            var4 = dd.a(var3, (byte) -52, ';');
                            var5 = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 15;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 1;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var5++;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var2_ref = caughtException;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (param1.getParameter("tuhstatbut") == null) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_19_0 = (RuntimeException) var2_ref2;
                        stackOut_19_1 = new StringBuilder().append("ck.F(").append(true).append(',');
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param1 == null) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "null";
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
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

    ck() {
        int var1 = 0;
        L0: {
          this.a(-22970);
          var1 = ok.a(ea.field_b, -128, 250);
          if (var1 >= 180) {
            ((ck) this).field_f = ((ck) this).field_f + ok.a(ea.field_b, -116, 50);
            break L0;
          } else {
            L1: {
              ((ck) this).field_f = 0;
              ((ck) this).field_a = ((ck) this).field_a + ((ck) this).field_e * (float)var1;
              ((ck) this).field_h = ((ck) this).field_h + (float)var1 * ((ck) this).field_i;
              ((ck) this).field_c = ((ck) this).field_c - (float)var1 * ((ck) this).field_d;
              if (((ck) this).field_c >= 0.0f) {
                break L1;
              } else {
                this.a(-22970);
                break L1;
              }
            }
            ((ck) this).field_k = (int)((ck) this).field_c * 100 / 400;
            if (((ck) this).field_k <= 100) {
              break L0;
            } else {
              ((ck) this).field_k = 100;
              break L0;
            }
          }
        }
    }

    static {
    }
}
