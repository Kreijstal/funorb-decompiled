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
        int var4 = BachelorFridge.field_y;
        fh var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
        while (var3 != null) {
            if (0 <= param1) {
                // if_icmpne L83
            }
            if (!(var3.field_p >= 0)) {
                ((jp) this).field_H[var3.field_n][var3.field_h] = null;
                var3.field_p = 0;
            }
            var3 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
        }
        if (param0 != 1) {
            ((jp) this).a(-84, -53);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        fh var5 = null;
        be var6 = null;
        int var6_int = 0;
        fh var7 = null;
        fh var8 = null;
        int var9 = 0;
        Object var10 = null;
        eka var11 = null;
        eka var12 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        fh stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        fh stackIn_19_2 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        fh stackIn_20_2 = null;
        int stackIn_20_3 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        fh stackOut_17_2 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        fh stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        fh stackOut_18_2 = null;
        int stackOut_18_3 = 0;
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
                    if ((var5.field_p ^ -1) > -1) {
                      ((jp) this).field_H[param2][var5.field_h] = null;
                      ((jp) this).field_H[param2][param3] = var5;
                      var6_int = var5.field_x + (var5.field_y * var5.field_C >> -1564448852);
                      var5.field_x = var5.field_x + (param3 + -var5.field_h << -1229320408);
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
        var11 = (eka) (Object) ((jp) this).field_m.a(true, (long)((jp) this).field_n[param2]);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_m[param3];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new fh();
              var7.field_n = param2;
              var7.field_j = var12;
              var7.field_f = var6;
              var7.field_B = var11.field_l[param3];
              var7.field_k = var11.field_j[param3];
              var7.field_h = param3;
              var7.field_u = var11.field_i[param3] * (var12.field_h * param0) * param0 + 1024 >> 161228171;
              var7.field_g = var11.field_f[param3] & 255;
              var7.field_x = (param3 << -791594904) - (var11.field_n[param3] & 32767);
              var7.field_q = 0;
              var7.field_w = 0;
              var7.field_l = 0;
              var7.field_A = 0;
              if (param1 == -20446) {
                break L3;
              } else {
                var10 = null;
                this.a(true, false, (kia) null, 33);
                break L3;
              }
            }
            L4: {
              var7.field_p = -1;
              if (-1 == (((jp) this).field_y[param2] ^ -1)) {
                var7.field_z = je.a(var6, this.a((byte) -78, var7), this.a(false, var7), this.a(806727846, var7));
                break L4;
              } else {
                L5: {
                  var7.field_z = je.a(var6, this.a((byte) -105, var7), 0, this.a(806727846, var7));
                  stackOut_17_0 = this;
                  stackOut_17_1 = 809594182;
                  stackOut_17_2 = (fh) var7;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  if (var11.field_n[param3] >= 0) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = (fh) (Object) stackIn_19_2;
                    stackOut_19_3 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = (fh) (Object) stackIn_18_2;
                    stackOut_18_3 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    break L5;
                  }
                }
                ((jp) this).a(stackIn_20_1, (fh) (Object) stackIn_20_2, stackIn_20_3 != 0);
                break L4;
              }
            }
            L6: {
              if (var11.field_n[param3] > -1) {
                var7.field_z.d(-1);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-1 <= var7.field_k) {
                L8: {
                  var8 = ((jp) this).field_B[param2][var7.field_k];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if ((var8.field_p ^ -1) <= -1) {
                      break L8;
                    } else {
                      ((jp) this).field_H[param2][var8.field_h] = null;
                      var8.field_p = 0;
                      break L8;
                    }
                  }
                }
                ((jp) this).field_B[param2][var7.field_k] = var7;
                break L7;
              } else {
                break L7;
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
                if ((((jp) this).field_K + -var3 ^ -1L) > -1L) {
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
        int var4 = BachelorFridge.field_y;
        if (param0 <= 17) {
            return;
        }
        fh var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
        while (var3 != null) {
            if (0 <= param1) {
                // if_icmpne L158
            }
            if (var3.field_z != null) {
                var3.field_z.c(pb.field_j / 100);
                if (var3.field_z.e()) {
                    ((jp) this).field_k.field_j.a((tda) (Object) var3.field_z);
                }
                var3.a(-91);
            }
            if (!((var3.field_p ^ -1) <= -1)) {
                ((jp) this).field_H[var3.field_n][var3.field_h] = null;
            }
            var3.a(false);
            var3 = (fh) (Object) ((jp) this).field_k.field_k.c(0);
        }
    }

    final boolean a(fh param0, byte param1) {
        if (null == param0.field_z) {
            if ((param0.field_p ^ -1) <= -1) {
                param0.a(false);
                if (0 < param0.field_k) {
                    if (((jp) this).field_B[param0.field_n][param0.field_k] == param0) {
                        ((jp) this).field_B[param0.field_n][param0.field_k] = null;
                        return true;
                    }
                }
            }
            return true;
        }
        if (param1 != 95) {
            this.a(-108, true, 57);
        }
        return false;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = BachelorFridge.field_y;
            if (!((jp) this).field_z.f()) {
              break L1;
            } else {
              var4 = ((jp) this).field_L * ((jp) this).field_z.field_a / pb.field_j;
              L2: while (true) {
                var5 = (long)param2 * (long)var4 + ((jp) this).field_q;
                if ((-var5 + ((jp) this).field_K ^ -1L) > -1L) {
                  var7 = (int)((-1L + (long)var4 + (((jp) this).field_K - ((jp) this).field_q)) / (long)var4);
                  ((jp) this).field_q = ((jp) this).field_q + (long)var4 * (long)var7;
                  ((jp) this).field_k.a(param0, param1, var7);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  this.d(-3305);
                  if (((jp) this).field_z.f()) {
                    continue L2;
                  } else {
                    ((jp) this).field_k.a(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((jp) this).field_q = var5;
                  break L1;
                }
              }
            }
          }
          ((jp) this).field_k.a(param0, param1, param2);
          break L0;
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
        var7 = BachelorFridge.field_y;
        var2 = ((jp) this).field_l;
        var3 = ((jp) this).field_o;
        if (param0 == -3305) {
          L0: {
            var4 = ((jp) this).field_K;
            if (((jp) this).field_E == null) {
              break L0;
            } else {
              if (((jp) this).field_G == var3) {
                this.a(((jp) this).field_j, ((jp) this).field_p, ((jp) this).field_E, param0 ^ -20546);
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
                              if (-1 == (var3 ^ -1)) {
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
        } else {
          return;
        }
    }

    private final int a(int param0, fh param1) {
        int var3 = ((jp) this).field_D[param1.field_n];
        if (param0 != 806727846) {
            ((jp) this).field_v = null;
        }
        if (8192 <= var3) {
            return 16384 - ((-var3 + 16384) * (-param1.field_g + 128) - -32 >> 806727846);
        }
        return param1.field_g * var3 - -32 >> -1582760826;
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
            if (-12 > param1) {
              break L0;
            } else {
              if (-2 > param3) {
                return false;
              } else {
                if (param3 <= vj.a(param1, param0, (byte) 126)) {
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
        if (param1 != -56) {
            this.a(6, true, -45);
        }
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
        if (param1 != -50) {
            return;
        }
        ((jp) this).field_I[param0] = param2;
        ((jp) this).field_F[param0] = dda.a(param2, -128);
        this.a((byte) -76, param2, param0);
    }

    final boolean a(int param0, fh param1, int[] param2, int param3, boolean param4) {
        int var6 = 0;
        un var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          param1.field_r = pb.field_j / 100;
          if (0 > param1.field_p) {
            break L0;
          } else {
            L1: {
              if (param1.field_z == null) {
                break L1;
              } else {
                if (!param1.field_z.h()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param1.a(123);
              param1.a(false);
              if (0 >= param1.field_k) {
                break L2;
              } else {
                if (((jp) this).field_B[param1.field_n][param1.field_k] != param1) {
                  break L2;
                } else {
                  ((jp) this).field_B[param1.field_n][param1.field_k] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param1.field_y;
          if ((var6 ^ -1) >= -1) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(0.5 + Math.pow(2.0, 0.0004921259842519685 * (double)((jp) this).field_s[param1.field_n]) * 16.0);
              if (-1 < (var6 ^ -1)) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param1.field_y = var6;
            break L3;
          }
        }
        L5: {
          param1.field_z.e(this.a((byte) -78, param1));
          var7 = param1.field_B;
          var8 = param4 ? 1 : 0;
          param1.field_o = param1.field_o + 1;
          param1.field_m = param1.field_m + var7.field_c;
          var9 = (double)((param1.field_y * param1.field_C >> -870657300) + (-60 + param1.field_h << 996962184)) * 0.000005086263020833333;
          if (-1 <= var7.field_e) {
            break L5;
          } else {
            L6: {
              if (-1 >= var7.field_h) {
                param1.field_w = param1.field_w + 128;
                break L6;
              } else {
                param1.field_w = param1.field_w + (int)(0.5 + Math.pow(2.0, (double)var7.field_h * var9) * 128.0);
                break L6;
              }
            }
            if (-819201 < (var7.field_e * param1.field_w ^ -1)) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          }
        }
        L7: {
          if (null != var7.field_j) {
            L8: {
              if (0 >= var7.field_d) {
                param1.field_l = param1.field_l + 128;
                break L8;
              } else {
                param1.field_l = param1.field_l + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (var7.field_j.length - 2 <= param1.field_A) {
                  break L10;
                } else {
                  if ((65280 & var7.field_j[2 + param1.field_A] << 954440936) >= param1.field_l) {
                    break L10;
                  } else {
                    param1.field_A = param1.field_A + 2;
                    continue L9;
                  }
                }
              }
              if (-2 + var7.field_j.length != param1.field_A) {
                break L7;
              } else {
                if (var7.field_j[1 + param1.field_A] != 0) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              }
            }
          } else {
            break L7;
          }
        }
        L11: {
          if ((param1.field_p ^ -1) > -1) {
            break L11;
          } else {
            if (null == var7.field_b) {
              break L11;
            } else {
              if (0 == (1 & ((jp) this).field_u[param1.field_n])) {
                L12: {
                  if (0 > param1.field_k) {
                    break L12;
                  } else {
                    if (param1 != ((jp) this).field_B[param1.field_n][param1.field_k]) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (-1 > (var7.field_k ^ -1)) {
                    param1.field_p = param1.field_p + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
                    break L13;
                  } else {
                    param1.field_p = param1.field_p + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (param1.field_q >= -2 + var7.field_b.length) {
                      break L15;
                    } else {
                      if ((var7.field_b[param1.field_q - -2] << 1973005160 & 65280) >= param1.field_p) {
                        break L15;
                      } else {
                        param1.field_q = param1.field_q + 2;
                        continue L14;
                      }
                    }
                  }
                  if (var7.field_b.length - 2 == param1.field_q) {
                    var8 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
          }
        }
        if (var8 != 0) {
          L16: {
            param1.field_z.c(param1.field_r);
            if (param2 == null) {
              param1.field_z.a(param3);
              break L16;
            } else {
              param1.field_z.a(param2, param0, param3);
              break L16;
            }
          }
          L17: {
            if (!param1.field_z.e()) {
              break L17;
            } else {
              ((jp) this).field_k.field_j.a((tda) (Object) param1.field_z);
              break L17;
            }
          }
          L18: {
            param1.a(117);
            if (0 <= param1.field_p) {
              param1.a(false);
              if (-1 <= (param1.field_k ^ -1)) {
                break L18;
              } else {
                if (param1 != ((jp) this).field_B[param1.field_n][param1.field_k]) {
                  break L18;
                } else {
                  ((jp) this).field_B[param1.field_n][param1.field_k] = null;
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          return true;
        } else {
          param1.field_z.a(param1.field_r, this.a(false, param1), this.a(806727846, param1));
          return false;
        }
    }

    final synchronized void a(kia param0, byte param1, boolean param2) {
        if (param1 > -108) {
            return;
        }
        this.a(param2, true, param0, 23721);
    }

    private final int a(byte param0, fh param1) {
        int var3 = 0;
        un var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = (param1.field_C * param1.field_y >> 577414412) + param1.field_x;
          var3 = var3 + ((((jp) this).field_x[param1.field_n] + -8192) * ((jp) this).field_A[param1.field_n] >> 628228684);
          var4 = param1.field_B;
          if (0 >= var4.field_c) {
            break L0;
          } else {
            L1: {
              if (0 < var4.field_l) {
                break L1;
              } else {
                if (0 < ((jp) this).field_r[param1.field_n]) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              var5 = var4.field_l << -631508414;
              var6 = var4.field_g << 1610693633;
              if (var6 > param1.field_o) {
                var5 = param1.field_o * var5 / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((jp) this).field_r[param1.field_n] >> -1645252793);
            var7 = Math.sin((double)(511 & param1.field_m) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L0;
          }
        }
        L3: {
          if (param0 <= -58) {
            break L3;
          } else {
            tda discarded$1 = ((jp) this).b();
            break L3;
          }
        }
        L4: {
          var5 = (int)((double)(param1.field_f.field_h * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)pb.field_j + 0.5);
          if (var5 >= 1) {
            stackOut_12_0 = var5;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var3 = 55 / ((param0 - 4) / 50);
          if (hh.field_d == param1) {
            break L0;
          } else {
            jq.field_k = new int[param1];
            var4 = 0;
            L1: while (true) {
              if (param1 <= var4) {
                wp.field_r = param1 + -1;
                qna.field_k = 32 * param1;
                hh.field_d = param1;
                break L0;
              } else {
                jq.field_k[var4] = (var4 << 1742236492) / param1;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param2 != bi.field_g) {
            L3: {
              if (param2 == hh.field_d) {
                tj.field_f = jq.field_k;
                break L3;
              } else {
                tj.field_f = new int[param2];
                var4 = 0;
                L4: while (true) {
                  if (param2 <= var4) {
                    break L3;
                  } else {
                    tj.field_f[var4] = (var4 << -80927764) / param2;
                    var4++;
                    continue L4;
                  }
                }
              }
            }
            it.field_r = param2 + -1;
            bi.field_g = param2;
            break L2;
          } else {
            break L2;
          }
        }
    }

    final void a(int param0, fh param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param1.field_f.field_i.length;
            if (!param2) {
              break L1;
            } else {
              if (param1.field_f.field_k) {
                var6 = var4 + (var4 - param1.field_f.field_g);
                var5 = (int)((long)((jp) this).field_y[param1.field_n] * (long)var6 >> 809594182);
                var4 = var4 << 8;
                if (var5 >= var4) {
                  var5 = -1 + (var4 + (var4 + -var5));
                  param1.field_z.b(true);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = (int)((long)((jp) this).field_y[param1.field_n] * (long)var4 >> -1025182714);
          break L0;
        }
        L2: {
          if (param0 == 809594182) {
            break L2;
          } else {
            ((jp) this).field_E = null;
            break L2;
          }
        }
        param1.field_z.b(var5);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        if (param1 == 15) {
          var3 = 240 & param0;
          if (-129 != (var3 ^ -1)) {
            L0: {
              if (144 != var3) {
                if ((var3 ^ -1) != -161) {
                  if (var3 == 176) {
                    L1: {
                      var4 = 15 & param0;
                      var5 = (32608 & param0) >> -811345496;
                      var6 = param0 >> 290203952 & 127;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        ((jp) this).field_F[var4] = (var6 << -401017458) + dda.a(-2080769, ((jp) this).field_F[var4]);
                        break L1;
                      }
                    }
                    L2: {
                      if (32 == var5) {
                        ((jp) this).field_F[var4] = (var6 << -905294777) + dda.a(((jp) this).field_F[var4], -16257);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (1 == var5) {
                        ((jp) this).field_r[var4] = (var6 << -1252442457) + dda.a(((jp) this).field_r[var4], -16257);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if ((var5 ^ -1) != -34) {
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
                        ((jp) this).field_s[var4] = dda.a(((jp) this).field_s[var4], -16257) + (var6 << 1420837127);
                        break L5;
                      }
                    }
                    L6: {
                      if (var5 == -38) {
                        ((jp) this).field_s[var4] = var6 + dda.a(((jp) this).field_s[var4], -128);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (-8 != var5) {
                        break L7;
                      } else {
                        ((jp) this).field_J[var4] = (var6 << -2132511161) + dda.a(((jp) this).field_J[var4], -16257);
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
                      if (-11 != (var5 ^ -1)) {
                        break L9;
                      } else {
                        ((jp) this).field_D[var4] = (var6 << 2090927463) + dda.a(-16257, ((jp) this).field_D[var4]);
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
                        ((jp) this).field_N[var4] = (var6 << -1463942713) + dda.a(-16257, ((jp) this).field_N[var4]);
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
                        ((jp) this).field_w[var4] = dda.a(127, ((jp) this).field_w[var4]) - -(var6 << -935801465);
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
                      if ((var5 ^ -1) == -102) {
                        ((jp) this).field_w[var4] = dda.a(((jp) this).field_w[var4], 127) + (16384 + (var6 << 1827722823));
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if ((var5 ^ -1) != -101) {
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
                      if (-122 == (var5 ^ -1)) {
                        this.a(var4, (byte) -22);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if ((var5 ^ -1) == -124) {
                        this.d(1, var4);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if ((var5 ^ -1) != -7) {
                        break L22;
                      } else {
                        var7 = ((jp) this).field_w[var4];
                        if (16384 == var7) {
                          ((jp) this).field_A[var4] = dda.a(((jp) this).field_A[var4], -16257) - -(var6 << -20867225);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (-39 == (var5 ^ -1)) {
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
                      if (-17 == (var5 ^ -1)) {
                        ((jp) this).field_y[var4] = (var6 << -84424121) + dda.a(-16257, ((jp) this).field_y[var4]);
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
                        if (-65 < (var6 ^ -1)) {
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
                      if (-18 == (var5 ^ -1)) {
                        this.d((var6 << -1210907001) + (-16257 & ((jp) this).field_C[var4]), (byte) 113, var4);
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
                    if (-193 != (var3 ^ -1)) {
                      if ((var3 ^ -1) != -209) {
                        if (var3 == 224) {
                          var4 = 15 & param0;
                          var5 = (param0 >> -724227960 & 127) + (16256 & param0 >> -1803764919);
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
                        var5 = (32514 & param0) >> 307822568;
                        this.c(var5, (byte) -56, var4);
                        return;
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = param0 >> -643970648 & 127;
                      this.a((byte) -81, ((jp) this).field_F[var4] - -var5, var4);
                      return;
                    }
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = (32666 & param0) >> 1440689800;
                  var6 = param0 >> -1712193840 & 127;
                  this.a(-18793, var5, var4, var6);
                  return;
                }
              } else {
                var4 = 15 & param0;
                var5 = 127 & param0 >> -986031512;
                var6 = 127 & param0 >> -661174576;
                if (-1 <= (var6 ^ -1)) {
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
            var5 = (param0 & 32675) >> -468597144;
            var6 = 127 & param0 >> 475809968;
            this.a(var5, var6, var4, (byte) -51);
            return;
          }
        } else {
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
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((jp) this).field_B[param2][var4] = null;
            }
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((jp) this).field_z.a();
        if (!param1) {
            this.a(-48, 13, 7, 105);
        }
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
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        this.a(param1, true);
        ((jp) this).field_z.a(param2.field_g);
        ((jp) this).field_q = 0L;
        ((jp) this).field_j = param0 ? true : false;
        int var5 = ((jp) this).field_z.c();
        for (var6 = 0; var6 < var5; var6++) {
            ((jp) this).field_z.c(var6);
            ((jp) this).field_z.e(var6);
            ((jp) this).field_z.f(var6);
        }
        if (param3 != 23721) {
            this.c(-121, (byte) -69, 4);
        }
        ((jp) this).field_l = ((jp) this).field_z.g();
        ((jp) this).field_o = ((jp) this).field_z.field_i[((jp) this).field_l];
        ((jp) this).field_K = ((jp) this).field_z.b(((jp) this).field_o);
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 >= 0) {
          L0: {
            ((jp) this).field_J[param0] = 12800;
            ((jp) this).field_D[param0] = 8192;
            ((jp) this).field_N[param0] = 16383;
            ((jp) this).field_x[param0] = 8192;
            if (param1 == -22) {
              break L0;
            } else {
              ((jp) this).field_L = 28;
              break L0;
            }
          }
          ((jp) this).field_r[param0] = 0;
          ((jp) this).field_s[param0] = 8192;
          this.e(param1 + 34, param0);
          this.f(-28068, param0);
          ((jp) this).field_u[param0] = 0;
          ((jp) this).field_w[param0] = 32767;
          ((jp) this).field_A[param0] = 256;
          ((jp) this).field_y[param0] = 0;
          this.d(8192, (byte) 93, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.a(param0, (byte) -22);
              param0++;
              continue L1;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (-1 == (((jp) this).field_v[param1.field_n] ^ -1)) {
            return 0;
        }
        un var9 = param1.field_B;
        un var10 = var9;
        int var4 = 4096 + ((jp) this).field_N[param1.field_n] * ((jp) this).field_J[param1.field_n] >> -1617471603;
        var4 = var4 * var4 + 16384 >> -1781679633;
        var4 = var4 * param1.field_u - -16384 >> 290162255;
        var4 = 128 + ((jp) this).field_t * var4 >> -1716716792;
        var4 = 128 + ((jp) this).field_v[param1.field_n] * var4 >> -1526081848;
        if ((var10.field_e ^ -1) < -1) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param1.field_w * 0.00001953125 * (double)var10.field_e) + 0.5);
        }
        if (param0) {
            return -64;
        }
        if (!(null == var10.field_j)) {
            var5 = param1.field_l;
            var6 = var10.field_j[1 + param1.field_A];
            if (param1.field_A < -2 + var10.field_j.length) {
                var7 = var9.field_j[param1.field_A] << -943857336 & 65280;
                var8 = (255 & var10.field_j[2 + param1.field_A]) << 1887768136;
                var6 = var6 + (-var6 + var10.field_j[param1.field_A + 3]) * (var5 - var7) / (var8 + -var7);
            }
            var4 = var4 * var6 - -32 >> -2011070362;
        }
        if ((param1.field_p ^ -1) < -1) {
            if (!(var10.field_b == null)) {
                var5 = param1.field_p;
                var6 = var10.field_b[param1.field_q - -1];
                if (var10.field_b.length + -2 > param1.field_q) {
                    var7 = var9.field_b[param1.field_q] << 1011047432 & 65280;
                    var8 = var10.field_b[2 + param1.field_q] << -1118449752 & 65280;
                    var6 = var6 + (var10.field_b[3 + param1.field_q] - var6) * (var5 + -var7) / (-var7 + var8);
                }
                var4 = var4 * var6 - -32 >> -1223959994;
            }
        }
        return var4;
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
        if (param3 != -51) {
            ((jp) this).b(107);
        }
        fh var8 = ((jp) this).field_H[param2][param0];
        if (!(var8 != null)) {
            return;
        }
        ((jp) this).field_H[param2][param0] = null;
        if ((((jp) this).field_u[param2] & 2) == 0) {
            var8.field_p = 0;
        } else {
            var6 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
            while (var6 != null) {
                if (var6.field_n == var8.field_n) {
                    if (var6.field_p < 0) {
                        if (!(var6 == var8)) {
                            var8.field_p = 0;
                            break;
                        }
                    }
                }
                var6 = (fh) (Object) ((jp) this).field_k.field_k.c(param3 + 51);
            }
        }
    }

    private final void f(int param0, int param1) {
        fh var3 = null;
        int var4 = BachelorFridge.field_y;
        if (-1 != (4 & ((jp) this).field_u[param1] ^ -1)) {
            var3 = (fh) (Object) ((jp) this).field_k.field_k.b((byte) 90);
            while (var3 != null) {
                if (param1 == var3.field_n) {
                    var3.field_t = 0;
                }
                var3 = (fh) (Object) ((jp) this).field_k.field_k.c(param0 + 28068);
            }
        }
        if (param0 != -28068) {
            ((jp) this).field_l = 78;
        }
    }

    final synchronized boolean a(vr param0, kia param1, i param2, byte param3, int param4) {
        int[] var7_array = null;
        int var10 = 0;
        eka var11 = null;
        eka var11_ref = null;
        int var12 = BachelorFridge.field_y;
        param1.a();
        int var6 = 1;
        Object var7 = null;
        if (-1 > (param4 ^ -1)) {
            var7_array = new int[]{param4};
        }
        g var8 = (g) (Object) param1.field_f.b(-13023);
        int var9 = 47 / ((57 - param3) / 37);
        while (var8 != null) {
            var10 = (int)var8.field_c;
            var11 = (eka) (Object) ((jp) this).field_m.a(true, (long)var10);
            if (var11 != null) {
                // ifeq L185
            } else {
                var11_ref = wj.a(param0, false, var10);
                if (var11_ref == null) {
                    var6 = 0;
                } else {
                    ((jp) this).field_m.a((long)var10, (byte) -89, (bw) (Object) var11_ref);
                    if (!(var11_ref.a(var8.field_h, 1436234146, param2, var7_array))) {
                        var6 = 0;
                    }
                }
            }
            var8 = (g) (Object) param1.field_f.c(-21446);
        }
        if (var6 != 0) {
            param1.b();
        }
        return var6 != 0;
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
        if (param0 != -18793) {
            ((jp) this).field_A = null;
        }
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
