/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    boolean field_g;
    boolean field_ab;
    private int field_n;
    private int field_c;
    int field_a;
    int field_J;
    private int field_P;
    private boolean field_o;
    int field_D;
    private int field_L;
    private int field_j;
    private int field_S;
    private boolean field_C;
    static String field_db;
    private vn field_cb;
    private int field_Y;
    private int field_e;
    private int field_u;
    private int field_x;
    boolean field_G;
    private int field_p;
    static int[] field_d;
    boolean field_X;
    boolean field_y;
    private int field_K;
    private int field_M;
    private int[] field_v;
    int field_I;
    boolean field_H;
    static kc field_E;
    static int field_q;
    private int[] field_l;
    private boolean field_U;
    ol field_m;
    int field_bb;
    private int field_R;
    private int field_Q;
    static String field_N;
    private ge field_f;
    boolean field_i;
    private boolean field_F;
    private boolean field_k;
    boolean field_O;
    nf field_V;
    int field_b;
    private boolean field_T;
    static String field_A;
    boolean field_t;
    int field_z;
    boolean field_B;
    private int field_W;
    private int field_r;
    private int field_Z;
    nf field_w;
    private int field_h;
    int field_s;

    final static int h(int param0) {
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          p.field_b.a(mk.field_S, dn.field_Jb, true, (byte) -100);
          p.field_b.i(4);
          while (ib.b(false)) {
            p.field_b.a(ed.field_Bb, (byte) -89, vn.field_d);
          }
          if (qg.field_c != -1) {
            var1_int = qg.field_c;
            ee.a(-1, (byte) 30);
            stackIn_9_0 = var1_int;
            return stackIn_9_0;
          }
          if (param0 != -1993) {
            stackIn_12_0 = -98;
            return stackIn_12_0;
          }
          if (u.field_k) {
            stackIn_15_0 = 3;
            return stackIn_15_0;
          }
          if (hb.field_Gb == sk.field_a) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (!wn.field_z.a((byte) -88)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (in.field_Gb == sk.field_a) {
            stackIn_26_0 = 2;
            return stackIn_26_0;
          }
          stackIn_28_0 = -1;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "le.KB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (this.field_V.b(param2) < 0) {
            stackIn_4_0 = -an.field_f / 2;
          } else {
            stackIn_4_0 = an.field_f / 2;
          }
          var4_int = stackIn_4_0;
          if (-var4_int > vn.field_c) {
            this.field_n = 0;
            vn.field_c = -var4_int;
          }
          if (vn.field_c > this.field_V.field_y + var4_int) {
            vn.field_c = var4_int + this.field_V.field_y;
            this.field_n = 0;
          }
          if (ol.field_g < param1) {
            this.field_S = 0;
            ol.field_g = param1;
          }
          if (param0 < ol.field_g) {
            this.field_S = 0;
            ol.field_g = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "le.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, wk param2, boolean param3) {
        RuntimeException runtimeException = null;
        hl var5 = null;
        byte[] var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new hl();
          var5.field_k = param1;
          var6 = new byte[param0];
          param2.a((byte) 123, 0, var6, param0);
          var5.field_j = new wk(var6);
          var5.field_g = jb.field_v;
          if (param3) {
            return;
          }
          this.field_cb.b(var5, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("le.QB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != this.field_m.field_h) {
            if (this.field_m.field_h.h(param0 - 17747)) {
              vn.field_c = vn.field_c * 7 + this.field_m.field_h.c(param0 - 17583) >> 3;
              ol.field_g = 7 * ol.field_g + this.field_m.field_h.e(52) >> 3;
            }
          } else {
            if (this.field_m.field_d != null && (this.field_m.field_d.f(true) ||
              this.field_m.field_d.y(param0 - 37) == this.field_bb)) {
              vn.field_c = vn.field_c * 7 + this.field_m.field_d.f(64) >> 3;
              ol.field_g = 7 * ol.field_g + this.field_m.field_d.i((byte) -53) >> 3;
            }
          }
          if (param0 != 17608) {
            this.field_J = 85;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.BB(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        ml var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          this.field_V.t(8);
          this.field_C = true;
          this.field_bb = this.field_V.d(false);
          var2 = this.field_V.a(this.field_V.d(false), true);
          if (param0 != 0) {
            return;
          }
          if (var2 != null) {
            this.field_m.a(-110, var2);
          } else {
            this.field_m.a(0);
          }
          this.field_s = -1000;
          this.field_t = false;
          if (!this.field_ab &&
            mj.field_p == 7 &&
            this.field_V.field_q > 1) {
            this.field_I = this.field_V.d(false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "le.U(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = n.field_g.field_nb;
          var6 = var5_int / 2 + this.field_V.field_H - param0;
          for (var7 = 0; var7 < an.field_f; var7++) {
            var8 = (int)Math.abs(18.0 * Math.cos(3.141592653589793 * (double)(param3 + (var7 + ge.field_r * 4)) / 64.0));
            if (ge.field_r < 64) {
              var8 = var8 * (ge.field_r - 32) / 32;
            } else {
              var8 = var8 * (96 - ge.field_r) / 32;
            }
            if (var8 > 0) {
              var8 = -var8;
            }
            var8 += 12;
            var8 = (int)((double)var8 + (32.0 + 8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0)));
            de.f(var7, -var8 + var6, var8, (65792 | param1) >> 1, 128);
          }
          if (param2 != 12224) {
            return;
          }
          for (var7Lifetime1 = 0; an.field_f > var7Lifetime1; var7Lifetime1++) {
            var8Lifetime1 = (int)Math.abs(20.0 * Math.sin(3.141592653589793 * (double)(param3 + (4 * ge.field_r + var7Lifetime1)) / 64.0));
            if (64 <= ge.field_r) {
              var8Lifetime1 = var8Lifetime1 * (-ge.field_r + 96) / 32;
            } else {
              var8Lifetime1 = (-32 + ge.field_r) * var8Lifetime1 / 32;
            }
            if (var8Lifetime1 > 0) {
              var8Lifetime1 = -var8Lifetime1;
            }
            var8Lifetime1 += 8;
            var8Lifetime1 = (int)((double)var8Lifetime1 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
            de.h(0, var6 - var8Lifetime1, an.field_f, an.field_j);
            de.c(var7Lifetime1, var6 - 64, 1, 128, (123361 | param1) >> 1, 0);
          }
          de.a();
          if (an.field_j > var6 + 64) {
            de.d(0, var6 + 64, an.field_f, -var6 - 64 + an.field_j, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "le.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean j(int param0) {
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -27726) {
            this.field_Z = 96;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o && (this.r(-74) ||
            this.field_k)) {
            stackIn_9_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = false;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.NA(" + param0 + ')');
        }
    }

    private final boolean f(int param0) {
        int var2_int = 0;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var2_int = 53 / ((param0 + 81) / 45);
          if (!this.field_o && (this.r(-35) ||
            this.field_k)) {
            stackIn_7_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_7_0 = false;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.DB(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var15 = 0;
        ml var16 = null;
        int stackIn_34_0;
        int stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        int stackIn_35_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_42_3;
        int stackIn_62_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_87_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        String var14 = null;
        String var11Lifetime1;
        int var8Lifetime1;
        int var11_intLifetime1;
        int var11_intLifetime2;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var16 = this.field_V.a(param2, true);
          if (var16 != null &&
            0 == (1 << param2 & (this.field_a | this.field_J)) &&
            var16.field_I != null && (param2 == 0 ||
            !qg.a(param3 - 99) ||
            mj.field_p == 6)) {
            var6 = var16.v(-126);
            if (0 > var6) {
              var6 = 0;
            }
            var7 = var16.m(-20357) + var6;
            var8 = nj.field_n[param2];
            if (var16.o(-22625) == 27) {
              var8 = 13413102;
            }
            de.e(8, 2 + param0, 40 + param1 - 4, -4 + this.field_l[param2], 0, 192);
            de.a(6, param0, param1 + 40, this.field_l[param2], 6, 0);
            de.a(7, 1 + param0, param1 + 38, -2 + this.field_l[param2], 6, 16777215);
            if (var16.o(-22625) != 3 &&
              var16.o(param3 - 22621) != 27) {
              if (this.field_l[param2] == 17) {
                var16.field_I.b(8, -4 + param0);
              } else {
                var16.field_I.c(8, -24 + (param0 + this.field_l[param2] / 2), (-4335 + this.field_l[param2] * 255) / 17);
              }
            } else {
              if (this.field_l[param2] != 17) {
                var16.field_I.c(8, -24 + (param0 + this.field_l[param2] / 2), 32, 48, (-4335 + 255 * this.field_l[param2]) / 17);
              } else {
                var16.field_I.f(8, -4 + param0);
              }
            }
            var9 = this.field_V.c((byte) -123, param2);
            var10 = 4 * this.field_V.s(0) + (-this.field_V.b(12) + this.field_V.c((byte) -105, param2));
            if (var10 > 4) {
              var10 = 4;
            }
            if (var7 > 0) {
              var11_int = var7 * 120 / 250;
              stackIn_34_0 = ~(param1 + (48 + var11_int));
              stackIn_34_1 = -32;
              stackIn_34_2 = 272;
              stackIn_34_3 = mi.field_B.b("350");
              if (var9 <= 0) {
                stackIn_35_4 = 0;
              } else {
                stackIn_35_4 = mi.field_B.b("5/5") + 1;
              }
              if (stackIn_34_0 < ~(stackIn_34_1 + (stackIn_34_2 - (stackIn_34_3 + stackIn_35_4)))) {
                stackIn_41_0 = -32 - mi.field_B.b("350");
                stackIn_41_1 = -param1;
                stackIn_41_2 = 224;
                if (var9 > 0) {
                  stackIn_42_3 = mi.field_B.b("5/5") + 1;
                } else {
                  stackIn_42_3 = 0;
                }
                var11_int = stackIn_41_0 + (stackIn_41_1 + (stackIn_41_2 - stackIn_42_3));
              }
              if (var11_int > this.field_v[param2]) {
                this.field_v[param2] = this.field_v[param2] + 1;
              }
              if (this.field_v[param2] > var11_int) {
                this.field_v[param2] = this.field_v[param2] - 1;
              }
              if (this.field_l[param2] > 17 &&
                this.field_V.d(false) != param2) {
                this.field_l[param2] = this.field_l[param2] - 1;
              }
              if (this.field_l[param2] < 34 &&
                param2 == this.field_V.d(false)) {
                this.field_l[param2] = this.field_l[param2] + 1;
              }
            }
            var11_intLifetime1 = 17 + this.field_v[param2];
            stackIn_62_0 = param1 + 48;
            if (var9 <= 0) {
              stackIn_63_1 = 0;
            } else {
              stackIn_63_1 = 1 + mi.field_B.b("5/4");
            }
            var12 = stackIn_62_0 + stackIn_63_1;
            de.c(3 + var12, -8 + param0 + (this.field_l[param2] / 2 + 3), -6 + var11_intLifetime1, 11, var8, (var8 | 8421504) ^ 8421504);
            de.h(3 + var12, 3 + (-8 + (this.field_l[param2] / 2 + param0)), -6 + var11_intLifetime1 + (3 + var12), 20 + (-8 + param0) + this.field_l[param2] / 2 - 6);
            var11_intLifetime1 = var11_intLifetime1 + (this.field_j + param2 * 5) * this.field_l[param2] / 17 / 2;
            while (0 < var11_intLifetime1) {
              var11_intLifetime1 = var11_intLifetime1 - g.field_a.field_n;
              g.field_a.b(var11_intLifetime1 + 3 + var12, -12 + (param0 + this.field_l[param2] / 2 - 5), 64);
            }
            de.a();
            var11_intLifetime2 = this.field_v[param2] + 17;
            de.a(var12, this.field_l[param2] / 2 + param0 - 8, var11_intLifetime2, 17, 6, 0);
            de.a(2 + var12, -8 + (this.field_l[param2] / 2 + (param0 + 2)), var11_intLifetime2 - 4, 13, 4, 0);
            de.a(1 + var12, 1 + (param0 + this.field_l[param2] / 2 - 8), var11_intLifetime2 - 2, 15, 6, 16777215);
            de.a(var12 + 2, -8 + this.field_l[param2] / 2 + param0 + 2, -4 + var11_intLifetime2, 13, 6, 0);
            var13_int = var11_intLifetime2 + var12 + 2;
            var14 = Integer.toString(var7);
            mi.field_B.a(var14, var13_int, 3 + (-8 + this.field_l[param2] / 2 + param0 - (-4 - mi.field_B.field_C / 2 + 1)), 8421504 ^ (var8 | 8421504), 0);
            mi.field_B.a(var14, -1 + var13_int, mi.field_B.field_C / 2 + 4 - 8 + (param0 - (-(this.field_l[param2] / 2) - 3)), (var8 | 8421504) ^ 8421504, 0);
            mi.field_B.a(var14, var13_int, -4 + (this.field_l[param2] / 2 + param0 + (3 + mi.field_B.field_C / 2)), var8, -1);
            if (0 < var9) {
              var12 = var12 - (mi.field_B.b("5/5") + 1);
              var13 = var9 + "/" + var10;
              if (var9 > 4) {
                var13 = Integer.toString(var9);
              }
              if (this.field_l[param2] >= 34 &&
                fb.field_a != null &&
                null != fb.field_a[2]) {
                fb.field_a[2].a(1 + var12, param0);
              }
              mi.field_B.a(var13, var12, -6 + (param0 + this.field_l[param2] - 8 - (-4 - mi.field_B.field_C / 2)), 0, 0);
              mi.field_B.a(var13, var12 - 1, mi.field_B.field_C / 2 + 3 + (-8 + param0) + (this.field_l[param2] - 8 + 4), 0, 0);
              mi.field_B.a(var13, var12, mi.field_B.field_C / 2 + 3 + (-8 + (this.field_l[param2] + param0 - 8)) + 4, var8, -1);
            }
            var11 = qo.a((byte) 121, (CharSequence) ((Object) this.field_V.field_k[param2]));
            mi.field_B.b(var11, 12 + param1 / 2 + 25, mi.field_B.field_C / 2 + (-1 + param0 + this.field_l[param2] / 2), 8421504 ^ (var8 | 8421504), 0);
            mi.field_B.b(var11, 12 + param1 / 2 + 26, -1 + (-1 + this.field_l[param2] / 2 + param0 + mi.field_B.field_C / 2), 8421504 ^ (8421504 | var8), 0);
            mi.field_B.b(var11, param1 / 2 + 12 + 26, -1 + (param0 + this.field_l[param2] / 2 + mi.field_B.field_C / 2), var8, -1);
            if (this.field_V.s(0) > 2) {
              param0 = param0 + (3 + this.field_l[param2]);
            } else {
              if (param2 == 1) {
                var8Lifetime1 = 16777215;
                param0 -= 20;
                var11Lifetime1 = sb.field_c;
                mi.field_B.b(var11Lifetime1, -1 + param1 / 2 + 36, mi.field_B.field_C / 2 + param0 + 8, 8421504 ^ (var8Lifetime1 | 8421504), 0);
                mi.field_B.b(var11Lifetime1, 12 + param1 / 2 + 24, -1 + param0 - (-8 - mi.field_B.field_C / 2), (var8Lifetime1 | 8421504) ^ 8421504, 0);
                mi.field_B.b(var11Lifetime1, param1 / 2 + 36, 8 + param0 + mi.field_B.field_C / 2, var8Lifetime1, -1);
              }
              param0 = param0 + (20 + (this.field_l[param2] + 3));
            }
          }
          if (param3 != -4) {
            this.field_M = -126;
          }
          stackIn_87_0 = param0;
          return stackIn_87_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "le.GB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        StringBuilder stackIn_73_0 = null;
        String stackIn_74_1 = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9_int = 0;
        qa var9 = null;
        int var10 = 0;
        Object var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ml var14 = null;
        Object var15 = null;
        String var15_ref = null;
        vn var16 = null;
        vn var17 = null;
        Object var11_refLifetime1;
        Object var11_refLifetime2;
        Object var15Lifetime1;
        Object var11_refLifetime3;
        Object var11_refLifetime1Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          ce.field_m.a(true);
          de.h(param4, param2, param4 + param6, param2 + param1);
          if (this.field_k &&
            !this.field_V.n(4)) {
            de.d(param4, param2, param6, param1, 0);
            var8 = rb.field_l + " - " + this.field_L + "%";
            tj.field_t.a(var8, param4, param2, param6, param1, 16777215, -1, 1, 1, 0);
            return;
          }
          var8_int = 2158624;
          if (this.field_V.a(param5 ^ -31593) == 2) {
            var8_int = 2239508;
          }
          if (3 == this.field_V.a(-31497)) {
            var8_int = 3298412;
          }
          if (this.field_V.a(-31497) == 1) {
            var8_int = 4214874;
          }
          if (this.field_V.a(-31497) == 0) {
            var8_int = 5663344;
          }
          if (4 == this.field_V.a(-31497)) {
            var8_int = 2895400;
          }
          if (this.field_V.a(-31497) == 5) {
            var8_int = 9054474;
          }
          if (param5 != 96) {
            var14 = (ml) null;
            this.a(106, (byte) -85, (ml) null, -35);
          }
          if (this.field_V.a(-31497) == 6) {
            var8_int = 15658734;
          }
          if (this.field_V.a(-31497) == 7) {
            var8_int = 1213580;
          }
          if (this.field_V.a(param5 ^ -31593) == 8) {
            var8_int = 15597806;
          }
          if (null != this.field_V.m((byte) 69)) {
            this.a(vn.field_c, (byte) -121, var8_int, ol.field_g);
            this.b(vn.field_c, -98, ol.field_g);
            this.c(ol.field_g, 0, vn.field_c);
            this.a(-8, vn.field_c, ol.field_g);
            var9_int = n.field_g.field_nb;
            var16 = this.field_V.e(param5 - 184);
            if (var16 != null) {
              var11_ref = (mi) (var16.b(12623));
              while (var11_ref != null) {
                ((mi) (var11_ref)).a(-ol.field_g + (var9_int >> 1), 41, -vn.field_c + (an.field_f >> 1));
                var11_ref = (mi) (var16.a(0));
              }
            }
            var17 = this.field_V.l((byte) 48);
            if (var17 != null &&
              0 == (jb.field_v & 16)) {
              var11_refLifetime3 = (mi) (var17.b(param5 + 12527));
              while (var11_refLifetime3 != null) {
                ((mi) (var11_refLifetime3)).a((var9_int >> 1) - ol.field_g, -108, -vn.field_c + (an.field_f >> 1));
                var11_refLifetime3 = (mi) (var17.a(0));
              }
            }
            this.a(ol.field_g, var8_int, 12224, vn.field_c);
            this.b(-113, param0);
          }
          if (param3 &&
            !this.field_V.n(param5 ^ 100) &&
            this.field_V.d(false) >= 0) {
            var9_intLifetime1 = nj.field_n[this.field_V.d(false)];
            if (this.field_y &&
              !this.field_V.a(true) &&
              this.field_z > 0 && (mj.field_p == -1 ||
              !(this.field_z >= this.field_V.f(12955)) ||
              mj.field_p == 6) && o.field_s == 0) {
              var10 = (this.field_z + 49) / 50;
              if (var10 > this.field_V.f(12955) / 50 && (this.field_V.field_x[this.field_V.d(false)] != 8 ||
                this.field_V.field_X[this.field_V.d(false)] == 0)) {
                var10 = this.field_V.f(param5 ^ 13051) / 50;
              }
              if (this.field_X) {
                var11_refLifetime1 = null;
                if (var10 < 60) {
                  var11_refLifetime1Lifetime1 = Integer.toString(var10);
                  var15 = var11_refLifetime1Lifetime1;
                  var11_refLifetime1Lifetime1 = var15;
                  var15Lifetime1 = var11_refLifetime1Lifetime1;
                  var11_refLifetime1Lifetime1 = var15Lifetime1;
                } else {
                  var12 = var10 % 60;
                  stackIn_73_0 = new StringBuilder().append(var10 / 60);
                  if (var12 < 10) {
                    stackIn_74_1 = ":0";
                  } else {
                    stackIn_74_1 = ":";
                  }
                  var11_refLifetime1Lifetime1 = ((StringBuilder) (Object) stackIn_73_0).append(stackIn_74_1).append(var12).toString();
                }
                var12Lifetime2 = an.field_f / 2;
                mi.field_B.b(co.field_i, var12Lifetime2, 16, var9_intLifetime1, -1);
                tj.field_t.b((String) (var11_refLifetime1Lifetime1), var12Lifetime2, 40, var9_intLifetime1, -1);
                de.d(5, 5, var12Lifetime2 - 48, 0, 96, 44);
                de.a(-48 + var12Lifetime2, 0, 96, 44, 0);
                de.a(-1 + var12Lifetime2 - 48, 0, 98, 45, 11768360);
                de.a(-50 + var12Lifetime2, 0, 100, 46, 8547138);
                de.a(var12Lifetime2 - 51, 0, 102, 47, 0);
                mi.field_B.b(co.field_i, -1 + var12Lifetime2, 16, 0, 0);
                mi.field_B.b(co.field_i, var12Lifetime2, 15, 0, 0);
                mi.field_B.b(co.field_i, var12Lifetime2, 16, var9_intLifetime1, -1);
                if (var11_refLifetime1Lifetime1 != null) {
                  tj.field_t.b((String) (var11_refLifetime1Lifetime1), -1 + var12Lifetime2, 40, 0, 0);
                  tj.field_t.b((String) (var11_refLifetime1Lifetime1), var12Lifetime2, 39, 0, 0);
                  tj.field_t.b((String) (var11_refLifetime1Lifetime1), var12Lifetime2, 40, var9_intLifetime1, -1);
                }
              }
            }
          }
          if (!this.field_V.n(param5 ^ 100)) {
            var9_intLifetime2 = -64 + n.field_g.field_nb - 10;
            for (var10Lifetime1 = 0; this.field_V.s(0) > var10Lifetime1; var10Lifetime1++) {
              L24: {
                if (this.field_I == var10Lifetime1) {
                  if ((1 << var10Lifetime1 & this.field_b) != 0) {
                    if (this.field_i) {
                      var11_refLifetime2 = mk.field_K;
                    } else {
                      var11_refLifetime2 = vi.field_R;
                    }
                  } else {
                    if ((1 << var10Lifetime1 & this.field_J) == 0) {
                      if (this.field_V.n(param5 - 92)) {
                        break L24;
                      }
                      if ((this.field_D & 1 << var10Lifetime1) == 0) {
                        break L24;
                      }
                      var11_refLifetime2 = nn.field_t;
                    } else {
                      var11_refLifetime2 = null;
                    }
                  }
                } else {
                  var15_ref = this.field_V.field_k[var10Lifetime1];
                  var11_refLifetime2 = var15_ref;
                  var11_refLifetime2 = var15_ref;
                  var11_refLifetime2 = var15_ref;
                  if ((this.field_a & 1 << var10Lifetime1) != 0) {
                    if (0 == (this.field_J & 1 << var10Lifetime1)) {
                      var11_refLifetime2 = null;
                    } else {
                      var11_refLifetime2 = null;
                    }
                  } else {
                    if ((this.field_b & 1 << var10Lifetime1) != 0) {
                      if (this.field_i) {
                        var11_refLifetime2 = tj.a(-69, new String[]{var15_ref}, pb.field_i);
                      } else {
                        var11_refLifetime2 = tj.a(param5 - 127, new String[]{var15_ref}, tj.field_y);
                      }
                    } else {
                      if ((this.field_J & 1 << var10Lifetime1) != 0) {
                        var11_refLifetime2 = null;
                      } else {
                        if (this.field_V.n(4)) {
                          break L24;
                        }
                        if ((this.field_D & 1 << var10Lifetime1) == 0) {
                          break L24;
                        }
                        var11_refLifetime2 = tj.a(-19, new String[]{var15_ref}, ph.field_d);
                      }
                    }
                  }
                }
                if (var11_refLifetime2 != null) {
                  var12Lifetime1 = -8 + an.field_f;
                  mi.field_B.c((String) (var11_refLifetime2), -1 + var12Lifetime1, var9_intLifetime2, 0, 0);
                  mi.field_B.c((String) (var11_refLifetime2), 1 + var12Lifetime1, var9_intLifetime2, 0, 0);
                  mi.field_B.c((String) (var11_refLifetime2), var12Lifetime1, var9_intLifetime2 - 1, 0, 0);
                  mi.field_B.c((String) (var11_refLifetime2), var12Lifetime1, var9_intLifetime2 + 1, 0, 0);
                  mi.field_B.c((String) (var11_refLifetime2), var12Lifetime1, var9_intLifetime2, 16777215, 0);
                  var9_intLifetime2 -= 14;
                }
              }
            }
          }
          if (!this.field_V.n(4)) {
          }
          var9 = (qa) (b.field_a.b(12623));
          if (var9 != null) {
            var11 = wi.field_h;
            if (var11 >= 80) {
              if (var11 < 230) {
                var10Lifetime2 = 8;
              } else {
                var10Lifetime2 = -(var11 / 2) + 123;
              }
            } else {
              var10Lifetime2 = var11 / 2 - 32;
            }
            mo.field_a[var9.field_n].c(8, var10Lifetime2, 32, 32);
            tj.field_t.a(rb.field_n[var9.field_n], 48, tj.field_t.field_C + var10Lifetime2, 0, -1);
          }
          if (jb.field_p) {
            if (null != this.field_V) {
              tj.field_t.a("Visible c-sum" + this.field_V.o(4), 64, 64, 16776960, 0);
            }
            if (null != this.field_w) {
              tj.field_t.a("Backup c-sum" + this.field_w.o(4), 64, 96, 65535, 0);
            }
          }
          sb.b(param5 ^ 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var8_ref), "le.LA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void k(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_85_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ml var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (vn.field_d == 84 &&
            this.field_B) {
            this.field_B = false;
            if (6 <= mj.field_p) {
              this.field_O = true;
            }
            rm.field_k = rm.field_k + 1;
          }
          if (td.e(true) &&
            ri.field_b[82] &&
            ri.field_b[86] &&
            vn.field_d == 12) {
            he.field_e.b((byte) -59, 67);
            he.field_e.a(0, (byte) -101);
            we.a(0, (byte) 113);
          }
          if ((!this.field_V.c((byte) 89) ||
            this.field_V.j(39)) &&
            !this.field_V.a(true)) {
            if (this.field_V.k(-75)) {
              stackIn_26_0 = 0;
            } else if (this.field_V.g(125)) {
              stackIn_26_0 = 0;
            } else if (1 < this.field_z) {
              stackIn_26_0 = 1;
            } else {
              stackIn_26_0 = 0;
            }
          } else {
            stackIn_26_0 = 0;
          }
          var2_int = stackIn_26_0;
          if (this.field_ab) {
            stackIn_32_0 = var2_int;
            if (!ef.field_r &&
              !pn.a((byte) 119) &&
              this.field_V.d(false) == this.field_I) {
              stackIn_33_1 = 1;
            } else {
              stackIn_33_1 = 0;
            }
            var2_int = stackIn_32_0 & stackIn_33_1;
          }
          if (param0 != 1) {
            this.field_g = true;
          }
          if (var2_int != 0) {
            var3 = n.field_g.field_nb;
            var4 = ol.field_g + (me.field_I - (var3 >> 1));
            if (this.field_u > 0) {
              var4 = this.field_c;
            }
            var5 = this.field_V.a(this.field_bb, true);
            if (vn.field_d != 84 &&
              vn.field_d != 82) {
              stackIn_47_0 = 0;
            } else {
              stackIn_47_0 = 1;
            }
            var6 = stackIn_47_0;
            if (vn.field_d != 85 &&
              vn.field_d != 81) {
              stackIn_53_0 = 0;
            } else {
              stackIn_53_0 = 1;
            }
            var7 = stackIn_53_0;
            if (var5 != null &&
              !this.field_V.j(39) &&
              this.field_G &&
              this.field_Z == 0) {
              stackIn_60_0 = 1;
            } else {
              stackIn_60_0 = 0;
            }
            var8 = stackIn_60_0;
            if (var6 != 0 &&
              var8 != 0 &&
              !this.field_O) {
              this.field_Z = 25;
              if (this.field_h > 0) {
                this.i(param0 + 1999);
              }
              if (this.field_ab) {
                stackIn_71_0 = this.field_V.n((byte) -75);
                if (var5.field_E != -1) {
                  stackIn_72_1 = 4;
                } else {
                  stackIn_72_1 = 2;
                }
                fieldTemp$0 = this.field_p + 1;
                this.field_p = this.field_p + 1;
                p.a(stackIn_71_0, stackIn_72_1, (byte) 11, 158, this.field_r, 1, this.field_bb, var4, fieldTemp$0);
              }
              var5.c(0, 2);
              this.field_m.a(-119, var5);
              ti.field_N = -1;
              eb.field_b = null;
            }
            if (var7 != 0 &&
              var8 != 0) {
              this.field_Z = 25;
              if (this.field_h > 0) {
                this.i(param0 ^ 2001);
              }
              if (this.field_ab) {
                stackIn_84_0 = this.field_V.n((byte) -75);
                if (-1 != var5.field_E) {
                  stackIn_85_1 = 5;
                } else {
                  stackIn_85_1 = 3;
                }
                fieldTemp$1 = this.field_p + 1;
                this.field_p = this.field_p + 1;
                p.a(stackIn_84_0, stackIn_85_1, (byte) 11, 158, this.field_r, 1, this.field_bb, var4, fieldTemp$1);
              }
              var5.c(param0 - 1, 3);
              this.field_m.a(-90, var5);
              ti.field_N = -1;
              eb.field_b = null;
            }
            if (vn.field_d == bg.field_c &&
              !this.field_O) {
              if (!this.field_ab) {
                this.d(false);
              } else {
                this.a(-113);
              }
            }
          }
          this.field_O = false;
          if (!this.field_ab &&
            qg.a(-79)) {
            vg.a((byte) 86);
          }
          if (13 != vn.field_d) {
            return;
          }
          var3Lifetime1 = 1;
          if (this.field_ab) {
            if (0 <= this.field_I &&
              null != this.field_V.a(this.field_I, true) &&
              (1 << this.field_I & this.field_J) == 0) {
              var3Lifetime1 = 2;
            } else {
              var3Lifetime1 = 4;
            }
          }
          var4Lifetime1 = var3Lifetime1;
          gj.a(false, true, var4Lifetime1, mn.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.J(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        boolean dupTemp$0 = false;
        boolean dupTemp$1 = false;
        boolean dupTemp$2 = false;
        boolean dupTemp$3 = false;
        boolean dupTemp$4 = false;
        boolean dupTemp$5 = false;
        boolean dupTemp$6 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        hl var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var3Lifetime1;
        var2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_ref = (hl) (this.field_cb.b(12623));
          if (param0 <= 26) {
            this.field_v = (int[]) null;
          }
          while (var2_ref != null) {
            var3 = 0;
            var4 = var2_ref.field_k;
            if (var4 == 61) {
              dupTemp$0 = this.b((byte) -116);
              var3Lifetime1 = dupTemp$0 ? 1 : 0;
              if (dupTemp$0) {
                this.a(5158, var2_ref.field_j);
              }
            } else {
              if (var4 != 65) {
                if (var4 != 66) {
                  if (var4 == 63) {
                    dupTemp$1 = this.l(-8712);
                    var3Lifetime1 = dupTemp$1 ? 1 : 0;
                    if (dupTemp$1) {
                      this.b(50, var2_ref.field_j);
                    }
                  } else {
                    if (var4 != 64) {
                      if (var4 == 62) {
                        dupTemp$2 = this.j(-27726);
                        var3Lifetime1 = dupTemp$2 ? 1 : 0;
                        if (dupTemp$2) {
                          this.a(var2_ref.field_j, jb.field_v - var2_ref.field_g, 8888);
                        }
                      } else {
                        if (var4 != 67) {
                          var6 = (String) null;
                          throw new RuntimeException((String) null);
                        }
                        dupTemp$3 = this.b(false);
                        var3Lifetime1 = dupTemp$3 ? 1 : 0;
                        if (dupTemp$3) {
                          this.b(var2_ref.field_j, -1);
                        }
                      }
                    } else {
                      dupTemp$4 = this.f(-126);
                      var3Lifetime1 = dupTemp$4 ? 1 : 0;
                      if (dupTemp$4) {
                        this.a((byte) 95, var2_ref.field_j);
                      }
                    }
                  }
                } else {
                  dupTemp$5 = this.f(false);
                  var3Lifetime1 = dupTemp$5 ? 1 : 0;
                  if (dupTemp$5) {
                    this.c(var2_ref.field_j, 55);
                  }
                }
              } else {
                dupTemp$6 = this.e(true);
                var3Lifetime1 = dupTemp$6 ? 1 : 0;
                if (dupTemp$6) {
                  this.a(var2_ref.field_j, -114);
                }
              }
            }
            if (var3Lifetime1 == 0) {
              return;
            }
            var2_ref.a(true);
            var2_ref = (hl) (this.field_cb.a(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref2), "le.I(" + param0 + ')');
        }
    }

    public static void f(byte param0) {
        try {
          field_E = null;
          field_db = null;
          field_A = null;
          int var1_int = -36 % ((param0 - 27) / 54);
          field_N = null;
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "le.EB(" + param0 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_111_3;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_118_3;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        int stackIn_143_3 = 0;
        int stackIn_143_4 = 0;
        int stackIn_146_0;
        int stackIn_146_1;
        int stackIn_146_2;
        int stackIn_146_3;
        int stackIn_146_4;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        int stackIn_147_4 = 0;
        int stackIn_147_5 = 0;
        ll[] stackIn_151_0 = null;
        ll[] stackIn_152_0 = null;
        ll[] stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ml var5_ref_ml = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        String var12 = null;
        String var10Lifetime1;
        String var10Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          kl.field_A = 320;
          this.field_H = true;
          this.field_B = false;
          this.field_X = true;
          this.field_g = true;
          mo.field_f = null;
          var3_int = n.field_g.field_nb;
          var4 = 0;
          if (this.field_I == this.field_V.d(false)) {
            var5_ref_ml = this.field_V.a(this.field_bb, true);
            if (var5_ref_ml != null &&
              null == var5_ref_ml.w(24501) &&
              var5_ref_ml.i((byte) -60) >= 128 + this.field_V.field_H) {
              var4 = 1;
              var6 = var5_ref_ml.m(-20357) / 2;
              if (var6 < 25) {
                var6 = 25;
              }
              var7 = var5_ref_ml.y(17571);
              if (this.field_V.a(4, var7, -770226943) <= 0) {
                var8 = var5_ref_ml.m(-20357) / 3;
                if (5 > var8) {
                  var8 = 5;
                }
                mo.field_f = in.field_Kb;
                if (var6 >= var5_ref_ml.m(-20357)) {
                  mo.field_f = ml.field_K;
                }
                mo.field_f = tj.a(-33, new String[]{Integer.toString(var6), Integer.toString(var8)}, mo.field_f);
                if (var8 >= var5_ref_ml.m(-20357)) {
                  if (!this.field_ab) {
                    this.d(false);
                  } else {
                    this.a(33);
                  }
                  mo.field_f = null;
                }
              } else {
                mo.field_f = ck.field_g;
                if (var5_ref_ml.m(-20357) <= var6) {
                  mo.field_f = bc.field_a;
                }
                mo.field_f = tj.a(-44, new String[]{Integer.toString(var6)}, mo.field_f);
              }
              kl.field_A = 270;
            }
          }
          if (qg.a(-114)) {
            jh.a(-3, var4 != 0);
          }
          if (this.field_H) {
            this.o(8);
          }
          ce.field_m.a(true);
          var5 = 0;
          var5 += 6;
          if (this.field_g) {
            var5 = this.a(var5, 0);
          }
          if (!this.field_V.field_d) {
            for (var6 = 0; var6 < this.field_V.s(0); var6++) {
              var5 = this.a(var5, (byte) -3, var6);
            }
          } else {
            for (var6 = 0; this.field_V.s(0) > var6; var6 += 2) {
              var5 = this.a(var5, (byte) -3, var6);
            }
            for (var6 = 1; this.field_V.s(0) > var6; var6 += 2) {
              var5 = this.a(var5, (byte) -3, var6);
            }
          }
          if (param0 > -112) {
            this.b(-71, -18, -117);
          }
          if (mf.field_g == -4) {
            mf.field_g = -1;
          }
          if (this.field_I >= 0 && (mj.field_p == -1 ||
            mj.field_p == 7) && (10 != this.field_V.field_x[this.field_I] &&
            this.field_I == this.field_bb)) {
            var6 = 30;
            var7Lifetime1 = -150 + (var3_int + ii.a((byte) -117));
            var8 = 0;
            if ((-var7Lifetime1 + me.field_I + 24) * (-var7Lifetime1 + (me.field_I + 24)) + (-var6 + an.field_g) * (-var6 + an.field_g) < 1296) {
              mf.field_g = -4;
              var8 = 1;
              var9 = 100;
              if (4 == this.field_V.field_x[this.field_I]) {
                var9 = this.field_V.field_X[this.field_I] / 5 * 5 + 5;
                if (this.field_V.field_X[this.field_I] > 0 &&
                  this.field_V.field_X[this.field_I] + 5 == var9) {
                  var9 = this.field_V.field_X[this.field_I];
                }
              }
              if (this.field_V.field_X[this.field_I] < var9) {
                if (hc.field_f) {
                  mo.field_f = vm.field_d[this.field_V.field_x[this.field_I] + 128 + 12];
                  if (this.field_V.field_x[this.field_I] == 8) {
                    mo.field_f = vm.field_d[156];
                  }
                  if (9 == this.field_V.field_x[this.field_I]) {
                    mo.field_f = vm.field_d[157];
                  }
                }
                if (this.field_V.a(this.field_V.d(false), true).m(-20357) <= 20) {
                  var8 = 0;
                  if (hc.field_f) {
                    mo.field_f = mo.field_f + hm.field_b;
                  }
                }
              } else {
                var8 = 0;
                if (hc.field_f) {
                  mo.field_f = vm.field_d[128 + (this.field_V.field_x[this.field_I] + 12)] + rc.field_i;
                  if (8 == this.field_V.field_x[this.field_I]) {
                    mo.field_f = vm.field_d[156] + rc.field_i;
                  }
                  if (this.field_V.field_x[this.field_I] == 9) {
                    mo.field_f = vm.field_d[157] + rc.field_i;
                  }
                }
              }
            }
            for (var9 = -20; var9 < 20; var9++) {
              de.h(0, 2 + (var7Lifetime1 + var9), an.field_f, 2 + (1 + var7Lifetime1 + var9));
              de.i(var6, 2 + (-(var9 / 2) + var7Lifetime1), 20, 0);
              de.h(0, -1 + (var9 + (var7Lifetime1 + 2)), an.field_f, var9 + (var7Lifetime1 + 2));
              stackIn_110_0 = var6;
              stackIn_110_1 = 2 - var9 / 2 + var7Lifetime1 - 1;
              stackIn_110_2 = 20;
              if (var8 == 0) {
                stackIn_111_3 = 7433831;
              } else {
                stackIn_111_3 = 13093320;
              }
              de.i(stackIn_110_0, stackIn_110_1, stackIn_110_2, stackIn_111_3);
            }
            for (var9 = -16; 16 > var9; var9++) {
              de.h(0, var9 + var7Lifetime1, an.field_f, var7Lifetime1 + (var9 + 1));
              de.i(var6, var7Lifetime1 - var9 / 2, 16, 0);
              de.h(0, -1 + var9 + var7Lifetime1, an.field_f, var9 + var7Lifetime1);
              stackIn_117_0 = var6;
              stackIn_117_1 = -1 + (-(var9 / 2) + var7Lifetime1);
              stackIn_117_2 = 16;
              if (var8 == 0) {
                stackIn_118_3 = 13093320;
              } else {
                stackIn_118_3 = 16777215;
              }
              de.i(stackIn_117_0, stackIn_117_1, stackIn_117_2, stackIn_118_3);
            }
            de.a();
            if (var8 == 0) {
              rm.field_o[this.field_V.field_x[this.field_I] + 1].b(var6 - 32, var7Lifetime1 - 48);
            } else {
              rm.field_o[this.field_V.field_x[this.field_I] + 1].b(-32 + var6, -48 + (var7Lifetime1 - (int)(4.0 * Math.sin((double)jb.field_v * 0.5) + 4.0)));
            }
            if (!(this.field_V.field_X[this.field_I] <= 0)) {
              var9 = this.field_V.field_X[this.field_I] / 20;
              if (this.field_V.field_x[this.field_I] == 4) {
                var9 = this.field_V.field_X[this.field_I] % 5;
                if (0 == var9 &&
                  0 < this.field_V.field_X[this.field_I]) {
                  var9 = 5;
                }
              }
              var12 = tj.a(120, new String[]{Integer.toString(var9)}, bk.field_H);
              var10 = var12;
              var10Lifetime2 = var12;
              var7Lifetime1 += 16;
              mi.field_B.b(var12, var6 - 1, var7Lifetime1, 0, 0);
              mi.field_B.b(var12, var6, -1 + var7Lifetime1, 0, 0);
              mi.field_B.b(var12, var6, var7Lifetime1, 16777215, -1);
            }
          }
          sb.a(param1, -58);
          if (null == mo.field_f) {
            this.d(-25343);
          }
          if (this.field_ab) {
            var6 = 22;
            var7Lifetime2 = -16 + (var3_int - 6);
            stackIn_143_0 = -16 + var6;
            stackIn_143_1 = var7Lifetime2 - 16;
            stackIn_143_2 = 32;
            stackIn_143_3 = 32;
            stackIn_143_4 = 15;
            if (vh.field_t > 0) {
              stackIn_146_0 = stackIn_143_0;
              stackIn_146_1 = stackIn_143_1;
              stackIn_146_2 = stackIn_143_2;
              stackIn_146_3 = stackIn_143_3;
              stackIn_146_4 = stackIn_143_4;
              if ((8 & jb.field_v) == 0) {
                stackIn_147_0 = stackIn_146_0;
                stackIn_147_1 = stackIn_146_1;
                stackIn_147_2 = stackIn_146_2;
                stackIn_147_3 = stackIn_146_3;
                stackIn_147_4 = stackIn_146_4;
                stackIn_147_5 = 16711935;
              } else {
                stackIn_147_0 = stackIn_143_0;
                stackIn_147_1 = stackIn_143_1;
                stackIn_147_2 = stackIn_143_2;
                stackIn_147_3 = stackIn_143_3;
                stackIn_147_4 = stackIn_143_4;
                stackIn_147_5 = 16744703;
              }
            } else {
              stackIn_147_0 = stackIn_143_0;
              stackIn_147_1 = stackIn_143_1;
              stackIn_147_2 = stackIn_143_2;
              stackIn_147_3 = stackIn_143_3;
              stackIn_147_4 = stackIn_143_4;
              stackIn_147_5 = 16777215;
            }
            de.g(stackIn_147_0, stackIn_147_1, stackIn_147_2, stackIn_147_3, stackIn_147_4, stackIn_147_5);
            de.a(var6 - 16, -16 + var7Lifetime2, 32, 32, 15, 0);
            stackIn_152_0 = tg.field_b;
            if (0 >= vh.field_t) {
              stackIn_153_0 = stackIn_152_0;
              stackIn_153_1 = 9;
            } else {
              stackIn_151_0 = stackIn_152_0;
              if ((jb.field_v & 8) != 0) {
                stackIn_153_0 = stackIn_151_0;
                stackIn_153_1 = 11;
              } else {
                stackIn_153_0 = stackIn_152_0;
                stackIn_153_1 = 10;
              }
            }
            ((ll) (Object) stackIn_153_0[stackIn_153_1]).a(var6 - 16, var7Lifetime2 - 16);
            var8 = var6 - an.field_g;
            var9 = -me.field_I + var7Lifetime2;
            if (var8 * var8 + var9 * var9 < 256) {
              if (!param1) {
                return;
              }
              de.c(var6, var7Lifetime2, 16, 16777215, 128);
              mf.field_g = -3;
              var10Lifetime1 = rm.field_a;
              if (!ao.field_d) {
                if (1 >= vh.field_t) {
                  if (vh.field_t != 1) {
                    var10Lifetime1 = bm.field_b;
                  } else {
                    var10Lifetime1 = am.field_a;
                  }
                } else {
                  var10Lifetime1 = tj.a(120, new String[]{Integer.toString(vh.field_t)}, ig.field_d);
                }
              }
              mi.field_B.a(var10Lifetime1, 5 + var6, var7Lifetime2 - 1, 0, 0);
              mi.field_B.a(var10Lifetime1, 4 + var6, var7Lifetime2, 0, 0);
              mi.field_B.a(var10Lifetime1, 5 + (var6 + 1), var7Lifetime2, 0, 0);
              mi.field_B.a(var10Lifetime1, var6 + 5, var7Lifetime2 + 1, 0, 0);
              mi.field_B.a(var10Lifetime1, var6 + 5, var7Lifetime2, 16777215, 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "le.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        ml var6_ref_ml = null;
        int var7 = 0;
        int var5Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 50;
          var4 = param1;
          for (var5 = 0; this.field_V.s(0) > var5; var5++) {
            var6_ref_ml = this.field_V.a(var5, true);
            if (var6_ref_ml != null) {
              if (var6_ref_ml.m(-20357) > var3_int) {
                var3_int = var6_ref_ml.m(-20357);
              }
              if (var4 < mi.field_B.b(this.field_V.field_k[var5])) {
                var4 = mi.field_B.b(this.field_V.field_k[var5]);
              }
            }
          }
          if (!this.field_V.field_d) {
            for (var5Lifetime1 = 0; var5Lifetime1 < this.field_V.s(0); var5Lifetime1++) {
              param0 = this.b(param0, var4, var5Lifetime1, param1 - 4);
            }
          } else {
            for (var5Lifetime1 = 0; this.field_V.s(0) > var5Lifetime1; var5Lifetime1 += 2) {
              param0 = this.b(param0, var4, var5Lifetime1, -4);
            }
            var5_ref_String = sb.field_c;
            var6 = 16777215;
            mi.field_B.b(var5_ref_String, 23 + (12 + var4 / 2), mi.field_B.field_C / 2 + (8 + param0), 8421504 ^ (8421504 | var6), 0);
            mi.field_B.b(var5_ref_String, 12 + (var4 / 2 + 24), -1 + (mi.field_B.field_C / 2 + param0 + 8), 8421504 ^ (var6 | 8421504), 0);
            mi.field_B.b(var5_ref_String, 36 + var4 / 2, mi.field_B.field_C / 2 + (param0 + 8), var6, -1);
            param0 += 20;
            for (var5Lifetime1 = 1; this.field_V.s(0) > var5Lifetime1; var5Lifetime1 += 2) {
              param0 = this.b(param0, var4, var5Lifetime1, -4);
            }
          }
          stackIn_26_0 = param0;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "le.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void o(int param0) {
        int var17 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        vn var8 = null;
        ml var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var11_int = 0;
        int[] var12 = null;
        int var12_int = 0;
        int[] var13 = null;
        int var14 = 0;
        String var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        ml var9Lifetime1;
        ml var9Lifetime1Lifetime1;
        ml var9Lifetime1Lifetime2;
        int var2_intLifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15_intLifetime1;
        int var10Lifetime1;
        int var2_intLifetime1Lifetime1;
        var17 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (null != this.field_V.m((byte) 69)) {
            stackIn_7_0 = nj.field_n;
            if (0 > this.field_I) {
              stackIn_8_1 = 6;
            } else {
              stackIn_8_1 = this.field_I;
            }
            var2_int = stackIn_7_0[stackIn_8_1];
            this.field_K = 4;
            var3 = this.field_V.field_y >> this.field_K;
            var4 = this.field_V.field_H >> this.field_K;
            var5 = an.field_j;
            if (an.field_f > 8 + (var3 + 640)) {
              if (640 + 2 * var3 + 8 <= an.field_f) {
                this.field_K = 3;
                var3 = this.field_V.field_y >> this.field_K;
                var4 = this.field_V.field_H >> this.field_K;
              }
            } else {
              var5 = n.field_g.field_nb;
            }
            var6 = 5;
            var7 = 1;
            de.a(-var7 - var6 - var3 + an.field_f, -var7 + (-var6 - var4 + var5), var3 + 2 * var7, var7 * 2 + var4, 4799269);
            var7++;
            de.a(-var7 - var6 + (-var3 + an.field_f), -var4 + (var5 + (-var6 - var7)), var3 + var7 * 2, 2 * var7 + var4, 8547138);
            var7++;
            de.a(-var7 - var6 + (-var3 + an.field_f), var5 - (var4 - (-var6 - var7)), var3 + 2 * var7, var4 + var7 * 2, 11768360);
            var7++;
            de.a(-var7 + (-var3 + an.field_f - var6), -var7 - var6 + (var5 - var4), var3 + var7 * 2, var4 + var7 * 2, 0);
            var7++;
            de.h(an.field_f - (var3 + var6), -var4 + (var5 - var6), -var6 + an.field_f, -var6 + var5);
            de.c(-var6 - var3 + an.field_f, var5 - (var4 + var6), var3, var4, nb.field_a, cg.field_Lb);
            this.field_V.m((byte) 69).b(-var6 + (-var3 + an.field_f), -var4 + var5 - var6, var3, var4);
            de.f(an.field_f - var3 - (var6 - (-(an.field_f >> 1) + vn.field_c >> this.field_K)), (ol.field_g - (var5 >> 1) >> this.field_K) + var5 + (-var4 - var6), an.field_f >> this.field_K, var5 >> this.field_K, 16777215, 128);
            var8 = this.field_V.g((byte) 61);
            if (var8 != null &&
              !var8.b(true)) {
              var9 = (ml) (var8.a(true));
              while (var9 != null) {
                if (null != var9 &&
                  var9.o(-22625) != 12) {
                  var2_intLifetime1 = 0;
                  var10 = var9.g(false);
                  var2_intLifetime1 = nj.field_n[var10];
                  var11_int = an.field_f + (-var3 - var6) + (var9.f(-99) >> this.field_K);
                  var12_int = var5 - (var4 + var6 - (var9.i((byte) 110) - (var9.p(param0 - 8331) >> 1) >> this.field_K));
                  de.i(var11_int, var12_int, 14 + (var9.p(-8323) >> 1) >> this.field_K, (var2_intLifetime1 | 8421504) ^ 8421504);
                  de.i(var11_int, var12_int, var9.p(param0 - 8331) >> 1 >> this.field_K, var2_intLifetime1);
                  de.c(var11_int, var12_int, 14 + (var9.p(-8323) >> 1) >> this.field_K, 8421504 ^ (var2_intLifetime1 | 8421504));
                  gn.a(14 + (var9.p(-8323) >> 1) >> this.field_K, (byte) 72, 255, var11_int, var12_int);
                  if (var9.y(param0 + 17563) == this.field_V.d(false)) {
                    if (this.field_K == 4) {
                      tg.field_b[3].b(-3 + var11_int, var12_int - (var9.p(-8323) >> this.field_K + 1) - 8);
                    }
                    if (this.field_K == 2) {
                      tg.field_b[6].a(var11_int - 16, 8 + var12_int);
                    }
                  }
                }
                var9 = (ml) (var8.b((byte) 53));
              }
              if (this.field_K != 2) {
                de.a();
              } else {
                i.b(90);
                ti.field_N = -1;
                eb.field_b = null;
                var10Lifetime1 = this.field_V.s(param0 ^ 8);
                var22 = new int[var10Lifetime1];
                var19 = var22;
                var11 = var19;
                var21 = new int[var10Lifetime1];
                var18 = var21;
                var12 = var18;
                var23 = new int[var10Lifetime1];
                var20 = var23;
                var13 = var20;
                var9Lifetime1 = (ml) (var8.b(12623));
                while (var9Lifetime1 != null) {
                  if (var9Lifetime1.o(-22625) != 12 &&
                    null == var9Lifetime1.w(24501)) {
                    var14 = var9Lifetime1.y(param0 ^ 17579);
                    var11[var14] = -var6 + an.field_f - var3 + (var9Lifetime1.f(-85) >> this.field_K);
                    var12[var14] = -var6 - var4 + (var5 - 8);
                    var13[var14] = mi.field_B.b(this.field_V.field_k[var14]);
                    for (var15_int = 0; var15_int < var14; var15_int++) {
                      if (var21[var15_int] != 0 &&
                        Math.abs(var22[var15_int] - var22[var14]) < 4 + (var23[var14] + var23[var15_int]) / 2 &&
                        var21[var14] >= var21[var15_int]) {
                        var12[var14] = var21[var15_int] - mi.field_B.field_C;
                      }
                    }
                  }
                  var9Lifetime1 = (ml) (var8.a(0));
                }
                de.h(-var6 + (-var3 + an.field_f), 0, -var6 + an.field_f, -var6 + var5);
                var9Lifetime1Lifetime1 = (ml) (var8.b(param0 + 12615));
                while (var9Lifetime1Lifetime1 != null) {
                  if (var9Lifetime1Lifetime1.o(-22625) != 12 &&
                    null == var9Lifetime1Lifetime1.w(24501)) {
                    var2_intLifetime1Lifetime1 = 0;
                    var14Lifetime1 = var9Lifetime1Lifetime1.y(17571);
                    var2_intLifetime1Lifetime1 = nj.field_n[var14Lifetime1];
                    var15_intLifetime1 = var9Lifetime1Lifetime1.i((byte) -39);
                    var16 = var9Lifetime1Lifetime1.p(-8323);
                    de.d(var22[var14Lifetime1], var21[var14Lifetime1] - 1, -var6 + (var5 - var4) + ((var15_intLifetime1 - var16 >> this.field_K) - var21[var14Lifetime1]), var2_intLifetime1Lifetime1);
                    de.d(var22[var14Lifetime1] - 1, var21[var14Lifetime1] - 2, (var15_intLifetime1 - var16 >> this.field_K) + var5 + (-var4 + (-var6 - var21[var14Lifetime1])), 8421504 ^ (8421504 | var2_intLifetime1Lifetime1));
                    de.d(1 + var22[var14Lifetime1], -2 + var21[var14Lifetime1], -var6 - var4 + var5 + (-var16 + var15_intLifetime1 >> this.field_K) - var21[var14Lifetime1], (var2_intLifetime1Lifetime1 | 8421504) ^ 8421504);
                  }
                  var9Lifetime1Lifetime1 = (ml) (var8.a(0));
                }
                de.a();
                var9Lifetime1Lifetime2 = (ml) (var8.b(12623));
                while (var9Lifetime1Lifetime2 != null) {
                  if (12 != var9Lifetime1Lifetime2.o(-22625) &&
                    var9Lifetime1Lifetime2.w(param0 + 24493) == null) {
                    var2_intLifetime1Lifetime1 = 0;
                    var14Lifetime2 = var9Lifetime1Lifetime2.y(17571);
                    var2_intLifetime1Lifetime1 = nj.field_n[var14Lifetime2];
                    var15 = this.field_V.field_k[var14Lifetime2];
                    mi.field_B.b(var15, var22[var14Lifetime2], var21[var14Lifetime2] - 1, (var2_intLifetime1Lifetime1 | 8421504) ^ 8421504, 0);
                    mi.field_B.b(var15, -1 + var22[var14Lifetime2], var21[var14Lifetime2], 8421504 ^ (8421504 | var2_intLifetime1Lifetime1), 0);
                    mi.field_B.b(var15, var22[var14Lifetime2], var21[var14Lifetime2], var2_intLifetime1Lifetime1, -1);
                  }
                  var9Lifetime1Lifetime2 = (ml) (var8.a(param0 ^ 8));
                }
              }
            }
            de.a();
          }
          if (param0 != 8) {
            this.field_G = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.O(" + param0 + ')');
        }
    }

    final static void c(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (kh.field_c != null) {
            fk.a(0, kh.field_c);
          }
          if (eo.field_c != null) {
            eo.field_c.a(param0 ^ -22718, param1);
          }
          ji.a(param1, (byte) -101);
          if (db.field_a != null) {
            db.field_a.a(param1, true);
          }
          ed.a((byte) 90, param1);
          if (param0 != 1) {
            field_A = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_25_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_194_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        qb var9 = null;
        int var9_int = 0;
        int var10 = 0;
        qb var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        int var9_intLifetime4;
        int var10Lifetime1;
        int var11_intLifetime1;
        int var11_intLifetime2;
        int var11_intLifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var14Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var9_intLifetime3Lifetime1;
        int var9_intLifetime3Lifetime2;
        int var11_intLifetime2Lifetime1;
        int var12Lifetime2Lifetime1;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5 = -120 / ((param0 - 58) / 53);
          var4_int = n.field_g.field_nb;
          if (ti.field_N >= 0 &&
            ti.field_N != -1 &&
            null == eb.field_b) {
            var6_int = rd.field_e[ti.field_N];
            if (1 == var6_int &&
              this.field_s == -1000 &&
              !this.field_V.c((byte) 89)) {
              var7 = an.field_g;
              var8 = me.field_I;
              tg.field_b[5].b().a(var7, var8, this.field_P << 8, 4096 - Math.abs(this.field_P - 128));
            }
          }
          if (this.field_V.d(false) != this.field_I &&
            this.field_ab) {
            return;
          }
          var6 = this.field_V.a(this.field_bb, true);
          if (var6 != null) {
            boolean decompiledFrameRemainder0 = true;
            var7Lifetime1 = var6.f(-98);
            var8Lifetime1 = var6.i((byte) -5);
            if (this.field_s != -1000) {
              if (ti.field_N == 78) {
                var9_int = -(go.field_j[29].field_g / 2) + ((an.field_f >> 1) + (this.field_s - param1));
                var10 = (var4_int >> 1) + this.field_r - param2 - go.field_j[29].field_k;
                if (!this.field_V.a(var6, this.field_r, this.field_s, -5)) {
                  go.field_j[29].b().a(var9_int, var10, 16711680);
                }
                go.field_j[29].a(var9_int, var10, 64);
                return;
              }
              if (ti.field_N == 4) {
                var9_intLifetime1 = var6.p(-8323);
                stackIn_152_0 = (this.field_V.b(this.field_s, var6, -16, this.field_r)) ? 65280 : 16711680;
                var10Lifetime2 = stackIn_152_0;
                ce.field_m.a(true);
                de.h(-param1 + (an.field_f >> 1), (var4_int >> 1) - param2, (an.field_f >> 1) + (-param1 + this.field_V.field_y), this.field_V.field_H - param2 + (var4_int >> 1));
                de.a();
                var11_int = -param1 + (this.field_s + (an.field_f >> 1));
                var12 = -param2 + (this.field_r + ((var4_int >> 1) - (var9_intLifetime1 >> 1)));
                de.c(var11_int, var12, var9_intLifetime1 >> 1, var10Lifetime2, 128);
                gn.a(var9_intLifetime1 >> 1, (byte) 100, 128 + Math.abs(-16 + (this.field_P & 31)) * 3, var11_int, var12);
                if (this.field_V.c((byte) 89)) {
                  return;
                }
                tg.field_b[5].b().a(var11_int, var12, this.field_P << 8, var9_intLifetime1 * (4096 - 64 * Math.abs((this.field_P & 31) - 16)) / 32);
                return;
              }
              if (ti.field_N == 150) {
                var9_intLifetime2 = var6.p(-8323);
                stackIn_25_0 = (this.field_V.a(this.field_s, this.field_V.field_H - 16, (byte) -75, var6)) ? 65280 : 16711680;
                var10Lifetime3 = stackIn_25_0;
                ce.field_m.a(true);
                de.h((an.field_f >> 1) - param1, (var4_int >> 1) - param2, this.field_V.field_y - param1 + (an.field_f >> 1), (var4_int >> 1) + (this.field_V.field_H - param2));
                de.a();
                var11_intLifetime1 = (an.field_f >> 1) + (this.field_s - param1);
                var12Lifetime1 = (var4_int >> 1) - param2 + this.field_V.field_H + (-16 - (var9_intLifetime2 >> 1));
                de.c(var11_intLifetime1, var12Lifetime1, var9_intLifetime2 >> 1, var10Lifetime3, 128);
                gn.a(var9_intLifetime2 >> 1, (byte) 78, 3 * Math.abs(-16 + (this.field_P & 31)) + 128, var11_intLifetime1, var12Lifetime1);
                if (this.field_V.c((byte) 89)) {
                  return;
                }
                tg.field_b[5].b().a(var11_intLifetime1, var12Lifetime1, this.field_P << 8, var9_intLifetime2 * (-(Math.abs((this.field_P & 31) - 16) * 64) + 4096) / 32);
                return;
              }
              if (ti.field_N != 56 &&
                ti.field_N != 57 &&
                ti.field_N != 32 &&
                33 != ti.field_N &&
                ti.field_N != 42 &&
                ti.field_N != 17 &&
                ti.field_N != 23 &&
                ti.field_N != 59 &&
                ti.field_N != 47 &&
                ti.field_N != 65 &&
                ti.field_N != 67 &&
                ti.field_N != 64 &&
                ti.field_N != 44 &&
                ti.field_N != 76 &&
                ti.field_N != 77 &&
                ti.field_N != 6 &&
                79 != ti.field_N &&
                ti.field_N != 98 &&
                ti.field_N != 90 &&
                ti.field_N != 104 &&
                ti.field_N != 92 &&
                107 != ti.field_N &&
                112 != ti.field_N &&
                ti.field_N != 118) {
                if (9 == ti.field_N) {
                  stackIn_57_0 = (this.field_V.a(false, this.field_s, this.field_r)) ? 65280 : 16711680;
                  var9_intLifetime3 = stackIn_57_0;
                  ce.field_m.a(true);
                  var10Lifetime4 = 32;
                  var11_intLifetime2 = (an.field_f >> 1) + (-param1 + this.field_s);
                  var12Lifetime2 = -(var10Lifetime4 >> 1) + (-param2 + this.field_r + (var4_int >> 1));
                  de.c(var11_intLifetime2, var12Lifetime2, var10Lifetime4 >> 1, var9_intLifetime3, 128);
                  gn.a(var10Lifetime4 >> 1, (byte) 94, Math.abs((31 & this.field_P) - 16) * 3 + 128, var11_intLifetime2, var12Lifetime2);
                  if (this.field_V.c((byte) 89)) {
                    return;
                  }
                  tg.field_b[5].b().a(var11_intLifetime2, var12Lifetime2, this.field_P << 8, (4096 - 64 * Math.abs((this.field_P & 31) - 16)) * var10Lifetime4 / 32);
                  return;
                }
                if (ti.field_N != 5) {
                  if (ti.field_N == 30) {
                    stackIn_77_0 = (this.field_V.a(this.field_s, var6, 30882, this.field_r)) ? 65280 : 16711680;
                    var9_intLifetime3Lifetime1 = stackIn_77_0;
                    bg.field_e.a(-(bg.field_e.field_n >> 1) + ((an.field_f >> 1) - param1 + this.field_s), (var4_int >> 1) + (-param2 + (this.field_r - bg.field_e.field_w)), var9_intLifetime3Lifetime1);
                    bg.field_e.c(-param1 + this.field_s + (an.field_f >> 1) - (bg.field_e.field_n >> 1), -bg.field_e.field_w + (this.field_r - (param2 - (var4_int >> 1))), 128);
                    return;
                  }
                  decompiledFrameRemainder0 = (ti.field_N != -1);
                  if (decompiledFrameRemainder0) {
                    var9_intLifetime3Lifetime1 = -param1 + this.field_s + (an.field_f >> 1);
                    var10Lifetime4 = -param2 + this.field_r + (var4_int >> 1);
                    tg.field_b[5].b().a(var9_intLifetime3Lifetime1, var10Lifetime4, this.field_P << 8, -Math.abs(-128 + this.field_P) + 4096);
                    return;
                  }
                }
                if (decompiledFrameRemainder0) {
                  boolean decompiledFrameRemainder1 = true;
                  if (this.field_V.a(false, this.field_s, this.field_r) &&
                    this.field_V.a(false, var6.f(100), -32 + var6.i((byte) -65) - var6.p(-8323))) {
                    stackIn_66_0 = 65280;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    stackIn_66_0 = 16711680;
                  }
                  var9_intLifetime3Lifetime2 = stackIn_66_0;
                  ce.field_m.a(true);
                  var10Lifetime4 = 32;
                  var11_intLifetime2Lifetime1 = (an.field_f >> 1) - param1 + var7Lifetime1;
                  var12Lifetime2Lifetime1 = (var4_int >> 1) + var8Lifetime1 - param2 - (var6.p(-8323) + 32);
                  de.c(var11_intLifetime2Lifetime1, var12Lifetime2Lifetime1, var10Lifetime4 >> 1, var9_intLifetime3Lifetime2, 128);
                  gn.a(var10Lifetime4 >> 1, (byte) 63, 128 + 3 * Math.abs((this.field_P & 31) - 16), var11_intLifetime2Lifetime1, var12Lifetime2Lifetime1);
                  var13 = this.field_s - param1 + (an.field_f >> 1);
                  var14 = (var4_int >> 1) + (this.field_r - param2) - (var10Lifetime4 >> 1);
                  de.c(var13, var14, var10Lifetime4 >> 1, var9_intLifetime3Lifetime2, 128);
                  gn.a(var10Lifetime4 >> 1, (byte) 125, 128 + Math.abs(-16 + (this.field_P & 31)) * 3, var13, var14);
                  if (this.field_V.c((byte) 89)) {
                    return;
                  }
                  tg.field_b[5].b().a(var13, var14, this.field_P << 8, (4096 - 64 * Math.abs((this.field_P & 31) - 16)) * var10Lifetime4 / 32);
                  return;
                }
              }
              if (decompiledFrameRemainder0) {
                var9_intLifetime4 = 32;
                if (ti.field_N == 4) {
                  var9_intLifetime4 = var6.p(-8323);
                }
                if (ti.field_N == 57) {
                  var9_intLifetime4 = 64;
                }
                if (ti.field_N == 33) {
                  var9_intLifetime4 = 64;
                }
                if (ti.field_N == 42) {
                  var9_intLifetime4 = 64;
                }
                if (ti.field_N == 23) {
                  var9_intLifetime4 = 100;
                }
                if (ti.field_N == 59) {
                  var9_intLifetime4 = 100;
                }
                if (ti.field_N == 47) {
                  var9_intLifetime4 = 100;
                }
                if (ti.field_N == 65) {
                  var9_intLifetime4 = 48;
                }
                if (67 == ti.field_N) {
                  var9_intLifetime4 = 48;
                }
                if (ti.field_N == 76) {
                  var9_intLifetime4 = 80;
                }
                if (ti.field_N == 77) {
                  var9_intLifetime4 = 48;
                }
                if (ti.field_N == 6) {
                  var9_intLifetime4 = 96;
                }
                if (ti.field_N == 79) {
                  var9_intLifetime4 = 96;
                }
                if (98 == ti.field_N) {
                  var9_intLifetime4 = 96;
                }
                if (ti.field_N == 90) {
                  var9_intLifetime4 = 64;
                }
                if (ti.field_N == 107) {
                  var9_intLifetime4 = 128;
                }
                if (ti.field_N == 104) {
                  var9_intLifetime4 = 32;
                }
                if (ti.field_N == 92) {
                  var9_intLifetime4 = 96;
                }
                if (ti.field_N == 118) {
                  var9_intLifetime4 = 100;
                }
                stackIn_144_0 = (this.field_V.a(false, var6, ti.field_N, this.field_r, this.field_s)) ? 65280 : 16711680;
                var10Lifetime5 = stackIn_144_0;
                ce.field_m.a(true);
                de.h(-param1 + (an.field_f >> 1), -param2 + (var4_int >> 1), (an.field_f >> 1) + (-param1 + this.field_V.field_y), (var4_int >> 1) + (-param2 + this.field_V.field_H));
                var11_intLifetime3 = -param1 + (var7Lifetime1 + (an.field_f >> 1));
                var12Lifetime3 = (var4_int >> 1) + var8Lifetime1 + (-param2 - (var9_intLifetime4 >> 1));
                gn.a((var9_intLifetime4 >> 1) + 128, (byte) 88, -(128 + Math.abs(-16 + (31 & this.field_P)) * 3), var11_intLifetime3, var12Lifetime3);
                de.a();
                var13Lifetime1 = (an.field_f >> 1) + this.field_s - param1;
                var14Lifetime1 = -(var9_intLifetime4 >> 1) + ((var4_int >> 1) + (-param2 + this.field_r));
                de.c(var13Lifetime1, var14Lifetime1, var9_intLifetime4 >> 1, var10Lifetime5, 128);
                gn.a(var9_intLifetime4 >> 1, (byte) 73, Math.abs(-16 + (31 & this.field_P)) * 3 + 128, var13Lifetime1, var14Lifetime1);
                if (this.field_V.c((byte) 89)) {
                  return;
                }
                tg.field_b[5].b().a(var13Lifetime1, var14Lifetime1, this.field_P << 8, var9_intLifetime4 * (4096 - 64 * Math.abs(-16 + (this.field_P & 31))) / 32);
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              if (ti.field_N != 2 &&
                ti.field_N != 81 &&
                ti.field_N != 31 &&
                ti.field_N != 60 &&
                ti.field_N != 55 &&
                91 != ti.field_N &&
                ti.field_N != 114) {
                return;
              }
              var9 = uj.field_i[0];
              if (55 == ti.field_N) {
                var9 = uj.field_i[1];
              }
              if (ti.field_N == 31) {
                var9 = uj.field_i[2];
              }
              if (ti.field_N == 60) {
                var9 = uj.field_i[3];
              }
              if (81 == ti.field_N) {
                var9 = uj.field_i[4];
              }
              if (ti.field_N == 91) {
                var9 = uj.field_i[5];
              }
              if (114 == ti.field_N) {
                var9 = uj.field_i[6];
              }
              stackIn_194_0 = (!this.field_V.a(ti.field_N, var6.i((byte) 116), var6, (byte) 91, var6.f(45))) ? 16711680 : 65280;
              var10Lifetime1 = stackIn_194_0;
              var11 = new qb(16 + var9.field_n, 16 + var9.field_w);
              var11.a();
              var9.a(8, 8, var10Lifetime1);
              de.d(5, 5, 0, 0, var11.field_n, var11.field_w);
              ce.field_m.a(true);
              var11.b(-param1 + (-(var9.field_n / 2) + var7Lifetime1 + (an.field_f >> 1) - 8), var8Lifetime1 + (-var9.field_w + (-param2 + (var4_int >> 1)) - 8), 256);
              var9.a((an.field_f >> 1) + var7Lifetime1 + (-(var9.field_n / 2) - param1), (var4_int >> 1) + (var8Lifetime1 - var9.field_w - param2), var10Lifetime1);
              var9.c(-param1 + (var7Lifetime1 - var9.field_n / 2 + (an.field_f >> 1)), -param2 + var8Lifetime1 - (var9.field_w - (var4_int >> 1)), 128);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "le.AB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean f(boolean param0) {
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            this.field_n = -11;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o && (this.r(-87) ||
            this.field_k)) {
            stackIn_9_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = false;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.QA(" + param0 + ')');
        }
    }

    final boolean e(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -75) {
            this.g(66);
          }
          stackIn_3_0 = this.a(df.field_z, on.field_g, 0, fj.field_h);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.OB(" + param0 + ')');
        }
    }

    private final boolean b(boolean param0) {
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o && (this.r(-40) ||
            this.field_k)) {
            stackIn_10_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_10_0 = false;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.B(" + param0 + ')');
        }
    }

    final void m(int param0) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ij.field_Tb == null) {
            ij.field_Tb = new qb(640, 480);
          }
          ij.field_Tb.a();
          var2_int = wm.a(this.field_V.a(-31497), (byte) -124);
          var3 = ng.b((byte) -124, this.field_V.a(-31497));
          nb.field_a = var2_int;
          cg.field_Lb = var3;
          de.c(0, 0, 640, 480, var2_int, var3);
          if (null == e.field_M[this.field_V.a(-31497)]) {
            ue.field_d.field_f = 0;
            af.a(tj.a(115, new String[]{Integer.toString(this.field_V.a(-31497))}, "background<%0>"), "", 19412, ue.field_d).b(0, 0, 640, 480);
          }
          if (param0 != 413355681) {
            this.field_S = 49;
          }
          de.d(2, 2, 0, 0, 640, 480);
          for (var4 = 0; var4 < ij.field_Tb.field_A.length; var4++) {
            if (ij.field_Tb.field_A[var4] == 0) {
              ij.field_Tb.field_A[var4] = 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.F(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        vn var5 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ml var6 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 > -50) {
            this.field_p = -101;
          }
          var4_int = n.field_g.field_nb;
          var5 = this.field_V.g((byte) 115);
          if (var5 != null) {
            var6 = (ml) (var5.b(12623));
            while (var6 != null) {
              var6.a(2, -param2 + (var4_int >> 1), (an.field_f >> 1) - param0);
              var6 = (ml) (var5.a(0));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "le.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, ml param1) {
        int var15 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != -7) {
            return;
          }
          var3_int = n.field_g.field_nb;
          var4 = -(an.field_f >> 1) + (vn.field_c + an.field_g);
          var5 = -(var3_int >> 1) + ol.field_g + me.field_I;
          if (this.field_u > 0) {
            var5 = this.field_c;
            var4 = this.field_e;
          }
          var6 = param1.f(45);
          var7 = param1.i((byte) 114);
          var8 = param1.p(-8323);
          var9 = -var6 + var4;
          var10 = (var8 >> 1) - var7 + var5;
          var11 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
          if (0 == var11) {
            var10 = -1;
            var11 = 1;
          }
          if (!this.field_V.a(true)) {
            if (var9 <= 0) {
              param1.field_E = -1;
            } else {
              param1.field_E = 1;
            }
            if (ti.field_N == 155 &&
              Math.abs(var9) < Math.abs(var10)) {
              var9 = param1.field_E * 64;
              var10 = (var10 < 0) ? -64 : 64;
              var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
              if (var11 == 0) {
                var11 = 1;
                var10 = -1;
              }
            }
            var12 = param1.p(param0 ^ 8324) / 2;
            for (var15 = 0; 100 > var15; var15++) {
              var16 = var12 + var15 / 4;
              var14 = -var12 + var10 * var16 / var11;
              var13 = var16 * var9 / var11;
              var17 = 0;
              if (var15 >= 25) {
                var17 = var17 | 16711680;
                if (var15 >= 75) {
                  var17 = var17 | 65280;
                  if (var15 >= 100) {
                    var17 = var17 | 255;
                  } else {
                    var17 = var17 | 10 * var15 - 750 & 255;
                  }
                } else {
                  var17 = var17 | (255 & -125 + var15 * 5) << 8;
                }
              } else {
                var17 = var17 | (255 & var15 * 10) << 16;
              }
              if (10 >= var15) {
                de.c((an.field_f >> 1) + (var13 + var6 - vn.field_c), var14 + var7 - (ol.field_g - (var3_int >> 1)), 1600 / (200 - var15 * 100 / 100), var17, var15);
              } else {
                de.c((an.field_f >> 1) + var6 - (-var13 + vn.field_c), (var3_int >> 1) + var14 + var7 - ol.field_g, 1600 / (200 - var15 * 100 / 100), var17, 10);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("le.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static qb[] a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        qb[] stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            field_E = (kc) null;
          }
          stackIn_3_0 = th.a(param4, 1, 3, param0, param2 - 32574, param3, 1, 1, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "le.MB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0) {
        try {
          int var2_int = -52 / ((-45 - param0) / 63);
          he.field_e.b((byte) -78, 63);
          he.field_e.f(this.field_V.n((byte) -75), (byte) -10);
          this.field_V.e(true);
          this.field_w.e(true);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "le.SA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
        try {
          this.field_f = new ge(this.field_I, param3, param1, param4, param6, param7, param0, param8);
          this.field_W = param2;
          this.field_x = 50;
          if (param5 != -30) {
            this.field_r = 83;
          }
          ob.a(20, this.field_f, param2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "le.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = n.field_g.field_nb;
          var3 = 16777215;
          if (0 < this.field_V.field_G) {
            var3 = 16711680;
          }
          de.e((an.field_f >> 1) - vn.field_c - 8, (var2_int >> 1) + (-ol.field_g - 8), 8, 8, var3, 64);
          de.e(-vn.field_c - (-(an.field_f >> 1) - this.field_V.field_y), -8 + (-ol.field_g + (var2_int >> 1)), 8, 8, var3, 64);
          de.h(-vn.field_c + (an.field_f >> 1), -8 + (var2_int >> 1) + (-ol.field_g + param0), this.field_V.field_y + (-vn.field_c + (an.field_f >> 1)), an.field_j);
          for (var4 = ((255 & jb.field_v) >> 2) - 64; 8 + this.field_V.field_y >= var4; var4 += 64) {
            de.e((an.field_f >> 1) + (-vn.field_c + var4), (var2_int >> 1) + (0 - ol.field_g) - 8, 32, 8, var3, 64);
          }
          de.h(-vn.field_c + (an.field_f >> 1) - 8, (var2_int >> 1) + 0 - ol.field_g, (an.field_f >> 1) + (-vn.field_c + this.field_V.field_y) + 8, an.field_j);
          for (var4Lifetime1 = -64 - ((jb.field_v & 255) >> 2); var4Lifetime1 <= this.field_V.field_H; var4Lifetime1 += 64) {
            de.e(-8 + (-vn.field_c + 0) + (an.field_f >> 1), var4Lifetime1 - (ol.field_g - ((var2_int >> 1) - 4)), 8, 32, var3, 64);
          }
          for (var4Lifetime2 = -64 + (jb.field_v >> 2 & 63); var4Lifetime2 <= this.field_V.field_H; var4Lifetime2 += 64) {
            de.e((an.field_f >> 1) + (this.field_V.field_y - vn.field_c), -4 + ((var2_int >> 1) + (var4Lifetime2 - ol.field_g)), 8, 32, var3, 64);
          }
          de.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.GA(" + param0 + ')');
        }
    }

    private final boolean b(byte param0) {
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -116) {
            this.field_O = true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o && (this.r(param0 ^ 45) ||
            this.field_k)) {
            stackIn_9_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = false;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.JB(" + param0 + ')');
        }
    }

    private final void i(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_h <= 0) {
            throw new IllegalStateException();
          }
          if (this.field_ab) {
            fieldTemp$1 = this.field_p + 1;
            this.field_p = this.field_p + 1;
            p.a(this.field_V.n((byte) -75), this.field_R, (byte) 11, 158, this.field_r, this.field_h, this.field_bb, 0, fieldTemp$1);
          }
          if (param0 != 2000) {
            this.field_T = false;
          }
          this.field_h = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.Q(" + param0 + ')');
        }
    }

    private final void a(wk param0, int param1, int param2) {
        ml var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 != 8888) {
            this.b(111, -81, -109);
          }
          this.field_z = -param1 + param0.n(param2 ^ -8922);
          if (this.field_z < 1) {
            this.field_z = 1;
          }
          if (this.field_k) {
            this.field_k = false;
            this.field_V.a((byte) 112, this.field_w);
            this.field_V.field_rb = uk.field_g;
            this.field_V.field_sb = cf.field_h;
            this.field_C = true;
            this.field_bb = this.field_V.d(false);
            var5 = this.field_V.a(this.field_V.d(false), true);
            if (var5 == null) {
              this.field_m.a(0);
            } else {
              this.field_m.a(-111, var5);
            }
            this.field_t = false;
            this.field_s = -1000;
          }
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("le.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean l(int param0) {
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -8712) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o && (this.r(-95) ||
            this.field_k)) {
            stackIn_10_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_10_0 = false;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.E(" + param0 + ')');
        }
    }

    final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_ab) {
            throw new IllegalStateException();
          }
          if (param0 != 26873) {
            return;
          }
          he.field_e.b((byte) -74, 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.BA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_ab) {
            throw new IllegalStateException();
          }
          if (!param0) {
            this.field_a = -59;
          }
          he.field_e.b((byte) -24, 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.RB(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        ml discarded$0 = null;
        try {
          if (param1 != -26449) {
            discarded$0 = this.q(-86);
          }
          this.a(param0, an.field_j, 0, true, 0, 96, an.field_f);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "le.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        ll var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var5_intLifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var9Lifetime3Lifetime1;
        int var10Lifetime3Lifetime1;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          de.b();
          var5_int = 0;
          param0 = param0 + ue.b((byte) -32);
          var7 = an.field_j;
          var7Lifetime1 = n.field_g.field_nb;
          var8 = this.field_V.b(true);
          var6 = -(param3 + 240) * (-an.field_j + 960) / 1440;
          var5_intLifetime1 = (an.field_f - 1280) * (var8 + param0) / (2 * var8 + this.field_V.field_y);
          if (var6 > 0) {
            var6 = 0;
          }
          if (960 < an.field_j) {
            ij.field_Tb.c(var5_intLifetime1, 0, 1280, an.field_j);
          } else {
            ij.field_Tb.c(var5_intLifetime1, var6, 1280, 960);
          }
          ge.field_r = ge.field_r + 1;
          if (ge.field_r > 128) {
            ge.field_r = ge.field_r - 128;
          }
          for (var9 = 0; an.field_f > var9; var9++) {
            var10 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9 + ge.field_r + param0) / 64.0) * 12.0);
            if (ge.field_r >= 64) {
              var10 = (96 - ge.field_r) * var10 / 32;
            } else {
              var10 = (ge.field_r - 32) * var10 / 32;
            }
            if (var10 > 0) {
              var10 = -var10;
            }
            var10 += 22;
            var10 = (int)((double)var10 + (8.0 * Math.sin(3.141592653589793 * (double)ge.field_r / 64.0) + 32.0));
            de.d(var9, -var10 + this.field_V.field_H + (-param3 + (var7Lifetime1 >> 1)), var10, (16449 | param2) >> 1);
          }
          for (var9Lifetime1 = 0; an.field_f > var9Lifetime1; var9Lifetime1++) {
            var10Lifetime1 = (int)Math.abs(Math.cos((double)(ge.field_r + (var9Lifetime1 + param0)) * 3.141592653589793 / 64.0) * 14.0);
            if (ge.field_r < 64) {
              var10Lifetime1 = var10Lifetime1 * (ge.field_r - 32) / 32;
            } else {
              var10Lifetime1 = var10Lifetime1 * (96 - ge.field_r) / 32;
            }
            if (var10Lifetime1 > 0) {
              var10Lifetime1 = -var10Lifetime1;
            }
            var10Lifetime1 += 20;
            var10Lifetime1 = (int)((double)var10Lifetime1 + (8.0 * Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) + 32.0));
            de.d(var9Lifetime1, -param3 + this.field_V.field_H - (-(var7Lifetime1 >> 1) + var10Lifetime1), var10Lifetime1, 16448 | param2 >> 1);
          }
          if (param1 > -82) {
            this.field_V = (nf) null;
          }
          for (var9Lifetime2 = 0; var9Lifetime2 < an.field_f; var9Lifetime2++) {
            var10Lifetime2 = (int)Math.abs(Math.sin(3.141592653589793 * (double)(var9Lifetime2 + ge.field_r * 2 + param0) / 64.0) * 16.0);
            if (ge.field_r < 64) {
              var10Lifetime2 = (ge.field_r - 32) * var10Lifetime2 / 32;
            } else {
              var10Lifetime2 = var10Lifetime2 * (96 - ge.field_r) / 32;
            }
            if (var10Lifetime2 > 0) {
              var10Lifetime2 = -var10Lifetime2;
            }
            var10Lifetime2 += 16;
            var10Lifetime2 = (int)((double)var10Lifetime2 + (Math.sin((double)ge.field_r * 3.141592653589793 / 64.0) * 8.0 + 32.0));
            de.f(var9Lifetime2, -var10Lifetime2 + (-param3 + this.field_V.field_H + (var7Lifetime1 >> 1)), var10Lifetime2, param2 | 16448, 128);
          }
          if (td.e(true) &&
            this.field_T) {
            this.field_V.m((byte) 69).b((an.field_f >> 1) - param0, -param3 + (var7Lifetime1 >> 1), this.field_V.field_y, this.field_V.field_H);
          } else {
            var9_ref_int__ = this.field_V.field_V.field_l;
            if (null != this.field_V.field_pb) {
              this.field_V.field_V.field_l = this.field_V.field_pb;
            }
            this.field_V.field_V.a((an.field_f >> 1) - param0, -param3 + (var7Lifetime1 >> 1));
            this.field_V.field_V.field_l = var9_ref_int__;
          }
          if (null != this.field_V.field_V) {
            var9Lifetime3 = 0;
            var10Lifetime3 = 0;
            var11 = this.field_V.m((byte) 69);
            gd.field_tb = gd.field_tb + 1;
            if (-1 + this.field_V.field_y <= gd.field_tb) {
              gd.field_tb = 0;
            }
            var12 = gd.field_tb - 2 * (1 & gd.field_tb) + 1;
            if (var12 < 0) {
              var12 = 0;
            }
            if (var12 >= -1 + this.field_V.field_y) {
              var12 = this.field_V.field_y - 1;
            }
            var10Lifetime3Lifetime1 = (gd.field_tb >> 1) + this.field_V.field_hb;
            var13 = 2 * (gd.field_tb & 1) - 1;
            var9Lifetime3Lifetime1 = gd.field_tb + 2 * this.field_V.field_y;
            for (var14 = 2; var14 < this.field_V.field_H - 2; var14 += 2) {
              if (var11.field_m[var10Lifetime3Lifetime1] != 0) {
                if (this.field_V.field_V.field_m[var9Lifetime3Lifetime1] == 0 &&
                  var11.field_m[var10Lifetime3Lifetime1 + var13] != 0 &&
                  var11.field_m[-this.field_V.field_hb + var10Lifetime3Lifetime1] != 0 &&
                  var11.field_m[var10Lifetime3Lifetime1] != -1) {
                  this.field_V.field_V.field_m[var9Lifetime3Lifetime1] = var11.field_m[var10Lifetime3Lifetime1];
                }
              } else {
                if (var11.field_m[var10Lifetime3Lifetime1 + var13] == 0 &&
                  var11.field_m[var10Lifetime3Lifetime1 - this.field_V.field_hb] == 0) {
                  this.field_V.field_V.field_m[var9Lifetime3Lifetime1] = (byte) 0;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              var9Lifetime3Lifetime1 = var9Lifetime3Lifetime1 + this.field_V.field_y;
              if (var11.field_m[var10Lifetime3Lifetime1] != 0) {
                if (this.field_V.field_V.field_m[var9Lifetime3Lifetime1] == 0 &&
                  var11.field_m[var10Lifetime3Lifetime1 + var13] != 0 &&
                  var11.field_m[var10Lifetime3Lifetime1 + this.field_V.field_hb] != 0 &&
                  var11.field_m[var10Lifetime3Lifetime1] != -1) {
                  this.field_V.field_V.field_m[var9Lifetime3Lifetime1] = var11.field_m[var10Lifetime3Lifetime1];
                }
              } else {
                if (0 == var11.field_m[var10Lifetime3Lifetime1 + var13]) {
                  if (var11.field_m[this.field_V.field_hb + var10Lifetime3Lifetime1] != 0) {
                    var10Lifetime3Lifetime1 = var10Lifetime3Lifetime1 + this.field_V.field_hb;
                    var9Lifetime3Lifetime1 = var9Lifetime3Lifetime1 + this.field_V.field_y;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_V.field_V.field_m[var9Lifetime3Lifetime1] = (byte) 0;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                var10Lifetime3Lifetime1 = var10Lifetime3Lifetime1 + this.field_V.field_hb;
                var9Lifetime3Lifetime1 = var9Lifetime3Lifetime1 + this.field_V.field_y;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "le.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, wk param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 5158) {
            this.d((byte) 118);
          }
          if (!this.field_k) {
            this.field_V.a((byte) 88, this.field_w);
          }
          this.field_w.t(-111);
          this.field_w.e((byte) 72);
          this.field_w.f((byte) -20);
          if (this.field_k) {
            bk.a(2);
          } else {
            this.b(0);
          }
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("le.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(byte param0, wk param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_w.e(true);
          if (!this.field_k) {
            this.field_V.e(true);
            this.field_z = 0;
          }
          if (param0 <= 11) {
            this.field_s = 97;
          }
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("le.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ml var3 = null;
        vn var4 = null;
        mi var5 = null;
        int var6 = 0;
        vn var7 = null;
        ml var3Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7 = this.field_V.g((byte) 68);
          var3 = (ml) (var7.b(param0 + 20398));
          while (var3 != null) {
            if (var3.i(-52)) {
              this.field_m.a(-105, var3);
              return;
            }
            var3 = (ml) (var7.a(0));
          }
          if (this.field_m.field_h != null &&
            this.field_m.field_h.d(6)) {
            return;
          }
          var4 = this.field_V.e(2);
          var5 = (mi) (var4.b(param0 + 20398));
          while (var5 != null) {
            if (var5.d(6)) {
              this.field_m.a(var5, -126);
              return;
            }
            var5 = (mi) (var4.a(0));
          }
          if (null != this.field_m.field_d &&
            this.field_m.field_d.f(true)) {
            return;
          }
          var3Lifetime1 = (ml) (var7.b(12623));
          if (param0 != -7775) {
            this.field_j = 56;
          }
          while (var3Lifetime1 != null) {
            if (var3Lifetime1.f(true)) {
              this.field_m.a(param0 ^ 7725, var3Lifetime1);
              return;
            }
            var3Lifetime1 = (ml) (var7.a(0));
          }
          if (this.field_m.field_d != null &&
            this.field_m.field_d.y(17571) == this.field_V.d(false)) {
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.S(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        boolean stackIn_9_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (re.field_r == 1 &&
            -3 == mf.field_g) {
            stackIn_9_0 = !(ao.field_d);
            ao.field_d = stackIn_9_0;
            if (ao.field_d) {
              vh.field_t = 0;
            }
          }
          var2_int = n.field_g.field_nb;
          if (this.field_I < 0) {
            stackIn_17_0 = (!ao.field_d) ? 1 : 0;
          } else {
            stackIn_17_0 = 1;
          }
          boolean decompiledFrameRemainder5 = true;
          var3 = stackIn_17_0;
          if ((ri.field_b[96] ||
            var3 != 0 &&
            ri.field_b[p.field_a]) && -16 < this.field_n) {
            this.field_m.a(param0 + 0);
            this.field_n = this.field_n - 2;
            this.field_t = true;
            decompiledFrameRemainder5 = false;
          }
          else {
            if (this.field_n < 0) {
              this.field_n = this.field_n + 1;
            }
          }
          boolean decompiledFrameRemainder4 = true;
          if ((ri.field_b[97] ||
            var3 != 0 &&
            ri.field_b[qo.field_b]) && this.field_n < 16) {
            this.field_m.a(0);
            this.field_n = this.field_n + 2;
            this.field_t = true;
            decompiledFrameRemainder4 = false;
          }
          else {
            if (0 < this.field_n) {
              this.field_n = this.field_n - 1;
            }
          }
          boolean decompiledFrameRemainder3 = true;
          if ((ri.field_b[98] ||
            var3 != 0 &&
            ri.field_b[fi.field_e]) && -16 < this.field_S) {
            this.field_m.a(0);
            this.field_S = this.field_S - 2;
            this.field_t = true;
            decompiledFrameRemainder3 = false;
          }
          else {
            if (this.field_S < 0) {
              this.field_S = this.field_S + 1;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          if ((ri.field_b[99] ||
            var3 != 0 &&
            ri.field_b[cm.field_j]) && 16 > this.field_S) {
            this.field_m.a(0);
            this.field_t = true;
            this.field_S = this.field_S + 2;
            decompiledFrameRemainder2 = false;
          }
          else {
            if (this.field_S > 0) {
              this.field_S = this.field_S - 1;
            }
          }
          ol.field_g = ol.field_g + this.field_S;
          vn.field_c = vn.field_c + this.field_n;
          if (eb.field_b != null) {
            this.field_M = 2000;
          } else {
            if (!this.field_V.a(true) &&
              !this.field_V.c((byte) 89)) {
              this.field_M = 0 + 15 * this.field_M >> 4;
            } else {
              this.field_M = 2000;
            }
          }
          var4 = 0;
          if (!this.field_V.c((byte) 89) &&
            !this.field_V.k(-45) && (!ef.field_r &&
            !pn.a((byte) 110) ||
            !this.field_ab)) {
            var5 = this.field_V.field_y >> this.field_K;
            var6 = this.field_V.field_H >> this.field_K;
            var7 = an.field_j;
            if (var5 + 648 > an.field_f) {
              var7 = var2_int;
            }
            if (an.field_g >= -8 - var5 + an.field_f &&
              me.field_I >= -8 + (-var6 + var7) &&
              me.field_I < var7) {
              if (wk.field_m == 1) {
                vn.field_c = 4 - an.field_f + (var5 + an.field_g) << this.field_K;
                this.field_t = true;
                ol.field_g = me.field_I - (-4 - var6) - var7 << this.field_K;
              }
              this.field_u = 0;
              var4 = 1;
            } else {
              if (1 == wk.field_m) {
                this.field_K = 4;
              }
            }
          }
          var5Lifetime1 = -var2_int / 2;
          if (param0 != 0) {
            this.field_cb = (vn) null;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var6Lifetime1 = 64 - var2_int / 2 + this.field_V.field_H;
          this.a(var6Lifetime1, var5Lifetime1, true);
          if ((this.field_V.d(false) == this.field_I &&
            !(this.field_z <= 1) || !this.field_ab) && (!this.field_V.a(true))) {
            if ((this.field_ab) &&
              (decompiledFrameRemainder0 = !(pn.a((byte) -51)))) {
              decompiledFrameRemainder0 = !(ef.field_r);
            }
            if ((decompiledFrameRemainder0) &&
              (!this.field_V.n(param0 + 4))) {
              this.a(var4 != 0, (byte) 10);
              decompiledFrameRemainder1 = false;
            }
          }
          if (decompiledFrameRemainder1) {
            eb.field_b = null;
            ti.field_N = -1;
          }
          if (this.field_V.c((byte) 89)) {
            this.field_K = 4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.P(" + param0 + ')');
        }
    }

    private final int a(int param0, byte param1, int param2) {
        boolean discarded$0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        ml var9 = null;
        String var6Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != -3) {
            discarded$0 = this.r(122);
          }
          var9 = this.field_V.a(param2, true);
          if ((var9 == null ||
            !(0 >= ((this.field_J | this.field_a) & 1 << var9.y(17571)))) && (0 == param2 ||
            !qg.a(-113) ||
            rm.field_k == 6)) {
            var5 = 16777215;
            var8 = this.field_V.field_k[param2];
            var6 = var8;
            if ((1 << param2 & this.field_J) > 0) {
              if ((1 << param2 & this.field_a) > 0) {
                var6Lifetime1 = tj.a(param1 ^ -124, new String[]{var8}, qc.field_g);
              } else {
                var6Lifetime1 = tj.a(param1 + 116, new String[]{var8}, lc.field_a);
              }
            } else {
              if (0 >= (1 << param2 & this.field_a)) {
                var6Lifetime1 = tj.a(122, new String[]{var8}, jl.field_i);
              } else {
                var6Lifetime1 = tj.a(param1 - 14, new String[]{var8}, cn.field_Q);
              }
            }
            mi.field_B.a(var6Lifetime1, 3, mi.field_B.field_C / 2 + (param0 + 8), 15790320 ^ (var5 | 15790320), 0);
            mi.field_B.a(var6Lifetime1, 4, 8 + param0 + (mi.field_B.field_C / 2 - 1), 15790320 ^ (var5 | 15790320), 0);
            mi.field_B.a(var6Lifetime1, 4, mi.field_B.field_C / 2 + (8 + param0), var5, -1);
            param0 += 18;
          }
          stackIn_21_0 = param0;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "le.PA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, ml param2, int param3) {
        boolean discarded$0 = false;
        int var15 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != -82) {
            discarded$0 = this.j(-127);
          }
          var5_int = n.field_g.field_nb;
          var6 = param2.f(-99);
          var7 = param2.i((byte) 120);
          var8 = param2.p(-8323);
          var9 = -var6 + param3;
          var10 = param0 - var7 + (var8 >> 1);
          var11 = (int)Math.sqrt((double)(var10 * var10 + var9 * var9));
          if (var11 == 0) {
            var11 = 1;
            var10 = -1;
          }
          if (!this.field_V.a(true)) {
            if (var9 > 0) {
              param2.field_E = 1;
            } else {
              param2.field_E = -1;
            }
            if ((ti.field_N == 127 ||
              ti.field_N == 128 ||
              ti.field_N == 129 ||
              ti.field_N == 136) &&
              Math.abs(var9) < Math.abs(var10)) {
              var9 = 64 * param2.field_E;
              var10 = (var10 >= 0) ? 64 : -64;
              var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
              if (0 == var11) {
                var11 = 1;
                var10 = -1;
              }
            }
            var12 = var8 / 2;
            if (this.field_u >= 100) {
              return;
            }
            for (var15 = 0; var15 < this.field_u; var15++) {
              var16 = var15 + var12;
              var14 = var16 * var10 / var11 - var12;
              var13 = var9 * var16 / var11;
              var17 = 0;
              if (25 > var15) {
                var17 = var17 | (255 & var15 * 10) << 16;
              } else {
                var17 = var17 | 16711680;
                if (var15 < 75) {
                  var17 = var17 | ((var15 - 25) * 5 & 255) << 8;
                } else {
                  var17 = var17 | 65280;
                  if (var15 < 100) {
                    var17 = var17 | -750 + 10 * var15 & 255;
                  } else {
                    var17 = var17 | 255;
                  }
                }
              }
              if (var15 <= 25) {
                de.c(-vn.field_c + var13 + (var6 + (an.field_f >> 1)), -ol.field_g + var7 + (var14 + (var5_int >> 1)), 1600 / (200 - 100 * var15 / 100), var17, 10 * var15);
              } else {
                de.i(-vn.field_c + var13 + var6 + (an.field_f >> 1), (var5_int >> 1) + (-ol.field_g + (var14 + var7)), 1600 / (200 - var15 * 100 / 100), var17);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_46_0 = var5;
          stackIn_46_1 = new StringBuilder().append("le.HB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean r(int param0) {
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < -26) {
            stackIn_7_0 = !(this.field_V.d((byte) -128));
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.LB(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        rb var4_ref_rb = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rb var8 = null;
        ml var9 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_V.d(false) < 0 &&
            !this.field_V.n(4)) {
            param1 = false;
          }
          this.field_o = false;
          if (!ef.field_r &&
            !pn.a((byte) 111) && (ri.field_b[69] ||
            ri.field_b[ao.field_f])) {
            this.field_t = false;
            this.field_m.a(-96, this.field_V.a(this.field_bb, true));
          }
          if (0 < this.field_V.field_G) {
            this.field_V.field_G = this.field_V.field_G - 1;
          }
          vl.a(128);
          if (this.field_Z > 0) {
            this.field_Z = this.field_Z - 1;
          }
          if (!(an.field_g >= 0) ||
            !(me.field_I >= 0) ||
            !(an.field_f > an.field_g) &&
            !(me.field_I < an.field_j)) {
            ti.field_N = -1;
          }
          this.field_P = this.field_P + 1;
          if (0 > this.field_Z) {
            this.field_Z = this.field_Z + 1;
          }
          if (256 <= this.field_P) {
            this.field_P = this.field_P - 256;
          }
          this.field_j = this.field_j + 1;
          if (this.field_j > g.field_a.field_n * 2) {
            this.field_j = this.field_j - g.field_a.field_n * 2;
          }
          var3_int = 0;
          e.g((byte) -49);
          if (dm.h((byte) 97)) {
            this.c((byte) -106);
            if (!this.field_V.c((byte) 89) &&
              this.field_V.n(4) &&
              mn.field_r != 3 &&
              -5 != mn.field_r &&
              this.field_V.d(1)) {
              var4 = this.field_V.d(false);
              if (ob.field_Y != null &&
                ob.field_Y.field_l) {
                stackIn_50_0 = 1;
              } else {
                if (an.field_f <= 640) {
                  stackIn_50_0 = (an.field_j > 480) ? 1 : 0;
                } else {
                  stackIn_50_0 = 1;
                }
              }
              var5 = stackIn_50_0;
              if (var4 >= 0 &&
                this.field_I >= 0 &&
                var5 != 0 &&
                this.field_i) {
                if (!this.field_V.field_d) {
                  stackIn_66_0 = (this.field_I != var4) ? 0 : 1;
                  var6 = stackIn_66_0;
                } else {
                  stackIn_61_0 = ((this.field_I & 1) != (var4 & 1)) ? 0 : 1;
                  var6 = stackIn_61_0;
                }
                if ((this.field_J & 1 << this.field_I) != 0) {
                  var6 = 0;
                }
                if (var6 != 0) {
                  this.a((byte) 79, 56, 199);
                }
              }
              gj.a(true, true, 3, mn.field_r);
            }
          } else {
            var3_int = 1;
          }
          this.c(-7775);
          if (!this.field_t) {
            this.e(17608);
          }
          if (this.field_I > 0 && (ri.field_b[69] ||
            ri.field_b[ao.field_f] ||
            ri.field_b[ig.field_g] ||
            ri.field_b[im.field_g] ||
            ri.field_b[84] ||
            ri.field_b[82] ||
            ri.field_b[81] ||
            ri.field_b[ko.field_k] ||
            ri.field_b[ud.field_w] ||
            ri.field_b[85])) {
            var8 = (rb) (pb.field_m.b(12623));
            var4_ref_rb = var8;
            this.field_K = 4;
            this.field_M = 2000;
            if (var8 != null) {
              var8.field_i = false;
            }
          }
          if (!this.field_V.c((byte) 89) &&
            !this.field_V.k(103)) {
            if (this.field_C) {
              this.field_C = false;
              this.field_V.f((byte) -20);
              this.field_bb = this.field_V.d(false);
              var9 = this.field_V.a(this.field_bb, param0);
              if (var9 != null) {
                this.field_m.a(-89, var9);
              } else {
                this.field_m.a(0);
              }
              this.field_t = false;
              this.field_s = -1000;
            }
            if (this.field_w == null &&
              !this.field_F) {
              this.field_F = true;
              this.field_V.f((byte) -20);
              if (!this.field_ab &&
                this.field_V.b(this.field_J, -93)) {
                if (!qg.a(-102)) {
                  gj.a(false, true, -1, mn.field_r);
                } else {
                  mh.i((byte) 74);
                }
              }
              if (!this.field_ab &&
                5 == mj.field_p) {
                wk.j(13805);
              }
            }
          }
          if (mj.field_p == 6) {
            if (rm.field_k < 5) {
              this.field_G = false;
            } else {
              this.field_G = true;
            }
          }
          if (this.field_V.a(param0) &&
            !this.field_V.c((byte) 89) &&
            !this.field_V.n(4) &&
            !this.field_V.k(-127) &&
            var3_int == 0 &&
            pb.field_m.b(true) &&
            !this.field_ab) {
            if (this.field_y) {
              this.field_t = false;
              this.c(false);
              if (mj.field_p == 6 &&
                this.field_V.d(false) != 0) {
                hj.a(-20602);
              } else {
                this.field_V.a(this.field_V.d(false), 157, (byte) 36, 0, 0, 0, 0, this.field_V.d(false), 0);
              }
            } else {
              if (qg.a(-96)) {
                ik.b(0);
                this.c(false);
              } else {
                this.c(false);
              }
            }
          }
          var4Lifetime1 = n.field_g.field_nb;
          var5Lifetime1 = -var4Lifetime1 / 2;
          var6Lifetime1 = this.field_V.field_H - var4Lifetime1 / 2 + 64;
          this.a(var6Lifetime1, var5Lifetime1, param0);
          if (param1) {
            this.n(0);
          }
          this.d((byte) 83);
          fieldTemp$0 = this.field_x - 1;
          this.field_x = this.field_x - 1;
          if (fieldTemp$0 <= 0) {
            if (this.field_W == this.field_V.n((byte) -75)) {
              ob.a(20, this.field_f, this.field_W);
            }
            this.field_x = 50;
          }
          if (this.field_ab) {
            if (this.field_z > 1) {
              this.field_z = this.field_z - 1;
              if (this.field_z == 1) {
                if (this.field_h > 0) {
                  this.i(2000);
                }
                if (!this.field_V.a(true) &&
                  this.field_V.d(false) == this.field_I) {
                  this.a(-113);
                }
              }
            }
          } else {
            if (this.field_y) {
              this.field_z = this.field_z - 1;
            }
            if (0 == this.field_z) {
              this.d(false);
            }
          }
          if (null != b.field_a.b(12623)) {
            fieldTemp$1 = wi.field_h + 1;
            wi.field_h = wi.field_h + 1;
            if (fieldTemp$1 != 335) {
              return;
            }
            wi.field_h = 0;
            b.field_a.c(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "le.IB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        nf stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        ol stackIn_4_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        wk var3 = null;
        try {
          stackIn_3_0 = this.field_V;
          stackIn_3_1 = qg.a(-81);
          if (this.field_t) {
            stackIn_4_2 = null;
          } else {
            stackIn_4_2 = this.field_m;
          }
          ((nf) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, param0 ^ -17);
          if (param0 != -106) {
            var3 = (wk) null;
            this.a(19, (wk) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.PB(" + param0 + ')');
        }
    }

    private final boolean a(wk param0, int param1, int param2, int param3) {
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 == 60) {
            this.field_L = param0.e((byte) 99);
            return true;
          }
          if (68 == param1) {
            this.field_D = param0.e((byte) -90);
            jg.a(-3);
            return true;
          }
          if (param1 == 69) {
            this.field_J = param0.e((byte) 80);
            return true;
          }
          if (70 == param1) {
            this.field_b = param0.e((byte) 48);
            jk.a((byte) 121);
            return true;
          }
          if (71 == param1) {
            this.field_a = param0.e((byte) -86);
            jk.a((byte) 121);
            return true;
          }
          if (param1 == 61) {
            if (this.b((byte) -116) &&
              this.field_cb.b(true)) {
              this.a(5158, param0);
            } else {
              this.a(param3, param1, param0, false);
            }
            return true;
          }
          if (param1 == 65) {
            if (this.e(true) &&
              this.field_cb.b(true)) {
              this.a(param0, -122);
            } else {
              this.a(param3, param1, param0, false);
            }
            return true;
          }
          if (param1 == 66) {
            if (this.f(false) &&
              this.field_cb.b(true)) {
              this.c(param0, 105);
            } else {
              this.a(param3, param1, param0, false);
            }
            return true;
          }
          if (param1 == 63) {
            if (this.l(-8712) &&
              this.field_cb.b(true)) {
              this.b(33, param0);
            } else {
              this.a(param3, param1, param0, false);
            }
            return true;
          }
          if (param1 == 64) {
            if (this.f(-128) &&
              this.field_cb.b(true)) {
              this.a((byte) 59, param0);
            } else {
              this.a(param3, param1, param0, false);
            }
            return true;
          }
          if (param1 == 62) {
            if (this.j(param2 - 27726) &&
              this.field_cb.b(true)) {
              this.a(param0, 0, 8888);
            } else {
              this.a(param3, param1, param0, false);
            }
            return true;
          }
          if (67 != param1) {
            if (param2 == 0) {
              return false;
            }
            this.field_O = true;
            return false;
          }
          if (this.b(false) &&
            this.field_cb.b(true)) {
            this.b(param0, -1);
          } else {
            this.a(param3, param1, param0, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_89_0 = var5;
          stackIn_89_1 = new StringBuilder().append("le.V(");
          if (param0 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_89_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        long var1_long = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1_long = qj.b(-26572);
          if (param0 <= 67) {
            return true;
          }
          var3 = -mh.field_K + var1_long;
          if (30000L < var3) {
            mh.field_K = var1_long;
            ik.field_b = 0;
            return true;
          }
          var5 = 3000;
          if (7 <= ik.field_b) {
            var5 = 12000;
          } else {
            if (ik.field_b < 5) {
              if (ik.field_b >= 3) {
                var5 = 6000;
              }
            } else {
              var5 = 9000;
            }
          }
          if ((long)var5 >= var3) {
            return false;
          }
          ik.field_b = ik.field_b + 1;
          mh.field_K = var1_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "le.DA(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        try {
          this.a(0, 0, 0, 0, 0, 0, -1, -118);
          this.field_V.e(true);
          if (param0) {
            this.field_Z = 120;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "le.MA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (wi.a(param1, ad.field_f, param0 ^ 79)) {
            return;
          }
          var6 = ad.field_f;
          var4 = var6;
          var5 = param1;
          var6[var5 >> 5] = fj.b(var6[var5 >> 5], 1 << dg.a(var5, 31));
          if (param0 != 79) {
            this.field_O = false;
          }
          b.field_a.b(new qa(param1), -1);
          if (!this.field_U) {
            wh.field_h.b(new cm(param1, param2, 0, 0, 0, 0), param0 - 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4_ref), "le.NB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= -110) {
            this.field_r = -122;
          }
          var3_int = param0.e((byte) -99);
          if (!this.field_k) {
            this.field_V.a((byte) 106, this.field_w);
          }
          this.field_w.b((byte) 88, var3_int);
          this.field_w.e((byte) 72);
          if (this.field_k) {
            bk.a(2);
          } else {
            this.field_V.b((byte) 88, var3_int);
          }
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("le.RA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        boolean stackIn_151_0 = false;
        int stackIn_181_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ml var6 = null;
        ml var7_ref_ml = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ml var16 = null;
        ml var17 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var13Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = n.field_g.field_nb;
          if (param1 != 10) {
            this.a(41, 48, 1, -100);
          }
          var4 = an.field_g - (-vn.field_c + (an.field_f >> 1));
          var5 = -(var3_int >> 1) + me.field_I + ol.field_g;
          if (this.field_u > 0) {
            var4 = this.field_e;
            var5 = this.field_c;
          }
          if (ti.field_N == 78) {
            var5 += 64;
          }
          var16 = this.field_V.a(this.field_bb, true);
          var6 = var16;
          if (var16 == null ||
            !(var16.m(-20357) > 0)) {
            var17 = this.field_V.a(this.field_V.d(false), true);
            var6 = var17;
            if (var17 != null) {
              this.field_bb = var17.y(17571);
            }
          }
          if (var6 == null &&
            this.field_ab &&
            !this.field_V.a(true)) {
            this.a(36);
          }
          if (var6 != null &&
            var6.w(param1 ^ 24511) == null &&
            var6.y(17571) != this.field_V.d(false)) {
            var6 = this.q(param1 + 10771);
          }
          if (var6 != null &&
            var6.w(24501) != null &&
            37 != var6.o(-22625)) {
            var7_ref_ml = this.field_V.a(this.field_V.d(false), true);
            if (var7_ref_ml != null &&
              var7_ref_ml.i((byte) -32) > this.field_V.field_H) {
              var6 = this.q(10781);
            }
          }
          if (var6 != null &&
            null != var6.w(24501)) {
            if (!this.field_V.field_d) {
              if (var6.g(false) != this.field_V.d(false)) {
                var6 = this.q(10781);
              }
            } else {
              if (var6.y(17571) != this.field_V.d(false) && (var6.w(24501) == null ||
                var6.r(param1 - 132) != this.field_V.q((byte) -122))) {
                var6 = this.q(10781);
              }
            }
          }
          if ((!this.field_V.c((byte) 89) ||
            this.field_V.j(39)) &&
            (!this.field_V.k(-92) &&
            !this.field_V.g(119) &&
            1 < this.field_z)) {
            if (!this.field_ab) {
              stackIn_60_0 = 1;
            } else if (pn.a((byte) 127)) {
              stackIn_60_0 = 0;
            } else if (!ef.field_r) {
              stackIn_60_0 = 1;
            } else {
              stackIn_60_0 = 0;
            }
          } else {
            stackIn_60_0 = 0;
          }
          var7 = stackIn_60_0;
          if (var6 != null) {
            boolean decompiledFrameRemainder3 = true;
            if (var6.i((byte) 121) >= 128 + this.field_V.field_H) {
              if (var6.m(param1 ^ -20367) > 0 &&
                null == var6.w(24501)) {
                if ((!(this.field_ab)) &&
                  (!(!qg.a(-92))) &&
                  ((mj.field_p != 7))) {
                  rm.a(var6, true);
                }
                decompiledFrameRemainder3 = false;
              }
              else {
                this.field_bb = this.field_V.d(false);
                var6 = this.field_V.a(this.field_bb, true);
                eb.field_b = null;
                ti.field_N = -1;
              }
            }
            boolean decompiledFrameRemainder1 = true;
            if (var7 != 0 && (ri.field_b[ig.field_g] ||
              ri.field_b[ko.field_k])) {
              stackIn_79_0 = 1;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_79_0 = 0;
            }
            boolean decompiledFrameRemainder0 = true;
            var8 = stackIn_79_0;
            if (var7 != 0 && (ri.field_b[im.field_g] ||
              ri.field_b[ud.field_w])) {
              stackIn_86_0 = 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_86_0 = 0;
            }
            var9 = stackIn_86_0;
            if (var8 == 0 &&
              var9 == 0 &&
              0 < this.field_h) {
              this.i(2000);
            }
            if (var7 != 0) {
              if (!ri.field_b[69] &&
                !ri.field_b[ao.field_f]) {
                this.field_Y = 0;
              } else {
                this.field_t = false;
                if (this.field_Y > 0) {
                  this.field_Y = this.field_Y - 1;
                } else {
                  if (cf.field_h[224] != null) {
                    ti.a((byte) -30, to.field_r[224], cf.field_h[224]);
                  }
                  this.field_Y = 25;
                  var6 = this.q(10781);
                  if (var6 == null) {
                    var6 = this.field_V.a(this.field_V.d(false), true);
                  }
                }
              }
              if (this.field_G &&
                var8 != 0 &&
                0 >= this.field_Z && (this.field_h == 0 ||
                this.field_R == 0)) {
                this.field_F = true;
                this.field_Z = -5;
                if (0 < this.field_h &&
                  this.field_R != 0 ||
                  this.field_h > 50) {
                  this.i(param1 + 1990);
                }
                this.field_h = this.field_h + 1;
                this.field_R = 0;
                var6.c(0, -1);
                this.field_m.a(-80, var6);
                eb.field_b = null;
                ti.field_N = -1;
              }
              if (this.field_G &&
                var9 != 0 &&
                this.field_Z >= 0 && (this.field_h <= 0 ||
                this.field_R == 1)) {
                this.field_F = true;
                this.field_Z = 5;
                if (this.field_h > 0 &&
                  this.field_R != 1) {
                  this.i(2000);
                } else {
                  if (this.field_h > 50) {
                    this.i(2000);
                  }
                }
                this.field_R = 1;
                this.field_h = this.field_h + 1;
                var6.c(param1 - 10, 1);
                this.field_m.a(param1 ^ -106, var6);
                eb.field_b = null;
                ti.field_N = -1;
              }
            }
          }
          if (var7 != 0) {
            if (re.field_r == 1) {
              if (mf.field_g >= 0 &&
                null != lm.field_f &&
                this.field_V.a(lm.field_f[mf.field_g], true, this.field_bb)) {
                ti.field_N = lm.field_f[mf.field_g];
                var8Lifetime1 = 9;
                if (ti.field_N / 12 <= 9) {
                  var8Lifetime1 = ti.field_N / 12;
                }
                if (var8Lifetime1 != 0) {
                  var8Lifetime1--;
                } else {
                  var8Lifetime1 = 9;
                }
                th.field_g[9] = 42;
                if (null != cf.field_h[th.field_g[var8Lifetime1]]) {
                  ti.a((byte) -30, to.field_r[th.field_g[var8Lifetime1]], cf.field_h[th.field_g[var8Lifetime1]]);
                }
                this.field_s = -1000;
              }
              if (mf.field_g == -2) {
                stackIn_151_0 = !(hc.field_f);
                hc.field_f = stackIn_151_0;
              }
              if (mf.field_g == -4) {
                var8Lifetime1 = 100;
                if (this.field_V.field_x[this.field_I] == 4) {
                  var8Lifetime1 = this.field_V.field_X[this.field_I] / 5 * 5 + 5;
                  if (this.field_V.field_X[this.field_I] > 0 &&
                    var8Lifetime1 == this.field_V.field_X[this.field_I] + 5) {
                    var8Lifetime1 = this.field_V.field_X[this.field_I];
                  }
                }
                if (this.field_V.field_X[this.field_I] < var8Lifetime1 &&
                  this.field_V.a(this.field_V.d(false), true).m(-20357) > 20) {
                  if (this.field_ab) {
                    fieldTemp$0 = this.field_p + 1;
                    this.field_p = this.field_p + 1;
                    p.a(this.field_V.n((byte) -75), 0, (byte) 11, 159, 0, 1, this.field_bb, 0, fieldTemp$0);
                  }
                  this.field_V.e(this.field_bb, false);
                }
              }
              if (mf.field_g < -1) {
                this.field_s = -1000;
              }
            }
            if (2 == re.field_r) {
              this.field_s = -1000;
              ti.field_N = -1;
            }
            if (this.field_z > 1 &&
              null == eb.field_b &&
              var6 != null &&
              !param0 &&
              -1 == mf.field_g) {
              stackIn_181_0 = (ti.field_N < 0) ? 0 : 1;
              var8Lifetime1Lifetime1 = stackIn_181_0;
              if (wk.field_m == 1 && ((this.field_u > 0 ||
                re.field_r == 1) &&
                (this.field_u == 0 ||
                !(ti.field_N < 0))) && this.field_u < 100) {
                if (re.field_r == 1 &&
                  cf.field_h[222] != null) {
                  ti.a((byte) -30, to.field_r[222], cf.field_h[222]);
                }
                if (null == sm.field_e) {
                  var9Lifetime1 = -12 + ti.field_N;
                  if (var9Lifetime1 >= 0 &&
                    var9Lifetime1 < 96 &&
                    var9Lifetime1 / 12 != 6) {
                    if (null != cf.field_h[wh.field_i[var9Lifetime1 / 12]]) {
                      sm.field_e = kd.a(cf.field_h[wh.field_i[var9Lifetime1 / 12]], 100, to.field_r[wh.field_i[var9Lifetime1 / 12]]);
                    }
                  } else {
                    if (cf.field_h[wh.field_i[0]] != null) {
                      sm.field_e = kd.a(cf.field_h[wh.field_i[0]], 100, to.field_r[wh.field_i[0]]);
                    }
                  }
                  if (null != sm.field_e) {
                    sc.a(sm.field_e, (byte) 68);
                  }
                }
                var8Lifetime1Lifetime1 = 0;
                if (this.field_u < 100) {
                  this.field_u = this.field_u + 1;
                  if (1 == this.field_u) {
                    this.field_c = -(var3_int >> 1) + ol.field_g + me.field_I;
                    this.field_e = -(an.field_f >> 1) + vn.field_c + an.field_g;
                  }
                }
                if (ti.field_N >= 0 &&
                  !this.field_V.c((byte) 89) &&
                  rd.field_e[ti.field_N] == 1 &&
                  this.field_s == -1000) {
                  this.field_u = 0;
                  this.field_s = var4;
                  this.field_r = var5;
                }
              }
              if (0 > ti.field_N) {
                var8Lifetime1Lifetime1 = 1;
              } else {
                var9Lifetime1Lifetime1 = rd.field_e[ti.field_N];
                if ((var9Lifetime1Lifetime1 == 2 ||
                  var9Lifetime1Lifetime1 == 4 ||
                  3 == var9Lifetime1Lifetime1) && 0 < this.field_u) {
                  this.field_u = 100;
                  var8Lifetime1Lifetime1 = 1;
                }
              }
              if (var8Lifetime1Lifetime1 != 0) {
                if (0 < this.field_u) {
                  this.field_u = 64 * this.field_u / 100;
                  if (this.field_u < 1) {
                    this.field_u = 1;
                  }
                }
                if (sm.field_e != null) {
                  bl.a(sm.field_e, param1 ^ 119);
                  sm.field_e = null;
                }
                boolean decompiledFrameRemainder2 = true;
                var9Lifetime1Lifetime2 = var6.f(-51);
                var10 = var6.i((byte) 11);
                var11 = var6.p(param1 ^ -8329);
                var12 = -var9Lifetime1Lifetime2 + var4;
                var13 = -var10 + (var5 + (var11 >> 1));
                var14 = (int)Math.sqrt((double)(var12 * var12 + var13 * var13));
                if (0 <= ti.field_N &&
                  !this.field_V.c((byte) 89)) {
                  if (rd.field_e[ti.field_N] == 1 &&
                    -1000 == this.field_s) {
                    this.field_u = 0;
                  }
                  if (rd.field_e[ti.field_N] != 2 &&
                    rd.field_e[ti.field_N] != 4) {
                    if (((rd.field_e[ti.field_N] == 3)) &&
                      (!(this.field_V.a(var6, var6.i((byte) -111), var6.f(param1 ^ -103), -129, ti.field_N)))) {
                      this.field_u = 0;
                    }
                    decompiledFrameRemainder2 = false;
                  }
                  else {
                    this.field_s = var4;
                    this.field_r = var5;
                    if (!this.field_V.a(var6, this.field_r, this.field_s, -129, ti.field_N)) {
                      this.field_u = 0;
                    }
                  }
                }
                if (var14 == 0) {
                  var13Lifetime1 = -1;
                  var14 = 1;
                }
                if (this.field_u > 0 &&
                  !this.field_V.c((byte) 89)) {
                  if (!this.field_V.a(true) &&
                    ti.field_N >= 0) {
                    this.field_u = (int)Math.sqrt((double)(this.field_u * 32));
                    if (ti.field_N != 87 &&
                      ti.field_N != 116 &&
                      ti.field_N != 45 &&
                      54 != ti.field_N &&
                      154 != ti.field_N &&
                      ti.field_N != 139 &&
                      ti.field_N != 152) {
                      this.field_V.e(true);
                    }
                    if (this.field_ab) {
                      if (ti.field_N == 4 ||
                        87 == ti.field_N ||
                        ti.field_N == 116) {
                        this.field_u = this.field_Q;
                        this.field_Q = 255 & 1 + this.field_Q;
                      }
                      if (this.field_h > 0) {
                        this.i(2000);
                      }
                      if (rd.field_e[ti.field_N] == 3) {
                        this.a(ti.field_N, var4, this.field_V.n((byte) -75), this.field_bb, var5, (byte) -30, var6.f(-80), var6.i((byte) 113), this.field_u);
                      } else {
                        this.a(ti.field_N, var4, this.field_V.n((byte) -75), this.field_bb, var5, (byte) -30, this.field_s, this.field_r, this.field_u);
                      }
                      if (ti.field_N != 87) {
                        ti.field_N = -1;
                      }
                    } else {
                      this.a(var5, ti.field_N, this.field_r, var4, this.field_u, this.field_s, var6.y(17571), param1 ^ -65);
                      if (ti.field_N != 87) {
                        ti.field_N = -1;
                      }
                    }
                    this.field_u = 0;
                  } else {
                    this.field_u = 0;
                  }
                }
              }
            }
          }
          if (this.field_u > 1) {
            this.field_M = 2000;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "le.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 >= -97) {
            this.field_v = (int[]) null;
          }
          if (!this.field_ab) {
            var3_int = param1 ? 1 : 0;
            gj.a(var3_int != 0, true, 0, mn.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "le.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(ml param0, int param1) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        try {
          if (ti.field_N >= 0 &&
            ti.field_N != -1 &&
            null == eb.field_b) {
            var3_int = rd.field_e[ti.field_N];
            if (var3_int == 3 && ((ti.field_N == 10 ||
              ti.field_N == 123 ||
              ti.field_N == 125 ||
              138 == ti.field_N ||
              ti.field_N == 137 ||
              ti.field_N == 155) &&
              (!this.field_ab ||
              this.field_V.d(false) == this.field_I))) {
              this.a((byte) -7, param0);
            }
            if ((0 == var3_int ||
              var3_int == 1 &&
              this.field_s != -1000) &&
              (!this.field_ab ||
              this.field_V.d(false) == this.field_I)) {
              this.a(-110, param0);
            }
          }
          if (this.field_u > 0 && (!this.field_ab ||
            this.field_V.d(false) == this.field_I)) {
            var3_intLifetime1 = this.field_e;
            var4 = this.field_c;
            if (ti.field_N == 78) {
              var4 += 64;
            }
            this.a(var4, (byte) -82, param0, var3_intLifetime1);
          }
          if (param1 <= 42) {
            this.field_s = -110;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("le.OA(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, wk param1) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ml var10 = null;
        ml var11 = null;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param1.d(-10674);
          var3_int = param1.n(-98);
          var4 = param1.m(0);
          if (param0 <= 18) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var5 = param1.m(0);
          var6 = param1.m(0);
          var7 = param1.m(0);
          var8 = param1.e((byte) -127);
          var9 = param1.e((byte) -94);
          this.field_w.a(this.field_w.d(false), var8, (byte) -107, var9, var4, var5, var7, var3_int, var6);
          this.field_w.e((byte) 72);
          if (!this.field_k) {
            if (var8 != 158 &&
              var8 != 159) {
              this.field_t = false;
              this.field_V.a(this.field_V.d(false), var8, (byte) 11, var9, var4, var5, var7, var3_int, var6);
              if (((var8 != 6 &&
                var8 != 79) || pb.field_m.b(true))) {
                ma.a(li.field_I + tc.field_w[var8], 8421504, (byte) -41);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_V.d(false) == this.field_I) {
                if (var4 == this.field_p &&
                  0 == this.field_h) {
                  var10 = this.field_V.a(this.field_bb, true);
                  var11 = this.field_w.a(this.field_bb, true);
                  if ((var10 != null ||
                    var11 != null) && (var10 == null ||
                    null == var11 ||
                    var10.f(-118) != var11.f(72) ||
                    var10.i((byte) -102) != var11.i((byte) 116) ||
                    var10.o(-22625) != var11.o(-22625) ||
                    var10.m(-20357) != var11.m(-20357))) {
                    this.field_V.a((byte) 125, this.field_w);
                    this.field_V.e((byte) 72);
                    this.field_m.a(-86, this.field_V.a(this.field_bb, true));
                  }
                }
              } else {
                this.field_V.a(this.field_V.d(false), var8, (byte) 25, var9, var4, var5, var7, var3_int, var6);
                if (var8 == 159) {
                  ma.a(kj.field_b, 8421504, (byte) -117);
                }
              }
            }
          } else {
            bk.a(2);
          }
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("le.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    private final boolean e(boolean param0) {
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_r = 70;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_o && (this.r(-33) ||
            this.field_k)) {
            stackIn_9_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_9_0 = false;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.IA(" + param0 + ')');
        }
    }

    private final void a(int param0, ml param1) {
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var16Lifetime1;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = n.field_g.field_nb;
          var4 = an.field_g + (vn.field_c - (an.field_f >> 1));
          var5 = -(var3_int >> 1) + me.field_I + ol.field_g;
          if (0 < this.field_u) {
            var4 = this.field_e;
            var5 = this.field_c;
          }
          var6 = param1.f(54);
          var7 = param1.i((byte) 108);
          var8 = param1.p(-8323);
          var9 = -var6 + var4;
          var10 = (var8 >> 1) + (-var7 + var5);
          var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
          if (0 == var11) {
            var11 = 1;
            var10 = -1;
          }
          var12 = 0;
          if (ti.field_N == 18) {
            var12 = 1;
          }
          if (ti.field_N == 50) {
            var12 = 1;
          }
          if (ti.field_N == 121) {
            var12 = 1;
          }
          if (24 == ti.field_N) {
            var12 = 1;
          }
          if (36 == ti.field_N) {
            var12 = 1;
          }
          if (126 == ti.field_N) {
            var12 = 1;
          }
          if (ti.field_N == 127) {
            var12 = 1;
          }
          if (ti.field_N == 128) {
            var12 = 1;
          }
          if (ti.field_N == 129) {
            var12 = 1;
          }
          if (ti.field_N == 136) {
            var12 = 1;
          }
          if (ti.field_N == 37) {
            var12 = 1;
          }
          if (ti.field_N == 102) {
            var12 = 1;
          }
          if (86 == ti.field_N) {
            var12 = 1;
          }
          if (87 == ti.field_N) {
            var12 = 1;
          }
          if (ti.field_N == 116) {
            var12 = 1;
          }
          if (ti.field_N == 149) {
            var12 = 1;
          }
          if (param0 > -107) {
            this.field_L = 81;
          }
          if (var12 != 0 &&
            this.field_u > 0) {
            this.field_u = 100;
          }
          if (!this.field_V.a(true)) {
            if (0 < var9) {
              param1.field_E = 1;
            } else {
              param1.field_E = -1;
            }
            if ((ti.field_N == 127 ||
              ti.field_N == 128 ||
              ti.field_N == 129 ||
              ti.field_N == 136 ||
              155 == ti.field_N) &&
              Math.abs(var9) < Math.abs(var10)) {
              var9 = param1.field_E * 64;
              var10 = (0 > var10) ? -64 : 64;
              var11 = (int)Math.sqrt((double)(var9 * var9 + var10 * var10));
              if (var11 == 0) {
                var11 = 1;
                var10 = -1;
              }
            }
            if (var12 == 0) {
              var13 = var8 / 2;
              for (var16 = 0; var16 < 100; var16++) {
                var17 = var16 + var13;
                var14 = var9 * var17 / var11;
                var15 = -var13 + var17 * var10 / var11;
                var18 = 0;
                if (var16 >= 25) {
                  var18 = var18 | 16711680;
                  if (var16 < 75) {
                    var18 = var18 | var16 * 5 - 125 << 8 & 65280;
                  } else {
                    var18 = var18 | 65280;
                    if (var16 < 100) {
                      var18 = var18 | 10 * var16 - 750 & 255;
                    } else {
                      var18 = var18 | 255;
                    }
                  }
                } else {
                  var18 = var18 | 16711680 & var16 * 10 << 16;
                }
                if (var16 <= 25) {
                  de.c(-vn.field_c + (var6 + var14 + (an.field_f >> 1)), (var3_int >> 1) - ol.field_g + var15 + var7, 1600 / (200 - var16 * 100 / 100), var18, var16);
                } else {
                  de.c((an.field_f >> 1) + (-vn.field_c + var6) + var14, (var3_int >> 1) - ol.field_g + var15 + var7, 1600 / (200 - var16 * 100 / 100), var18, 25);
                }
              }
              return;
            }
            var15Lifetime1 = var8 / 2;
            var16Lifetime1 = 100 + var15Lifetime1;
            var14Lifetime1 = (var3_int >> 1) - ol.field_g + var10 * (var16Lifetime1 - 50) / var11 + (-var15Lifetime1 + var7);
            var13Lifetime1 = (an.field_f >> 1) + (var9 * (-50 + var16Lifetime1) / var11 + var6) - vn.field_c;
            tg.field_b[4].a(-16 + var13Lifetime1, -16 + var14Lifetime1);
            var14Lifetime2 = (var3_int >> 1) + ((var16Lifetime1 - 50 - 16) * var10 / var11 - (var15Lifetime1 - var7 + ol.field_g));
            var13Lifetime2 = -vn.field_c + (var9 * (-50 + (var16Lifetime1 - 16)) / var11 + var6) + (an.field_f >> 1);
            tg.field_b[4].c(var13Lifetime2 - 8, var14Lifetime2 - 8);
            var14Lifetime3 = (var3_int >> 1) + var7 - var15Lifetime1 + (var10 * (-24 + (var16Lifetime1 - 50)) / var11 - ol.field_g);
            var13Lifetime3 = -vn.field_c + var6 + var9 * (-24 + var16Lifetime1 - 50) / var11 + (an.field_f >> 1);
            tg.field_b[4].b(var13Lifetime3 - 4, var14Lifetime3 - 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_108_0 = var3;
          stackIn_108_1 = new StringBuilder().append("le.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
        }
    }

    private final void c(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.d(-10674);
          this.field_w.c(-1);
          var4 = this.field_w.o(4);
          if (param1 <= 47) {
            this.field_I = -95;
          }
          if (var4 != var3_int) {
            if (this.field_k) {
              he.field_e.b((byte) -67, 67);
              he.field_e.a(var4, (byte) -101);
              we.a(0, (byte) 93);
            }
            ka.b(false);
          }
          if (!this.field_k) {
            this.field_V.c(-1);
            this.field_z = 0;
          }
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("le.M(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        vn var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ml var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != 0) {
            return;
          }
          var4_int = n.field_g.field_nb;
          var5 = this.field_V.g((byte) 70);
          if (var5 == null) {
            return;
          }
          var6 = (ml) (var5.b(param1 + 12623));
          while (var6 != null) {
            if (var6.y(17571) != this.field_bb) {
              var6.c((var4_int >> 1) - param0, -param2 + (an.field_f >> 1), 1703903841);
            }
            var6 = (ml) (var5.a(0));
          }
          var6Lifetime1 = this.field_V.a(this.field_bb, true);
          if (var6Lifetime1 != null) {
            var6Lifetime1.c((var4_int >> 1) - param0, (an.field_f >> 1) - param2, 1703903841);
            if (this.field_u == 0 &&
              -1 != ti.field_N &&
              null == eb.field_b) {
              var7 = -param2 + (an.field_f >> 1) + var6Lifetime1.f(-88);
              var8 = -48 + (var4_int >> 1) - param0 + var6Lifetime1.i((byte) 115) + (-var6Lifetime1.p(-8323) - this.field_M);
              de.i(var7, var8, 20, 16777215);
              gn.a(20, (byte) 99, 192, var7, var8);
              de.c(var7, var8, 20, 0);
              bb.field_g[dd.field_f[ti.field_N]].c(var7 - 20, var8 - 20);
            }
            if (this.field_u == 0 &&
              ti.field_N == -1 &&
              null == eb.field_b) {
              if (this.field_V.d(false) < 0) {
                this.g(0);
                this.a(var6Lifetime1, 98);
                return;
              }
              var7Lifetime1 = -param2 + ((an.field_f >> 1) + var6Lifetime1.f(param1 ^ -82));
              var8Lifetime1 = -64 + var6Lifetime1.i((byte) 117) + (-param0 + ((var4_int >> 1) - var6Lifetime1.p(-8323))) - this.field_M;
              var9 = nj.field_n[this.field_V.d(false)];
              if (this.field_V.d(false) >= 0) {
                tg.field_b[3].b(var7Lifetime1 - 16, -(int)(Math.sin(3.14 * (double)this.field_P / 32.0) * 32.0) - 16 + var8Lifetime1, var9);
              }
            }
            this.g(0);
            this.a(var6Lifetime1, 98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "le.VA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final ml q(int param0) {
        ml stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        pg stackIn_13_0 = null;
        ml stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        ml var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        ml var8 = null;
        vn var9 = null;
        ml var10 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var9 = this.field_V.g((byte) 85);
          var3 = this.field_bb;
          var8 = this.field_V.a(var3, true);
          var4 = var8;
          if (param0 != 10781) {
            stackIn_3_0 = (ml) null;
            return stackIn_3_0;
          }
          if (var8 == null) {
            stackIn_6_0 = null;
            return (ml) (stackIn_6_0);
          }
          var5 = 0;
          if (var8.i((byte) 127) >= this.field_V.field_H) {
            var5 = 1;
          }
          var6 = var8;
          while (true) {
            if (var6.field_b == var9.field_e) {
              stackIn_13_0 = var9.field_e.field_b;
            } else {
              stackIn_13_0 = var6.field_b;
            }
            var10 = (ml) (stackIn_13_0);
            if (var10 != var8) {
              if (var5 != 0 &&
                !var10.t(34) &&
                37 != var10.o(-22625)) {
                continue;
              }
              if (this.field_V.field_d) {
                if (var10 == null ||
                  ~var10.y(17571) != ~this.field_V.d(false)) {
                  if (var10.w(24501) == null) {
                    continue;
                  }
                  if (var10.r(106) != this.field_V.q((byte) -115)) {
                    continue;
                  }
                }
                if (var10.o(param0 - 33406) == 12) {
                  continue;
                }
                var4 = var10;
                this.field_bb = var10.y(param0 + 6790);
                eb.field_b = null;
                ti.field_N = -1;
                var10.a((byte) -31, 0);
              } else {
                if (var10 == null) {
                  continue;
                }
                if (var10.o(-22625) == 12) {
                  continue;
                }
                if (var10.g(false) != this.field_V.d(false)) {
                  continue;
                }
                var4 = var10;
                this.field_bb = var10.y(17571);
                eb.field_b = null;
                ti.field_N = -1;
                var10.a((byte) 65, 0);
              }
            }
            break;
          }
          this.field_m.a(param0 - 10886, var4);
          stackIn_33_0 = var4;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.C(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        try {
          this.field_V.b((byte) 88, this.field_J);
          this.field_V.c(-1);
          this.b(0);
          this.field_F = param0 ? true : false;
          this.field_z = this.field_V.f(12955);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "le.R(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        try {
          var2_int = -50 + an.field_f;
          var3 = 10;
          var4 = -1;
          if (0 == this.field_V.a(param0 - 6154)) {
            var4 = 5;
          }
          if (param0 != -25343) {
            var7 = (ml) null;
            this.a(-125, (ml) null);
          }
          if (this.field_V.a(param0 ^ 6646) == 1) {
            var4 = 17;
          }
          if (2 == this.field_V.a(param0 ^ 6646)) {
            var4 = 42;
          }
          if (this.field_V.a(-31497) == 4) {
            var4 = 29;
          }
          if (this.field_V.a(-31497) == 5) {
            var4 = 55;
          }
          if (this.field_V.a(-31497) == 6) {
            var4 = 67;
          }
          if (this.field_V.a(-31497) == 7) {
            var4 = 85;
          }
          if (this.field_V.a(-31497) == 8) {
            var4 = 72;
          }
          if (var4 != -1) {
            if (this.field_V.n((byte) -75) >= this.field_V.l(4)) {
              de.g(-4 + var2_int, -4 + var3, 48, 48, 8, 8323072);
              de.g(-2 + var2_int, var3 - 2, 44, 44, 6, 16711680);
              bb.field_g[var4].c(var2_int, var3);
              return;
            }
            var5 = 256 * (this.field_V.l(4) - this.field_V.n((byte) -75)) / this.field_V.l(4);
            de.g(-4 + var2_int, var3 - 4, 48, 48, 8, 8355711);
            de.g(-2 + var2_int, var3 - 2, 44, 44, 6, 16777215);
            bb.field_g[var4].c(var2_int, var3, -var5 + 256);
            var6 = (-1 + this.field_V.l(4) + (-this.field_V.n((byte) -75) + this.field_V.s(0))) / this.field_V.s(0);
            tj.field_t.a(Integer.toString(var6), -4 + var2_int, -4 + (var3 - 1), 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
            tj.field_t.a(Integer.toString(var6), -5 + var2_int, -4 + var3, 48, 48, 8355711, 0, 1, 1, tj.field_t.field_C);
            tj.field_t.a(Integer.toString(var6), -4 + var2_int, -4 + var3, 48, 48, 16777215, -1, 1, 1, tj.field_t.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.HA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param7 >= -58) {
            this.field_c = 77;
          }
          if (param6 != -1) {
            this.field_t = false;
            if (param1 != 87 &&
              param1 != 116 &&
              param1 != 158 && (6 != param1 &&
              param1 != 79 ||
              pb.field_m.b(true))) {
              if (param1 == 159) {
                ma.a(kj.field_b, 8421504, (byte) -42);
              } else {
                ma.a(li.field_I + tc.field_w[param1], 8421504, (byte) -103);
              }
            }
            this.field_V.a(this.field_V.d(false), param1, (byte) 77, param4, param3, param0, param2, param6, param5);
          } else {
            this.field_V.e(true);
          }
          if (!qg.a(-127)) {
            if (!this.field_V.b(this.field_J, -89)) {
              return;
            }
            gj.a(false, true, -1, mn.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var9), "le.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_ab) {
            throw new IllegalStateException();
          }
          he.field_e.b((byte) -79, 61);
          if (param0 != -61) {
            this.field_e = -97;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "le.FA(" + param0 + ')');
        }
    }

    private final void b(wk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = false;
          this.field_V.a((byte) 72, this.field_w);
          var3_int = param0.o(6);
          var4 = param0.e((byte) -114);
          this.field_V.a(var3_int, (byte) 63, var4);
          if (null != this.field_w) {
            this.field_w.a(var3_int, (byte) 60, var4);
          }
          gj.a(false, true, param1, mn.field_r);
          this.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("le.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    le(boolean param0, int param1, int param2, boolean param3, String[] param4, int param5, int[][] param6, int[][] param7, int[] param8, int param9, int param10, boolean param11, int param12, boolean[] param13) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var15_int = 0;
        RuntimeException var15 = null;
        this.field_g = true;
        this.field_y = true;
        this.field_v = new int[6];
        this.field_C = false;
        this.field_K = 4;
        this.field_F = false;
        this.field_U = false;
        this.field_H = true;
        this.field_o = false;
        this.field_l = new int[]{17, 17, 17, 17, 17, 17};
        this.field_T = false;
        this.field_X = true;
        this.field_t = false;
        this.field_O = false;
        this.field_G = true;
        this.field_B = false;
        try {
          stackIn_4_1 = (param0);
          this.field_ab = stackIn_4_1;
          stackIn_7_1 = (param11);
          this.field_i = stackIn_7_1;
          this.field_I = param5;
          var15_int = param12;
          this.field_V = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
          this.field_V.field_H = 960;
          this.field_V.field_y = 1920;
          this.field_V.field_Hb = this.field_V.field_H >> 1;
          this.field_V.field_hb = this.field_V.field_y >> 1;
          this.field_V.p(88);
          this.field_V.c(true);
          ue.a((byte) -117, this);
          this.field_W = -1;
          this.field_x = 0;
          this.field_f = null;
          this.field_m = new ol();
          this.field_cb = new vn();
          if (!this.field_ab) {
            k.a(this, true);
            df.a((byte) 83, 0);
            this.field_V.field_sb = cf.field_h;
            this.field_V.field_rb = uk.field_g;
          } else {
            tj.c(63);
            this.field_w = new nf(false, false, param1, param2, param3, param4, param9, param10, param6, param7, param8, var15_int, param13);
            this.field_w.p(63);
            this.field_w.c(true);
            this.field_k = true;
            this.field_L = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_15_0 = var15;
          stackIn_15_1 = new StringBuilder().append("le.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          stackIn_23_0 = stackIn_20_0;
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param7 == null) {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = stackIn_20_0;
            stackIn_24_2 = "{...}";
          }
          stackIn_27_0 = stackIn_24_0;
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param8 == null) {
            stackIn_28_0 = stackIn_27_0;
            stackIn_28_2 = "null";
          } else {
            stackIn_28_0 = stackIn_24_0;
            stackIn_28_2 = "{...}";
          }
          stackIn_31_0 = stackIn_28_0;
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_32_0 = stackIn_31_0;
            stackIn_32_2 = "null";
          } else {
            stackIn_32_0 = stackIn_28_0;
            stackIn_32_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_d = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 5, 5, 5, 0, 0, 3, 0, 0, 3, 0, 0, 0, 3, 5, 5, 0, 3, 0, 3, 0, 0, 3, 5, 0, 0, 3, 5, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 5, 5, 0, 3, 0, 0, 0, 5, 0, 3, 0, 5, 3, 5, 0, 3, 0, 5, 3, 5, 0, 0, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 3, 0, 0, 3, 5, 5, 0, 3, 0, 5, 3, 5, 0, 0, 0, 3, 5, 5, 0, 3, 0, 3, 0, 0, 0, 3, 0, 0, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 0, 0, 0, 3, 0, 0};
        field_db = "Connecting to<br>friend server...";
        field_A = "Confirm Password: ";
        field_N = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
