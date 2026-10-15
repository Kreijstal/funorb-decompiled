/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cj extends vc {
    private jg field_Z;
    private jg field_hb;
    private jg field_lb;
    private jg field_gb;
    static vh field_V;
    private jg field_kb;
    static String field_U;
    private jg field_db;
    private jg field_W;
    jg field_mb;
    jg field_rb;
    private jg field_ab;
    static boolean[] field_fb;
    private jg field_jb;
    private jg field_cb;
    private jg field_qb;
    private jg field_ib;
    static int field_eb;
    private jg field_Y;
    private jg field_R;
    private jg field_X;
    private jg field_T;
    static String[] field_ob;
    jg field_S;
    private jg field_pb;
    private jg field_sb;
    private jg field_nb;
    jg field_bb;
    private jg field_Q;

    final void c(boolean param0) {
        this.field_l = sa.field_g;
        this.field_G = 17;
        this.field_H = 0;
        de.field_g = param0 ? true : false;
    }

    final static StringBuilder a(char param0, int param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -2790) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          var4_int = param3.length();
          param3.setLength(param1);
          for (var5 = var4_int; param1 > var5; var5++) {
            param3.setCharAt(var5, param0);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void b(int param0, di param1) {
        try {
          if (param0 != 5) {
            this.field_gb = (jg) null;
          }
          this.field_B = new dd(param1.a(false, "tiki-sky.jpg", ""), (java.awt.Component) ((Object) pa.field_K));
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cj.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, uf param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          super.a(param0, param1);
          if (ln.field_t == 0) {
            tl.field_N.a(true, -1);
          }
          if (500 > ln.field_t) {
            this.a(128, 50, (byte) 71, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
            if (ga.a(400, true, ea.field_r) == 0) {
              this.c(-4577, 32);
            }
          } else {
            if (ln.field_t != 500) {
              if (ln.field_t < 2000) {
                var3_int = (128 * ln.field_t - 64000) / 1500;
                this.a(128 - var3_int * 7 / 8, 50, (byte) 34, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                if (ga.a(800, true, ea.field_r) == 0) {
                  this.c(-4577, 128 - 7 * var3_int / 8 >> 2);
                }
                tl.field_N.a((byte) 77, -1, var3_int);
              } else {
                if (ln.field_t < 11200) {
                  this.a(8, 50, (byte) -101, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                } else {
                  if (ln.field_t >= 12200) {
                    if (ln.field_t == 12200) {
                      tl.field_N.e(-1);
                    } else {
                      ln.field_t = -1;
                    }
                  } else {
                    var3_int = 128 * (12200 - ln.field_t) / 1000;
                    this.a(128 - 7 * var3_int / 8, 50, (byte) -126, new jg[]{this.field_R, this.field_hb, this.field_lb, this.field_qb}, mc.field_j);
                    if (ga.a(800, true, ea.field_r) == 0) {
                      this.c(-4577, 128 - var3_int * 7 / 8 >> 2);
                    }
                    tl.field_N.a((byte) 32, -1, var3_int);
                  }
                }
              }
            } else {
              tl.field_N.a((byte) 88, -1, 1);
              ij.field_u = this.field_b;
              tl.field_N.a(this.field_b, true, (byte) -14, true);
            }
          }
          ln.field_t = ln.field_t + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("cj.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(di param0, int param1) {
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$28 = 0;
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var22 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        eg[] var14 = null;
        int var15 = 0;
        eg[] var16 = null;
        eg var17 = null;
        eg[] var19 = null;
        int[] var20 = null;
        eg var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var20Lifetime1;
        int[] var20Lifetime2;
        int[] var20Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        var22 = Pool.field_O;
        try {
          this.field_O = new eg[22];
          var3_int = 0;
          ml.field_j = var3_int;
          incrementValue$22 = var3_int;
          var3_int++;
          this.field_O[incrementValue$22] = eg.a(param0, "", "tiki_table/tiki_extra_1");
          incrementValue$23 = var3_int;
          var3_int++;
          this.field_O[incrementValue$23] = eg.a(param0, "", "tiki_table/tiki_extra_2");
          incrementValue$24 = var3_int;
          var3_int++;
          this.field_O[incrementValue$24] = eg.a(param0, "", "tiki_table/tiki_extra_3");
          incrementValue$25 = var3_int;
          var3_int++;
          this.field_O[incrementValue$25] = eg.a(param0, "", "tiki_table/tiki_extra_4");
          kp.field_f = var3_int;
          nf.field_T = var3_int;
          incrementValue$26 = var3_int;
          var3_int++;
          this.field_O[incrementValue$26] = eg.a(param0, "", "tiki_table/tiki_totnew");
          hr.field_t = var3_int;
          mn.field_a = var3_int;
          incrementValue$27 = var3_int;
          var3_int++;
          this.field_O[incrementValue$27] = eg.a(param0, "", "tiki_table/tiki_steps_extend");
          ec.field_c = var3_int;
          gk.field_ib = var3_int;
          incrementValue$28 = var3_int;
          var3_int++;
          this.field_O[incrementValue$28] = eg.a(param0, "", "tiki_table/tiki_leg_a");
          incrementValue$29 = var3_int;
          var3_int++;
          this.field_O[incrementValue$29] = eg.a(param0, "", "tiki_table/tiki_leg_b");
          qf.field_i = var3_int;
          im.field_Wb = var3_int;
          incrementValue$30 = var3_int;
          var3_int++;
          this.field_O[incrementValue$30] = eg.a(param0, "", "tiki_table/tiki_block_a");
          incrementValue$31 = var3_int;
          var3_int++;
          this.field_O[incrementValue$31] = eg.a(param0, "", "tiki_table/tiki_block_b");
          incrementValue$32 = var3_int;
          var3_int++;
          this.field_O[incrementValue$32] = eg.a(param0, "", "tiki_table/tiki_block_c");
          incrementValue$33 = var3_int;
          var3_int++;
          this.field_O[incrementValue$33] = eg.a(param0, "", "tiki_table/tiki_block_d");
          incrementValue$34 = var3_int;
          var3_int++;
          this.field_O[incrementValue$34] = eg.a(param0, "", "tiki_table/tiki_block_e");
          incrementValue$35 = var3_int;
          var3_int++;
          this.field_O[incrementValue$35] = eg.a(param0, "", "tiki_table/tiki_block_f");
          or.field_h = var3_int;
          vh.field_L = var3_int;
          incrementValue$36 = var3_int;
          var3_int++;
          this.field_O[incrementValue$36] = eg.a(param0, "", "tiki_table/tiki_hole_a");
          sg.field_S = var3_int;
          mm.field_i = var3_int;
          incrementValue$37 = var3_int;
          var3_int++;
          this.field_O[incrementValue$37] = eg.a(param0, "", "tiki_table/tiki_hole_b");
          nd.field_l = var3_int;
          nm.field_e = var3_int;
          incrementValue$38 = var3_int;
          var3_int++;
          this.field_O[incrementValue$38] = eg.a(param0, "", "tiki_table/tiki_corner");
          incrementValue$39 = var3_int;
          var3_int++;
          this.field_O[incrementValue$39] = eg.a(param0, "", "tiki_table/tiki_side_a");
          if (param1 > -43) {
            this.field_Z = (jg) null;
          }
          incrementValue$40 = var3_int;
          var3_int++;
          this.field_O[incrementValue$40] = eg.a(param0, "", "tiki_table/tiki_side_b");
          incrementValue$41 = var3_int;
          var3_int++;
          this.field_O[incrementValue$41] = eg.a(param0, "", "tiki_table/tiki_side_c");
          ka.field_q = var3_int;
          ca.field_h = var3_int;
          incrementValue$42 = var3_int;
          var3_int++;
          this.field_O[incrementValue$42] = eg.a(param0, "", "tiki_table/tiki_top_a");
          incrementValue$43 = var3_int;
          var3_int++;
          this.field_O[incrementValue$43] = eg.a(param0, "", "tiki_table/tiki_top_b");
          om.field_x = var3_int;
          this.field_A = new jk();
          this.field_A.a(eg.a(param0, "", "cues/jungle_cue"), (byte) -115);
          for (var4 = 0; var4 < this.field_O.length; var4++) {
            db.a(0, this.field_O[var4]);
          }
          var5 = 2147483647;
          var6 = -2147483648;
          var7 = 2147483647;
          var8 = -2147483648;
          var9 = 2147483647;
          var10 = -2147483648;
          for (var4Lifetime1 = ka.field_q; om.field_x > var4Lifetime1; var4Lifetime1++) {
            d.a(this.field_O[var4Lifetime1], -23109);
            if (this.field_O[var4Lifetime1].field_S > var8) {
              var8 = this.field_O[var4Lifetime1].field_S;
            }
            if (this.field_O[var4Lifetime1].field_y < var7) {
              var7 = this.field_O[var4Lifetime1].field_y;
            }
            if (var9 > this.field_O[var4Lifetime1].field_V) {
              var9 = this.field_O[var4Lifetime1].field_V;
            }
            if (this.field_O[var4Lifetime1].field_x > var10) {
              var10 = this.field_O[var4Lifetime1].field_x;
            }
            if (var6 < this.field_O[var4Lifetime1].field_w) {
              var6 = this.field_O[var4Lifetime1].field_w;
            }
            if (this.field_O[var4Lifetime1].field_D < var5) {
              var5 = this.field_O[var4Lifetime1].field_D;
            }
          }
          var7 = -var8 + var7 * 2;
          var5 = -var6 + var5 * 2;
          var11 = (var6 + var5) / 2;
          var12 = (var7 + var8) / 2;
          var13 = var10;
          for (var4Lifetime2 = 0; this.field_O.length > var4Lifetime2; var4Lifetime2++) {
            if (null != this.field_O[var4Lifetime2]) {
              cq.a(var11, 90, var13, this.field_O[var4Lifetime2], var12);
            }
          }
          this.field_M = new int[this.field_O.length][3];
          for (var4Lifetime3 = 0; this.field_O.length > var4Lifetime3; var4Lifetime3++) {
            if (this.field_O[var4Lifetime3] != null) {
              ln.a(this.field_M[var4Lifetime3], 0, this.field_O[var4Lifetime3]);
            }
          }
          var14 = new eg[4];
          for (var4Lifetime4 = mn.field_a; gk.field_ib > var4Lifetime4; var4Lifetime4++) {
            var15 = var4Lifetime4;
            var16 = var14;
            var17 = this.field_O[var15];
            var34 = this.field_M[var15];
            var19 = var16;
            var21 = a.a(true, new eg(var17, false, false, false, false));
            var29 = mj.a(-31121);
            var24 = var29;
            var20 = var24;
            var20[1] = var34[1] + 0;
            var20[0] = var34[0] - 0;
            var20[2] = 0 + var34[2];
            var19[0] = new eg(var17, false, false, false, false);
            var19[0].a(var29);
            var30 = mj.a(-31121);
            var25 = var30;
            var20Lifetime1 = var25;
            var20Lifetime1[2] = var34[2] - 0;
            var20Lifetime1[0] = 0 + var34[0];
            var20Lifetime1[1] = -(var34[1] + 0);
            var19[1] = new eg(var21, false, false, false, false);
            var19[1].a(var30);
            var31 = mj.a(-31121);
            var26 = var31;
            var20Lifetime2 = var26;
            var20Lifetime2[0] = 0 + var34[0];
            var20Lifetime2[2] = 0 + var34[2];
            var20Lifetime2[1] = 0 + var34[1];
            dq.a((byte) -121, var31);
            var19[2] = new eg(var17, false, false, false, false);
            var19[2].a(var31);
            var32 = mj.a(-31121);
            var27 = var32;
            var20Lifetime3 = var27;
            var20Lifetime3[0] = 0 + var34[0];
            var20Lifetime3[2] = 0 + var34[2];
            var20Lifetime3[1] = -(var34[1] - 0);
            dq.a((byte) 50, var32);
            var19[3] = new eg(var21, false, false, false, false);
            var19[3].a(var32);
            this.field_O[var4Lifetime4] = new eg(var14, 4);
            this.field_O[var4Lifetime4].a(1, 1, 1, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_42_0 = var3;
          stackIn_42_1 = new StringBuilder().append("cj.KA(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int[] param0, ko[] param1, eg param2, int param3) {
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        eg var8 = null;
        eg var9 = null;
        int var10 = 0;
        eg var11 = null;
        var11 = param2;
        var10 = Pool.field_O;
        try {
          var5_int = param2.field_V + param0[2];
          var6 = param2.field_x + param0[2];
          var7 = 0;
          if (param3 > -110) {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("cj.K(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
        stackIn_5_0 = jd.field_h;
        try {
          L5: while (true) {
            if (stackIn_5_0.length > var7) {
              Runtime.getRuntime().gc();
              if (jd.field_h[var7] <= var6) {
                if (jd.field_h[var7] < var6 &&
                  jd.field_h[var7] > var5_int) {
                  var8 = hq.b((byte) 125);
                  var9 = hq.b((byte) 127);
                  ej.a(0, var9, 0, false, jd.field_h[var7] - param0[2], 0, 0, 1, var8, var11);
                  if (var9.field_K > 0) {
                    var9.a();
                    var9.e();
                    param1[var7].b((byte) 106, new pm(hc.a(var9, param0, (byte) 101)));
                  }
                  var8.a();
                  var11 = var8;
                  param2 = var11;
                  var8.e();
                  if (0 == var11.field_K) {
                    break L5;
                  }
                }
                var7++;
                stackIn_5_0 = jd.field_h;
                continue;
              }
              System.out.println("Model before the cloudline " + jd.field_h[var7]);
              param1[var7].b((byte) -100, new pm(hc.a(var11, param0, (byte) 101)));
              param2 = null;
            }
            break;
          }
          if (param2 != null) {
            if (param2.field_K <= 0) {
              return;
            }
            param1[param1.length - 1].b((byte) -95, new pm(hc.a(param2, param0, (byte) 101)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("cj.K(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        var5 = 95 % ((param2 + 44) / 56);
        var6 = param0;
        if (5 != var6) {
          if (2 != var6) {
            if (var6 == 3) {
              kp.a(100, this.field_S, param3, param1);
            } else {
              if (0 == var6) {
                kp.a(100, this.field_rb, param3, param1);
              } else {
                if (var6 == 1) {
                  kp.a(100, this.field_mb, param3, param1);
                } else {
                  if (var6 == 6) {
                    kp.a(100, this.field_W, param3, param1);
                    System.out.println("playing respot the white");
                  } else {
                    if (var6 != 4) {
                      if (var6 != 10) {
                        super.a(param0, param1, (byte) -102, param3);
                      }
                    } else {
                      kp.a(100, this.field_sb, param3, param1);
                    }
                  }
                }
              }
            }
          } else {
            kp.a(100, this.field_bb, param3, param1);
          }
        } else {
          var6 = ga.a(3, true, ea.field_r);
          if (var6 != 0) {
            if (var6 != 1) {
              if (var6 == 2) {
                kp.a(100, this.field_jb, param3, param1);
              }
            } else {
              kp.a(100, this.field_ib, param3, param1);
            }
          } else {
            kp.a(100, this.field_Q, param3, param1);
          }
        }
    }

    final void d(boolean param0) {
        super.d(param0);
        pr.c((byte) 90);
    }

    final void c(int param0, di param1) {
        try {
          if (param0 != -23569) {
            this.field_pb = (jg) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cj.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void j(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ko[] var7;
        eg var8;
        int var9;
        int var10;
        StringBuilder var11;
        int var3Lifetime1;
        var10 = Pool.field_O;
        if (this.field_H == 0) {
          ln.field_u = null;
          var2 = 500;
          jd.field_h = new int[]{var2, var2 + 50, 100 + var2, 200 + var2};
          sg.field_K = 1 + jd.field_h.length;
          ck.field_Y = new ko[sg.field_K];
          for (var3 = 0; sg.field_K > var3; var3++) {
            ck.field_Y[var3] = new ko();
          }
          kj.field_m = 80;
          hf.field_a = 4000;
        }
        var2 = ml.field_j;
        var3Lifetime1 = 1 + ml.field_j;
        var4 = ml.field_j + 2;
        var5 = ml.field_j + 3;
        var6 = nf.field_T;
        var9 = this.field_H;
        if (var9 != 1) {
          if (var9 == 2) {
            fieldTemp$0 = kj.field_m - 150;
            kj.field_m = kj.field_m - 150;
            this.a(ck.field_Y, fieldTemp$0, (byte) 103, this.field_O[var4], 0, hf.field_a);
          } else {
            if (3 == var9) {
              fieldTemp$1 = kj.field_m - 170;
              kj.field_m = kj.field_m - 170;
              this.a(ck.field_Y, fieldTemp$1, (byte) 124, this.field_O[var2], 0, hf.field_a);
            } else {
              if (4 != var9) {
                if (var9 != 5) {
                  if (6 != var9) {
                    if (var9 != 7) {
                      if (8 == var9) {
                        fieldTemp$2 = kj.field_m - 45;
                        kj.field_m = kj.field_m - 45;
                        this.a(ck.field_Y, fieldTemp$2, (byte) 111, this.field_O[var4], 800, hf.field_a + 600);
                      } else {
                        if (var9 == 9) {
                          fieldTemp$3 = kj.field_m - 130;
                          kj.field_m = kj.field_m - 130;
                          this.a(ck.field_Y, fieldTemp$3, (byte) 110, this.field_O[var3Lifetime1], 968, -700 + hf.field_a);
                        } else {
                          if (var9 != 10) {
                            if (var9 == 11) {
                              fieldTemp$4 = kj.field_m - 80;
                              kj.field_m = kj.field_m - 80;
                              this.a(ck.field_Y, fieldTemp$4, (byte) 109, this.field_O[var2], 0, hf.field_a);
                            } else {
                              if (12 == var9) {
                                var8 = this.field_O[var5];
                                var7 = ck.field_Y;
                                kj.field_m = -1536;
                                this.a(var7, -1536, (byte) 82, var8, 0, -400 + hf.field_a);
                              } else {
                                if (var9 == 13) {
                                  fieldTemp$5 = kj.field_m - 200;
                                  kj.field_m = kj.field_m - 200;
                                  this.a(ck.field_Y, fieldTemp$5, (byte) 125, this.field_O[var4], 0, hf.field_a - 200);
                                } else {
                                  if (var9 == 14) {
                                    fieldTemp$6 = kj.field_m - 125;
                                    kj.field_m = kj.field_m - 125;
                                    this.a(ck.field_Y, fieldTemp$6, (byte) 98, this.field_O[var6], 0, hf.field_a);
                                    this.field_l = mn.field_d;
                                  } else {
                                    if (15 == var9) {
                                      this.n(param0 + 6);
                                    } else {
                                      if (var9 == 16) {
                                        this.o(-16);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            fieldTemp$7 = kj.field_m - 170;
                            kj.field_m = kj.field_m - 170;
                            this.a(ck.field_Y, fieldTemp$7, (byte) 71, this.field_O[var6], 0, hf.field_a - 700);
                          }
                        }
                      }
                    } else {
                      fieldTemp$8 = kj.field_m - 170;
                      kj.field_m = kj.field_m - 170;
                      this.a(ck.field_Y, fieldTemp$8, (byte) 80, this.field_O[var6], 0, hf.field_a);
                    }
                  } else {
                    fieldTemp$9 = kj.field_m - 170;
                    kj.field_m = kj.field_m - 170;
                    this.a(ck.field_Y, fieldTemp$9, (byte) 107, this.field_O[var5], 0, hf.field_a);
                  }
                } else {
                  fieldTemp$10 = kj.field_m - 50;
                  kj.field_m = kj.field_m - 50;
                  this.a(ck.field_Y, fieldTemp$10, (byte) 108, this.field_O[var3Lifetime1], 0, hf.field_a - 50);
                }
              } else {
                fieldTemp$11 = kj.field_m - 100;
                kj.field_m = kj.field_m - 100;
                this.a(ck.field_Y, fieldTemp$11, (byte) 109, this.field_O[var6], 0, hf.field_a + 500);
              }
            }
          }
        } else {
          this.a(ck.field_Y, 80, (byte) 80, this.field_O[var3Lifetime1], 0, hf.field_a - 500);
        }
        if (param0 != 2) {
          var11 = (StringBuilder) null;
          cj.a('\023', -105, -71, (StringBuilder) null);
        }
        this.field_H = this.field_H + 1;
    }

    final static tc a(int param0, int param1, int param2) {
        tc var3 = w.a(false, param1);
        if (param2 != 0) {
          field_U = (String) null;
        }
        var3.field_e = new int[param0];
        return var3;
    }

    final static boolean e(byte param0) {
        if (param0 != 85) {
          StringBuilder var2 = (StringBuilder) null;
          cj.a('ￅ', -57, 7, (StringBuilder) null);
        }
        return ~ve.field_m == ~em.field_L.field_Zb ? true : false;
    }

    private final void a(ko[] param0, int param1, byte param2, eg param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        try {
          param3 = new eg(param3, false, false, false, false);
          var7_int = param5 * hc.a(2047, param1) >> 16;
          var8 = param5 * ao.a(param1, true) >> 16;
          param1 = param1 + param4;
          param3.a(new int[]{0, 0, 0, hc.a(2047, 1536 + param1), ao.a(1536 + param1, true), 0, -ao.a(param1 + 1536, true), hc.a(2047, param1 + 1536), 0, 0, 0, 65536});
          param3.e();
          if (param2 < 68) {
            this.d(false);
          }
          this.a(new int[]{var7_int, var8, kh.field_vc}, param0, param3, -123);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cj.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void m(int param0) {
        field_U = null;
        field_fb = null;
        field_ob = null;
        field_V = null;
        if (param0 <= 90) {
          cj.a(88, 124, 23, -78, -57);
        }
    }

    final void a(byte param0, uf param1) {
        Object stackIn_53_0;
        int[] stackIn_53_1;
        int stackIn_53_2;
        boolean stackIn_53_3;
        pq[] stackIn_53_4;
        Object stackIn_54_0;
        boolean stackIn_54_5;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        pq[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        eg var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        so var19 = null;
        pq[] var21 = null;
        so var22 = null;
        so var24 = null;
        so var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var5_ref_int__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Pool.field_O;
        try {
          var21 = param1.field_I.field_l;
          var3 = var21;
          var30 = f.a((byte) -119, param1.field_ab);
          var18 = var30;
          var4 = var18;
          var28 = var4;
          var16 = var28;
          var13 = var16;
          var5_ref_int__ = var13;
          oh.field_d[0] = var28[0] - sb.a(288.0f, true) >> 2;
          oh.field_d[1] = var28[1] - sb.a(144.0f, true) >> 2;
          oh.field_d[2] = var28[2] >> 2;
          if (var5_ref_int__ != oh.field_d) {
            oh.field_d[9] = var28[9];
            oh.field_d[5] = var28[5];
            oh.field_d[10] = var28[10];
            oh.field_d[6] = var28[6];
            oh.field_d[8] = var28[8];
            oh.field_d[7] = var28[7];
            oh.field_d[11] = var28[11];
            oh.field_d[3] = var28[3];
            oh.field_d[4] = var28[4];
          }
          var29 = var4;
          var17 = var29;
          var14 = var17;
          var5_ref_int__Lifetime1 = var14;
          gr.field_w[0] = var29[0] - sb.a(288.0f, true) >> 4;
          gr.field_w[1] = var29[1] - sb.a(144.0f, true) >> 4;
          gr.field_w[2] = var29[2] >> 4;
          if (gr.field_w != var5_ref_int__Lifetime1) {
            gr.field_w[7] = var29[7];
            gr.field_w[3] = var29[3];
            gr.field_w[10] = var29[10];
            gr.field_w[9] = var29[9];
            gr.field_w[8] = var29[8];
            gr.field_w[5] = var29[5];
            gr.field_w[4] = var29[4];
            gr.field_w[11] = var29[11];
            gr.field_w[6] = var29[6];
          }
          var4[1] = rb.b(var30[1], -4);
          var4[0] = rb.b(var30[0], -4);
          var4[2] = rb.b(var30[2], -4);
          this.e(true);
          for (var5 = 0; ln.field_u.length > var5; var5++) {
            var19 = ln.field_u[var5];
            var39 = gr.field_w;
            var19.b((byte) 112, 0, var19.field_j.length, var39);
          }
          this.a(false, var30, var21);
          kf.a(ta.field_c, (byte) -104, pa.field_L, ph.field_g, cq.field_c);
          kf.a(am.field_h, (byte) -104, pa.field_L, ph.field_g, c.field_b);
          kf.a(gf.field_d, (byte) -104, pa.field_L, ph.field_g, hl.field_n);
          kf.a(cn.field_d, (byte) -104, pa.field_L, ph.field_g, oa.field_e);
          kf.a(wn.field_j, (byte) -104, pa.field_L, ph.field_g, ue.field_a);
          this.a(param1, 9291);
          pr.a(gr.field_w, false);
          this.a(256, 3, 256, (byte) -86);
          var6 = fb.field_b;
          for (var5Lifetime1 = ln.field_u.length - 1; 1 < var5Lifetime1; var5Lifetime1--) {
            fb.field_b = dn.field_m[-1 + var5Lifetime1];
            var22 = ln.field_u[var5Lifetime1];
            var40 = gr.field_w;
            var22.a((byte) -122, 0, var22.field_j.length, var40);
            if (0L != (256L & pd.field_i)) {
              ln.field_u[var5Lifetime1].a(gr.field_w, 0);
            }
          }
          fb.field_b = dn.field_m[0];
          if (param0 != -55) {
            var12 = (eg) null;
            this.a((int[]) null, (ko[]) null, (eg) null, -92);
          }
          var24 = ln.field_u[1];
          var41 = gr.field_w;
          var24.a((byte) -115, 0, var24.field_j.length, var41);
          if ((pd.field_i & 256L) != 0L) {
            ln.field_u[1].a(gr.field_w, 0);
          }
          fb.field_b = var6;
          var26 = ln.field_u[0];
          var42 = gr.field_w;
          var26.a((byte) -98, 0, var26.field_j.length, var42);
          if ((256L & pd.field_i) != 0L) {
            ln.field_u[0].a(gr.field_w, 0);
          }
          if ((4194304L & pd.field_i) != 0L) {
            return;
          }
          for (var5Lifetime2 = -1 + ta.field_c; cq.field_c <= var5Lifetime2; var5Lifetime2--) {
            th.field_l[ph.field_g[var5Lifetime2]].c(6710886, oh.field_d);
          }
          for (var5Lifetime3 = -1 + am.field_h; c.field_b <= var5Lifetime3; var5Lifetime3--) {
            th.field_l[ph.field_g[var5Lifetime3]].c(6710886, oh.field_d);
          }
          for (var5Lifetime4 = gf.field_d - 1; var5Lifetime4 >= hl.field_n; var5Lifetime4--) {
            th.field_l[ph.field_g[var5Lifetime4]].c(6710886, oh.field_d);
          }
          if ((1073741824L & pd.field_i) == 0L) {
            this.a(var30, (byte) 106, false, var21, false);
          }
          for (var5Lifetime5 = wn.field_j - 1; var5Lifetime5 >= ue.field_a; var5Lifetime5--) {
            th.field_l[ph.field_g[var5Lifetime5]].c(6710886, oh.field_d);
          }
          if ((pd.field_i & 1073741824L) == 0L) {
            for (var5Lifetime6 = 0; var21.length > var5Lifetime6; var5Lifetime6++) {
              if (var21[var5Lifetime6].field_s) {
                this.a(var30, var21[var5Lifetime6]);
              }
            }
          }
          var7 = oa.field_e;
          var8 = cn.field_d;
          for (var10 = var8 - 1; var7 <= var10; var10--) {
            var9 = ph.field_g[var10];
            if (!sh.field_Q[var9]) {
              th.field_l[var9].c(param0 ^ -6710865, oh.field_d);
            }
          }
          if (0L == (1073741824L & pd.field_i)) {
            stackIn_53_0 = this;
            stackIn_53_1 = var4;
            stackIn_53_2 = 102;
            stackIn_53_3 = true;
            stackIn_53_4 = var3;
            if (param1.field_I.j(29).field_q != 0) {
              stackIn_54_0 = this;
              stackIn_54_5 = false;
            } else {
              stackIn_54_0 = this;
              stackIn_54_5 = true;
            }
            this.a(stackIn_53_1, (byte) stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_54_5);
          }
          var7Lifetime1 = oa.field_e;
          var8Lifetime1 = cn.field_d;
          var15 = -1 + var8Lifetime1;
          var10Lifetime1 = var15;
          while (var15 >= var7Lifetime1) {
            var9Lifetime1 = ph.field_g[var15];
            if (sh.field_Q[var9Lifetime1]) {
              th.field_l[var9Lifetime1].c(6710886, oh.field_d);
            }
            var15--;
          }
          if ((1073741824L & pd.field_i) == 0L) {
            param1.q(-1);
          }
          if ((1073741824L & pd.field_i) == 0L) {
            param1.D(-125);
          }
          if ((pd.field_i & 256L) != 0L) {
            for (var5Lifetime7 = 0; th.field_l.length > var5Lifetime7; var5Lifetime7++) {
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_73_0 = var3_ref;
          stackIn_73_1 = new StringBuilder().append("cj.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        if (fo.field_c[param1][0][0] != fo.field_c[param1][1][1]) {
          cj.a(fo.field_c[param1][0][1], fo.field_c[param1][1][1], 13421772, 0, param0);
        }
        int var5 = 64 % ((-24 - param3) / 59);
        if (fo.field_c[param1][1][0] != fo.field_c[param1][2][1]) {
          cj.a(fo.field_c[param1][1][1], fo.field_c[param1][2][1], 13421772, param0, param2);
        }
        if (fo.field_c[param1][3][1] != fo.field_c[param1][2][0]) {
          qh.c(0, fo.field_c[param1][2][1], qh.field_l, fo.field_c[param1][3][1] - fo.field_c[param1][2][1], 13421772, param2);
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5 = param4 - param3;
        int var6 = qh.field_j - qh.field_b;
        int var7 = param1 - param0;
        for (var8 = 0; var8 < var7; var8++) {
          qh.e(qh.field_b, param0 + var8, var6, param2, param3 + var8 * var5 / var7);
        }
    }

    final void a(int param0, di param1) {
        try {
          if (param0 != 1) {
            al var4 = (al) null;
            this.a((al) null, 126);
          }
          this.field_b = cg.a(param1, "", "pool_jungle");
          this.field_i = cg.a(param1, "", "pool_jungle_win_jingle");
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(cf param0, int param1) {
        try {
          int var3_int = 86 / ((param1 - 39) / 38);
          this.field_bb = param0.a("jungle_ball_hard", true, "");
          param0.a("jungle_ball_med", true, "");
          this.field_S = param0.a("jungle_ball_soft", true, "");
          this.field_rb = param0.a("jungle_cue_hard", true, "");
          this.field_mb = param0.a("jungle_cue_soft", true, "");
          this.field_sb = param0.a("jungle_pot", true, "");
          this.field_W = param0.a("jungle_respot_the_white", true, "");
          this.field_Q = param0.a("jungle_ball_cushion1", true, "");
          this.field_ib = param0.a("jungle_ball_cushion2", true, "");
          this.field_jb = param0.a("jungle_ball_cushion3", true, "");
          this.field_db = param0.a("", "jungle_bg_bird1", (byte) 122);
          this.field_nb = param0.a("", "jungle_bg_cricket1", (byte) 126);
          this.field_kb = param0.a("", "jungle_bg_cricket2", (byte) 123);
          this.field_pb = param0.a("", "jungle_bg_cricket3", (byte) 123);
          this.field_T = param0.a("", "jungle_bg_frog1", (byte) 127);
          this.field_Z = param0.a("", "jungle_bg_snake1", (byte) 125);
          this.field_ab = param0.a("", "jungle_bg_snake2", (byte) 124);
          this.field_X = param0.a("jungle_monkey1", true, "");
          this.field_cb = param0.a("jungle_monkey2", true, "");
          this.field_Y = param0.a("jungle_monkey3", true, "");
          this.field_gb = param0.a("jungle_monkey4", true, "");
          this.field_R = param0.a("", "jungle_bg_wind1", (byte) 122);
          this.field_hb = param0.a("", "jungle_bg_wind2", (byte) 123);
          this.field_lb = param0.a("", "jungle_bg_wind3", (byte) 121);
          this.field_qb = param0.a("", "jungle_bg_wind4", (byte) 124);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cj.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void n(int param0) {
        int var2;
        ko[] var3;
        int var4;
        int var5;
        int var8;
        int var6;
        int var7;
        int var9;
        int var2Lifetime1;
        int var4Lifetime1;
        var8 = Pool.field_O;
        var3 = new ko[sg.field_K];
        for (var4 = 0; var4 < sg.field_K; var4++) {
          var3[var4] = new ko();
        }
        var4Lifetime1 = 0;
        var2 = ec.field_c;
        if (param0 != 8) {
          return;
        }
        while (var2 < im.field_Wb) {
          this.field_O[var2].e();
          var5 = this.field_O[var2].field_x + this.field_M[var2][2];
          if (var5 > var4Lifetime1) {
            var4Lifetime1 = var5;
          }
          var2++;
        }
        var4Lifetime1 = var4Lifetime1 >> 2;
        var9 = mn.field_a;
        var2Lifetime1 = var9;
        while (var9 < gk.field_ib) {
          this.field_O[var9].e();
          var5 = -this.field_O[var9].field_V + var4Lifetime1;
          this.a(new int[]{0, 0, var5}, var3, this.field_O[var9], -116);
          var4Lifetime1 = this.field_O[var9].field_x + var5;
          var9++;
        }
        dn.field_m = new int[sg.field_K][];
        ln.field_u = new so[sg.field_K];
        ah.field_e = new so[sg.field_K];
        for (var5 = 0; sg.field_K > var5; var5++) {
          var6 = 63 + var5 * 192 / sg.field_K;
          var7 = 128;
          dn.field_m[var5] = tq.a(md.a(var7, md.a(var7 << 16, var7 << 8)), var6, false);
          ah.field_e[var5] = new so();
          ah.field_e[var5].a((byte) -112, var3[var5]);
          ck.field_Y[var5].b((byte) -52, new pm(ah.field_e[var5]));
          ln.field_u[var5] = new so();
          ln.field_u[var5].a((byte) -121, ck.field_Y[var5]);
          ln.field_u[var5].a(0);
          ln.field_u[var5].a(this.field_q, this.field_e, this.field_F, (byte) -35, this.field_u, this.field_C);
          ln.field_u[var5].d(105);
        }
        return;
    }

    final void i(int param0) {
        super.i(param0);
        this.field_v = 5609813;
    }

    private final void a(uf param0, int param1) {
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          var3_int = param0.field_eb.b(param1 - 9419);
          if (param1 != 9291) {
            return;
          }
          qh.d(0, var3_int, 640, -var3_int + 480, this.field_v, 16128);
          var4 = this.field_B.field_z << 1;
          var5 = this.field_B.field_A << 1;
          var6 = (int)(-param0.field_eb.a(true) * (double)var4 / 2.0 / 3.141592653589793);
          var7 = -200 + var3_int;
          if (0 < var7) {
            qh.f(0, 0, 640, var7, this.field_B.field_D[0]);
          }
          this.field_B.c(var6 - var4, var7, var4, var5);
          for (var8 = this.field_B.field_A + var7; var8 < qh.field_g; var8++) {
            this.field_B.d(this.field_B.field_A - 1, -var4 + var6, var8);
          }
          if (-640 + this.field_B.field_z > var6 >> 16) {
            this.field_B.c(var6, var7, var4, var5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("cj.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int h(int param0) {
        if (param0 != 684) {
          this.field_kb = (jg) null;
        }
        return 11184810;
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int stackIn_11_0 = 0;
        int var4;
        jg var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        if (param0 != -4577) {
          cj.a(-42, 63, -74, 109, -107);
        }
        for (var3 = 2; var3 < mc.field_j.length; var3++) {
          if (null == mc.field_j[var3] ||
            mc.field_j[var3].field_o.i() ||
            !mc.field_j[var3].field_o.b(param0 ^ 4492)) {
            stackIn_11_0 = (mc.field_j[var3] == null) ? 11 : 22;
            var4 = ga.a(stackIn_11_0, true, ea.field_r);
            var6 = var4;
            if (var6 == 0) {
              mc.field_j[var3] = mn.a(-24296, nb.a(this.field_db, 100, param1, ga.a(128, true, ea.field_r)));
            } else {
              if (var6 != 1) {
                if (2 == var6) {
                  mc.field_j[var3] = mn.a(-24296, nb.a(this.field_kb, 100, param1, ga.a(128, true, ea.field_r)));
                } else {
                  if (var6 != 3) {
                    if (4 != var6) {
                      if (var6 == 5) {
                        mc.field_j[var3] = mn.a(-24296, nb.a(this.field_Z, 100, param1, ga.a(128, true, ea.field_r)));
                      } else {
                        if (var6 != 6) {
                          if (var6 != 7) {
                            if (var6 != 8) {
                              if (var6 != 9) {
                                if (var6 == 10) {
                                  mc.field_j[var3] = rq.a(126, nb.a(this.field_gb, 100, param1, ga.a(128, true, ea.field_r)));
                                } else {
                                  var5 = (jg) (mc.field_j[var3].field_o.field_n);
                                  if (var5 != this.field_X &&
                                    this.field_cb != var5 &&
                                    var5 != this.field_Y &&
                                    this.field_gb != var5) {
                                    mc.field_j[var3] = mn.a(-24296, nb.a(var5, 100, param1, ga.a(128, true, ea.field_r)));
                                  } else {
                                    mc.field_j[var3] = rq.a(126, nb.a(var5, 100, param1, ga.a(128, true, ea.field_r)));
                                  }
                                }
                              } else {
                                mc.field_j[var3] = rq.a(101, nb.a(this.field_Y, 100, param1, ga.a(128, true, ea.field_r)));
                              }
                            } else {
                              mc.field_j[var3] = rq.a(124, nb.a(this.field_cb, 100, param1, ga.a(128, true, ea.field_r)));
                            }
                          } else {
                            mc.field_j[var3] = rq.a(126, nb.a(this.field_X, 100, param1, ga.a(128, true, ea.field_r)));
                          }
                        } else {
                          mc.field_j[var3] = mn.a(param0 - 19719, nb.a(this.field_ab, 100, param1, ga.a(128, true, ea.field_r)));
                        }
                      }
                    } else {
                      mc.field_j[var3] = mn.a(param0 - 19719, nb.a(this.field_T, 100, param1, ga.a(128, true, ea.field_r)));
                    }
                  } else {
                    mc.field_j[var3] = mn.a(cq.a(param0, 20231), nb.a(this.field_pb, 100, param1, ga.a(128, true, ea.field_r)));
                  }
                }
              } else {
                mc.field_j[var3] = mn.a(-24296, nb.a(this.field_nb, 100, param1, ga.a(128, true, ea.field_r)));
              }
            }
          }
        }
    }

    final void a(boolean param0, mm param1) {
        double stackIn_14_0 = 0.0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        int var7 = 0;
        al var8 = null;
        var7 = Pool.field_O;
        try {
          if (param1.field_m < 0.0) {
            param1.field_m = 0.0;
          } else {
            if (288.0 < param1.field_m) {
              param1.field_m = 288.0;
            }
          }
          if (param1.field_f < 0.0) {
            param1.field_f = 0.0;
          } else {
            if (576.0 < param1.field_f) {
              param1.field_f = 576.0;
            }
          }
          if (param0) {
            var8 = (al) null;
            this.a((al) null, 35);
          }
          var3_double = param1.d(8);
          stackIn_14_0 = ((4194304L & pd.field_i) != 0L) ? 12000.0 : 2048.0;
          var5 = stackIn_14_0;
          if (var3_double > var5) {
            param1.field_d = param1.field_f + var5 * (param1.field_d - param1.field_f) / var3_double;
            param1.field_h = param1.field_k + var5 * (param1.field_h - param1.field_k) / var3_double;
            param1.field_a = param1.field_m + (param1.field_a - param1.field_m) * var5 / var3_double;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("cj.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(al param0, int param1) {
        try {
          super.a(param0, param1);
          jo.a(0.8999999761581421f, 1.0f, 0.8999999761581421f, 0.0833333358168602f, -31792);
          ln.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void o(int param0) {
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        uf var8;
        p[] var9;
        p[] var10;
        p[] var11;
        p[] var12;
        p[] var13;
        p[] var14;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        var7 = Pool.field_O;
        th.field_l = new p[-sg.field_S + nd.field_l + (mn.field_a - gk.field_ib + (-hr.field_t + nf.field_T) + (this.field_O.length - kp.field_f + (ml.field_j - ec.field_c))) - (-im.field_Wb - vh.field_L + (qf.field_i - 3 * (-ka.field_q + om.field_x)) + (-((-or.field_h + mm.field_i) * 3) - 3 * (ca.field_h - nm.field_e)))];
        var3 = 0;
        cq.field_c = var3;
        var2 = ec.field_c;
        if (param0 > -11) {
          var8 = (uf) null;
          this.a((byte) 7, (uf) null);
        }
        while (var2 < im.field_Wb) {
          var4 = var2;
          var9 = th.field_l;
          var6 = var3;
          this.a(0, var6, 0, 0, 0, var4, var9);
          var3 += 2;
          var2++;
        }
        c.field_b = var3;
        ta.field_c = var3;
        for (var2Lifetime1 = qf.field_i; vh.field_L > var2Lifetime1; var2Lifetime1++) {
          var4Lifetime1 = var2Lifetime1;
          var10 = th.field_l;
          var6Lifetime1 = var3;
          this.a(0, var6Lifetime1, 0, 0, 0, var4Lifetime1, var10);
          var3 += 2;
        }
        ue.field_a = var3;
        am.field_h = var3;
        for (var2Lifetime2 = ka.field_q; var2Lifetime2 < om.field_x; var2Lifetime2++) {
          var4Lifetime2 = var2Lifetime2;
          var11 = th.field_l;
          var6Lifetime2 = var3;
          this.a(var11, 0, 0, false, this.field_O[var4Lifetime2], var6Lifetime2, this.field_M[var4Lifetime2], 0);
          var3 += 4;
        }
        wn.field_j = var3;
        oa.field_e = var3;
        for (var2Lifetime3 = nm.field_e; ca.field_h > var2Lifetime3; var2Lifetime3++) {
          var4Lifetime3 = var2Lifetime3;
          var12 = th.field_l;
          var6Lifetime3 = var3;
          this.a(var12, 0, 0, false, this.field_O[var4Lifetime3], var6Lifetime3, this.field_M[var4Lifetime3], 0);
          var3 += 4;
        }
        hl.field_n = var3;
        cn.field_d = var3;
        for (var2Lifetime4 = or.field_h; var2Lifetime4 < mm.field_i; var2Lifetime4++) {
          var4Lifetime4 = var2Lifetime4;
          var13 = th.field_l;
          var6Lifetime4 = var3;
          this.a(var13, 0, 0, false, this.field_O[var4Lifetime4], var6Lifetime4, this.field_M[var4Lifetime4], 0);
          var3 += 4;
        }
        for (var2Lifetime5 = sg.field_S; nd.field_l > var2Lifetime5; var2Lifetime5++) {
          var4Lifetime5 = var2Lifetime5;
          var14 = th.field_l;
          var6Lifetime5 = var3;
          this.a(0, var6Lifetime5, 0, 0, 0, var4Lifetime5, var14);
          var3 += 2;
        }
        gf.field_d = var3;
        ph.field_g = new int[th.field_l.length];
        pa.field_L = new int[th.field_l.length];
        for (var4Lifetime6 = 0; ph.field_g.length > var4Lifetime6; var4Lifetime6++) {
          ph.field_g[var4Lifetime6] = var4Lifetime6;
        }
    }

    cj() {
        this.field_m = 96;
        this.field_d = 32;
        this.field_z = 0.8009999990463257f;
        this.field_E = 16384.0;
        this.field_C = 69;
        this.field_j = 5.7246799465414;
        this.field_x = 60;
        this.field_p = 0.3316125578789226;
        this.b(113);
    }

    static {
        field_U = "<%0> now has <%1> lives.";
        field_fb = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, true, false, true, false, false, false, false, false, false, true};
        field_ob = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
