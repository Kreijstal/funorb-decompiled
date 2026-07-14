/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends nm {
    private int[] field_F;
    int[] field_E;
    private qd[][] field_u;
    private int field_w;
    private int[] field_P;
    private int[] field_C;
    private int[] field_q;
    private int[] field_O;
    private int[] field_S;
    private int[] field_n;
    private al field_v;
    private int[] field_x;
    private int[] field_z;
    private int[] field_o;
    private kl field_s;
    private int[] field_p;
    int[] field_r;
    static char[] field_I;
    private qd[][] field_U;
    int[] field_Q;
    private int field_y;
    static lh field_M;
    private int[] field_t;
    private int[] field_R;
    static ed field_A;
    private boolean field_K;
    private long field_J;
    private int field_G;
    private long field_N;
    private mi field_B;
    private int field_T;
    private boolean field_D;
    private int field_H;
    private pf field_W;

    final synchronized void e(int param0) {
        this.b(param0 ^ -3347, true);
        if (param0 != -3435) {
            Object var3 = null;
            int discarded$0 = this.a(24, (qd) null);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Chess.field_G;
          if (!((vl) this).field_v.e()) {
            break L0;
          } else {
            var2 = ((vl) this).field_v.field_h * ((vl) this).field_w / md.field_l;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + ((vl) this).field_N;
              if ((((vl) this).field_J - var3 ^ -1L) > -1L) {
                var5 = (int)((-1L + (long)var2 + (((vl) this).field_J + -((vl) this).field_N)) / (long)var2);
                ((vl) this).field_N = ((vl) this).field_N + (long)var5 * (long)var2;
                ((vl) this).field_B.a(var5);
                param0 = param0 - var5;
                this.d(0);
                if (!((vl) this).field_v.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((vl) this).field_N = var3;
                break L0;
              }
            }
          }
        }
        ((vl) this).field_B.a(param0);
    }

    final boolean a(byte param0, qd param1) {
        if (param0 != -25) {
            return false;
        }
        if (param1.field_j == null) {
            if (-1 < param1.field_J) {
                return true;
            }
            param1.c(-2193);
            if (-1 < param1.field_A) {
                if (((vl) this).field_U[param1.field_n][param1.field_A] == param1) {
                    ((vl) this).field_U[param1.field_n][param1.field_A] = null;
                }
            }
            return true;
        }
        return false;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Chess.field_G;
        if (param0 != ((vl) this).field_p[param2]) {
            ((vl) this).field_p[param2] = param0;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((vl) this).field_U[param2][var4] = null;
            }
        }
        if (!param1) {
            Object var6 = null;
            ((vl) this).a((int[]) null, 120, 45);
        }
    }

    final synchronized boolean d(byte param0) {
        if (param0 >= -123) {
            ((vl) this).field_J = 63L;
        }
        return ((vl) this).field_v.e();
    }

    final boolean a(int param0, int param1, int[] param2, int param3, qd param4) {
        int var6 = 0;
        dl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Chess.field_G;
          param4.field_B = md.field_l / 100;
          if (0 > param4.field_J) {
            break L0;
          } else {
            L1: {
              if (null == param4.field_j) {
                break L1;
              } else {
                if (param4.field_j.h()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param4.c((byte) 124);
              param4.c(-2193);
              if (0 >= param4.field_A) {
                break L2;
              } else {
                if (param4 == ((vl) this).field_U[param4.field_n][param4.field_A]) {
                  ((vl) this).field_U[param4.field_n][param4.field_A] = null;
                  break L2;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param4.field_D;
          if (0 < var6) {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((vl) this).field_S[param4.field_n]) + 0.5);
              if (var6 < 0) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param4.field_D = var6;
            break L3;
          } else {
            break L3;
          }
        }
        param4.field_j.g(this.a(39, param4));
        var7 = param4.field_K;
        if (param0 == 35) {
          L5: {
            var8 = 0;
            param4.field_F = param4.field_F + var7.field_e;
            param4.field_s = param4.field_s + 1;
            var9 = 0.000005086263020833333 * (double)((param4.field_k * param4.field_D >> -1776368532) + (param4.field_C + -60 << 449044392));
            if (-1 > (var7.field_b ^ -1)) {
              L6: {
                if (0 < var7.field_i) {
                  param4.field_p = param4.field_p + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_i * var9));
                  break L6;
                } else {
                  param4.field_p = param4.field_p + 128;
                  break L6;
                }
              }
              if (819200 > param4.field_p * var7.field_b) {
                break L5;
              } else {
                var8 = 1;
                break L5;
              }
            } else {
              break L5;
            }
          }
          L7: {
            if (var7.field_a == null) {
              break L7;
            } else {
              L8: {
                if (var7.field_l <= 0) {
                  param4.field_y = param4.field_y + 128;
                  break L8;
                } else {
                  param4.field_y = param4.field_y + (int)(0.5 + Math.pow(2.0, (double)var7.field_l * var9) * 128.0);
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (-2 + var7.field_a.length <= param4.field_E) {
                    break L10;
                  } else {
                    if (param4.field_y <= (65280 & var7.field_a[2 + param4.field_E] << -1244566680)) {
                      break L10;
                    } else {
                      param4.field_E = param4.field_E + 2;
                      continue L9;
                    }
                  }
                }
                if (param4.field_E != -2 + var7.field_a.length) {
                  break L7;
                } else {
                  if (-1 == (var7.field_a[1 + param4.field_E] ^ -1)) {
                    var8 = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
          }
          L11: {
            if (param4.field_J > -1) {
              break L11;
            } else {
              if (var7.field_k == null) {
                break L11;
              } else {
                if (-1 == (((vl) this).field_Q[param4.field_n] & 1)) {
                  L12: {
                    if (0 > param4.field_A) {
                      break L12;
                    } else {
                      if (((vl) this).field_U[param4.field_n][param4.field_A] != param4) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if ((var7.field_d ^ -1) < -1) {
                      param4.field_J = param4.field_J + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_d) * 128.0);
                      break L13;
                    } else {
                      param4.field_J = param4.field_J + 128;
                      break L13;
                    }
                  }
                  L14: while (true) {
                    L15: {
                      if (param4.field_o >= -2 + var7.field_k.length) {
                        break L15;
                      } else {
                        if (param4.field_J <= (65280 & var7.field_k[2 + param4.field_o] << 1620843720)) {
                          break L15;
                        } else {
                          param4.field_o = param4.field_o + 2;
                          continue L14;
                        }
                      }
                    }
                    if (param4.field_o == var7.field_k.length + -2) {
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
              param4.field_j.d(param4.field_B);
              if (param2 != null) {
                param4.field_j.a(param2, param3, param1);
                break L16;
              } else {
                param4.field_j.a(param1);
                break L16;
              }
            }
            L17: {
              if (!param4.field_j.g()) {
                break L17;
              } else {
                ((vl) this).field_B.field_p.a((nm) (Object) param4.field_j);
                break L17;
              }
            }
            L18: {
              param4.c((byte) 117);
              if (param4.field_J < 0) {
                break L18;
              } else {
                param4.c(param0 + -2228);
                if (0 >= param4.field_A) {
                  break L18;
                } else {
                  if (param4 != ((vl) this).field_U[param4.field_n][param4.field_A]) {
                    break L18;
                  } else {
                    ((vl) this).field_U[param4.field_n][param4.field_A] = null;
                    break L18;
                  }
                }
              }
            }
            return true;
          } else {
            param4.field_j.a(param4.field_B, this.a(param4, (byte) -127), this.b(param0 + 1276, param4));
            return false;
          }
        } else {
          return false;
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = 0;
        var4 = Chess.field_G;
        if (param1 < 0) {
          param1 = 0;
          L0: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.b((byte) 80, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          L1: {
            ((vl) this).field_O[param1] = 12800;
            ((vl) this).field_o[param1] = 8192;
            ((vl) this).field_C[param1] = 16383;
            ((vl) this).field_t[param1] = 8192;
            ((vl) this).field_P[param1] = 0;
            ((vl) this).field_S[param1] = 8192;
            this.c(param1, 1);
            this.a(param1, false);
            if (param0 > 63) {
              break L1;
            } else {
              ((vl) this).field_F = null;
              break L1;
            }
          }
          ((vl) this).field_Q[param1] = 0;
          ((vl) this).field_x[param1] = 32767;
          ((vl) this).field_F[param1] = 256;
          ((vl) this).field_r[param1] = 0;
          this.b(param1, 8192, (byte) 97);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        qd var5 = null;
        lm var6 = null;
        int var6_int = 0;
        qd var7 = null;
        qd var8 = null;
        int var9 = 0;
        kf var10 = null;
        kf var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qd stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qd stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qd stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qd stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        qd stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qd stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = Chess.field_G;
          this.c(64, param0, param1, -62);
          if ((((vl) this).field_Q[param1] & 2) != 0) {
            var5 = (qd) (Object) ((vl) this).field_B.field_x.b(param3 + 50101);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_n != param1) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_J ^ -1)) {
                      ((vl) this).field_u[param1][var5.field_C] = null;
                      ((vl) this).field_u[param1][param0] = var5;
                      var6_int = var5.field_z + (var5.field_D * var5.field_k >> -1793919700);
                      var5.field_z = var5.field_z + (-var5.field_C + param0 << -2060286680);
                      var5.field_C = param0;
                      var5.field_k = -var5.field_z + var6_int;
                      var5.field_D = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (qd) (Object) ((vl) this).field_B.field_x.a(true);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (kf) (Object) ((vl) this).field_s.a(-108, (long)((vl) this).field_p[param1]);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_s[param0];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new qd();
              var7.field_q = var11;
              var7.field_H = var6;
              var7.field_n = param1;
              var7.field_K = var10.field_r[param0];
              var7.field_A = var10.field_l[param0];
              var7.field_C = param0;
              var7.field_t = 1024 + var11.field_n * (param2 * param2) * var10.field_k[param0] >> -1238274965;
              var7.field_v = var10.field_q[param0] & 255;
              var7.field_z = -(var10.field_p[param0] & 32767) + (param0 << -576818520);
              var7.field_o = 0;
              var7.field_J = -1;
              var7.field_E = 0;
              var7.field_p = 0;
              var7.field_y = 0;
              if (((vl) this).field_r[param1] == 0) {
                var7.field_j = na.a(var6, this.a(83, var7), this.a(var7, (byte) -128), this.b(1311, var7));
                break L3;
              } else {
                L4: {
                  var7.field_j = na.a(var6, this.a(90, var7), 0, this.b(1311, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = -109;
                  stackOut_15_2 = (qd) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (0 <= var10.field_p[param0]) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (qd) (Object) stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (qd) (Object) stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((vl) this).a((byte) stackIn_18_1, (qd) (Object) stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              }
            }
            L5: {
              if (0 > var10.field_p[param0]) {
                var7.field_j.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var7.field_A ^ -1) <= -1) {
                L7: {
                  var8 = ((vl) this).field_U[param1][var7.field_A];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_J >= 0) {
                      break L7;
                    } else {
                      ((vl) this).field_u[param1][var8.field_C] = null;
                      var8.field_J = 0;
                      break L7;
                    }
                  }
                }
                ((vl) this).field_U[param1][var7.field_A] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((vl) this).field_B.field_x.a((o) (Object) var7, (byte) -46);
            if (param3 == -21164) {
              ((vl) this).field_u[param1][param0] = var7;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, qd param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param1.field_H.field_m.length;
            if (!param2) {
              break L1;
            } else {
              if (!param1.field_H.field_o) {
                break L1;
              } else {
                var6 = var4 + (var4 + -param1.field_H.field_k);
                var4 = var4 << 8;
                var5 = (int)((long)((vl) this).field_r[param1.field_n] * (long)var6 >> 1715642630);
                if (var5 >= var4) {
                  var5 = -1 + (var4 + var4 - var5);
                  param1.field_j.a(true);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = (int)((long)((vl) this).field_r[param1.field_n] * (long)var4 >> 1736311942);
          break L0;
        }
        L2: {
          param1.field_j.e(var5);
          if (param0 <= -63) {
            break L2;
          } else {
            ((vl) this).field_s = null;
            break L2;
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, int param1) {
        int var4 = Chess.field_G;
        if (param1 >= -70) {
            ((vl) this).field_w = -126;
        }
        qd var3 = (qd) (Object) ((vl) this).field_B.field_x.g(-18110);
        while (var3 != null) {
            if (param0 >= 0) {
                // if_icmpne L166
            }
            if (var3.field_j != null) {
                var3.field_j.d(md.field_l / 100);
                if (!(!var3.field_j.g())) {
                    ((vl) this).field_B.field_p.a((nm) (Object) var3.field_j);
                }
                var3.c((byte) 105);
            }
            if (0 > var3.field_J) {
                ((vl) this).field_u[var3.field_n][var3.field_C] = null;
            }
            var3.c(-2193);
            var3 = (qd) (Object) ((vl) this).field_B.field_x.a((byte) -108);
        }
    }

    private final int a(qd param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (-1 == (((vl) this).field_z[param0.field_n] ^ -1)) {
            return 0;
        }
        dl var9 = param0.field_K;
        dl var10 = var9;
        int var4 = ((vl) this).field_O[param0.field_n] * ((vl) this).field_C[param0.field_n] - -4096 >> 153557613;
        var4 = 16384 + var4 * var4 >> -1696854705;
        var4 = 16384 + param0.field_t * var4 >> 1371648847;
        var4 = var4 * ((vl) this).field_y + 128 >> -1554458744;
        var4 = ((vl) this).field_z[param0.field_n] * var4 + 128 >> -437025880;
        if (-1 > (var10.field_b ^ -1)) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_b * (0.00001953125 * (double)param0.field_p)) * (double)var4);
        }
        if (!(var10.field_a == null)) {
            var5 = param0.field_y;
            var6 = var10.field_a[1 + param0.field_E];
            if (param0.field_E < var10.field_a.length + -2) {
                var7 = (255 & var9.field_a[param0.field_E]) << 582887720;
                var8 = var10.field_a[2 + param0.field_E] << -758717048 & 65280;
                var6 = var6 + (var10.field_a[3 + param0.field_E] - var6) * (var5 - var7) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> -1291114778;
        }
        if (0 < param0.field_J) {
            if (var10.field_k != null) {
                var5 = param0.field_J;
                var6 = var10.field_k[param0.field_o - -1];
                if (param0.field_o < var10.field_k.length - 2) {
                    var7 = var9.field_k[param0.field_o] << 1833098536 & 65280;
                    var8 = 65280 & var10.field_k[param0.field_o - -2] << 2068153064;
                    var6 = var6 + (var5 - var7) * (var10.field_k[param0.field_o + 3] - var6) / (-var7 + var8);
                }
                var4 = 32 + var4 * var6 >> 585492006;
            }
        }
        if (param1 > -126) {
            return 80;
        }
        return var4;
    }

    private final int b(int param0, qd param1) {
        if (param0 != 1311) {
            ((vl) this).field_q = null;
        }
        int var3 = ((vl) this).field_o[param1.field_n];
        if (8192 <= var3) {
            return -(32 + (16384 + -var3) * (128 - param1.field_v) >> 1844283782) + 16384;
        }
        return var3 * param1.field_v - -32 >> 733021190;
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = Chess.field_G;
        if (param0) {
            this.a(-1, -109);
        } else {
            this.a((byte) 106, -1);
        }
        this.b((byte) 118, -1);
        if (param1 != -38) {
            return;
        }
        for (var3 = 0; var3 < 16; var3++) {
            ((vl) this).field_p[var3] = ((vl) this).field_n[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((vl) this).field_q[var5] = ce.a(((vl) this).field_n[var5], -128);
            var5++;
        }
    }

    final synchronized nm b() {
        return null;
    }

    private final void a(int param0, boolean param1) {
        qd var3 = null;
        int var4 = Chess.field_G;
        if (!(-1 == (((vl) this).field_Q[param0] & 4 ^ -1))) {
            var3 = (qd) (Object) ((vl) this).field_B.field_x.g(-18110);
            while (var3 != null) {
                if (param0 == var3.field_n) {
                    var3.field_x = 0;
                }
                var3 = (qd) (Object) ((vl) this).field_B.field_x.a((byte) -97);
            }
        }
        if (param1) {
            ((vl) this).field_z = null;
        }
    }

    final synchronized boolean a(um param0, int param1, int param2, pf param3, fe param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        td var8 = null;
        int var9 = 0;
        int var11 = 0;
        kf var12 = null;
        kf var13 = null;
        var11 = Chess.field_G;
        param3.b();
        if (param1 < -48) {
          L0: {
            var6 = 1;
            var7 = null;
            if ((param2 ^ -1) >= -1) {
              break L0;
            } else {
              var7_array = new int[]{param2};
              break L0;
            }
          }
          var8 = (td) (Object) param3.field_k.a(true);
          L1: while (true) {
            if (var8 == null) {
              L2: {
                if (var6 != 0) {
                  param3.a();
                  break L2;
                } else {
                  break L2;
                }
              }
              return var6 != 0;
            } else {
              L3: {
                var9 = (int)var8.field_e;
                var12 = (kf) (Object) ((vl) this).field_s.a(71, (long)var9);
                if (var12 == null) {
                  var13 = ij.a(-109, var9, param0);
                  if (var13 != null) {
                    ((vl) this).field_s.a(-128, (long)var9, (o) (Object) var13);
                    if (var13.a(var7_array, param4, (byte) -73, var8.field_q)) {
                      break L3;
                    } else {
                      var6 = 0;
                      break L3;
                    }
                  } else {
                    var6 = 0;
                    break L3;
                  }
                } else {
                  if (var12.a(var7_array, param4, (byte) -73, var8.field_q)) {
                    break L3;
                  } else {
                    var6 = 0;
                    var8 = (td) (Object) param3.field_k.b((byte) 83);
                    continue L1;
                  }
                }
              }
              var8 = (td) (Object) param3.field_k.b((byte) 83);
              continue L1;
            }
          }
        } else {
          return true;
        }
    }

    final synchronized void a(boolean param0, pf param1, int param2) {
        this.a(true, 2, param1, param0);
        if (param2 <= 16) {
            ((vl) this).field_w = 27;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -100) {
            return;
        }
        ((vl) this).field_y = param0;
    }

    private final synchronized void a(boolean param0, int param1, pf param2, boolean param3) {
        int var6 = 0;
        int var7 = Chess.field_G;
        this.b(param1 + 85, param0);
        ((vl) this).field_v.a(param2.field_j);
        ((vl) this).field_K = param3 ? true : false;
        ((vl) this).field_N = 0L;
        int var5 = ((vl) this).field_v.c();
        for (var6 = 0; var5 > var6; var6++) {
            ((vl) this).field_v.d(var6);
            ((vl) this).field_v.c(var6);
            ((vl) this).field_v.b(var6);
        }
        if (param1 != 2) {
            ((vl) this).field_O = null;
        }
        ((vl) this).field_G = ((vl) this).field_v.f();
        ((vl) this).field_T = ((vl) this).field_v.field_d[((vl) this).field_G];
        ((vl) this).field_J = ((vl) this).field_v.f(((vl) this).field_T);
    }

    private final void a(int param0, int param1, int param2) {
        ((vl) this).field_n[param2] = param1;
        if (param0 <= 12) {
            return;
        }
        ((vl) this).field_q[param2] = ce.a(param1, -128);
        this.a(param1, true, param2);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        qd var6 = null;
        int var7 = 0;
        qd var8 = null;
        var7 = Chess.field_G;
        var8 = ((vl) this).field_u[param2][param1];
        if (var8 != null) {
          L0: {
            if (param3 < -60) {
              break L0;
            } else {
              ((vl) this).field_B = null;
              break L0;
            }
          }
          L1: {
            ((vl) this).field_u[param2][param1] = null;
            if ((2 & ((vl) this).field_Q[param2]) == 0) {
              var8.field_J = 0;
              break L1;
            } else {
              var6 = (qd) (Object) ((vl) this).field_B.field_x.g(-18110);
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var6.field_n != var8.field_n) {
                      break L3;
                    } else {
                      if (0 <= var6.field_J) {
                        break L3;
                      } else {
                        if (var8 != var6) {
                          var8.field_J = 0;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6 = (qd) (Object) ((vl) this).field_B.field_x.a((byte) -116);
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized nm a() {
        return (nm) (Object) ((vl) this).field_B;
    }

    private final void a(byte param0, int param1) {
        int var4 = Chess.field_G;
        qd var3 = (qd) (Object) ((vl) this).field_B.field_x.g(-18110);
        if (param0 <= 86) {
            ((vl) this).field_E = null;
        }
        while (var3 != null) {
            if (-1 >= param1) {
                // if_icmpeq L62
            } else {
                if (-1 > var3.field_J) {
                    ((vl) this).field_u[var3.field_n][var3.field_C] = null;
                    var3.field_J = 0;
                }
            }
            var3 = (qd) (Object) ((vl) this).field_B.field_x.a((byte) -102);
        }
    }

    private final void c(int param0, int param1) {
        qd var3 = null;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          if ((((vl) this).field_Q[param0] & 2) != 0) {
            var3 = (qd) (Object) ((vl) this).field_B.field_x.g(param1 ^ -18109);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var3.field_n) {
                    break L2;
                  } else {
                    if (null == ((vl) this).field_u[param0][var3.field_C]) {
                      if (0 > var3.field_J) {
                        var3.field_J = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (qd) (Object) ((vl) this).field_B.field_x.a((byte) -102);
                      continue L1;
                    }
                  }
                }
                var3 = (qd) (Object) ((vl) this).field_B.field_x.a((byte) -102);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param1 == 1) {
            break L3;
          } else {
            ((vl) this).field_x = null;
            break L3;
          }
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        ((vl) this).field_v.g();
        ((vl) this).field_W = null;
        this.a(param1, (byte) -38);
        if (param0 < 20) {
            ((vl) this).field_S = null;
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
            field_A = null;
        }
        field_I = null;
        field_A = null;
        field_M = null;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Chess.field_G;
          if (((vl) this).field_v.e()) {
            var4 = ((vl) this).field_w * ((vl) this).field_v.field_h / md.field_l;
            L1: while (true) {
              L2: {
                var5 = ((vl) this).field_N - -((long)var4 * (long)param2);
                if (-1L >= (((vl) this).field_J - var5 ^ -1L)) {
                  ((vl) this).field_N = var5;
                  break L2;
                } else {
                  var7 = (int)((-1L + (long)var4 + ((vl) this).field_J - ((vl) this).field_N) / (long)var4);
                  ((vl) this).field_N = ((vl) this).field_N + (long)var7 * (long)var4;
                  ((vl) this).field_B.a(param0, param1, var7);
                  this.d(0);
                  param2 = param2 - var7;
                  param1 = param1 + var7;
                  if (!((vl) this).field_v.e()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((vl) this).field_B.a(param0, param1, param2);
              break L0;
            }
          } else {
            ((vl) this).field_B.a(param0, param1, param2);
            break L0;
          }
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param1 ^ 16279, param0, param2);
        if (param1 != 16383) {
            ((vl) this).field_t = null;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Chess.field_G;
          var2 = ((vl) this).field_G;
          var3 = ((vl) this).field_T;
          var4 = ((vl) this).field_J;
          if (null == ((vl) this).field_W) {
            break L0;
          } else {
            if (((vl) this).field_H == var3) {
              this.a(((vl) this).field_D, param0 + 2, ((vl) this).field_W, ((vl) this).field_K);
              this.d(0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            this.b(93, false);
            break L1;
          }
        }
        L2: while (true) {
          if (var3 != ((vl) this).field_T) {
            L3: {
              ((vl) this).field_J = var4;
              ((vl) this).field_G = var2;
              ((vl) this).field_T = var3;
              if (((vl) this).field_W == null) {
                break L3;
              } else {
                if (((vl) this).field_H >= var3) {
                  break L3;
                } else {
                  ((vl) this).field_G = -1;
                  ((vl) this).field_T = ((vl) this).field_H;
                  ((vl) this).field_J = ((vl) this).field_v.f(((vl) this).field_T);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((vl) this).field_v.field_d[var2]) {
                  break L5;
                } else {
                  ((vl) this).field_v.d(var2);
                  var6 = ((vl) this).field_v.a(var2);
                  if (1 == var6) {
                    ((vl) this).field_v.a();
                    ((vl) this).field_v.b(var2);
                    if (((vl) this).field_v.b()) {
                      if (null != ((vl) this).field_W) {
                        ((vl) this).a(((vl) this).field_K, ((vl) this).field_W, 91);
                        this.d(0);
                        return;
                      } else {
                        L6: {
                          if (!((vl) this).field_K) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              ((vl) this).field_v.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, (byte) -38);
                        ((vl) this).field_v.g();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if ((var6 & 128) != 0) {
                        this.b(var6, -112);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((vl) this).field_v.c(var2);
                    ((vl) this).field_v.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((vl) this).field_v.f();
              var3 = ((vl) this).field_v.field_d[var2];
              var4 = ((vl) this).field_v.f(var3);
              continue L2;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 0) {
            ((vl) this).field_p = null;
        }
    }

    private final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Chess.field_G;
          if ((param1 ^ -1) <= -1) {
            ((vl) this).field_z[param1] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (16 <= var4) {
                break L0;
              } else {
                ((vl) this).field_z[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        var4 = 29 % ((param2 - 3) / 58);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -43) {
            ((vl) this).field_F = null;
        }
    }

    final synchronized void c(byte param0) {
        int var3 = Chess.field_G;
        if (param0 != -61) {
            this.a(124, -34, -70, -107);
        }
        kf var4 = (kf) (Object) ((vl) this).field_s.a(true);
        while (var4 != null) {
            var4.e(111);
            var4 = (kf) (Object) ((vl) this).field_s.b((byte) 104);
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        var3 = 240 & param0;
        if ((var3 ^ -1) == -129) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 1680096520;
          var6 = (8350862 & param0) >> -1984003184;
          this.c(var6, var5, var4, -79);
          return;
        } else {
          if (var3 == 144) {
            var4 = param0 & 15;
            var5 = (32547 & param0) >> 43904264;
            var6 = (param0 & 8374890) >> -387249200;
            if ((var6 ^ -1) < -1) {
              this.a(var5, var4, var6, -21164);
              return;
            } else {
              this.c(64, var5, var4, -97);
              return;
            }
          } else {
            if (var3 != 160) {
              if (-177 == (var3 ^ -1)) {
                L0: {
                  var4 = param0 & 15;
                  var5 = param0 >> 1131311752 & 127;
                  var6 = (8377749 & param0) >> 1008285488;
                  if (var5 == 0) {
                    ((vl) this).field_q[var4] = ce.a(((vl) this).field_q[var4], -2080769) - -(var6 << -1841196882);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if ((var5 ^ -1) != -33) {
                    break L1;
                  } else {
                    ((vl) this).field_q[var4] = ce.a(-16257, ((vl) this).field_q[var4]) - -(var6 << -1402807353);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 1) {
                    break L2;
                  } else {
                    ((vl) this).field_P[var4] = ce.a(((vl) this).field_P[var4], -16257) + (var6 << 1349946119);
                    break L2;
                  }
                }
                L3: {
                  if (-34 == var5) {
                    ((vl) this).field_P[var4] = ce.a(-128, ((vl) this).field_P[var4]) + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-6 == var5) {
                    ((vl) this).field_S[var4] = ce.a(-16257, ((vl) this).field_S[var4]) + (var6 << 1371005479);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    ((vl) this).field_S[var4] = var6 + ce.a(-128, ((vl) this).field_S[var4]);
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 7) {
                    break L6;
                  } else {
                    ((vl) this).field_O[var4] = (var6 << 393148359) + ce.a(-16257, ((vl) this).field_O[var4]);
                    break L6;
                  }
                }
                L7: {
                  if (39 != var5) {
                    break L7;
                  } else {
                    ((vl) this).field_O[var4] = var6 + ce.a(-128, ((vl) this).field_O[var4]);
                    break L7;
                  }
                }
                L8: {
                  if ((var5 ^ -1) == -11) {
                    ((vl) this).field_o[var4] = (var6 << 1723495271) + ce.a(-16257, ((vl) this).field_o[var4]);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) != -43) {
                    break L9;
                  } else {
                    ((vl) this).field_o[var4] = ce.a(-128, ((vl) this).field_o[var4]) + var6;
                    break L9;
                  }
                }
                L10: {
                  if (11 != var5) {
                    break L10;
                  } else {
                    ((vl) this).field_C[var4] = ce.a(-16257, ((vl) this).field_C[var4]) - -(var6 << -1970007001);
                    break L10;
                  }
                }
                L11: {
                  if (-44 != (var5 ^ -1)) {
                    break L11;
                  } else {
                    ((vl) this).field_C[var4] = var6 + ce.a(-128, ((vl) this).field_C[var4]);
                    break L11;
                  }
                }
                L12: {
                  if ((var5 ^ -1) == -65) {
                    if (var6 < 64) {
                      ((vl) this).field_Q[var4] = ce.a(((vl) this).field_Q[var4], -2);
                      break L12;
                    } else {
                      ((vl) this).field_Q[var4] = s.a(((vl) this).field_Q[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (-65 >= (var6 ^ -1)) {
                      ((vl) this).field_Q[var4] = s.a(((vl) this).field_Q[var4], 2);
                      break L13;
                    } else {
                      this.c(var4, 1);
                      ((vl) this).field_Q[var4] = ce.a(((vl) this).field_Q[var4], -3);
                      break L13;
                    }
                  }
                }
                L14: {
                  if ((var5 ^ -1) == -100) {
                    ((vl) this).field_x[var4] = (var6 << -809254393) + ce.a(((vl) this).field_x[var4], 127);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (-99 != var5) {
                    break L15;
                  } else {
                    ((vl) this).field_x[var4] = var6 + ce.a(((vl) this).field_x[var4], 16256);
                    break L15;
                  }
                }
                L16: {
                  if (-102 != var5) {
                    break L16;
                  } else {
                    ((vl) this).field_x[var4] = (var6 << 24942951) + 16384 - -ce.a(((vl) this).field_x[var4], 127);
                    break L16;
                  }
                }
                L17: {
                  if (-101 == (var5 ^ -1)) {
                    ((vl) this).field_x[var4] = ce.a(16256, ((vl) this).field_x[var4]) + 16384 + var6;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var5 != 120) {
                    break L18;
                  } else {
                    this.a(var4, -82);
                    break L18;
                  }
                }
                L19: {
                  if ((var5 ^ -1) != -122) {
                    break L19;
                  } else {
                    this.b((byte) 91, var4);
                    break L19;
                  }
                }
                L20: {
                  if ((var5 ^ -1) == -124) {
                    this.a((byte) 92, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (6 == var5) {
                    var7 = ((vl) this).field_x[var4];
                    if ((var7 ^ -1) == -16385) {
                      ((vl) this).field_F[var4] = (var6 << 947519719) + ce.a(((vl) this).field_F[var4], -16257);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (var5 != 38) {
                    break L22;
                  } else {
                    var7 = ((vl) this).field_x[var4];
                    if (var7 == 16384) {
                      ((vl) this).field_F[var4] = ce.a(-128, ((vl) this).field_F[var4]) + var6;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (-17 == (var5 ^ -1)) {
                    ((vl) this).field_r[var4] = (var6 << 940380007) + ce.a(-16257, ((vl) this).field_r[var4]);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((var5 ^ -1) != -49) {
                    break L24;
                  } else {
                    ((vl) this).field_r[var4] = ce.a(((vl) this).field_r[var4], -128) - -var6;
                    break L24;
                  }
                }
                L25: {
                  if (-82 != var5) {
                    break L25;
                  } else {
                    if (-65 > var6) {
                      this.a(var4, false);
                      ((vl) this).field_Q[var4] = ce.a(((vl) this).field_Q[var4], -5);
                      break L25;
                    } else {
                      ((vl) this).field_Q[var4] = s.a(((vl) this).field_Q[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (17 != var5) {
                    break L26;
                  } else {
                    this.b(var4, (((vl) this).field_R[var4] & -16257) - -(var6 << 1305170087), (byte) 97);
                    break L26;
                  }
                }
                L27: {
                  if (-50 == (var5 ^ -1)) {
                    this.b(var4, var6 + (((vl) this).field_R[var4] & -128), (byte) 118);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                L28: {
                  if (param1 <= -39) {
                    break L28;
                  } else {
                    ((vl) this).field_u = null;
                    break L28;
                  }
                }
                if ((var3 ^ -1) == -193) {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> 258930344;
                  this.a(((vl) this).field_q[var4] + var5, true, var4);
                  return;
                } else {
                  if (208 == var3) {
                    var4 = param0 & 15;
                    var5 = (32703 & param0) >> 1048115752;
                    this.c(0, var5, var4);
                    return;
                  } else {
                    if (224 != var3) {
                      var3 = 255 & param0;
                      if (-256 != (var3 ^ -1)) {
                        return;
                      } else {
                        this.a(true, (byte) -38);
                        return;
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (param0 >> 1258685896 & 127) + ((8323141 & param0) >> 1767437065);
                      this.a(var5, (byte) 103, var4);
                      return;
                    }
                  }
                }
              }
            } else {
              var4 = param0 & 15;
              var5 = (param0 & 32713) >> -1989848792;
              var6 = (param0 & 8328847) >> 886418128;
              this.b(var5, var6, -43, var4);
              return;
            }
          }
        }
    }

    private final int a(int param0, qd param1) {
        int var3 = 0;
        dl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var3 = param1.field_z + (param1.field_D * param1.field_k >> -206402740);
        var3 = var3 + (((vl) this).field_F[param1.field_n] * (((vl) this).field_t[param1.field_n] + -8192) >> 1322240076);
        var4 = param1.field_K;
        if (param0 >= 33) {
          L0: {
            if (var4.field_e <= 0) {
              break L0;
            } else {
              L1: {
                if (-1 > (var4.field_g ^ -1)) {
                  break L1;
                } else {
                  if (((vl) this).field_P[param1.field_n] <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var5 = var4.field_g << 194907522;
                var6 = var4.field_f << -146289183;
                if (param1.field_s < var6) {
                  var5 = var5 * param1.field_s / var6;
                  break L2;
                } else {
                  break L2;
                }
              }
              var5 = var5 + (((vl) this).field_P[param1.field_n] >> 280582951);
              var7 = Math.sin((double)(511 & param1.field_F) * 0.01227184630308513);
              var3 = var3 + (int)((double)var5 * var7);
              break L0;
            }
          }
          L3: {
            var5 = (int)((double)(256 * param1.field_H.field_n) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)md.field_l + 0.5);
            if (1 > var5) {
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L3;
            } else {
              stackOut_11_0 = var5;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          return stackIn_13_0;
        } else {
          return 98;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 < 69) {
            this.b(127, false);
        }
        ((vl) this).field_t[param2] = param0;
    }

    final static void a(p param0, ln param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln stackIn_6_0 = null;
        ln stackIn_7_0 = null;
        ln stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ln stackIn_9_0 = null;
        ln stackIn_10_0 = null;
        ln stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ln stackIn_12_0 = null;
        ln stackIn_13_0 = null;
        ln stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ln stackIn_15_0 = null;
        ln stackIn_16_0 = null;
        ln stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ln stackIn_18_0 = null;
        ln stackIn_19_0 = null;
        ln stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ln stackIn_21_0 = null;
        ln stackIn_22_0 = null;
        ln stackIn_23_0 = null;
        ln stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        ln stackOut_5_0 = null;
        ln stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ln stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ln stackOut_8_0 = null;
        ln stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ln stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ln stackOut_11_0 = null;
        ln stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ln stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ln stackOut_14_0 = null;
        ln stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ln stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ln stackOut_17_0 = null;
        ln stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ln stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ln stackOut_20_0 = null;
        ln stackOut_21_0 = null;
        ln stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ln stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        var9 = Chess.field_G;
        if (param3 >= 86) {
          L0: {
            if (param2) {
              param1.field_Xb = param0.i(-108);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            param1.field_hc = param0.i(-111);
            param1.field_ic = param0.i(-99);
            var4 = param0.i(-93);
            stackOut_5_0 = (ln) param1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (-1 == (var4 & 128 ^ -1)) {
              stackOut_7_0 = (ln) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = (ln) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          L2: {
            ((ln) (Object) stackIn_8_0).field_Yb = stackIn_8_1 != 0;
            stackOut_8_0 = (ln) param1;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if ((8 & var4) == 0) {
              stackOut_10_0 = (ln) (Object) stackIn_10_0;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L2;
            } else {
              stackOut_9_0 = (ln) (Object) stackIn_9_0;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L2;
            }
          }
          L3: {
            ((ln) (Object) stackIn_11_0).field_ac = stackIn_11_1 != 0;
            stackOut_11_0 = (ln) param1;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (-1 == (32 & var4 ^ -1)) {
              stackOut_13_0 = (ln) (Object) stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L3;
            } else {
              stackOut_12_0 = (ln) (Object) stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L3;
            }
          }
          L4: {
            ((ln) (Object) stackIn_14_0).field_lc = stackIn_14_1 != 0;
            stackOut_14_0 = (ln) param1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (0 == (64 & var4)) {
              stackOut_16_0 = (ln) (Object) stackIn_16_0;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L4;
            } else {
              stackOut_15_0 = (ln) (Object) stackIn_15_0;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L4;
            }
          }
          L5: {
            ((ln) (Object) stackIn_17_0).field_Vb = stackIn_17_1 != 0;
            stackOut_17_0 = (ln) param1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (-1 == (var4 & 16 ^ -1)) {
              stackOut_19_0 = (ln) (Object) stackIn_19_0;
              stackOut_19_1 = 1;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L5;
            } else {
              stackOut_18_0 = (ln) (Object) stackIn_18_0;
              stackOut_18_1 = 2;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L5;
            }
          }
          L6: {
            L7: {
              ((ln) (Object) stackIn_20_0).field_Mb = stackIn_20_1;
              stackOut_20_0 = (ln) param1;
              stackIn_23_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (!param1.field_Yb) {
                break L7;
              } else {
                stackOut_21_0 = (ln) (Object) stackIn_21_0;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (param1.field_Xb >= param1.field_hc) {
                  break L7;
                } else {
                  stackOut_22_0 = (ln) (Object) stackIn_22_0;
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L6;
                }
              }
            }
            stackOut_23_0 = (ln) (Object) stackIn_23_0;
            stackOut_23_1 = 0;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            break L6;
          }
          L8: {
            ((ln) (Object) stackIn_24_0).field_Pb = stackIn_24_1 != 0;
            if (-1 == (var4 & 4 ^ -1)) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L8;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
              break L8;
            }
          }
          L9: {
            var5 = stackIn_27_0;
            if (0 == (2 & var4)) {
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L9;
            } else {
              stackOut_28_0 = 1;
              stackIn_30_0 = stackOut_28_0;
              break L9;
            }
          }
          L10: {
            var6 = stackIn_30_0;
            param0.a(param1.field_sc.length, (byte) 125, param1.field_sc, 0);
            param1.field_Ub = param0.f(674914976);
            param1.field_Jb = ud.a(2) - (long)param0.e((byte) -104);
            if (var5 == 0) {
              param1.field_pc = -1;
              break L10;
            } else {
              param1.field_pc = param0.e((byte) -110);
              break L10;
            }
          }
          L11: {
            param1.field_Fb = param0.d((byte) -50);
            var7 = param0.field_l;
            param1.field_Gb = param0.d(0);
            if (var6 == 0) {
              param1.field_ec = null;
              break L11;
            } else {
              param0.field_l = var7;
              param1.field_ec = new String[param1.field_Xb];
              var8 = 0;
              L12: while (true) {
                if (param1.field_Xb <= var8) {
                  break L11;
                } else {
                  param1.field_ec[var8] = param0.d(0);
                  var8++;
                  continue L12;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1, byte param2) {
        ((vl) this).field_R[param0] = param1;
        ((vl) this).field_E[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
        if (param2 < 89) {
            ((vl) this).field_w = 105;
        }
    }

    public vl() {
        ((vl) this).field_F = new int[16];
        ((vl) this).field_u = new qd[16][128];
        ((vl) this).field_q = new int[16];
        ((vl) this).field_O = new int[16];
        ((vl) this).field_E = new int[16];
        ((vl) this).field_x = new int[16];
        ((vl) this).field_P = new int[16];
        ((vl) this).field_n = new int[16];
        ((vl) this).field_r = new int[16];
        ((vl) this).field_w = 1000000;
        ((vl) this).field_C = new int[16];
        ((vl) this).field_z = new int[16];
        ((vl) this).field_p = new int[16];
        ((vl) this).field_o = new int[16];
        ((vl) this).field_S = new int[16];
        ((vl) this).field_U = new qd[16][128];
        ((vl) this).field_y = 256;
        ((vl) this).field_Q = new int[16];
        ((vl) this).field_R = new int[16];
        ((vl) this).field_t = new int[16];
        ((vl) this).field_v = new al();
        ((vl) this).field_B = new mi((vl) this);
        ((vl) this).field_s = new kl(128);
        this.a(256, -1, (byte) -101);
        this.a(true, (byte) -38);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new char[]{(char)91, (char)93, (char)35};
    }
}
