/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vm {
    in field_f;
    static sna field_i;
    static String field_g;
    in field_a;
    in field_c;
    in field_l;
    long field_b;
    lu field_n;
    int field_j;
    lu field_d;
    volatile int field_k;
    volatile int field_e;
    byte field_m;
    qfa field_h;

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              var3 = new char[var2_int];
              if (param1 >= 102) {
                break L1;
              } else {
                vm.a(false, -62, 51, (ma) null, true);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= var2_int) {
                  break L3;
                } else {
                  var3[-1 + var2_int - var4] = param0.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_8_0 = new String(var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("vm.J(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    abstract void b(byte param0);

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_e = 112;
                break L1;
              }
            }
            stackIn_4_0 = this.field_f.b(true) - -this.field_a.b(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final qfa a(int param0, int param1, int param2, byte param3, boolean param4) {
        long var6_long = 0L;
        RuntimeException var6 = null;
        qfa var8 = null;
        qfa stackIn_2_0 = null;
        qfa stackIn_19_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 > 120) {
              L1: {
                L2: {
                  var6_long = ((long)param0 << -783768288) + (long)param1;
                  var8 = new qfa();
                  var8.field_q = param4;
                  var8.field_h = var6_long;
                  var8.field_s = param3;
                  if (param4) {
                    break L2;
                  } else {
                    if (-21 >= (this.a(-117) ^ -1)) {
                      throw new RuntimeException();
                    } else {
                      this.field_c.a(var8, (byte) 110);
                      if (BachelorFridge.field_y == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                if (this.d((byte) 0) >= 20) {
                  throw new RuntimeException();
                } else {
                  this.field_f.a(var8, (byte) -120);
                  break L1;
                }
              }
              stackIn_19_0 = (qfa) (var8);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (qfa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "vm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static void a(boolean param0, int param1, int param2, ma param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
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
                    var19 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var5_int = mda.a((-param1 + param2) * 3, 16);
                        var6 = param1 * 3;
                        var7 = var5_int + -10;
                        qh.c((byte) 89);
                        if (param3.field_n <= 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3.field_d != null) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ej.a(-11163);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        lq.field_y = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param3.field_K <= var8) {
                            statePc = 50;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param3.field_C[var8];
                        var10 = param3.field_h[var8];
                        var11 = param3.field_t[var8];
                        stackOut_12_0 = param4;
                        stackIn_51_0 = stackOut_12_0 ? 1 : 0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var19 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!stackIn_13_0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = du.field_e[var9];
                        var13 = ew.field_s[var9];
                        var14 = -var12 + du.field_e[var10];
                        var15 = -var12 + du.field_e[var11];
                        var16 = -var13 + ew.field_s[var10];
                        var17 = -var13 + ew.field_s[var11];
                        if ((-(var15 * var16) + var14 * var17 ^ -1) <= -1) {
                            statePc = 49;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = dl.field_i[var9];
                        if (-2147483648 == var12) {
                            statePc = 49;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 = dl.field_i[var10];
                        if ((var13 ^ -1) != 2147483647) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var14 = dl.field_i[var11];
                        if (var14 != -2147483648) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var15 = var12 - (-var13 + (-var14 + var6));
                        stackIn_29_0 = -1 + wa.field_m.length;
                        stackIn_27_0 = stackIn_29_0;
                        if (var7 >= 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = stackIn_27_0;
                        stackIn_30_1 = var15 << -var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = stackIn_29_0;
                        stackIn_30_1 = var15 >> var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16 = stackIn_30_0 + -stackIn_30_1;
                        var17 = wa.field_m[var16];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var17 >> -1634765532 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var16--;
                        stackIn_41_0 = var16;
                        stackIn_33_0 = stackIn_41_0;
                        if (var19 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 >= 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var17 = wa.field_m[var16];
                        if (var19 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = var17 + (var16 << 1225949892);
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var18 = stackIn_41_0;
                        ci.field_q[var18] = var8;
                        wa.field_m[var16] = 1 + var17;
                        if (-1 <= (param3.field_n ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param3.field_d != null) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        dupTemp$0 = param3.field_d[var8];
                        fg.field_a[dupTemp$0] = fg.field_a[dupTemp$0] + 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        lq.field_y = lq.field_y + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = param3.field_n;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 <= 0) {
                            statePc = 69;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param3.field_d != null) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var9 >= fg.field_a.length) {
                            statePc = 69;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var10 = fg.field_a[var9];
                        fg.field_a[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var19 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 64: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_67_0 = (RuntimeException) (var5);
                    stackIn_65_0 = stackIn_67_0;
                    stackIn_67_1 = new StringBuilder().append("vm.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_65_1 = stackIn_67_1;
                    if (param3 == null) {
                        statePc = 67;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_68_2 = "{...}";
                    statePc = 68;
                    continue stateLoop;
                }
                case 67: {
                    stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
                    stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
                    stackIn_68_2 = "null";
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    throw pe.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param4 + ')');
                }
                case 69: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(boolean param0, Object param1, int param2);

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -114) {
              stackIn_4_0 = this.field_c.b(true) - -this.field_l.b(true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -97;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract boolean c(byte param0);

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (20 > this.a(-118)) {
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
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    abstract void c(int param0);

    public static void a(byte param0) {
        try {
            field_i = null;
            int var1_int = -127 % ((param0 - 71) / 46);
            field_g = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "vm.H(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                this.field_b = -117L;
                break L1;
              }
            }
            L2: {
              if (this.d((byte) 0) < 20) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.L(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    vm() {
        this.field_f = new in();
        this.field_a = new in();
        this.field_c = new in();
        this.field_l = new in();
        this.field_n = new lu(6);
        this.field_e = 0;
        this.field_m = (byte) 0;
        this.field_k = 0;
        this.field_d = new lu(10);
    }

    static {
        field_g = "Fisticuffs</col>";
    }
}
