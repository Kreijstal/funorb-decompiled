/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class di extends um {
    private int field_Q;
    private int[] field_P;
    static String field_cb;
    private cg[][] field_gb;
    static int[] field_V;
    private int[] field_w;
    static int field_K;
    private int field_r;
    private int[] field_db;
    private int[] field_S;
    private int[] field_H;
    private tg field_F;
    static cl field_D;
    static ea field_ab;
    private int[] field_I;
    private int[] field_R;
    private int[] field_y;
    private int[] field_B;
    static gi field_O;
    static int field_Z;
    int[] field_Y;
    private int[] field_T;
    private nl field_eb;
    int[] field_u;
    private cg[][] field_U;
    int[] field_v;
    private int[] field_J;
    private int[] field_s;
    static String field_E;
    private int[] field_N;
    static int[] field_x;
    static int field_X;
    private long field_fb;
    private int field_W;
    private int field_bb;
    private gd field_z;
    private boolean field_C;
    private long field_t;
    private wh field_L;
    private boolean field_A;
    private int field_M;

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        if (param0) {
            this.a(-1, -10911);
        } else {
            this.e(-1, param1 ^ -21498);
        }
        this.b(-1, 0);
        for (var3 = 0; var3 < 16; var3++) {
            ((di) this).field_J[var3] = ((di) this).field_y[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (-17 < (var5 ^ -1)) {
            ((di) this).field_B[var5] = c.a(((di) this).field_y[var5], -128);
            var5++;
        }
        if (param1 != -21400) {
            um discarded$0 = ((di) this).b();
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = MinerDisturbance.field_ab;
          if (!((di) this).field_eb.e()) {
            break L0;
          } else {
            var4 = ((di) this).field_eb.field_g * ((di) this).field_r / fj.field_r;
            L1: while (true) {
              var5 = ((di) this).field_fb - -((long)var4 * (long)param2);
              if (-1L >= (-var5 + ((di) this).field_t ^ -1L)) {
                ((di) this).field_fb = var5;
                break L0;
              } else {
                var7 = (int)((-1L + ((di) this).field_t - (((di) this).field_fb - (long)var4)) / (long)var4);
                ((di) this).field_fb = ((di) this).field_fb + (long)var4 * (long)var7;
                ((di) this).field_z.a(param0, param1, var7);
                param2 = param2 - var7;
                this.f(128);
                param1 = param1 + var7;
                if (!((di) this).field_eb.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((di) this).field_z.a(param0, param1, param2);
    }

    final synchronized um c() {
        return null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        if (!(!param1.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (param1.equals((Object) (Object) "S")) {
            return Short.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (param1.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (param0 <= 36) {
            int discarded$0 = di.a(true);
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    private final void a(int param0, byte param1, int param2) {
        ((di) this).field_s[param0] = param2;
        ((di) this).field_u[param0] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param1 < 95) {
            ((di) this).field_I = null;
        }
    }

    private final int a(byte param0, cg param1) {
        int var3 = ((di) this).field_N[param1.field_n];
        if (param0 < 82) {
            ((di) this).field_y = null;
        }
        if (-8193 < (var3 ^ -1)) {
            return var3 * param1.field_E - -32 >> 529482790;
        }
        return 16384 - ((128 - param1.field_E) * (-var3 + 16384) + 32 >> 1942367750);
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((di) this).field_eb.f();
        ((di) this).field_L = null;
        if (!param1) {
            return;
        }
        this.b(param0, -21400);
    }

    final boolean a(int param0, cg param1, int param2, int[] param3, int param4) {
        int var6 = 0;
        ng var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = MinerDisturbance.field_ab;
          param1.field_M = fj.field_r / 100;
          if (0 > param1.field_G) {
            break L0;
          } else {
            L1: {
              if (null == param1.field_w) {
                break L1;
              } else {
                if (param1.field_w.k()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param1.a((byte) -103);
              param1.b(34);
              if (-1 <= (param1.field_J ^ -1)) {
                break L2;
              } else {
                if (param1 == ((di) this).field_U[param1.field_n][param1.field_J]) {
                  ((di) this).field_U[param1.field_n][param1.field_J] = null;
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
          var6 = param1.field_y;
          if (var6 > 0) {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((di) this).field_T[param1.field_n] * 0.0004921259842519685));
              if (var6 >= 0) {
                break L4;
              } else {
                var6 = 0;
                break L4;
              }
            }
            param1.field_y = var6;
            break L3;
          } else {
            break L3;
          }
        }
        param1.field_w.h(this.a(-87, param1));
        if (param2 == 1387831944) {
          L5: {
            var7 = param1.field_z;
            param1.field_A = param1.field_A + var7.field_j;
            var8 = 0;
            param1.field_q = param1.field_q + 1;
            var9 = 0.000005086263020833333 * (double)((param1.field_F + -60 << 1289161608) - -(param1.field_L * param1.field_y >> 2037935564));
            if (var7.field_m <= 0) {
              break L5;
            } else {
              L6: {
                if (0 < var7.field_d) {
                  param1.field_x = param1.field_x + (int)(Math.pow(2.0, (double)var7.field_d * var9) * 128.0 + 0.5);
                  break L6;
                } else {
                  param1.field_x = param1.field_x + 128;
                  break L6;
                }
              }
              if (-819201 < (param1.field_x * var7.field_m ^ -1)) {
                break L5;
              } else {
                var8 = 1;
                break L5;
              }
            }
          }
          L7: {
            if (var7.field_b == null) {
              break L7;
            } else {
              L8: {
                if (var7.field_a <= 0) {
                  param1.field_v = param1.field_v + 128;
                  break L8;
                } else {
                  param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_a));
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (param1.field_s >= var7.field_b.length + -2) {
                    break L10;
                  } else {
                    if (param1.field_v <= (var7.field_b[param1.field_s - -2] & 255) << 2120117096) {
                      break L10;
                    } else {
                      param1.field_s = param1.field_s + 2;
                      continue L9;
                    }
                  }
                }
                if (-2 + var7.field_b.length != param1.field_s) {
                  break L7;
                } else {
                  if (var7.field_b[param1.field_s + 1] == 0) {
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
            if (0 > param1.field_G) {
              break L11;
            } else {
              if (null == var7.field_g) {
                break L11;
              } else {
                if (-1 == (((di) this).field_v[param1.field_n] & 1 ^ -1)) {
                  L12: {
                    if (param1.field_J < 0) {
                      break L12;
                    } else {
                      if (param1 == ((di) this).field_U[param1.field_n][param1.field_J]) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (0 < var7.field_h) {
                      param1.field_G = param1.field_G + (int)(Math.pow(2.0, var9 * (double)var7.field_h) * 128.0 + 0.5);
                      break L13;
                    } else {
                      param1.field_G = param1.field_G + 128;
                      break L13;
                    }
                  }
                  L14: while (true) {
                    L15: {
                      if (-2 + var7.field_g.length <= param1.field_p) {
                        break L15;
                      } else {
                        if ((65280 & var7.field_g[2 + param1.field_p] << 502152808) >= param1.field_G) {
                          break L15;
                        } else {
                          param1.field_p = param1.field_p + 2;
                          continue L14;
                        }
                      }
                    }
                    if (param1.field_p == var7.field_g.length + -2) {
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
          if (var8 == 0) {
            param1.field_w.a(param1.field_M, this.a(param1, (byte) -68), this.a((byte) 93, param1));
            return false;
          } else {
            L16: {
              param1.field_w.g(param1.field_M);
              if (param3 == null) {
                param1.field_w.a(param0);
                break L16;
              } else {
                param1.field_w.a(param3, param4, param0);
                break L16;
              }
            }
            L17: {
              if (param1.field_w.j()) {
                ((di) this).field_z.field_r.b((um) (Object) param1.field_w);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              param1.a((byte) 80);
              if (0 <= param1.field_G) {
                param1.b(34);
                if ((param1.field_J ^ -1) >= -1) {
                  break L18;
                } else {
                  if (((di) this).field_U[param1.field_n][param1.field_J] != param1) {
                    break L18;
                  } else {
                    ((di) this).field_U[param1.field_n][param1.field_J] = null;
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

    final void a(int param0, boolean param1, cg param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (param0 == 255) {
            break L0;
          } else {
            um discarded$2 = ((di) this).b();
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = param2.field_D.field_r.length;
            if (!param1) {
              break L2;
            } else {
              if (!param2.field_D.field_p) {
                break L2;
              } else {
                var6 = var4 + var4 - param2.field_D.field_q;
                var4 = var4 << 8;
                var5 = (int)((long)((di) this).field_Y[param2.field_n] * (long)var6 >> -352511482);
                if (var5 >= var4) {
                  param2.field_w.a(true);
                  var5 = -1 + var4 - -var4 + -var5;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var5 = (int)((long)((di) this).field_Y[param2.field_n] * (long)var4 >> -929943994);
          break L1;
        }
        param2.field_w.e(var5);
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.b(param0, param2, -95);
        if (param1 != -6242) {
            field_K = -87;
        }
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var2 = ((di) this).field_W;
          if (param0 == 128) {
            break L0;
          } else {
            this.a(true, true);
            break L0;
          }
        }
        L1: {
          var3 = ((di) this).field_bb;
          var4 = ((di) this).field_t;
          if (((di) this).field_L == null) {
            break L1;
          } else {
            if (var3 == ((di) this).field_M) {
              this.a(-23, ((di) this).field_L, ((di) this).field_C, ((di) this).field_A);
              this.f(128);
              return;
            } else {
              break L1;
            }
          }
        }
        L2: while (true) {
          if (((di) this).field_bb != var3) {
            L3: {
              ((di) this).field_bb = var3;
              ((di) this).field_W = var2;
              ((di) this).field_t = var4;
              if (((di) this).field_L == null) {
                break L3;
              } else {
                if (var3 <= ((di) this).field_M) {
                  break L3;
                } else {
                  ((di) this).field_W = -1;
                  ((di) this).field_bb = ((di) this).field_M;
                  ((di) this).field_t = ((di) this).field_eb.f(((di) this).field_bb);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (((di) this).field_eb.field_b[var2] != var3) {
                  break L5;
                } else {
                  ((di) this).field_eb.a(var2);
                  var6 = ((di) this).field_eb.d(var2);
                  if (var6 != 1) {
                    L6: {
                      if (0 != (var6 & 128)) {
                        this.a(var6, (byte) 76);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((di) this).field_eb.e(var2);
                    ((di) this).field_eb.b(var2);
                    continue L4;
                  } else {
                    ((di) this).field_eb.d();
                    ((di) this).field_eb.b(var2);
                    if (!((di) this).field_eb.a()) {
                      break L5;
                    } else {
                      if (((di) this).field_L == null) {
                        L7: {
                          if (!((di) this).field_C) {
                            break L7;
                          } else {
                            if (0 != var3) {
                              ((di) this).field_eb.b(var4);
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        this.b(true, -21400);
                        ((di) this).field_eb.f();
                        return;
                      } else {
                        ((di) this).a(((di) this).field_C, ((di) this).field_L, (byte) 2);
                        this.f(128);
                        return;
                      }
                    }
                  }
                }
              }
              var2 = ((di) this).field_eb.c();
              var3 = ((di) this).field_eb.field_b[var2];
              var4 = ((di) this).field_eb.f(var3);
              continue L2;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 >= -19) {
            this.a((byte) 16, -9, 96, -116);
        }
        if (!(param0 == ((di) this).field_J[param1])) {
            ((di) this).field_J[param1] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                ((di) this).field_U[param1][var4] = null;
            }
        }
    }

    final synchronized boolean a(boolean param0, wh param1, ri param2, int param3, bj param4) {
        int var6 = 0;
        Object var7 = null;
        qf var8 = null;
        int var9 = 0;
        int var11 = 0;
        vc var12 = null;
        vc var13 = null;
        tg stackIn_10_0 = null;
        tg stackIn_17_0 = null;
        tg stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        tg stackOut_9_0 = null;
        tg stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        tg stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          var11 = MinerDisturbance.field_ab;
          param1.a();
          var6 = 1;
          var7 = null;
          if (param3 > 0) {
            var7 = (Object) (Object) new int[]{param3};
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((di) this).field_W = 80;
            break L1;
          }
        }
        var8 = (qf) (Object) param1.field_n.a(-16545);
        L2: while (true) {
          if (var8 == null) {
            L3: {
              if (var6 == 0) {
                break L3;
              } else {
                param1.b();
                break L3;
              }
            }
            return var6 != 0;
          } else {
            L4: {
              L5: {
                var9 = (int)var8.field_d;
                var12 = (vc) (Object) ((di) this).field_F.a((long)var9, -27109);
                if (var12 == null) {
                  var13 = oh.a(-126, var9, param4);
                  if (var13 == null) {
                    var6 = 0;
                    break L5;
                  } else {
                    ((di) this).field_F.a(0, (long)var9, (pi) (Object) var13);
                    if (var13.a(param2, (byte) -31, var8.field_s, (int[]) var7)) {
                      break L5;
                    } else {
                      var6 = 0;
                      break L5;
                    }
                  }
                } else {
                  if (var12.a(param2, (byte) -31, var8.field_s, (int[]) var7)) {
                    break L5;
                  } else {
                    var6 = 0;
                    stackOut_9_0 = param1.field_n;
                    stackIn_17_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (param0) {
                      stackOut_17_0 = (tg) (Object) stackIn_17_0;
                      stackOut_17_1 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L4;
                    } else {
                      var8 = (qf) (Object) ((tg) (Object) stackIn_10_0).a(true);
                      continue L2;
                    }
                  }
                }
              }
              stackOut_16_0 = param1.field_n;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L4;
            }
            var8 = (qf) (Object) ((tg) (Object) stackIn_18_0).a(stackIn_18_1 != 0);
            continue L2;
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != 57) {
            ((di) this).field_S = null;
        }
        ((di) this).field_P[param1] = param0;
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 >= 0) {
            ((di) this).field_H[param2] = param0;
        } else {
            for (var4 = 0; (var4 ^ -1) > -17; var4++) {
                ((di) this).field_H[var4] = param0;
            }
        }
        if (!param1) {
            field_D = null;
        }
    }

    private final void a(int param0, int param1) {
        cg var3 = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        var3 = (cg) (Object) ((di) this).field_z.field_v.b(64);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param1 == -10911) {
                break L1;
              } else {
                int discarded$2 = ((di) this).d();
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) > -1) {
                  break L3;
                } else {
                  if (param0 != var3.field_n) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != var3.field_w) {
                  L5: {
                    var3.field_w.g(fj.field_r / 100);
                    if (!var3.field_w.j()) {
                      break L5;
                    } else {
                      ((di) this).field_z.field_r.b((um) (Object) var3.field_w);
                      break L5;
                    }
                  }
                  var3.a((byte) 76);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if ((var3.field_G ^ -1) <= -1) {
                  break L6;
                } else {
                  ((di) this).field_gb[var3.field_n][var3.field_F] = null;
                  break L6;
                }
              }
              var3.b(34);
              break L2;
            }
            var3 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
            continue L0;
          }
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_Z = -105;
        }
        return ll.field_h ^ 38054639;
    }

    private final void b(int param0, int param1, int param2) {
        ((di) this).field_y[param1] = param0;
        int var4 = 124 % ((-4 - param2) / 55);
        ((di) this).field_B[param1] = c.a(param0, -128);
        this.c(param0, param1, -73);
    }

    final synchronized um b() {
        return (um) (Object) ((di) this).field_z;
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if ((param0 ^ -1) <= -1) {
          ((di) this).field_R[param0] = 12800;
          ((di) this).field_N[param0] = 8192;
          ((di) this).field_S[param0] = 16383;
          ((di) this).field_P[param0] = 8192;
          ((di) this).field_I[param0] = param1;
          ((di) this).field_T[param0] = 8192;
          this.d(param0, 27);
          this.f(param0, 20257);
          ((di) this).field_v[param0] = 0;
          ((di) this).field_w[param0] = 32767;
          ((di) this).field_db[param0] = 256;
          ((di) this).field_Y[param0] = 0;
          this.a(param0, (byte) 123, 8192);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.b(param0, 0);
              param0++;
              continue L0;
            }
          }
        }
    }

    final synchronized void a(wh param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (!(((di) this).field_eb.e())) {
            ((di) this).a(param1, param0, (byte) 2);
            return;
        }
        ((di) this).field_L = param0;
        ((di) this).field_A = param2 ? true : false;
        if (param5 != -22604) {
            ((di) this).field_L = null;
        }
        ((di) this).field_C = param1 ? true : false;
        int var7 = ((di) this).field_eb.a(((di) this).field_fb) * param3;
        int var8 = ((di) this).field_eb.field_g * param4;
        var7 = var8 * ((var8 + (var7 - 1)) / var8);
        ((di) this).field_M = (var7 - -(param3 >> -1818821087)) / param3;
    }

    private final int a(cg param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (0 == ((di) this).field_H[param0.field_n]) {
            return 0;
        }
        ng var9 = param0.field_z;
        ng var10 = var9;
        int var4 = 4096 + ((di) this).field_R[param0.field_n] * ((di) this).field_S[param0.field_n] >> 1370695341;
        if (param1 >= -32) {
            um discarded$0 = ((di) this).c();
        }
        var4 = var4 * var4 + 16384 >> 386163311;
        var4 = 16384 + param0.field_t * var4 >> 1133365263;
        var4 = 128 + var4 * ((di) this).field_Q >> 1387831944;
        var4 = var4 * ((di) this).field_H[param0.field_n] - -128 >> -628137848;
        if (!(0 >= var10.field_m)) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_x * (double)var10.field_m));
        }
        if (!(null == var10.field_b)) {
            var5 = param0.field_v;
            var6 = var10.field_b[param0.field_s + 1];
            if (!(param0.field_s >= -2 + var10.field_b.length)) {
                var7 = var9.field_b[param0.field_s] << -1833248024 & 65280;
                var8 = (var10.field_b[param0.field_s - -2] & 255) << -1197982616;
                var6 = var6 + (-var7 + var5) * (-var6 + var10.field_b[3 + param0.field_s]) / (-var7 + var8);
            }
            var4 = var4 * var6 - -32 >> 461514214;
        }
        if (-1 > (param0.field_G ^ -1)) {
            if (var10.field_g != null) {
                var5 = param0.field_G;
                var6 = var10.field_g[1 + param0.field_p];
                if (-2 + var10.field_g.length > param0.field_p) {
                    var7 = 65280 & var9.field_g[param0.field_p] << 254012040;
                    var8 = var10.field_g[2 + param0.field_p] << 218362152 & 65280;
                    var6 = var6 + (var10.field_g[param0.field_p - -3] - var6) * (var5 - var7) / (var8 + -var7);
                }
                var4 = var4 * var6 - -32 >> 813510534;
            }
        }
        return var4;
    }

    final synchronized boolean b(byte param0) {
        if (param0 != -114) {
            return true;
        }
        return ((di) this).field_eb.e();
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        cg var5 = null;
        ji var6 = null;
        int var6_int = 0;
        cg var7 = null;
        int var8 = 0;
        cg var9 = null;
        int var10 = 0;
        vc var11 = null;
        vc var12 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var10 = MinerDisturbance.field_ab;
          this.a((byte) -69, param3, 64, param1);
          if ((((di) this).field_v[param1] & 2) == 0) {
            break L0;
          } else {
            var5 = (cg) (Object) ((di) this).field_z.field_v.d(59287);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param1 != var5.field_n) {
                    break L2;
                  } else {
                    if ((var5.field_G ^ -1) > -1) {
                      ((di) this).field_gb[param1][var5.field_F] = null;
                      ((di) this).field_gb[param1][param3] = var5;
                      var6_int = (var5.field_y * var5.field_L >> -1203966516) + var5.field_u;
                      var5.field_u = var5.field_u + (-var5.field_F + param3 << 994464168);
                      var5.field_L = var6_int - var5.field_u;
                      var5.field_F = param3;
                      var5.field_y = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (cg) (Object) ((di) this).field_z.field_v.a(21510);
                continue L1;
              }
            }
          }
        }
        var11 = (vc) (Object) ((di) this).field_F.a((long)((di) this).field_J[param1], -27109);
        var12 = var11;
        if (var12 != null) {
          var6 = var11.field_v[param3];
          if (var6 != null) {
            L3: {
              var7 = new cg();
              var7.field_I = var12;
              var7.field_n = param1;
              var7.field_D = var6;
              var7.field_z = var11.field_y[param3];
              var7.field_J = var11.field_s[param3];
              var7.field_F = param3;
              var8 = 94 % ((-71 - param0) / 41);
              var7.field_t = var11.field_x[param3] * param2 * param2 * var12.field_q + 1024 >> -1010001397;
              var7.field_E = var11.field_r[param3] & 255;
              var7.field_u = (param3 << 231570696) + -(32767 & var11.field_t[param3]);
              var7.field_x = 0;
              var7.field_v = 0;
              var7.field_p = 0;
              var7.field_G = -1;
              var7.field_s = 0;
              if (0 != ((di) this).field_Y[param1]) {
                L4: {
                  var7.field_w = rc.a(var6, this.a(-101, var7), 0, this.a((byte) 88, var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 255;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if ((var12.field_t[param3] ^ -1) <= -1) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((di) this).a(stackIn_17_1, stackIn_17_2 != 0, var7);
                break L3;
              } else {
                var7.field_w = rc.a(var6, this.a(79, var7), this.a(var7, (byte) -78), this.a((byte) 98, var7));
                break L3;
              }
            }
            L5: {
              if (var12.field_t[param3] >= 0) {
                break L5;
              } else {
                var7.field_w.i(-1);
                break L5;
              }
            }
            L6: {
              if (-1 < var7.field_J) {
                break L6;
              } else {
                L7: {
                  var9 = ((di) this).field_U[param1][var7.field_J];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (-1 <= var9.field_G) {
                      break L7;
                    } else {
                      ((di) this).field_gb[param1][var9.field_F] = null;
                      var9.field_G = 0;
                      break L7;
                    }
                  }
                }
                ((di) this).field_U[param1][var7.field_J] = var7;
                break L6;
              }
            }
            ((di) this).field_z.field_v.a((byte) -104, (pi) (Object) var7);
            ((di) this).field_gb[param1][param3] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, cg param1) {
        int var3 = 0;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var3 = (param1.field_y * param1.field_L >> -745987028) + param1.field_u;
          var3 = var3 + ((-8192 + ((di) this).field_P[param1.field_n]) * ((di) this).field_db[param1.field_n] >> 997565324);
          var4 = -15 % ((-38 - param0) / 47);
          var5 = param1.field_z;
          if (var5.field_j <= 0) {
            break L0;
          } else {
            L1: {
              if (var5.field_c > 0) {
                break L1;
              } else {
                if (0 >= ((di) this).field_I[param1.field_n]) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = var5.field_c << -2128275294;
              var7 = var5.field_f << 1234864769;
              if (var7 <= param1.field_q) {
                break L2;
              } else {
                var6 = var6 * param1.field_q / var7;
                break L2;
              }
            }
            var6 = var6 + (((di) this).field_I[param1.field_n] >> -388892057);
            var8 = Math.sin((double)(param1.field_A & 511) * 0.01227184630308513);
            var3 = var3 + (int)((double)var6 * var8);
            break L0;
          }
        }
        L3: {
          var6 = (int)(0.5 + (double)(256 * param1.field_D.field_s) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)fj.field_r);
          if (var6 < 1) {
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            break L3;
          } else {
            stackOut_8_0 = var6;
            stackIn_10_0 = stackOut_8_0;
            break L3;
          }
        }
        return stackIn_10_0;
    }

    final boolean a(cg param0, int param1) {
        if (param1 > -6) {
            ((di) this).field_B = null;
        }
        if (null != param0.field_w) {
            return false;
        }
        if (!(-1 < (param0.field_G ^ -1))) {
            param0.b(34);
            if ((param0.field_J ^ -1) < -1) {
                if (!(((di) this).field_U[param0.field_n][param0.field_J] != param0)) {
                    ((di) this).field_U[param0.field_n][param0.field_J] = null;
                }
            }
        }
        return true;
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ia var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            vf stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            vf stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            vf stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            String stackIn_13_6 = null;
            Throwable decompiledCaughtException = null;
            vf stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            java.net.URL stackOut_10_4 = null;
            StringBuilder stackOut_10_5 = null;
            vf stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            vf stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            String stackOut_11_6 = null;
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    var3_ref = w.a(param0, (byte) 78);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  }
                }
                vj.a(var3_ref, param1);
                var3_ref = ld.a("%3a", -1, var3_ref, ":");
                var3_ref = ld.a("%40", -1, var3_ref, "@");
                var3_ref = ld.a("%26", -1, var3_ref, "&");
                var7 = ld.a("%23", param1 ^ -2, var3_ref, "#");
                if (null != aj.field_d) {
                  L4: {
                    stackOut_10_0 = hd.field_g;
                    stackOut_10_1 = -83;
                    stackOut_10_2 = null;
                    stackOut_10_3 = null;
                    stackOut_10_4 = aj.field_d.getCodeBase();
                    stackOut_10_5 = new StringBuilder().append("clienterror.ws?c=").append(tb.field_h).append("&u=");
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    stackIn_11_5 = stackOut_10_5;
                    if (kf.field_a == null) {
                      stackOut_12_0 = (vf) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = "" + jn.field_n;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      stackIn_13_6 = stackOut_12_6;
                      break L4;
                    } else {
                      stackOut_11_0 = (vf) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = (java.net.URL) (Object) stackIn_11_4;
                      stackOut_11_5 = (StringBuilder) (Object) stackIn_11_5;
                      stackOut_11_6 = kf.field_a;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      stackIn_13_6 = stackOut_11_6;
                      break L4;
                    }
                  }
                  var4 = ((vf) (Object) stackIn_13_0).a((byte) stackIn_13_1, new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + vf.field_s + "&v2=" + vf.field_b + "&e=" + var7));
                  L5: while (true) {
                    if (var4.field_c != 0) {
                      L6: {
                        if ((var4.field_c ^ -1) != -2) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_a;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      gf.a(1L, param1 + -10310);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void c(int param0, int param1) {
        ((di) this).field_r = param0;
        if (param1 != -102) {
            int discarded$0 = ((di) this).d();
        }
    }

    private final void f(int param0, int param1) {
        cg var3 = null;
        int var4 = MinerDisturbance.field_ab;
        if (0 != (((di) this).field_v[param0] & 4)) {
            var3 = (cg) (Object) ((di) this).field_z.field_v.b(122);
            while (var3 != null) {
                if (!(var3.field_n != param0)) {
                    var3.field_B = 0;
                }
                var3 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
            }
        }
        if (param1 != 20257) {
            Object var5 = null;
            ((di) this).a((wh) null, true, true, -97, -93, -5);
        }
    }

    private final void e(int param0, int param1) {
        cg var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = MinerDisturbance.field_ab;
        var3 = (cg) (Object) ((di) this).field_z.field_v.b(71);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param1 >= 1) {
                break L1;
              } else {
                var5 = null;
                ((di) this).a(false, (wh) null, (byte) 83);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) > -1) {
                  break L3;
                } else {
                  if (var3.field_n != param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if ((var3.field_G ^ -1) > -1) {
                ((di) this).field_gb[var3.field_n][var3.field_F] = null;
                var3.field_G = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
            continue L0;
          }
        }
    }

    private final synchronized void a(int param0, wh param1, boolean param2, boolean param3) {
        int var8 = MinerDisturbance.field_ab;
        this.a(param3, true);
        ((di) this).field_eb.a(param1.field_o);
        ((di) this).field_C = param2 ? true : false;
        ((di) this).field_fb = 0L;
        int var5 = ((di) this).field_eb.g();
        int var6 = 0;
        int var7 = -96 % ((66 - param0) / 48);
        while (var6 < var5) {
            ((di) this).field_eb.a(var6);
            ((di) this).field_eb.e(var6);
            ((di) this).field_eb.b(var6);
            var6++;
        }
        ((di) this).field_W = ((di) this).field_eb.c();
        ((di) this).field_bb = ((di) this).field_eb.field_b[((di) this).field_W];
        ((di) this).field_t = ((di) this).field_eb.f(((di) this).field_bb);
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        var3 = 240 & param0;
        if ((var3 ^ -1) != -129) {
          L0: {
            if ((var3 ^ -1) == -145) {
              var4 = 15 & param0;
              var5 = param0 >> -1870226584 & 127;
              var6 = param0 >> -2030375344 & 127;
              if (var6 > 0) {
                this.b((byte) -114, var4, var6, var5);
                return;
              } else {
                this.a((byte) -60, var5, 64, var4);
                break L0;
              }
            } else {
              if (-161 == (var3 ^ -1)) {
                var4 = 15 & param0;
                var5 = 127 & param0 >> 1565157288;
                var6 = (param0 & 8386190) >> 1828009296;
                this.a(var4, (byte) 94, var6, var5);
                return;
              } else {
                if (-177 != (var3 ^ -1)) {
                  if (192 == var3) {
                    var4 = param0 & 15;
                    var5 = (32529 & param0) >> -724417496;
                    this.c(var5 + ((di) this).field_B[var4], var4, -56);
                    return;
                  } else {
                    if ((var3 ^ -1) == -209) {
                      var4 = param0 & 15;
                      var5 = 127 & param0 >> -1990070456;
                      this.d(var4, var5, 1632);
                      return;
                    } else {
                      if ((var3 ^ -1) == -225) {
                        var4 = 15 & param0;
                        var5 = ((8323374 & param0) >> -523676759) + (127 & param0 >> -1535876760);
                        this.a(var5, var4, (byte) 57);
                        return;
                      } else {
                        var3 = 255 & param0;
                        if ((var3 ^ -1) != -256) {
                          var4 = -43 % ((-22 - param1) / 34);
                          return;
                        } else {
                          this.b(true, -21400);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L1: {
                    var4 = 15 & param0;
                    var5 = 127 & param0 >> -884686680;
                    var6 = 127 & param0 >> -214998512;
                    if ((var5 ^ -1) != -1) {
                      break L1;
                    } else {
                      ((di) this).field_B[var4] = (var6 << -394494674) + c.a(-2080769, ((di) this).field_B[var4]);
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 != 32) {
                      break L2;
                    } else {
                      ((di) this).field_B[var4] = c.a(((di) this).field_B[var4], -16257) + (var6 << -1458745625);
                      break L2;
                    }
                  }
                  L3: {
                    if ((var5 ^ -1) == -2) {
                      ((di) this).field_I[var4] = (var6 << -1973006457) + c.a(((di) this).field_I[var4], -16257);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == 33) {
                      ((di) this).field_I[var4] = c.a(-128, ((di) this).field_I[var4]) + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (5 != var5) {
                      break L5;
                    } else {
                      ((di) this).field_T[var4] = (var6 << 1061002695) + c.a(-16257, ((di) this).field_T[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 != 37) {
                      break L6;
                    } else {
                      ((di) this).field_T[var4] = c.a(-128, ((di) this).field_T[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) == -8) {
                      ((di) this).field_R[var4] = c.a(((di) this).field_R[var4], -16257) - -(var6 << 329842407);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (39 != var5) {
                      break L8;
                    } else {
                      ((di) this).field_R[var4] = c.a(-128, ((di) this).field_R[var4]) - -var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 10) {
                      ((di) this).field_N[var4] = (var6 << -1572432409) + c.a(((di) this).field_N[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) != -43) {
                      break L10;
                    } else {
                      ((di) this).field_N[var4] = var6 + c.a(((di) this).field_N[var4], -128);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 == 11) {
                      ((di) this).field_S[var4] = c.a(-16257, ((di) this).field_S[var4]) - -(var6 << 796082695);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((di) this).field_S[var4] = c.a(-128, ((di) this).field_S[var4]) + var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-65 == (var5 ^ -1)) {
                      if (var6 >= 64) {
                        ((di) this).field_v[var4] = hi.a(((di) this).field_v[var4], 1);
                        break L13;
                      } else {
                        ((di) this).field_v[var4] = c.a(((di) this).field_v[var4], -2);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-66 == (var5 ^ -1)) {
                      if (-65 < (var6 ^ -1)) {
                        this.d(var4, -114);
                        ((di) this).field_v[var4] = c.a(((di) this).field_v[var4], -3);
                        break L14;
                      } else {
                        ((di) this).field_v[var4] = hi.a(((di) this).field_v[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var5 ^ -1) != -100) {
                      break L15;
                    } else {
                      ((di) this).field_w[var4] = c.a(127, ((di) this).field_w[var4]) - -(var6 << 973830471);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 != var5) {
                      break L16;
                    } else {
                      ((di) this).field_w[var4] = var6 + c.a(16256, ((di) this).field_w[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if (-102 == (var5 ^ -1)) {
                      ((di) this).field_w[var4] = (var6 << -1223357849) + (c.a(127, ((di) this).field_w[var4]) + 16384);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) == -101) {
                      ((di) this).field_w[var4] = 16384 - -c.a(16256, ((di) this).field_w[var4]) - -var6;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.a(var4, -10911);
                      break L19;
                    }
                  }
                  L20: {
                    if ((var5 ^ -1) != -122) {
                      break L20;
                    } else {
                      this.b(var4, 0);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var5) {
                      break L21;
                    } else {
                      this.e(var4, 35);
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 6) {
                      break L22;
                    } else {
                      var7 = ((di) this).field_w[var4];
                      if (-16385 == (var7 ^ -1)) {
                        ((di) this).field_db[var4] = c.a(((di) this).field_db[var4], -16257) - -(var6 << -476241561);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 != 38) {
                      break L23;
                    } else {
                      var7 = ((di) this).field_w[var4];
                      if (-16385 != (var7 ^ -1)) {
                        break L23;
                      } else {
                        ((di) this).field_db[var4] = c.a(((di) this).field_db[var4], -128) + var6;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-17 == (var5 ^ -1)) {
                      ((di) this).field_Y[var4] = c.a(((di) this).field_Y[var4], -16257) + (var6 << 1606775783);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((di) this).field_Y[var4] = var6 + c.a(((di) this).field_Y[var4], -128);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 == (var5 ^ -1)) {
                      if ((var6 ^ -1) > -65) {
                        this.f(var4, 20257);
                        ((di) this).field_v[var4] = c.a(((di) this).field_v[var4], -5);
                        break L26;
                      } else {
                        ((di) this).field_v[var4] = hi.a(((di) this).field_v[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.a(var4, (byte) 116, (var6 << 1149375175) + (((di) this).field_s[var4] & -16257));
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if ((var5 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.a(var4, (byte) 98, (((di) this).field_s[var4] & -128) + var6);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = param0 & 15;
          var5 = param0 >> -1399949560 & 127;
          var6 = (param0 & 8366393) >> -408219568;
          this.a((byte) -123, var5, var6, var4);
          return;
        }
    }

    final synchronized void e(int param0) {
        int var3 = MinerDisturbance.field_ab;
        if (param0 != 100) {
            ((di) this).field_u = null;
        }
        vc var4 = (vc) (Object) ((di) this).field_F.a(-16545);
        while (var4 != null) {
            var4.a(12361);
            var4 = (vc) (Object) ((di) this).field_F.a(true);
        }
    }

    public static void a(byte param0) {
        field_D = null;
        field_x = null;
        if (param0 <= 92) {
            Object var2 = null;
            di.a((Throwable) null, 72, (String) null);
        }
        field_O = null;
        field_V = null;
        field_E = null;
        field_cb = null;
        field_ab = null;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = MinerDisturbance.field_ab;
          if (!((di) this).field_eb.e()) {
            break L0;
          } else {
            var2 = ((di) this).field_r * ((di) this).field_eb.field_g / fj.field_r;
            L1: while (true) {
              var3 = ((di) this).field_fb - -((long)param0 * (long)var2);
              if (-var3 + ((di) this).field_t >= 0L) {
                ((di) this).field_fb = var3;
                break L0;
              } else {
                var5 = (int)((-1L + (long)var2 + (((di) this).field_t + -((di) this).field_fb)) / (long)var2);
                ((di) this).field_fb = ((di) this).field_fb + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((di) this).field_z.a(var5);
                this.f(128);
                if (!((di) this).field_eb.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((di) this).field_z.a(param0);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cg var6 = null;
        int var7 = 0;
        cg var8 = null;
        var7 = MinerDisturbance.field_ab;
        var8 = ((di) this).field_gb[param3][param1];
        if (var8 == null) {
          return;
        } else {
          L0: {
            ((di) this).field_gb[param3][param1] = null;
            if (param0 <= -3) {
              break L0;
            } else {
              this.d(-81, 83);
              break L0;
            }
          }
          L1: {
            if (0 == (2 & ((di) this).field_v[param3])) {
              var8.field_G = 0;
              break L1;
            } else {
              var6 = (cg) (Object) ((di) this).field_z.field_v.b(72);
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var8.field_n != var6.field_n) {
                      break L3;
                    } else {
                      if (0 <= var6.field_G) {
                        break L3;
                      } else {
                        if (var6 == var8) {
                          break L3;
                        } else {
                          var8.field_G = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        cg var4 = null;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          var3 = 125 / ((-48 - param1) / 62);
          if ((2 & ((di) this).field_v[param0]) == 0) {
            break L0;
          } else {
            var4 = (cg) (Object) ((di) this).field_z.field_v.b(76);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var4.field_n) {
                    break L2;
                  } else {
                    if (((di) this).field_gb[param0][var4.field_F] == null) {
                      if (0 > var4.field_G) {
                        var4.field_G = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var4 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
                      continue L1;
                    }
                  }
                }
                var4 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 13) {
            ((di) this).field_s = null;
        }
    }

    final synchronized void a(boolean param0, wh param1, byte param2) {
        this.a(17, param1, param0, true);
        if (param2 != 2) {
            ((di) this).field_H = null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        if (param2 != 1632) {
            this.a(false, false);
        }
    }

    final synchronized void c(byte param0) {
        this.a(true, true);
        if (param0 != 108) {
            ((di) this).field_T = null;
        }
    }

    final synchronized void a(byte param0, int param1) {
        ((di) this).field_Q = param1;
        if (param0 >= -64) {
            Object var4 = null;
            int discarded$0 = this.a(16, (cg) null);
        }
    }

    public di() {
        ((di) this).field_Q = 256;
        ((di) this).field_w = new int[16];
        ((di) this).field_P = new int[16];
        ((di) this).field_r = 1000000;
        ((di) this).field_I = new int[16];
        ((di) this).field_H = new int[16];
        ((di) this).field_B = new int[16];
        ((di) this).field_y = new int[16];
        ((di) this).field_R = new int[16];
        ((di) this).field_S = new int[16];
        ((di) this).field_gb = new cg[16][128];
        ((di) this).field_T = new int[16];
        ((di) this).field_Y = new int[16];
        ((di) this).field_db = new int[16];
        ((di) this).field_u = new int[16];
        ((di) this).field_s = new int[16];
        ((di) this).field_v = new int[16];
        ((di) this).field_U = new cg[16][128];
        ((di) this).field_N = new int[16];
        ((di) this).field_J = new int[16];
        ((di) this).field_eb = new nl();
        ((di) this).field_z = new gd((di) this);
        ((di) this).field_F = new tg(128);
        ((di) this).a(256, true, -1);
        this.b(true, -21400);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "Confirm Email:";
        field_V = new int[128];
        field_Z = 0;
        field_E = "Passwords must be between 5 and 20 letters and numbers";
        field_O = new gi();
    }
}
