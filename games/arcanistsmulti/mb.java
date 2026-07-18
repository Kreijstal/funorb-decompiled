/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends mh {
    int field_Y;
    private dj field_M;
    int field_Q;
    static String field_R;
    static long[][] field_L;
    static ll[] field_cb;
    int field_T;
    Object[] field_W;
    static int[] field_U;
    static long[] field_V;
    private ti field_X;
    static String field_S;
    static int field_P;
    static String field_O;
    static String field_Z;
    static ll[] field_ab;
    static String field_N;
    static int field_bb;

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_31_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            ((mb) this).field_Q = -1;
            if (!((mb) this).field_X.field_G) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((mb) this).field_X.field_H.field_P.field_w) {
                if (((mb) this).field_W == null) {
                  stackOut_11_0 = super.a((byte) -47, param1, param2, param3, param4);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  param4 = param4 - (((mb) this).field_n + param3);
                  param2 = param2 - (param1 + ((mb) this).field_j);
                  if (param0 == -47) {
                    L1: {
                      if (0 > param4) {
                        break L1;
                      } else {
                        if (param2 < 0) {
                          break L1;
                        } else {
                          if (~((mb) this).field_v > ~param4) {
                            break L1;
                          } else {
                            if (~((mb) this).field_k <= ~param2) {
                              L2: {
                                ((mb) this).field_Q = param2 / ((mb) this).field_T;
                                if (~((mb) this).field_Q > ~((mb) this).field_W.length) {
                                  break L2;
                                } else {
                                  ((mb) this).field_Q = -1;
                                  break L2;
                                }
                              }
                              stackOut_31_0 = 1;
                              stackIn_32_0 = stackOut_31_0;
                              break L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    stackOut_26_0 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    return stackIn_27_0 != 0;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var6, "mb.BB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_32_0 != 0;
    }

    public static void a(int param0) {
        field_N = null;
        field_cb = null;
        field_L = null;
        if (param0 <= 119) {
            return;
        }
        try {
            field_U = null;
            field_Z = null;
            field_R = null;
            field_O = null;
            field_V = null;
            field_S = null;
            field_ab = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mb.WA(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_16_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = 57;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 == 1) {
                stackOut_8_0 = 54;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (param0 == 2) {
                  stackOut_13_0 = 54;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (param1 == 813231272) {
                    if (param0 == 3) {
                      stackOut_21_0 = 54;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0;
                    } else {
                      if (4 != param0) {
                        if (param0 != 5) {
                          stackOut_29_0 = 27;
                          stackIn_30_0 = stackOut_29_0;
                          break L0;
                        } else {
                          stackOut_27_0 = 57;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        }
                      } else {
                        stackOut_24_0 = 72;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      }
                    }
                  } else {
                    stackOut_16_0 = -38;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "mb.AB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_30_0;
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 27825) {
              L1: {
                if (null != ((mb) this).field_W) {
                  stackOut_6_0 = ((mb) this).field_T * (1 + 2 * ((mb) this).field_W.length) >> 1313345889;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_4_0 = 200;
                  stackIn_7_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = ((int[]) ((Object[]) ((mb) this).field_W[1])[7])[21];
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "mb.UA(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            super.a(-105, param1, param2, param3);
            param1 = param1 - ((mb) this).field_n;
            if (param0 < -99) {
              L1: {
                param3 = param3 - ((mb) this).field_j;
                if (((mb) this).field_W != null) {
                  var5_int = param3 / ((mb) this).field_T;
                  if (var5_int < 0) {
                    break L1;
                  } else {
                    if (~((mb) this).field_W.length >= ~var5_int) {
                      break L1;
                    } else {
                      ((mb) this).field_Y = var5_int;
                      ((mb) this).field_X.a(0);
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "mb.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int j(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 19) {
                break L1;
              } else {
                int discarded$2 = mb.a(-104, 99);
                break L1;
              }
            }
            stackOut_3_0 = -bk.field_I + bj.field_tb;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "mb.TA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final Object g(int param0) {
        RuntimeException var2 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 125) {
                break L1;
              } else {
                ((mb) this).a((byte) -47, ((int[]) ((mb) this).field_W[4])[0], ((int[]) ((mb) this).field_W[3])[0], 2);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((mb) this).field_W == null) {
                  break L3;
                } else {
                  if (((mb) this).field_Y == -1) {
                    break L3;
                  } else {
                    stackOut_7_0 = ((mb) this).field_W[((mb) this).field_Y];
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "mb.SA(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 < -52) {
              if (param2 != 0) {
                return;
              } else {
                L1: {
                  var5_int = ((mb) this).field_n + param1;
                  var6 = param3 - -((mb) this).field_j;
                  de.d(var5_int, var6, ((mb) this).field_v, ((mb) this).field_k, 0);
                  var7 = ((mb) this).field_Y;
                  if (-1 != ((mb) this).field_Q) {
                    var7 = ((mb) this).field_Q;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (null != ((mb) this).field_W) {
                      var8 = 0;
                      L4: while (true) {
                        if (((mb) this).field_W.length <= var8) {
                          break L3;
                        } else {
                          var9 = ((mb) this).field_W[var8];
                          var10 = var9.toString();
                          if (var11 != 0) {
                            break L2;
                          } else {
                            L5: {
                              if (var8 == var7) {
                                de.e(var5_int + 2, var6 + 4, ((mb) this).field_v - 4, ((mb) this).field_T, 2188450, 128);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var6 = var6 + ((mb) this).field_T;
                            ((mb) this).field_M.a(var10, var5_int + 2, var6, 10000536, -1);
                            var8++;
                            if (var11 == 0) {
                              continue L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
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
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var5, "mb.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(Object[] param0, byte param1, int param2) {
        RuntimeException var4 = null;
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
        try {
          L0: {
            ((mb) this).field_Q = -1;
            ((mb) this).field_W = param0;
            if (param1 == 10) {
              L1: {
                ((mb) this).field_Y = param2;
                if (param0 == null) {
                  break L1;
                } else {
                  L2: {
                    if (((mb) this).field_Y < -1) {
                      break L2;
                    } else {
                      if (~((mb) this).field_W.length >= ~((mb) this).field_Y) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  throw new IllegalStateException();
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("mb.RA(");
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, Object param1, dl param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.field_a != null) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (var3_int >= 50) {
                    break L2;
                  } else {
                    if (null == param2.field_a.peekEvent()) {
                      break L2;
                    } else {
                      ao.a(1L, 1);
                      var3_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param0 < -48) {
                        break L4;
                      } else {
                        mb.a(-54, (Object) null, (dl) null);
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 == null) {
                        break L5;
                      } else {
                        param2.field_a.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                        break L5;
                      }
                    }
                    break L3;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("mb.VA(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L8;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    mb(ti param0, dj param1, Object[] param2, int param3) {
        super((qm) (Object) param0);
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
        try {
          L0: {
            ((mb) this).field_X = param0;
            ((mb) this).field_M = param1;
            ((mb) this).field_T = ((mb) this).field_M.field_m + ((mb) this).field_M.field_C;
            this.a(param2, (byte) 10, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mb.<init>(");
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
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_6_0 = 0L;
        long stackOut_5_0 = 0L;
        long stackOut_3_0 = 0L;
        field_L = new long[8][256];
        field_R = "Earn more wands by playing Rated games.";
        field_V = new long[11];
        field_U = new int[]{18, 19, 20};
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_V[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
                field_S = "Send private message to <%0>";
                field_O = "Invite players";
                field_Z = "Screen Size";
                field_N = "Names can only contain letters, numbers, spaces and underscores";
                return;
              } else {
                var1 = -8 + var0 * 8;
                field_V[var0] = kh.a(on.a(field_L[7][7 + var1], 255L), kh.a(on.a(field_L[6][var1 - -6], 65280L), kh.a(kh.a(kh.a(kh.a(on.a(280375465082880L, field_L[2][var1 + 2]), kh.a(on.a(field_L[0][var1], -72057594037927936L), on.a(71776119061217280L, field_L[1][1 + var1]))), on.a(field_L[3][3 + var1], 1095216660480L)), on.a(4278190080L, field_L[4][var1 - -4])), on.a(16711680L, field_L[5][var1 + 5]))));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((1 & var0) == 0) {
                stackOut_5_0 = (long)(var1 >>> 813231272);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_6_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_6_0;
              var4 = var2 << -861045823;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -376276479;
              if (var6 >= 256L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << -1309733183;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_L[0][var0] = vg.a(vg.a(vg.a(vg.a(vg.a(vg.a(var6 << 1632052200, vg.a(var2 << -2109000520, var2 << -965168976)), var2 << 281165088), var10 << -710310888), var8 << -1486712560), var4 << 442549704), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_L[var14][var0] = vg.a(field_L[-1 + var14][var0] >>> 2067180808, field_L[var14 + -1][var0] << 377389304);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
