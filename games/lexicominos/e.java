/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int[] field_a;
    static db field_u;
    static String field_g;
    static String[] field_p;
    private int[] field_l;
    int[] field_m;
    el field_b;
    int field_i;
    private byte[] field_v;
    static String field_h;
    int[][] field_n;
    int[] field_f;
    el[] field_c;
    static String field_e;
    private int field_k;
    int[] field_r;
    int field_s;
    int[] field_t;
    static int field_q;
    int field_d;
    byte[][] field_o;
    private int[][] field_j;

    public static void a(int param0) {
        if (param0 != 1) {
            field_q = 62;
        }
        field_g = null;
        field_p = null;
        field_e = null;
        field_h = null;
        field_u = null;
    }

    final static tf a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tf var7 = null;
        int var8 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_7_0 = null;
        tf stackIn_10_0 = null;
        tf stackIn_14_0 = null;
        tf stackIn_21_0 = null;
        tf stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = w.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -256) {
                if (param1 < -69) {
                  var3 = dc.a(param0, '.', (byte) -125);
                  if (2 > var3.length) {
                    stackIn_14_0 = w.field_k;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if ((var4.length ^ -1) >= (var5 ^ -1)) {
                            break L3;
                          } else {
                            var6 = var4[var5];
                            stackIn_24_0 = nc.a(63, var6);

                            if (var8 != 0) {
                              break L2;
                            } else {
                              var7 = stackIn_24_0;
                              if (var7 != null) {
                                stackIn_21_0 = (tf) (var7);
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                var5++;
                                if (var8 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        stackIn_24_0 = bg.a(var3[var3.length - 1], -21637);
                        break L2;
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_10_0 = (tf) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = vi.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0;
                } else {
                  return stackIn_21_0;
                }
              }
            }
          }
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_4_0 = th.field_u.a((byte) 127, param0, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("e.D(");

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
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        wf stackIn_4_0 = null;
        wf stackIn_5_0 = null;
        wf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_120_0 = 0;
        int[] stackIn_124_0 = null;
        int[] stackIn_134_0 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_143_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wf var17 = null;
        wf var18 = null;
        byte[] var22 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_m = (int[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var17 = new wf(qk.a(-121, param1));
                        var18 = var17;
                        stackIn_5_0 = (wf) (var18);
                        stackIn_4_0 = stackIn_5_0;
                        if (param0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = (wf) ((Object) stackIn_4_0);
                        stackIn_6_1 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = (wf) ((Object) stackIn_5_0);
                        stackIn_6_1 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = ((wf) (Object) stackIn_6_0).d(stackIn_6_1 != 0);
                        if (5 > var4) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var4 ^ -1) >= -8) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var4 ^ -1) > -7) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_s = var18.d((byte) 19);
                        if (var16 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_s = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5 = var18.d(true);
                        if ((var5 & 1) == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6 = stackIn_17_0;
                        if (0 == (2 & var5)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = stackIn_20_0;
                        if (var4 >= 7) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.field_k = var18.b(-1698573656);
                        if (var16 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        this.field_k = var18.a((byte) 50);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8 = 0;
                        var9 = -1;
                        this.field_f = new int[this.field_k];
                        if (-8 < (var4 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var10 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        dupTemp$0 = var8 + var17.a((byte) 50);
                        var8 = dupTemp$0;
                        this.field_f[var10] = dupTemp$0;
                        stackIn_44_0 = this.field_f[var10];
                        stackIn_28_0 = stackIn_44_0;
                        stackIn_44_1 = var9;
                        stackIn_28_1 = stackIn_44_1;
                        if (var16 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 <= stackIn_28_1) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = this.field_f[var10];
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var16 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        dupTemp$1 = var8 + var17.b(-1698573656);
                        var8 = dupTemp$1;
                        this.field_f[var10] = dupTemp$1;
                        stackIn_44_0 = this.field_f[var10];
                        stackIn_35_0 = stackIn_44_0;
                        stackIn_44_1 = var9;
                        stackIn_35_1 = stackIn_44_1;
                        if (var16 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= stackIn_35_1) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = this.field_f[var10];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        this.field_d = 1 + var9;
                        this.field_n = new int[this.field_d][];
                        this.field_t = new int[this.field_d];
                        if (var7 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        this.field_o = new byte[this.field_d][];
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        this.field_r = new int[this.field_d];
                        this.field_a = new int[this.field_d];
                        this.field_m = new int[this.field_d];
                        if (var6 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        this.field_l = new int[this.field_d];
                        var10 = 0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = this.field_d;
                        stackIn_44_1 = var10;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 <= stackIn_44_1) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        this.field_l[var10] = -1;
                        var10++;
                        if (var16 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var16 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        this.field_l[this.field_f[var10]] = var17.d((byte) 19);
                        var10++;
                        if (var16 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var16 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        this.field_b = new el(this.field_l);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        this.field_r[this.field_f[var10]] = var17.d((byte) 19);
                        var10++;
                        if (var16 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var16 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var7 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var10 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        this.field_t[this.field_f[var10]] = var17.d((byte) 19);
                        var10++;
                        if (var16 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var16 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var10 = 0;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var22 = new byte[64];
                        var18.a(110, 64, 0, var22);
                        this.field_o[this.field_f[var10]] = var22;
                        var10++;
                        if (var16 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var16 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var10 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 77;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_t[this.field_f[var10]] = var17.d((byte) 19);
                        var10++;
                        if (var16 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var16 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var4 >= 7) {
                            statePc = 99;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var10 = 0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (var10 >= this.field_k) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        this.field_m[this.field_f[var10]] = var17.b(-1698573656);
                        var10++;
                        if (var16 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var16 == 0) {
                            statePc = 79;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var10 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if ((this.field_k ^ -1) >= (var10 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var11 = this.field_f[var10];
                        var8 = 0;
                        var12 = this.field_m[var11];
                        var13 = -1;
                        array$2 = new int[var12];
                        this.field_n[var11] = array$2;
                        stackIn_120_0 = 0;
                        stackIn_87_0 = stackIn_120_0;
                        if (var16 != 0) {
                            statePc = 120;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var14 = stackIn_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var14 >= var12) {
                            statePc = 93;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        dupTemp$3 = var8 + var17.b(-1698573656);
                        var8 = dupTemp$3;
                        dupTemp$4 = this.field_n[var11];
                        dupTemp$4[var14] = dupTemp$3;
                        var15 = dupTemp$3;
                        stackIn_94_0 = var13 ^ -1;
                        stackIn_90_0 = stackIn_94_0;
                        stackIn_94_1 = var15 ^ -1;
                        stackIn_90_1 = stackIn_94_1;
                        if (var16 != 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 <= stackIn_90_1) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var13 = var15;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        this.field_a[var11] = var13 - -1;
                        stackIn_94_0 = var12 ^ -1;
                        stackIn_94_1 = var13 + 1 ^ -1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 == stackIn_94_1) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        this.field_n[var11] = null;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var16 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var10 = 0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (this.field_k <= var10) {
                            statePc = 104;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        this.field_m[this.field_f[var10]] = var17.a((byte) 50);
                        var10++;
                        if (var16 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var16 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var10 = 0;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (this.field_k <= var10) {
                            statePc = 119;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var11 = this.field_f[var10];
                        var8 = 0;
                        var12 = this.field_m[var11];
                        var13 = -1;
                        array$5 = new int[var12];
                        this.field_n[var11] = array$5;
                        stackIn_120_0 = 0;
                        stackIn_108_0 = stackIn_120_0;
                        if (var16 != 0) {
                            statePc = 120;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var14 = stackIn_108_0;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if ((var12 ^ -1) >= (var14 ^ -1)) {
                            statePc = 115;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        dupTemp$6 = var8 + var17.a((byte) 50);
                        var8 = dupTemp$6;
                        dupTemp$7 = this.field_n[var11];
                        dupTemp$7[var14] = dupTemp$6;
                        var15 = dupTemp$6;
                        stackIn_116_0 = var13;
                        stackIn_111_0 = stackIn_116_0;
                        stackIn_116_1 = var15;
                        stackIn_111_1 = stackIn_116_1;
                        if (var16 != 0) {
                            statePc = 116;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0 < stackIn_111_1) {
                            statePc = 113;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var13 = var15;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var14++;
                        if (var16 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        this.field_a[var11] = var13 + 1;
                        stackIn_116_0 = var12 ^ -1;
                        stackIn_116_1 = var13 + 1 ^ -1;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (stackIn_116_0 != stackIn_116_1) {
                            statePc = 118;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        this.field_n[var11] = null;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        var10++;
                        if (var16 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackIn_120_0 = var6;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (stackIn_120_0 == 0) {
                            statePc = 144;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        this.field_j = new int[1 + var9][];
                        this.field_c = new el[1 + var9];
                        var10 = 0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if ((var10 ^ -1) <= (this.field_k ^ -1)) {
                            statePc = 144;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var11 = this.field_f[var10];
                        stackIn_124_0 = this.field_m;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        var12 = stackIn_124_0[var11];
                        array$8 = new int[this.field_a[var11]];
                        this.field_j[var11] = array$8;
                        if (var16 != 0) {
                            statePc = 145;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var13 = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (this.field_a[var11] <= var13) {
                            statePc = 130;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        this.field_j[var11][var13] = -1;
                        var13++;
                        if (var16 != 0) {
                            statePc = 131;
                        } else {
                            statePc = 128;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (var16 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var13 = 0;
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (var13 >= var12) {
                            statePc = 138;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        stackIn_124_0 = this.field_n[var11];
                        stackIn_134_0 = stackIn_124_0;
                        if (var16 != 0) {
                            statePc = 124;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (stackIn_134_0 != null) {
                            statePc = 136;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var14 = var13;
                        if (var16 == 0) {
                            statePc = 137;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var14 = this.field_n[var11][var13];
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        this.field_j[var11][var14] = var17.d((byte) 19);
                        var13++;
                        if (var16 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        this.field_c[var11] = new el(this.field_j[var11]);
                        var10++;
                        if (var16 == 0) {
                            statePc = 122;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 140: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_142_0 = (RuntimeException) (var3);
                    stackIn_141_0 = stackIn_142_0;
                    stackIn_142_1 = new StringBuilder().append("e.B(").append(param0).append(',');
                    stackIn_141_1 = stackIn_142_1;
                    if (param1 == null) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackIn_143_0 = (RuntimeException) ((Object) stackIn_141_0);
                    stackIn_143_1 = (StringBuilder) ((Object) stackIn_141_1);
                    stackIn_143_2 = "{...}";
                    statePc = 143;
                    continue stateLoop;
                }
                case 142: {
                    stackIn_143_0 = (RuntimeException) ((Object) stackIn_142_0);
                    stackIn_143_1 = (StringBuilder) ((Object) stackIn_142_1);
                    stackIn_143_2 = "null";
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    throw ld.a((Throwable) ((Object) stackIn_143_0), stackIn_143_2 + ')');
                }
                case 144: {
                    return;
                }
                case 145: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    e(byte[] param0, int param1, byte[] param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            this.field_i = oe.a(101, param0, param0.length);
            if ((param1 ^ -1) == (this.field_i ^ -1)) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (64 == param2.length) {
                      this.field_v = si.a(0, param0, -110, param0.length);
                      var4_int = 0;
                      L3: while (true) {
                        if (-65 >= (var4_int ^ -1)) {
                          break L2;
                        } else {
                          stackIn_13_0 = this;

                          if (var5 != 0) {
                            break L1;
                          } else {
                            if (((e) (this)).field_v[var4_int] == param2[var4_int]) {
                              var4_int++;
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L2;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                stackIn_13_0 = this;
                break L1;
              }
              this.a(false, param0);
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (runtimeException);

            stackIn_17_1 = new StringBuilder().append("e.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_p = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = "Waiting for sound effects";
        field_e = "Return to game";
        field_q = 4;
    }
}
