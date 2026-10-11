/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends im {
    private String field_Ib;
    static String field_Fb;
    static int field_Mb;
    private int[] field_Db;
    static int field_Kb;
    private boolean field_Lb;
    private hd field_Cb;
    private vc field_Hb;
    static double field_Gb;
    private hd field_Jb;
    private pu[] field_Eb;

    final void c(int param0, boolean param1) {
        int var4 = 0;
        int stackIn_8_0 = 0;
        hd stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        hd stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        int var3;
        int var5;
        sj var6;
        var5 = Kickabout.field_G;
        if (!this.field_Lb) {
          if (cq.e(15137)) {
            stackIn_8_0 = (!np.h((byte) 19)) ? 1 : 0;
          } else {
            stackIn_8_0 = 0;
          }
          var3 = stackIn_8_0;
          stackIn_18_0 = this.field_Cb;
          stackIn_19_1 = (!la.a(100)) && (!dg.field_e) && (!ds.field_g) && (var3 == 0) && (!tu.field_E.a(1, this.field_Hb.field_a)) && (this.field_Hb.field_r) && (!this.field_Hb.field_j) && (!this.field_Hb.field_h) && (!this.field_Hb.field_q);
          stackIn_18_0.field_lb = stackIn_19_1;
          stackIn_29_0 = this.field_Jb;
          stackIn_30_1 = (!la.a(100)) && (!dg.field_e) && (!ds.field_g) && (var3 == 0) && (!tu.field_E.a(1, this.field_Hb.field_a)) && (-1L != this.field_Hb.field_k) && (!this.field_Hb.field_j) && (!this.field_Hb.field_h) && (!tu.field_E.a(this.field_Hb.field_a, (byte) -79));
          stackIn_29_0.field_lb = stackIn_30_1;
          if (param1) {
            for (var4 = 0; var4 < this.field_Eb.length; var4++) {
              this.field_Eb[var4].h((byte) 30);
            }
          }
          if (this.field_Jb.field_sb == 1) {
            if (tu.field_E.a(param0 ^ 1, this.field_Hb.field_a)) {
              tb.a((byte) 126, 31);
              sp.c(53, param0 - 9);
            } else {
              if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
                tb.a((byte) 126, 3);
                sp.c(53, -3);
              } else {
                if (tu.field_E.c(-3)) {
                  if (tu.field_E.d(-1) == -1) {
                    tb.a((byte) 126, 2);
                    sp.c(53, 112);
                  } else {
                    if (this.field_Hb.field_i > tu.field_E.field_x) {
                      tb.a((byte) 126, 4);
                      sp.c(53, 9);
                    } else {
                      oj.a(-45, this.field_Hb);
                    }
                  }
                } else {
                  tb.a((byte) 126, 6);
                  sp.c(53, 34);
                }
              }
            }
          }
          if (this.field_Cb.field_sb == 1) {
            if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
              if (this.field_Hb.field_t > tu.field_E.field_x) {
                tb.a((byte) 126, 4);
                sp.c(53, -113);
              } else {
                ca.a(this.field_Hb, 255);
              }
            } else {
              if (!tu.field_E.a(param0 + 1, this.field_Hb.field_a)) {
                if (this.field_Hb.field_t > tu.field_E.field_x) {
                  tb.a((byte) 126, 4);
                  sp.c(53, -12);
                } else {
                  if (tu.field_E.c(-3)) {
                    if (tu.field_E.d(-1) == -1) {
                      tb.a((byte) 126, 2);
                      sp.c(53, 40);
                    } else {
                      is.a((byte) -123, this.field_Hb);
                    }
                  } else {
                    tb.a((byte) 126, 6);
                    sp.c(53, 111);
                  }
                }
              } else {
                tb.a((byte) 126, 31);
                sp.c(53, 54);
              }
            }
          }
        }
        if (param0 != 0) {
          var6 = (sj) null;
          jr.a((sj) null, 41, 84);
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 15377) {
          this.field_Ib = (String) null;
        }
        stackIn_6_0 = (this.field_Lb) && (this.field_Ib != null);
        return stackIn_6_0;
    }

    final void b(int param0, int param1) {
        up stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        up stackIn_14_0;
        int stackIn_14_1;
        up stackIn_14_2;
        int stackIn_14_3;
        boolean stackIn_15_4 = false;
        boolean stackIn_19_2 = false;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0;
        int stackIn_44_1;
        int stackIn_44_2;
        int stackIn_44_3;
        boolean stackIn_46_4;
        String stackIn_58_0 = null;
        int var4;
        ot var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var9_int;
        int var10;
        int var11;
        up var12;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        if (on.field_h >= this.field_T &&
          this.field_T + this.field_mb >= on.field_e) {
          var12 = new up();
          if (param0 != 0) {
            field_Fb = (String) null;
          }
          if (!this.field_Lb) {
            var12.a((byte) -81, this.field_Hb.field_m);
            stackIn_9_0 = var12;
            stackIn_10_1 = (tu.field_E.a(1, this.field_Hb.field_a)) ? false : true;
            stackIn_9_0.field_c = stackIn_10_1;
          }
          var4 = this.field_F;
          if (!this.field_Lb) {
            stackIn_14_0 = var12;
            stackIn_14_1 = 0;
            stackIn_14_2 = var12;
            stackIn_14_3 = -107;
            stackIn_15_4 = !(jd.f(-1));
            stackIn_19_2 = (((up) (Object) stackIn_14_2).c((byte) stackIn_14_3, stackIn_15_4)) && (wn.a((byte) 1));
            var5 = kk.a(stackIn_14_0, stackIn_14_1, stackIn_19_2);
            if (var5 != null) {
              var5.c(1 + var4, this.field_T + 4);
            } else {
              jr.a(1 + var4 + 19, -97, this.field_T + 4 + 23);
            }
            this.field_X.a(var12.d(100), 45 + var4, (this.field_mb >> 1) + this.field_T + 4, this.field_y, -1);
            var4 = var4 + this.field_Db[0];
            if (tu.field_E.a(this.field_Hb.field_a, (byte) -79)) {
              q.field_d.c(tf.field_b.toUpperCase(), var4 - 10, -7 + (this.field_mb + this.field_T), 6745702, -1);
            } else {
              if (!tu.field_E.a(1, this.field_Hb.field_a)) {
                if (tu.field_E.b(30524, this.field_Hb.field_a)) {
                  q.field_d.c(fb.field_O.toUpperCase(), -10 + var4, -7 + this.field_mb + this.field_T, 16777028, -1);
                }
              } else {
                q.field_d.c(bk.field_g.toUpperCase(), -10 + var4, this.field_T - (-this.field_mb + 7), 16737894, -1);
              }
            }
            this.field_X.a(uf.field_e[var12.field_q], 12 + var4, this.field_T + (this.field_mb >> 1) + 4, this.field_y, -1);
            var4 = var4 + this.field_Db[1];
            var6 = 7 + var4;
            for (var7 = 0; 3 > var7; var7++) {
              var8 = 5 + this.field_T + 15 * var7;
              if (var7 != 0) {
                if (var7 != 1) {
                  stackIn_36_0 = var12.field_o;
                } else {
                  stackIn_36_0 = var12.field_g;
                }
              } else {
                stackIn_36_0 = var12.field_n;
              }
              var9_int = stackIn_36_0;
              if (var7 != 0) {
                if (var7 == 1) {
                  stackIn_41_0 = var12.a(5205, oi.b(87));
                } else {
                  stackIn_41_0 = var12.b((byte) -51, oi.b(-112));
                }
              } else {
                stackIn_41_0 = var12.c(true, oi.b(-113));
              }
              var10 = stackIn_41_0;
              stackIn_44_0 = var6;
              stackIn_44_1 = var8;
              stackIn_44_2 = var9_int;
              stackIn_44_3 = var7;
              stackIn_46_4 = (this.field_gb) || (param1 == 2);
              eo.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_46_4, var10);
            }
            var4 = var4 + this.field_Db[2];
            if (this.field_Hb.field_m.field_h.length == 0) {
              pb.field_C.d(hi.field_w, var4 + (this.field_Db[3] >> 1), 4 + (this.field_T + (this.field_mb >> 1)), 16777215, -1);
            }
            var4 = var4 + this.field_Db[3];
            var7Lifetime1 = this.field_y;
            if (this.field_Hb.field_j) {
              this.field_X.d(ri.field_s, (this.field_Db[4] >> 1) + var4, 4 + this.field_T + (this.field_mb >> 1), 16711680, -1);
            } else {
              this.field_X.d(ql.field_c[this.field_Hb.field_s], (this.field_Db[4] >> 1) + var4, 4 + ((this.field_mb >> 1) + this.field_T), var7Lifetime1, -1);
            }
            var4 = var4 + this.field_Db[4];
            this.field_X.d(ad.a(this.field_Hb.field_i, 26300), (this.field_Db[5] >> 1) + var4, -7 + ((this.field_mb >> 1) + this.field_T), this.field_y, -1);
            var4 = var4 + this.field_Db[5];
            var8Lifetime1 = -1;
            if (this.field_Hb.field_r) {
              var8Lifetime1 = this.field_Hb.field_t;
            }
            if (-1 != var8Lifetime1) {
              stackIn_58_0 = ad.a(var8Lifetime1, 26300);
            } else {
              stackIn_58_0 = im.field_zb;
            }
            var9 = stackIn_58_0;
            this.field_X.d(var9, (this.field_Db[5] >> 1) + var4, -7 + (this.field_mb >> 1) + this.field_T, this.field_y, -1);
            var4 = var4 + this.field_Db[6];
            return;
          }
          if (this.field_Db == null) {
            if (this.field_Ib != null) {
              on.f(this.field_F + (-320 + this.field_q >> 1), 23 + this.field_T, 320, 27, 8, 65793);
              on.a((-320 + this.field_q >> 1) + this.field_F, this.field_T + 23, 320, 27, 8, 65793, 160);
              pb.field_C.d(this.field_Ib, this.field_F + (this.field_q >> 1), this.field_T + 42, 16777215, -1);
            }
          } else {
            jr.a(this.field_Db[1] + (this.field_Db[0] + this.field_F + (this.field_Db[2] - 30)), -96, this.field_T + 23);
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 > -16) {
          field_Mb = -60;
        }
        int var3 = (int)(nj.a(75) % 600L);
        var3 = var3 * 6 / 600;
        w.field_f[var3].c(param0 - 19, param2 - 23);
    }

    final static jk a(sj param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        jk stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        jk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 111) {
            stackIn_2_0 = (jk) null;
            return stackIn_2_0;
          }
          var4 = param0.a(0, param1);
          var3 = var4;
          if (var4 != null) {
            stackIn_7_0 = new jk(var4);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (jk) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("jr.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void i(int param0) {
        field_Fb = null;
        if (param0 != -25734) {
          field_Gb = 0.9598598751940521;
        }
    }

    private jr() {
        this.field_Lb = true;
    }

    jr(String param0) {
        try {
          this.field_Ib = param0;
          this.field_Lb = true;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    jr(int[] param0) {
        try {
          this.field_Lb = true;
          this.field_Db = param0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "jr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    jr(vc param0, int[] param1) {
        int var8 = 0;
        int stackIn_11_0 = 0;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        jr var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        fn var9 = null;
        pu var10 = null;
        int var11 = 0;
        int var12 = 0;
        try {
          var3 = (jr) (bk.field_f.b((byte) 126));
          if (var3 == null) {
            var3 = new jr();
          }
          this.field_mb = 50;
          this.field_Hb = param0;
          this.field_Db = param1;
          if (vv.field_r != 3) {
            if (vv.field_r != 2) {
              stackIn_11_0 = (vv.field_r == 1) ? 1 : 0;
            } else {
              stackIn_11_0 = 1;
            }
          } else {
            stackIn_11_0 = 1;
          }
          var4 = stackIn_11_0;
          if (var4 != 0) {
            stackIn_14_0 = q.field_d;
          } else {
            stackIn_14_0 = un.field_d;
          }
          var5 = stackIn_14_0;
          this.field_Jb = eo.a(he.field_Eb, 7126504, (hu) (var5), 50, true);
          this.field_Cb = eo.a(mc.field_f, 7126504, (hu) (var5), 50, true);
          this.a((byte) -117, this.field_Jb);
          this.a((byte) -120, this.field_Cb);
          this.field_Jb.field_J = this.field_T + 20;
          this.field_Jb.field_s = -25 + ((this.field_Db[5] >> 1) + (this.field_Db[3] + this.field_Db[2] + this.field_Db[1])) + (this.field_Db[0] + this.field_Db[4]);
          this.field_Lb = false;
          this.field_Cb.field_s = -25 + (this.field_Db[6] >> 1) + (this.field_Db[2] + this.field_Db[0] + (this.field_Db[1] - (-this.field_Db[3] - this.field_Db[4])) + this.field_Db[5]);
          this.field_Cb.field_J = 20;
          var6 = (this.field_Db[3] >> 1) + this.field_Db[2] + (this.field_Db[1] + this.field_Db[0]);
          var7 = this.field_mb >> 1;
          this.field_Eb = new pu[this.field_Hb.field_m.field_h.length];
          for (var8 = 0; this.field_Eb.length > var8; var8++) {
            var9 = pa.field_g[this.field_Hb.field_m.field_h[var8]];
            var10 = new pu(var9, true);
            var11 = var6;
            var12 = var7;
            if (this.field_Hb.field_m.field_h.length == 2) {
              var11 = -10 + var11 + 20 * var8;
            } else {
              if (this.field_Hb.field_m.field_h.length == 3) {
                if (var8 == 1) {
                  var12 -= 10;
                } else {
                  var11 = 20 * (var8 / 2) + (-10 + var11);
                  var12 += 10;
                }
              }
            }
            var10.field_s = -(var10.field_q >> 1) + var11;
            var10.field_J = -(var10.field_mb >> 1) + var12;
            this.a((byte) -106, (hd) (var10));
            this.field_Eb[var8] = var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("jr.<init>(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_Fb = "Either of these control schemes can be used in game.";
        field_Kb = -1;
    }
}
