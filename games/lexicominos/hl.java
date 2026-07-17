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
        this.a(param2, 2, param0);
    }

    private final void a(boolean param0, int param1, int param2) {
        ((hl) this).field_M[param2] = param1;
        ((hl) this).field_O[param2] = (int)(Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0 + 0.5);
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
                ((hl) this).field_J = null;
                break L1;
              }
            }
            if (param0.field_C == null) {
              if (param0.field_h >= 0) {
                L2: {
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
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("hl.KA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final synchronized void b(int param0, int param1) {
        ((hl) this).field_K = param1;
        if (param0 != -180) {
            Object var4 = null;
            boolean discarded$0 = ((hl) this).a(63, (ih) null, (byte) -51, (ja) null, (sh) null);
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_o = null;
        field_N = null;
    }

    final static boolean a(boolean param0, th param1) {
        return param1.g(1, 26527) == 1;
    }

    private final void e(int param0, int param1) {
        cb var3 = null;
        int var4 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          if (param0 > 39) {
            break L0;
          } else {
            ((hl) this).field_I = false;
            break L0;
          }
        }
        var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (var3.field_z != param1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != var3.field_C) {
                  L5: {
                    var3.field_C.h(b.field_r / 100);
                    if (var3.field_C.h()) {
                      ((hl) this).field_y.field_m.a((lk) (Object) var3.field_C);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.c(0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (var3.field_h < 0) {
                  ((hl) this).field_R[var3.field_z][var3.field_q] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.b((byte) -116);
              break L2;
            }
            var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
            continue L1;
          }
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
                  var7 = (Object) (Object) new int[]{param0};
                  break L1;
                } else {
                  break L1;
                }
              }
              var8 = (cj) (Object) param1.field_i.c((byte) -111);
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int != 0) {
                      param1.a();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_20_0 = var6_int;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L4: {
                    var9 = (int)var8.field_d;
                    var10 = (wj) (Object) ((hl) this).field_A.a((long)var9, (byte) 120);
                    if (var10 != null) {
                      break L4;
                    } else {
                      int discarded$1 = 1;
                      var10 = ug.a(param4, var9);
                      if (var10 != null) {
                        ((hl) this).field_A.a((kd) (Object) var10, (byte) -48, (long)var9);
                        break L4;
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var10 == null) {
                      break L5;
                    } else {
                      if (var10.a(var8.field_h, param3, (byte) 116, (int[]) var7)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    }
                  }
                  var8 = (cj) (Object) param1.field_i.a((byte) -91);
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6;
            stackOut_22_1 = new StringBuilder().append("hl.G(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
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
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final void a(byte param0, cb param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                    var6 = -param1.field_w.field_k + var4_int + var4_int;
                    var5 = (int)((long)var6 * (long)((hl) this).field_u[param1.field_z] >> 6);
                    var4_int = var4_int << 8;
                    if (~var4_int >= ~var5) {
                      param1.field_C.c(true);
                      var5 = var4_int + (var4_int - (1 - -var5));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((hl) this).field_u[param1.field_z] >> 6);
              break L2;
            }
            param1.field_C.b(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("hl.IA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        ((hl) this).field_n.g();
        ((hl) this).field_s = null;
        this.a(param0, (byte) -87);
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
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = param1 >> 8 & 127;
          var6 = (8341718 & param1) >> 16;
          this.a(var6, var5, var4, 0);
          return;
        } else {
          L0: {
            if (var3 != 144) {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = 127 & param1 >> 8;
                var6 = 127 & param1 >> 16;
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
                if (var3 == 176) {
                  L2: {
                    var4 = 15 & param1;
                    var5 = param1 >> 8 & 127;
                    var6 = (8388315 & param1) >> 16;
                    if (0 == var5) {
                      ((hl) this).field_t[var4] = (var6 << 14) + vg.a(((hl) this).field_t[var4], -2080769);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 != var5) {
                      break L3;
                    } else {
                      ((hl) this).field_t[var4] = vg.a(-16257, ((hl) this).field_t[var4]) - -(var6 << 7);
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 1) {
                      break L4;
                    } else {
                      ((hl) this).field_x[var4] = vg.a(-16257, ((hl) this).field_x[var4]) - -(var6 << 7);
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
                      ((hl) this).field_S[var4] = vg.a(((hl) this).field_S[var4], -16257) + (var6 << 7);
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
                      ((hl) this).field_J[var4] = vg.a(-16257, ((hl) this).field_J[var4]) - -(var6 << 7);
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
                      ((hl) this).field_C[var4] = vg.a(((hl) this).field_C[var4], -16257) + (var6 << 7);
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
                      ((hl) this).field_l[var4] = (var6 << 7) + vg.a(-16257, ((hl) this).field_l[var4]);
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
                      if (var6 < 64) {
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -2);
                        break L14;
                      } else {
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 1);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 65) {
                      if (64 <= var6) {
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 2);
                        break L15;
                      } else {
                        this.a(var4, 16384);
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 != 99) {
                      break L16;
                    } else {
                      ((hl) this).field_v[var4] = (var6 << 7) + vg.a(127, ((hl) this).field_v[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 98) {
                      break L17;
                    } else {
                      ((hl) this).field_v[var4] = var6 + vg.a(16256, ((hl) this).field_v[var4]);
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 101) {
                      ((hl) this).field_v[var4] = (var6 << 7) + vg.a(((hl) this).field_v[var4], 127) + 16384;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 100) {
                      ((hl) this).field_v[var4] = vg.a(16256, ((hl) this).field_v[var4]) + 16384 - -var6;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (120 == var5) {
                      this.e(99, var4);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 != 121) {
                      break L21;
                    } else {
                      this.h(var4, 16645);
                      break L21;
                    }
                  }
                  L22: {
                    if (123 == var5) {
                      this.d(112, var4);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (6 != var5) {
                      break L23;
                    } else {
                      var7 = ((hl) this).field_v[var4];
                      if (var7 != 16384) {
                        break L23;
                      } else {
                        ((hl) this).field_r[var4] = vg.a(((hl) this).field_r[var4], -16257) + (var6 << 7);
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var5 != 38) {
                      break L24;
                    } else {
                      var7 = ((hl) this).field_v[var4];
                      if (16384 == var7) {
                        ((hl) this).field_r[var4] = var6 + vg.a(((hl) this).field_r[var4], -128);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (16 != var5) {
                      break L25;
                    } else {
                      ((hl) this).field_u[var4] = vg.a(-16257, ((hl) this).field_u[var4]) + (var6 << 7);
                      break L25;
                    }
                  }
                  L26: {
                    if (48 == var5) {
                      ((hl) this).field_u[var4] = var6 + vg.a(((hl) this).field_u[var4], -128);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 81) {
                      if (var6 < 64) {
                        this.c(-785046068, var4);
                        ((hl) this).field_q[var4] = vg.a(((hl) this).field_q[var4], -5);
                        break L27;
                      } else {
                        ((hl) this).field_q[var4] = tb.a(((hl) this).field_q[var4], 4);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (var5 == 17) {
                      this.a(false, (var6 << 7) + (-16257 & ((hl) this).field_M[var4]), var4);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.a(false, (((hl) this).field_M[var4] & -128) + var6, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = 15 & param1;
                    var5 = 127 & param1 >> 8;
                    this.a(var4, 2, var5 + ((hl) this).field_t[var4]);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> 8;
                      this.c(120, var4, var5);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = 15 & param1;
                        var5 = (param1 >> 9 & 16256) + ((32570 & param1) >> 8);
                        this.b(var5, -16257, var4);
                        return;
                      } else {
                        var3 = param1 & 255;
                        if (var3 != 255) {
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
              var4 = param1 & 15;
              var5 = (32699 & param1) >> 8;
              var6 = (param1 & 8384220) >> 16;
              if (var6 > 0) {
                this.a(var4, var6, (byte) -111, var5);
                return;
              } else {
                this.a(64, var5, var4, 0);
                break L0;
              }
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
        return ((hl) this).field_n.d();
    }

    private final void c(int param0, int param1, int param2) {
    }

    private final void a(int param0, int param1, int param2, int param3) {
        cb var6 = null;
        int var7 = Lexicominos.field_L ? 1 : 0;
        cb var8 = ((hl) this).field_R[param2][param1];
        if (var8 == null) {
            return;
        }
        ((hl) this).field_R[param2][param1] = null;
        if ((2 & ((hl) this).field_q[param2]) == 0) {
            var8.field_h = 0;
        } else {
            var6 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            while (var6 != null) {
                if (~var8.field_z == ~var6.field_z) {
                    if (0 > var6.field_h) {
                        if (!(var6 == var8)) {
                            var8.field_h = 0;
                            break;
                        }
                    }
                }
                var6 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
            }
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
            var3_int = ((hl) this).field_C[param0.field_z];
            var4 = -57 / ((param1 - 21) / 32);
            if (var3_int >= 8192) {
              stackOut_3_0 = -(32 + (-param0.field_k + 128) * (-var3_int + 16384) >> 6) + 16384;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 32 + param0.field_k * var3_int >> 6;
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
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void f() {
        RuntimeException var2 = null;
        int var3 = 0;
        wa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (wa) (Object) ki.field_b.a(true);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$2 = 5;
                na.a((byte) -126, var4);
                var4 = (wa) (Object) ki.field_b.f(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "hl.K(" + 5 + 44 + -2212 + 41);
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (param0 >= 0) {
            ((hl) this).field_w[param0] = param1;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((hl) this).field_w[var4] = param1;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            ((hl) this).field_u = null;
            break L2;
          }
        }
    }

    private final synchronized void a(ih param0, boolean param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Lexicominos.field_L ? 1 : 0;
        try {
            this.a(param2, 43);
            ((hl) this).field_n.a(param0.field_h);
            if (param3 != -5953) {
                ((hl) this).field_t = null;
            }
            ((hl) this).field_D = param1 ? true : false;
            ((hl) this).field_P = 0L;
            var5_int = ((hl) this).field_n.e();
            for (var6 = 0; ~var5_int < ~var6; var6++) {
                ((hl) this).field_n.c(var6);
                ((hl) this).field_n.a(var6);
                ((hl) this).field_n.b(var6);
            }
            ((hl) this).field_z = ((hl) this).field_n.a();
            ((hl) this).field_m = ((hl) this).field_n.field_a[((hl) this).field_z];
            ((hl) this).field_U = ((hl) this).field_n.d(((hl) this).field_m);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.P(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final synchronized int a() {
        return 0;
    }

    final static void d(int param0) {
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
        th var28 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = ig.field_a;
              var2 = var28.d(true);
              if (var2 == 0) {
                var3 = var28.b(-1698573656);
                var4 = (sj) (Object) il.field_b.a(true);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (~var3 != ~var4.field_h) {
                        var4 = (sj) (Object) il.field_b.f(2);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 == null) {
                    ck.b((byte) -32);
                    return;
                  } else {
                    L4: {
                      var5 = var28.d(true);
                      if (var5 == 0) {
                        break L4;
                      } else {
                        var6 = var4.field_o;
                        var7 = var4.field_m;
                        f.field_l[0].field_b = false;
                        f.field_l[0].field_f = null;
                        f.field_l[0].field_d = og.field_c;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
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
                            var18 = var28.d(true);
                            if (var18 <= 0) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.d(true);
                                    var21 = f.field_l[var20].field_d;
                                    var22 = var28.f((byte) -86);
                                    var24 = var28.field_h;
                                    if (var19 >= var6) {
                                      break L7;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = f.field_l[var20].field_f;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (~var7 >= ~var25) {
                                          break L7;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.d((byte) 19);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!md.a(var21, -105)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = og.field_c;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_h = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var28.d((byte) 19);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
                                      break L11;
                                    } else {
                                      if (f.field_l[var20].field_b) {
                                        break L11;
                                      } else {
                                        f.field_l[var20].field_b = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = f.field_l[var20].field_f;
                                        var10[2][var14] = var22;
                                        var28.field_h = var24;
                                        var14++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var28.d((byte) 19);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L13: {
                              f.field_l[var8_int].field_d = var28.c(false);
                              f.field_l[var8_int].field_b = false;
                              if (var28.d(true) != 1) {
                                f.field_l[var8_int].field_f = null;
                                break L13;
                              } else {
                                f.field_l[var8_int].field_f = var28.c(false);
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.field_k = true;
                    var4.b((byte) -117);
                    break L1;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var28.b(-1698573656);
                  var4_long = var28.f((byte) -102);
                  var6_ref_nc = (nc) (Object) ok.field_b.a(true);
                  L14: while (true) {
                    L15: {
                      if (var6_ref_nc == null) {
                        break L15;
                      } else {
                        if (~var3 == ~var6_ref_nc.field_j) {
                          break L15;
                        } else {
                          var6_ref_nc = (nc) (Object) ok.field_b.f(2);
                          continue L14;
                        }
                      }
                    }
                    if (var6_ref_nc != null) {
                      var6_ref_nc.field_h = var4_long;
                      var6_ref_nc.b((byte) -118);
                      break L1;
                    } else {
                      ck.b((byte) -95);
                      return;
                    }
                  }
                } else {
                  uj.a("HS1: " + qj.h(-117), (Throwable) null, 1);
                  ck.b((byte) -70);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "hl.O(" + 0 + 41);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
            this.d(-33, -1);
        } else {
            this.e(71, -1);
        }
        this.h(-1, 16645);
        for (var3 = 0; var3 < 16; var3++) {
            ((hl) this).field_E[var3] = ((hl) this).field_G[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (16 > var5) {
            ((hl) this).field_t[var5] = vg.a(((hl) this).field_G[var5], -128);
            var5++;
        }
    }

    private final void d(int param0, int param1) {
        cb var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
        L0: while (true) {
          if (var3 == null) {
            var4 = -29 % ((param0 - 60) / 51);
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (var3.field_z == param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 > var3.field_h) {
                ((hl) this).field_R[var3.field_z][var3.field_q] = null;
                var3.field_h = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
            continue L0;
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
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
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
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
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
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
                var9 = (double)((param2.field_l * param2.field_v >> 12) + (-60 + param2.field_q << 8)) * 0.000005086263020833333;
                if (var7.field_e <= 0) {
                  break L6;
                } else {
                  L7: {
                    if (0 >= var7.field_b) {
                      param2.field_j = param2.field_j + 128;
                      break L7;
                    } else {
                      param2.field_j = param2.field_j + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                      break L7;
                    }
                  }
                  if (var7.field_e * param2.field_j >= 819200) {
                    var8 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L8: {
                if (null == var7.field_c) {
                  break L8;
                } else {
                  L9: {
                    if (0 >= var7.field_j) {
                      param2.field_F = param2.field_F + 128;
                      break L9;
                    } else {
                      param2.field_F = param2.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_j));
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (var7.field_c.length - 2 <= param2.field_B) {
                        break L11;
                      } else {
                        if (param2.field_F <= (var7.field_c[param2.field_B + 2] << 8 & 65280)) {
                          break L11;
                        } else {
                          param2.field_B = param2.field_B + 2;
                          continue L10;
                        }
                      }
                    }
                    if (~param2.field_B != ~(-2 + var7.field_c.length)) {
                      break L8;
                    } else {
                      if (0 != var7.field_c[param2.field_B + 1]) {
                        break L8;
                      } else {
                        var8 = 1;
                        break L8;
                      }
                    }
                  }
                }
              }
              L12: {
                if (param2.field_h < 0) {
                  break L12;
                } else {
                  if (var7.field_g == null) {
                    break L12;
                  } else {
                    if ((1 & ((hl) this).field_q[param2.field_z]) != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (param2.field_u < 0) {
                          break L13;
                        } else {
                          if (param2 == ((hl) this).field_L[param2.field_z][param2.field_u]) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (var7.field_l <= 0) {
                          param2.field_h = param2.field_h + 128;
                          break L14;
                        } else {
                          param2.field_h = param2.field_h + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                          break L14;
                        }
                      }
                      L15: while (true) {
                        L16: {
                          if (~(var7.field_g.length + -2) >= ~param2.field_y) {
                            break L16;
                          } else {
                            if ((var7.field_g[param2.field_y + 2] & 255) << 8 >= param2.field_h) {
                              break L16;
                            } else {
                              param2.field_y = param2.field_y + 2;
                              continue L15;
                            }
                          }
                        }
                        if (var7.field_g.length - 2 == param2.field_y) {
                          var8 = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                }
              }
              if (var8 == 0) {
                param2.field_C.a(param2.field_m, this.c(param2, 1554), this.a(param2, 87));
                stackOut_63_0 = 0;
                stackIn_64_0 = stackOut_63_0;
                break L0;
              } else {
                L17: {
                  param2.field_C.h(param2.field_m);
                  if (param0 == null) {
                    param2.field_C.a(param3);
                    break L17;
                  } else {
                    param2.field_C.b(param0, param1, param3);
                    break L17;
                  }
                }
                L18: {
                  if (param2.field_C.h()) {
                    ((hl) this).field_y.field_m.a((lk) (Object) param2.field_C);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  param2.c(0);
                  if (param2.field_h < 0) {
                    break L19;
                  } else {
                    param2.b((byte) -118);
                    if (param2.field_u <= 0) {
                      break L19;
                    } else {
                      if (((hl) this).field_L[param2.field_z][param2.field_u] != param2) {
                        break L19;
                      } else {
                        ((hl) this).field_L[param2.field_z][param2.field_u] = null;
                        break L19;
                      }
                    }
                  }
                }
                stackOut_61_0 = 1;
                stackIn_62_0 = stackOut_61_0;
                return stackIn_62_0 != 0;
              }
            } else {
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("hl.C(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param1).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_64_0 != 0;
    }

    private final int c(cb param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        rc var10 = null;
        rc var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
            if (((hl) this).field_w[param0.field_z] != 0) {
              L1: {
                var10 = param0.field_r;
                var11 = var10;
                var4 = 4096 + ((hl) this).field_J[param0.field_z] * ((hl) this).field_l[param0.field_z] >> 13;
                var4 = var4 * var4 + 16384 >> 15;
                var4 = var4 * param0.field_s - -16384 >> 15;
                var4 = ((hl) this).field_H * var4 + 128 >> 8;
                var4 = var4 * ((hl) this).field_w[param0.field_z] + 128 >> 8;
                if (var11.field_e > 0) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var11.field_e * (0.00001953125 * (double)param0.field_j)) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 1554) {
                  break L2;
                } else {
                  var9 = null;
                  boolean discarded$1 = ((hl) this).a(-54, (ih) null, (byte) -125, (ja) null, (sh) null);
                  break L2;
                }
              }
              L3: {
                if (var11.field_c == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_F;
                    var6 = var11.field_c[1 + param0.field_B];
                    if (-2 + var11.field_c.length > param0.field_B) {
                      var7 = var10.field_c[param0.field_B] << 8 & 65280;
                      var8 = (var11.field_c[2 + param0.field_B] & 255) << 8;
                      var6 = var6 + (-var7 + var5) * (-var6 + var11.field_c[3 + param0.field_B]) / (-var7 + var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 32 + var6 * var4 >> 6;
                  break L3;
                }
              }
              L5: {
                if (param0.field_h <= 0) {
                  break L5;
                } else {
                  if (var11.field_g == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_h;
                      var6 = var11.field_g[1 + param0.field_y];
                      if (~param0.field_y > ~(-2 + var11.field_g.length)) {
                        var7 = var10.field_g[param0.field_y] << 8 & 65280;
                        var8 = (255 & var11.field_g[2 + param0.field_y]) << 8;
                        var6 = var6 + (-var6 + var11.field_g[param0.field_y - -3]) * (var5 - var7) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 6;
                    break L5;
                  }
                }
              }
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
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
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("hl.AA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    private final void c(int param0, int param1) {
        cb var3 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -785046068) {
            return;
        }
        if (!(0 == (4 & ((hl) this).field_q[param1]))) {
            var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            while (var3 != null) {
                if (!(~var3.field_z != ~param1)) {
                    var3.field_E = 0;
                }
                var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
            }
        }
    }

    private final void a(int param0, int param1) {
        cb var3 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!((((hl) this).field_q[param0] & 2) == 0)) {
            var3 = (cb) (Object) ((hl) this).field_y.field_n.a(true);
            while (var3 != null) {
                if (var3.field_z == param0) {
                    if (((hl) this).field_R[param0][var3.field_q] == null) {
                        if (!(var3.field_h >= 0)) {
                            var3.field_h = 0;
                        }
                    }
                }
                var3 = (cb) (Object) ((hl) this).field_y.field_n.f(2);
            }
        }
    }

    final synchronized lk d() {
        return (lk) (Object) ((hl) this).field_y;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((hl) this).field_n.d()) {
                break L1;
              } else {
                var4_int = ((hl) this).field_n.field_e * ((hl) this).field_K / b.field_r;
                L2: while (true) {
                  var5 = ((hl) this).field_P - -((long)param2 * (long)var4_int);
                  if (((hl) this).field_U - var5 < 0L) {
                    var7 = (int)((((hl) this).field_U + -((hl) this).field_P - (-(long)var4_int - -1L)) / (long)var4_int);
                    ((hl) this).field_P = ((hl) this).field_P + (long)var4_int * (long)var7;
                    ((hl) this).field_y.b(param0, param1, var7);
                    param1 = param1 + var7;
                    this.b(-11);
                    param2 = param2 - var7;
                    if (!((hl) this).field_n.d()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  } else {
                    ((hl) this).field_P = var5;
                    break L1;
                  }
                }
              }
            }
            ((hl) this).field_y.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("hl.I(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void a(int param0, boolean param1, ih param2) {
        try {
            this.a(param2, param1, true, -5953);
            if (param0 < 26) {
                ((hl) this).a(-128, false, -53);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.JA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
            if (((hl) this).field_n.d()) {
              var2 = ((hl) this).field_n.field_e * ((hl) this).field_K / b.field_r;
              L2: while (true) {
                var3 = ((hl) this).field_P + (long)param0 * (long)var2;
                if (((hl) this).field_U + -var3 >= 0L) {
                  ((hl) this).field_P = var3;
                  break L1;
                } else {
                  var5 = (int)((-1L + ((hl) this).field_U - (((hl) this).field_P - (long)var2)) / (long)var2);
                  ((hl) this).field_P = ((hl) this).field_P + (long)var2 * (long)var5;
                  ((hl) this).field_y.a(var5);
                  param0 = param0 - var5;
                  this.b(-11);
                  if (((hl) this).field_n.d()) {
                    continue L2;
                  } else {
                    ((hl) this).field_y.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((hl) this).field_y.a(param0);
          break L0;
        }
    }

    private final void h(int param0, int param1) {
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            ((hl) this).field_J[param0] = 12800;
            ((hl) this).field_C[param0] = 8192;
            ((hl) this).field_l[param0] = 16383;
            ((hl) this).field_T[param0] = 8192;
            ((hl) this).field_x[param0] = 0;
            ((hl) this).field_S[param0] = 8192;
            this.a(param0, 16384);
            if (param1 == 16645) {
              break L0;
            } else {
              ((hl) this).field_L = null;
              break L0;
            }
          }
          this.c(param1 + -785062713, param0);
          ((hl) this).field_q[param0] = 0;
          ((hl) this).field_v[param0] = 32767;
          ((hl) this).field_r[param0] = 256;
          ((hl) this).field_u[param0] = 0;
          this.a(false, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.h(param0, param1);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        ((hl) this).field_T[param2] = param0;
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
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        cb stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cb stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cb stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        cb stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        cb stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cb stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        L0: {
          var9 = Lexicominos.field_L ? 1 : 0;
          this.a(64, param3, param0, 0);
          if ((((hl) this).field_q[param0] & 2) == 0) {
            break L0;
          } else {
            var5 = (cb) (Object) ((hl) this).field_y.field_n.c(2);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_z != param0) {
                    break L2;
                  } else {
                    if (var5.field_h >= 0) {
                      break L2;
                    } else {
                      ((hl) this).field_R[param0][var5.field_q] = null;
                      ((hl) this).field_R[param0][param3] = var5;
                      var6_int = var5.field_o + (var5.field_l * var5.field_v >> 12);
                      var5.field_o = var5.field_o + (param3 - var5.field_q << 8);
                      var5.field_q = param3;
                      var5.field_v = 4096;
                      var5.field_l = var6_int + -var5.field_o;
                      return;
                    }
                  }
                }
                var5 = (cb) (Object) ((hl) this).field_y.field_n.d(0);
                continue L1;
              }
            }
          }
        }
        var10 = (wj) (Object) ((hl) this).field_A.a((long)((hl) this).field_E[param0], (byte) 118);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_l[param3];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new cb();
              var7.field_w = var6;
              var7.field_z = param0;
              var7.field_p = var10;
              var7.field_r = var10.field_h[param3];
              var7.field_u = var10.field_r[param3];
              var7.field_q = param3;
              var7.field_s = 1024 + var10.field_n[param3] * var11.field_m * (param1 * param1) >> 11;
              var7.field_k = var10.field_q[param3] & 255;
              var7.field_o = (param3 << 8) + -(32767 & var10.field_k[param3]);
              var7.field_j = 0;
              var7.field_h = -1;
              var7.field_y = 0;
              var7.field_F = 0;
              var7.field_B = 0;
              if (0 == ((hl) this).field_u[param0]) {
                var7.field_C = cc.a(var6, this.a((byte) -112, var7), this.c(var7, 1554), this.a(var7, -67));
                break L3;
              } else {
                L4: {
                  var7.field_C = cc.a(var6, this.a((byte) -121, var7), 0, this.a(var7, 74));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 92;
                  stackOut_14_2 = (cb) var7;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (0 <= var10.field_k[param3]) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (cb) (Object) stackIn_16_2;
                    stackOut_16_3 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = (cb) (Object) stackIn_15_2;
                    stackOut_15_3 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    break L4;
                  }
                }
                ((hl) this).a((byte) stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0);
                break L3;
              }
            }
            L5: {
              if (0 <= var10.field_k[param3]) {
                break L5;
              } else {
                var7.field_C.e(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_u < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((hl) this).field_L[param0][var7.field_u];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (0 <= var8.field_h) {
                      break L7;
                    } else {
                      ((hl) this).field_R[param0][var8.field_q] = null;
                      var8.field_h = 0;
                      break L7;
                    }
                  }
                }
                ((hl) this).field_L[param0][var7.field_u] = var7;
                break L6;
              }
            }
            ((hl) this).field_y.field_n.b(115, (kd) (Object) var7);
            ((hl) this).field_R[param0][param3] = var7;
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        if (param2 != ((hl) this).field_E[param0]) {
            ((hl) this).field_E[param0] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                ((hl) this).field_L[param0][var4] = null;
            }
        }
    }

    final synchronized void c(int param0) {
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 > -73) {
            return;
        }
        wj var4 = (wj) (Object) ((hl) this).field_A.c((byte) -95);
        while (var4 != null) {
            var4.a(-122);
            var4 = (wj) (Object) ((hl) this).field_A.a((byte) -91);
        }
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        this.a(param0, (byte) 90, param2);
        if (!param1) {
            Object var5 = null;
            int discarded$0 = this.c((cb) null, -91);
        }
    }

    private final int a(byte param0, cb param1) {
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
              var3_int = (param1.field_v * param1.field_l >> 12) + param1.field_o;
              var3_int = var3_int + (((hl) this).field_r[param1.field_z] * (-8192 + ((hl) this).field_T[param1.field_z]) >> 12);
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
                  var5 = var4.field_k << 2;
                  var6 = var4.field_h << 1;
                  if (~var6 >= ~param1.field_x) {
                    break L4;
                  } else {
                    var5 = param1.field_x * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (((hl) this).field_x[param1.field_z] >> 7);
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
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("hl.Q(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Lexicominos.field_L ? 1 : 0;
          var2 = ((hl) this).field_z;
          var3 = ((hl) this).field_m;
          var4 = ((hl) this).field_U;
          if (null == ((hl) this).field_s) {
            break L0;
          } else {
            if (((hl) this).field_Q == var3) {
              this.a(((hl) this).field_s, ((hl) this).field_D, ((hl) this).field_I, param0 ^ 5962);
              this.b(param0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (~var3 != ~((hl) this).field_m) {
            L2: {
              ((hl) this).field_z = var2;
              ((hl) this).field_U = var4;
              ((hl) this).field_m = var3;
              if (param0 == -11) {
                break L2;
              } else {
                ((hl) this).field_m = -105;
                break L2;
              }
            }
            L3: {
              if (((hl) this).field_s == null) {
                break L3;
              } else {
                if (var3 <= ((hl) this).field_Q) {
                  break L3;
                } else {
                  ((hl) this).field_z = -1;
                  ((hl) this).field_m = ((hl) this).field_Q;
                  ((hl) this).field_U = ((hl) this).field_n.d(((hl) this).field_m);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((hl) this).field_n.field_a[var2]) {
                  break L5;
                } else {
                  ((hl) this).field_n.c(var2);
                  var6 = ((hl) this).field_n.f(var2);
                  if (var6 == 1) {
                    ((hl) this).field_n.f();
                    ((hl) this).field_n.b(var2);
                    if (!((hl) this).field_n.c()) {
                      break L5;
                    } else {
                      if (((hl) this).field_s == null) {
                        L6: {
                          if (!((hl) this).field_D) {
                            break L6;
                          } else {
                            if (0 == var3) {
                              break L6;
                            } else {
                              ((hl) this).field_n.a(var4);
                              break L5;
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
                    L7: {
                      if (0 != (128 & var6)) {
                        this.g(param0 + -112, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((hl) this).field_n.a(var2);
                    ((hl) this).field_n.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((hl) this).field_n.a();
              var3 = ((hl) this).field_n.field_a[var2];
              var4 = ((hl) this).field_n.d(var3);
              continue L1;
            }
          }
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
        ((hl) this).field_A = new na(128);
        ((hl) this).a(-1, 256, false);
        this.a(true, (byte) -87);
    }

    hl(hl param0) {
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
            ((hl) this).field_A = param0.field_A;
            ((hl) this).a(-1, 256, false);
            this.a(true, (byte) -87);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "hl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Try again";
    }
}
