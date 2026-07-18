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
            ((wj) this).field_e = null;
        }
        ((wj) this).field_a = ((wj) this).field_a & -5;
        int discarded$0 = -15395;
        ((wj) this).field_c = this.d();
    }

    private final void a(int param0, int param1, int param2, nr param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (-1 != ((wj) this).field_c) {
              L1: {
                var5_int = 1 << param2;
                if (0 == (~var5_int & ((wj) this).field_b)) {
                  ((wj) this).field_f = param3.field_k;
                  ((wj) this).field_h = param3.field_m;
                  break L1;
                } else {
                  L2: {
                    if (((wj) this).field_h != param3.field_m) {
                      break L2;
                    } else {
                      if (param3.field_k == ((wj) this).field_f) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              }
              param3.a(fo.field_f[param2], 0, 0, ((wj) this).field_c);
              ((wj) this).field_g[param2] = (ws) (Object) param3;
              ((wj) this).field_b = ((wj) this).field_b | var5_int;
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("wj.G(").append(0).append(',').append(0).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        wu var4_ref_wu = null;
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
        Object var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            qg.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = gp.field_y.length;
            var24 = new int[var1_int];
            var23 = var24;
            var22 = var23;
            var21 = var22;
            var2 = var21;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var1_int) {
                L2: {
                  var3 = qg.field_e[9] >> 8;
                  var4 = qg.field_e[10] >> 8;
                  var5 = qg.field_e[11] >> 8;
                  var6 = it.field_c << 4;
                  var7 = 0;
                  var8 = tg.a(var6, -4097) >> 8;
                  var9 = u.a(-108, var6) >> 8;
                  if (ic.field_b == -1) {
                    break L2;
                  } else {
                    if (-1 != cf.field_g) {
                      var7 = -320 + ic.field_b;
                      var9 = -128;
                      var8 = 240 - cf.field_g;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var10 = 256.0 / Math.sqrt((double)(var7 * var7 + var8 * var8 + var9 * var9));
                  var8 = (int)((double)var8 * var10);
                  var7 = (int)((double)var7 * var10);
                  var9 = (int)((double)var9 * var10);
                  if (param0 <= -106) {
                    break L3;
                  } else {
                    var20 = null;
                    wj.a(-122, (rk) null, (java.awt.Component) null, 3, true, (jt) null, -104, 35);
                    break L3;
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
                L4: while (true) {
                  if (gp.field_y.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (gp.field_y.length <= var17_int) {
                        var24[var16] = -2147483648;
                        var17 = gp.field_y[var16];
                        kg.a(0, var16);
                        var18 = 0;
                        L6: while (true) {
                          if (3 <= var18) {
                            int discarded$1 = 0;
                            eg.a(var17, qg.field_e, 45, true, false, rb.field_k);
                            hg.a(var14, var8, var13, var12, var9, 255, var7, var17);
                            var15++;
                            continue L4;
                          } else {
                            rb.field_k[var18] = rb.field_k[var18] + ia.field_a[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if (var24[var16] < var24[var17_int]) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_wu = gp.field_y[var3];
                var4_ref_wu.b(32767);
                kg.a(0, var3);
                var5 = var4_ref_wu.field_b + var4_ref_wu.field_N >> 1;
                var6 = var4_ref_wu.field_h + var4_ref_wu.field_J >> 1;
                var7 = var4_ref_wu.field_A + var4_ref_wu.field_s >> 1;
                var8 = qg.field_e[9] >> 2;
                var9 = qg.field_e[10] >> 2;
                var10_int = qg.field_e[11] >> 2;
                var11 = var10_int * rb.field_k[5] + var8 * rb.field_k[3] - -(rb.field_k[4] * var9) >> 14;
                var12 = var9 * rb.field_k[7] + var8 * rb.field_k[6] - -(var10_int * rb.field_k[8]) >> 14;
                var13 = var8 * rb.field_k[9] - -(rb.field_k[10] * var9) - -(var10_int * rb.field_k[11]) >> 14;
                var2[var3] = var11 * var5 - (-(var12 * var6) - var7 * var13) >> 16;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "wj.N(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (null != ((wj) this).field_g[param0]) {
            ((wj) this).field_g[param0].a((byte) 11);
        }
        if (param1 > -17) {
            ((wj) this).field_f = -115;
        }
        ((wj) this).field_b = ((wj) this).field_b & ~(1 << param0);
        ((wj) this).field_g[param0] = null;
    }

    private final int d() {
        if (0 != (((wj) this).field_a & 4)) {
            return 36160;
        }
        if (!((((wj) this).field_a & 2) == 0)) {
            return 36009;
        }
        if (!(0 == (((wj) this).field_a & 1))) {
            return 36008;
        }
        return -1;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, ((wj) this).field_d);
        ((wj) this).field_a = ((wj) this).field_a | 4;
        if (param0 != -19065) {
            return;
        }
        int discarded$0 = -15395;
        ((wj) this).field_c = this.d();
    }

    public final void c(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, ((wj) this).field_d);
        ((wj) this).field_a = ((wj) this).field_a | 1;
        if (param0 <= 79) {
            return;
        }
        int discarded$0 = -15395;
        ((wj) this).field_c = this.d();
    }

    final void a(int param0, nr param1, int param2) {
        if (param2 != -5531) {
            return;
        }
        try {
            this.a(0, 0, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wj.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(cu param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((wj) this).field_c != -1) {
              L1: {
                var4_int = 1 << param1;
                if ((((wj) this).field_b & ~var4_int) != 0) {
                  L2: {
                    if (((wj) this).field_h != param0.field_u) {
                      break L2;
                    } else {
                      if (((wj) this).field_f == param0.field_v) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  throw new RuntimeException();
                } else {
                  ((wj) this).field_h = param0.field_u;
                  ((wj) this).field_f = param0.field_v;
                  break L1;
                }
              }
              L3: {
                param0.a(((wj) this).field_c, -12658, fo.field_f[param1]);
                ((wj) this).field_g[param1] = (ws) (Object) param0;
                ((wj) this).field_b = ((wj) this).field_b | var4_int;
                if (param2 == 119) {
                  break L3;
                } else {
                  ((wj) this).field_h = -18;
                  break L3;
                }
              }
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("wj.K(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void c(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, ((wj) this).field_d);
        if (param0 != -1122) {
            ((wj) this).field_a = 59;
        }
        ((wj) this).field_a = ((wj) this).field_a | 2;
        int discarded$0 = -15395;
        ((wj) this).field_c = this.d();
    }

    protected final void finalize() throws Throwable {
        ((wj) this).field_e.a((byte) -85, ((wj) this).field_d);
        super.finalize();
    }

    final static void a(int param0, rk param1, java.awt.Component param2, int param3, boolean param4, jt param5, int param6, int param7) {
        try {
            int discarded$0 = 10;
            tk.a(param3, param4);
            um.field_m = tk.a(param1, param2, 0, param6);
            da.field_a = tk.a(param1, param2, 1, param7);
            qn.field_b = new tp();
            int var8_int = -86 % ((param0 - -12) / 37);
            kc.field_c = param7;
            da.field_a.a((rf) (Object) qn.field_b);
            wt.field_e = param5;
            wt.field_e.a((byte) 125, l.field_c);
            um.field_m.a((rf) (Object) wt.field_e);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wj.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean d(byte param0) {
        int var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((wj) this).field_c);
        if (param0 != -64) {
            return true;
        }
        if (var2 != 36053) {
            return false;
        }
        return true;
    }

    public final void b(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        ((wj) this).field_a = ((wj) this).field_a & -3;
        int var2 = -33 / ((-88 - param0) / 38);
        int discarded$0 = -15395;
        ((wj) this).field_c = this.d();
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
        int discarded$0 = -15395;
        ((wj) this).field_c = this.d();
    }

    wj(wl param0) {
        ((wj) this).field_a = 0;
        ((wj) this).field_c = -1;
        ((wj) this).field_g = new ws[9];
        try {
            if (!param0.field_A) {
                throw new IllegalStateException("");
            }
            ((wj) this).field_e = param0;
            jaggl.OpenGL.glGenFramebuffersEXT(1, ho.field_c, 0);
            ((wj) this).field_d = ho.field_c[0];
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
