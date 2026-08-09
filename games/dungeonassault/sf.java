/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf implements cl {
    static int field_h;
    static String field_e;
    static int[] field_b;
    private wm field_f;
    static md field_c;
    private int field_a;
    static String field_i;
    private int field_d;
    static int field_g;
    private pj field_j;

    final static void d(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = gg.field_a[0];
                        var2 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((gg.field_a.length ^ -1) >= (var2 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = gg.field_a[var2];
                        cj.a(hf.field_yb, var2 << -1906130396, hf.field_yb, var1_int, var3);
                        var1_int = var1_int + var3;
                        var2++;
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 3) {
                            statePc = 12;
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
                        field_b = (int[]) null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) runtimeException), "sf.L(" + param0 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final int b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = bl.field_d[3].field_y;
              param0 = param0 - (this.field_a + var4_int);
              var5 = var4_int + 32;
              param2 = param2 - (var4_int + this.field_d);
              var6 = param0 / var5;
              var7 = param2 / var5;
              if (param1 == 19091) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              if (0 > param0) {
                break L2;
              } else {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (-8 >= (var6 ^ -1)) {
                    break L2;
                  } else {
                    if (7 > var7) {
                      stackIn_16_0 = var6 + 7 * var7;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_18_0 = -1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var4), "sf.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    public final void a(int param0, int param1) {
        try {
            if (param0 != 15122) {
                this.a(-109, -25);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.K(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(int param0) {
        try {
            if (param0 != 2985) {
                this.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.D(" + param0 + ')');
        }
    }

    public final gg b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gg stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = bl.field_d[3].field_y;
              var4 = 32 + var3_int;
              var5 = param0 % 7;
              var6 = param0 / 7;
              if (param1 == -15390) {
                break L1;
              } else {
                this.field_a = 43;
                break L1;
              }
            }
            stackIn_4_0 = new gg(var5 * var4 + (this.field_a - -var3_int) - -16, var6 * var4 + var3_int + (this.field_d - -16));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "sf.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                if (!param0) {
                  try {
                    L1: {
                      var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                      param1.getAppletContext().showDocument(j.a((byte) 124, var2, param1), "_top");
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var2_ref.printStackTrace();
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var2_ref2);

                stackIn_9_1 = new StringBuilder().append("sf.O(").append(param0).append(',');

                if (param1 == null) {
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
              throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(byte param0) {
        try {
            int var2_int = 27 / ((param0 - 4) / 45);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.H(" + param0 + ')');
        }
    }

    public final void a(boolean param0) {
        try {
            if (!param0) {
                this.b((byte) -123);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.C(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 114) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            field_e = null;
            field_i = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "sf.N(" + param0 + ')');
        }
    }

    public final void b(byte param0) {
        wm stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_171_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        ai var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = bl.field_d[3].field_y;
                        var3 = var2_int + 32;
                        var4 = var2_int - -(7 * var3);
                        gf.b(this.field_a + -4, this.field_d + -4, 8 + var4, var4 + 8, 0);
                        rp.a(8, 2 + var4, (byte) 108, -1 + this.field_a, var4 + 2, kc.field_S, this.field_d + -1);
                        if (this.field_j == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = this.field_j.b((byte) -6);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = this.field_f;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = stackIn_5_0;
                        var6 = 0;
                        if (param0 == -55) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.b((byte) 36);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = this.field_a;
                        var8 = this.field_d;
                        var9 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var9 ^ -1) <= -8) {
                            statePc = 170;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_171_0 = 0;
                        stackIn_11_0 = stackIn_171_0;
                        if (var16 != 0) {
                            statePc = 171;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var10 = stackIn_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (7 <= var10) {
                            statePc = 168;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_169_0 = -1;
                        stackIn_14_0 = stackIn_169_0;
                        stackIn_169_1 = var9 ^ -1;
                        stackIn_14_1 = stackIn_169_1;
                        if (var16 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 > stackIn_14_1) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        bl.field_d[0].h(var2_int + var7, var8);
                        if (var16 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var11_int = 0;
                        if (!this.field_f.a(35 + var6, (byte) 96)) {
                            statePc = 45;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = -7 + var6;
                        if (!var5.a(35 + var6, (byte) 97)) {
                            statePc = 45;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (null == this.field_j) {
                            statePc = 37;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (this.field_j.field_j.a(var6, (byte) 104)) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (this.field_j.field_B != var6) {
                            statePc = 39;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (this.field_j.field_j.a(var12, (byte) 90)) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var12 ^ -1) != (this.field_j.field_B ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_40_0 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var13 = stackIn_40_0;
                        if (var13 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = 2;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = 1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11_int = stackIn_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        bl.field_d[var11_int].h(var2_int + var7, var8);
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (0 < var10) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        bl.field_d[3].h(var7, var2_int + var8);
                        if (var16 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var11_int = 3;
                        if (this.field_f.a(-1 + -(var6 / 7) + var6, (byte) 103)) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var12 = -1 + var6;
                        if (var5.a(-1 + (-(var6 / 7) + var6), (byte) 122)) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (null == this.field_j) {
                            statePc = 69;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (this.field_j.field_j.a(var6, (byte) 115)) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (this.field_j.field_B != var6) {
                            statePc = 71;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (this.field_j.field_j.a(var12, (byte) 97)) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (this.field_j.field_B != var12) {
                            statePc = 71;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_72_0 = 1;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_72_0 = 0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var13 = stackIn_72_0;
                        if (var13 != 0) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_76_0 = 5;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = 4;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var11_int = stackIn_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        bl.field_d[var11_int].h(var7, var8 + var2_int);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (this.field_j == null) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var11 = this.field_j.field_h[var6];
                        if (var16 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var11 = qj.field_c[var6];
                        if (var11 != null) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var11 = gm.field_d.field_L[var6];
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var12 = var11.field_a;
                        if (this.field_j == null) {
                            statePc = 86;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (!this.field_j.field_p.a(var6, (byte) 72)) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_89_0 = 1;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        stackIn_89_0 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var13 = stackIn_89_0;
                        if (var13 != 0) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (24 == var6) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var12 = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (3 == var12) {
                            statePc = 131;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (null == this.field_j) {
                            statePc = 106;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (this.field_j.field_j == null) {
                            statePc = 106;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (!this.field_j.field_j.a(var6, (byte) 68)) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackIn_107_0 = 1;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        stackIn_107_0 = 0;
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var14 = stackIn_107_0;
                        if (var13 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackIn_111_0 = this.c(var6, param0 ^ -87);
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_111_0 = 0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var15 = stackIn_111_0;
                        if (var12 != 1) {
                            statePc = 115;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        ja.field_b[1].h(var2_int + var7, var2_int + var8);
                        if (var16 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (0 != var12) {
                            statePc = 121;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        ja.field_b[0].h(var7 - -var2_int, var8 + var2_int);
                        p.field_G[var15].d(var7 - -var2_int, var2_int + var8, 128);
                        qe.b(var7 + var2_int, var8 + var2_int, 32, 32, 0, 0, 0);
                        if (var16 == 0) {
                            statePc = 130;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        ja.field_b[var12].h(var7 + var2_int, var2_int + var8);
                        if (var6 == 24) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        p.field_G[var15].d(var2_int + var7, var8 + var2_int, 64);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var14 != 0) {
                            statePc = 129;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        sm.field_g.d((-sm.field_g.field_y + 32 >> 1967982625) + (var2_int + var7), (32 - sm.field_g.field_v >> -1703957151) + (var8 - -var2_int), 128);
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        if (var16 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if (0 != var6) {
                            statePc = 137;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        ja.field_b[3].h(var2_int + var7, var2_int + var8);
                        if (var16 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if ((var6 ^ -1) == -7) {
                            statePc = 152;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        if ((var6 ^ -1) != -43) {
                            statePc = 146;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        ja.field_b[3].g(var2_int + var7, var8 + var2_int);
                        if (var16 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (48 == var6) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        ja.field_b[3].b(var7 + var2_int, var8 + var2_int);
                        if (var16 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        ja.field_b[3].f(var7 + var2_int, var2_int + var8);
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (this.field_j != null) {
                            statePc = 157;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (var6 != this.field_j.field_q) {
                            statePc = 161;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        rj.field_k.h(var7 - (-2 - (var3 - rj.field_k.field_E >> -654612863)), 2 + (var8 - -(-rj.field_k.field_G + var3 >> 613814561)));
                        if (var16 == 0) {
                            statePc = 167;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if ((this.field_j.field_B ^ -1) == (var6 ^ -1)) {
                            statePc = 166;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        rj.field_k.d((var3 - rj.field_k.field_E >> 1664625601) + 2 + var7, (var3 - rj.field_k.field_G >> -1815759391) + (2 + var8), 128);
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var7 = var7 + var3;
                        var10++;
                        var6++;
                        if (var16 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        bl.field_d[3].h(var7, var8 - -var2_int);
                        var7 = this.field_a;
                        var9++;
                        stackIn_169_0 = var8;
                        stackIn_169_1 = var3;
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        var8 = stackIn_169_0 + stackIn_169_1;
                        if (var16 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackIn_171_0 = 0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        var9 = stackIn_171_0;
                        statePc = 172;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        if (-8 >= (var9 ^ -1)) {
                            statePc = 177;
                        } else {
                            statePc = 173;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        bl.field_d[0].h(var7 - -var2_int, var8);
                        var9++;
                        var7 = var7 + var3;
                        if (var16 != 0) {
                            statePc = 178;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (var16 == 0) {
                            statePc = 172;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        jh.c();
                        gf.e(this.field_a, this.field_d, this.field_a - -var4, this.field_d - -var4);
                        var7 = this.field_a;
                        var8 = this.field_d;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        var9 = 0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if (8 <= var9) {
                            statePc = 204;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (var16 != 0) {
                            statePc = 207;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        var10 = 0;
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        if ((var10 ^ -1) <= -9) {
                            statePc = 202;
                        } else {
                            statePc = 183;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackIn_203_0 = var9;
                        stackIn_184_0 = stackIn_203_0;
                        stackIn_203_1 = 3;
                        stackIn_184_1 = stackIn_203_1;
                        if (var16 != 0) {
                            statePc = 203;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (stackIn_184_0 == stackIn_184_1) {
                            statePc = 190;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if ((var9 ^ -1) != -5) {
                            statePc = 196;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if (-4 == (var10 ^ -1)) {
                            statePc = 199;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        if (-5 == (var10 ^ -1)) {
                            statePc = 199;
                        } else {
                            statePc = 194;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        gf.b(-1 + var7, -1 + var8, 2 + var2_int, 2 + var2_int, 8421504);
                        gf.b(var7, var8, var2_int, var2_int, 16777215);
                        if (var16 == 0) {
                            statePc = 201;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        gf.b(var7 - 2, -2 + var8, var2_int - -4, var2_int - -4, 8421504);
                        gf.b(-1 + var7, -1 + var8, 2 + var2_int, var2_int - -2, 16777215);
                        statePc = 201;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        var7 = var7 + var3;
                        var10++;
                        if (var16 == 0) {
                            statePc = 182;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        var9++;
                        var7 = this.field_a;
                        stackIn_203_0 = var8;
                        stackIn_203_1 = var3;
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        var8 = stackIn_203_0 + stackIn_203_1;
                        if (var16 == 0) {
                            statePc = 179;
                        } else {
                            statePc = 204;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        jh.b();
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 206: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) var2), "sf.G(" + param0 + ')');
                }
                case 207: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void c(int param0) {
        try {
            if (param0 != -30876) {
                sf.d(27, 16);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.E(" + param0 + ')');
        }
    }

    public final void a(int param0, int param1, int param2) {
        try {
            if (param0 != -9398) {
                field_g = -19;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void b(int param0) {
        try {
            if (param0 != -20827) {
                this.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "sf.J(" + param0 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2) {
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        wm var5 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != this.field_j) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param2 ^ -1) < -1) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var4_int = (int)(0.5 + Math.cos((double)((float)mo.field_a / 5.0f)) * 3.0);
                        var5 = this.field_j.b((byte) -128).a((byte) -53, this.field_j.field_v);
                        if (param1 == -1723) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var6 = 36;
                        var7 = 4;
                        var8 = 0;
                        var9 = var7 + this.field_a;
                        var10 = this.field_d - -var7;
                        var11 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var11 ^ -1) <= -8) {
                            statePc = 104;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var16 != 0) {
                            statePc = 104;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (7 <= var12) {
                            statePc = 100;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_101_0 = var11 ^ -1;
                        stackIn_14_0 = stackIn_101_0;
                        stackIn_101_1 = -1;
                        stackIn_14_1 = stackIn_101_1;
                        if (var16 != 0) {
                            statePc = 101;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 >= stackIn_14_1) {
                            statePc = 55;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!var5.a(35 + var8, (byte) 106)) {
                            statePc = 55;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var13 = var8 - 7;
                        if (!this.field_j.field_m.a(var8, (byte) 83)) {
                            statePc = 99;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!this.field_j.field_m.a(var13, (byte) 68)) {
                            statePc = 99;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (this.field_j.field_j.a(var8, (byte) 77)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var8 != this.field_j.field_q) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_33_0 = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var14 = stackIn_33_0;
                        if (this.field_j.field_j.a(var13, (byte) 78)) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var13 ^ -1) != (this.field_j.field_q ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_40_0 = 1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var15 = stackIn_40_0;
                        if (var14 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var15 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var14 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var15 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        i.field_v.h(-1 + (var9 - -(var6 + -i.field_v.field_y >> 1909112449)), (-i.field_v.field_v + -4 >> 1472018593) + (var4_int + var10));
                        if (var16 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        fo.field_a.h((var6 - fo.field_a.field_y >> 1943388417) + (-1 + var9), (-fo.field_a.field_v + -4 >> 1412716801) + -var4_int + var10);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (0 >= var12) {
                            statePc = 99;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var5.a(-1 + var8 + -(var8 / 7), (byte) 84)) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var13 = var8 + -1;
                        if (!this.field_j.field_m.a(var8, (byte) 110)) {
                            statePc = 99;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (this.field_j.field_m.a(var13, (byte) 79)) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var16 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (this.field_j.field_j.a(var8, (byte) 84)) {
                            statePc = 74;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (this.field_j.field_q != var8) {
                            statePc = 76;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_77_0 = 1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_77_0 = 0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var14 = stackIn_77_0;
                        if (this.field_j.field_j.a(var13, (byte) 93)) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (this.field_j.field_q != var13) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_84_0 = 1;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var15 = stackIn_84_0;
                        if (var14 != 0) {
                            statePc = 88;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var15 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (var14 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var15 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        qi.field_i.h(var9 + (-var4_int - -(-qp.field_a.field_y + -2 >> 1057632449)), -1 + var10 - -(-qp.field_a.field_v + var6 >> 313588769));
                        if (var16 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        qp.field_a.h((-qp.field_a.field_y + -2 >> -1210002591) + (var9 + var4_int), var10 + (-1 - -(var6 + -qp.field_a.field_v >> -938133119)));
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var8++;
                        var9 = var9 + var6;
                        var12++;
                        if (var16 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var9 = var7 + this.field_a;
                        stackIn_101_0 = var10;
                        stackIn_101_1 = var6;
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var10 = stackIn_101_0 + stackIn_101_1;
                        var11++;
                        if (var16 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 103: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) var4), "sf.I(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 104: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int c(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 82) {
              L1: {
                var3_int = 0;
                if (-1 == (param0 % 7 ^ -1)) {
                  break L1;
                } else {
                  if (!this.field_f.a(-1 + (param0 + -(param0 / 7)), (byte) 99)) {
                    break L1;
                  } else {
                    var3_int = var3_int | 1;
                    break L1;
                  }
                }
              }
              L2: {
                if (6 == param0 % 7) {
                  break L2;
                } else {
                  if (this.field_f.a(param0 + -(param0 / 7), (byte) 89)) {
                    var3_int = var3_int | 2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (-7 <= (param0 ^ -1)) {
                  break L3;
                } else {
                  if (!this.field_f.a(param0 - -35, (byte) 70)) {
                    break L3;
                  } else {
                    var3_int = var3_int | 4;
                    break L3;
                  }
                }
              }
              L4: {
                if ((param0 ^ -1) <= -43) {
                  break L4;
                } else {
                  if (this.field_f.a(42 + param0, (byte) 74)) {
                    var3_int = var3_int | 8;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackIn_28_0 = var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -82;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "sf.P(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_28_0;
        }
    }

    sf(go param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = bl.field_d[3].field_y;
                        var5 = 32 + var4_int;
                        var6 = var4_int - -(var5 * 7);
                        if (null != param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_f = gm.field_d.field_k;
                        this.field_j = null;
                        if (var13 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_j = param0.field_Y;
                        this.field_f = this.field_j.field_v;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_a = param1 - (var6 >> -693233567);
                        this.field_d = param2 + -(var6 >> -1242931391);
                        this.a(15122, 0);
                        this.a(15122, 6);
                        this.a(15122, 42);
                        this.a(15122, 48);
                        this.b(-20827);
                        jh.c();
                        p.field_G = new cn[16];
                        var7 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_9_0 = 16;
                        stackIn_9_1 = var7;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 <= stackIn_9_1) {
                            statePc = 30;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = new cn(32, 32);
                        var8.e();
                        gf.b(0, 0, 32, 32, 65793);
                        var9 = 16777215;
                        var10 = 10;
                        var11 = -var10 + (32 - var10);
                        if (var13 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var12 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((var12 ^ -1) <= -3) {
                            statePc = 29;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        gf.b(var10, var10, var11, var11, var9);
                        stackIn_9_0 = -1;
                        stackIn_14_0 = stackIn_9_0;
                        stackIn_9_1 = var7 & 1 ^ -1;
                        stackIn_14_1 = stackIn_9_1;
                        if (var13 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        gf.b(0, var10, var11 + var10, var11, var9);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var7 & 2 ^ -1) != -1) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        gf.b(var10, var10, var11 + var10, var11, var9);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((4 & var7 ^ -1) != -1) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        gf.b(var10, 0, var11, var10 + var11, var9);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1 == (8 & var7 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        gf.b(var10, var10, var11, var11 + var10, var9);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = 0;
                        var11 -= 2;
                        var10++;
                        var12++;
                        if (var13 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        p.field_G[var7] = var8;
                        var7++;
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        jh.b();
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_35_0 = (RuntimeException) (var4);
                    stackIn_33_0 = stackIn_35_0;
                    stackIn_35_1 = new StringBuilder().append("sf.<init>(");
                    stackIn_33_1 = stackIn_35_1;
                    if (param0 == null) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_36_2 = "{...}";
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_36_2 = "null";
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    throw vk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        fa var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_19_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DungeonAssault.field_K;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        oo.field_d = param1;
                        var2 = (fa) ((Object) ud.field_v.e(-24172));
                        var3 = -72 / ((param0 - -32) / 61);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == null) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_19_0 = var2.field_o.c(-71);
                        stackIn_4_0 = stackIn_19_0;
                        if (var4 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.a(false);
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var2.field_n.h(oo.field_d * var2.field_l + 128 >> 604732968);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2 = (fa) ((Object) ud.field_v.a(4));
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (oi.field_F == null) {
                            statePc = 28;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2 = (fa) ((Object) oi.field_F.e(-24172));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var2 == null) {
                            statePc = 28;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_19_0 = var2.field_o.c(-70);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var2.a(false);
                        if (var4 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var2.field_n.h(128 + oo.field_d * var2.field_l >> -887096376);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var2 = (fa) ((Object) oi.field_F.a(4));
                        if (var4 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw vk.a((Throwable) ((Object) runtimeException), "sf.M(" + param0 + ',' + param1 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_g = 0;
        field_b = new int[]{1052688, 1056800, 1056784, 4198416, 2105408, 4202560};
        field_i = "Vampire Bats";
        field_c = new md();
    }
}
