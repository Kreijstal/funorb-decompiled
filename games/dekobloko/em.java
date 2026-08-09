/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    private la field_c;
    static String field_b;
    private ji field_a;
    private ji field_d;

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 82) {
                break L1;
              } else {
                em.a((byte) 15);
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "em.F(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 < -107) {
              L1: {
                if (jj.field_f.a(80)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "em.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              ah.field_c.c(true);
              if (pk.field_v == null) {
                pk.field_v = new qn(ah.field_c, ed.field_d);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -1199770620) {
                break L2;
              } else {
                field_b = (String) null;
                break L2;
              }
            }
            ah.field_c.a((byte) -119, pk.field_v);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "em.G(" + param0 + ')');
        }
    }

    final ac a(int param0, int param1) {
        ac var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        ac stackIn_2_0 = null;
        ac stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (ac) (this.field_c.a((long)param1, (byte) -30));
            if (null == var3) {
              L1: {
                L2: {
                  var5 = 57 / ((param0 - -79) / 38);
                  if ((param1 ^ -1) <= -32769) {
                    break L2;
                  } else {
                    var4 = this.field_d.a(param1, 63, 0);
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = this.field_a.a(32767 & param1, 49, 0);
                break L1;
              }
              L3: {
                var3 = new ac();
                if (var4 == null) {
                  break L3;
                } else {
                  var3.a((byte) -4, new wl(var4));
                  break L3;
                }
              }
              L4: {
                if (-32769 < (param1 ^ -1)) {
                  break L4;
                } else {
                  var3.c(-1);
                  break L4;
                }
              }
              this.field_c.a(var3, (long)param1, 69);
              stackIn_13_0 = (ac) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ac) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3_ref), "em.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(vg param0, boolean param1, int param2, byte param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        boolean stackOut_9_0;
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
                    var19 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = s.b((byte) 127, (-param4 + param2) * 3);
                        var6 = param4 * 3;
                        var7 = var5_int + -10;
                        rd.c(0);
                        if (0 >= param0.field_B) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param0.field_Q) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ci.a((byte) 127);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ta.field_d = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param0.field_L ^ -1) >= (var8 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param0.field_M[var8];
                        var10 = param0.field_c[var8];
                        var11 = param0.field_A[var8];
                        stackOut_9_0 = param1;
                        stackIn_49_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = kl.field_n[var9];
                        var13 = rn.field_b[var9];
                        var14 = -var12 + kl.field_n[var10];
                        var15 = kl.field_n[var11] - var12;
                        var16 = -var13 + rn.field_b[var10];
                        var17 = rn.field_b[var11] - var13;
                        if (var17 * var14 - var15 * var16 < 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = vg.field_G[var9];
                        if (2147483647 != (var12 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13 = vg.field_G[var10];
                        if (var13 != -2147483648) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var14 = vg.field_G[var11];
                        if ((var14 ^ -1) == 2147483647) {
                            statePc = 47;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var15 = var14 + (var13 + var12) + -var6;
                        if (0 > var7) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = var15 >> var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = var15 << -var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16 = -stackIn_30_0 + a.field_r.length + -1;
                        var17 = a.field_r[var16];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (-1 == (var17 >> -1153113212 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var16--;
                        stackIn_40_0 = var16 ^ -1;
                        stackIn_33_0 = stackIn_40_0;
                        stackIn_40_1 = -1;
                        stackIn_33_1 = stackIn_40_1;
                        if (var19 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 > stackIn_33_1) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var17 = a.field_r[var16];
                        if (var19 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = var17;
                        stackIn_40_1 = var16 << -1199770620;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18 = stackIn_40_0 + stackIn_40_1;
                        hb.field_Vb[var18] = var8;
                        a.field_r[var16] = var17 + 1;
                        if (-1 <= (param0.field_B ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param0.field_Q == null) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        dupTemp$0 = param0.field_Q[var8];
                        nm.field_Nb[dupTemp$0] = nm.field_Nb[dupTemp$0] + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ta.field_d = ta.field_d + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 <= (param0.field_B ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null != param0.field_Q) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if ((nm.field_Nb.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = nm.field_Nb[var9];
                        nm.field_Nb[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (param3 >= 44) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        field_b = (String) null;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_68_0 = (RuntimeException) (var5);
                    stackIn_66_0 = stackIn_68_0;
                    stackIn_68_1 = new StringBuilder().append("em.A(");
                    stackIn_66_1 = stackIn_68_1;
                    if (param0 == null) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_69_2 = "{...}";
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_69_2 = "null";
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    throw dh.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 90) {
                break L1;
              } else {
                em.a(107, 61, (byte) -72);
                break L1;
              }
            }
            var3_int = sk.a(param1, -104);
            var4 = ue.a(param1, 92);
            var5 = sk.a(param0, -122);
            var6 = ue.a(param0, -63);
            var7 = (int)((long)var5 * (long)var3_int >> -70246256);
            var8 = (int)((long)var6 * (long)var3_int >> 1547803216);
            var9 = (int)((long)var5 * (long)var4 >> 1673413456);
            var10 = (int)((long)var6 * (long)var4 >> 1909378640);
            stackIn_4_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "em.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, ji param1) {
        RuntimeException runtimeException = null;
        ck var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new ck(param1.a(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) jh.field_b));
              var3 = var2.field_I;
              var4 = var2.field_H;
              uh.a(-9074);
              re.field_r = new ck(var3, 3 * var4 / 4);
              re.field_r.a();
              var2.e(0, 0);
              qj.field_d = new ck(var3, -re.field_r.field_H + var4);
              qj.field_d.a();
              var2.e(0, -re.field_r.field_H);
              if (param0 == -113) {
                break L1;
              } else {
                em.a(16, 35, (byte) 0);
                break L1;
              }
            }
            qj.field_d.field_z = re.field_r.field_H;
            mk.a((byte) -5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("em.D(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    em(int param0, ji param1, ji param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new la(64);
        try {
          L0: {
            L1: {
              this.field_a = param2;
              this.field_d = param1;
              if (null != this.field_d) {
                this.field_d.b(-5228, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_a != null) {
                this.field_a.b(-5228, 0);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("em.<init>(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_b = "<%0> has withdrawn the request to join.";
    }
}
