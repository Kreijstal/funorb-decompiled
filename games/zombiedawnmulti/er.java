/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends br {
    int field_g;
    static ma field_f;
    static int field_k;
    static int field_i;
    static int field_h;
    static ja field_j;

    er(int param0) {
        ((er) this).field_g = param0;
    }

    public static void c() {
        field_j = null;
        field_f = null;
    }

    final static boolean a() {
        int var1 = 0;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var2 = ZombieDawnMulti.field_E ? 1 : 0;
          if (ai.field_b != ma.field_d) {
            se.field_E = se.field_E - 40;
            if (se.field_E <= 0) {
              L1: {
                se.field_E = 0;
                ml.field_Jb = gn.field_I[hg.field_rb];
                ma.field_d = ai.field_b;
                if (hg.field_rb >= -1 + lm.field_pb) {
                  stackOut_43_0 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  break L1;
                } else {
                  stackOut_42_0 = 1;
                  stackIn_44_0 = stackOut_42_0;
                  break L1;
                }
              }
              dg.field_J = stackIn_44_0 != 0;
              if (0 <= ai.field_b) {
                if (ml.field_Jb >= 0) {
                  var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
                  hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
                  if (!pp.field_n) {
                    hj.field_g = hj.field_g + 20;
                    if (ai.field_b == 21) {
                      if (10 == hg.field_rb) {
                        if (!fb.field_e.field_I.a(true)) {
                          df.a(-17306, 9);
                          w.field_m = w.field_m & -1025;
                          return false;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    if (ai.field_b == 21) {
                      if (10 == hg.field_rb) {
                        if (!fb.field_e.field_I.a(true)) {
                          df.a(-17306, 9);
                          w.field_m = w.field_m & -1025;
                          return false;
                        } else {
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                if (ai.field_b == 21) {
                  if (10 == hg.field_rb) {
                    if (fb.field_e.field_I.a(true)) {
                      return false;
                    } else {
                      df.a(-17306, 9);
                      w.field_m = w.field_m & -1025;
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              break L0;
            }
          } else {
            if (hg.field_rb == ml.field_Jb) {
              if (!io.field_g) {
                if (io.field_g) {
                  break L0;
                } else {
                  if (se.field_E > 0) {
                    se.field_E = se.field_E - 40;
                    if (se.field_E > 0) {
                      break L0;
                    } else {
                      L2: {
                        se.field_E = 0;
                        if (ai.field_b != 21) {
                          break L2;
                        } else {
                          if (10 != hg.field_rb) {
                            break L2;
                          } else {
                            if (!fb.field_e.field_I.a(true)) {
                              df.a(-17306, 9);
                              w.field_m = w.field_m & -1025;
                              break L2;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      return false;
                    }
                  } else {
                    L3: {
                      if (ai.field_b != 21) {
                        break L3;
                      } else {
                        if (10 != hg.field_rb) {
                          break L3;
                        } else {
                          if (!fb.field_e.field_I.a(true)) {
                            df.a(-17306, 9);
                            w.field_m = w.field_m & -1025;
                            break L3;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              } else {
                if (se.field_E < 400) {
                  se.field_E = se.field_E + 40;
                  if (se.field_E <= 400) {
                    break L0;
                  } else {
                    L4: {
                      se.field_E = 400;
                      if (ai.field_b != 21) {
                        break L4;
                      } else {
                        if (10 != hg.field_rb) {
                          break L4;
                        } else {
                          if (!fb.field_e.field_I.a(true)) {
                            df.a(-17306, 9);
                            w.field_m = w.field_m & -1025;
                            break L4;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    return false;
                  }
                } else {
                  L5: {
                    if (io.field_g) {
                      break L5;
                    } else {
                      if (se.field_E > 0) {
                        se.field_E = se.field_E - 40;
                        if (se.field_E > 0) {
                          break L5;
                        } else {
                          L6: {
                            se.field_E = 0;
                            if (ai.field_b != 21) {
                              break L6;
                            } else {
                              if (10 != hg.field_rb) {
                                break L6;
                              } else {
                                if (!fb.field_e.field_I.a(true)) {
                                  df.a(-17306, 9);
                                  w.field_m = w.field_m & -1025;
                                  break L6;
                                } else {
                                  return false;
                                }
                              }
                            }
                          }
                          return false;
                        }
                      } else {
                        if (ai.field_b == 21) {
                          if (10 == hg.field_rb) {
                            if (fb.field_e.field_I.a(true)) {
                              return false;
                            } else {
                              df.a(-17306, 9);
                              w.field_m = w.field_m & -1025;
                              return false;
                            }
                          } else {
                            return false;
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  L7: {
                    if (ai.field_b != 21) {
                      break L7;
                    } else {
                      if (10 != hg.field_rb) {
                        break L7;
                      } else {
                        if (!fb.field_e.field_I.a(true)) {
                          df.a(-17306, 9);
                          w.field_m = w.field_m & -1025;
                          break L7;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                }
              }
            } else {
              L8: {
                se.field_E = se.field_E - 40;
                if (se.field_E <= 0) {
                  L9: {
                    se.field_E = 0;
                    ml.field_Jb = gn.field_I[hg.field_rb];
                    ma.field_d = ai.field_b;
                    if (hg.field_rb >= -1 + lm.field_pb) {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      break L9;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L9;
                    }
                  }
                  dg.field_J = stackIn_7_0 != 0;
                  if (0 <= ai.field_b) {
                    if (ml.field_Jb >= 0) {
                      var1 = pb.field_e.b(ei.field_g[ma.field_d][ml.field_Jb], 400);
                      hj.field_g = 4 + (20 + var1 * (pb.field_e.field_C + pb.field_e.field_r));
                      if (pp.field_n) {
                        L10: {
                          if (ai.field_b != 21) {
                            break L10;
                          } else {
                            if (10 != hg.field_rb) {
                              break L10;
                            } else {
                              if (!fb.field_e.field_I.a(true)) {
                                df.a(-17306, 9);
                                w.field_m = w.field_m & -1025;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        return false;
                      } else {
                        hj.field_g = hj.field_g + 20;
                        L11: {
                          if (ai.field_b != 21) {
                            break L11;
                          } else {
                            if (10 != hg.field_rb) {
                              break L11;
                            } else {
                              if (!fb.field_e.field_I.a(true)) {
                                df.a(-17306, 9);
                                w.field_m = w.field_m & -1025;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        return false;
                      }
                    } else {
                      break L8;
                    }
                  } else {
                    if (ai.field_b == 21) {
                      if (10 == hg.field_rb) {
                        if (fb.field_e.field_I.a(true)) {
                          return false;
                        } else {
                          df.a(-17306, 9);
                          w.field_m = w.field_m & -1025;
                          return false;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  break L8;
                }
              }
              L12: {
                if (ai.field_b != 21) {
                  break L12;
                } else {
                  if (10 != hg.field_rb) {
                    break L12;
                  } else {
                    if (!fb.field_e.field_I.a(true)) {
                      df.a(-17306, 9);
                      w.field_m = w.field_m & -1025;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              return false;
            }
          }
        }
        L13: {
          if (ai.field_b != 21) {
            break L13;
          } else {
            if (10 != hg.field_rb) {
              break L13;
            } else {
              if (!fb.field_e.field_I.a(true)) {
                df.a(-17306, 9);
                w.field_m = w.field_m & -1025;
                break L13;
              } else {
                return false;
              }
            }
          }
        }
        return false;
    }

    final static ef a(ul param0, int param1, int param2, int param3, ul param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ef stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$11 = -42;
            if (ud.a(param1, param4, param3)) {
              int discarded$12 = 5;
              boolean discarded$13 = er.a();
              stackOut_3_0 = rb.a(103, param0.a(param1, true, param3));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ef) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("er.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(0).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ma();
        field_h = 0;
        field_i = field_h;
        field_k = 0;
    }
}
