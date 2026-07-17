/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends ae {
    private int field_i;
    private int field_o;
    static int field_p;
    private int field_k;
    static ja field_j;
    private int field_q;
    private int field_l;
    private int field_n;
    static int field_m;

    final static void a(String[] args, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              id.field_B = oi.field_j;
              if (param2 == 255) {
                L2: {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (rj.field_J >= 13) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                iq.field_c = ij.a(stackIn_10_0 != 0, stackIn_10_1 != 0);
                break L1;
              } else {
                if (param2 < 100) {
                  iq.field_c = p.a(-38, param3, param2);
                  break L1;
                } else {
                  if (105 < param2) {
                    iq.field_c = p.a(-38, param3, param2);
                    break L1;
                  } else {
                    iq.field_c = kn.a(args, -111);
                    break L1;
                  }
                }
              }
            }
            if (param1 == 31407) {
              break L0;
            } else {
              field_p = -77;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("sj.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    sj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0);
        ((sj) this).field_o = param3;
        ((sj) this).field_q = param4;
        ((sj) this).field_i = param2;
        ((sj) this).field_k = param6;
        ((sj) this).field_n = param5;
        ((sj) this).field_l = param1;
    }

    final static void a(int param0, int param1, byte param2) {
        int[] var7 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            var7 = new int[1 + me.field_f.length];
            var3 = var7;
            var4 = new int[me.field_f.length + 1];
            for (var5 = 0; me.field_f.length > var5; var5++) {
                var7[var5] = me.field_f[var5];
                var4[var5] = nm.field_u[var5];
            }
            var3[var3.length + -1] = param1;
            var4[-1 + var4.length] = param0;
            nm.field_u = var4;
            me.field_f = var3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "sj.F(" + param0 + 44 + param1 + 44 + -66 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param1 == -891231071) {
              if (param2 <= param5) {
                return;
              } else {
                if (param5 + 1 < param4) {
                  L1: {
                    if (param4 <= 5 + param5) {
                      break L1;
                    } else {
                      if (param0 != param6) {
                        L2: {
                          var7_int = (1 & (param0 & param6)) + ((param6 >> 1) - -(param0 >> 1));
                          var8 = param5;
                          var9 = param0;
                          var10 = param6;
                          var11 = param5;
                          if (param4 <= var11) {
                            break L2;
                          } else {
                            L3: {
                              var12 = la.field_c[var11];
                              if (param3) {
                                stackOut_27_0 = lb.field_c[var12];
                                stackIn_28_0 = stackOut_27_0;
                                break L3;
                              } else {
                                stackOut_26_0 = hn.field_f[var12];
                                stackIn_28_0 = stackOut_26_0;
                                break L3;
                              }
                            }
                            L4: {
                              L5: {
                                var13 = stackIn_28_0;
                                if (var13 > var7_int) {
                                  la.field_c[var11] = la.field_c[var8];
                                  int incrementValue$1 = var8;
                                  var8++;
                                  la.field_c[incrementValue$1] = var12;
                                  if (var9 > var13) {
                                    var9 = var13;
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  L6: {
                                    if (var10 >= var13) {
                                      var11++;
                                      break L6;
                                    } else {
                                      var10 = var13;
                                      break L6;
                                    }
                                  }
                                  var11++;
                                  break L5;
                                }
                              }
                              var11++;
                              break L4;
                            }
                            var11++;
                            var11++;
                            break L2;
                          }
                        }
                        sj.a(param0, param1, param2, param3, var8, param5, var9);
                        sj.a(var10, param1, param2, param3, param4, var8, param6);
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var7_int = param4 - 1;
                  L7: while (true) {
                    if (var7_int <= param5) {
                      return;
                    } else {
                      var8 = param5;
                      L8: while (true) {
                        if (var7_int <= var8) {
                          var7_int--;
                          continue L7;
                        } else {
                          L9: {
                            var9 = la.field_c[var8];
                            var10 = la.field_c[1 + var8];
                            if (!un.a(101, param3, var9, var10)) {
                              var8++;
                              var8++;
                              break L9;
                            } else {
                              la.field_c[var8] = var10;
                              la.field_c[1 + var8] = var9;
                              var8++;
                              break L9;
                            }
                          }
                          var8++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var7, "sj.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final void a(int param0, qd param1) {
        gm var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        wb var4_ref = null;
        Exception var5 = null;
        qk var5_ref = null;
        wb var6 = null;
        wb stackIn_4_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        wb stackOut_2_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var3 = op.field_m.a(((sj) this).field_i, 70);
            var4 = null;
            try {
              L1: {
                L2: {
                  if (((sj) this).field_l == -1) {
                    stackOut_3_0 = null;
                    stackIn_4_0 = (wb) (Object) stackOut_3_0;
                    break L2;
                  } else {
                    stackOut_2_0 = op.field_m.a(((sj) this).field_l, false);
                    stackIn_4_0 = stackOut_2_0;
                    break L2;
                  }
                }
                L3: {
                  var4_ref = stackIn_4_0;
                  if (param0 == 0) {
                    break L3;
                  } else {
                    sj.c(true);
                    break L3;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              return;
            }
            var5_ref = new qk(((sj) this).field_q, ((sj) this).field_n);
            var6 = param1.a(((sj) this).field_k, var4_ref, var3, true, var5_ref);
            var6.field_y = ((sj) this).field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("sj.D(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            ((sj) this).field_q = 6;
        }
    }

    public static void c(boolean param0) {
        field_j = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = dp.a(0, false, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sj.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 12319 + 41);
        }
        return stackIn_1_0;
    }

    static {
    }
}
