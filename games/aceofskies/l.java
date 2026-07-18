/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l {
    private boolean field_d;
    static vd field_a;
    private vu field_e;
    static int field_f;
    static int field_c;
    private d field_b;
    private sn[] field_g;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            l.a(false);
        }
    }

    private final boolean b(java.awt.Canvas param0, int param1) {
        vu var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = ((l) this).field_e;
                if (var3 == null) {
                  break L2;
                } else {
                  if (!((l) this).field_d) {
                    break L2;
                  } else {
                    if (param0 == var3.field_b) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.a(param0, 91);
              break L1;
            }
            L3: {
              if (null == ((l) this).field_e) {
                break L3;
              } else {
                ((l) this).field_e.field_c.b((int)(-((l) this).field_e.field_a + kh.a(-104)));
                break L3;
              }
            }
            L4: {
              L5: {
                if (((l) this).field_e == null) {
                  break L5;
                } else {
                  L6: {
                    if (var3 == null) {
                      break L6;
                    } else {
                      if (((l) this).field_e.field_c == var3.field_c) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L4;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("l.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + 118 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static vj a(byte param0, int param1, byte[] param2, jc param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_13_0 = null;
        vj stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        vj stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length != 0) {
                L1: {
                  var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
                  jaggl.OpenGL.glShaderSourceRawARB(var4_long, param2);
                  jaggl.OpenGL.glCompileShaderARB(var4_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, dg.field_Q, 0);
                  if (dg.field_Q[0] != -1) {
                    break L1;
                  } else {
                    L2: {
                      if (-1 == dg.field_Q[0]) {
                        System.out.println("Shader compile failed:");
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, dg.field_Q, 1);
                      if (dg.field_Q[1] <= 1) {
                        break L3;
                      } else {
                        var10 = new byte[dg.field_Q[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var4_long, dg.field_Q[1], dg.field_Q, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L3;
                      }
                    }
                    if (dg.field_Q[0] != 0) {
                      break L1;
                    } else {
                      jaggl.OpenGL.glDeleteObjectARB(var4_long);
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      return (vj) (Object) stackIn_13_0;
                    }
                  }
                }
                stackOut_14_0 = new vj(param3, var4_long, param1);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("l.G(").append(29).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_15_0;
    }

    l(int param0, int param1, d param2) {
        this(da.a(param0, 1), cm.a(param1, (byte) 118), param2, pt.field_b, an.a(false));
    }

    private final void a(java.awt.Canvas param0, int param1) {
        Object var3 = null;
        sn[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        sn var6_ref = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        vu var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        Object stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        Object stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        Object stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        Object stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        Object stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        Object stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = AceOfSkies.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = null;
                        var4 = ((l) this).field_g;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (~var5 <= ~var4.length) {
                            statePc = 118;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6_ref = var4[var5];
                        if (var6_ref.field_b) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7_int = var6_ref.field_d;
                        if (var7_int != 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (5 == var7_int) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7_int != 1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var7_int == 3) {
                            statePc = 45;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7_int == 2) {
                            statePc = 64;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (!oi.field_d.b((byte) -90)) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var7_int = bc.a("hw3d", (byte) -95);
                        if (-1 == var7_int) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7_int >= 100) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return;
                }
                case 22: {
                    try {
                        var8_int = bc.a("jaclib", (byte) 49);
                        if (var8_int != -1) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        var9 = bc.a("jaggl", (byte) -75);
                        if (var9 != -1) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var9 >= 100) {
                            statePc = 80;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return;
                }
                case 32: {
                    try {
                        if (oi.field_d.b((byte) -44)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return;
                }
                case 34: {
                    try {
                        var7_int = bc.a("jaclib", (byte) -120);
                        if (var7_int != -1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var7_int < 100) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return;
                }
                case 39: {
                    try {
                        var8_int = bc.a("jaggl", (byte) -80);
                        if (var8_int == -1) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var8_int < 100) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 44: {
                    return;
                }
                case 45: {
                    try {
                        if (oi.field_d.b((byte) 116)) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 46: {
                    return;
                }
                case 47: {
                    try {
                        var7_int = bc.a("jaclib", (byte) 12);
                        if (var7_int == -1) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var7_int >= 100) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return;
                }
                case 53: {
                    try {
                        var8_int = bc.a("jagdx", (byte) 47);
                        if (var8_int == -1) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return;
                }
                case 59: {
                    try {
                        var9 = bc.a("hw3d", (byte) 1);
                        if (var9 != -1) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var9 >= 100) {
                            statePc = 80;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return;
                }
                case 64: {
                    try {
                        if (!oi.field_d.b((byte) -39)) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return;
                }
                case 67: {
                    try {
                        var7_int = bc.a("jaclib", (byte) 74);
                        if (var7_int == -1) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (100 <= var7_int) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return;
                }
                case 73: {
                    try {
                        var8_int = bc.a("sw3d", (byte) 41);
                        if (var8_int == -1) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var8_int >= 100) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 78: {
                    return;
                }
                case 79: {
                    try {
                        throw new IllegalStateException("UT" + var6_ref.field_d);
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (null != ((l) this).field_e) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (!((l) this).field_e.field_d.a((byte) -73, var6_ref)) {
                            statePc = 89;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (((l) this).field_e.field_c == null) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (param0 != ((l) this).field_e.field_b) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (var6_ref.a(((l) this).field_e, 0)) {
                            statePc = 87;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        ((l) this).field_d = true;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 88: {
                    return;
                }
                case 89: {
                    try {
                        if (var6_ref.field_d != ((l) this).field_e.field_d.field_d) {
                            statePc = 92;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (null == ((l) this).field_e.field_c) {
                            statePc = 92;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var3 = (Object) (Object) ((l) this).field_e.a((byte) 38);
                        ((l) this).field_e.field_c.a(-9);
                        ((l) this).field_e = null;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        var11 = hr.a(iq.field_h, ((l) this).field_b, -106, var6_ref.field_a, param0, var6_ref.field_d);
                        if (var11 == null) {
                            statePc = 109;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var8 = new vu(var11, var6_ref, param0);
                        if (!var6_ref.a(var8, 0)) {
                            statePc = 109;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (null == ((l) this).field_e) {
                            statePc = 101;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var8.field_c != ((l) this).field_e.field_c) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var8.field_b == ((l) this).field_e.field_b) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        ((l) this).field_d = true;
                        ((l) this).field_e = var8;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 99: {
                    return;
                }
                case 100: {
                    try {
                        var3 = (Object) (Object) ((l) this).field_e.a((byte) 38);
                        ((l) this).field_e.field_c.a(-9);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        if (var8.field_c.b()) {
                            statePc = 103;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var8.field_c.a(var8.field_c.c(100663296));
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var3 == null) {
                            statePc = 106;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        ((mj) var3).a(true, var8);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var8.field_a = kh.a(-75);
                        statePc = 107;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        ((l) this).field_d = true;
                        ((l) this).field_e = var8;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    return;
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        var7 = (RuntimeException) (Object) caughtException;
                        var7.printStackTrace();
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var6_ref.field_b = false;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var5++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 114: {
                    var3 = (Object) (Object) caughtException;
                    stackOut_114_0 = var3;
                    stackOut_114_1 = new StringBuilder().append("l.A(");
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_116_1 = stackOut_114_1;
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    if (param0 == null) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackOut_115_0 = stackIn_115_0;
                    stackOut_115_1 = (StringBuilder) (Object) stackIn_115_1;
                    stackOut_115_2 = "{...}";
                    stackIn_117_0 = stackOut_115_0;
                    stackIn_117_1 = stackOut_115_1;
                    stackIn_117_2 = stackOut_115_2;
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    stackOut_116_0 = stackIn_116_0;
                    stackOut_116_1 = (StringBuilder) (Object) stackIn_116_1;
                    stackOut_116_2 = "null";
                    stackIn_117_0 = stackOut_116_0;
                    stackIn_117_1 = stackOut_116_1;
                    stackIn_117_2 = stackOut_116_2;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    throw pn.a((Throwable) (Object) stackIn_117_0, stackIn_117_2 + ',' + 91 + ')');
                }
                case 118: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, sn[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((l) this).field_g == param1) {
                break L1;
              } else {
                if (param1.length == 0) {
                  throw new IllegalArgumentException();
                } else {
                  ((l) this).field_g = param1;
                  ((l) this).field_d = false;
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("l.D(").append(116).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final boolean a(int param0) {
        int var2 = 10 / ((param0 - 68) / 53);
        return this.b(fa.a(-8213), 118);
    }

    final ha a(byte param0) {
        if (param0 <= 59) {
            return null;
        }
        if (null == ((l) this).field_e) {
            return null;
        }
        return ((l) this).field_e.field_c;
    }

    private l(gk param0, gk param1, d param2, rk param3, sn[] param4) {
        ((l) this).field_d = false;
        try {
            oi.field_d = param0;
            ((l) this).field_b = param2;
            iq.field_h = param1;
            ef.a((byte) 100, param3, param0);
            this.a((byte) 116, param4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 256;
    }
}
