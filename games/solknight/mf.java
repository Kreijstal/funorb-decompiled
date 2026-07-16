/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends ej {
    private int[] field_r;
    private int[] field_T;
    int[] field_z;
    int[] field_J;
    static String field_x;
    private int[] field_w;
    static String field_l;
    static String field_K;
    private hg[][] field_p;
    private int[] field_W;
    int[] field_U;
    private int[] field_B;
    static int field_A;
    private int[] field_S;
    private int[] field_o;
    private int field_q;
    static String field_n;
    private hg[][] field_O;
    private int field_M;
    private oi field_H;
    private int[] field_N;
    private int[] field_I;
    private int[] field_t;
    private int[] field_v;
    static String[] field_y;
    private int[] field_P;
    static String field_F;
    private int[] field_D;
    private qd field_C;
    private long field_E;
    private int field_u;
    private int field_G;
    private boolean field_R;
    private lh field_Q;
    private long field_s;
    private int field_L;
    private rl field_m;
    private boolean field_V;

    final synchronized boolean a(int param0, rl param1, me param2, da param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        ee var8_ref_ee = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        fc var12 = null;
        fc var13 = null;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          param1.a();
          var6 = 1;
          var7 = null;
          if (param0 > 0) {
            var7 = (Object) (Object) new int[]{param0};
            break L0;
          } else {
            break L0;
          }
        }
        var8_ref_ee = (ee) (Object) param1.field_h.b(0);
        L1: while (true) {
          if (var8_ref_ee == null) {
            L2: {
              var8 = 25 / ((param4 - -49) / 43);
              if (var6 != 0) {
                param1.b();
                break L2;
              } else {
                break L2;
              }
            }
            return var6 != 0;
          } else {
            L3: {
              var9 = (int)var8_ref_ee.field_g;
              var12 = (fc) (Object) ((mf) this).field_C.a(true, (long)var9);
              if (var12 == null) {
                var13 = oa.a(-1803587230, var9, param3);
                if (var13 != null) {
                  ((mf) this).field_C.a((byte) 122, (gg) (Object) var13, (long)var9);
                  if (var13.a(param2, (int[]) var7, var8_ref_ee.field_k, -124)) {
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
                if (var12.a(param2, (int[]) var7, var8_ref_ee.field_k, -124)) {
                  break L3;
                } else {
                  var6 = 0;
                  var8_ref_ee = (ee) (Object) param1.field_h.c((byte) 118);
                  continue L1;
                }
              }
            }
            var8_ref_ee = (ee) (Object) param1.field_h.c((byte) 118);
            continue L1;
          }
        }
    }

    final boolean a(int param0, int[] param1, int param2, int param3, hg param4) {
        int var6 = 0;
        g var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          param4.field_t = gj.field_s / param3;
          if (param4.field_k < 0) {
            break L0;
          } else {
            L1: {
              if (null == param4.field_w) {
                break L1;
              } else {
                if (param4.field_w.i()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param4.a((byte) 104);
              param4.c(10);
              if (0 >= param4.field_m) {
                break L2;
              } else {
                if (param4 == ((mf) this).field_O[param4.field_z][param4.field_m]) {
                  ((mf) this).field_O[param4.field_z][param4.field_m] = null;
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
          var6 = param4.field_n;
          if (0 < var6) {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((mf) this).field_S[param4.field_z]) + 0.5);
              if (0 <= var6) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param4.field_n = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param4.field_w.f(this.a(param4, 1));
          var7 = param4.field_D;
          param4.field_q = param4.field_q + var7.field_m;
          param4.field_r = param4.field_r + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param4.field_o - 60 << 694330344) + (param4.field_n * param4.field_l >> -1900729332));
          if (0 >= var7.field_c) {
            break L5;
          } else {
            L6: {
              if (-1 > (var7.field_g ^ -1)) {
                param4.field_v = param4.field_v + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                break L6;
              } else {
                param4.field_v = param4.field_v + 128;
                break L6;
              }
            }
            if (-819201 < (var7.field_c * param4.field_v ^ -1)) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          }
        }
        L7: {
          if (null == var7.field_j) {
            break L7;
          } else {
            L8: {
              if ((var7.field_b ^ -1) >= -1) {
                param4.field_j = param4.field_j + 128;
                break L8;
              } else {
                param4.field_j = param4.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_b) * 128.0);
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (var7.field_j.length - 2 <= param4.field_s) {
                  break L10;
                } else {
                  if (param4.field_j <= (var7.field_j[param4.field_s + 2] & 255) << -1024409976) {
                    break L10;
                  } else {
                    param4.field_s = param4.field_s + 2;
                    continue L9;
                  }
                }
              }
              if (param4.field_s != -2 + var7.field_j.length) {
                break L7;
              } else {
                if (var7.field_j[1 + param4.field_s] != 0) {
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
          if (param4.field_k < 0) {
            break L11;
          } else {
            if (null == var7.field_i) {
              break L11;
            } else {
              if ((1 & ((mf) this).field_U[param4.field_z]) != 0) {
                break L11;
              } else {
                L12: {
                  if (0 > param4.field_m) {
                    break L12;
                  } else {
                    if (param4 == ((mf) this).field_O[param4.field_z][param4.field_m]) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0 >= var7.field_h) {
                    param4.field_k = param4.field_k + 128;
                    break L13;
                  } else {
                    param4.field_k = param4.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_h * var9));
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (-2 + var7.field_i.length <= param4.field_A) {
                      break L15;
                    } else {
                      if ((65280 & var7.field_i[2 + param4.field_A] << -1658961432) >= param4.field_k) {
                        break L15;
                      } else {
                        param4.field_A = param4.field_A + 2;
                        continue L14;
                      }
                    }
                  }
                  if (var7.field_i.length + -2 != param4.field_A) {
                    break L11;
                  } else {
                    var8 = 1;
                    break L11;
                  }
                }
              }
            }
          }
        }
        if (var8 != 0) {
          L16: {
            param4.field_w.e(param4.field_t);
            if (param1 == null) {
              param4.field_w.a(param2);
              break L16;
            } else {
              param4.field_w.a(param1, param0, param2);
              break L16;
            }
          }
          L17: {
            if (!param4.field_w.h()) {
              break L17;
            } else {
              ((mf) this).field_Q.field_r.a((ej) (Object) param4.field_w);
              break L17;
            }
          }
          L18: {
            param4.a((byte) 112);
            if ((param4.field_k ^ -1) > -1) {
              break L18;
            } else {
              param4.c(10);
              if ((param4.field_m ^ -1) >= -1) {
                break L18;
              } else {
                if (((mf) this).field_O[param4.field_z][param4.field_m] != param4) {
                  break L18;
                } else {
                  ((mf) this).field_O[param4.field_z][param4.field_m] = null;
                  break L18;
                }
              }
            }
          }
          return true;
        } else {
          param4.field_w.a(param4.field_t, this.a(param4, (byte) -70), this.a(127, param4));
          return false;
        }
    }

    private final void a(int param0, byte param1) {
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var4 = 102 / ((param1 - 22) / 56);
        var3 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 == var3.field_z) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (null == var3.field_w) {
                  break L3;
                } else {
                  L4: {
                    var3.field_w.e(gj.field_s / 100);
                    if (var3.field_w.h()) {
                      ((mf) this).field_Q.field_r.a((ej) (Object) var3.field_w);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.a((byte) 102);
                  break L3;
                }
              }
              L5: {
                if (-1 < (var3.field_k ^ -1)) {
                  ((mf) this).field_p[var3.field_z][var3.field_o] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.c(10);
              break L1;
            }
            var3 = (hg) (Object) ((mf) this).field_Q.field_m.b(-18);
            continue L0;
          }
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if ((param1 ^ -1) <= -1) {
            ((mf) this).field_D[param1] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((mf) this).field_D[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param2 == -129) {
            break L2;
          } else {
            ((mf) this).field_Q = null;
            break L2;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 67 / ((10 - param0) / 61);
    }

    private final void c(int param0, int param1, int param2) {
        ((mf) this).field_N[param2] = param0;
        if (param1 != 17208) {
            ((mf) this).field_v = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        hg var5 = null;
        sh var6 = null;
        int var6_int = 0;
        hg var7 = null;
        hg var8 = null;
        int var9 = 0;
        fc var10 = null;
        fc var11 = null;
        fc var12 = null;
        Object stackIn_17_0 = null;
        hg stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        hg stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        hg stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        Object stackOut_16_0 = null;
        hg stackOut_16_1 = null;
        Object stackOut_18_0 = null;
        hg stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        hg stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        L0: {
          var9 = SolKnight.field_L ? 1 : 0;
          this.b(param1, param0, 64, 127);
          if (-1 == (((mf) this).field_U[param0] & 2 ^ -1)) {
            break L0;
          } else {
            var5 = (hg) (Object) ((mf) this).field_Q.field_m.c((byte) 96);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_z) {
                    break L2;
                  } else {
                    if (0 > var5.field_k) {
                      ((mf) this).field_p[param0][var5.field_o] = null;
                      ((mf) this).field_p[param0][param1] = var5;
                      var6_int = (var5.field_l * var5.field_n >> -596825972) + var5.field_h;
                      var5.field_h = var5.field_h + (param1 - var5.field_o << -2146203960);
                      var5.field_n = 4096;
                      var5.field_o = param1;
                      var5.field_l = -var5.field_h + var6_int;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (hg) (Object) ((mf) this).field_Q.field_m.b((byte) 94);
                continue L1;
              }
            }
          }
        }
        var10 = (fc) (Object) ((mf) this).field_C.a(true, (long)((mf) this).field_v[param0]);
        var11 = var10;
        var12 = var11;
        if (var11 != null) {
          var6 = var10.field_q[param1];
          if (var6 != null) {
            L3: {
              var7 = new hg();
              var7.field_z = param0;
              var7.field_p = var11;
              var7.field_u = var6;
              var7.field_D = var10.field_i[param1];
              if (param3 == 26879) {
                break L3;
              } else {
                this.c(12, -5);
                break L3;
              }
            }
            L4: {
              var7.field_m = var10.field_h[param1];
              var7.field_o = param1;
              var7.field_i = param2 * param2 * (var10.field_j * var10.field_p[param1]) + 1024 >> 1469388395;
              var7.field_x = 255 & var10.field_r[param1];
              var7.field_h = -(32767 & var10.field_s[param1]) + (param1 << 1485258312);
              var7.field_v = 0;
              var7.field_s = 0;
              var7.field_A = 0;
              var7.field_k = -1;
              var7.field_j = 0;
              if (-1 != (((mf) this).field_z[param0] ^ -1)) {
                L5: {
                  var7.field_w = qi.a(var6, this.a(var7, 1), 0, this.a(127, var7));
                  stackOut_16_0 = this;
                  stackOut_16_1 = (hg) var7;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if ((var12.field_s[param1] ^ -1) <= -1) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (hg) (Object) stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L5;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = (hg) (Object) stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L5;
                  }
                }
                ((mf) this).a(stackIn_19_1, stackIn_19_2 != 0, false);
                break L4;
              } else {
                var7.field_w = qi.a(var6, this.a(var7, 1), this.a(var7, (byte) -70), this.a(127, var7));
                break L4;
              }
            }
            L6: {
              if (0 > var12.field_s[param1]) {
                var7.field_w.d(-1);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((var7.field_m ^ -1) > -1) {
                break L7;
              } else {
                L8: {
                  var8 = ((mf) this).field_O[param0][var7.field_m];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if ((var8.field_k ^ -1) <= -1) {
                      break L8;
                    } else {
                      ((mf) this).field_p[param0][var8.field_o] = null;
                      var8.field_k = 0;
                      break L8;
                    }
                  }
                }
                ((mf) this).field_O[param0][var7.field_m] = var7;
                break L7;
              }
            }
            ((mf) this).field_Q.field_m.a((gg) (Object) var7, -7044);
            ((mf) this).field_p[param0][param1] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          if (!((mf) this).field_H.d()) {
            break L0;
          } else {
            var4 = ((mf) this).field_H.field_c * ((mf) this).field_M / gj.field_s;
            L1: while (true) {
              var5 = (long)var4 * (long)param2 + ((mf) this).field_s;
              if ((-var5 + ((mf) this).field_E ^ -1L) <= -1L) {
                ((mf) this).field_s = var5;
                break L0;
              } else {
                var7 = (int)((-1L + ((long)var4 + (-((mf) this).field_s + ((mf) this).field_E))) / (long)var4);
                ((mf) this).field_s = ((mf) this).field_s + (long)var7 * (long)var4;
                ((mf) this).field_Q.a(param0, param1, var7);
                this.c(false);
                param1 = param1 + var7;
                param2 = param2 - var7;
                if (!((mf) this).field_H.d()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((mf) this).field_Q.a(param0, param1, param2);
    }

    final static void e(int param0) {
        al var1 = (al) (Object) cj.field_a.e((byte) 86);
        if (param0 != 4096) {
            mf.e(105);
        }
        if (var1 == null) {
            throw new IllegalStateException();
        }
        mi.a(var1.field_h, var1.field_k, var1.field_o);
        mi.f(var1.field_l, var1.field_j, var1.field_i, var1.field_m);
        var1.field_h = null;
        uc.field_a.a((gg) (Object) var1, -7044);
    }

    public static void g(int param0) {
        field_x = null;
        field_F = null;
        field_l = null;
        field_K = null;
        field_y = null;
        int var1 = 106 / ((27 - param0) / 53);
        field_n = null;
    }

    final static void f(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        var1 = (Object) (Object) i.field_J;
        synchronized (var1) {
          L0: {
            if (param0 == -11214) {
              L1: {
                pf.field_a = si.field_B;
                lf.field_c = lf.field_c + 1;
                if (0 <= fg.field_b) {
                  L2: while (true) {
                    if (qd.field_d == fg.field_b) {
                      break L1;
                    } else {
                      var2 = ci.field_qb[qd.field_d];
                      qd.field_d = 127 & qd.field_d + 1;
                      if (-1 < (var2 ^ -1)) {
                        fh.field_d[var2 ^ -1] = false;
                        continue L2;
                      } else {
                        fh.field_d[var2] = true;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var2 = 0;
                  L3: while (true) {
                    if (-113 >= (var2 ^ -1)) {
                      fg.field_b = qd.field_d;
                      break L1;
                    } else {
                      fh.field_d[var2] = false;
                      var2++;
                      continue L3;
                    }
                  }
                }
              }
              si.field_B = rh.field_e;
              break L0;
            } else {
              return;
            }
          }
        }
    }

    private final int a(int param0, hg param1) {
        if (param0 != 127) {
            mf.g(51);
        }
        int var3 = ((mf) this).field_w[param1.field_z];
        if (-8193 >= (var3 ^ -1)) {
            return 16384 - ((128 - param1.field_x) * (-var3 + 16384) + 32 >> 876893478);
        }
        return var3 * param1.field_x - -32 >> -103470138;
    }

    private final void b(byte param0, int param1, int param2) {
        ((mf) this).field_P[param2] = param1;
        if (param0 >= -113) {
            boolean discarded$0 = ((mf) this).d(58);
        }
        ((mf) this).field_B[param2] = fi.a(param1, -128);
        this.e(param2, 28152, param1);
    }

    final void a(hg param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (!param2) {
            break L0;
          } else {
            ((mf) this).field_t = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param0.field_u.field_i.length;
            if (!param1) {
              break L2;
            } else {
              if (param0.field_u.field_k) {
                var6 = -param0.field_u.field_m + (var4 - -var4);
                var5 = (int)((long)var6 * (long)((mf) this).field_z[param0.field_z] >> -1639841658);
                var4 = var4 << 8;
                if (var4 <= var5) {
                  param0.field_w.b(true);
                  var5 = -1 + (var4 - -var4 + -var5);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L2;
              }
            }
          }
          var5 = (int)((long)var4 * (long)((mf) this).field_z[param0.field_z] >> 651707014);
          break L1;
        }
        param0.field_w.g(var5);
    }

    final synchronized void b(int param0, byte param1) {
        ((mf) this).field_M = param0;
        int var3 = 40 % ((-48 - param1) / 40);
    }

    private final int a(hg param0, int param1) {
        int var3 = 0;
        g var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            ((mf) this).field_z = null;
            break L0;
          }
        }
        L1: {
          var3 = param0.field_h - -(param0.field_n * param0.field_l >> 2085248972);
          var3 = var3 + ((-8192 + ((mf) this).field_N[param0.field_z]) * ((mf) this).field_t[param0.field_z] >> -523377236);
          var4 = param0.field_D;
          if ((var4.field_m ^ -1) >= -1) {
            break L1;
          } else {
            L2: {
              if ((var4.field_d ^ -1) < -1) {
                break L2;
              } else {
                if (0 < ((mf) this).field_W[param0.field_z]) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var5 = var4.field_d << -1357218462;
              var6 = var4.field_f << -1089002559;
              if (var6 <= param0.field_r) {
                break L3;
              } else {
                var5 = var5 * param0.field_r / var6;
                break L3;
              }
            }
            var5 = var5 + (((mf) this).field_W[param0.field_z] >> -981226681);
            var7 = Math.sin((double)(param0.field_q & 511) * 0.01227184630308513);
            var3 = var3 + (int)((double)var5 * var7);
            break L1;
          }
        }
        L4: {
          var5 = (int)((double)(param0.field_u.field_j * 256) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)gj.field_s + 0.5);
          if (1 > var5) {
            stackOut_11_0 = 1;
            stackIn_12_0 = stackOut_11_0;
            break L4;
          } else {
            stackOut_10_0 = var5;
            stackIn_12_0 = stackOut_10_0;
            break L4;
          }
        }
        return stackIn_12_0;
    }

    final synchronized void b(boolean param0) {
        int var3 = SolKnight.field_L ? 1 : 0;
        if (!param0) {
            return;
        }
        fc var4 = (fc) (Object) ((mf) this).field_C.b(0);
        while (var4 != null) {
            var4.a(6890);
            var4 = (fc) (Object) ((mf) this).field_C.c((byte) 122);
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((mf) this).field_T[param2] = param1;
        if (param0 != 13127) {
            field_K = null;
        }
        ((mf) this).field_J[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (param1 != 28152) {
            ((mf) this).field_P = null;
        }
        if (((mf) this).field_v[param0] != param2) {
            ((mf) this).field_v[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                ((mf) this).field_O[param0][var4] = null;
            }
        }
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        hg var4 = null;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          var3 = 31 / ((param0 - -63) / 39);
          if ((((mf) this).field_U[param1] & 2) != 0) {
            var4 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L2: {
                  if (param1 != var4.field_z) {
                    break L2;
                  } else {
                    if (null == ((mf) this).field_p[param1][var4.field_o]) {
                      if (0 <= var4.field_k) {
                        break L2;
                      } else {
                        var4.field_k = 0;
                        break L2;
                      }
                    } else {
                      var4 = (hg) (Object) ((mf) this).field_Q.field_m.b(-50);
                      continue L1;
                    }
                  }
                }
                var4 = (hg) (Object) ((mf) this).field_Q.field_m.b(-50);
                continue L1;
              }
            }
          } else {
            break L0;
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
        var8 = SolKnight.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param0;
          var5 = (32549 & param0) >> 622751528;
          var6 = (8355990 & param0) >> -550926480;
          this.b(var5, var4, var6, 120);
          return;
        } else {
          if (144 != var3) {
            if (160 == var3) {
              var4 = param0 & 15;
              var5 = (param0 & 32598) >> 1742750312;
              var6 = (param0 & 8351591) >> -2067877232;
              this.c(var4, var5, var6, -93);
              return;
            } else {
              if (-177 != (var3 ^ -1)) {
                if ((var3 ^ -1) == -193) {
                  var4 = param0 & 15;
                  var5 = (32680 & param0) >> 1400204744;
                  this.e(var4, 28152, var5 + ((mf) this).field_B[var4]);
                  return;
                } else {
                  if (-209 == (var3 ^ -1)) {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 1168996424;
                    this.a((byte) -117, var4, var5);
                    return;
                  } else {
                    if (var3 == 224) {
                      var4 = param0 & 15;
                      var5 = (param0 >> -817242903 & 16256) - -(127 & param0 >> 1319458312);
                      this.c(var5, 17208, var4);
                      return;
                    } else {
                      if (param1 >= 73) {
                        var3 = param0 & 255;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(128, true);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L0: {
                  var4 = param0 & 15;
                  var5 = 127 & param0 >> 46920232;
                  var6 = param0 >> 866622768 & 127;
                  if (var5 == 0) {
                    ((mf) this).field_B[var4] = fi.a(-2080769, ((mf) this).field_B[var4]) - -(var6 << -1874145554);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if ((var5 ^ -1) == -33) {
                    ((mf) this).field_B[var4] = (var6 << -1139208953) + fi.a(((mf) this).field_B[var4], -16257);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (-2 != (var5 ^ -1)) {
                    break L2;
                  } else {
                    ((mf) this).field_W[var4] = (var6 << 1427664199) + fi.a(-16257, ((mf) this).field_W[var4]);
                    break L2;
                  }
                }
                L3: {
                  if (33 == var5) {
                    ((mf) this).field_W[var4] = fi.a(((mf) this).field_W[var4], -128) + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((mf) this).field_S[var4] = fi.a(-16257, ((mf) this).field_S[var4]) - -(var6 << -206033369);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((var5 ^ -1) == -38) {
                    ((mf) this).field_S[var4] = fi.a(((mf) this).field_S[var4], -128) - -var6;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-8 != (var5 ^ -1)) {
                    break L6;
                  } else {
                    ((mf) this).field_I[var4] = (var6 << 1349609543) + fi.a(((mf) this).field_I[var4], -16257);
                    break L6;
                  }
                }
                L7: {
                  if ((var5 ^ -1) == -40) {
                    ((mf) this).field_I[var4] = fi.a(-128, ((mf) this).field_I[var4]) + var6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 != 10) {
                    break L8;
                  } else {
                    ((mf) this).field_w[var4] = fi.a(((mf) this).field_w[var4], -16257) + (var6 << 470903239);
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) != -43) {
                    break L9;
                  } else {
                    ((mf) this).field_w[var4] = var6 + fi.a(((mf) this).field_w[var4], -128);
                    break L9;
                  }
                }
                L10: {
                  if (11 != var5) {
                    break L10;
                  } else {
                    ((mf) this).field_r[var4] = (var6 << 1789624551) + fi.a(((mf) this).field_r[var4], -16257);
                    break L10;
                  }
                }
                L11: {
                  if ((var5 ^ -1) == -44) {
                    ((mf) this).field_r[var4] = fi.a(((mf) this).field_r[var4], -128) + var6;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (64 == var5) {
                    if (var6 < 64) {
                      ((mf) this).field_U[var4] = fi.a(((mf) this).field_U[var4], -2);
                      break L12;
                    } else {
                      ((mf) this).field_U[var4] = qk.a(((mf) this).field_U[var4], 1);
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
                    if (64 > var6) {
                      this.g(40, var4);
                      ((mf) this).field_U[var4] = fi.a(((mf) this).field_U[var4], -3);
                      break L13;
                    } else {
                      ((mf) this).field_U[var4] = qk.a(((mf) this).field_U[var4], 2);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (99 == var5) {
                    ((mf) this).field_o[var4] = fi.a(((mf) this).field_o[var4], 127) - -(var6 << 346542407);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (-99 == (var5 ^ -1)) {
                    ((mf) this).field_o[var4] = fi.a(((mf) this).field_o[var4], 16256) - -var6;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (101 == var5) {
                    ((mf) this).field_o[var4] = (var6 << 1735843559) + (16384 + fi.a(127, ((mf) this).field_o[var4]));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (100 == var5) {
                    ((mf) this).field_o[var4] = fi.a(((mf) this).field_o[var4], 16256) + (16384 - -var6);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (120 != var5) {
                    break L18;
                  } else {
                    this.a(var4, (byte) -122);
                    break L18;
                  }
                }
                L19: {
                  if (var5 == 121) {
                    this.c(var4, -119);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (-124 == (var5 ^ -1)) {
                    this.f(-32471, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if ((var5 ^ -1) != -7) {
                    break L21;
                  } else {
                    var7 = ((mf) this).field_o[var4];
                    if (16384 == var7) {
                      ((mf) this).field_t[var4] = fi.a(-16257, ((mf) this).field_t[var4]) + (var6 << 1226996391);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var5 == 38) {
                    var7 = ((mf) this).field_o[var4];
                    if ((var7 ^ -1) != -16385) {
                      break L22;
                    } else {
                      ((mf) this).field_t[var4] = var6 + fi.a(((mf) this).field_t[var4], -128);
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if ((var5 ^ -1) != -17) {
                    break L23;
                  } else {
                    ((mf) this).field_z[var4] = fi.a(-16257, ((mf) this).field_z[var4]) + (var6 << -29182009);
                    break L23;
                  }
                }
                L24: {
                  if (48 == var5) {
                    ((mf) this).field_z[var4] = fi.a(((mf) this).field_z[var4], -128) + var6;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (81 == var5) {
                    if (var6 < 64) {
                      this.b(-4222, var4);
                      ((mf) this).field_U[var4] = fi.a(((mf) this).field_U[var4], -5);
                      break L25;
                    } else {
                      ((mf) this).field_U[var4] = qk.a(((mf) this).field_U[var4], 4);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if ((var5 ^ -1) == -18) {
                    this.a(13127, (((mf) this).field_T[var4] & -16257) - -(var6 << -990674937), var4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if ((var5 ^ -1) == -50) {
                    this.a(13127, var6 + (((mf) this).field_T[var4] & -128), var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            }
          } else {
            var4 = param0 & 15;
            var5 = (param0 & 32579) >> 1632687272;
            var6 = 127 & param0 >> -1642423728;
            if (var6 <= 0) {
              this.b(var5, var4, 64, -50);
              return;
            } else {
              this.a(var4, var5, var6, 26879);
              return;
            }
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var2 = ((mf) this).field_u;
          var3 = ((mf) this).field_G;
          var4 = ((mf) this).field_E;
          if (null == ((mf) this).field_m) {
            break L0;
          } else {
            if (((mf) this).field_L != var3) {
              break L0;
            } else {
              this.a(93, ((mf) this).field_V, ((mf) this).field_R, ((mf) this).field_m);
              this.c(param0);
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((mf) this).field_G) {
            ((mf) this).field_E = var4;
            ((mf) this).field_G = var3;
            ((mf) this).field_u = var2;
            if (!param0) {
              L2: {
                if (null == ((mf) this).field_m) {
                  break L2;
                } else {
                  if (((mf) this).field_L < var3) {
                    ((mf) this).field_u = -1;
                    ((mf) this).field_G = ((mf) this).field_L;
                    ((mf) this).field_E = ((mf) this).field_H.c(((mf) this).field_G);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L3: while (true) {
              L4: {
                if (var3 != ((mf) this).field_H.field_h[var2]) {
                  break L4;
                } else {
                  ((mf) this).field_H.d(var2);
                  var6 = ((mf) this).field_H.e(var2);
                  if (-2 == (var6 ^ -1)) {
                    ((mf) this).field_H.b();
                    ((mf) this).field_H.b(var2);
                    if (((mf) this).field_H.g()) {
                      if (null == ((mf) this).field_m) {
                        L5: {
                          if (!((mf) this).field_R) {
                            break L5;
                          } else {
                            if (0 != var3) {
                              ((mf) this).field_H.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(128, true);
                        ((mf) this).field_H.a();
                        return;
                      } else {
                        ((mf) this).a(((mf) this).field_R, ((mf) this).field_m, true);
                        this.c(false);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if ((128 & var6) != 0) {
                        this.e(var6, 85);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((mf) this).field_H.a(var2);
                    ((mf) this).field_H.b(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((mf) this).field_H.f();
              var3 = ((mf) this).field_H.field_h[var2];
              var4 = ((mf) this).field_H.c(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized void a(byte param0) {
        if (param0 != 97) {
            return;
        }
        this.b(param0 ^ 225, true);
    }

    private final void f(int param0, int param1) {
        hg var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == -32471) {
          var3 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (-1 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if ((param1 ^ -1) == (var3.field_z ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (-1 >= (var3.field_k ^ -1)) {
                  break L1;
                } else {
                  ((mf) this).field_p[var3.field_z][var3.field_o] = null;
                  var3.field_k = 0;
                  break L1;
                }
              }
              var3 = (hg) (Object) ((mf) this).field_Q.field_m.b(-29);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        if (param0 != -4474) {
            this.b(-93, -66, 21, -44);
        }
        this.b((byte) -114, param1, param2);
    }

    private final void b(int param0, int param1) {
        hg var3 = null;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -4222) {
            return;
        }
        if ((((mf) this).field_U[param1] & 4) != 0) {
            var3 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
            while (var3 != null) {
                if (!(param1 != var3.field_z)) {
                    var3.field_C = 0;
                }
                var3 = (hg) (Object) ((mf) this).field_Q.field_m.b(-123);
            }
        }
    }

    final synchronized ej b() {
        return null;
    }

    final synchronized boolean d(int param0) {
        if (param0 != 144) {
            ((mf) this).field_p = null;
        }
        return ((mf) this).field_H.d();
    }

    final synchronized void d(int param0, int param1) {
        ((mf) this).field_q = param1;
        if (param0 != 1349013231) {
            mf.f(13);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        hg var7 = null;
        int var8 = 0;
        hg var9 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        var9 = ((mf) this).field_p[param1][param0];
        if (var9 == null) {
          return;
        } else {
          L0: {
            var6 = 32 / ((58 - param3) / 60);
            ((mf) this).field_p[param1][param0] = null;
            if (0 == (((mf) this).field_U[param1] & 2)) {
              var9.field_k = 0;
              break L0;
            } else {
              var7 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
              L1: while (true) {
                if (var7 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var7.field_z != var9.field_z) {
                      break L2;
                    } else {
                      if (-1 >= (var7.field_k ^ -1)) {
                        break L2;
                      } else {
                        if (var7 == var9) {
                          break L2;
                        } else {
                          var9.field_k = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var7 = (hg) (Object) ((mf) this).field_Q.field_m.b(-55);
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        ((mf) this).field_H.a();
        ((mf) this).field_m = null;
        this.a(param0 ^ 0, param1);
        if (param0 != 128) {
            this.a((byte) 32, -51, -95);
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 0) {
          ((mf) this).field_I[param0] = 12800;
          ((mf) this).field_w[param0] = 8192;
          ((mf) this).field_r[param0] = 16383;
          ((mf) this).field_N[param0] = 8192;
          ((mf) this).field_W[param0] = 0;
          if (param1 < -114) {
            ((mf) this).field_S[param0] = 8192;
            this.g(-114, param0);
            this.b(-4222, param0);
            ((mf) this).field_U[param0] = 0;
            ((mf) this).field_o[param0] = 32767;
            ((mf) this).field_t[param0] = 256;
            ((mf) this).field_z[param0] = 0;
            this.a(13127, 8192, param0);
            return;
          } else {
            return;
          }
        } else {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.c(param0, -123);
              param0++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param1) {
            this.a(-1, (byte) -71);
        } else {
            this.f(param0 + -32599, -1);
        }
        this.c(-1, param0 + -245);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            ((mf) this).field_v[var3] = ((mf) this).field_P[var3];
        }
        if (param0 != 128) {
            ((mf) this).d(38, -126, 2);
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((mf) this).field_B[var5] = fi.a(-128, ((mf) this).field_P[var5]);
            var5++;
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5 = -121 / ((param3 - -33) / 36);
    }

    final boolean b(hg param0, int param1) {
        if (!(null != param0.field_w)) {
            if ((param0.field_k ^ -1) <= -1) {
                param0.c(10);
                if ((param0.field_m ^ -1) < -1) {
                    if (((mf) this).field_O[param0.field_z][param0.field_m] != param0) {
                        return true;
                    }
                    ((mf) this).field_O[param0.field_z][param0.field_m] = null;
                }
            }
            return true;
        }
        if (param1 != -1642423728) {
            return false;
        }
        return false;
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, rl param3) {
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        if (param0 <= 85) {
            field_A = 42;
        }
        this.b(128, param1);
        ((mf) this).field_H.a(param3.field_i);
        ((mf) this).field_s = 0L;
        ((mf) this).field_R = param2 ? true : false;
        int var5 = ((mf) this).field_H.e();
        for (var6 = 0; var6 < var5; var6++) {
            ((mf) this).field_H.d(var6);
            ((mf) this).field_H.a(var6);
            ((mf) this).field_H.b(var6);
        }
        ((mf) this).field_u = ((mf) this).field_H.f();
        ((mf) this).field_G = ((mf) this).field_H.field_h[((mf) this).field_u];
        ((mf) this).field_E = ((mf) this).field_H.c(((mf) this).field_G);
    }

    final synchronized void a(boolean param0, rl param1, boolean param2) {
        this.a(113, param2, param0, param1);
    }

    final synchronized ej a() {
        return (ej) (Object) ((mf) this).field_Q;
    }

    private final int a(hg param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((mf) this).field_D[param0.field_z] == 0) {
            return 0;
        }
        g var9 = param0.field_D;
        g var10 = var9;
        int var4 = ((mf) this).field_I[param0.field_z] * ((mf) this).field_r[param0.field_z] - -4096 >> -1137290099;
        var4 = var4 * var4 + 16384 >> 1874544495;
        if (param1 != -70) {
            this.c(36, 17);
        }
        var4 = param0.field_i * var4 - -16384 >> 1349013231;
        var4 = 128 + ((mf) this).field_q * var4 >> 1784847176;
        var4 = var4 * ((mf) this).field_D[param0.field_z] + 128 >> 1196614568;
        if (-1 > (var10.field_c ^ -1)) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_v * 0.00001953125 * (double)var10.field_c) + 0.5);
        }
        if (!(var10.field_j == null)) {
            var5 = param0.field_j;
            var6 = var10.field_j[1 + param0.field_s];
            if (param0.field_s < -2 + var10.field_j.length) {
                var7 = 65280 & var9.field_j[param0.field_s] << 1023559688;
                var8 = 65280 & var10.field_j[param0.field_s + 2] << 180902856;
                var6 = var6 + (-var6 + var10.field_j[3 + param0.field_s]) * (var5 - var7) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> 1837767974;
        }
        if (0 < param0.field_k) {
            if (!(var10.field_i == null)) {
                var5 = param0.field_k;
                var6 = var10.field_i[param0.field_A + 1];
                if (param0.field_A < -2 + var10.field_i.length) {
                    var7 = var9.field_i[param0.field_A] << -136179480 & 65280;
                    var8 = (var10.field_i[param0.field_A + 2] & 255) << 1660146696;
                    var6 = var6 + (-var6 + var10.field_i[3 + param0.field_A]) * (var5 - var7) / (var8 - var7);
                }
                var4 = var4 * var6 + 32 >> -1068742010;
            }
        }
        return var4;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SolKnight.field_L ? 1 : 0;
          if (((mf) this).field_H.d()) {
            var2 = ((mf) this).field_H.field_c * ((mf) this).field_M / gj.field_s;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + ((mf) this).field_s;
                if (((mf) this).field_E + -var3 >= 0L) {
                  ((mf) this).field_s = var3;
                  break L2;
                } else {
                  var5 = (int)((((mf) this).field_E + -((mf) this).field_s - (-(long)var2 + 1L)) / (long)var2);
                  ((mf) this).field_s = ((mf) this).field_s + (long)var5 * (long)var2;
                  ((mf) this).field_Q.a(var5);
                  param0 = param0 - var5;
                  this.c(false);
                  if (!((mf) this).field_H.d()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((mf) this).field_Q.a(param0);
              break L0;
            }
          } else {
            ((mf) this).field_Q.a(param0);
            break L0;
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    public mf() {
        ((mf) this).field_T = new int[16];
        ((mf) this).field_z = new int[16];
        ((mf) this).field_r = new int[16];
        ((mf) this).field_W = new int[16];
        ((mf) this).field_U = new int[16];
        ((mf) this).field_S = new int[16];
        ((mf) this).field_O = new hg[16][128];
        ((mf) this).field_N = new int[16];
        ((mf) this).field_B = new int[16];
        ((mf) this).field_I = new int[16];
        ((mf) this).field_o = new int[16];
        ((mf) this).field_M = 1000000;
        ((mf) this).field_t = new int[16];
        ((mf) this).field_w = new int[16];
        ((mf) this).field_J = new int[16];
        ((mf) this).field_P = new int[16];
        ((mf) this).field_v = new int[16];
        ((mf) this).field_p = new hg[16][128];
        ((mf) this).field_D = new int[16];
        ((mf) this).field_q = 256;
        ((mf) this).field_H = new oi();
        ((mf) this).field_Q = new lh((mf) this);
        ((mf) this).field_C = new qd(128);
        ((mf) this).b(256, -1, -129);
        this.a(128, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Play free version";
        field_A = 0;
        field_x = "OK";
        field_K = "Score";
        field_n = "Create a free account to start using this feature";
        field_y = new String[]{"SCATTER ROCKETS", "GUIDED MISSILES", "TORPEDOES", "RAIL GUN", "PULSE LASER", "PLASMA BOLT", "FUSION BEAM"};
        field_F = "Go Back";
    }
}
