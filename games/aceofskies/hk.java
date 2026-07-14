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
        int var4 = 47 % ((param2 - 51) / 61);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = AceOfSkies.field_G ? 1 : 0;
            if (!((hk) this).field_M.c()) {
              break L1;
            } else {
              var4 = ((hk) this).field_M.field_e * ((hk) this).field_C / tk.field_f;
              L2: while (true) {
                var5 = (long)param2 * (long)var4 + ((hk) this).field_j;
                if (0L > ((hk) this).field_u - var5) {
                  var7 = (int)((((hk) this).field_u + -((hk) this).field_j + ((long)var4 - 1L)) / (long)var4);
                  ((hk) this).field_j = ((hk) this).field_j + (long)var4 * (long)var7;
                  ((hk) this).field_L.b(param0, param1, var7);
                  param1 = param1 + var7;
                  this.a((byte) 53);
                  param2 = param2 - var7;
                  if (((hk) this).field_M.c()) {
                    continue L2;
                  } else {
                    ((hk) this).field_L.b(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((hk) this).field_j = var5;
                  break L1;
                }
              }
            }
          }
          ((hk) this).field_L.b(param0, param1, param2);
          break L0;
        }
    }

    final void a(ft param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = ((ft) param0).field_x.field_g.length;
            if (!param1) {
              break L1;
            } else {
              if (((ft) param0).field_x.field_f) {
                var6 = var4 + (var4 - ((ft) param0).field_x.field_h);
                var5 = (int)((long)var6 * (long)((hk) this).field_z[((ft) param0).field_m] >> 815925510);
                var4 = var4 << 8;
                if ((var4 ^ -1) >= (var5 ^ -1)) {
                  ((ft) param0).field_e.a(true);
                  var5 = -var5 + (-1 + var4 + var4);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = (int)((long)var4 * (long)((hk) this).field_z[((ft) param0).field_m] >> -1841327162);
          break L0;
        }
        L2: {
          if (param2) {
            break L2;
          } else {
            ((hk) this).field_y = -43;
            break L2;
          }
        }
        ((ft) param0).field_e.e(var5);
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
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
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
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ft var3 = (ft) ((hk) this).field_L.field_k.d(268435455);
        while (var3 != null) {
            if (param1 >= 0) {
                // if_icmpeq L47
            } else {
                if (-1 < (((ft) var3).field_p ^ -1)) {
                    ((hk) this).field_E[((ft) var3).field_m][((ft) var3).field_n] = null;
                    var3.field_p = 0;
                }
            }
            var3 = (ft) ((hk) this).field_L.field_k.b((byte) 103);
        }
        if (!param0) {
            ((hk) this).field_s = (int[]) null;
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
            var6 = (ft) ((hk) this).field_L.field_k.d(268435455);
            while (var6 != null) {
                if ((((ft) var6).field_m ^ -1) == (((ft) var8).field_m ^ -1)) {
                    if (0 > ((ft) var6).field_p) {
                        if (!(var8 == var6)) {
                            var8.field_p = 0;
                            break;
                        }
                    }
                }
                var6 = (ft) ((hk) this).field_L.field_k.b((byte) 103);
            }
        }
    }

    final synchronized void g(int param0) {
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != 0) {
            return;
        }
        ml var4 = (ml) ((hk) this).field_n.a(false);
        while (var4 != null) {
            var4.a(true);
            var4 = (ml) ((hk) this).field_n.a(0);
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
        if (!((2 & ((hk) this).field_G[param1] ^ -1) == -1)) {
            var3 = (ft) ((hk) this).field_L.field_k.d(268435455);
            while (var3 != null) {
                if ((((ft) var3).field_m ^ -1) == (param1 ^ -1)) {
                    if (null == ((hk) this).field_E[param1][((ft) var3).field_n]) {
                        if (0 > ((ft) var3).field_p) {
                            var3.field_p = 0;
                        }
                    }
                }
                var3 = (ft) ((hk) this).field_L.field_k.b((byte) 103);
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
            var5 = (ft) ((hk) this).field_L.field_k.a((byte) -70);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((((ft) var5).field_m ^ -1) != (param3 ^ -1)) {
                    break L2;
                  } else {
                    if (0 <= ((ft) var5).field_p) {
                      break L2;
                    } else {
                      ((hk) this).field_E[param3][((ft) var5).field_n] = null;
                      ((hk) this).field_E[param3][param2] = var5;
                      var6_int = ((ft) var5).field_w + (((ft) var5).field_q * ((ft) var5).field_u >> -591741908);
                      ((ft) var5).field_w = ((ft) var5).field_w + (-((ft) var5).field_n + param2 << -2030902424);
                      var5.field_q = 4096;
                      var5.field_n = param2;
                      var5.field_u = -((ft) var5).field_w + var6_int;
                      return;
                    }
                  }
                }
                var5 = (ft) ((hk) this).field_L.field_k.a(110);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var11 = (ml) ((hk) this).field_n.a((byte) 106, (long)((hk) this).field_I[param3]);
        var12 = (ml) var11;
        if (var12 == null) {
          return;
        } else {
          var6 = ((ml) var11).field_f[param2];
          if (var6 != null) {
            L3: {
              var8 = 5 / ((-31 - param0) / 43);
              var7 = new ft();
              var7.field_y = var12;
              var7.field_m = param3;
              var7.field_x = var6;
              var7.field_r = ((ml) var11).field_o[param2];
              var7.field_f = ((ml) var11).field_e[param2];
              var7.field_n = param2;
              var7.field_h = 1024 + ((ml) var11).field_k[param2] * ((ml) var12).field_i * (param1 * param1) >> 2103000043;
              var7.field_v = ((ml) var11).field_q[param2] & 255;
              var7.field_w = (param2 << 842833992) - (((ml) var11).field_n[param2] & 32767);
              var7.field_g = 0;
              var7.field_p = -1;
              var7.field_A = 0;
              var7.field_s = 0;
              var7.field_k = 0;
              if (-1 != (((hk) this).field_z[param3] ^ -1)) {
                L4: {
                  var7.field_e = su.a(var6, this.b((byte) -126, var7), 0, this.b(85, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = (ft) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (-1 >= (((ml) var12).field_n[param2] ^ -1)) {
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
                ((hk) this).a((ft) (Object) stackIn_18_1, stackIn_18_2 != 0, true);
                break L3;
              } else {
                var7.field_e = su.a(var6, this.b((byte) -113, var7), this.a((byte) -67, var7), this.b(77, var7));
                break L3;
              }
            }
            L5: {
              if (-1 < (((ml) var12).field_n[param2] ^ -1)) {
                ((ft) var7).field_e.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 < (((ft) var7).field_f ^ -1)) {
                break L6;
              } else {
                L7: {
                  var9 = ((hk) this).field_K[param3][((ft) var7).field_f];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (((ft) var9).field_p < 0) {
                      ((hk) this).field_E[param3][((ft) var9).field_n] = null;
                      var9.field_p = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((hk) this).field_K[param3][((ft) var7).field_f] = var7;
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
            ft var5 = (ft) null;
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
        ft var8 = null;
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
          if ((var3 ^ -1) != (((hk) this).field_q ^ -1)) {
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
                var8 = (ft) null;
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
                  if (-2 != (var6 ^ -1)) {
                    L6: {
                      if ((128 & var6 ^ -1) != -1) {
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
                            if ((var3 ^ -1) == -1) {
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
          L0: {
            if (!param1) {
              break L0;
            } else {
              ((hk) this).field_N = (int[]) null;
              break L0;
            }
          }
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
          L1: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.c(param0, false);
              param0++;
              continue L1;
            }
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        ((hk) this).field_C = param0;
        if (param1 > -102) {
            ((hk) this).field_J = (int[]) null;
        }
    }

    final synchronized void d(int param0) {
        if (param0 >= -125) {
            ((hk) this).field_r = (int[]) null;
        }
        this.a(2097152, true);
    }

    final synchronized void a(boolean param0, int param1, ap param2) {
        this.a(param1 ^ -2029711495, true, param0, param2);
        if (param1 != -2029711608) {
            ((hk) this).a(43);
        }
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, ap param3) {
        int var6 = 0;
        int var7 = AceOfSkies.field_G ? 1 : 0;
        this.a(2097152, param1);
        ((hk) this).field_M.a(((ap) param3).field_e);
        ((hk) this).field_j = 0L;
        ((hk) this).field_k = param2 ? true : false;
        int var5 = ((hk) this).field_M.f();
        for (var6 = 0; var6 < var5; var6++) {
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
        if (!(null != ((ft) param1).field_e)) {
            if (((ft) param1).field_p < 0) {
                return true;
            }
            param1.c(-125);
            if (0 < ((ft) param1).field_f) {
                if (!(((hk) this).field_K[((ft) param1).field_m][((ft) param1).field_f] != param1)) {
                    ((hk) this).field_K[((ft) param1).field_m][((ft) param1).field_f] = null;
                }
            }
            return true;
        }
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final synchronized boolean a(int param0, int param1, ap param2, gk param3, ob param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        ub var8 = null;
        int var9 = 0;
        int var11 = 0;
        ml var12 = null;
        ml var13 = null;
        L0: {
          var11 = AceOfSkies.field_G ? 1 : 0;
          param2.b();
          var6 = 1;
          var7 = null;
          if ((param1 ^ -1) >= param0) {
            break L0;
          } else {
            var7_array = new int[]{param1};
            break L0;
          }
        }
        var8 = (ub) ((ap) param2).field_f.a(false);
        L1: while (true) {
          if (var8 == null) {
            L2: {
              if (var6 == 0) {
                break L2;
              } else {
                param2.a();
                break L2;
              }
            }
            return var6 != 0;
          } else {
            L3: {
              L4: {
                var9 = (int)((ub) var8).field_b;
                var12 = (ml) ((hk) this).field_n.a((byte) 106, (long)var9);
                if (var12 == null) {
                  var13 = gu.a(var9, param3, 16652);
                  if (var13 == null) {
                    var6 = 0;
                    break L3;
                  } else {
                    ((hk) this).field_n.a(param0 ^ -98, (long)var9, (wf) (Object) var13);
                    if (!var13.a(((ub) var8).field_e, var7_array, param4, 5193)) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  if (!var12.a(((ub) var8).field_e, var7_array, param4, 5193)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = 0;
              break L3;
            }
            var8 = (ub) ((ap) param2).field_f.a(param0 + 1);
            continue L1;
          }
        }
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
            ((hk) this).field_o = (int[]) null;
        }
        if (-1 >= (param2 ^ -1)) {
            ((hk) this).field_l[param2] = param1;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                ((hk) this).field_l[var4] = param1;
            }
        }
    }

    private final int b(int param0, ft param1) {
        int var3 = ((hk) this).field_p[((ft) param1).field_m];
        if (param0 <= 54) {
            return -42;
        }
        if ((var3 ^ -1) > -8193) {
            return var3 * ((ft) param1).field_v - -32 >> 289377862;
        }
        return -((-((ft) param1).field_v + 128) * (16384 - var3) - -32 >> 479149670) + 16384;
    }

    private final int a(byte param0, ft param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((hk) this).field_l[((ft) param1).field_m] == 0) {
            return 0;
        }
        dh var9 = ((ft) param1).field_r;
        dh var10 = var9;
        int var4 = 4096 + ((hk) this).field_w[((ft) param1).field_m] * ((hk) this).field_J[((ft) param1).field_m] >> 1390034221;
        var4 = 16384 + var4 * var4 >> 1302806831;
        var4 = 16384 + var4 * ((ft) param1).field_h >> 1410798607;
        var4 = 128 + ((hk) this).field_t * var4 >> -1784802136;
        var4 = ((hk) this).field_l[((ft) param1).field_m] * var4 - -128 >> -543142776;
        if (param0 != -67) {
            ((hk) this).field_u = 112L;
        }
        if (0 < ((dh) var10).field_b) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)((dh) var10).field_b * ((double)((ft) param1).field_A * 0.00001953125)) * (double)var4);
        }
        if (((dh) var10).field_g != null) {
            var5 = ((ft) param1).field_s;
            var6 = ((dh) var10).field_g[((ft) param1).field_g + 1];
            if (((ft) param1).field_g < ((dh) var10).field_g.length - 2) {
                var7 = 65280 & ((dh) var9).field_g[((ft) param1).field_g] << -2087311320;
                var8 = (((dh) var10).field_g[2 + ((ft) param1).field_g] & 255) << 1858141288;
                var6 = var6 + (var5 - var7) * (-var6 + ((dh) var10).field_g[((ft) param1).field_g + 3]) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> 553654502;
        }
        if (0 < ((ft) param1).field_p) {
            if (!(((dh) var10).field_e == null)) {
                var5 = ((ft) param1).field_p;
                var6 = ((dh) var10).field_e[((ft) param1).field_k - -1];
                if (!((((ft) param1).field_k ^ -1) <= (((dh) var10).field_e.length - 2 ^ -1))) {
                    var7 = (255 & ((dh) var9).field_e[((ft) param1).field_k]) << -2029711608;
                    var8 = (255 & ((dh) var10).field_e[((ft) param1).field_k - -2]) << 86640264;
                    var6 = var6 + (-var6 + ((dh) var10).field_e[((ft) param1).field_k + 3]) * (var5 - var7) / (-var7 + var8);
                }
                var4 = var4 * var6 + 32 >> 411440006;
            }
        }
        return var4;
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
        if ((var3 ^ -1) != -129) {
          L0: {
            if (144 == var3) {
              var4 = param1 & 15;
              var5 = 127 & param1 >> -544703320;
              var6 = 127 & param1 >> -1959037360;
              if ((var6 ^ -1) >= -1) {
                this.a(64, var5, param0 + 128, var4);
                return;
              } else {
                this.b(35, var6, var5, var4);
                break L0;
              }
            } else {
              if (var3 == 160) {
                var4 = 15 & param1;
                var5 = param1 >> -1389716088 & 127;
                var6 = (param1 & 8337132) >> -385328656;
                this.a(var6, (byte) 127, var4, var5);
                return;
              } else {
                L1: {
                  if (param0 == -128) {
                    break L1;
                  } else {
                    ((hk) this).field_s = (int[]) null;
                    break L1;
                  }
                }
                if (-177 != (var3 ^ -1)) {
                  if ((var3 ^ -1) != -193) {
                    if ((var3 ^ -1) == -209) {
                      var4 = param1 & 15;
                      var5 = (32723 & param1) >> -12639416;
                      this.a(var4, var5, (byte) -34);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = 15 & param1;
                        var5 = (param1 >> -293195479 & 16256) - -(127 & param1 >> -2058178520);
                        this.a(param0 + 255, var5, var4);
                        return;
                      } else {
                        var3 = 255 & param1;
                        if (-256 == (var3 ^ -1)) {
                          this.b(true, param0 + 12833);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    var4 = 15 & param1;
                    var5 = (32710 & param1) >> -952052664;
                    this.a(var4, (byte) 101, ((hk) this).field_s[var4] + var5);
                    return;
                  }
                } else {
                  L2: {
                    var4 = param1 & 15;
                    var5 = 127 & param1 >> -1875940440;
                    var6 = param1 >> 260667280 & 127;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      ((hk) this).field_s[var4] = pg.a(((hk) this).field_s[var4], -2080769) + (var6 << 637857966);
                      break L2;
                    }
                  }
                  L3: {
                    if (32 == var5) {
                      ((hk) this).field_s[var4] = pg.a(-16257, ((hk) this).field_s[var4]) + (var6 << -1449387449);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (1 != var5) {
                      break L4;
                    } else {
                      ((hk) this).field_A[var4] = pg.a(-16257, ((hk) this).field_A[var4]) + (var6 << 383813287);
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
                    if ((var5 ^ -1) != -6) {
                      break L6;
                    } else {
                      ((hk) this).field_r[var4] = pg.a(-16257, ((hk) this).field_r[var4]) + (var6 << -1638062137);
                      break L6;
                    }
                  }
                  L7: {
                    if (-38 != (var5 ^ -1)) {
                      break L7;
                    } else {
                      ((hk) this).field_r[var4] = var6 + pg.a(((hk) this).field_r[var4], -128);
                      break L7;
                    }
                  }
                  L8: {
                    if (7 == var5) {
                      ((hk) this).field_J[var4] = pg.a(((hk) this).field_J[var4], -16257) + (var6 << 964509767);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (-40 != (var5 ^ -1)) {
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
                      ((hk) this).field_p[var4] = (var6 << -1441055481) + pg.a(-16257, ((hk) this).field_p[var4]);
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
                    if (-12 == (var5 ^ -1)) {
                      ((hk) this).field_w[var4] = (var6 << -583906745) + pg.a(-16257, ((hk) this).field_w[var4]);
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
                    if ((var5 ^ -1) == -100) {
                      ((hk) this).field_D[var4] = (var6 << -913265241) + pg.a(((hk) this).field_D[var4], 127);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-99 != (var5 ^ -1)) {
                      break L17;
                    } else {
                      ((hk) this).field_D[var4] = pg.a(16256, ((hk) this).field_D[var4]) - -var6;
                      break L17;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) == -102) {
                      ((hk) this).field_D[var4] = (var6 << 1873769255) + pg.a(((hk) this).field_D[var4], 127) + 16384;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 != (var5 ^ -1)) {
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
                    if ((var5 ^ -1) != -122) {
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
                        ((hk) this).field_B[var4] = (var6 << -956481817) + pg.a(((hk) this).field_B[var4], -16257);
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var5 == 38) {
                      var7 = ((hk) this).field_D[var4];
                      if ((var7 ^ -1) != -16385) {
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
                    if (-17 == (var5 ^ -1)) {
                      ((hk) this).field_z[var4] = (var6 << -24230713) + pg.a(((hk) this).field_z[var4], -16257);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if ((var5 ^ -1) != -49) {
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
                    if ((var5 ^ -1) == -18) {
                      this.c(var4, (((hk) this).field_o[var4] & -16257) + (var6 << 2126190759), 3830);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (-50 != (var5 ^ -1)) {
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
          var5 = (param1 & 32672) >> -1270347576;
          var6 = (8343301 & param1) >> -714142320;
          this.a(var6, var5, 0, var4);
          return;
        }
    }

    private final int b(byte param0, ft param1) {
        int var3 = 0;
        dh var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = (((ft) param1).field_u * ((ft) param1).field_q >> -2138420020) + ((ft) param1).field_w;
          var3 = var3 + (((hk) this).field_B[((ft) param1).field_m] * (-8192 + ((hk) this).field_N[((ft) param1).field_m]) >> 1424702124);
          var4 = ((ft) param1).field_r;
          if (param0 <= -56) {
            break L0;
          } else {
            this.b(-101, (byte) 115);
            break L0;
          }
        }
        L1: {
          if ((((dh) var4).field_i ^ -1) >= -1) {
            break L1;
          } else {
            L2: {
              if (-1 > (((dh) var4).field_j ^ -1)) {
                break L2;
              } else {
                if (((hk) this).field_A[((ft) param1).field_m] <= 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = ((dh) var4).field_j << 1156292610;
              var6 = ((dh) var4).field_a << -1374848415;
              if ((((ft) param1).field_j ^ -1) > (var6 ^ -1)) {
                var5 = ((ft) param1).field_j * var5 / var6;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = var5 + (((hk) this).field_A[((ft) param1).field_m] >> 1287252487);
            var7 = Math.sin((double)(511 & ((ft) param1).field_z) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)((double)(256 * ((ft) param1).field_x.field_i) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)tk.field_f + 0.5);
          if (1 <= var5) {
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

    final boolean a(int param0, int param1, boolean param2, ft param3, int[] param4) {
        int var6 = 0;
        dh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = AceOfSkies.field_G ? 1 : 0;
          param3.field_i = tk.field_f / 100;
          if (0 > ((ft) param3).field_p) {
            break L0;
          } else {
            L1: {
              if (null == ((ft) param3).field_e) {
                break L1;
              } else {
                if (((ft) param3).field_e.f()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.a(11821);
              param3.c(-127);
              if ((((ft) param3).field_f ^ -1) >= -1) {
                break L2;
              } else {
                if (param3 == ((hk) this).field_K[((ft) param3).field_m][((ft) param3).field_f]) {
                  ((hk) this).field_K[((ft) param3).field_m][((ft) param3).field_f] = null;
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
          var6 = ((ft) param3).field_q;
          if (var6 > 0) {
            L4: {
              var6 = var6 - (int)(16.0 * Math.pow(2.0, (double)((hk) this).field_r[((ft) param3).field_m] * 0.0004921259842519685) + 0.5);
              if (-1 >= (var6 ^ -1)) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param3.field_q = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          ((ft) param3).field_e.g(this.b((byte) -76, param3));
          var7 = ((ft) param3).field_r;
          ((ft) param3).field_j = ((ft) param3).field_j + 1;
          var8 = param2 ? 1 : 0;
          ((ft) param3).field_z = ((ft) param3).field_z + ((dh) var7).field_i;
          var9 = 0.000005086263020833333 * (double)((((ft) param3).field_n + -60 << 280871336) - -(((ft) param3).field_q * ((ft) param3).field_u >> 717621484));
          if ((((dh) var7).field_b ^ -1) >= -1) {
            break L5;
          } else {
            L6: {
              if (-1 <= (((dh) var7).field_f ^ -1)) {
                ((ft) param3).field_A = ((ft) param3).field_A + 128;
                break L6;
              } else {
                ((ft) param3).field_A = ((ft) param3).field_A + (int)(0.5 + 128.0 * Math.pow(2.0, (double)((dh) var7).field_f * var9));
                break L6;
              }
            }
            if (819200 > ((dh) var7).field_b * ((ft) param3).field_A) {
              break L5;
            } else {
              var8 = 1;
              break L5;
            }
          }
        }
        L7: {
          if (((dh) var7).field_g == null) {
            break L7;
          } else {
            L8: {
              if (0 < ((dh) var7).field_h) {
                ((ft) param3).field_s = ((ft) param3).field_s + (int)(0.5 + 128.0 * Math.pow(2.0, (double)((dh) var7).field_h * var9));
                break L8;
              } else {
                ((ft) param3).field_s = ((ft) param3).field_s + 128;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if ((((ft) param3).field_g ^ -1) <= (-2 + ((dh) var7).field_g.length ^ -1)) {
                  break L10;
                } else {
                  if (((255 & ((dh) var7).field_g[2 + ((ft) param3).field_g]) << -1068432120 ^ -1) <= (((ft) param3).field_s ^ -1)) {
                    break L10;
                  } else {
                    ((ft) param3).field_g = ((ft) param3).field_g + 2;
                    continue L9;
                  }
                }
              }
              if (((ft) param3).field_g != ((dh) var7).field_g.length + -2) {
                break L7;
              } else {
                if ((((dh) var7).field_g[((ft) param3).field_g + 1] ^ -1) == -1) {
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
          if (0 > ((ft) param3).field_p) {
            break L11;
          } else {
            if (((dh) var7).field_e == null) {
              break L11;
            } else {
              if (0 != (1 & ((hk) this).field_G[((ft) param3).field_m])) {
                break L11;
              } else {
                L12: {
                  if (((ft) param3).field_f < 0) {
                    break L12;
                  } else {
                    if (param3 == ((hk) this).field_K[((ft) param3).field_m][((ft) param3).field_f]) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (((dh) var7).field_l > 0) {
                    ((ft) param3).field_p = ((ft) param3).field_p + (int)(Math.pow(2.0, (double)((dh) var7).field_l * var9) * 128.0 + 0.5);
                    break L13;
                  } else {
                    ((ft) param3).field_p = ((ft) param3).field_p + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if ((-2 + ((dh) var7).field_e.length ^ -1) >= (((ft) param3).field_k ^ -1)) {
                      break L15;
                    } else {
                      if ((((ft) param3).field_p ^ -1) >= (65280 & ((dh) var7).field_e[((ft) param3).field_k - -2] << 1732155304 ^ -1)) {
                        break L15;
                      } else {
                        ((ft) param3).field_k = ((ft) param3).field_k + 2;
                        continue L14;
                      }
                    }
                  }
                  if ((-2 + ((dh) var7).field_e.length ^ -1) == (((ft) param3).field_k ^ -1)) {
                    var8 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
            }
          }
        }
        if (var8 == 0) {
          ((ft) param3).field_e.a(((ft) param3).field_i, this.a((byte) -67, param3), this.b(67, param3));
          return false;
        } else {
          L16: {
            ((ft) param3).field_e.h(((ft) param3).field_i);
            if (param4 != null) {
              ((ft) param3).field_e.b(param4, param1, param0);
              break L16;
            } else {
              ((ft) param3).field_e.a(param0);
              break L16;
            }
          }
          L17: {
            if (!((ft) param3).field_e.j()) {
              break L17;
            } else {
              ((hk) this).field_L.field_i.b((rf) (Object) ((ft) param3).field_e);
              break L17;
            }
          }
          L18: {
            param3.a(11821);
            if (((ft) param3).field_p >= 0) {
              param3.c(-123);
              if ((((ft) param3).field_f ^ -1) >= -1) {
                break L18;
              } else {
                if (((hk) this).field_K[((ft) param3).field_m][((ft) param3).field_f] == param3) {
                  ((hk) this).field_K[((ft) param3).field_m][((ft) param3).field_f] = null;
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

    final synchronized void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        this.b(2993, param0, param2);
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 != -543142776) {
            field_i = (int[]) null;
        }
    }

    final synchronized boolean f(int param0) {
        if (param0 != 32119) {
            ((hk) this).field_z = (int[]) null;
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
        int var4 = AceOfSkies.field_G ? 1 : 0;
        ft var3 = (ft) ((hk) this).field_L.field_k.d(268435455);
        while (var3 != null) {
            if (param0 >= 0) {
                // if_icmpne L152
            }
            if (!(((ft) var3).field_e == null)) {
                ((ft) var3).field_e.h(tk.field_f / 100);
                if (((ft) var3).field_e.j()) {
                    ((hk) this).field_L.field_i.b((rf) (Object) ((ft) var3).field_e);
                }
                var3.a(11821);
            }
            if (((ft) var3).field_p < 0) {
                ((hk) this).field_E[((ft) var3).field_m][((ft) var3).field_n] = null;
            }
            var3.c(-124);
            var3 = (ft) ((hk) this).field_L.field_k.b((byte) 103);
        }
        if (param1 <= 65) {
            ((hk) this).field_w = (int[]) null;
        }
    }

    private final void a(int param0, byte param1) {
        ft var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if (param1 != 4) {
            ob var5 = (ob) null;
            boolean discarded$0 = ((hk) this).a(6, 126, (ap) null, (gk) null, (ob) null);
        }
        if (0 != (4 & ((hk) this).field_G[param0])) {
            var3 = (ft) ((hk) this).field_L.field_k.d(268435455);
            while (var3 != null) {
                if ((((ft) var3).field_m ^ -1) == (param0 ^ -1)) {
                    var3.field_t = 0;
                }
                var3 = (ft) ((hk) this).field_L.field_k.b((byte) 103);
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
