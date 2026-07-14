/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends tj {
    private int[] field_L;
    static int field_r;
    private int[] field_F;
    static fa field_S;
    private gh field_G;
    private int[] field_u;
    int[] field_H;
    private tm[][] field_P;
    int[] field_l;
    private int[] field_w;
    private int[] field_T;
    private int[] field_n;
    private jm field_I;
    int[] field_C;
    private int[] field_o;
    private int[] field_E;
    static String field_A;
    private int[] field_t;
    private int[] field_O;
    private int[] field_M;
    private int[] field_v;
    private int field_p;
    private int[] field_y;
    private tm[][] field_q;
    private int field_m;
    private dl field_B;
    private long field_N;
    private long field_x;
    private int field_D;
    private boolean field_R;
    private int field_K;
    private int field_s;
    private ji field_z;
    private boolean field_J;

    private final void c(int param0, byte param1) {
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (-1 >= (param0 ^ -1)) {
          L0: {
            ((w) this).field_O[param0] = 12800;
            ((w) this).field_v[param0] = 8192;
            ((w) this).field_T[param0] = 16383;
            ((w) this).field_E[param0] = 8192;
            ((w) this).field_y[param0] = 0;
            ((w) this).field_L[param0] = 8192;
            this.a(param0, false);
            this.a(param0, 4);
            ((w) this).field_C[param0] = 0;
            ((w) this).field_u[param0] = 32767;
            ((w) this).field_t[param0] = 256;
            ((w) this).field_H[param0] = 0;
            if (param1 >= 6) {
              break L0;
            } else {
              this.d(16);
              break L0;
            }
          }
          this.b(-112, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.c(param0, (byte) 90);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, byte param1) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != 116) {
            w.a(true);
        }
        tm var3 = (tm) (Object) ((w) this).field_B.field_t.g(-4);
        while (var3 != null) {
            if (param0 >= 0) {
                // if_icmpeq L56
            } else {
                if (!((var3.field_h ^ -1) <= -1)) {
                    ((w) this).field_q[var3.field_E][var3.field_z] = null;
                    var3.field_h = 0;
                }
            }
            var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
        }
    }

    final synchronized boolean a(int param0, ji param1, gb param2, rd param3, boolean param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        bc var8 = null;
        int var9 = 0;
        int var11 = 0;
        nf var12 = null;
        nf var13 = null;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          param1.b();
          if (!param4) {
            break L0;
          } else {
            ((w) this).field_K = -87;
            break L0;
          }
        }
        L1: {
          var6 = 1;
          var7 = null;
          if (-1 > (param0 ^ -1)) {
            var7_array = new int[]{param0};
            break L1;
          } else {
            break L1;
          }
        }
        var8 = (bc) (Object) param1.field_i.a(-104);
        L2: while (true) {
          if (var8 == null) {
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                param1.a();
                break L3;
              }
            }
            return var6 != 0;
          } else {
            L4: {
              var9 = (int)var8.field_c;
              var12 = (nf) (Object) ((w) this).field_I.a(false, (long)var9);
              if (var12 == null) {
                var13 = ne.a(param2, -19, var9);
                if (var13 == null) {
                  var6 = 0;
                  break L4;
                } else {
                  ((w) this).field_I.a(-116, (long)var9, (am) (Object) var13);
                  if (var13.a(var7_array, var8.field_h, param3, -20752)) {
                    break L4;
                  } else {
                    var6 = 0;
                    break L4;
                  }
                }
              } else {
                if (var12.a(var7_array, var8.field_h, param3, -20752)) {
                  break L4;
                } else {
                  var6 = 0;
                  var8 = (bc) (Object) param1.field_i.b(-1);
                  continue L2;
                }
              }
            }
            var8 = (bc) (Object) param1.field_i.b(-1);
            continue L2;
          }
        }
    }

    private final void b(int param0, int param1) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 <= 16) {
            Object var5 = null;
            ((w) this).b((int[]) null, -11, 107);
        }
        tm var3 = (tm) (Object) ((w) this).field_B.field_t.g(-95);
        while (var3 != null) {
            if ((param1 ^ -1) <= -1) {
                // if_icmpne L177
            }
            if (var3.field_A != null) {
                var3.field_A.h(ug.field_g / 100);
                if (!(!var3.field_A.m())) {
                    ((w) this).field_B.field_q.b((tj) (Object) var3.field_A);
                }
                var3.b(true);
            }
            if (-1 < (var3.field_h ^ -1)) {
                ((w) this).field_q[var3.field_E][var3.field_z] = null;
            }
            var3.b(123);
            var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
        }
    }

    final boolean a(byte param0, tm param1) {
        if (!(null != param1.field_A)) {
            if (0 <= param1.field_h) {
                param1.b(-108);
                if (param1.field_m > 0) {
                    if (param1 != ((w) this).field_P[param1.field_E][param1.field_m]) {
                        return true;
                    }
                    ((w) this).field_P[param1.field_E][param1.field_m] = null;
                }
            }
            return true;
        }
        if (param0 <= 10) {
            return false;
        }
        return false;
    }

    final synchronized tj b() {
        return null;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 != 93) {
            ((w) this).field_P = null;
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          if (((w) this).field_G.c()) {
            var2 = ((w) this).field_p * ((w) this).field_G.field_f / ug.field_g;
            L1: while (true) {
              L2: {
                var3 = ((w) this).field_N - -((long)var2 * (long)param0);
                if (((w) this).field_x + -var3 < 0L) {
                  var5 = (int)((-1L + ((long)var2 + -((w) this).field_N) + ((w) this).field_x) / (long)var2);
                  ((w) this).field_N = ((w) this).field_N + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((w) this).field_B.c(var5);
                  this.d(0);
                  if (!((w) this).field_G.c()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  ((w) this).field_N = var3;
                  break L2;
                }
              }
              ((w) this).field_B.c(param0);
              break L0;
            }
          } else {
            ((w) this).field_B.c(param0);
            break L0;
          }
        }
    }

    synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        this.a((byte) 61, param2);
        ((w) this).field_G.a(param3.field_h);
        ((w) this).field_N = 0L;
        if (param1 <= 123) {
            ((w) this).field_E = null;
        }
        ((w) this).field_R = param0 ? true : false;
        int var5 = ((w) this).field_G.g();
        for (var6 = 0; var5 > var6; var6++) {
            ((w) this).field_G.e(var6);
            ((w) this).field_G.d(var6);
            ((w) this).field_G.a(var6);
        }
        ((w) this).field_D = ((w) this).field_G.d();
        ((w) this).field_K = ((w) this).field_G.field_a[((w) this).field_D];
        ((w) this).field_x = ((w) this).field_G.b(((w) this).field_K);
    }

    private final void b(byte param0, int param1, int param2) {
        ((w) this).field_F[param2] = param1;
        if (param0 != 22) {
            Object var5 = null;
            int discarded$0 = this.a((tm) null, true);
        }
        ((w) this).field_o[param2] = ua.a(param1, -128);
        this.d(-14089, param1, param2);
    }

    private final int a(tm param0, boolean param1) {
        int var3 = ((w) this).field_v[param0.field_E];
        if (!param1) {
            ((w) this).field_R = true;
        }
        if (8192 <= var3) {
            return -(32 + (128 + -param0.field_n) * (16384 - var3) >> -1060924474) + 16384;
        }
        return 32 + param0.field_n * var3 >> -659447450;
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 > -42) {
            ((w) this).field_u = null;
        }
        ((w) this).field_w[param2] = param1;
        ((w) this).field_l[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        tm var6 = null;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        if (param3 != 63) {
            ((w) this).field_R = true;
        }
        tm var8 = ((w) this).field_q[param1][param2];
        if (var8 == null) {
            return;
        }
        ((w) this).field_q[param1][param2] = null;
        if ((2 & ((w) this).field_C[param1]) == 0) {
            var8.field_h = 0;
        } else {
            var6 = (tm) (Object) ((w) this).field_B.field_t.g(-23);
            while (var6 != null) {
                if (var6.field_E == var8.field_E) {
                    if (0 > var6.field_h) {
                        if (!(var6 == var8)) {
                            var8.field_h = 0;
                            break;
                        }
                    }
                }
                var6 = (tm) (Object) ((w) this).field_B.field_t.a(param3 ^ 12723);
            }
        }
    }

    private final int a(tm param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(((w) this).field_M[param0.field_E] != 0)) {
            return 0;
        }
        pl var9 = param0.field_x;
        pl var10 = var9;
        int var4 = 4096 + ((w) this).field_T[param0.field_E] * ((w) this).field_O[param0.field_E] >> -2010530835;
        var4 = var4 * var4 + 16384 >> 323697071;
        var4 = var4 * param0.field_D + 16384 >> -1840410385;
        var4 = 128 + var4 * ((w) this).field_m >> 47439016;
        var4 = ((w) this).field_M[param0.field_E] * var4 + 128 >> -1151496792;
        if (!(0 >= var10.field_b)) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_k * (double)var10.field_b) * (double)var4);
        }
        if (null != var10.field_n) {
            var5 = param0.field_C;
            var6 = var10.field_n[1 + param0.field_w];
            if (!(param0.field_w >= var10.field_n.length - 2)) {
                var7 = (var9.field_n[param0.field_w] & 255) << 32121256;
                var8 = 65280 & var10.field_n[param0.field_w + 2] << 226543464;
                var6 = var6 + (-var7 + var5) * (var10.field_n[3 + param0.field_w] + -var6) / (var8 + -var7);
            }
            var4 = var4 * var6 - -32 >> 2065687494;
        }
        if (-1 > (param0.field_h ^ -1)) {
            if (var10.field_m != null) {
                var5 = param0.field_h;
                var6 = var10.field_m[1 + param0.field_l];
                if (!(var10.field_m.length + -2 <= param0.field_l)) {
                    var7 = var9.field_m[param0.field_l] << 335556392 & 65280;
                    var8 = (255 & var10.field_m[2 + param0.field_l]) << -405495544;
                    var6 = var6 + (-var6 + var10.field_m[param0.field_l + 3]) * (var5 - var7) / (-var7 + var8);
                }
                var4 = var6 * var4 - -32 >> 1108444902;
            }
        }
        var5 = -109 % ((-7 - param1) / 40);
        return var4;
    }

    final boolean a(tm param0, int param1, int param2, int param3, int[] param4) {
        int var6 = 0;
        pl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          param0.field_u = ug.field_g / 100;
          if (param3 == 31458) {
            break L0;
          } else {
            this.a(50, -29, 123, -115);
            break L0;
          }
        }
        L1: {
          if (0 > param0.field_h) {
            break L1;
          } else {
            L2: {
              if (param0.field_A == null) {
                break L2;
              } else {
                if (!param0.field_A.j()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              param0.b(true);
              param0.b(119);
              if (-1 <= (param0.field_m ^ -1)) {
                break L3;
              } else {
                if (((w) this).field_P[param0.field_E][param0.field_m] == param0) {
                  ((w) this).field_P[param0.field_E][param0.field_m] = null;
                  break L3;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
        L4: {
          var6 = param0.field_t;
          if (0 < var6) {
            L5: {
              var6 = var6 - (int)(Math.pow(2.0, (double)((w) this).field_L[param0.field_E] * 0.0004921259842519685) * 16.0 + 0.5);
              if ((var6 ^ -1) <= -1) {
                break L5;
              } else {
                var6 = 0;
                break L5;
              }
            }
            param0.field_t = var6;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          param0.field_A.i(this.a(1, param0));
          var7 = param0.field_x;
          var8 = 0;
          param0.field_j = param0.field_j + var7.field_e;
          param0.field_B = param0.field_B + 1;
          var9 = (double)((param0.field_z + -60 << 901691560) + (param0.field_t * param0.field_F >> 1829161260)) * 0.000005086263020833333;
          if (-1 > (var7.field_b ^ -1)) {
            L7: {
              if ((var7.field_h ^ -1) >= -1) {
                param0.field_k = param0.field_k + 128;
                break L7;
              } else {
                param0.field_k = param0.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_h));
                break L7;
              }
            }
            if (-819201 >= (var7.field_b * param0.field_k ^ -1)) {
              var8 = 1;
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        L8: {
          if (null == var7.field_n) {
            break L8;
          } else {
            L9: {
              if ((var7.field_o ^ -1) < -1) {
                param0.field_C = param0.field_C + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_o) * 128.0);
                break L9;
              } else {
                param0.field_C = param0.field_C + 128;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                if (-2 + var7.field_n.length <= param0.field_w) {
                  break L11;
                } else {
                  if (param0.field_C <= (255 & var7.field_n[2 + param0.field_w]) << -49170488) {
                    break L11;
                  } else {
                    param0.field_w = param0.field_w + 2;
                    continue L10;
                  }
                }
              }
              if (var7.field_n.length - 2 != param0.field_w) {
                break L8;
              } else {
                if (var7.field_n[param0.field_w + 1] == 0) {
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
          if (param0.field_h < 0) {
            break L12;
          } else {
            if (var7.field_m == null) {
              break L12;
            } else {
              if (0 == (1 & ((w) this).field_C[param0.field_E])) {
                L13: {
                  if (0 > param0.field_m) {
                    break L13;
                  } else {
                    if (param0 != ((w) this).field_P[param0.field_E][param0.field_m]) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if ((var7.field_c ^ -1) < -1) {
                    param0.field_h = param0.field_h + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                    break L14;
                  } else {
                    param0.field_h = param0.field_h + 128;
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if (param0.field_l >= var7.field_m.length + -2) {
                      break L16;
                    } else {
                      if (param0.field_h <= (var7.field_m[2 + param0.field_l] & 255) << 1043979688) {
                        break L16;
                      } else {
                        param0.field_l = param0.field_l + 2;
                        continue L15;
                      }
                    }
                  }
                  if (param0.field_l != var7.field_m.length + -2) {
                    break L12;
                  } else {
                    var8 = 1;
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
            param0.field_A.h(param0.field_u);
            if (param4 == null) {
              param0.field_A.c(param1);
              break L17;
            } else {
              param0.field_A.b(param4, param2, param1);
              break L17;
            }
          }
          L18: {
            if (!param0.field_A.m()) {
              break L18;
            } else {
              ((w) this).field_B.field_q.b((tj) (Object) param0.field_A);
              break L18;
            }
          }
          L19: {
            param0.b(true);
            if (param0.field_h < 0) {
              break L19;
            } else {
              param0.b(-29);
              if ((param0.field_m ^ -1) >= -1) {
                break L19;
              } else {
                if (param0 == ((w) this).field_P[param0.field_E][param0.field_m]) {
                  ((w) this).field_P[param0.field_E][param0.field_m] = null;
                  break L19;
                } else {
                  break L19;
                }
              }
            }
          }
          return true;
        } else {
          param0.field_A.a(param0.field_u, this.a(param0, (byte) 68), this.a(param0, true));
          return false;
        }
    }

    private final void a(int param0, boolean param1) {
        tm var3 = null;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (0 != (((w) this).field_C[param0] & 2)) {
            var3 = (tm) (Object) ((w) this).field_B.field_t.g(-64);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_E != param0) {
                    break L2;
                  } else {
                    if (((w) this).field_q[param0][var3.field_z] == null) {
                      if (0 > var3.field_h) {
                        var3.field_h = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
                      continue L1;
                    }
                  }
                }
                var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (!param1) {
            break L3;
          } else {
            ((w) this).field_E = null;
            break L3;
          }
        }
    }

    final int g(int param0) {
        int var2 = 118 / ((param0 - 0) / 42);
        return ((w) this).field_m;
    }

    private final void a(int param0, int param1) {
        tm var3 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if ((param1 & ((w) this).field_C[param0]) != 0) {
            var3 = (tm) (Object) ((w) this).field_B.field_t.g(-53);
            while (var3 != null) {
                if (!(var3.field_E != param0)) {
                    var3.field_i = 0;
                }
                var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
            }
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        if (param0 != 2) {
            ((w) this).field_M = null;
        }
        this.b((byte) 22, param1, param2);
    }

    final synchronized void c(int param0, int param1) {
        ((w) this).field_p = param0;
        if (param1 < 93) {
            ((w) this).field_J = false;
        }
    }

    final synchronized void b(byte param0, int param1) {
        ((w) this).field_m = param1;
        int var3 = -10 / ((-1 - param0) / 40);
    }

    public static void a(boolean param0) {
        field_A = null;
        if (param0) {
            w.b(false, -68);
        }
        field_S = null;
    }

    final synchronized boolean f(int param0) {
        if (param0 != 323697071) {
            ((w) this).field_y = null;
        }
        return ((w) this).field_G.c();
    }

    private final int a(int param0, tm param1) {
        int var3 = 0;
        pl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = (param1.field_t * param1.field_F >> -1895075348) + param1.field_y;
          var3 = var3 + ((-8192 + ((w) this).field_E[param1.field_E]) * ((w) this).field_t[param1.field_E] >> 862831276);
          var4 = param1.field_x;
          if (param0 == 1) {
            break L0;
          } else {
            ((w) this).field_B = null;
            break L0;
          }
        }
        L1: {
          if (-1 <= var4.field_e) {
            break L1;
          } else {
            L2: {
              if (-1 < var4.field_g) {
                break L2;
              } else {
                if (((w) this).field_y[param1.field_E] > 0) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var5 = var4.field_g << -607058206;
              var6 = var4.field_d << -1843915615;
              if (var6 <= param1.field_B) {
                break L3;
              } else {
                var5 = var5 * param1.field_B / var6;
                break L3;
              }
            }
            var5 = var5 + (((w) this).field_y[param1.field_E] >> 1575163047);
            var7 = Math.sin((double)(param1.field_j & 511) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(256 * param1.field_r.field_j) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)ug.field_g);
          if (1 <= var5) {
            stackOut_11_0 = var5;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        return stackIn_12_0;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 != -14089) {
            ((w) this).field_J = false;
        }
        if (!(param1 == ((w) this).field_n[param2])) {
            ((w) this).field_n[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((w) this).field_P[param2][var4] = null;
            }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        tm var5 = null;
        jb var6 = null;
        int var6_int = 0;
        tm var7 = null;
        tm var8 = null;
        int var9 = 0;
        nf var10 = null;
        nf var11 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          this.a(64, param2, param3, (byte) 63);
          if (-1 == (2 & ((w) this).field_C[param2] ^ -1)) {
            break L0;
          } else {
            var5 = (tm) (Object) ((w) this).field_B.field_t.b((byte) 117);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_E != param2) {
                    break L2;
                  } else {
                    if (-1 >= (var5.field_h ^ -1)) {
                      break L2;
                    } else {
                      ((w) this).field_q[param2][var5.field_z] = null;
                      ((w) this).field_q[param2][param3] = var5;
                      var6_int = var5.field_y - -(var5.field_t * var5.field_F >> 1170234188);
                      var5.field_y = var5.field_y + (-var5.field_z + param3 << -1880307256);
                      var5.field_z = param3;
                      var5.field_t = 4096;
                      var5.field_F = -var5.field_y + var6_int;
                      return;
                    }
                  }
                }
                var5 = (tm) (Object) ((w) this).field_B.field_t.a((byte) 124);
                continue L1;
              }
            }
          }
        }
        var10 = (nf) (Object) ((w) this).field_I.a(false, (long)((w) this).field_n[param2]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_q[param3];
          if (var6 == null) {
            return;
          } else {
            var7 = new tm();
            var7.field_r = var6;
            var7.field_E = param2;
            var7.field_p = var10;
            var7.field_x = var10.field_o[param3];
            var7.field_m = var10.field_s[param3];
            var7.field_z = param3;
            var7.field_D = 1024 + var11.field_j * param1 * param1 * var10.field_i[param3] >> -1285533397;
            var7.field_n = 255 & var10.field_l[param3];
            var7.field_y = (param3 << -1221329592) + -(var10.field_r[param3] & 32767);
            var7.field_l = 0;
            var7.field_k = 0;
            if (param0 == 35) {
              L3: {
                var7.field_h = -1;
                var7.field_w = 0;
                var7.field_C = 0;
                if (((w) this).field_H[param2] != 0) {
                  L4: {
                    var7.field_A = b.a(var6, this.a(1, var7), 0, this.a(var7, true));
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var11.field_r[param3] >= 0) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L4;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L4;
                    }
                  }
                  ((w) this).a(stackIn_20_1 != 0, var7, -128);
                  break L3;
                } else {
                  var7.field_A = b.a(var6, this.a(param0 ^ 34, var7), this.a(var7, (byte) -75), this.a(var7, true));
                  break L3;
                }
              }
              L5: {
                if ((var11.field_r[param3] ^ -1) > -1) {
                  var7.field_A.d(-1);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 > var7.field_m) {
                  break L6;
                } else {
                  L7: {
                    var8 = ((w) this).field_P[param2][var7.field_m];
                    if (var8 == null) {
                      break L7;
                    } else {
                      if ((var8.field_h ^ -1) <= -1) {
                        break L7;
                      } else {
                        ((w) this).field_q[param2][var8.field_z] = null;
                        var8.field_h = 0;
                        break L7;
                      }
                    }
                  }
                  ((w) this).field_P[param2][var7.field_m] = var7;
                  break L6;
                }
              }
              ((w) this).field_B.field_t.a((am) (Object) var7, param0 ^ 74);
              ((w) this).field_q[param2][param3] = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    final synchronized void a(boolean param0, byte param1, ji param2) {
        if (param1 < 8) {
            Object var5 = null;
            boolean discarded$0 = ((w) this).a((byte) -14, (tm) null);
        }
        ((w) this).a(param0, (byte) 124, true, param2);
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -16257) {
            ((w) this).field_v = null;
        }
    }

    final void a(boolean param0, tm param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param1.field_r.field_k.length;
            if (!param0) {
              break L1;
            } else {
              if (!param1.field_r.field_m) {
                break L1;
              } else {
                var6 = var4 + var4 - param1.field_r.field_l;
                var5 = (int)((long)((w) this).field_H[param1.field_E] * (long)var6 >> -1405804986);
                var4 = var4 << 8;
                if (var5 >= var4) {
                  var5 = -var5 + -1 + var4 - -var4;
                  param1.field_A.a(true);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = (int)((long)((w) this).field_H[param1.field_E] * (long)var4 >> 1860333254);
          break L0;
        }
        L2: {
          param1.field_A.e(var5);
          if (param2 <= -104) {
            break L2;
          } else {
            ((w) this).field_O = null;
            break L2;
          }
        }
    }

    final static void b(boolean param0, int param1) {
        pc.a(param0, false, false);
        if (param1 != -23960) {
            field_r = -96;
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 > -65) {
            return;
        }
        ((w) this).field_E[param0] = param2;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var4 = 73 / ((param0 - -9) / 51);
        var3 = param1 & 240;
        if (-129 == (var3 ^ -1)) {
          var5 = 15 & param1;
          var6 = (32556 & param1) >> -769556888;
          var7 = (8342895 & param1) >> 1754357936;
          this.a(var7, var5, var6, (byte) 63);
          return;
        } else {
          L0: {
            if (144 != var3) {
              if (-161 == (var3 ^ -1)) {
                var5 = 15 & param1;
                var6 = (32541 & param1) >> -434763320;
                var7 = (8342347 & param1) >> 44503824;
                this.a(var6, -16257, var7, var5);
                return;
              } else {
                if (var3 == 176) {
                  L1: {
                    var5 = 15 & param1;
                    var6 = param1 >> -839738008 & 127;
                    var7 = 127 & param1 >> -530985328;
                    if (0 != var6) {
                      break L1;
                    } else {
                      ((w) this).field_o[var5] = ua.a(((w) this).field_o[var5], -2080769) + (var7 << 104211822);
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 == (var6 ^ -1)) {
                      ((w) this).field_o[var5] = (var7 << -217942041) + ua.a(-16257, ((w) this).field_o[var5]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 == var6) {
                      ((w) this).field_y[var5] = (var7 << -1841532505) + ua.a(-16257, ((w) this).field_y[var5]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var6 != 33) {
                      break L4;
                    } else {
                      ((w) this).field_y[var5] = var7 + ua.a(((w) this).field_y[var5], -128);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var6 ^ -1) != -6) {
                      break L5;
                    } else {
                      ((w) this).field_L[var5] = ua.a(((w) this).field_L[var5], -16257) + (var7 << 1174784647);
                      break L5;
                    }
                  }
                  L6: {
                    if (37 != var6) {
                      break L6;
                    } else {
                      ((w) this).field_L[var5] = ua.a(-128, ((w) this).field_L[var5]) - -var7;
                      break L6;
                    }
                  }
                  L7: {
                    if ((var6 ^ -1) == -8) {
                      ((w) this).field_O[var5] = ua.a(((w) this).field_O[var5], -16257) + (var7 << 895461319);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-40 == (var6 ^ -1)) {
                      ((w) this).field_O[var5] = var7 + ua.a(((w) this).field_O[var5], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (10 == var6) {
                      ((w) this).field_v[var5] = (var7 << 659970087) + ua.a(((w) this).field_v[var5], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-43 != var6) {
                      break L10;
                    } else {
                      ((w) this).field_v[var5] = var7 + ua.a(-128, ((w) this).field_v[var5]);
                      break L10;
                    }
                  }
                  L11: {
                    if (-12 == var6) {
                      ((w) this).field_T[var5] = ua.a(-16257, ((w) this).field_T[var5]) + (var7 << 842115303);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 43) {
                      ((w) this).field_T[var5] = ua.a(((w) this).field_T[var5], -128) - -var7;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var6 != 64) {
                      break L13;
                    } else {
                      if ((var7 ^ -1) <= -65) {
                        ((w) this).field_C[var5] = ll.a(((w) this).field_C[var5], 1);
                        break L13;
                      } else {
                        ((w) this).field_C[var5] = ua.a(((w) this).field_C[var5], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var6) {
                      if ((var7 ^ -1) <= -65) {
                        ((w) this).field_C[var5] = ll.a(((w) this).field_C[var5], 2);
                        break L14;
                      } else {
                        this.a(var5, false);
                        ((w) this).field_C[var5] = ua.a(((w) this).field_C[var5], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (-100 != (var6 ^ -1)) {
                      break L15;
                    } else {
                      ((w) this).field_u[var5] = ua.a(127, ((w) this).field_u[var5]) + (var7 << 1533463815);
                      break L15;
                    }
                  }
                  L16: {
                    if ((var6 ^ -1) != -99) {
                      break L16;
                    } else {
                      ((w) this).field_u[var5] = ua.a(((w) this).field_u[var5], 16256) + var7;
                      break L16;
                    }
                  }
                  L17: {
                    if (101 != var6) {
                      break L17;
                    } else {
                      ((w) this).field_u[var5] = ua.a(127, ((w) this).field_u[var5]) + (16384 + (var7 << 1876729767));
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 != (var6 ^ -1)) {
                      break L18;
                    } else {
                      ((w) this).field_u[var5] = var7 + 16384 + ua.a(((w) this).field_u[var5], 16256);
                      break L18;
                    }
                  }
                  L19: {
                    if ((var6 ^ -1) == -121) {
                      this.b(106, var5);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (121 == var6) {
                      this.c(var5, (byte) 15);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var6) {
                      break L21;
                    } else {
                      this.b(var5, (byte) 116);
                      break L21;
                    }
                  }
                  L22: {
                    if ((var6 ^ -1) != -7) {
                      break L22;
                    } else {
                      var8 = ((w) this).field_u[var5];
                      if (var8 != 16384) {
                        break L22;
                      } else {
                        ((w) this).field_t[var5] = (var7 << 146396775) + ua.a(-16257, ((w) this).field_t[var5]);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if ((var6 ^ -1) != -39) {
                      break L23;
                    } else {
                      var8 = ((w) this).field_u[var5];
                      if (var8 == 16384) {
                        ((w) this).field_t[var5] = ua.a(((w) this).field_t[var5], -128) + var7;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-17 == (var6 ^ -1)) {
                      ((w) this).field_H[var5] = (var7 << 1112435399) + ua.a(((w) this).field_H[var5], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var6 == 48) {
                      ((w) this).field_H[var5] = var7 + ua.a(-128, ((w) this).field_H[var5]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 == var6) {
                      if (-65 > var7) {
                        this.a(var5, 4);
                        ((w) this).field_C[var5] = ua.a(((w) this).field_C[var5], -5);
                        break L26;
                      } else {
                        ((w) this).field_C[var5] = ll.a(((w) this).field_C[var5], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (17 == var6) {
                      this.b(-91, (var7 << 1359907943) + (-16257 & ((w) this).field_w[var5]), var5);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var6 != 49) {
                    break L0;
                  } else {
                    this.b(-75, (-128 & ((w) this).field_w[var5]) - -var7, var5);
                    return;
                  }
                } else {
                  if (-193 != (var3 ^ -1)) {
                    if (-209 != (var3 ^ -1)) {
                      if (var3 != 224) {
                        var3 = 255 & param1;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, 2065687494);
                          return;
                        }
                      } else {
                        var5 = param1 & 15;
                        var6 = ((8323466 & param1) >> -1005998391) - -(param1 >> -2146254008 & 127);
                        this.a(var5, -120, var6);
                        return;
                      }
                    } else {
                      var5 = param1 & 15;
                      var6 = (param1 & 32765) >> -1859432056;
                      this.a((byte) 93, var6, var5);
                      return;
                    }
                  } else {
                    var5 = 15 & param1;
                    var6 = param1 >> -1912834360 & 127;
                    this.d(-14089, var6 + ((w) this).field_o[var5], var5);
                    return;
                  }
                }
              }
            } else {
              var5 = param1 & 15;
              var6 = 127 & param1 >> 37395240;
              var7 = (8326969 & param1) >> -1929667440;
              if (var7 > 0) {
                this.a((byte) 35, var7, var5, var6);
                return;
              } else {
                this.a(64, var5, var6, (byte) 63);
                break L0;
              }
            }
          }
          return;
        }
    }

    final synchronized tj d() {
        return (tj) (Object) ((w) this).field_B;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (!param0) {
            this.b(-1, (byte) 116);
        } else {
            this.b(61, -1);
        }
        this.c(-1, (byte) 106);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            ((w) this).field_n[var3] = ((w) this).field_F[var3];
        }
        int var5 = 0;
        var3 = var5;
        if (param1 != 2065687494) {
            return;
        }
        while (var5 < 16) {
            ((w) this).field_o[var5] = ua.a(-128, ((w) this).field_F[var5]);
            var5++;
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        if (param0 <= 56) {
            ((w) this).field_z = null;
        }
        ((w) this).field_G.b();
        ((w) this).field_z = null;
        this.a(param1, 2065687494);
    }

    synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = HostileSpawn.field_I ? 1 : 0;
            if (!((w) this).field_G.c()) {
              break L1;
            } else {
              var4 = ((w) this).field_G.field_f * ((w) this).field_p / ug.field_g;
              L2: while (true) {
                var5 = (long)var4 * (long)param2 + ((w) this).field_N;
                if ((-var5 + ((w) this).field_x ^ -1L) > -1L) {
                  var7 = (int)((-1L + ((long)var4 + -((w) this).field_N + ((w) this).field_x)) / (long)var4);
                  ((w) this).field_N = ((w) this).field_N + (long)var7 * (long)var4;
                  ((w) this).field_B.b(param0, param1, var7);
                  this.d(0);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (((w) this).field_G.c()) {
                    continue L2;
                  } else {
                    ((w) this).field_B.b(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((w) this).field_N = var5;
                  break L1;
                }
              }
            }
          }
          ((w) this).field_B.b(param0, param1, param2);
          break L0;
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 4491) {
            this.a((byte) 108, -57, -120, 20);
        }
        this.a((byte) 109, true);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var2 = ((w) this).field_D;
          var3 = ((w) this).field_K;
          var4 = ((w) this).field_x;
          if (((w) this).field_z == null) {
            break L0;
          } else {
            if (var3 == ((w) this).field_s) {
              ((w) this).a(((w) this).field_R, (byte) 127, ((w) this).field_J, ((w) this).field_z);
              this.d(0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((w) this).field_K != var3) {
            L2: {
              ((w) this).field_K = var3;
              ((w) this).field_D = var2;
              if (param0 == 0) {
                break L2;
              } else {
                ((w) this).field_F = null;
                break L2;
              }
            }
            L3: {
              ((w) this).field_x = var4;
              if (null == ((w) this).field_z) {
                break L3;
              } else {
                if (((w) this).field_s < var3) {
                  ((w) this).field_D = -1;
                  ((w) this).field_K = ((w) this).field_s;
                  ((w) this).field_x = ((w) this).field_G.b(((w) this).field_K);
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
                if (var3 != ((w) this).field_G.field_a[var2]) {
                  break L5;
                } else {
                  ((w) this).field_G.e(var2);
                  var6 = ((w) this).field_G.c(var2);
                  if (1 == var6) {
                    ((w) this).field_G.a();
                    ((w) this).field_G.a(var2);
                    if (((w) this).field_G.e()) {
                      if (((w) this).field_z != null) {
                        ((w) this).a(((w) this).field_R, (byte) 52, ((w) this).field_z);
                        this.d(0);
                        return;
                      } else {
                        L6: {
                          if (!((w) this).field_R) {
                            break L6;
                          } else {
                            if (0 == var3) {
                              break L6;
                            } else {
                              ((w) this).field_G.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, 2065687494);
                        ((w) this).field_G.b();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (-1 != (var6 & 128 ^ -1)) {
                        this.a((byte) -103, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((w) this).field_G.d(var2);
                    ((w) this).field_G.a(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((w) this).field_G.d();
              var3 = ((w) this).field_G.field_a[var2];
              var4 = ((w) this).field_G.b(var3);
              continue L1;
            }
          }
        }
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (param2 <= -47) {
            break L0;
          } else {
            int discarded$2 = ((w) this).g(95);
            break L0;
          }
        }
        L1: {
          if (param1 >= 0) {
            ((w) this).field_M[param1] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (-17 >= (var4 ^ -1)) {
                break L1;
              } else {
                ((w) this).field_M[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    public w() {
        ((w) this).field_H = new int[16];
        ((w) this).field_u = new int[16];
        ((w) this).field_L = new int[16];
        ((w) this).field_w = new int[16];
        ((w) this).field_F = new int[16];
        ((w) this).field_n = new int[16];
        ((w) this).field_P = new tm[16][128];
        ((w) this).field_l = new int[16];
        ((w) this).field_E = new int[16];
        ((w) this).field_o = new int[16];
        ((w) this).field_v = new int[16];
        ((w) this).field_t = new int[16];
        ((w) this).field_p = 1000000;
        ((w) this).field_O = new int[16];
        ((w) this).field_M = new int[16];
        ((w) this).field_q = new tm[16][128];
        ((w) this).field_T = new int[16];
        ((w) this).field_y = new int[16];
        ((w) this).field_C = new int[16];
        ((w) this).field_m = 256;
        ((w) this).field_G = new gh();
        ((w) this).field_B = new dl((w) this);
        ((w) this).field_I = new jm(128);
        ((w) this).a(256, -1, (byte) -76);
        this.a(true, 2065687494);
    }

    w(w param0) {
        ((w) this).field_H = new int[16];
        ((w) this).field_u = new int[16];
        ((w) this).field_L = new int[16];
        ((w) this).field_w = new int[16];
        ((w) this).field_F = new int[16];
        ((w) this).field_n = new int[16];
        ((w) this).field_P = new tm[16][128];
        ((w) this).field_l = new int[16];
        ((w) this).field_E = new int[16];
        ((w) this).field_o = new int[16];
        ((w) this).field_v = new int[16];
        ((w) this).field_t = new int[16];
        ((w) this).field_p = 1000000;
        ((w) this).field_O = new int[16];
        ((w) this).field_M = new int[16];
        ((w) this).field_q = new tm[16][128];
        ((w) this).field_T = new int[16];
        ((w) this).field_y = new int[16];
        ((w) this).field_C = new int[16];
        ((w) this).field_m = 256;
        ((w) this).field_G = new gh();
        ((w) this).field_B = new dl((w) this);
        ((w) this).field_I = param0.field_I;
        ((w) this).a(256, -1, (byte) -77);
        this.a(true, 2065687494);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
        field_A = "<col=ffffff>Pistol</col><br>If one of your weapons runs out of ammo, you will revert to using your pistol. This weapon has unlimited ammo, but a slow rate of fire, so try not to rely on it. Keep ammo stocked for the better weapons.";
        field_S = new fa("");
    }
}
