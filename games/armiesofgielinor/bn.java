/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    static je field_c;
    static boolean field_e;
    static kk[] field_a;
    static wc field_f;
    static String field_d;
    static int field_b;
    static String field_g;

    final static void a(byte param0, float param1, String param2) {
        RuntimeException var3 = null;
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
              if (param0 == -24) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            wa.field_e = param2;
            q.field_C = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("bn.C(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 != 1) {
                break L1;
              } else {
                if (is.a(4, param2)) {
                  stackOut_6_0 = 29;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 < -7) {
              stackOut_11_0 = ce.field_I[param1];
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = 111;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "bn.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (hf.field_c) {
              if (!param0) {
                if (rs.field_t == 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "bn.B(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_g = null;
              field_d = null;
              if (param0 == 29022) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            field_a = null;
            field_f = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "bn.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        je stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        je stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        je stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        je stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        je stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        je stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        je stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        je stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        je stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        je stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        je stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        je stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        je stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        je stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        je stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        je stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        je stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        je stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        je stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        je stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        je stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        je stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        je stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        je stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        je stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        je stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        je stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        je stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        je stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        RuntimeException decompiledCaughtException = null;
        je stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        je stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        je stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        je stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        je stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        je stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        je stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        je stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        je stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        je stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        je stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        je stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        je stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        je stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        je stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        je stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        je stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        je stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        je stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        je stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        je stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        je stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        je stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        je stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        je stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        je stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        je stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        je stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        je stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                bh.d(false);
                if (al.field_g >= 0) {
                  break L2;
                } else {
                  t.field_g.field_X = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              t.field_g.field_X = fo.a(4800, ns.field_F, new String[1]);
              break L1;
            }
            L3: {
              L4: {
                stackOut_7_0 = no.field_T;
                stackOut_7_1 = 1;
                stackIn_22_0 = stackOut_7_0;
                stackIn_22_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (!param0) {
                  break L4;
                } else {
                  stackOut_8_0 = (je) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackIn_22_0 = stackOut_8_0;
                  stackIn_22_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (param1) {
                    break L4;
                  } else {
                    stackOut_9_0 = (je) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackOut_11_0 = (je) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackIn_22_0 = stackOut_11_0;
                    stackIn_22_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (bw.field_g) {
                      break L4;
                    } else {
                      stackOut_12_0 = (je) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackOut_14_0 = (je) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackIn_22_0 = stackOut_14_0;
                      stackIn_22_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (vu.field_M != null) {
                        break L4;
                      } else {
                        stackOut_15_0 = (je) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackOut_17_0 = (je) (Object) stackIn_17_0;
                        stackOut_17_1 = stackIn_17_1;
                        stackIn_22_0 = stackOut_17_0;
                        stackIn_22_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (null != no.field_K) {
                          break L4;
                        } else {
                          stackOut_18_0 = (je) (Object) stackIn_18_0;
                          stackOut_18_1 = stackIn_18_1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackOut_20_0 = (je) (Object) stackIn_20_0;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = 1;
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_23_1 = stackOut_20_1;
                          stackIn_23_2 = stackOut_20_2;
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_22_0 = (je) (Object) stackIn_22_0;
              stackOut_22_1 = stackIn_22_1;
              stackOut_22_2 = 0;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            }
            L5: {
              L6: {
                ((je) (Object) stackIn_23_0).a(stackIn_23_1 != 0, stackIn_23_2 != 0);
                stackOut_23_0 = ov.field_i;
                stackOut_23_1 = 1;
                stackIn_38_0 = stackOut_23_0;
                stackIn_38_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (!param0) {
                  break L6;
                } else {
                  stackOut_24_0 = (je) (Object) stackIn_24_0;
                  stackOut_24_1 = stackIn_24_1;
                  stackIn_38_0 = stackOut_24_0;
                  stackIn_38_1 = stackOut_24_1;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  if (param1) {
                    break L6;
                  } else {
                    stackOut_25_0 = (je) (Object) stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    stackOut_27_0 = (je) (Object) stackIn_27_0;
                    stackOut_27_1 = stackIn_27_1;
                    stackIn_38_0 = stackOut_27_0;
                    stackIn_38_1 = stackOut_27_1;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (bw.field_g) {
                      break L6;
                    } else {
                      stackOut_28_0 = (je) (Object) stackIn_28_0;
                      stackOut_28_1 = stackIn_28_1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackOut_30_0 = (je) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackIn_38_0 = stackOut_30_0;
                      stackIn_38_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (vu.field_M != null) {
                        break L6;
                      } else {
                        stackOut_31_0 = (je) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        stackOut_33_0 = (je) (Object) stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackIn_38_0 = stackOut_33_0;
                        stackIn_38_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (no.field_K != null) {
                          break L6;
                        } else {
                          stackOut_34_0 = (je) (Object) stackIn_34_0;
                          stackOut_34_1 = stackIn_34_1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackOut_36_0 = (je) (Object) stackIn_36_0;
                          stackOut_36_1 = stackIn_36_1;
                          stackOut_36_2 = 1;
                          stackIn_39_0 = stackOut_36_0;
                          stackIn_39_1 = stackOut_36_1;
                          stackIn_39_2 = stackOut_36_2;
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_38_0 = (je) (Object) stackIn_38_0;
              stackOut_38_1 = stackIn_38_1;
              stackOut_38_2 = 0;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L5;
            }
            L7: {
              L8: {
                ((je) (Object) stackIn_39_0).a(stackIn_39_1 != 0, stackIn_39_2 != 0);
                stackOut_39_0 = qc.field_c;
                stackOut_39_1 = 1;
                stackIn_48_0 = stackOut_39_0;
                stackIn_48_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (!param0) {
                  break L8;
                } else {
                  stackOut_40_0 = (je) (Object) stackIn_40_0;
                  stackOut_40_1 = stackIn_40_1;
                  stackIn_48_0 = stackOut_40_0;
                  stackIn_48_1 = stackOut_40_1;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  if (param1) {
                    break L8;
                  } else {
                    stackOut_41_0 = (je) (Object) stackIn_41_0;
                    stackOut_41_1 = stackIn_41_1;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackOut_43_0 = (je) (Object) stackIn_43_0;
                    stackOut_43_1 = stackIn_43_1;
                    stackIn_48_0 = stackOut_43_0;
                    stackIn_48_1 = stackOut_43_1;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    if (!bw.field_g) {
                      break L8;
                    } else {
                      stackOut_44_0 = (je) (Object) stackIn_44_0;
                      stackOut_44_1 = stackIn_44_1;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      stackOut_46_0 = (je) (Object) stackIn_46_0;
                      stackOut_46_1 = stackIn_46_1;
                      stackOut_46_2 = 1;
                      stackIn_49_0 = stackOut_46_0;
                      stackIn_49_1 = stackOut_46_1;
                      stackIn_49_2 = stackOut_46_2;
                      break L7;
                    }
                  }
                }
              }
              stackOut_48_0 = (je) (Object) stackIn_48_0;
              stackOut_48_1 = stackIn_48_1;
              stackOut_48_2 = 0;
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            }
            L9: {
              ((je) (Object) stackIn_49_0).a(stackIn_49_1 != 0, stackIn_49_2 != 0);
              pj.field_E.field_a.l(10000);
              if (cp.field_d.field_yb != 0) {
                cg.field_a = true;
                break L9;
              } else {
                break L9;
              }
            }
            if (param2 >= 60) {
              L10: {
                if (fj.field_d.field_yb != 0) {
                  L11: {
                    L12: {
                      if (bj.field_k) {
                        break L12;
                      } else {
                        if (df.field_M > 0) {
                          break L12;
                        } else {
                          if (2 > hi.field_j) {
                            break L11;
                          } else {
                            if (!br.field_f[12]) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    gu.a(-61, param3);
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                  mo.field_w = true;
                  break L10;
                } else {
                  break L10;
                }
              }
              L13: {
                if (pe.field_x.field_yb == 0) {
                  break L13;
                } else {
                  L14: {
                    if (lm.field_e.length != 1) {
                      break L14;
                    } else {
                      if (mt.field_d == lm.field_e[0]) {
                        break L14;
                      } else {
                        mt.field_d = lm.field_e[0];
                        break L14;
                      }
                    }
                  }
                  qv.a(param3, mt.field_d, 0, true, tr.field_F, 5623);
                  break L13;
                }
              }
              L15: {
                if (td.field_g.field_yb != 0) {
                  bw.field_g = false;
                  break L15;
                } else {
                  break L15;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "bn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_d = "Hide chat";
        field_g = "Members only.";
    }
}
