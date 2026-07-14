/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj implements up {
    private int field_f;
    private int field_a;
    private int field_d;
    private int field_b;
    private ws[] field_g;
    private wl field_e;
    private int field_c;
    private int field_h;

    public final void b(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 != 10383) {
            ((wj) this).field_e = (wl) null;
        }
        ((wj) this).field_a = ((wj) this).field_a & -5;
        ((wj) this).field_c = this.d(-15395);
    }

    private final void a(int param0, int param1, int param2, nr param3) {
        if (-1 == ((wj) this).field_c) {
            throw new RuntimeException();
        }
        int var5 = 1 << param2;
        if (param0 != ((var5 ^ -1) & ((wj) this).field_b)) {
            if (((wj) this).field_h == ((nr) param3).field_m) {
                // if_icmpeq L99
            }
            throw new RuntimeException();
        }
        ((wj) this).field_f = ((nr) param3).field_k;
        ((wj) this).field_h = ((nr) param3).field_m;
        param3.a(fo.field_f[param2], param0 + 0, param1, ((wj) this).field_c);
        ((wj) this).field_g[param2] = (ws) (Object) param3;
        ((wj) this).field_b = ((wj) this).field_b | var5;
    }

    final static void e(byte param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        wu var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        wu var17 = null;
        int var18 = 0;
        int var19 = 0;
        jt var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        var19 = AceOfSkies.field_G ? 1 : 0;
        qg.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
        var1 = gp.field_y.length;
        var24 = new int[var1];
        var23 = var24;
        var22 = var23;
        var21 = var22;
        var2 = var21;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var1) {
            L1: {
              var3 = qg.field_e[9] >> 1287799656;
              var4 = qg.field_e[10] >> -1720053816;
              var5 = qg.field_e[11] >> -925919960;
              var6 = it.field_c << 1864240292;
              var7 = 0;
              var8 = tg.a(var6, -4097) >> 351874312;
              var9 = u.a(-108, var6) >> -2129404376;
              if (ic.field_b == -1) {
                break L1;
              } else {
                if (-1 != cf.field_g) {
                  var7 = -320 + ic.field_b;
                  var9 = -128;
                  var8 = 240 - cf.field_g;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var10 = 256.0 / Math.sqrt((double)(var7 * var7 + var8 * var8 + var9 * var9));
              var8 = (int)((double)var8 * var10);
              var7 = (int)((double)var7 * var10);
              var9 = (int)((double)var9 * var10);
              if (param0 <= -106) {
                break L2;
              } else {
                var20 = (jt) null;
                wj.a(-122, (rk) null, (java.awt.Component) null, 3, true, (jt) null, -104, 35);
                break L2;
              }
            }
            var12 = var7 + -var3;
            var13 = -var4 + var8;
            var14 = var9 + -var5;
            var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var12 * var12 + var13 * var13)));
            var13 = (int)((double)var13 * var10);
            var12 = (int)((double)var12 * var10);
            var14 = (int)((double)var14 * var10);
            var15 = 0;
            L3: while (true) {
              if (gp.field_y.length <= var15) {
                return;
              } else {
                var16 = 0;
                var17_int = 1;
                L4: while (true) {
                  if (gp.field_y.length <= var17_int) {
                    var24[var16] = -2147483648;
                    var17 = gp.field_y[var16];
                    kg.a(0, var16);
                    var18 = 0;
                    L5: while (true) {
                      if (3 <= var18) {
                        eg.a(var17, qg.field_e, 45, true, false, rb.field_k, false);
                        hg.a(var14, var8, var13, var12, var9, 255, var7, var17);
                        var15++;
                        continue L3;
                      } else {
                        rb.field_k[var18] = rb.field_k[var18] + ia.field_a[var15][var18];
                        var18++;
                        continue L5;
                      }
                    }
                  } else {
                    if (var24[var16] < var24[var17_int]) {
                      var16 = var17_int;
                      var17_int++;
                      continue L4;
                    } else {
                      var17_int++;
                      continue L4;
                    }
                  }
                }
              }
            }
          } else {
            var4_ref = gp.field_y[var3];
            var4_ref.b(32767);
            kg.a(0, var3);
            var5 = ((wu) var4_ref).field_b + ((wu) var4_ref).field_N >> -1745503295;
            var6 = ((wu) var4_ref).field_h + ((wu) var4_ref).field_J >> -94260415;
            var7 = ((wu) var4_ref).field_A + ((wu) var4_ref).field_s >> 742581633;
            var8 = qg.field_e[9] >> -768194462;
            var9 = qg.field_e[10] >> 677545026;
            var10_int = qg.field_e[11] >> 1245138626;
            var11 = var10_int * rb.field_k[5] + var8 * rb.field_k[3] - -(rb.field_k[4] * var9) >> 1699797454;
            var12 = var9 * rb.field_k[7] + var8 * rb.field_k[6] - -(var10_int * rb.field_k[8]) >> 369868846;
            var13 = var8 * rb.field_k[9] - -(rb.field_k[10] * var9) - -(var10_int * rb.field_k[11]) >> 1112563886;
            var2[var3] = var11 * var5 - (-(var12 * var6) - var7 * var13) >> -279902224;
            var3++;
            continue L0;
          }
        }
    }

    final void a(int param0, byte param1) {
        if (null != ((wj) this).field_g[param0]) {
            ((wj) this).field_g[param0].a((byte) 11);
        }
        if (param1 > -17) {
            ((wj) this).field_f = -115;
        }
        ((wj) this).field_b = ((wj) this).field_b & (1 << param0 ^ -1);
        ((wj) this).field_g[param0] = null;
    }

    private final int d(int param0) {
        if (0 != (((wj) this).field_a & 4)) {
            return 36160;
        }
        if (!((((wj) this).field_a & 2) == 0)) {
            return 36009;
        }
        if (!(0 == (((wj) this).field_a & 1))) {
            return 36008;
        }
        if (param0 != -15395) {
            ((wj) this).c((byte) -77);
        }
        return -1;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, ((wj) this).field_d);
        ((wj) this).field_a = ((wj) this).field_a | 4;
        if (param0 != -19065) {
            return;
        }
        ((wj) this).field_c = this.d(-15395);
    }

    public final void c(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, ((wj) this).field_d);
        ((wj) this).field_a = ((wj) this).field_a | 1;
        if (param0 <= 79) {
            return;
        }
        ((wj) this).field_c = this.d(-15395);
    }

    final void a(int param0, nr param1, int param2) {
        if (param2 != -5531) {
            return;
        }
        this.a(0, 0, param0, param1);
    }

    final void a(cu param0, int param1, byte param2) {
        if (((wj) this).field_c == -1) {
            throw new RuntimeException();
        }
        int var4 = 1 << param1;
        if ((((wj) this).field_b & (var4 ^ -1)) == 0) {
            ((wj) this).field_h = ((cu) param0).field_u;
            ((wj) this).field_f = ((cu) param0).field_v;
        } else {
            if (((wj) this).field_h == ((cu) param0).field_u) {
                // if_icmpeq L97
            }
            throw new RuntimeException();
        }
        param0.a(((wj) this).field_c, -12658, fo.field_f[param1]);
        ((wj) this).field_g[param1] = (ws) (Object) param0;
        ((wj) this).field_b = ((wj) this).field_b | var4;
        if (param2 != 119) {
            ((wj) this).field_h = -18;
        }
    }

    public final void c(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, ((wj) this).field_d);
        if (param0 != -1122) {
            ((wj) this).field_a = 59;
        }
        ((wj) this).field_a = ((wj) this).field_a | 2;
        ((wj) this).field_c = this.d(-15395);
    }

    protected final void finalize() throws Throwable {
        ((wj) this).field_e.a((byte) -85, ((wj) this).field_d);
        this.finalize();
    }

    final static void a(int param0, rk param1, java.awt.Component param2, int param3, boolean param4, jt param5, int param6, int param7) {
        tk.a(param3, param4, 10);
        um.field_m = tk.a(param1, param2, 0, param6);
        da.field_a = tk.a(param1, param2, 1, param7);
        qn.field_b = new tp();
        int var8 = -86 % ((param0 - -12) / 37);
        kc.field_c = param7;
        da.field_a.a((rf) (Object) qn.field_b);
        wt.field_e = param5;
        wt.field_e.a((byte) 125, l.field_c);
        um.field_m.a((rf) (Object) wt.field_e);
    }

    final boolean d(byte param0) {
        int var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((wj) this).field_c);
        if (param0 != -64) {
            return true;
        }
        if (-36054 != (var2 ^ -1)) {
            return false;
        }
        return true;
    }

    public final void b(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        ((wj) this).field_a = ((wj) this).field_a & -3;
        int var2 = -33 / ((-88 - param0) / 38);
        ((wj) this).field_c = this.d(-15395);
    }

    final static void e(int param0) {
        ul.field_r.field_j = 0;
        ul.field_r.field_e = 0;
        if (param0 <= 74) {
            return;
        }
    }

    public final void a(byte param0) {
        if (param0 <= 65) {
            ((wj) this).field_h = 108;
        }
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        ((wj) this).field_a = ((wj) this).field_a & -2;
        ((wj) this).field_c = this.d(-15395);
    }

    wj(wl param0) {
        ((wj) this).field_a = 0;
        ((wj) this).field_c = -1;
        ((wj) this).field_g = new ws[9];
        if (!((wl) param0).field_A) {
            throw new IllegalStateException("");
        }
        ((wj) this).field_e = param0;
        jaggl.OpenGL.glGenFramebuffersEXT(1, ho.field_c, 0);
        ((wj) this).field_d = ho.field_c[0];
    }

    static {
    }
}
