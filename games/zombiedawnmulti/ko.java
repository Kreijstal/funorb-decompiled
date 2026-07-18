/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private boolean field_c;
    static String field_i;
    static String field_j;
    private int field_a;
    static String field_k;
    private int field_f;
    private boolean field_d;
    private boolean field_e;
    private int field_m;
    private boolean field_g;
    static String field_h;
    private fb[] field_b;
    private int field_l;

    public static void d(int param0) {
        try {
            int var1_int = 98 / ((-2 - param0) / 60);
            field_j = null;
            field_i = null;
            field_h = null;
            field_k = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ko.K(" + param0 + ')');
        }
    }

    private final void a(ja param0, byte param1, ja param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            param0.g(-(param0.field_x / 2) + 320, 400);
            if (param1 == 59) {
              g.a(param2, 320 + -(param2.field_x / 2), 400);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ko.F(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 61) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              ((ko) this).field_m = ((ko) this).field_m + 1;
              if (param1 == 255) {
                break L2;
              } else {
                if (param1 >= 19) {
                  break L2;
                } else {
                  L3: {
                    if (!ll.field_k.a(45, -128)) {
                      break L3;
                    } else {
                      if (param1 != 17) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (!h.i(51603)) {
                      break L4;
                    } else {
                      L5: {
                        if (jk.a((byte) -73, param1)) {
                          break L5;
                        } else {
                          if (jk.a((byte) -122, param2)) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      return stackIn_27_0 != 0;
                    }
                  }
                  if (((ko) this).field_m != 8) {
                    ((ko) this).field_b[-1 + ((ko) this).field_m] = new fb(190 + (((ko) this).field_m * 40 - 40), param1, ((ko) this).field_m + -1);
                    ((ko) this).field_b[-1 + ((ko) this).field_m].field_l = -op.field_m.field_H + tg.field_e.field_b[((ko) this).field_m + -1];
                    ((ko) this).field_b[((ko) this).field_m - 1].a(0);
                    stackOut_31_0 = 1;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  }
                }
              }
            }
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            return stackIn_16_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ko.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_32_0 != 0;
    }

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 <= -111) {
              L1: {
                L2: {
                  if (((ko) this).field_c) {
                    break L2;
                  } else {
                    if (((ko) this).field_e) {
                      break L2;
                    } else {
                      if (((ko) this).field_g) {
                        break L2;
                      } else {
                        if (!((ko) this).field_d) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.H(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final boolean g(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 13) {
              stackOut_3_0 = ((ko) this).field_c;
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
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        fb[] var4 = null;
        int var4_int = 0;
        int var5_int = 0;
        fb var5 = null;
        fb var6_ref_fb = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = ((ko) this).field_b;
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_int >= var4.length) {
                    break L3;
                  } else {
                    var6_ref_fb = var4[var5_int];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var6_ref_fb == null) {
                          break L4;
                        } else {
                          var6_ref_fb.a(param1, param0, 255);
                          break L4;
                        }
                      }
                      var5_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((ko) this).field_a = -1;
                break L2;
              }
              L5: {
                if (param2 >= 64) {
                  break L5;
                } else {
                  boolean discarded$2 = ((ko) this).b(119, 56, -64);
                  break L5;
                }
              }
              var4_int = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (~var4_int <= ~((ko) this).field_b.length) {
                      break L8;
                    } else {
                      var5 = ((ko) this).field_b[var4_int];
                      if (var7 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (null == var5) {
                            break L9;
                          } else {
                            var6 = var5.a(param1, (byte) -66);
                            if (-1 != var6) {
                              ((ko) this).field_f = 20 + var5.field_m;
                              ((ko) this).field_a = var4_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var4_int++;
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  break L7;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "ko.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, boolean param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        cj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cj stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        cj stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        cj stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        cj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        cj stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        cj stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        cj stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        cj stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        cj stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        cj stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        cj stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        cj stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        cj stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        cj stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        cj stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        cj stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        cj stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        cj stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        cj stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        cj stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        cj stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        cj stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        cj stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        cj stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cj stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cj stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        cj stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        cj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        cj stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        cj stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        cj stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        cj stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        cj stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        cj stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        cj stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        cj stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        cj stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        cj stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        cj stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        cj stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        cj stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        cj stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        cj stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        cj stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        cj stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        cj stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        cj stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              v.a(199);
              if (!param2) {
                break L1;
              } else {
                ko.d(-60);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 > bc.field_e) {
                  break L3;
                } else {
                  ql.field_b.field_wb = vl.a(ob.field_v, new String[1], 2);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ql.field_b.field_wb = null;
              break L2;
            }
            L4: {
              L5: {
                stackOut_10_0 = qe.field_k;
                stackOut_10_1 = -11838;
                stackIn_25_0 = stackOut_10_0;
                stackIn_25_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (!param0) {
                  break L5;
                } else {
                  stackOut_11_0 = (cj) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackIn_25_0 = stackOut_11_0;
                  stackIn_25_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param3) {
                    break L5;
                  } else {
                    stackOut_12_0 = (cj) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackOut_14_0 = (cj) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackIn_25_0 = stackOut_14_0;
                    stackIn_25_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (ee.field_a) {
                      break L5;
                    } else {
                      stackOut_15_0 = (cj) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackOut_17_0 = (cj) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackIn_25_0 = stackOut_17_0;
                      stackIn_25_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (null != mh.field_c) {
                        break L5;
                      } else {
                        stackOut_18_0 = (cj) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackOut_20_0 = (cj) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackIn_25_0 = stackOut_20_0;
                        stackIn_25_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (ej.field_n != null) {
                          break L5;
                        } else {
                          stackOut_21_0 = (cj) (Object) stackIn_21_0;
                          stackOut_21_1 = stackIn_21_1;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          stackOut_23_0 = (cj) (Object) stackIn_23_0;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = 1;
                          stackIn_26_0 = stackOut_23_0;
                          stackIn_26_1 = stackOut_23_1;
                          stackIn_26_2 = stackOut_23_2;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_25_0 = (cj) (Object) stackIn_25_0;
              stackOut_25_1 = stackIn_25_1;
              stackOut_25_2 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            }
            L6: {
              L7: {
                ((cj) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2 != 0);
                stackOut_26_0 = cm.field_a;
                stackOut_26_1 = -11838;
                stackIn_41_0 = stackOut_26_0;
                stackIn_41_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (!param0) {
                  break L7;
                } else {
                  stackOut_27_0 = (cj) (Object) stackIn_27_0;
                  stackOut_27_1 = stackIn_27_1;
                  stackIn_41_0 = stackOut_27_0;
                  stackIn_41_1 = stackOut_27_1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  if (param3) {
                    break L7;
                  } else {
                    stackOut_28_0 = (cj) (Object) stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackOut_30_0 = (cj) (Object) stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackIn_41_0 = stackOut_30_0;
                    stackIn_41_1 = stackOut_30_1;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    if (ee.field_a) {
                      break L7;
                    } else {
                      stackOut_31_0 = (cj) (Object) stackIn_31_0;
                      stackOut_31_1 = stackIn_31_1;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      stackOut_33_0 = (cj) (Object) stackIn_33_0;
                      stackOut_33_1 = stackIn_33_1;
                      stackIn_41_0 = stackOut_33_0;
                      stackIn_41_1 = stackOut_33_1;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (mh.field_c != null) {
                        break L7;
                      } else {
                        stackOut_34_0 = (cj) (Object) stackIn_34_0;
                        stackOut_34_1 = stackIn_34_1;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackOut_36_0 = (cj) (Object) stackIn_36_0;
                        stackOut_36_1 = stackIn_36_1;
                        stackIn_41_0 = stackOut_36_0;
                        stackIn_41_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (ej.field_n != null) {
                          break L7;
                        } else {
                          stackOut_37_0 = (cj) (Object) stackIn_37_0;
                          stackOut_37_1 = stackIn_37_1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackOut_39_0 = (cj) (Object) stackIn_39_0;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = 1;
                          stackIn_42_0 = stackOut_39_0;
                          stackIn_42_1 = stackOut_39_1;
                          stackIn_42_2 = stackOut_39_2;
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_41_0 = (cj) (Object) stackIn_41_0;
              stackOut_41_1 = stackIn_41_1;
              stackOut_41_2 = 0;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L6;
            }
            L8: {
              L9: {
                ((cj) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2 != 0);
                stackOut_42_0 = lm.field_gb;
                stackOut_42_1 = -11838;
                stackIn_51_0 = stackOut_42_0;
                stackIn_51_1 = stackOut_42_1;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                if (!param0) {
                  break L9;
                } else {
                  stackOut_43_0 = (cj) (Object) stackIn_43_0;
                  stackOut_43_1 = stackIn_43_1;
                  stackIn_51_0 = stackOut_43_0;
                  stackIn_51_1 = stackOut_43_1;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  if (param3) {
                    break L9;
                  } else {
                    stackOut_44_0 = (cj) (Object) stackIn_44_0;
                    stackOut_44_1 = stackIn_44_1;
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    stackOut_46_0 = (cj) (Object) stackIn_46_0;
                    stackOut_46_1 = stackIn_46_1;
                    stackIn_51_0 = stackOut_46_0;
                    stackIn_51_1 = stackOut_46_1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (!ee.field_a) {
                      break L9;
                    } else {
                      stackOut_47_0 = (cj) (Object) stackIn_47_0;
                      stackOut_47_1 = stackIn_47_1;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackOut_49_0 = (cj) (Object) stackIn_49_0;
                      stackOut_49_1 = stackIn_49_1;
                      stackOut_49_2 = 1;
                      stackIn_52_0 = stackOut_49_0;
                      stackIn_52_1 = stackOut_49_1;
                      stackIn_52_2 = stackOut_49_2;
                      break L8;
                    }
                  }
                }
              }
              stackOut_51_0 = (cj) (Object) stackIn_51_0;
              stackOut_51_1 = stackIn_51_1;
              stackOut_51_2 = 0;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L8;
            }
            L10: {
              ((cj) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2 != 0);
              de.field_b.field_c.h(-37);
              if (0 == kj.field_u.field_T) {
                break L10;
              } else {
                uk.field_N = true;
                break L10;
              }
            }
            L11: {
              if (ia.field_t.field_T == 0) {
                break L11;
              } else {
                L12: {
                  L13: {
                    if (bo.field_e) {
                      break L13;
                    } else {
                      if (vl.field_h > 0) {
                        break L13;
                      } else {
                        if (kj.field_q < 2) {
                          break L12;
                        } else {
                          if (!lc.field_m[12]) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  ii.a(param1, -1);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
                pb.field_f = true;
                break L11;
              }
            }
            L14: {
              if (pl.field_L.field_T == 0) {
                break L14;
              } else {
                L15: {
                  if (1 != qo.field_r.length) {
                    break L15;
                  } else {
                    if (i.field_e == qo.field_r[0]) {
                      break L15;
                    } else {
                      i.field_e = qo.field_r[0];
                      break L15;
                    }
                  }
                }
                cm.a(123, 0, i.field_e, ch.field_c, true, param1);
                break L14;
              }
            }
            L16: {
              if (0 == kn.field_a.field_T) {
                break L16;
              } else {
                ee.field_a = false;
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ko.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              stackOut_3_0 = ((ko) this).field_g;
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
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        fb[] var2_array = null;
        int var2_int = 0;
        int var3 = 0;
        fb var4_ref_fb = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_array = ((ko) this).field_b;
              if (param0 <= -114) {
                break L1;
              } else {
                ((ko) this).field_a = -40;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 >= var2_array.length) {
                    break L4;
                  } else {
                    var4_ref_fb = var2_array[var3];
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var4_ref_fb == null) {
                          break L5;
                        } else {
                          var4_ref_fb.c(123);
                          break L5;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (((ko) this).field_a == -1) {
                  break L3;
                } else {
                  if (((ko) this).field_a >= tg.field_e.field_d.length) {
                    break L3;
                  } else {
                    var2_int = tg.field_e.field_d[((ko) this).field_a];
                    var3 = tg.field_e.field_f[((ko) this).field_a];
                    if (255 != var2_int) {
                      g.a(fe.field_W[var2_int], ((ko) this).field_f + -100, 453);
                      oj.field_M[var2_int].g(-100 + ((ko) this).field_f, 453);
                      if (var3 == 255) {
                        break L3;
                      } else {
                        g.a(fe.field_W[var3], -100 + ((ko) this).field_f, 438);
                        oj.field_M[var3].g(-100 + ((ko) this).field_f, 438);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L6: {
                L7: {
                  if (((ko) this).field_e) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        if (!((ko) this).field_d) {
                          break L9;
                        } else {
                          if (!((ko) this).field_g) {
                            break L9;
                          } else {
                            if (((ko) this).field_c) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        L11: {
                          if (!((ko) this).field_d) {
                            break L11;
                          } else {
                            if (((ko) this).field_g) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (!((ko) this).field_g) {
                            break L12;
                          } else {
                            this.a(dl.field_c, (byte) 59, bf.field_f);
                            if (var5 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          }
                        }
                        L13: {
                          L14: {
                            if (!((ko) this).field_c) {
                              break L14;
                            } else {
                              if (((ko) this).field_d) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (((ko) this).field_c) {
                              break L15;
                            } else {
                              if (((ko) this).field_d) {
                                this.a(fe.field_U, (byte) 59, ap.field_t);
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L15;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.a(bq.field_a, (byte) 59, ii.field_c);
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L13;
                          }
                        }
                        this.a(mi.field_Mb, (byte) 59, aq.field_u);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                      this.a(up.field_f, (byte) 59, oq.field_t);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                    this.a(la.field_j, (byte) 59, kj.field_o);
                    if (var5 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                this.a(wp.field_e, (byte) 59, vl.field_k);
                break L6;
              }
              L16: {
                var2_int = ((ko) this).e(-1);
                if (255 == var2_int) {
                  break L16;
                } else {
                  if (0 >= bd.field_g) {
                    break L16;
                  } else {
                    if (bo.field_d > 0) {
                      var3 = 4 + bd.field_g;
                      var4 = 15 + bo.field_d;
                      wa.field_b[var2_int].c(var3, var4, 255);
                      if (!bk.field_g) {
                        el.field_E.c(1 + var3, var4 - -1);
                        break L16;
                      } else {
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.A(" + param0 + ')');
        }
    }

    final int e(int param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            L1: {
              if (((ko) this).field_l == param0) {
                break L1;
              } else {
                if (((ko) this).field_b[((ko) this).field_l] == null) {
                  break L1;
                } else {
                  stackOut_4_0 = ((ko) this).field_b[((ko) this).field_l].a((byte) 97);
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                }
              }
            }
            stackOut_6_0 = 255;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.G(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((ko) this).field_b[param0] != null) {
              L1: {
                if (!((ko) this).field_b[param0].field_b) {
                  boolean discarded$1 = ((ko) this).b(param1 ^ -18, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == -1) {
                  break L2;
                } else {
                  ((ko) this).field_m = -102;
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ko.B(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = ((ko) this).field_e;
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
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.R(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((ko) this).field_a = 77;
                break L1;
              }
            }
            L2: {
              var2_int = ((ko) this).e(-1);
              if (var2_int == 9) {
                break L2;
              } else {
                if (var2_int == 10) {
                  break L2;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
              }
            }
            stackOut_9_0 = ip.field_f;
            stackIn_10_0 = stackOut_9_0;
            return stackIn_10_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.O(" + param0 + ')');
        }
        return stackIn_12_0;
    }

    final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        fb[] var3_array = null;
        int var3_int = 0;
        int var4 = 0;
        fb var5_ref_fb = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        Object stackIn_88_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_92_0 = null;
        Object stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_103_0 = null;
        Object stackIn_105_0 = null;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        Object stackIn_108_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_112_0 = null;
        Object stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        Object stackIn_115_0 = null;
        Object stackIn_117_0 = null;
        Object stackIn_119_0 = null;
        Object stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        Object stackIn_125_0 = null;
        Object stackIn_125_1 = null;
        Object stackIn_127_0 = null;
        Object stackIn_127_1 = null;
        Object stackIn_129_0 = null;
        Object stackIn_129_1 = null;
        Object stackIn_130_0 = null;
        Object stackIn_130_1 = null;
        int stackIn_130_2 = 0;
        int stackIn_144_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        Object stackOut_87_0 = null;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_88_0 = null;
        Object stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        Object stackOut_101_0 = null;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        Object stackOut_107_0 = null;
        Object stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        Object stackOut_108_0 = null;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        Object stackOut_114_0 = null;
        Object stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        Object stackOut_115_0 = null;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        Object stackOut_124_0 = null;
        Object stackOut_124_1 = null;
        Object stackOut_129_0 = null;
        Object stackOut_129_1 = null;
        int stackOut_129_2 = 0;
        Object stackOut_125_0 = null;
        Object stackOut_125_1 = null;
        Object stackOut_127_0 = null;
        Object stackOut_127_1 = null;
        int stackOut_127_2 = 0;
        int stackOut_143_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((ko) this).field_b[param1] == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if (param0 == 17) {
                  break L1;
                } else {
                  ((ko) this).field_c = false;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (((ko) this).field_b[param1].b((byte) 92)) {
                    break L3;
                  } else {
                    iq.a(-10, (byte) 99);
                    var3_array = ((ko) this).field_b;
                    var4 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var4 >= var3_array.length) {
                            break L6;
                          } else {
                            var5_ref_fb = var3_array[var4];
                            if (var6 != 0) {
                              break L5;
                            } else {
                              L7: {
                                if (null == var5_ref_fb) {
                                  break L7;
                                } else {
                                  var5_ref_fb.c((byte) 18);
                                  break L7;
                                }
                              }
                              var4++;
                              if (var6 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        ((ko) this).field_l = param1;
                        ((ko) this).field_b[param1].b(2);
                        break L5;
                      }
                      L8: {
                        L9: {
                          L10: {
                            L11: {
                              L12: {
                                L13: {
                                  L14: {
                                    L15: {
                                      L16: {
                                        L17: {
                                          L18: {
                                            var3_int = ((ko) this).field_b[param1].a((byte) 114);
                                            ((ko) this).field_e = false;
                                            ((ko) this).field_g = false;
                                            ((ko) this).field_c = false;
                                            ((ko) this).field_d = false;
                                            var4 = ll.field_k.field_g[param1];
                                            var5 = var3_int;
                                            if (7 == var5) {
                                              break L18;
                                            } else {
                                              if (13 == var5) {
                                                break L17;
                                              } else {
                                                L19: {
                                                  if (var5 != 11) {
                                                    break L19;
                                                  } else {
                                                    if (var6 == 0) {
                                                      break L17;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                if (9 == var5) {
                                                  break L17;
                                                } else {
                                                  L20: {
                                                    if (var5 != 10) {
                                                      break L20;
                                                    } else {
                                                      if (var6 == 0) {
                                                        break L17;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (12 != var5) {
                                                      break L21;
                                                    } else {
                                                      if (var6 == 0) {
                                                        break L17;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  L22: {
                                                    if (var5 != 17) {
                                                      break L22;
                                                    } else {
                                                      if (var6 == 0) {
                                                        break L16;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  if (4 == var5) {
                                                    break L15;
                                                  } else {
                                                    if (var5 == 1) {
                                                      break L15;
                                                    } else {
                                                      if (var5 == 2) {
                                                        break L14;
                                                      } else {
                                                        if (var5 == 16) {
                                                          break L13;
                                                        } else {
                                                          L23: {
                                                            if (14 != var5) {
                                                              break L23;
                                                            } else {
                                                              if (var6 == 0) {
                                                                break L13;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          L24: {
                                                            if (var5 != 5) {
                                                              break L24;
                                                            } else {
                                                              if (var6 == 0) {
                                                                break L13;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                          if (var5 == 8) {
                                                            break L12;
                                                          } else {
                                                            if (var5 == 0) {
                                                              break L11;
                                                            } else {
                                                              if (var5 != 15) {
                                                                break L9;
                                                              } else {
                                                                if (var6 == 0) {
                                                                  break L10;
                                                                } else {
                                                                  break L18;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L25: {
                                            ((ko) this).field_c = true;
                                            stackOut_87_0 = this;
                                            stackIn_92_0 = stackOut_87_0;
                                            stackIn_88_0 = stackOut_87_0;
                                            if (37 != var4) {
                                              stackOut_92_0 = this;
                                              stackOut_92_1 = 0;
                                              stackIn_93_0 = stackOut_92_0;
                                              stackIn_93_1 = stackOut_92_1;
                                              break L25;
                                            } else {
                                              stackOut_88_0 = this;
                                              stackIn_90_0 = stackOut_88_0;
                                              stackOut_90_0 = this;
                                              stackOut_90_1 = 1;
                                              stackIn_93_0 = stackOut_90_0;
                                              stackIn_93_1 = stackOut_90_1;
                                              break L25;
                                            }
                                          }
                                          ((ko) this).field_d = stackIn_93_1 != 0;
                                          if (var6 == 0) {
                                            break L8;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        ((ko) this).field_e = true;
                                        if (var6 == 0) {
                                          break L8;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      ((ko) this).field_d = true;
                                      ((ko) this).field_e = true;
                                      ((ko) this).field_g = true;
                                      ((ko) this).field_c = true;
                                      if (var6 == 0) {
                                        break L8;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    L26: {
                                      ((ko) this).field_g = true;
                                      stackOut_100_0 = this;
                                      stackIn_105_0 = stackOut_100_0;
                                      stackIn_101_0 = stackOut_100_0;
                                      if (var4 != 37) {
                                        stackOut_105_0 = this;
                                        stackOut_105_1 = 0;
                                        stackIn_106_0 = stackOut_105_0;
                                        stackIn_106_1 = stackOut_105_1;
                                        break L26;
                                      } else {
                                        stackOut_101_0 = this;
                                        stackIn_103_0 = stackOut_101_0;
                                        stackOut_103_0 = this;
                                        stackOut_103_1 = 1;
                                        stackIn_106_0 = stackOut_103_0;
                                        stackIn_106_1 = stackOut_103_1;
                                        break L26;
                                      }
                                    }
                                    ((ko) this).field_d = stackIn_106_1 != 0;
                                    if (var6 == 0) {
                                      break L8;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L27: {
                                    ((ko) this).field_g = true;
                                    stackOut_107_0 = this;
                                    stackIn_112_0 = stackOut_107_0;
                                    stackIn_108_0 = stackOut_107_0;
                                    if (32 != var4) {
                                      stackOut_112_0 = this;
                                      stackOut_112_1 = 0;
                                      stackIn_113_0 = stackOut_112_0;
                                      stackIn_113_1 = stackOut_112_1;
                                      break L27;
                                    } else {
                                      stackOut_108_0 = this;
                                      stackIn_110_0 = stackOut_108_0;
                                      stackOut_110_0 = this;
                                      stackOut_110_1 = 1;
                                      stackIn_113_0 = stackOut_110_0;
                                      stackIn_113_1 = stackOut_110_1;
                                      break L27;
                                    }
                                  }
                                  ((ko) this).field_d = stackIn_113_1 != 0;
                                  if (var6 == 0) {
                                    break L8;
                                  } else {
                                    break L13;
                                  }
                                }
                                L28: {
                                  ((ko) this).field_g = true;
                                  stackOut_114_0 = this;
                                  stackIn_119_0 = stackOut_114_0;
                                  stackIn_115_0 = stackOut_114_0;
                                  if (var4 != 33) {
                                    stackOut_119_0 = this;
                                    stackOut_119_1 = 0;
                                    stackIn_120_0 = stackOut_119_0;
                                    stackIn_120_1 = stackOut_119_1;
                                    break L28;
                                  } else {
                                    stackOut_115_0 = this;
                                    stackIn_117_0 = stackOut_115_0;
                                    stackOut_117_0 = this;
                                    stackOut_117_1 = 1;
                                    stackIn_120_0 = stackOut_117_0;
                                    stackIn_120_1 = stackOut_117_1;
                                    break L28;
                                  }
                                }
                                ((ko) this).field_d = stackIn_120_1 != 0;
                                if (var6 == 0) {
                                  break L8;
                                } else {
                                  break L12;
                                }
                              }
                              ((ko) this).field_c = true;
                              ((ko) this).field_d = true;
                              if (var6 == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                            L29: {
                              stackOut_124_0 = this;
                              stackOut_124_1 = this;
                              stackIn_129_0 = stackOut_124_0;
                              stackIn_129_1 = stackOut_124_1;
                              stackIn_125_0 = stackOut_124_0;
                              stackIn_125_1 = stackOut_124_1;
                              if (var4 != 32) {
                                stackOut_129_0 = this;
                                stackOut_129_1 = this;
                                stackOut_129_2 = 0;
                                stackIn_130_0 = stackOut_129_0;
                                stackIn_130_1 = stackOut_129_1;
                                stackIn_130_2 = stackOut_129_2;
                                break L29;
                              } else {
                                stackOut_125_0 = this;
                                stackOut_125_1 = this;
                                stackIn_127_0 = stackOut_125_0;
                                stackIn_127_1 = stackOut_125_1;
                                stackOut_127_0 = this;
                                stackOut_127_1 = this;
                                stackOut_127_2 = 1;
                                stackIn_130_0 = stackOut_127_0;
                                stackIn_130_1 = stackOut_127_1;
                                stackIn_130_2 = stackOut_127_2;
                                break L29;
                              }
                            }
                            ((ko) this).field_d = stackIn_130_2 != 0;
                            ((ko) this).field_c = stackIn_130_2 != 0;
                            ((ko) this).field_g = true;
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                          ((ko) this).field_e = true;
                          if (var6 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                        ((ko) this).field_g = true;
                        break L8;
                      }
                      L30: {
                        if (df.field_I) {
                          ah.a((byte) -86, var3_int);
                          iq.a(var3_int, (byte) 99);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                boolean discarded$1 = ((ko) this).h(1);
                break L2;
              }
              stackOut_143_0 = 1;
              stackIn_144_0 = stackOut_143_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "ko.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_144_0 != 0;
    }

    final boolean b(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              var4_int = (param2 + -190) / 40;
              if (param1 > var4_int) {
                break L1;
              } else {
                if (var4_int >= ((ko) this).field_m) {
                  break L1;
                } else {
                  if (null == ((ko) this).field_b[var4_int]) {
                    break L1;
                  } else {
                    if (((ko) this).field_b[var4_int].a(param0, param2, (byte) -46)) {
                      stackOut_12_0 = ((ko) this).b(17, var4_int);
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            return stackIn_11_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "ko.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final boolean h(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            if (!((ko) this).a((byte) -122)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((ko) this).field_b[((ko) this).field_l]) {
                  break L1;
                } else {
                  ((ko) this).field_b[((ko) this).field_l].c((byte) 18);
                  break L1;
                }
              }
              ((ko) this).field_l = -1;
              ((ko) this).field_c = false;
              ((ko) this).field_d = false;
              ((ko) this).field_e = false;
              ((ko) this).field_g = false;
              if (param0 == 1) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.D(" + param0 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final void a(int param0, id param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ti var6 = null;
        wb var7 = null;
        int var8 = 0;
        int var9 = 0;
        ti stackIn_9_0 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        RuntimeException decompiledCaughtException = null;
        ti stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5_int = ((ko) this).e(-1);
                if (!(param1 instanceof jj)) {
                  break L2;
                } else {
                  wd.a(param1.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var6 = (ti) (Object) param1;
                if (var6 instanceof wb) {
                  stackOut_8_0 = (ti) var6;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_6_0 = null;
                  stackIn_9_0 = (ti) (Object) stackOut_6_0;
                  break L3;
                }
              }
              L4: {
                var7 = (wb) (Object) stackIn_9_0;
                var8 = var5_int;
                if (var8 != 255) {
                  break L4;
                } else {
                  if (var9 == 0) {
                    return;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          if (var8 == 12) {
                            break L10;
                          } else {
                            if (var8 == 11) {
                              break L10;
                            } else {
                              L11: {
                                if (13 != var8) {
                                  break L11;
                                } else {
                                  if (var9 == 0) {
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var8 != 10) {
                                  break L12;
                                } else {
                                  if (var9 == 0) {
                                    break L9;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var8 == 9) {
                                break L9;
                              } else {
                                if (var8 == 15) {
                                  break L9;
                                } else {
                                  L13: {
                                    if (var8 != 17) {
                                      break L13;
                                    } else {
                                      if (var9 == 0) {
                                        break L8;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (3 != var8) {
                                      break L14;
                                    } else {
                                      if (var9 == 0) {
                                        break L7;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (var8 != 1) {
                                      break L15;
                                    } else {
                                      if (var9 == 0) {
                                        break L6;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  L16: {
                                    if (var8 != 2) {
                                      break L16;
                                    } else {
                                      if (var9 == 0) {
                                        break L6;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  L17: {
                                    if (var8 != 4) {
                                      break L17;
                                    } else {
                                      if (var9 == 0) {
                                        break L6;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  if (var8 == 14) {
                                    break L6;
                                  } else {
                                    L18: {
                                      if (var8 != 16) {
                                        break L18;
                                      } else {
                                        if (var9 == 0) {
                                          break L6;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    L19: {
                                      if (var8 != 5) {
                                        break L19;
                                      } else {
                                        if (var9 == 0) {
                                          break L6;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (var8 != 18) {
                                        break L20;
                                      } else {
                                        if (var9 == 0) {
                                          break L6;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    L21: {
                                      if (var8 != 7) {
                                        break L21;
                                      } else {
                                        if (var9 == 0) {
                                          break L5;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    if (var8 == 0) {
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        nn.a(ma.field_a, op.field_m.field_H, ((ko) this).field_l, (byte) 102);
                        if (var9 == 0) {
                          break L1;
                        } else {
                          break L9;
                        }
                      }
                      ok.a(-117, param0, ma.field_a, op.field_m.field_H, param2, ((ko) this).field_l);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L8;
                      }
                    }
                    L22: {
                      if (var6 != null) {
                        param0 = -1;
                        param2 = var6.field_y;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    ok.a(-101, param0, ma.field_a, op.field_m.field_H, param2, ((ko) this).field_l);
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L7;
                    }
                  }
                  L23: {
                    if (null == var7) {
                      break L23;
                    } else {
                      if (!var7.q(-14945)) {
                        break L23;
                      } else {
                        if (!var7.o(127)) {
                          wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                          if (var9 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  return;
                }
                L24: {
                  if (var7 == null) {
                    break L24;
                  } else {
                    if (!var7.o(88)) {
                      wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
                      if (var9 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    } else {
                      break L24;
                    }
                  }
                }
                return;
              }
              wd.a(var6.field_y, -1, ((ko) this).field_l, op.field_m.field_H, ma.field_a);
              break L1;
            }
            tg.field_e.field_b[((ko) this).field_l] = op.field_m.field_H - -op.field_m.a(ll.field_k.field_g[((ko) this).field_l], var5_int, fb.field_e.field_M, false);
            ((ko) this).field_b[((ko) this).field_l].a(0);
            ((ko) this).field_c = false;
            ((ko) this).field_g = false;
            if (param3 >= 112) {
              ((ko) this).field_l = -1;
              ((ko) this).field_e = false;
              ((ko) this).field_d = false;
              iq.a(-11, (byte) 99);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var5 = decompiledCaughtException;
            stackOut_136_0 = (RuntimeException) var5;
            stackOut_136_1 = new StringBuilder().append("ko.S(").append(param0).append(',');
            stackIn_139_0 = stackOut_136_0;
            stackIn_139_1 = stackOut_136_1;
            stackIn_137_0 = stackOut_136_0;
            stackIn_137_1 = stackOut_136_1;
            if (param1 == null) {
              stackOut_139_0 = (RuntimeException) (Object) stackIn_139_0;
              stackOut_139_1 = (StringBuilder) (Object) stackIn_139_1;
              stackOut_139_2 = "null";
              stackIn_140_0 = stackOut_139_0;
              stackIn_140_1 = stackOut_139_1;
              stackIn_140_2 = stackOut_139_2;
              break L25;
            } else {
              stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
              stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
              stackOut_137_2 = "{...}";
              stackIn_140_0 = stackOut_137_0;
              stackIn_140_1 = stackOut_137_1;
              stackIn_140_2 = stackOut_137_2;
              break L25;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_140_0, stackIn_140_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            stackOut_3_0 = ((ko) this).field_d;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ko.M(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        fb[] var3 = null;
        int var4 = 0;
        fb var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 110 / ((34 - param0) / 58);
            var3 = ((ko) this).field_b;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3.length >= ~var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 == null) {
                          break L4;
                        } else {
                          var5.field_b = false;
                          var5.b(2);
                          var5.c((byte) 18);
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
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
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "ko.N(" + param0 + ')');
        }
    }

    ko() {
        ((ko) this).field_d = false;
        ((ko) this).field_f = 0;
        ((ko) this).field_e = false;
        ((ko) this).field_g = false;
        ((ko) this).field_c = false;
        ((ko) this).field_a = -1;
        try {
            ((ko) this).field_b = new fb[8];
            ((ko) this).field_m = 0;
            ((ko) this).field_l = -1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ko.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Waiting for sound effects";
        field_h = "Location";
        field_k = "Players: ";
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
