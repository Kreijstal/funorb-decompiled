/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai implements Runnable {
    private lq field_e;
    static gh field_g;
    static String field_d;
    static int field_a;
    private Thread field_i;
    private boolean field_f;
    static cj field_c;
    static int field_b;
    int field_h;

    final li b(int param0, bq param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        bq var5 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 10) {
                break L1;
              } else {
                var5 = (bq) null;
                this.a(-98, (bq) null, -12);
                break L1;
              }
            }
            var4 = new li();
            var4.field_B = param1;
            var4.field_r = false;
            var4.field_y = 3;
            var4.field_l = (long)param0;
            this.a(false, var4);
            stackIn_3_0 = (li) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ai.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, byte param1) {
        try {
            wk.a(param0, (byte) 48);
            qj.a(jl.field_v, false, 102);
            int var2_int = -102 % ((52 - param1) / 40);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ai.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            li var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            L0: while (true) {
              if (!this.field_f) {
                var2_ref = this.field_e;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (li) ((Object) this.field_e.a(11356));
                    if (var5 == 0) {
                      L2: {
                        if (var7 != null) {
                          break L2;
                        } else {
                          try {
                            L3: {
                              this.field_e.wait();
                              break L3;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L4: {
                              interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                              break L4;
                            }
                          }
                          if (var5 == 0) {
                            decompiledRegionSelector0 = 0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      this.field_h = this.field_h - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L5: {
                      L6: {
                        L7: {
                          if ((var7.field_y ^ -1) == -3) {
                            break L7;
                          } else {
                            if (-4 != (var7.field_y ^ -1)) {
                              break L6;
                            } else {
                              var7.field_D = var7.field_B.a(1, (int)var7.field_l);
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var7.field_B.a((byte) 118, var7.field_D, var7.field_D.length, (int)var7.field_l);
                        break L6;
                      }
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      var2_ref2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      bd.a((String) null, (Throwable) ((Object) var2_ref2), false);
                      break L8;
                    }
                  }
                  var7.field_t = false;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final li a(int param0, bq param1, byte[] param2, int param3) {
        li var5 = null;
        RuntimeException var5_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new li();
            var5.field_r = false;
            var5.field_l = (long)param0;
            var5.field_D = param2;
            var5.field_y = 2;
            var5.field_B = param1;
            this.a(false, var5);
            if (param3 > 26) {
              stackIn_4_0 = (li) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (li) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ai.H(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_87_0 = 0;
        int decompiledRegionSelector0 = 0;
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
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        lq.field_b = lq.field_b + 65536;
                        if (param1 == 110) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_d = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (65536 > sd.a((byte) 120, lq.field_b, nf.field_b)) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fn.field_c = fn.field_c + 1;
                        stackIn_8_0 = lq.field_b - nf.field_b;
                        stackIn_5_0 = stackIn_8_0;
                        if (var5 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        lq.field_b = stackIn_5_0;
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = -1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2_int = stackIn_8_0;
                        if (null == ld.field_Ub) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2_int = ld.field_Ub.length;
                        if (var5 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null != ao.field_h) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2_int = ao.field_h.length;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var2_int ^ -1) != 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (lb.field_a >= nf.field_c) {
                            statePc = 26;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        lb.field_a = lb.field_a + 1;
                        if (lb.field_a <= nf.field_a) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null == ld.field_Ub) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null != ld.field_Ub[gf.field_g]) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        lb.field_a = lb.field_a - 1;
                        if (var5 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (lb.field_a < nf.field_c) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (ld.field_Ub[(gf.field_g + 1) % var2_int] == null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        lb.field_a = lb.field_a - 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (nf.field_c <= lb.field_a) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        gf.field_j = gf.field_g;
                        if (qh.field_a) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        gf.field_g = gf.field_g - 1;
                        if (gf.field_g >= 0) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        gf.field_g = gf.field_g + var2_int;
                        if (var5 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        gf.field_g = gf.field_g + 1;
                        if (gf.field_g >= var2_int) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        gf.field_g = gf.field_g - var2_int;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        lb.field_a = lb.field_a - nf.field_c;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (nf.field_a >= lb.field_a) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        qh.field_a = true;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (fa.field_Tb == null) {
                            statePc = 62;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var3 = -(fa.field_Tb.field_u / 2) + 357;
                        var4 = 0;
                        if (kd.field_b == 0) {
                            statePc = 49;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (ka.field_t <= var3) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (fa.field_Tb.field_w + var3 <= ka.field_t) {
                            statePc = 49;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (269 + -fa.field_Tb.field_x >= vb.field_f) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (-270 >= (vb.field_f ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4 = 1;
                        lb.field_a = nf.field_c;
                        qh.field_a = false;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (-587 <= (vb.field_f ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (vb.field_f < fa.field_Tb.field_x + 586) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var4 = 1;
                        qh.field_a = true;
                        lb.field_a = nf.field_c;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var4 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (nf.field_a >= lb.field_a) {
                            statePc = 62;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (bo.field_d <= var3) {
                            statePc = 62;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (fa.field_Tb.field_w + var3 > bo.field_d) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (-fa.field_Tb.field_x + 269 >= bd.field_g) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (269 > bd.field_g) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        lb.field_a = nf.field_a;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((bd.field_g ^ -1) >= -587) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        lb.field_a = nf.field_a;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (param0) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        return 0;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                        if (!gl.field_H.c(-85)) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (gl.field_H.field_d == 0) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_68_0 = 3;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 68: {
                    return stackIn_68_0;
                }
                case 69: {
                    try {
                        if (gl.field_H.field_d != 1) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackIn_71_0 = 2;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 71: {
                    return stackIn_71_0;
                }
                case 73: {
                    try {
                        if (!ba.c(param1 ^ -111)) {
                            statePc = 86;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        gl.field_H.a(0, false);
                        if (!gl.field_H.c(-85)) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (gl.field_H.field_d != 0) {
                            statePc = 78;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 88;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 77: {
                    return stackIn_77_0;
                }
                case 78: {
                    try {
                        if (gl.field_H.field_d == 1) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_81_0 = 1;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 81: {
                    return stackIn_81_0;
                }
                case 82: {
                    try {
                        if (13 != sj.field_p) {
                            statePc = 73;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 88;
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
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 84: {
                    stackIn_87_0 = stackIn_84_0;
                    stackIn_85_0 = stackIn_87_0;
                    if (var5 != 0) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    return stackIn_85_0;
                }
                case 86: {
                    try {
                        stackIn_87_0 = 0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    return stackIn_87_0;
                }
                case 88: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var2), "ai.E(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 < 126) {
            field_a = 104;
            field_c = null;
            field_g = null;
            return;
        }
        field_c = null;
        field_g = null;
    }

    final li a(int param0, bq param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        li var6 = null;
        int var8 = 0;
        li stackIn_3_0 = null;
        li stackIn_13_0 = null;
        li stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = new li();
            if (param2 == -3) {
              var4.field_y = 1;
              var5 = this.field_e;
              synchronized (var5) {
                L1: {
                  var6 = (li) ((Object) this.field_e.c((byte) 85));
                  L2: while (true) {
                    L3: {
                      if (var6 == null) {
                        break L3;
                      } else {
                        stackIn_20_0 = (li) (var6);

                        if (var8 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            if (stackIn_20_0.field_l != (long)param0) {
                              break L4;
                            } else {
                              if (param1 != var6.field_B) {
                                break L4;
                              } else {
                                if (-3 == (var6.field_y ^ -1)) {
                                  var4.field_t = false;
                                  var4.field_D = var6.field_D;
                                  stackIn_13_0 = (li) (var4);
                                  return stackIn_13_0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var6 = (li) ((Object) this.field_e.b((byte) 118));
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
              L5: {
                if (decompiledRegionSelector0 == 0) {
                  break L5;
                } else {
                  var4.field_D = param1.a(1, param0);
                  var4.field_t = false;
                  var4.field_r = true;
                  stackIn_20_0 = (li) (var4);
                  break L5;
                }
              }
              decompiledRegionSelector1 = 1;
              break L0;
            } else {
              stackIn_3_0 = (li) null;
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4_ref);

            stackIn_23_1 = new StringBuilder().append("ai.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        bk stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param0 <= (param2.length ^ -1)) {
                if (param1) {
                  stackIn_10_0 = re.a(255, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = (byte[]) (param2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var3 = new bk();
                ((t) ((Object) var3)).a(param2, (byte) -72);
                stackIn_5_0 = (bk) (var3);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ai.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void a(boolean param0, li param1) {
        synchronized (this.field_e) {
            this.field_e.a(29664, param1);
            if (param0) {
                this.field_i = (Thread) null;
            }
            this.field_h = this.field_h + 1;
            this.field_e.notifyAll();
        }
    }

    final void a(byte param0) {
        try {
            String var4 = null;
            this.field_f = true;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
                if (param0 != 77) {
                    var4 = (String) null;
                    ai.a((String) null, (byte) 75);
                }
            }
            try {
                this.field_i.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (-14 != (sj.field_p ^ -1)) {
          if (sj.field_p == 102) {
            mj.field_Ib.c((byte) 113);
            return true;
          } else {
            if (!param0) {
              if (null != mj.field_Ib) {
                if (!mj.field_Ib.a(96, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              ai.a(true, (byte) 112);
              if (null != mj.field_Ib) {
                if (!mj.field_Ib.a(96, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          ub.n(33423425);
          return true;
        }
    }

    ai(go param0) {
        RuntimeException runtimeException = null;
        di var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    this.field_e = new lq();
                    this.field_f = false;
                    this.field_h = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a(121, (Runnable) (this), 5);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2.field_f != 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vd.a(false, 10L);
                        if (var3 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var2.field_f ^ -1) != -3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_i = (Thread) (var2.field_d);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("ai.<init>(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = -1;
        field_d = "The game options are not all set.";
    }
}
