/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends sh {
    static String field_N;
    private tk[][] field_D;
    private fd field_G;
    int[] field_q;
    private int[] field_L;
    private int[] field_y;
    private int field_W;
    static char[] field_m;
    private int[] field_I;
    private int[] field_x;
    static boolean[] field_H;
    private int[] field_R;
    private int[] field_K;
    int[] field_p;
    private int[] field_T;
    private tk[][] field_A;
    private hc field_S;
    static int field_M;
    private int[] field_o;
    private int[] field_z;
    int[] field_n;
    static String field_v;
    static int field_V;
    private int[] field_t;
    private int[] field_r;
    private int[] field_P;
    private int[] field_J;
    private int field_w;
    private gl field_O;
    private boolean field_B;
    private int field_U;
    private long field_C;
    private int field_u;
    private long field_E;
    private wk field_Q;
    private int field_F;
    private boolean field_s;

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = fleas.field_A ? 1 : 0;
          if (((ei) this).field_G.c()) {
            var2 = ((ei) this).field_w * ((ei) this).field_G.field_a / la.field_a;
            L1: while (true) {
              L2: {
                var3 = (long)var2 * (long)param0 + ((ei) this).field_C;
                if (((ei) this).field_E - var3 >= 0L) {
                  ((ei) this).field_C = var3;
                  break L2;
                } else {
                  var5 = (int)((-1L + ((long)var2 + ((ei) this).field_E - ((ei) this).field_C)) / (long)var2);
                  ((ei) this).field_C = ((ei) this).field_C + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((ei) this).field_O.a(var5);
                  this.g(1);
                  if (!((ei) this).field_G.c()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((ei) this).field_O.a(param0);
              break L0;
            }
          } else {
            ((ei) this).field_O.a(param0);
            break L0;
          }
        }
    }

    private final int b(int param0, tk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param0 == 32) {
                break L1;
              } else {
                var4 = null;
                ((ei) this).b((int[]) null, -128, 50);
                break L1;
              }
            }
            var3_int = ((ei) this).field_t[param1.field_o];
            if (var3_int < 8192) {
              stackOut_5_0 = 32 + var3_int * param1.field_l >> 6;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 16384 - (32 + (16384 - var3_int) * (128 + -param1.field_l) >> 6);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ei.E(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final synchronized void b(int param0, int param1) {
        int var3 = 23 / ((-52 - param0) / 32);
        ((ei) this).field_W = param1;
    }

    final synchronized void e(int param0) {
        this.a(param0 + 487, true);
        if (param0 != -398) {
            ((ei) this).field_u = -75;
        }
    }

    final synchronized sh c() {
        return null;
    }

    final synchronized boolean d(int param0) {
        if (param0 != 31499) {
            Object var3 = null;
            ((ei) this).b((int[]) null, -50, -87);
        }
        return ((ei) this).field_G.c();
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = 78 / ((param0 - -2) / 63);
            var5 = param1.length();
            var6 = 0;
            L1: while (true) {
              if (var5 <= var6) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (param1.charAt(var6) != param2) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ei.OA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final void a(int param0, tk param1, boolean param2) {
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
              var4_int = param1.field_z.field_l.length;
              if (param0 == -32730) {
                break L1;
              } else {
                this.a(8, -23, -13, true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2) {
                  break L3;
                } else {
                  if (param1.field_z.field_n) {
                    var6 = -param1.field_z.field_m + var4_int + var4_int;
                    var4_int = var4_int << 8;
                    var5 = (int)((long)var6 * (long)((ei) this).field_n[param1.field_o] >> 6);
                    if (var5 < var4_int) {
                      break L2;
                    } else {
                      var5 = var4_int + (var4_int - (1 + var5));
                      param1.field_k.b(true);
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((ei) this).field_n[param1.field_o] >> 6);
              break L2;
            }
            param1.field_k.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ei.T(").append(param0).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -16257) {
            ((ei) this).field_R = null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != -24344) {
            return;
        }
        ((ei) this).field_y[param2] = param0;
        ((ei) this).field_p[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param0 * 0.00054931640625));
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param2 != 238) {
            field_H = null;
        }
        this.a(param0, (byte) -119, param1);
    }

    final synchronized sh d() {
        return (sh) (Object) ((ei) this).field_O;
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var3 = param1 & 240;
        if (var3 != 128) {
          L0: {
            if (144 == var3) {
              var4 = 15 & param1;
              var5 = (32699 & param1) >> 8;
              var6 = (8387488 & param1) >> 16;
              if (var6 <= 0) {
                this.b(param0, var5, 64, var4);
                return;
              } else {
                this.a(var5, var4, var6, false);
                break L0;
              }
            } else {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = (param1 & 32647) >> 8;
                var6 = param1 >> 16 & 127;
                this.a(-16257, var4, var5, var6);
                return;
              } else {
                if (var3 != 176) {
                  if (var3 != 192) {
                    if (param0 == -128) {
                      if (var3 == 208) {
                        var4 = 15 & param1;
                        var5 = (32598 & param1) >> 8;
                        this.a(param0 ^ -16512, var5, var4);
                        return;
                      } else {
                        if (224 != var3) {
                          var3 = 255 & param1;
                          if (var3 == 255) {
                            this.b(-1, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          var4 = param1 & 15;
                          var5 = (param1 >> 8 & 127) + (16256 & param1 >> 9);
                          this.c(var5, var4, 128);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var4 = param1 & 15;
                    var5 = param1 >> 8 & 127;
                    this.e(-126, ((ei) this).field_L[var4] - -var5, var4);
                    return;
                  }
                } else {
                  L1: {
                    var4 = 15 & param1;
                    var5 = (32617 & param1) >> 8;
                    var6 = 127 & param1 >> 16;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((ei) this).field_L[var4] = (var6 << 14) + sc.a(-2080769, ((ei) this).field_L[var4]);
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 == 32) {
                      ((ei) this).field_L[var4] = sc.a(-16257, ((ei) this).field_L[var4]) - -(var6 << 7);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 == 1) {
                      ((ei) this).field_x[var4] = (var6 << 7) + sc.a(-16257, ((ei) this).field_x[var4]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (33 == var5) {
                      ((ei) this).field_x[var4] = sc.a(-128, ((ei) this).field_x[var4]) + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 5) {
                      ((ei) this).field_z[var4] = (var6 << 7) + sc.a(((ei) this).field_z[var4], -16257);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 37) {
                      ((ei) this).field_z[var4] = var6 + sc.a(-128, ((ei) this).field_z[var4]);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 7) {
                      ((ei) this).field_o[var4] = sc.a(-16257, ((ei) this).field_o[var4]) - -(var6 << 7);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (39 == var5) {
                      ((ei) this).field_o[var4] = sc.a(((ei) this).field_o[var4], -128) - -var6;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (10 != var5) {
                      break L9;
                    } else {
                      ((ei) this).field_t[var4] = (var6 << 7) + sc.a(-16257, ((ei) this).field_t[var4]);
                      break L9;
                    }
                  }
                  L10: {
                    if (42 != var5) {
                      break L10;
                    } else {
                      ((ei) this).field_t[var4] = sc.a(((ei) this).field_t[var4], -128) + var6;
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((ei) this).field_J[var4] = sc.a(-16257, ((ei) this).field_J[var4]) + (var6 << 7);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((ei) this).field_J[var4] = var6 + sc.a(((ei) this).field_J[var4], -128);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 != 64) {
                      break L13;
                    } else {
                      if (var6 >= 64) {
                        ((ei) this).field_q[var4] = ne.a(((ei) this).field_q[var4], 1);
                        break L13;
                      } else {
                        ((ei) this).field_q[var4] = sc.a(((ei) this).field_q[var4], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 == 65) {
                      if (var6 >= 64) {
                        ((ei) this).field_q[var4] = ne.a(((ei) this).field_q[var4], 2);
                        break L14;
                      } else {
                        this.d(var4, param0 ^ -31961);
                        ((ei) this).field_q[var4] = sc.a(((ei) this).field_q[var4], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 == 99) {
                      ((ei) this).field_K[var4] = sc.a(((ei) this).field_K[var4], 127) - -(var6 << 7);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 != 98) {
                      break L16;
                    } else {
                      ((ei) this).field_K[var4] = var6 + sc.a(16256, ((ei) this).field_K[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 101) {
                      ((ei) this).field_K[var4] = (var6 << 7) + sc.a(127, ((ei) this).field_K[var4]) + 16384;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 100) {
                      break L18;
                    } else {
                      ((ei) this).field_K[var4] = sc.a(((ei) this).field_K[var4], 16256) + (16384 - -var6);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 120) {
                      this.a(var4, (byte) -52);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 121) {
                      break L20;
                    } else {
                      this.e(var4, 15198);
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 123) {
                      this.a(param0 ^ 29, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 6) {
                      break L22;
                    } else {
                      var7 = ((ei) this).field_K[var4];
                      if (16384 != var7) {
                        break L22;
                      } else {
                        ((ei) this).field_R[var4] = sc.a(((ei) this).field_R[var4], -16257) - -(var6 << 7);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = ((ei) this).field_K[var4];
                      if (var7 == 16384) {
                        ((ei) this).field_R[var4] = var6 + sc.a(((ei) this).field_R[var4], -128);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (var5 == 16) {
                      ((ei) this).field_n[var4] = sc.a(-16257, ((ei) this).field_n[var4]) - -(var6 << 7);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 != 48) {
                      break L25;
                    } else {
                      ((ei) this).field_n[var4] = var6 + sc.a(((ei) this).field_n[var4], -128);
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 81) {
                      break L26;
                    } else {
                      if (var6 < 64) {
                        this.c(var4, -20403);
                        ((ei) this).field_q[var4] = sc.a(((ei) this).field_q[var4], -5);
                        break L26;
                      } else {
                        ((ei) this).field_q[var4] = ne.a(((ei) this).field_q[var4], 4);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 != 17) {
                      break L27;
                    } else {
                      this.d((((ei) this).field_y[var4] & -16257) + (var6 << 7), -24344, var4);
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.d(var6 + (((ei) this).field_y[var4] & -128), -24344, var4);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = param1 & 15;
          var5 = 127 & param1 >> 8;
          var6 = 127 & param1 >> 16;
          this.b(param0 + 36, var5, var6, var4);
          return;
        }
    }

    final static void b(boolean param0) {
        v.field_R = new String[]{fj.field_a, pb.field_h, tb.field_b, mh.field_v, na.field_b, ec.field_d, vj.field_a};
        kb.field_k = new String[][]{new String[3], new String[8], new String[7], new String[8], new String[7], new String[3], new String[4]};
        String var21 = db.a(jk.field_o, new String[2], true);
        String var1 = var21;
        String var2 = db.a(ak.field_g, new String[2], true);
        String var3 = db.a(qa.field_o, new String[2], true);
        String var4 = db.a(ta.field_s, new String[2], true);
        String var5 = db.a(wh.field_c, new String[2], true);
        String var6 = db.a(jk.field_q, new String[2], true);
        String var7 = db.a(ga.field_r, new String[2], param0);
        String var8 = db.a(wj.field_a, new String[2], true);
        String var9 = db.a(of.field_g, new String[2], true);
        String var10 = db.a(ca.field_O, new String[2], true);
        String var11 = db.a(fh.field_f, new String[2], true);
        String var12 = db.a(hd.field_d, new String[2], true);
        String var13 = db.a(qj.field_F, new String[2], true);
        String var14 = db.a(ti.field_b, new String[2], param0);
        String var15 = db.a(wa.field_p, new String[2], true);
        String var16 = db.a(gf.field_a, new String[2], true);
        String var17 = db.a(gg.field_d, new String[2], param0);
        String var18 = db.a(fi.field_k, new String[2], true);
        String var19 = db.a(ld.field_b, new String[2], true);
        String var20 = db.a(si.field_H, new String[2], true);
        pa.field_i = new String[23];
        qg.field_d = new String[]{"", var21, var2, var3, var3, var4, var20, var2, var5, var5, var10, var4, var6, var6, var7, var8, var9, var11, var12, var13, var14, var15, var16, var17, var18, var19, var16, var6, var7, var9, var8, var11, var6, var20};
        pa.field_i[21] = ib.field_e;
        pa.field_i[6] = hg.field_l;
        pa.field_i[5] = hg.field_l;
        pa.field_i[11] = bk.field_c;
        pa.field_i[13] = hd.field_e;
        pa.field_i[2] = uh.field_t;
        pa.field_i[12] = pj.field_z;
        pa.field_i[3] = ji.field_b;
        pa.field_i[16] = pj.field_y;
        pa.field_i[1] = uj.field_f;
        pa.field_i[15] = qh.field_C;
        pa.field_i[0] = ec.field_a;
        pa.field_i[14] = pc.field_d;
        pa.field_i[4] = mk.field_c;
        pa.field_i[7] = a.field_c;
        pa.field_i[20] = hg.field_o;
        pa.field_i[17] = rh.field_b;
        pa.field_i[18] = bb.field_I;
        pa.field_i[9] = q.field_b[1];
        pa.field_i[19] = kf.field_l;
        pa.field_i[8] = q.field_b[0];
        pa.field_i[22] = r.field_k;
        pa.field_i[10] = q.field_b[2];
    }

    final boolean a(int param0, int param1, int param2, tk param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        de var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_12_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -30686) {
                break L1;
              } else {
                ((ei) this).field_K = null;
                break L1;
              }
            }
            L2: {
              param3.field_u = la.field_a / 100;
              if (param3.field_q < 0) {
                break L2;
              } else {
                L3: {
                  if (param3.field_k == null) {
                    break L3;
                  } else {
                    if (param3.field_k.e()) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  param3.d(param2 + 30809);
                  param3.c(-1);
                  if (param3.field_B <= 0) {
                    break L4;
                  } else {
                    if (param3 == ((ei) this).field_A[param3.field_o][param3.field_B]) {
                      ((ei) this).field_A[param3.field_o][param3.field_B] = null;
                      break L4;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
            L5: {
              var6_int = param3.field_r;
              if (0 < var6_int) {
                L6: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((ei) this).field_z[param3.field_o]) * 16.0 + 0.5);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                param3.field_r = var6_int;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              param3.field_k.d(this.a(param2 ^ 18525, param3));
              var7 = param3.field_i;
              var8 = 0;
              param3.field_p = param3.field_p + var7.field_g;
              param3.field_A = param3.field_A + 1;
              var9 = (double)((-60 + param3.field_F << 8) + (param3.field_C * param3.field_r >> 12)) * 0.000005086263020833333;
              if (var7.field_c > 0) {
                L8: {
                  if (var7.field_e <= 0) {
                    param3.field_v = param3.field_v + 128;
                    break L8;
                  } else {
                    param3.field_v = param3.field_v + (int)(Math.pow(2.0, (double)var7.field_e * var9) * 128.0 + 0.5);
                    break L8;
                  }
                }
                if (var7.field_c * param3.field_v >= 819200) {
                  var8 = 1;
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L9: {
              if (var7.field_p == null) {
                break L9;
              } else {
                L10: {
                  if (0 < var7.field_d) {
                    param3.field_t = param3.field_t + (int)(Math.pow(2.0, var9 * (double)var7.field_d) * 128.0 + 0.5);
                    break L10;
                  } else {
                    param3.field_t = param3.field_t + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (param3.field_w >= -2 + var7.field_p.length) {
                      break L12;
                    } else {
                      if (param3.field_t <= (255 & var7.field_p[param3.field_w + 2]) << 8) {
                        break L12;
                      } else {
                        param3.field_w = param3.field_w + 2;
                        continue L11;
                      }
                    }
                  }
                  if (param3.field_w != var7.field_p.length - 2) {
                    break L9;
                  } else {
                    if (var7.field_p[param3.field_w - -1] == -1) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L13: {
              if (-1 > param3.field_q) {
                break L13;
              } else {
                if (var7.field_i == null) {
                  break L13;
                } else {
                  if (-1 == (1 & ((ei) this).field_q[param3.field_o])) {
                    L14: {
                      if (-1 > param3.field_B) {
                        break L14;
                      } else {
                        if (param3 == ((ei) this).field_A[param3.field_o][param3.field_B]) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (0 >= var7.field_l) {
                        param3.field_q = param3.field_q + 128;
                        break L15;
                      } else {
                        param3.field_q = param3.field_q + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param3.field_n >= var7.field_i.length + -2) {
                          break L17;
                        } else {
                          if (param3.field_q <= (var7.field_i[param3.field_n - -2] & 255) << 8) {
                            break L17;
                          } else {
                            param3.field_n = param3.field_n + 2;
                            continue L16;
                          }
                        }
                      }
                      if (var7.field_i.length - 2 != param3.field_n) {
                        break L13;
                      } else {
                        var8 = 1;
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param3.field_k.f(param3.field_u);
                if (param4 != null) {
                  param3.field_k.b(param4, param1, param0);
                  break L18;
                } else {
                  param3.field_k.a(param0);
                  break L18;
                }
              }
              L19: {
                if (!param3.field_k.i()) {
                  break L19;
                } else {
                  ((ei) this).field_O.field_o.a((sh) (Object) param3.field_k);
                  break L19;
                }
              }
              L20: {
                param3.d(114);
                if (0 > param3.field_q) {
                  break L20;
                } else {
                  param3.c(-1);
                  if (0 >= param3.field_B) {
                    break L20;
                  } else {
                    if (param3 != ((ei) this).field_A[param3.field_o][param3.field_B]) {
                      break L20;
                    } else {
                      ((ei) this).field_A[param3.field_o][param3.field_B] = null;
                      break L20;
                    }
                  }
                }
              }
              stackOut_64_0 = 1;
              stackIn_65_0 = stackOut_64_0;
              return stackIn_65_0 != 0;
            } else {
              param3.field_k.a(param3.field_u, this.a((byte) 65, param3), this.b(32, param3));
              stackOut_66_0 = 0;
              stackIn_67_0 = stackOut_66_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("ei.PA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
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
          L22: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L22;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L22;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
        return stackIn_67_0 != 0;
    }

    final boolean a(tk param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
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
            if (null == param0.field_k) {
              L1: {
                if (param0.field_q < 0) {
                  break L1;
                } else {
                  param0.c(-1);
                  if (param0.field_B <= 0) {
                    break L1;
                  } else {
                    if (param0 != ((ei) this).field_A[param0.field_o][param0.field_B]) {
                      break L1;
                    } else {
                      ((ei) this).field_A[param0.field_o][param0.field_B] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              if (param1 == -1) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ei.IA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param2 >= 0) {
            ((ei) this).field_P[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((ei) this).field_P[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            var6 = null;
            int discarded$1 = this.b(19, (tk) null);
            break L2;
          }
        }
    }

    private final int a(byte param0, tk param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        de var9 = null;
        de var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_19_0 = 0;
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
            if (((ei) this).field_P[param1.field_o] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param1.field_i;
                var10 = var9;
                var4 = ((ei) this).field_J[param1.field_o] * ((ei) this).field_o[param1.field_o] + 4096 >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = var4 * param1.field_j + 16384 >> 15;
                var4 = 128 + ((ei) this).field_W * var4 >> 8;
                var4 = 128 + var4 * ((ei) this).field_P[param1.field_o] >> 8;
                if (0 < var10.field_c) {
                  var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var10.field_c) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_p) {
                  break L2;
                } else {
                  L3: {
                    var5 = param1.field_t;
                    var6 = var10.field_p[param1.field_w - -1];
                    if (var10.field_p.length + -2 <= param1.field_w) {
                      break L3;
                    } else {
                      var7 = (var9.field_p[param1.field_w] & 255) << 8;
                      var8 = var10.field_p[2 + param1.field_w] << 8 & 65280;
                      var6 = var6 + (-var6 + var10.field_p[param1.field_w + 3]) * (var5 - var7) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (param0 >= 7) {
                  break L4;
                } else {
                  ((ei) this).field_u = -64;
                  break L4;
                }
              }
              L5: {
                if (param1.field_q <= 0) {
                  break L5;
                } else {
                  if (null == var10.field_i) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param1.field_q;
                      var6 = var10.field_i[1 + param1.field_n];
                      if (param1.field_n < -2 + var10.field_i.length) {
                        var7 = (var9.field_i[param1.field_n] & 255) << 8;
                        var8 = 65280 & var10.field_i[param1.field_n - -2] << 8;
                        var6 = var6 + (-var7 + var5) * (-var6 + var10.field_i[3 + param1.field_n]) / (var8 + -var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = 32 + var6 * var4 >> 6;
                    break L5;
                  }
                }
              }
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("ei.AA(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final synchronized void a(boolean param0, int param1, wk param2) {
        try {
            if (param1 < 53) {
                ((ei) this).field_F = -83;
            }
            this.a((byte) 102, true, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ei.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        tk var5 = null;
        sf var6 = null;
        int var6_int = 0;
        tk var7 = null;
        tk var8 = null;
        int var9 = 0;
        wc var10 = null;
        wc var11 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        tk stackIn_14_2 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        tk stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        tk stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        tk stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        tk stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        tk stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          var9 = fleas.field_A ? 1 : 0;
          this.b(-106, param0, 64, param1);
          if ((2 & ((ei) this).field_q[param1]) == 0) {
            break L0;
          } else {
            var5 = (tk) (Object) ((ei) this).field_O.field_n.b(-61);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_o != param1) {
                    break L2;
                  } else {
                    if (var5.field_q < 0) {
                      ((ei) this).field_D[param1][var5.field_F] = null;
                      ((ei) this).field_D[param1][param0] = var5;
                      var6_int = var5.field_E - -(var5.field_C * var5.field_r >> 12);
                      var5.field_E = var5.field_E + (param0 - var5.field_F << 8);
                      var5.field_C = var6_int - var5.field_E;
                      var5.field_r = 4096;
                      var5.field_F = param0;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (tk) (Object) ((ei) this).field_O.field_n.c(6);
                continue L1;
              }
            }
          }
        }
        var10 = (wc) (Object) ((ei) this).field_S.a((long)((ei) this).field_T[param1], -1110);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_m[param0];
          if (var6 != null) {
            L3: {
              var7 = new tk();
              var7.field_o = param1;
              var7.field_z = var6;
              var7.field_D = var10;
              var7.field_i = var10.field_j[param0];
              var7.field_B = var10.field_n[param0];
              var7.field_F = param0;
              var7.field_j = 1024 + var10.field_o[param0] * (param2 * (param2 * var11.field_k)) >> 11;
              var7.field_l = 255 & var10.field_r[param0];
              var7.field_E = -(var10.field_l[param0] & 32767) + (param0 << 8);
              var7.field_q = -1;
              var7.field_w = 0;
              var7.field_v = 0;
              var7.field_t = 0;
              var7.field_n = 0;
              if (((ei) this).field_n[param1] == 0) {
                var7.field_k = ie.a(var6, this.a(-16257, var7), this.a((byte) 97, var7), this.b(32, var7));
                break L3;
              } else {
                L4: {
                  var7.field_k = ie.a(var6, this.a(-16257, var7), 0, this.b(32, var7));
                  stackOut_13_0 = this;
                  stackOut_13_1 = -32730;
                  stackOut_13_2 = (tk) var7;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  if (0 <= var10.field_l[param0]) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = (tk) (Object) stackIn_15_2;
                    stackOut_15_3 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = (tk) (Object) stackIn_14_2;
                    stackOut_14_3 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    break L4;
                  }
                }
                ((ei) this).a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0);
                break L3;
              }
            }
            L5: {
              if (0 > var10.field_l[param0]) {
                var7.field_k.g(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_B < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((ei) this).field_A[param1][var7.field_B];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_q >= 0) {
                      break L7;
                    } else {
                      ((ei) this).field_D[param1][var8.field_F] = null;
                      var8.field_q = 0;
                      break L7;
                    }
                  }
                }
                ((ei) this).field_A[param1][var7.field_B] = var7;
                break L6;
              }
            }
            ((ei) this).field_O.field_n.a(param3, (lh) (Object) var7);
            ((ei) this).field_D[param1][param0] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        tk var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var3 = (tk) (Object) ((ei) this).field_O.field_n.c((byte) 47);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 <= -87) {
                break L1;
              } else {
                ((ei) this).b(100, -119);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (var3.field_o != param1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (0 <= var3.field_q) {
                break L2;
              } else {
                ((ei) this).field_D[var3.field_o][var3.field_F] = null;
                var3.field_q = 0;
                break L2;
              }
            }
            var3 = (tk) (Object) ((ei) this).field_O.field_n.b((byte) -105);
            continue L0;
          }
        }
    }

    final synchronized boolean a(ng param0, rh param1, int param2, int param3, wk param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        oj var8 = null;
        int var9 = 0;
        int var11 = 0;
        wc var12 = null;
        wc var13 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.a();
              var6_int = 1;
              if (param2 == 11498) {
                break L1;
              } else {
                this.c(-17, -22, -33);
                break L1;
              }
            }
            L2: {
              var7 = null;
              if (param3 <= 0) {
                break L2;
              } else {
                var7 = (Object) (Object) new int[]{param3};
                break L2;
              }
            }
            var8 = (oj) (Object) param4.field_j.a(true);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int != 0) {
                    param4.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_18_0 = var6_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_c;
                  var12 = (wc) (Object) ((ei) this).field_S.a((long)var9, -1110);
                  if (var12 == null) {
                    var13 = ub.a(var9, (byte) -95, param1);
                    if (var13 != null) {
                      ((ei) this).field_S.a((lh) (Object) var13, true, (long)var9);
                      if (var13.a(param0, var8.field_l, false, (int[]) var7)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    } else {
                      var6_int = 0;
                      break L5;
                    }
                  } else {
                    if (var12.a(param0, var8.field_l, false, (int[]) var7)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      var8 = (oj) (Object) param4.field_j.b((byte) 107);
                      continue L3;
                    }
                  }
                }
                var8 = (oj) (Object) param4.field_j.b((byte) 107);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ei.JA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_19_0 != 0;
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        if (param1) {
            this.a(-1, (byte) -104);
        } else {
            this.a(-109, -1);
        }
        this.e(param0, 15198);
        for (var3 = 0; var3 < 16; var3++) {
            ((ei) this).field_T[var3] = ((ei) this).field_I[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((ei) this).field_L[var5] = sc.a(((ei) this).field_I[var5], -128);
            var5++;
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        ((ei) this).field_G.f();
        if (param0 < 31) {
            ei.b(false);
        }
        ((ei) this).field_Q = null;
        this.b(-1, param1);
    }

    public static void f(int param0) {
        field_H = null;
        field_N = null;
        field_v = null;
        field_m = null;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((ei) this).field_G.c()) {
                break L1;
              } else {
                var4_int = ((ei) this).field_G.field_a * ((ei) this).field_w / la.field_a;
                L2: while (true) {
                  var5 = (long)var4_int * (long)param2 + ((ei) this).field_C;
                  if (-var5 + ((ei) this).field_E >= 0L) {
                    ((ei) this).field_C = var5;
                    break L1;
                  } else {
                    var7 = (int)((-1L + -((ei) this).field_C + (((ei) this).field_E + (long)var4_int)) / (long)var4_int);
                    ((ei) this).field_C = ((ei) this).field_C + (long)var4_int * (long)var7;
                    ((ei) this).field_O.b(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.g(1);
                    if (!((ei) this).field_G.c()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            ((ei) this).field_O.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ei.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void a(byte param0, int param1) {
        ((ei) this).field_w = param1;
        int var3 = 115 % ((61 - param0) / 35);
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = fleas.field_A ? 1 : 0;
          var2 = ((ei) this).field_u;
          var3 = ((ei) this).field_U;
          var4 = ((ei) this).field_E;
          if (((ei) this).field_Q == null) {
            break L0;
          } else {
            if (var3 != ((ei) this).field_F) {
              break L0;
            } else {
              this.a((byte) 83, ((ei) this).field_s, ((ei) this).field_B, ((ei) this).field_Q);
              this.g(1);
              return;
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            this.b(-26, 121, -49, -100);
            break L1;
          }
        }
        L2: while (true) {
          if (var3 != ((ei) this).field_U) {
            L3: {
              ((ei) this).field_E = var4;
              ((ei) this).field_u = var2;
              ((ei) this).field_U = var3;
              if (((ei) this).field_Q == null) {
                break L3;
              } else {
                if (((ei) this).field_F < var3) {
                  ((ei) this).field_U = ((ei) this).field_F;
                  ((ei) this).field_u = -1;
                  ((ei) this).field_E = ((ei) this).field_G.a(((ei) this).field_U);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((ei) this).field_G.field_g[var2]) {
                  break L5;
                } else {
                  ((ei) this).field_G.f(var2);
                  var6 = ((ei) this).field_G.b(var2);
                  if (1 == var6) {
                    ((ei) this).field_G.d();
                    ((ei) this).field_G.c(var2);
                    if (!((ei) this).field_G.g()) {
                      break L5;
                    } else {
                      if (null != ((ei) this).field_Q) {
                        ((ei) this).a(((ei) this).field_B, 75, ((ei) this).field_Q);
                        this.g(param0);
                        return;
                      } else {
                        L6: {
                          if (!((ei) this).field_B) {
                            break L6;
                          } else {
                            if (var3 == 0) {
                              break L6;
                            } else {
                              ((ei) this).field_G.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.b(param0 ^ -2, true);
                        ((ei) this).field_G.f();
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if ((128 & var6) != 0) {
                        this.f(-128, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((ei) this).field_G.e(var2);
                    ((ei) this).field_G.c(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((ei) this).field_G.b();
              var3 = ((ei) this).field_G.field_g[var2];
              var4 = ((ei) this).field_G.a(var3);
              continue L2;
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        tk var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          if (param1 == 31911) {
            break L0;
          } else {
            var5 = null;
            int discarded$2 = this.b(64, (tk) null);
            break L0;
          }
        }
        L1: {
          if ((((ei) this).field_q[param0] & 2) != 0) {
            var3 = (tk) (Object) ((ei) this).field_O.field_n.c((byte) 47);
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                L3: {
                  if (var3.field_o != param0) {
                    break L3;
                  } else {
                    if (null == ((ei) this).field_D[param0][var3.field_F]) {
                      if (0 <= var3.field_q) {
                        break L3;
                      } else {
                        var3.field_q = 0;
                        break L3;
                      }
                    } else {
                      var3 = (tk) (Object) ((ei) this).field_O.field_n.b((byte) -105);
                      continue L2;
                    }
                  }
                }
                var3 = (tk) (Object) ((ei) this).field_O.field_n.b((byte) -105);
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
    }

    private final void e(int param0, int param1) {
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (param0 < 0) {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.e(param0, 15198);
              param0++;
              continue L0;
            }
          }
        } else {
          ((ei) this).field_o[param0] = 12800;
          ((ei) this).field_t[param0] = 8192;
          ((ei) this).field_J[param0] = 16383;
          ((ei) this).field_r[param0] = 8192;
          ((ei) this).field_x[param0] = 0;
          ((ei) this).field_z[param0] = 8192;
          this.d(param0, 31911);
          this.c(param0, -20403);
          ((ei) this).field_q[param0] = 0;
          ((ei) this).field_K[param0] = 32767;
          ((ei) this).field_R[param0] = 256;
          ((ei) this).field_n[param0] = 0;
          this.d(8192, -24344, param0);
          return;
        }
    }

    private final void a(int param0, byte param1) {
        tk var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var4 = -69 / ((param1 - 56) / 55);
        var3 = (tk) (Object) ((ei) this).field_O.field_n.c((byte) 47);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (var3.field_o == param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (var3.field_k != null) {
                  L4: {
                    var3.field_k.f(la.field_a / 100);
                    if (!var3.field_k.i()) {
                      break L4;
                    } else {
                      ((ei) this).field_O.field_o.a((sh) (Object) var3.field_k);
                      break L4;
                    }
                  }
                  var3.d(-30);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_q < 0) {
                  ((ei) this).field_D[var3.field_o][var3.field_F] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.c(-1);
              break L1;
            }
            var3 = (tk) (Object) ((ei) this).field_O.field_n.b((byte) -105);
            continue L0;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 != 128) {
            ((ei) this).field_A = null;
        }
        ((ei) this).field_r[param1] = param0;
    }

    private final void c(int param0, int param1) {
        tk var3 = null;
        int var4 = fleas.field_A ? 1 : 0;
        if ((((ei) this).field_q[param0] & 4) != 0) {
            var3 = (tk) (Object) ((ei) this).field_O.field_n.c((byte) 47);
            while (var3 != null) {
                if (!(var3.field_o != param0)) {
                    var3.field_x = 0;
                }
                var3 = (tk) (Object) ((ei) this).field_O.field_n.b((byte) -105);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        tk var7 = null;
        int var8 = 0;
        tk var9 = null;
        var8 = fleas.field_A ? 1 : 0;
        var9 = ((ei) this).field_D[param3][param1];
        if (var9 == null) {
          return;
        } else {
          L0: {
            var6 = 72 / ((9 - param0) / 45);
            ((ei) this).field_D[param3][param1] = null;
            if (0 == (2 & ((ei) this).field_q[param3])) {
              var9.field_q = 0;
              break L0;
            } else {
              var7 = (tk) (Object) ((ei) this).field_O.field_n.c((byte) 47);
              L1: while (true) {
                if (var7 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var7.field_o != var9.field_o) {
                      break L2;
                    } else {
                      if (var7.field_q >= 0) {
                        break L2;
                      } else {
                        if (var7 != var9) {
                          var9.field_q = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var7 = (tk) (Object) ((ei) this).field_O.field_n.b((byte) -105);
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        if (param0 > -4) {
            int discarded$0 = ei.a(-11, (CharSequence) null, '�');
        }
        if (!(param1 == ((ei) this).field_T[param2])) {
            ((ei) this).field_T[param2] = param1;
            for (var4 = 0; 128 > var4; var4++) {
                ((ei) this).field_A[param2][var4] = null;
            }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        ((ei) this).field_I[param0] = param2;
        ((ei) this).field_L[param0] = sc.a(-128, param2);
        this.e(-38, param2, param0);
        if (param1 >= -110) {
            field_v = null;
        }
    }

    private final int a(int param0, tk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        de var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
            L1: {
              var3_int = (param1.field_r * param1.field_C >> 12) + param1.field_E;
              var3_int = var3_int + (((ei) this).field_R[param1.field_o] * (-8192 + ((ei) this).field_r[param1.field_o]) >> 12);
              var4 = param1.field_i;
              if (var4.field_g <= 0) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_f) {
                    break L2;
                  } else {
                    if (((ei) this).field_x[param1.field_o] <= 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_f << 2;
                  var6 = var4.field_m << 1;
                  if (var6 > param1.field_A) {
                    var5 = var5 * param1.field_A / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((ei) this).field_x[param1.field_o] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_p));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              if (param0 == -16257) {
                break L4;
              } else {
                ((ei) this).field_U = -89;
                break L4;
              }
            }
            L5: {
              var5 = (int)((double)(param1.field_z.field_k * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)la.field_a + 0.5);
              if (var5 < 1) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = var5;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ei.O(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    private final synchronized void a(byte param0, boolean param1, boolean param2, wk param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        try {
            this.a(33, param1);
            ((ei) this).field_G.a(param3.field_i);
            ((ei) this).field_B = param2 ? true : false;
            ((ei) this).field_C = 0L;
            var5_int = ((ei) this).field_G.a();
            for (var6 = 0; var5_int > var6; var6++) {
                ((ei) this).field_G.f(var6);
                ((ei) this).field_G.e(var6);
                ((ei) this).field_G.c(var6);
            }
            if (param0 < 82) {
                ((ei) this).field_I = null;
            }
            ((ei) this).field_u = ((ei) this).field_G.b();
            ((ei) this).field_U = ((ei) this).field_G.field_g[((ei) this).field_u];
            ((ei) this).field_E = ((ei) this).field_G.a(((ei) this).field_U);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ei.NA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 16384) {
            ((ei) this).b(-127, 105, -38);
        }
    }

    public ei() {
        ((ei) this).field_I = new int[16];
        ((ei) this).field_y = new int[16];
        ((ei) this).field_L = new int[16];
        ((ei) this).field_D = new tk[16][128];
        ((ei) this).field_p = new int[16];
        ((ei) this).field_W = 256;
        ((ei) this).field_R = new int[16];
        ((ei) this).field_n = new int[16];
        ((ei) this).field_T = new int[16];
        ((ei) this).field_t = new int[16];
        ((ei) this).field_z = new int[16];
        ((ei) this).field_K = new int[16];
        ((ei) this).field_q = new int[16];
        ((ei) this).field_A = new tk[16][128];
        ((ei) this).field_P = new int[16];
        ((ei) this).field_o = new int[16];
        ((ei) this).field_r = new int[16];
        ((ei) this).field_J = new int[16];
        ((ei) this).field_x = new int[16];
        ((ei) this).field_w = 1000000;
        ((ei) this).field_G = new fd();
        ((ei) this).field_O = new gl((ei) this);
        ((ei) this).field_S = new hc(128);
        ((ei) this).a(256, true, -1);
        this.b(-1, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "EXCLUSIVE";
        field_H = new boolean[112];
        field_v = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_m = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
