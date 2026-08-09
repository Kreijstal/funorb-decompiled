/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    private int field_c;
    static double[] field_e;
    private int field_b;
    float field_l;
    private rp[] field_f;
    static String field_m;
    String field_h;
    private int field_k;
    static la field_a;
    static t[] field_i;
    static String field_g;
    static int field_d;
    static int[][] field_j;

    final static up a(String param0, int param1) {
        RuntimeException var2 = null;
        up stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!qk.field_q.c(param1 + 484)) {
                break L1;
              } else {
                if (param0.equals(qk.field_q.a((byte) -127))) {
                  break L1;
                } else {
                  qk.field_q = ci.a(param1 ^ -120, param0);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                vf.a(-21);
                break L2;
              }
            }
            stackIn_10_0 = qk.field_q;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("vf.A(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        field_g = null;
        field_i = null;
        if (param0 < 26) {
            return;
        }
        try {
            field_j = (int[][]) null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "vf.F(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0;
        rp var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_k ^ -1) <= (this.field_c ^ -1)) {
                    break L3;
                  } else {
                    var2 = this.field_f[this.field_k];
                    stackOut_2_0 = var2.field_a.a(-12749);
                    stackIn_38_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (stackIn_3_0) {
                        L4: {
                          if ((var2.field_g ^ -1) > -1) {
                            break L4;
                          } else {
                            if (!var2.field_a.a((byte) 101, var2.field_g)) {
                              this.a(var2, var2.field_a.a(true, var2.field_g), -20);
                              stackIn_15_0 = 0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (var2.field_c == null) {
                            break L5;
                          } else {
                            if (var2.field_a.a(true, var2.field_c)) {
                              break L5;
                            } else {
                              this.a(var2, var2.field_a.a((byte) 97, var2.field_c), -93);
                              stackIn_21_0 = 0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                        L6: {
                          if (0 <= var2.field_g) {
                            break L6;
                          } else {
                            if (null != var2.field_c) {
                              break L6;
                            } else {
                              if (var2.field_f == null) {
                                break L6;
                              } else {
                                if (!var2.field_a.c(param0 + -19375)) {
                                  this.a(var2, var2.field_a.a((byte) -32), -100);
                                  stackIn_35_0 = 0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        this.field_k = this.field_k + 1;
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        this.a(var2, 0, param0 + -28);
                        stackIn_7_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_38_0 = param0;
                break L2;
              }
              L7: {
                if (stackIn_38_0 == 0) {
                  break L7;
                } else {
                  this.b(-7);
                  break L7;
                }
              }
              stackIn_42_0 = 1;
              decompiledRegionSelector0 = 4;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "vf.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_35_0 != 0;
              } else {
                return stackIn_42_0 != 0;
              }
            }
          }
        }
    }

    final static void a(of param0, int param1, int param2, boolean param3, byte param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_56_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        boolean stackOut_12_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ke.a(3 * (param2 - param1), (byte) -121);
                        var6 = param1 * 3;
                        var7 = -10 + var5_int;
                        wi.a(0);
                        if (-1 <= (param0.field_M ^ -1)) {
                            statePc = 8;
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
                        if (null != param0.field_i) {
                            statePc = 7;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        io.b((byte) 78);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ui.field_k = 0;
                        var8 = 0;
                        if (param4 > 110) {
                            statePc = 11;
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
                        field_j = (int[][]) null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((param0.field_R ^ -1) >= (var8 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param0.field_G[var8];
                        var10 = param0.field_r[var8];
                        var11 = param0.field_I[var8];
                        stackOut_12_0 = param3;
                        stackIn_56_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 56;
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
                        if (!stackIn_13_0) {
                            statePc = 20;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = kh.field_m[var9];
                        var13 = u.field_w[var9];
                        var14 = -var12 + kh.field_m[var10];
                        var15 = -var12 + kh.field_m[var11];
                        var16 = u.field_w[var10] + -var13;
                        var17 = -var13 + u.field_w[var11];
                        if (var17 * var14 - var16 * var15 < 0) {
                            statePc = 20;
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
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = hl.field_b[var9];
                        if (var12 != -2147483648) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var19 == 0) {
                            statePc = 54;
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
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var13 = hl.field_b[var10];
                        if (2147483647 != (var13 ^ -1)) {
                            statePc = 28;
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
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var14 = hl.field_b[var11];
                        if ((var14 ^ -1) != 2147483647) {
                            statePc = 32;
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
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var15 = var14 + var12 - (-var13 + var6);
                        if (-1 < (var7 ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_36_0 = var15 >> var7;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var15 << -var7;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var16 = -stackIn_36_0 + -1 + u.field_v.length;
                        var17 = u.field_v[var16];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var17 >> 1323046340 ^ -1) == -1) {
                            statePc = 46;
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
                        var16--;
                        stackIn_47_0 = -1;
                        stackIn_39_0 = stackIn_47_0;
                        stackIn_47_1 = var16 ^ -1;
                        stackIn_39_1 = stackIn_47_1;
                        if (var19 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (stackIn_39_0 >= stackIn_39_1) {
                            statePc = 45;
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
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 54;
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
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var17 = u.field_v[var16];
                        if (var19 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = var16 << -151484860;
                        stackIn_47_1 = -var17;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var18 = stackIn_47_0 - stackIn_47_1;
                        mn.field_bb[var18] = var8;
                        u.field_v[var16] = 1 + var17;
                        if (-1 <= (param0.field_M ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (param0.field_i == null) {
                            statePc = 53;
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
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        dupTemp$0 = param0.field_i[var8];
                        a.field_f[dupTemp$0] = a.field_f[dupTemp$0] + 1;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ui.field_k = ui.field_k + 1;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 >= param0.field_M) {
                            statePc = 74;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (param0.field_i != null) {
                            statePc = 62;
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
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var8 = 0;
                        var9 = 0;
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
                        if (a.field_f.length <= var9) {
                            statePc = 74;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var10 = a.field_f[var9];
                        a.field_f[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var19 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_72_0 = (RuntimeException) (var5);
                    stackIn_70_0 = stackIn_72_0;
                    stackIn_72_1 = new StringBuilder().append("vf.C(");
                    stackIn_70_1 = stackIn_72_1;
                    if (param0 == null) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_73_2 = "{...}";
                    statePc = 73;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_73_2 = "null";
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    throw rb.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 74: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(rp param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        float var4_float = 0.0f;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_float = (float)param1 / 100.0f + (float)(this.field_k + 1);
              this.field_l = var4_float * (float)this.field_b / (float)(this.field_c - -1);
              if (param2 < -18) {
                break L1;
              } else {
                vf.a((of) null, 80, -3, false, (byte) 99);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 != 0) {
                  break L3;
                } else {
                  this.field_h = param0.field_e;
                  if (Torquing.field_u == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.field_h = param0.field_f + " - " + param1 + "%";
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("vf.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private vf() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "vf.<init>()");
        }
    }

    final static boolean a(ki param0, String param1, int param2, boolean param3, int param4, String param5, String param6) {
        nm var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (tp.field_h == bh.field_a) {
              if (param4 == 7013) {
                L1: {
                  L2: {
                    var7 = new nm(dc.field_a, param0);
                    dc.field_a.a(var7, (byte) 91);
                    if (!mc.b(120)) {
                      break L2;
                    } else {
                      var7.o(11);
                      if (Torquing.field_u == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  bh.field_a = mg.field_b;
                  bn.field_i = param3;
                  rf.field_u = param6;
                  ol.field_a = param5;
                  oh.field_d = param2;
                  on.field_d = param1;
                  ua.field_b = null;
                  break L1;
                }
                stackIn_13_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7_ref);

            stackIn_17_1 = new StringBuilder().append("vf.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    static {
        field_e = new double[9];
        field_m = "Congratulations! You've completed the free game!";
        field_g = "Waiting for models";
        field_j = new int[][]{new int[]{-63, 4, -1147}, new int[]{120, 79, -994}};
    }
}
