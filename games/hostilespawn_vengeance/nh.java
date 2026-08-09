/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int var2 = this.field_A.field_u ? 1 : 0;
        this.field_A.field_u = this.field_u;
        String var3 = this.field_A.e((int) (char)param0);
        this.field_A.field_u = var2 != 0 ? true : false;
        return var3;
    }

    final static double a(int param0, p param1, p param2) {
        RuntimeException var3 = null;
        double stackIn_3_0 = 0.0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -12149) {
                break L1;
              } else {
                field_O = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = 128.0 * Math.atan2(-param2.field_l.field_f + ((double)(-param2.field_j.field_e) + ((double)param1.field_j.field_e + param1.field_l.field_f)), (double)(-param2.field_j.field_g) + (param1.field_l.field_a + (double)param1.field_j.field_g) - param2.field_l.field_a) / 3.141592653589793;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("nh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_7_0 = 0;
        vm stackIn_9_0;
        String stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_9_5;
        int stackIn_9_6;
        int stackIn_9_7;
        vm stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        int stackIn_10_7 = 0;
        int stackIn_10_8 = 0;
        var5 = param1 + this.field_v;
        var6 = this.field_m + param0;
        super.a(param0, param1, (byte) 70, param3);
        if (param3 != 0) {
          return;
        } else {
          if (param2 <= 42) {
            return;
          } else {
            L0: {
              if (this.field_K) {
                stackIn_7_0 = -(this.field_I * 2) + (this.field_s + -this.field_J);
                break L0;
              } else {
                stackIn_7_0 = 0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_7_0;
              stackIn_9_0 = this.field_N;

              stackIn_9_1 = this.field_B;

              stackIn_9_2 = this.field_I + var5 + var7;

              stackIn_9_3 = this.field_I + var6;

              stackIn_9_4 = -this.field_I + this.field_J;

              stackIn_9_5 = -(this.field_I * 2) + this.field_x;

              stackIn_9_6 = this.field_F;

              stackIn_9_7 = -1;

              if (this.field_K) {
                stackIn_10_0 = (vm) ((Object) stackIn_9_0);
                stackIn_10_1 = (String) ((Object) stackIn_9_1);
                stackIn_10_2 = stackIn_9_2;
                stackIn_10_3 = stackIn_9_3;
                stackIn_10_4 = stackIn_9_4;
                stackIn_10_5 = stackIn_9_5;
                stackIn_10_6 = stackIn_9_6;
                stackIn_10_7 = stackIn_9_7;
                stackIn_10_8 = 0;
                break L1;
              } else {
                stackIn_10_0 = (vm) ((Object) stackIn_9_0);
                stackIn_10_1 = (String) ((Object) stackIn_9_1);
                stackIn_10_2 = stackIn_9_2;
                stackIn_10_3 = stackIn_9_3;
                stackIn_10_4 = stackIn_9_4;
                stackIn_10_5 = stackIn_9_5;
                stackIn_10_6 = stackIn_9_6;
                stackIn_10_7 = stackIn_9_7;
                stackIn_10_8 = 2;
                break L1;
              }
            }
            ((vm) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5, stackIn_10_6, stackIn_10_7, stackIn_10_8, 1, this.field_N.field_y);
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
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oj var4 = null;
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
                        if (-4 != (var2_int ^ -1)) {
                          if (var2_int == 4) {
                            break L1;
                          } else {
                            if (-6 != (var2_int ^ -1)) {
                              if (6 == var2_int) {
                                break L1;
                              } else {
                                if (-9 == (var2_int ^ -1)) {
                                  break L1;
                                } else {
                                  if (10 == var2_int) {
                                    break L1;
                                  } else {
                                    if (var2_int == 11) {
                                      break L1;
                                    } else {
                                      if (-13 == (var2_int ^ -1)) {
                                        break L1;
                                      } else {
                                        if (-21 == (var2_int ^ -1)) {
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
                    if ((var2_int ^ -1) == -2) {
                      break L2;
                    } else {
                      if ((var2_int ^ -1) != -25) {
                        if (-226 != (var2_int ^ -1)) {
                          if (var2_int != 18) {
                            if (19 != var2_int) {
                              if ((var2_int ^ -1) == -28) {
                                break L1;
                              } else {
                                if (8 == var2_int) {
                                  jh.a(3 * uh.field_i / 2, (byte) 55, 40, jc.field_c, 1);
                                  break L1;
                                } else {
                                  if (3 == var2_int) {
                                    tk.a(7, jc.field_c, 55, true);
                                    break L1;
                                  } else {
                                    if (var2_int != 4) {
                                      L3: {
                                        if (-6 != (var2_int ^ -1)) {
                                          if ((var2_int ^ -1) != -7) {
                                            L4: {
                                              if ((var2_int ^ -1) == -11) {
                                                break L4;
                                              } else {
                                                if ((var2_int ^ -1) != -12) {
                                                  if ((var2_int ^ -1) == -13) {
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
                                            if ((uj.field_l ^ -1) == -2) {
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
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = (oj) null;
                nh.a((oj) null, -68);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_74_0 = (RuntimeException) (var2);

            stackIn_74_1 = new StringBuilder().append("nh.D(");

            if (param0 == null) {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L5;
            } else {
              stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    nh(int param0, int param1, int param2, int param3, ag param4, boolean param5, int param6, int param7, vm param8, int param9, String param10) {
        super(param0, param1, param2, param3, (nn) null, (mh) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_J = param6;
              this.field_F = param9;
              this.field_B = param10;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((nh) (this)).field_K = stackIn_4_1 != 0;
              this.field_A = param4;
              this.field_N = param8;
              this.field_I = param7;
              var12_int = this.field_J + -this.field_I;
              var13 = this.field_N.b(param10, var12_int, this.field_N.field_y) - -(2 * this.field_I);
              if (param3 < var13) {
                this.a(param2, param1, 0, param0, var13);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_K) {
                stackIn_10_0 = this.field_J + 2 * this.field_I;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_A.a(-(this.field_I * 3) + (-this.field_J + param2), this.field_I - -(var13 - param3 >> 1568777665), 0, var14, param3 + -(2 * this.field_I));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("nh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    public static void k(int param0) {
        field_P = null;
        field_C = null;
        field_E = null;
        if (param0 != 0) {
            return;
        }
        field_L = null;
        field_O = null;
    }

    static {
        field_M = 0;
        field_H = 0;
        field_E = new oc(-1, -1);
        field_P = new we(field_E);
    }
}
