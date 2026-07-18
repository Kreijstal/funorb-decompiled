/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    static int field_b;
    static ed field_w;
    private int[] field_c;
    private int[] field_x;
    private int[][] field_l;
    private wi[][] field_a;
    private int field_d;
    private boolean[] field_e;
    private int field_g;
    private wi[][] field_p;
    private boolean[][] field_A;
    int field_z;
    private int[][] field_v;
    int field_B;
    private boolean[] field_r;
    static String field_t;
    private int field_q;
    private int field_o;
    private int[] field_n;
    private int[][] field_s;
    private boolean[] field_k;
    static int[] field_i;
    private int field_f;
    private int[] field_u;
    private int field_h;
    private ed[] field_y;
    private int[] field_j;
    static String field_m;

    private final void a(int[][] param0, boolean[][] param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              param1[0][0] = this.a(((na) this).field_h + -1, -1 + ((na) this).field_f, (byte) -23, param0[0]);
              param1[0][1 + ((na) this).field_h] = this.a(0, -1 + ((na) this).field_f, (byte) -66, param0[2]);
              param1[1 + ((na) this).field_f][0] = this.a(((na) this).field_h + -1, 0, (byte) -78, param0[6]);
              param1[((na) this).field_f + 1][1 + ((na) this).field_h] = this.a(0, 0, (byte) -44, param0[8]);
              if (param2 >= 63) {
                break L1;
              } else {
                this.b(16);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("na.VA(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2) {
        int var4 = 0;
        param2 = param2 - 1;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((na) this).field_h) {
            return;
          } else {
            param2++;
            param1[param2] = param0;
            var4++;
            continue L0;
          }
        }
    }

    private final int[][] e(int param0) {
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[][] stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_10_0 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var2 = new int[((na) this).field_d * ((na) this).field_g][];
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= var2.length) {
                    break L3;
                  } else {
                    var2[var3] = ((na) this).field_n;
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 1) {
                  break L2;
                } else {
                  ((na) this).field_k = null;
                  break L2;
                }
              }
              stackOut_10_0 = (int[][]) var2;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "na.AA(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 < -96) {
                break L1;
              } else {
                this.a((wi[][]) null, 102);
                break L1;
              }
            }
            var4_int = -param2;
            var5 = param1;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5 >= ((na) this).field_d) {
                    break L4;
                  } else {
                    stackOut_6_0 = var4_int + ((na) this).field_f;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      var4_int = stackIn_7_0;
                      var5++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_8_0 = ((na) this).field_j[0];
                stackIn_9_0 = stackOut_8_0;
                break L3;
              }
              var6 = stackIn_9_0;
              var7 = ((na) this).field_j[1];
              var8 = 1 + (-var4_int + 479);
              if (0 >= var8) {
                return;
              } else {
                em.c(0, var4_int, 640, var8, var6, var7);
                this.a(var4_int, (byte) 104);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "na.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int[] param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var4_int = -12 / ((43 - param1) / 44);
            if (((na) this).field_x != param0) {
              if (((na) this).field_n != param0) {
                L1: {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (param2 < ((na) this).field_f) {
                      stackOut_12_0 = param0[param2];
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("na.D(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    public static void d(int param0) {
        try {
            field_t = null;
            field_i = null;
            field_m = null;
            field_w = null;
            if (param0 != 3) {
                dk[] discarded$0 = na.a(-86, (int[]) null, 29, -25, (ih) null, (String[]) null, (int[]) null, false, (int[]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "na.GB(" + param0 + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = 1 << param1;
          var4 = param0 & var3;
          if (var4 != 0) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        return stackIn_4_0 != 0;
    }

    private final boolean[][] a(int param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean[][] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[][] stackOut_0_0 = null;
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
            this.a((byte) 121, param1, ((na) this).field_A);
            this.a(param1, (byte) 62, ((na) this).field_A);
            var3_int = -64 / ((param0 - -50) / 40);
            this.a(param1, ((na) this).field_A, (byte) 107);
            stackOut_0_0 = ((na) this).field_A;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("na.T(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean a(int param0, int param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = this.a(param3, (byte) 125, param1);
            if (param2 < -18) {
              var6 = this.a(var5_int, param0) ? 1 : 0;
              stackOut_3_0 = var6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("na.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final wi[][] a(int param0, wi[][] param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wi[][] stackIn_5_0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        wi[][] stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi[][] stackOut_4_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        wi[][] stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var14 = EscapeVector.field_A;
        try {
          L0: {
            if (null != param1) {
              stackOut_4_0 = (wi[][]) param1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var6_int = 640;
              var7 = 480;
              var8 = 1 + var6_int / ((na) this).field_h;
              var9 = var7 / ((na) this).field_f - -1;
              param1 = new wi[var9][var8];
              var10 = param0;
              L1: while (true) {
                stackOut_7_0 = ~var10;
                stackIn_8_0 = stackOut_7_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_8_0 <= ~var9) {
                      break L3;
                    } else {
                      var11 = var10 + param4;
                      var12 = 0;
                      L4: while (true) {
                        L5: {
                          if (var8 <= var12) {
                            break L5;
                          } else {
                            stackOut_11_0 = var12 + param2;
                            stackIn_8_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var14 != 0) {
                              continue L2;
                            } else {
                              var13 = stackIn_12_0;
                              L6: while (true) {
                                L7: {
                                  L8: {
                                    if (var13 >= 0) {
                                      break L8;
                                    } else {
                                      var13 = var13 + ((na) this).field_g;
                                      if (var14 != 0) {
                                        break L7;
                                      } else {
                                        if (var14 == 0) {
                                          continue L6;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: while (true) {
                                    L10: {
                                      if (~var13 > ~((na) this).field_g) {
                                        break L10;
                                      } else {
                                        var13 = var13 - ((na) this).field_g;
                                        if (var14 != 0) {
                                          break L7;
                                        } else {
                                          if (var14 == 0) {
                                            continue L9;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    param1[var10][var12] = new wi(((na) this).field_h, ((na) this).field_f, var11, var13);
                                    var12++;
                                    break L7;
                                  }
                                }
                                if (var14 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var10++;
                        if (var14 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_26_0 = (wi[][]) param1;
                  stackIn_27_0 = stackOut_26_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("na.DA(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L11;
            }
          }
          throw t.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_27_0;
    }

    private final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = 1 << param1;
          var4 = param0 & var3;
          if (var4 == 0) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_4_0 = stackOut_1_0;
            break L0;
          }
        }
        return stackIn_4_0 != 0;
    }

    private final int[] a(int param0, int[] param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] stackIn_7_0 = null;
        int[] stackIn_13_0 = null;
        int[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_14_0 = null;
        int[] stackOut_12_0 = null;
        int[] stackOut_6_0 = null;
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
              if (param0 < 0) {
                break L1;
              } else {
                if (param0 >= ((na) this).field_f) {
                  break L1;
                } else {
                  L2: {
                    if (param4 < 0) {
                      break L2;
                    } else {
                      if (param4 < ((na) this).field_h) {
                        param1 = this.a(param0, param1, param4, 72);
                        var6_int = this.a(param1, (byte) -47, param0);
                        var6_int = this.a(param2, var6_int, param4, param3 + param3);
                        param1[param0] = var6_int;
                        stackOut_14_0 = (int[]) param1;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_12_0 = (int[]) param1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              }
            }
            stackOut_6_0 = (int[]) param1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("na.F(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_15_0;
    }

    final void a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_29_0 = 0;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (~((na) this).field_d >= ~param1) {
                  break L1;
                } else {
                  L2: {
                    if (0 > param0) {
                      break L2;
                    } else {
                      if (~param0 > ~((na) this).field_g) {
                        L3: {
                          if (param2) {
                            break L3;
                          } else {
                            ((na) this).field_d = 38;
                            break L3;
                          }
                        }
                        var4_int = -1;
                        L4: while (true) {
                          stackOut_15_0 = -2;
                          stackIn_16_0 = stackOut_15_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (stackIn_16_0 > ~var4_int) {
                                  break L7;
                                } else {
                                  if (var7 != 0) {
                                    break L6;
                                  } else {
                                    L8: {
                                      if (var4_int + param1 < 0) {
                                        break L8;
                                      } else {
                                        L9: {
                                          if (((na) this).field_d > param1 + var4_int) {
                                            break L9;
                                          } else {
                                            if (var7 == 0) {
                                              break L8;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        var5 = ((na) this).field_g * (var4_int + param1);
                                        var6 = -1;
                                        L10: while (true) {
                                          if (1 < var6) {
                                            break L8;
                                          } else {
                                            stackOut_29_0 = var6 + param0;
                                            stackIn_16_0 = stackOut_29_0;
                                            stackIn_30_0 = stackOut_29_0;
                                            if (var7 != 0) {
                                              continue L5;
                                            } else {
                                              L11: {
                                                if (stackIn_30_0 < 0) {
                                                  break L11;
                                                } else {
                                                  if (var6 + param0 >= ((na) this).field_g) {
                                                    break L11;
                                                  } else {
                                                    ((na) this).field_r[var6 + param0 + var5] = true;
                                                    break L11;
                                                  }
                                                }
                                              }
                                              var6++;
                                              if (var7 == 0) {
                                                continue L10;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var4_int++;
                                    if (var7 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              break L6;
                            }
                            break L0;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.UA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wi var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = ((na) this).field_a.length;
            var5 = ((na) this).field_a[0].length;
            var6 = -((na) this).field_f + -param2;
            if (param1 == 1) {
              var7 = 0;
              L1: while (true) {
                stackOut_4_0 = ~var4_int;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 >= ~var7) {
                        break L4;
                      } else {
                        var6 = var6 + ((na) this).field_f;
                        var8 = -((na) this).field_h + -param0;
                        if (var13 != 0) {
                          break L3;
                        } else {
                          var9 = 0;
                          L5: while (true) {
                            L6: {
                              if (var9 >= var5) {
                                break L6;
                              } else {
                                var8 = var8 + ((na) this).field_h;
                                var10 = ((na) this).field_a[var7][var9];
                                stackOut_9_0 = var10.field_b;
                                stackIn_5_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var13 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    L8: {
                                      if (stackIn_10_0 < 0) {
                                        break L8;
                                      } else {
                                        if (~((na) this).field_d >= ~var10.field_b) {
                                          break L8;
                                        } else {
                                          stackOut_14_0 = 1;
                                          stackIn_17_0 = stackOut_14_0;
                                          break L7;
                                        }
                                      }
                                    }
                                    stackOut_16_0 = 0;
                                    stackIn_17_0 = stackOut_16_0;
                                    break L7;
                                  }
                                  L9: {
                                    var11 = stackIn_17_0;
                                    var12 = this.a(var10.field_b, -2981, var10.field_a, ((na) this).field_l);
                                    stackOut_17_0 = var11;
                                    stackIn_20_0 = stackOut_17_0;
                                    stackIn_18_0 = stackOut_17_0;
                                    if (((na) this).field_n == var12) {
                                      stackOut_20_0 = stackIn_20_0;
                                      stackOut_20_1 = 0;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      break L9;
                                    } else {
                                      stackOut_18_0 = stackIn_18_0;
                                      stackOut_18_1 = 1;
                                      stackIn_21_0 = stackOut_18_0;
                                      stackIn_21_1 = stackOut_18_1;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    L11: {
                                      var11 = stackIn_21_0 & stackIn_21_1;
                                      if (var11 != 0) {
                                        break L11;
                                      } else {
                                        if (var13 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var10.field_e.e(var8, var6);
                                    break L10;
                                  }
                                  var9++;
                                  if (var13 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var7++;
                            if (var13 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, gi param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gi var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (null == param1.field_n) {
              return;
            } else {
              L1: {
                L2: {
                  L3: {
                    if (param1.field_f != 0) {
                      break L3;
                    } else {
                      if (param1.field_h != 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 0;
                  L4: while (true) {
                    if (hf.field_b <= var2_int) {
                      break L2;
                    } else {
                      var3 = qm.field_d[var2_int];
                      stackOut_12_0 = var3.field_a;
                      stackOut_12_1 = 2;
                      stackIn_25_0 = stackOut_12_0;
                      stackIn_25_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (stackIn_13_0 != stackIn_13_1) {
                            break L5;
                          } else {
                            if (~param1.field_f != ~var3.field_f) {
                              break L5;
                            } else {
                              if (~var3.field_h != ~param1.field_h) {
                                break L5;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_24_0 = param0;
                stackOut_24_1 = 19956;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L1;
              }
              L6: {
                if (stackIn_25_0 == stackIn_25_1) {
                  break L6;
                } else {
                  field_b = -79;
                  break L6;
                }
              }
              L7: {
                if (null == param1.field_k) {
                  break L7;
                } else {
                  break L7;
                }
              }
              vi.a(param1, 3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("na.C(").append(param0).append(',');
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
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    private final void a(int param0, boolean[] param1, int param2, boolean[][] param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var7_int <= ~param2) {
                    break L3;
                  } else {
                    var8 = param1[var7_int - -param0] ? 1 : 0;
                    param3[param0 + var7_int][param5] = var8 != 0;
                    var7_int++;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param4 == -23372) {
                  break L2;
                } else {
                  int discarded$3 = this.a(48, -27, (int[]) null);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("na.LA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void e(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = ((na) this).field_h * ((na) this).field_g;
            var7 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 >= 0) {
                    break L3;
                  } else {
                    var7 = var7 + var6;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: while (true) {
                  L5: {
                    if (~var6 < ~var7) {
                      break L5;
                    } else {
                      var7 = var7 - var6;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        if (var12 == 0) {
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var4_int = var7 / ((na) this).field_h;
                  var5 = var7 % ((na) this).field_h;
                  break L2;
                }
              }
              var8 = 0;
              var9 = 0;
              var10 = ((na) this).field_d * ((na) this).field_f;
              var11 = param2;
              L6: while (true) {
                L7: {
                  L8: {
                    L9: {
                      if (0 <= var11) {
                        break L9;
                      } else {
                        var8 = var8 - ((na) this).field_d;
                        var11 = var11 + var10;
                        if (var12 != 0) {
                          break L8;
                        } else {
                          if (var12 == 0) {
                            continue L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (param2 < 0) {
                      break L8;
                    } else {
                      var8 = var11 / ((na) this).field_f;
                      if (var12 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var8 = var8 + var11 / ((na) this).field_f;
                  break L7;
                }
                L10: {
                  var9 = var11 % ((na) this).field_f;
                  this.a(false, param2);
                  ((na) this).field_p = this.a(param0 + -640, ((na) this).field_p, var4_int, false, var8);
                  this.a((byte) -66, ((na) this).field_p, var4_int, var8);
                  this.a((byte) 122, var8, var4_int);
                  this.a(var9, var5, (byte) 110);
                  ((na) this).field_a = this.a(0, ((na) this).field_a, var4_int, true, var8);
                  this.a((byte) -66, ((na) this).field_a, var4_int, var8);
                  this.b((byte) 89, var8, var4_int);
                  this.a(var5, (byte) 1, var9);
                  this.a(param0 ^ -744, var8, var9);
                  if (param0 == 640) {
                    break L10;
                  } else {
                    int discarded$1 = na.a(93, -16, 127, -111);
                    break L10;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              em.a(((na) this).field_c);
              em.f(0, param0, 639, 479);
              ((na) this).field_y[0].e(0, 0);
              if (param1 == 104) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            em.b(((na) this).field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "na.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean f(int param0) {
        return param0 == -1;
    }

    private final boolean d(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                break L1;
              } else {
                if (~((na) this).field_d < ~param0) {
                  L2: {
                    if (param1 == 2) {
                      break L2;
                    } else {
                      this.b(-80, 10, -58);
                      break L2;
                    }
                  }
                  L3: {
                    if (param2 < 0) {
                      break L3;
                    } else {
                      if (~((na) this).field_g >= ~param2) {
                        break L3;
                      } else {
                        stackOut_17_0 = ((na) this).field_r[param2 + param0 * ((na) this).field_g];
                        stackIn_18_0 = stackOut_17_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final static String a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            if (!param1) {
              var3 = new char[var2_int];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (~var2_int >= ~var4) {
                    break L2;
                  } else {
                    var3[-1 + (var2_int + -var4)] = param0.charAt(var4);
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = new String(var3);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("na.FB(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wi var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = ((na) this).field_p.length;
            var5 = ((na) this).field_p[0].length;
            var6 = 47 % ((param0 - 75) / 36);
            var7 = 0;
            L1: while (true) {
              stackOut_2_0 = var7;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= var4_int) {
                      break L4;
                    } else {
                      if (var13 != 0) {
                        break L3;
                      } else {
                        var8 = 0;
                        L5: while (true) {
                          L6: {
                            if (~var8 <= ~var5) {
                              break L6;
                            } else {
                              var9 = param1 + var7;
                              stackOut_7_0 = var8 + param2;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var13 != 0) {
                                continue L2;
                              } else {
                                var10 = stackIn_8_0;
                                L7: while (true) {
                                  L8: {
                                    L9: {
                                      if (var10 >= 0) {
                                        break L9;
                                      } else {
                                        var10 = var10 + ((na) this).field_g;
                                        if (var13 != 0) {
                                          break L8;
                                        } else {
                                          if (var13 == 0) {
                                            continue L7;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    L10: while (true) {
                                      if (((na) this).field_g > var10) {
                                        break L8;
                                      } else {
                                        var10 = var10 - ((na) this).field_g;
                                        if (var13 != 0) {
                                          continue L5;
                                        } else {
                                          if (var13 == 0) {
                                            continue L10;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    L12: {
                                      var11 = ((na) this).field_p[var7][var8];
                                      var12 = this.d(var9, 2, var10) ? 1 : 0;
                                      var12 = var12 != 0 | var11.field_g ? 1 : 0;
                                      if (var12 != 0) {
                                        break L12;
                                      } else {
                                        if (var13 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var11.field_a = var10;
                                    var11.field_b = var9;
                                    this.a(var9, ((na) this).field_v, 1, 0, var11.field_e.field_B, var10);
                                    var11.field_g = false;
                                    break L11;
                                  }
                                  var8++;
                                  if (var13 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var7++;
                          if (var13 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] a(boolean[][] param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 14 % ((58 - param1) / 57);
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = var5;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 >= ((na) this).field_f) {
                    break L3;
                  } else {
                    var6 = this.a(param2, (byte) 108, var5);
                    var7 = 0;
                    L4: while (true) {
                      L5: {
                        if (((na) this).field_h <= var7) {
                          break L5;
                        } else {
                          var8 = this.a(var6, var7) ? 1 : 0;
                          var9 = this.a(var7, param0, var5, (byte) 110);
                          var10 = this.a(var9, false) ? 1 : 0;
                          stackOut_6_0 = this.a(var10 != 0, var8 != 0, 0);
                          stackIn_3_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var11 != 0) {
                            continue L2;
                          } else {
                            L6: {
                              L7: {
                                if (stackIn_7_0) {
                                  break L7;
                                } else {
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              param2 = this.a(var5, param2, var10 != 0, 0, var7);
                              break L6;
                            }
                            var7++;
                            if (var11 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var5++;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_14_0 = (int[]) param2;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("na.G(");
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
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        param3 = param3 - 1;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((na) this).field_h) {
            return;
          } else {
            L1: {
              param3++;
              if (!this.c(param1, var5)) {
                param2[param3] = param0;
                break L1;
              } else {
                break L1;
              }
            }
            var5++;
            continue L0;
          }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wi var11 = null;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 > 62) {
                break L1;
              } else {
                boolean discarded$1 = this.a(94, 29);
                break L1;
              }
            }
            var4_int = ((na) this).field_a.length;
            var5 = ((na) this).field_a[0].length;
            var6 = 0;
            L2: while (true) {
              stackOut_5_0 = ~var6;
              stackIn_6_0 = stackOut_5_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 <= ~var4_int) {
                      break L5;
                    } else {
                      if (var12 != 0) {
                        break L4;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          L7: {
                            if (~var5 >= ~var7) {
                              break L7;
                            } else {
                              var8 = var6 - -param1;
                              stackOut_10_0 = var7 - -param2;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var12 != 0) {
                                continue L3;
                              } else {
                                var9 = stackIn_11_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      if (0 <= var9) {
                                        break L10;
                                      } else {
                                        var9 = var9 + ((na) this).field_g;
                                        if (var12 != 0) {
                                          break L9;
                                        } else {
                                          if (var12 == 0) {
                                            continue L8;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                    L11: while (true) {
                                      if (var9 < ((na) this).field_g) {
                                        break L9;
                                      } else {
                                        var9 = var9 - ((na) this).field_g;
                                        if (var12 != 0) {
                                          continue L6;
                                        } else {
                                          if (var12 == 0) {
                                            continue L11;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    var10 = this.d(var8, 2, var9) ? 1 : 0;
                                    if (var10 == 0) {
                                      break L12;
                                    } else {
                                      this.c((byte) 105, var9, var8);
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    var11 = ((na) this).field_a[var6][var7];
                                    var10 = var10 != 0 | var11.field_g ? 1 : 0;
                                    if (var10 == 0) {
                                      break L13;
                                    } else {
                                      var11.field_a = var9;
                                      var11.field_b = var8;
                                      this.a(var8, ((na) this).field_l, ((na) this).field_z, 0, var11.field_e.field_B, var9);
                                      var11.field_g = false;
                                      break L13;
                                    }
                                  }
                                  var7++;
                                  if (var12 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var6++;
                          if (var12 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (~((na) this).field_h >= ~param2) {
                  break L1;
                } else {
                  L2: {
                    var5_int = 1 << param2;
                    var6 = ~var5_int;
                    if (param3 == 0) {
                      break L2;
                    } else {
                      ((na) this).field_n = null;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var7 = param1 & var6;
                      if (!param0) {
                        break L4;
                      } else {
                        param1 = var7 | var5_int;
                        if (EscapeVector.field_A == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param1 = var7;
                    break L3;
                  }
                  stackOut_14_0 = param1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = param1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var5, "na.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    private final boolean a(boolean[] param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                this.a((wi[][]) null, (byte) 54);
                break L1;
              }
            }
            if (!param0[4]) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              if (param0[1]) {
                if (param0[3]) {
                  if (!param0[5]) {
                    stackOut_17_0 = 1;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  } else {
                    if (param0[7]) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0 != 0;
                    }
                  }
                } else {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              } else {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("na.WA(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L2;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final void a(int[] param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                na.a(-40, (gi) null);
                break L1;
              }
            }
            var4_int = param2.length / 8;
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var6 <= ~var4_int) {
                    break L4;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        int incrementValue$8 = var5;
                        var5++;
                        if (0 == param0[incrementValue$8]) {
                          param2[var5 + -1] = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        int incrementValue$9 = var5;
                        var5++;
                        if (param0[incrementValue$9] == 0) {
                          param2[var5 + -1] = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        int incrementValue$10 = var5;
                        var5++;
                        if (param0[incrementValue$10] == 0) {
                          param2[-1 + var5] = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        int incrementValue$11 = var5;
                        var5++;
                        if (param0[incrementValue$11] != 0) {
                          break L8;
                        } else {
                          param2[var5 + -1] = 0;
                          break L8;
                        }
                      }
                      L9: {
                        int incrementValue$12 = var5;
                        var5++;
                        if (param0[incrementValue$12] != 0) {
                          break L9;
                        } else {
                          param2[var5 - 1] = 0;
                          break L9;
                        }
                      }
                      L10: {
                        int incrementValue$13 = var5;
                        var5++;
                        if (0 != param0[incrementValue$13]) {
                          break L10;
                        } else {
                          param2[var5 + -1] = 0;
                          break L10;
                        }
                      }
                      L11: {
                        int incrementValue$14 = var5;
                        var5++;
                        if (param0[incrementValue$14] == 0) {
                          param2[-1 + var5] = 0;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        int incrementValue$15 = var5;
                        var5++;
                        if (0 != param0[incrementValue$15]) {
                          break L12;
                        } else {
                          param2[-1 + var5] = 0;
                          break L12;
                        }
                      }
                      var6++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var4;
            stackOut_39_1 = new StringBuilder().append("na.HA(");
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L13;
            }
          }
          L14: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param1).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L14;
            }
          }
          throw t.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ')');
        }
    }

    private final boolean[] a(int param0, boolean[][] param1, int param2, byte param3) {
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
        boolean[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_int = 3;
              var6 = 3;
              if (param3 > 84) {
                break L1;
              } else {
                this.c(65, -13, 112);
                break L1;
              }
            }
            var7 = param2 - -1 + -1;
            var8 = 1 + (param0 + -1);
            var9 = 0;
            L2: while (true) {
              L3: {
                if (var6 <= var9) {
                  break L3;
                } else {
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var5_int <= var10) {
                          break L6;
                        } else {
                          var11 = param1[var7 + var9][var8 + var10] ? 1 : 0;
                          var12 = var9 * var5_int - -var10;
                          ((na) this).field_k[var12] = var11 != 0;
                          var10++;
                          if (var13 != 0) {
                            break L5;
                          } else {
                            if (var13 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var9++;
                      break L5;
                    }
                    if (var13 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_14_0 = ((na) this).field_k;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("na.PA(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    final static void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            vj.a((byte) -116, jf.field_J, param0, oa.field_t, true, vl.field_e, param1);
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~jf.field_J >= ~var2_int) {
                    break L3;
                  } else {
                    cd.field_q[var2_int + param0] = var2_int;
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                vj.a((byte) -128, jf.field_J + param0, param0 + param0, pl.field_r, false, pg.field_d, param0);
                break L2;
              }
              L4: {
                if (~jf.field_J >= ~param0) {
                  break L4;
                } else {
                  jf.field_J = param0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "na.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int[][] param1, int param2, int param3, int[] param4, int param5) {
        RuntimeException runtimeException = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var7 = this.a(param0, param3 + -2981, param5, param1);
            this.a(param4, param3);
            if (((na) this).field_n != var7) {
              var8 = -((na) this).field_h;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 >= ((na) this).field_f) {
                      break L3;
                    } else {
                      var8 = var8 + ((na) this).field_h;
                      var10 = this.a(var7, (byte) 89, var9);
                      var11 = this.a(var10) ? 1 : 0;
                      if (var13 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (var11 == 0) {
                              break L5;
                            } else {
                              if (var13 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var12 = this.f(var10) ? 1 : 0;
                            if (var12 != 0) {
                              this.a(param2, param4, var8);
                              if (var13 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          this.a(param2, var10, param4, var8);
                          break L4;
                        }
                        var9++;
                        if (var13 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("na.QA(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param5 + ')');
        }
    }

    private final void a(wi[][] param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 117 / ((30 - param2) / 52);
            var5 = param0[0][0].field_b;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (~var5 <= ~param1) {
                      break L4;
                    } else {
                      var5++;
                      this.a(param0, 0);
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: while (true) {
                    if (param1 >= var5) {
                      break L3;
                    } else {
                      var5--;
                      this.a(param0, (byte) 122);
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L5;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("na.EB(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] a(int param0, int param1, int param2, int[][] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] stackIn_5_0 = null;
        int[] stackIn_10_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_24_0 = null;
        int[] stackIn_29_0 = null;
        Object stackIn_32_0 = null;
        int[] stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_9_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int[] stackOut_23_0 = null;
        int[] stackOut_28_0 = null;
        int[] stackOut_33_0 = null;
        Object stackOut_31_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 < 0) {
              stackOut_4_0 = ((na) this).field_n;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (~param0 <= ~((na) this).field_d) {
                stackOut_9_0 = ((na) this).field_x;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (((na) this).field_g > param2) {
                          break L4;
                        } else {
                          param2 = param2 - ((na) this).field_g;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L5: while (true) {
                        if (param2 >= 0) {
                          break L3;
                        } else {
                          stackOut_17_0 = param2 + ((na) this).field_g;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var6 != 0) {
                            break L2;
                          } else {
                            param2 = stackIn_18_0;
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_19_0 = param2 + ((na) this).field_g * param0;
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  }
                  var5_int = stackIn_20_0;
                  if (0 > var5_int) {
                    stackOut_23_0 = ((na) this).field_n;
                    stackIn_24_0 = stackOut_23_0;
                    return stackIn_24_0;
                  } else {
                    if (~var5_int <= ~param3.length) {
                      stackOut_28_0 = ((na) this).field_n;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0;
                    } else {
                      if (param1 == -2981) {
                        stackOut_33_0 = param3[var5_int];
                        stackIn_34_0 = stackOut_33_0;
                        break L0;
                      } else {
                        stackOut_31_0 = null;
                        stackIn_32_0 = stackOut_31_0;
                        return (int[]) (Object) stackIn_32_0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var5;
            stackOut_35_1 = new StringBuilder().append("na.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_34_0;
    }

    private final boolean a(boolean param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = param1 ^ param0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              var3_int = 640;
              var4 = 480;
              var5 = (ma.field_a.field_M >> 232318832) % var3_int;
              em.a(((na) this).field_c);
              var6 = param1 % var4;
              ((na) this).field_y[0].g();
              this.b(-126, var5, var6);
              if (!param0) {
                break L1;
              } else {
                ((na) this).a(98, 82, true);
                break L1;
              }
            }
            L2: {
              var7 = -var5 + var3_int;
              var8 = -var6 + var4;
              var9 = 0;
              var10 = var7;
              var11 = 0;
              var12 = var8;
              var13 = -var5;
              var14 = -var6;
              if (var5 < 0) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            var15 = stackIn_7_0;
            em.f(var9, var11, var10, var12);
            dj.a(var14, -24, var13);
            em.f(var7 * var15 + var9, var11, var10 - -(var5 * var15), var12);
            dj.a(var14, -123, var13 + var15 * var3_int);
            em.f(var9, var11 - -var8, var10, var6 + var12);
            dj.a(var14 + var4, -127, var13);
            em.f(var9 - -(var7 * var15), var11 - -var8, var10 - -(var5 * var15), var12 - -var6);
            dj.a(var14 + var4, -94, var3_int * var15 + var13);
            md.field_D.a(107);
            em.b(((na) this).field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "na.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int[][] param0, byte param1, boolean[][] param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4 = param0[1];
            var5 = this.a(var4, (byte) 121, -1 + ((na) this).field_f);
            this.a(1, -1, 0, ((na) this).field_h, var5, param2[0]);
            var7 = 102 / ((param1 - -63) / 41);
            var6 = param0[7];
            var8 = this.a(var6, (byte) -81, 0);
            this.a(1, -1, 0, ((na) this).field_h, var8, param2[1 + ((na) this).field_f]);
            var9 = param0[3];
            var10 = this.a(-103, ((na) this).field_h - 1, var9);
            this.a(1, -1, 0, ((na) this).field_f, var10, ((na) this).field_e);
            this.a(1, ((na) this).field_e, ((na) this).field_f, param2, -23372, 0);
            var11 = param0[5];
            var12 = this.a(-95, 0, var11);
            this.a(1, -1, 0, ((na) this).field_f, var12, ((na) this).field_e);
            this.a(1, ((na) this).field_e, ((na) this).field_f, param2, -23372, 1 + ((na) this).field_h);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("na.DB(");
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void a(boolean param0, wi[][] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        wi var6 = null;
        int var7_int = 0;
        wi var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param1.length;
            if (!param0) {
              var4 = param1[0].length;
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3_int >= ~var5) {
                      break L3;
                    } else {
                      var6 = param1[var5][var4 - 1];
                      var6.field_g = true;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        var7_int = -1 + var4;
                        L4: while (true) {
                          L5: {
                            if (var7_int <= 0) {
                              break L5;
                            } else {
                              param1[var5][var7_int] = param1[var5][-1 + var7_int];
                              var7_int--;
                              if (var9 != 0) {
                                continue L1;
                              } else {
                                if (var9 == 0) {
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var7 = param1[var5][1];
                          var6.field_b = var7.field_b;
                          var8 = var7.field_a + -1;
                          L6: while (true) {
                            L7: {
                              L8: {
                                if (var8 >= 0) {
                                  break L8;
                                } else {
                                  var8 = var8 + ((na) this).field_g;
                                  if (var9 != 0) {
                                    break L7;
                                  } else {
                                    if (var9 == 0) {
                                      continue L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var6.field_a = var8;
                              param1[var5][0] = var6;
                              var5++;
                              break L7;
                            }
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            runtimeException = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) runtimeException;
            stackOut_19_1 = new StringBuilder().append("na.KB(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    private final void a(byte param0, wi[][] param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              this.a((byte) -3, param1, param2);
              if (param0 == -66) {
                break L1;
              } else {
                ((na) this).field_o = 10;
                break L1;
              }
            }
            this.a(param1, param3, (byte) -40);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("na.O(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int[][] param1, boolean[][] param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        byte stackOut_12_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var4 = param1[4];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5 <= ~((na) this).field_f) {
                    break L3;
                  } else {
                    var6 = this.a(var4, (byte) 111, var5);
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var7 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (((na) this).field_h <= var7) {
                              break L6;
                            } else {
                              var8 = this.a(var6, var7) ? 1 : 0;
                              param2[1 + var5][1 + var7] = var8 != 0;
                              var7++;
                              if (var9 != 0) {
                                break L5;
                              } else {
                                if (var9 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5++;
                          break L5;
                        }
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = param0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              L7: {
                if (stackIn_13_0 == 121) {
                  break L7;
                } else {
                  int[] discarded$3 = this.a(97, (int[]) null, -32, 39);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) runtimeException;
            stackOut_17_1 = new StringBuilder().append("na.AB(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    private final void a(byte param0, wi[][] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = ((na) this).field_g / 2;
              var5 = param1[0][0].field_a;
              var6 = -var5 + param2;
              if (0 <= var6) {
                break L1;
              } else {
                var6 = var6 + ((na) this).field_g;
                break L1;
              }
            }
            L2: {
              if (var5 <= param2) {
                break L2;
              } else {
                if (var4_int >= var6) {
                  var5 = var5 - ((na) this).field_g;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (param2 <= var5) {
                    break L5;
                  } else {
                    if (var4_int < var6) {
                      break L5;
                    } else {
                      this.b(param1, 7);
                      var5++;
                      L6: while (true) {
                        if (~var5 > ~((na) this).field_g) {
                          continue L3;
                        } else {
                          var5 = var5 - ((na) this).field_g;
                          if (var7 != 0) {
                            break L4;
                          } else {
                            if (var7 != 0) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                continue L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (param0 == -3) {
                    break L7;
                  } else {
                    ((na) this).field_q = -127;
                    break L7;
                  }
                }
                var6 = var5 + -param2;
                break L4;
              }
              L8: {
                if (var6 >= 0) {
                  break L8;
                } else {
                  var6 = ((na) this).field_g - -var6;
                  break L8;
                }
              }
              L9: {
                if (var5 >= param2) {
                  break L9;
                } else {
                  if (var4_int < var6) {
                    break L9;
                  } else {
                    var5 = var5 + ((na) this).field_g;
                    break L9;
                  }
                }
              }
              L10: while (true) {
                L11: {
                  L12: {
                    if (~param2 <= ~var5) {
                      break L12;
                    } else {
                      if (var4_int < var6) {
                        break L12;
                      } else {
                        this.a(false, param1);
                        var5--;
                        L13: while (true) {
                          if (var5 >= 0) {
                            continue L10;
                          } else {
                            var5 = var5 + ((na) this).field_g;
                            if (var7 != 0) {
                              break L12;
                            } else {
                              if (var7 != 0) {
                                break L11;
                              } else {
                                if (var7 == 0) {
                                  continue L13;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L11;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var4;
            stackOut_46_1 = new StringBuilder().append("na.HB(").append(param0).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L14;
            }
          }
          throw t.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var12 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4 = ((na) this).field_u;
              if ((param1 & 1 ^ 1 & param2) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var5 = stackIn_5_0;
                var7 = -39 % ((param0 - 74) / 47);
                if (var5 == 0) {
                  break L3;
                } else {
                  var4[0] = ((na) this).field_q;
                  var4[1] = ((na) this).field_o;
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4[1] = ((na) this).field_q;
              var4[0] = ((na) this).field_o;
              break L2;
            }
            var6 = em.field_i;
            var8 = 640;
            var9 = 480;
            var10 = var8 * var9;
            var11 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (~var10 >= ~var11) {
                    break L6;
                  } else {
                    var6[var11] = var4[ae.a(var11, 1)];
                    var11++;
                    if (var12 != 0) {
                      break L5;
                    } else {
                      if (var12 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "na.IB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                String discarded$2 = na.a((String) null, true);
                break L1;
              }
            }
            var7_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param3 >= ~var7_int) {
                    break L4;
                  } else {
                    var8 = this.a(param4, param2 + var7_int) ? 1 : 0;
                    param5[param0 + var7_int] = var8 != 0;
                    var7_int++;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("na.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var4_int = param0 + param1;
            var5 = -param3 + param2;
            var6 = var5 / var4_int;
            stackOut_0_0 = var6;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(wi[][] param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wi var7 = null;
        int var8_int = 0;
        wi var8 = null;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length;
            var4 = param0[0].length;
            var5 = -89 / ((param1 - 76) / 43);
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6 <= ~var4) {
                    break L3;
                  } else {
                    var7 = param0[-1 + var3_int][var6];
                    var7.field_g = true;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      var8_int = var3_int - 1;
                      L4: while (true) {
                        L5: {
                          if (var8_int <= 0) {
                            break L5;
                          } else {
                            param0[var8_int][var6] = param0[-1 + var8_int][var6];
                            var8_int--;
                            if (var9 != 0) {
                              continue L1;
                            } else {
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var8 = param0[1][var6];
                        var7.field_a = var8.field_a;
                        var7.field_b = var8.field_b + -1;
                        param0[0][var6] = var7;
                        var6++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("na.SA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param2 != ((na) this).field_x) {
              if (((na) this).field_n != param2) {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (param1 >= ((na) this).field_f) {
                      break L1;
                    } else {
                      L2: {
                        if (param0 <= -88) {
                          break L2;
                        } else {
                          ((na) this).field_d = 1;
                          break L2;
                        }
                      }
                      var4_int = 0;
                      var5 = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            if (((na) this).field_f <= var5) {
                              break L5;
                            } else {
                              var6 = this.a(param2, (byte) -83, var5);
                              var7 = this.a(var6, param1) ? 1 : 0;
                              stackOut_20_0 = var7;
                              stackIn_30_0 = stackOut_20_0;
                              stackIn_21_0 = stackOut_20_0;
                              if (var9 != 0) {
                                break L4;
                              } else {
                                L6: {
                                  L7: {
                                    if (stackIn_21_0 != 0) {
                                      break L7;
                                    } else {
                                      if (var9 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var8 = 1 << var5;
                                  var4_int = var8 | var4_int;
                                  break L6;
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          stackOut_29_0 = var4_int;
                          stackIn_30_0 = stackOut_29_0;
                          break L4;
                        }
                        break L0;
                      }
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("na.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_30_0;
    }

    private final void b(wi[][] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wi var7 = null;
        int var8_int = 0;
        wi var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length;
            var4 = param0[0].length;
            var6 = -81 / ((param1 - 56) / 48);
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3_int >= ~var5) {
                    break L3;
                  } else {
                    var7 = param0[var5][0];
                    var7.field_g = true;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      var8_int = 0;
                      L4: while (true) {
                        L5: {
                          if (var8_int >= -1 + var4) {
                            break L5;
                          } else {
                            param0[var5][var8_int] = param0[var5][var8_int - -1];
                            var8_int++;
                            if (var10 != 0) {
                              continue L1;
                            } else {
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var8 = param0[var5][-2 + var4];
                        var7.field_b = var8.field_b;
                        var9 = 1 + var8.field_a;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (var9 < ((na) this).field_g) {
                                break L8;
                              } else {
                                var9 = var9 - ((na) this).field_g;
                                if (var10 != 0) {
                                  break L7;
                                } else {
                                  if (var10 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var7.field_a = var9;
                            param0[var5][-1 + var4] = var7;
                            var5++;
                            break L7;
                          }
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("na.BB(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final void a(int[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length <= var3_int) {
                    break L3;
                  } else {
                    param0[var3_int] = 0;
                    var3_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("na.E(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0, int param1, int param2) {
        int[] var5 = null;
        boolean[][] var6 = null;
        int[][] var4 = this.a(param2, ((na) this).field_v, false, param1);
        if (param0 < 103) {
            return;
        }
        try {
            var5 = this.a(param2, -2981, param1, ((na) this).field_l);
            var6 = this.a(0, var4);
            var5 = this.a(var6, 115, var5);
            ((na) this).field_l[param1 + param2 * ((na) this).field_g] = var5;
            this.c(param1, -1, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "na.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static dk[] a(int param0, int[] param1, int param2, int param3, ih param4, String[] param5, int[] param6, boolean param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dk[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        dk var17 = null;
        int var18 = 0;
        dk[] stackIn_6_0 = null;
        dk[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk[] stackOut_5_0 = null;
        dk[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var18 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var9_int = 3;
              var10 = param1.length;
              var11 = jd.a(param4, (byte) -121, param5);
              var12 = na.a(1, var10, param0, var11);
              var13 = dd.a(var11, (byte) 122, param0, var10, var12);
              var14 = new dk[var10];
              var15 = 0;
              if (!param7) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (~var15 <= ~var10) {
                    break L4;
                  } else {
                    var16 = ji.a(var12, param4, param5, var13, var15, param3, 0);
                    var17 = new dk(var9_int, param1[var15], param5[var15], param8[var15], param6[var15], param4);
                    var17.b((byte) 114, var16, param2);
                    stackOut_5_0 = (dk[]) var14;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var18 != 0) {
                      break L3;
                    } else {
                      stackIn_6_0[var15] = var17;
                      var15++;
                      if (var18 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_9_0 = (dk[]) var14;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var9;
            stackOut_11_1 = new StringBuilder().append("na.J(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param6 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param7).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param8 == null) {
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
          throw t.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
        return stackIn_10_0;
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= ((na) this).field_d) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var3 >= ((na) this).field_g) {
                              break L6;
                            } else {
                              this.c((byte) 107, var3, var2_int);
                              var3++;
                              if (var4 != 0) {
                                break L5;
                              } else {
                                if (var4 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L5;
                        }
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "na.R(" + param0 + ')');
        }
    }

    private final boolean a(int param0) {
        return param0 == 0;
    }

    private final void a(wi[][] param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        wi var6 = null;
        int var7_int = 0;
        wi var7 = null;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length;
            var4 = param0[param1].length;
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5 <= ~var4) {
                    break L3;
                  } else {
                    var6 = param0[0][var5];
                    var6.field_g = true;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      var7_int = 0;
                      L4: while (true) {
                        L5: {
                          if (var3_int - 1 <= var7_int) {
                            break L5;
                          } else {
                            param0[var7_int][var5] = param0[var7_int - -1][var5];
                            var7_int++;
                            if (var8 != 0) {
                              continue L1;
                            } else {
                              if (var8 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var7 = param0[-2 + var3_int][var5];
                        var6.field_b = var7.field_b + 1;
                        var6.field_a = var7.field_a;
                        param0[-1 + var3_int][var5] = var6;
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
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("na.P(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (~((na) this).field_d < ~param2) {
                  L2: {
                    if (~param0 > param1) {
                      break L2;
                    } else {
                      if (~param0 <= ~((na) this).field_g) {
                        break L2;
                      } else {
                        ((na) this).field_r[param2 * ((na) this).field_g - -param0] = false;
                        break L0;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "na.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int stackIn_4_0 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_21_0 = 0;
        int[] stackIn_25_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int[] stackOut_6_0 = null;
        byte stackOut_20_0 = 0;
        int[] stackOut_24_0 = null;
        var14 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 640;
            em.a(((na) this).field_c);
            var5 = 480;
            ((na) this).field_y[1].g();
            em.f(0, 0, var4_int, var5);
            em.d();
            var6 = ((na) this).field_p.length;
            var7 = ((na) this).field_p[0].length;
            var8 = -((na) this).field_f + -param0;
            var9 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (~var9 <= ~var6) {
                      break L4;
                    } else {
                      var8 = var8 + ((na) this).field_f;
                      var10 = -param1 + -((na) this).field_h;
                      stackOut_3_0 = 0;
                      stackIn_21_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var14 != 0) {
                        break L3;
                      } else {
                        var11 = stackIn_4_0;
                        L5: while (true) {
                          L6: {
                            if (var11 >= var7) {
                              break L6;
                            } else {
                              var10 = var10 + ((na) this).field_h;
                              var12 = ((na) this).field_p[var9][var11];
                              var13 = this.a(var12.field_b, -2981, var12.field_a, ((na) this).field_v);
                              stackOut_6_0 = ((na) this).field_n;
                              stackIn_25_0 = stackOut_6_0;
                              stackIn_7_0 = stackOut_6_0;
                              if (var14 != 0) {
                                break L2;
                              } else {
                                L7: {
                                  if (stackIn_7_0 == var13) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var13 == ((na) this).field_x) {
                                        em.a(var10, var8, ((na) this).field_h, ((na) this).field_f, 1);
                                        if (var14 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var12.field_e.d(var10, var8);
                                    break L7;
                                  }
                                }
                                var11++;
                                if (var14 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var9++;
                          if (var14 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_20_0 = param2;
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                }
                L9: {
                  if (stackIn_21_0 > 102) {
                    break L9;
                  } else {
                    this.a((int[][]) null, (byte) 106, (boolean[][]) null);
                    break L9;
                  }
                }
                md.field_D.a(126);
                stackOut_24_0 = ((na) this).field_c;
                stackIn_25_0 = stackOut_24_0;
                break L2;
              }
              em.b(stackIn_25_0);
              this.a(((na) this).field_y[1].field_B, true, ((na) this).field_y[0].field_B);
              ((na) this).field_y[0].e(0, 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var4, "na.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int[] a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_6_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (((na) this).field_x == param1) {
                break L1;
              } else {
                if (((na) this).field_n == param1) {
                  break L1;
                } else {
                  stackOut_5_0 = (int[]) param1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              }
            }
            L2: {
              var6 = 67 / ((-63 - param3) / 62);
              var5_int = 0;
              if (((na) this).field_x == param1) {
                var5_int = -1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((na) this).field_n == param1) {
                var5_int = 0;
                break L3;
              } else {
                break L3;
              }
            }
            param1 = new int[((na) this).field_f];
            var7 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (~param1.length >= ~var7) {
                    break L6;
                  } else {
                    stackOut_17_0 = (int[]) param1;
                    stackIn_22_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var8 != 0) {
                      break L5;
                    } else {
                      stackIn_18_0[var7] = var5_int;
                      var7++;
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackOut_21_0 = (int[]) param1;
                stackIn_22_0 = stackOut_21_0;
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("na.H(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_22_0;
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            ((na) this).field_y = new ed[2];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2_int <= ~((na) this).field_y.length) {
                    break L3;
                  } else {
                    ((na) this).field_y[var2_int] = new ed(640, 480);
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 >= 48) {
                  break L2;
                } else {
                  ((na) this).field_B = 101;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "na.NA(" + param0 + ')');
        }
    }

    private final int[][] a(int param0, int[][] param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object stackIn_3_0 = null;
        int[][] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var5_int = 3;
            var6 = 3;
            var7 = -1 + param0;
            var8 = -1 + param3;
            var9 = 0;
            if (!param2) {
              L1: while (true) {
                L2: {
                  if (~var9 <= ~var6) {
                    break L2;
                  } else {
                    var10 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var10 >= var5_int) {
                            break L5;
                          } else {
                            var11 = this.a(var9 + var7, -2981, var8 - -var10, param1);
                            var12 = var10 + var5_int * var9;
                            ((na) this).field_s[var12] = var11;
                            var10++;
                            if (var13 != 0) {
                              break L4;
                            } else {
                              if (var13 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var9++;
                        break L4;
                      }
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_13_0 = ((na) this).field_s;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (int[][]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("na.JB(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    na(int[][] param0, int[] param1, int[] param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((na) this).field_B = 1458707;
        ((na) this).field_f = 32;
        ((na) this).field_u = new int[2];
        ((na) this).field_j = new int[]{199169, 0};
        ((na) this).field_o = 199169;
        ((na) this).field_h = 32;
        ((na) this).field_z = 2917671;
        ((na) this).field_q = 597511;
        try {
          L0: {
            ((na) this).field_n = param2;
            ((na) this).field_x = param1;
            ((na) this).field_g = param3;
            ((na) this).field_d = param4;
            ((na) this).field_v = param0;
            ((na) this).field_l = this.e(1);
            ((na) this).field_e = new boolean[2 + ((na) this).field_f];
            ((na) this).field_k = new boolean[9];
            ((na) this).field_s = new int[9][];
            ((na) this).field_r = new boolean[((na) this).field_d * ((na) this).field_g];
            ((na) this).field_A = new boolean[((na) this).field_f + 2][2 + ((na) this).field_h];
            this.b(0);
            this.c(96);
            ((na) this).field_c = new int[4];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var6;
            stackOut_3_1 = new StringBuilder().append("na.<init>(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_t = " - fire rock buster";
        field_m = "Highscores";
        field_i = new int[]{11, 14, 15, 16, 17, 18};
    }
}
