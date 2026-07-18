/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj extends tc {
    static int field_k;
    static String field_p;
    static String field_u;
    static at field_r;
    static int[] field_n;
    boolean field_o;
    static int field_v;
    jd field_w;
    static String field_x;
    static int[] field_t;
    int field_m;
    static int[] field_q;
    int field_s;
    static String field_l;

    abstract void a(ha param0, int param1);

    final void a(int param0) {
        ((oj) this).field_o = false;
        if (param0 >= -30) {
            return;
        }
    }

    private final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == 1023) {
            break L0;
          } else {
            var4 = null;
            pu discarded$1 = oj.a(-38, (bv) null);
            break L0;
          }
        }
        var2 = ((oj) this).field_m;
        if (0 != var2) {
          L1: {
            L2: {
              if (var2 != 1) {
                if (var2 == 2) {
                  break L2;
                } else {
                  if (var2 != 23) {
                    L3: {
                      if (var2 == 3) {
                        break L3;
                      } else {
                        if (4 != var2) {
                          if (5 == var2) {
                            break L3;
                          } else {
                            if (6 == var2) {
                              return true;
                            } else {
                              if (var2 == 21) {
                                return true;
                              } else {
                                if (var2 == 7) {
                                  return true;
                                } else {
                                  if (var2 == 8) {
                                    return true;
                                  } else {
                                    if (9 != var2) {
                                      if (10 != var2) {
                                        L4: {
                                          if (var2 != 11) {
                                            if (var2 == 12) {
                                              break L4;
                                            } else {
                                              if (13 == var2) {
                                                break L4;
                                              } else {
                                                if (var2 == 14) {
                                                  return true;
                                                } else {
                                                  if (var2 == 15) {
                                                    return true;
                                                  } else {
                                                    if (var2 != 16) {
                                                      if (var2 != 17) {
                                                        if (var2 != 18) {
                                                          L5: {
                                                            if (var2 == 19) {
                                                              break L5;
                                                            } else {
                                                              if (var2 == 20) {
                                                                break L5;
                                                              } else {
                                                                if (22 == var2) {
                                                                  return true;
                                                                } else {
                                                                  if (var2 != -1) {
                                                                    L6: {
                                                                      if (25 == var2) {
                                                                        break L6;
                                                                      } else {
                                                                        if (var2 == 24) {
                                                                          break L6;
                                                                        } else {
                                                                          if (27 == var2) {
                                                                            break L6;
                                                                          } else {
                                                                            stackOut_41_0 = 0;
                                                                            stackIn_43_0 = stackOut_41_0;
                                                                            break L1;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    return true;
                                                                  } else {
                                                                    return false;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          return false;
                                                        } else {
                                                          return true;
                                                        }
                                                      } else {
                                                        return true;
                                                      }
                                                    } else {
                                                      return true;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L4;
                                          }
                                        }
                                        return true;
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_42_0 = 1;
            stackIn_43_0 = stackOut_42_0;
            break L1;
          }
          return stackIn_43_0 != 0;
        } else {
          return true;
        }
    }

    abstract String a(byte param0, boolean param1);

    final boolean a(byte param0, ic param1, at param2, boolean param3) {
        vb var5 = null;
        RuntimeException var5_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == -39) {
              L1: {
                var5 = cp.a(param1, 10120, param1.field_xb, this.e(1023) & param3, (oj) this, param1.field_gb);
                if (var5 != null) {
                  param2.a((byte) -119, (tc) (Object) var5);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (var5 != null) {
                stackOut_9_0 = var5.field_w;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("oj.H(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_10_0;
    }

    final void c(byte param0) {
        ((oj) this).field_s = ((oj) this).field_s - 1;
        if (!(((oj) this).field_s <= 0)) {
            return;
        }
        ((oj) this).field_o = true;
        if (!(null == ((oj) this).field_w)) {
            if (((oj) this).field_m != 19) {
                ((oj) this).field_w.field_u = false;
                ((oj) this).field_w.field_z = 0;
            }
        }
        if (param0 > -46) {
            ((oj) this).c((byte) -28);
        }
    }

    final void a(jd param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 12) {
                break L1;
              } else {
                var4 = null;
                ((oj) this).a((jd) null, -102);
                break L1;
              }
            }
            param0.field_u = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oj.J(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_r = null;
        field_t = null;
        field_u = null;
        field_q = null;
        field_x = null;
        if (param0 != -103) {
            return;
        }
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean a(int param0, int param1, ic param2, at param3, int param4) {
        vb var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var6 = ub.a((oj) this, param2.field_xb, this.e(param1 + 1008), param0, param2, 17, param4, param2.field_gb);
              if (var6 == null) {
                break L1;
              } else {
                param3.a((byte) -119, (tc) (Object) var6);
                break L1;
              }
            }
            if (param1 == 15) {
              if (var6 != null) {
                stackOut_8_0 = var6.field_w;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6_ref;
            stackOut_10_1 = new StringBuilder().append("oj.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_9_0;
    }

    abstract boolean a(at param0, byte param1, ic param2);

    final static pu a(int param0, bv param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pu var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pu stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        pu stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1.g(-113, 8);
            if (var2_int <= 0) {
              L1: {
                int discarded$23 = -2;
                var3 = vq.a(param1) ? 1 : 0;
                var5 = 1 / ((param0 - 61) / 50);
                int discarded$24 = -2;
                var4 = vq.a(param1) ? 1 : 0;
                var6 = new pu();
                var6.field_O = (short)param1.g(61, 16);
                int discarded$25 = 10064;
                var6.field_z = to.a(var6.field_z, 16, param1);
                int discarded$26 = 10064;
                var6.field_y = to.a(var6.field_y, 16, param1);
                int discarded$27 = 10064;
                var6.field_o = to.a(var6.field_o, 16, param1);
                var6.field_q = (short)param1.g(107, 16);
                int discarded$28 = 10064;
                var6.field_c = to.a(var6.field_c, 16, param1);
                int discarded$29 = 10064;
                var6.field_j = to.a(var6.field_j, 16, param1);
                int discarded$30 = 10064;
                var6.field_e = to.a(var6.field_e, 16, param1);
                if (var3 != 0) {
                  var6.field_t = (short)param1.g(-100, 16);
                  int discarded$31 = 10064;
                  var6.field_l = to.a(var6.field_l, 16, param1);
                  int discarded$32 = 10064;
                  var6.field_f = to.a(var6.field_f, 16, param1);
                  int discarded$33 = 10064;
                  var6.field_x = to.a(var6.field_x, 16, param1);
                  int discarded$34 = 10064;
                  var6.field_w = to.a(var6.field_w, 16, param1);
                  int discarded$35 = 10064;
                  var6.field_Q = to.a(var6.field_Q, 16, param1);
                  int discarded$36 = 10064;
                  var6.field_d = to.a(var6.field_d, 16, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$37 = param1.g(-102, 16);
                  int discarded$38 = 10064;
                  var6.field_r = to.a(var6.field_r, 16, param1);
                  int discarded$39 = 10064;
                  var6.field_s = to.a(var6.field_s, 16, param1);
                  int discarded$40 = 10064;
                  var6.field_A = to.a(var6.field_A, 16, param1);
                  int discarded$41 = 10064;
                  var6.field_i = to.a(var6.field_i, 16, param1);
                  int discarded$42 = 10064;
                  var6.field_b = to.a(var6.field_b, 16, param1);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                int discarded$43 = -2;
                if (vq.a(param1)) {
                  int discarded$44 = 10064;
                  var6.field_u = to.a(var6.field_u, 16, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                int discarded$45 = -2;
                if (vq.a(param1)) {
                  var6.field_K = kd.a(16, param1, var6.field_K, (byte) -122);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var6.field_K.length) {
                      if (var7 == 0) {
                        var6.field_K = null;
                        break L4;
                      } else {
                        var6.field_E = (byte)(1 + var7);
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var6.field_K[var8] & 255) > var7) {
                          var7 = var6.field_K[var8] & 255;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_23_0 = (pu) var6;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("oj.N(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final void f(int param0) {
        if (!(((oj) this).field_w == null)) {
            ((oj) this).field_w.field_u = false;
            ((oj) this).field_w.field_z = 0;
        }
        if (param0 != 6) {
            oj.a((byte) 88);
        }
        ((oj) this).field_s = 0;
        ((oj) this).field_o = true;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_11_0 = null;
        int[] stackOut_10_0 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3 < 0) {
              return;
            } else {
              param4 += 23;
              var5_int = -72;
              L1: while (true) {
                if (var5_int >= 0) {
                  break L0;
                } else {
                  L2: {
                    var6 = var5_int;
                    var7 = var5_int;
                    if (var6 < 0) {
                      var6 = (var6 << 1) + 256;
                      break L2;
                    } else {
                      var6 = -(var6 << 4) + 256;
                      break L2;
                    }
                  }
                  L3: {
                    var7 = var7 >> 5;
                    var8 = (122 ^ var6) >> 3;
                    var9 = 15 & var6 >> 4;
                    if (param3 == -1) {
                      stackOut_11_0 = dr.field_z;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = dr.field_v[param3];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  var15 = stackIn_12_0;
                  var14 = var15;
                  var13 = var14;
                  var12 = var13;
                  var10 = var12;
                  qn.a((-6 + param4 << 4) - -(var7 * ae.b(param2 + var5_int << 4, 100) >> 12), -4 + (param0 + var5_int) << 4, var8 << 4, var9, var15);
                  var5_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var5, "oj.L(" + param0 + ',' + true + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected oj() {
        ((oj) this).field_s = 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Restart Level";
        field_p = "Allow spectators?";
        field_v = 0;
        field_t = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 50, 9};
        field_x = "Quick Chat Help";
        field_k = 4;
        field_n = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_q = new int[56];
        field_r = new at();
        field_l = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
