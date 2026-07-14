/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lc extends ag {
    private int[] field_y;
    private int[] field_r;
    private kc[][] field_l;
    private int[] field_p;
    private int[] field_H;
    static int field_q;
    static int field_R;
    private int field_w;
    private int[] field_G;
    private int[] field_M;
    private ul field_I;
    int[] field_D;
    private fl field_Q;
    private int[] field_o;
    private int[] field_K;
    int[] field_P;
    private int[] field_F;
    private int[] field_t;
    private int[] field_N;
    static String field_L;
    private kc[][] field_u;
    int[] field_v;
    private int[] field_C;
    private int field_B;
    private int[] field_z;
    private int field_J;
    private boolean field_A;
    private long field_s;
    private ej field_m;
    private long field_O;
    private int field_n;
    private boolean field_k;
    private int field_E;
    private pl field_x;

    final synchronized boolean a(int param0, boolean param1, bl param2, pl param3, ci param4) {
        int[] var7_array = null;
        int var9 = 0;
        si var10 = null;
        si var10_ref = null;
        int var11 = Transmogrify.field_A ? 1 : 0;
        param3.a();
        if (param1) {
            return false;
        }
        int var6 = 1;
        Object var7 = null;
        if (!(-1 <= (param0 ^ -1))) {
            var7_array = new int[]{param0};
        }
        wd var8 = (wd) (Object) param3.field_h.b(1000);
        while (var8 != null) {
            var9 = (int)var8.field_c;
            var10 = (si) (Object) ((lc) this).field_Q.a((long)var9, 0);
            if (var10 == null) {
                var10_ref = ac.a(var9, 270, param4);
                if (var10_ref == null) {
                    var6 = 0;
                } else {
                    ((lc) this).field_Q.a((long)var9, (byte) -66, (wf) (Object) var10_ref);
                }
            }
            if (var10_ref != null) {
                if (!var10_ref.a(param2, var7_array, -1, var8.field_h)) {
                    var6 = 0;
                }
            }
            var8 = (wd) (Object) param3.field_h.a(110);
        }
        if (!(var6 == 0)) {
            param3.b();
        }
        return var6 != 0;
    }

    final synchronized void a(int param0, boolean param1, pl param2) {
        this.a(param1, param2, true, (byte) -81);
        int var4 = -58 / ((65 - param0) / 58);
    }

    final synchronized void f(int param0) {
        this.a((byte) 112, true);
        if (param0 != 16) {
            ((lc) this).field_O = -106L;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Transmogrify.field_A ? 1 : 0;
            if (((lc) this).field_I.e()) {
              var4 = ((lc) this).field_w * ((lc) this).field_I.field_h / qh.field_p;
              L2: while (true) {
                var5 = (long)param2 * (long)var4 + ((lc) this).field_O;
                if (-1L < (-var5 + ((lc) this).field_s ^ -1L)) {
                  var7 = (int)((((lc) this).field_s + (-((lc) this).field_O + ((long)var4 + -1L))) / (long)var4);
                  ((lc) this).field_O = ((lc) this).field_O + (long)var4 * (long)var7;
                  ((lc) this).field_m.b(param0, param1, var7);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  this.b(false);
                  if (((lc) this).field_I.e()) {
                    continue L2;
                  } else {
                    ((lc) this).field_m.b(param0, param1, param2);
                    break L0;
                  }
                } else {
                  ((lc) this).field_O = var5;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((lc) this).field_m.b(param0, param1, param2);
          break L0;
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        var3 = -117 % ((param0 - -62) / 44);
        var4 = 240 & param1;
        if (-129 == (var4 ^ -1)) {
          var5 = param1 & 15;
          var6 = (32651 & param1) >> 668655496;
          var7 = (8373600 & param1) >> -1297035152;
          this.c(0, var7, var6, var5);
          return;
        } else {
          L0: {
            if (144 != var4) {
              if (160 != var4) {
                if (176 != var4) {
                  if (var4 == 192) {
                    var5 = param1 & 15;
                    var6 = 127 & param1 >> -332484920;
                    this.d(((lc) this).field_K[var5] - -var6, var5, 122);
                    return;
                  } else {
                    if (var4 != 208) {
                      if (224 != var4) {
                        var4 = param1 & 255;
                        if (var4 != 255) {
                          return;
                        } else {
                          this.a(false, true);
                          return;
                        }
                      } else {
                        var5 = 15 & param1;
                        var6 = (param1 >> -895539287 & 16256) + ((param1 & 32603) >> -2013817272);
                        this.f(var5, var6, -106);
                        return;
                      }
                    } else {
                      var5 = param1 & 15;
                      var6 = 127 & param1 >> -1218098008;
                      this.e(var5, 872, var6);
                      return;
                    }
                  }
                } else {
                  L1: {
                    var5 = 15 & param1;
                    var6 = (32739 & param1) >> 946022152;
                    var7 = (8326702 & param1) >> 1924197264;
                    if ((var6 ^ -1) != -1) {
                      break L1;
                    } else {
                      ((lc) this).field_K[var5] = (var7 << 1211463598) + vg.c(-2080769, ((lc) this).field_K[var5]);
                      break L1;
                    }
                  }
                  L2: {
                    if ((var6 ^ -1) != -33) {
                      break L2;
                    } else {
                      ((lc) this).field_K[var5] = vg.c(-16257, ((lc) this).field_K[var5]) - -(var7 << 1148169351);
                      break L2;
                    }
                  }
                  L3: {
                    if (1 != var6) {
                      break L3;
                    } else {
                      ((lc) this).field_p[var5] = vg.c(((lc) this).field_p[var5], -16257) - -(var7 << -778543673);
                      break L3;
                    }
                  }
                  L4: {
                    if (-34 != (var6 ^ -1)) {
                      break L4;
                    } else {
                      ((lc) this).field_p[var5] = vg.c(-128, ((lc) this).field_p[var5]) + var7;
                      break L4;
                    }
                  }
                  L5: {
                    if (5 == var6) {
                      ((lc) this).field_y[var5] = vg.c(((lc) this).field_y[var5], -16257) + (var7 << 1842132039);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var6 ^ -1) == -38) {
                      ((lc) this).field_y[var5] = vg.c(-128, ((lc) this).field_y[var5]) - -var7;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var6) {
                      ((lc) this).field_z[var5] = (var7 << 440107527) + vg.c(((lc) this).field_z[var5], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (39 != var6) {
                      break L8;
                    } else {
                      ((lc) this).field_z[var5] = var7 + vg.c(((lc) this).field_z[var5], -128);
                      break L8;
                    }
                  }
                  L9: {
                    if (var6 == 10) {
                      ((lc) this).field_N[var5] = vg.c(((lc) this).field_N[var5], -16257) + (var7 << -522526457);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var6 ^ -1) != -43) {
                      break L10;
                    } else {
                      ((lc) this).field_N[var5] = vg.c(-128, ((lc) this).field_N[var5]) + var7;
                      break L10;
                    }
                  }
                  L11: {
                    if (11 != var6) {
                      break L11;
                    } else {
                      ((lc) this).field_C[var5] = (var7 << 1839825159) + vg.c(((lc) this).field_C[var5], -16257);
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 43) {
                      ((lc) this).field_C[var5] = var7 + vg.c(-128, ((lc) this).field_C[var5]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if ((var6 ^ -1) != -65) {
                      break L13;
                    } else {
                      if ((var7 ^ -1) <= -65) {
                        ((lc) this).field_v[var5] = cl.b(((lc) this).field_v[var5], 1);
                        break L13;
                      } else {
                        ((lc) this).field_v[var5] = vg.c(((lc) this).field_v[var5], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (-66 != (var6 ^ -1)) {
                      break L14;
                    } else {
                      if ((var7 ^ -1) <= -65) {
                        ((lc) this).field_v[var5] = cl.b(((lc) this).field_v[var5], 2);
                        break L14;
                      } else {
                        this.a(-60, var5);
                        ((lc) this).field_v[var5] = vg.c(((lc) this).field_v[var5], -3);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (-100 == (var6 ^ -1)) {
                      ((lc) this).field_o[var5] = vg.c(127, ((lc) this).field_o[var5]) - -(var7 << -142484697);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((var6 ^ -1) == -99) {
                      ((lc) this).field_o[var5] = vg.c(((lc) this).field_o[var5], 16256) + var7;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((var6 ^ -1) != -102) {
                      break L17;
                    } else {
                      ((lc) this).field_o[var5] = vg.c(127, ((lc) this).field_o[var5]) + 16384 - -(var7 << 1185966311);
                      break L17;
                    }
                  }
                  L18: {
                    if (100 == var6) {
                      ((lc) this).field_o[var5] = vg.c(((lc) this).field_o[var5], 16256) + (16384 - -var7);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (120 != var6) {
                      break L19;
                    } else {
                      this.b(var5, (byte) 102);
                      break L19;
                    }
                  }
                  L20: {
                    if ((var6 ^ -1) != -122) {
                      break L20;
                    } else {
                      this.a(var5, (byte) 59);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var6) {
                      break L21;
                    } else {
                      this.d(-107, var5);
                      break L21;
                    }
                  }
                  L22: {
                    if ((var6 ^ -1) != -7) {
                      break L22;
                    } else {
                      var8 = ((lc) this).field_o[var5];
                      if ((var8 ^ -1) != -16385) {
                        break L22;
                      } else {
                        ((lc) this).field_F[var5] = vg.c(((lc) this).field_F[var5], -16257) - -(var7 << 406145063);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (38 != var6) {
                      break L23;
                    } else {
                      var8 = ((lc) this).field_o[var5];
                      if ((var8 ^ -1) != -16385) {
                        break L23;
                      } else {
                        ((lc) this).field_F[var5] = vg.c(((lc) this).field_F[var5], -128) + var7;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (16 != var6) {
                      break L24;
                    } else {
                      ((lc) this).field_P[var5] = vg.c(((lc) this).field_P[var5], -16257) + (var7 << 1428831047);
                      break L24;
                    }
                  }
                  L25: {
                    if (-49 == (var6 ^ -1)) {
                      ((lc) this).field_P[var5] = vg.c(-128, ((lc) this).field_P[var5]) + var7;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 != (var6 ^ -1)) {
                      break L26;
                    } else {
                      if (64 > var7) {
                        this.c(var5, 42);
                        ((lc) this).field_v[var5] = vg.c(((lc) this).field_v[var5], -5);
                        break L26;
                      } else {
                        ((lc) this).field_v[var5] = cl.b(((lc) this).field_v[var5], 4);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var6 == 17) {
                      this.a(var5, false, (((lc) this).field_t[var5] & -16257) + (var7 << 1589260231));
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if ((var6 ^ -1) != -50) {
                    break L0;
                  } else {
                    this.a(var5, false, (-128 & ((lc) this).field_t[var5]) - -var7);
                    return;
                  }
                }
              } else {
                var5 = param1 & 15;
                var6 = param1 >> 634440360 & 127;
                var7 = 127 & param1 >> 629913488;
                this.a(8373600, var5, var7, var6);
                return;
              }
            } else {
              var5 = 15 & param1;
              var6 = (32665 & param1) >> -751498488;
              var7 = (8354010 & param1) >> 187725712;
              if ((var7 ^ -1) < -1) {
                this.b(var5, var6, var7, -106);
                return;
              } else {
                this.c(0, 64, var6, var5);
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((lc) this).field_G[param2] = param1;
        ((lc) this).field_K[param2] = vg.c(param1, -128);
        this.d(param1, param2, 73);
        if (param0 != 14731) {
            ag discarded$0 = ((lc) this).d();
        }
    }

    public static void e(int param0) {
        field_L = null;
        if (param0 > -24) {
            field_q = -58;
        }
    }

    private final int a(kc param0, int param1) {
        if (param1 != 1135851910) {
            this.d(-62, 28);
        }
        int var3 = ((lc) this).field_N[param0.field_u];
        if ((var3 ^ -1) <= -8193) {
            return 16384 - ((128 - param0.field_k) * (-var3 + 16384) - -32 >> -2045770586);
        }
        return var3 * param0.field_k - -32 >> 1135851910;
    }

    final static void c(boolean param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        gd var11 = null;
        hj var12 = null;
        int[] var13 = null;
        oh var14 = null;
        oh var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var12 = nf.field_l;
          if (!param0) {
            break L0;
          } else {
            field_L = null;
            break L0;
          }
        }
        L1: {
          var2 = var12.d((byte) 27);
          if (var2 != 0) {
            if (var2 == 1) {
              var11 = (gd) (Object) rh.field_r.a((byte) -95);
              if (var11 != null) {
                var11.c(5);
                break L1;
              } else {
                pc.a(1);
                return;
              }
            } else {
              if ((var2 ^ -1) == -3) {
                var15 = (oh) (Object) oc.field_G.a((byte) -95);
                if (var15 != null) {
                  var15.field_g = rf.c(false);
                  var15.field_k = var15.field_g[0];
                  var15.field_i = true;
                  var15.c(5);
                  break L1;
                } else {
                  pc.a(1);
                  return;
                }
              } else {
                d.a((Throwable) null, 63, "A1: " + ik.q(48));
                pc.a(1);
                break L1;
              }
            }
          } else {
            var10 = rf.c(false);
            var18 = var10;
            var17 = var18;
            var16 = var17;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((oa) (Object) var5).d((byte) 48);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var14 = (oh) (Object) oc.field_G.a((byte) -95);
                if (var14 == null) {
                  pc.a(1);
                  return;
                } else {
                  var14.field_i = true;
                  var14.field_k = var18[0];
                  var14.field_g = var3;
                  var14.c(5);
                  break L1;
                }
              } else {
                var9[var7] = ((oa) (Object) var5).c((byte) -124);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    final synchronized ag a() {
        return null;
    }

    private final void a(int param0, boolean param1, int param2) {
        ((lc) this).field_t[param0] = param2;
        ((lc) this).field_D[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
        if (param1) {
            Object var5 = null;
            boolean discarded$0 = ((lc) this).a(101, (kc) null);
        }
    }

    private final void c(int param0, int param1) {
        kc var3 = null;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (0 != (4 & ((lc) this).field_v[param0])) {
            var3 = (kc) (Object) ((lc) this).field_m.field_q.a((byte) -95);
            while (var3 != null) {
                if ((param0 ^ -1) == (var3.field_u ^ -1)) {
                    var3.field_n = 0;
                }
                var3 = (kc) (Object) ((lc) this).field_m.field_q.a(true);
            }
        }
        if (param1 < 12) {
            this.a(-119, false, -13);
        }
    }

    private final void d(int param0, int param1) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        kc var3 = (kc) (Object) ((lc) this).field_m.field_q.a((byte) -95);
        int var4 = -103 / ((-19 - param0) / 37);
        while (var3 != null) {
            if (param1 >= 0) {
                // if_icmpeq L55
            } else {
                if (!(-1 >= (var3.field_p ^ -1))) {
                    ((lc) this).field_u[var3.field_u][var3.field_i] = null;
                    var3.field_p = 0;
                }
            }
            var3 = (kc) (Object) ((lc) this).field_m.field_q.a(true);
        }
    }

    final synchronized void d(boolean param0) {
        int var3 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
            return;
        }
        si var4 = (si) (Object) ((lc) this).field_Q.b(1000);
        while (var4 != null) {
            var4.d(75);
            var4 = (si) (Object) ((lc) this).field_Q.a(44);
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != 8373600) {
            this.a((byte) 42, false);
        }
    }

    private final void b(int param0, byte param1) {
        int var5 = Transmogrify.field_A ? 1 : 0;
        int var3 = -100 / ((param1 - -68) / 44);
        kc var4 = (kc) (Object) ((lc) this).field_m.field_q.a((byte) -95);
        while (var4 != null) {
            if (param0 >= 0) {
                // if_icmpeq L61
            } else {
                if (var4.field_y != null) {
                    var4.field_y.f(qh.field_p / 100);
                    if (!(!var4.field_y.e())) {
                        ((lc) this).field_m.field_m.a((ag) (Object) var4.field_y);
                    }
                    var4.b(false);
                }
                if (!(var4.field_p >= 0)) {
                    ((lc) this).field_u[var4.field_u][var4.field_i] = null;
                }
                var4.c(5);
            }
            var4 = (kc) (Object) ((lc) this).field_m.field_q.a(true);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (!param1) {
            this.d(69, -1);
        } else {
            this.b(-1, (byte) -115);
        }
        this.a(-1, (byte) 48);
        for (var3 = 0; var3 < 16; var3++) {
            ((lc) this).field_H[var3] = ((lc) this).field_G[var3];
        }
        if (param0) {
            this.e(-49, -104, 66);
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((lc) this).field_K[var5] = vg.c(((lc) this).field_G[var5], -128);
            var5++;
        }
    }

    private final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if ((param0 ^ -1) > -1) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.a(param0, (byte) 76);
              param0++;
              continue L0;
            }
          }
        } else {
          L1: {
            ((lc) this).field_z[param0] = 12800;
            ((lc) this).field_N[param0] = 8192;
            ((lc) this).field_C[param0] = 16383;
            ((lc) this).field_M[param0] = 8192;
            ((lc) this).field_p[param0] = 0;
            ((lc) this).field_y[param0] = 8192;
            if (param1 >= 44) {
              break L1;
            } else {
              this.f(-32, 71, 26);
              break L1;
            }
          }
          this.a(-60, param0);
          this.c(param0, 79);
          ((lc) this).field_v[param0] = 0;
          ((lc) this).field_o[param0] = 32767;
          ((lc) this).field_F[param0] = 256;
          ((lc) this).field_P[param0] = 0;
          this.a(param0, false, 8192);
          return;
        }
    }

    final void a(boolean param0, boolean param1, kc param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var4 = param2.field_t.field_l.length;
            if (!param1) {
              break L1;
            } else {
              if (!param2.field_t.field_i) {
                break L1;
              } else {
                var6 = -param2.field_t.field_k + (var4 + var4);
                var4 = var4 << 8;
                var5 = (int)((long)((lc) this).field_P[param2.field_u] * (long)var6 >> -1595985722);
                if (var5 >= var4) {
                  param2.field_y.b(true);
                  var5 = -var5 + var4 + var4 + -1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          var5 = (int)((long)((lc) this).field_P[param2.field_u] * (long)var4 >> 774211334);
          break L0;
        }
        L2: {
          param2.field_y.g(var5);
          if (!param0) {
            break L2;
          } else {
            ((lc) this).field_s = 117L;
            break L2;
          }
        }
    }

    final synchronized ag d() {
        return (ag) (Object) ((lc) this).field_m;
    }

    private final void e(int param0, int param1, int param2) {
        if (param1 != 872) {
            ((lc) this).field_N = null;
        }
    }

    private final int b(kc param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(-1 != (((lc) this).field_r[param0.field_u] ^ -1))) {
            return 0;
        }
        if (param1 != -77) {
            ((lc) this).d(7);
        }
        nh var9 = param0.field_s;
        nh var10 = var9;
        int var4 = 4096 + ((lc) this).field_C[param0.field_u] * ((lc) this).field_z[param0.field_u] >> -1734686419;
        var4 = 16384 + var4 * var4 >> 1053535759;
        var4 = param0.field_B * var4 - -16384 >> 349674671;
        var4 = 128 + var4 * ((lc) this).field_B >> -522568280;
        var4 = 128 + ((lc) this).field_r[param0.field_u] * var4 >> 1663678024;
        if (!(-1 <= (var10.field_k ^ -1))) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_z * 0.00001953125 * (double)var10.field_k) + 0.5);
        }
        if (!(var10.field_g == null)) {
            var5 = param0.field_m;
            var6 = var10.field_g[param0.field_q - -1];
            if (!((param0.field_q ^ -1) <= (var10.field_g.length + -2 ^ -1))) {
                var7 = var9.field_g[param0.field_q] << 523876200 & 65280;
                var8 = (var10.field_g[2 + param0.field_q] & 255) << -1163948248;
                var6 = var6 + (-var7 + var5) * (-var6 + var10.field_g[3 + param0.field_q]) / (-var7 + var8);
            }
            var4 = var6 * var4 - -32 >> 2110185798;
        }
        if ((param0.field_p ^ -1) < -1) {
            if (var10.field_c != null) {
                var5 = param0.field_p;
                var6 = var10.field_c[1 + param0.field_w];
                if (param0.field_w < var10.field_c.length - 2) {
                    var7 = (var9.field_c[param0.field_w] & 255) << 1132711432;
                    var8 = (var10.field_c[param0.field_w - -2] & 255) << -357769432;
                    var6 = var6 + (var10.field_c[param0.field_w - -3] - var6) * (var5 + -var7) / (var8 - var7);
                }
                var4 = var4 * var6 + 32 >> 892347430;
            }
        }
        return var4;
    }

    final synchronized int b() {
        return 0;
    }

    final synchronized void a(boolean param0, int param1) {
        if (!param0) {
            ((lc) this).field_B = 32;
        }
        ((lc) this).field_w = param1;
    }

    private final void a(int param0, int param1) {
        kc var3 = null;
        int var4 = 0;
        L0: {
          var4 = Transmogrify.field_A ? 1 : 0;
          if (param0 == -60) {
            break L0;
          } else {
            ((lc) this).field_F = null;
            break L0;
          }
        }
        L1: {
          if (0 == (((lc) this).field_v[param1] & 2)) {
            break L1;
          } else {
            var3 = (kc) (Object) ((lc) this).field_m.field_q.a((byte) -95);
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                L3: {
                  if (param1 != var3.field_u) {
                    break L3;
                  } else {
                    if (null == ((lc) this).field_u[param1][var3.field_i]) {
                      if (var3.field_p >= 0) {
                        break L3;
                      } else {
                        var3.field_p = 0;
                        break L3;
                      }
                    } else {
                      var3 = (kc) (Object) ((lc) this).field_m.field_q.a(true);
                      continue L2;
                    }
                  }
                }
                var3 = (kc) (Object) ((lc) this).field_m.field_q.a(true);
                continue L2;
              }
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        kc var6 = null;
        int var7 = Transmogrify.field_A ? 1 : 0;
        kc var8 = ((lc) this).field_u[param3][param2];
        if (!(var8 != null)) {
            return;
        }
        ((lc) this).field_u[param3][param2] = null;
        if (param0 == (((lc) this).field_v[param3] & 2)) {
            var8.field_p = 0;
        } else {
            var6 = (kc) (Object) ((lc) this).field_m.field_q.a((byte) -95);
            while (var6 != null) {
                if ((var6.field_u ^ -1) == (var8.field_u ^ -1)) {
                    if (-1 < (var6.field_p ^ -1)) {
                        if (!(var6 == var8)) {
                            var8.field_p = 0;
                            break;
                        }
                    }
                }
                var6 = (kc) (Object) ((lc) this).field_m.field_q.a(true);
            }
        }
    }

    private final int a(kc param0, byte param1) {
        int var3 = 0;
        nh var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        Object var9 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var3 = param0.field_C - -(param0.field_v * param0.field_x >> 1229498764);
          var3 = var3 + ((((lc) this).field_M[param0.field_u] - 8192) * ((lc) this).field_F[param0.field_u] >> -749403796);
          if (param1 >= 82) {
            break L0;
          } else {
            var9 = null;
            lc.a((byte) 127, (hj) null);
            break L0;
          }
        }
        L1: {
          var4 = param0.field_s;
          if (-1 <= (var4.field_a ^ -1)) {
            break L1;
          } else {
            L2: {
              if ((var4.field_e ^ -1) < -1) {
                break L2;
              } else {
                if (((lc) this).field_p[param0.field_u] <= 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var5 = var4.field_e << 892999586;
              var6 = var4.field_i << -1052185375;
              if (param0.field_o >= var6) {
                break L3;
              } else {
                var5 = var5 * param0.field_o / var6;
                break L3;
              }
            }
            var5 = var5 + (((lc) this).field_p[param0.field_u] >> -948271961);
            var7 = Math.sin((double)(param0.field_l & 511) * 0.01227184630308513);
            var3 = var3 + (int)(var7 * (double)var5);
            break L1;
          }
        }
        L4: {
          var5 = (int)((double)(256 * param0.field_t.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3) / (double)qh.field_p + 0.5);
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

    final synchronized boolean a(byte param0) {
        if (param0 > -25) {
            return true;
        }
        return ((lc) this).field_I.e();
    }

    final static void a(byte param0, hj param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            ba var14 = null;
            Object var16 = null;
            Object var17 = null;
            java.lang.reflect.Field var17_ref = null;
            ba var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            Throwable decompiledCaughtException = null;
            var19 = null;
            var17 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var13 = Transmogrify.field_A ? 1 : 0;
            var14 = (ba) (Object) wg.field_f.a((byte) -95);
            var18 = var14;
            if (var18 == null) {
              return;
            } else {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var18.field_p) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var4 = param1.field_h;
                    param1.a(-109, var18.field_i);
                    var5 = 117 % ((param0 - 0) / 44);
                    var6 = 0;
                    L1: while (true) {
                      if ((var18.field_p ^ -1) >= (var6 ^ -1)) {
                        var6++;
                      } else {
                        L2: {
                          if (0 != var18.field_k[var6]) {
                            param1.f(6389, var18.field_k[var6]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var7_int = var18.field_j[var6];
                                if (0 != var7_int) {
                                  if (var7_int != 1) {
                                    if ((var7_int ^ -1) != -3) {
                                      break L3;
                                    } else {
                                      var28 = (java.lang.reflect.Field) var18.field_m[var6].field_g;
                                      var9 = var28.getModifiers();
                                      param1.f(6389, 0);
                                      param1.a(-107, var9);
                                      break L3;
                                    }
                                  } else {
                                    var17_ref = (java.lang.reflect.Field) var18.field_m[var6].field_g;
                                    var20 = var17_ref;
                                    var20.setInt((Object) null, var18.field_h[var6]);
                                    param1.f(6389, 0);
                                    break L3;
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Field) var18.field_m[var6].field_g;
                                  var9 = var27.getInt((Object) null);
                                  param1.f(6389, 0);
                                  param1.a(-119, var9);
                                  break L3;
                                }
                              }
                              L4: {
                                if ((var7_int ^ -1) != -4) {
                                  if (4 == var7_int) {
                                    var30 = (java.lang.reflect.Method) var18.field_o[var6].field_g;
                                    var9 = var30.getModifiers();
                                    param1.f(6389, 0);
                                    param1.a(-107, var9);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var29 = (java.lang.reflect.Method) var18.field_o[var6].field_g;
                                  var26 = var18.field_g[var6];
                                  var10 = new Object[var26.length];
                                  var11_int = 0;
                                  L5: while (true) {
                                    if (var26.length <= var11_int) {
                                      var11 = var29.invoke((Object) null, var10);
                                      if (var11 != null) {
                                        if (!(var11 instanceof Number)) {
                                          if (!(var11 instanceof String)) {
                                            param1.f(6389, 4);
                                            break L4;
                                          } else {
                                            param1.f(6389, 2);
                                            param1.a(-110, (String) var11);
                                            break L4;
                                          }
                                        } else {
                                          param1.f(6389, 1);
                                          param1.b(1908720528, ((Number) var11).longValue());
                                          break L4;
                                        }
                                      } else {
                                        param1.f(6389, 0);
                                        break L4;
                                      }
                                    } else {
                                      var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var11_int]));
                                      var10[var11_int] = var12.readObject();
                                      var11_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param1.f(6389, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param1.f(6389, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref8 = (IOException) (Object) decompiledCaughtException;
                              param1.f(6389, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param1.f(6389, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref10 = (Exception) (Object) decompiledCaughtException;
                              param1.f(6389, -20);
                            }
                            break L2;
                          }
                        }
                        var7_ref11 = decompiledCaughtException;
                        param1.f(6389, -21);
                        continue L1;
                      }
                    }
                  }
                } else {
                  L6: {
                    if (var14.field_m[var4] != null) {
                      L7: {
                        if (-3 != (var14.field_m[var4].field_c ^ -1)) {
                          break L7;
                        } else {
                          var14.field_k[var4] = -5;
                          break L7;
                        }
                      }
                      if (-1 != (var14.field_m[var4].field_c ^ -1)) {
                        break L6;
                      } else {
                        var3 = 1;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    if (var14.field_o[var4] != null) {
                      L9: {
                        if (var14.field_o[var4].field_c != 2) {
                          break L9;
                        } else {
                          var14.field_k[var4] = -6;
                          break L9;
                        }
                      }
                      if (var14.field_o[var4].field_c != 0) {
                        break L8;
                      } else {
                        var3 = 1;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  var4++;
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        if (param2 < 64) {
            Object var6 = null;
            this.a(false, (pl) null, true, (byte) 16);
        }
        if (((lc) this).field_H[param1] != param0) {
            ((lc) this).field_H[param1] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                ((lc) this).field_l[param1][var4] = null;
            }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        kc var5 = null;
        int var6_int = 0;
        hb var6 = null;
        kc var7 = null;
        kc var8 = null;
        int var9 = 0;
        si var10 = null;
        si var11 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        L0: {
          var9 = Transmogrify.field_A ? 1 : 0;
          this.c(0, 64, param1, param0);
          if ((2 & ((lc) this).field_v[param0] ^ -1) != -1) {
            var5 = (kc) (Object) ((lc) this).field_m.field_q.b(-10231);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_u) {
                    break L2;
                  } else {
                    if (0 > var5.field_p) {
                      ((lc) this).field_u[param0][var5.field_i] = null;
                      ((lc) this).field_u[param0][param1] = var5;
                      var6_int = var5.field_C + (var5.field_x * var5.field_v >> 1458445356);
                      var5.field_C = var5.field_C + (-var5.field_i + param1 << -978726072);
                      var5.field_x = 4096;
                      var5.field_v = -var5.field_C + var6_int;
                      var5.field_i = param1;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (kc) (Object) ((lc) this).field_m.field_q.f(-33);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (si) (Object) ((lc) this).field_Q.a((long)((lc) this).field_H[param0], 0);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          L3: {
            if (param3 < -76) {
              break L3;
            } else {
              ((lc) this).f(-47);
              break L3;
            }
          }
          var6 = var10.field_j[param1];
          if (var6 != null) {
            L4: {
              var7 = new kc();
              var7.field_u = param0;
              var7.field_t = var6;
              var7.field_h = var10;
              var7.field_s = var10.field_m[param1];
              var7.field_j = var10.field_g[param1];
              var7.field_i = param1;
              var7.field_B = var10.field_n[param1] * param2 * (param2 * var11.field_h) - -1024 >> -19647541;
              var7.field_k = var10.field_p[param1] & 255;
              var7.field_C = (param1 << -1398526296) - (32767 & var10.field_k[param1]);
              var7.field_m = 0;
              var7.field_w = 0;
              var7.field_q = 0;
              var7.field_p = -1;
              var7.field_z = 0;
              if (((lc) this).field_P[param0] == 0) {
                var7.field_y = bb.a(var6, this.a(var7, (byte) 106), this.b(var7, (byte) -77), this.a(var7, 1135851910));
                break L4;
              } else {
                L5: {
                  var7.field_y = bb.a(var6, this.a(var7, (byte) 123), 0, this.a(var7, 1135851910));
                  stackOut_17_0 = this;
                  stackOut_17_1 = 0;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (-1 >= (var10.field_k[param1] ^ -1)) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L5;
                  }
                }
                ((lc) this).a(stackIn_20_1 != 0, stackIn_20_2 != 0, var7);
                break L4;
              }
            }
            L6: {
              if (var10.field_k[param1] < 0) {
                var7.field_y.h(-1);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (0 > var7.field_j) {
                break L7;
              } else {
                L8: {
                  var8 = ((lc) this).field_l[param0][var7.field_j];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (var8.field_p < 0) {
                      ((lc) this).field_u[param0][var8.field_i] = null;
                      var8.field_p = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                ((lc) this).field_l[param0][var7.field_j] = var7;
                break L7;
              }
            }
            ((lc) this).field_m.field_q.a((wf) (Object) var7, -107);
            ((lc) this).field_u[param0][param1] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        ((lc) this).field_I.g();
        ((lc) this).field_x = null;
        int var3 = 14 / ((param0 - 11) / 49);
        this.a(false, param1);
    }

    final boolean a(byte param0, int param1, int param2, int[] param3, kc param4) {
        int var6 = 0;
        nh var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = Transmogrify.field_A ? 1 : 0;
          param4.field_r = qh.field_p / 100;
          if (0 > param4.field_p) {
            break L0;
          } else {
            L1: {
              if (param4.field_y == null) {
                break L1;
              } else {
                if (!param4.field_y.l()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              param4.b(false);
              param4.c(5);
              if (param4.field_j <= 0) {
                break L2;
              } else {
                if (param4 != ((lc) this).field_l[param4.field_u][param4.field_j]) {
                  break L2;
                } else {
                  ((lc) this).field_l[param4.field_u][param4.field_j] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param4.field_x;
          if (-1 <= (var6 ^ -1)) {
            break L3;
          } else {
            L4: {
              var6 = var6 - (int)(0.5 + Math.pow(2.0, (double)((lc) this).field_y[param4.field_u] * 0.0004921259842519685) * 16.0);
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param4.field_x = var6;
            break L3;
          }
        }
        param4.field_y.e(this.a(param4, (byte) 94));
        if (param0 >= 116) {
          L5: {
            var7 = param4.field_s;
            var8 = 0;
            param4.field_l = param4.field_l + var7.field_a;
            param4.field_o = param4.field_o + 1;
            var9 = 0.000005086263020833333 * (double)((-60 + param4.field_i << 68355432) - -(param4.field_v * param4.field_x >> 1729402156));
            if (var7.field_k <= 0) {
              break L5;
            } else {
              L6: {
                if (var7.field_b <= 0) {
                  param4.field_z = param4.field_z + 128;
                  break L6;
                } else {
                  param4.field_z = param4.field_z + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_b) + 0.5);
                  break L6;
                }
              }
              if (-819201 >= (param4.field_z * var7.field_k ^ -1)) {
                var8 = 1;
                break L5;
              } else {
                break L5;
              }
            }
          }
          L7: {
            if (var7.field_g == null) {
              break L7;
            } else {
              L8: {
                if (var7.field_f <= 0) {
                  param4.field_m = param4.field_m + 128;
                  break L8;
                } else {
                  param4.field_m = param4.field_m + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_f) + 0.5);
                  break L8;
                }
              }
              L9: while (true) {
                L10: {
                  if (param4.field_q >= var7.field_g.length - 2) {
                    break L10;
                  } else {
                    if (param4.field_m <= (255 & var7.field_g[2 + param4.field_q]) << 1029106728) {
                      break L10;
                    } else {
                      param4.field_q = param4.field_q + 2;
                      continue L9;
                    }
                  }
                }
                if (param4.field_q != var7.field_g.length + -2) {
                  break L7;
                } else {
                  if (-1 != (var7.field_g[param4.field_q - -1] ^ -1)) {
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
            if ((param4.field_p ^ -1) > -1) {
              break L11;
            } else {
              if (null == var7.field_c) {
                break L11;
              } else {
                if ((1 & ((lc) this).field_v[param4.field_u]) != 0) {
                  break L11;
                } else {
                  L12: {
                    if (0 > param4.field_j) {
                      break L12;
                    } else {
                      if (((lc) this).field_l[param4.field_u][param4.field_j] != param4) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    if (var7.field_d <= 0) {
                      param4.field_p = param4.field_p + 128;
                      break L13;
                    } else {
                      param4.field_p = param4.field_p + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
                      break L13;
                    }
                  }
                  L14: while (true) {
                    L15: {
                      if ((var7.field_c.length - 2 ^ -1) >= (param4.field_w ^ -1)) {
                        break L15;
                      } else {
                        if (param4.field_p <= (255 & var7.field_c[2 + param4.field_w]) << -1167185912) {
                          break L15;
                        } else {
                          param4.field_w = param4.field_w + 2;
                          continue L14;
                        }
                      }
                    }
                    if ((param4.field_w ^ -1) != (var7.field_c.length - 2 ^ -1)) {
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
          if (var8 == 0) {
            param4.field_y.a(param4.field_r, this.b(param4, (byte) -77), this.a(param4, 1135851910));
            return false;
          } else {
            L16: {
              param4.field_y.f(param4.field_r);
              if (param3 == null) {
                param4.field_y.d(param2);
                break L16;
              } else {
                param4.field_y.b(param3, param1, param2);
                break L16;
              }
            }
            L17: {
              if (!param4.field_y.e()) {
                break L17;
              } else {
                ((lc) this).field_m.field_m.a((ag) (Object) param4.field_y);
                break L17;
              }
            }
            L18: {
              param4.b(false);
              if (param4.field_p >= 0) {
                param4.c(5);
                if (param4.field_j <= 0) {
                  break L18;
                } else {
                  if (((lc) this).field_l[param4.field_u][param4.field_j] != param4) {
                    break L18;
                  } else {
                    ((lc) this).field_l[param4.field_u][param4.field_j] = null;
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
          return true;
        }
    }

    private final synchronized void a(boolean param0, pl param1, boolean param2, byte param3) {
        int var6 = 0;
        int var7 = Transmogrify.field_A ? 1 : 0;
        this.a((byte) -100, param2);
        ((lc) this).field_I.a(param1.field_g);
        ((lc) this).field_A = param0 ? true : false;
        ((lc) this).field_O = 0L;
        int var5 = ((lc) this).field_I.c();
        if (param3 != -81) {
            return;
        }
        for (var6 = 0; var6 < var5; var6++) {
            ((lc) this).field_I.d(var6);
            ((lc) this).field_I.c(var6);
            ((lc) this).field_I.f(var6);
        }
        ((lc) this).field_n = ((lc) this).field_I.a();
        ((lc) this).field_J = ((lc) this).field_I.field_a[((lc) this).field_n];
        ((lc) this).field_s = ((lc) this).field_I.e(((lc) this).field_J);
    }

    final synchronized void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param2 == 0) {
          L0: {
            if (-1 >= (param0 ^ -1)) {
              ((lc) this).field_r[param0] = param1;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= 16) {
                  break L0;
                } else {
                  ((lc) this).field_r[var4] = param1;
                  var4++;
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 99) {
            ((lc) this).field_G = null;
        }
        ((lc) this).field_B = param1;
    }

    final boolean a(int param0, kc param1) {
        if (param0 != 7) {
            this.a(85, -70, 31);
        }
        if (param1.field_y != null) {
            return false;
        }
        if (0 <= param1.field_p) {
            param1.c(5);
            if (0 < param1.field_j) {
                if (param1 == ((lc) this).field_l[param1.field_u][param1.field_j]) {
                    ((lc) this).field_l[param1.field_u][param1.field_j] = null;
                }
            }
        }
        return true;
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          if (!((lc) this).field_I.e()) {
            break L0;
          } else {
            var2 = ((lc) this).field_w * ((lc) this).field_I.field_h / qh.field_p;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + ((lc) this).field_O;
              if (0L > -var3 + ((lc) this).field_s) {
                var5 = (int)((-1L + (((lc) this).field_s - ((lc) this).field_O) + (long)var2) / (long)var2);
                ((lc) this).field_O = ((lc) this).field_O + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((lc) this).field_m.d(var5);
                this.b(false);
                if (!((lc) this).field_I.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                ((lc) this).field_O = var3;
                break L0;
              }
            }
          }
        }
        ((lc) this).field_m.d(param0);
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = 83 / ((-33 - param2) / 63);
        ((lc) this).field_M[param0] = param1;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
          L0: {
            var2 = ((lc) this).field_n;
            var3 = ((lc) this).field_J;
            var4 = ((lc) this).field_s;
            if (((lc) this).field_x == null) {
              break L0;
            } else {
              if ((((lc) this).field_E ^ -1) != (var3 ^ -1)) {
                break L0;
              } else {
                this.a(((lc) this).field_A, ((lc) this).field_x, ((lc) this).field_k, (byte) -81);
                this.b(param0);
                return;
              }
            }
          }
          L1: while (true) {
            if (((lc) this).field_J != var3) {
              L2: {
                ((lc) this).field_n = var2;
                ((lc) this).field_s = var4;
                ((lc) this).field_J = var3;
                if (null == ((lc) this).field_x) {
                  break L2;
                } else {
                  if (((lc) this).field_E >= var3) {
                    break L2;
                  } else {
                    ((lc) this).field_J = ((lc) this).field_E;
                    ((lc) this).field_n = -1;
                    ((lc) this).field_s = ((lc) this).field_I.e(((lc) this).field_J);
                    break L2;
                  }
                }
              }
              return;
            } else {
              L3: while (true) {
                L4: {
                  if ((var3 ^ -1) != (((lc) this).field_I.field_a[var2] ^ -1)) {
                    break L4;
                  } else {
                    ((lc) this).field_I.d(var2);
                    var6 = ((lc) this).field_I.b(var2);
                    if ((var6 ^ -1) != -2) {
                      L5: {
                        if (0 == (128 & var6)) {
                          break L5;
                        } else {
                          this.b(-106, var6);
                          break L5;
                        }
                      }
                      ((lc) this).field_I.c(var2);
                      ((lc) this).field_I.f(var2);
                      continue L3;
                    } else {
                      ((lc) this).field_I.d();
                      ((lc) this).field_I.f(var2);
                      if (!((lc) this).field_I.f()) {
                        break L4;
                      } else {
                        if (null == ((lc) this).field_x) {
                          L6: {
                            if (!((lc) this).field_A) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                break L6;
                              } else {
                                ((lc) this).field_I.a(var4);
                                break L4;
                              }
                            }
                          }
                          this.a(false, true);
                          ((lc) this).field_I.g();
                          return;
                        } else {
                          ((lc) this).a(-73, ((lc) this).field_A, ((lc) this).field_x);
                          this.b(param0);
                          return;
                        }
                      }
                    }
                  }
                }
                var2 = ((lc) this).field_I.a();
                var3 = ((lc) this).field_I.field_a[var2];
                var4 = ((lc) this).field_I.e(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        if (param2 != -23780) {
            return;
        }
        this.a(14731, param0, param1);
    }

    public lc() {
        ((lc) this).field_y = new int[16];
        ((lc) this).field_H = new int[16];
        ((lc) this).field_l = new kc[16][128];
        ((lc) this).field_p = new int[16];
        ((lc) this).field_r = new int[16];
        ((lc) this).field_M = new int[16];
        ((lc) this).field_w = 1000000;
        ((lc) this).field_G = new int[16];
        ((lc) this).field_o = new int[16];
        ((lc) this).field_t = new int[16];
        ((lc) this).field_P = new int[16];
        ((lc) this).field_D = new int[16];
        ((lc) this).field_u = new kc[16][128];
        ((lc) this).field_C = new int[16];
        ((lc) this).field_B = 256;
        ((lc) this).field_v = new int[16];
        ((lc) this).field_F = new int[16];
        ((lc) this).field_K = new int[16];
        ((lc) this).field_N = new int[16];
        ((lc) this).field_z = new int[16];
        ((lc) this).field_I = new ul();
        ((lc) this).field_m = new ej((lc) this);
        ((lc) this).field_Q = new fl(128);
        ((lc) this).c(-1, 256, 0);
        this.a(false, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Return to game";
    }
}
