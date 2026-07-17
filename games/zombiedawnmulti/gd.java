/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends gq {
    private int[] field_C;
    static me field_Q;
    private mb[][] field_O;
    private int field_r;
    private int field_N;
    private int[] field_m;
    int[] field_n;
    private int[] field_w;
    private mb[][] field_t;
    private int[] field_k;
    private int[] field_j;
    private int[] field_x;
    private int[] field_z;
    private int[] field_E;
    private int[] field_u;
    private int[] field_D;
    static int field_B;
    private f field_G;
    int[] field_H;
    private int[] field_J;
    int[] field_y;
    private int[] field_K;
    private int[] field_v;
    private mm field_p;
    private ba field_P;
    private long field_l;
    private boolean field_L;
    private long field_A;
    private int field_q;
    private int field_I;
    private boolean field_F;
    private int field_o;
    private ug field_s;

    final synchronized void a(int param0, byte param1) {
        ((gd) this).field_N = param0;
        if (param1 != 116) {
            ((gd) this).a(113);
        }
    }

    final static void a(boolean param0, int param1, ja[] param2) {
        RuntimeException var3 = null;
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
              dd.field_f[param1] = param2;
              dd.field_f[param1][dd.field_f[param1].length - 2].a();
              if (he.field_a) {
                break L1;
              } else {
                oo.b();
                break L1;
              }
            }
            L2: {
              if (param0) {
                field_B = 38;
                dl.field_h.b((byte) 107);
                break L2;
              } else {
                dl.field_h.b((byte) 107);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gd.Q(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static bm a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        bm stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 90000;
            var3 = 10;
            var4 = 0;
            var5 = new byte[param0.length + 12];
            br.a(0, var5, -127, re.a(param0, 0, (byte) 71));
            br.a(1, var5, -80, var4);
            br.a(2, var5, -118, var2_int);
            br.a(3, var5, -91, var3);
            var6 = 1;
            L1: while (true) {
              if (var6 >= param0.length / 4) {
                stackOut_6_0 = ij.a(var5, 7);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                br.a(3 + var6, var5, -127, re.a(param0, var6, (byte) 53));
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("gd.N(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 46 + 41);
        }
        return stackIn_7_0;
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -116) {
            return;
        }
        ((gd) this).field_r = param1;
    }

    public static void e(int param0) {
        if (param0 != 0) {
            gd.e(70);
        }
        field_Q = null;
    }

    private final void b(int param0, byte param1) {
        mb var3_ref_mb = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if ((((gd) this).field_H[param0] & 2) != 0) {
            var3_ref_mb = (mb) (Object) ((gd) this).field_P.field_k.c(109);
            L1: while (true) {
              if (var3_ref_mb == null) {
                break L0;
              } else {
                L2: {
                  if (var3_ref_mb.field_o != param0) {
                    break L2;
                  } else {
                    if (((gd) this).field_O[param0][var3_ref_mb.field_p] == null) {
                      if (var3_ref_mb.field_l < 0) {
                        var3_ref_mb.field_l = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3_ref_mb = (mb) (Object) ((gd) this).field_P.field_k.b(6);
                      continue L1;
                    }
                  }
                }
                var3_ref_mb = (mb) (Object) ((gd) this).field_P.field_k.b(6);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var3 = -45 % ((param1 - -10) / 54);
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
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((gd) this).field_p.b()) {
                  break L2;
                } else {
                  var4_int = ((gd) this).field_r * ((gd) this).field_p.field_g / gp.field_p;
                  L3: while (true) {
                    var5 = (long)var4_int * (long)param2 + ((gd) this).field_A;
                    if (((gd) this).field_l - var5 < 0L) {
                      var7 = (int)((-1L + (long)var4_int + -((gd) this).field_A + ((gd) this).field_l) / (long)var4_int);
                      ((gd) this).field_A = ((gd) this).field_A + (long)var7 * (long)var4_int;
                      ((gd) this).field_P.b(param0, param1, var7);
                      this.f(113);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (((gd) this).field_p.b()) {
                        continue L3;
                      } else {
                        ((gd) this).field_P.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((gd) this).field_A = var5;
                      break L2;
                    }
                  }
                }
              }
              ((gd) this).field_P.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("gd.F(");
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
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param0 != -1) {
            int discarded$0 = ((gd) this).a();
        }
    }

    final void a(boolean param0, byte param1, mb param2) {
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
              L2: {
                var4_int = param2.field_f.field_h.length;
                if (!param0) {
                  break L2;
                } else {
                  if (!param2.field_f.field_i) {
                    break L2;
                  } else {
                    var6 = -param2.field_f.field_j + var4_int - -var4_int;
                    var5 = (int)((long)((gd) this).field_y[param2.field_o] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      var5 = -1 + (var4_int + (var4_int + -var5));
                      param2.field_C.b(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)((gd) this).field_y[param2.field_o] * (long)var4_int >> 6);
              break L1;
            }
            L3: {
              if (param1 < -64) {
                break L3;
              } else {
                int discarded$1 = gd.a(43, (byte) -76, 101);
                break L3;
              }
            }
            param2.field_C.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("gd.R(").append(param0).append(44).append(param1).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          var3 = 54 % ((param0 - 41) / 56);
          var2 = ((gd) this).field_q;
          var4 = ((gd) this).field_I;
          var5 = ((gd) this).field_l;
          if (((gd) this).field_s == null) {
            break L0;
          } else {
            if (((gd) this).field_o == var4) {
              this.a(((gd) this).field_F, 8695, ((gd) this).field_s, ((gd) this).field_L);
              this.f(-106);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((gd) this).field_I != var4) {
            L2: {
              ((gd) this).field_q = var2;
              ((gd) this).field_l = var5;
              ((gd) this).field_I = var4;
              if (null == ((gd) this).field_s) {
                break L2;
              } else {
                if (((gd) this).field_o >= var4) {
                  break L2;
                } else {
                  ((gd) this).field_q = -1;
                  ((gd) this).field_I = ((gd) this).field_o;
                  ((gd) this).field_l = ((gd) this).field_p.f(((gd) this).field_I);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (var4 != ((gd) this).field_p.field_h[var2]) {
                  break L4;
                } else {
                  ((gd) this).field_p.b(var2);
                  var7 = ((gd) this).field_p.a(var2);
                  if (var7 == 1) {
                    ((gd) this).field_p.e();
                    ((gd) this).field_p.e(var2);
                    if (((gd) this).field_p.c()) {
                      if (null == ((gd) this).field_s) {
                        L5: {
                          if (!((gd) this).field_L) {
                            break L5;
                          } else {
                            if (0 != var4) {
                              ((gd) this).field_p.a(var5);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.b(-1, true);
                        ((gd) this).field_p.f();
                        return;
                      } else {
                        ((gd) this).a(((gd) this).field_s, ((gd) this).field_L, 8361407);
                        this.f(99);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if ((var7 & 128) != 0) {
                        this.a(-5777, var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((gd) this).field_p.d(var2);
                    ((gd) this).field_p.e(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((gd) this).field_p.a();
              var4 = ((gd) this).field_p.field_h[var2];
              var5 = ((gd) this).field_p.f(var4);
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1) {
            this.c(-1, 0);
        } else {
            this.a(-1, true);
        }
        this.d(86, param0);
        for (var3 = 0; var3 < 16; var3++) {
            ((gd) this).field_C[var3] = ((gd) this).field_j[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((gd) this).field_z[var5] = tq.b(((gd) this).field_j[var5], -128);
            var5++;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        mb var5 = null;
        jd var6 = null;
        int var6_int = 0;
        mb var7 = null;
        mb var8 = null;
        int var9 = 0;
        Object var10 = null;
        po var11 = null;
        po var12 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          this.b(param0, param3, 64, 101);
          if (0 != (2 & ((gd) this).field_H[param3])) {
            var5 = (mb) (Object) ((gd) this).field_P.field_k.a((byte) 74);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_o) {
                    break L2;
                  } else {
                    if (var5.field_l < 0) {
                      ((gd) this).field_O[param3][var5.field_p] = null;
                      ((gd) this).field_O[param3][param0] = var5;
                      var6_int = var5.field_z - -(var5.field_t * var5.field_r >> 12);
                      var5.field_z = var5.field_z + (-var5.field_p + param0 << 8);
                      var5.field_r = -var5.field_z + var6_int;
                      var5.field_p = param0;
                      var5.field_t = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (mb) (Object) ((gd) this).field_P.field_k.c((byte) 121);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (po) (Object) ((gd) this).field_G.a(0, (long)((gd) this).field_C[param3]);
        var12 = var11;
        if (var12 != null) {
          var6 = var11.field_s[param0];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new mb();
              var7.field_x = var12;
              var7.field_f = var6;
              var7.field_o = param3;
              var7.field_h = var11.field_q[param0];
              var7.field_m = var11.field_m[param0];
              var7.field_p = param0;
              var7.field_v = 1024 + var11.field_h[param0] * param2 * (param2 * var12.field_o) >> 11;
              var7.field_E = 255 & var11.field_j[param0];
              var7.field_z = (param0 << 8) - (var11.field_g[param0] & 32767);
              var7.field_A = 0;
              var7.field_i = 0;
              var7.field_y = 0;
              var7.field_l = -1;
              var7.field_q = 0;
              if (((gd) this).field_y[param3] == 0) {
                var7.field_C = uj.a(var6, this.b(var7, -916428895), this.a((byte) 92, var7), this.a(var7, 81682502));
                break L3;
              } else {
                L4: {
                  var7.field_C = uj.a(var6, this.b(var7, -916428895), 0, this.a(var7, 81682502));
                  stackOut_15_0 = this;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (var11.field_g[param0] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L4;
                  }
                }
                ((gd) this).a(stackIn_18_1 != 0, (byte) -107, var7);
                break L3;
              }
            }
            L5: {
              if (0 <= var11.field_g[param0]) {
                break L5;
              } else {
                var7.field_C.g(-1);
                break L5;
              }
            }
            L6: {
              if (0 <= var7.field_m) {
                L7: {
                  var8 = ((gd) this).field_t[param3][var7.field_m];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (0 > var8.field_l) {
                      ((gd) this).field_O[param3][var8.field_p] = null;
                      var8.field_l = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((gd) this).field_t[param3][var7.field_m] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (param1 == 4445) {
                break L8;
              } else {
                var10 = null;
                this.a(true, 70, (ug) null, true);
                break L8;
              }
            }
            ((gd) this).field_P.field_k.a((br) (Object) var7, false);
            ((gd) this).field_O[param3][param0] = var7;
            return;
          }
        } else {
          return;
        }
    }

    private final int a(byte param0, mb param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nj var10 = null;
        nj var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (0 != ((gd) this).field_m[param1.field_o]) {
              L1: {
                var10 = param1.field_h;
                var11 = var10;
                var4 = ((gd) this).field_v[param1.field_o] * ((gd) this).field_E[param1.field_o] + 4096 >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = param1.field_v * var4 + 16384 >> 15;
                var4 = 128 + var4 * ((gd) this).field_N >> 8;
                var4 = 128 + var4 * ((gd) this).field_m[param1.field_o] >> 8;
                if (var11.field_b > 0) {
                  var4 = (int)(Math.pow(0.5, 0.00001953125 * (double)param1.field_i * (double)var11.field_b) * (double)var4 + 0.5);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var11.field_l) {
                  break L2;
                } else {
                  L3: {
                    var5 = param1.field_A;
                    var6 = var11.field_l[1 + param1.field_q];
                    if (param1.field_q >= -2 + var11.field_l.length) {
                      break L3;
                    } else {
                      var7 = var10.field_l[param1.field_q] << 8 & 65280;
                      var8 = 65280 & var11.field_l[2 + param1.field_q] << 8;
                      var6 = var6 + (-var6 + var11.field_l[param1.field_q - -3]) * (var5 + -var7) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = 32 + var6 * var4 >> 6;
                  break L2;
                }
              }
              L4: {
                var5 = 91 / ((param0 - 40) / 47);
                if (0 >= param1.field_l) {
                  break L4;
                } else {
                  if (var11.field_e == null) {
                    break L4;
                  } else {
                    L5: {
                      var6 = param1.field_l;
                      var7 = var11.field_e[param1.field_y - -1];
                      if (var11.field_e.length + -2 <= param1.field_y) {
                        break L5;
                      } else {
                        var8 = 65280 & var10.field_e[param1.field_y] << 8;
                        var9 = (var11.field_e[2 + param1.field_y] & 255) << 8;
                        var7 = var7 + (-var8 + var6) * (var11.field_e[3 + param1.field_y] + -var7) / (var9 - var8);
                        break L5;
                      }
                    }
                    var4 = 32 + var7 * var4 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_15_0 = var4;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("gd.DA(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_16_0;
    }

    private final int b(mb param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nj var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
        int stackOut_9_0 = 0;
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
              var3_int = (param0.field_r * param0.field_t >> 12) + param0.field_z;
              var3_int = var3_int + (((gd) this).field_D[param0.field_o] * (-8192 + ((gd) this).field_u[param0.field_o]) >> 12);
              var4 = param0.field_h;
              if (0 >= var4.field_k) {
                break L1;
              } else {
                L2: {
                  if (var4.field_g > 0) {
                    break L2;
                  } else {
                    if (0 >= ((gd) this).field_K[param0.field_o]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_g << 2;
                  var6 = var4.field_j << 1;
                  if (param0.field_B < var6) {
                    var5 = var5 * param0.field_B / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((gd) this).field_K[param0.field_o] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param0.field_s));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              var5 = (int)(0.5 + (double)(param0.field_f.field_g * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)gp.field_p);
              if (var5 >= 1) {
                stackOut_10_0 = var5;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("gd.W(");
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -916428895 + 41);
        }
        return stackIn_11_0;
    }

    private final void a(int param0, boolean param1) {
        mb var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (mb) (Object) ((gd) this).field_P.field_k.c(124);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (param0 != var3.field_o) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (0 <= var3.field_l) {
                break L1;
              } else {
                ((gd) this).field_O[var3.field_o][var3.field_p] = null;
                var3.field_l = 0;
                break L1;
              }
            }
            var3 = (mb) (Object) ((gd) this).field_P.field_k.b(6);
            continue L0;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        mb var7 = null;
        int var8 = 0;
        mb var9 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var9 = ((gd) this).field_O[param1][param0];
        if (var9 != null) {
          L0: {
            ((gd) this).field_O[param1][param0] = null;
            var6 = 70 % ((-23 - param3) / 53);
            if ((((gd) this).field_H[param1] & 2) == 0) {
              var9.field_l = 0;
              break L0;
            } else {
              var7 = (mb) (Object) ((gd) this).field_P.field_k.c(74);
              L1: while (true) {
                if (var7 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var9.field_o != var7.field_o) {
                      break L2;
                    } else {
                      if (var7.field_l >= 0) {
                        break L2;
                      } else {
                        if (var7 == var9) {
                          break L2;
                        } else {
                          var9.field_l = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var7 = (mb) (Object) ((gd) this).field_P.field_k.b(6);
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void g(int param0) {
        this.b(true, -82);
        if (param0 != 2) {
            field_B = -55;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -13961) {
            ((gd) this).a(-64, (byte) 120);
        }
        if (((gd) this).field_C[param2] != param1) {
            ((gd) this).field_C[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((gd) this).field_t[param2][var4] = null;
            }
        }
    }

    final synchronized gq b() {
        return (gq) (Object) ((gd) this).field_P;
    }

    private final synchronized void b(boolean param0, int param1) {
        ((gd) this).field_p.f();
        ((gd) this).field_s = null;
        this.b(-1, param0);
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 != 15) {
            Object var5 = null;
            this.a(false, -75, (ug) null, false);
        }
        ((gd) this).field_x[param1] = param2;
        ((gd) this).field_n[param1] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    final synchronized void f(int param0, int param1, int param2) {
        if (param1 != 15) {
            ((gd) this).field_O = null;
        }
        this.c(param0, 16532, param2);
    }

    private final int a(mb param0, int param1) {
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
            var3_int = ((gd) this).field_J[param0.field_o];
            if (var3_int < 8192) {
              stackOut_3_0 = 32 + var3_int * param0.field_E >> 6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -(32 + (128 + -param0.field_E) * (-var3_int + 16384) >> 6) + 16384;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gd.GA(");
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
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 81682502 + 41);
        }
        return stackIn_4_0;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = -1 + param2 & param0 >> 31;
        int var4 = 21 % ((param1 - -9) / 59);
        return var3 + (param0 - -(param0 >>> 31)) % param2;
    }

    final synchronized boolean a(int param0, me param1, int param2, ug param3, ul param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        kg var8 = null;
        int var9 = 0;
        po var10 = null;
        int var11 = 0;
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
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (0 < param2) {
                var7 = (Object) (Object) new int[]{param2};
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == -10783) {
                break L2;
              } else {
                ((gd) this).field_x = null;
                break L2;
              }
            }
            var8 = (kg) (Object) param3.field_f.a(0);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int != 0) {
                    param3.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_20_0 = var6_int;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = (int)var8.field_e;
                    var10 = (po) (Object) ((gd) this).field_G.a(param0 ^ -10783, (long)var9);
                    if (var10 != null) {
                      break L6;
                    } else {
                      var10 = r.a(param4, var9, (byte) 15);
                      if (var10 == null) {
                        var6_int = 0;
                        break L5;
                      } else {
                        ((gd) this).field_G.a(true, (long)var9, (br) (Object) var10);
                        break L6;
                      }
                    }
                  }
                  if (!var10.a(param1, param0 ^ -10840, var8.field_h, (int[]) var7)) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var8 = (kg) (Object) param3.field_f.b(-118);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6;
            stackOut_22_1 = new StringBuilder().append("gd.P(").append(param0).append(44);
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
          L9: {
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
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    private final void a(int param0, int param1, int param2) {
        ((gd) this).field_u[param2] = param1;
        if (param0 != -1) {
            ((gd) this).d(25);
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        if (param2 != 26739) {
            this.c(11, 71);
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void c(int param0, int param1) {
        mb var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = (mb) (Object) ((gd) this).field_P.field_k.c(69);
        if (param1 == 0) {
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
                  if (var3.field_C == null) {
                    break L3;
                  } else {
                    L4: {
                      var3.field_C.e(gp.field_p / 100);
                      if (!var3.field_C.j()) {
                        break L4;
                      } else {
                        ((gd) this).field_P.field_o.b((gq) (Object) var3.field_C);
                        break L4;
                      }
                    }
                    var3.a((byte) 71);
                    break L3;
                  }
                }
                L5: {
                  if (var3.field_l >= 0) {
                    break L5;
                  } else {
                    ((gd) this).field_O[var3.field_o][var3.field_p] = null;
                    break L5;
                  }
                }
                var3.a(true);
                break L1;
              }
              var3 = (mb) (Object) ((gd) this).field_P.field_k.b(6);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final synchronized void a(boolean param0, int param1, ug param2, boolean param3) {
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        this.b(param0, -82);
        ((gd) this).field_p.a(param2.field_g);
        ((gd) this).field_L = param3 ? true : false;
        ((gd) this).field_A = 0L;
        int var5_int = ((gd) this).field_p.g();
        for (var6 = 0; var5_int > var6; var6++) {
            ((gd) this).field_p.b(var6);
            ((gd) this).field_p.d(var6);
            ((gd) this).field_p.e(var6);
        }
        ((gd) this).field_q = ((gd) this).field_p.a();
        ((gd) this).field_I = ((gd) this).field_p.field_h[((gd) this).field_q];
        if (param1 != 8695) {
            return;
        }
        try {
            ((gd) this).field_l = ((gd) this).field_p.f(((gd) this).field_I);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "gd.LA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = (32716 & param1) >> 8;
          var6 = (param1 & 8359189) >> 16;
          this.b(var5, var4, var6, param0 + 5856);
          return;
        } else {
          if (144 != var3) {
            L0: {
              if (param0 == -5777) {
                break L0;
              } else {
                ((gd) this).field_E = null;
                break L0;
              }
            }
            if (var3 == 160) {
              var4 = param1 & 15;
              var5 = (param1 & 32734) >> 8;
              var6 = param1 >> 16 & 127;
              this.c(var4, var5, 26739, var6);
              return;
            } else {
              if (var3 == 176) {
                L1: {
                  var4 = param1 & 15;
                  var5 = param1 >> 8 & 127;
                  var6 = (param1 & 8361407) >> 16;
                  if (0 != var5) {
                    break L1;
                  } else {
                    ((gd) this).field_z[var4] = tq.b(((gd) this).field_z[var4], -2080769) - -(var6 << 14);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 32) {
                    break L2;
                  } else {
                    ((gd) this).field_z[var4] = (var6 << 7) + tq.b(((gd) this).field_z[var4], -16257);
                    break L2;
                  }
                }
                L3: {
                  if (var5 == 1) {
                    ((gd) this).field_K[var4] = (var6 << 7) + tq.b(((gd) this).field_K[var4], -16257);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 33) {
                    ((gd) this).field_K[var4] = var6 + tq.b(((gd) this).field_K[var4], -128);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (5 != var5) {
                    break L5;
                  } else {
                    ((gd) this).field_k[var4] = (var6 << 7) + tq.b(-16257, ((gd) this).field_k[var4]);
                    break L5;
                  }
                }
                L6: {
                  if (var5 == 37) {
                    ((gd) this).field_k[var4] = tq.b(-128, ((gd) this).field_k[var4]) + var6;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var5 != 7) {
                    break L7;
                  } else {
                    ((gd) this).field_E[var4] = tq.b(-16257, ((gd) this).field_E[var4]) - -(var6 << 7);
                    break L7;
                  }
                }
                L8: {
                  if (var5 != 39) {
                    break L8;
                  } else {
                    ((gd) this).field_E[var4] = var6 + tq.b(-128, ((gd) this).field_E[var4]);
                    break L8;
                  }
                }
                L9: {
                  if (var5 == 10) {
                    ((gd) this).field_J[var4] = (var6 << 7) + tq.b(((gd) this).field_J[var4], -16257);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var5 != 42) {
                    break L10;
                  } else {
                    ((gd) this).field_J[var4] = var6 + tq.b(-128, ((gd) this).field_J[var4]);
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 11) {
                    ((gd) this).field_v[var4] = (var6 << 7) + tq.b(-16257, ((gd) this).field_v[var4]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (43 != var5) {
                    break L12;
                  } else {
                    ((gd) this).field_v[var4] = var6 + tq.b(((gd) this).field_v[var4], -128);
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 64) {
                    break L13;
                  } else {
                    if (64 > var6) {
                      ((gd) this).field_H[var4] = tq.b(((gd) this).field_H[var4], -2);
                      break L13;
                    } else {
                      ((gd) this).field_H[var4] = cr.b(((gd) this).field_H[var4], 1);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (var5 != 65) {
                    break L14;
                  } else {
                    if (64 > var6) {
                      this.b(var4, (byte) -83);
                      ((gd) this).field_H[var4] = tq.b(((gd) this).field_H[var4], -3);
                      break L14;
                    } else {
                      ((gd) this).field_H[var4] = cr.b(((gd) this).field_H[var4], 2);
                      break L14;
                    }
                  }
                }
                L15: {
                  if (var5 != 99) {
                    break L15;
                  } else {
                    ((gd) this).field_w[var4] = (var6 << 7) + tq.b(((gd) this).field_w[var4], 127);
                    break L15;
                  }
                }
                L16: {
                  if (98 == var5) {
                    ((gd) this).field_w[var4] = tq.b(16256, ((gd) this).field_w[var4]) + var6;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var5 == 101) {
                    ((gd) this).field_w[var4] = (var6 << 7) + (tq.b(127, ((gd) this).field_w[var4]) + 16384);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var5 == 100) {
                    ((gd) this).field_w[var4] = 16384 + (tq.b(((gd) this).field_w[var4], 16256) + var6);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var5 == 120) {
                    this.c(var4, 0);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 121) {
                    this.d(param0 + 5855, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 == 123) {
                    this.a(var4, true);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (var5 != 6) {
                    break L22;
                  } else {
                    var7 = ((gd) this).field_w[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      ((gd) this).field_D[var4] = tq.b(((gd) this).field_D[var4], -16257) - -(var6 << 7);
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var5 != 38) {
                    break L23;
                  } else {
                    var7 = ((gd) this).field_w[var4];
                    if (var7 != 16384) {
                      break L23;
                    } else {
                      ((gd) this).field_D[var4] = var6 + tq.b(((gd) this).field_D[var4], -128);
                      break L23;
                    }
                  }
                }
                L24: {
                  if (var5 != 16) {
                    break L24;
                  } else {
                    ((gd) this).field_y[var4] = tq.b(-16257, ((gd) this).field_y[var4]) - -(var6 << 7);
                    break L24;
                  }
                }
                L25: {
                  if (var5 == 48) {
                    ((gd) this).field_y[var4] = tq.b(-128, ((gd) this).field_y[var4]) + var6;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 81) {
                    if (var6 >= 64) {
                      ((gd) this).field_H[var4] = cr.b(((gd) this).field_H[var4], 4);
                      break L26;
                    } else {
                      this.b(param0 + -24973, var4);
                      ((gd) this).field_H[var4] = tq.b(((gd) this).field_H[var4], -5);
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 != 17) {
                    break L27;
                  } else {
                    this.b(15, var4, (var6 << 7) + (((gd) this).field_x[var4] & -16257));
                    break L27;
                  }
                }
                L28: {
                  if (var5 == 49) {
                    this.b(param0 + 5792, var4, var6 + (((gd) this).field_x[var4] & -128));
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              } else {
                if (var3 == 192) {
                  var4 = param1 & 15;
                  var5 = (32693 & param1) >> 8;
                  this.e(-13961, var5 + ((gd) this).field_z[var4], var4);
                  return;
                } else {
                  if (var3 == 208) {
                    var4 = 15 & param1;
                    var5 = param1 >> 8 & 127;
                    this.d(-1, var5, var4);
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
                      var5 = ((param1 & 8323368) >> 9) + (127 & param1 >> 8);
                      this.a(-1, var5, var4);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var4 = param1 & 15;
            var5 = 127 & param1 >> 8;
            var6 = (param1 & 8329586) >> 16;
            if (0 >= var6) {
              this.b(var5, var4, 64, param0 ^ 5876);
              return;
            } else {
              this.a(var5, 4445, var6, var4);
              return;
            }
          }
        }
    }

    final synchronized void a(ug param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(true, 8695, param0, param1);
              if (param2 == 8361407) {
                break L1;
              } else {
                this.c(-40, -4);
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
            stackOut_3_1 = new StringBuilder().append("gd.T(");
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
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void b(int param0, int param1) {
        mb var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -30750) {
            this.b(-109, (byte) -67);
        }
        if ((4 & ((gd) this).field_H[param1]) != 0) {
            var3 = (mb) (Object) ((gd) this).field_P.field_k.c(69);
            while (var3 != null) {
                if (!(var3.field_o != param1)) {
                    var3.field_w = 0;
                }
                var3 = (mb) (Object) ((gd) this).field_P.field_k.b(6);
            }
        }
    }

    final synchronized void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          if (0 <= param1) {
            ((gd) this).field_m[param1] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (16 <= var4) {
                break L0;
              } else {
                ((gd) this).field_m[var4] = param0;
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
            ((gd) this).field_I = 3;
            break L2;
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            if (!((gd) this).field_p.b()) {
              break L1;
            } else {
              var2 = ((gd) this).field_p.field_g * ((gd) this).field_r / gp.field_p;
              L2: while (true) {
                var3 = ((gd) this).field_A - -((long)param0 * (long)var2);
                if (-var3 + ((gd) this).field_l < 0L) {
                  var5 = (int)((-((gd) this).field_A + ((gd) this).field_l + (long)var2 + -1L) / (long)var2);
                  ((gd) this).field_A = ((gd) this).field_A + (long)var2 * (long)var5;
                  ((gd) this).field_P.a(var5);
                  param0 = param0 - var5;
                  this.f(-20);
                  if (((gd) this).field_p.b()) {
                    continue L2;
                  } else {
                    ((gd) this).field_P.a(param0);
                    break L0;
                  }
                } else {
                  ((gd) this).field_A = var3;
                  break L1;
                }
              }
            }
          }
          ((gd) this).field_P.a(param0);
          break L0;
        }
    }

    final boolean a(int param0, mb param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == -1) {
              if (null != param1.field_C) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L1: {
                  if (0 > param1.field_l) {
                    break L1;
                  } else {
                    param1.a(true);
                    if (param1.field_m <= 0) {
                      break L1;
                    } else {
                      if (((gd) this).field_t[param1.field_o][param1.field_m] != param1) {
                        break L1;
                      } else {
                        ((gd) this).field_t[param1.field_o][param1.field_m] = null;
                        return true;
                      }
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("gd.FA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final synchronized void d(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        po var4 = (po) (Object) ((gd) this).field_G.a(0);
        while (var4 != null) {
            var4.e(-6930);
            var4 = (po) (Object) ((gd) this).field_G.b(-110);
        }
        if (param0 < 124) {
            ((gd) this).a(101, (byte) 21);
        }
    }

    final synchronized gq d() {
        return null;
    }

    final boolean a(mb param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        nj var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
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
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_D = gp.field_p / 100;
              if (param0.field_l < 0) {
                break L1;
              } else {
                L2: {
                  if (param0.field_C == null) {
                    break L2;
                  } else {
                    if (param0.field_C.k()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param0.a((byte) 71);
                  param0.a(true);
                  if (param0.field_m <= 0) {
                    break L3;
                  } else {
                    if (param0 == ((gd) this).field_t[param0.field_o][param0.field_m]) {
                      ((gd) this).field_t[param0.field_o][param0.field_m] = null;
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
              var6_int = param0.field_t;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)((gd) this).field_k[param0.field_o] * 0.0004921259842519685) * 16.0 + 0.5);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param0.field_t = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param0.field_C.i(this.b(param0, -916428895));
              var7 = param0.field_h;
              var11 = 98 % ((param4 - -44) / 58);
              param0.field_s = param0.field_s + var7.field_k;
              var8 = 0;
              param0.field_B = param0.field_B + 1;
              var9 = 0.000005086263020833333 * (double)((-60 + param0.field_p << 8) + (param0.field_r * param0.field_t >> 12));
              if (0 < var7.field_b) {
                L7: {
                  if (var7.field_i > 0) {
                    param0.field_i = param0.field_i + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_i) * 128.0);
                    break L7;
                  } else {
                    param0.field_i = param0.field_i + 128;
                    break L7;
                  }
                }
                if (819200 > param0.field_i * var7.field_b) {
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
              if (null == var7.field_l) {
                break L8;
              } else {
                L9: {
                  if (var7.field_c <= 0) {
                    param0.field_A = param0.field_A + 128;
                    break L9;
                  } else {
                    param0.field_A = param0.field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param0.field_q >= var7.field_l.length - 2) {
                      break L11;
                    } else {
                      if ((65280 & var7.field_l[param0.field_q + 2] << 8) >= param0.field_A) {
                        break L11;
                      } else {
                        param0.field_q = param0.field_q + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var7.field_l.length - 2 != param0.field_q) {
                    break L8;
                  } else {
                    if (var7.field_l[param0.field_q - -1] != -1) {
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
              if (-1 > param0.field_l) {
                break L12;
              } else {
                if (var7.field_e == null) {
                  break L12;
                } else {
                  if (0 != (((gd) this).field_H[param0.field_o] & 1)) {
                    break L12;
                  } else {
                    L13: {
                      if (param0.field_m < 0) {
                        break L13;
                      } else {
                        if (param0 == ((gd) this).field_t[param0.field_o][param0.field_m]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (var7.field_m > 0) {
                        param0.field_l = param0.field_l + (int)(0.5 + Math.pow(2.0, (double)var7.field_m * var9) * 128.0);
                        break L14;
                      } else {
                        param0.field_l = param0.field_l + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (var7.field_e.length - 2 <= param0.field_y) {
                          break L16;
                        } else {
                          if (param0.field_l <= (var7.field_e[param0.field_y - -2] << 8 & 65280)) {
                            break L16;
                          } else {
                            param0.field_y = param0.field_y + 2;
                            continue L15;
                          }
                        }
                      }
                      if (var7.field_e.length - 2 != param0.field_y) {
                        break L12;
                      } else {
                        var8 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L17: {
                param0.field_C.e(param0.field_D);
                if (param3 != null) {
                  param0.field_C.b(param3, param2, param1);
                  break L17;
                } else {
                  param0.field_C.a(param1);
                  break L17;
                }
              }
              L18: {
                if (!param0.field_C.j()) {
                  break L18;
                } else {
                  ((gd) this).field_P.field_o.b((gq) (Object) param0.field_C);
                  break L18;
                }
              }
              L19: {
                param0.a((byte) 71);
                if (param0.field_l >= 0) {
                  param0.a(true);
                  if (param0.field_m <= 0) {
                    break L19;
                  } else {
                    if (((gd) this).field_t[param0.field_o][param0.field_m] == param0) {
                      ((gd) this).field_t[param0.field_o][param0.field_m] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L19;
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            } else {
              param0.field_C.a(param0.field_D, this.a((byte) 92, param0), this.a(param0, 81682502));
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("gd.HA(");
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
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param1).append(44).append(param2).append(44);
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
          throw fa.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + param4 + 41);
        }
        return stackIn_64_0 != 0;
    }

    final synchronized boolean c(int param0) {
        if (param0 > -35) {
            this.c(-32, 90);
        }
        return ((gd) this).field_p.b();
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 >= 0) {
          L0: {
            ((gd) this).field_E[param1] = 12800;
            ((gd) this).field_J[param1] = 8192;
            ((gd) this).field_v[param1] = 16383;
            ((gd) this).field_u[param1] = 8192;
            ((gd) this).field_K[param1] = 0;
            ((gd) this).field_k[param1] = 8192;
            this.b(param1, (byte) 103);
            this.b(-30750, param1);
            ((gd) this).field_H[param1] = 0;
            ((gd) this).field_w[param1] = 32767;
            ((gd) this).field_D[param1] = 256;
            ((gd) this).field_y[param1] = 0;
            this.b(15, param1, 8192);
            if (param0 > 65) {
              break L0;
            } else {
              ((gd) this).field_P = null;
              break L0;
            }
          }
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if (param1 >= 16) {
              return;
            } else {
              this.d(67, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 != 16532) {
            ((gd) this).field_C = null;
        }
        ((gd) this).field_j[param2] = param0;
        ((gd) this).field_z[param2] = tq.b(-128, param0);
        this.e(-13961, param0, param2);
    }

    public gd() {
        ((gd) this).field_O = new mb[16][128];
        ((gd) this).field_r = 1000000;
        ((gd) this).field_m = new int[16];
        ((gd) this).field_N = 256;
        ((gd) this).field_j = new int[16];
        ((gd) this).field_t = new mb[16][128];
        ((gd) this).field_H = new int[16];
        ((gd) this).field_z = new int[16];
        ((gd) this).field_E = new int[16];
        ((gd) this).field_w = new int[16];
        ((gd) this).field_k = new int[16];
        ((gd) this).field_C = new int[16];
        ((gd) this).field_n = new int[16];
        ((gd) this).field_D = new int[16];
        ((gd) this).field_v = new int[16];
        ((gd) this).field_y = new int[16];
        ((gd) this).field_J = new int[16];
        ((gd) this).field_x = new int[16];
        ((gd) this).field_u = new int[16];
        ((gd) this).field_K = new int[16];
        ((gd) this).field_p = new mm();
        ((gd) this).field_P = new ba((gd) this);
        ((gd) this).field_G = new f(128);
        ((gd) this).a(256, -1, false);
        this.b(-1, true);
    }

    static {
    }
}
