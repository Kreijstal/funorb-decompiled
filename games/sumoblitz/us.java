/*
 * Decompiled by CFR-JS 0.4.0.
 */
class us extends ht {
    int field_o;
    int field_l;
    private int field_k;
    static String field_m;
    private int field_n;

    final void a(int param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, boolean param7, byte param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 == (param5 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param5 = param4;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!param7) {
                            statePc = 16;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11_int = pc.a(param2, (byte) -37);
                        var12 = var11_int * param4;
                        var13 = var11_int * param5;
                        var14 = new byte[param9 * var12];
                        var15 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 >= param9) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var16 = var15 * var12;
                        var17 = var13 * (-var15 + (param9 + -1)) - -param0;
                        stackIn_17_0 = 0;
                        stackIn_8_0 = stackIn_17_0;
                        if (var19 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var18 = stackIn_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var18 >= var12) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        incrementValue$0 = var16;
                        var16++;
                        incrementValue$1 = var17;
                        var17++;
                        var14[incrementValue$0] = param1[incrementValue$1];
                        var18++;
                        if (var19 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var15++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var19 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param1 = var14;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_d.a(82, (ht) (this));
                        jaggl.OpenGL.glPixelStorei(3317, 1);
                        stackIn_17_0 = param4 ^ -1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0 == (param5 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        jaggl.OpenGL.glPixelStorei(3314, param5);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        jaggl.OpenGL.glTexSubImage2Dub(this.field_c, 0, param3, param6, param4, param9, param2, 5121, param1, param0);
                        if (param5 != param4) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        jaggl.OpenGL.glPixelStorei(3314, 0);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param8 < -120) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return;
                }
                case 24: {
                    try {
                        jaggl.OpenGL.glPixelStorei(3317, 4);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var11 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var11);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("us.G(").append(param0).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param1 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, param1, param2, param4 * param3, false);
        this.field_k = -1;
        this.field_n = -1;
        try {
            this.field_o = param4;
            this.field_l = param3;
            this.field_d.a(27, (ht) (this));
            jaggl.OpenGL.glTexImage2Dub(this.field_c, 0, this.field_a, param3, param4, 0, be.a(false, this.field_a), 5121, (byte[]) null, 0);
            this.a(true, 0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "us.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8;
        var8 = this.field_d.field_Ec + -param4 + -param1;
        this.field_d.a(97, (ht) (this));
        if (param0 < 110) {
          this.field_o = 53;
          jaggl.OpenGL.glCopyTexSubImage2D(this.field_c, 0, param2, -param4 - param3 + this.field_o, param5, var8, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        } else {
          jaggl.OpenGL.glCopyTexSubImage2D(this.field_c, 0, param2, -param4 - param3 + this.field_o, param5, var8, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        if (param2 != -27365) {
          L0: {
            this.a((byte) 11, 46, 71, -37, 98, -13, 14);
            if (-3554 == (this.field_c ^ -1)) {
              L1: {
                this.field_d.a(66, (ht) (this));
                stackIn_15_0 = this.field_c;

                stackIn_15_1 = 10242;

                if (!param0) {
                  stackIn_16_0 = stackIn_15_0;
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = 33071;
                  break L1;
                } else {
                  stackIn_16_0 = stackIn_15_0;
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = 10497;
                  break L1;
                }
              }
              L2: {
                jaggl.OpenGL.glTexParameteri(stackIn_16_0, stackIn_16_1, stackIn_16_2);
                stackIn_18_0 = this.field_c;

                stackIn_18_1 = 10243;

                if (!param1) {
                  stackIn_19_0 = stackIn_18_0;
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = 33071;
                  break L2;
                } else {
                  stackIn_19_0 = stackIn_18_0;
                  stackIn_19_1 = stackIn_18_1;
                  stackIn_19_2 = 10497;
                  break L2;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_19_0, stackIn_19_1, stackIn_19_2);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (-3554 == (this.field_c ^ -1)) {
              L4: {
                this.field_d.a(66, (ht) (this));
                stackIn_5_0 = this.field_c;

                stackIn_5_1 = 10242;

                if (!param0) {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = 33071;
                  break L4;
                } else {
                  stackIn_6_0 = stackIn_5_0;
                  stackIn_6_1 = stackIn_5_1;
                  stackIn_6_2 = 10497;
                  break L4;
                }
              }
              L5: {
                jaggl.OpenGL.glTexParameteri(stackIn_6_0, stackIn_6_1, stackIn_6_2);
                stackIn_8_0 = this.field_c;

                stackIn_8_1 = 10243;

                if (!param1) {
                  stackIn_9_0 = stackIn_8_0;
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 33071;
                  break L5;
                } else {
                  stackIn_9_0 = stackIn_8_0;
                  stackIn_9_1 = stackIn_8_1;
                  stackIn_9_2 = 10497;
                  break L5;
                }
              }
              jaggl.OpenGL.glTexParameteri(stackIn_9_0, stackIn_9_1, stackIn_9_2);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, float[] param6, int param7) {
        super(param0, param1, param2, param3 * param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_k = -1;
        this.field_n = -1;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  this.field_l = param3;
                  this.field_o = param4;
                  this.field_d.a(106, (ht) (this));
                  if (!param5) {
                    break L3;
                  } else {
                    if (this.field_c != 34037) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jaggl.OpenGL.glTexImage2Df(this.field_c, 0, this.field_a, this.field_l, this.field_o, 0, param7, 5126, param6, 0);
                this.a(true, false);
                if (!Sumoblitz.field_L) {
                  break L1;
                } else {
                  break L2;
                }
              }
              dl.a(param3, param4, (byte) 11, param1, param2, param6, param7);
              this.a(true, true);
              break L1;
            }
            this.a(true, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("us.<init>(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param7 + ')');
        }
    }

    public static void c(byte param0) {
        field_m = null;
        if (param0 != 28) {
            field_m = (String) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        jaggl.OpenGL.glFramebufferTexture2DEXT(param3, param1, this.field_c, this.field_j, param2);
        this.field_k = param3;
        if (param0 >= -21) {
          return;
        } else {
          this.field_n = param1;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, boolean param7, boolean param8) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param8) {
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
                        this.a(11);
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
                        if (param6 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param6 = param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param7) {
                            statePc = 7;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var16 = new int[param1 * param0];
                        var10 = var16;
                        var11 = 0;
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
                        if (param0 <= var11) {
                            statePc = 17;
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
                        var12 = param1 * var11;
                        var13 = param4 + param6 * (param0 - (var11 - -1));
                        stackIn_19_0 = 0;
                        stackIn_10_0 = stackIn_19_0;
                        if (var15 != 0) {
                            statePc = 19;
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
                        var14 = stackIn_10_0;
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
                        if (var14 >= param1) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$0 = var12;
                        var12++;
                        incrementValue$1 = var13;
                        var13++;
                        var16[incrementValue$0] = param3[incrementValue$1];
                        var14++;
                        if (var15 != 0) {
                            statePc = 16;
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
                    try {
                        if (var15 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var15 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param3 = var16;
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
                        this.field_d.a(81, (ht) (this));
                        stackIn_19_0 = param6;
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
                        if (stackIn_19_0 == param1) {
                            statePc = 21;
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
                        jaggl.OpenGL.glPixelStorei(3314, param6);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        jaggl.OpenGL.glTexSubImage2Di(this.field_c, 0, param5, -param0 + (this.field_o + -param2), param1, param0, 32993, this.field_d.field_L, param3, param4);
                        if (param1 != param6) {
                            statePc = 23;
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
                        return;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        jaggl.OpenGL.glPixelStorei(3314, 0);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var10_ref);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("us.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param3 == null) {
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
                    throw qo.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, byte[] param6, int param7, boolean param8) {
        super(param0, param1, param2, param3 * param4, param5);
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        byte[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Sumoblitz.field_L ? 1 : 0;
                    this.field_k = -1;
                    this.field_n = -1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_l = param3;
                        this.field_o = param4;
                        if (!param8) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var16 = new byte[param6.length];
                        var10 = var16;
                        var11 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param4 <= var11) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = param3 * var11;
                        var13 = param3 * (-1 + (-var11 + param4));
                        stackIn_13_0 = 0;
                        stackIn_5_0 = stackIn_13_0;
                        if (var15 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var14 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var14 >= param3) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$0 = var12;
                        var12++;
                        incrementValue$1 = var13;
                        var13++;
                        var16[incrementValue$0] = param6[incrementValue$1];
                        var14++;
                        if (var15 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var15 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var11++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var15 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param6 = var16;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_d.a(83, (ht) (this));
                        jaggl.OpenGL.glPixelStorei(3317, 1);
                        stackIn_13_0 = param5 ? 1 : 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (34037 == this.field_c) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        vq.a(param1, 23143, param6, param3, param2, param4, param7);
                        this.a(true, true);
                        if (var15 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        jaggl.OpenGL.glTexImage2Dub(this.field_c, 0, this.field_a, this.field_l, this.field_o, 0, param7, 5121, param6, 0);
                        this.a(true, false);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        jaggl.OpenGL.glPixelStorei(3317, 4);
                        this.a(true, 0);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_21_0 = (RuntimeException) (var10_ref);
                    stackIn_20_0 = stackIn_21_0;
                    stackIn_21_1 = new StringBuilder().append("us.<init>(");
                    stackIn_20_1 = stackIn_21_1;
                    if (param0 == null) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_22_2 = "{...}";
                    statePc = 22;
                    continue stateLoop;
                }
                case 21: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_22_2 = "null";
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param6 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
                }
                case 26: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    us(fr param0, int param1, int param2, int param3, int param4, boolean param5, int[] param6, int param7, int param8, boolean param9) {
        super(param0, param1, param2, param4 * param3, param5);
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var11 = null;
        RuntimeException var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = Sumoblitz.field_L ? 1 : 0;
                    this.field_k = -1;
                    this.field_n = -1;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_l = param3;
                        this.field_o = param4;
                        if (!param9) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var17 = new int[param6.length];
                        var11 = var17;
                        var12 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param4 <= var12) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var13 = var12 * param3;
                        var14 = param3 * (-var12 + param4 + -1);
                        stackIn_13_0 = 0;
                        stackIn_5_0 = stackIn_13_0;
                        if (var16 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var15 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 >= param3) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$0 = var13;
                        var13++;
                        incrementValue$1 = var14;
                        var14++;
                        var17[incrementValue$0] = param6[incrementValue$1];
                        var15++;
                        if (var16 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var16 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var16 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param6 = var17;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_d.a(43, (ht) (this));
                        stackIn_13_0 = this.field_c;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == 34037) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!param5) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param7 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-1 != (param8 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        eu.a(-122, this.field_o, this.field_l, this.field_c, param6, this.field_a, this.field_d.field_L, 32993);
                        this.a(true, true);
                        if (var16 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        jaggl.OpenGL.glPixelStorei(3314, param7);
                        jaggl.OpenGL.glTexImage2Di(this.field_c, 0, this.field_a, this.field_l, this.field_o, 0, 32993, this.field_d.field_L, param6, 4 * param8);
                        jaggl.OpenGL.glPixelStorei(3314, 0);
                        this.a(true, false);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(true, 0);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var11_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var11_ref);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("us.<init>(");
                    stackIn_22_1 = stackIn_23_1;
                    if (param0 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param6 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw qo.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0) {
        int var2 = 6 / ((44 - param0) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(this.field_k, this.field_n, this.field_c, 0, 0);
        this.field_k = -1;
        this.field_n = -1;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            int var2_int = 0;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(td.a((byte) 127, param0, var2), "_top");
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
                var2_int = 76 / ((0 - param1) / 39);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("us.I(");

                if (param0 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L3;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L3;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = "Logging in...";
    }
}
