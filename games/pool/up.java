/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class up extends lh {
    static int[] field_p;
    private int field_u;
    static int[] field_M;
    private int field_k;
    static String field_w;
    static int field_j;
    static int field_l;
    private ad field_z;
    static String field_L;
    private bm field_G;
    static String field_K;
    private byte[] field_E;
    private int field_y;
    static String field_I;
    static String field_v;
    private np field_t;
    static int field_m;
    private no field_r;
    private np field_n;
    private rn field_D;
    static String field_J;
    private gr field_H;
    private byte[] field_o;
    private int field_x;
    private boolean field_B;
    private boolean field_C;
    private ko field_q;
    private ko field_s;
    private long field_F;
    private boolean field_A;

    final void c(int param0) {
        RuntimeException var2 = null;
        ma var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            if (((up) this).field_s != null) {
              if (((up) this).b((byte) -21) == null) {
                return;
              } else {
                var2_ref = ((up) this).field_q.c((byte) 111);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (null == var2_ref) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_c;
                        stackOut_8_0 = 0;
                        stackOut_8_1 = var3;
                        stackIn_37_0 = stackOut_8_0;
                        stackIn_37_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (stackIn_9_0 > stackIn_9_1) {
                                  break L6;
                                } else {
                                  if (~var3 <= ~((up) this).field_z.field_d) {
                                    break L6;
                                  } else {
                                    if (((up) this).field_z.field_s[var3] != 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.a((byte) -117);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((up) this).field_E[var3] == 0) {
                                gr discarded$3 = this.a(var3, 1, (byte) 25);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (((up) this).field_E[var3] == -1) {
                                gr discarded$4 = this.a(var3, 2, (byte) 25);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (((up) this).field_E[var3] == 1) {
                              var2_ref.a((byte) -117);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var2_ref = ((up) this).field_q.f((byte) -5);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_36_0 = param0;
                    stackOut_36_1 = 82;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    break L2;
                  }
                  L9: {
                    if (stackIn_37_0 > stackIn_37_1) {
                      break L9;
                    } else {
                      String discarded$5 = up.a(false, (CharSequence) null, (byte) 71);
                      break L9;
                    }
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
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "up.F(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ((up) this).field_t) {
              L1: {
                if (param0 >= 78) {
                  break L1;
                } else {
                  field_J = null;
                  break L1;
                }
              }
              L2: {
                ((up) this).field_B = true;
                if (null == ((up) this).field_s) {
                  ((up) this).field_s = new ko();
                  break L2;
                } else {
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
          throw wm.a((Throwable) (Object) var2, "up.B(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        gr var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -18600) {
                break L1;
              } else {
                byte[] discarded$2 = ((up) this).a(100, (byte) -43);
                break L1;
              }
            }
            var3 = (gr) (Object) ((up) this).field_G.a(false, (long)param1);
            if (null == var3) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.e(54);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "up.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        String stackIn_19_0 = null;
        String stackIn_27_0 = null;
        boolean stackIn_34_0 = false;
        String stackIn_47_0 = null;
        int stackIn_50_0 = 0;
        String stackIn_54_0 = null;
        Object stackIn_56_0 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_33_0 = false;
        String stackOut_46_0 = null;
        int stackOut_49_0 = 0;
        String stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        var8 = Pool.field_O;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = hq.a(91, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (qd.a(0, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (qd.a(0, var4.charAt(var4.length() + -1))) {
                                break L3;
                              } else {
                                L4: {
                                  var5 = 0;
                                  if (param2 >= 96) {
                                    break L4;
                                  } else {
                                    int discarded$1 = up.a(-125);
                                    break L4;
                                  }
                                }
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    L7: {
                                      if (param1.length() <= var6) {
                                        break L7;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_33_0 = qd.a(0, (char) var7);
                                        stackIn_50_0 = stackOut_33_0 ? 1 : 0;
                                        stackIn_34_0 = stackOut_33_0;
                                        if (var8 != 0) {
                                          break L6;
                                        } else {
                                          L8: {
                                            L9: {
                                              if (stackIn_34_0) {
                                                break L9;
                                              } else {
                                                var5 = 0;
                                                if (var8 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var5++;
                                            break L8;
                                          }
                                          L10: {
                                            if (var5 < 2) {
                                              break L10;
                                            } else {
                                              if (!param0) {
                                                stackOut_46_0 = oh.field_g;
                                                stackIn_47_0 = stackOut_46_0;
                                                return stackIn_47_0;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_49_0 = -1;
                                    stackIn_50_0 = stackOut_49_0;
                                    break L6;
                                  }
                                  if (stackIn_50_0 > ~var5) {
                                    stackOut_53_0 = lg.field_r;
                                    stackIn_54_0 = stackOut_53_0;
                                    return stackIn_54_0;
                                  } else {
                                    stackOut_55_0 = null;
                                    stackIn_56_0 = stackOut_55_0;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_26_0 = lg.field_r;
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        }
                      }
                    }
                    stackOut_18_0 = gp.field_a;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  }
                }
              }
              stackOut_10_0 = gp.field_a;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              stackOut_2_0 = gp.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var3;
            stackOut_57_1 = new StringBuilder().append("up.K(").append(param0).append(',');
            stackIn_60_0 = stackOut_57_0;
            stackIn_60_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L11;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_56_0;
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -21282) {
              stackOut_3_0 = (int)(1000000000L / oh.field_e);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 111;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "up.I(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static dd[] a(dd[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dd var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        dd[] stackIn_7_0 = null;
        dd[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd[] stackOut_6_0 = null;
        dd[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (param1 == 12519) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param0.length <= var2_int) {
                      break L3;
                    } else {
                      var3 = param0[var2_int];
                      param0[var2_int].field_B = 0;
                      var3.field_G = 0;
                      param0[var2_int].field_w = param0[var2_int].field_z;
                      stackOut_6_0 = (dd[]) param0;
                      stackIn_11_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        stackIn_7_0[var2_int].field_y = param0[var2_int].field_A;
                        var2_int++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = (dd[]) param0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (dd[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("up.D(");
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final ad b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ad stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_42_0 = null;
        ad stackIn_54_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_28_0 = null;
        ad stackOut_53_0 = null;
        Object stackOut_12_0 = null;
        ad stackOut_2_0 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (null == ((up) this).field_z) {
              L1: {
                if (null != ((up) this).field_H) {
                  break L1;
                } else {
                  if (!((up) this).field_r.b((byte) -125)) {
                    ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (ad) (Object) stackIn_9_0;
                  }
                }
              }
              if (!((up) this).field_H.field_F) {
                L2: {
                  var2_array = ((up) this).field_H.b(false);
                  if (!(((up) this).field_H instanceof dg)) {
                    try {
                      L3: {
                        if (var2_array != null) {
                          ((up) this).field_z = new ad(var2_array, ((up) this).field_y, ((up) this).field_o);
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        L5: {
                          var3 = decompiledCaughtException;
                          ((up) this).field_r.a((byte) -123);
                          ((up) this).field_z = null;
                          if (!((up) this).field_r.b((byte) -125)) {
                            break L5;
                          } else {
                            ((up) this).field_H = null;
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                        break L4;
                      }
                      stackOut_41_0 = null;
                      stackIn_42_0 = stackOut_41_0;
                      return (ad) (Object) stackIn_42_0;
                    }
                    if (((up) this).field_n != null) {
                      dg discarded$1 = ((up) this).field_D.a(var2_array, ((up) this).field_n, (byte) -128, ((up) this).field_k);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    try {
                      L6: {
                        if (var2_array != null) {
                          ((up) this).field_z = new ad(var2_array, ((up) this).field_y, ((up) this).field_o);
                          if (~((up) this).field_u == ~((up) this).field_z.field_h) {
                            break L6;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L7: {
                        L8: {
                          var3 = decompiledCaughtException;
                          ((up) this).field_z = null;
                          if (((up) this).field_r.b((byte) -125)) {
                            break L8;
                          } else {
                            ((up) this).field_H = (gr) (Object) ((up) this).field_r.a(((up) this).field_k, 255, (byte) 0, true, -154018400);
                            if (var4 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((up) this).field_H = null;
                        break L7;
                      }
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      return (ad) (Object) stackIn_29_0;
                    }
                    break L2;
                  }
                }
                L9: {
                  if (param0 == -21) {
                    break L9;
                  } else {
                    up.a(false);
                    break L9;
                  }
                }
                L10: {
                  ((up) this).field_H = null;
                  if (((up) this).field_t == null) {
                    break L10;
                  } else {
                    ((up) this).field_E = new byte[((up) this).field_z.field_d];
                    break L10;
                  }
                }
                stackOut_53_0 = ((up) this).field_z;
                stackIn_54_0 = stackOut_53_0;
                break L0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (ad) (Object) stackIn_13_0;
              }
            } else {
              stackOut_2_0 = ((up) this).field_z;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "up.E(" + param0 + ')');
        }
        return stackIn_54_0;
    }

    public static void a(boolean param0) {
        try {
            field_J = null;
            field_M = null;
            field_I = null;
            field_w = null;
            field_L = null;
            field_p = null;
            field_v = null;
            field_K = null;
            if (!param0) {
                field_w = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "up.H(" + param0 + ')');
        }
    }

    private final gr a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        Object stackIn_92_0 = null;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        Object stackIn_104_0 = null;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        Object stackIn_141_0 = null;
        Object stackIn_150_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_37_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        Object stackOut_140_0 = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        Object stackOut_91_0 = null;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_58_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_149_0 = null;
        var10 = Pool.field_O;
        try {
          try {
            var4 = (Object) (Object) (gr) (Object) ((up) this).field_G.a(false, (long)param0);
            if (param2 == 25) {
              L0: {
                if (var4 == null) {
                  break L0;
                } else {
                  if (param1 != 0) {
                    break L0;
                  } else {
                    if (((gr) var4).field_x) {
                      break L0;
                    } else {
                      if (!((gr) var4).field_F) {
                        break L0;
                      } else {
                        ((gr) var4).a((byte) -117);
                        var4 = null;
                        break L0;
                      }
                    }
                  }
                }
              }
              L1: {
                if (var4 != null) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param1 == 0) {
                        break L3;
                      } else {
                        if (param1 == 1) {
                          if (((up) this).field_t != null) {
                            var4 = (Object) (Object) ((up) this).field_D.a((byte) 58, ((up) this).field_t, param0);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          if (param1 == 2) {
                            if (((up) this).field_t == null) {
                              throw new RuntimeException();
                            } else {
                              if (((up) this).field_E[param0] != -1) {
                                throw new RuntimeException();
                              } else {
                                L4: {
                                  if (((up) this).field_r.a(param2 ^ 13)) {
                                    break L4;
                                  } else {
                                    var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, false, -154018400);
                                    if (var10 == 0) {
                                      break L2;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                                stackOut_37_0 = null;
                                stackIn_38_0 = stackOut_37_0;
                                return (gr) (Object) stackIn_38_0;
                              }
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    L5: {
                      if (null == ((up) this).field_t) {
                        break L5;
                      } else {
                        if (((up) this).field_E[param0] != -1) {
                          var4 = (Object) (Object) ((up) this).field_D.a(121, ((up) this).field_t, param0);
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (((up) this).field_r.b((byte) -125)) {
                        break L6;
                      } else {
                        var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, -154018400);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    stackOut_53_0 = null;
                    stackIn_54_0 = stackOut_53_0;
                    return (gr) (Object) stackIn_54_0;
                  }
                  ((up) this).field_G.a((byte) -114, (ma) var4, (long)param0);
                  break L1;
                }
              }
              if (!((gr) var4).field_F) {
                var5 = ((gr) var4).b(false);
                if (var4 instanceof dg) {
                  L7: {
                    if (null == var5) {
                      break L7;
                    } else {
                      if (var5.length > 2) {
                        oq.field_B.reset();
                        oq.field_B.update(var5, 0, -2 + var5.length);
                        var6_int = (int)oq.field_B.getValue();
                        if (~var6_int == ~((up) this).field_z.field_w[param0]) {
                          L8: {
                            L9: {
                              if (null == ((up) this).field_z.field_a) {
                                break L9;
                              } else {
                                if (null == ((up) this).field_z.field_a[param0]) {
                                  break L9;
                                } else {
                                  var7_ref_byte__ = ((up) this).field_z.field_a[param0];
                                  var8 = jr.a(-2 + var5.length, (byte) -83, var5, 0);
                                  var9 = 0;
                                  L10: while (true) {
                                    if (64 <= var9) {
                                      break L9;
                                    } else {
                                      stackOut_120_0 = ~var7_ref_byte__[var9];
                                      stackOut_120_1 = ~var8[var9];
                                      stackIn_128_0 = stackOut_120_0;
                                      stackIn_128_1 = stackOut_120_1;
                                      stackIn_121_0 = stackOut_120_0;
                                      stackIn_121_1 = stackOut_120_1;
                                      if (var10 != 0) {
                                        break L8;
                                      } else {
                                        if (stackIn_121_0 == stackIn_121_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L10;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_127_0 = var5[-1 + var5.length] & 255;
                            stackOut_127_1 = (255 & var5[-2 + var5.length]) << -1614229976;
                            stackIn_128_0 = stackOut_127_0;
                            stackIn_128_1 = stackOut_127_1;
                            break L8;
                          }
                          var7 = stackIn_128_0 + stackIn_128_1;
                          if (var7 == (((up) this).field_z.field_i[param0] & 65535)) {
                            L11: {
                              if (((up) this).field_E[param0] != 1) {
                                L12: {
                                  if (((up) this).field_E[param0] == 0) {
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((up) this).field_E[param0] = (byte) 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L13: {
                              if (!((gr) var4).field_x) {
                                ((gr) var4).a((byte) -117);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            stackOut_140_0 = var4;
                            stackIn_141_0 = stackOut_140_0;
                            return (gr) (Object) stackIn_141_0;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  throw new RuntimeException();
                } else {
                  try {
                    L14: {
                      L15: {
                        if (var5 == null) {
                          break L15;
                        } else {
                          if (2 >= var5.length) {
                            break L15;
                          } else {
                            oq.field_B.reset();
                            oq.field_B.update(var5, 0, var5.length + -2);
                            var6_int = (int)oq.field_B.getValue();
                            if (~var6_int == ~((up) this).field_z.field_w[param0]) {
                              L16: {
                                if (((up) this).field_z.field_a == null) {
                                  break L16;
                                } else {
                                  if (null == ((up) this).field_z.field_a[param0]) {
                                    break L16;
                                  } else {
                                    var7_ref_byte__ = ((up) this).field_z.field_a[param0];
                                    var8 = jr.a(var5.length + -2, (byte) -76, var5, 0);
                                    var9 = 0;
                                    L17: while (true) {
                                      if (64 <= var9) {
                                        break L16;
                                      } else {
                                        stackOut_77_0 = ~var7_ref_byte__[var9];
                                        stackOut_77_1 = ~var8[var9];
                                        stackIn_97_0 = stackOut_77_0;
                                        stackIn_97_1 = stackOut_77_1;
                                        stackIn_78_0 = stackOut_77_0;
                                        stackIn_78_1 = stackOut_77_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L14;
                                        } else {
                                          if (stackIn_78_0 != stackIn_78_1) {
                                            throw new RuntimeException();
                                          } else {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L17;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              ((up) this).field_r.field_e = 0;
                              ((up) this).field_r.field_a = 0;
                              decompiledRegionSelector0 = 1;
                              break L14;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L18: {
                      var6 = (RuntimeException) (Object) decompiledCaughtException;
                      ((up) this).field_r.a((byte) -53);
                      ((gr) var4).a((byte) -117);
                      if (((gr) var4).field_x) {
                        if (((up) this).field_r.b((byte) -125)) {
                          break L18;
                        } else {
                          var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, -154018400);
                          ((up) this).field_G.a((byte) -124, (ma) var4, (long)param0);
                          break L18;
                        }
                      } else {
                        break L18;
                      }
                    }
                    stackOut_91_0 = null;
                    stackIn_92_0 = stackOut_91_0;
                    return (gr) (Object) stackIn_92_0;
                  }
                  L19: {
                    L20: {
                      if (decompiledRegionSelector0 == 0) {
                        break L20;
                      } else {
                        var5[var5.length - 2] = (byte)(((up) this).field_z.field_i[param0] >>> -426587352);
                        var5[var5.length + -1] = (byte)((up) this).field_z.field_i[param0];
                        if (((up) this).field_t != null) {
                          dg discarded$1 = ((up) this).field_D.a(var5, ((up) this).field_t, (byte) -98, param0);
                          stackOut_96_0 = ~((up) this).field_E[param0];
                          stackOut_96_1 = -2;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (stackIn_97_0 == stackIn_97_1) {
                      break L19;
                    } else {
                      ((up) this).field_E[param0] = (byte) 1;
                      break L19;
                    }
                  }
                  L21: {
                    if (((gr) var4).field_x) {
                      break L21;
                    } else {
                      ((gr) var4).a((byte) -117);
                      break L21;
                    }
                  }
                  stackOut_103_0 = var4;
                  stackIn_104_0 = stackOut_103_0;
                  return (gr) (Object) stackIn_104_0;
                }
              } else {
                stackOut_58_0 = null;
                stackIn_59_0 = stackOut_58_0;
                return (gr) (Object) stackIn_59_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (gr) (Object) stackIn_3_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L22: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((up) this).field_E[param0] = (byte) -1;
              ((gr) var4).a((byte) -117);
              if (!((gr) var4).field_x) {
                break L22;
              } else {
                if (!((up) this).field_r.b((byte) -125)) {
                  var4 = (Object) (Object) ((up) this).field_r.a(param0, ((up) this).field_k, (byte) 2, true, param2 ^ -154018375);
                  ((up) this).field_G.a((byte) -127, (ma) var4, (long)param0);
                  break L22;
                } else {
                  break L22;
                }
              }
            }
            stackOut_149_0 = null;
            stackIn_150_0 = stackOut_149_0;
            return (gr) (Object) stackIn_150_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw wm.a((Throwable) var4, "up.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        gr var2_ref = null;
        ma var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_58_0 = 0;
        byte stackIn_58_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_92_0 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_120_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_57_0 = 0;
        byte stackOut_57_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_91_0 = 0;
        boolean stackOut_101_0 = false;
        int stackOut_119_0 = 0;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (((up) this).field_s == null) {
                break L1;
              } else {
                if (null == ((up) this).b((byte) -21)) {
                  return;
                } else {
                  L2: {
                    if (((up) this).field_C) {
                      break L2;
                    } else {
                      L3: {
                        if (!((up) this).field_B) {
                          break L3;
                        } else {
                          var2_int = 1;
                          var3 = ((up) this).field_s.c((byte) -58);
                          L4: while (true) {
                            L5: {
                              L6: {
                                L7: {
                                  if (var3 == null) {
                                    break L7;
                                  } else {
                                    var4 = (int)var3.field_c;
                                    stackOut_14_0 = ((up) this).field_E[var4];
                                    stackOut_14_1 = 1;
                                    stackIn_26_0 = stackOut_14_0;
                                    stackIn_26_1 = stackOut_14_1;
                                    stackIn_15_0 = stackOut_14_0;
                                    stackIn_15_1 = stackOut_14_1;
                                    if (var5 != 0) {
                                      L8: while (true) {
                                        if (stackIn_26_0 >= stackIn_26_1) {
                                          break L6;
                                        } else {
                                          stackOut_27_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                          stackIn_48_0 = stackOut_27_0;
                                          stackIn_28_0 = stackOut_27_0;
                                          if (var5 != 0) {
                                            break L5;
                                          } else {
                                            stackOut_28_0 = stackIn_28_0;
                                            stackIn_30_0 = stackOut_28_0;
                                            L9: {
                                              L10: {
                                                if (stackIn_30_0 == 0) {
                                                  ((up) this).field_x = ((up) this).field_x + 1;
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
                                                if (((up) this).field_r.a(20)) {
                                                  var2_int = 0;
                                                  if (var5 == 0) {
                                                    break L6;
                                                  } else {
                                                    break L11;
                                                  }
                                                } else {
                                                  break L11;
                                                }
                                              }
                                              L12: {
                                                if (((up) this).field_E[((up) this).field_x] == 1) {
                                                  break L12;
                                                } else {
                                                  gr discarded$4 = this.a(((up) this).field_x, 2, (byte) 25);
                                                  break L12;
                                                }
                                              }
                                              L13: {
                                                if (((up) this).field_E[((up) this).field_x] == 1) {
                                                  break L13;
                                                } else {
                                                  var3 = new ma();
                                                  var3.field_c = (long)((up) this).field_x;
                                                  var2_int = 0;
                                                  ((up) this).field_s.b((byte) 96, var3);
                                                  break L13;
                                                }
                                              }
                                              ((up) this).field_x = ((up) this).field_x + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L6;
                                              }
                                            }
                                            stackOut_25_0 = ((up) this).field_x;
                                            stackOut_25_1 = ((up) this).field_z.field_s.length;
                                            stackIn_26_0 = stackOut_25_0;
                                            stackIn_26_1 = stackOut_25_1;
                                            continue L8;
                                          }
                                        }
                                      }
                                    } else {
                                      L14: {
                                        if (stackIn_15_0 == stackIn_15_1) {
                                          break L14;
                                        } else {
                                          gr discarded$5 = this.a(var4, 2, (byte) 25);
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        L16: {
                                          if (((up) this).field_E[var4] == 1) {
                                            break L16;
                                          } else {
                                            var2_int = 0;
                                            if (var5 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var3.a((byte) -117);
                                        break L15;
                                      }
                                      var3 = ((up) this).field_s.f((byte) -5);
                                      if (var5 == 0) {
                                        continue L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                L17: while (true) {
                                  stackOut_25_0 = ((up) this).field_x;
                                  stackOut_25_1 = ((up) this).field_z.field_s.length;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  if (stackIn_26_0 >= stackIn_26_1) {
                                    break L6;
                                  } else {
                                    stackOut_27_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                    stackIn_48_0 = stackOut_27_0;
                                    stackIn_28_0 = stackOut_27_0;
                                    if (var5 != 0) {
                                      break L5;
                                    } else {
                                      stackOut_28_0 = stackIn_28_0;
                                      stackIn_30_0 = stackOut_28_0;
                                      L18: {
                                        if (stackIn_30_0 == 0) {
                                          ((up) this).field_x = ((up) this).field_x + 1;
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
                                        if (((up) this).field_r.a(20)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L6;
                                          } else {
                                            break L19;
                                          }
                                        } else {
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (((up) this).field_E[((up) this).field_x] == 1) {
                                          break L20;
                                        } else {
                                          gr discarded$4 = this.a(((up) this).field_x, 2, (byte) 25);
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (((up) this).field_E[((up) this).field_x] == 1) {
                                          break L21;
                                        } else {
                                          var3 = new ma();
                                          var3.field_c = (long)((up) this).field_x;
                                          var2_int = 0;
                                          ((up) this).field_s.b((byte) 96, var3);
                                          break L21;
                                        }
                                      }
                                      ((up) this).field_x = ((up) this).field_x + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_47_0 = var2_int;
                              stackIn_48_0 = stackOut_47_0;
                              break L5;
                            }
                            L22: {
                              if (stackIn_48_0 != 0) {
                                ((up) this).field_B = false;
                                ((up) this).field_x = 0;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((up) this).field_s = null;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((up) this).field_s.c((byte) 78);
                  L23: while (true) {
                    L24: {
                      L25: {
                        L26: {
                          if (var3 == null) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_c;
                            stackOut_57_0 = 0;
                            stackOut_57_1 = ((up) this).field_E[var4];
                            stackIn_69_0 = stackOut_57_0;
                            stackIn_69_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_69_0 >= stackIn_69_1) {
                                  break L25;
                                } else {
                                  stackOut_70_0 = ((up) this).field_z.field_s[((up) this).field_x];
                                  stackIn_92_0 = stackOut_70_0;
                                  stackIn_71_0 = stackOut_70_0;
                                  if (var5 != 0) {
                                    break L24;
                                  } else {
                                    stackOut_71_0 = stackIn_71_0;
                                    stackIn_73_0 = stackOut_71_0;
                                    L28: {
                                      L29: {
                                        if (stackIn_73_0 != 0) {
                                          break L29;
                                        } else {
                                          ((up) this).field_x = ((up) this).field_x + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((up) this).field_D.field_e >= 250) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((up) this).field_E[((up) this).field_x] != 0) {
                                          break L31;
                                        } else {
                                          gr discarded$6 = this.a(((up) this).field_x, 1, (byte) 25);
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((up) this).field_E[((up) this).field_x] != 0) {
                                          break L32;
                                        } else {
                                          var3 = new ma();
                                          var3.field_c = (long)((up) this).field_x;
                                          ((up) this).field_s.b((byte) -64, var3);
                                          var2_int = 0;
                                          break L32;
                                        }
                                      }
                                      ((up) this).field_x = ((up) this).field_x + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_68_0 = ((up) this).field_x;
                                    stackOut_68_1 = ((up) this).field_z.field_s.length;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_58_0 != stackIn_58_1) {
                                  break L33;
                                } else {
                                  gr discarded$7 = this.a(var4, 1, (byte) 25);
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (((up) this).field_E[var4] != 0) {
                                    break L35;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var3.a((byte) -117);
                                break L34;
                              }
                              var3 = ((up) this).field_s.f((byte) -5);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_68_0 = ((up) this).field_x;
                          stackOut_68_1 = ((up) this).field_z.field_s.length;
                          stackIn_69_0 = stackOut_68_0;
                          stackIn_69_1 = stackOut_68_1;
                          if (stackIn_69_0 >= stackIn_69_1) {
                            break L25;
                          } else {
                            stackOut_70_0 = ((up) this).field_z.field_s[((up) this).field_x];
                            stackIn_92_0 = stackOut_70_0;
                            stackIn_71_0 = stackOut_70_0;
                            if (var5 != 0) {
                              break L24;
                            } else {
                              stackOut_71_0 = stackIn_71_0;
                              stackIn_73_0 = stackOut_71_0;
                              L37: {
                                if (stackIn_73_0 != 0) {
                                  break L37;
                                } else {
                                  ((up) this).field_x = ((up) this).field_x + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((up) this).field_D.field_e >= 250) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((up) this).field_E[((up) this).field_x] != 0) {
                                  break L39;
                                } else {
                                  gr discarded$6 = this.a(((up) this).field_x, 1, (byte) 25);
                                  break L39;
                                }
                              }
                              L40: {
                                if (((up) this).field_E[((up) this).field_x] != 0) {
                                  break L40;
                                } else {
                                  var3 = new ma();
                                  var3.field_c = (long)((up) this).field_x;
                                  ((up) this).field_s.b((byte) -64, var3);
                                  var2_int = 0;
                                  break L40;
                                }
                              }
                              ((up) this).field_x = ((up) this).field_x + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      stackOut_91_0 = var2_int;
                      stackIn_92_0 = stackOut_91_0;
                      break L24;
                    }
                    if (stackIn_92_0 == 0) {
                      break L1;
                    } else {
                      ((up) this).field_C = false;
                      ((up) this).field_x = 0;
                      break L1;
                    }
                  }
                }
              }
            }
            L41: {
              L42: {
                if (!((up) this).field_A) {
                  break L42;
                } else {
                  if (~rl.a((byte) -124) > ~((up) this).field_F) {
                    break L42;
                  } else {
                    var2_ref = (gr) (Object) ((up) this).field_G.a(0);
                    L43: while (true) {
                      L44: {
                        if (null == var2_ref) {
                          break L44;
                        } else {
                          stackOut_101_0 = var2_ref.field_F;
                          stackIn_120_0 = stackOut_101_0 ? 1 : 0;
                          stackIn_102_0 = stackOut_101_0;
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L45: {
                              if (stackIn_102_0) {
                                break L45;
                              } else {
                                L46: {
                                  if (!var2_ref.field_C) {
                                    break L46;
                                  } else {
                                    if (!var2_ref.field_x) {
                                      throw new RuntimeException();
                                    } else {
                                      var2_ref.a((byte) -117);
                                      if (var5 == 0) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                var2_ref.field_C = true;
                                break L45;
                              }
                            }
                            var2_ref = (gr) (Object) ((up) this).field_G.b(-1);
                            if (var5 == 0) {
                              continue L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                      }
                      ((up) this).field_F = rl.a((byte) -107) + 1000L;
                      break L42;
                    }
                  }
                }
              }
              stackOut_119_0 = 86 % ((param0 - 82) / 40);
              stackIn_120_0 = stackOut_119_0;
              break L41;
            }
            var2_int = stackIn_120_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "up.J(" + param0 + ')');
        }
    }

    final byte[] a(int param0, byte param1) {
        gr var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(param0, 0, (byte) 25);
            if (var3 != null) {
              if (param1 == 19) {
                var4 = var3.b(false);
                var3.a((byte) -117);
                stackOut_6_0 = (byte[]) var4;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3_ref, "up.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    up(int param0, np param1, np param2, no param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((up) this).field_G = new bm(16);
        ((up) this).field_x = 0;
        ((up) this).field_q = new ko();
        ((up) this).field_F = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((up) this).field_k = param0;
                ((up) this).field_t = param1;
                if (null != ((up) this).field_t) {
                  break L2;
                } else {
                  ((up) this).field_C = false;
                  if (Pool.field_O == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((up) this).field_C = true;
              ((up) this).field_s = new ko();
              break L1;
            }
            L3: {
              ((up) this).field_o = param6;
              ((up) this).field_n = param2;
              ((up) this).field_A = param8;
              ((up) this).field_y = param5;
              ((up) this).field_u = param7;
              ((up) this).field_r = param3;
              ((up) this).field_D = param4;
              if (((up) this).field_n != null) {
                ((up) this).field_H = (gr) (Object) ((up) this).field_D.a(92, ((up) this).field_n, ((up) this).field_k);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("up.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
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
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[7];
        field_K = "The invitation has been withdrawn.";
        field_v = "Sound: ";
        field_I = "<%0> has joined your game.";
        field_L = "Press and hold the <img=0> on the cue ball to move it.";
        field_m = -1;
        field_w = "OVER <%0>";
        field_J = "Rematch";
    }
}
