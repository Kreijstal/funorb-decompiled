/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fk extends oo {
    private jg field_db;
    static int field_Z;
    private jg field_W;
    private byte field_S;
    private int[] field_L;
    private nb field_bb;
    private jg field_O;
    private jg field_hb;
    private jg field_fb;
    private jg field_J;
    static lq field_cb;
    private jg field_Y;
    static int field_ab;
    private ji[] field_K;
    private jg field_Q;
    static int field_V;
    private jg field_N;
    private int[] field_R;
    static String field_eb;
    private int[] field_X;
    private int[] field_M;
    static hr field_gb;
    private jg field_T;
    private jg field_U;
    private jg field_P;

    final void a(al param0, int param1) {
        int var5_int = 0;
        int var3_int = 0;
        int var4_int = 0;
        bf var4 = null;
        bf var5 = null;
        bf var6 = null;
        bf var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4_intLifetime1;
        var8 = Pool.field_O;
        try {
          super.a(param0, param1);
          t.field_a = new int[3][17][33];
          ro.field_v = new int[3][17][33];
          fm.field_K = new jd[16][32];
          cn.field_a = new jd[16][32];
          for (var3_int = 0; var3_int <= 16; var3_int++) {
            var4_int = var3_int * 2304 / 16;
            for (var5_int = 0; var5_int <= 32; var5_int++) {
              t.field_a[0][var3_int][var5_int] = 4608 * var5_int / 32;
              t.field_a[1][var3_int][var5_int] = var4_int;
              t.field_a[2][var3_int][var5_int] = 0;
            }
          }
          for (var3_intLifetime1 = 0; var3_intLifetime1 < 16; var3_intLifetime1++) {
            for (var4_intLifetime1 = 0; var4_intLifetime1 < 32; var4_intLifetime1++) {
              fm.field_K[var3_intLifetime1][var4_intLifetime1] = new jd();
              cn.field_a[var3_intLifetime1][var4_intLifetime1] = new jd();
            }
          }
          v.field_i = ta.a(new int[]{0, 16744383, 256, 0}, param1 - 22022);
          this.o(10);
          this.field_K = new ji[12];
          for (var3_intLifetime2 = 0; var3_intLifetime2 < 6; var3_intLifetime2++) {
            var4 = param0.field_c[(var3_intLifetime2 * 4 + 3) % param0.field_c.length];
            var5 = param0.field_c[(var3_intLifetime2 * 4 + 4) % param0.field_c.length];
            var6 = param0.field_c[(5 + 4 * var3_intLifetime2) % param0.field_c.length];
            var7 = param0.field_c[(6 + 4 * var3_intLifetime2) % param0.field_c.length];
            this.field_K[2 * var3_intLifetime2] = new ji(new int[]{var5.field_a + var5.field_f >> 14, var5.field_j + var5.field_l >> 14, var6.field_a >> 13, var6.field_j >> 13, var7.field_a >> 13, var7.field_j >> 13});
            this.field_K[1 + var3_intLifetime2 * 2] = new ji(new int[]{var5.field_a + var5.field_f >> 14, var5.field_j + var5.field_l >> 14, var5.field_a >> 13, var5.field_j >> 13, var4.field_a >> 13, var4.field_j >> 13});
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("fk.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = Pool.field_O;
        var5 = 119 / ((param2 + 44) / 56);
        super.a(param0, param1, (byte) -104, param3);
        var6 = param0;
        if (var6 == 5) {
          var6 = ga.a(4, true, ea.field_r);
          if (0 == var6) {
            kp.a(100, this.field_hb, param3, param1);
          } else {
            if (var6 != 1) {
              if (var6 == 2) {
                kp.a(100, this.field_db, param3, param1);
              } else {
                if (var6 == 3) {
                  kp.a(100, this.field_T, param3, param1);
                }
              }
            } else {
              kp.a(100, this.field_N, param3, param1);
            }
          }
        } else {
          if (2 != var6) {
            if (3 != var6) {
              if (var6 == 7) {
                kp.a(100, this.field_W, param3, param1);
              } else {
                if (var6 == 8) {
                  kp.a(100, this.field_Q, param3, param1);
                } else {
                  if (var6 != 6) {
                    if (var6 == 4) {
                      kp.a(100, this.field_J, param3, param1);
                    } else {
                      if (var6 != 9) {
                        if (var6 == 10) {
                          kp.a(100, this.field_fb, param3, param1 * 64 >> 8);
                        }
                      } else {
                        if (null != this.field_bb) {
                          this.a((byte) 73, true, param0);
                        }
                        this.field_bb = nb.a(this.field_U, 256, 0);
                        this.field_bb.e(-1);
                        mn.a(-24296, this.field_bb);
                        this.field_bb.d(4096, 16 * param1 >> 8);
                      }
                    }
                  } else {
                    kp.a(100, this.field_O, param3, param1);
                    System.out.println("playing respot the white");
                  }
                }
              }
            } else {
              kp.a(100, this.field_Y, param3, param1);
            }
          } else {
            kp.a(100, this.field_P, param3, param1);
          }
        }
    }

    private final static void a(int[] param0) {
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var15;
        int[] var16;
        int[] stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        int var14;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var14Lifetime1;
        var16 = f.a((byte) 100, param0);
        var15 = var16;
        param0 = var15;
        param0[0] = param0[0] - 2304;
        param0[1] = param0[1] - 1152;
        param0[0] = param0[0] >> 8;
        param0[1] = param0[1] >> 8;
        param0[2] = param0[2] >> 8;
        var1 = 65536 / qh.field_l;
        mf.field_l = mf.field_l & 127;
        me.field_x = -64 + mf.field_l;
        gn.field_b = 0 + mf.field_l;
        stackIn_2_0 = v.field_i;
        if (mf.field_l >= 16) {
          stackIn_3_1 = mf.field_l >> 1;
        } else {
          stackIn_3_1 = (16 - mf.field_l) * (v.field_i.length - 1) >> 4;
        }
        ba.field_tb = stackIn_2_0[stackIn_3_1];
        bm.field_h = 64 + mf.field_l;
        rb.field_g = 128 + mf.field_l;
        cl.field_g = v.field_i[64 + (mf.field_l >> 1)];
        eq.field_Y = 192 + mf.field_l;
        gn.field_d = 256 + mf.field_l;
        pn.field_s = v.field_i[128 + (mf.field_l >> 1)];
        mp.field_O = 320 + mf.field_l;
        ll.field_c = 384 + mf.field_l;
        nm.field_f = v.field_i[192 + (mf.field_l >> 1)];
        jp.field_V = ll.field_c * ll.field_c;
        var2 = qh.field_c;
        var3 = 256 - var16[2];
        var4 = var16[8] * var3;
        var5 = var16[11] * var3;
        var6 = ll.field_c - var16[0];
        var7 = ll.field_c - var16[1];
        var8 = var16[9] * var6 + var16[10] * var7 + var5 >> 16;
        if (var8 > 0) {
          var9 = qh.field_c + fb.field_d + (var16[6] * var6 + var16[7] * var7 + var4) >> 7 / var8;
          if (var9 > 0 &&
            var9 < var2) {
            var2 = var9;
          }
        }
        var6Lifetime1 = -ll.field_c - var16[0];
        var7Lifetime1 = ll.field_c - var16[1];
        var8Lifetime1 = var16[9] * var6Lifetime1 + var16[10] * var7Lifetime1 + var5 >> 16;
        if (var8Lifetime1 > 0) {
          var9Lifetime1 = qh.field_c + fb.field_d + (var16[6] * var6Lifetime1 + var16[7] * var7Lifetime1 + var4) >> 7 / var8Lifetime1;
          if (var9Lifetime1 > 0 &&
            var9Lifetime1 < var2) {
            var2 = var9Lifetime1;
          }
        }
        var6Lifetime2 = ll.field_c - var16[0];
        var7Lifetime2 = -ll.field_c - var16[1];
        var8Lifetime2 = var16[9] * var6Lifetime2 + var16[10] * var7Lifetime2 + var5 >> 16;
        if (var8Lifetime2 > 0) {
          var9Lifetime2 = qh.field_c + fb.field_d + (var16[6] * var6Lifetime2 + var16[7] * var7Lifetime2 + var4) >> 7 / var8Lifetime2;
          if (var9Lifetime2 > 0 &&
            var9Lifetime2 < var2) {
            var2 = var9Lifetime2;
          }
        }
        var6Lifetime3 = -ll.field_c - var16[0];
        var7Lifetime3 = -ll.field_c - var16[1];
        var8Lifetime3 = var16[9] * var6Lifetime3 + var16[10] * var7Lifetime3 + var5 >> 16;
        if (var8Lifetime3 > 0) {
          var9Lifetime3 = qh.field_c + fb.field_d + (var16[6] * var6Lifetime3 + var16[7] * var7Lifetime3 + var4) >> 7 / var8Lifetime3;
          if (var9Lifetime3 > 0 &&
            var9Lifetime3 < var2) {
            var2 = var9Lifetime3;
          }
        }
        var3Lifetime1 = var2 * qh.field_l;
        for (var4Lifetime1 = var2; var4Lifetime1 < qh.field_g; var4Lifetime1++) {
          var5Lifetime1 = var4Lifetime1 - 240;
          var10 = var16[9] + (var16[3] * (qh.field_b - 320) + var16[6] * var5Lifetime1 >> 9) >> 1;
          var11 = var16[10] + (var16[4] * (qh.field_b - 320) + var16[7] * var5Lifetime1 >> 9) >> 1;
          var12 = var16[11] + (var16[5] * (qh.field_b - 320) + var16[8] * var5Lifetime1 >> 9) >> 1;
          var13 = var10 * var10 + var11 * var11 + var12 * var12 >> 16;
          if (var13 > 0) {
            var13 = rf.a(var13, -126);
            var10 = lh.a(var13, (byte) -82, (long)var10);
            var11 = lh.a(var13, (byte) -125, (long)var11);
            var12 = lh.a(var13, (byte) -109, (long)var12);
            if (var12 != 0) {
              var14 = lh.a(var12, (byte) -62, (long)(256 - var16[2]));
              var6Lifetime4 = var16[0] + (var14 * var10 >> 16);
              var8Lifetime4 = var16[1] + (var14 * var11 >> 16);
              var10 = var16[9] + (var16[3] * (qh.field_j - 320) + var16[6] * var5Lifetime1 >> 9) >> 1;
              var11 = var16[10] + (var16[4] * (qh.field_j - 320) + var16[7] * var5Lifetime1 >> 9) >> 1;
              var12 = var16[11] + (var16[5] * (qh.field_j - 320) + var16[8] * var5Lifetime1 >> 9) >> 1;
              var13 = var10 * var10 + var11 * var11 + var12 * var12 >> 16;
              if (var13 > 0) {
                var13 = rf.a(var13, -126);
                var10 = lh.a(var13, (byte) -115, (long)var10);
                var11 = lh.a(var13, (byte) -115, (long)var11);
                var12 = lh.a(var13, (byte) -97, (long)var12);
                if (var12 != 0) {
                  var14Lifetime1 = lh.a(var12, (byte) -100, (long)(256 - var16[2]));
                  var7Lifetime4 = var16[0] + (var14Lifetime1 * var10 >> 16);
                  var9Lifetime4 = var16[1] + (var14Lifetime1 * var11 >> 16);
                  var10 = (var9Lifetime4 - var8Lifetime4) * var1;
                  var11 = (var7Lifetime4 - var6Lifetime4) * var1;
                  var12 = (var8Lifetime4 << 16) + qh.field_b * var10;
                  var13 = (var6Lifetime4 << 16) + qh.field_b * var11;
                  fk.a(0, 0, 0, 0, var12, var13, var10, var11, var3Lifetime1);
                  var3Lifetime1 = var3Lifetime1 + qh.field_l;
                }
              }
            }
          }
        }
    }

    final void d(boolean param0) {
        super.d(param0);
        v.field_i = null;
        t.field_a = (int[][][]) null;
        fm.field_K = (jd[][]) null;
        ro.field_v = (int[][][]) null;
        ma.field_b = (bl[][][]) null;
        cn.field_a = (jd[][]) null;
        this.field_K = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10;
        int var11;
        int var12;
        for (var9 = qh.field_b; var9 < qh.field_j; var9++) {
          var10 = param4 >> 16;
          var11 = param5 >> 16;
          if (var11 <= ll.field_c &&
            var10 <= ll.field_c &&
            var11 >= -ll.field_c &&
            var10 >= -ll.field_c) {
            var12 = var11 * var11 + var10 * var10;
            if (var12 >= 0 &&
              var12 <= jp.field_V) {
              param1 = ke.a(false, var12);
              if (param1 > me.field_x &&
                param1 < gn.field_b) {
                param1 = (param1 - me.field_x - 32) * 255 >> 5;
                if (param1 < 0) {
                  param1 = -param1;
                }
                param0 = ba.field_tb;
                param1 = 255 - param1 >> 1;
                param2 = (param0 & 16711935) * param1;
                param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                param2 = qh.field_d[param8];
                param3 = param0 + param2;
                param0 = (param0 & 16711935) + (param2 & 16711935);
                param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
              } else {
                if (param1 > bm.field_h &&
                  param1 < rb.field_g) {
                  param1 = (param1 - bm.field_h - 32) * 255 >> 5;
                  if (param1 < 0) {
                    param1 = -param1;
                  }
                  param0 = cl.field_g;
                  param1 = 255 - param1 >> 1;
                  param2 = (param0 & 16711935) * param1;
                  param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                  param2 = qh.field_d[param8];
                  param3 = param0 + param2;
                  param0 = (param0 & 16711935) + (param2 & 16711935);
                  param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                  qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                } else {
                  if (param1 > eq.field_Y &&
                    param1 < gn.field_d) {
                    param1 = (param1 - eq.field_Y - 32) * 255 >> 5;
                    if (param1 < 0) {
                      param1 = -param1;
                    }
                    param0 = pn.field_s;
                    param1 = 255 - param1 >> 1;
                    param2 = (param0 & 16711935) * param1;
                    param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                    param2 = qh.field_d[param8];
                    param3 = param0 + param2;
                    param0 = (param0 & 16711935) + (param2 & 16711935);
                    param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                    qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                  } else {
                    if (param1 > mp.field_O &&
                      param1 < ll.field_c) {
                      param1 = (param1 - mp.field_O - 32) * 255 >> 5;
                      if (param1 < 0) {
                        param1 = -param1;
                      }
                      param0 = nm.field_f;
                      param1 = 255 - param1 >> 1;
                      param2 = (param0 & 16711935) * param1;
                      param0 = (param2 & -16711936) + (param0 * param1 - param2 & 16711680) >>> 8;
                      param2 = qh.field_d[param8];
                      param3 = param0 + param2;
                      param0 = (param0 & 16711935) + (param2 & 16711935);
                      param2 = (param0 & 16777472) + (param3 - param0 & 65536);
                      qh.field_d[param8] = param3 - param2 | param2 - (param2 >>> 8);
                    }
                  }
                }
              }
            }
          }
          param4 = param4 + param6;
          param5 = param5 + param7;
          param8++;
        }
    }

    final int h(int param0) {
        if (param0 != 684) {
          this.n(16);
        }
        return 0;
    }

    final void a(cf param0, int param1) {
        try {
          this.field_P = param0.a("", "plasma_ball_hard", (byte) 121);
          this.field_Y = param0.a("", "plasma_ball_soft", (byte) 126);
          this.field_W = param0.a("", "plasma_cue_hard", (byte) 126);
          int var3_int = -128 % ((39 - param1) / 38);
          this.field_Q = param0.a("", "plasma_cue_soft", (byte) 127);
          this.field_J = param0.a("", "plasma_pot", (byte) 123);
          this.field_O = param0.a("", "plasma_respot_the_white", (byte) 125);
          this.field_hb = param0.a("", "plasma_cushion1", (byte) 127);
          this.field_N = param0.a("", "plasma_cushion2", (byte) 124);
          this.field_db = param0.a("", "plasma_cushion3", (byte) 124);
          this.field_T = param0.a("", "plasma_cushion4", (byte) 122);
          this.field_fb = param0.a("", "plasma_loop", (byte) 125);
          this.field_U = param0.a("", "plasma_shot_mode_loop", (byte) 123);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fk.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte g(int param0) {
        int var2 = 83 % ((9 - param0) / 63);
        return (byte) -128;
    }

    private final void a(pq[] param0, byte param1) {
        int var3_int = 0;
        jd dupTemp$0 = null;
        int var16 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        jd[] var3 = null;
        RuntimeException var3_ref = null;
        jd[] var4 = null;
        int var4_int = 0;
        jd[] var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        jd[][] var6 = null;
        jd var7 = null;
        jd var8 = null;
        jd var9 = null;
        jd var10 = null;
        jd var11 = null;
        jd var12 = null;
        jd var13 = null;
        jd var14 = null;
        jd var15 = null;
        int var17 = 0;
        int var18 = 0;
        var18 = Pool.field_O;
        try {
          for (var3_int = 0; param0.length > var3_int; var3_int++) {
            if (param0[var3_int].field_s) {
              var4_int = (param0[var3_int].field_g >> 13) * 32 / 4608;
              var5_int = 16 * (param0[var3_int].field_k >> 13) / 2304;
              if (var4_int >= 0) {
                if (var4_int >= 32) {
                  var4_int = 31;
                }
              } else {
                var4_int = 0;
              }
              if (var5_int >= 0) {
                if (16 <= var5_int) {
                  var5_int = 15;
                }
              } else {
                var5_int = 0;
              }
              dupTemp$0 = fm.field_K[var5_int][var4_int];
              dupTemp$0.field_g = dupTemp$0.field_g + (1024 + ga.a(256, true, ea.field_r));
            }
          }
          var3 = fm.field_K[0];
          var4 = var3;
          var5 = var4;
          var6_int = 0;
          if (param1 != -122) {
            return;
          }
          while (fm.field_K.length > var6_int) {
            if (var6_int + 1 < fm.field_K.length) {
              var5 = fm.field_K[1 + var6_int];
            }
            var7 = var3[0];
            var8 = var7;
            var9 = var8;
            var10 = var4[0];
            var11 = var10;
            var12 = var11;
            var13 = var5[0];
            var14 = var13;
            var15 = var14;
            for (var16 = 0; var16 < var4.length; var16++) {
              if ((1 + var16) < var4.length) {
                var12 = var4[1 + var16];
                var15 = var5[1 + var16];
                var9 = var3[var16 + 1];
              }
              var17 = (10 * var14.field_g >> 8) + ((var12.field_g * 10 >> 8) + (var10.field_g * 10 >> 8) + ((5 * var9.field_g >> 8) + ((5 * var7.field_g >> 8) + (10 * var8.field_g >> 8) + (var11.field_g * 180 >> 8)))) + ((5 * var13.field_g >> 8) + (5 * var15.field_g >> 8));
              if (var17 > 4096) {
                var17 = 4096;
              }
              if (var17 < 0) {
                var17 = 0;
              }
              cn.field_a[var6_int][var16].field_g = var17;
              var7 = var8;
              var10 = var11;
              var8 = var9;
              var13 = var14;
              var11 = var12;
              var14 = var15;
            }
            var3 = var4;
            var4 = var5;
            var6_int++;
          }
          var6 = fm.field_K;
          fm.field_K = cn.field_a;
          cn.field_a = var6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_39_0 = var3_ref;
          stackIn_39_1 = new StringBuilder().append("fk.U(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int[] param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        var8 = Pool.field_O;
        try {
          var9 = f.a((byte) 96, param1);
          var13 = var9;
          var9[0] = var9[0] - 2304;
          var9[1] = var9[1] - 1152;
          var9[2] = var9[2] >> 0;
          var9[1] = var9[1] >> 0;
          var9[0] = var9[0] >> 0;
          var9[1] = var9[1] >> 8;
          var9[0] = var9[0] >> 8;
          var4 = -81 / ((param0 + 64) / 52);
          var9[2] = var9[2] >> 8;
          for (var5 = 0; ma.field_b.length > var5; var5++) {
            for (var6 = 0; var6 < ma.field_b[var5].length; var6++) {
              for (var7 = 0; var7 < ma.field_b[var5][var6].length; var7++) {
                ma.field_b[var5][var6][var7].a(-56, var13);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("fk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (this.field_bb != null) {
          this.field_bb.f(64 * param1 / 4096 + 256);
        }
        int var3 = -113 % ((param0 - 11) / 52);
    }

    public static void m(int param0) {
        field_eb = null;
        field_cb = null;
        field_gb = null;
        int var1 = -122 / ((param0 + 65) / 38);
    }

    private final void a(boolean param0, int[] param1, uf param2) {
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        var9 = Pool.field_O;
        try {
          if (param0) {
            this.g(2);
          }
          if (param2.k(-38)) {
            if (id.field_c.field_g) {
              param2.field_I.a(id.field_c.field_l, param2.field_G.field_k, (byte) 47, param2.field_G.field_h, param2.field_G.field_e, param2.field_G.field_d);
              id.field_c.field_g = false;
            }
            var4_int = param2.field_f;
            this.field_R[0] = (id.field_c.field_l[0] >> 13) + (var4_int * id.field_c.field_l[9] >> 13);
            this.field_X[0] = (id.field_c.field_l[10] * var4_int >> 13) + (id.field_c.field_l[1] >> 13);
            this.field_L[0] = (id.field_c.field_l[11] * var4_int >> 13) + (id.field_c.field_l[2] >> 13);
            this.field_M[0] = 1;
            this.field_R[1] = ((var4_int + 456) * id.field_c.field_l[9] >> 13) + (id.field_c.field_l[0] >> 13);
            this.field_X[1] = ((456 + var4_int) * id.field_c.field_l[10] >> 13) + (id.field_c.field_l[1] >> 13);
            this.field_L[1] = (id.field_c.field_l[11] * (456 + var4_int) >> 13) + (id.field_c.field_l[2] >> 13);
            this.field_M[1] = 3;
            for (var5_int = 0; this.field_R.length > var5_int; var5_int++) {
              var6 = this.field_R[var5_int] - param1[0];
              var7 = -param1[1] + this.field_X[var5_int];
              var8 = -param1[2] + this.field_L[var5_int];
              this.field_R[var5_int] = param1[3] * var6 + var7 * param1[4] + param1[5] * var8 >> 16;
              this.field_X[var5_int] = param1[8] * var8 + (var7 * param1[7] + param1[6] * var6) >> 16;
              this.field_L[var5_int] = var8 * param1[11] + (param1[9] * var6 + var7 * param1[10]) >> 16;
            }
            if (this.field_L[0] <= 0 &&
              this.field_L[1] <= 0) {
              param2.D(-125);
              return;
            }
            if (!hk.a(113, this.field_R[1], this.field_R[0], this.field_X[1], this.field_L[1], this.field_L[0], this.field_X[0])) {
              this.field_S = ic.a(this.field_X, 0, this.field_R, this.field_M, this.field_L, 4);
              var10 = 0;
              var5_intLifetime1 = var10;
              while (this.field_R.length > var10) {
                this.field_R[var10] = 1280 + (this.field_R[var10] << 11) / this.field_L[var10];
                this.field_X[var10] = 960 + (this.field_X[var10] << 11) / this.field_L[var10];
                this.field_M[var10] = (this.field_M[var10] << 16) / this.field_L[var10];
                var10++;
              }
              var5 = bc.field_c;
              if (param2.field_I.field_f instanceof af) {
                var6Lifetime1 = ((af) (param2.field_I.field_f)).a(-1);
                if (-1 != var6Lifetime1) {
                  var5 = hf.a(var6Lifetime1, (byte) 73);
                }
              }
              stackIn_26_0 = (0 != (1 & this.field_S)) ? 2 : 1;
              if ((this.field_S & 2) != 0) {
                stackIn_29_1 = 2;
              } else {
                stackIn_29_1 = 1;
              }
              wn.$cfr$intArgs$a$2435eea43ef1(stackIn_26_0, stackIn_29_1, var5, this.field_X, 127, 0, this.field_R, this.field_M);
            }
            param2.D(-125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("fk.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final void a(int param0, uf param1) {
        int var3_int = 0;
        int var4 = Pool.field_O;
        try {
          super.a(param0, param1);
          for (var3_int = 0; var3_int < this.field_K.length; var3_int++) {
            this.field_K[var3_int].a((byte) -43);
          }
          this.n(2);
          this.a(param1.field_I.field_l, (byte) -122);
          mf.field_l = mf.field_l - 1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fk.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, di param1) {
        try {
          this.field_b = cg.a(param1, "", "pool_plasma");
          this.field_i = cg.a(param1, "", "pool_plasma_win_jingle");
          this.field_n = cg.a(param1, "", "pool_plasma_lose_jingle");
          if (param0 != 1) {
            field_gb = (hr) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fk.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        int var2 = 0;
        int var4_int = 0;
        int var6_int = 0;
        int var7 = 0;
        int var17 = 0;
        bl[][] var3;
        bl[] var4;
        bl[] var5;
        bl[] var6;
        bl var7_ref_bl;
        bl var8;
        bl var9;
        bl var10;
        bl var11;
        bl var12;
        bl var13;
        bl var14;
        bl var15;
        bl var16;
        int var18;
        bl[] var19;
        var18 = Pool.field_O;
        if (param0 != 2) {
          return;
        }
        for (var2 = 0; var2 < ma.field_b.length; var2++) {
          var3 = ma.field_b[var2];
          for (var4_int = 0; var4_int < 16; var4_int++) {
            var19 = var3[var4_int];
            for (var6_int = 0; var6_int < 16; var6_int++) {
              var7_ref_bl = var19[var6_int];
              if (var7_ref_bl.field_E > 0) {
                if (!var7_ref_bl.field_c) {
                  var7_ref_bl.field_E = var7_ref_bl.field_E - 2;
                  if (var7_ref_bl.field_E <= 0) {
                    var7_ref_bl.field_E = 0;
                  }
                } else {
                  var7_ref_bl.field_E = var7_ref_bl.field_E + 2;
                  if (var7_ref_bl.field_E >= 256) {
                    if (0 == ga.a(10, true, ea.field_r)) {
                      var7_ref_bl.field_y = var7_ref_bl.field_y + 1;
                    }
                    var7_ref_bl.field_c = false;
                  }
                }
              } else {
                if (ga.a(2500, true, ea.field_r) == 0) {
                  var7_ref_bl.field_E = 1;
                  var7_ref_bl.field_c = true;
                } else {
                  var7_ref_bl.field_E = 0;
                }
              }
              if (var7_ref_bl.field_y > 0) {
                var7_ref_bl.field_y = var7_ref_bl.field_y + 1;
                if (var7_ref_bl.field_y >= 256) {
                  var7_ref_bl.field_y = 0;
                }
              }
            }
          }
          var4 = var3[0];
          var5 = var4;
          var6 = var5;
          for (var7 = 0; var7 < 16; var7++) {
            if (var7 < 15) {
              var6 = var3[1 + var7];
            }
            var8 = var4[0];
            var9 = var8;
            var10 = var9;
            var11 = var5[0];
            var12 = var11;
            var13 = var12;
            var14 = var6[0];
            var15 = var14;
            var16 = var15;
            for (var17 = 0; var17 < 16; var17++) {
              if (15 > var17) {
                var16 = var6[var17 + 1];
                var13 = var5[var17 + 1];
              }
              if (128 < var12.field_E) {
                boolean decompiledFrameRemainder1 = true;
                if (var11.field_E == 0) {
                  if (ga.a(250, true, ea.field_r) == 0) {
                    var11.field_E = var11.field_E + 1;
                  }
                  if (var13.field_E != 0) {
                    if (((var9.field_E == 0)) &&
                      ((ga.a(250, true, ea.field_r) == 0))) {
                      var9.field_E = var9.field_E + 1;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (ga.a(250, true, ea.field_r) != 0) {
                      if (((var9.field_E == 0)) &&
                        ((ga.a(250, true, ea.field_r) == 0))) {
                        var9.field_E = var9.field_E + 1;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var13.field_E = var13.field_E + 1;
                    }
                  }
                } else {
                  if (var13.field_E != 0) {
                    if (((var9.field_E == 0)) &&
                      ((ga.a(250, true, ea.field_r) == 0))) {
                      var9.field_E = var9.field_E + 1;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (ga.a(250, true, ea.field_r) != 0) {
                      if (((var9.field_E == 0)) &&
                        ((ga.a(250, true, ea.field_r) == 0))) {
                        var9.field_E = var9.field_E + 1;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var13.field_E = var13.field_E + 1;
                    }
                  }
                }
                if ((decompiledFrameRemainder1) && (var9.field_E == 0 &&
                  ga.a(250, true, ea.field_r) == 0)) {
                  var9.field_E = var9.field_E + 1;
                }
                if (var15.field_E == 0 &&
                  0 == ga.a(250, true, ea.field_r)) {
                  var15.field_E = var15.field_E + 1;
                }
              }
              if (var12.field_y > 0) {
                boolean decompiledFrameRemainder0 = true;
                if (!var8.field_c) {
                  if (var8.field_E == 0) {
                    var8.field_c = true;
                    if (!var10.field_c &&
                      var10.field_E == 0) {
                      var10.field_c = true;
                    }
                  } else {
                    if (var10.field_c) {
                      if ((!(var14.field_c)) &&
                        ((0 == var14.field_E))) {
                        var14.field_c = true;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var10.field_E == 0) {
                        var10.field_c = true;
                      }
                    }
                  }
                } else {
                  if (!var10.field_c &&
                    var10.field_E == 0) {
                    var10.field_c = true;
                  }
                }
                if ((decompiledFrameRemainder0) && (!var14.field_c &&
                  0 == var14.field_E)) {
                  var14.field_c = true;
                }
                if (!var16.field_c &&
                  var16.field_E == 0) {
                  var16.field_c = true;
                }
                var8.field_E = var8.field_E + 1;
                var14.field_E = var14.field_E + 1;
                var10.field_E = var10.field_E + 1;
                var16.field_E = var16.field_E + 1;
              }
              var8 = var9;
              var9 = var10;
              var11 = var12;
              var12 = var13;
              var14 = var15;
              var15 = var16;
            }
            var4 = var5;
            var5 = var6;
          }
        }
        return;
    }

    final void a(byte param0, uf param1) {
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        Object stackIn_28_0;
        int[] stackIn_28_1;
        int stackIn_28_2;
        boolean stackIn_28_3;
        pq[] stackIn_28_4;
        Object stackIn_29_0;
        boolean stackIn_29_5;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        pq[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        pq[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        var10 = Pool.field_O;
        try {
          var14 = param1.field_I.field_l;
          var3 = var14;
          var16 = param1.field_ab;
          var13 = var16;
          var4 = var13;
          this.a(false, var16, var14);
          en.b(0);
          fk.a(var16);
          var17 = f.a((byte) 77, var16);
          var15 = var17;
          var5_ref_int__ = var15;
          var5_ref_int__[0] = var5_ref_int__[0] - 2304;
          var5_ref_int__[1] = var5_ref_int__[1] - 1152;
          var5_ref_int__[2] = var5_ref_int__[2] >> 2;
          var5_ref_int__[1] = var5_ref_int__[1] >> 2;
          var5_ref_int__[0] = var5_ref_int__[0] >> 2;
          this.field_R[0] = 0;
          this.field_X[0] = 0;
          this.field_L[0] = 16384;
          this.field_R[1] = 0;
          this.field_M[0] = 4;
          this.field_X[1] = 0;
          this.field_L[1] = 1;
          this.field_M[1] = 4;
          for (var6_int = 0; var6_int < this.field_R.length; var6_int++) {
            var7 = this.field_R[var6_int] - var17[0];
            var8 = this.field_X[var6_int] - var17[1];
            var9 = this.field_L[var6_int] - var17[2];
            this.field_R[var6_int] = var9 * var17[5] + var17[3] * var7 + var17[4] * var8 >> 16;
            this.field_X[var6_int] = var17[7] * var8 + (var17[6] * var7 + var9 * var17[8]) >> 16;
            this.field_L[var6_int] = var17[11] * var9 + (var17[9] * var7 + var8 * var17[10]) >> 16;
          }
          if ((this.field_L[0] > 0 ||
            this.field_L[1] > 0) && !hk.a(59, this.field_R[1], this.field_R[0], this.field_X[1], this.field_L[1], this.field_L[0], this.field_X[0])) {
            this.field_S = ic.a(this.field_X, 0, this.field_R, this.field_M, this.field_L, 4);
            var12 = 0;
            var6_intLifetime1 = var12;
            while (this.field_R.length > var12) {
              this.field_R[var12] = 1280 + (this.field_R[var12] << 11) / this.field_L[var12];
              this.field_X[var12] = (this.field_X[var12] << 11) / this.field_L[var12] + 960;
              this.field_M[var12] = (this.field_M[var12] << 16) / this.field_L[var12];
              var12++;
            }
            var6 = bc.field_c;
            if (param1.field_I.field_f instanceof af) {
              var7Lifetime1 = ((af) (param1.field_I.field_f)).a(-1);
              if (var7Lifetime1 != -1) {
                var6 = hf.a(var7Lifetime1, (byte) 96);
              }
            }
            stackIn_18_0 = ((1 & this.field_S) == 0) ? 1 : 2;
            if ((2 & this.field_S) == 0) {
              stackIn_21_1 = 1;
            } else {
              stackIn_21_1 = 2;
            }
            wn.$cfr$intArgs$a$2435eea43ef1(stackIn_18_0, stackIn_21_1, var6, this.field_X, 127, 0, this.field_R, this.field_M);
          }
          this.b((byte) 44, var16);
          this.a(var16, (byte) 79, false, var14, false);
          this.a(77, var16);
          this.c((byte) -25, var16);
          for (var5 = 0; this.field_K.length > var5; var5++) {
            this.field_K[var5].a(false, (byte) 98, var16);
          }
          if (0L == (pd.field_i & 1073741824L)) {
            stackIn_28_0 = this;
            stackIn_28_1 = var4;
            stackIn_28_2 = 122;
            stackIn_28_3 = true;
            stackIn_28_4 = var3;
            if (param1.field_I.j(20).field_q != 0) {
              stackIn_29_0 = this;
              stackIn_29_5 = false;
            } else {
              stackIn_29_0 = this;
              stackIn_29_5 = true;
            }
            this.a(stackIn_28_1, (byte) stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_29_5);
          }
          if (param0 != -55) {
            var11 = (int[]) null;
            this.c((byte) 102, (int[]) null);
          }
          if ((1073741824L & pd.field_i) == 0L) {
            this.a(false, var16, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_38_0 = var3_ref;
          stackIn_38_1 = new StringBuilder().append("fk.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    private final void c(byte param0, int[] param1) {
        int var17 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jd[] var16 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        jd var24 = null;
        int var25 = 0;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var26 = Pool.field_O;
        try {
          var3_int = 0;
          var34 = ro.field_v[0][var3_int];
          var29 = var34;
          var27 = var29;
          var4 = var27;
          var5 = ro.field_v[1][var3_int];
          if (param0 != -25) {
            this.field_Y = (jg) null;
          }
          var35 = ro.field_v[2][var3_int];
          var30 = var35;
          var28 = var30;
          var6 = var28;
          pl.a(var5, var34.length, 0, param1, 0, var27, t.field_a[1][var3_int], t.field_a[2][var3_int], t.field_a[0][var3_int].length, var35, -26182, t.field_a[0][var3_int]);
          for (var3_intLifetime1 = 1; 16 >= var3_intLifetime1; var3_intLifetime1++) {
            var36 = ro.field_v[0][var3_intLifetime1];
            var31 = var36;
            var7 = var31;
            var38 = ro.field_v[1][var3_intLifetime1];
            var33 = var38;
            var8 = var33;
            var37 = ro.field_v[2][var3_intLifetime1];
            var32 = var37;
            var9 = var32;
            pl.a(var8, var36.length, 0, param1, 0, var7, t.field_a[1][var3_intLifetime1], t.field_a[2][var3_intLifetime1], t.field_a[0][var3_intLifetime1].length, var37, -26182, t.field_a[0][var3_intLifetime1]);
            var10 = var4[0];
            var11 = var5[0];
            var12 = var6[0];
            var13 = var36[0];
            var14 = var38[0];
            var15 = var37[0];
            var16 = fm.field_K[-1 + var3_intLifetime1];
            for (var17 = 1; 32 >= var17; var17++) {
              var18 = var4[var17];
              var19 = var5[var17];
              var20 = var6[var17];
              var21 = var36[var17];
              var22 = var38[var17];
              var23 = var37[var17];
              if (0 < var12 &&
                0 < var20 &&
                var15 > 0 &&
                var23 > 0) {
                var24 = var16[-1 + var17];
                var25 = 48 + var24.field_g * 208 / 4096;
                qh.b(var10, var11, var18, var19, 1140241, var25);
                qh.b(var10, var11, var13, var14, 1140241, var25);
                qh.b(var18, var19, var21, var22, 1140241, var25);
                qh.b(var13, var14, var21, var22, 1140241, var25);
              }
              var10 = var18;
              var13 = var21;
              var11 = var19;
              var12 = var20;
              var15 = var23;
              var14 = var22;
            }
            var5 = var8;
            var4 = var7;
            var6 = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("fk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void b(byte param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = Pool.field_O;
        try {
          if (param0 != 44) {
            field_eb = (String) null;
          }
          for (var3_int = 0; ma.field_b.length > var3_int; var3_int++) {
            for (var4 = 0; ma.field_b[var3_int].length > var4; var4++) {
              for (var5 = 0; ma.field_b[var3_int][var4].length > var5; var5++) {
                ma.field_b[var3_int][var4][var5].a((byte) 67);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("fk.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    fk() {
        this.field_L = new int[2];
        this.field_R = new int[2];
        this.field_X = new int[2];
        this.field_M = new int[2];
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Pool.field_O;
        if (param0 != 10) {
          return;
        }
        ma.field_b = new bl[4][16][16];
        for (var2 = 0; var2 < 16; var2++) {
          var3 = -128 + (var2 * 2048 + 256) / 128;
          var4 = ((1 + var2) * 2048 - 256) / 128 - 128;
          for (var5 = 0; var5 < 16; var5++) {
            var6 = (256 + 2048 * var5) / 128 - 128;
            var7 = -128 + (-256 + (var5 + 1) * 2048) / 128;
            ma.field_b[0][var2][var5] = new bl(128, -var6, var3, 128, -var7, var3, 128, -var6, var4, 128, -var7, var4);
            ma.field_b[1][var2][var5] = new bl(-var6, -128, var3, -var7, -128, var3, -var6, -128, var4, -var7, -128, var4);
            ma.field_b[2][var2][var5] = new bl(-128, var6, var3, -128, var7, var3, -128, var6, var4, -128, var7, var4);
            ma.field_b[3][var2][var5] = new bl(var6, 128, var3, var7, 128, var3, var6, 128, var4, var7, 128, var4);
          }
        }
    }

    final void a(boolean param0) {
        if (null != this.field_bb) {
          kb.a((byte) -110, this.field_bb);
          this.field_bb = null;
        }
        if (param0) {
          this.field_T = (jg) null;
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = 81 / ((param0 + 47) / 45);
        if (9 == param2) {
          if (this.field_bb == null) {
          } else {
            if (param1) {
              this.field_bb.c(64);
            } else {
              this.field_bb.c(4096);
            }
            this.field_bb = null;
          }
        }
    }

    static {
        field_eb = "Members' Benefits";
        field_gb = null;
        field_V = 2;
    }
}
