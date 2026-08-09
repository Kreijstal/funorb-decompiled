/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends gb {
    private int field_o;
    static volatile boolean field_p;
    private r field_n;

    final int l(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 27310) {
              fieldTemp$1 = this.field_m;
              this.field_m = this.field_m + 1;
              stackIn_4_0 = this.field_l[fieldTemp$1] + -this.field_n.a((byte) 7) & 255;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -26;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "jd.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, uh param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
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
                    var19 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = wi.b(84, 3 * (param0 - param4));
                        var6 = param4 * 3;
                        var7 = -10 + var5_int;
                        we.a(100);
                        if (0 >= param3.field_j) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3.field_k == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ja.a(0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        cf.field_c = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param3.field_F ^ -1) >= (var8 ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param3.field_K[var8];
                        var10 = param3.field_o[var8];
                        var11 = param3.field_w[var8];
                        stackOut_9_0 = param2;
                        stackIn_45_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = qb.field_ab[var9];
                        var13 = a.field_d[var9];
                        var14 = -var12 + qb.field_ab[var10];
                        var15 = -var12 + qb.field_ab[var11];
                        var16 = a.field_d[var10] + -var13;
                        var17 = a.field_d[var11] - var13;
                        if ((-(var15 * var16) + var17 * var14 ^ -1) > -1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var19 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = hl.field_a[var9];
                        if (var12 == -2147483648) {
                            statePc = 43;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = hl.field_a[var10];
                        if (-2147483648 == var13) {
                            statePc = 43;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = hl.field_a[var11];
                        if ((var14 ^ -1) == 2147483647) {
                            statePc = 43;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = -var6 + (var13 + var12) - -var14;
                        stackIn_24_0 = fb.field_b.length + -1;
                        stackIn_22_0 = stackIn_24_0;
                        if (var7 < 0) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_25_0 = stackIn_22_0;
                        stackIn_25_1 = var15 >> var7;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = stackIn_24_0;
                        stackIn_25_1 = var15 << -var7;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var16 = stackIn_25_0 - stackIn_25_1;
                        var17 = fb.field_b[var16];
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if ((var17 >> -1410226364 ^ -1) == -1) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var16--;
                        stackIn_36_0 = -1;
                        stackIn_28_0 = stackIn_36_0;
                        stackIn_36_1 = var16 ^ -1;
                        stackIn_28_1 = stackIn_36_1;
                        if (var19 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (stackIn_28_0 >= stackIn_28_1) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 43;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var17 = fb.field_b[var16];
                        if (var19 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = var16 << -518854876;
                        stackIn_36_1 = var17;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var18 = stackIn_36_0 + stackIn_36_1;
                        he.field_a[var18] = var8;
                        fb.field_b[var16] = 1 + var17;
                        if (-1 <= (param3.field_j ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param3.field_k) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        dupTemp$0 = param3.field_k[var8];
                        md.field_t[dupTemp$0] = md.field_t[dupTemp$0] + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        cf.field_c = cf.field_c + 1;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_45_0 = param3.field_j;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 <= 0) {
                            statePc = 55;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param3.field_k == null) {
                            statePc = 55;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var9 >= md.field_t.length) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var10 = md.field_t[var9];
                        md.field_t[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var19 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (!param1) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        jd.n(71);
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_62_0 = (RuntimeException) (var5);
                    stackIn_60_0 = stackIn_62_0;
                    stackIn_62_1 = new StringBuilder().append("jd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_60_1 = stackIn_62_1;
                    if (param3 == null) {
                        statePc = 62;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_60_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_63_2 = "{...}";
                    statePc = 63;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
                    stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
                    stackIn_63_2 = "null";
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    throw fc.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param4 + ')');
                }
                case 64: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, long param1, java.applet.Applet param2, int param3, String param4) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_21_1 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            String var6 = null;
            Throwable var6_ref = null;
            RuntimeException var6_ref2 = null;
            String var7 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var6 = param2.getParameter("cookiehost");
                      if (param3 == 1000) {
                        break L2;
                      } else {
                        field_p = false;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var7 = param0 + "=" + param4 + "; version=1; path=/; domain=" + var6;
                        if (-1L < (param1 ^ -1L)) {
                          break L4;
                        } else {
                          var7 = var7 + "; Expires=" + hc.a(1000L * param1 + je.a(1), -31289) + "; Max-Age=" + param1;
                          if (!SolKnight.field_L) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var7 = var7 + "; Discard;";
                      break L3;
                    }
                    fd.a(param3 + -921, param2, "document.cookie=\"" + var7 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var6_ref = decompiledCaughtException;
                    break L5;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var6_ref2);

                stackIn_13_1 = new StringBuilder().append("jd.J(");

                if (param0 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L6;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              L8: {


                stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_22_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jd(int param0) {
        super(param0);
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_n = new r(param1);
              if (param0 == -1) {
                break L1;
              } else {
                this.m(0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("jd.I(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 45) {
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
                        this.field_n = (r) null;
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
                        var5_int = 0;
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
                        if (param1 <= var5_int) {
                            statePc = 16;
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
                        fieldTemp$1 = this.field_m;
                        this.field_m = this.field_m + 1;
                        param3[var5_int - -param2] = (byte)(this.field_l[fieldTemp$1] + -this.field_n.a((byte) -78));
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 16;
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
                        if (var6 == 0) {
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var5);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("jd.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_12_1 = stackIn_14_1;
                    if (param3 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(byte param0) {
        try {
            this.field_o = 8 * this.field_m;
            if (param0 >= -78) {
                this.m(55);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jd.G(" + param0 + ')');
        }
    }

    final void m(int param0) {
        try {
            this.field_m = (this.field_o + 7) / 8;
            if (param0 != 0) {
                this.l(69);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jd.D(" + param0 + ')');
        }
    }

    final int d(byte param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_o >> -781734205;
                        var4 = 8 + -(this.field_o & 7);
                        if (param0 == 48) {
                            statePc = 4;
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
                        this.d((byte) 5);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = 0;
                        this.field_o = this.field_o + param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4 ^ -1) <= (param1 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$1 = var3_int;
                        var3_int++;
                        var5 = var5 + ((sd.field_j[var4] & this.field_l[incrementValue$1]) << param1 - var4);
                        param1 = param1 - var4;
                        var4 = 8;
                        if (var6 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
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
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 != param1) {
                            statePc = 12;
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
                        var5 = var5 + (this.field_l[var3_int] & sd.field_j[var4]);
                        if (var6 == 0) {
                            statePc = 13;
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
                        var5 = var5 + (this.field_l[var3_int] >> var4 + -param1 & sd.field_j[param1]);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = var5;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var3), "jd.A(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void n(int param0) {
        try {
            int var1_int = 32 % ((param0 - 41) / 53);
            k.a((byte) -35);
            k.field_b = true;
            ta.field_b = true;
            u.field_b.j(1);
            nf.a(false, kh.field_b, -96);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jd.E(" + param0 + ')');
        }
    }

    final void e(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2147483648) {
                break L1;
              } else {
                jd.a((String) null, 29L, (java.applet.Applet) null, -35, (String) null);
                break L1;
              }
            }
            fieldTemp$1 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_l[fieldTemp$1] = (byte)(this.field_n.a((byte) 103) + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "jd.C(" + param0 + ',' + param1 + ')');
        }
    }

    jd(byte[] param0) {
        super(param0);
    }

    static {
        field_p = false;
    }
}
