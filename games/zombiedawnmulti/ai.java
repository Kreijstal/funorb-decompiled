/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai implements Runnable {
    private lq field_e;
    static gh field_g;
    static String field_d;
    static int field_a;
    private Thread field_i;
    private boolean field_f;
    static cj field_c;
    static int field_b;
    int field_h;

    final li b(int param0, bq param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        li stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_2_0 = null;
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
              if (param2 == 10) {
                break L1;
              } else {
                var5 = null;
                li discarded$2 = ((ai) this).a(-98, (bq) null, -12);
                break L1;
              }
            }
            var4 = new li();
            var4.field_B = param1;
            var4.field_r = false;
            var4.field_y = 3;
            var4.field_l = (long)param0;
            this.a(false, var4);
            stackOut_2_0 = (li) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("ai.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, byte param1) {
        try {
            wk.a(param0, (byte) 48);
            qj.a(jl.field_v, false, 102);
            int var2_int = -102 % ((52 - param1) / 40);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ai.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            li var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            L0: while (true) {
              if (!((ai) this).field_f) {
                var2 = (Object) (Object) ((ai) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (li) (Object) ((ai) this).field_e.a(11356);
                    if (var7 != null) {
                      ((ai) this).field_h = ((ai) this).field_h - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((ai) this).field_e).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_y == 2) {
                          boolean discarded$1 = var7.field_B.a((byte) 118, var7.field_D, var7.field_D.length, (int)var7.field_l);
                          break L5;
                        } else {
                          if (var7.field_y != 3) {
                            break L5;
                          } else {
                            var7.field_D = var7.field_B.a(1, (int)var7.field_l);
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      bd.a((String) null, (Throwable) (Object) var2_ref, false);
                      break L6;
                    }
                  }
                  var7.field_t = false;
                  continue L0;
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final li a(int param0, bq param1, byte[] param2, int param3) {
        li var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        li stackIn_4_0 = null;
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
        li stackOut_3_0 = null;
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
            var5 = new li();
            var5.field_r = false;
            var5.field_l = (long)param0;
            var5.field_D = param2;
            var5.field_y = 2;
            var5.field_B = param1;
            this.a(false, var5);
            if (param3 > 26) {
              stackOut_3_0 = (li) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (li) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("ai.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static int a(boolean param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_78_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            lq.field_b = lq.field_b + 65536;
            L1: while (true) {
              if (65536 > sd.a((byte) 120, lq.field_b, nf.field_b)) {
                L2: {
                  var2_int = -1;
                  if (null == ld.field_Ub) {
                    if (null != ao.field_h) {
                      var2_int = ao.field_h.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var2_int = ld.field_Ub.length;
                    break L2;
                  }
                }
                L3: {
                  if (var2_int != -1) {
                    L4: {
                      if (~lb.field_a <= ~nf.field_c) {
                        break L4;
                      } else {
                        L5: {
                          lb.field_a = lb.field_a + 1;
                          if (~lb.field_a >= ~nf.field_a) {
                            break L5;
                          } else {
                            L6: {
                              if (null == ld.field_Ub) {
                                break L6;
                              } else {
                                if (null != ld.field_Ub[gf.field_g]) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            lb.field_a = lb.field_a - 1;
                            break L4;
                          }
                        }
                        if (lb.field_a < nf.field_c) {
                          break L4;
                        } else {
                          if (ld.field_Ub[(gf.field_g + 1) % var2_int] == null) {
                            lb.field_a = lb.field_a - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (~nf.field_c >= ~lb.field_a) {
                        L8: {
                          gf.field_j = gf.field_g;
                          if (qh.field_a) {
                            gf.field_g = gf.field_g + 1;
                            if (gf.field_g >= var2_int) {
                              gf.field_g = gf.field_g - var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            gf.field_g = gf.field_g - 1;
                            if (gf.field_g >= 0) {
                              break L8;
                            } else {
                              gf.field_g = gf.field_g + var2_int;
                              break L8;
                            }
                          }
                        }
                        lb.field_a = lb.field_a - nf.field_c;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (nf.field_a >= lb.field_a) {
                      break L3;
                    } else {
                      qh.field_a = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L9: {
                  if (fa.field_Tb == null) {
                    break L9;
                  } else {
                    L10: {
                      var3 = -(fa.field_Tb.field_u / 2) + 357;
                      var4 = 0;
                      if (kd.field_b == 0) {
                        break L10;
                      } else {
                        if (ka.field_t <= var3) {
                          break L10;
                        } else {
                          if (~(fa.field_Tb.field_w + var3) >= ~ka.field_t) {
                            break L10;
                          } else {
                            L11: {
                              if (269 + -fa.field_Tb.field_x >= vb.field_f) {
                                break L11;
                              } else {
                                if (vb.field_f >= 269) {
                                  break L11;
                                } else {
                                  var4 = 1;
                                  lb.field_a = nf.field_c;
                                  qh.field_a = false;
                                  break L11;
                                }
                              }
                            }
                            if (vb.field_f <= 586) {
                              break L10;
                            } else {
                              if (~vb.field_f > ~(fa.field_Tb.field_x + 586)) {
                                var4 = 1;
                                qh.field_a = true;
                                lb.field_a = nf.field_c;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (~nf.field_a <= ~lb.field_a) {
                        break L9;
                      } else {
                        if (bo.field_d <= var3) {
                          break L9;
                        } else {
                          if (~(fa.field_Tb.field_w + var3) < ~bo.field_d) {
                            L12: {
                              if (~(-fa.field_Tb.field_x + 269) <= ~bd.field_g) {
                                break L12;
                              } else {
                                if (269 > bd.field_g) {
                                  lb.field_a = nf.field_a;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (bd.field_g <= 586) {
                              break L9;
                            } else {
                              if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                                lb.field_a = nf.field_a;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
                if (param0) {
                  L13: {
                    gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, -1, vb.field_f));
                    if (!gl.field_H.c(-85)) {
                      break L13;
                    } else {
                      if (gl.field_H.field_d == 0) {
                        stackOut_61_0 = 3;
                        stackIn_62_0 = stackOut_61_0;
                        return stackIn_62_0;
                      } else {
                        if (gl.field_H.field_d != 1) {
                          break L13;
                        } else {
                          stackOut_64_0 = 2;
                          stackIn_65_0 = stackOut_64_0;
                          return stackIn_65_0;
                        }
                      }
                    }
                  }
                  stackOut_66_0 = -1;
                  stackIn_68_0 = stackOut_66_0;
                  L14: while (true) {
                    if (!ba.c(stackIn_68_0)) {
                      stackOut_80_0 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      break L0;
                    } else {
                      L15: {
                        gl.field_H.a(0, false);
                        if (!gl.field_H.c(-85)) {
                          break L15;
                        } else {
                          if (gl.field_H.field_d != 0) {
                            if (gl.field_H.field_d == 1) {
                              stackOut_75_0 = 1;
                              stackIn_76_0 = stackOut_75_0;
                              return stackIn_76_0;
                            } else {
                              break L15;
                            }
                          } else {
                            stackOut_71_0 = 3;
                            stackIn_72_0 = stackOut_71_0;
                            return stackIn_72_0;
                          }
                        }
                      }
                      if (13 != sj.field_p) {
                        stackOut_67_0 = -1;
                        stackIn_68_0 = stackOut_67_0;
                        continue L14;
                      } else {
                        stackOut_78_0 = 1;
                        stackIn_79_0 = stackOut_78_0;
                        return stackIn_79_0;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                fn.field_c = fn.field_c + 1;
                lq.field_b = lq.field_b - nf.field_b;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "ai.E(" + param0 + ',' + 110 + ')');
        }
        return stackIn_81_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_g = null;
    }

    final li a(int param0, bq param1, int param2) {
        li var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        li var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_3_0 = null;
        li stackIn_12_0 = null;
        li stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        li stackOut_11_0 = null;
        li stackOut_18_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var4 = new li();
            if (param2 == -3) {
              var4.field_y = 1;
              var5 = (Object) (Object) ((ai) this).field_e;
              synchronized (var5) {
                L1: {
                  var6 = (li) (Object) ((ai) this).field_e.c((byte) 85);
                  L2: while (true) {
                    if (var6 == null) {
                      break L1;
                    } else {
                      L3: {
                        if (var6.field_l != (long)param0) {
                          break L3;
                        } else {
                          if (param1 != var6.field_B) {
                            break L3;
                          } else {
                            if (var6.field_y == 2) {
                              var4.field_t = false;
                              var4.field_D = var6.field_D;
                              stackOut_11_0 = (li) var4;
                              stackIn_12_0 = stackOut_11_0;
                              return stackIn_12_0;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      var6 = (li) (Object) ((ai) this).field_e.b((byte) 118);
                      continue L2;
                    }
                  }
                }
              }
              var4.field_D = param1.a(1, param0);
              var4.field_t = false;
              var4.field_r = true;
              stackOut_18_0 = (li) var4;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (li) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4_ref;
            stackOut_20_1 = new StringBuilder().append("ai.F(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        bk stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        bk stackOut_4_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length <= 136) {
                stackOut_6_0 = (byte[]) param2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3 = new bk();
                ((t) (Object) var3).a(param2, (byte) -72);
                stackOut_4_0 = (bk) var3;
                stackIn_5_0 = stackOut_4_0;
                return (Object) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ai.A(").append(-137).append(',').append(false).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return (Object) (Object) stackIn_7_0;
    }

    private final void a(boolean param0, li param1) {
        synchronized (((ai) this).field_e) {
            ((ai) this).field_e.a(29664, (qa) (Object) param1);
            ((ai) this).field_h = ((ai) this).field_h + 1;
            ((Object) (Object) ((ai) this).field_e).notifyAll();
        }
    }

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        ((ai) this).field_f = true;
        var2 = (Object) (Object) ((ai) this).field_e;
        synchronized (var2) {
          L0: {
            L1: {
              ((Object) (Object) ((ai) this).field_e).notifyAll();
              if (param0 == 77) {
                break L1;
              } else {
                var4 = null;
                ai.a((String) null, (byte) 75);
                break L1;
              }
            }
            break L0;
          }
        }
        try {
          L2: {
            ((ai) this).field_i.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((ai) this).field_i = null;
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (sj.field_p != 13) {
          if (sj.field_p == 102) {
            mj.field_Ib.c((byte) 113);
            return true;
          } else {
            int discarded$6 = ai.a(true, (byte) 112);
            if (null != mj.field_Ib) {
              if (!mj.field_Ib.a(96, 15, 13)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          ub.n(33423425);
          return true;
        }
    }

    ai(go param0) {
        di var2 = null;
        ((ai) this).field_e = new lq();
        ((ai) this).field_f = false;
        ((ai) this).field_h = 0;
        try {
            var2 = param0.a(121, (Runnable) this, 5);
            while (var2.field_f == 0) {
                vd.a(false, 10L);
            }
            if (var2.field_f == 2) {
                throw new RuntimeException();
            }
            ((ai) this).field_i = (Thread) var2.field_d;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ai.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_d = "The game options are not all set.";
    }
}
