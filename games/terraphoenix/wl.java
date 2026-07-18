/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends lj {
    private int[] field_M;
    int[] field_q;
    private int[] field_C;
    private int[] field_N;
    private fk field_G;
    private int[] field_I;
    private il field_z;
    static pd field_Q;
    private int[] field_o;
    private int[] field_s;
    int[] field_S;
    private int[] field_F;
    private int[] field_A;
    private sh[][] field_O;
    private sh[][] field_J;
    static String field_y;
    private int[] field_n;
    private int field_l;
    private int[] field_u;
    private int field_P;
    int[] field_D;
    private int[] field_L;
    private int[] field_m;
    private int[] field_w;
    private long field_x;
    private int field_H;
    private vd field_t;
    private long field_r;
    private boolean field_p;
    private int field_E;
    private tk field_v;
    private int field_B;
    private boolean field_R;

    final synchronized void d(int param0) {
        int var3 = Terraphoenix.field_V;
        qd var4 = (qd) (Object) ((wl) this).field_z.a((byte) 117);
        while (var4 != null) {
            var4.d((byte) 39);
            var4 = (qd) (Object) ((wl) this).field_z.a(true);
        }
        if (param0 != -32499) {
            lj discarded$0 = ((wl) this).c();
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = param0 >> 16 & 127;
          this.a(var5, (byte) 117, var6, var4);
          return;
        } else {
          if (144 == var3) {
            var4 = param0 & 15;
            var5 = param0 >> 8 & 127;
            var6 = 127 & param0 >> 16;
            if (var6 > 0) {
              this.a(var6, var5, var4, (byte) 53);
              return;
            } else {
              this.a(var5, (byte) 121, 64, var4);
              return;
            }
          } else {
            if (var3 != 160) {
              if (var3 == 176) {
                L0: {
                  var4 = 15 & param0;
                  var5 = (param0 & 32748) >> 8;
                  var6 = param0 >> 16 & 127;
                  if (0 != var5) {
                    break L0;
                  } else {
                    ((wl) this).field_u[var4] = (var6 << 14) + dg.a(-2080769, ((wl) this).field_u[var4]);
                    break L0;
                  }
                }
                L1: {
                  if (var5 != 32) {
                    break L1;
                  } else {
                    ((wl) this).field_u[var4] = dg.a(-16257, ((wl) this).field_u[var4]) - -(var6 << 7);
                    break L1;
                  }
                }
                L2: {
                  if (var5 == 1) {
                    ((wl) this).field_A[var4] = dg.a(-16257, ((wl) this).field_A[var4]) - -(var6 << 7);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5 != 33) {
                    break L3;
                  } else {
                    ((wl) this).field_A[var4] = var6 + dg.a(((wl) this).field_A[var4], -128);
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((wl) this).field_m[var4] = (var6 << 7) + dg.a(((wl) this).field_m[var4], -16257);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 == 37) {
                    ((wl) this).field_m[var4] = var6 + dg.a(((wl) this).field_m[var4], -128);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (7 == var5) {
                    ((wl) this).field_I[var4] = (var6 << 7) + dg.a(-16257, ((wl) this).field_I[var4]);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var5 != 39) {
                    break L7;
                  } else {
                    ((wl) this).field_I[var4] = var6 + dg.a(-128, ((wl) this).field_I[var4]);
                    break L7;
                  }
                }
                L8: {
                  if (var5 != 10) {
                    break L8;
                  } else {
                    ((wl) this).field_w[var4] = (var6 << 7) + dg.a(((wl) this).field_w[var4], -16257);
                    break L8;
                  }
                }
                L9: {
                  if (var5 == 42) {
                    ((wl) this).field_w[var4] = var6 + dg.a(-128, ((wl) this).field_w[var4]);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (11 == var5) {
                    ((wl) this).field_N[var4] = (var6 << 7) + dg.a(((wl) this).field_N[var4], -16257);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((wl) this).field_N[var4] = var6 + dg.a(((wl) this).field_N[var4], -128);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 64) {
                    if (var6 < 64) {
                      ((wl) this).field_q[var4] = dg.a(((wl) this).field_q[var4], -2);
                      break L12;
                    } else {
                      ((wl) this).field_q[var4] = ei.b(((wl) this).field_q[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 == 65) {
                    if (var6 >= 64) {
                      ((wl) this).field_q[var4] = ei.b(((wl) this).field_q[var4], 2);
                      break L13;
                    } else {
                      this.c(var4, 122);
                      ((wl) this).field_q[var4] = dg.a(((wl) this).field_q[var4], -3);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var5 != 99) {
                    break L14;
                  } else {
                    ((wl) this).field_M[var4] = dg.a(127, ((wl) this).field_M[var4]) - -(var6 << 7);
                    break L14;
                  }
                }
                L15: {
                  if (var5 != 98) {
                    break L15;
                  } else {
                    ((wl) this).field_M[var4] = var6 + dg.a(16256, ((wl) this).field_M[var4]);
                    break L15;
                  }
                }
                L16: {
                  if (var5 == 101) {
                    ((wl) this).field_M[var4] = (var6 << 7) + (dg.a(127, ((wl) this).field_M[var4]) + 16384);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var5 == 100) {
                    ((wl) this).field_M[var4] = var6 + (16384 + dg.a(16256, ((wl) this).field_M[var4]));
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var5 != 120) {
                    break L18;
                  } else {
                    this.b((byte) -125, var4);
                    break L18;
                  }
                }
                L19: {
                  if (121 == var5) {
                    this.a((byte) 100, var4);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 123) {
                    this.d(var4, 50);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 != 6) {
                    break L21;
                  } else {
                    var7 = ((wl) this).field_M[var4];
                    if (16384 == var7) {
                      ((wl) this).field_n[var4] = dg.a(-16257, ((wl) this).field_n[var4]) - -(var6 << 7);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var5 == 38) {
                    var7 = ((wl) this).field_M[var4];
                    if (var7 == 16384) {
                      ((wl) this).field_n[var4] = dg.a(((wl) this).field_n[var4], -128) - -var6;
                      break L22;
                    } else {
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (var5 == 16) {
                    ((wl) this).field_S[var4] = (var6 << 7) + dg.a(-16257, ((wl) this).field_S[var4]);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (var5 == 48) {
                    ((wl) this).field_S[var4] = var6 + dg.a(-128, ((wl) this).field_S[var4]);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (81 == var5) {
                    if (var6 < 64) {
                      this.a(var4, false);
                      ((wl) this).field_q[var4] = dg.a(((wl) this).field_q[var4], -5);
                      break L25;
                    } else {
                      ((wl) this).field_q[var4] = ei.b(((wl) this).field_q[var4], 4);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 != 17) {
                    break L26;
                  } else {
                    this.a((byte) -81, var4, (((wl) this).field_L[var4] & -16257) + (var6 << 7));
                    break L26;
                  }
                }
                L27: {
                  if (49 == var5) {
                    this.a((byte) -83, var4, (-128 & ((wl) this).field_L[var4]) - -var6);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if (var3 != 192) {
                  if (var3 != 208) {
                    if (var3 == 224) {
                      var4 = param0 & 15;
                      var5 = ((8323556 & param0) >> 9) + (param0 >> 8 & 127);
                      this.a(var4, var5, true);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 != 255) {
                        return;
                      } else {
                        this.a(true, -12502);
                        return;
                      }
                    }
                  } else {
                    var4 = 15 & param0;
                    var5 = (32679 & param0) >> 8;
                    this.b(var5, 3, var4);
                    return;
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = param0 >> 8 & 127;
                  this.a(var5 + ((wl) this).field_u[var4], var4, (byte) 8);
                  return;
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = (32688 & param0) >> 8;
              var6 = (param0 & 8358526) >> 16;
              this.a(var6, var5, -16257, var4);
              return;
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        sh var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (param1 >= 9) {
          var3 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (param0 == var3.field_v) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3.field_h < 0) {
                  ((wl) this).field_J[var3.field_v][var3.field_w] = null;
                  var3.field_h = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized lj c() {
        return (lj) (Object) ((wl) this).field_t;
    }

    final synchronized void a(boolean param0, byte param1, tk param2) {
        try {
            this.a(param0, param2, true, 0);
            int var4_int = 46 / ((param1 - 83) / 41);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "wl.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ud a(fa param0, int param1, fa param2, int param3) {
        RuntimeException var5 = null;
        ud stackIn_4_0 = null;
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
        ud stackOut_3_0 = null;
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
            int discarded$9 = 1;
            if (vh.a(param1, param3, param2)) {
              int discarded$10 = 38;
              stackOut_3_0 = fm.a(param0.b(param1, 127, param3));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("wl.J(");
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
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
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ',' + -121 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          var2 = ((wl) this).field_H;
          var3 = ((wl) this).field_E;
          var4 = ((wl) this).field_r;
          if (null == ((wl) this).field_v) {
            break L0;
          } else {
            if (var3 == ((wl) this).field_B) {
              this.a(((wl) this).field_p, ((wl) this).field_v, ((wl) this).field_R, 0);
              this.a(true);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((wl) this).field_E) {
            L2: {
              if (param0) {
                break L2;
              } else {
                ((wl) this).field_E = 104;
                break L2;
              }
            }
            L3: {
              ((wl) this).field_H = var2;
              ((wl) this).field_r = var4;
              ((wl) this).field_E = var3;
              if (((wl) this).field_v == null) {
                break L3;
              } else {
                if (((wl) this).field_B >= var3) {
                  break L3;
                } else {
                  ((wl) this).field_E = ((wl) this).field_B;
                  ((wl) this).field_H = -1;
                  ((wl) this).field_r = ((wl) this).field_G.b(((wl) this).field_E);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((wl) this).field_G.field_c[var2]) {
                  break L5;
                } else {
                  ((wl) this).field_G.c(var2);
                  var6 = ((wl) this).field_G.f(var2);
                  if (var6 == 1) {
                    ((wl) this).field_G.d();
                    ((wl) this).field_G.e(var2);
                    if (((wl) this).field_G.b()) {
                      if (null != ((wl) this).field_v) {
                        ((wl) this).a(((wl) this).field_p, (byte) 124, ((wl) this).field_v);
                        this.a(true);
                        return;
                      } else {
                        L6: {
                          if (!((wl) this).field_p) {
                            break L6;
                          } else {
                            if (var3 == 0) {
                              break L6;
                            } else {
                              ((wl) this).field_G.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, -12502);
                        ((wl) this).field_G.c();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (0 == (128 & var6)) {
                        break L7;
                      } else {
                        this.b(var6, -18);
                        break L7;
                      }
                    }
                    ((wl) this).field_G.a(var2);
                    ((wl) this).field_G.e(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((wl) this).field_G.f();
              var3 = ((wl) this).field_G.field_c[var2];
              var4 = ((wl) this).field_G.b(var3);
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        sh var3 = null;
        int var4 = Terraphoenix.field_V;
        if (!(0 == (4 & ((wl) this).field_q[param0]))) {
            var3 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
            while (var3 != null) {
                if (!(param0 != var3.field_v)) {
                    var3.field_A = 0;
                }
                var3 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
            }
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void c(int param0, int param1) {
        sh var3_ref_sh = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Terraphoenix.field_V;
          if ((2 & ((wl) this).field_q[param0]) != 0) {
            var3_ref_sh = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
            L1: while (true) {
              if (var3_ref_sh == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var3_ref_sh.field_v) {
                    break L2;
                  } else {
                    if (((wl) this).field_J[param0][var3_ref_sh.field_w] == null) {
                      if (var3_ref_sh.field_h >= 0) {
                        break L2;
                      } else {
                        var3_ref_sh.field_h = 0;
                        break L2;
                      }
                    } else {
                      var3_ref_sh = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
                      continue L1;
                    }
                  }
                }
                var3_ref_sh = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var3 = 115 / ((55 - param1) / 56);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
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
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (((wl) this).field_G.e()) {
                var4_int = ((wl) this).field_l * ((wl) this).field_G.field_e / nk.field_u;
                L2: while (true) {
                  L3: {
                    var5 = ((wl) this).field_x - -((long)param2 * (long)var4_int);
                    if (-var5 + ((wl) this).field_r < 0L) {
                      var7 = (int)((((wl) this).field_r - ((wl) this).field_x - (-(long)var4_int + 1L)) / (long)var4_int);
                      ((wl) this).field_x = ((wl) this).field_x + (long)var7 * (long)var4_int;
                      ((wl) this).field_t.a(param0, param1, var7);
                      param1 = param1 + var7;
                      this.a(true);
                      param2 = param2 - var7;
                      if (!((wl) this).field_G.e()) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    } else {
                      ((wl) this).field_x = var5;
                      break L3;
                    }
                  }
                  ((wl) this).field_t.a(param0, param1, param2);
                  break L1;
                }
              } else {
                ((wl) this).field_t.a(param0, param1, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("wl.D(");
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
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
    }

    private final void b(byte param0, int param1) {
        sh var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        var3 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 <= -111) {
                break L1;
              } else {
                ((wl) this).field_M = null;
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
                  if (param1 != var3.field_v) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != var3.field_k) {
                  L5: {
                    var3.field_k.c(nk.field_u / 100);
                    if (var3.field_k.k()) {
                      ((wl) this).field_t.field_m.a((lj) (Object) var3.field_k);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.c((byte) -111);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (var3.field_h >= 0) {
                  break L6;
                } else {
                  ((wl) this).field_J[var3.field_v][var3.field_w] = null;
                  break L6;
                }
              }
              var3.b((byte) 12);
              break L2;
            }
            var3 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        qd var5 = null;
        sh var5_ref = null;
        int var6 = 0;
        gg var7 = null;
        sh var8 = null;
        sh var9 = null;
        int var10 = 0;
        qd var11 = null;
        qd var12 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var10 = Terraphoenix.field_V;
          this.a(param1, (byte) 119, 64, param2);
          if ((2 & ((wl) this).field_q[param2]) == 0) {
            break L0;
          } else {
            var5_ref = (sh) (Object) ((wl) this).field_t.field_n.c((byte) -81);
            L1: while (true) {
              if (var5_ref == null) {
                break L0;
              } else {
                L2: {
                  if (param2 != var5_ref.field_v) {
                    break L2;
                  } else {
                    if (var5_ref.field_h >= 0) {
                      break L2;
                    } else {
                      ((wl) this).field_J[param2][var5_ref.field_w] = null;
                      ((wl) this).field_J[param2][param1] = var5_ref;
                      var6 = var5_ref.field_j - -(var5_ref.field_D * var5_ref.field_u >> 12);
                      var5_ref.field_j = var5_ref.field_j + (-var5_ref.field_w + param1 << 8);
                      var5_ref.field_u = 4096;
                      var5_ref.field_w = param1;
                      var5_ref.field_D = -var5_ref.field_j + var6;
                      return;
                    }
                  }
                }
                var5_ref = (sh) (Object) ((wl) this).field_t.field_n.b(-87);
                continue L1;
              }
            }
          }
        }
        var11 = (qd) (Object) ((wl) this).field_z.a((byte) 46, (long)((wl) this).field_s[param2]);
        var12 = var11;
        var5 = var12;
        if (var12 == null) {
          return;
        } else {
          var6 = -23;
          var7 = var11.field_n[param1];
          if (var7 == null) {
            return;
          } else {
            L3: {
              var8 = new sh();
              var8.field_B = var12;
              var8.field_v = param2;
              var8.field_F = var7;
              var8.field_m = var11.field_q[param1];
              var8.field_C = var11.field_m[param1];
              var8.field_w = param1;
              var8.field_s = 1024 + param0 * param0 * (var11.field_k * var11.field_s[param1]) >> 11;
              var8.field_p = 255 & var11.field_r[param1];
              var8.field_j = -(var11.field_p[param1] & 32767) + (param1 << 8);
              var8.field_i = 0;
              var8.field_t = 0;
              var8.field_o = 0;
              var8.field_G = 0;
              var8.field_h = -1;
              if (((wl) this).field_S[param2] == 0) {
                int discarded$1 = -49;
                var8.field_k = lh.a(var7, this.a((byte) 92, var8), this.a(var8), this.a(true, var8));
                break L3;
              } else {
                L4: {
                  var8.field_k = lh.a(var7, this.a((byte) 78, var8), 0, this.a(true, var8));
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var11.field_p[param1] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L4;
                  }
                }
                ((wl) this).a(stackIn_17_1 != 0, var8, 120);
                break L3;
              }
            }
            L5: {
              if (var11.field_p[param1] >= 0) {
                break L5;
              } else {
                var8.field_k.g(-1);
                break L5;
              }
            }
            L6: {
              if (var8.field_C < 0) {
                break L6;
              } else {
                L7: {
                  var9 = ((wl) this).field_O[param2][var8.field_C];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (var9.field_h < 0) {
                      ((wl) this).field_J[param2][var9.field_w] = null;
                      var9.field_h = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((wl) this).field_O[param2][var8.field_C] = var8;
                break L6;
              }
            }
            ((wl) this).field_t.field_n.a((uf) (Object) var8, -16611);
            ((wl) this).field_J[param2][param1] = var8;
            return;
          }
        }
    }

    private final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        for (var4 = 0; var4 < 16; var4++) {
            ((wl) this).field_C[var4] = 256;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          if (((wl) this).field_G.e()) {
            var2 = ((wl) this).field_G.field_e * ((wl) this).field_l / nk.field_u;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + ((wl) this).field_x;
                if (0L <= ((wl) this).field_r - var3) {
                  ((wl) this).field_x = var3;
                  break L2;
                } else {
                  var5 = (int)(((long)var2 + -((wl) this).field_x + (((wl) this).field_r + -1L)) / (long)var2);
                  ((wl) this).field_x = ((wl) this).field_x + (long)var5 * (long)var2;
                  ((wl) this).field_t.a(var5);
                  param0 = param0 - var5;
                  this.a(true);
                  if (!((wl) this).field_G.e()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((wl) this).field_t.a(param0);
              break L0;
            }
          } else {
            ((wl) this).field_t.a(param0);
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        if (((wl) this).field_s[param1] != param0) {
            ((wl) this).field_s[param1] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                ((wl) this).field_O[param1][var4] = null;
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        ((wl) this).field_L[param1] = param2;
        ((wl) this).field_D[param1] = (int)(Math.pow(2.0, (double)param2 * 0.00054931640625) * 2097152.0 + 0.5);
        if (param0 > -15) {
            this.a(false);
        }
    }

    private final int a(boolean param0, sh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            var3_int = ((wl) this).field_w[param1.field_v];
            if (8192 > var3_int) {
              stackOut_3_0 = 32 + param1.field_p * var3_int >> 6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -(32 + (128 - param1.field_p) * (16384 + -var3_int) >> 6) + 16384;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wl.W(").append(true).append(',');
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
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (36 >= param3) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      if (var5 != 0) {
                        stackOut_35_0 = var6;
                        stackIn_36_0 = stackOut_35_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param1.charAt(var8);
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L3;
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (48 > var9) {
                              break L6;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (65 > var9) {
                              break L7;
                            } else {
                              if (90 < var9) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 97) {
                              break L8;
                            } else {
                              if (122 < var9) {
                                break L8;
                              } else {
                                var9 -= 87;
                                break L5;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param3 <= var9) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = param3 * var6 - -var9;
                          if (var10 / param3 != var6) {
                            throw new NumberFormatException();
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("wl.NA(").append(true).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + false + ',' + param3 + ')');
        }
        return stackIn_36_0;
    }

    final boolean a(byte param0, int[] param1, int param2, sh param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        gm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_12_0 = 0;
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
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              param3.field_y = nk.field_u / 100;
              if (0 > param3.field_h) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_k) {
                    break L2;
                  } else {
                    if (param3.field_k.i()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.c((byte) -120);
                  param3.b((byte) 12);
                  if (param3.field_C <= 0) {
                    break L3;
                  } else {
                    if (param3 == ((wl) this).field_O[param3.field_v][param3.field_C]) {
                      ((wl) this).field_O[param3.field_v][param3.field_C] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            if (param0 >= 76) {
              L4: {
                var6_int = param3.field_u;
                if (0 >= var6_int) {
                  break L4;
                } else {
                  L5: {
                    var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((wl) this).field_m[param3.field_v] * 0.0004921259842519685));
                    if (var6_int < 0) {
                      var6_int = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  param3.field_u = var6_int;
                  break L4;
                }
              }
              L6: {
                param3.field_k.f(this.a((byte) 72, param3));
                var7 = param3.field_m;
                var8 = 0;
                param3.field_l = param3.field_l + 1;
                param3.field_r = param3.field_r + var7.field_d;
                var9 = 0.000005086263020833333 * (double)((-60 + param3.field_w << 8) + (param3.field_D * param3.field_u >> 12));
                if (var7.field_i > 0) {
                  L7: {
                    if (var7.field_e <= 0) {
                      param3.field_o = param3.field_o + 128;
                      break L7;
                    } else {
                      param3.field_o = param3.field_o + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
                      break L7;
                    }
                  }
                  if (var7.field_i * param3.field_o < 819200) {
                    break L6;
                  } else {
                    var8 = 1;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L8: {
                if (var7.field_h != null) {
                  L9: {
                    if (var7.field_b <= 0) {
                      param3.field_i = param3.field_i + 128;
                      break L9;
                    } else {
                      param3.field_i = param3.field_i + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_b * var9));
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (var7.field_h.length - 2 <= param3.field_G) {
                        break L11;
                      } else {
                        if ((var7.field_h[2 + param3.field_G] & 255) << 8 >= param3.field_i) {
                          break L11;
                        } else {
                          param3.field_G = param3.field_G + 2;
                          continue L10;
                        }
                      }
                    }
                    if (param3.field_G != var7.field_h.length + -2) {
                      break L8;
                    } else {
                      if (-1 != var7.field_h[param3.field_G - -1]) {
                        break L8;
                      } else {
                        var8 = 1;
                        break L8;
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              L12: {
                if (-1 > param3.field_h) {
                  break L12;
                } else {
                  if (null == var7.field_g) {
                    break L12;
                  } else {
                    if ((((wl) this).field_q[param3.field_v] & 1) != 0) {
                      break L12;
                    } else {
                      L13: {
                        if (param3.field_C < 0) {
                          break L13;
                        } else {
                          if (((wl) this).field_O[param3.field_v][param3.field_C] != param3) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (var7.field_k > 0) {
                          param3.field_h = param3.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
                          break L14;
                        } else {
                          param3.field_h = param3.field_h + 128;
                          break L14;
                        }
                      }
                      L15: while (true) {
                        L16: {
                          if (param3.field_t >= var7.field_g.length - 2) {
                            break L16;
                          } else {
                            if (param3.field_h <= (255 & var7.field_g[param3.field_t + 2]) << 8) {
                              break L16;
                            } else {
                              param3.field_t = param3.field_t + 2;
                              continue L15;
                            }
                          }
                        }
                        if (var7.field_g.length + -2 == param3.field_t) {
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
                int discarded$1 = -49;
                param3.field_k.a(param3.field_y, this.a(param3), this.a(true, param3));
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L17: {
                  param3.field_k.c(param3.field_y);
                  if (param1 == null) {
                    param3.field_k.a(param2);
                    break L17;
                  } else {
                    param3.field_k.a(param1, param4, param2);
                    break L17;
                  }
                }
                L18: {
                  if (!param3.field_k.k()) {
                    break L18;
                  } else {
                    ((wl) this).field_t.field_m.a((lj) (Object) param3.field_k);
                    break L18;
                  }
                }
                L19: {
                  param3.c((byte) -120);
                  if (0 <= param3.field_h) {
                    param3.b((byte) 12);
                    if (param3.field_C <= 0) {
                      break L19;
                    } else {
                      if (((wl) this).field_O[param3.field_v][param3.field_C] == param3) {
                        ((wl) this).field_O[param3.field_v][param3.field_C] = null;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                stackOut_64_0 = 1;
                stackIn_65_0 = stackOut_64_0;
                return stackIn_65_0 != 0;
              }
            } else {
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("wl.KA(").append(param0).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L21;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param4 + ')');
        }
        return stackIn_67_0 != 0;
    }

    public static void c(byte param0) {
        field_y = null;
        field_Q = null;
    }

    final synchronized lj a() {
        return null;
    }

    final void a(boolean param0, sh param1, int param2) {
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
              if (param2 >= 91) {
                break L1;
              } else {
                ((wl) this).field_S = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param1.field_F.field_k.length;
                if (!param0) {
                  break L3;
                } else {
                  if (!param1.field_F.field_i) {
                    break L3;
                  } else {
                    var6 = -param1.field_F.field_j + var4_int - -var4_int;
                    var4_int = var4_int << 8;
                    var5 = (int)((long)((wl) this).field_S[param1.field_v] * (long)var6 >> 6);
                    if (var5 >= var4_int) {
                      param1.field_k.a(true);
                      var5 = -var5 + (-1 + (var4_int - -var4_int));
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((wl) this).field_S[param1.field_v] >> 6);
              break L2;
            }
            param1.field_k.d(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("wl.V(").append(param0).append(',');
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
          throw qk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = -1;
    }

    private final synchronized void a(boolean param0, tk param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        try {
            this.a(param2, (byte) 92);
            ((wl) this).field_G.a(param1.field_i);
            ((wl) this).field_x = 0L;
            ((wl) this).field_p = param0 ? true : false;
            var5_int = ((wl) this).field_G.g();
            for (var6 = param3; var5_int > var6; var6++) {
                ((wl) this).field_G.c(var6);
                ((wl) this).field_G.a(var6);
                ((wl) this).field_G.e(var6);
            }
            ((wl) this).field_H = ((wl) this).field_G.f();
            ((wl) this).field_E = ((wl) this).field_G.field_c[((wl) this).field_H];
            ((wl) this).field_r = ((wl) this).field_G.b(((wl) this).field_E);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "wl.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(sh param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        gm var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (((wl) this).field_C[param0.field_v] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var9 = param0.field_m;
              var10 = var9;
              var4 = ((wl) this).field_I[param0.field_v] * ((wl) this).field_N[param0.field_v] - -4096 >> 13;
              var4 = var4 * var4 + 16384 >> 15;
              L1: {
                var4 = 16384 + param0.field_s * var4 >> 15;
                var4 = var4 * ((wl) this).field_P - -128 >> 8;
                var4 = 128 + ((wl) this).field_C[param0.field_v] * var4 >> 8;
                if (0 < var10.field_i) {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_o)) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10.field_h != null) {
                  L3: {
                    var5 = param0.field_i;
                    var6 = var10.field_h[1 + param0.field_G];
                    if (var10.field_h.length + -2 <= param0.field_G) {
                      break L3;
                    } else {
                      var7 = (255 & var9.field_h[param0.field_G]) << 8;
                      var8 = (255 & var10.field_h[2 + param0.field_G]) << 8;
                      var6 = var6 + (-var6 + var10.field_h[param0.field_G + 3]) * (var5 - var7) / (var8 - var7);
                      break L3;
                    }
                  }
                  var4 = var6 * var4 - -32 >> 6;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (0 >= param0.field_h) {
                  break L4;
                } else {
                  if (null != var10.field_g) {
                    L5: {
                      var5 = param0.field_h;
                      var6 = var10.field_g[param0.field_t + 1];
                      if (var10.field_g.length + -2 > param0.field_t) {
                        var7 = (var9.field_g[param0.field_t] & 255) << 8;
                        var8 = 65280 & var10.field_g[2 + param0.field_t] << 8;
                        var6 = var6 + (var5 - var7) * (-var6 + var10.field_g[3 + param0.field_t]) / (var8 - var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_21_0 = var4;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("wl.PA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + -49 + ')');
        }
        return stackIn_22_0;
    }

    final static java.net.URL a(java.net.URL param0, String param1, String param2) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7_int = 0;
        StringBuilder var7 = null;
        int var9 = 0;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_36_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var9 = Terraphoenix.field_V;
        try {
          L0: {
            var5_ref = param0.getFile();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                    break L5;
                  } else {
                    var7_int = var5_ref.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      if (param2 == null) {
                        break L2;
                      } else {
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        continue L1;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  L7: {
                    if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                      break L7;
                    } else {
                      if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var7_int = var5_ref.indexOf('/', var6 - -1);
                  if (0 > var7_int) {
                    break L6;
                  } else {
                    if (param1 != null) {
                      var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
                  }
                }
                L8: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                  if (param2 == null) {
                    break L8;
                  } else {
                    if (param2.length() > 0) {
                      StringBuilder discarded$8 = var7.append("/p=");
                      StringBuilder discarded$9 = var7.append(param2);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param1 == null) {
                    break L9;
                  } else {
                    if (param1.length() > 0) {
                      StringBuilder discarded$10 = var7.append("/s=");
                      StringBuilder discarded$11 = var7.append(param1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var6 >= var5_ref.length()) {
                    StringBuilder discarded$12 = var7.append('/');
                    break L10;
                  } else {
                    StringBuilder discarded$13 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L10;
                  }
                }
                stackOut_36_0 = null;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              }
              var6 = var7_int;
              continue L1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var5;
            stackOut_39_1 = new StringBuilder().append("wl.HA(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L11;
            }
          }
          L12: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L12;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L12;
            }
          }
          L13: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L13;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L13;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + false + ',' + -1 + ')');
        }
        return (java.net.URL) (Object) stackIn_37_0;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        if (param0) {
            this.b((byte) -127, -1);
        } else {
            this.d(-1, 72);
        }
        this.a((byte) 100, -1);
        for (var3 = 0; 16 > var3; var3++) {
            ((wl) this).field_s[var3] = ((wl) this).field_o[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((wl) this).field_u[var5] = dg.a(-128, ((wl) this).field_o[var5]);
            var5++;
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        if (param1 < 0) {
          param1 = 0;
          L0: while (true) {
            if (16 <= param1) {
              return;
            } else {
              this.a((byte) 100, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          ((wl) this).field_I[param1] = 12800;
          ((wl) this).field_w[param1] = 8192;
          ((wl) this).field_N[param1] = 16383;
          ((wl) this).field_F[param1] = 8192;
          ((wl) this).field_A[param1] = 0;
          ((wl) this).field_m[param1] = 8192;
          this.c(param1, 117);
          this.a(param1, false);
          ((wl) this).field_q[param1] = 0;
          ((wl) this).field_M[param1] = 32767;
          ((wl) this).field_n[param1] = 256;
          ((wl) this).field_S[param1] = 0;
          this.a((byte) -55, param1, 8192);
          return;
        }
    }

    final boolean a(sh param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
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
              if (param1 == 16384) {
                break L1;
              } else {
                ((wl) this).field_F = null;
                break L1;
              }
            }
            if (param0.field_k == null) {
              if (param0.field_h >= 0) {
                L2: {
                  param0.b((byte) 12);
                  if (0 >= param0.field_C) {
                    break L2;
                  } else {
                    if (param0 != ((wl) this).field_O[param0.field_v][param0.field_C]) {
                      break L2;
                    } else {
                      ((wl) this).field_O[param0.field_v][param0.field_C] = null;
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("wl.R(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final synchronized void a(boolean param0, byte param1) {
        ((wl) this).field_G.c();
        ((wl) this).field_v = null;
        this.a(param0, -12502);
        if (param1 <= 73) {
            ((wl) this).field_l = 42;
        }
    }

    private final int a(byte param0, sh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        gm var4 = null;
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
              if (param0 >= 59) {
                break L1;
              } else {
                int discarded$1 = ((wl) this).d();
                break L1;
              }
            }
            L2: {
              var3_int = param1.field_j - -(param1.field_u * param1.field_D >> 12);
              var3_int = var3_int + (((wl) this).field_n[param1.field_v] * (((wl) this).field_F[param1.field_v] + -8192) >> 12);
              var4 = param1.field_m;
              if (0 >= var4.field_d) {
                break L2;
              } else {
                L3: {
                  if (var4.field_m > 0) {
                    break L3;
                  } else {
                    if (((wl) this).field_A[param1.field_v] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_m << 2;
                  var6 = var4.field_c << 1;
                  if (param1.field_l < var6) {
                    var5 = var5 * param1.field_l / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((wl) this).field_A[param1.field_v] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_r & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(256 * param1.field_F.field_l) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)nk.field_u);
              if (1 > var5) {
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
            stackOut_14_1 = new StringBuilder().append("wl.CA(").append(param0).append(',');
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
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final synchronized boolean a(fa param0, da param1, tk param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        sb var8 = null;
        int var9 = 0;
        int var11 = 0;
        qd var12 = null;
        qd var13 = null;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              param2.a();
              var6_int = 1;
              var7 = null;
              if (0 < param4) {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 128) {
                break L2;
              } else {
                this.a(true, (byte) -20);
                break L2;
              }
            }
            var8 = (sb) (Object) param2.field_h.a((byte) 117);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param2.b();
                    break L4;
                  }
                }
                stackOut_19_0 = var6_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_g;
                  var12 = (qd) (Object) ((wl) this).field_z.a((byte) 46, (long)var9);
                  if (var12 == null) {
                    var13 = kf.a(var9, (byte) 122, param0);
                    if (var13 == null) {
                      var6_int = 0;
                      break L5;
                    } else {
                      ((wl) this).field_z.a((uf) (Object) var13, (long)var9, (byte) -81);
                      if (var13.a(var8.field_o, (int[]) var7, 0, param1)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    }
                  } else {
                    if (var12.a(var8.field_o, (int[]) var7, 0, param1)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      var8 = (sb) (Object) param2.field_h.a(true);
                      continue L3;
                    }
                  }
                }
                var8 = (sb) (Object) param2.field_h.a(true);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("wl.K(");
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
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void c(int param0, int param1, int param2) {
        ((wl) this).field_o[param0] = param1;
        ((wl) this).field_u[param0] = dg.a(-128, param1);
        this.a(param1, param0, (byte) 8);
    }

    final synchronized boolean c(int param0) {
        if (param0 >= -90) {
            Object var3 = null;
            this.a(true, (tk) null, false, 78);
        }
        return ((wl) this).field_G.e();
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        sh var7 = null;
        int var8 = Terraphoenix.field_V;
        sh var9 = ((wl) this).field_J[param3][param0];
        if (!(var9 != null)) {
            return;
        }
        ((wl) this).field_J[param3][param0] = null;
        int var6 = 37 / ((param1 - 40) / 61);
        if ((2 & ((wl) this).field_q[param3]) == 0) {
            var9.field_h = 0;
        } else {
            var7 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
            while (var7 != null) {
                if (var7.field_v == var9.field_v) {
                    if (var7.field_h < 0) {
                        if (var7 != var9) {
                            var9.field_h = 0;
                            break;
                        }
                    }
                }
                var7 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        ((wl) this).field_F[param0] = param1;
    }

    final synchronized void e(int param0, int param1) {
        if (param1 >= -83) {
            return;
        }
        ((wl) this).field_P = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0, param1, -5368);
        if (param2 > -8) {
            this.c(-93, 57);
        }
    }

    public wl() {
        ((wl) this).field_q = new int[16];
        ((wl) this).field_S = new int[16];
        ((wl) this).field_N = new int[16];
        ((wl) this).field_A = new int[16];
        ((wl) this).field_F = new int[16];
        ((wl) this).field_l = 1000000;
        ((wl) this).field_O = new sh[16][128];
        ((wl) this).field_s = new int[16];
        ((wl) this).field_n = new int[16];
        ((wl) this).field_C = new int[16];
        ((wl) this).field_I = new int[16];
        ((wl) this).field_J = new sh[16][128];
        ((wl) this).field_M = new int[16];
        ((wl) this).field_L = new int[16];
        ((wl) this).field_P = 256;
        ((wl) this).field_m = new int[16];
        ((wl) this).field_D = new int[16];
        ((wl) this).field_u = new int[16];
        ((wl) this).field_o = new int[16];
        ((wl) this).field_w = new int[16];
        ((wl) this).field_G = new fk();
        ((wl) this).field_t = new vd((wl) this);
        ((wl) this).field_z = new il(128);
        this.a(-1, true, 256);
        this.a(true, -12502);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "HC-3 FG";
    }
}
