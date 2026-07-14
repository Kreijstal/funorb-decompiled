/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends k {
    private int[] field_C;
    private int field_r;
    private int[] field_O;
    int[] field_o;
    private int[] field_w;
    private int[] field_R;
    static int field_M;
    static java.applet.Applet field_F;
    private int[] field_D;
    int[] field_y;
    private int[] field_v;
    static int field_u;
    private int[] field_P;
    private int[] field_N;
    int[] field_Q;
    private int[] field_t;
    private int[] field_B;
    private int[] field_I;
    private vk[][] field_J;
    private vk[][] field_S;
    private wf field_E;
    private int[] field_L;
    private int[] field_z;
    static int field_V;
    private int field_m;
    private ab field_G;
    private boolean field_U;
    private int field_p;
    static byte[][][] field_T;
    private long field_n;
    private long field_K;
    static java.awt.Frame field_H;
    private int field_s;
    private he field_A;
    private ji field_x;
    private int field_W;
    private boolean field_q;

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = wizardrun.field_H;
        if (param1 != ((fl) this).field_P[param2]) {
            ((fl) this).field_P[param2] = param1;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((fl) this).field_J[param2][var4] = null;
            }
        }
        if (param0 != -129) {
            this.c(93, -111, 85);
        }
    }

    private final int a(vk param0, byte param1) {
        int var3 = ((fl) this).field_B[param0.field_F];
        if (param1 < 54) {
            ((fl) this).a(-24);
        }
        if ((var3 ^ -1) > -8193) {
            return 32 + param0.field_B * var3 >> 750746630;
        }
        return -((-var3 + 16384) * (128 + -param0.field_B) - -32 >> 632376358) + 16384;
    }

    final synchronized boolean a(kl param0, int param1, ue param2, ji param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        pb var8 = null;
        int var9 = 0;
        h var10 = null;
        h var10_ref = null;
        int var11 = 0;
        L0: {
          var11 = wizardrun.field_H;
          param3.a();
          var6 = 1;
          var7 = null;
          if (param1 > (param4 ^ -1)) {
            var7_array = new int[]{param4};
            break L0;
          } else {
            break L0;
          }
        }
        var8 = (pb) (Object) param3.field_i.b((byte) 61);
        L1: while (true) {
          if (var8 == null) {
            L2: {
              if (var6 == 0) {
                break L2;
              } else {
                param3.b();
                break L2;
              }
            }
            return var6 != 0;
          } else {
            L3: {
              L4: {
                var9 = (int)var8.field_e;
                var10 = (h) (Object) ((fl) this).field_G.a(1, (long)var9);
                if (var10 != null) {
                  break L4;
                } else {
                  var10_ref = ld.a(param1 + 82, var9, param0);
                  if (var10_ref == null) {
                    var6 = 0;
                    break L3;
                  } else {
                    ((fl) this).field_G.a((wl) (Object) var10_ref, -9, (long)var9);
                    break L4;
                  }
                }
              }
              if (!var10_ref.a(var8.field_j, param2, -75, var7_array)) {
                var6 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = (pb) (Object) param3.field_i.b(1);
            continue L1;
          }
        }
    }

    final synchronized k c() {
        return null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        vk var5 = null;
        je var6 = null;
        int var6_int = 0;
        vk var7 = null;
        vk var8 = null;
        int var9 = 0;
        h var10 = null;
        h var11 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        L0: {
          var9 = wizardrun.field_H;
          this.a(param3, 64, param0, (byte) -16);
          if ((((fl) this).field_y[param0] & 2) != 0) {
            var5 = (vk) (Object) ((fl) this).field_A.field_p.a((byte) 11);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_F) {
                    break L2;
                  } else {
                    if (var5.field_j >= 0) {
                      break L2;
                    } else {
                      ((fl) this).field_S[param0][var5.field_k] = null;
                      ((fl) this).field_S[param0][param3] = var5;
                      var6_int = var5.field_z + (var5.field_y * var5.field_I >> 1545564876);
                      var5.field_z = var5.field_z + (-var5.field_k + param3 << 886715048);
                      var5.field_k = param3;
                      var5.field_I = -var5.field_z + var6_int;
                      var5.field_y = 4096;
                      return;
                    }
                  }
                }
                var5 = (vk) (Object) ((fl) this).field_A.field_p.a(102);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (h) (Object) ((fl) this).field_G.a(1, (long)((fl) this).field_P[param0]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_k[param3];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new vk();
              var7.field_C = var11;
              var7.field_F = param0;
              var7.field_v = var6;
              var7.field_i = var10.field_t[param3];
              var7.field_t = var10.field_l[param3];
              var7.field_k = param3;
              var7.field_D = 1024 + param1 * (param1 * var11.field_n) * var10.field_q[param3] >> 864177931;
              var7.field_B = 255 & var10.field_o[param3];
              var7.field_z = -(var10.field_r[param3] & 32767) + (param3 << -1562016536);
              var7.field_m = 0;
              var7.field_K = 0;
              var7.field_j = -1;
              var7.field_n = 0;
              var7.field_s = param2;
              if ((((fl) this).field_o[param0] ^ -1) != -1) {
                L4: {
                  var7.field_w = uj.a(var6, this.a(param2 ^ -822, var7), 0, this.a(var7, (byte) 79));
                  stackOut_16_0 = this;
                  stackOut_16_1 = 15;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if ((var11.field_r[param3] ^ -1) <= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L4;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L4;
                  }
                }
                ((fl) this).a(stackIn_19_1, stackIn_19_2 != 0, var7);
                break L3;
              } else {
                var7.field_w = uj.a(var6, this.a(-822, var7), this.a(var7, -98), this.a(var7, (byte) 105));
                break L3;
              }
            }
            L5: {
              if (0 <= var11.field_r[param3]) {
                break L5;
              } else {
                var7.field_w.e(-1);
                break L5;
              }
            }
            L6: {
              if ((var7.field_t ^ -1) > -1) {
                break L6;
              } else {
                L7: {
                  var8 = ((fl) this).field_J[param0][var7.field_t];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if ((var8.field_j ^ -1) <= -1) {
                      break L7;
                    } else {
                      ((fl) this).field_S[param0][var8.field_k] = null;
                      var8.field_j = 0;
                      break L7;
                    }
                  }
                }
                ((fl) this).field_J[param0][var7.field_t] = var7;
                break L6;
              }
            }
            ((fl) this).field_A.field_p.a((wl) (Object) var7, false);
            ((fl) this).field_S[param0][param3] = var7;
            return;
          }
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = wizardrun.field_H;
        if (!param0) {
            ((fl) this).a(-72, 96);
        }
        h var4 = (h) (Object) ((fl) this).field_G.b((byte) -87);
        while (var4 != null) {
            var4.a(-106);
            var4 = (h) (Object) ((fl) this).field_G.b(1);
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = wizardrun.field_H;
          var2 = ((fl) this).field_p;
          var3 = ((fl) this).field_s;
          var4 = ((fl) this).field_n;
          if (((fl) this).field_x == null) {
            break L0;
          } else {
            if (var3 != ((fl) this).field_W) {
              break L0;
            } else {
              this.a(((fl) this).field_U, ((fl) this).field_q, 0, ((fl) this).field_x);
              this.c(false);
              return;
            }
          }
        }
        L1: while (true) {
          if (((fl) this).field_s != var3) {
            L2: {
              ((fl) this).field_n = var4;
              ((fl) this).field_s = var3;
              ((fl) this).field_p = var2;
              if (!param0) {
                break L2;
              } else {
                ((fl) this).b(true);
                break L2;
              }
            }
            L3: {
              if (null == ((fl) this).field_x) {
                break L3;
              } else {
                if (var3 <= ((fl) this).field_W) {
                  break L3;
                } else {
                  ((fl) this).field_p = -1;
                  ((fl) this).field_s = ((fl) this).field_W;
                  ((fl) this).field_n = ((fl) this).field_E.e(((fl) this).field_s);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (((fl) this).field_E.field_h[var2] != var3) {
                  break L5;
                } else {
                  ((fl) this).field_E.a(var2);
                  var6 = ((fl) this).field_E.d(var2);
                  if (-2 == (var6 ^ -1)) {
                    ((fl) this).field_E.g();
                    ((fl) this).field_E.c(var2);
                    if (!((fl) this).field_E.f()) {
                      break L5;
                    } else {
                      if (((fl) this).field_x != null) {
                        ((fl) this).a(((fl) this).field_U, -76, ((fl) this).field_x);
                        this.c(false);
                        return;
                      } else {
                        L6: {
                          if (!((fl) this).field_U) {
                            break L6;
                          } else {
                            if (0 != var3) {
                              ((fl) this).field_E.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, (byte) -91);
                        ((fl) this).field_E.e();
                        return;
                      }
                    }
                  } else {
                    L7: {
                      if (-1 != (var6 & 128 ^ -1)) {
                        this.e(var6, 12035);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((fl) this).field_E.b(var2);
                    ((fl) this).field_E.c(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((fl) this).field_E.b();
              var3 = ((fl) this).field_E.field_h[var2];
              var4 = ((fl) this).field_E.e(var3);
              continue L1;
            }
          }
        }
    }

    final void a(int param0, boolean param1, vk param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          L1: {
            var4 = param2.field_v.field_k.length;
            if (!param1) {
              break L1;
            } else {
              if (param2.field_v.field_j) {
                var6 = -param2.field_v.field_n + var4 + var4;
                var5 = (int)((long)((fl) this).field_o[param2.field_F] * (long)var6 >> -518849466);
                var4 = var4 << 8;
                if ((var4 ^ -1) >= (var5 ^ -1)) {
                  param2.field_w.b(true);
                  var5 = -var5 + (var4 + var4) + -1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = (int)((long)var4 * (long)((fl) this).field_o[param2.field_F] >> -65387962);
          break L0;
        }
        L2: {
          if (param0 == 15) {
            break L2;
          } else {
            var7 = null;
            ((fl) this).a(true, -14, (ji) null);
            break L2;
          }
        }
        param2.field_w.g(var5);
    }

    private final int a(int param0, vk param1) {
        int var3 = 0;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = param1.field_z + (param1.field_I * param1.field_y >> 1550235596);
          var3 = var3 + ((-8192 + ((fl) this).field_I[param1.field_F]) * ((fl) this).field_D[param1.field_F] >> 295693516);
          var4 = param1.field_i;
          if (-1 <= (var4.field_k ^ -1)) {
            break L0;
          } else {
            L1: {
              if (-1 > (var4.field_e ^ -1)) {
                break L1;
              } else {
                if (0 >= ((fl) this).field_C[param1.field_F]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = var4.field_e << 204745058;
              var6 = var4.field_a << 1284017697;
              if (param1.field_q < var6) {
                var5 = var5 * param1.field_q / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((fl) this).field_C[param1.field_F] >> -1326977945);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_x & 511));
            var3 = var3 + (int)((double)var5 * var7);
            break L0;
          }
        }
        L3: {
          var5 = (int)((double)(256 * param1.field_v.field_m) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)c.field_l + 0.5);
          if (param0 == -822) {
            break L3;
          } else {
            k discarded$1 = ((fl) this).a();
            break L3;
          }
        }
        L4: {
          if (-2 < (var5 ^ -1)) {
            stackOut_12_0 = 1;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = var5;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        return stackIn_13_0;
    }

    private final void c(int param0, int param1, int param2) {
        ((fl) this).field_z[param0] = param2;
        if (param1 <= 113) {
            ((fl) this).field_U = false;
        }
        ((fl) this).field_Q[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    private final void b(int param0, int param1, int param2, byte param3) {
        if (param3 <= 71) {
            ((fl) this).field_Q = null;
        }
    }

    private final void c(int param0, int param1) {
        vk var3 = null;
        int var4 = wizardrun.field_H;
        if (param0 != 256) {
            return;
        }
        if (!((2 & ((fl) this).field_y[param1] ^ -1) == -1)) {
            var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 91);
            while (var3 != null) {
                if ((param1 ^ -1) == (var3.field_F ^ -1)) {
                    if (((fl) this).field_S[param1][var3.field_k] == null) {
                        if (var3.field_j < 0) {
                            var3.field_j = 0;
                        }
                    }
                }
                var3 = (vk) (Object) ((fl) this).field_A.field_p.d(param0 ^ 8448);
            }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        var3 = 240 & param0;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param0;
          var5 = param0 >> -866125432 & 127;
          var6 = 127 & param0 >> -2107653744;
          this.a(var5, var6, var4, (byte) -16);
          return;
        } else {
          L0: {
            if (144 != var3) {
              if ((var3 ^ -1) != -161) {
                if (176 == var3) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = (param0 & 32628) >> 1440553864;
                    var6 = (param0 & 8367717) >> -1837133072;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((fl) this).field_w[var4] = (var6 << 1764442766) + kl.b(((fl) this).field_w[var4], -2080769);
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 != (var5 ^ -1)) {
                      break L2;
                    } else {
                      ((fl) this).field_w[var4] = (var6 << 1372312199) + kl.b(((fl) this).field_w[var4], -16257);
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var5) {
                      break L3;
                    } else {
                      ((fl) this).field_C[var4] = kl.b(((fl) this).field_C[var4], -16257) + (var6 << 1024628071);
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -34) {
                      break L4;
                    } else {
                      ((fl) this).field_C[var4] = var6 + kl.b(-128, ((fl) this).field_C[var4]);
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 != 5) {
                      break L5;
                    } else {
                      ((fl) this).field_t[var4] = (var6 << 296128583) + kl.b(-16257, ((fl) this).field_t[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) == -38) {
                      ((fl) this).field_t[var4] = var6 + kl.b(-128, ((fl) this).field_t[var4]);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var5) {
                      ((fl) this).field_N[var4] = kl.b(-16257, ((fl) this).field_N[var4]) + (var6 << -351277465);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((var5 ^ -1) != -40) {
                      break L8;
                    } else {
                      ((fl) this).field_N[var4] = kl.b(-128, ((fl) this).field_N[var4]) + var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (10 == var5) {
                      ((fl) this).field_B[var4] = (var6 << -1639809817) + kl.b(((fl) this).field_B[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (42 != var5) {
                      break L10;
                    } else {
                      ((fl) this).field_B[var4] = kl.b(((fl) this).field_B[var4], -128) - -var6;
                      break L10;
                    }
                  }
                  L11: {
                    if (-12 == (var5 ^ -1)) {
                      ((fl) this).field_v[var4] = (var6 << -1988995545) + kl.b(-16257, ((fl) this).field_v[var4]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-44 != (var5 ^ -1)) {
                      break L12;
                    } else {
                      ((fl) this).field_v[var4] = kl.b(-128, ((fl) this).field_v[var4]) - -var6;
                      break L12;
                    }
                  }
                  L13: {
                    if (-65 != (var5 ^ -1)) {
                      break L13;
                    } else {
                      if (var6 < 64) {
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -2);
                        break L13;
                      } else {
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 1);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-66 != (var5 ^ -1)) {
                      break L14;
                    } else {
                      if (64 <= var6) {
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 2);
                        break L14;
                      } else {
                        this.c(256, var4);
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -3);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (99 != var5) {
                      break L15;
                    } else {
                      ((fl) this).field_L[var4] = (var6 << -2144810105) + kl.b(127, ((fl) this).field_L[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 == var5) {
                      ((fl) this).field_L[var4] = var6 + kl.b(16256, ((fl) this).field_L[var4]);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (101 == var5) {
                      ((fl) this).field_L[var4] = kl.b(127, ((fl) this).field_L[var4]) + (16384 + (var6 << -1007552633));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 100) {
                      break L18;
                    } else {
                      ((fl) this).field_L[var4] = kl.b(((fl) this).field_L[var4], 16256) + (16384 + var6);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 120) {
                      this.d(param1 + -12035, var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if ((var5 ^ -1) != -122) {
                      break L20;
                    } else {
                      this.a(var4, (byte) 21);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      this.g(var4, -1);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (6 != var5) {
                      break L22;
                    } else {
                      var7 = ((fl) this).field_L[var4];
                      if ((var7 ^ -1) == -16385) {
                        ((fl) this).field_D[var4] = (var6 << -1526149721) + kl.b(((fl) this).field_D[var4], -16257);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (38 == var5) {
                      var7 = ((fl) this).field_L[var4];
                      if ((var7 ^ -1) == -16385) {
                        ((fl) this).field_D[var4] = kl.b(((fl) this).field_D[var4], -128) + var6;
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (16 == var5) {
                      ((fl) this).field_o[var4] = (var6 << -524404729) + kl.b(((fl) this).field_o[var4], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((fl) this).field_o[var4] = kl.b(-128, ((fl) this).field_o[var4]) - -var6;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 81) {
                      if (-65 < (var6 ^ -1)) {
                        this.b(-1, var4);
                        ((fl) this).field_y[var4] = kl.b(((fl) this).field_y[var4], -5);
                        break L26;
                      } else {
                        ((fl) this).field_y[var4] = sd.a(((fl) this).field_y[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (17 != var5) {
                      break L27;
                    } else {
                      this.c(var4, param1 ^ 12154, (var6 << 107386279) + (((fl) this).field_z[var4] & -16257));
                      break L27;
                    }
                  }
                  if (-50 != (var5 ^ -1)) {
                    break L0;
                  } else {
                    this.c(var4, param1 ^ 12148, (-128 & ((fl) this).field_z[var4]) + var6);
                    return;
                  }
                } else {
                  if (192 != var3) {
                    L28: {
                      if (param1 == 12035) {
                        break L28;
                      } else {
                        ((fl) this).field_K = -72L;
                        break L28;
                      }
                    }
                    if (var3 != 208) {
                      if ((var3 ^ -1) != -225) {
                        var3 = param0 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, (byte) -78);
                          return;
                        }
                      } else {
                        var4 = param0 & 15;
                        var5 = (param0 >> 1498609032 & 127) + ((param0 & 8323516) >> -1328152663);
                        this.b(var4, var5, 38);
                        return;
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = 127 & param0 >> -236730232;
                      this.d(var5, 2, var4);
                      return;
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> -1094714680;
                    this.e(-129, var5 + ((fl) this).field_w[var4], var4);
                    return;
                  }
                }
              } else {
                var4 = 15 & param0;
                var5 = 127 & param0 >> -1698178264;
                var6 = (8323853 & param0) >> -31229776;
                this.b(var4, var6, var5, (byte) 118);
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = param0 >> -1610455896 & 127;
              var6 = param0 >> 444953232 & 127;
              if ((var6 ^ -1) >= -1) {
                this.a(var5, 64, var4, (byte) -16);
                return;
              } else {
                this.a(var4, var6, 0, var5);
                break L0;
              }
            }
          }
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = wizardrun.field_H;
            if (((fl) this).field_E.c()) {
              var2 = ((fl) this).field_r * ((fl) this).field_E.field_d / c.field_l;
              L2: while (true) {
                var3 = (long)var2 * (long)param0 + ((fl) this).field_K;
                if (-var3 + ((fl) this).field_n < 0L) {
                  var5 = (int)((-1L + ((long)var2 + ((fl) this).field_n + -((fl) this).field_K)) / (long)var2);
                  ((fl) this).field_K = ((fl) this).field_K + (long)var5 * (long)var2;
                  ((fl) this).field_A.a(var5);
                  param0 = param0 - var5;
                  this.c(false);
                  if (((fl) this).field_E.c()) {
                    continue L2;
                  } else {
                    ((fl) this).field_A.a(param0);
                    break L0;
                  }
                } else {
                  ((fl) this).field_K = var3;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((fl) this).field_A.a(param0);
          break L0;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 108) {
            return;
        }
        this.f(param0, param1, 1);
    }

    final synchronized void a(boolean param0, int param1, ji param2) {
        if (param1 >= -75) {
            ((fl) this).field_r = -65;
        }
        this.a(param0, true, 0, param2);
    }

    final synchronized void d(int param0) {
        this.a(true, true);
        if (param0 >= -20) {
            field_T = null;
        }
    }

    public static void c(int param0) {
        int var1 = -95 / ((param0 - -33) / 63);
        field_F = null;
        field_H = null;
        field_T = null;
    }

    private final void g(int param0, int param1) {
        int var4 = wizardrun.field_H;
        vk var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 110);
        while (var3 != null) {
            if (-1 >= (param0 ^ -1)) {
                // if_icmpeq L50
            } else {
                if ((var3.field_j ^ -1) > -1) {
                    ((fl) this).field_S[var3.field_F][var3.field_k] = null;
                    var3.field_j = 0;
                }
            }
            var3 = (vk) (Object) ((fl) this).field_A.field_p.d(param1 ^ -8193);
        }
        if (param1 != -1) {
            ((fl) this).field_y = null;
        }
    }

    private final synchronized void a(boolean param0, boolean param1, int param2, ji param3) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        this.a(true, param1);
        ((fl) this).field_E.a(param3.field_j);
        ((fl) this).field_U = param0 ? true : false;
        ((fl) this).field_K = (long)param2;
        int var5 = ((fl) this).field_E.d();
        for (var6 = 0; var5 > var6; var6++) {
            ((fl) this).field_E.a(var6);
            ((fl) this).field_E.b(var6);
            ((fl) this).field_E.c(var6);
        }
        ((fl) this).field_p = ((fl) this).field_E.b();
        ((fl) this).field_s = ((fl) this).field_E.field_h[((fl) this).field_p];
        ((fl) this).field_n = ((fl) this).field_E.e(((fl) this).field_s);
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((fl) this).field_E.e();
        ((fl) this).field_x = null;
        this.a(param1, (byte) -71);
        if (!param0) {
            Object var4 = null;
            ((fl) this).a((int[]) null, -66, -74);
        }
    }

    final boolean b(int param0, vk param1) {
        if (param0 != -1) {
            return false;
        }
        if (null == param1.field_w) {
            if (-1 >= (param1.field_j ^ -1)) {
                param1.a(false);
                if ((param1.field_t ^ -1) < -1) {
                    if (((fl) this).field_J[param1.field_F][param1.field_t] == param1) {
                        ((fl) this).field_J[param1.field_F][param1.field_t] = null;
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    final synchronized void a(int param0, int param1) {
        ((fl) this).field_m = param1;
        if (param0 != -1) {
            ((fl) this).field_J = null;
        }
    }

    private final void f(int param0, int param1, int param2) {
        ((fl) this).field_O[param1] = param0;
        ((fl) this).field_w[param1] = kl.b(param0, -128);
        if (param2 != 1) {
            ((fl) this).field_o = null;
        }
        this.e(param2 ^ -130, param0, param1);
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (-1 < (param0 ^ -1)) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.a(param0, (byte) 21);
              param0++;
              continue L0;
            }
          }
        } else {
          ((fl) this).field_N[param0] = 12800;
          ((fl) this).field_B[param0] = 8192;
          if (param1 == 21) {
            ((fl) this).field_v[param0] = 16383;
            ((fl) this).field_I[param0] = 8192;
            ((fl) this).field_C[param0] = 0;
            ((fl) this).field_t[param0] = 8192;
            this.c(256, param0);
            this.b(-1, param0);
            ((fl) this).field_y[param0] = 0;
            ((fl) this).field_L[param0] = 32767;
            ((fl) this).field_D[param0] = 256;
            ((fl) this).field_o[param0] = 0;
            this.c(param0, param1 + 103, 8192);
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, int[] param1, vk param2, int param3, int param4) {
        int var6 = 0;
        q var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = wizardrun.field_H;
          param2.field_E = c.field_l / 100;
          if (-1 < (param2.field_j ^ -1)) {
            break L0;
          } else {
            L1: {
              if (null == param2.field_w) {
                break L1;
              } else {
                if (!param2.field_w.g()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param2.a(0);
              param2.a(false);
              if (0 >= param2.field_t) {
                break L2;
              } else {
                if (param2 != ((fl) this).field_J[param2.field_F][param2.field_t]) {
                  break L2;
                } else {
                  ((fl) this).field_J[param2.field_F][param2.field_t] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param2.field_y;
          if (-1 <= (var6 ^ -1)) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((fl) this).field_t[param2.field_F]) + 0.5);
              if (-1 < (var6 ^ -1)) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param2.field_y = var6;
            break L3;
          }
        }
        L5: {
          param2.field_w.d(this.a(-822, param2));
          var7 = param2.field_i;
          param2.field_q = param2.field_q + 1;
          param2.field_x = param2.field_x + var7.field_k;
          var8 = 0;
          var9 = (double)((-60 + param2.field_k << -450777240) + (param2.field_I * param2.field_y >> -180829524)) * 0.000005086263020833333;
          if ((var7.field_h ^ -1) < -1) {
            L6: {
              if (-1 <= (var7.field_d ^ -1)) {
                param2.field_m = param2.field_m + 128;
                break L6;
              } else {
                param2.field_m = param2.field_m + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
                break L6;
              }
            }
            if (-819201 < (var7.field_h * param2.field_m ^ -1)) {
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
          if (null != var7.field_f) {
            L8: {
              if (-1 > (var7.field_i ^ -1)) {
                param2.field_K = param2.field_K + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_i));
                break L8;
              } else {
                param2.field_K = param2.field_K + 128;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (param2.field_n >= var7.field_f.length + -2) {
                  break L10;
                } else {
                  if ((255 & var7.field_f[2 + param2.field_n]) << -897535288 >= param2.field_K) {
                    break L10;
                  } else {
                    param2.field_n = param2.field_n + 2;
                    continue L9;
                  }
                }
              }
              if (var7.field_f.length - 2 != param2.field_n) {
                break L7;
              } else {
                if (-1 != (var7.field_f[param2.field_n - -1] ^ -1)) {
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
          if (param2.field_j < param0) {
            break L11;
          } else {
            if (null == var7.field_c) {
              break L11;
            } else {
              if ((((fl) this).field_y[param2.field_F] & 1) == 0) {
                L12: {
                  if (-1 < (param2.field_t ^ -1)) {
                    break L12;
                  } else {
                    if (param2 != ((fl) this).field_J[param2.field_F][param2.field_t]) {
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  if (0 < var7.field_j) {
                    param2.field_j = param2.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                    break L13;
                  } else {
                    param2.field_j = param2.field_j + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if ((var7.field_c.length + -2 ^ -1) >= (param2.field_s ^ -1)) {
                      break L15;
                    } else {
                      if (param2.field_j <= (var7.field_c[2 + param2.field_s] << 1819065864 & 65280)) {
                        break L15;
                      } else {
                        param2.field_s = param2.field_s + 2;
                        continue L14;
                      }
                    }
                  }
                  if ((param2.field_s ^ -1) == (-2 + var7.field_c.length ^ -1)) {
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
            param2.field_w.f(param2.field_E);
            if (param1 == null) {
              param2.field_w.a(param3);
              break L16;
            } else {
              param2.field_w.a(param1, param4, param3);
              break L16;
            }
          }
          L17: {
            if (!param2.field_w.i()) {
              break L17;
            } else {
              ((fl) this).field_A.field_o.a((k) (Object) param2.field_w);
              break L17;
            }
          }
          L18: {
            param2.a(0);
            if (-1 < (param2.field_j ^ -1)) {
              break L18;
            } else {
              param2.a(false);
              if ((param2.field_t ^ -1) >= -1) {
                break L18;
              } else {
                if (((fl) this).field_J[param2.field_F][param2.field_t] != param2) {
                  break L18;
                } else {
                  ((fl) this).field_J[param2.field_F][param2.field_t] = null;
                  break L18;
                }
              }
            }
          }
          return true;
        } else {
          param2.field_w.a(param2.field_E, this.a(param2, -109), this.a(param2, (byte) 59));
          return false;
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = wizardrun.field_H;
          if (param2 >= 0) {
            ((fl) this).field_R[param2] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L0;
              } else {
                ((fl) this).field_R[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param1 > 99) {
            break L2;
          } else {
            field_T = null;
            break L2;
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    final static void f(int param0, int param1) {
        int var3 = wizardrun.field_H;
        wizardrun.a(true, (byte) 11, param0, lg.field_d, dg.field_d, rb.field_e, 0);
        int var2 = 0;
        if (param1 != 16) {
            return;
        }
        while ((lg.field_d ^ -1) < (var2 ^ -1)) {
            sj.field_m[param0 + var2] = var2;
            var2++;
        }
        wizardrun.a(false, (byte) 11, param0 - -param0, lg.field_d + param0, gf.field_W, dj.field_b, param0);
        if (!((lg.field_d ^ -1) >= (param0 ^ -1))) {
            lg.field_d = param0;
        }
    }

    private final int a(vk param0, int param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3 = 123 / ((49 - param1) / 44);
        if (!(((fl) this).field_R[param0.field_F] != 0)) {
            return 0;
        }
        q var4 = param0.field_i;
        int var5 = 4096 + ((fl) this).field_N[param0.field_F] * ((fl) this).field_v[param0.field_F] >> 293544461;
        var5 = var5 * var5 - -16384 >> 687053679;
        var5 = 16384 + param0.field_D * var5 >> 531806927;
        var5 = 128 + ((fl) this).field_m * var5 >> -1958504216;
        var5 = 128 + var5 * ((fl) this).field_R[param0.field_F] >> -704821432;
        if ((var4.field_h ^ -1) < -1) {
            var5 = (int)((double)var5 * Math.pow(0.5, (double)var4.field_h * ((double)param0.field_m * 0.00001953125)) + 0.5);
        }
        if (null != var4.field_f) {
            var6 = param0.field_K;
            var7 = var4.field_f[1 + param0.field_n];
            if ((param0.field_n ^ -1) > (-2 + var4.field_f.length ^ -1)) {
                var8 = (var4.field_f[param0.field_n] & 255) << 153508648;
                var9 = (255 & var4.field_f[param0.field_n - -2]) << 594838920;
                var7 = var7 + (-var7 + var4.field_f[param0.field_n - -3]) * (var6 - var8) / (-var8 + var9);
            }
            var5 = var5 * var7 + 32 >> 954150214;
        }
        if (-1 > (param0.field_j ^ -1)) {
            if (!(null == var4.field_c)) {
                var6 = param0.field_j;
                var7 = var4.field_c[1 + param0.field_s];
                if (!((var4.field_c.length + -2 ^ -1) >= (param0.field_s ^ -1))) {
                    var8 = var4.field_c[param0.field_s] << -552342264 & 65280;
                    var9 = (var4.field_c[param0.field_s - -2] & 255) << 370316840;
                    var7 = var7 + (var6 - var8) * (var4.field_c[3 + param0.field_s] - var7) / (-var8 + var9);
                }
                var5 = var7 * var5 - -32 >> -469982938;
            }
        }
        return var5;
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        vk var6 = null;
        int var7 = 0;
        vk var8 = null;
        var7 = wizardrun.field_H;
        var8 = ((fl) this).field_S[param2][param0];
        if (var8 == null) {
          return;
        } else {
          L0: {
            ((fl) this).field_S[param2][param0] = null;
            if ((((fl) this).field_y[param2] & 2 ^ -1) == -1) {
              var8.field_j = 0;
              break L0;
            } else {
              var6 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 84);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if ((var8.field_F ^ -1) != (var6.field_F ^ -1)) {
                      break L2;
                    } else {
                      if (-1 >= (var6.field_j ^ -1)) {
                        break L2;
                      } else {
                        if (var6 != var8) {
                          var8.field_j = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
                  continue L1;
                }
              }
            }
          }
          L3: {
            if (param3 == -16) {
              break L3;
            } else {
              ((fl) this).field_P = null;
              break L3;
            }
          }
          return;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = wizardrun.field_H;
            if (((fl) this).field_E.c()) {
              var4 = ((fl) this).field_r * ((fl) this).field_E.field_d / c.field_l;
              L2: while (true) {
                var5 = ((fl) this).field_K + (long)param2 * (long)var4;
                if (((fl) this).field_n + -var5 < 0L) {
                  var7 = (int)((-1L + (long)var4 + (-((fl) this).field_K + ((fl) this).field_n)) / (long)var4);
                  ((fl) this).field_K = ((fl) this).field_K + (long)var7 * (long)var4;
                  ((fl) this).field_A.a(param0, param1, var7);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  this.c(false);
                  if (((fl) this).field_E.c()) {
                    continue L2;
                  } else {
                    ((fl) this).field_A.a(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((fl) this).field_K = var5;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((fl) this).field_A.a(param0, param1, param2);
          break L0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        ((fl) this).field_I[param0] = param1;
        if (param2 != 38) {
            this.d(11, -69, 19);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        if (!param0) {
            this.g(-1, -1);
        } else {
            this.d(0, -1);
        }
        this.a(-1, (byte) 21);
        for (var3 = 0; 16 > var3; var3++) {
            ((fl) this).field_P[var3] = ((fl) this).field_O[var3];
        }
        int var5 = 0;
        var3 = var5;
        if (param1 > -62) {
            this.f(-85, 122, -57);
        }
        while (16 > var5) {
            ((fl) this).field_w[var5] = kl.b(((fl) this).field_O[var5], -128);
            var5++;
        }
    }

    private final void b(int param0, int param1) {
        vk var3 = null;
        int var4 = wizardrun.field_H;
        if (!(param0 == (4 & ((fl) this).field_y[param1] ^ -1))) {
            var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 55);
            while (var3 != null) {
                if (!((param1 ^ -1) != (var3.field_F ^ -1))) {
                    var3.field_H = 0;
                }
                var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
            }
        }
    }

    final synchronized k a() {
        return (k) (Object) ((fl) this).field_A;
    }

    private final void d(int param0, int param1) {
        int var4 = wizardrun.field_H;
        if (param0 != 0) {
            return;
        }
        vk var3 = (vk) (Object) ((fl) this).field_A.field_p.b((byte) 92);
        while (var3 != null) {
            if ((param1 ^ -1) <= -1) {
                // if_icmpeq L55
            } else {
                if (!(var3.field_w == null)) {
                    var3.field_w.f(c.field_l / 100);
                    if (!(!var3.field_w.i())) {
                        ((fl) this).field_A.field_o.a((k) (Object) var3.field_w);
                    }
                    var3.a(0);
                }
                if (var3.field_j < 0) {
                    ((fl) this).field_S[var3.field_F][var3.field_k] = null;
                }
                var3.a(false);
            }
            var3 = (vk) (Object) ((fl) this).field_A.field_p.d(8192);
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != 2) {
            fl.f(67, -78);
        }
    }

    public fl() {
        ((fl) this).field_r = 1000000;
        ((fl) this).field_D = new int[16];
        ((fl) this).field_R = new int[16];
        ((fl) this).field_Q = new int[16];
        ((fl) this).field_w = new int[16];
        ((fl) this).field_N = new int[16];
        ((fl) this).field_y = new int[16];
        ((fl) this).field_B = new int[16];
        ((fl) this).field_t = new int[16];
        ((fl) this).field_P = new int[16];
        ((fl) this).field_S = new vk[16][128];
        ((fl) this).field_I = new int[16];
        ((fl) this).field_C = new int[16];
        ((fl) this).field_v = new int[16];
        ((fl) this).field_z = new int[16];
        ((fl) this).field_O = new int[16];
        ((fl) this).field_J = new vk[16][128];
        ((fl) this).field_m = 256;
        ((fl) this).field_L = new int[16];
        ((fl) this).field_o = new int[16];
        ((fl) this).field_E = new wf();
        ((fl) this).field_A = new he((fl) this);
        ((fl) this).field_G = new ab(128);
        this.a(256, 114, -1);
        this.a(true, (byte) -67);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        sk.a(16062, 50);
    }
}
