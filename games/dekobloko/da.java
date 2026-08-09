/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static byte[] field_a;
    static i field_b;
    static cc field_c;
    static boolean[] field_d;
    static tf field_e;

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jc var7 = null;
        int var8 = 0;
        jc stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        jc stackIn_11_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = hm.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -256) {
                var3 = ji.a('.', (byte) 66, param0);
                if (2 > var3.length) {
                  stackIn_11_0 = hm.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var4.length <= var5) {
                          break L3;
                        } else {
                          var6 = var4[var5];
                          var7 = ga.a(param1 ^ -4549, var6);
                          stackIn_23_0 = (jc) (var7);

                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (stackIn_23_0 != null) {
                              stackIn_18_0 = (jc) (var7);
                              decompiledRegionSelector0 = 4;
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
                      L4: {
                        if (param1 == -2734) {
                          break L4;
                        } else {
                          da.a((byte) 4);
                          break L4;
                        }
                      }
                      stackIn_23_0 = oe.a((byte) 86, var3[var3.length + -1]);
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = ga.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("da.F(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -121) {
            field_d = (boolean[]) null;
        }
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        fl.a(130, 256, 16694016, kc.field_s, 82 - -param0, w.field_kb);
        var2 = 145;
        fb.field_c[0][0].c(82 + param0, var2, 18, 18);
        var2 = var2 + (ga.a(188, 0, var2, cc.field_d, 16, 64, 16777215, se.field_S, (byte) -124, 0, 110 + param0) * 16 + 16);
        fb.field_c[1][3].c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(188, 0, var2, dn.field_q, 16, 64, 16777215, se.field_S, (byte) -125, 0, 110 - -param0) * 16));
        ri.a(var2, kk.field_n, gi.field_c, -115, 190 + param0, nf.field_e, 0);
        hk.g(309 + param0, 117, 242, 263172);
        var2 = 116;
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(var2 - -14, 256, 16694016, ug.field_n, 322 + param0, w.field_kb);
        var2 += 29;
        fl.a(13 + var2, 256, 16777215, vk.field_b[0], param0 + 322, se.field_S);
        ph.field_yb[0].c(param0 + 480, var2 - -1);
        var2 += 18;
        fl.a(13 + var2, 256, 16777215, vk.field_b[1], 322 - -param0, se.field_S);
        ph.field_yb[1].c(param0 + 480, var2 - -1);
        var2 += 34;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[2], param0 + 322, se.field_S);
        ph.field_yb[3].c(480 - -param0, var2 + 1);
        var2 += 18;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[3], param0 + 322, se.field_S);
        ph.field_yb[4].c(param0 + 480, var2 - -1);
        ed.a(16777215, 506 - -param0, vk.field_b[4], var2 + 13, (byte) 75, se.field_S);
        ph.field_yb[2].c(516 + param0, var2 - -1);
        var2 += 34;
        fl.a(var2 + 13, 256, 16777215, vk.field_b[5], 322 + param0, se.field_S);
        if (!param1) {
          return;
        } else {
          ph.field_yb[5].c(param0 + 480, var2 + 1);
          var2 += 34;
          fl.a(14 + var2, 256, 16694016, kc.field_q, param0 + 322, w.field_kb);
          var2 += 29;
          fl.a(13 + var2, 256, 16777215, vk.field_b[6], 322 - -param0, se.field_S);
          ph.field_yb[6].c(480 + param0, 1 + var2);
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 != -109) {
                da.a((byte) -7);
            }
            db.a(-127, param1, param2, false);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "da.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int stackIn_5_0 = 0;
        int stackIn_97_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = -param5 + param0;
                        var7 = 0;
                        if (param2 == -8218) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        da.a(true, false);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var7 >= var6_int) {
                            statePc = 96;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = param3.charAt(param5 + var7);
                        stackIn_97_0 = 0;
                        stackIn_5_0 = stackIn_97_0;
                        if (var9 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 >= var8) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 < 128) {
                            statePc = 94;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 < 160) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var8 <= 255) {
                            statePc = 94;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 != 8364) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param4[param1 + var7] = (byte)-128;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 8218) {
                            statePc = 92;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 != 402) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        param4[param1 + var7] = (byte)-125;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (8222 == var8) {
                            statePc = 90;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var8 != 8230) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param4[param1 + var7] = (byte)-123;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var8 == 8224) {
                            statePc = 88;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var8 == 8225) {
                            statePc = 86;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (710 != var8) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        param4[param1 + var7] = (byte)-120;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (8240 == var8) {
                            statePc = 84;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var8 == 352) {
                            statePc = 82;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var8 != 8249) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        param4[var7 + param1] = (byte)-117;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var8 == 338) {
                            statePc = 80;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (381 != var8) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param4[param1 + var7] = (byte)-114;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var8 == 8216) {
                            statePc = 78;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var8 == 8217) {
                            statePc = 76;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var8 != 8220) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param4[var7 + param1] = (byte)-109;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var8 != 8221) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        param4[var7 + param1] = (byte)-108;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var8 == 8226) {
                            statePc = 74;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var8 != 8211) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        param4[param1 + var7] = (byte)-106;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var8 != 8212) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param4[var7 + param1] = (byte)-105;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var8 != 732) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        param4[var7 + param1] = (byte)-104;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var8 == 8482) {
                            statePc = 72;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (353 == var8) {
                            statePc = 70;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var8 != 8250) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param4[var7 + param1] = (byte)-101;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var8 != 339) {
                            statePc = 62;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        param4[var7 + param1] = (byte)-100;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var8 == 382) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (376 == var8) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        param4[var7 + param1] = (byte)63;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param4[var7 + param1] = (byte)-97;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        param4[param1 + var7] = (byte)-98;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param4[param1 - -var7] = (byte)-102;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param4[param1 - -var7] = (byte)-103;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        param4[param1 + var7] = (byte)-107;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        param4[var7 + param1] = (byte)-110;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        param4[var7 + param1] = (byte)-111;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        param4[var7 + param1] = (byte)-116;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        param4[param1 + var7] = (byte)-118;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        param4[param1 - -var7] = (byte)-119;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        param4[var7 + param1] = (byte)-121;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        param4[param1 - -var7] = (byte)-122;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        param4[param1 + var7] = (byte)-124;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        param4[param1 - -var7] = (byte)-126;
                        if (var9 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        param4[var7 + param1] = (byte)var8;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        stackIn_97_0 = var6_int;
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    return stackIn_97_0;
                }
                case 98: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_100_0 = (RuntimeException) (var6);
                    stackIn_99_0 = stackIn_100_0;
                    stackIn_100_1 = new StringBuilder().append("da.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_99_1 = stackIn_100_1;
                    if (param3 == null) {
                        statePc = 100;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackIn_101_0 = (RuntimeException) ((Object) stackIn_99_0);
                    stackIn_101_1 = (StringBuilder) ((Object) stackIn_99_1);
                    stackIn_101_2 = "{...}";
                    statePc = 101;
                    continue stateLoop;
                }
                case 100: {
                    stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
                    stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
                    stackIn_101_2 = "null";
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    stackIn_103_0 = (RuntimeException) ((Object) stackIn_101_0);
                    stackIn_102_0 = stackIn_103_0;
                    stackIn_103_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');
                    stackIn_102_1 = stackIn_103_1;
                    if (param4 == null) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackIn_104_0 = (RuntimeException) ((Object) stackIn_102_0);
                    stackIn_104_1 = (StringBuilder) ((Object) stackIn_102_1);
                    stackIn_104_2 = "{...}";
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = (RuntimeException) ((Object) stackIn_103_0);
                    stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
                    stackIn_104_2 = "null";
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    throw dh.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1) {
        he.a(param1, -95);
        if (param0) {
            return;
        }
        if (!(null == sl.field_g)) {
            qd.a(sl.field_g, -2);
        }
    }

    static {
        field_b = new i();
    }
}
