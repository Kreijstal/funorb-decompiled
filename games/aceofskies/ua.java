/*
 * Decompiled by CFR-JS 0.4.0.
 */
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;

abstract class ua implements kt {
    private int field_k;
    jc field_a;
    private int field_m;
    private int field_i;
    static float[] field_c;
    static int[] field_h;
    private boolean field_e;
    private int field_b;
    private jaclib.memory.heap.NativeHeapBuffer field_f;
    static String field_j;
    private int field_n;
    static bs field_d;
    static int[][] field_l;
    static pa[] field_g;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_5_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_8_2 = null;
        int stackIn_8_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        Object stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_15_0 = null;
        jaggl.MapBuffer stackIn_23_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        Object stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        Object stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        Object stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackOut_14_0 = null;
        jaggl.MapBuffer stackOut_22_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackOut_4_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (((ua) this).field_m == 0) {
                this.f(-1);
                if (((ua) this).field_k > 0) {
                  L2: {
                    jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                    if (!param1) {
                      break L2;
                    } else {
                      L3: {
                        stackOut_7_0 = ((ua) this).field_b;
                        stackOut_7_1 = ((ua) this).field_i;
                        stackOut_7_2 = null;
                        stackOut_7_3 = 0;
                        stackIn_12_0 = stackOut_7_0;
                        stackIn_12_1 = stackOut_7_1;
                        stackIn_12_2 = stackOut_7_2;
                        stackIn_12_3 = stackOut_7_3;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        stackIn_8_2 = stackOut_7_2;
                        stackIn_8_3 = stackOut_7_3;
                        if (((ua) this).field_e) {
                          stackOut_12_0 = stackIn_12_0;
                          stackOut_12_1 = stackIn_12_1;
                          stackOut_12_2 = stackIn_12_2;
                          stackOut_12_3 = stackIn_12_3;
                          stackOut_12_4 = 35040;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          stackIn_13_2 = stackOut_12_2;
                          stackIn_13_3 = stackOut_12_3;
                          stackIn_13_4 = stackOut_12_4;
                          break L3;
                        } else {
                          stackOut_8_0 = stackIn_8_0;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = stackIn_8_2;
                          stackOut_8_3 = stackIn_8_3;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          stackIn_10_3 = stackOut_8_3;
                          stackOut_10_0 = stackIn_10_0;
                          stackOut_10_1 = stackIn_10_1;
                          stackOut_10_2 = stackIn_10_2;
                          stackOut_10_3 = stackIn_10_3;
                          stackOut_10_4 = 35044;
                          stackIn_13_0 = stackOut_10_0;
                          stackIn_13_1 = stackOut_10_1;
                          stackIn_13_2 = stackOut_10_2;
                          stackIn_13_3 = stackOut_10_3;
                          stackIn_13_4 = stackOut_10_4;
                          break L3;
                        }
                      }
                      jaggl.OpenGL.glBufferDataARBub(stackIn_13_0, stackIn_13_1, (byte[]) (Object) stackIn_13_2, stackIn_13_3, stackIn_13_4);
                      if (((ua) this).field_n > ((ua) this).field_a.field_Q.c) {
                        break L2;
                      } else {
                        ((ua) this).field_m = 1;
                        stackOut_14_0 = ((ua) this).field_a.field_Q;
                        stackIn_15_0 = stackOut_14_0;
                        return (jaclib.memory.Buffer) (Object) stackIn_15_0;
                      }
                    }
                  }
                  if (param0.a()) {
                    break L1;
                  } else {
                    if (param0.a(((ua) this).field_b, ((ua) this).field_n, 35001)) {
                      ((ua) this).field_m = 2;
                      stackOut_22_0 = (jaggl.MapBuffer) param0;
                      stackIn_23_0 = stackOut_22_0;
                      return (jaclib.memory.Buffer) (Object) stackIn_23_0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  ((ua) this).field_m = 2;
                  stackOut_4_0 = ((ua) this).field_f;
                  stackIn_5_0 = stackOut_4_0;
                  return (jaclib.memory.Buffer) (Object) stackIn_5_0;
                }
              } else {
                break L1;
              }
            }
            if (param2 == -10386) {
              stackOut_27_0 = null;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            } else {
              stackOut_25_0 = null;
              stackIn_26_0 = stackOut_25_0;
              return (jaclib.memory.Buffer) (Object) stackIn_26_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("ua.D(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (jaclib.memory.Buffer) (Object) stackIn_28_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((ua) this).field_a.field_Cc) {
                break L1;
              } else {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                break L1;
              }
            }
            L2: {
              if (param0 == -17310) {
                break L2;
              } else {
                boolean discarded$2 = ((ua) this).a((jaggl.MapBuffer) null, (byte) 10);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "ua.I(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        try {
            field_j = null;
            field_l = null;
            field_d = null;
            field_h = null;
            field_g = null;
            field_c = null;
            int var1_int = -51 / ((param0 - 59) / 37);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ua.K(" + param0 + ')');
        }
    }

    final static short[] a(dl param0, short[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_22_0 = null;
        short[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_21_0 = null;
        short[] stackOut_25_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = param0.b((byte) 103, param3);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (~param1.length != ~var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              L3: {
                L4: {
                  L5: {
                    var5 = param0.b((byte) -95, 4);
                    var6 = (short)param0.b((byte) 89, 16);
                    if (param2 < var5) {
                      break L5;
                    } else {
                      var7 = 0;
                      L6: while (true) {
                        L7: {
                          if (var4_int <= var7) {
                            break L7;
                          } else {
                            param1[var7] = (short) var6;
                            var7++;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L8: while (true) {
                    if (~var7 <= ~var4_int) {
                      break L4;
                    } else {
                      stackOut_21_0 = (short[]) param1;
                      stackIn_26_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        stackIn_22_0[var7] = (short)(param0.b((byte) 96, var5) + var6);
                        var7++;
                        if (var8 == 0) {
                          continue L8;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackOut_25_0 = (short[]) param1;
                stackIn_26_0 = stackOut_25_0;
                break L3;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (short[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("ua.L(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L10;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_26_0;
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -115) {
                break L1;
              } else {
                this.f(53);
                break L1;
              }
            }
            L2: {
              var3_int = 1;
              if (((ua) this).field_m == 0) {
                break L2;
              } else {
                L3: {
                  if (0 >= ((ua) this).field_k) {
                    break L3;
                  } else {
                    L4: {
                      jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                      if (((ua) this).field_m == 1) {
                        break L4;
                      } else {
                        var3_int = param0.b() ? 1 : 0;
                        if (!AceOfSkies.field_G) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    jaggl.OpenGL.glBufferSubDataARBa(((ua) this).field_b, 0, ((ua) this).field_i, ((ua) this).field_a.field_Q.a());
                    break L3;
                  }
                }
                ((ua) this).field_m = 0;
                break L2;
              }
            }
            stackOut_14_0 = var3_int;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ua.F(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    void a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        Object stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        Object stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        Object stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        Object stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        Object stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        Object stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        Object stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        try {
          L0: {
            if (param0 == -12880) {
              L1: {
                if (((ua) this).field_i >= param1) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.f(-1);
                      if (((ua) this).field_k <= 0) {
                        break L3;
                      } else {
                        L4: {
                          jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                          stackOut_6_0 = ((ua) this).field_b;
                          stackOut_6_1 = param1;
                          stackOut_6_2 = null;
                          stackOut_6_3 = 0;
                          stackIn_11_0 = stackOut_6_0;
                          stackIn_11_1 = stackOut_6_1;
                          stackIn_11_2 = stackOut_6_2;
                          stackIn_11_3 = stackOut_6_3;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          stackIn_7_2 = stackOut_6_2;
                          stackIn_7_3 = stackOut_6_3;
                          if (((ua) this).field_e) {
                            stackOut_11_0 = stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = stackIn_11_2;
                            stackOut_11_3 = stackIn_11_3;
                            stackOut_11_4 = 35040;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            break L4;
                          } else {
                            stackOut_7_0 = stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = stackIn_7_2;
                            stackOut_7_3 = stackIn_7_3;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_9_2 = stackOut_7_2;
                            stackIn_9_3 = stackOut_7_3;
                            stackOut_9_0 = stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = stackIn_9_2;
                            stackOut_9_3 = stackIn_9_3;
                            stackOut_9_4 = 35044;
                            stackIn_12_0 = stackOut_9_0;
                            stackIn_12_1 = stackOut_9_1;
                            stackIn_12_2 = stackOut_9_2;
                            stackIn_12_3 = stackOut_9_3;
                            stackIn_12_4 = stackOut_9_4;
                            break L4;
                          }
                        }
                        jaggl.OpenGL.glBufferDataARBub(stackIn_12_0, stackIn_12_1, (byte[]) (Object) stackIn_12_2, stackIn_12_3, stackIn_12_4);
                        ((ua) this).field_a.field_j = ((ua) this).field_a.field_j + (-((ua) this).field_i + param1);
                        if (!AceOfSkies.field_G) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((ua) this).field_f = ((ua) this).field_a.a((byte) -77, param1, false);
                    break L2;
                  }
                  ((ua) this).field_i = param1;
                  break L1;
                }
              }
              ((ua) this).field_n = param1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var3, "ua.E(" + param0 + ',' + param1 + ')');
        }
    }

    void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((ua) this).field_k <= 0) {
                break L1;
              } else {
                ((ua) this).field_a.a(((ua) this).field_n, 9841, ((ua) this).field_k);
                ((ua) this).field_k = -1;
                break L1;
              }
            }
            L2: {
              if (param0 == 4665) {
                break L2;
              } else {
                field_d = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "ua.H(" + param0 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        try {
            ((ua) this).a(4665);
            super.finalize();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ua.finalize()");
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 4754) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            ub.a("", (String) null, -89);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "ua.A(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (~((ua) this).field_k > param0) {
              L1: {
                L2: {
                  if (((ua) this).field_a.field_Cc) {
                    break L2;
                  } else {
                    ((ua) this).field_k = 0;
                    if (!AceOfSkies.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                jaggl.OpenGL.glGenBuffersARB(1, ci.field_m, 0);
                ((ua) this).field_k = ci.field_m[0];
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "ua.G(" + param0 + ')');
        }
    }

    final long b(byte param0) {
        RuntimeException var2 = null;
        long stackIn_2_0 = 0L;
        long stackIn_7_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_6_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_1_0 = 0L;
        try {
          L0: {
            if (param0 > 29) {
              L1: {
                if (((ua) this).field_k != 0) {
                  stackOut_6_0 = 0L;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = ((ua) this).field_f.a();
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = -98L;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "ua.C(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final static void c(int param0) {
        try {
            oj.a(param0 ^ 26099, bm.m(124));
            if (param0 != 0) {
                short[] discarded$0 = ua.a((dl) null, (short[]) null, 101, 22);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ua.J(" + param0 + ')');
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 117 % ((16 - param2) / 58);
            ae.field_f = param1;
            ss.field_t = true;
            ml.field_m = new oo(vn.field_f, b.field_c, param0, nf.field_a, ae.field_f);
            vn.field_f.a((ea) (Object) ml.field_m, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("ua.B(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ua(jc param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ua) this).field_m = 0;
        ((ua) this).field_k = -1;
        try {
          L0: {
            ((ua) this).field_e = param2;
            ((ua) this).field_b = param1;
            ((ua) this).field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ua.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_h = new int[4096];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 4096) {
            field_d = new bs();
            field_l = new int[8][];
            return;
          } else {
            field_h[var0] = it.a(var0, -1);
            var0++;
            continue L0;
          }
        }
    }
}
