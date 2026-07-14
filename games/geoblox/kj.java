/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ia {
    private pc[][] field_D;
    private int[] field_p;
    private jb field_C;
    private int[] field_z;
    int[] field_u;
    static boolean[] field_o;
    static dm field_E;
    private int field_T;
    private int[] field_r;
    private fi field_q;
    private pc[][] field_j;
    private int[] field_v;
    int[] field_n;
    private int[] field_S;
    int[] field_m;
    private int[] field_L;
    private int[] field_M;
    static int field_J;
    private int[] field_K;
    private int field_R;
    private int[] field_y;
    private int[] field_s;
    static int[] field_O;
    private int[] field_Q;
    static int[] field_G;
    private int[] field_F;
    private int[] field_w;
    private int field_k;
    private ad field_I;
    private boolean field_B;
    private int field_t;
    private long field_x;
    private long field_A;
    private boolean field_P;
    private rf field_l;
    private int field_U;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        L0: {
          if (!((kj) this).field_C.f()) {
            break L0;
          } else {
            var4 = ((kj) this).field_C.field_d * ((kj) this).field_T / qk.field_j;
            L1: while (true) {
              var5 = (long)param2 * (long)var4 + ((kj) this).field_x;
              if (-1L < (((kj) this).field_A + -var5 ^ -1L)) {
                var7 = (int)((-1L + ((kj) this).field_A - (((kj) this).field_x - (long)var4)) / (long)var4);
                ((kj) this).field_x = ((kj) this).field_x + (long)var7 * (long)var4;
                ((kj) this).field_I.a(param0, param1, var7);
                param2 = param2 - var7;
                param1 = param1 + var7;
                this.a((byte) 65);
                if (!((kj) this).field_C.f()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((kj) this).field_x = var5;
                break L0;
              }
            }
          }
        }
        ((kj) this).field_I.a(param0, param1, param2);
    }

    final synchronized int d() {
        return 0;
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != -2832) {
            ((kj) this).d(44);
        }
    }

    private final int a(byte param0, pc param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (!(-1 != (((kj) this).field_L[param1.field_t] ^ -1))) {
            return 0;
        }
        t var10 = param1.field_x;
        t var11 = var10;
        int var4 = ((kj) this).field_p[param1.field_t] * ((kj) this).field_r[param1.field_t] - -4096 >> -695306195;
        var4 = var4 * var4 + 16384 >> -130426065;
        int var5 = -83 % ((param0 - 44) / 55);
        var4 = 16384 + var4 * param1.field_w >> 441298735;
        var4 = 128 + var4 * ((kj) this).field_R >> -1986953208;
        var4 = var4 * ((kj) this).field_L[param1.field_t] - -128 >> -614748792;
        if ((var11.field_c ^ -1) < -1) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_l * (double)var11.field_c) * (double)var4);
        }
        if (!(null == var11.field_f)) {
            var6 = param1.field_o;
            var7 = var11.field_f[1 + param1.field_k];
            if (!(param1.field_k >= var11.field_f.length + -2)) {
                var8 = (var10.field_f[param1.field_k] & 255) << 177519176;
                var9 = (255 & var11.field_f[param1.field_k + 2]) << -2130725304;
                var7 = var7 + (var11.field_f[param1.field_k + 3] + -var7) * (-var8 + var6) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> -1943382906;
        }
        if (param1.field_y > 0) {
            if (var11.field_e != null) {
                var6 = param1.field_y;
                var7 = var11.field_e[1 + param1.field_q];
                if (!(-2 + var11.field_e.length <= param1.field_q)) {
                    var8 = var10.field_e[param1.field_q] << 1159547464 & 65280;
                    var9 = var11.field_e[param1.field_q - -2] << -1788850680 & 65280;
                    var7 = var7 + (var11.field_e[param1.field_q - -3] - var7) * (-var8 + var6) / (-var8 + var9);
                }
                var4 = var7 * var4 - -32 >> 303901990;
            }
        }
        return var4;
    }

    private final int a(int param0, pc param1) {
        int var3 = 0;
        t var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = (param1.field_n * param1.field_s >> -477379188) + param1.field_E;
          var3 = var3 + ((-8192 + ((kj) this).field_y[param1.field_t]) * ((kj) this).field_v[param1.field_t] >> -29494548);
          var4 = param1.field_x;
          if (0 >= var4.field_d) {
            break L0;
          } else {
            L1: {
              if ((var4.field_b ^ -1) < -1) {
                break L1;
              } else {
                if (((kj) this).field_s[param1.field_t] <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = var4.field_b << -992851838;
              var6 = var4.field_j << 1077980513;
              if (var6 > param1.field_j) {
                var5 = var5 * param1.field_j / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((kj) this).field_s[param1.field_t] >> 853866887);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_m & 511));
            var3 = var3 + (int)(var7 * (double)var5);
            break L0;
          }
        }
        if (param0 > 10) {
          L3: {
            var5 = (int)((double)(256 * param1.field_i.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)qk.field_j + 0.5);
            if (var5 < 1) {
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
          return -116;
        }
    }

    final static void c(boolean param0) {
        md.field_e = null;
        if (!param0) {
            return;
        }
        hl.field_K = null;
        mj.field_a = null;
        rc.field_j = null;
        gh.field_m = null;
        cm.field_j = null;
    }

    private final void a(byte param0, int param1) {
        pc var3 = null;
        if (param0 != 39) {
            this.b((byte) -85, -70);
        }
        if (!((((kj) this).field_m[param1] & 2) == 0)) {
            var3 = (pc) (Object) ((kj) this).field_I.field_l.g(0);
            while (var3 != null) {
                if (param1 == var3.field_t) {
                    if (null == ((kj) this).field_j[param1][var3.field_D]) {
                        if (var3.field_y < 0) {
                            var3.field_y = 0;
                        }
                    }
                }
                var3 = (pc) (Object) ((kj) this).field_I.field_l.d(1);
            }
        }
    }

    final boolean a(int param0, int param1, int[] param2, pc param3, boolean param4) {
        int var6 = 0;
        t var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        L0: {
          param3.field_g = qk.field_j / 100;
          if ((param3.field_y ^ -1) > -1) {
            break L0;
          } else {
            L1: {
              if (null == param3.field_u) {
                break L1;
              } else {
                if (param3.field_u.l()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.b(-1);
              param3.a(param4);
              if (0 >= param3.field_r) {
                break L2;
              } else {
                if (param3 != ((kj) this).field_D[param3.field_t][param3.field_r]) {
                  break L2;
                } else {
                  ((kj) this).field_D[param3.field_t][param3.field_r] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param3.field_s;
          if (0 < var6) {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((kj) this).field_M[param3.field_t] * 0.0004921259842519685));
              if (0 > var6) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param3.field_s = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param3.field_u.d(this.a(112, param3));
          var7 = param3.field_x;
          param3.field_m = param3.field_m + var7.field_d;
          param3.field_j = param3.field_j + 1;
          var8 = param4 ? 1 : 0;
          var9 = 0.000005086263020833333 * (double)((-60 + param3.field_D << 1562719368) - -(param3.field_n * param3.field_s >> 2038513900));
          if (var7.field_c < -1) {
            L6: {
              if (-1 < var7.field_h) {
                param3.field_l = param3.field_l + (int)(128.0 * Math.pow(2.0, (double)var7.field_h * var9) + 0.5);
                break L6;
              } else {
                param3.field_l = param3.field_l + 128;
                break L6;
              }
            }
            if (-819201 < (var7.field_c * param3.field_l ^ -1)) {
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
          if (var7.field_f == null) {
            break L7;
          } else {
            L8: {
              if ((var7.field_g ^ -1) < -1) {
                param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
                break L8;
              } else {
                param3.field_o = param3.field_o + 128;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (param3.field_k >= -2 + var7.field_f.length) {
                  break L10;
                } else {
                  if ((65280 & var7.field_f[param3.field_k - -2] << -446732824) >= param3.field_o) {
                    break L10;
                  } else {
                    param3.field_k = param3.field_k + 2;
                    continue L9;
                  }
                }
              }
              if (param3.field_k != -2 + var7.field_f.length) {
                break L7;
              } else {
                if (var7.field_f[param3.field_k + 1] != 0) {
                  break L7;
                } else {
                  var8 = 1;
                  break L7;
                }
              }
            }
          }
        }
        L11: {
          if (param3.field_y > -1) {
            break L11;
          } else {
            if (var7.field_e == null) {
              break L11;
            } else {
              if (-1 == (((kj) this).field_m[param3.field_t] & 1)) {
                L12: {
                  if (0 > param3.field_r) {
                    break L12;
                  } else {
                    if (param3 == ((kj) this).field_D[param3.field_t][param3.field_r]) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0 < var7.field_a) {
                    param3.field_y = param3.field_y + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_a) * 128.0);
                    break L13;
                  } else {
                    param3.field_y = param3.field_y + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (-2 + var7.field_e.length <= param3.field_q) {
                      break L15;
                    } else {
                      if (param3.field_y <= (var7.field_e[param3.field_q - -2] & 255) << -356282872) {
                        break L15;
                      } else {
                        param3.field_q = param3.field_q + 2;
                        continue L14;
                      }
                    }
                  }
                  if (-2 + var7.field_e.length != param3.field_q) {
                    break L11;
                  } else {
                    var8 = 1;
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
          }
        }
        if (var8 == 0) {
          param3.field_u.a(param3.field_g, this.a((byte) -79, param3), this.a(param3, 761736646));
          return false;
        } else {
          L16: {
            param3.field_u.c(param3.field_g);
            if (param2 == null) {
              param3.field_u.b(param0);
              break L16;
            } else {
              param3.field_u.a(param2, param1, param0);
              break L16;
            }
          }
          L17: {
            if (param3.field_u.g()) {
              ((kj) this).field_I.field_m.a((ia) (Object) param3.field_u);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            param3.b(-1);
            if (0 <= param3.field_y) {
              param3.a(false);
              if (0 >= param3.field_r) {
                break L18;
              } else {
                if (((kj) this).field_D[param3.field_t][param3.field_r] == param3) {
                  ((kj) this).field_D[param3.field_t][param3.field_r] = null;
                  break L18;
                } else {
                  break L18;
                }
              }
            } else {
              break L18;
            }
          }
          return true;
        }
    }

    private final void a(int param0, byte param1) {
        pc var3 = null;
        if (!((((kj) this).field_m[param0] & 4) == 0)) {
            var3 = (pc) (Object) ((kj) this).field_I.field_l.g(0);
            while (var3 != null) {
                if (!(var3.field_t != param0)) {
                    var3.field_B = 0;
                }
                var3 = (pc) (Object) ((kj) this).field_I.field_l.d(1);
            }
        }
        if (param1 != 67) {
            ((kj) this).field_l = null;
        }
    }

    final synchronized boolean a(ci param0, int param1, int param2, rf param3, rh param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        pj var8 = null;
        int var9 = 0;
        vl var10 = null;
        vl var10_ref = null;
        int var11 = 0;
        L0: {
          var11 = Geoblox.field_C;
          param3.b();
          var6 = 1;
          var7 = null;
          if ((param1 ^ -1) >= param2) {
            break L0;
          } else {
            var7_array = new int[]{param1};
            break L0;
          }
        }
        var8 = (pj) (Object) param3.field_g.a((byte) 125);
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
            var9 = (int)var8.field_a;
            var10 = (vl) (Object) ((kj) this).field_q.a((long)var9, (byte) -91);
            if (var10 == null) {
              L3: {
                var10_ref = vl.a(var9, (byte) 121, param4);
                if (var10_ref != null) {
                  ((kj) this).field_q.a((byte) 102, (hf) (Object) var10_ref, (long)var9);
                  break L3;
                } else {
                  var6 = 0;
                  break L3;
                }
              }
              L4: {
                if (var10_ref == null) {
                  break L4;
                } else {
                  if (var10_ref.a(var7_array, var8.field_h, param2 + 36, param0)) {
                    break L4;
                  } else {
                    var6 = 0;
                    break L4;
                  }
                }
              }
              var8 = (pj) (Object) param3.field_g.b(param2 + -100);
              continue L1;
            } else {
              L5: {
                if (var10 == null) {
                  break L5;
                } else {
                  if (var10.a(var7_array, var8.field_h, param2 + 36, param0)) {
                    break L5;
                  } else {
                    var6 = 0;
                    break L5;
                  }
                }
              }
              var8 = (pj) (Object) param3.field_g.b(param2 + -100);
              continue L1;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        if (!(param1 <= -1)) {
            for (param1 = 0; -17 > param1; param1++) {
                this.b((byte) -22, param1);
            }
            return;
        }
        ((kj) this).field_p[param1] = 12800;
        ((kj) this).field_z[param1] = 8192;
        ((kj) this).field_r[param1] = 16383;
        ((kj) this).field_y[param1] = 8192;
        ((kj) this).field_s[param1] = 0;
        ((kj) this).field_M[param1] = 8192;
        this.a((byte) 39, param1);
        this.a(param1, (byte) 67);
        ((kj) this).field_m[param1] = 0;
        if (param0 >= -12) {
            ((kj) this).field_k = 55;
        }
        ((kj) this).field_w[param1] = 32767;
        ((kj) this).field_v[param1] = 256;
        ((kj) this).field_u[param1] = 0;
        this.f(-112, 8192, param1);
    }

    private final void a(int param0, int param1, int param2) {
        ((kj) this).field_F[param1] = param2;
        ((kj) this).field_K[param1] = cd.a(param2, -128);
        if (param0 != -8581) {
            ((kj) this).field_z = null;
        }
        this.b(param1, -129, param2);
    }

    private final int a(pc param0, int param1) {
        int var3 = ((kj) this).field_z[param0.field_t];
        if (param1 != 761736646) {
            Object var4 = null;
            int discarded$0 = this.a((pc) null, 124);
        }
        if (var3 >= 8192) {
            return 16384 - (32 + (128 + -param0.field_h) * (16384 - var3) >> -1408535450);
        }
        return var3 * param0.field_h + 32 >> 761736646;
    }

    final void a(pc param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param1 == -70) {
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param0.field_i.field_k.length;
            if (!param2) {
              break L2;
            } else {
              if (param0.field_i.field_i) {
                var6 = -param0.field_i.field_g + var4 - -var4;
                var4 = var4 << 8;
                var5 = (int)((long)var6 * (long)((kj) this).field_u[param0.field_t] >> 323136070);
                if (var4 <= var5) {
                  param0.field_u.b(true);
                  var5 = -var5 + (var4 - -var4) + -1;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          var5 = (int)((long)var4 * (long)((kj) this).field_u[param0.field_t] >> -2116060090);
          break L1;
        }
        param0.field_u.e(var5);
    }

    final synchronized ia c() {
        return null;
    }

    private final void c(int param0, int param1) {
        pc var3 = (pc) (Object) ((kj) this).field_I.field_l.g(param1 ^ param1);
        while (var3 != null) {
            if (param0 <= -1) {
                // if_icmpne L80
            }
            if (!(-1 <= var3.field_y)) {
                ((kj) this).field_j[var3.field_t][var3.field_D] = null;
                var3.field_y = 0;
            }
            var3 = (pc) (Object) ((kj) this).field_I.field_l.d(1);
        }
    }

    private final void c(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param1 == 38) {
          var3 = 240 & param0;
          if (-129 == (var3 ^ -1)) {
            var4 = param0 & 15;
            var5 = (32542 & param0) >> 66514504;
            var6 = (param0 & 8361066) >> 313387600;
            this.b(23327, var5, var6, var4);
            return;
          } else {
            if ((var3 ^ -1) != -145) {
              if (var3 == 160) {
                var4 = 15 & param0;
                var5 = param0 >> -735367864 & 127;
                var6 = (8370933 & param0) >> -1699537200;
                this.a(-40, var6, var5, var4);
                return;
              } else {
                if (var3 == 176) {
                  L0: {
                    var4 = 15 & param0;
                    var5 = (param0 & 32577) >> -625065720;
                    var6 = param0 >> 76053008 & 127;
                    if (0 == var5) {
                      ((kj) this).field_K[var4] = (var6 << -224081554) + cd.a(((kj) this).field_K[var4], -2080769);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  L1: {
                    if (-33 == (var5 ^ -1)) {
                      ((kj) this).field_K[var4] = (var6 << -1083731353) + cd.a(((kj) this).field_K[var4], -16257);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 == (var5 ^ -1)) {
                      ((kj) this).field_s[var4] = (var6 << -906576345) + cd.a(((kj) this).field_s[var4], -16257);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (33 == var5) {
                      ((kj) this).field_s[var4] = var6 + cd.a(-128, ((kj) this).field_s[var4]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-6 == (var5 ^ -1)) {
                      ((kj) this).field_M[var4] = cd.a(-16257, ((kj) this).field_M[var4]) - -(var6 << -1537306265);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) == -38) {
                      ((kj) this).field_M[var4] = cd.a(-128, ((kj) this).field_M[var4]) - -var6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) != -8) {
                      break L6;
                    } else {
                      ((kj) this).field_p[var4] = cd.a(((kj) this).field_p[var4], -16257) + (var6 << -1305516857);
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != -40) {
                      break L7;
                    } else {
                      ((kj) this).field_p[var4] = cd.a(-128, ((kj) this).field_p[var4]) + var6;
                      break L7;
                    }
                  }
                  L8: {
                    if (-11 != var5) {
                      break L8;
                    } else {
                      ((kj) this).field_z[var4] = cd.a(-16257, ((kj) this).field_z[var4]) - -(var6 << -1078103033);
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 42) {
                      ((kj) this).field_z[var4] = var6 + cd.a(-128, ((kj) this).field_z[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) != -12) {
                      break L10;
                    } else {
                      ((kj) this).field_r[var4] = (var6 << -757285145) + cd.a(-16257, ((kj) this).field_r[var4]);
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) == -44) {
                      ((kj) this).field_r[var4] = cd.a(-128, ((kj) this).field_r[var4]) - -var6;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-65 != (var5 ^ -1)) {
                      break L12;
                    } else {
                      if ((var6 ^ -1) > -65) {
                        ((kj) this).field_m[var4] = cd.a(((kj) this).field_m[var4], -2);
                        break L12;
                      } else {
                        ((kj) this).field_m[var4] = lb.a(((kj) this).field_m[var4], 1);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (-66 == (var5 ^ -1)) {
                      if (64 <= var6) {
                        ((kj) this).field_m[var4] = lb.a(((kj) this).field_m[var4], 2);
                        break L13;
                      } else {
                        this.a((byte) 39, var4);
                        ((kj) this).field_m[var4] = cd.a(((kj) this).field_m[var4], -3);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((var5 ^ -1) == -100) {
                      ((kj) this).field_w[var4] = cd.a(((kj) this).field_w[var4], 127) - -(var6 << 183494855);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 != 98) {
                      break L15;
                    } else {
                      ((kj) this).field_w[var4] = var6 + cd.a(16256, ((kj) this).field_w[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if (101 != var5) {
                      break L16;
                    } else {
                      ((kj) this).field_w[var4] = (var6 << 50131079) + (cd.a(((kj) this).field_w[var4], 127) + 16384);
                      break L16;
                    }
                  }
                  L17: {
                    if (-101 != (var5 ^ -1)) {
                      break L17;
                    } else {
                      ((kj) this).field_w[var4] = 16384 + (cd.a(16256, ((kj) this).field_w[var4]) + var6);
                      break L17;
                    }
                  }
                  L18: {
                    if (120 == var5) {
                      this.b(100, var4);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if ((var5 ^ -1) != -122) {
                      break L19;
                    } else {
                      this.b((byte) -72, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 123) {
                      this.c(var4, param1 ^ 15421);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-7 != (var5 ^ -1)) {
                      break L21;
                    } else {
                      var7 = ((kj) this).field_w[var4];
                      if (16384 != var7) {
                        break L21;
                      } else {
                        ((kj) this).field_v[var4] = cd.a(((kj) this).field_v[var4], -16257) + (var6 << 256590087);
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if ((var5 ^ -1) != -39) {
                      break L22;
                    } else {
                      var7 = ((kj) this).field_w[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L22;
                      } else {
                        ((kj) this).field_v[var4] = cd.a(((kj) this).field_v[var4], -128) - -var6;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (16 == var5) {
                      ((kj) this).field_u[var4] = cd.a(-16257, ((kj) this).field_u[var4]) - -(var6 << 517249927);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (48 != var5) {
                      break L24;
                    } else {
                      ((kj) this).field_u[var4] = var6 + cd.a(((kj) this).field_u[var4], -128);
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 81) {
                      if ((var6 ^ -1) <= -65) {
                        ((kj) this).field_m[var4] = lb.a(((kj) this).field_m[var4], 4);
                        break L25;
                      } else {
                        this.a(var4, (byte) 67);
                        ((kj) this).field_m[var4] = cd.a(((kj) this).field_m[var4], -5);
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-18 != (var5 ^ -1)) {
                      break L26;
                    } else {
                      this.f(-118, (var6 << 446536935) + (((kj) this).field_Q[var4] & -16257), var4);
                      break L26;
                    }
                  }
                  L27: {
                    if (-50 == (var5 ^ -1)) {
                      this.f(-102, (-128 & ((kj) this).field_Q[var4]) + var6, var4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  return;
                } else {
                  if (192 == var3) {
                    var4 = param0 & 15;
                    var5 = (32632 & param0) >> 798658216;
                    this.b(var4, param1 + -167, var5 + ((kj) this).field_K[var4]);
                    return;
                  } else {
                    if (-209 != (var3 ^ -1)) {
                      if ((var3 ^ -1) == -225) {
                        var4 = param0 & 15;
                        var5 = (param0 >> 1201189897 & 16256) - -((32673 & param0) >> -501468376);
                        this.c(-108, var5, var4);
                        return;
                      } else {
                        var3 = 255 & param0;
                        if (255 != var3) {
                          return;
                        } else {
                          this.a(true, param1 ^ 2097113);
                          return;
                        }
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = (32669 & param0) >> 1322657192;
                      this.d(var5, param1 ^ -2858, var4);
                      return;
                    }
                  }
                }
              }
            } else {
              L28: {
                var4 = param0 & 15;
                var5 = (32525 & param0) >> -1496842808;
                var6 = 127 & param0 >> -364929040;
                if ((var6 ^ -1) < -1) {
                  this.c(-1, var4, var6, var5);
                  break L28;
                } else {
                  this.b(23327, var5, 64, var4);
                  break L28;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.field_C;
        if (param1 >= 0) {
            ((kj) this).field_L[param1] = param2;
        } else {
            for (var4 = 0; (var4 ^ -1) > -17; var4++) {
                ((kj) this).field_L[var4] = param2;
            }
        }
        if (param0 != 74) {
            this.a((byte) 100, 93);
        }
    }

    final synchronized void b(int param0, byte param1) {
        ((kj) this).field_R = param0;
        if (param1 != 22) {
            ((kj) this).field_x = 84L;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        L0: {
          var3 = -25 % ((29 - param0) / 34);
          var2 = ((kj) this).field_t;
          var4 = ((kj) this).field_k;
          var5 = ((kj) this).field_A;
          if (((kj) this).field_l == null) {
            break L0;
          } else {
            if (((kj) this).field_U != var4) {
              break L0;
            } else {
              this.a(121, ((kj) this).field_l, ((kj) this).field_B, ((kj) this).field_P);
              this.a((byte) 73);
              return;
            }
          }
        }
        L1: while (true) {
          if (var4 != ((kj) this).field_k) {
            L2: {
              ((kj) this).field_k = var4;
              ((kj) this).field_A = var5;
              ((kj) this).field_t = var2;
              if (null == ((kj) this).field_l) {
                break L2;
              } else {
                if (((kj) this).field_U < var4) {
                  ((kj) this).field_k = ((kj) this).field_U;
                  ((kj) this).field_t = -1;
                  ((kj) this).field_A = ((kj) this).field_C.d(((kj) this).field_k);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (((kj) this).field_C.field_a[var2] != var4) {
                  break L4;
                } else {
                  ((kj) this).field_C.a(var2);
                  var7 = ((kj) this).field_C.e(var2);
                  if (1 == var7) {
                    ((kj) this).field_C.d();
                    ((kj) this).field_C.b(var2);
                    if (((kj) this).field_C.e()) {
                      if (((kj) this).field_l != null) {
                        ((kj) this).a(((kj) this).field_B, ((kj) this).field_l, -1706);
                        this.a((byte) -32);
                        return;
                      } else {
                        L5: {
                          if (!((kj) this).field_B) {
                            break L5;
                          } else {
                            if (-1 == (var4 ^ -1)) {
                              break L5;
                            } else {
                              ((kj) this).field_C.a(var5);
                              break L4;
                            }
                          }
                        }
                        this.a(true, 2097151);
                        ((kj) this).field_C.a();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if ((128 & var7) != 0) {
                        this.c(var7, (byte) 38);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((kj) this).field_C.f(var2);
                    ((kj) this).field_C.b(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((kj) this).field_C.c();
              var4 = ((kj) this).field_C.field_a[var2];
              var5 = ((kj) this).field_C.d(var4);
              continue L1;
            }
          }
        }
    }

    final synchronized void a(boolean param0, rf param1, int param2) {
        if (param2 != -1706) {
            ((kj) this).field_t = -24;
        }
        this.a(param2 + 1832, param1, param0, true);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pc var6 = null;
        pc var7 = null;
        var7 = ((kj) this).field_j[param3][param1];
        if (var7 == null) {
          return;
        } else {
          L0: {
            ((kj) this).field_j[param3][param1] = null;
            if (param0 == 23327) {
              break L0;
            } else {
              ((kj) this).field_U = -124;
              break L0;
            }
          }
          L1: {
            if ((((kj) this).field_m[param3] & 2) == 0) {
              var7.field_y = 0;
              break L1;
            } else {
              var6 = (pc) (Object) ((kj) this).field_I.field_l.g(param0 ^ 23327);
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var7.field_t != var6.field_t) {
                      break L3;
                    } else {
                      if (0 <= var6.field_y) {
                        break L3;
                      } else {
                        if (var7 == var6) {
                          break L3;
                        } else {
                          var7.field_y = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (pc) (Object) ((kj) this).field_I.field_l.d(1);
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1) {
        pc var3 = (pc) (Object) ((kj) this).field_I.field_l.g(param0 + -100);
        while (var3 != null) {
            if (param1 >= 0) {
                // if_icmpeq L40
            } else {
                if (!(null == var3.field_u)) {
                    var3.field_u.c(qk.field_j / 100);
                    if (!(!var3.field_u.g())) {
                        ((kj) this).field_I.field_m.a((ia) (Object) var3.field_u);
                    }
                    var3.b(-1);
                }
                if (!(-1 >= (var3.field_y ^ -1))) {
                    ((kj) this).field_j[var3.field_t][var3.field_D] = null;
                }
                var3.a(false);
            }
            var3 = (pc) (Object) ((kj) this).field_I.field_l.d(1);
        }
        if (param0 != 100) {
            ((kj) this).field_x = -48L;
        }
    }

    final synchronized void c(byte param0) {
        int var3 = Geoblox.field_C;
        if (param0 <= 65) {
            this.c(-76, (byte) -34);
        }
        vl var4 = (vl) (Object) ((kj) this).field_q.a((byte) 125);
        while (var4 != null) {
            var4.a((byte) -121);
            var4 = (vl) (Object) ((kj) this).field_q.b(-52);
        }
    }

    private final void f(int param0, int param1, int param2) {
        ((kj) this).field_Q[param2] = param1;
        if (param0 > -100) {
            this.a(-75, 124, -68);
        }
        ((kj) this).field_n[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != ((kj) this).field_S[param0]) {
            ((kj) this).field_S[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((kj) this).field_D[param0][var4] = null;
            }
        }
        if (param1 != -129) {
            ((kj) this).field_v = null;
        }
    }

    public static void b(boolean param0) {
        field_E = null;
        field_O = null;
        field_o = null;
        field_G = null;
        if (param0) {
            kj.c(-77);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            this.c(-1, 15387);
        } else {
            this.b(100, -1);
        }
        if (param1 != 2097151) {
            ((kj) this).b(108);
        }
        this.b((byte) -109, -1);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            ((kj) this).field_S[var3] = ((kj) this).field_F[var3];
        }
        int var4 = 0;
        var3 = var4;
        while ((var4 ^ -1) > -17) {
            ((kj) this).field_K[var4] = cd.a(((kj) this).field_F[var4], -128);
            var4++;
        }
    }

    final synchronized ia b() {
        return (ia) (Object) ((kj) this).field_I;
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        int var5 = 0;
        long var3 = 0L;
        if (!((kj) this).field_C.f()) {
        } else {
            var2 = ((kj) this).field_T * ((kj) this).field_C.field_d / qk.field_j;
            var3 = ((kj) this).field_x - -((long)param0 * (long)var2);
            if (-1L >= (-var3 + ((kj) this).field_A ^ -1L)) {
                ((kj) this).field_x = var3;
            } else {
                var5 = (int)((-1L + ((long)var2 + -((kj) this).field_x + ((kj) this).field_A)) / (long)var2);
                ((kj) this).field_x = ((kj) this).field_x + (long)var2 * (long)var5;
                param0 = param0 - var5;
                ((kj) this).field_I.b(var5);
                this.a((byte) -42);
                // ifne L30
            }
        }
        ((kj) this).field_I.b(param0);
    }

    final boolean b(pc param0, int param1) {
        if (!(param0.field_u != null)) {
            if ((param0.field_y ^ -1) <= -1) {
                param0.a(false);
                if (0 < param0.field_r) {
                    if (((kj) this).field_D[param0.field_t][param0.field_r] == param0) {
                        ((kj) this).field_D[param0.field_t][param0.field_r] = null;
                        return true;
                    }
                }
            }
            return true;
        }
        if (param1 != -1) {
            return true;
        }
        return false;
    }

    private final synchronized void a(byte param0, boolean param1) {
        ((kj) this).field_C.a();
        if (param0 < 78) {
            ((kj) this).field_y = null;
        }
        ((kj) this).field_l = null;
        this.a(param1, 2097151);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        pc var5 = null;
        gd var6 = null;
        int var6_int = 0;
        pc var7 = null;
        pc var8 = null;
        vl var9 = null;
        vl var10 = null;
        Object stackIn_14_0 = null;
        pc stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        pc stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        pc stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        Object stackOut_13_0 = null;
        pc stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        Object stackOut_15_0 = null;
        pc stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        Object stackOut_14_0 = null;
        pc stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        L0: {
          this.b(23327, param3, 64, param1);
          if (0 != (2 & ((kj) this).field_m[param1])) {
            var5 = (pc) (Object) ((kj) this).field_I.field_l.a(false);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param1 != var5.field_t) {
                    break L2;
                  } else {
                    if (-1 >= (var5.field_y ^ -1)) {
                      break L2;
                    } else {
                      ((kj) this).field_j[param1][var5.field_D] = null;
                      ((kj) this).field_j[param1][param3] = var5;
                      var6_int = (var5.field_n * var5.field_s >> 269293324) + var5.field_E;
                      var5.field_E = var5.field_E + (param3 + -var5.field_D << 431120968);
                      var5.field_D = param3;
                      var5.field_n = var6_int + -var5.field_E;
                      var5.field_s = 4096;
                      return;
                    }
                  }
                }
                var5 = (pc) (Object) ((kj) this).field_I.field_l.b(param0 ^ -1);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var9 = (vl) (Object) ((kj) this).field_q.a((long)((kj) this).field_S[param1], (byte) -105);
        var10 = var9;
        if (var10 != null) {
          var6 = var9.field_k[param3];
          if (var6 != null) {
            L3: {
              var7 = new pc();
              var7.field_t = param1;
              var7.field_z = var10;
              var7.field_i = var6;
              var7.field_x = var9.field_f[param3];
              var7.field_r = var9.field_i[param3];
              var7.field_D = param3;
              var7.field_w = var9.field_o[param3] * var10.field_g * (param2 * param2) - -1024 >> 631565163;
              var7.field_h = 255 & var9.field_m[param3];
              var7.field_E = (param3 << -298352696) - (var9.field_j[param3] & 32767);
              var7.field_q = 0;
              var7.field_l = 0;
              var7.field_o = 0;
              var7.field_k = 0;
              var7.field_y = -1;
              if (param0 == (((kj) this).field_u[param1] ^ -1)) {
                var7.field_u = kl.a(var6, this.a(92, var7), this.a((byte) 117, var7), this.a(var7, 761736646));
                break L3;
              } else {
                L4: {
                  var7.field_u = kl.a(var6, this.a(83, var7), 0, this.a(var7, 761736646));
                  stackOut_13_0 = this;
                  stackOut_13_1 = (pc) var7;
                  stackOut_13_2 = -70;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  if (0 <= var9.field_j[param3]) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = (pc) (Object) stackIn_15_1;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = (pc) (Object) stackIn_14_1;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    break L4;
                  }
                }
                ((kj) this).a(stackIn_16_1, (byte) stackIn_16_2, stackIn_16_3 != 0);
                break L3;
              }
            }
            L5: {
              if ((var9.field_j[param3] ^ -1) <= -1) {
                break L5;
              } else {
                var7.field_u.g(-1);
                break L5;
              }
            }
            L6: {
              if (0 <= var7.field_r) {
                L7: {
                  var8 = ((kj) this).field_D[param1][var7.field_r];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_y < 0) {
                      ((kj) this).field_j[param1][var8.field_D] = null;
                      var8.field_y = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((kj) this).field_D[param1][var7.field_r] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((kj) this).field_I.field_l.a(-70, (hf) (Object) var7);
            ((kj) this).field_j[param1][param3] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 > -107) {
            return;
        }
        ((kj) this).field_y[param2] = param1;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -40) {
            Object var6 = null;
            ((kj) this).a((int[]) null, -107, 119);
        }
    }

    final synchronized void d(int param0) {
        this.a((byte) 106, true);
        if (param0 != -9268) {
            ((kj) this).field_F = null;
        }
    }

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == je.field_j) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) je.field_j;
                    // monitorenter je.field_j
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        je.field_j = null;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) var2;
                }
                case 6: {
                    if (param0 == -11099) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    field_J = 4;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final synchronized void a(int param0, rf param1, boolean param2, boolean param3) {
        int var6 = 0;
        this.a((byte) 98, param3);
        ((kj) this).field_C.a(param1.field_f);
        ((kj) this).field_x = 0L;
        ((kj) this).field_B = param2 ? true : false;
        int var5 = ((kj) this).field_C.g();
        if (param0 <= 92) {
            this.a(60, (byte) -45);
        }
        for (var6 = 0; var6 < var5; var6++) {
            ((kj) this).field_C.a(var6);
            ((kj) this).field_C.f(var6);
            ((kj) this).field_C.b(var6);
        }
        ((kj) this).field_t = ((kj) this).field_C.c();
        ((kj) this).field_k = ((kj) this).field_C.field_a[((kj) this).field_t];
        ((kj) this).field_A = ((kj) this).field_C.d(((kj) this).field_k);
    }

    final synchronized void e(int param0, int param1, int param2) {
        if (param0 != -1636) {
            this.b((byte) -86, 98);
        }
        this.a(-8581, param1, param2);
    }

    public kj() {
        ((kj) this).field_D = new pc[16][128];
        ((kj) this).field_z = new int[16];
        ((kj) this).field_u = new int[16];
        ((kj) this).field_p = new int[16];
        ((kj) this).field_S = new int[16];
        ((kj) this).field_m = new int[16];
        ((kj) this).field_v = new int[16];
        ((kj) this).field_L = new int[16];
        ((kj) this).field_s = new int[16];
        ((kj) this).field_M = new int[16];
        ((kj) this).field_j = new pc[16][128];
        ((kj) this).field_r = new int[16];
        ((kj) this).field_T = 1000000;
        ((kj) this).field_K = new int[16];
        ((kj) this).field_R = 256;
        ((kj) this).field_n = new int[16];
        ((kj) this).field_y = new int[16];
        ((kj) this).field_Q = new int[16];
        ((kj) this).field_F = new int[16];
        ((kj) this).field_w = new int[16];
        ((kj) this).field_C = new jb();
        ((kj) this).field_I = new ad((kj) this);
        ((kj) this).field_q = new fi(128);
        this.a((byte) 74, -1, 256);
        this.a(true, 2097151);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = 0;
        field_o = new boolean[112];
        field_O = new int[128];
        field_G = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
