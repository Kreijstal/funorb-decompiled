/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends kk {
    static String field_Q;
    static String field_M;
    static String field_L;
    static long field_K;
    static int field_J;
    static int field_O;
    static String field_H;
    private Object field_N;
    static int field_I;

    public static void i(int param0) {
        if (param0 != 0) {
          field_H = null;
          field_Q = null;
          field_M = null;
          field_H = null;
          field_L = null;
          return;
        } else {
          field_Q = null;
          field_M = null;
          field_H = null;
          field_L = null;
          return;
        }
    }

    final static int a(boolean param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_76_0 = 0;
        var5 = Pool.field_O;
        try {
          L0: {
            li.field_d = li.field_d + 65536;
            L1: while (true) {
              if (ng.a(hj.field_f, 0, li.field_d) < 65536) {
                L2: {
                  var2_int = -1;
                  if (nf.field_V == null) {
                    if (jr.field_m == null) {
                      break L2;
                    } else {
                      var2_int = jr.field_m.length;
                      break L2;
                    }
                  } else {
                    var2_int = nf.field_V.length;
                    break L2;
                  }
                }
                L3: {
                  if (var2_int == -1) {
                    break L3;
                  } else {
                    L4: {
                      if (hj.field_g > ug.field_u) {
                        L5: {
                          ug.field_u = ug.field_u + 1;
                          if (ug.field_u <= hj.field_l) {
                            break L5;
                          } else {
                            L6: {
                              if (nf.field_V == null) {
                                break L6;
                              } else {
                                if (nf.field_V[rj.field_f] == null) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            ug.field_u = ug.field_u - 1;
                            break L4;
                          }
                        }
                        if (ug.field_u < hj.field_g) {
                          break L4;
                        } else {
                          if (null != nf.field_V[(1 + rj.field_f) % var2_int]) {
                            break L4;
                          } else {
                            ug.field_u = ug.field_u - 1;
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      if (ug.field_u >= hj.field_g) {
                        cf.field_b = rj.field_f;
                        ug.field_u = ug.field_u - hj.field_g;
                        if (!b.field_K) {
                          rj.field_f = rj.field_f - 1;
                          if (rj.field_f < 0) {
                            rj.field_f = rj.field_f + var2_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          rj.field_f = rj.field_f + 1;
                          if (rj.field_f < var2_int) {
                            break L7;
                          } else {
                            rj.field_f = rj.field_f - var2_int;
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (ug.field_u > hj.field_l) {
                      b.field_K = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L8: {
                  if (null != vq.field_Yb) {
                    L9: {
                      var3 = -(vq.field_Yb.field_y / 2) + 357;
                      var4 = 0;
                      if (0 == ne.field_s) {
                        break L9;
                      } else {
                        if (ua.field_o <= var3) {
                          break L9;
                        } else {
                          if (var3 - -vq.field_Yb.field_A > ua.field_o) {
                            L10: {
                              if (-vq.field_Yb.field_z + 269 >= lq.field_W) {
                                break L10;
                              } else {
                                if (269 <= lq.field_W) {
                                  break L10;
                                } else {
                                  b.field_K = false;
                                  ug.field_u = hj.field_g;
                                  var4 = 1;
                                  break L10;
                                }
                              }
                            }
                            if (586 >= lq.field_W) {
                              break L9;
                            } else {
                              if (lq.field_W >= 586 + vq.field_Yb.field_z) {
                                break L9;
                              } else {
                                var4 = 1;
                                b.field_K = true;
                                ug.field_u = hj.field_g;
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L8;
                    } else {
                      if (hj.field_l >= ug.field_u) {
                        break L8;
                      } else {
                        if (gg.field_f <= var3) {
                          break L8;
                        } else {
                          if (gg.field_f >= var3 + vq.field_Yb.field_A) {
                            break L8;
                          } else {
                            L11: {
                              if (-vq.field_Yb.field_z + 269 >= wn.field_i) {
                                break L11;
                              } else {
                                if (wn.field_i >= 269) {
                                  break L11;
                                } else {
                                  ug.field_u = hj.field_l;
                                  break L11;
                                }
                              }
                            }
                            if (586 >= wn.field_i) {
                              break L8;
                            } else {
                              if (wn.field_i < 586 + vq.field_Yb.field_z) {
                                ug.field_u = hj.field_l;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                if (param0) {
                  L12: {
                    jc.field_j.a(ho.a((byte) -82, lq.field_W, ua.field_o), ho.a((byte) -21, wn.field_i, gg.field_f), -127);
                    if (!jc.field_j.b((byte) 62)) {
                      break L12;
                    } else {
                      if (jc.field_j.field_h != 0) {
                        if (jc.field_j.field_h == 1) {
                          stackOut_61_0 = 2;
                          stackIn_62_0 = stackOut_61_0;
                          return stackIn_62_0;
                        } else {
                          break L12;
                        }
                      } else {
                        stackOut_57_0 = 3;
                        stackIn_58_0 = stackOut_57_0;
                        return stackIn_58_0;
                      }
                    }
                  }
                  L13: while (true) {
                    if (!n.h(127)) {
                      stackOut_78_0 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      break L0;
                    } else {
                      L14: {
                        jc.field_j.a(true, 0);
                        if (jc.field_j.b((byte) 101)) {
                          if (jc.field_j.field_h == 0) {
                            stackOut_68_0 = 3;
                            stackIn_69_0 = stackOut_68_0;
                            return stackIn_69_0;
                          } else {
                            if (jc.field_j.field_h == 1) {
                              stackOut_72_0 = 1;
                              stackIn_73_0 = stackOut_72_0;
                              return stackIn_73_0;
                            } else {
                              break L14;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      if (qi.field_a == 13) {
                        stackOut_76_0 = 1;
                        stackIn_77_0 = stackOut_76_0;
                        return stackIn_77_0;
                      } else {
                        continue L13;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                li.field_d = li.field_d - hj.field_f;
                uf.field_X = uf.field_X + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "fd.Q(" + param0 + ',' + 65 + ')');
        }
        return stackIn_79_0;
    }

    final static void h() {
        oq var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var1 = ej.field_j;
            L1: while (true) {
              int discarded$13 = -120;
              if (!va.g()) {
                break L0;
              } else {
                var1.b(false, 8);
                int fieldTemp$14 = var1.field_v + 1;
                var1.field_v = var1.field_v + 1;
                var2 = fieldTemp$14;
                int discarded$15 = 1;
                wn.a(var1);
                ej.field_j.b(var1.field_v + -var2, true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1_ref, "fd.G(" + 119 + ')');
        }
    }

    fd(Object param0, int param1) {
        super(param1);
        try {
            ((fd) this).field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "fd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int[] param0, int[] param1, byte param2) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              th.a(0, param2 ^ 30966, param0, param1, param0.length - 1);
              if (param2 == -54) {
                break L1;
              } else {
                var4 = null;
                fd.a((int[]) null, (int[]) null, (byte) -96);
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
            stackOut_3_1 = new StringBuilder().append("fd.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 >= -16) {
            fd.i(-107);
            return false;
        }
        return false;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == 2) {
                break L1;
              } else {
                var8 = null;
                fd.a((int[]) null, (int[]) null, (byte) -8);
                break L1;
              }
            }
            param3--;
            L2: while (true) {
              if (param3 < 0) {
                break L0;
              } else {
                var9 = param0;
                var5_array = var9;
                var6 = param2;
                var7 = param1;
                var9[var6] = var7 + rb.b(8355711, var9[var6] >> 1);
                param2++;
                param3--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("fd.S(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final Object c(byte param0) {
        if (param0 <= 119) {
            return null;
        }
        return ((fd) this).field_N;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "<%0> has declined the invitation.";
        field_O = 0;
        field_Q = "Eight-ball";
        field_J = 360;
        field_H = "<%0> all want to draw.";
        field_L = "Mouse over an icon for details";
        field_I = 0;
    }
}
