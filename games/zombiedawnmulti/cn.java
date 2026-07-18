/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends ng {
    private be field_s;
    private byte[] field_A;
    static String field_C;
    private bq field_x;
    private f field_p;
    private byte[] field_k;
    private qb field_h;
    static ao field_j;
    private bq field_t;
    private qc field_l;
    private ai field_z;
    private int field_B;
    static String field_u;
    private int field_w;
    private int field_o;
    private boolean field_m;
    private th field_q;
    private th field_v;
    private int field_i;
    private boolean field_y;
    private boolean field_n;
    private long field_r;

    final static ic a(byte param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        Object stackIn_2_0 = null;
        ic stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ic stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0 >= 116) {
              L1: {
                var4_long = 0L;
                var6 = null;
                if (-1 == param1.indexOf('@')) {
                  var4_long = cq.a(0, (CharSequence) (Object) param1);
                  break L1;
                } else {
                  var6 = (Object) (Object) param1;
                  break L1;
                }
              }
              stackOut_6_0 = eg.a(64, var4_long, (String) var6, param3, param2);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ic) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((cn) this).field_x != null) {
              L1: {
                ((cn) this).field_m = true;
                if (null != ((cn) this).field_v) {
                  break L1;
                } else {
                  ((cn) this).field_v = new th();
                  break L1;
                }
              }
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  ((cn) this).field_i = -112;
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
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "cn.B(" + param0 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        br var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_35_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (null == ((cn) this).field_v) {
              return;
            } else {
              if (null == ((cn) this).a((byte) -101)) {
                return;
              } else {
                var2_ref = ((cn) this).field_q.c(65);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (null == var2_ref) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_e;
                        stackOut_9_0 = var3;
                        stackIn_36_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (stackIn_10_0 < 0) {
                                  break L6;
                                } else {
                                  if (var3 >= ((cn) this).field_s.field_e) {
                                    break L6;
                                  } else {
                                    if (((cn) this).field_s.field_s[var3] == 0) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(true);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((cn) this).field_A[var3] != 0) {
                                break L7;
                              } else {
                                qc discarded$2 = this.b(1, 0, var3);
                                break L7;
                              }
                            }
                            L8: {
                              if (-1 == ((cn) this).field_A[var3]) {
                                qc discarded$3 = this.b(2, 0, var3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (((cn) this).field_A[var3] != 1) {
                              break L4;
                            } else {
                              var2_ref.a(true);
                              break L4;
                            }
                          }
                          var2_ref = ((cn) this).field_q.b(6);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_35_0 = param0;
                    stackIn_36_0 = stackOut_35_0;
                    break L2;
                  }
                  L9: {
                    if (stackIn_36_0 > 64) {
                      break L9;
                    } else {
                      cn.a((ul) null, -84, (byte[]) null, (int[]) null, (byte[]) null, -44, (String[]) null, (ul) null, (ri[]) null, (ul) null, 116, (ja[][]) null, true, (String[][]) null, (int[]) null, (ja[][]) null, (String[][]) null);
                      break L9;
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "cn.C(" + param0 + ')');
        }
    }

    final be a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        be stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_54_0 = null;
        be stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_53_0 = null;
        be stackOut_58_0 = null;
        be stackOut_2_0 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((cn) this).field_s == null) {
              L1: {
                if (null != ((cn) this).field_l) {
                  break L1;
                } else {
                  if (!((cn) this).field_h.e(24)) {
                    ((cn) this).field_l = (qc) (Object) ((cn) this).field_h.a(487989472, ((cn) this).field_B, true, 255, (byte) 0);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (be) (Object) stackIn_9_0;
                  }
                }
              }
              if (((cn) this).field_l.field_t) {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (be) (Object) stackIn_15_0;
              } else {
                L2: {
                  var2_array = ((cn) this).field_l.e(0);
                  if (param0 <= -83) {
                    break L2;
                  } else {
                    cn.d(-53);
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (((cn) this).field_l instanceof li) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (null == var2_array) {
                            throw new RuntimeException();
                          } else {
                            ((cn) this).field_s = new be(var2_array, ((cn) this).field_o, ((cn) this).field_k);
                            break L5;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((cn) this).field_h.a((byte) 113);
                            ((cn) this).field_s = null;
                            if (((cn) this).field_h.e(98)) {
                              break L7;
                            } else {
                              ((cn) this).field_l = (qc) (Object) ((cn) this).field_h.a(487989472, ((cn) this).field_B, true, 255, (byte) 0);
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((cn) this).field_l = null;
                          break L6;
                        }
                        stackOut_32_0 = null;
                        stackIn_33_0 = stackOut_32_0;
                        return (be) (Object) stackIn_33_0;
                      }
                      if (((cn) this).field_t != null) {
                        li discarded$1 = ((cn) this).field_z.a(((cn) this).field_B, ((cn) this).field_t, var2_array, 100);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L8: {
                      if (var2_array == null) {
                        throw new RuntimeException();
                      } else {
                        ((cn) this).field_s = new be(var2_array, ((cn) this).field_o, ((cn) this).field_k);
                        if (((cn) this).field_w != ((cn) this).field_s.field_h) {
                          throw new RuntimeException();
                        } else {
                          break L8;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((cn) this).field_s = null;
                        if (((cn) this).field_h.e(88)) {
                          break L10;
                        } else {
                          ((cn) this).field_l = (qc) (Object) ((cn) this).field_h.a(487989472, ((cn) this).field_B, true, 255, (byte) 0);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((cn) this).field_l = null;
                      break L9;
                    }
                    stackOut_53_0 = null;
                    stackIn_54_0 = stackOut_53_0;
                    return (be) (Object) stackIn_54_0;
                  }
                  break L3;
                }
                L11: {
                  ((cn) this).field_l = null;
                  if (((cn) this).field_x == null) {
                    break L11;
                  } else {
                    ((cn) this).field_A = new byte[((cn) this).field_s.field_e];
                    break L11;
                  }
                }
                stackOut_58_0 = ((cn) this).field_s;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((cn) this).field_s;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "cn.H(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    final static ja[] a(boolean param0, String param1, ul param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        ja[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            var4_int = param2.a(param3, (byte) 112);
            if (param0) {
              var5 = param2.a(param1, var4_int, -1);
              stackOut_3_0 = a.a(var5, (byte) -93, param2, var4_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ja[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cn.F(").append(param0).append(',');
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
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, boolean param1, int param2, byte param3) {
        try {
            aa.a((byte) 124, param1);
            lp.a((byte) -45, param0, param1, param2);
            if (param3 > -79) {
                field_u = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "cn.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0, int param1) {
        qc var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (qc) (Object) ((cn) this).field_p.a(param1 ^ param1, (long)param0);
            if (var3 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = var3.f(param1 + 103);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3_ref, "cn.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        qc var2_ref = null;
        br var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        byte stackIn_58_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_92_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_12_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_57_0 = 0;
        byte stackOut_57_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_91_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                ((cn) this).field_t = null;
                break L1;
              }
            }
            L2: {
              if (null == ((cn) this).field_v) {
                break L2;
              } else {
                if (null != ((cn) this).a((byte) -110)) {
                  L3: {
                    if (!((cn) this).field_y) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((cn) this).field_v.c(46);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_12_0 = ((cn) this).field_A[var4];
                                stackIn_25_0 = stackOut_12_0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_25_0 >= ((cn) this).field_s.field_s.length) {
                                      break L6;
                                    } else {
                                      stackOut_26_0 = ((cn) this).field_s.field_s[((cn) this).field_i];
                                      stackIn_45_0 = stackOut_26_0;
                                      stackIn_27_0 = stackOut_26_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_27_0 = stackIn_27_0;
                                        stackIn_29_0 = stackOut_27_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_29_0 == 0) {
                                              ((cn) this).field_i = ((cn) this).field_i + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (250 > ((cn) this).field_z.field_h) {
                                              break L11;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (((cn) this).field_A[((cn) this).field_i] != 0) {
                                              break L12;
                                            } else {
                                              qc discarded$4 = this.b(1, 0, ((cn) this).field_i);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((cn) this).field_A[((cn) this).field_i] != 0) {
                                              break L13;
                                            } else {
                                              var3 = new br();
                                              var3.field_e = (long)((cn) this).field_i;
                                              ((cn) this).field_v.a(var3, false);
                                              var2_int = 0;
                                              break L13;
                                            }
                                          }
                                          ((cn) this).field_i = ((cn) this).field_i + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_24_0 = ((cn) this).field_i;
                                        stackIn_25_0 = stackOut_24_0;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_13_0 == 0) {
                                      qc discarded$5 = this.b(1, 0, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((cn) this).field_A[var4] == 0) {
                                        break L16;
                                      } else {
                                        var3.a(true);
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L15;
                                  }
                                  var3 = ((cn) this).field_v.b(6);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_24_0 = ((cn) this).field_i;
                              stackIn_25_0 = stackOut_24_0;
                              if (stackIn_25_0 >= ((cn) this).field_s.field_s.length) {
                                break L6;
                              } else {
                                stackOut_26_0 = ((cn) this).field_s.field_s[((cn) this).field_i];
                                stackIn_45_0 = stackOut_26_0;
                                stackIn_27_0 = stackOut_26_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_27_0 = stackIn_27_0;
                                  stackIn_29_0 = stackOut_27_0;
                                  L18: {
                                    if (stackIn_29_0 == 0) {
                                      ((cn) this).field_i = ((cn) this).field_i + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (250 > ((cn) this).field_z.field_h) {
                                      break L19;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (((cn) this).field_A[((cn) this).field_i] != 0) {
                                      break L20;
                                    } else {
                                      qc discarded$4 = this.b(1, 0, ((cn) this).field_i);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((cn) this).field_A[((cn) this).field_i] != 0) {
                                      break L21;
                                    } else {
                                      var3 = new br();
                                      var3.field_e = (long)((cn) this).field_i;
                                      ((cn) this).field_v.a(var3, false);
                                      var2_int = 0;
                                      break L21;
                                    }
                                  }
                                  ((cn) this).field_i = ((cn) this).field_i + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_44_0 = var2_int;
                          stackIn_45_0 = stackOut_44_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_45_0 == 0) {
                            break L22;
                          } else {
                            ((cn) this).field_y = false;
                            ((cn) this).field_i = 0;
                            break L22;
                          }
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L23: {
                    if (((cn) this).field_m) {
                      break L23;
                    } else {
                      ((cn) this).field_v = null;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((cn) this).field_v.c(105);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (var3 == null) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_57_0 = 1;
                            stackOut_57_1 = ((cn) this).field_A[var4];
                            stackIn_70_0 = stackOut_57_0;
                            stackIn_70_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_70_0 >= stackIn_70_1) {
                                  break L26;
                                } else {
                                  stackOut_71_0 = ((cn) this).field_s.field_s[((cn) this).field_i];
                                  stackIn_92_0 = stackOut_71_0;
                                  stackIn_72_0 = stackOut_71_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_72_0 = stackIn_72_0;
                                    stackIn_74_0 = stackOut_72_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_74_0 == 0) {
                                          ((cn) this).field_i = ((cn) this).field_i + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((cn) this).field_h.c(param0 + -89)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L26;
                                          } else {
                                            break L31;
                                          }
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((cn) this).field_A[((cn) this).field_i] == 1) {
                                          break L32;
                                        } else {
                                          qc discarded$6 = this.b(2, 0, ((cn) this).field_i);
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (((cn) this).field_A[((cn) this).field_i] == 1) {
                                          break L33;
                                        } else {
                                          var3 = new br();
                                          var3.field_e = (long)((cn) this).field_i;
                                          var2_int = 0;
                                          ((cn) this).field_v.a(var3, false);
                                          break L33;
                                        }
                                      }
                                      ((cn) this).field_i = ((cn) this).field_i + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_69_0 = ((cn) this).field_i;
                                    stackOut_69_1 = ((cn) this).field_s.field_s.length;
                                    stackIn_70_0 = stackOut_69_0;
                                    stackIn_70_1 = stackOut_69_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_58_0 != stackIn_58_1) {
                                  qc discarded$7 = this.b(2, param0 ^ -2, var4);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((cn) this).field_A[var4] != 1) {
                                    break L36;
                                  } else {
                                    var3.a(true);
                                    if (var5 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L35;
                              }
                              var3 = ((cn) this).field_v.b(6);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_69_0 = ((cn) this).field_i;
                          stackOut_69_1 = ((cn) this).field_s.field_s.length;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          if (stackIn_70_0 >= stackIn_70_1) {
                            break L26;
                          } else {
                            stackOut_71_0 = ((cn) this).field_s.field_s[((cn) this).field_i];
                            stackIn_92_0 = stackOut_71_0;
                            stackIn_72_0 = stackOut_71_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_72_0 = stackIn_72_0;
                              stackIn_74_0 = stackOut_72_0;
                              L38: {
                                if (stackIn_74_0 == 0) {
                                  ((cn) this).field_i = ((cn) this).field_i + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((cn) this).field_h.c(param0 + -89)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L39;
                                  }
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (((cn) this).field_A[((cn) this).field_i] == 1) {
                                  break L40;
                                } else {
                                  qc discarded$6 = this.b(2, 0, ((cn) this).field_i);
                                  break L40;
                                }
                              }
                              L41: {
                                if (((cn) this).field_A[((cn) this).field_i] == 1) {
                                  break L41;
                                } else {
                                  var3 = new br();
                                  var3.field_e = (long)((cn) this).field_i;
                                  var2_int = 0;
                                  ((cn) this).field_v.a(var3, false);
                                  break L41;
                                }
                              }
                              ((cn) this).field_i = ((cn) this).field_i + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_91_0 = var2_int;
                      stackIn_92_0 = stackOut_91_0;
                      break L25;
                    }
                    if (stackIn_92_0 != 0) {
                      ((cn) this).field_m = false;
                      ((cn) this).field_i = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L42: {
              if (!((cn) this).field_n) {
                break L42;
              } else {
                if (~bl.a((byte) 48) > ~((cn) this).field_r) {
                  break L42;
                } else {
                  var2_ref = (qc) (Object) ((cn) this).field_p.a(0);
                  L43: while (true) {
                    L44: {
                      if (null == var2_ref) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            if (var2_ref.field_t) {
                              break L45;
                            } else {
                              L46: {
                                if (var2_ref.field_x) {
                                  break L46;
                                } else {
                                  var2_ref.field_x = true;
                                  if (var5 == 0) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (var2_ref.field_r) {
                                var2_ref.a(true);
                                break L45;
                              } else {
                                throw new RuntimeException();
                              }
                            }
                          }
                          var2_ref = (qc) (Object) ((cn) this).field_p.b(param0 ^ 122);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((cn) this).field_r = bl.a((byte) 114) - -1000L;
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "cn.A(" + param0 + ')');
        }
    }

    private final qc b(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        Object stackIn_100_0 = null;
        Object stackIn_107_0 = null;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        Object stackIn_142_0 = null;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        Object stackIn_154_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_146_0 = 0;
        byte stackOut_146_1 = 0;
        Object stackOut_153_0 = null;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        Object stackOut_99_0 = null;
        Object stackOut_106_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (qc) (Object) ((cn) this).field_p.a(0, (long)param2);
              if (null == var4) {
                break L1;
              } else {
                if (param0 != 0) {
                  break L1;
                } else {
                  if (((qc) var4).field_r) {
                    break L1;
                  } else {
                    if (((qc) var4).field_t) {
                      ((qc) var4).a(true);
                      var4 = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null != var4) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param0 != 0) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if (((cn) this).field_x == null) {
                            break L6;
                          } else {
                            if (((cn) this).field_A[param2] != -1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (!((cn) this).field_h.e(param1 + 116)) {
                          var4 = (Object) (Object) ((cn) this).field_h.a(487989472, param2, true, ((cn) this).field_B, (byte) 2);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackOut_27_0 = null;
                          stackIn_28_0 = stackOut_27_0;
                          return (qc) (Object) stackIn_28_0;
                        }
                      }
                      var4 = (Object) (Object) ((cn) this).field_z.a(param2, ((cn) this).field_x, -3);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    if (param0 != 1) {
                      break L7;
                    } else {
                      if (((cn) this).field_x != null) {
                        var4 = (Object) (Object) ((cn) this).field_z.b(param2, ((cn) this).field_x, 10);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (param0 == 2) {
                    if (((cn) this).field_x == null) {
                      throw new RuntimeException();
                    } else {
                      if (-1 == ((cn) this).field_A[param2]) {
                        if (!((cn) this).field_h.c(-64)) {
                          var4 = (Object) (Object) ((cn) this).field_h.a(487989472, param2, false, ((cn) this).field_B, (byte) 2);
                          break L3;
                        } else {
                          stackOut_53_0 = null;
                          stackIn_54_0 = stackOut_53_0;
                          return (qc) (Object) stackIn_54_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
                ((cn) this).field_p.a(true, (long)param2, (br) var4);
                break L2;
              }
            }
            if (((qc) var4).field_t) {
              stackOut_60_0 = null;
              stackIn_61_0 = stackOut_60_0;
              return (qc) (Object) stackIn_61_0;
            } else {
              var5 = ((qc) var4).e(param1);
              if (!(var4 instanceof li)) {
                try {
                  L8: {
                    L9: {
                      if (null == var5) {
                        break L9;
                      } else {
                        if (var5.length <= 2) {
                          break L9;
                        } else {
                          gn.field_B.reset();
                          gn.field_B.update(var5, 0, -2 + var5.length);
                          var6_int = (int)gn.field_B.getValue();
                          if (((cn) this).field_s.field_r[param2] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((cn) this).field_s.field_a == null) {
                                break L10;
                              } else {
                                if (((cn) this).field_s.field_a[param2] == null) {
                                  break L10;
                                } else {
                                  var7 = ((cn) this).field_s.field_a[param2];
                                  var8 = ho.a(4246, 0, var5, -2 + var5.length);
                                  var9 = 0;
                                  L11: while (true) {
                                    if (var9 >= 64) {
                                      break L10;
                                    } else {
                                      stackOut_125_0 = ~var8[var9];
                                      stackOut_125_1 = ~var7[var9];
                                      stackIn_147_0 = stackOut_125_0;
                                      stackIn_147_1 = stackOut_125_1;
                                      stackIn_126_0 = stackOut_125_0;
                                      stackIn_126_1 = stackOut_125_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L8;
                                      } else {
                                        if (stackIn_126_0 != stackIn_126_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L11;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((cn) this).field_h.field_n = 0;
                            ((cn) this).field_h.field_p = 0;
                            decompiledRegionSelector0 = 1;
                            break L8;
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L12: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((cn) this).field_h.a((byte) 95);
                    ((qc) var4).a(true);
                    if (!((qc) var4).field_r) {
                      break L12;
                    } else {
                      if (!((cn) this).field_h.e(110)) {
                        var4 = (Object) (Object) ((cn) this).field_h.a(487989472, param2, true, ((cn) this).field_B, (byte) 2);
                        ((cn) this).field_p.a(true, (long)param2, (br) var4);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  stackOut_141_0 = null;
                  stackIn_142_0 = stackOut_141_0;
                  return (qc) (Object) stackIn_142_0;
                }
                L13: {
                  L14: {
                    if (decompiledRegionSelector0 == 0) {
                      break L14;
                    } else {
                      var5[-2 + var5.length] = (byte)(((cn) this).field_s.field_p[param2] >>> 900439080);
                      var5[-1 + var5.length] = (byte)((cn) this).field_s.field_p[param2];
                      if (null != ((cn) this).field_x) {
                        li discarded$1 = ((cn) this).field_z.a(param2, ((cn) this).field_x, var5, param1 + 108);
                        stackOut_146_0 = 1;
                        stackOut_146_1 = ((cn) this).field_A[param2];
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (stackIn_147_0 != stackIn_147_1) {
                    ((cn) this).field_A[param2] = (byte) 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L15: {
                  if (((qc) var4).field_r) {
                    break L15;
                  } else {
                    ((qc) var4).a(true);
                    break L15;
                  }
                }
                stackOut_153_0 = var4;
                stackIn_154_0 = stackOut_153_0;
                break L0;
              } else {
                try {
                  L16: {
                    L17: {
                      if (null == var5) {
                        break L17;
                      } else {
                        if (var5.length > 2) {
                          gn.field_B.reset();
                          gn.field_B.update(var5, 0, -2 + var5.length);
                          var6_int = (int)gn.field_B.getValue();
                          if (~((cn) this).field_s.field_r[param2] == ~var6_int) {
                            L18: {
                              L19: {
                                if (null == ((cn) this).field_s.field_a) {
                                  break L19;
                                } else {
                                  if (((cn) this).field_s.field_a[param2] == null) {
                                    break L19;
                                  } else {
                                    var7 = ((cn) this).field_s.field_a[param2];
                                    var8 = ho.a(4246, 0, var5, var5.length + -2);
                                    var9 = 0;
                                    L20: while (true) {
                                      if (var9 >= 64) {
                                        break L19;
                                      } else {
                                        stackOut_78_0 = ~var7[var9];
                                        stackOut_78_1 = ~var8[var9];
                                        stackIn_86_0 = stackOut_78_0;
                                        stackIn_86_1 = stackOut_78_1;
                                        stackIn_79_0 = stackOut_78_0;
                                        stackIn_79_1 = stackOut_78_1;
                                        if (var10 != 0) {
                                          break L18;
                                        } else {
                                          if (stackIn_79_0 != stackIn_79_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L20;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_85_0 = 65280 & var5[var5.length + -2] << -2106908856;
                              stackOut_85_1 = 255 & var5[var5.length + -1];
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              break L18;
                            }
                            var7_int = stackIn_86_0 + stackIn_86_1;
                            if (~var7_int != ~(((cn) this).field_s.field_p[param2] & 65535)) {
                              throw new RuntimeException();
                            } else {
                              L21: {
                                if (((cn) this).field_A[param2] != 1) {
                                  L22: {
                                    if (0 == ((cn) this).field_A[param2]) {
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  ((cn) this).field_A[param2] = (byte) 1;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L23: {
                                if (!((qc) var4).field_r) {
                                  ((qc) var4).a(true);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              stackOut_99_0 = var4;
                              stackIn_100_0 = stackOut_99_0;
                              break L16;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L24: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((cn) this).field_A[param2] = (byte) -1;
                    ((qc) var4).a(true);
                    if (!((qc) var4).field_r) {
                      break L24;
                    } else {
                      if (((cn) this).field_h.e(34)) {
                        break L24;
                      } else {
                        var4 = (Object) (Object) ((cn) this).field_h.a(487989472, param2, true, ((cn) this).field_B, (byte) 2);
                        ((cn) this).field_p.a(true, (long)param2, (br) var4);
                        break L24;
                      }
                    }
                  }
                  stackOut_106_0 = null;
                  stackIn_107_0 = stackOut_106_0;
                  return (qc) (Object) stackIn_107_0;
                }
                return (qc) (Object) stackIn_100_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw fa.a((Throwable) var4, "cn.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (qc) (Object) stackIn_154_0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 < -5) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            var3_int = param2 >>> 925627647;
            stackOut_3_0 = -var3_int + (var3_int + param2) / param0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "cn.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(ul param0, int param1, byte[] param2, int[] param3, byte[] param4, int param5, String[] param6, ul param7, ri[] param8, ul param9, int param10, ja[][] param11, boolean param12, String[][] param13, int[] param14, ja[][] param15, String[][] param16) {
        RuntimeException var17 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ja[] discarded$1 = cn.a(true, (String) null, (ul) null, (String) null);
                break L1;
              }
            }
            e.a(param7, param4, 1, (String[]) null, param14, param5, param11, param6, true, param16, param10, param13, param0, param2, param3, param8, param15, param9, param12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var17;
            stackOut_5_1 = new StringBuilder().append("cn.L(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
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
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param7 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param8 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param9 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L9;
            }
          }
          L10: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param10).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param11 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L10;
            }
          }
          L11: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',').append(param12).append(',');
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param13 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L11;
            }
          }
          L12: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param14 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L12;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L12;
            }
          }
          L13: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param15 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L13;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L13;
            }
          }
          L14: {
            stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param16 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L14;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L14;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ')');
        }
    }

    final byte[] a(int param0, int param1) {
        qc var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.b(0, 0, param1);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              if (param0 == -123) {
                var4 = var3.e(0);
                var3.a(true);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3_ref, "cn.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -103) {
                break L1;
              } else {
                cn.a(-126, true, 28, (byte) -117);
                break L1;
              }
            }
            field_C = null;
            field_j = null;
            field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "cn.J(" + param0 + ')');
        }
    }

    cn(int param0, bq param1, bq param2, qb param3, ai param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((cn) this).field_p = new f(16);
        ((cn) this).field_i = 0;
        ((cn) this).field_q = new th();
        ((cn) this).field_r = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((cn) this).field_x = param1;
                ((cn) this).field_B = param0;
                if (null != ((cn) this).field_x) {
                  break L2;
                } else {
                  ((cn) this).field_y = false;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((cn) this).field_y = true;
              ((cn) this).field_v = new th();
              break L1;
            }
            L3: {
              ((cn) this).field_t = param2;
              ((cn) this).field_w = param7;
              ((cn) this).field_h = param3;
              ((cn) this).field_z = param4;
              ((cn) this).field_n = param8;
              ((cn) this).field_o = param5;
              ((cn) this).field_k = param6;
              if (null == ((cn) this).field_t) {
                break L3;
              } else {
                ((cn) this).field_l = (qc) (Object) ((cn) this).field_z.a(((cn) this).field_B, ((cn) this).field_t, -3);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("cn.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "New Game";
        field_j = new ao(12, 0, 1, 0);
        field_u = "Get them! GET THEM!";
    }
}
