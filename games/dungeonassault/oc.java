/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends kl {
    static int field_E;
    go field_w;
    private ai field_F;
    static od field_A;
    private boolean field_s;
    private int field_H;
    private int field_r;
    int field_q;
    boolean field_t;
    private cn field_m;
    private hb field_n;
    private String field_D;
    private pp field_z;
    private wd field_p;
    int field_B;
    private cn field_y;
    private cn field_o;
    private int field_C;
    static String field_v;
    private boolean field_u;
    private cn field_I;
    private boolean field_x;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        kc.field_Q[lc.field_d] = param0;
        ol.field_k[lc.field_d] = lc.field_d;
        i.field_t[lc.field_d] = param5;
        if (!(param5 <= ln.field_d)) {
            n.field_d = param5;
        }
        if (param1 >= -48) {
            oc.a(113, (byte) -124, -63, 82, 80, 14);
        }
        if (!(param5 >= ib.field_e)) {
            da.field_B = param5;
        }
        mf.field_d[lc.field_d] = param2;
        wa.field_m[lc.field_d] = param3;
        tc.field_w[lc.field_d] = param4;
        int var6 = param4 + param2 + param3;
        int var7 = -1 == (var6 ^ -1) ? 0 : 1000 * param2 / var6;
        ci.field_n[lc.field_d] = var7;
        if (!(var7 >= da.field_B)) {
            da.field_B = var7;
        }
        lc.field_d = lc.field_d + 1;
        if (var7 > n.field_d) {
            n.field_d = var7;
        }
    }

    final void c(byte param0) {
        int var2 = 87 % ((-34 - param0) / 57);
        super.c((byte) -113);
        this.field_C = this.field_C + 1;
        if (this.field_C == 100) {
            this.d(126);
        }
        if ((this.field_C ^ -1) == -116) {
            this.d(true);
        }
        this.field_p.a((byte) 109, 20);
    }

    final void a(boolean param0) {
        super.a(param0);
        if (this.field_z == hh.field_s) {
            if (-101 < (this.field_C ^ -1)) {
                this.field_C = 100;
                this.d(127);
            } else {
                if (this.field_C > 175) {
                    this.field_d = true;
                    if (null != this.field_n.field_n.field_e) {
                        this.field_n.field_n.field_e.a((byte) -19);
                    }
                    if (null != this.field_n.field_n.field_t) {
                        this.field_n.field_n.field_t.a((byte) -19);
                    }
                    if (!(null == this.field_n.field_n.field_v)) {
                        this.field_n.field_n.field_v.a((byte) -19);
                    }
                    System.gc();
                    this.field_w.a(this.field_B, this.field_q, this.field_t, -1);
                }
            }
        }
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 != 4296) {
            oc.e(-11);
        }
        field_A = null;
    }

    private final void d(int param0) {
        this.field_p.a(ga.field_n, this.field_x ? this.field_n.field_n.field_t : this.field_n.field_n.field_v, -10872);
        if (param0 <= 124) {
            return;
        }
        if (this.field_x) {
            t.a(1024, dd.field_B, false, true);
        }
        if (this.field_x) {
            qh.a(-13716, this.field_z, 10);
        } else {
            if (this.field_F.field_h.field_g != 3) {
                qh.a(-13716, this.field_z, 11);
            }
        }
    }

    final void b(byte param0) {
        int[] var2 = null;
        int var3_int = 0;
        cn var3 = null;
        int[] var4 = null;
        cn var5 = null;
        ph var6 = null;
        cn var7 = null;
        cn var8 = null;
        int var9 = 0;
        int[] var10 = null;
        var9 = DungeonAssault.field_K;
        var10 = new int[64];
        var2 = var10;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= 64) {
            L1: {
              var3 = te.a(-32 + this.field_a, this.field_i + -28, var10, 16, 8, 0.125);
              var4 = te.b(-32 + this.field_a, this.field_i - 28, 0.125);
              var5 = new cn(0, 0);
              var5.field_v = -28 + this.field_i;
              var5.field_y = -32 + this.field_a;
              var5.field_B = var4;
              var6 = new ph(var3, var5);
              var7 = new cn(this.field_a, this.field_i);
              var8 = new cn(this.field_a, this.field_i);
              this.field_l = new ph(var7, var8);
              jh.a(this.field_l);
              var6.b(16, 16);
              if (param0 == 37) {
                break L1;
              } else {
                this.c((byte) -26);
                break L1;
              }
            }
            qe.a(23, 13, this.field_a - 46, -34 + this.field_i, 256, 32, 8, 128);
            jc.a(this.field_i - 26, 16, 14, 1, 2, 1);
            jc.a(-26 + this.field_i, -24 + this.field_a, 14, 1, param0 + -35, 1);
            vd.a(-16 + this.field_a, 2, -14561, 2, 8, 0);
            vd.a(this.field_a, 2, param0 ^ -14534, 2, 0, 6);
            vd.a(this.field_a, 2, param0 + -14598, 2, 0, 54);
            vd.a(-16 + this.field_a, 2, -14561, 2, 8, -16 + this.field_i);
            vd.a(this.field_a, 2, param0 ^ -14534, 2, 0, -22 + this.field_i);
            jc.a(40, 80, 14, 1, 2, 1);
            jc.a(40, -88 + this.field_a, 14, 1, 2, 1);
            oe.field_m.h(8, 21);
            oe.field_m.j(-63 + this.field_a, 21);
            ad.field_e.i(23, this.field_i - 38);
            ad.field_e.f(-39 + this.field_a, -38 + this.field_i);
            da.a(bb.field_q, cm.field_M, this.field_a >> -1853204767, param0 + 1917623580, 14 - -(ne.field_c.field_H + 36 >> 212455009), ne.field_c);
            jh.b();
            return;
          } else {
            var10[var3_int] = mp.a(-2147483648, 1579032 - -(65793 * var3_int));
            var3_int++;
            continue L0;
          }
        }
    }

    oc(hb param0, ai param1, boolean param2, String param3) {
        super(350, 400);
        int discarded$3 = 0;
        int discarded$4 = 0;
        o discarded$5 = null;
        RuntimeException var5 = null;
        int var5_int = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        String var9_ref = null;
        int var10 = 0;
        String var11 = null;
        String[] var13 = null;
        String var14 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_16_0 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        String stackOut_15_0 = null;
        String stackOut_14_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            L1: {
              this.field_F = param1;
              this.field_D = param3;
              this.field_n = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((oc) (this)).field_x = stackIn_4_1 != 0;
              this.field_C = 0;
              this.field_r = oi.b(0, 4);
              discarded$3 = ub.a((byte) 15, this.field_r);
              this.field_H = oi.b(0, 4);
              discarded$4 = ub.a((byte) 15, this.field_H);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (0 != oi.b(0, 2)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((oc) (this)).field_s = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (oi.b(0, 2) != 0) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            ((oc) (this)).field_u = stackIn_10_1 != 0;
            this.field_p = new wd(this.field_n.field_n.field_e);
            this.field_z = tn.a((this.field_a + -jm.field_i.field_y >> 280309281) + this.field_k, this.field_i + this.field_j - jm.field_i.field_v, ne.field_c, jm.field_i, -75, hj.field_X);
            this.field_f.a(this.field_z, false);
            var5_int = this.field_a + -64;
            var6 = jn.a(this.field_D, new int[]{var5_int}, -105, la.field_b);
            var7 = var6.length * la.field_b.field_H + la.field_b.field_E;
            jh.c();
            this.field_m = new cn(var5_int, var7);
            this.field_m.e();
            var8 = la.field_b.field_H;
            var13 = var6;
            var9 = var13;
            var10 = 0;
            L4: while (true) {
              if (var13.length <= var10) {
                L5: {
                  this.field_o = new cn(var5_int + 4, 4 + var7);
                  this.field_o.e();
                  this.field_m.e(2, 2, 12690143);
                  gf.d(2, 2, 0, 0, 4 + var5_int, 4 + var7);
                  if (!this.field_x) {
                    stackOut_15_0 = lp.field_n;
                    stackIn_16_0 = stackOut_15_0;
                    break L5;
                  } else {
                    stackOut_14_0 = ac.field_h;
                    stackIn_16_0 = stackOut_14_0;
                    break L5;
                  }
                }
                L6: {
                  var14 = stackIn_16_0;
                  var9_ref = var14;
                  if (this.field_x) {
                    stackOut_18_0 = 16744448;
                    stackIn_19_0 = stackOut_18_0;
                    break L6;
                  } else {
                    stackOut_17_0 = 8421504;
                    stackIn_19_0 = stackOut_17_0;
                    break L6;
                  }
                }
                var10 = stackIn_19_0;
                var5_int = ne.field_c.b(var14);
                var7 = ne.field_c.field_E + ne.field_c.field_H;
                this.field_y = new cn(var5_int, var7);
                this.field_y.e();
                ne.field_c.b(var14, 0, ne.field_c.field_H, var10, -1);
                this.field_I = rb.a(16, this.field_y, var10, (byte) 100);
                this.field_y.d(65793);
                jh.b();
                discarded$5 = gd.a(64, bc.field_b);
                break L0;
              } else {
                var11 = var13[var10];
                la.field_b.c(var11, var5_int >> 1108971361, var8, 16777215, -1);
                var8 = var8 + la.field_b.field_H;
                var10++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("oc.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
    }

    private final void d(boolean param0) {
        o discarded$4 = null;
        o discarded$5 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.c((byte) 56);
            break L0;
          }
        }
        L1: {
          if (!this.field_x) {
            if (this.field_n.field_n.field_g != null) {
              discarded$4 = gd.a(64, this.field_n.field_n.field_g);
              break L1;
            } else {
              break L1;
            }
          } else {
            if (this.field_n.field_n.field_p == null) {
              break L1;
            } else {
              discarded$5 = gd.a(64, this.field_n.field_n.field_p);
              break L1;
            }
          }
        }
    }

    final void b(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        int var6 = 0;
        int[] var8 = null;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        cn var19 = null;
        cn var20 = null;
        L0: {
          var18 = DungeonAssault.field_K;
          super.b(105);
          var2 = Math.log(0.02) * -0.005;
          var4 = 0.5 / var2;
          var6 = (int)(-0.5 + var4 * (1.0 - Math.exp(-var2 * (double)this.field_C)) + (double)this.field_r);
          var6 = var6 % hf.field_ib.field_c;
          if (this.field_s) {
            var6 = -1 + (hf.field_ib.field_c - var6);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var19 = hf.field_ib.a(108, var6, 108, 0);
          if (var19 != null) {
            var19.c(10, 57);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = (int)(-0.5 + (1.0 - Math.exp(-var2 * (double)this.field_C)) * var4 + (double)this.field_H);
          var6 = var6 % hf.field_ib.field_c;
          if (!this.field_u) {
            break L2;
          } else {
            var6 = hf.field_ib.field_c + (-1 - var6);
            break L2;
          }
        }
        L3: {
          var20 = hf.field_ib.a(108, var6, 108, 0);
          if (var20 != null) {
            var20.c(518, 57);
            break L3;
          } else {
            break L3;
          }
        }
        var8 = new int[64];
        var9_int = 0;
        L4: while (true) {
          if (-65 >= (var9_int ^ -1)) {
            L5: {
              var9 = null;
              if (this.field_C < 250) {
                var9 = te.a(224, 224, this.field_C, var8, 32, 24, 0.03125);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var10 = (this.field_a - 216 >> 571821953) + this.field_k;
              var11 = this.field_j + 80;
              var12 = this.field_k - -(-this.field_o.field_y + this.field_a >> -1601461631);
              var13 = 79 % ((41 - param0) / 63);
              var14 = 230 + (var11 + (60 + -this.field_o.field_v >> 505219809));
              gf.b(-8 + var10, var11 - 8, 232, 232, 0);
              rp.a(4, 224, (byte) 108, var10 - 4, 224, kc.field_S, var11 - 4);
              if (this.field_C >= 100) {
                L7: {
                  this.field_p.a(216, var11, (byte) 102, var10, 216);
                  if (this.field_C >= 250) {
                    var15 = var10 + (-this.field_y.field_y + 216 >> 561741729);
                    var16 = var11 - -208 - this.field_y.field_v;
                    this.field_I.b(var15, var16, 256);
                    this.field_y.h(var15, var16);
                    break L7;
                  } else {
                    var15 = 192 + -(192 * (-100 + this.field_C) / 150);
                    ((cn) (var9)).d(var10 - 4, var11 + -4, var15);
                    var15 = (this.field_C - 100 << 686413832) / 150;
                    var16 = var10 + (216 + -this.field_y.field_y >> 780905761);
                    var17 = var11 + (-this.field_y.field_v + 208);
                    this.field_I.b(var16, var17, var15);
                    this.field_y.d(var16, var17, var15);
                    break L7;
                  }
                }
                if (175 > this.field_C) {
                  this.field_o.b(-2 + var12, -2 + var14, (this.field_C * 256 + -25600) / 75);
                  break L6;
                } else {
                  if ((this.field_C ^ -1) <= -251) {
                    this.field_m.b(var12, var14, 256);
                    break L6;
                  } else {
                    this.field_o.b(var12 - 2, var14 + -2, -((256 * (this.field_C + -100) + -19200) / 75) + 256);
                    this.field_m.b(var12, var14, (this.field_C - 100 - 150 + -75) * 256 / 75);
                    break L6;
                  }
                }
              } else {
                this.field_p.a(216, var11, (byte) 102, var10, 216);
                ((cn) (var9)).d(-4 + var10, -4 + var11, 192);
                break L6;
              }
            }
            return;
          } else {
            var8[var9_int] = mp.a(65793 * (24 + var9_int), -2147483648);
            var9_int++;
            continue L4;
          }
        }
    }

    static {
        field_E = -1;
        field_A = new od();
        field_v = "You are charging 1 Orb of Mastery!";
    }
}
