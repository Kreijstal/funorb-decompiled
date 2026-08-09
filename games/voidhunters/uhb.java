/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uhb extends rqa {
    static String field_o;

    final static void a(String param0, String param1, int param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (hwa.field_o != null) {
                hwa.field_o.l((byte) -106);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jt.field_o = new vla(param1, param0, false, true, true);
              s.field_o.b(jt.field_o, -124);
              if (param2 == 0) {
                break L2;
              } else {
                uhb.a((String) null, (String) null, 35);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("uhb.B(");

            if (param0 == null) {
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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(18, 62, param0[0].a(36));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("uhb.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                uhb.a(false, -65, (byte) -47, (wma) null, 29);
                break L1;
              }
            }
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "uhb.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                emb.field_p = emb.field_p - 1;
                if ((emb.field_p ^ -1) != -1) {
                  break L1;
                } else {
                  klb.field_o = null;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                oqa.field_o = oqa.field_o - 1;
                if (0 == oqa.field_o) {
                  mpb.field_h = null;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var3_int = 78 % ((param0 - 24) / 63);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "uhb.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static asb a(int param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        asb stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 38) {
                break L1;
              } else {
                uhb.e((byte) -38);
                break L1;
              }
            }
            stackIn_4_0 = mla.a(param3, param4, -120, false, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "uhb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, int param1, byte param2, wma param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        boolean stackOut_10_0;
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
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = VoidHunters.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = ieb.a((param4 + -param1) * 3, -128);
                        var6 = 3 * param1;
                        am.a(-19689);
                        var7 = var5_int + -10;
                        var8 = -120 % ((-38 - param2) / 49);
                        if (0 >= param3.field_z) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3.field_E != null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        bl.d(false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        pca.field_j = 0;
                        var9 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 >= param3.field_y) {
                            statePc = 45;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = param3.field_w[var9];
                        var11 = param3.field_N[var9];
                        var12 = param3.field_D[var9];
                        stackOut_10_0 = param0;
                        stackIn_46_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var20 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13 = cl.field_b[var10];
                        var14 = lr.field_o[var10];
                        var15 = cl.field_b[var11] + -var13;
                        var16 = cl.field_b[var12] - var13;
                        var17 = lr.field_o[var11] + -var14;
                        var18 = -var14 + lr.field_o[var12];
                        if ((-(var16 * var17) + var18 * var15 ^ -1) > -1) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var20 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = pja.field_n[var10];
                        if (var13 == -2147483648) {
                            statePc = 44;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = pja.field_n[var11];
                        if ((var14 ^ -1) == 2147483647) {
                            statePc = 44;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = pja.field_n[var12];
                        if (var15 == -2147483648) {
                            statePc = 44;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var16 = -var6 + (var14 + (var13 + var15));
                        stackIn_25_0 = -1 + bs.field_b.length;
                        stackIn_23_0 = stackIn_25_0;
                        if ((var7 ^ -1) > -1) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = stackIn_23_0;
                        stackIn_26_1 = var16 >> var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = stackIn_25_0;
                        stackIn_26_1 = var16 << -var7;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var17 = stackIn_26_0 - stackIn_26_1;
                        var18 = bs.field_b[var17];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var18 >> 1871915780 ^ -1) == -1) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var17--;
                        stackIn_37_0 = var17 ^ -1;
                        stackIn_29_0 = stackIn_37_0;
                        stackIn_37_1 = -1;
                        stackIn_29_1 = stackIn_37_1;
                        if (var20 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (stackIn_29_0 <= stackIn_29_1) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        System.err.println("Out of range!");
                        if (var20 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var18 = bs.field_b[var17];
                        if (var20 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var18;
                        stackIn_37_1 = var17 << 887964740;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var19 = stackIn_37_0 + stackIn_37_1;
                        aq.field_p[var19] = var9;
                        bs.field_b[var17] = 1 + var18;
                        if (0 >= param3.field_z) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (param3.field_E == null) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        dupTemp$0 = param3.field_E[var9];
                        rua.field_q[dupTemp$0] = rua.field_q[dupTemp$0] + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        pca.field_j = pca.field_j + 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var9++;
                        if (var20 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = param3.field_z;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (stackIn_46_0 <= 0) {
                            statePc = 62;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (param3.field_E == null) {
                            statePc = 62;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var9 = 0;
                        var10 = 0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((rua.field_q.length ^ -1) >= (var10 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var11 = rua.field_q[var10];
                        rua.field_q[var10] = var9;
                        var9 = var9 + var11;
                        var10++;
                        if (var20 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var20 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_60_0 = (RuntimeException) (var5);
                    stackIn_58_0 = stackIn_60_0;
                    stackIn_60_1 = new StringBuilder().append("uhb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_58_1 = stackIn_60_1;
                    if (param3 == null) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_61_2 = "{...}";
                    statePc = 61;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_61_2 = "null";
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    throw rta.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param4 + ')');
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    uhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Grapples";
    }
}
