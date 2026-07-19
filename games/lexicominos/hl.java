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
        this.field_G[param2] = param0;
        this.field_t[param2] = vg.a(param0, -128);
        if (param1 <= 30) {
            return;
        }
        this.a(param2, 2, param0);
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_M[param2] = param1;
        if (param0) {
            return;
        }
        this.field_O[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0 + 0.5);
    }

    final boolean b(cb param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_J = (int[]) null;
                break L1;
              }
            }
            if (param0.field_C == null) {
              if ((param0.field_h ^ -1) <= -1) {
                L2: {
                  param0.b((byte) -128);
                  if (param0.field_u <= 0) {
                    break L2;
                  } else {
                    if (this.field_L[param0.field_z][param0.field_u] == param0) {
                      this.field_L[param0.field_z][param0.field_u] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("hl.KA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final synchronized void b(int param0, int param1) {
        boolean discarded$0 = false;
        this.field_K = param1;
        if (param0 != -180) {
            discarded$0 = this.a(63, (ih) null, (byte) -51, (ja) null, (sh) null);
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_o = (byte[][]) null;
        if (!param0) {
            hl.d(-92);
        }
        field_N = null;
    }

    final static boolean a(boolean param0, th param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param0) {
                break L1;
              } else {
                hl.f(53, 103);
                break L1;
              }
            }
            L2: {
              if ((param1.g(1, 26527) ^ -1) != -2) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("hl.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    private final void e(int param0, int param1) {
        cb var3 = null;
        int var4 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          if (param0 > 39) {
            break L0;
          } else {
            this.field_I = false;
            break L0;
          }
        }
        var3 = (cb) ((Object) this.field_y.field_n.a(true));
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1 < 0) {
                      break L4;
                    } else {
                      if (var3.field_z != param1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null != var3.field_C) {
                      L6: {
                        var3.field_C.h(b.field_r / 100);
                        if (var3.field_C.h()) {
                          this.field_y.field_m.a(var3.field_C);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var3.c(0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (-1 < (var3.field_h ^ -1)) {
                      this.field_R[var3.field_z][var3.field_q] = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var3.b((byte) -116);
                  break L3;
                }
                var3 = (cb) ((Object) this.field_y.field_n.f(2));
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
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
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            param1.b();
            var6_int = 1;
            if (param2 == 102) {
              L1: {
                var7 = null;
                if (0 < param0) {
                  var7 = new int[]{param0};
                  break L1;
                } else {
                  break L1;
                }
              }
              var8 = (cj) ((Object) param1.field_i.c((byte) -111));
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        var9 = (int)var8.field_d;
                        var10 = (wj) ((Object) this.field_A.a((long)var9, (byte) 120));
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
                                  if (var10 != null) {
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
                                this.field_A.a(var10, (byte) -48, (long)var9);
                                break L7;
                              }
                            }
                            if (var10.a(var8.field_h, param3, (byte) 116, (int[]) (var7))) {
                              break L6;
                            } else {
                              var6_int = 0;
                              break L6;
                            }
                          }
                          var8 = (cj) ((Object) param1.field_i.a((byte) -91));
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
                stackOut_20_0 = var6_int;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("hl.G(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    final void a(byte param0, cb param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1.field_w.field_i.length;
              if (param0 == 92) {
                break L1;
              } else {
                this.field_v = (int[]) null;
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
                      var5 = (int)((long)var6 * (long)this.field_u[param1.field_z] >> 1425469254);
                      var4_int = var4_int << 8;
                      if ((var4_int ^ -1) >= (var5 ^ -1)) {
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
              var5 = (int)((long)var4_int * (long)this.field_u[param1.field_z] >> -839552186);
              break L2;
            }
            param1.field_C.b(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("hl.IA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_n.g();
        this.field_s = null;
        this.a(param0, (byte) -87);
        if (param1 != 43) {
            this.a(-117);
        }
    }

    final synchronized void d(boolean param0) {
        if (param0) {
            field_B = -22;
        }
        this.a(true, 43);
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        var3 = 240 & param1;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param1;
          var5 = param1 >> 1474627272 & 127;
          var6 = (8341718 & param1) >> -1751248496;
          this.a(var6, var5, var4, 0);
          return;
        } else {
          L0: {
            if ((var3 ^ -1) != -145) {
              if (var3 == 160) {
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
                    this.field_n = (ek) null;
                    break L1;
                  }
                }
                if ((var3 ^ -1) == -177) {
                  L2: {
                    var4 = 15 & param1;
                    var5 = param1 >> -1878661176 & 127;
                    var6 = (8388315 & param1) >> 1749186736;
                    if (0 == var5) {
                      this.field_t[var4] = (var6 << 91688110) + vg.a(this.field_t[var4], -2080769);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 != var5) {
                      break L3;
                    } else {
                      this.field_t[var4] = vg.a(-16257, this.field_t[var4]) - -(var6 << 737964263);
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -2) {
                      break L4;
                    } else {
                      this.field_x[var4] = vg.a(-16257, this.field_x[var4]) - -(var6 << 1375367);
                      break L4;
                    }
                  }
                  L5: {
                    if (-34 == (var5 ^ -1)) {
                      this.field_x[var4] = var6 + vg.a(-128, this.field_x[var4]);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (5 != var5) {
                      break L6;
                    } else {
                      this.field_S[var4] = vg.a(this.field_S[var4], -16257) + (var6 << 1325931399);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 37) {
                      this.field_S[var4] = vg.a(this.field_S[var4], -128) - -var6;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (7 == var5) {
                      this.field_J[var4] = vg.a(-16257, this.field_J[var4]) - -(var6 << 1535161991);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (39 != var5) {
                      break L9;
                    } else {
                      this.field_J[var4] = vg.a(this.field_J[var4], -128) - -var6;
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) != -11) {
                      break L10;
                    } else {
                      this.field_C[var4] = vg.a(this.field_C[var4], -16257) + (var6 << -1606040409);
                      break L10;
                    }
                  }
                  L11: {
                    if (-43 == (var5 ^ -1)) {
                      this.field_C[var4] = var6 + vg.a(-128, this.field_C[var4]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (11 != var5) {
                      break L12;
                    } else {
                      this.field_l[var4] = (var6 << 857588871) + vg.a(-16257, this.field_l[var4]);
                      break L12;
                    }
                  }
                  L13: {
                    if (43 == var5) {
                      this.field_l[var4] = vg.a(-128, this.field_l[var4]) + var6;
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
                        if (-65 < (var6 ^ -1)) {
                          break L15;
                        } else {
                          this.field_q[var4] = tb.a(this.field_q[var4], 1);
                          if (var8 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_q[var4] = vg.a(this.field_q[var4], -2);
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
                          this.field_q[var4] = vg.a(this.field_q[var4], -3);
                          if (var8 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      this.field_q[var4] = tb.a(this.field_q[var4], 2);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) != -100) {
                      break L18;
                    } else {
                      this.field_v[var4] = (var6 << -1274034457) + vg.a(127, this.field_v[var4]);
                      break L18;
                    }
                  }
                  L19: {
                    if ((var5 ^ -1) != -99) {
                      break L19;
                    } else {
                      this.field_v[var4] = var6 + vg.a(16256, this.field_v[var4]);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 101) {
                      this.field_v[var4] = (var6 << -1515964537) + vg.a(this.field_v[var4], 127) + 16384;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 100) {
                      this.field_v[var4] = vg.a(16256, this.field_v[var4]) + 16384 - -var6;
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
                    if ((var5 ^ -1) != -122) {
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
                      var7 = this.field_v[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L25;
                      } else {
                        this.field_r[var4] = vg.a(this.field_r[var4], -16257) + (var6 << 1478163335);
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (-39 != (var5 ^ -1)) {
                      break L26;
                    } else {
                      var7 = this.field_v[var4];
                      if (16384 == var7) {
                        this.field_r[var4] = var6 + vg.a(this.field_r[var4], -128);
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
                      this.field_u[var4] = vg.a(-16257, this.field_u[var4]) + (var6 << 1328337447);
                      break L27;
                    }
                  }
                  L28: {
                    if (48 == var5) {
                      this.field_u[var4] = var6 + vg.a(this.field_u[var4], -128);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (var5 == 81) {
                      L30: {
                        if ((var6 ^ -1) > -65) {
                          break L30;
                        } else {
                          this.field_q[var4] = tb.a(this.field_q[var4], 4);
                          if (var8 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      this.c(-785046068, var4);
                      this.field_q[var4] = vg.a(this.field_q[var4], -5);
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L31: {
                    if (var5 == 17) {
                      this.a(false, (var6 << -339395385) + (-16257 & this.field_M[var4]), var4);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  if ((var5 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.a(false, (this.field_M[var4] & -128) + var6, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> -1054065688;
                    this.a(var4, 2, var5 + this.field_t[var4]);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> 702448904;
                      this.c(120, var4, var5);
                      return;
                    } else {
                      if (-225 == (var3 ^ -1)) {
                        var4 = 15 & param1;
                        var5 = (param1 >> 866224809 & 16256) + ((32570 & param1) >> -1359342872);
                        this.b(var5, -16257, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if ((var3 ^ -1) != -256) {
                          return;
                        } else {
                          this.a(true, (byte) -87);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L32: {
                var4 = param1 & 15;
                var5 = (32699 & param1) >> 32032232;
                var6 = (param1 & 8384220) >> 1691962288;
                if (-1 > (var6 ^ -1)) {
                  break L32;
                } else {
                  this.a(64, var5, var4, 0);
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L32;
                  }
                }
              }
              this.a(var4, var6, (byte) -111, var5);
              return;
            }
          }
          return;
        }
    }

    final synchronized lk b() {
        return null;
    }

    final synchronized boolean a(byte param0) {
        if (param0 != -32) {
            return false;
        }
        return this.field_n.d();
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 120) {
            this.field_y = (kj) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        cb var6 = null;
        int var7 = 0;
        cb var8 = null;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          if (param3 == 0) {
            break L0;
          } else {
            this.field_q = (int[]) null;
            break L0;
          }
        }
        var8 = this.field_R[param2][param1];
        if (var8 != null) {
          L1: {
            L2: {
              this.field_R[param2][param1] = null;
              if ((2 & this.field_q[param2] ^ -1) != -1) {
                break L2;
              } else {
                var8.field_h = 0;
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var6 = (cb) ((Object) this.field_y.field_n.a(true));
            L3: while (true) {
              L4: {
                if (var6 == null) {
                  break L4;
                } else {
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L5: {
                      if ((var8.field_z ^ -1) != (var6.field_z ^ -1)) {
                        break L5;
                      } else {
                        if (0 <= var6.field_h) {
                          break L5;
                        } else {
                          if (var6 != var8) {
                            var8.field_h = 0;
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var6 = (cb) ((Object) this.field_y.field_n.f(param3 ^ 2));
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              break L1;
            }
          }
          return;
        } else {
          return;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            var3_int = this.field_C[param0.field_z];
            var4 = -57 / ((param1 - 21) / 32);
            if ((var3_int ^ -1) <= -8193) {
              stackOut_3_0 = -(32 + (-param0.field_k + 128) * (-var3_int + 16384) >> -1453334842) + 16384;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 32 + param0.field_k * var3_int >> 1760926662;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("hl.V(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void f(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        wa var4 = null;
        mc var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (wa) ((Object) ki.field_b.a(true));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    na.a((byte) -126, var4, param0);
                    var4 = (wa) ((Object) ki.field_b.f(2));
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
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              var5 = (mc) ((Object) vh.field_a.a(true));
              L4: while (true) {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    fj.a(param0, var5, false);
                    var5 = (mc) ((Object) vh.field_a.f(param1 ^ -2210));
                    if (var3 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var3 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "hl.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = Lexicominos.field_L ? 1 : 0;
            if (-1 >= (param0 ^ -1)) {
              break L1;
            } else {
              var4 = 0;
              L2: while (true) {
                L3: {
                  if ((var4 ^ -1) <= -17) {
                    break L3;
                  } else {
                    this.field_w[var4] = param1;
                    var4++;
                    if (var5 != 0) {
                      break L0;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_w[param0] = param1;
          break L0;
        }
        L4: {
          if (!param2) {
            break L4;
          } else {
            this.field_u = (int[]) null;
            break L4;
          }
        }
    }

    private final synchronized void a(ih param0, boolean param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(param2, 43);
              this.field_n.a(param0.field_h);
              if (param3 == -5953) {
                break L1;
              } else {
                this.field_t = (int[]) null;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param1) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            ((hl) (this)).field_D = stackIn_6_1 != 0;
            this.field_P = 0L;
            var5_int = this.field_n.e();
            var6 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if ((var5_int ^ -1) >= (var6 ^ -1)) {
                    break L5;
                  } else {
                    this.field_n.c(var6);
                    this.field_n.a(var6);
                    this.field_n.b(var6);
                    var6++;
                    if (var7 != 0) {
                      break L4;
                    } else {
                      if (var7 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.field_z = this.field_n.a();
                this.field_m = this.field_n.field_a[this.field_z];
                this.field_U = this.field_n.d(this.field_m);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("hl.P(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized int a() {
        return 0;
    }

    final static void d(int param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
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
        th var27 = null;
        th var28 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        var26 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                L2: {
                  var27 = ig.field_a;
                  var28 = var27;
                  var2 = var28.d(true);
                  if (-1 == (var2 ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (-2 == (var2 ^ -1)) {
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
                    var3 = var28.b(-1698573656);
                    var4_long = var28.f((byte) -102);
                    var6_ref_nc = (nc) ((Object) ok.field_b.a(true));
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var6_ref_nc == null) {
                            break L6;
                          } else {
                            stackOut_9_0 = var3 ^ -1;
                            stackIn_14_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var26 != 0) {
                              break L5;
                            } else {
                              if (stackIn_10_0 == (var6_ref_nc.field_j ^ -1)) {
                                break L6;
                              } else {
                                var6_ref_nc = (nc) ((Object) ok.field_b.f(param0 + 2));
                                if (var26 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        if (var6_ref_nc != null) {
                          var6_ref_nc.field_h = var4_long;
                          var6_ref_nc.b((byte) -118);
                          if (var26 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          stackOut_13_0 = -95;
                          stackIn_14_0 = stackOut_13_0;
                          break L5;
                        }
                      }
                      ck.b((byte) stackIn_14_0);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                var3 = var28.b(param0 + -1698573656);
                var4 = (sj) ((Object) il.field_b.a(true));
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var4 == null) {
                        break L9;
                      } else {
                        stackOut_19_0 = var3 ^ -1;
                        stackIn_27_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var26 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_20_0 != (var4.field_h ^ -1)) {
                              break L10;
                            } else {
                              if (var26 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var4 = (sj) ((Object) il.field_b.f(param0 + 2));
                          if (var26 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var4 == null) {
                      stackOut_26_0 = -32;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      L11: {
                        L12: {
                          var5 = var28.d(true);
                          if ((var5 ^ -1) == -1) {
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
                                  f.field_l[var8_int].field_d = var27.c(false);
                                  f.field_l[var8_int].field_b = false;
                                  if (var26 != 0) {
                                    break L11;
                                  } else {
                                    L15: {
                                      L16: {
                                        if (-2 != (var28.d(true) ^ -1)) {
                                          break L16;
                                        } else {
                                          f.field_l[var8_int].field_f = var28.c(false);
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
                              dupTemp$6 = new String[3][var6];
                              var4.field_j = dupTemp$6;
                              var8 = dupTemp$6;
                              var9 = new String[3][var6];
                              dupTemp$7 = new long[3][var6];
                              var4.field_i = dupTemp$7;
                              var10 = dupTemp$7;
                              dupTemp$8 = new int[3][var7 * var6];
                              var4.field_n = dupTemp$8;
                              var11 = dupTemp$8;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              var17 = 0;
                              var18 = var28.d(true);
                              if (-1 <= (var18 ^ -1)) {
                                break L12;
                              } else {
                                var19 = 0;
                                L17: while (true) {
                                  if (var19 >= var18) {
                                    break L12;
                                  } else {
                                    var20 = var27.d(true);
                                    var21 = f.field_l[var20].field_d;
                                    var22 = var28.f((byte) -86);
                                    var24 = var28.field_h;
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
                                                if ((var7 ^ -1) >= (var25 ^ -1)) {
                                                  break L20;
                                                } else {
                                                  incrementValue$9 = var15;
                                                  var15++;
                                                  var11[0][incrementValue$9] = var27.d((byte) 19);
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
                                              var28.field_h = var24;
                                              var25 = 0;
                                              L22: while (true) {
                                                if (var25 >= var7) {
                                                  break L19;
                                                } else {
                                                  incrementValue$10 = var16;
                                                  var16++;
                                                  var11[1][incrementValue$10] = var27.d((byte) 19);
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
                                              var28.field_h = var24;
                                              var14++;
                                              var25 = 0;
                                              L24: while (true) {
                                                if (var25 >= var7) {
                                                  break L23;
                                                } else {
                                                  incrementValue$11 = var17;
                                                  var17++;
                                                  var11[2][incrementValue$11] = var27.d((byte) 19);
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
                  ck.b((byte) stackIn_27_0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "hl.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          L1: {
            var4 = Lexicominos.field_L ? 1 : 0;
            if (param0) {
              break L1;
            } else {
              this.d(-33, -1);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.e(71, -1);
          break L0;
        }
        this.h(-1, 16645);
        if (param1 == -87) {
          var3 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if (var3 >= 16) {
                  break L4;
                } else {
                  this.field_E[var3] = this.field_G[var3];
                  var3++;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var3 = 0;
              break L3;
            }
            L5: while (true) {
              L6: {
                if (16 <= var3) {
                  break L6;
                } else {
                  this.field_t[var3] = vg.a(this.field_G[var3], -128);
                  var3++;
                  if (var4 != 0) {
                    break L6;
                  } else {
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        cb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = (cb) ((Object) this.field_y.field_n.a(true));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = param1;
                stackIn_11_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 < 0) {
                        break L4;
                      } else {
                        if (var3.field_z == param1) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (0 > var3.field_h) {
                      this.field_R[var3.field_z][var3.field_q] = null;
                      var3.field_h = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (cb) ((Object) this.field_y.field_n.f(2));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_10_0 = -29 % ((param0 - 60) / 51);
            stackIn_11_0 = stackOut_10_0;
            break L1;
          }
          var4 = stackIn_11_0;
          return;
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -83) {
            this.field_S = (int[]) null;
        }
    }

    final boolean a(int[] param0, int param1, cb param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.field_m = b.field_r / 100;
              if ((param2.field_h ^ -1) > -1) {
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
                  if (-1 <= (param2.field_u ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_L[param2.field_z][param2.field_u] != param2) {
                      break L3;
                    } else {
                      this.field_L[param2.field_z][param2.field_u] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param2.field_v;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, (double)this.field_S[param2.field_z] * 0.0004921259842519685) * 16.0);
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
                if ((var7.field_e ^ -1) >= -1) {
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
                  if (-819201 >= (var7.field_e * param2.field_j ^ -1)) {
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
                          stackOut_32_0 = param2.field_F;
                          stackOut_32_1 = var7.field_c[param2.field_B + 2] << -1082231256 & 65280;
                          stackIn_37_0 = stackOut_32_0;
                          stackIn_37_1 = stackOut_32_1;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          if (var11 != 0) {
                            break L13;
                          } else {
                            if (stackIn_33_0 <= stackIn_33_1) {
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
                      stackOut_36_0 = param2.field_B ^ -1;
                      stackOut_36_1 = -2 + var7.field_c.length ^ -1;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L13;
                    }
                    if (stackIn_37_0 != stackIn_37_1) {
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
                if (-1 < (param2.field_h ^ -1)) {
                  break L15;
                } else {
                  if (var7.field_g == null) {
                    break L15;
                  } else {
                    if (-1 != (1 & this.field_q[param2.field_z] ^ -1)) {
                      break L15;
                    } else {
                      L16: {
                        if (param2.field_u < 0) {
                          break L16;
                        } else {
                          if (param2 == this.field_L[param2.field_z][param2.field_u]) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        L18: {
                          if ((var7.field_l ^ -1) >= -1) {
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
                            if ((var7.field_g.length + -2 ^ -1) >= (param2.field_y ^ -1)) {
                              break L21;
                            } else {
                              stackOut_51_0 = (var7.field_g[param2.field_y + 2] & 255) << -1357795512;
                              stackOut_51_1 = param2.field_h;
                              stackIn_56_0 = stackOut_51_0;
                              stackIn_56_1 = stackOut_51_1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              if (var11 != 0) {
                                break L20;
                              } else {
                                if (stackIn_52_0 >= stackIn_52_1) {
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
                          stackOut_55_0 = var7.field_g.length - 2;
                          stackOut_55_1 = param2.field_y;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          break L20;
                        }
                        if (stackIn_56_0 == stackIn_56_1) {
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
                stackOut_73_0 = 0;
                stackIn_74_0 = stackOut_73_0;
                decompiledRegionSelector0 = 3;
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
                    this.field_y.field_m.a(param2.field_C);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  param2.c(0);
                  if (-1 < (param2.field_h ^ -1)) {
                    break L25;
                  } else {
                    param2.b((byte) -118);
                    if (param2.field_u <= 0) {
                      break L25;
                    } else {
                      if (this.field_L[param2.field_z][param2.field_u] != param2) {
                        break L25;
                      } else {
                        this.field_L[param2.field_z][param2.field_u] = null;
                        break L25;
                      }
                    }
                  }
                }
                stackOut_71_0 = 1;
                stackIn_72_0 = stackOut_71_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var6);
            stackOut_75_1 = new StringBuilder().append("hl.C(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L26;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L26;
            }
          }
          L27: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_72_0 != 0;
            } else {
              return stackIn_74_0 != 0;
            }
          }
        }
    }

    private final int c(cb param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rc var9 = null;
        rc var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (-1 != (this.field_w[param0.field_z] ^ -1)) {
              L1: {
                var9 = param0.field_r;
                var10 = var9;
                var4 = 4096 + this.field_J[param0.field_z] * this.field_l[param0.field_z] >> 1082569645;
                var4 = var4 * var4 + 16384 >> 1369862127;
                var4 = var4 * param0.field_s - -16384 >> 62750607;
                var4 = this.field_H * var4 + 128 >> 1015971880;
                var4 = var4 * this.field_w[param0.field_z] + 128 >> 330576328;
                if (var10.field_e > 0) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_e * (0.00001953125 * (double)param0.field_j)) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 1554) {
                  break L2;
                } else {
                  discarded$1 = this.a(-54, (ih) null, (byte) -125, (ja) null, (sh) null);
                  break L2;
                }
              }
              L3: {
                if (var10.field_c == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_F;
                    var6 = var10.field_c[1 + param0.field_B];
                    if (-2 + var10.field_c.length > param0.field_B) {
                      var7 = var9.field_c[param0.field_B] << -630288184 & 65280;
                      var8 = (var10.field_c[2 + param0.field_B] & 255) << 1468459880;
                      var6 = var6 + (-var7 + var5) * (-var6 + var10.field_c[3 + param0.field_B]) / (-var7 + var8);
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
                if (-1 <= (param0.field_h ^ -1)) {
                  break L5;
                } else {
                  if (var10.field_g == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_h;
                      var6 = var10.field_g[1 + param0.field_y];
                      if ((param0.field_y ^ -1) > (-2 + var10.field_g.length ^ -1)) {
                        var7 = var9.field_g[param0.field_y] << -1489113752 & 65280;
                        var8 = (255 & var10.field_g[2 + param0.field_y]) << -239171224;
                        var6 = var6 + (-var6 + var10.field_g[param0.field_y - -3]) * (var5 - var7) / (-var7 + var8);
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
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("hl.AA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_20_0;
        }
    }

    private final void c(int param0, int param1) {
        cb var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 == -785046068) {
          L0: {
            if (0 != (4 & this.field_q[param1])) {
              var3 = (cb) ((Object) this.field_y.field_n.a(true));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if ((var3.field_z ^ -1) == (param1 ^ -1)) {
                        var3.field_E = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var3 = (cb) ((Object) this.field_y.field_n.f(2));
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        cb var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 16384) {
          L0: {
            if ((this.field_q[param0] & 2) != 0) {
              var3 = (cb) ((Object) this.field_y.field_n.a(true));
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L2: {
                      if (var3.field_z != param0) {
                        break L2;
                      } else {
                        if (this.field_R[param0][var3.field_q] != null) {
                          break L2;
                        } else {
                          if (-1 < (var3.field_h ^ -1)) {
                            var3.field_h = 0;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    var3 = (cb) ((Object) this.field_y.field_n.f(param1 + -16382));
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized lk d() {
        return (lk) ((Object) this.field_y);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!this.field_n.d()) {
                    break L3;
                  } else {
                    var4_int = this.field_n.field_e * this.field_K / b.field_r;
                    L4: while (true) {
                      L5: {
                        var5 = this.field_P - -((long)param2 * (long)var4_int);
                        if ((this.field_U - var5 ^ -1L) > -1L) {
                          break L5;
                        } else {
                          this.field_P = var5;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var7 = (int)((this.field_U + -this.field_P - (-(long)var4_int - -1L)) / (long)var4_int);
                      this.field_P = this.field_P + (long)var4_int * (long)var7;
                      this.field_y.b(param0, param1, var7);
                      param1 = param1 + var7;
                      this.b(-11);
                      param2 = param2 - var7;
                      if (!this.field_n.d()) {
                        break L3;
                      } else {
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          this.field_y.b(param0, param1, param2);
                          break L1;
                        }
                      }
                    }
                  }
                }
                this.field_y.b(param0, param1, param2);
                break L2;
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("hl.I(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, ih param2) {
        try {
            this.a(param2, param1, true, -5953);
            if (param0 < 26) {
                this.a(-128, false, -53);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "hl.JA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Lexicominos.field_L ? 1 : 0;
            if (this.field_n.d()) {
              var2 = this.field_n.field_e * this.field_K / b.field_r;
              L2: while (true) {
                L3: {
                  var3 = this.field_P + (long)param0 * (long)var2;
                  if ((this.field_U + -var3 ^ -1L) <= -1L) {
                    this.field_P = var3;
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
                  var5 = (int)((-1L + this.field_U - (this.field_P - (long)var2)) / (long)var2);
                  this.field_P = this.field_P + (long)var2 * (long)var5;
                  this.field_y.a(var5);
                  param0 = param0 - var5;
                  this.b(-11);
                  if (this.field_n.d()) {
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
                  this.field_y.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_y.a(param0);
          break L0;
        }
    }

    private final void h(int param0, int param1) {
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            this.field_J[param0] = 12800;
            this.field_C[param0] = 8192;
            this.field_l[param0] = 16383;
            this.field_T[param0] = 8192;
            this.field_x[param0] = 0;
            this.field_S[param0] = 8192;
            this.a(param0, 16384);
            if (param1 == 16645) {
              break L0;
            } else {
              this.field_L = (cb[][]) null;
              break L0;
            }
          }
          this.c(param1 + -785062713, param0);
          this.field_q[param0] = 0;
          this.field_v[param0] = 32767;
          this.field_r[param0] = 256;
          this.field_u[param0] = 0;
          this.a(false, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.h(param0, param1 ^ 0);
              param0++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != -16257) {
            return;
        }
        this.field_T[param2] = param0;
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        cb var5 = null;
        ke var6 = null;
        int var6_int = 0;
        cb var7 = null;
        cb var8 = null;
        int var9 = 0;
        wj var10 = null;
        wj var11 = null;
        cb stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cb stackIn_19_2 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        cb stackIn_20_2 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        cb stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        cb stackOut_3_0 = null;
        kd stackOut_8_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cb stackOut_18_2 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        cb stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        cb stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        L0: {
          L1: {
            var9 = Lexicominos.field_L ? 1 : 0;
            this.a(64, param3, param0, 0);
            if (-1 == (this.field_q[param0] & 2 ^ -1)) {
              break L1;
            } else {
              var5 = (cb) ((Object) this.field_y.field_n.c(2));
              L2: while (true) {
                if (var5 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = (cb) (var5);
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0.field_z != param0) {
                        break L3;
                      } else {
                        if ((var5.field_h ^ -1) <= -1) {
                          break L3;
                        } else {
                          this.field_R[param0][var5.field_q] = null;
                          this.field_R[param0][param3] = var5;
                          var6_int = var5.field_o + (var5.field_l * var5.field_v >> 702668556);
                          var5.field_o = var5.field_o + (param3 - var5.field_q << -742728824);
                          var5.field_q = param3;
                          var5.field_v = 4096;
                          var5.field_l = var6_int + -var5.field_o;
                          return;
                        }
                      }
                    }
                    var5 = (cb) ((Object) this.field_y.field_n.d(0));
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_8_0 = this.field_A.a((long)this.field_E[param0], (byte) 118);
          stackIn_9_0 = stackOut_8_0;
          break L0;
        }
        var10 = (wj) ((Object) stackIn_9_0);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_l[param3];
          if (var6 == null) {
            return;
          } else {
            var7 = new cb();
            var7.field_w = var6;
            var7.field_z = param0;
            var7.field_p = var10;
            var7.field_r = var10.field_h[param3];
            var7.field_u = var10.field_r[param3];
            var7.field_q = param3;
            var7.field_s = 1024 + var10.field_n[param3] * var11.field_m * (param1 * param1) >> -1489629717;
            var7.field_k = var10.field_q[param3] & 255;
            var7.field_o = (param3 << 375772168) + -(32767 & var10.field_k[param3]);
            var7.field_j = 0;
            if (param2 < -78) {
              L4: {
                L5: {
                  var7.field_h = -1;
                  var7.field_y = 0;
                  var7.field_F = 0;
                  var7.field_B = 0;
                  if (0 == this.field_u[param0]) {
                    break L5;
                  } else {
                    L6: {
                      var7.field_C = cc.a(var6, this.a((byte) -121, var7), 0, this.a(var7, 74));
                      stackOut_18_0 = this;
                      stackOut_18_1 = 92;
                      stackOut_18_2 = (cb) (var7);
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      if (0 <= var10.field_k[param3]) {
                        stackOut_20_0 = this;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = (cb) ((Object) stackIn_20_2);
                        stackOut_20_3 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        break L6;
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = (cb) ((Object) stackIn_19_2);
                        stackOut_19_3 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        break L6;
                      }
                    }
                    this.a((byte) stackIn_21_1, stackIn_21_2, stackIn_21_3 != 0);
                    if (var9 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
                break L4;
              }
              L7: {
                if (0 <= var10.field_k[param3]) {
                  break L7;
                } else {
                  var7.field_C.e(-1);
                  break L7;
                }
              }
              L8: {
                if ((var7.field_u ^ -1) > -1) {
                  break L8;
                } else {
                  L9: {
                    var8 = this.field_L[param0][var7.field_u];
                    if (var8 == null) {
                      break L9;
                    } else {
                      if (0 <= var8.field_h) {
                        break L9;
                      } else {
                        this.field_R[param0][var8.field_q] = null;
                        var8.field_h = 0;
                        break L9;
                      }
                    }
                  }
                  this.field_L[param0][var7.field_u] = var7;
                  break L8;
                }
              }
              this.field_y.field_n.b(115, var7);
              this.field_R[param0][param3] = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 2) {
          L0: {
            if (param2 == this.field_E[param0]) {
              break L0;
            } else {
              this.field_E[param0] = param2;
              var4 = 0;
              L1: while (true) {
                if (-129 >= (var4 ^ -1)) {
                  break L0;
                } else {
                  this.field_L[param0][var4] = null;
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void c(int param0) {
        int var3 = 0;
        wj var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 <= -73) {
          var4 = (wj) ((Object) this.field_A.c((byte) -95));
          L0: while (true) {
            L1: {
              if (var4 == null) {
                break L1;
              } else {
                var4.a(-122);
                var4 = (wj) ((Object) this.field_A.a((byte) -91));
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int discarded$0 = 0;
        this.a(param0, (byte) 90, param2);
        if (!param1) {
            discarded$0 = this.c((cb) null, -91);
        }
    }

    private final int a(byte param0, cb param1) {
        lk discarded$1 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
              var3_int = (param1.field_v * param1.field_l >> -785046068) + param1.field_o;
              var3_int = var3_int + (this.field_r[param1.field_z] * (-8192 + this.field_T[param1.field_z]) >> 1736778060);
              if (param0 < -105) {
                break L1;
              } else {
                discarded$1 = this.d();
                break L1;
              }
            }
            L2: {
              var4 = param1.field_r;
              if ((var4.field_d ^ -1) >= -1) {
                break L2;
              } else {
                L3: {
                  if (0 < var4.field_k) {
                    break L3;
                  } else {
                    if (-1 <= (this.field_x[param1.field_z] ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_k << 175776194;
                  var6 = var4.field_h << 1090801345;
                  if ((var6 ^ -1) >= (param1.field_x ^ -1)) {
                    break L4;
                  } else {
                    var5 = param1.field_x * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_x[param1.field_z] >> 1497020263);
                var7 = Math.sin((double)(511 & param1.field_i) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(param1.field_w.field_m * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)b.field_r + 0.5);
              if (var5 >= 1) {
                stackOut_11_0 = var5;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("hl.Q(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          var2 = this.field_z;
          var3 = this.field_m;
          var4 = this.field_U;
          if (null == this.field_s) {
            break L0;
          } else {
            if (this.field_Q == var3) {
              this.a(this.field_s, this.field_D, this.field_I, param0 ^ 5962);
              this.b(param0 ^ 0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          stackOut_4_0 = var3 ^ -1;
          stackOut_4_1 = this.field_m ^ -1;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_5_0 != stackIn_5_1) {
                  break L4;
                } else {
                  L5: while (true) {
                    stackOut_6_0 = var3;
                    stackOut_6_1 = this.field_n.field_a[var2];
                    stackIn_25_0 = stackOut_6_0;
                    stackIn_25_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L6: {
                        if (stackIn_7_0 != stackIn_7_1) {
                          break L6;
                        } else {
                          this.field_n.c(var2);
                          var6 = this.field_n.f(var2);
                          stackOut_8_0 = -2;
                          stackOut_8_1 = var6 ^ -1;
                          stackIn_5_0 = stackOut_8_0;
                          stackIn_5_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var7 != 0) {
                            continue L2;
                          } else {
                            if (stackIn_9_0 == stackIn_9_1) {
                              this.field_n.f();
                              this.field_n.b(var2);
                              if (!this.field_n.c()) {
                                break L6;
                              } else {
                                if (this.field_s == null) {
                                  L7: {
                                    if (!this.field_D) {
                                      break L7;
                                    } else {
                                      if (0 == var3) {
                                        break L7;
                                      } else {
                                        this.field_n.a(var4);
                                        if (var7 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  this.a(true, (byte) -87);
                                  this.field_n.g();
                                  return;
                                } else {
                                  this.a(111, this.field_D, this.field_s);
                                  this.b(param0 + 0);
                                  return;
                                }
                              }
                            } else {
                              L8: {
                                if (0 != (128 & var6)) {
                                  this.g(param0 + -112, var6);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              this.field_n.a(var2);
                              this.field_n.b(var2);
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var2 = this.field_n.a();
                      var3 = this.field_n.field_a[var2];
                      var4 = this.field_n.d(var3);
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_z = var2;
              this.field_U = var4;
              this.field_m = var3;
              stackOut_24_0 = param0;
              stackOut_24_1 = -11;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              break L3;
            }
            L9: {
              if (stackIn_25_0 == stackIn_25_1) {
                break L9;
              } else {
                this.field_m = -105;
                break L9;
              }
            }
            L10: {
              if (this.field_s == null) {
                break L10;
              } else {
                if (var3 <= this.field_Q) {
                  break L10;
                } else {
                  this.field_z = -1;
                  this.field_m = this.field_Q;
                  this.field_U = this.field_n.d(this.field_m);
                  break L10;
                }
              }
            }
            return;
          }
        }
    }

    public hl() {
        this.field_E = new int[16];
        this.field_O = new int[16];
        this.field_H = 256;
        this.field_u = new int[16];
        this.field_C = new int[16];
        this.field_l = new int[16];
        this.field_M = new int[16];
        this.field_T = new int[16];
        this.field_L = new cb[16][128];
        this.field_S = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_v = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_r = new int[16];
        this.field_x = new int[16];
        this.field_t = new int[16];
        this.field_R = new cb[16][128];
        this.field_K = 1000000;
        this.field_n = new ek();
        this.field_y = new kj((hl) (this));
        this.field_A = new na(128);
        this.a(-1, 256, false);
        this.a(true, (byte) -87);
    }

    hl(hl param0) {
        this.field_E = new int[16];
        this.field_O = new int[16];
        this.field_H = 256;
        this.field_u = new int[16];
        this.field_C = new int[16];
        this.field_l = new int[16];
        this.field_M = new int[16];
        this.field_T = new int[16];
        this.field_L = new cb[16][128];
        this.field_S = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_v = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_r = new int[16];
        this.field_x = new int[16];
        this.field_t = new int[16];
        this.field_R = new cb[16][128];
        this.field_K = 1000000;
        this.field_n = new ek();
        this.field_y = new kj((hl) (this));
        try {
            this.field_A = param0.field_A;
            this.a(-1, 256, false);
            this.a(true, (byte) -87);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Try again";
    }
}
