/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nh extends fc {
    private int field_J;
    static int[] field_O;
    private boolean field_K;
    static int field_M;
    static oc field_E;
    private String field_B;
    static uj field_L;
    static int field_H;
    private vm field_N;
    private int field_I;
    private int field_F;
    static we field_P;
    static bd field_C;

    final String e(int param0) {
        int var2 = ((nh) this).field_A.field_u ? 1 : 0;
        ((nh) this).field_A.field_u = ((nh) this).field_u;
        String var3 = ((nh) this).field_A.e((int) (char)param0);
        ((nh) this).field_A.field_u = var2 != 0 ? true : false;
        return var3;
    }

    final static double a(int param0, p param1, p param2) {
        RuntimeException var3 = null;
        double stackIn_1_0 = 0.0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        double stackOut_0_0 = 0.0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_0_0 = 128.0 * Math.atan2(-param2.field_l.field_f + ((double)(-param2.field_j.field_e) + ((double)param1.field_j.field_e + param1.field_l.field_f)), (double)(-param2.field_j.field_g) + (param1.field_l.field_a + (double)param1.field_j.field_g) - param2.field_l.field_a) / 3.141592653589793;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("nh.B(").append(-12149).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        vm stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        vm stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        vm stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        vm stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        vm stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        int stackOut_9_7 = 0;
        int stackOut_9_8 = 0;
        vm stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        int stackOut_8_7 = 0;
        int stackOut_8_8 = 0;
        var5 = param1 + ((nh) this).field_v;
        var6 = ((nh) this).field_m + param0;
        super.a(param0, param1, (byte) 70, param3);
        if (param3 != 0) {
          return;
        } else {
          if (param2 <= 42) {
            return;
          } else {
            L0: {
              if (((nh) this).field_K) {
                stackOut_6_0 = -(((nh) this).field_I * 2) + (((nh) this).field_s + -((nh) this).field_J);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_7_0;
              stackOut_7_0 = ((nh) this).field_N;
              stackOut_7_1 = ((nh) this).field_B;
              stackOut_7_2 = ((nh) this).field_I + var5 + var7;
              stackOut_7_3 = ((nh) this).field_I + var6;
              stackOut_7_4 = -((nh) this).field_I + ((nh) this).field_J;
              stackOut_7_5 = -(((nh) this).field_I * 2) + ((nh) this).field_x;
              stackOut_7_6 = ((nh) this).field_F;
              stackOut_7_7 = -1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_9_5 = stackOut_7_5;
              stackIn_9_6 = stackOut_7_6;
              stackIn_9_7 = stackOut_7_7;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              stackIn_8_5 = stackOut_7_5;
              stackIn_8_6 = stackOut_7_6;
              stackIn_8_7 = stackOut_7_7;
              if (((nh) this).field_K) {
                stackOut_9_0 = (vm) (Object) stackIn_9_0;
                stackOut_9_1 = (String) (Object) stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = stackIn_9_4;
                stackOut_9_5 = stackIn_9_5;
                stackOut_9_6 = stackIn_9_6;
                stackOut_9_7 = stackIn_9_7;
                stackOut_9_8 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                stackIn_10_6 = stackOut_9_6;
                stackIn_10_7 = stackOut_9_7;
                stackIn_10_8 = stackOut_9_8;
                break L1;
              } else {
                stackOut_8_0 = (vm) (Object) stackIn_8_0;
                stackOut_8_1 = (String) (Object) stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = stackIn_8_5;
                stackOut_8_6 = stackIn_8_6;
                stackOut_8_7 = stackIn_8_7;
                stackOut_8_8 = 2;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                stackIn_10_5 = stackOut_8_5;
                stackIn_10_6 = stackOut_8_6;
                stackIn_10_7 = stackOut_8_7;
                stackIn_10_8 = stackOut_8_8;
                break L1;
              }
            }
            int discarded$1 = ((vm) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5, stackIn_10_6, stackIn_10_7, stackIn_10_8, 1, ((nh) this).field_N.field_y);
            return;
          }
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 <= -63) {
          if (wa.field_q == null) {
            cn.a(param0, (byte) 91);
            return;
          } else {
            tb.f((byte) -122);
            return;
          }
        } else {
          field_M = 78;
          if (wa.field_q == null) {
            cn.a(param0, (byte) 91);
            return;
          } else {
            tb.f((byte) -122);
            return;
          }
        }
    }

    final static void a(oj param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        Object var4 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (0 < param0.field_I) {
                  var2_int = param0.field_i;
                  if (var2_int != 1) {
                    if (18 != var2_int) {
                      if (19 != var2_int) {
                        if (var2_int != 3) {
                          if (var2_int == 4) {
                            break L1;
                          } else {
                            if (var2_int != 5) {
                              if (6 == var2_int) {
                                break L1;
                              } else {
                                if (var2_int == 8) {
                                  break L1;
                                } else {
                                  if (10 == var2_int) {
                                    break L1;
                                  } else {
                                    if (var2_int == 11) {
                                      break L1;
                                    } else {
                                      if (var2_int == 12) {
                                        break L1;
                                      } else {
                                        if (var2_int == 20) {
                                          break L1;
                                        } else {
                                          if (var2_int != 21) {
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  L2: {
                    var2_int = param0.field_i;
                    if (var2_int == 1) {
                      break L2;
                    } else {
                      if (var2_int != 24) {
                        if (var2_int != 225) {
                          if (var2_int != 18) {
                            if (19 != var2_int) {
                              if (var2_int == 27) {
                                break L1;
                              } else {
                                if (8 == var2_int) {
                                  jh.a(3 * uh.field_i / 2, (byte) 55, 40, jc.field_c, 1);
                                  break L1;
                                } else {
                                  if (3 == var2_int) {
                                    int discarded$1 = 1;
                                    tk.a(7, jc.field_c, 55);
                                    break L1;
                                  } else {
                                    if (var2_int != 4) {
                                      L3: {
                                        if (var2_int != 5) {
                                          if (var2_int != 6) {
                                            L4: {
                                              if (var2_int == 10) {
                                                break L4;
                                              } else {
                                                if (var2_int != 11) {
                                                  if (var2_int == 12) {
                                                    break L4;
                                                  } else {
                                                    if (var2_int != 20) {
                                                      if (21 != var2_int) {
                                                        break L1;
                                                      } else {
                                                        if (uj.field_l == 1) {
                                                          if (ej.d((byte) 107)) {
                                                            eh.field_c.a(lm.field_A[14], 100, uh.field_i / 3);
                                                            break L1;
                                                          } else {
                                                            break L1;
                                                          }
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      break L4;
                                                    }
                                                  }
                                                } else {
                                                  break L4;
                                                }
                                              }
                                            }
                                            if (uj.field_l == 1) {
                                              if (ej.d((byte) 102)) {
                                                eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            break L3;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                      if (1 != uj.field_l) {
                                        break L1;
                                      } else {
                                        if (!ej.d((byte) 61)) {
                                          break L1;
                                        } else {
                                          eh.field_c.a(lm.field_A[17], 100 - -(int)(20.0 * Math.random() - 10.0), uh.field_i / 3);
                                          break L1;
                                        }
                                      }
                                    } else {
                                      if (1 != uj.field_l) {
                                        break L1;
                                      } else {
                                        eh.field_c.a(em.field_a[22], (int)(20.0 * Math.random() - 10.0) + 100, uh.field_i);
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              jh.a(uh.field_i * 3 / 2, (byte) 118, 26, jc.field_c, 1);
                              break L1;
                            }
                          } else {
                            jh.a(uh.field_i * 3 / 2, (byte) 126, 21, jc.field_c, 3);
                            break L1;
                          }
                        } else {
                          jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  jh.a(3 * uh.field_i / 2, (byte) 88, 9, jc.field_c, 3);
                  break L1;
                }
              }
              if (param1 == -29966) {
                break L0;
              } else {
                var4 = null;
                nh.a((oj) null, -68);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var2;
            stackOut_72_1 = new StringBuilder().append("nh.D(");
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L5;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param1 + ')');
        }
    }

    nh(int param0, int param1, int param2, int param3, ag param4, boolean param5, int param6, int param7, vm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nn) null, (mh) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((nh) this).field_J = param6;
              ((nh) this).field_F = param9;
              ((nh) this).field_B = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((nh) this).field_K = stackIn_4_1 != 0;
              ((nh) this).field_A = param4;
              ((nh) this).field_N = param8;
              ((nh) this).field_I = param7;
              var12_int = ((nh) this).field_J + -((nh) this).field_I;
              var13 = ((nh) this).field_N.b(param10, var12_int, ((nh) this).field_N.field_y) - -(2 * ((nh) this).field_I);
              if (param3 < var13) {
                ((nh) this).a(param2, param1, 0, param0, var13);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!((nh) this).field_K) {
                stackOut_9_0 = ((nh) this).field_J + 2 * ((nh) this).field_I;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((nh) this).field_A.a(-(((nh) this).field_I * 3) + (-((nh) this).field_J + param2), ((nh) this).field_I - -(var13 - param3 >> 1), 0, var14, param3 + -(2 * ((nh) this).field_I));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("nh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    public static void k() {
        field_P = null;
        field_C = null;
        field_E = null;
        field_L = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = 0;
        field_H = 0;
        field_E = new oc(-1, -1);
        field_P = new we(field_E);
    }
}
