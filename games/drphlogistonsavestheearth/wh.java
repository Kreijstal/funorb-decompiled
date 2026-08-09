/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wh extends uh {
    static int[] field_x;
    static boolean[] field_v;
    static he[] field_u;
    int field_w;

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = nj.a(nb.a(73), 8);
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
          throw ie.a((Throwable) ((Object) var1), "wh.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                mf.field_u = null;
                oi.field_c = false;
                if (!sg.field_a) {
                  break L2;
                } else {
                  ol.field_a.c(false);
                  if (var2 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var1_int = rh.field_a;
                if ((var1_int ^ -1) >= -1) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (var1_int == 1) {
                        break L5;
                      } else {
                        mf.field_u = a.a(5044, hi.field_i, new String[]{Integer.toString(var1_int)});
                        if (var2 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    mf.field_u = sj.field_b;
                    break L4;
                  }
                  mf.field_u = dm.a(0, new CharSequence[]{(CharSequence) ((Object) mf.field_u), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) fm.field_b)});
                  break L3;
                }
              }
              ol.field_a.d(true);
              sd.a((byte) -124);
              break L1;
            }
            L6: {
              if (param0) {
                break L6;
              } else {
                field_x = (int[]) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "wh.H(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, byte param2, ja param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = oi.a((param4 + -param0) * 3, (byte) 1);
                        var6 = 3 * param0;
                        vg.d((byte) 103);
                        var7 = var5_int - 10;
                        if (0 >= param3.field_G) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param3.field_O) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ff.a((byte) -2);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        eg.field_i = 0;
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var8 ^ -1) <= (param3.field_m ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = param3.field_h[var8];
                        var10 = param3.field_a[var8];
                        var11 = param3.field_K[var8];
                        stackOut_10_0 = param1;
                        stackIn_53_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var19 != 0) {
                            statePc = 53;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
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
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = fa.field_j[var9];
                        var13 = gf.field_p[var9];
                        var14 = fa.field_j[var10] - var12;
                        var15 = fa.field_j[var11] + -var12;
                        var16 = -var13 + gf.field_p[var10];
                        var17 = gf.field_p[var11] - var13;
                        if (-1 >= (-(var16 * var15) + var14 * var17 ^ -1)) {
                            statePc = 51;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = aj.field_b[var9];
                        if (-2147483648 != var12) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = aj.field_b[var10];
                        if ((var13 ^ -1) != 2147483647) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var14 = aj.field_b[var11];
                        if (2147483647 != (var14 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var15 = var12 + (var13 - -var14 + -var6);
                        if (-1 >= (var7 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_32_0 = var15 << -var7;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_32_0 = var15 >> var7;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var16 = -stackIn_32_0 + (of.field_w.length + -1);
                        var17 = of.field_w[var16];
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var17 >> -1460360956 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var16--;
                        stackIn_43_0 = var16 ^ -1;
                        stackIn_35_0 = stackIn_43_0;
                        stackIn_43_1 = -1;
                        stackIn_35_1 = stackIn_43_1;
                        if (var19 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 <= stackIn_35_1) {
                            statePc = 41;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 51;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var17 = of.field_w[var16];
                        if (var19 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var16 << -1094679996;
                        stackIn_43_1 = -var17;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var18 = stackIn_43_0 - stackIn_43_1;
                        p.field_c[var18] = var8;
                        of.field_w[var16] = 1 + var17;
                        if (param3.field_G <= 0) {
                            statePc = 50;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param3.field_O != null) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        dupTemp$0 = param3.field_O[var8];
                        uh.field_h[dupTemp$0] = uh.field_h[dupTemp$0] + 1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        eg.field_i = eg.field_i + 1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_53_0 = param2;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 > 71) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        wh.b(true);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (-1 <= (param3.field_G ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (null == param3.field_O) {
                            statePc = 72;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if ((var9 ^ -1) <= (uh.field_h.length ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var10 = uh.field_h[var9];
                        uh.field_h[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var19 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (var5);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("wh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_68_1 = stackIn_70_1;
                    if (param3 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    throw ie.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ',' + param4 + ')');
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, String param1, byte param2, String[] param3) {
        int var5 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 >= 96) {
                break L1;
              } else {
                field_x = (int[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                fk.field_q = wg.field_u;
                if (255 == param0) {
                  break L3;
                } else {
                  L4: {
                    if (-101 < (param0 ^ -1)) {
                      break L4;
                    } else {
                      if ((param0 ^ -1) < -106) {
                        break L4;
                      } else {
                        jj.field_d = sa.a((byte) 3, param3);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  jj.field_d = kj.a(param0, 4, param1);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (13 <= rd.field_z) {
                  stackIn_23_0 = 0;
                  break L5;
                } else {
                  stackIn_23_0 = 1;
                  break L5;
                }
              }
              jj.field_d = b.a(stackIn_23_0 != 0, 77);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("wh.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), stackIn_33_2 + ')');
        }
    }

    abstract boolean a(byte param0);

    public static void c(byte param0) {
        try {
            field_v = null;
            field_u = null;
            field_x = null;
            if (param0 != -86) {
                field_x = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "wh.G(" + param0 + ')');
        }
    }

    abstract Object b(byte param0);

    wh(int param0) {
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "wh.<init>(" + param0 + ')');
        }
    }

    final static void a(int param0, vj param1, vj param2, vj param3, boolean param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ib.field_f = ug.a("", param0 ^ param0);
            ib.field_f.a(false, -87);
            kk.a(param0 + 168, param3, param1, param2);
            lc.c((byte) 109);
            lc.field_h = pj.field_D;
            fk.field_q = pj.field_D;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("wh.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    static {
        field_x = new int[]{100, 50, 75, 75, 110, 10000, 8, 200, 10, 40, 160, 20000, 100, 250, 300, 350, 400, 30000, 50000, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, 0, 0, 0, 0, 100, 300, 15, 75, 100, 25, 75, 125, 75, 150, 150, 25, 75, 25, 25, 25, 25, 25, 25, 50, 50, 25, 25, 25, 25, 25, 75, 75, 75, 10, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80, -80};
        field_v = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
