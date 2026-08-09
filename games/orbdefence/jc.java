/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jc implements td, rj {
    int field_d;
    private boolean field_e;
    static String field_n;
    int field_r;
    int field_i;
    int field_p;
    kc field_g;
    int field_q;
    static int[][] field_f;
    private int field_l;
    int field_s;
    static long field_o;
    int field_m;
    static hj field_k;
    int field_t;
    int field_h;
    static boolean field_b;
    int field_c;
    static df field_a;
    static boolean field_j;

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, pj param7) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jc var14 = null;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                id.a(param7.field_m + param7.field_s + param2, param7.field_s + param2, param6 - -param7.field_n + param7.field_r, param6 + param7.field_n, 734);
                var9_int = this.a(param7, -125);
                var10 = this.d(param7, false);
                if (!this.field_e) {
                  break L2;
                } else {
                  this.field_g.a(this.a((byte) -95, param7), this.a(param2, 5, param7, param1), this.a(param6, param7, (byte) -125, param0), var9_int, var10, param5, param3, this.field_h, this.field_c, this.field_t);
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var12 = this.field_c;
                        if (-1 != (var12 ^ -1)) {
                          break L7;
                        } else {
                          if (var13 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (-3 == (var12 ^ -1)) {
                        break L5;
                      } else {
                        if (3 == var12) {
                          break L4;
                        } else {
                          if ((var12 ^ -1) != -2) {
                            break L4;
                          } else {
                            if (var13 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    var11 = this.field_g.field_H;
                    if (var13 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  var11 = var10 + -this.field_g.field_B;
                  if (var13 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                var11 = this.field_g.field_H + (-this.field_g.field_B + (var10 - this.field_g.field_H) >> 306438977);
                break L3;
              }
              L8: {
                L9: {
                  L10: {
                    var12 = this.field_h;
                    if (-1 == (var12 ^ -1)) {
                      break L10;
                    } else {
                      if ((var12 ^ -1) == -4) {
                        break L10;
                      } else {
                        L11: {
                          if ((var12 ^ -1) != -2) {
                            break L11;
                          } else {
                            if (var13 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if ((var12 ^ -1) == -3) {
                          break L8;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  this.field_g.b(this.a((byte) -95, param7), this.a(param2, 5, param7, param1), var11 + this.a(param6, param7, (byte) -120, param0), param5, param3);
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L9;
                  }
                }
                this.field_g.c(this.a((byte) -95, param7), (var9_int >> -638964607) + this.a(param2, 5, param7, param1), this.a(param6, param7, (byte) -120, param0) - -var11, param5, param3);
                if (var13 == 0) {
                  break L1;
                } else {
                  break L8;
                }
              }
              this.field_g.a(this.a((byte) -95, param7), this.a(param2, 5, param7, param1) - -var9_int, this.a(param6, param7, (byte) -122, param0) + var11, param5, param3);
              break L1;
            }
            oc.g((byte) -105);
            if (param4 >= 27) {
              break L0;
            } else {
              var14 = (jc) null;
              this.a((byte) 21, (jc) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var9 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var9);

            stackIn_31_1 = new StringBuilder().append("jc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    public final int b(pj param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param0, param1);
            stackIn_1_0 = param0.field_g.b(118) + this.field_r - -this.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("jc.E(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(pj param0, int param1, int param2) {
        RuntimeException var4 = null;
        pj var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 9534) {
                break L1;
              } else {
                var5 = (pj) null;
                this.a(-127, -37, (pj) null, 88, -84, 86);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, param0, (byte) -124, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("jc.L(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(mg param0, int param1, int param2, byte[] param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
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
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = ek.a(param4, 7);
                        if (dd.field_D != null) {
                            statePc = 3;
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
                        dd.field_D = new java.security.SecureRandom();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = new int[4];
                        var11 = var12;
                        var8 = var11;
                        var9 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-5 >= (var9 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8[var9] = dd.field_D.nextInt();
                        var9++;
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (s.field_C == null) {
                            statePc = 11;
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
                        if (var7_int <= s.field_C.field_j.length) {
                            statePc = 12;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        s.field_C = new mg(var7_int);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        s.field_C.field_i = 0;
                        s.field_C.a(param2, param4, (byte) -11, param3);
                        s.field_C.d((byte) -115, var7_int);
                        s.field_C.a(var12, -87);
                        if (param1 >= 24) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        if (vd.field_a == null) {
                            statePc = 17;
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
                        if ((vd.field_a.field_j.length ^ -1) <= -101) {
                            statePc = 18;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        vd.field_a = new mg(100);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        vd.field_a.field_i = 0;
                        vd.field_a.a(10, -64);
                        var9 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var9 ^ -1) <= -5) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        vd.field_a.b(var12[var9], -1);
                        var9++;
                        if (var10 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var10 == 0) {
                            statePc = 19;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        vd.field_a.b((byte) -60, param4);
                        vd.field_a.a(param5, param6, 27551);
                        param0.a(0, vd.field_a.field_i, (byte) -11, vd.field_a.field_j);
                        param0.a(0, s.field_C.field_i, (byte) -11, s.field_C.field_j);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var7);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("jc.T(");
                    stackIn_26_1 = stackIn_27_1;
                    if (param0 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param3 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_0 = stackIn_33_0;
                    stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param4).append(',');
                    stackIn_32_1 = stackIn_33_1;
                    if (param5 == null) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_34_2 = "{...}";
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_34_2 = "null";
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_0 = stackIn_36_0;
                    stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
                    stackIn_35_1 = stackIn_36_1;
                    if (param6 == null) {
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
                    throw dd.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final dm a(pj param0, boolean param1) {
        RuntimeException var3 = null;
        dm stackIn_4_0 = null;
        bd stackIn_10_0;
        int stackIn_10_1;
        String stackIn_10_2;
        int stackIn_10_3;
        kc stackIn_10_4;
        int stackIn_10_5;
        Object stackIn_10_6;
        pj stackIn_10_7;
        bd stackIn_11_0;
        int stackIn_11_1;
        String stackIn_11_2;
        int stackIn_11_3;
        kc stackIn_11_4;
        int stackIn_11_5;
        Object stackIn_11_6;
        pj stackIn_11_7;
        int stackIn_11_8;
        dm stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0.field_g != null) {
                break L1;
              } else {
                param0.field_g = (dm) ((Object) new bd());
                break L1;
              }
            }
            if (param1) {
              L2: {
                L3: {
                  if (this.field_e) {
                    break L3;
                  } else {
                    this.a(-29106, param0);
                    if (!OrbDefence.field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  stackIn_10_0 = (bd) ((Object) param0.field_g);

                  stackIn_10_1 = 0;

                  stackIn_10_2 = this.a((byte) -95, param0);

                  stackIn_10_3 = this.field_h;

                  stackIn_10_4 = this.field_g;

                  stackIn_10_5 = this.a(param0, -119);

                  stackIn_10_6 = this;

                  stackIn_10_7 = (pj) (param0);

                  if (param1) {
                    stackIn_11_0 = (bd) ((Object) stackIn_10_0);
                    stackIn_11_1 = stackIn_10_1;
                    stackIn_11_2 = (String) ((Object) stackIn_10_2);
                    stackIn_11_3 = stackIn_10_3;
                    stackIn_11_4 = (kc) ((Object) stackIn_10_4);
                    stackIn_11_5 = stackIn_10_5;
                    stackIn_11_6 = this;
                    stackIn_11_7 = (pj) ((Object) stackIn_10_7);
                    stackIn_11_8 = 0;
                    break L4;
                  } else {
                    stackIn_11_0 = (bd) ((Object) stackIn_10_0);
                    stackIn_11_1 = stackIn_10_1;
                    stackIn_11_2 = (String) ((Object) stackIn_10_2);
                    stackIn_11_3 = stackIn_10_3;
                    stackIn_11_4 = (kc) ((Object) stackIn_10_4);
                    stackIn_11_5 = stackIn_10_5;
                    stackIn_11_6 = this;
                    stackIn_11_7 = (pj) ((Object) stackIn_10_7);
                    stackIn_11_8 = 1;
                    break L4;
                  }
                }
                ((bd) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, this.d(stackIn_11_7, stackIn_11_8 != 0), this.field_t, this.field_c);
                break L2;
              }
              stackIn_13_0 = param0.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (dm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("jc.K(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_13_0;
        }
    }

    public void a(int param0, int param1, pj param2, int param3, boolean param4) {
        if (this.field_g == null) {
            return;
        }
        try {
            if (param3 != -4394) {
                this.field_g = (kc) null;
            }
            this.a((byte) 88, param2, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int a(pj param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 54) {
                break L1;
              } else {
                this.a((byte) -23);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param2 + -49, param0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("jc.U(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, pj param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -116) {
              stackIn_4_0 = param3 + (param1.field_q + (this.field_r + param0)) + param1.field_n;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 90;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("jc.N(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(int param0, pj param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        ed var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        dm var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.d(-81)) {
                L2: {
                  var13 = this.a(param1, true);
                  var14 = var13;
                  var7 = var14.a(param4, (byte) 107);
                  var8 = var13.field_c[var7];
                  var9 = var14.a(-116, param4);
                  var10 = this.a(param2, 5, param1, var9);
                  var11 = this.a(param1, 9534, param0) + Math.max(0, var8.field_f);
                  stackIn_4_0 = this.a(param1, 9534, param0);

                  stackIn_4_1 = this.d(param1, false);

                  stackIn_4_2 = var8.field_c;

                  if (var14.field_c.length > 1 + var7) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var13.field_c[var7 + 1].field_f;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = stackIn_4_2;
                    stackIn_5_3 = var8.field_c;
                    break L2;
                  }
                }
                var12 = stackIn_5_0 - -Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
                id.a(param1.field_m + param1.field_s + param2, param1.field_s + param2, param1.field_r + (param1.field_n + param0), param0 - -param1.field_n, 734);
                mb.field_a.a(var10, false, var12, this.field_m, var10, var11);
                oc.g((byte) -105);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 > 93) {
              break L0;
            } else {
              this.field_h = -63;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("jc.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(int param0, int param1, pj param2, int param3, int param4, int param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        dm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ed var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var7_int = -30 % ((78 - param4) / 37);
            if (param0 == param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param2.d(-81)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var8 = this.a(param2, true);
                      if (param0 < param1) {
                        break L3;
                      } else {
                        var9 = param1;
                        var10 = param0;
                        if (var17 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var10 = param1;
                    var9 = param0;
                    break L2;
                  }
                  var11 = var8.a(var9, (byte) 107);
                  var12 = var8.a(var10, (byte) 107);
                  id.a(param3 + (param2.field_s - -param2.field_m), param2.field_s + param3, param2.field_r + param2.field_n + param5, param2.field_n + param5, 734);
                  var13 = var11;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var12 < var13) {
                          break L6;
                        } else {
                          var14 = var8.field_c[var13];
                          stackIn_21_0 = var11 ^ -1;

                          if (var17 != 0) {
                            break L5;
                          } else {
                            L7: {
                              if (stackIn_21_0 != (var13 ^ -1)) {
                                stackIn_14_0 = var14.field_g[0];
                                break L7;
                              } else {
                                stackIn_14_0 = var8.a(-118, var9);
                                break L7;
                              }
                            }
                            L8: {
                              var15 = stackIn_14_0;
                              if (var12 != var13) {
                                if (var14 == null) {
                                  stackIn_19_0 = 0;
                                  break L8;
                                } else {
                                  stackIn_19_0 = var14.field_g[var14.field_g.length + -1];
                                  break L8;
                                }
                              } else {
                                stackIn_19_0 = var8.a(-76, var10);
                                break L8;
                              }
                            }
                            var16 = stackIn_19_0;
                            mb.field_a.a(this.field_d, -var15 + var16, var14.field_c, this.field_r + (param5 - (-param2.field_n + -param2.field_q) + var14.field_f), this.field_d >>> 30573528, this.a(param3, 5, param2, var15), 123);
                            var13++;
                            if (var17 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      stackIn_21_0 = -105;
                      break L5;
                    }
                    oc.g((byte) stackIn_21_0);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("jc.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int c(pj param0, boolean param1) {
        RuntimeException var3 = null;
        pj var4 = null;
        dm stackIn_4_0 = null;
        dm stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param0, param1);
              if (param1) {
                break L1;
              } else {
                var4 = (pj) null;
                this.a((byte) 53, (pj) null);
                break L1;
              }
            }
            L2: {
              stackIn_4_0 = param0.field_g;

              if (param1) {
                stackIn_5_0 = (dm) ((Object) stackIn_4_0);
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = (dm) ((Object) stackIn_4_0);
                stackIn_5_1 = 1;
                break L2;
              }
            }
            stackIn_6_0 = ((dm) (Object) stackIn_5_0).a(stackIn_5_1 != 0) - -this.field_p - -this.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("jc.R(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    String a(byte param0, pj param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -95) {
              stackIn_4_0 = param1.field_l;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jc.I(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int d(pj param0, boolean param1) {
        RuntimeException var3 = null;
        pj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var4 = (pj) null;
                this.a(-126, 33, 76, -43, (pj) null, 24);
                break L1;
              }
            }
            stackIn_3_0 = -this.field_q + (param0.field_r - this.field_r);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jc.G(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(byte param0) {
        int var2 = -71 % ((param0 - -18) / 51);
        return this.field_g.field_B + this.field_g.field_H;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 > 31) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 84;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var3_int = 0;
                        var4 = sd.field_h;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (ea.field_d.length <= var3_int) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = dd.field_B[var3_int];
                        stackIn_16_0 = var5;
                        stackIn_7_0 = stackIn_16_0;
                        if (var8 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 < 0) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = hg.a(true, ea.field_d[var3_int], 0);
                        var4 = var4 + gg.field_N;
                        var7 = fd.field_c - (var6 >> -769312799);
                        if (fm.a(var4, param2, -mj.field_f + var7, (mj.field_f << 704072993) + var6, 102, param0, el.field_D + (ol.field_b << -1467722911))) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var5;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        var4 = var4 + (gg.field_N + ((ol.field_b << -446107743) - -el.field_D));
                        if (var8 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4 = var4 + d.field_j;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = -1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var3), "jc.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, jc param1) {
        try {
            param1.field_m = this.field_m;
            param1.field_s = this.field_s;
            param1.field_d = this.field_d;
            param1.field_g = this.field_g;
            param1.field_q = this.field_q;
            param1.field_l = this.field_l;
            param1.field_t = this.field_t;
            if (param0 != 81) {
                field_f = (int[][]) null;
            }
            param1.field_c = this.field_c;
            param1.field_r = this.field_r;
            param1.field_h = this.field_h;
            param1.field_p = this.field_p;
            param1.field_i = this.field_i;
            param1.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, int param1, int param2, int param3, pj param4, int param5) {
        RuntimeException var7 = null;
        pj var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param4, true);
              if (param2 == 2147483647) {
                break L1;
              } else {
                var8 = (pj) null;
                this.a((byte) 90, (pj) null);
                break L1;
              }
            }
            stackIn_3_0 = param4.field_g.a(param0 - this.a(param4, 9534, param1), -this.a(param4, param5, (byte) 54) + param3, (byte) 124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("jc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 5) {
                break L1;
              } else {
                field_j = false;
                break L1;
              }
            }
            stackIn_3_0 = param3 + (param2.field_f + (param0 - -param2.field_s) - -this.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("jc.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, pj param1) {
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param1.field_g) {
                param1.field_g = (dm) ((Object) new bd());
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -29106) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var3_int = this.a(param1, param0 ^ 29172);
                      var4 = this.d(param1, false);
                      var6 = this.field_c;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        if ((var6 ^ -1) == -3) {
                          break L4;
                        } else {
                          L6: {
                            if (-4 != (var6 ^ -1)) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var6 != 1) {
                            break L3;
                          } else {
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var5 = this.field_g.field_H;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                  var5 = var4 - this.field_g.field_B;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var5 = (-this.field_g.field_B + var4 - this.field_g.field_H >> 111060769) + this.field_g.field_H;
                break L2;
              }
              L7: {
                L8: {
                  L9: {
                    L10: {
                      L11: {
                        var6 = this.field_h;
                        if (0 != var6) {
                          break L11;
                        } else {
                          if (var7 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (3 == var6) {
                        break L10;
                      } else {
                        if (var6 == 1) {
                          break L9;
                        } else {
                          if (2 == var6) {
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    if (!(param1.field_g instanceof bd)) {
                      break L7;
                    } else {
                      ((bd) ((Object) param1.field_g)).a(0, this.a((byte) -95, param1), 89, var5, this.field_g);
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (!(param1.field_g instanceof bd)) {
                    break L7;
                  } else {
                    ((bd) ((Object) param1.field_g)).a(var3_int >> -1104717695, var5, param0 ^ -29127, this.a((byte) -95, param1), this.field_g);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (param1.field_g instanceof bd) {
                  ((bd) ((Object) param1.field_g)).a(var3_int, this.field_g, param0 + 29227, this.a((byte) -95, param1), var5);
                  break L7;
                } else {
                  return;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("jc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    jc(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public static void a(boolean param0) {
        field_f = (int[][]) null;
        field_k = null;
        if (!param0) {
            return;
        }
        field_a = null;
        field_n = null;
    }

    public final int a(pj param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        pj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                var4 = (pj) null;
                discarded$1 = this.a(86, 3, (pj) null, 16);
                break L1;
              }
            }
            stackIn_3_0 = -this.field_i + (-this.field_p + param0.field_m);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("jc.P(");

            if (param0 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(0, 0, param3, this.field_l, (byte) 51, this.field_s, param2, param1);
              if (param0 >= 53) {
                break L1;
              } else {
                this.a((byte) -19);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jc.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected jc() {
    }

    jc(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_t = param9;
            this.field_i = param2;
            this.field_r = param3;
            this.field_g = param0;
            this.field_m = param10;
            this.field_p = param1;
            this.field_q = param4;
            this.field_e = param12 ? true : false;
            this.field_l = param6;
            this.field_s = param5;
            this.field_d = param11;
            this.field_h = param7;
            this.field_c = param8;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_n = "This password contains repeated characters, and would be easy to guess";
        field_f = new int[][]{new int[]{0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 5, 0, 1, 0, 3, 0, 2, 0, 1, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 2, 2, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 1, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 1, 5, 2, 0, 5, 5, 0, 3, 0, 5, 7, 5, 0, 1, 0, 6, 6, 0, 3, 0, 4, 0, 6, 0, 6, 0, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 8}, new int[]{0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 5, 0, 1, 0, 3, 0, 2, 0, 1, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 2, 2, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 1, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 1, 5, 2, 0, 5, 5, 0, 3, 0, 5, 7, 5, 0, 1, 0, 6, 6, 0, 3, 0, 4, 0, 6, 0, 6, 0, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 8}, new int[]{0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 5, 0, 1, 0, 3, 0, 2, 0, 1, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 2, 2, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 1, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 1, 5, 2, 0, 5, 5, 0, 3, 0, 5, 7, 5, 0, 1, 0, 6, 6, 0, 3, 0, 4, 0, 6, 0, 6, 0, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 8}, new int[]{0, 0, 1, 4, 2, 6, 3, 7, 4, 6, 0, 0, 5, 7, 1, 6, 3, 6, 2, 4, 1, 1, 0, 2, 4, 4, 6, 5, 6, 3, 7, 2, 2, 0, 1, 6, 2, 7, 4, 6, 5, 4, 3, 3, 0, 7, 6, 1, 6, 2, 4, 3, 7, 4, 4, 0, 6, 7, 7, 6, 1, 5, 2, 4, 5, 5, 0, 3, 1, 5, 7, 5, 6, 1, 7, 6, 6, 0, 3, 4, 4, 7, 6, 6, 6, 6, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 6, 4, 8}, new int[]{10, 0, 1, 10, 0, 3, 0, 4, 10, 0, 0, 0, 5, 0, 10, 0, 3, 6, 2, 4, 10, 10, 0, 9, 0, 4, 0, 10, 0, 3, 0, 9, 9, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 10, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 10, 5, 2, 0, 5, 5, 0, 3, 0, 5, 9, 5, 0, 10, 0, 6, 6, 0, 3, 0, 4, 10, 6, 0, 6, 10, 7, 9, 0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 8}, new int[]{0, 0, 10, 4, 2, 6, 3, 7, 4, 6, 0, 0, 5, 7, 1, 6, 3, 6, 2, 1, 10, 10, 0, 9, 4, 4, 6, 5, 6, 3, 7, 9, 9, 0, 1, 6, 2, 7, 4, 6, 5, 4, 1, 1, 0, 7, 6, 1, 6, 2, 4, 3, 7, 4, 4, 0, 6, 7, 7, 6, 1, 5, 2, 4, 5, 5, 0, 3, 10, 5, 7, 5, 10, 1, 7, 10, 10, 0, 3, 4, 9, 7, 6, 6, 6, 6, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 10, 9, 8}};
        field_o = 0L;
        field_k = new hj(270, 70);
        field_a = new df("");
        field_j = false;
    }
}
