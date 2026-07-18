/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp extends tda {
    private int[] field_I;
    private int[] field_D;
    private js field_m;
    private int[] field_F;
    private int field_L;
    private int[] field_v;
    private int[] field_N;
    private int[] field_n;
    private int[] field_A;
    int[] field_y;
    int[] field_M;
    private int[] field_r;
    private fh[][] field_B;
    private int[] field_x;
    private int[] field_J;
    int[] field_u;
    private int[] field_C;
    private int[] field_w;
    private vga field_z;
    private int[] field_s;
    private fh[][] field_H;
    private int field_t;
    private long field_K;
    private long field_q;
    private int field_o;
    private boolean field_j;
    private int field_l;
    private jja field_k;
    private int field_G;
    private kia field_E;
    private boolean field_p;

    private final void d(int param0, int param1) {
        fh var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param1) {
                  break L2;
                } else {
                  if (param1 != var3.field_n) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_p < 0) {
                ((jp) this).field_H[var3.field_n][var3.field_h] = null;
                var3.field_p = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
            continue L0;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        fh var5 = null;
        be var6 = null;
        int var6_int = 0;
        fh var7 = null;
        fh var8 = null;
        int var9 = 0;
        eka var10 = null;
        eka var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        fh stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        fh stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        fh stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        fh stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        fh stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        fh stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          this.a(param3, 64, param2, (byte) -51);
          if ((((jp) this).field_u[param2] & 2) == 0) {
            break L0;
          } else {
            var5 = (fh) (Object) ((jp) this).field_k.field_k.a(6);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param2 != var5.field_n) {
                    break L2;
                  } else {
                    if (var5.field_p < 0) {
                      ((jp) this).field_H[param2][var5.field_h] = null;
                      ((jp) this).field_H[param2][param3] = var5;
                      var6_int = var5.field_x + (var5.field_y * var5.field_C >> 12);
                      var5.field_x = var5.field_x + (param3 + -var5.field_h << 8);
                      var5.field_h = param3;
                      var5.field_C = -var5.field_x + var6_int;
                      var5.field_y = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (fh) (Object) ((jp) this).field_k.field_k.c((byte) 116);
                continue L1;
              }
            }
          }
        }
        var10 = (eka) (Object) ((jp) this).field_m.a(true, (long)((jp) this).field_n[param2]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_m[param3];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new fh();
              var7.field_n = param2;
              var7.field_j = var11;
              var7.field_f = var6;
              var7.field_B = var10.field_l[param3];
              var7.field_k = var10.field_j[param3];
              var7.field_h = param3;
              var7.field_u = var10.field_i[param3] * (var11.field_h * param0) * param0 + 1024 >> 11;
              var7.field_g = var10.field_f[param3] & 255;
              var7.field_x = (param3 << 8) - (var10.field_n[param3] & 32767);
              var7.field_q = 0;
              var7.field_w = 0;
              var7.field_l = 0;
              var7.field_A = 0;
              var7.field_p = -1;
              if (((jp) this).field_y[param2] == 0) {
                var7.field_z = je.a(var6, this.a((byte) -78, var7), this.a(false, var7), this.a(806727846, var7));
                break L3;
              } else {
                L4: {
                  var7.field_z = je.a(var6, this.a((byte) -105, var7), 0, this.a(806727846, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = 809594182;
                  stackOut_15_2 = (fh) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (var10.field_n[param3] >= 0) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (fh) (Object) stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (fh) (Object) stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((jp) this).a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              }
            }
            L5: {
              if (var10.field_n[param3] > -1) {
                var7.field_z.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 <= var7.field_k) {
                L7: {
                  var8 = ((jp) this).field_B[param2][var7.field_k];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_p >= 0) {
                      break L7;
                    } else {
                      ((jp) this).field_H[param2][var8.field_h] = null;
                      var8.field_p = 0;
                      break L7;
                    }
                  }
                }
                ((jp) this).field_B[param2][var7.field_k] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((jp) this).field_k.field_k.a((bw) (Object) var7, true);
            ((jp) this).field_H[param2][param3] = var7;
            return;
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
            var6 = BachelorFridge.field_y;
            if (!((jp) this).field_z.f()) {
              break L1;
            } else {
              var2 = ((jp) this).field_z.field_a * ((jp) this).field_L / pb.field_j;
              L2: while (true) {
                var3 = (long)param0 * (long)var2 + ((jp) this).field_q;
                if (((jp) this).field_K + -var3 < 0L) {
                  var5 = (int)(((long)var2 + (-((jp) this).field_q + ((jp) this).field_K - 1L)) / (long)var2);
                  ((jp) this).field_q = ((jp) this).field_q + (long)var5 * (long)var2;
                  ((jp) this).field_k.a(var5);
                  param0 = param0 - var5;
                  this.d(-3305);
                  if (((jp) this).field_z.f()) {
                    continue L2;
                  } else {
                    ((jp) this).field_k.a(param0);
                    break L0;
                  }
                } else {
                  ((jp) this).field_q = var3;
                  break L1;
                }
              }
            }
          }
          ((jp) this).field_k.a(param0);
          break L0;
        }
    }

    private final void a(byte param0, int param1) {
        fh var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 > 17) {
          var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (param1 != var3.field_n) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var3.field_z == null) {
                    break L3;
                  } else {
                    L4: {
                      var3.field_z.c(pb.field_j / 100);
                      if (!var3.field_z.e()) {
                        break L4;
                      } else {
                        ((jp) this).field_k.field_j.a((tda) (Object) var3.field_z);
                        break L4;
                      }
                    }
                    var3.a(-91);
                    break L3;
                  }
                }
                L5: {
                  if (var3.field_p < 0) {
                    ((jp) this).field_H[var3.field_n][var3.field_h] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3.a(false);
                break L1;
              }
              var3 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(fh param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
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
            if (null != param0.field_z) {
              L1: {
                if (param1 == 95) {
                  break L1;
                } else {
                  this.a(-108, true, 57);
                  break L1;
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              L2: {
                if (param0.field_p < 0) {
                  break L2;
                } else {
                  param0.a(false);
                  if (0 >= param0.field_k) {
                    break L2;
                  } else {
                    if (((jp) this).field_B[param0.field_n][param0.field_k] != param0) {
                      break L2;
                    } else {
                      ((jp) this).field_B[param0.field_n][param0.field_k] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("jp.JA(");
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
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
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                if (!((jp) this).field_z.f()) {
                  break L2;
                } else {
                  var4_int = ((jp) this).field_L * ((jp) this).field_z.field_a / pb.field_j;
                  L3: while (true) {
                    var5 = (long)param2 * (long)var4_int + ((jp) this).field_q;
                    if (-var5 + ((jp) this).field_K < 0L) {
                      var7 = (int)((-1L + (long)var4_int + (((jp) this).field_K - ((jp) this).field_q)) / (long)var4_int);
                      ((jp) this).field_q = ((jp) this).field_q + (long)var4_int * (long)var7;
                      ((jp) this).field_k.a(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.d(-3305);
                      if (((jp) this).field_z.f()) {
                        continue L3;
                      } else {
                        ((jp) this).field_k.a(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((jp) this).field_q = var5;
                      break L2;
                    }
                  }
                }
              }
              ((jp) this).field_k.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("jp.C(");
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        ((jp) this).field_t = param1;
        if (param0 != 23679) {
            ((jp) this).field_M = null;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          var2 = ((jp) this).field_l;
          var3 = ((jp) this).field_o;
          var4 = ((jp) this).field_K;
          if (((jp) this).field_E == null) {
            break L0;
          } else {
            if (((jp) this).field_G == var3) {
              this.a(((jp) this).field_j, ((jp) this).field_p, ((jp) this).field_E, 23721);
              this.d(-3305);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((jp) this).field_o) {
            L2: {
              ((jp) this).field_o = var3;
              ((jp) this).field_K = var4;
              ((jp) this).field_l = var2;
              if (null == ((jp) this).field_E) {
                break L2;
              } else {
                if (var3 <= ((jp) this).field_G) {
                  break L2;
                } else {
                  ((jp) this).field_o = ((jp) this).field_G;
                  ((jp) this).field_l = -1;
                  ((jp) this).field_K = ((jp) this).field_z.b(((jp) this).field_o);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (var3 != ((jp) this).field_z.field_i[var2]) {
                  break L4;
                } else {
                  ((jp) this).field_z.c(var2);
                  var6 = ((jp) this).field_z.a(var2);
                  if (1 == var6) {
                    ((jp) this).field_z.d();
                    ((jp) this).field_z.f(var2);
                    if (!((jp) this).field_z.e()) {
                      break L4;
                    } else {
                      if (((jp) this).field_E == null) {
                        L5: {
                          if (!((jp) this).field_j) {
                            break L5;
                          } else {
                            if (var3 == 0) {
                              break L5;
                            } else {
                              ((jp) this).field_z.a(var4);
                              break L4;
                            }
                          }
                        }
                        this.a(true, 122);
                        ((jp) this).field_z.a();
                        return;
                      } else {
                        ((jp) this).a(((jp) this).field_E, (byte) -110, ((jp) this).field_j);
                        this.d(-3305);
                        return;
                      }
                    }
                  } else {
                    L6: {
                      if ((128 & var6) == 0) {
                        break L6;
                      } else {
                        this.b(var6, 15);
                        break L6;
                      }
                    }
                    ((jp) this).field_z.e(var2);
                    ((jp) this).field_z.f(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((jp) this).field_z.g();
              var3 = ((jp) this).field_z.field_i[var2];
              var4 = ((jp) this).field_z.b(var3);
              continue L1;
            }
          }
        }
    }

    private final int a(int param0, fh param1) {
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
            var3_int = ((jp) this).field_D[param1.field_n];
            if (8192 > var3_int) {
              stackOut_3_0 = param1.field_g * var3_int - -32 >> 6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 16384 - ((-var3_int + 16384) * (-param1.field_g + 128) - -32 >> 6);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jp.PA(").append(806727846).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    private final void d(int param0, byte param1, int param2) {
        if (param1 <= 60) {
            ((jp) this).field_J = null;
        }
        ((jp) this).field_C[param2] = param0;
        ((jp) this).field_M[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var5 = BachelorFridge.field_y;
        if (!param0) {
            this.d(1, -1);
        } else {
            this.a((byte) 112, -1);
        }
        this.a(-1, (byte) -22);
        for (var3 = 0; 16 > var3; var3++) {
            ((jp) this).field_n[var3] = ((jp) this).field_I[var3];
        }
        int var4 = -117 % ((param1 - 54) / 36);
        int var6 = 0;
        var3 = var6;
        while (16 > var6) {
            ((jp) this).field_F[var6] = dda.a(-128, ((jp) this).field_I[var6]);
            var6++;
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4 = 0;
        L0: {
          var4 = 112 % ((19 - param2) / 49);
          if (param1 < 0) {
            break L0;
          } else {
            if (param1 > 11) {
              break L0;
            } else {
              if (param3 < 1) {
                return false;
              } else {
                if (~param3 >= ~vj.a(param1, param0, (byte) 126)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    private final void c(int param0, byte param1, int param2) {
    }

    private final void e(int param0, int param1) {
        fh var3 = null;
        int var4 = BachelorFridge.field_y;
        if (param0 <= 5) {
            return;
        }
        if (0 != (2 & ((jp) this).field_u[param1])) {
            var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
            while (var3 != null) {
                if (var3.field_n == param1) {
                    if (((jp) this).field_H[param1][var3.field_h] == null) {
                        if (var3.field_p < 0) {
                            var3.field_p = 0;
                        }
                    }
                }
                var3 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
            }
        }
    }

    private final void b(int param0, byte param1, int param2) {
        ((jp) this).field_I[param0] = param2;
        ((jp) this).field_F[param0] = dda.a(param2, -128);
        this.a((byte) -76, param2, param0);
    }

    final boolean a(int param0, fh param1, int[] param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        un var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
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
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param1.field_r = pb.field_j / 100;
              if (0 > param1.field_p) {
                break L1;
              } else {
                L2: {
                  if (param1.field_z == null) {
                    break L2;
                  } else {
                    if (!param1.field_z.h()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param1.a(123);
                  param1.a(false);
                  if (0 >= param1.field_k) {
                    break L3;
                  } else {
                    if (((jp) this).field_B[param1.field_n][param1.field_k] != param1) {
                      break L3;
                    } else {
                      ((jp) this).field_B[param1.field_n][param1.field_k] = null;
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
              var6_int = param1.field_y;
              if (var6_int <= 0) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + Math.pow(2.0, 0.0004921259842519685 * (double)((jp) this).field_s[param1.field_n]) * 16.0);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param1.field_y = var6_int;
                break L4;
              }
            }
            L6: {
              param1.field_z.e(this.a((byte) -78, param1));
              var7 = param1.field_B;
              var8 = param4 ? 1 : 0;
              param1.field_o = param1.field_o + 1;
              param1.field_m = param1.field_m + var7.field_c;
              var9 = (double)((param1.field_y * param1.field_C >> 12) + (-60 + param1.field_h << 8)) * 0.000005086263020833333;
              if (-1 <= var7.field_e) {
                break L6;
              } else {
                L7: {
                  if (-1 >= var7.field_h) {
                    param1.field_w = param1.field_w + 128;
                    break L7;
                  } else {
                    param1.field_w = param1.field_w + (int)(0.5 + Math.pow(2.0, (double)var7.field_h * var9) * 128.0);
                    break L7;
                  }
                }
                if (var7.field_e * param1.field_w < 819200) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L8: {
              if (null != var7.field_j) {
                L9: {
                  if (0 >= var7.field_d) {
                    param1.field_l = param1.field_l + 128;
                    break L9;
                  } else {
                    param1.field_l = param1.field_l + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (var7.field_j.length - 2 <= param1.field_A) {
                      break L11;
                    } else {
                      if ((65280 & var7.field_j[2 + param1.field_A] << 8) >= param1.field_l) {
                        break L11;
                      } else {
                        param1.field_A = param1.field_A + 2;
                        continue L10;
                      }
                    }
                  }
                  if (-2 + var7.field_j.length != param1.field_A) {
                    break L8;
                  } else {
                    if (var7.field_j[1 + param1.field_A] != 0) {
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
              if (param1.field_p < 0) {
                break L12;
              } else {
                if (null == var7.field_b) {
                  break L12;
                } else {
                  if (0 == (1 & ((jp) this).field_u[param1.field_n])) {
                    L13: {
                      if (0 > param1.field_k) {
                        break L13;
                      } else {
                        if (param1 != ((jp) this).field_B[param1.field_n][param1.field_k]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (var7.field_k > 0) {
                        param1.field_p = param1.field_p + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
                        break L14;
                      } else {
                        param1.field_p = param1.field_p + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param1.field_q >= -2 + var7.field_b.length) {
                          break L16;
                        } else {
                          if ((var7.field_b[param1.field_q - -2] << 8 & 65280) >= param1.field_p) {
                            break L16;
                          } else {
                            param1.field_q = param1.field_q + 2;
                            continue L15;
                          }
                        }
                      }
                      if (var7.field_b.length - 2 == param1.field_q) {
                        var8 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (var8 != 0) {
              L17: {
                param1.field_z.c(param1.field_r);
                if (param2 == null) {
                  param1.field_z.a(param3);
                  break L17;
                } else {
                  param1.field_z.a(param2, param0, param3);
                  break L17;
                }
              }
              L18: {
                if (!param1.field_z.e()) {
                  break L18;
                } else {
                  ((jp) this).field_k.field_j.a((tda) (Object) param1.field_z);
                  break L18;
                }
              }
              L19: {
                param1.a(117);
                if (0 <= param1.field_p) {
                  param1.a(false);
                  if (param1.field_k <= 0) {
                    break L19;
                  } else {
                    if (param1 != ((jp) this).field_B[param1.field_n][param1.field_k]) {
                      break L19;
                    } else {
                      ((jp) this).field_B[param1.field_n][param1.field_k] = null;
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
            } else {
              param1.field_z.a(param1.field_r, this.a(false, param1), this.a(806727846, param1));
              stackOut_62_0 = 0;
              stackIn_63_0 = stackOut_62_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var6;
            stackOut_64_1 = new StringBuilder().append("jp.U(").append(param0).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param1 == null) {
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
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_63_0 != 0;
    }

    final synchronized void a(kia param0, byte param1, boolean param2) {
        if (param1 > -108) {
            return;
        }
        try {
            this.a(param2, true, param0, 23721);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jp.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, fh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        un var4 = null;
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
              var3_int = (param1.field_C * param1.field_y >> 12) + param1.field_x;
              var3_int = var3_int + ((((jp) this).field_x[param1.field_n] + -8192) * ((jp) this).field_A[param1.field_n] >> 12);
              var4 = param1.field_B;
              if (0 >= var4.field_c) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_l) {
                    break L2;
                  } else {
                    if (0 < ((jp) this).field_r[param1.field_n]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_l << 2;
                  var6 = var4.field_g << 1;
                  if (var6 > param1.field_o) {
                    var5 = param1.field_o * var5 / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((jp) this).field_r[param1.field_n] >> 7);
                var7 = Math.sin((double)(511 & param1.field_m) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              if (param0 <= -58) {
                break L4;
              } else {
                tda discarded$1 = ((jp) this).b();
                break L4;
              }
            }
            L5: {
              var5 = (int)((double)(param1.field_f.field_h * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)pb.field_j + 0.5);
              if (var5 >= 1) {
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
            stackOut_14_1 = new StringBuilder().append("jp.L(").append(param0).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param2 == -107) {
            break L0;
          } else {
            var6 = null;
            boolean discarded$2 = ((jp) this).a((fh) null, (byte) -27);
            break L0;
          }
        }
        L1: {
          if (param0 >= 0) {
            ((jp) this).field_v[param0] = param1;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 16) {
                break L1;
              } else {
                ((jp) this).field_v[var4] = param1;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = -27;
              if (hh.field_d == param1) {
                break L1;
              } else {
                jq.field_k = new int[param1];
                var4 = 0;
                L2: while (true) {
                  if (param1 <= var4) {
                    wp.field_r = param1 + -1;
                    qna.field_k = 32 * param1;
                    hh.field_d = param1;
                    break L1;
                  } else {
                    jq.field_k[var4] = (var4 << 12) / param1;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param2 != bi.field_g) {
                L4: {
                  if (param2 == hh.field_d) {
                    tj.field_f = jq.field_k;
                    break L4;
                  } else {
                    tj.field_f = new int[param2];
                    var6 = 0;
                    var4 = var6;
                    L5: while (true) {
                      if (param2 <= var6) {
                        break L4;
                      } else {
                        tj.field_f[var6] = (var6 << 12) / param2;
                        var6++;
                        continue L5;
                      }
                    }
                  }
                }
                it.field_r = param2 + -1;
                bi.field_g = param2;
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "jp.K(" + -117 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, fh param1, boolean param2) {
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
                var4_int = param1.field_f.field_i.length;
                if (!param2) {
                  break L2;
                } else {
                  if (param1.field_f.field_k) {
                    var6 = var4_int + (var4_int - param1.field_f.field_g);
                    var5 = (int)((long)((jp) this).field_y[param1.field_n] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      var5 = -1 + (var4_int + (var4_int + -var5));
                      param1.field_z.b(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (int)((long)((jp) this).field_y[param1.field_n] * (long)var4_int >> 6);
              break L1;
            }
            L3: {
              if (param0 == 809594182) {
                break L3;
              } else {
                ((jp) this).field_E = null;
                break L3;
              }
            }
            param1.field_z.b(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("jp.IA(").append(param0).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        var3 = 240 & param0;
        if (var3 != 128) {
          L0: {
            if (144 != var3) {
              if (var3 != 160) {
                if (var3 == 176) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = (32608 & param0) >> 8;
                    var6 = param0 >> 16 & 127;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((jp) this).field_F[var4] = (var6 << 14) + dda.a(-2080769, ((jp) this).field_F[var4]);
                      break L1;
                    }
                  }
                  L2: {
                    if (32 == var5) {
                      ((jp) this).field_F[var4] = (var6 << 7) + dda.a(((jp) this).field_F[var4], -16257);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 == var5) {
                      ((jp) this).field_r[var4] = (var6 << 7) + dda.a(((jp) this).field_r[var4], -16257);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 33) {
                      break L4;
                    } else {
                      ((jp) this).field_r[var4] = var6 + dda.a(-128, ((jp) this).field_r[var4]);
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 != 5) {
                      break L5;
                    } else {
                      ((jp) this).field_s[var4] = dda.a(((jp) this).field_s[var4], -16257) + (var6 << 7);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 37) {
                      ((jp) this).field_s[var4] = var6 + dda.a(((jp) this).field_s[var4], -128);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 7) {
                      break L7;
                    } else {
                      ((jp) this).field_J[var4] = (var6 << 7) + dda.a(((jp) this).field_J[var4], -16257);
                      break L7;
                    }
                  }
                  L8: {
                    if (39 != var5) {
                      break L8;
                    } else {
                      ((jp) this).field_J[var4] = dda.a(-128, ((jp) this).field_J[var4]) - -var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 != 10) {
                      break L9;
                    } else {
                      ((jp) this).field_D[var4] = (var6 << 7) + dda.a(-16257, ((jp) this).field_D[var4]);
                      break L9;
                    }
                  }
                  L10: {
                    if (42 == var5) {
                      ((jp) this).field_D[var4] = var6 + dda.a(((jp) this).field_D[var4], -128);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (11 != var5) {
                      break L11;
                    } else {
                      ((jp) this).field_N[var4] = (var6 << 7) + dda.a(-16257, ((jp) this).field_N[var4]);
                      break L11;
                    }
                  }
                  L12: {
                    if (43 != var5) {
                      break L12;
                    } else {
                      ((jp) this).field_N[var4] = var6 + dda.a(((jp) this).field_N[var4], -128);
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 != 64) {
                      break L13;
                    } else {
                      if (64 > var6) {
                        ((jp) this).field_u[var4] = dda.a(((jp) this).field_u[var4], -2);
                        break L13;
                      } else {
                        ((jp) this).field_u[var4] = mp.a(((jp) this).field_u[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 != 65) {
                      break L14;
                    } else {
                      if (var6 >= 64) {
                        ((jp) this).field_u[var4] = mp.a(((jp) this).field_u[var4], 2);
                        break L14;
                      } else {
                        this.e(49, var4);
                        ((jp) this).field_u[var4] = dda.a(((jp) this).field_u[var4], -3);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 99) {
                      ((jp) this).field_w[var4] = dda.a(127, ((jp) this).field_w[var4]) - -(var6 << 7);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 == 98) {
                      ((jp) this).field_w[var4] = dda.a(((jp) this).field_w[var4], 16256) + var6;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 101) {
                      ((jp) this).field_w[var4] = dda.a(((jp) this).field_w[var4], 127) + (16384 + (var6 << 7));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 100) {
                      break L18;
                    } else {
                      ((jp) this).field_w[var4] = dda.a(16256, ((jp) this).field_w[var4]) + (16384 - -var6);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 120) {
                      this.a((byte) 98, var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.a(var4, (byte) -22);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 123) {
                      this.d(1, var4);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 6) {
                      break L22;
                    } else {
                      var7 = ((jp) this).field_w[var4];
                      if (16384 == var7) {
                        ((jp) this).field_A[var4] = dda.a(((jp) this).field_A[var4], -16257) - -(var6 << 7);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = ((jp) this).field_w[var4];
                      if (16384 == var7) {
                        ((jp) this).field_A[var4] = dda.a(-128, ((jp) this).field_A[var4]) - -var6;
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
                      ((jp) this).field_y[var4] = (var6 << 7) + dda.a(-16257, ((jp) this).field_y[var4]);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((jp) this).field_y[var4] = dda.a(-128, ((jp) this).field_y[var4]) - -var6;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 81) {
                      if (var6 < 64) {
                        this.f(-28068, var4);
                        ((jp) this).field_u[var4] = dda.a(((jp) this).field_u[var4], -5);
                        break L26;
                      } else {
                        ((jp) this).field_u[var4] = mp.a(((jp) this).field_u[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.d((var6 << 7) + (-16257 & ((jp) this).field_C[var4]), (byte) 113, var4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.d(var6 + (-128 & ((jp) this).field_C[var4]), (byte) 99, var4);
                    return;
                  }
                } else {
                  if (var3 != 192) {
                    if (var3 != 208) {
                      if (var3 == 224) {
                        var4 = 15 & param0;
                        var5 = (param0 >> 8 & 127) + (16256 & param0 >> 9);
                        this.a(var5, false, var4);
                        return;
                      } else {
                        var3 = 255 & param0;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, -27);
                          return;
                        }
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (32514 & param0) >> 8;
                      this.c(var5, (byte) -56, var4);
                      return;
                    }
                  } else {
                    var4 = 15 & param0;
                    var5 = param0 >> 8 & 127;
                    this.a((byte) -81, ((jp) this).field_F[var4] - -var5, var4);
                    return;
                  }
                }
              } else {
                var4 = param0 & 15;
                var5 = (32666 & param0) >> 8;
                var6 = param0 >> 16 & 127;
                this.a(-18793, var5, var4, var6);
                return;
              }
            } else {
              var4 = 15 & param0;
              var5 = 127 & param0 >> 8;
              var6 = 127 & param0 >> 16;
              if (var6 <= 0) {
                this.a(var5, 64, var4, (byte) -51);
                return;
              } else {
                this.b(var6, -20446, var4, var5);
                break L0;
              }
            }
          }
          return;
        } else {
          var4 = param0 & 15;
          var5 = (param0 & 32675) >> 8;
          var6 = 127 & param0 >> 16;
          this.a(var5, var6, var4, (byte) -51);
          return;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = BachelorFridge.field_y;
        if (param0 >= -27) {
            ((jp) this).field_w = null;
        }
        if (param1 != ((jp) this).field_n[param2]) {
            ((jp) this).field_n[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((jp) this).field_B[param2][var4] = null;
            }
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((jp) this).field_z.a();
        ((jp) this).field_E = null;
        this.a(param0, -127);
    }

    final synchronized void b(int param0) {
        int var3 = BachelorFridge.field_y;
        if (param0 != -5359) {
            int discarded$0 = ((jp) this).d();
        }
        eka var4 = (eka) (Object) ((jp) this).field_m.b(param0 ^ 9776);
        while (var4 != null) {
            var4.b(false);
            var4 = (eka) (Object) ((jp) this).field_m.c(-21446);
        }
    }

    private final synchronized void a(boolean param0, boolean param1, kia param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        try {
            this.a(param1, true);
            ((jp) this).field_z.a(param2.field_g);
            ((jp) this).field_q = 0L;
            ((jp) this).field_j = param0 ? true : false;
            var5_int = ((jp) this).field_z.c();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((jp) this).field_z.c(var6);
                ((jp) this).field_z.e(var6);
                ((jp) this).field_z.f(var6);
            }
            ((jp) this).field_l = ((jp) this).field_z.g();
            ((jp) this).field_o = ((jp) this).field_z.field_i[((jp) this).field_l];
            ((jp) this).field_K = ((jp) this).field_z.b(((jp) this).field_o);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jp.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + 23721 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 >= 0) {
          ((jp) this).field_J[param0] = 12800;
          ((jp) this).field_D[param0] = 8192;
          ((jp) this).field_N[param0] = 16383;
          ((jp) this).field_x[param0] = 8192;
          ((jp) this).field_r[param0] = 0;
          ((jp) this).field_s[param0] = 8192;
          this.e(12, param0);
          this.f(-28068, param0);
          ((jp) this).field_u[param0] = 0;
          ((jp) this).field_w[param0] = 32767;
          ((jp) this).field_A[param0] = 256;
          ((jp) this).field_y[param0] = 0;
          this.d(8192, (byte) 93, param0);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.a(param0, (byte) -22);
              param0++;
              continue L0;
            }
          }
        }
    }

    final synchronized tda a() {
        return null;
    }

    final synchronized void c(int param0, int param1) {
        ((jp) this).field_L = param1;
        if (param0 != 224) {
            ((jp) this).field_o = -86;
        }
    }

    private final int a(boolean param0, fh param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        un var9 = null;
        un var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (((jp) this).field_v[param1.field_n] != 0) {
              L1: {
                var9 = param1.field_B;
                var10 = var9;
                var4 = 4096 + ((jp) this).field_N[param1.field_n] * ((jp) this).field_J[param1.field_n] >> 13;
                var4 = var4 * var4 + 16384 >> 15;
                var4 = var4 * param1.field_u - -16384 >> 15;
                var4 = 128 + ((jp) this).field_t * var4 >> 8;
                var4 = 128 + ((jp) this).field_v[param1.field_n] * var4 >> 8;
                if (var10.field_e <= 0) {
                  break L1;
                } else {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)param1.field_w * 0.00001953125 * (double)var10.field_e) + 0.5);
                  break L1;
                }
              }
              L2: {
                if (null != var10.field_j) {
                  L3: {
                    var5 = param1.field_l;
                    var6 = var10.field_j[1 + param1.field_A];
                    if (param1.field_A >= -2 + var10.field_j.length) {
                      break L3;
                    } else {
                      var7 = var9.field_j[param1.field_A] << 8 & 65280;
                      var8 = (255 & var10.field_j[2 + param1.field_A]) << 8;
                      var6 = var6 + (-var6 + var10.field_j[param1.field_A + 3]) * (var5 - var7) / (var8 + -var7);
                      break L3;
                    }
                  }
                  var4 = var4 * var6 - -32 >> 6;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (param1.field_p <= 0) {
                  break L4;
                } else {
                  if (var10.field_b != null) {
                    L5: {
                      var5 = param1.field_p;
                      var6 = var10.field_b[param1.field_q - -1];
                      if (var10.field_b.length + -2 <= param1.field_q) {
                        break L5;
                      } else {
                        var7 = var9.field_b[param1.field_q] << 8 & 65280;
                        var8 = var10.field_b[2 + param1.field_q] << 8 & 65280;
                        var6 = var6 + (var10.field_b[3 + param1.field_q] - var6) * (var5 + -var7) / (-var7 + var8);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 - -32 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_17_0 = var4;
              stackIn_18_0 = stackOut_17_0;
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
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("jp.QA(").append(false).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    final synchronized tda b() {
        return (tda) (Object) ((jp) this).field_k;
    }

    final synchronized void b(boolean param0) {
        this.a(param0, true);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        fh var6 = null;
        int var7 = BachelorFridge.field_y;
        fh var5 = ((jp) this).field_H[param2][param0];
        if (!(var5 != null)) {
            return;
        }
        ((jp) this).field_H[param2][param0] = null;
        if ((((jp) this).field_u[param2] & 2) == 0) {
            var5.field_p = 0;
        } else {
            var6 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
            while (var6 != null) {
                if (var6.field_n == var5.field_n) {
                    if (var6.field_p < 0) {
                        if (!(var6 == var5)) {
                            var5.field_p = 0;
                            break;
                        }
                    }
                }
                var6 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
            }
        }
    }

    private final void f(int param0, int param1) {
        fh var3 = null;
        int var4 = BachelorFridge.field_y;
        if ((4 & ((jp) this).field_u[param1]) != 0) {
            var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
            while (var3 != null) {
                if (param1 == var3.field_n) {
                    var3.field_t = 0;
                }
                var3 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
            }
        }
    }

    final synchronized boolean a(vr param0, kia param1, i param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        g var8 = null;
        int var9 = 0;
        int var10 = 0;
        eka var11 = null;
        int var12 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param1.a();
              var6_int = 1;
              var7 = null;
              if (param4 <= 0) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              }
            }
            var8 = (g) (Object) param1.field_f.b(-13023);
            var9 = 47 / ((57 - param3) / 37);
            L2: while (true) {
              if (var8 == null) {
                L3: {
                  if (var6_int == 0) {
                    break L3;
                  } else {
                    param1.b();
                    break L3;
                  }
                }
                stackOut_16_0 = var6_int;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = (int)var8.field_c;
                    var11 = (eka) (Object) ((jp) this).field_m.a(true, (long)var10);
                    if (var11 == null) {
                      var11 = wj.a(param0, false, var10);
                      if (var11 != null) {
                        ((jp) this).field_m.a((long)var10, (byte) -89, (bw) (Object) var11);
                        if (!var11.a(var8.field_h, 1436234146, param2, (int[]) var7)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    } else {
                      if (!var11.a(var8.field_h, 1436234146, param2, (int[]) var7)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int = 0;
                  break L4;
                }
                var8 = (g) (Object) param1.field_f.c(-21446);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("jp.N(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
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
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final synchronized void a(int param0, byte param1, int param2) {
        if (param1 != 39) {
            return;
        }
        this.b(param2, (byte) -50, param0);
    }

    final synchronized boolean c(int param0) {
        if (param0 != 28607) {
            return false;
        }
        return ((jp) this).field_z.f();
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        ((jp) this).field_x[param2] = param0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
    }

    public jp() {
        ((jp) this).field_I = new int[16];
        ((jp) this).field_F = new int[16];
        ((jp) this).field_v = new int[16];
        ((jp) this).field_A = new int[16];
        ((jp) this).field_D = new int[16];
        ((jp) this).field_L = 1000000;
        ((jp) this).field_y = new int[16];
        ((jp) this).field_J = new int[16];
        ((jp) this).field_C = new int[16];
        ((jp) this).field_r = new int[16];
        ((jp) this).field_w = new int[16];
        ((jp) this).field_u = new int[16];
        ((jp) this).field_x = new int[16];
        ((jp) this).field_N = new int[16];
        ((jp) this).field_s = new int[16];
        ((jp) this).field_H = new fh[16][128];
        ((jp) this).field_n = new int[16];
        ((jp) this).field_t = 256;
        ((jp) this).field_M = new int[16];
        ((jp) this).field_B = new fh[16][128];
        ((jp) this).field_z = new vga();
        ((jp) this).field_k = new jja((jp) this);
        ((jp) this).field_m = new js(128);
        ((jp) this).a(-1, 256, (byte) -107);
        this.a(true, 106);
    }

    static {
    }
}
