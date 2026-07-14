/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends eb {
    private int field_R;
    private int[] field_r;
    private int[] field_V;
    int[] field_I;
    private int[] field_H;
    private int[] field_t;
    static String field_O;
    private dj field_A;
    private int[] field_v;
    static int field_s;
    private int[] field_K;
    private int field_X;
    private int[] field_M;
    private int[] field_u;
    private int[] field_Q;
    private int[] field_E;
    int[] field_T;
    private wj field_N;
    private oc[][] field_J;
    private int[] field_L;
    private oc[][] field_B;
    int[] field_G;
    private int[] field_w;
    private int[] field_W;
    private long field_C;
    private wn field_y;
    private boolean field_x;
    private int field_Y;
    private int field_S;
    private long field_D;
    private boolean field_U;
    private int field_F;
    private ri field_z;

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          var2 = ((g) this).field_Y;
          if (param0 > 19) {
            break L0;
          } else {
            ((g) this).field_V = null;
            break L0;
          }
        }
        L1: {
          var3 = ((g) this).field_S;
          var4 = ((g) this).field_C;
          if (null == ((g) this).field_z) {
            break L1;
          } else {
            if ((((g) this).field_F ^ -1) != (var3 ^ -1)) {
              break L1;
            } else {
              this.a(((g) this).field_z, 0, ((g) this).field_U, ((g) this).field_x);
              this.b((byte) 38);
              return;
            }
          }
        }
        L2: while (true) {
          if ((var3 ^ -1) != (((g) this).field_S ^ -1)) {
            L3: {
              ((g) this).field_C = var4;
              ((g) this).field_Y = var2;
              ((g) this).field_S = var3;
              if (((g) this).field_z == null) {
                break L3;
              } else {
                if (var3 > ((g) this).field_F) {
                  ((g) this).field_Y = -1;
                  ((g) this).field_S = ((g) this).field_F;
                  ((g) this).field_C = ((g) this).field_N.d(((g) this).field_S);
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
                if (var3 != ((g) this).field_N.field_g[var2]) {
                  break L5;
                } else {
                  ((g) this).field_N.f(var2);
                  var6 = ((g) this).field_N.c(var2);
                  if (-2 != (var6 ^ -1)) {
                    L6: {
                      if ((128 & var6 ^ -1) == -1) {
                        break L6;
                      } else {
                        this.f(91, var6);
                        break L6;
                      }
                    }
                    ((g) this).field_N.e(var2);
                    ((g) this).field_N.b(var2);
                    continue L4;
                  } else {
                    ((g) this).field_N.c();
                    ((g) this).field_N.b(var2);
                    if (((g) this).field_N.a()) {
                      if (((g) this).field_z != null) {
                        ((g) this).a(((g) this).field_x, ((g) this).field_z, (byte) 123);
                        this.b((byte) 108);
                        return;
                      } else {
                        L7: {
                          if (!((g) this).field_x) {
                            break L7;
                          } else {
                            if (var3 == 0) {
                              break L7;
                            } else {
                              ((g) this).field_N.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, (byte) 127);
                        ((g) this).field_N.d();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var2 = ((g) this).field_N.g();
              var3 = ((g) this).field_N.field_g[var2];
              var4 = ((g) this).field_N.d(var3);
              continue L2;
            }
          }
        }
    }

    private final void f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        var3 = 240 & param1;
        if (128 != var3) {
          L0: {
            if (var3 != 144) {
              if (160 != var3) {
                if (var3 != 176) {
                  if ((var3 ^ -1) == -193) {
                    var4 = 15 & param1;
                    var5 = (32759 & param1) >> 1805059432;
                    this.c(var5 + ((g) this).field_M[var4], -2, var4);
                    return;
                  } else {
                    if (var3 != 208) {
                      if (-225 != (var3 ^ -1)) {
                        var3 = 255 & param1;
                        if (-256 == (var3 ^ -1)) {
                          this.a(true, (byte) 77);
                          return;
                        } else {
                          L1: {
                            if (param0 >= 67) {
                              break L1;
                            } else {
                              ((g) this).field_X = -10;
                              break L1;
                            }
                          }
                          return;
                        }
                      } else {
                        var4 = 15 & param1;
                        var5 = ((param1 & 8323385) >> -963451735) - -((param1 & 32630) >> -1920798552);
                        this.d(-27508, var4, var5);
                        return;
                      }
                    } else {
                      var4 = 15 & param1;
                      var5 = (32749 & param1) >> 907433544;
                      this.a((byte) -62, var5, var4);
                      return;
                    }
                  }
                } else {
                  L2: {
                    var4 = param1 & 15;
                    var5 = param1 >> 914445448 & 127;
                    var6 = 127 & param1 >> 2057021136;
                    if ((var5 ^ -1) == -1) {
                      ((g) this).field_M[var4] = pl.a(-2080769, ((g) this).field_M[var4]) - -(var6 << -947925778);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (32 != var5) {
                      break L3;
                    } else {
                      ((g) this).field_M[var4] = (var6 << -505531545) + pl.a(((g) this).field_M[var4], -16257);
                      break L3;
                    }
                  }
                  L4: {
                    if (1 != var5) {
                      break L4;
                    } else {
                      ((g) this).field_t[var4] = pl.a(((g) this).field_t[var4], -16257) + (var6 << -1208268313);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) == -34) {
                      ((g) this).field_t[var4] = pl.a(((g) this).field_t[var4], -128) + var6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (5 != var5) {
                      break L6;
                    } else {
                      ((g) this).field_V[var4] = pl.a(((g) this).field_V[var4], -16257) - -(var6 << 1697963335);
                      break L6;
                    }
                  }
                  L7: {
                    if (-38 == (var5 ^ -1)) {
                      ((g) this).field_V[var4] = pl.a(((g) this).field_V[var4], -128) + var6;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 7) {
                      break L8;
                    } else {
                      ((g) this).field_u[var4] = pl.a(-16257, ((g) this).field_u[var4]) - -(var6 << -788335705);
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) == -40) {
                      ((g) this).field_u[var4] = var6 + pl.a(-128, ((g) this).field_u[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-11 == (var5 ^ -1)) {
                      ((g) this).field_r[var4] = (var6 << -141913977) + pl.a(((g) this).field_r[var4], -16257);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-43 != (var5 ^ -1)) {
                      break L11;
                    } else {
                      ((g) this).field_r[var4] = pl.a(((g) this).field_r[var4], -128) - -var6;
                      break L11;
                    }
                  }
                  L12: {
                    if (-12 != (var5 ^ -1)) {
                      break L12;
                    } else {
                      ((g) this).field_W[var4] = pl.a(((g) this).field_W[var4], -16257) + (var6 << -1658171065);
                      break L12;
                    }
                  }
                  L13: {
                    if (-44 != (var5 ^ -1)) {
                      break L13;
                    } else {
                      ((g) this).field_W[var4] = var6 + pl.a(-128, ((g) this).field_W[var4]);
                      break L13;
                    }
                  }
                  L14: {
                    if (64 != var5) {
                      break L14;
                    } else {
                      if (64 <= var6) {
                        ((g) this).field_I[var4] = mc.a(((g) this).field_I[var4], 1);
                        break L14;
                      } else {
                        ((g) this).field_I[var4] = pl.a(((g) this).field_I[var4], -2);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (65 != var5) {
                      break L15;
                    } else {
                      if ((var6 ^ -1) <= -65) {
                        ((g) this).field_I[var4] = mc.a(((g) this).field_I[var4], 2);
                        break L15;
                      } else {
                        this.a(var4, (byte) 116);
                        ((g) this).field_I[var4] = pl.a(((g) this).field_I[var4], -3);
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if (var5 != 99) {
                      break L16;
                    } else {
                      ((g) this).field_v[var4] = pl.a(127, ((g) this).field_v[var4]) - -(var6 << 1332664455);
                      break L16;
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) != -99) {
                      break L17;
                    } else {
                      ((g) this).field_v[var4] = var6 + pl.a(16256, ((g) this).field_v[var4]);
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 101) {
                      break L18;
                    } else {
                      ((g) this).field_v[var4] = pl.a(127, ((g) this).field_v[var4]) + 16384 + (var6 << -1691504825);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 100) {
                      break L19;
                    } else {
                      ((g) this).field_v[var4] = var6 + 16384 + pl.a(16256, ((g) this).field_v[var4]);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 120) {
                      this.b((byte) -119, var4);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (121 == var5) {
                      this.d(var4, 16384);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (-124 != (var5 ^ -1)) {
                      break L22;
                    } else {
                      this.e(var4, -58);
                      break L22;
                    }
                  }
                  L23: {
                    if ((var5 ^ -1) == -7) {
                      var7 = ((g) this).field_v[var4];
                      if (-16385 == (var7 ^ -1)) {
                        ((g) this).field_K[var4] = (var6 << 1762435623) + pl.a(((g) this).field_K[var4], -16257);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (38 != var5) {
                      break L24;
                    } else {
                      var7 = ((g) this).field_v[var4];
                      if (-16385 == (var7 ^ -1)) {
                        ((g) this).field_K[var4] = var6 + pl.a(((g) this).field_K[var4], -128);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (var5 != 16) {
                      break L25;
                    } else {
                      ((g) this).field_G[var4] = pl.a(((g) this).field_G[var4], -16257) - -(var6 << 737750855);
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 48) {
                      ((g) this).field_G[var4] = pl.a(-128, ((g) this).field_G[var4]) - -var6;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 != 81) {
                      break L27;
                    } else {
                      if (64 > var6) {
                        this.b(var4, 114);
                        ((g) this).field_I[var4] = pl.a(((g) this).field_I[var4], -5);
                        break L27;
                      } else {
                        ((g) this).field_I[var4] = mc.a(((g) this).field_I[var4], 4);
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (-18 == (var5 ^ -1)) {
                      this.f(var4, 13242, (-16257 & ((g) this).field_L[var4]) + (var6 << 1524742343));
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if ((var5 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.f(var4, 13242, var6 + (-128 & ((g) this).field_L[var4]));
                    return;
                  }
                }
              } else {
                var4 = param1 & 15;
                var5 = (param1 & 32674) >> -2138388120;
                var6 = (param1 & 8343902) >> 487759088;
                this.a(false, var4, var5, var6);
                return;
              }
            } else {
              var4 = 15 & param1;
              var5 = (param1 & 32590) >> 1670248424;
              var6 = (8359574 & param1) >> -341086288;
              if (var6 <= 0) {
                this.a(var5, (byte) 77, var4, 64);
                return;
              } else {
                this.a(var5, var6, -25798, var4);
                break L0;
              }
            }
          }
          return;
        } else {
          var4 = param1 & 15;
          var5 = param1 >> 284317704 & 127;
          var6 = (8323462 & param1) >> -612721296;
          this.a(var5, (byte) 77, var4, var6);
          return;
        }
    }

    private final int a(oc param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(-1 != (((g) this).field_w[param0.field_n] ^ -1))) {
            return 0;
        }
        lm var9 = param0.field_q;
        lm var10 = var9;
        int var4 = 4096 + ((g) this).field_W[param0.field_n] * ((g) this).field_u[param0.field_n] >> -823009363;
        var4 = 16384 + var4 * var4 >> -2039942801;
        var4 = 16384 + param0.field_J * var4 >> -2039204881;
        var4 = var4 * ((g) this).field_X - -128 >> 1633766472;
        var4 = var4 * ((g) this).field_w[param0.field_n] - -128 >> 1094746472;
        if (!((var10.field_a ^ -1) >= -1)) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var10.field_a * (0.00001953125 * (double)param0.field_t)) + 0.5);
        }
        if (param1 != 16402) {
            field_O = null;
        }
        if (null != var10.field_d) {
            var5 = param0.field_o;
            var6 = var10.field_d[1 + param0.field_G];
            if (!((param0.field_G ^ -1) <= (-2 + var10.field_d.length ^ -1))) {
                var7 = var9.field_d[param0.field_G] << -865160376 & 65280;
                var8 = (var10.field_d[2 + param0.field_G] & 255) << 147655528;
                var6 = var6 + (var5 - var7) * (var10.field_d[3 + param0.field_G] - var6) / (var8 + -var7);
            }
            var4 = 32 + var6 * var4 >> -22295034;
        }
        if (0 < param0.field_v) {
            if (null != var10.field_e) {
                var5 = param0.field_v;
                var6 = var10.field_e[param0.field_A + 1];
                if (param0.field_A < -2 + var10.field_e.length) {
                    var7 = var9.field_e[param0.field_A] << 456528392 & 65280;
                    var8 = (var10.field_e[param0.field_A - -2] & 255) << -1875788184;
                    var6 = var6 + (var5 - var7) * (-var6 + var10.field_e[param0.field_A + 3]) / (-var7 + var8);
                }
                var4 = 32 + var6 * var4 >> 1340966406;
            }
        }
        return var4;
    }

    private final void b(int param0, int param1) {
        oc var3_ref_oc = null;
        int var4 = TetraLink.field_J;
        if ((((g) this).field_I[param0] & 4) != 0) {
            var3_ref_oc = (oc) (Object) ((g) this).field_y.field_u.c(false);
            while (var3_ref_oc != null) {
                if (param0 == var3_ref_oc.field_n) {
                    var3_ref_oc.field_F = 0;
                }
                var3_ref_oc = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
            }
        }
        int var3 = 65 / ((10 - param1) / 37);
    }

    final static void c(int param0) {
        gm.field_d.a((byte) -92, hh.field_c.field_Hb - (kj.field_b ? ha.field_e + 2 + 42 : 0), 0, 18, 0);
        if (param0 != 1753) {
            field_s = 47;
        }
        qc.field_eb.a((byte) -93, 42 + ha.field_e, 0, 18, -40 + hh.field_c.field_Hb + (-ha.field_e + -2));
        hn.field_Q.a(hh.field_c.field_Hb, ha.field_e, hh.field_c.field_R - 20, true, 20, 0, 2);
    }

    private final int a(byte param0, oc param1) {
        int var3 = ((g) this).field_r[param1.field_n];
        int var4 = -71 / ((-33 - param0) / 52);
        if (var3 >= 8192) {
            return -((-param1.field_r + 128) * (16384 - var3) + 32 >> 1494207622) + 16384;
        }
        return 32 + param1.field_r * var3 >> 784401958;
    }

    final static oh[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        oh[] var7 = new oh[9];
        oh[] var4 = var7;
        var7[0] = ce.a(param1, param2, 0);
        for (var5 = 1; 9 > var5; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = ce.a(param0, 64, 0);
        if (param3 <= 44) {
            g.a(78, (byte) -73, -70);
        }
        return var4;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TetraLink.field_J;
            if (((g) this).field_N.f()) {
              var2 = ((g) this).field_R * ((g) this).field_N.field_f / nk.field_k;
              L2: while (true) {
                var3 = (long)param0 * (long)var2 + ((g) this).field_D;
                if ((((g) this).field_C - var3 ^ -1L) <= -1L) {
                  ((g) this).field_D = var3;
                  break L1;
                } else {
                  var5 = (int)((-1L + (long)var2 + ((g) this).field_C + -((g) this).field_D) / (long)var2);
                  ((g) this).field_D = ((g) this).field_D + (long)var5 * (long)var2;
                  ((g) this).field_y.a(var5);
                  param0 = param0 - var5;
                  this.b((byte) 110);
                  if (((g) this).field_N.f()) {
                    continue L2;
                  } else {
                    ((g) this).field_y.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((g) this).field_y.a(param0);
          break L0;
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 >= -95) {
            this.a((byte) 8, 116, 107);
        }
        this.a(param0, -121, param1);
    }

    public static void c(byte param0) {
        field_O = null;
        int var1 = -46 % ((54 - param0) / 62);
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 != -62) {
            ((g) this).d(96);
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (param2 <= 54) {
            return;
        }
        if (-1 >= (param1 ^ -1)) {
            ((g) this).field_w[param1] = param0;
        } else {
            for (var4 = 0; 16 > var4; var4++) {
                ((g) this).field_w[var4] = param0;
            }
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        if (param0 != 487759088) {
            Object var4 = null;
            boolean discarded$0 = ((g) this).a((fa) null, (ri) null, (ah) null, -13, -73);
        }
        ((g) this).field_N.d();
        ((g) this).field_z = null;
        this.a(param1, (byte) 39);
    }

    final synchronized boolean d(byte param0) {
        int var2 = -65 / ((14 - param0) / 33);
        return ((g) this).field_N.f();
    }

    final boolean b(byte param0, oc param1) {
        if (param0 < 94) {
            field_s = -84;
        }
        if (null == param1.field_I) {
            if (-1 >= (param1.field_v ^ -1)) {
                param1.b(false);
                if (param1.field_C > 0) {
                    if (param1 == ((g) this).field_J[param1.field_n][param1.field_C]) {
                        ((g) this).field_J[param1.field_n][param1.field_C] = null;
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    final synchronized int a() {
        return 0;
    }

    private final void f(int param0, int param1, int param2) {
        ((g) this).field_L[param0] = param2;
        if (param1 != 13242) {
            return;
        }
        ((g) this).field_T[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param2 * 0.00054931640625));
    }

    final static void a(String[] args, String param1, int param2, byte param3) {
        String[] var4 = null;
        int var5 = TetraLink.field_J;
        if (param3 != 3) {
            field_O = null;
        }
        pi.field_a = ik.field_d;
        if (param2 == 255) {
            pm.field_f = al.a(13 > wh.field_k ? true : false, 1);
            ia.a((String[]) null, param3 ^ 10535);
        } else {
            if ((param2 ^ -1) <= -101) {
                // if_icmplt L102
                var4 = args;
                ia.a(var4, 10532);
                pm.field_f = ng.a((byte) -67, args);
            } else {
                pm.field_f = hj.a(param1, param2, false);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((g) this).field_H[param0] = param2;
        ((g) this).field_M[param0] = pl.a(param2, -128);
        if (param1 >= -70) {
            ((g) this).a((byte) -28, 93);
        }
        this.c(param2, -2, param0);
    }

    final static void a(int param0, byte param1, int param2) {
        el var6 = null;
        el var7 = null;
        bc var4 = null;
        if (param2 != nd.field_Nb) {
            var6 = (el) (Object) db.field_e.a((long)nd.field_Nb, 1);
            var7 = var6;
            if (var7 != null) {
                var7.field_fc = null;
            }
            nd.field_Nb = param2;
            var4 = nd.field_Lb;
            var4.f(param0, (byte) -92);
            var4.a(3, false);
            var4.a(11, false);
            var4.b(param2, false);
        }
        if (param1 > -113) {
            g.c((byte) -93);
        }
    }

    final static void e(int param0, int param1, int param2) {
        bc var3 = nd.field_Lb;
        var3.f(param2, (byte) -92);
        var3.a(3, false);
        var3.a(9, false);
        var3.b(param0, false);
        if (param1 > -122) {
            g.a(39, (byte) -68, -123);
        }
    }

    private final void b(byte param0, int param1) {
        int var5 = TetraLink.field_J;
        int var4 = -66 / ((9 - param0) / 45);
        oc var3 = (oc) (Object) ((g) this).field_y.field_u.c(false);
        while (var3 != null) {
            if (-1 >= (param1 ^ -1)) {
                // if_icmpeq L57
            } else {
                if (var3.field_I != null) {
                    var3.field_I.g(nk.field_k / 100);
                    if (var3.field_I.g()) {
                        ((g) this).field_y.field_s.a((eb) (Object) var3.field_I);
                    }
                    var3.a(77);
                }
                if (0 > var3.field_v) {
                    ((g) this).field_B[var3.field_n][var3.field_E] = null;
                }
                var3.b(false);
            }
            var3 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
        }
    }

    final synchronized void a(boolean param0, ri param1, byte param2) {
        this.a(param1, 0, true, param0);
        if (param2 <= 1) {
            ((g) this).field_W = null;
        }
    }

    final synchronized eb c() {
        return null;
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        oc var4 = null;
        int var5 = 0;
        L0: {
          var5 = TetraLink.field_J;
          var3 = -107 / ((param1 - -65) / 51);
          if ((2 & ((g) this).field_I[param0] ^ -1) == -1) {
            break L0;
          } else {
            var4 = (oc) (Object) ((g) this).field_y.field_u.c(false);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L2: {
                  if ((var4.field_n ^ -1) != (param0 ^ -1)) {
                    break L2;
                  } else {
                    if (((g) this).field_B[param0][var4.field_E] == null) {
                      if (-1 >= (var4.field_v ^ -1)) {
                        break L2;
                      } else {
                        var4.field_v = 0;
                        break L2;
                      }
                    } else {
                      var4 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                      continue L1;
                    }
                  }
                }
                var4 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
                continue L1;
              }
            }
          }
        }
    }

    final synchronized void e(byte param0) {
        int var3 = TetraLink.field_J;
        if (param0 < 111) {
            int discarded$0 = ((g) this).a();
        }
        ng var4 = (ng) (Object) ((g) this).field_A.b(84);
        while (var4 != null) {
            var4.b((byte) -118);
            var4 = (ng) (Object) ((g) this).field_A.a(-1);
        }
    }

    final synchronized eb b() {
        return (eb) (Object) ((g) this).field_y;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        oc var5 = null;
        wf var6 = null;
        int var6_int = 0;
        oc var7 = null;
        oc var8 = null;
        int var9 = 0;
        ng var10 = null;
        ng var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        oc stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        oc stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        oc stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        oc stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        oc stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        oc stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = TetraLink.field_J;
          this.a(param0, (byte) 77, param3, 64);
          if ((((g) this).field_I[param3] & 2) == 0) {
            break L0;
          } else {
            var5 = (oc) (Object) ((g) this).field_y.field_u.d(true);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_n) {
                    break L2;
                  } else {
                    if (var5.field_v >= 0) {
                      break L2;
                    } else {
                      ((g) this).field_B[param3][var5.field_E] = null;
                      ((g) this).field_B[param3][param0] = var5;
                      var6_int = (var5.field_D * var5.field_u >> 813206924) + var5.field_x;
                      var5.field_x = var5.field_x + (-var5.field_E + param0 << 45013032);
                      var5.field_E = param0;
                      var5.field_D = 4096;
                      var5.field_u = -var5.field_x + var6_int;
                      return;
                    }
                  }
                }
                var5 = (oc) (Object) ((g) this).field_y.field_u.d((byte) 14);
                continue L1;
              }
            }
          }
        }
        var10 = (ng) (Object) ((g) this).field_A.a((long)((g) this).field_E[param3], (byte) -43);
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_z[param0];
          if (var6 != null) {
            L3: {
              var7 = new oc();
              var7.field_B = var11;
              var7.field_y = var6;
              var7.field_n = param3;
              var7.field_q = var10.field_v[param0];
              if (param2 == -25798) {
                break L3;
              } else {
                ((g) this).c(-115, -32);
                break L3;
              }
            }
            L4: {
              var7.field_C = var10.field_p[param0];
              var7.field_E = param0;
              var7.field_J = var10.field_A[param0] * (var11.field_C * param1 * param1) - -1024 >> -2137829141;
              var7.field_r = 255 & var10.field_w[param0];
              var7.field_x = (param0 << 1408036168) - (32767 & var10.field_o[param0]);
              var7.field_A = 0;
              var7.field_o = 0;
              var7.field_v = -1;
              var7.field_G = 0;
              var7.field_t = 0;
              if ((((g) this).field_G[param3] ^ -1) != -1) {
                L5: {
                  var7.field_I = ee.a(var6, this.a(-18511, var7), 0, this.a((byte) 24, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = 0;
                  stackOut_15_2 = (oc) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (-1 >= (var11.field_o[param0] ^ -1)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (oc) (Object) stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L5;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (oc) (Object) stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L5;
                  }
                }
                ((g) this).a(stackIn_18_1 != 0, stackIn_18_2, stackIn_18_3 != 0);
                break L4;
              } else {
                var7.field_I = ee.a(var6, this.a(-18511, var7), this.a(var7, 16402), this.a((byte) 87, var7));
                break L4;
              }
            }
            L6: {
              if (var11.field_o[param0] >= 0) {
                break L6;
              } else {
                var7.field_I.c(-1);
                break L6;
              }
            }
            L7: {
              if (0 <= var7.field_C) {
                L8: {
                  var8 = ((g) this).field_J[param3][var7.field_C];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (-1 < (var8.field_v ^ -1)) {
                      ((g) this).field_B[param3][var8.field_E] = null;
                      var8.field_v = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                ((g) this).field_J[param3][var7.field_C] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            ((g) this).field_y.field_u.a((mc) (Object) var7, false);
            ((g) this).field_B[param3][param0] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(byte param0, int param1) {
        int var3 = 97 / ((param0 - 45) / 38);
        ((g) this).field_X = param1;
    }

    private final void d(int param0, int param1, int param2) {
        if (param0 != -27508) {
            return;
        }
        ((g) this).field_Q[param1] = param2;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            ((g) this).field_Y = -94;
        }
    }

    final boolean a(int param0, int[] param1, int param2, oc param3, int param4) {
        int var6 = 0;
        lm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = TetraLink.field_J;
          param3.field_s = nk.field_k / 100;
          if (0 > param3.field_v) {
            break L0;
          } else {
            L1: {
              if (null == param3.field_I) {
                break L1;
              } else {
                if (param3.field_I.l()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.a(-121);
              param3.b(false);
              if (param3.field_C <= 0) {
                break L2;
              } else {
                if (((g) this).field_J[param3.field_n][param3.field_C] == param3) {
                  ((g) this).field_J[param3.field_n][param3.field_C] = null;
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
          var6 = param3.field_D;
          if (-1 > (var6 ^ -1)) {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((g) this).field_V[param3.field_n]));
              if (var6 < 0) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param3.field_D = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param3.field_I.d(this.a(-18511, param3));
          if (param4 == 21107) {
            break L5;
          } else {
            ((g) this).field_G = null;
            break L5;
          }
        }
        L6: {
          var7 = param3.field_q;
          param3.field_p = param3.field_p + var7.field_k;
          param3.field_H = param3.field_H + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param3.field_E + -60 << 209385224) - -(param3.field_D * param3.field_u >> 800976684));
          if (0 >= var7.field_a) {
            break L6;
          } else {
            L7: {
              if (var7.field_i <= 0) {
                param3.field_t = param3.field_t + 128;
                break L7;
              } else {
                param3.field_t = param3.field_t + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
                break L7;
              }
            }
            if (param3.field_t * var7.field_a < 819200) {
              break L6;
            } else {
              var8 = 1;
              break L6;
            }
          }
        }
        L8: {
          if (var7.field_d == null) {
            break L8;
          } else {
            L9: {
              if (-1 > (var7.field_b ^ -1)) {
                param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
                break L9;
              } else {
                param3.field_o = param3.field_o + 128;
                break L9;
              }
            }
            L10: while (true) {
              L11: {
                if (var7.field_d.length + -2 <= param3.field_G) {
                  break L11;
                } else {
                  if ((param3.field_o ^ -1) >= ((255 & var7.field_d[2 + param3.field_G]) << 2089748008 ^ -1)) {
                    break L11;
                  } else {
                    param3.field_G = param3.field_G + 2;
                    continue L10;
                  }
                }
              }
              if (var7.field_d.length + -2 != param3.field_G) {
                break L8;
              } else {
                if ((var7.field_d[param3.field_G + 1] ^ -1) == -1) {
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
          if (0 > param3.field_v) {
            break L12;
          } else {
            if (var7.field_e == null) {
              break L12;
            } else {
              if ((((g) this).field_I[param3.field_n] & 1 ^ -1) == -1) {
                L13: {
                  if (-1 < (param3.field_C ^ -1)) {
                    break L13;
                  } else {
                    if (((g) this).field_J[param3.field_n][param3.field_C] != param3) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                L14: {
                  if (var7.field_j > 0) {
                    param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_j * var9) + 0.5);
                    break L14;
                  } else {
                    param3.field_v = param3.field_v + 128;
                    break L14;
                  }
                }
                L15: while (true) {
                  L16: {
                    if ((-2 + var7.field_e.length ^ -1) >= (param3.field_A ^ -1)) {
                      break L16;
                    } else {
                      if ((var7.field_e[param3.field_A - -2] << -1188957240 & 65280) >= param3.field_v) {
                        break L16;
                      } else {
                        param3.field_A = param3.field_A + 2;
                        continue L15;
                      }
                    }
                  }
                  if (param3.field_A == var7.field_e.length - 2) {
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
        if (var8 == 0) {
          param3.field_I.a(param3.field_s, this.a(param3, 16402), this.a((byte) -118, param3));
          return false;
        } else {
          L17: {
            param3.field_I.g(param3.field_s);
            if (param1 != null) {
              param3.field_I.b(param1, param0, param2);
              break L17;
            } else {
              param3.field_I.a(param2);
              break L17;
            }
          }
          L18: {
            if (param3.field_I.g()) {
              ((g) this).field_y.field_s.a((eb) (Object) param3.field_I);
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            param3.a(59);
            if (param3.field_v < 0) {
              break L19;
            } else {
              param3.b(false);
              if (-1 <= (param3.field_C ^ -1)) {
                break L19;
              } else {
                if (((g) this).field_J[param3.field_n][param3.field_C] != param3) {
                  break L19;
                } else {
                  ((g) this).field_J[param3.field_n][param3.field_C] = null;
                  break L19;
                }
              }
            }
          }
          return true;
        }
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (0 <= param0) {
          L0: {
            if (param1 == 16384) {
              break L0;
            } else {
              this.b((byte) -88, 32);
              break L0;
            }
          }
          ((g) this).field_u[param0] = 12800;
          ((g) this).field_r[param0] = 8192;
          ((g) this).field_W[param0] = 16383;
          ((g) this).field_Q[param0] = 8192;
          ((g) this).field_t[param0] = 0;
          ((g) this).field_V[param0] = 8192;
          this.a(param0, (byte) 94);
          this.b(param0, -52);
          ((g) this).field_I[param0] = 0;
          ((g) this).field_v[param0] = 32767;
          ((g) this).field_K[param0] = 256;
          ((g) this).field_G[param0] = 0;
          this.f(param0, param1 + -3142, 8192);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.d(param0, 16384);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final synchronized void a(ri param0, int param1, boolean param2, boolean param3) {
        int var6 = 0;
        int var7 = TetraLink.field_J;
        this.a(487759088, param2);
        ((g) this).field_N.a(param0.field_o);
        ((g) this).field_x = param3 ? true : false;
        ((g) this).field_D = (long)param1;
        int var5 = ((g) this).field_N.e();
        for (var6 = 0; (var5 ^ -1) < (var6 ^ -1); var6++) {
            ((g) this).field_N.f(var6);
            ((g) this).field_N.e(var6);
            ((g) this).field_N.b(var6);
        }
        ((g) this).field_Y = ((g) this).field_N.g();
        ((g) this).field_S = ((g) this).field_N.field_g[((g) this).field_Y];
        ((g) this).field_C = ((g) this).field_N.d(((g) this).field_S);
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (!((param0 ^ -1) == (((g) this).field_E[param2] ^ -1))) {
            ((g) this).field_E[param2] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                ((g) this).field_J[param2][var4] = null;
            }
        }
        if (param1 != -2) {
            this.b(-10, -14);
        }
    }

    private final int a(int param0, oc param1) {
        int var3 = 0;
        lm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = (param1.field_D * param1.field_u >> 1333401036) + param1.field_x;
          var3 = var3 + (((g) this).field_K[param1.field_n] * (-8192 + ((g) this).field_Q[param1.field_n]) >> -1310617012);
          var4 = param1.field_q;
          if ((var4.field_k ^ -1) >= -1) {
            break L0;
          } else {
            L1: {
              if (-1 > (var4.field_c ^ -1)) {
                break L1;
              } else {
                if ((((g) this).field_t[param1.field_n] ^ -1) >= -1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = var4.field_c << 206066402;
              var6 = var4.field_h << 563193249;
              if (param1.field_H < var6) {
                var5 = var5 * param1.field_H / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((g) this).field_t[param1.field_n] >> 1347643367);
            var7 = Math.sin((double)(param1.field_p & 511) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L0;
          }
        }
        L3: {
          var5 = (int)(0.5 + (double)(param1.field_y.field_o * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)nk.field_k);
          if (param0 == -18511) {
            break L3;
          } else {
            ((g) this).field_v = null;
            break L3;
          }
        }
        L4: {
          if ((var5 ^ -1) > -2) {
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

    final synchronized boolean a(fa param0, ri param1, ah param2, int param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        ch var8 = null;
        int var9 = 0;
        int var11 = 0;
        ng var12 = null;
        ng var13 = null;
        L0: {
          var11 = TetraLink.field_J;
          param1.a();
          var6 = 1;
          var7 = null;
          if (param3 > (param4 ^ -1)) {
            var7_array = new int[]{param4};
            break L0;
          } else {
            break L0;
          }
        }
        var8 = (ch) (Object) param1.field_n.b(43);
        L1: while (true) {
          if (var8 == null) {
            L2: {
              if (var6 == 0) {
                break L2;
              } else {
                param1.b();
                break L2;
              }
            }
            return var6 != 0;
          } else {
            L3: {
              L4: {
                var9 = (int)var8.field_c;
                var12 = (ng) (Object) ((g) this).field_A.a((long)var9, (byte) -43);
                if (var12 == null) {
                  var13 = go.a(true, var9, param2);
                  if (var13 == null) {
                    var6 = 0;
                    break L3;
                  } else {
                    ((g) this).field_A.a((long)var9, -53, (mc) (Object) var13);
                    if (!var13.a(var7_array, param0, (byte) -114, var8.field_p)) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  if (!var12.a(var7_array, param0, (byte) -114, var8.field_p)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = 0;
              break L3;
            }
            var8 = (ch) (Object) param1.field_n.a(-1);
            continue L1;
          }
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        int var2 = param1.length();
        int var3 = 0;
        if (param0 != -1) {
            field_s = 79;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3 = rh.a(param1.charAt(var4), false) + (var3 << 1165239525) + -var3;
        }
        return var3;
    }

    final synchronized void d(int param0) {
        if (param0 <= 18) {
            Object var3 = null;
            g.a((String[]) null, (String) null, -80, (byte) 37);
        }
        this.a(487759088, true);
    }

    final synchronized void c(int param0, int param1) {
        ((g) this).field_R = param0;
        if (param1 > -9) {
            ((g) this).field_E = null;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var4 = TetraLink.field_J;
        if (param0) {
            this.b((byte) -100, -1);
        } else {
            this.e(-1, -120);
        }
        this.d(-1, 16384);
        int var3 = 0;
        if (param1 < 9) {
            this.a(-128, 56, -103, 34);
        }
        while (var3 < 16) {
            ((g) this).field_E[var3] = ((g) this).field_H[var3];
            var3++;
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((g) this).field_M[var5] = pl.a(((g) this).field_H[var5], -128);
            var5++;
        }
    }

    final void a(boolean param0, oc param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var4 = param1.field_y.field_s.length;
          if (!param0) {
            break L0;
          } else {
            var7 = null;
            this.a((ri) null, 123, false, false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!param2) {
              break L2;
            } else {
              if (!param1.field_y.field_p) {
                break L2;
              } else {
                var6 = -param1.field_y.field_q + var4 + var4;
                var4 = var4 << 8;
                var5 = (int)((long)var6 * (long)((g) this).field_G[param1.field_n] >> -15158330);
                if ((var5 ^ -1) <= (var4 ^ -1)) {
                  param1.field_I.a(true);
                  var5 = -1 + var4 + var4 + -var5;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = (int)((long)((g) this).field_G[param1.field_n] * (long)var4 >> -1931776634);
          break L1;
        }
        param1.field_I.e(var5);
    }

    private final void e(int param0, int param1) {
        int var4 = TetraLink.field_J;
        if (param1 >= -12) {
            ((g) this).field_M = null;
        }
        oc var3 = (oc) (Object) ((g) this).field_y.field_u.c(false);
        while (var3 != null) {
            if ((param0 ^ -1) <= -1) {
                // if_icmpne L106
            }
            if (!(0 <= var3.field_v)) {
                ((g) this).field_B[var3.field_n][var3.field_E] = null;
                var3.field_v = 0;
            }
            var3 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TetraLink.field_J;
          if (((g) this).field_N.f()) {
            var4 = ((g) this).field_R * ((g) this).field_N.field_f / nk.field_k;
            L1: while (true) {
              L2: {
                var5 = ((g) this).field_D - -((long)param2 * (long)var4);
                if ((-var5 + ((g) this).field_C ^ -1L) <= -1L) {
                  ((g) this).field_D = var5;
                  break L2;
                } else {
                  var7 = (int)((-1L + ((long)var4 + ((g) this).field_C - ((g) this).field_D)) / (long)var4);
                  ((g) this).field_D = ((g) this).field_D + (long)var4 * (long)var7;
                  ((g) this).field_y.b(param0, param1, var7);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  this.b((byte) 111);
                  if (!((g) this).field_N.f()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((g) this).field_y.b(param0, param1, param2);
              break L0;
            }
          } else {
            ((g) this).field_y.b(param0, param1, param2);
            break L0;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        oc var6 = null;
        int var7 = TetraLink.field_J;
        oc var8 = ((g) this).field_B[param2][param0];
        if (var8 == null) {
            return;
        }
        if (param1 != 77) {
            field_O = null;
        }
        ((g) this).field_B[param2][param0] = null;
        if (-1 == (((g) this).field_I[param2] & 2 ^ -1)) {
            var8.field_v = 0;
        } else {
            var6 = (oc) (Object) ((g) this).field_y.field_u.c(false);
            while (var6 != null) {
                if (var6.field_n == var8.field_n) {
                    if (0 > var6.field_v) {
                        if (var8 != var6) {
                            var8.field_v = 0;
                            break;
                        }
                    }
                }
                var6 = (oc) (Object) ((g) this).field_y.field_u.a((byte) -70);
            }
        }
    }

    public g() {
        ((g) this).field_r = new int[16];
        ((g) this).field_I = new int[16];
        ((g) this).field_R = 1000000;
        ((g) this).field_t = new int[16];
        ((g) this).field_X = 256;
        ((g) this).field_M = new int[16];
        ((g) this).field_K = new int[16];
        ((g) this).field_u = new int[16];
        ((g) this).field_H = new int[16];
        ((g) this).field_J = new oc[16][128];
        ((g) this).field_V = new int[16];
        ((g) this).field_B = new oc[16][128];
        ((g) this).field_v = new int[16];
        ((g) this).field_E = new int[16];
        ((g) this).field_T = new int[16];
        ((g) this).field_Q = new int[16];
        ((g) this).field_L = new int[16];
        ((g) this).field_G = new int[16];
        ((g) this).field_w = new int[16];
        ((g) this).field_W = new int[16];
        ((g) this).field_N = new wj();
        ((g) this).field_y = new wn((g) this);
        ((g) this).field_A = new dj(128);
        ((g) this).b(256, -1, 61);
        this.a(true, (byte) 49);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 1;
    }
}
