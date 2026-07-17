/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends rf {
    private int[] field_r;
    private int[] field_A;
    static int[] field_i;
    private ft[][] field_E;
    private int[] field_F;
    private int field_C;
    private int[] field_w;
    private int[] field_B;
    private int[] field_p;
    int[] field_m;
    private int field_t;
    private int[] field_o;
    int[] field_z;
    private int[] field_D;
    int[] field_G;
    private ph field_n;
    private ft[][] field_K;
    private int[] field_I;
    private int[] field_s;
    private int[] field_N;
    private k field_M;
    private int[] field_J;
    private int[] field_l;
    private long field_j;
    private boolean field_k;
    private int field_q;
    private long field_u;
    private um field_L;
    private int field_H;
    private ap field_x;
    private boolean field_v;
    private int field_y;

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
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
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((hk) this).field_M.c()) {
                  break L2;
                } else {
                  var4_int = ((hk) this).field_M.field_e * ((hk) this).field_C / tk.field_f;
                  L3: while (true) {
                    var5 = (long)param2 * (long)var4_int + ((hk) this).field_j;
                    if (0L > ((hk) this).field_u - var5) {
                      var7 = (int)((((hk) this).field_u + -((hk) this).field_j + ((long)var4_int - 1L)) / (long)var4_int);
                      ((hk) this).field_j = ((hk) this).field_j + (long)var4_int * (long)var7;
                      ((hk) this).field_L.b(param0, param1, var7);
                      param1 = param1 + var7;
                      this.a((byte) 53);
                      param2 = param2 - var7;
                      if (((hk) this).field_M.c()) {
                        continue L3;
                      } else {
                        ((hk) this).field_L.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((hk) this).field_j = var5;
                      break L2;
                    }
                  }
                }
              }
              ((hk) this).field_L.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("hk.M(");
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(ft param0, boolean param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
              L2: {
                var4_int = param0.field_x.field_g.length;
                if (!param1) {
                  break L2;
                } else {
                  if (param0.field_x.field_f) {
                    var6 = var4_int + (var4_int - param0.field_x.field_h);
                    var5 = (int)((long)var6 * (long)((hk) this).field_z[param0.field_m] >> 6);
                    var4_int = var4_int << 8;
                    if (~var4_int >= ~var5) {
                      param0.field_e.a(true);
                      var5 = -var5 + (-1 + var4_int + var4_int);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((hk) this).field_z[param0.field_m] >> 6);
              break L1;
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                ((hk) this).field_y = -43;
                break L3;
              }
            }
            param0.field_e.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("hk.OA(");
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 < 126) {
            ((hk) this).field_k = false;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 != 127) {
            return;
        }
        ((hk) this).field_N[param2] = param1;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0) {
            this.b(-1, (byte) 67);
        } else {
            this.a(true, -1);
        }
        if (param1 != 12705) {
            this.b(-31, -4);
        }
        this.c(-1, false);
        for (var3 = 0; var3 < 16; var3++) {
            ((hk) this).field_I[var3] = ((hk) this).field_F[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((hk) this).field_s[var5] = pg.a(-128, ((hk) this).field_F[var5]);
            var5++;
        }
    }

    final synchronized rf a() {
        return null;
    }

    private final void a(boolean param0, int param1) {
        ft var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((hk) this).field_s = null;
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
                  if (~var3.field_m == ~param1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_p >= 0) {
                break L2;
              } else {
                ((hk) this).field_E[var3.field_m][var3.field_n] = null;
                var3.field_p = 0;
                break L2;
              }
            }
            var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
            continue L0;
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ft var6 = null;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        ft var8 = ((hk) this).field_E[param3][param1];
        if (!(var8 != null)) {
            return;
        }
        ((hk) this).field_E[param3][param1] = null;
        if (param2 == (((hk) this).field_G[param3] & 2)) {
            var8.field_p = 0;
        } else {
            var6 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
            while (var6 != null) {
                if (~var6.field_m == ~var8.field_m) {
                    if (0 > var6.field_p) {
                        if (!(var8 == var6)) {
                            var8.field_p = 0;
                            break;
                        }
                    }
                }
                var6 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
            }
        }
    }

    final synchronized void g(int param0) {
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 0) {
            return;
        }
        ml var4 = (ml) (Object) ((hk) this).field_n.a(false);
        while (var4 != null) {
            var4.a(true);
            var4 = (ml) (Object) ((hk) this).field_n.a(0);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = AceOfSkies.field_G ? 1 : 0;
            if (((hk) this).field_M.c()) {
              var2 = ((hk) this).field_C * ((hk) this).field_M.field_e / tk.field_f;
              L2: while (true) {
                var3 = ((hk) this).field_j - -((long)param0 * (long)var2);
                if (((hk) this).field_u + -var3 < 0L) {
                  var5 = (int)((((hk) this).field_u - ((hk) this).field_j + (long)var2 + -1L) / (long)var2);
                  ((hk) this).field_j = ((hk) this).field_j + (long)var5 * (long)var2;
                  ((hk) this).field_L.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 54);
                  if (((hk) this).field_M.c()) {
                    continue L2;
                  } else {
                    ((hk) this).field_L.a(param0);
                    break L0;
                  }
                } else {
                  ((hk) this).field_j = var3;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((hk) this).field_L.a(param0);
          break L0;
        }
    }

    private final void a(byte param0, int param1) {
        ft var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param0 >= -111) {
            return;
        }
        if (!((2 & ((hk) this).field_G[param1]) == 0)) {
            var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
            while (var3 != null) {
                if (~var3.field_m == ~param1) {
                    if (null == ((hk) this).field_E[param1][var3.field_n]) {
                        if (0 > var3.field_p) {
                            var3.field_p = 0;
                        }
                    }
                }
                var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        ft var5 = null;
        al var6 = null;
        int var6_int = 0;
        ft var7 = null;
        int var8 = 0;
        ft var9 = null;
        int var10 = 0;
        ml var11 = null;
        ml var12 = null;
        Object stackIn_16_0 = null;
        ft stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        ft stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        ft stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        Object stackOut_15_0 = null;
        ft stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        ft stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        ft stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        L0: {
          var10 = AceOfSkies.field_G ? 1 : 0;
          this.a(64, param2, 0, param3);
          if (0 != (2 & ((hk) this).field_G[param3])) {
            var5 = (ft) (Object) ((hk) this).field_L.field_k.a((byte) -70);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (~var5.field_m != ~param3) {
                    break L2;
                  } else {
                    if (0 <= var5.field_p) {
                      break L2;
                    } else {
                      ((hk) this).field_E[param3][var5.field_n] = null;
                      ((hk) this).field_E[param3][param2] = var5;
                      var6_int = var5.field_w + (var5.field_q * var5.field_u >> 12);
                      var5.field_w = var5.field_w + (-var5.field_n + param2 << 8);
                      var5.field_q = 4096;
                      var5.field_n = param2;
                      var5.field_u = -var5.field_w + var6_int;
                      return;
                    }
                  }
                }
                var5 = (ft) (Object) ((hk) this).field_L.field_k.a(110);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (ml) (Object) ((hk) this).field_n.a((byte) 106, (long)((hk) this).field_I[param3]);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_f[param2];
          if (var6 != null) {
            L3: {
              var8 = 5 / ((-31 - param0) / 43);
              var7 = new ft();
              var7.field_y = var12;
              var7.field_m = param3;
              var7.field_x = var6;
              var7.field_r = var11.field_o[param2];
              var7.field_f = var11.field_e[param2];
              var7.field_n = param2;
              var7.field_h = 1024 + var11.field_k[param2] * var12.field_i * (param1 * param1) >> 11;
              var7.field_v = var11.field_q[param2] & 255;
              var7.field_w = (param2 << 8) - (var11.field_n[param2] & 32767);
              var7.field_g = 0;
              var7.field_p = -1;
              var7.field_A = 0;
              var7.field_s = 0;
              var7.field_k = 0;
              if (((hk) this).field_z[param3] != 0) {
                L4: {
                  var7.field_e = su.a(var6, this.b((byte) -126, var7), 0, this.b(85, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = (ft) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (var12.field_n[param2] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (ft) (Object) stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (ft) (Object) stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L4;
                  }
                }
                ((hk) this).a(stackIn_18_1, stackIn_18_2 != 0, true);
                break L3;
              } else {
                var7.field_e = su.a(var6, this.b((byte) -113, var7), this.a((byte) -67, var7), this.b(77, var7));
                break L3;
              }
            }
            L5: {
              if (var12.field_n[param2] < 0) {
                var7.field_e.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_f < 0) {
                break L6;
              } else {
                L7: {
                  var9 = ((hk) this).field_K[param3][var7.field_f];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (var9.field_p < 0) {
                      ((hk) this).field_E[param3][var9.field_n] = null;
                      var9.field_p = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((hk) this).field_K[param3][var7.field_f] = var7;
                break L6;
              }
            }
            ((hk) this).field_L.field_k.a(120, (wf) (Object) var7);
            ((hk) this).field_E[param3][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((hk) this).field_o[param0] = param1;
        if (param2 != 3830) {
            Object var5 = null;
            int discarded$0 = this.b((byte) 103, (ft) null);
        }
        ((hk) this).field_m[param0] = (int)(0.5 + Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0);
    }

    final synchronized rf b() {
        return (rf) (Object) ((hk) this).field_L;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = AceOfSkies.field_G ? 1 : 0;
          var2 = ((hk) this).field_H;
          var3 = ((hk) this).field_q;
          var4 = ((hk) this).field_u;
          if (null == ((hk) this).field_x) {
            break L0;
          } else {
            if (((hk) this).field_y == var3) {
              this.a(122, ((hk) this).field_v, ((hk) this).field_k, ((hk) this).field_x);
              this.a((byte) 92);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (~var3 != ~((hk) this).field_q) {
            L2: {
              ((hk) this).field_H = var2;
              ((hk) this).field_q = var3;
              ((hk) this).field_u = var4;
              if (((hk) this).field_x == null) {
                break L2;
              } else {
                if (var3 > ((hk) this).field_y) {
                  ((hk) this).field_q = ((hk) this).field_y;
                  ((hk) this).field_H = -1;
                  ((hk) this).field_u = ((hk) this).field_M.d(((hk) this).field_q);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 >= 16) {
                break L3;
              } else {
                var8 = null;
                boolean discarded$1 = ((hk) this).a(-128, (ft) null);
                break L3;
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((hk) this).field_M.field_f[var2]) {
                  break L5;
                } else {
                  ((hk) this).field_M.a(var2);
                  var6 = ((hk) this).field_M.e(var2);
                  if (var6 != 1) {
                    L6: {
                      if ((128 & var6) != 0) {
                        this.b(-128, var6);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((hk) this).field_M.c(var2);
                    ((hk) this).field_M.f(var2);
                    continue L4;
                  } else {
                    ((hk) this).field_M.a();
                    ((hk) this).field_M.f(var2);
                    if (!((hk) this).field_M.g()) {
                      break L5;
                    } else {
                      if (((hk) this).field_x != null) {
                        ((hk) this).a(((hk) this).field_k, -2029711608, ((hk) this).field_x);
                        this.a((byte) 122);
                        return;
                      } else {
                        L7: {
                          if (!((hk) this).field_k) {
                            break L7;
                          } else {
                            if (var3 == 0) {
                              break L7;
                            } else {
                              ((hk) this).field_M.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.b(true, 12705);
                        ((hk) this).field_M.d();
                        return;
                      }
                    }
                  }
                }
              }
              var2 = ((hk) this).field_M.e();
              var3 = ((hk) this).field_M.field_f[var2];
              var4 = ((hk) this).field_M.d(var3);
              continue L1;
            }
          }
        }
    }

    private final void c(int param0, boolean param1) {
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        if (0 <= param0) {
          ((hk) this).field_N = null;
          ((hk) this).field_J[param0] = 12800;
          ((hk) this).field_p[param0] = 8192;
          ((hk) this).field_w[param0] = 16383;
          ((hk) this).field_N[param0] = 8192;
          ((hk) this).field_A[param0] = 0;
          ((hk) this).field_r[param0] = 8192;
          this.a((byte) -116, param0);
          this.a(param0, (byte) 4);
          ((hk) this).field_G[param0] = 0;
          ((hk) this).field_D[param0] = 32767;
          ((hk) this).field_B[param0] = 256;
          ((hk) this).field_z[param0] = 0;
          this.c(param0, 8192, 3830);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.c(param0, false);
              param0++;
              continue L0;
            }
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        ((hk) this).field_C = param0;
        if (param1 > -102) {
            ((hk) this).field_J = null;
        }
    }

    final synchronized void d(int param0) {
        if (param0 >= -125) {
            ((hk) this).field_r = null;
        }
        this.a(2097152, true);
    }

    final synchronized void a(boolean param0, int param1, ap param2) {
        try {
            this.a(param1 ^ -2029711495, true, param0, param2);
            if (param1 != -2029711608) {
                ((hk) this).a(43);
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.MA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, ap param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        try {
            this.a(2097152, param1);
            ((hk) this).field_M.a(param3.field_e);
            ((hk) this).field_j = 0L;
            ((hk) this).field_k = param2 ? true : false;
            var5_int = ((hk) this).field_M.f();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((hk) this).field_M.a(var6);
                ((hk) this).field_M.c(var6);
                ((hk) this).field_M.f(var6);
            }
            ((hk) this).field_H = ((hk) this).field_M.e();
            if (param0 <= 110) {
                this.a(-102, (byte) -90);
            }
            ((hk) this).field_q = ((hk) this).field_M.field_f[((hk) this).field_H];
            ((hk) this).field_u = ((hk) this).field_M.d(((hk) this).field_q);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hk.V(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (!(param2 == ((hk) this).field_I[param0])) {
            ((hk) this).field_I[param0] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                ((hk) this).field_K[param0][var4] = null;
            }
        }
        if (param1 < 50) {
            rf discarded$0 = ((hk) this).b();
        }
    }

    final boolean a(int param0, ft param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (null == param1.field_e) {
              if (param1.field_p >= 0) {
                L1: {
                  param1.c(-125);
                  if (0 >= param1.field_f) {
                    break L1;
                  } else {
                    if (((hk) this).field_K[param1.field_m][param1.field_f] == param1) {
                      ((hk) this).field_K[param1.field_m][param1.field_f] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                return true;
              }
            } else {
              if (param0 == 0) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("hk.I(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final synchronized boolean a(int param0, int param1, ap param2, gk param3, ob param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ub var8 = null;
        int var9 = 0;
        int var11 = 0;
        ml var12 = null;
        ml var13 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.b();
              var6_int = 1;
              var7 = null;
              if (~param1 >= param0) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param1};
                break L1;
              }
            }
            var8 = (ub) (Object) param2.field_f.a(false);
            L2: while (true) {
              if (var8 == null) {
                L3: {
                  if (var6_int == 0) {
                    break L3;
                  } else {
                    param2.a();
                    break L3;
                  }
                }
                stackOut_17_0 = var6_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var9 = (int)var8.field_b;
                    var12 = (ml) (Object) ((hk) this).field_n.a((byte) 106, (long)var9);
                    if (var12 == null) {
                      var13 = gu.a(var9, param3, 16652);
                      if (var13 == null) {
                        var6_int = 0;
                        break L4;
                      } else {
                        ((hk) this).field_n.a(param0 ^ -98, (long)var9, (wf) (Object) var13);
                        if (!var13.a(var8.field_e, (int[]) var7, param4, 5193)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      if (!var12.a(var8.field_e, (int[]) var7, param4, 5193)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int = 0;
                  break L4;
                }
                var8 = (ub) (Object) param2.field_f.a(param0 + 1);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("hk.J(").append(param0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final synchronized void b(int param0, boolean param1) {
        if (param1) {
            ((hk) this).field_v = false;
        }
        ((hk) this).field_t = param0;
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 >= -115) {
            ((hk) this).field_o = null;
        }
        if (param2 >= 0) {
            ((hk) this).field_l[param2] = param1;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                ((hk) this).field_l[var4] = param1;
            }
        }
    }

    private final int b(int param0, ft param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            var3_int = ((hk) this).field_p[param1.field_m];
            if (param0 > 54) {
              if (var3_int >= 8192) {
                stackOut_6_0 = -((-param1.field_v + 128) * (16384 - var3_int) - -32 >> 6) + 16384;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = var3_int * param1.field_v - -32 >> 6;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -42;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("hk.JA(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    private final int a(byte param0, ft param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dh var9 = null;
        dh var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (((hk) this).field_l[param1.field_m] != 0) {
              L1: {
                var9 = param1.field_r;
                var10 = var9;
                var4 = 4096 + ((hk) this).field_w[param1.field_m] * ((hk) this).field_J[param1.field_m] >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = 16384 + var4 * param1.field_h >> 15;
                var4 = 128 + ((hk) this).field_t * var4 >> 8;
                var4 = ((hk) this).field_l[param1.field_m] * var4 - -128 >> 8;
                if (param0 == -67) {
                  break L1;
                } else {
                  ((hk) this).field_u = 112L;
                  break L1;
                }
              }
              L2: {
                if (0 >= var10.field_b) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_b * ((double)param1.field_A * 0.00001953125)) * (double)var4);
                  break L2;
                }
              }
              L3: {
                if (var10.field_g == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param1.field_s;
                    var6 = var10.field_g[param1.field_g + 1];
                    if (param1.field_g >= var10.field_g.length - 2) {
                      break L4;
                    } else {
                      var7 = 65280 & var9.field_g[param1.field_g] << 8;
                      var8 = (var10.field_g[2 + param1.field_g] & 255) << 8;
                      var6 = var6 + (var5 - var7) * (-var6 + var10.field_g[param1.field_g + 3]) / (-var7 + var8);
                      break L4;
                    }
                  }
                  var4 = var4 * var6 + 32 >> 6;
                  break L3;
                }
              }
              L5: {
                if (0 >= param1.field_p) {
                  break L5;
                } else {
                  if (var10.field_e != null) {
                    L6: {
                      var5 = param1.field_p;
                      var6 = var10.field_e[param1.field_k - -1];
                      if (~param1.field_k > ~(var10.field_e.length - 2)) {
                        var7 = (255 & var9.field_e[param1.field_k]) << 8;
                        var8 = (255 & var10.field_e[param1.field_k - -2]) << 8;
                        var6 = var6 + (-var6 + var10.field_e[param1.field_k + 3]) * (var5 - var7) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 6;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
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
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("hk.C(").append(param0).append(44);
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
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    private final synchronized void a(int param0, boolean param1) {
        ((hk) this).field_M.d();
        ((hk) this).field_x = null;
        this.b(param1, 12705);
        if (param0 != 2097152) {
            this.a(-3, true);
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var3 = param1 & 240;
        if (var3 != 128) {
          L0: {
            if (144 == var3) {
              var4 = param1 & 15;
              var5 = 127 & param1 >> 8;
              var6 = 127 & param1 >> 16;
              if (var6 <= 0) {
                this.a(64, var5, param0 + 128, var4);
                return;
              } else {
                this.b(35, var6, var5, var4);
                break L0;
              }
            } else {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = param1 >> 8 & 127;
                var6 = (param1 & 8337132) >> 16;
                this.a(var6, (byte) 127, var4, var5);
                return;
              } else {
                L1: {
                  if (param0 == -128) {
                    break L1;
                  } else {
                    ((hk) this).field_s = null;
                    break L1;
                  }
                }
                if (var3 != 176) {
                  if (var3 != 192) {
                    if (var3 == 208) {
                      var4 = param1 & 15;
                      var5 = (32723 & param1) >> 8;
                      this.a(var4, var5, (byte) -34);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = 15 & param1;
                        var5 = (param1 >> 9 & 16256) - -(127 & param1 >> 8);
                        this.a(param0 + 255, var5, var4);
                        return;
                      } else {
                        var3 = 255 & param1;
                        if (var3 == 255) {
                          this.b(true, param0 + 12833);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var4 = 15 & param1;
                    var5 = (32710 & param1) >> 8;
                    this.a(var4, (byte) 101, ((hk) this).field_s[var4] + var5);
                    return;
                  }
                } else {
                  L2: {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> 8;
                    var6 = param1 >> 16 & 127;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      ((hk) this).field_s[var4] = pg.a(((hk) this).field_s[var4], -2080769) + (var6 << 14);
                      break L2;
                    }
                  }
                  L3: {
                    if (32 == var5) {
                      ((hk) this).field_s[var4] = pg.a(-16257, ((hk) this).field_s[var4]) + (var6 << 7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (1 != var5) {
                      break L4;
                    } else {
                      ((hk) this).field_A[var4] = pg.a(-16257, ((hk) this).field_A[var4]) + (var6 << 7);
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 == 33) {
                      ((hk) this).field_A[var4] = var6 + pg.a(((hk) this).field_A[var4], -128);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 != 5) {
                      break L6;
                    } else {
                      ((hk) this).field_r[var4] = pg.a(-16257, ((hk) this).field_r[var4]) + (var6 << 7);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 37) {
                      break L7;
                    } else {
                      ((hk) this).field_r[var4] = var6 + pg.a(((hk) this).field_r[var4], -128);
                      break L7;
                    }
                  }
                  L8: {
                    if (7 == var5) {
                      ((hk) this).field_J[var4] = pg.a(((hk) this).field_J[var4], -16257) + (var6 << 7);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 != 39) {
                      break L9;
                    } else {
                      ((hk) this).field_J[var4] = var6 + pg.a(((hk) this).field_J[var4], -128);
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 10) {
                      break L10;
                    } else {
                      ((hk) this).field_p[var4] = (var6 << 7) + pg.a(-16257, ((hk) this).field_p[var4]);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 42) {
                      break L11;
                    } else {
                      ((hk) this).field_p[var4] = var6 + pg.a(((hk) this).field_p[var4], -128);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 11) {
                      ((hk) this).field_w[var4] = (var6 << 7) + pg.a(-16257, ((hk) this).field_w[var4]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (43 != var5) {
                      break L13;
                    } else {
                      ((hk) this).field_w[var4] = var6 + pg.a(((hk) this).field_w[var4], -128);
                      break L13;
                    }
                  }
                  L14: {
                    if (64 != var5) {
                      break L14;
                    } else {
                      if (var6 < 64) {
                        ((hk) this).field_G[var4] = pg.a(((hk) this).field_G[var4], -2);
                        break L14;
                      } else {
                        ((hk) this).field_G[var4] = vo.a(((hk) this).field_G[var4], 1);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (65 == var5) {
                      if (var6 >= 64) {
                        ((hk) this).field_G[var4] = vo.a(((hk) this).field_G[var4], 2);
                        break L15;
                      } else {
                        this.a((byte) -126, var4);
                        ((hk) this).field_G[var4] = pg.a(((hk) this).field_G[var4], -3);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 == 99) {
                      ((hk) this).field_D[var4] = (var6 << 7) + pg.a(((hk) this).field_D[var4], 127);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 98) {
                      break L17;
                    } else {
                      ((hk) this).field_D[var4] = pg.a(16256, ((hk) this).field_D[var4]) - -var6;
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 101) {
                      ((hk) this).field_D[var4] = (var6 << 7) + pg.a(((hk) this).field_D[var4], 127) + 16384;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 100) {
                      break L19;
                    } else {
                      ((hk) this).field_D[var4] = pg.a(16256, ((hk) this).field_D[var4]) + 16384 + var6;
                      break L19;
                    }
                  }
                  L20: {
                    if (120 != var5) {
                      break L20;
                    } else {
                      this.b(var4, (byte) 95);
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 != 121) {
                      break L21;
                    } else {
                      this.c(var4, false);
                      break L21;
                    }
                  }
                  L22: {
                    if (123 != var5) {
                      break L22;
                    } else {
                      this.a(true, var4);
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 != 6) {
                      break L23;
                    } else {
                      var7 = ((hk) this).field_D[var4];
                      if (16384 != var7) {
                        break L23;
                      } else {
                        ((hk) this).field_B[var4] = (var6 << 7) + pg.a(((hk) this).field_B[var4], -16257);
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var5 == 38) {
                      var7 = ((hk) this).field_D[var4];
                      if (var7 != 16384) {
                        break L24;
                      } else {
                        ((hk) this).field_B[var4] = var6 + pg.a(((hk) this).field_B[var4], -128);
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 16) {
                      ((hk) this).field_z[var4] = (var6 << 7) + pg.a(((hk) this).field_z[var4], -16257);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 48) {
                      break L26;
                    } else {
                      ((hk) this).field_z[var4] = pg.a(-128, ((hk) this).field_z[var4]) + var6;
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 81) {
                      if (64 > var6) {
                        this.a(var4, (byte) 4);
                        ((hk) this).field_G[var4] = pg.a(((hk) this).field_G[var4], -5);
                        break L27;
                      } else {
                        ((hk) this).field_G[var4] = vo.a(((hk) this).field_G[var4], 4);
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (var5 == 17) {
                      this.c(var4, (((hk) this).field_o[var4] & -16257) + (var6 << 7), 3830);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.c(var4, var6 + (-128 & ((hk) this).field_o[var4]), param0 ^ -3722);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = 15 & param1;
          var5 = (param1 & 32672) >> 8;
          var6 = (8343301 & param1) >> 16;
          this.a(var6, var5, 0, var4);
          return;
        }
    }

    private final int b(byte param0, ft param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        dh var4 = null;
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
              var3_int = (param1.field_u * param1.field_q >> 12) + param1.field_w;
              var3_int = var3_int + (((hk) this).field_B[param1.field_m] * (-8192 + ((hk) this).field_N[param1.field_m]) >> 12);
              var4 = param1.field_r;
              if (param0 <= -56) {
                break L1;
              } else {
                this.b(-101, (byte) 115);
                break L1;
              }
            }
            L2: {
              if (var4.field_i <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_j > 0) {
                    break L3;
                  } else {
                    if (((hk) this).field_A[param1.field_m] <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_j << 2;
                  var6 = var4.field_a << 1;
                  if (~param1.field_j > ~var6) {
                    var5 = param1.field_j * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((hk) this).field_A[param1.field_m] >> 7);
                var7 = Math.sin((double)(511 & param1.field_z) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_x.field_i) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)tk.field_f + 0.5);
              if (1 <= var5) {
                stackOut_12_0 = var5;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = 1;
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
            stackOut_14_1 = new StringBuilder().append("hk.LA(").append(param0).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final boolean a(int param0, int param1, boolean param2, ft param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_i = tk.field_f / 100;
              if (0 > param3.field_p) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_e) {
                    break L2;
                  } else {
                    if (param3.field_e.f()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.a(11821);
                  param3.c(-127);
                  if (param3.field_f <= 0) {
                    break L3;
                  } else {
                    if (param3 == ((hk) this).field_K[param3.field_m][param3.field_f]) {
                      ((hk) this).field_K[param3.field_m][param3.field_f] = null;
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
            L4: {
              var6_int = param3.field_q;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)((hk) this).field_r[param3.field_m] * 0.0004921259842519685) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_q = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_e.g(this.b((byte) -76, param3));
              var7 = param3.field_r;
              param3.field_j = param3.field_j + 1;
              var8 = param2 ? 1 : 0;
              param3.field_z = param3.field_z + var7.field_i;
              var9 = 0.000005086263020833333 * (double)((param3.field_n + -60 << 8) - -(param3.field_q * param3.field_u >> 12));
              if (var7.field_b <= 0) {
                break L6;
              } else {
                L7: {
                  if (var7.field_f <= 0) {
                    param3.field_A = param3.field_A + 128;
                    break L7;
                  } else {
                    param3.field_A = param3.field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
                    break L7;
                  }
                }
                if (819200 > var7.field_b * param3.field_A) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L8: {
              if (var7.field_g == null) {
                break L8;
              } else {
                L9: {
                  if (0 < var7.field_h) {
                    param3.field_s = param3.field_s + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_h * var9));
                    break L9;
                  } else {
                    param3.field_s = param3.field_s + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (~param3.field_g <= ~(-2 + var7.field_g.length)) {
                      break L11;
                    } else {
                      if (~((255 & var7.field_g[2 + param3.field_g]) << 8) <= ~param3.field_s) {
                        break L11;
                      } else {
                        param3.field_g = param3.field_g + 2;
                        continue L10;
                      }
                    }
                  }
                  if (param3.field_g != var7.field_g.length + -2) {
                    break L8;
                  } else {
                    if (var7.field_g[param3.field_g + 1] == 0) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (0 > param3.field_p) {
                break L12;
              } else {
                if (var7.field_e == null) {
                  break L12;
                } else {
                  if (0 != (1 & ((hk) this).field_G[param3.field_m])) {
                    break L12;
                  } else {
                    L13: {
                      if (param3.field_f < 0) {
                        break L13;
                      } else {
                        if (param3 == ((hk) this).field_K[param3.field_m][param3.field_f]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (var7.field_l > 0) {
                        param3.field_p = param3.field_p + (int)(Math.pow(2.0, (double)var7.field_l * var9) * 128.0 + 0.5);
                        break L14;
                      } else {
                        param3.field_p = param3.field_p + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (~(-2 + var7.field_e.length) >= ~param3.field_k) {
                          break L16;
                        } else {
                          if (~param3.field_p >= ~(65280 & var7.field_e[param3.field_k - -2] << 8)) {
                            break L16;
                          } else {
                            param3.field_k = param3.field_k + 2;
                            continue L15;
                          }
                        }
                      }
                      if (~(-2 + var7.field_e.length) == ~param3.field_k) {
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
              param3.field_e.a(param3.field_i, this.a((byte) -67, param3), this.b(67, param3));
              stackOut_62_0 = 0;
              stackIn_63_0 = stackOut_62_0;
              break L0;
            } else {
              L17: {
                param3.field_e.h(param3.field_i);
                if (param4 != null) {
                  param3.field_e.b(param4, param1, param0);
                  break L17;
                } else {
                  param3.field_e.a(param0);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_e.j()) {
                  break L18;
                } else {
                  ((hk) this).field_L.field_i.b((rf) (Object) param3.field_e);
                  break L18;
                }
              }
              L19: {
                param3.a(11821);
                if (param3.field_p >= 0) {
                  param3.c(-123);
                  if (param3.field_f <= 0) {
                    break L19;
                  } else {
                    if (((hk) this).field_K[param3.field_m][param3.field_f] == param3) {
                      ((hk) this).field_K[param3.field_m][param3.field_f] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L19;
                }
              }
              stackOut_60_0 = 1;
              stackIn_61_0 = stackOut_60_0;
              return stackIn_61_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var6;
            stackOut_64_1 = new StringBuilder().append("hk.CA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L20;
            }
          }
          L21: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 41);
        }
        return stackIn_63_0 != 0;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        this.b(2993, param0, param2);
    }

    public static void e(int param0) {
        field_i = null;
    }

    final synchronized boolean f(int param0) {
        if (param0 != 32119) {
            ((hk) this).field_z = null;
        }
        return ((hk) this).field_M.c();
    }

    private final void b(int param0, int param1, int param2) {
        ((hk) this).field_F[param2] = param1;
        ((hk) this).field_s[param2] = pg.a(-128, param1);
        this.a(param2, (byte) 100, param1);
        if (param0 != 2993) {
            this.a(-27, (byte) -89, -25);
        }
    }

    private final void b(int param0, byte param1) {
        ft var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param1 > 65) {
                break L1;
              } else {
                ((hk) this).field_w = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if (var3.field_m != param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var3.field_e != null) {
                  L5: {
                    var3.field_e.h(tk.field_f / 100);
                    if (!var3.field_e.j()) {
                      break L5;
                    } else {
                      ((hk) this).field_L.field_i.b((rf) (Object) var3.field_e);
                      break L5;
                    }
                  }
                  var3.a(11821);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (var3.field_p >= 0) {
                  break L6;
                } else {
                  ((hk) this).field_E[var3.field_m][var3.field_n] = null;
                  break L6;
                }
              }
              var3.c(-124);
              break L2;
            }
            var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
            continue L0;
          }
        }
    }

    private final void a(int param0, byte param1) {
        ft var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param1 != 4) {
            Object var5 = null;
            boolean discarded$0 = ((hk) this).a(6, 126, (ap) null, (gk) null, (ob) null);
        }
        if (0 != (4 & ((hk) this).field_G[param0])) {
            var3 = (ft) (Object) ((hk) this).field_L.field_k.d(268435455);
            while (var3 != null) {
                if (~var3.field_m == ~param0) {
                    var3.field_t = 0;
                }
                var3 = (ft) (Object) ((hk) this).field_L.field_k.b((byte) 103);
            }
        }
    }

    public hk() {
        ((hk) this).field_r = new int[16];
        ((hk) this).field_A = new int[16];
        ((hk) this).field_F = new int[16];
        ((hk) this).field_w = new int[16];
        ((hk) this).field_p = new int[16];
        ((hk) this).field_B = new int[16];
        ((hk) this).field_o = new int[16];
        ((hk) this).field_D = new int[16];
        ((hk) this).field_t = 256;
        ((hk) this).field_m = new int[16];
        ((hk) this).field_z = new int[16];
        ((hk) this).field_G = new int[16];
        ((hk) this).field_K = new ft[16][128];
        ((hk) this).field_N = new int[16];
        ((hk) this).field_J = new int[16];
        ((hk) this).field_l = new int[16];
        ((hk) this).field_s = new int[16];
        ((hk) this).field_E = new ft[16][128];
        ((hk) this).field_I = new int[16];
        ((hk) this).field_C = 1000000;
        ((hk) this).field_M = new k();
        ((hk) this).field_L = new um((hk) this);
        ((hk) this).field_n = new ph(128);
        ((hk) this).a((byte) -122, 256, -1);
        this.b(true, 12705);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
    }
}
