/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lk {
    private int[] field_E;
    private ek field_n;
    int[] field_O;
    private int field_H;
    int[] field_u;
    private int[] field_C;
    private int[] field_v;
    private int[] field_l;
    static String field_p;
    private int[] field_J;
    private int[] field_M;
    private int[] field_T;
    private int[] field_x;
    static boolean field_F;
    private na field_A;
    private cb[][] field_R;
    private int field_K;
    private int[] field_r;
    private cb[][] field_L;
    static int field_B;
    private int[] field_S;
    private int[] field_G;
    static int[] field_N;
    private int[] field_w;
    int[] field_q;
    static byte[][] field_o;
    private int[] field_t;
    private long field_P;
    private kj field_y;
    private int field_z;
    private boolean field_D;
    private int field_m;
    private long field_U;
    private boolean field_I;
    private int field_Q;
    private ih field_s;

    private final void a(int param0, byte param1, int param2) {
        ((hl) this).field_G[param2] = param0;
        ((hl) this).field_t[param2] = vg.a(param0, -128);
        if (param1 <= 30) {
            return;
        }
        try {
            this.a(param2, 2, param0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.QA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        ((hl) this).field_M[param2] = param1;
        if (param0) {
            return;
        }
        try {
            ((hl) this).field_O[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0 + 0.5);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean b(cb param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((hl) this).field_J = null;
                break L1;
              }
            }
            if (param0.field_C == null) {
              L2: {
                if (param0.field_h >= 0) {
                  param0.b((byte) -128);
                  if (param0.field_u <= 0) {
                    break L2;
                  } else {
                    if (((hl) this).field_L[param0.field_z][param0.field_u] == param0) {
                      ((hl) this).field_L[param0.field_z][param0.field_u] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0 != 0;
            } else {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("hl.KA(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized void b(int param0, int param1) {
        try {
            ((hl) this).field_K = param1;
            if (param0 != -180) {
                boolean discarded$0 = ((hl) this).a(63, (ih) null, (byte) -51, (ja) null, (sh) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.NA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_p = null;
              field_o = null;
              if (param0) {
                break L1;
              } else {
                hl.d(-92);
                break L1;
              }
            }
            field_N = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hl.OA(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, th param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
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
            L1: {
              if (param0) {
                break L1;
              } else {
                hl.f(53, 103);
                break L1;
              }
            }
            L2: {
              if (param1.g(1, 26527) != 1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("hl.E(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void e(int param0, int param1) {
        cb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 39) {
                break L1;
              } else {
                ((hl) this).field_I = false;
                break L1;
              }
            }
            var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (param1 < 0) {
                            break L6;
                          } else {
                            if (var3.field_z != param1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (null != var3.field_C) {
                            L8: {
                              var3.field_C.h(b.field_r / 100);
                              if (var3.field_C.h()) {
                                ((hl) this).field_y.field_m.a((lk) (Object) var3.field_C);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3.c(0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (var3.field_h < 0) {
                            ((hl) this).field_R[var3.field_z][var3.field_q] = null;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var3.b((byte) -116);
                        break L5;
                      }
                      var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
                      if (var4 == 0) {
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
          var3_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3_ref, "hl.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0, ih param1, byte param2, ja param3, sh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        cj var8 = null;
        int var9 = 0;
        wj var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_2_0 = 0;
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
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            param1.b();
            var6_int = 1;
            if (param2 == 102) {
              L1: {
                var7 = null;
                if (0 < param0) {
                  var7 = (Object) (Object) new int[]{param0};
                  break L1;
                } else {
                  break L1;
                }
              }
              var8 = (cj) (Object) param1.field_i.c((byte) -111);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (null == var8) {
                        break L5;
                      } else {
                        var9 = (int)var8.field_d;
                        var10 = (wj) (Object) ((hl) this).field_A.a((long)var9, (byte) 120);
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (var10 != null) {
                                break L7;
                              } else {
                                L8: {
                                  var10 = ug.a(param4, var9, true);
                                  if (null != var10) {
                                    break L8;
                                  } else {
                                    var6_int = 0;
                                    if (var11 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                ((hl) this).field_A.a((kd) (Object) var10, (byte) -48, (long)var9);
                                break L7;
                              }
                            }
                            if (var10.a(var8.field_h, param3, (byte) 116, (int[]) var7)) {
                              break L6;
                            } else {
                              var6_int = 0;
                              break L6;
                            }
                          }
                          var8 = (cj) (Object) param1.field_i.a((byte) -91);
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var6_int != 0) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                  param1.a();
                  break L3;
                }
                stackOut_25_0 = var6_int;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("hl.G(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
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
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
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
          L11: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L11;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final void a(byte param0, cb param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.field_w.field_i.length;
              if (param0 == 92) {
                break L1;
              } else {
                ((hl) this).field_v = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2) {
                  break L3;
                } else {
                  if (!param1.field_w.field_l) {
                    break L3;
                  } else {
                    L4: {
                      var6 = -param1.field_w.field_k + var4_int + var4_int;
                      var5 = (int)((long)var6 * (long)((hl) this).field_u[param1.field_z] >> 1425469254);
                      var4_int = var4_int << 8;
                      if (~var4_int >= ~var5) {
                        param1.field_C.c(true);
                        var5 = var4_int + (var4_int - (1 - -var5));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (!Lexicominos.field_L) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((hl) this).field_u[param1.field_z] >> -839552186);
              break L2;
            }
            param1.field_C.b(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("hl.IA(").append(param0).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        try {
            ((hl) this).field_n.g();
            ((hl) this).field_s = null;
            this.a(param0, (byte) -87);
            if (param1 != 43) {
                ((hl) this).a(-117);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void d(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_B = -22;
                break L1;
              }
            }
            this.a(true, 43);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "hl.EA(" + param0 + ')');
        }
    }

    private final void g(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 240 & param1;
            if (var3_int == 128) {
              var4 = 15 & param1;
              var5 = param1 >> 1474627272 & 127;
              var6 = (8341718 & param1) >> -1751248496;
              this.a(var6, var5, var4, 0);
              return;
            } else {
              if (var3_int != 144) {
                if (var3_int == 160) {
                  var4 = 15 & param1;
                  var5 = 127 & param1 >> 2038571976;
                  var6 = 127 & param1 >> -1219503024;
                  this.a((byte) -103, var6, var4, var5);
                  return;
                } else {
                  L1: {
                    if (param0 <= -21) {
                      break L1;
                    } else {
                      ((hl) this).field_n = null;
                      break L1;
                    }
                  }
                  if (var3_int == 176) {
                    L2: {
                      var4 = 15 & param1;
                      var5 = param1 >> -1878661176 & 127;
                      var6 = (8388315 & param1) >> 1749186736;
                      if (0 == var5) {
                        ((hl) this).field_t[var4] = (var6 << 91688110) + vg.a(((hl) this).field_t[var4], -2080769);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (32 != var5) {
                        break L3;
                      } else {
                        ((hl) this).field_t[var4] = vg.a(-16257, ((hl) this).field_t[var4]) - -(var6 << 737964263);
                        break L3;
                      }
                    }
                    L4: {
                      if (var5 != 1) {
                        break L4;
                      } else {
                        ((hl) this).field_x[var4] = vg.a(-16257, ((hl) this).field_x[var4]) - -(var6 << 1375367);
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 == 33) {
                        ((hl) this).field_x[var4] = var6 + vg.a(-128, ((hl) this).field_x[var4]);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (5 != var5) {
                        break L6;
                      } else {
                        ((hl) this).field_S[var4] = vg.a(((hl) this).field_S[var4], -16257) + (var6 << 1325931399);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 == 37) {
                        ((hl) this).field_S[var4] = vg.a(((hl) this).field_S[var4], -128) - -var6;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (7 == var5) {
                        ((hl) this).field_J[var4] = vg.a(-16257, ((hl) this).field_J[var4]) - -(var6 << 1535161991);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (39 != var5) {
                        break L9;
                      } else {
                        ((hl) this).field_J[var4] = vg.a(((hl) this).field_J[var4], -128) - -var6;
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 != 10) {
                        break L10;
                      } else {
                        ((hl) this).field_C[var4] = vg.a(((hl) this).field_C[var4], -16257) + (var6 << -1606040409);
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 == 42) {
                        ((hl) this).field_C[var4] = var6 + vg.a(-128, ((hl) this).field_C[var4]);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (11 != var5) {
                        break L12;
                      } else {
                        ((hl) this).field_l[var4] = (var6 << 857588871) + vg.a(-16257, ((hl) this).field_l[var4]);
                        break L12;
                      }
                    }
                    L13: {
                      if (43 == var5) {
                        ((hl) this).field_l[var4] = vg.a(-128, ((hl) this).field_l[var4]) + var6;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (64 != var5) {
                        break L14;
                      } else {
                        L15: {
                          if (var6 < 64) {
                            break L15;
                          } else {
                            ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 1);
                            if (var8 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -2);
                        break L14;
                      }
                    }
                    L16: {
                      if (var5 == 65) {
                        L17: {
                          if (64 <= var6) {
                            break L17;
                          } else {
                            this.a(var4, 16384);
                            ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -3);
                            if (var8 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 2);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L18: {
                      if (var5 != 99) {
                        break L18;
                      } else {
                        ((hl) this).field_v[var4] = (var6 << -1274034457) + vg.a(127, ((hl) this).field_v[var4]);
                        break L18;
                      }
                    }
                    L19: {
                      if (var5 != 98) {
                        break L19;
                      } else {
                        ((hl) this).field_v[var4] = var6 + vg.a(16256, ((hl) this).field_v[var4]);
                        break L19;
                      }
                    }
                    L20: {
                      if (var5 == 101) {
                        ((hl) this).field_v[var4] = (var6 << -1515964537) + vg.a(((hl) this).field_v[var4], 127) + 16384;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (var5 == 100) {
                        ((hl) this).field_v[var4] = vg.a(16256, ((hl) this).field_v[var4]) + 16384 - -var6;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (120 == var5) {
                        this.e(99, var4);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (var5 != 121) {
                        break L23;
                      } else {
                        this.h(var4, 16645);
                        break L23;
                      }
                    }
                    L24: {
                      if (123 == var5) {
                        this.d(112, var4);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (6 != var5) {
                        break L25;
                      } else {
                        var7 = ((hl) this).field_v[var4];
                        if (var7 != 16384) {
                          break L25;
                        } else {
                          ((hl) this).field_r[var4] = vg.a(((hl) this).field_r[var4], -16257) + (var6 << 1478163335);
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (var5 != 38) {
                        break L26;
                      } else {
                        var7 = ((hl) this).field_v[var4];
                        if (16384 == var7) {
                          ((hl) this).field_r[var4] = var6 + vg.a(((hl) this).field_r[var4], -128);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (16 != var5) {
                        break L27;
                      } else {
                        ((hl) this).field_u[var4] = vg.a(-16257, ((hl) this).field_u[var4]) + (var6 << 1328337447);
                        break L27;
                      }
                    }
                    L28: {
                      if (48 == var5) {
                        ((hl) this).field_u[var4] = var6 + vg.a(((hl) this).field_u[var4], -128);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (var5 == 81) {
                        L30: {
                          if (var6 < 64) {
                            break L30;
                          } else {
                            ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 4);
                            if (var8 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        this.c(-785046068, var4);
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -5);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L31: {
                      if (var5 == 17) {
                        this.a(false, (var6 << -339395385) + (-16257 & ((hl) this).field_M[var4]), var4);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      if (var5 != 49) {
                        break L32;
                      } else {
                        this.a(false, (((hl) this).field_M[var4] & -128) + var6, var4);
                        break L32;
                      }
                    }
                    return;
                  } else {
                    if (var3_int == 192) {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> -1054065688;
                      this.a(var4, 2, var5 + ((hl) this).field_t[var4]);
                      return;
                    } else {
                      if (var3_int == 208) {
                        var4 = 15 & param1;
                        var5 = 127 & param1 >> 702448904;
                        this.c(120, var4, var5);
                        return;
                      } else {
                        if (var3_int == 224) {
                          var4 = 15 & param1;
                          var5 = (param1 >> 866224809 & 16256) + ((32570 & param1) >> -1359342872);
                          this.b(var5, -16257, var4);
                          return;
                        } else {
                          var3_int = param1 & 255;
                          if (var3_int != 255) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.a(true, (byte) -87);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L33: {
                  L34: {
                    var4 = param1 & 15;
                    var5 = (32699 & param1) >> 32032232;
                    var6 = (param1 & 8384220) >> 1691962288;
                    if (var6 > 0) {
                      break L34;
                    } else {
                      this.a(64, var5, var4, 0);
                      if (var8 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  this.a(var4, var6, (byte) -111, var5);
                  break L33;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "hl.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized lk b() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hl.A()");
        }
        return (lk) (Object) stackIn_1_0;
    }

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -32) {
              stackOut_3_0 = ((hl) this).field_n.d();
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
          throw ld.a((Throwable) (Object) var2, "hl.S(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void c(int param0, int param1, int param2) {
        try {
            if (param0 != 120) {
                ((hl) this).field_y = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        cb var5 = null;
        RuntimeException var5_ref = null;
        cb var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                ((hl) this).field_q = null;
                break L1;
              }
            }
            var5 = ((hl) this).field_R[param2][param1];
            if (null != var5) {
              L2: {
                L3: {
                  L4: {
                    ((hl) this).field_R[param2][param1] = null;
                    if ((2 & ((hl) this).field_q[param2]) != 0) {
                      break L4;
                    } else {
                      var5.field_h = 0;
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
                  L5: while (true) {
                    if (null == var6) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L6: {
                          if (~var5.field_z != ~var6.field_z) {
                            break L6;
                          } else {
                            if (0 <= var6.field_h) {
                              break L6;
                            } else {
                              if (var6 != var5) {
                                var5.field_h = 0;
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var6 = (cb) (Object) ((hl) this).field_y.field_n.f(param3 ^ 2);
                        if (var7 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var5_ref, "hl.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(cb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            var3_int = ((hl) this).field_C[param0.field_z];
            var4 = -57 / ((param1 - 21) / 32);
            if (var3_int >= 8192) {
              stackOut_3_0 = -(32 + (-param0.field_k + 128) * (-var3_int + 16384) >> -1453334842) + 16384;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 32 + param0.field_k * var3_int >> 1760926662;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("hl.V(");
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
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void f(int param0, int param1) {
        RuntimeException runtimeException = null;
        wa var2 = null;
        mc var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (wa) (Object) ki.field_b.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    na.a((byte) -126, var2, param0);
                    var2 = (wa) (Object) ki.field_b.f(2);
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
                if (param1 == -2212) {
                  break L2;
                } else {
                  return;
                }
              }
              var2_ref = (mc) (Object) vh.field_a.a(true);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var2_ref) {
                      break L6;
                    } else {
                      fj.a(param0, var2_ref, false);
                      var2_ref = (mc) (Object) vh.field_a.f(param1 ^ -2210);
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "hl.K(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 >= 0) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    L4: {
                      if (var4_int >= 16) {
                        break L4;
                      } else {
                        ((hl) this).field_w[var4_int] = param1;
                        var4_int++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((hl) this).field_w[param0] = param1;
              break L1;
            }
            L5: {
              if (!param2) {
                break L5;
              } else {
                ((hl) this).field_u = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "hl.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(ih param0, boolean param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(param2, 43);
              ((hl) this).field_n.a(param0.field_h);
              if (param3 == -5953) {
                break L1;
              } else {
                ((hl) this).field_t = null;
                break L1;
              }
            }
            ((hl) this).field_D = param1;
            ((hl) this).field_P = 0L;
            var5_int = ((hl) this).field_n.e();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var5_int >= ~var6) {
                    break L4;
                  } else {
                    ((hl) this).field_n.c(var6);
                    ((hl) this).field_n.a(var6);
                    ((hl) this).field_n.b(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((hl) this).field_z = ((hl) this).field_n.a();
                ((hl) this).field_m = ((hl) this).field_n.field_a[((hl) this).field_z];
                ((hl) this).field_U = ((hl) this).field_n.d(((hl) this).field_m);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("hl.P(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hl.L()");
        }
        return stackIn_1_0;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        th var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        nc var6_ref_nc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_36_0 = 0;
        var26 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  var1_ref = ig.field_a;
                  var2 = var1_ref.d(true);
                  if (var2 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if (var2 == 1) {
                        break L3;
                      } else {
                        uj.a("HS1: " + qj.h(param0 + -117), (Throwable) null, 1);
                        ck.b((byte) -70);
                        if (var26 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = var1_ref.b(-1698573656);
                    var4_long = var1_ref.f((byte) -102);
                    var6_ref_nc = (nc) (Object) ok.field_b.a(true);
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (null == var6_ref_nc) {
                            break L6;
                          } else {
                            stackOut_12_0 = ~var3;
                            stackIn_20_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var26 != 0) {
                              break L5;
                            } else {
                              if (stackIn_13_0 == ~var6_ref_nc.field_j) {
                                break L6;
                              } else {
                                var6_ref_nc = (nc) (Object) ok.field_b.f(param0 + 2);
                                if (var26 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        if (null != var6_ref_nc) {
                          var6_ref_nc.field_h = var4_long;
                          var6_ref_nc.b((byte) -118);
                          if (var26 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          stackOut_18_0 = -95;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      ck.b((byte) stackIn_20_0);
                      return;
                    }
                  }
                }
                var3 = var1_ref.b(param0 + -1698573656);
                var4 = (sj) (Object) il.field_b.a(true);
                L7: while (true) {
                  L8: {
                    L9: {
                      if (null == var4) {
                        break L9;
                      } else {
                        stackOut_25_0 = ~var3;
                        stackIn_37_0 = stackOut_25_0;
                        stackIn_26_0 = stackOut_25_0;
                        if (var26 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_26_0 != ~var4.field_h) {
                              break L10;
                            } else {
                              if (var26 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var4 = (sj) (Object) il.field_b.f(param0 + 2);
                          if (var26 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var4 == null) {
                      stackOut_36_0 = -32;
                      stackIn_37_0 = stackOut_36_0;
                      break L8;
                    } else {
                      L11: {
                        L12: {
                          var5 = var1_ref.d(true);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            var6 = var4.field_o;
                            var7 = var4.field_m;
                            f.field_l[0].field_b = false;
                            f.field_l[0].field_f = null;
                            f.field_l[0].field_d = og.field_c;
                            var8_int = 1;
                            L13: while (true) {
                              L14: {
                                if (var5 <= var8_int) {
                                  break L14;
                                } else {
                                  f.field_l[var8_int].field_d = var1_ref.c(false);
                                  f.field_l[var8_int].field_b = false;
                                  if (var26 != 0) {
                                    break L11;
                                  } else {
                                    L15: {
                                      L16: {
                                        if (var1_ref.d(true) != 1) {
                                          break L16;
                                        } else {
                                          f.field_l[var8_int].field_f = var1_ref.c(false);
                                          if (var26 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      f.field_l[var8_int].field_f = null;
                                      break L15;
                                    }
                                    var8_int++;
                                    if (var26 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              String[][] dupTemp$6 = new String[3][var6];
                              var4.field_j = dupTemp$6;
                              var8 = dupTemp$6;
                              var9 = new String[3][var6];
                              long[][] dupTemp$7 = new long[3][var6];
                              var4.field_i = dupTemp$7;
                              var10 = dupTemp$7;
                              int[][] dupTemp$8 = new int[3][var7 * var6];
                              var4.field_n = dupTemp$8;
                              var11 = dupTemp$8;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              var17 = 0;
                              var18 = var1_ref.d(true);
                              if (var18 <= 0) {
                                break L12;
                              } else {
                                var19 = 0;
                                L17: while (true) {
                                  if (var19 >= var18) {
                                    break L12;
                                  } else {
                                    var20 = var1_ref.d(true);
                                    var21 = f.field_l[var20].field_d;
                                    var22 = var1_ref.f((byte) -86);
                                    var24 = var1_ref.field_h;
                                    if (var26 != 0) {
                                      break L11;
                                    } else {
                                      L18: {
                                        L19: {
                                          L20: {
                                            if (var19 >= var6) {
                                              break L20;
                                            } else {
                                              var8[0][var12] = var21;
                                              var9[0][var12] = f.field_l[var20].field_f;
                                              var10[0][var12] = var22;
                                              var12++;
                                              var25 = 0;
                                              L21: while (true) {
                                                if (~var7 >= ~var25) {
                                                  break L20;
                                                } else {
                                                  int incrementValue$9 = var15;
                                                  var15++;
                                                  var11[0][incrementValue$9] = var1_ref.d((byte) 19);
                                                  var25++;
                                                  if (var26 != 0) {
                                                    break L19;
                                                  } else {
                                                    if (var26 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var21 == null) {
                                            break L19;
                                          } else {
                                            if (!md.a(var21, -105)) {
                                              break L19;
                                            } else {
                                              var8[1][var13] = og.field_c;
                                              var9[1][var13] = null;
                                              var10[1][var13] = var22;
                                              var13++;
                                              var1_ref.field_h = var24;
                                              var25 = 0;
                                              L22: while (true) {
                                                if (var25 >= var7) {
                                                  break L19;
                                                } else {
                                                  int incrementValue$10 = var16;
                                                  var16++;
                                                  var11[1][incrementValue$10] = var1_ref.d((byte) 19);
                                                  var25++;
                                                  if (var26 != 0) {
                                                    break L18;
                                                  } else {
                                                    if (var26 == 0) {
                                                      continue L22;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L23: {
                                          if (var14 >= var6) {
                                            break L23;
                                          } else {
                                            if (f.field_l[var20].field_b) {
                                              break L23;
                                            } else {
                                              f.field_l[var20].field_b = true;
                                              var8[2][var14] = var21;
                                              var9[2][var14] = f.field_l[var20].field_f;
                                              var10[2][var14] = var22;
                                              var1_ref.field_h = var24;
                                              var14++;
                                              var25 = 0;
                                              L24: while (true) {
                                                if (var25 >= var7) {
                                                  break L23;
                                                } else {
                                                  int incrementValue$11 = var17;
                                                  var17++;
                                                  var11[2][incrementValue$11] = var1_ref.d((byte) 19);
                                                  var25++;
                                                  if (var26 != 0) {
                                                    break L18;
                                                  } else {
                                                    if (var26 == 0) {
                                                      continue L24;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var19++;
                                        break L18;
                                      }
                                      if (var26 == 0) {
                                        continue L17;
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
                        var4.field_k = true;
                        break L11;
                      }
                      var4.b((byte) -117);
                      break L1;
                    }
                  }
                  ck.b((byte) stackIn_37_0);
                  return;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hl.O(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  this.d(-33, -1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.e(71, -1);
              break L1;
            }
            this.h(-1, 16645);
            if (param1 == -87) {
              var3_int = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var3_int >= 16) {
                      break L5;
                    } else {
                      ((hl) this).field_E[var3_int] = ((hl) this).field_G[var3_int];
                      var3_int++;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3_int = 0;
                  break L4;
                }
                L6: while (true) {
                  L7: {
                    L8: {
                      if (16 <= var3_int) {
                        break L8;
                      } else {
                        ((hl) this).field_t[var3_int] = vg.a(((hl) this).field_G[var3_int], -128);
                        var3_int++;
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (var4 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "hl.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        cb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param1;
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < 0) {
                            break L5;
                          } else {
                            if (var3.field_z == param1) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (0 > var3.field_h) {
                          ((hl) this).field_R[var3.field_z][var3.field_q] = null;
                          var3.field_h = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_17_0 = -29 % ((param0 - 60) / 51);
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              var4 = stackIn_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "hl.B(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        try {
            if (param0 > -83) {
                ((hl) this).field_S = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int[] param0, int param1, cb param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_121_0 = 0;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.field_m = b.field_r / 100;
              if (param2.field_h < 0) {
                break L1;
              } else {
                L2: {
                  if (param2.field_C == null) {
                    break L2;
                  } else {
                    if (!param2.field_C.f()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param2.c(0);
                  param2.b((byte) -123);
                  if (param2.field_u <= 0) {
                    break L3;
                  } else {
                    if (((hl) this).field_L[param2.field_z][param2.field_u] != param2) {
                      break L3;
                    } else {
                      ((hl) this).field_L[param2.field_z][param2.field_u] = null;
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            }
            L4: {
              var6_int = param2.field_v;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)((hl) this).field_S[param2.field_z] * 0.0004921259842519685) * 16.0);
                  if (0 <= var6_int) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param2.field_v = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            param2.field_C.g(this.a((byte) -120, param2));
            var7 = param2.field_r;
            param2.field_x = param2.field_x + 1;
            if (param4 >= 54) {
              L6: {
                param2.field_i = param2.field_i + var7.field_d;
                var8 = 0;
                var9 = (double)((param2.field_l * param2.field_v >> -1175855284) + (-60 + param2.field_q << -812459704)) * 0.000005086263020833333;
                if (var7.field_e <= 0) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (0 >= var7.field_b) {
                        break L8;
                      } else {
                        param2.field_j = param2.field_j + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param2.field_j = param2.field_j + 128;
                    break L7;
                  }
                  if (var7.field_e * param2.field_j >= 819200) {
                    var8 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L9: {
                if (null == var7.field_c) {
                  break L9;
                } else {
                  L10: {
                    L11: {
                      if (0 >= var7.field_j) {
                        break L11;
                      } else {
                        param2.field_F = param2.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_j));
                        if (var11 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    param2.field_F = param2.field_F + 128;
                    break L10;
                  }
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (var7.field_c.length - 2 <= param2.field_B) {
                          break L14;
                        } else {
                          stackOut_50_0 = param2.field_F;
                          stackOut_50_1 = var7.field_c[param2.field_B + 2] << -1082231256 & 65280;
                          stackIn_58_0 = stackOut_50_0;
                          stackIn_58_1 = stackOut_50_1;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          if (var11 != 0) {
                            break L13;
                          } else {
                            if (stackIn_51_0 <= stackIn_51_1) {
                              break L14;
                            } else {
                              param2.field_B = param2.field_B + 2;
                              if (var11 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      stackOut_57_0 = ~param2.field_B;
                      stackOut_57_1 = ~(-2 + var7.field_c.length);
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      break L13;
                    }
                    if (stackIn_58_0 != stackIn_58_1) {
                      break L9;
                    } else {
                      if (0 != var7.field_c[param2.field_B + 1]) {
                        break L9;
                      } else {
                        var8 = 1;
                        break L9;
                      }
                    }
                  }
                }
              }
              L15: {
                if (param2.field_h < 0) {
                  break L15;
                } else {
                  if (var7.field_g == null) {
                    break L15;
                  } else {
                    if ((1 & ((hl) this).field_q[param2.field_z]) != 0) {
                      break L15;
                    } else {
                      L16: {
                        if (param2.field_u < 0) {
                          break L16;
                        } else {
                          if (param2 == ((hl) this).field_L[param2.field_z][param2.field_u]) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          if (var7.field_l <= 0) {
                            break L18;
                          } else {
                            param2.field_h = param2.field_h + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                            if (var11 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        param2.field_h = param2.field_h + 128;
                        break L17;
                      }
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (~(var7.field_g.length + -2) >= ~param2.field_y) {
                              break L21;
                            } else {
                              stackOut_85_0 = (var7.field_g[param2.field_y + 2] & 255) << -1357795512;
                              stackOut_85_1 = param2.field_h;
                              stackIn_93_0 = stackOut_85_0;
                              stackIn_93_1 = stackOut_85_1;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              if (var11 != 0) {
                                break L20;
                              } else {
                                if (stackIn_86_0 >= stackIn_86_1) {
                                  break L21;
                                } else {
                                  param2.field_y = param2.field_y + 2;
                                  if (var11 == 0) {
                                    continue L19;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_92_0 = var7.field_g.length - 2;
                          stackOut_92_1 = param2.field_y;
                          stackIn_93_0 = stackOut_92_0;
                          stackIn_93_1 = stackOut_92_1;
                          break L20;
                        }
                        if (stackIn_93_0 == stackIn_93_1) {
                          var8 = 1;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
              if (var8 == 0) {
                param2.field_C.a(param2.field_m, this.c(param2, 1554), this.a(param2, 87));
                stackOut_120_0 = 0;
                stackIn_121_0 = stackOut_120_0;
                break L0;
              } else {
                L22: {
                  L23: {
                    param2.field_C.h(param2.field_m);
                    if (param0 == null) {
                      break L23;
                    } else {
                      param2.field_C.b(param0, param1, param3);
                      if (var11 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  param2.field_C.a(param3);
                  break L22;
                }
                L24: {
                  if (param2.field_C.h()) {
                    ((hl) this).field_y.field_m.a((lk) (Object) param2.field_C);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  param2.c(0);
                  if (param2.field_h < 0) {
                    break L25;
                  } else {
                    param2.b((byte) -118);
                    if (param2.field_u <= 0) {
                      break L25;
                    } else {
                      if (((hl) this).field_L[param2.field_z][param2.field_u] != param2) {
                        break L25;
                      } else {
                        ((hl) this).field_L[param2.field_z][param2.field_u] = null;
                        break L25;
                      }
                    }
                  }
                }
                stackOut_118_0 = 1;
                stackIn_119_0 = stackOut_118_0;
                return stackIn_119_0 != 0;
              }
            } else {
              stackOut_25_0 = 1;
              stackIn_26_0 = stackOut_25_0;
              return stackIn_26_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_122_0 = (RuntimeException) var6;
            stackOut_122_1 = new StringBuilder().append("hl.C(");
            stackIn_125_0 = stackOut_122_0;
            stackIn_125_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param0 == null) {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L26;
            } else {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "{...}";
              stackIn_126_0 = stackOut_123_0;
              stackIn_126_1 = stackOut_123_1;
              stackIn_126_2 = stackOut_123_2;
              break L26;
            }
          }
          L27: {
            stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
            stackOut_126_1 = ((StringBuilder) (Object) stackIn_126_1).append(stackIn_126_2).append(',').append(param1).append(',');
            stackIn_129_0 = stackOut_126_0;
            stackIn_129_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param2 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L27;
            } else {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "{...}";
              stackIn_130_0 = stackOut_127_0;
              stackIn_130_1 = stackOut_127_1;
              stackIn_130_2 = stackOut_127_2;
              break L27;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_130_0, stackIn_130_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_121_0 != 0;
    }

    private final int c(cb param0, int param1) {
        RuntimeException var3 = null;
        rc var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (((hl) this).field_w[param0.field_z] != 0) {
              L1: {
                var3_ref = param0.field_r;
                var4 = 4096 + ((hl) this).field_J[param0.field_z] * ((hl) this).field_l[param0.field_z] >> 1082569645;
                var4 = var4 * var4 + 16384 >> 1369862127;
                var4 = var4 * param0.field_s - -16384 >> 62750607;
                var4 = ((hl) this).field_H * var4 + 128 >> 1015971880;
                var4 = var4 * ((hl) this).field_w[param0.field_z] + 128 >> 330576328;
                if (var3_ref.field_e > 0) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var3_ref.field_e * (0.00001953125 * (double)param0.field_j)) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 1554) {
                  break L2;
                } else {
                  boolean discarded$1 = ((hl) this).a(-54, (ih) null, (byte) -125, (ja) null, (sh) null);
                  break L2;
                }
              }
              L3: {
                if (var3_ref.field_c == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_F;
                    var6 = var3_ref.field_c[1 + param0.field_B];
                    if (-2 + var3_ref.field_c.length > param0.field_B) {
                      var7 = var3_ref.field_c[param0.field_B] << -630288184 & 65280;
                      var8 = (var3_ref.field_c[2 + param0.field_B] & 255) << 1468459880;
                      var6 = var6 + (-var7 + var5) * (-var6 + var3_ref.field_c[3 + param0.field_B]) / (-var7 + var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 32 + var6 * var4 >> -1164080218;
                  break L3;
                }
              }
              L5: {
                if (param0.field_h <= 0) {
                  break L5;
                } else {
                  if (var3_ref.field_g == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_h;
                      var6 = var3_ref.field_g[1 + param0.field_y];
                      if (~param0.field_y > ~(-2 + var3_ref.field_g.length)) {
                        var7 = var3_ref.field_g[param0.field_y] << -1489113752 & 65280;
                        var8 = (255 & var3_ref.field_g[2 + param0.field_y]) << -239171224;
                        var6 = var6 + (-var6 + var3_ref.field_g[param0.field_y - -3]) * (var5 - var7) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 100541830;
                    break L5;
                  }
                }
              }
              stackOut_25_0 = var4;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("hl.AA(");
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
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        cb var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == -785046068) {
              L1: {
                L2: {
                  if (0 != (4 & ((hl) this).field_q[param1])) {
                    var3_ref = (cb) (Object) ((hl) this).field_y.field_n.a(true);
                    L3: while (true) {
                      if (var3_ref == null) {
                        break L2;
                      } else {
                        if (var4 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (~var3_ref.field_z == ~param1) {
                              var3_ref.field_E = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var3_ref = (cb) (Object) ((hl) this).field_y.field_n.f(2);
                          if (var4 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "hl.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        cb var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 16384) {
              L1: {
                L2: {
                  if ((((hl) this).field_q[param0] & 2) != 0) {
                    var3_ref = (cb) (Object) ((hl) this).field_y.field_n.a(true);
                    L3: while (true) {
                      if (var3_ref == null) {
                        break L2;
                      } else {
                        if (var4 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (var3_ref.field_z != param0) {
                              break L4;
                            } else {
                              if (((hl) this).field_R[param0][var3_ref.field_q] != null) {
                                break L4;
                              } else {
                                if (var3_ref.field_h < 0) {
                                  var3_ref.field_h = 0;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var3_ref = (cb) (Object) ((hl) this).field_y.field_n.f(param1 + -16382);
                          if (var4 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "hl.N(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized lk d() {
        RuntimeException var1 = null;
        kj stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        kj stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((hl) this).field_y;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hl.F()");
        }
        return (lk) (Object) stackIn_1_0;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((hl) this).field_n.d()) {
                  break L2;
                } else {
                  var4_int = ((hl) this).field_n.field_e * ((hl) this).field_K / b.field_r;
                  L3: while (true) {
                    L4: {
                      var5 = ((hl) this).field_P - -((long)param2 * (long)var4_int);
                      if (((hl) this).field_U - var5 < 0L) {
                        break L4;
                      } else {
                        ((hl) this).field_P = var5;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var7 = (int)((((hl) this).field_U + -((hl) this).field_P - (-(long)var4_int - -1L)) / (long)var4_int);
                    ((hl) this).field_P = ((hl) this).field_P + (long)var4_int * (long)var7;
                    ((hl) this).field_y.b(param0, param1, var7);
                    param1 = param1 + var7;
                    this.b(-11);
                    param2 = param2 - var7;
                    if (!((hl) this).field_n.d()) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              ((hl) this).field_y.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("hl.I(");
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, ih param2) {
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
        try {
          L0: {
            L1: {
              this.a(param2, param1, true, -5953);
              if (param0 >= 26) {
                break L1;
              } else {
                ((hl) this).a(-128, false, -53);
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
            stackOut_3_1 = new StringBuilder().append("hl.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((hl) this).field_n.d()) {
                var2_int = ((hl) this).field_n.field_e * ((hl) this).field_K / b.field_r;
                L2: while (true) {
                  L3: {
                    var3 = ((hl) this).field_P + (long)param0 * (long)var2_int;
                    if (((hl) this).field_U + -var3 >= 0L) {
                      ((hl) this).field_P = var3;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var5 = (int)((-1L + ((hl) this).field_U - (((hl) this).field_P - (long)var2_int)) / (long)var2_int);
                    ((hl) this).field_P = ((hl) this).field_P + (long)var2_int * (long)var5;
                    ((hl) this).field_y.a(var5);
                    param0 = param0 - var5;
                    this.b(-11);
                    if (((hl) this).field_n.d()) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            ((hl) this).field_y.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "hl.D(" + param0 + ')');
        }
    }

    private final void h(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 >= 0) {
              L1: {
                ((hl) this).field_J[param0] = 12800;
                ((hl) this).field_C[param0] = 8192;
                ((hl) this).field_l[param0] = 16383;
                ((hl) this).field_T[param0] = 8192;
                ((hl) this).field_x[param0] = 0;
                ((hl) this).field_S[param0] = 8192;
                this.a(param0, 16384);
                if (param1 == 16645) {
                  break L1;
                } else {
                  ((hl) this).field_L = null;
                  break L1;
                }
              }
              this.c(param1 + -785062713, param0);
              ((hl) this).field_q[param0] = 0;
              ((hl) this).field_v[param0] = 32767;
              ((hl) this).field_r[param0] = 256;
              ((hl) this).field_u[param0] = 0;
              this.a(false, 8192, param0);
              break L0;
            } else {
              param0 = 0;
              L2: while (true) {
                L3: {
                  if (16 <= param0) {
                    break L3;
                  } else {
                    this.h(param0, param1);
                    param0++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "hl.FA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != -16257) {
            return;
        }
        try {
            ((hl) this).field_T[param2] = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        cb var5_ref = null;
        wj var5_ref2 = null;
        ke var6 = null;
        int var6_int = 0;
        cb var7 = null;
        cb var8 = null;
        int var9 = 0;
        cb stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        cb stackIn_27_2 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        cb stackIn_29_2 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        cb stackIn_31_2 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        cb stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        RuntimeException decompiledCaughtException = null;
        cb stackOut_4_0 = null;
        kd stackOut_14_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        cb stackOut_26_2 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        cb stackOut_31_2 = null;
        int stackOut_31_3 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        cb stackOut_27_2 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        cb stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.a(64, param3, param0, 0);
                if ((((hl) this).field_q[param0] & 2) == 0) {
                  break L2;
                } else {
                  var5_ref = (cb) (Object) ((hl) this).field_y.field_n.c(2);
                  L3: while (true) {
                    if (var5_ref == null) {
                      break L2;
                    } else {
                      stackOut_4_0 = (cb) var5_ref;
                      stackIn_15_0 = (Object) (Object) stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0.field_z != param0) {
                            break L4;
                          } else {
                            if (var5_ref.field_h >= 0) {
                              break L4;
                            } else {
                              ((hl) this).field_R[param0][var5_ref.field_q] = null;
                              ((hl) this).field_R[param0][param3] = var5_ref;
                              var6_int = var5_ref.field_o + (var5_ref.field_l * var5_ref.field_v >> 702668556);
                              var5_ref.field_o = var5_ref.field_o + (param3 - var5_ref.field_q << -742728824);
                              var5_ref.field_q = param3;
                              var5_ref.field_v = 4096;
                              var5_ref.field_l = var6_int + -var5_ref.field_o;
                              return;
                            }
                          }
                        }
                        var5_ref = (cb) (Object) ((hl) this).field_y.field_n.d(0);
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = ((hl) this).field_A.a((long)((hl) this).field_E[param0], (byte) 118);
              stackIn_15_0 = (Object) (Object) stackOut_14_0;
              break L1;
            }
            var5_ref2 = (wj) (Object) stackIn_15_0;
            if (null == var5_ref2) {
              return;
            } else {
              var6 = var5_ref2.field_l[param3];
              if (var6 == null) {
                return;
              } else {
                var7 = new cb();
                var7.field_w = var6;
                var7.field_z = param0;
                var7.field_p = var5_ref2;
                var7.field_r = var5_ref2.field_h[param3];
                var7.field_u = var5_ref2.field_r[param3];
                var7.field_q = param3;
                var7.field_s = 1024 + var5_ref2.field_n[param3] * var5_ref2.field_m * (param1 * param1) >> -1489629717;
                var7.field_k = var5_ref2.field_q[param3] & 255;
                var7.field_o = (param3 << 375772168) + -(32767 & var5_ref2.field_k[param3]);
                var7.field_j = 0;
                if (param2 < -78) {
                  L5: {
                    L6: {
                      var7.field_h = -1;
                      var7.field_y = 0;
                      var7.field_F = 0;
                      var7.field_B = 0;
                      if (0 == ((hl) this).field_u[param0]) {
                        break L6;
                      } else {
                        L7: {
                          var7.field_C = cc.a(var6, this.a((byte) -121, var7), 0, this.a(var7, 74));
                          stackOut_26_0 = this;
                          stackOut_26_1 = 92;
                          stackOut_26_2 = (cb) var7;
                          stackIn_31_0 = stackOut_26_0;
                          stackIn_31_1 = stackOut_26_1;
                          stackIn_31_2 = stackOut_26_2;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          stackIn_27_2 = stackOut_26_2;
                          if (0 <= var5_ref2.field_k[param3]) {
                            stackOut_31_0 = this;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = (cb) (Object) stackIn_31_2;
                            stackOut_31_3 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            stackIn_32_2 = stackOut_31_2;
                            stackIn_32_3 = stackOut_31_3;
                            break L7;
                          } else {
                            stackOut_27_0 = this;
                            stackOut_27_1 = stackIn_27_1;
                            stackOut_27_2 = (cb) (Object) stackIn_27_2;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_29_1 = stackOut_27_1;
                            stackIn_29_2 = stackOut_27_2;
                            stackOut_29_0 = this;
                            stackOut_29_1 = stackIn_29_1;
                            stackOut_29_2 = (cb) (Object) stackIn_29_2;
                            stackOut_29_3 = 1;
                            stackIn_32_0 = stackOut_29_0;
                            stackIn_32_1 = stackOut_29_1;
                            stackIn_32_2 = stackOut_29_2;
                            stackIn_32_3 = stackOut_29_3;
                            break L7;
                          }
                        }
                        ((hl) this).a((byte) stackIn_32_1, stackIn_32_2, stackIn_32_3 != 0);
                        if (var9 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
                    break L5;
                  }
                  L8: {
                    if (0 <= var5_ref2.field_k[param3]) {
                      break L8;
                    } else {
                      var7.field_C.e(-1);
                      break L8;
                    }
                  }
                  L9: {
                    if (var7.field_u < 0) {
                      break L9;
                    } else {
                      L10: {
                        var8 = ((hl) this).field_L[param0][var7.field_u];
                        if (null == var8) {
                          break L10;
                        } else {
                          if (0 <= var8.field_h) {
                            break L10;
                          } else {
                            ((hl) this).field_R[param0][var8.field_q] = null;
                            var8.field_h = 0;
                            break L10;
                          }
                        }
                      }
                      ((hl) this).field_L[param0][var7.field_u] = var7;
                      break L9;
                    }
                  }
                  ((hl) this).field_y.field_n.b(115, (kd) (Object) var7);
                  ((hl) this).field_R[param0][param3] = var7;
                  break L0;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var5, "hl.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                L2: {
                  if (param2 == ((hl) this).field_E[param0]) {
                    break L2;
                  } else {
                    ((hl) this).field_E[param0] = param2;
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 128) {
                        break L2;
                      } else {
                        ((hl) this).field_L[param0][var4_int] = null;
                        var4_int++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "hl.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(int param0) {
        RuntimeException runtimeException = null;
        wj var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 <= -73) {
              var2 = (wj) (Object) ((hl) this).field_A.c((byte) -95);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 == null) {
                      break L3;
                    } else {
                      var2.a(-122);
                      var2 = (wj) (Object) ((hl) this).field_A.a((byte) -91);
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
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) (Object) runtimeException, "hl.LA(" + param0 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        try {
            this.a(param0, (byte) 90, param2);
            if (!param1) {
                int discarded$0 = this.c((cb) null, -91);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, cb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_v * param1.field_l >> -785046068) + param1.field_o;
              var3_int = var3_int + (((hl) this).field_r[param1.field_z] * (-8192 + ((hl) this).field_T[param1.field_z]) >> 1736778060);
              if (param0 < -105) {
                break L1;
              } else {
                lk discarded$1 = ((hl) this).d();
                break L1;
              }
            }
            L2: {
              var4 = param1.field_r;
              if (var4.field_d <= 0) {
                break L2;
              } else {
                L3: {
                  if (0 < var4.field_k) {
                    break L3;
                  } else {
                    if (((hl) this).field_x[param1.field_z] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_k << 175776194;
                  var6 = var4.field_h << 1090801345;
                  if (~var6 >= ~param1.field_x) {
                    break L4;
                  } else {
                    var5 = param1.field_x * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (((hl) this).field_x[param1.field_z] >> 1497020263);
                var7 = Math.sin((double)(511 & param1.field_i) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(param1.field_w.field_m * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)b.field_r + 0.5);
              if (var5 >= 1) {
                stackOut_16_0 = var5;
                stackIn_17_0 = stackOut_16_0;
                break L5;
              } else {
                stackOut_14_0 = 1;
                stackIn_17_0 = stackOut_14_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("hl.Q(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_17_0;
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((hl) this).field_z;
              var3 = ((hl) this).field_m;
              var4 = ((hl) this).field_U;
              if (null == ((hl) this).field_s) {
                break L1;
              } else {
                if (((hl) this).field_Q == var3) {
                  this.a(((hl) this).field_s, ((hl) this).field_D, ((hl) this).field_I, param0 ^ 5962);
                  this.b(param0);
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: while (true) {
              stackOut_9_0 = ~var3;
              stackOut_9_1 = ~((hl) this).field_m;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_10_0 != stackIn_10_1) {
                      break L5;
                    } else {
                      L6: while (true) {
                        stackOut_11_0 = var3;
                        stackOut_11_1 = ((hl) this).field_n.field_a[var2_int];
                        stackIn_38_0 = stackOut_11_0;
                        stackIn_38_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (stackIn_12_0 != stackIn_12_1) {
                              break L7;
                            } else {
                              ((hl) this).field_n.c(var2_int);
                              var6 = ((hl) this).field_n.f(var2_int);
                              stackOut_13_0 = -2;
                              stackOut_13_1 = ~var6;
                              stackIn_10_0 = stackOut_13_0;
                              stackIn_10_1 = stackOut_13_1;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              if (var7 != 0) {
                                continue L3;
                              } else {
                                if (stackIn_14_0 == stackIn_14_1) {
                                  ((hl) this).field_n.f();
                                  ((hl) this).field_n.b(var2_int);
                                  if (!((hl) this).field_n.c()) {
                                    break L7;
                                  } else {
                                    if (((hl) this).field_s == null) {
                                      L8: {
                                        if (!((hl) this).field_D) {
                                          break L8;
                                        } else {
                                          if (0 == var3) {
                                            break L8;
                                          } else {
                                            ((hl) this).field_n.a(var4);
                                            if (var7 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                      }
                                      this.a(true, (byte) -87);
                                      ((hl) this).field_n.g();
                                      return;
                                    } else {
                                      ((hl) this).a(111, ((hl) this).field_D, ((hl) this).field_s);
                                      this.b(param0);
                                      return;
                                    }
                                  }
                                } else {
                                  L9: {
                                    if (0 != (128 & var6)) {
                                      this.g(param0 + -112, var6);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  ((hl) this).field_n.a(var2_int);
                                  ((hl) this).field_n.b(var2_int);
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var2_int = ((hl) this).field_n.a();
                          var3 = ((hl) this).field_n.field_a[var2_int];
                          var4 = ((hl) this).field_n.d(var3);
                          if (var7 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  ((hl) this).field_z = var2_int;
                  ((hl) this).field_U = var4;
                  ((hl) this).field_m = var3;
                  stackOut_37_0 = param0;
                  stackOut_37_1 = -11;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L4;
                }
                L10: {
                  if (stackIn_38_0 == stackIn_38_1) {
                    break L10;
                  } else {
                    ((hl) this).field_m = -105;
                    break L10;
                  }
                }
                L11: {
                  if (((hl) this).field_s == null) {
                    break L11;
                  } else {
                    if (var3 <= ((hl) this).field_Q) {
                      break L11;
                    } else {
                      ((hl) this).field_z = -1;
                      ((hl) this).field_m = ((hl) this).field_Q;
                      ((hl) this).field_U = ((hl) this).field_n.d(((hl) this).field_m);
                      break L11;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "hl.RA(" + param0 + ')');
        }
    }

    public hl() {
        ((hl) this).field_E = new int[16];
        ((hl) this).field_O = new int[16];
        ((hl) this).field_H = 256;
        ((hl) this).field_u = new int[16];
        ((hl) this).field_C = new int[16];
        ((hl) this).field_l = new int[16];
        ((hl) this).field_M = new int[16];
        ((hl) this).field_T = new int[16];
        ((hl) this).field_L = new cb[16][128];
        ((hl) this).field_S = new int[16];
        ((hl) this).field_w = new int[16];
        ((hl) this).field_G = new int[16];
        ((hl) this).field_v = new int[16];
        ((hl) this).field_q = new int[16];
        ((hl) this).field_J = new int[16];
        ((hl) this).field_r = new int[16];
        ((hl) this).field_x = new int[16];
        ((hl) this).field_t = new int[16];
        ((hl) this).field_R = new cb[16][128];
        ((hl) this).field_K = 1000000;
        ((hl) this).field_n = new ek();
        ((hl) this).field_y = new kj((hl) this);
        try {
            ((hl) this).field_A = new na(128);
            ((hl) this).a(-1, 256, false);
            this.a(true, (byte) -87);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.<init>()");
        }
    }

    hl(hl param0) {
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
        ((hl) this).field_E = new int[16];
        ((hl) this).field_O = new int[16];
        ((hl) this).field_H = 256;
        ((hl) this).field_u = new int[16];
        ((hl) this).field_C = new int[16];
        ((hl) this).field_l = new int[16];
        ((hl) this).field_M = new int[16];
        ((hl) this).field_T = new int[16];
        ((hl) this).field_L = new cb[16][128];
        ((hl) this).field_S = new int[16];
        ((hl) this).field_w = new int[16];
        ((hl) this).field_G = new int[16];
        ((hl) this).field_v = new int[16];
        ((hl) this).field_q = new int[16];
        ((hl) this).field_J = new int[16];
        ((hl) this).field_r = new int[16];
        ((hl) this).field_x = new int[16];
        ((hl) this).field_t = new int[16];
        ((hl) this).field_R = new cb[16][128];
        ((hl) this).field_K = 1000000;
        ((hl) this).field_n = new ek();
        ((hl) this).field_y = new kj((hl) this);
        try {
          L0: {
            ((hl) this).field_A = param0.field_A;
            ((hl) this).a(-1, 256, false);
            this.a(true, (byte) -87);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hl.<init>(");
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
          throw ld.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Try again";
    }
}
