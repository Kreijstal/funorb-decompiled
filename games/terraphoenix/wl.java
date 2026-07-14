/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class wl extends lj {
    private int[] field_M;
    int[] field_q;
    private int[] field_C;
    private int[] field_N;
    private fk field_G;
    private int[] field_I;
    private il field_z;
    static pd field_Q;
    private int[] field_o;
    private int[] field_s;
    int[] field_S;
    private int[] field_F;
    private int[] field_A;
    private sh[][] field_O;
    private sh[][] field_J;
    static String field_y;
    private int[] field_n;
    private int field_l;
    private int[] field_u;
    private int field_P;
    int[] field_D;
    private int[] field_L;
    private int[] field_m;
    private int[] field_w;
    private long field_x;
    private int field_H;
    private vd field_t;
    private long field_r;
    private boolean field_p;
    private int field_E;
    private tk field_v;
    private int field_B;
    private boolean field_R;

    final synchronized void d(int param0) {
        int var3 = Terraphoenix.field_V;
        qd var4 = (qd) (Object) ((wl) this).field_z.a((byte) 117);
        while (var4 != null) {
            var4.d((byte) 39);
            var4 = (qd) (Object) ((wl) this).field_z.a(true);
        }
        if (param0 != -32499) {
            lj discarded$0 = ((wl) this).c();
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Terraphoenix.field_V;
          if (param1 == -18) {
            break L0;
          } else {
            var9 = null;
            int discarded$1 = this.a((byte) 16, (sh) null);
            break L0;
          }
        }
        var3 = 240 & param0;
        if (-129 == (var3 ^ -1)) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> -1473440184;
          var6 = param0 >> 32232848 & 127;
          this.a(var5, (byte) 117, var6, var4);
          return;
        } else {
          if (144 == var3) {
            var4 = param0 & 15;
            var5 = param0 >> -1885585368 & 127;
            var6 = 127 & param0 >> -435507856;
            if (-1 > (var6 ^ -1)) {
              this.a(var6, var5, var4, (byte) 53);
              return;
            } else {
              this.a(var5, (byte) 121, 64, var4);
              return;
            }
          } else {
            if (var3 != 160) {
              if ((var3 ^ -1) == -177) {
                L1: {
                  var4 = 15 & param0;
                  var5 = (param0 & 32748) >> -1572581624;
                  var6 = param0 >> -127916560 & 127;
                  if (0 != var5) {
                    break L1;
                  } else {
                    ((wl) this).field_u[var4] = (var6 << -1026604274) + dg.a(-2080769, ((wl) this).field_u[var4]);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 32) {
                    break L2;
                  } else {
                    ((wl) this).field_u[var4] = dg.a(-16257, ((wl) this).field_u[var4]) - -(var6 << -17725081);
                    break L2;
                  }
                }
                L3: {
                  if ((var5 ^ -1) == -2) {
                    ((wl) this).field_A[var4] = dg.a(-16257, ((wl) this).field_A[var4]) - -(var6 << -1581002873);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 != 33) {
                    break L4;
                  } else {
                    ((wl) this).field_A[var4] = var6 + dg.a(((wl) this).field_A[var4], -128);
                    break L4;
                  }
                }
                L5: {
                  if (var5 == 5) {
                    ((wl) this).field_m[var4] = (var6 << -704652921) + dg.a(((wl) this).field_m[var4], -16257);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((var5 ^ -1) == -38) {
                    ((wl) this).field_m[var4] = var6 + dg.a(((wl) this).field_m[var4], -128);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (7 == var5) {
                    ((wl) this).field_I[var4] = (var6 << 1091005287) + dg.a(-16257, ((wl) this).field_I[var4]);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 != -40) {
                    break L8;
                  } else {
                    ((wl) this).field_I[var4] = var6 + dg.a(-128, ((wl) this).field_I[var4]);
                    break L8;
                  }
                }
                L9: {
                  if (-11 != var5) {
                    break L9;
                  } else {
                    ((wl) this).field_w[var4] = (var6 << 941734471) + dg.a(((wl) this).field_w[var4], -16257);
                    break L9;
                  }
                }
                L10: {
                  if (-43 == (var5 ^ -1)) {
                    ((wl) this).field_w[var4] = var6 + dg.a(-128, ((wl) this).field_w[var4]);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (11 == var5) {
                    ((wl) this).field_N[var4] = (var6 << -1231762553) + dg.a(((wl) this).field_N[var4], -16257);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 43) {
                    ((wl) this).field_N[var4] = var6 + dg.a(((wl) this).field_N[var4], -128);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 == 64) {
                    if (var6 < 64) {
                      ((wl) this).field_q[var4] = dg.a(((wl) this).field_q[var4], -2);
                      break L13;
                    } else {
                      ((wl) this).field_q[var4] = ei.b(((wl) this).field_q[var4], 1);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var5 == -66) {
                    if (-65 <= var6) {
                      ((wl) this).field_q[var4] = ei.b(((wl) this).field_q[var4], 2);
                      break L14;
                    } else {
                      this.c(var4, 122);
                      ((wl) this).field_q[var4] = dg.a(((wl) this).field_q[var4], -3);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (-100 != (var5 ^ -1)) {
                    break L15;
                  } else {
                    ((wl) this).field_M[var4] = dg.a(127, ((wl) this).field_M[var4]) - -(var6 << 2091099655);
                    break L15;
                  }
                }
                L16: {
                  if (-99 != var5) {
                    break L16;
                  } else {
                    ((wl) this).field_M[var4] = var6 + dg.a(16256, ((wl) this).field_M[var4]);
                    break L16;
                  }
                }
                L17: {
                  if (-102 == var5) {
                    ((wl) this).field_M[var4] = (var6 << -1562264953) + (dg.a(127, ((wl) this).field_M[var4]) + 16384);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (-101 == (var5 ^ -1)) {
                    ((wl) this).field_M[var4] = var6 + (16384 + dg.a(16256, ((wl) this).field_M[var4]));
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-121 != var5) {
                    break L19;
                  } else {
                    this.b((byte) -125, var4);
                    break L19;
                  }
                }
                L20: {
                  if (121 == var5) {
                    this.a((byte) 100, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (-124 == var5) {
                    this.d(var4, param1 + 68);
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (-7 != (var5 ^ -1)) {
                    break L22;
                  } else {
                    var7 = ((wl) this).field_M[var4];
                    if (16384 == var7) {
                      ((wl) this).field_n[var4] = dg.a(-16257, ((wl) this).field_n[var4]) - -(var6 << -1199621177);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var5 == 38) {
                    var7 = ((wl) this).field_M[var4];
                    if (-16385 == var7) {
                      ((wl) this).field_n[var4] = dg.a(((wl) this).field_n[var4], -128) - -var6;
                      break L23;
                    } else {
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (-17 == var5) {
                    ((wl) this).field_S[var4] = (var6 << 1671262535) + dg.a(-16257, ((wl) this).field_S[var4]);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (var5 == 48) {
                    ((wl) this).field_S[var4] = var6 + dg.a(-128, ((wl) this).field_S[var4]);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (81 == var5) {
                    if (-65 < (var6 ^ -1)) {
                      this.a(var4, false);
                      ((wl) this).field_q[var4] = dg.a(((wl) this).field_q[var4], -5);
                      break L26;
                    } else {
                      ((wl) this).field_q[var4] = ei.b(((wl) this).field_q[var4], 4);
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (-18 != (var5 ^ -1)) {
                    break L27;
                  } else {
                    this.a((byte) -81, var4, (((wl) this).field_L[var4] & -16257) + (var6 << -694436633));
                    break L27;
                  }
                }
                L28: {
                  if (49 == var5) {
                    this.a((byte) -83, var4, (-128 & ((wl) this).field_L[var4]) - -var6);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              } else {
                if (var3 != 192) {
                  if (var3 != 208) {
                    if (var3 == 224) {
                      var4 = param0 & 15;
                      var5 = ((8323556 & param0) >> 1945967081) + (param0 >> 1757478248 & 127);
                      this.a(var4, var5, true);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if ((var3 ^ -1) != -256) {
                        return;
                      } else {
                        this.a(true, param1 + -12484);
                        return;
                      }
                    }
                  } else {
                    var4 = 15 & param0;
                    var5 = (32679 & param0) >> -1268042040;
                    this.b(var5, 3, var4);
                    return;
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = param0 >> -2126471480 & 127;
                  this.a(var5 + ((wl) this).field_u[var4], var4, (byte) 8);
                  return;
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = (32688 & param0) >> -471187256;
              var6 = (param0 & 8358526) >> 1501488944;
              this.a(var6, var5, -16257, var4);
              return;
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        int var4 = Terraphoenix.field_V;
        if (param1 < 9) {
            return;
        }
        sh var3 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
        while (var3 != null) {
            if (0 <= param0) {
                // if_icmpeq L52
            } else {
                if (!((var3.field_h ^ -1) <= -1)) {
                    ((wl) this).field_J[var3.field_v][var3.field_w] = null;
                    var3.field_h = 0;
                }
            }
            var3 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
        }
    }

    final synchronized lj c() {
        return (lj) (Object) ((wl) this).field_t;
    }

    final synchronized void a(boolean param0, byte param1, tk param2) {
        this.a(param0, param2, true, 0);
        int var4 = 46 / ((param1 - 83) / 41);
    }

    final static ud a(fa param0, int param1, fa param2, int param3, int param4) {
        if (param4 > -21) {
            Object var6 = null;
            java.net.URL discarded$0 = wl.a((java.net.URL) null, (String) null, (String) null, true, -103);
        }
        if (!vh.a(param1, param3, param2, true)) {
            return null;
        }
        return fm.a(param0.b(param1, 127, param3), 38);
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          var2 = ((wl) this).field_H;
          var3 = ((wl) this).field_E;
          var4 = ((wl) this).field_r;
          if (null == ((wl) this).field_v) {
            break L0;
          } else {
            if (var3 == ((wl) this).field_B) {
              this.a(((wl) this).field_p, ((wl) this).field_v, ((wl) this).field_R, 0);
              this.a(true);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((wl) this).field_E) {
            L2: {
              if (param0) {
                break L2;
              } else {
                ((wl) this).field_E = 104;
                break L2;
              }
            }
            L3: {
              ((wl) this).field_H = var2;
              ((wl) this).field_r = var4;
              ((wl) this).field_E = var3;
              if (((wl) this).field_v == null) {
                break L3;
              } else {
                if (((wl) this).field_B >= var3) {
                  break L3;
                } else {
                  ((wl) this).field_E = ((wl) this).field_B;
                  ((wl) this).field_H = -1;
                  ((wl) this).field_r = ((wl) this).field_G.b(((wl) this).field_E);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != ((wl) this).field_G.field_c[var2]) {
                  break L5;
                } else {
                  ((wl) this).field_G.c(var2);
                  var6 = ((wl) this).field_G.f(var2);
                  if (-2 == (var6 ^ -1)) {
                    ((wl) this).field_G.d();
                    ((wl) this).field_G.e(var2);
                    if (((wl) this).field_G.b()) {
                      if (null != ((wl) this).field_v) {
                        ((wl) this).a(((wl) this).field_p, (byte) 124, ((wl) this).field_v);
                        this.a(true);
                        return;
                      } else {
                        L6: {
                          if (!((wl) this).field_p) {
                            break L6;
                          } else {
                            if (-1 == (var3 ^ -1)) {
                              break L6;
                            } else {
                              ((wl) this).field_G.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, -12502);
                        ((wl) this).field_G.c();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if (0 == (128 & var6)) {
                        break L7;
                      } else {
                        this.b(var6, -18);
                        break L7;
                      }
                    }
                    ((wl) this).field_G.a(var2);
                    ((wl) this).field_G.e(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((wl) this).field_G.f();
              var3 = ((wl) this).field_G.field_c[var2];
              var4 = ((wl) this).field_G.b(var3);
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        sh var3 = null;
        int var4 = Terraphoenix.field_V;
        if (param1) {
            return;
        }
        if (!(0 == (4 & ((wl) this).field_q[param0]))) {
            var3 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
            while (var3 != null) {
                if (!(param0 != var3.field_v)) {
                    var3.field_A = 0;
                }
                var3 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
            }
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void c(int param0, int param1) {
        sh var3_ref_sh = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Terraphoenix.field_V;
          if ((2 & ((wl) this).field_q[param0]) != 0) {
            var3_ref_sh = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
            L1: while (true) {
              if (var3_ref_sh == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var3_ref_sh.field_v) {
                    break L2;
                  } else {
                    if (((wl) this).field_J[param0][var3_ref_sh.field_w] == null) {
                      if ((var3_ref_sh.field_h ^ -1) <= -1) {
                        break L2;
                      } else {
                        var3_ref_sh.field_h = 0;
                        break L2;
                      }
                    } else {
                      var3_ref_sh = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
                      continue L1;
                    }
                  }
                }
                var3_ref_sh = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var3 = 115 / ((55 - param1) / 56);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Terraphoenix.field_V;
          if (((wl) this).field_G.e()) {
            var4 = ((wl) this).field_l * ((wl) this).field_G.field_e / nk.field_u;
            L1: while (true) {
              L2: {
                var5 = ((wl) this).field_x - -((long)param2 * (long)var4);
                if (-var5 + ((wl) this).field_r < 0L) {
                  var7 = (int)((((wl) this).field_r - ((wl) this).field_x - (-(long)var4 + 1L)) / (long)var4);
                  ((wl) this).field_x = ((wl) this).field_x + (long)var7 * (long)var4;
                  ((wl) this).field_t.a(param0, param1, var7);
                  param1 = param1 + var7;
                  this.a(true);
                  param2 = param2 - var7;
                  if (!((wl) this).field_G.e()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  ((wl) this).field_x = var5;
                  break L2;
                }
              }
              ((wl) this).field_t.a(param0, param1, param2);
              break L0;
            }
          } else {
            ((wl) this).field_t.a(param0, param1, param2);
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 != -16257) {
            this.a(111, 117, (byte) -26);
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = Terraphoenix.field_V;
        sh var3 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
        while (var3 != null) {
            if (param1 >= 0) {
                // if_icmpne L156
            }
            if (!(null == var3.field_k)) {
                var3.field_k.c(nk.field_u / 100);
                if (!(!var3.field_k.k())) {
                    ((wl) this).field_t.field_m.a((lj) (Object) var3.field_k);
                }
                var3.c((byte) -111);
            }
            if (-1 < (var3.field_h ^ -1)) {
                ((wl) this).field_J[var3.field_v][var3.field_w] = null;
            }
            var3.b((byte) 12);
            var3 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
        }
        if (param0 > -111) {
            ((wl) this).field_M = null;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        qd var5 = null;
        sh var5_ref = null;
        int var6 = 0;
        gg var7 = null;
        sh var8 = null;
        sh var9 = null;
        int var10 = 0;
        qd var11 = null;
        qd var12 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var10 = Terraphoenix.field_V;
          this.a(param1, (byte) 119, 64, param2);
          if ((2 & ((wl) this).field_q[param2]) == 0) {
            break L0;
          } else {
            var5_ref = (sh) (Object) ((wl) this).field_t.field_n.c((byte) -81);
            L1: while (true) {
              if (var5_ref == null) {
                break L0;
              } else {
                L2: {
                  if (param2 != var5_ref.field_v) {
                    break L2;
                  } else {
                    if (var5_ref.field_h >= 0) {
                      break L2;
                    } else {
                      ((wl) this).field_J[param2][var5_ref.field_w] = null;
                      ((wl) this).field_J[param2][param1] = var5_ref;
                      var6 = var5_ref.field_j - -(var5_ref.field_D * var5_ref.field_u >> -1292832948);
                      var5_ref.field_j = var5_ref.field_j + (-var5_ref.field_w + param1 << 389509512);
                      var5_ref.field_u = 4096;
                      var5_ref.field_w = param1;
                      var5_ref.field_D = -var5_ref.field_j + var6;
                      return;
                    }
                  }
                }
                var5_ref = (sh) (Object) ((wl) this).field_t.field_n.b(-87);
                continue L1;
              }
            }
          }
        }
        var11 = (qd) (Object) ((wl) this).field_z.a((byte) 46, (long)((wl) this).field_s[param2]);
        var12 = var11;
        var5 = var12;
        if (var12 == null) {
          return;
        } else {
          var6 = 23 / ((-44 - param3) / 52);
          var7 = var11.field_n[param1];
          if (var7 == null) {
            return;
          } else {
            L3: {
              var8 = new sh();
              var8.field_B = var12;
              var8.field_v = param2;
              var8.field_F = var7;
              var8.field_m = var11.field_q[param1];
              var8.field_C = var11.field_m[param1];
              var8.field_w = param1;
              var8.field_s = 1024 + param0 * param0 * (var11.field_k * var11.field_s[param1]) >> 1218591083;
              var8.field_p = 255 & var11.field_r[param1];
              var8.field_j = -(var11.field_p[param1] & 32767) + (param1 << -1404386776);
              var8.field_i = 0;
              var8.field_t = 0;
              var8.field_o = 0;
              var8.field_G = 0;
              var8.field_h = -1;
              if (((wl) this).field_S[param2] == 0) {
                var8.field_k = lh.a(var7, this.a((byte) 92, var8), this.a(var8, (byte) -49), this.a(true, var8));
                break L3;
              } else {
                L4: {
                  var8.field_k = lh.a(var7, this.a((byte) 78, var8), 0, this.a(true, var8));
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var11.field_p[param1] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L4;
                  }
                }
                ((wl) this).a(stackIn_17_1 != 0, var8, 120);
                break L3;
              }
            }
            L5: {
              if (var11.field_p[param1] >= 0) {
                break L5;
              } else {
                var8.field_k.g(-1);
                break L5;
              }
            }
            L6: {
              if ((var8.field_C ^ -1) > -1) {
                break L6;
              } else {
                L7: {
                  var9 = ((wl) this).field_O[param2][var8.field_C];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if ((var9.field_h ^ -1) > -1) {
                      ((wl) this).field_J[param2][var9.field_w] = null;
                      var9.field_h = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((wl) this).field_O[param2][var8.field_C] = var8;
                break L6;
              }
            }
            ((wl) this).field_t.field_n.a((uf) (Object) var8, -16611);
            ((wl) this).field_J[param2][param1] = var8;
            return;
          }
        }
    }

    private final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          if (param1) {
            break L0;
          } else {
            this.a(80, -97, true);
            break L0;
          }
        }
        L1: {
          if (param0 >= 0) {
            ((wl) this).field_C[param0] = param2;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -17) {
                break L1;
              } else {
                ((wl) this).field_C[var4] = param2;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Terraphoenix.field_V;
          if (((wl) this).field_G.e()) {
            var2 = ((wl) this).field_G.field_e * ((wl) this).field_l / nk.field_u;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + ((wl) this).field_x;
                if (0L <= ((wl) this).field_r - var3) {
                  ((wl) this).field_x = var3;
                  break L2;
                } else {
                  var5 = (int)(((long)var2 + -((wl) this).field_x + (((wl) this).field_r + -1L)) / (long)var2);
                  ((wl) this).field_x = ((wl) this).field_x + (long)var5 * (long)var2;
                  ((wl) this).field_t.a(var5);
                  param0 = param0 - var5;
                  this.a(true);
                  if (!((wl) this).field_G.e()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((wl) this).field_t.a(param0);
              break L0;
            }
          } else {
            ((wl) this).field_t.a(param0);
            break L0;
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        if (param2 != 8) {
            this.a((byte) -97, -97, 22);
        }
        if (((wl) this).field_s[param1] != param0) {
            ((wl) this).field_s[param1] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                ((wl) this).field_O[param1][var4] = null;
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        ((wl) this).field_L[param1] = param2;
        ((wl) this).field_D[param1] = (int)(Math.pow(2.0, (double)param2 * 0.00054931640625) * 2097152.0 + 0.5);
        if (param0 > -15) {
            this.a(false);
        }
    }

    private final int a(boolean param0, sh param1) {
        if (!param0) {
            Object var4 = null;
            java.net.URL discarded$0 = wl.a((java.net.URL) null, (String) null, (String) null, true, 17);
        }
        int var3 = ((wl) this).field_w[param1.field_v];
        if (8192 <= var3) {
            return -(32 + (128 - param1.field_p) * (16384 + -var3) >> -360512954) + 16384;
        }
        return 32 + param1.field_p * var3 >> 431720422;
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Terraphoenix.field_V;
          if (param3 < 2) {
            break L0;
          } else {
            if (36 >= param3) {
              var4 = 0;
              var5 = param2 ? 1 : 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  if (var5 != 0) {
                    return var6;
                  } else {
                    throw new NumberFormatException();
                  }
                } else {
                  L2: {
                    var9 = param1.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L2;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L2;
                        } else {
                          if (!param0) {
                            break L2;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L1;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (48 > var9) {
                        break L4;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (65 > var9) {
                        break L5;
                      } else {
                        if (90 < var9) {
                          break L5;
                        } else {
                          var9 -= 55;
                          break L3;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 97) {
                        break L6;
                      } else {
                        if (122 < var9) {
                          break L6;
                        } else {
                          var9 -= 87;
                          break L3;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (param3 <= var9) {
                    throw new NumberFormatException();
                  } else {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = param3 * var6 - -var9;
                    if (var10 / param3 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final boolean a(byte param0, int[] param1, int param2, sh param3, int param4) {
        int var6 = 0;
        gm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Terraphoenix.field_V;
          param3.field_y = nk.field_u / 100;
          if (0 > param3.field_h) {
            break L0;
          } else {
            L1: {
              if (null == param3.field_k) {
                break L1;
              } else {
                if (param3.field_k.i()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.c((byte) -120);
              param3.b((byte) 12);
              if (param3.field_C <= 0) {
                break L2;
              } else {
                if (param3 == ((wl) this).field_O[param3.field_v][param3.field_C]) {
                  ((wl) this).field_O[param3.field_v][param3.field_C] = null;
                  break L2;
                } else {
                  return true;
                }
              }
            }
            return true;
          }
        }
        if (param0 >= 76) {
          L3: {
            var6 = param3.field_u;
            if (0 >= var6) {
              break L3;
            } else {
              L4: {
                var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((wl) this).field_m[param3.field_v] * 0.0004921259842519685));
                if ((var6 ^ -1) > -1) {
                  var6 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              param3.field_u = var6;
              break L3;
            }
          }
          L5: {
            param3.field_k.f(this.a((byte) 72, param3));
            var7 = param3.field_m;
            var8 = 0;
            param3.field_l = param3.field_l + 1;
            param3.field_r = param3.field_r + var7.field_d;
            var9 = 0.000005086263020833333 * (double)((-60 + param3.field_w << 484567496) + (param3.field_D * param3.field_u >> 588756300));
            if (-1 > (var7.field_i ^ -1)) {
              L6: {
                if ((var7.field_e ^ -1) >= -1) {
                  param3.field_o = param3.field_o + 128;
                  break L6;
                } else {
                  param3.field_o = param3.field_o + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
                  break L6;
                }
              }
              if (-819201 < (var7.field_i * param3.field_o ^ -1)) {
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
            if (var7.field_h != null) {
              L8: {
                if (var7.field_b <= 0) {
                  param3.field_i = param3.field_i + 128;
                  break L8;
                } else {
                  param3.field_i = param3.field_i + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_b * var9));
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (var7.field_h.length - 2 <= param3.field_G) {
                    break L10;
                  } else {
                    if ((var7.field_h[2 + param3.field_G] & 255) << 2221064 >= param3.field_i) {
                      break L10;
                    } else {
                      param3.field_G = param3.field_G + 2;
                      continue L9;
                    }
                  }
                }
                if (param3.field_G != var7.field_h.length + -2) {
                  break L7;
                } else {
                  if (-1 != var7.field_h[param3.field_G - -1]) {
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
            if (-1 > param3.field_h) {
              break L11;
            } else {
              if (null == var7.field_g) {
                break L11;
              } else {
                if ((((wl) this).field_q[param3.field_v] & 1) != 0) {
                  break L11;
                } else {
                  L12: {
                    if ((param3.field_C ^ -1) > -1) {
                      break L12;
                    } else {
                      if (((wl) this).field_O[param3.field_v][param3.field_C] != param3) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (-1 > (var7.field_k ^ -1)) {
                      param3.field_h = param3.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
                      break L13;
                    } else {
                      param3.field_h = param3.field_h + 128;
                      break L13;
                    }
                  }
                  L14: while (true) {
                    L15: {
                      if (param3.field_t >= var7.field_g.length - 2) {
                        break L15;
                      } else {
                        if (param3.field_h <= (255 & var7.field_g[param3.field_t + 2]) << -1933761016) {
                          break L15;
                        } else {
                          param3.field_t = param3.field_t + 2;
                          continue L14;
                        }
                      }
                    }
                    if (var7.field_g.length + -2 == param3.field_t) {
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
            param3.field_k.a(param3.field_y, this.a(param3, (byte) -49), this.a(true, param3));
            return false;
          } else {
            L16: {
              param3.field_k.c(param3.field_y);
              if (param1 == null) {
                param3.field_k.a(param2);
                break L16;
              } else {
                param3.field_k.a(param1, param4, param2);
                break L16;
              }
            }
            L17: {
              if (!param3.field_k.k()) {
                break L17;
              } else {
                ((wl) this).field_t.field_m.a((lj) (Object) param3.field_k);
                break L17;
              }
            }
            L18: {
              param3.c((byte) -120);
              if (0 <= param3.field_h) {
                param3.b((byte) 12);
                if ((param3.field_C ^ -1) >= -1) {
                  break L18;
                } else {
                  if (((wl) this).field_O[param3.field_v][param3.field_C] == param3) {
                    ((wl) this).field_O[param3.field_v][param3.field_C] = null;
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
        } else {
          return false;
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 <= 40) {
            Object var2 = null;
            int discarded$0 = wl.a(true, (CharSequence) null, true, -55);
        }
        field_Q = null;
    }

    final synchronized lj a() {
        return null;
    }

    final void a(boolean param0, sh param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param2 >= 91) {
            break L0;
          } else {
            ((wl) this).field_S = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param1.field_F.field_k.length;
            if (!param0) {
              break L2;
            } else {
              if (!param1.field_F.field_i) {
                break L2;
              } else {
                var6 = -param1.field_F.field_j + var4 - -var4;
                var4 = var4 << 8;
                var5 = (int)((long)((wl) this).field_S[param1.field_v] * (long)var6 >> -789754938);
                if (var5 >= var4) {
                  param1.field_k.a(true);
                  var5 = -var5 + (-1 + (var4 - -var4));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = (int)((long)var4 * (long)((wl) this).field_S[param1.field_v] >> 436995462);
          break L1;
        }
        param1.field_k.d(var5);
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = -19 % ((param1 - -81) / 36);
    }

    private final synchronized void a(boolean param0, tk param1, boolean param2, int param3) {
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        this.a(param2, (byte) 92);
        ((wl) this).field_G.a(param1.field_i);
        ((wl) this).field_x = 0L;
        ((wl) this).field_p = param0 ? true : false;
        int var5 = ((wl) this).field_G.g();
        for (var6 = param3; var5 > var6; var6++) {
            ((wl) this).field_G.c(var6);
            ((wl) this).field_G.a(var6);
            ((wl) this).field_G.e(var6);
        }
        ((wl) this).field_H = ((wl) this).field_G.f();
        ((wl) this).field_E = ((wl) this).field_G.field_c[((wl) this).field_H];
        ((wl) this).field_r = ((wl) this).field_G.b(((wl) this).field_E);
    }

    private final int a(sh param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(-1 != (((wl) this).field_C[param0.field_v] ^ -1))) {
            return 0;
        }
        gm var9 = param0.field_m;
        gm var10 = var9;
        int var4 = ((wl) this).field_I[param0.field_v] * ((wl) this).field_N[param0.field_v] - -4096 >> -1829384147;
        var4 = var4 * var4 + 16384 >> 176859823;
        if (param1 != -49) {
            return 2;
        }
        var4 = 16384 + param0.field_s * var4 >> 1741665167;
        var4 = var4 * ((wl) this).field_P - -128 >> -1615683320;
        var4 = 128 + ((wl) this).field_C[param0.field_v] * var4 >> -2072513080;
        if (!(0 >= var10.field_i)) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_o)) * (double)var4);
        }
        if (!(var10.field_h == null)) {
            var5 = param0.field_i;
            var6 = var10.field_h[1 + param0.field_G];
            if (var10.field_h.length + -2 > param0.field_G) {
                var7 = (255 & var9.field_h[param0.field_G]) << 1675295624;
                var8 = (255 & var10.field_h[2 + param0.field_G]) << -1053096376;
                var6 = var6 + (-var6 + var10.field_h[param0.field_G + 3]) * (var5 - var7) / (var8 - var7);
            }
            var4 = var6 * var4 - -32 >> 1259790822;
        }
        if (0 < param0.field_h) {
            if (!(null == var10.field_g)) {
                var5 = param0.field_h;
                var6 = var10.field_g[param0.field_t + 1];
                if (!(var10.field_g.length + -2 <= param0.field_t)) {
                    var7 = (var9.field_g[param0.field_t] & 255) << -1572259928;
                    var8 = 65280 & var10.field_g[2 + param0.field_t] << 1503867720;
                    var6 = var6 + (var5 - var7) * (-var6 + var10.field_g[3 + param0.field_t]) / (var8 - var7);
                }
                var4 = var4 * var6 + 32 >> -512401754;
            }
        }
        return var4;
    }

    final static java.net.URL a(java.net.URL param0, String param1, String param2, boolean param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_43_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            var9 = Terraphoenix.field_V;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 >= (var7_int ^ -1)) {
                    if (param4 >= 0) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int >= 0) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if ((var7_int ^ -1) <= -1) {
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 - -1);
                if (0 > var7_int) {
                  break L4;
                } else {
                  if (param1 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if ((param4 ^ -1) >= -1) {
                  break L6;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param4));
                  break L6;
                }
              }
              L7: {
                if (param2 == null) {
                  break L7;
                } else {
                  if ((param2.length() ^ -1) < -1) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param2);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (param1 == null) {
                  break L8;
                } else {
                  if ((param1.length() ^ -1) < -1) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                }
              }
              if (!param3) {
                try {
                  stackOut_42_0 = new java.net.URL(param0, var7.toString());
                  stackIn_43_0 = stackOut_42_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_43_0;
                }
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        if (param0) {
            this.b((byte) -127, -1);
        } else {
            this.d(-1, param1 + 12574);
        }
        this.a((byte) 100, -1);
        for (var3 = 0; 16 > var3; var3++) {
            ((wl) this).field_s[var3] = ((wl) this).field_o[var3];
        }
        if (param1 != -12502) {
            ((wl) this).a(0, -41, 111);
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((wl) this).field_u[var5] = dg.a(-128, ((wl) this).field_o[var5]);
            var5++;
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = Terraphoenix.field_V;
          if (param0 == 100) {
            break L0;
          } else {
            ((wl) this).field_C = null;
            break L0;
          }
        }
        if ((param1 ^ -1) > -1) {
          param1 = 0;
          L1: while (true) {
            if (16 <= param1) {
              return;
            } else {
              this.a((byte) 100, param1);
              param1++;
              continue L1;
            }
          }
        } else {
          ((wl) this).field_I[param1] = 12800;
          ((wl) this).field_w[param1] = 8192;
          ((wl) this).field_N[param1] = 16383;
          ((wl) this).field_F[param1] = 8192;
          ((wl) this).field_A[param1] = 0;
          ((wl) this).field_m[param1] = 8192;
          this.c(param1, 117);
          this.a(param1, false);
          ((wl) this).field_q[param1] = 0;
          ((wl) this).field_M[param1] = 32767;
          ((wl) this).field_n[param1] = 256;
          ((wl) this).field_S[param1] = 0;
          this.a((byte) -55, param1, 8192);
          return;
        }
    }

    final boolean a(sh param0, int param1) {
        if (param1 != 16384) {
            ((wl) this).field_F = null;
        }
        if (param0.field_k != null) {
            return false;
        }
        if (!(-1 < (param0.field_h ^ -1))) {
            param0.b((byte) 12);
            if (0 < param0.field_C) {
                if (param0 == ((wl) this).field_O[param0.field_v][param0.field_C]) {
                    ((wl) this).field_O[param0.field_v][param0.field_C] = null;
                }
            }
        }
        return true;
    }

    private final synchronized void a(boolean param0, byte param1) {
        ((wl) this).field_G.c();
        ((wl) this).field_v = null;
        this.a(param0, -12502);
        if (param1 <= 73) {
            ((wl) this).field_l = 42;
        }
    }

    private final int a(byte param0, sh param1) {
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param0 >= 59) {
            break L0;
          } else {
            int discarded$1 = ((wl) this).d();
            break L0;
          }
        }
        L1: {
          var3 = param1.field_j - -(param1.field_u * param1.field_D >> -152537972);
          var3 = var3 + (((wl) this).field_n[param1.field_v] * (((wl) this).field_F[param1.field_v] + -8192) >> -2029127892);
          var4 = param1.field_m;
          if (0 >= var4.field_d) {
            break L1;
          } else {
            L2: {
              if ((var4.field_m ^ -1) < -1) {
                break L2;
              } else {
                if ((((wl) this).field_A[param1.field_v] ^ -1) >= -1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = var4.field_m << 938751938;
              var6 = var4.field_c << -1799457759;
              if (param1.field_l < var6) {
                var5 = var5 * param1.field_l / var6;
                break L3;
              } else {
                break L3;
              }
            }
            var5 = var5 + (((wl) this).field_A[param1.field_v] >> 1558987687);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_r & 511));
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)(0.5 + (double)(256 * param1.field_F.field_l) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)nk.field_u);
          if (1 > var5) {
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

    final synchronized boolean a(fa param0, da param1, tk param2, int param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        int[] var7_array = null;
        sb var8 = null;
        int var9 = 0;
        int var11 = 0;
        qd var12 = null;
        qd var13 = null;
        L0: {
          var11 = Terraphoenix.field_V;
          param2.a();
          var6 = 1;
          var7 = null;
          if (0 < param4) {
            var7_array = new int[]{param4};
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 == 128) {
            break L1;
          } else {
            this.a(true, (byte) -20);
            break L1;
          }
        }
        var8 = (sb) (Object) param2.field_h.a((byte) 117);
        L2: while (true) {
          if (var8 == null) {
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                param2.b();
                break L3;
              }
            }
            return var6 != 0;
          } else {
            L4: {
              var9 = (int)var8.field_g;
              var12 = (qd) (Object) ((wl) this).field_z.a((byte) 46, (long)var9);
              if (var12 == null) {
                var13 = kf.a(var9, (byte) 122, param0);
                if (var13 == null) {
                  var6 = 0;
                  break L4;
                } else {
                  ((wl) this).field_z.a((uf) (Object) var13, (long)var9, (byte) -81);
                  if (var13.a(var8.field_o, var7_array, 0, param1)) {
                    break L4;
                  } else {
                    var6 = 0;
                    break L4;
                  }
                }
              } else {
                if (var12.a(var8.field_o, var7_array, 0, param1)) {
                  break L4;
                } else {
                  var6 = 0;
                  var8 = (sb) (Object) param2.field_h.a(true);
                  continue L2;
                }
              }
            }
            var8 = (sb) (Object) param2.field_h.a(true);
            continue L2;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((wl) this).field_o[param0] = param1;
        ((wl) this).field_u[param0] = dg.a(-128, param1);
        if (param2 != -5368) {
            return;
        }
        this.a(param1, param0, (byte) 8);
    }

    final synchronized boolean c(int param0) {
        if (param0 >= -90) {
            Object var3 = null;
            this.a(true, (tk) null, false, 78);
        }
        return ((wl) this).field_G.e();
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        sh var7 = null;
        int var8 = Terraphoenix.field_V;
        sh var9 = ((wl) this).field_J[param3][param0];
        if (!(var9 != null)) {
            return;
        }
        ((wl) this).field_J[param3][param0] = null;
        int var6 = 37 / ((param1 - 40) / 61);
        if (-1 == (2 & ((wl) this).field_q[param3] ^ -1)) {
            var9.field_h = 0;
        } else {
            var7 = (sh) (Object) ((wl) this).field_t.field_n.d(9272);
            while (var7 != null) {
                if (var7.field_v == var9.field_v) {
                    if (-1 < (var7.field_h ^ -1)) {
                        if (var7 != var9) {
                            var9.field_h = 0;
                            break;
                        }
                    }
                }
                var7 = (sh) (Object) ((wl) this).field_t.field_n.e((byte) -119);
            }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        if (!param2) {
            this.b(-80, -105);
        }
        ((wl) this).field_F[param0] = param1;
    }

    final synchronized void e(int param0, int param1) {
        if (param1 >= -83) {
            return;
        }
        ((wl) this).field_P = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0, param1, -5368);
        if (param2 > -8) {
            this.c(-93, 57);
        }
    }

    public wl() {
        ((wl) this).field_q = new int[16];
        ((wl) this).field_S = new int[16];
        ((wl) this).field_N = new int[16];
        ((wl) this).field_A = new int[16];
        ((wl) this).field_F = new int[16];
        ((wl) this).field_l = 1000000;
        ((wl) this).field_O = new sh[16][128];
        ((wl) this).field_s = new int[16];
        ((wl) this).field_n = new int[16];
        ((wl) this).field_C = new int[16];
        ((wl) this).field_I = new int[16];
        ((wl) this).field_J = new sh[16][128];
        ((wl) this).field_M = new int[16];
        ((wl) this).field_L = new int[16];
        ((wl) this).field_P = 256;
        ((wl) this).field_m = new int[16];
        ((wl) this).field_D = new int[16];
        ((wl) this).field_u = new int[16];
        ((wl) this).field_o = new int[16];
        ((wl) this).field_w = new int[16];
        ((wl) this).field_G = new fk();
        ((wl) this).field_t = new vd((wl) this);
        ((wl) this).field_z = new il(128);
        this.a(-1, true, 256);
        this.a(true, -12502);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "HC-3 FG";
    }
}
